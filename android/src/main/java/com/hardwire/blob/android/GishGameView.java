package com.hardwire.blob.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.hardwire.blob.Main;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class GishGameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
    private static final String TAG = "GISH_VIEW";

    // Virtual game screen buffer dimensions (J2ME standard)
    private static final int GAME_WIDTH = 240;
    private static final int GAME_HEIGHT = 320;

    // Public customizable settings (default: false = no stretching, pure aspect ratio)
    public static volatile boolean fullScreenStretch = false;
    public static volatile int targetFps = 60;
    public static volatile boolean showVirtualGamepad = true;

    // J2ME Key codes
    public static final int KEY_UP = 50;       // '2'
    public static final int KEY_DOWN = 56;     // '8'
    public static final int KEY_LEFT = 52;     // '4'
    public static final int KEY_RIGHT = 54;    // '6'
    public static final int KEY_STICKY = 49;   // '1'
    public static final int KEY_HEAVY = 51;    // '3'
    public static final int KEY_EXPAND = 55;   // '7'
    public static final int KEY_OK = -6;       // Left Softkey / Action / Skip dialogue
    public static final int KEY_PAUSE = -7;    // Right Softkey / Pause menu
    public static final int KEY_FIRE = 53;     // '5'

    private final Main midlet;
    private SurfaceHolder holder;
    private Thread renderThread;
    private volatile boolean running = false;

    // Image buffers
    private Image gameBufferImage;
    private Graphics gameGraphics;
    private Bitmap androidBitmap;
    private int[] pixelBuffer;

    // Viewport scaling
    private Rect srcRect;
    private Rect dstRect;
    private Paint paint;
    private Paint debugPaint;
    private int surfaceWidth = 0;
    private int surfaceHeight = 0;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private int offsetX = 0;
    private int offsetY = 0;

    // Cached reflection members
    private Class<?> cachedCanvasClass = null;
    private Method cachedPaintMethod = null;
    private Method cachedPointerPressed = null;
    private Method cachedPointerDragged = null;
    private Method cachedPointerReleased = null;
    private Method cachedKeyPressed = null;
    private Method cachedKeyReleased = null;
    private Field cachedFieldC = null;

    private volatile String lastErrorMessage = null;

    // Virtual Gamepad state and layout
    private final Set<Integer> activePressedKeys = new HashSet<Integer>();
    private Paint padBgPaint;
    private Paint padActivePaint;
    private Paint padStrokePaint;
    private Paint padTextPaint;

    // Virtual button bounds
    private float dpadCx, dpadCy, dpadRadius;
    private float dpadDeadZone;
    private float jumpCx, jumpCy, jumpRadius;
    private int touchSteeringPointerId = -1;
    private final RectF btnJump = new RectF();
    private final RectF btnSticky = new RectF();
    private final RectF btnHeavy = new RectF();
    private final RectF btnExpand = new RectF();
    private final RectF btnOk = new RectF();
    private final RectF btnPause = new RectF();
    private final RectF btnSkipCutscene = new RectF();

    private Paint skipBgPaint;
    private Paint skipStrokePaint;
    private Paint skipTextPaint;

    public GishGameView(Context context, Main midlet) {
        super(context);
        this.midlet = midlet;
        this.holder = getHolder();
        this.holder.addCallback(this);

        this.gameBufferImage = Image.createImage(GAME_WIDTH, GAME_HEIGHT);
        this.gameGraphics = gameBufferImage.getGraphics();
        this.pixelBuffer = new int[GAME_WIDTH * GAME_HEIGHT];
        this.androidBitmap = Bitmap.createBitmap(GAME_WIDTH, GAME_HEIGHT, Bitmap.Config.ARGB_8888);

        this.srcRect = new Rect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        this.dstRect = new Rect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        this.paint = new Paint();
        this.paint.setFilterBitmap(false); // Sharp pixel rendering

        this.debugPaint = new Paint();
        this.debugPaint.setColor(Color.RED);
        this.debugPaint.setTextSize(26);
        this.debugPaint.setAntiAlias(true);

        initGamepadPaints();
    }

    private void initGamepadPaints() {
        padBgPaint = new Paint();
        padBgPaint.setColor(0x44202028);
        padBgPaint.setStyle(Paint.Style.FILL);
        padBgPaint.setAntiAlias(true);

        padActivePaint = new Paint();
        padActivePaint.setColor(0x995080FF);
        padActivePaint.setStyle(Paint.Style.FILL);
        padActivePaint.setAntiAlias(true);

        padStrokePaint = new Paint();
        padStrokePaint.setColor(0x88FFFFFF);
        padStrokePaint.setStyle(Paint.Style.STROKE);
        padStrokePaint.setStrokeWidth(3.5f);
        padStrokePaint.setAntiAlias(true);

        padTextPaint = new Paint();
        padTextPaint.setColor(Color.WHITE);
        padTextPaint.setTextAlign(Paint.Align.CENTER);
        padTextPaint.setFakeBoldText(true);
        padTextPaint.setAntiAlias(true);

        skipBgPaint = new Paint();
        skipBgPaint.setColor(0xDD1E1E28);
        skipBgPaint.setStyle(Paint.Style.FILL);
        skipBgPaint.setAntiAlias(true);

        skipStrokePaint = new Paint();
        skipStrokePaint.setColor(0xFFFFD54F); // Warm gold border
        skipStrokePaint.setStyle(Paint.Style.STROKE);
        skipStrokePaint.setStrokeWidth(3.0f);
        skipStrokePaint.setAntiAlias(true);

        skipTextPaint = new Paint();
        skipTextPaint.setColor(0xFFFFD54F);
        skipTextPaint.setTextAlign(Paint.Align.CENTER);
        skipTextPaint.setFakeBoldText(true);
        skipTextPaint.setAntiAlias(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        resume();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        this.surfaceWidth = width;
        this.surfaceHeight = height;
        updateLayout();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        pause();
    }

    public synchronized void updateLayout() {
        if (surfaceWidth <= 0 || surfaceHeight <= 0) return;

        if (fullScreenStretch) {
            // Full Screen Mode: Stretch to fill the entire display without black bars
            dstRect.set(0, 0, surfaceWidth, surfaceHeight);
            offsetX = 0;
            offsetY = 0;
            scaleX = (float) surfaceWidth / GAME_WIDTH;
            scaleY = (float) surfaceHeight / GAME_HEIGHT;
        } else {
            // Aspect-Ratio Mode: 4:3 fit with letterbox
            float sx = (float) surfaceWidth / GAME_WIDTH;
            float sy = (float) surfaceHeight / GAME_HEIGHT;
            float scale = Math.min(sx, sy);

            int viewW = (int) (GAME_WIDTH * scale);
            int viewH = (int) (GAME_HEIGHT * scale);
            offsetX = (surfaceWidth - viewW) / 2;
            offsetY = (surfaceHeight - viewH) / 2;

            dstRect.set(offsetX, offsetY, offsetX + viewW, offsetY + viewH);
            scaleX = scale;
            scaleY = scale;
        }

        // Layout on-screen virtual gamepad
        float minDim = Math.min(surfaceWidth, surfaceHeight);
        float baseRadius = minDim * 0.17f;

        // Controls positioned lower down at bottom of screen (89% Y)
        float controlCy = surfaceHeight * 0.89f;

        // D-Pad positioned at bottom-left (lowered down)
        dpadCx = surfaceWidth * 0.18f;
        dpadCy = controlCy;
        dpadRadius = baseRadius * 1.0f;
        dpadDeadZone = dpadRadius * 0.22f;

        // 1. Jump button positioned at bottom-right (lowered down, comfortable thumb rest)
        this.jumpCx = surfaceWidth * 0.82f;
        this.jumpCy = controlCy;
        this.jumpRadius = minDim * 0.125f;
        setCircleRect(btnJump, jumpCx, jumpCy, jumpRadius);

        // Clear unused buttons (Sticky, Heavy, Expand, OK removed per user request)
        btnSticky.setEmpty();
        btnHeavy.setEmpty();
        btnExpand.setEmpty();
        btnOk.setEmpty();

        // Pause / Menu button at top-left
        btnPause.set(24, 36, 24 + minDim * 0.24f, 36 + minDim * 0.10f);

        // Skip Cutscene Button at top-center (comfortably below notch / status bar)
        float skipBtnW = Math.min(surfaceWidth * 0.70f, 420f);
        float skipBtnH = Math.max(56f, minDim * 0.10f);
        float skipLeft = (surfaceWidth - skipBtnW) / 2f;
        float skipTop = Math.max(80f, surfaceHeight * 0.08f);
        btnSkipCutscene.set(skipLeft, skipTop, skipLeft + skipBtnW, skipTop + skipBtnH);

        padTextPaint.setTextSize(Math.max(12f, minDim * 0.038f));
        if (skipTextPaint != null) {
            skipTextPaint.setTextSize(Math.max(14f, minDim * 0.040f));
        }
    }

    private void setCircleRect(RectF r, float cx, float cy, float radius) {
        r.set(cx - radius, cy - radius, cx + radius, cy + radius);
    }

    public synchronized void resume() {
        if (running) return;
        running = true;
        renderThread = new Thread(this, "GishRenderLoop");
        renderThread.start();
    }

    public synchronized void pause() {
        running = false;
        try {
            if (renderThread != null) {
                renderThread.join(500);
                renderThread = null;
            }
        } catch (InterruptedException ignored) {}
    }

    private void updateCachedMethods(Class<?> canvasClass) {
        if (cachedCanvasClass == canvasClass) return;
        cachedCanvasClass = canvasClass;
        try {
            cachedPaintMethod = canvasClass.getDeclaredMethod("paint", Graphics.class);
            cachedPaintMethod.setAccessible(true);
        } catch (Exception e) {
            Log.e(TAG, "Failed to resolve paint(Graphics)", e);
        }
        try {
            cachedPointerPressed = canvasClass.getDeclaredMethod("pointerPressed", int.class, int.class);
            cachedPointerPressed.setAccessible(true);
        } catch (Exception ignored) {}
        try {
            cachedPointerDragged = canvasClass.getDeclaredMethod("pointerDragged", int.class, int.class);
            cachedPointerDragged.setAccessible(true);
        } catch (Exception ignored) {}
        try {
            cachedPointerReleased = canvasClass.getDeclaredMethod("pointerReleased", int.class, int.class);
            cachedPointerReleased.setAccessible(true);
        } catch (Exception ignored) {}
        try {
            cachedKeyPressed = canvasClass.getDeclaredMethod("keyPressed", int.class);
            cachedKeyPressed.setAccessible(true);
        } catch (Exception ignored) {}
        try {
            cachedKeyReleased = canvasClass.getDeclaredMethod("keyReleased", int.class);
            cachedKeyReleased.setAccessible(true);
        } catch (Exception ignored) {}
        try {
            for (Field f : canvasClass.getDeclaredFields()) {
                if ("c".equals(f.getName()) && f.getType() == boolean.class) {
                    f.setAccessible(true);
                    cachedFieldC = f;
                    break;
                }
            }
        } catch (Exception ignored) {}
    }

    @Override
    public void run() {
        while (running) {
            long now = System.currentTimeMillis();

            // Dynamic Framerate Target (60 FPS default = ~16ms, 120 FPS = ~8ms, 30 FPS = ~33ms)
            int fps = Math.max(15, Math.min(120, targetFps));
            long frameDuration = 1000 / fps;

            Displayable current = null;
            try {
                current = Display.getDisplay(midlet).getCurrent();
            } catch (Exception ignored) {}

            // Update cutscene watchdog to ensure intro cutscenes never freeze or drift endlessly
            CutsceneHelper.updateWatchdog(midlet);

            if (current instanceof javax.microedition.lcdui.Canvas) {
                javax.microedition.lcdui.Canvas canvas = (javax.microedition.lcdui.Canvas) current;
                updateCachedMethods(canvas.getClass());

                if (cachedPaintMethod != null) {
                    try {
                        cachedPaintMethod.invoke(canvas, gameGraphics);
                        lastErrorMessage = null;
                    } catch (Throwable t) {
                        Throwable cause = (t instanceof InvocationTargetException && t.getCause() != null)
                            ? t.getCause() : t;
                        Log.e(TAG, "Paint invocation error", cause);
                        lastErrorMessage = cause.getMessage();
                    } finally {
                        // ALWAYS reset ad.c so Main thread loop in ad.m() never deadlocks waiting for repaint
                        if (cachedFieldC != null) {
                            try {
                                cachedFieldC.setBoolean(canvas, false);
                            } catch (Throwable ignored) {}
                        }
                    }
                }
            }

            // Draw buffer and on-screen controls to Android Surface
            Canvas c = null;
            try {
                c = holder.lockCanvas();
                if (c != null) {
                    c.drawColor(Color.BLACK); // Clear background

                    // Copy pixels from gameBufferImage to androidBitmap
                    gameBufferImage.getRGB(pixelBuffer, 0, GAME_WIDTH, 0, 0, GAME_WIDTH, GAME_HEIGHT);
                    androidBitmap.setPixels(pixelBuffer, 0, GAME_WIDTH, 0, 0, GAME_WIDTH, GAME_HEIGHT);

                    // Draw stretched or letterboxed game screen
                    c.drawBitmap(androidBitmap, srcRect, dstRect, paint);

                    // Draw Virtual Gamepad overlay if enabled and surface has valid size
                    if (showVirtualGamepad && surfaceWidth > 0 && surfaceHeight > 0) {
                        drawVirtualGamepad(c);
                    } else if (CutsceneHelper.isCutsceneActive(midlet) && surfaceWidth > 0 && surfaceHeight > 0) {
                        drawSkipCutsceneButton(c);
                    }

                    // Show error on screen if any critical failure occurred
                    if (lastErrorMessage != null) {
                        c.drawText("⚠️ " + lastErrorMessage, 20, 60, debugPaint);
                    }
                }
            } catch (Throwable t) {
                Log.e(TAG, "Surface render error", t);
            } finally {
                if (c != null) {
                    try {
                        holder.unlockCanvasAndPost(c);
                    } catch (Exception ignored) {}
                }
            }

            long elapsed = System.currentTimeMillis() - now;
            long sleepTime = frameDuration - elapsed;
            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException ignored) {}
            }
        }
    }

    private void drawVirtualGamepad(Canvas c) {
        // 1. D-Pad base
        c.drawCircle(dpadCx, dpadCy, dpadRadius, padBgPaint);
        c.drawCircle(dpadCx, dpadCy, dpadRadius, padStrokePaint);
        c.drawCircle(dpadCx, dpadCy, dpadDeadZone, padStrokePaint);

        // D-Pad Directional Arrows & Highlights
        drawDpadDirection(c, KEY_UP, dpadCx, dpadCy - dpadRadius * 0.62f, "▲");
        drawDpadDirection(c, KEY_DOWN, dpadCx, dpadCy + dpadRadius * 0.62f, "▼");
        drawDpadDirection(c, KEY_LEFT, dpadCx - dpadRadius * 0.62f, dpadCy, "◀");
        drawDpadDirection(c, KEY_RIGHT, dpadCx + dpadRadius * 0.62f, dpadCy, "▶");

        // 2. Action Button (Only Jump button per user request)
        drawActionButton(c, btnJump, KEY_UP, "JUMP", 0x772E7D32, 0xCC4CAF50);       // Green

        // 3. Pause Button
        boolean pausePressed = activePressedKeys.contains(KEY_PAUSE);
        Paint pBg = pausePressed ? padActivePaint : padBgPaint;
        c.drawRoundRect(btnPause, 16, 16, pBg);
        c.drawRoundRect(btnPause, 16, 16, padStrokePaint);
        float pTextY = btnPause.centerY() + (padTextPaint.getTextSize() * 0.35f);
        c.drawText("⏸ MENU", btnPause.centerX(), pTextY, padTextPaint);

        // 4. Skip Cutscene button if in cutscene
        if (CutsceneHelper.isCutsceneActive(midlet)) {
            drawSkipCutsceneButton(c);
        }
    }

    private void drawSkipCutsceneButton(Canvas c) {
        c.drawRoundRect(btnSkipCutscene, 22, 22, skipBgPaint);
        c.drawRoundRect(btnSkipCutscene, 22, 22, skipStrokePaint);
        float skipTextY = btnSkipCutscene.centerY() + (skipTextPaint.getTextSize() * 0.35f);
        c.drawText("⏭ ПРОПУСТИТЬ КАТСЦЕНУ", btnSkipCutscene.centerX(), skipTextY, skipTextPaint);
    }

    private void drawDpadDirection(Canvas c, int keyCode, float x, float y, String symbol) {
        boolean active = activePressedKeys.contains(keyCode);
        if (active) {
            c.drawCircle(x, y, dpadRadius * 0.32f, padActivePaint);
        }
        float textY = y + (padTextPaint.getTextSize() * 0.35f);
        c.drawText(symbol, x, textY, padTextPaint);
    }

    private void drawActionButton(Canvas c, RectF bounds, int keyCode, String label, int defaultColor, int pressedColor) {
        boolean active = activePressedKeys.contains(keyCode) || (keyCode == KEY_OK && activePressedKeys.contains(KEY_FIRE));
        padBgPaint.setColor(active ? pressedColor : defaultColor);
        c.drawOval(bounds, padBgPaint);
        c.drawOval(bounds, padStrokePaint);

        float textY = bounds.centerY() + (padTextPaint.getTextSize() * 0.35f);
        c.drawText(label, bounds.centerX(), textY, padTextPaint);
        padBgPaint.setColor(0x44202028); // Restore default
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Displayable current = Display.getDisplay(midlet).getCurrent();
        if (!(current instanceof javax.microedition.lcdui.Canvas)) {
            return super.onTouchEvent(event);
        }

        javax.microedition.lcdui.Canvas canvas = (javax.microedition.lcdui.Canvas) current;
        updateCachedMethods(canvas.getClass());

        int action = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        boolean hitAnyControl = false;
        Set<Integer> controlPointerIds = new HashSet<Integer>();

        boolean isCutscene = CutsceneHelper.isCutsceneActive(midlet);
        boolean isDialogue = (CutsceneHelper.getCurrentMode(midlet) == 6);

        // 0. Handle Skip Cutscene button tap immediately
        if (isCutscene) {
            int pointerCount = event.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                float px = event.getX(i);
                float py = event.getY(i);
                if (isInside(btnSkipCutscene, px, py)) {
                    hitAnyControl = true;
                    controlPointerIds.add(event.getPointerId(i));
                    if (action == MotionEvent.ACTION_DOWN || action == MotionEvent.ACTION_POINTER_DOWN) {
                        CutsceneHelper.skipCutscene(midlet);
                        return true;
                    }
                }
            }
        }

        // 1. If Virtual Gamepad is enabled, process multi-touch virtual buttons
        if (showVirtualGamepad) {
            Set<Integer> newPressedKeys = new HashSet<Integer>();

            int pointerCount = event.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                if (action == MotionEvent.ACTION_POINTER_UP && i == actionIndex) {
                    continue; // Skip the pointer that was just lifted
                }
                if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
                    continue; // All pointers lifted
                }

                float px = event.getX(i);
                float py = event.getY(i);
                int pId = event.getPointerId(i);

                // Check D-Pad
                float dx = px - dpadCx;
                float dy = py - dpadCy;
                float distSq = dx * dx + dy * dy;

                if (distSq <= dpadRadius * dpadRadius * 1.4f || (py >= dpadCy && Math.abs(dx) <= dpadRadius * 1.1f)) {
                    hitAnyControl = true;
                    controlPointerIds.add(pId);
                    if (distSq >= dpadDeadZone * dpadDeadZone) {
                        double angle = Math.toDegrees(Math.atan2(dy, dx));
                        // Angle: -180 to 180 (0 is Right, 90 is Down, -90 is Up, 180 is Left)
                        if (angle >= -67.5 && angle <= 67.5) {
                            newPressedKeys.add(KEY_RIGHT);
                        }
                        if (angle >= 22.5 && angle <= 157.5) {
                            newPressedKeys.add(KEY_DOWN);
                        }
                        if (angle >= 112.5 || angle <= -112.5) {
                            newPressedKeys.add(KEY_LEFT);
                        }
                        if (angle >= -157.5 && angle <= -22.5) {
                            newPressedKeys.add(KEY_UP);
                        }
                    }
                }

                // Check Jump Button (allow comfortable thumb rest below jump center as well)
                boolean hitJump = isInside(btnJump, px, py) || (py >= jumpCy && Math.abs(px - jumpCx) <= jumpRadius * 1.1f);
                if (hitJump) {
                    controlPointerIds.add(pId);
                    if (isCutscene) {
                        CutsceneHelper.skipCutscene(midlet);
                        return true;
                    }
                    if (isDialogue || CutsceneHelper.getCurrentMode(midlet) != 0) {
                        CutsceneHelper.ensureDialogueDismissible(midlet);
                        newPressedKeys.add(KEY_OK);
                        newPressedKeys.add(KEY_FIRE);
                    }
                    newPressedKeys.add(KEY_UP);   // Jump
                    hitAnyControl = true;
                }

                // Check Pause / Menu Button (strictly bounded at top-left)
                if (isInside(btnPause, px, py)) {
                    controlPointerIds.add(pId);
                    newPressedKeys.add(KEY_PAUSE);
                    hitAnyControl = true;
                }
            }

            // Dispatch Key Pressed events for newly activated buttons
            for (Integer code : newPressedKeys) {
                if (!activePressedKeys.contains(code)) {
                    invokeCanvasKey(canvas, cachedKeyPressed, code);
                }
            }

            // Dispatch Key Released events for deactivated buttons
            for (Integer code : activePressedKeys) {
                if (!newPressedKeys.contains(code)) {
                    invokeCanvasKey(canvas, cachedKeyReleased, code);
                }
            }

            activePressedKeys.clear();
            activePressedKeys.addAll(newPressedKeys);

            // Tap anywhere on screen (outside controls) during dialogue or menu to skip/confirm
            if (!hitAnyControl && (action == MotionEvent.ACTION_DOWN || action == MotionEvent.ACTION_POINTER_DOWN)) {
                if (isCutscene) {
                    CutsceneHelper.skipCutscene(midlet);
                    return true;
                } else if (isDialogue || CutsceneHelper.getCurrentMode(midlet) != 0) {
                    CutsceneHelper.ensureDialogueDismissible(midlet);
                    invokeCanvasKey(canvas, cachedKeyPressed, KEY_OK);
                    invokeCanvasKey(canvas, cachedKeyPressed, KEY_FIRE);
                    invokeCanvasKey(canvas, cachedKeyReleased, KEY_OK);
                    invokeCanvasKey(canvas, cachedKeyReleased, KEY_FIRE);
                }
            }
        }

        // 2. Forward in-game canvas touch steering (pointerPressed, pointerDragged, pointerReleased)
        // for any touch on the 4:3 game viewport that is NOT hitting virtual buttons
        int viewW = (int) (GAME_WIDTH * scaleX);
        int viewH = (int) (GAME_HEIGHT * scaleY);

        if (action == MotionEvent.ACTION_DOWN || action == MotionEvent.ACTION_POINTER_DOWN) {
            int pId = event.getPointerId(actionIndex);
            if (!controlPointerIds.contains(pId)) {
                float touchX = event.getX(actionIndex) - offsetX;
                float touchY = event.getY(actionIndex) - offsetY;
                if (touchX >= 0 && touchX <= viewW && touchY >= 0 && touchY <= viewH) {
                    touchSteeringPointerId = pId;
                    float sx = scaleX > 0.001f ? scaleX : 1.0f;
                    float sy = scaleY > 0.001f ? scaleY : 1.0f;
                    int gx = Math.max(0, Math.min(GAME_WIDTH - 1, (int) (touchX / sx)));
                    int gy = Math.max(0, Math.min(GAME_HEIGHT - 1, (int) (touchY / sy)));
                    try {
                        if (cachedPointerPressed != null) {
                            cachedPointerPressed.invoke(canvas, gx, gy);
                        }
                    } catch (Throwable e) {
                        Log.e(TAG, "pointerPressed invocation failed", e);
                    }
                }
            }
        } else if (action == MotionEvent.ACTION_MOVE) {
            if (touchSteeringPointerId != -1) {
                int pIdx = event.findPointerIndex(touchSteeringPointerId);
                if (pIdx != -1) {
                    float touchX = event.getX(pIdx) - offsetX;
                    float touchY = event.getY(pIdx) - offsetY;
                    float sx = scaleX > 0.001f ? scaleX : 1.0f;
                    float sy = scaleY > 0.001f ? scaleY : 1.0f;
                    int gx = Math.max(0, Math.min(GAME_WIDTH - 1, (int) (touchX / sx)));
                    int gy = Math.max(0, Math.min(GAME_HEIGHT - 1, (int) (touchY / sy)));
                    try {
                        if (cachedPointerDragged != null) {
                            cachedPointerDragged.invoke(canvas, gx, gy);
                        }
                    } catch (Throwable e) {
                        Log.e(TAG, "pointerDragged invocation failed", e);
                    }
                }
            }
        } else if (action == MotionEvent.ACTION_POINTER_UP) {
            int pId = event.getPointerId(actionIndex);
            if (pId == touchSteeringPointerId) {
                float touchX = event.getX(actionIndex) - offsetX;
                float touchY = event.getY(actionIndex) - offsetY;
                float sx = scaleX > 0.001f ? scaleX : 1.0f;
                float sy = scaleY > 0.001f ? scaleY : 1.0f;
                int gx = Math.max(0, Math.min(GAME_WIDTH - 1, (int) (touchX / sx)));
                int gy = Math.max(0, Math.min(GAME_HEIGHT - 1, (int) (touchY / sy)));
                try {
                    if (cachedPointerReleased != null) {
                        cachedPointerReleased.invoke(canvas, gx, gy);
                    }
                } catch (Throwable e) {
                    Log.e(TAG, "pointerReleased invocation failed", e);
                }
                touchSteeringPointerId = -1;
            }
        } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
            if (touchSteeringPointerId != -1) {
                int pIdx = event.findPointerIndex(touchSteeringPointerId);
                float touchX = (pIdx != -1 ? event.getX(pIdx) : event.getX()) - offsetX;
                float touchY = (pIdx != -1 ? event.getY(pIdx) : event.getY()) - offsetY;
                float sx = scaleX > 0.001f ? scaleX : 1.0f;
                float sy = scaleY > 0.001f ? scaleY : 1.0f;
                int gx = Math.max(0, Math.min(GAME_WIDTH - 1, (int) (touchX / sx)));
                int gy = Math.max(0, Math.min(GAME_HEIGHT - 1, (int) (touchY / sy)));
                try {
                    if (cachedPointerReleased != null) {
                        cachedPointerReleased.invoke(canvas, gx, gy);
                    }
                } catch (Throwable e) {
                    Log.e(TAG, "pointerReleased invocation failed", e);
                }
                touchSteeringPointerId = -1;
            }
        }

        if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
            // Release all keys when no fingers remain on screen
            for (Integer code : activePressedKeys) {
                invokeCanvasKey(canvas, cachedKeyReleased, code);
            }
            activePressedKeys.clear();
        }

        return true;
    }

    private boolean isInside(RectF rect, float x, float y) {
        float padding = 16f; // Comfortable touch target margin
        return x >= rect.left - padding && x <= rect.right + padding
            && y >= rect.top - padding && y <= rect.bottom + padding;
    }

    private void invokeCanvasKey(javax.microedition.lcdui.Canvas canvas, Method method, int keyCode) {
        if (method == null || canvas == null) return;
        try {
            method.invoke(canvas, keyCode);
        } catch (Throwable t) {
            Log.e(TAG, "invokeCanvasKey failed for " + keyCode, t);
        }
    }
}
