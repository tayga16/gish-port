package com.hardwire.blob.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.hardwire.blob.Main;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GishGameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
    private static final String TAG = "GISH_VIEW";

    private final Main midlet;
    private SurfaceHolder holder;
    private Thread renderThread;
    private volatile boolean running = false;

    // Virtual game screen buffer
    private static final int GAME_WIDTH = 240;
    private static final int GAME_HEIGHT = 320;
    private Image gameBufferImage;
    private Graphics gameGraphics;
    private Bitmap androidBitmap;
    private int[] pixelBuffer;

    // Viewport scaling
    private Rect srcRect;
    private Rect dstRect;
    private Paint paint;
    private Paint debugPaint;
    private float scale = 1.0f;
    private int offsetX = 0;
    private int offsetY = 0;

    // Cached reflection methods
    private Class<?> cachedCanvasClass = null;
    private Method cachedPaintMethod = null;
    private Method cachedPointerPressed = null;
    private Method cachedPointerDragged = null;
    private Method cachedPointerReleased = null;

    private volatile String lastErrorMessage = null;

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
        this.paint.setFilterBitmap(false); // Sharp pixel-art scaling

        this.debugPaint = new Paint();
        this.debugPaint.setColor(Color.RED);
        this.debugPaint.setTextSize(24);
        this.debugPaint.setAntiAlias(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        resume();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // Calculate aspect-ratio preserved letterbox
        float scaleX = (float) width / GAME_WIDTH;
        float scaleY = (float) height / GAME_HEIGHT;
        scale = Math.min(scaleX, scaleY);

        int viewW = (int) (GAME_WIDTH * scale);
        int viewH = (int) (GAME_HEIGHT * scale);
        offsetX = (width - viewW) / 2;
        offsetY = (height - viewH) / 2;

        dstRect.set(offsetX, offsetY, offsetX + viewW, offsetY + viewH);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        pause();
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
    }

    @Override
    public void run() {
        final long frameDuration = 1000 / 30; // ~30-33ms per frame

        while (running) {
            long now = System.currentTimeMillis();

            Displayable current = null;
            try {
                current = Display.getDisplay(midlet).getCurrent();
            } catch (Exception ignored) {}

            if (current instanceof javax.microedition.lcdui.Canvas) {
                javax.microedition.lcdui.Canvas canvas = (javax.microedition.lcdui.Canvas) current;
                updateCachedMethods(canvas.getClass());

                if (cachedPaintMethod != null) {
                    try {
                        cachedPaintMethod.invoke(canvas, gameGraphics);
                    } catch (Throwable t) {
                        Throwable cause = (t instanceof InvocationTargetException && t.getCause() != null)
                            ? t.getCause() : t;
                        Log.e(TAG, "Paint invocation error", cause);
                        lastErrorMessage = cause.getClass().getSimpleName() + ": " + cause.getMessage();
                    }
                }
            }

            // Draw buffer to Android Surface
            Canvas c = null;
            try {
                c = holder.lockCanvas();
                if (c != null) {
                    c.drawColor(Color.BLACK); // Clear letterbox bars

                    // Copy pixels from gameBufferImage to androidBitmap
                    gameBufferImage.getRGB(pixelBuffer, 0, GAME_WIDTH, 0, 0, GAME_WIDTH, GAME_HEIGHT);
                    androidBitmap.setPixels(pixelBuffer, 0, GAME_WIDTH, 0, 0, GAME_WIDTH, GAME_HEIGHT);

                    c.drawBitmap(androidBitmap, srcRect, dstRect, paint);

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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Displayable current = Display.getDisplay(midlet).getCurrent();
        if (!(current instanceof javax.microedition.lcdui.Canvas)) {
            return super.onTouchEvent(event);
        }

        javax.microedition.lcdui.Canvas canvas = (javax.microedition.lcdui.Canvas) current;
        updateCachedMethods(canvas.getClass());

        // Map touch from screen coordinates to virtual 240x320 game coordinates
        float touchX = event.getX() - offsetX;
        float touchY = event.getY() - offsetY;

        int gx = (int) (touchX / scale);
        int gy = (int) (touchY / scale);

        gx = Math.max(0, Math.min(GAME_WIDTH - 1, gx));
        gy = Math.max(0, Math.min(GAME_HEIGHT - 1, gy));

        try {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN: {
                    if (cachedPointerPressed != null) {
                        cachedPointerPressed.invoke(canvas, gx, gy);
                    }
                    break;
                }
                case MotionEvent.ACTION_MOVE: {
                    if (cachedPointerDragged != null) {
                        cachedPointerDragged.invoke(canvas, gx, gy);
                    }
                    break;
                }
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL: {
                    if (cachedPointerReleased != null) {
                        cachedPointerReleased.invoke(canvas, gx, gy);
                    }
                    break;
                }
            }
        } catch (Throwable e) {
            Log.e(TAG, "Touch event handler failed", e);
        }

        return true;
    }
}
