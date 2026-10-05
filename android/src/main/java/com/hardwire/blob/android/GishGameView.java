package com.hardwire.blob.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.hardwire.blob.Main;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class GishGameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
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
    private float scale = 1.0f;
    private int offsetX = 0;
    private int offsetY = 0;

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

    public void resume() {
        running = true;
        renderThread = new Thread(this, "GishRenderLoop");
        renderThread.start();
    }

    public void pause() {
        running = false;
        try {
            if (renderThread != null) {
                renderThread.join();
            }
        } catch (InterruptedException ignored) {}
    }

    @Override
    public void run() {
        long lastTime = System.currentTimeMillis();
        final long frameDuration = 1000 / 30; // ~30-33ms per frame

        while (running) {
            long now = System.currentTimeMillis();
            long delta = now - lastTime;
            lastTime = now;

            Displayable current = Display.getDisplay(midlet).getCurrent();
            if (current instanceof javax.microedition.lcdui.Canvas) {
                javax.microedition.lcdui.Canvas canvas = (javax.microedition.lcdui.Canvas) current;
                // Render frame
                try {
                    java.lang.reflect.Method paintMethod = canvas.getClass().getDeclaredMethod("paint", Graphics.class);
                    paintMethod.setAccessible(true);
                    paintMethod.invoke(canvas, gameGraphics);
                } catch (Exception e) {
                    // Fallback direct paint if accessible
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
                }
            } finally {
                if (c != null) {
                    holder.unlockCanvasAndPost(c);
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
                    java.lang.reflect.Method m = canvas.getClass().getDeclaredMethod("pointerPressed", int.class, int.class);
                    m.setAccessible(true);
                    m.invoke(canvas, gx, gy);
                    break;
                }
                case MotionEvent.ACTION_MOVE: {
                    java.lang.reflect.Method m = canvas.getClass().getDeclaredMethod("pointerDragged", int.class, int.class);
                    m.setAccessible(true);
                    m.invoke(canvas, gx, gy);
                    break;
                }
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL: {
                    java.lang.reflect.Method m = canvas.getClass().getDeclaredMethod("pointerReleased", int.class, int.class);
                    m.setAccessible(true);
                    m.invoke(canvas, gx, gy);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
