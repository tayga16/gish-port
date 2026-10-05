package com.hardwire.blob.desktop;

import com.hardwire.blob.Main;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Method;

public class DesktopLauncher extends JFrame {
    private static final int GAME_WIDTH = 240;
    private static final int GAME_HEIGHT = 320;
    private static final int SCALE = 3; // 720 x 960 window

    private final Main midlet;
    private final Image gameBufferImage;
    private final Graphics gameGraphics;
    private final BufferedImage screenBufferedImage;
    private final int[] pixelBuffer;

    private int viewW = GAME_WIDTH * SCALE;
    private int viewH = GAME_HEIGHT * SCALE;
    private int offsetX = 0;
    private int offsetY = 0;
    private float currentScale = SCALE;

    public DesktopLauncher() {
        super("Gish Mobile - PC Edition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        this.midlet = new Main();
        this.gameBufferImage = Image.createImage(GAME_WIDTH, GAME_HEIGHT);
        this.gameGraphics = gameBufferImage.getGraphics();
        this.pixelBuffer = new int[GAME_WIDTH * GAME_HEIGHT];
        this.screenBufferedImage = new BufferedImage(GAME_WIDTH, GAME_HEIGHT, BufferedImage.TYPE_INT_ARGB);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());

                // Update letterbox metrics
                float sx = (float) getWidth() / GAME_WIDTH;
                float sy = (float) getHeight() / GAME_HEIGHT;
                currentScale = Math.min(sx, sy);
                viewW = (int) (GAME_WIDTH * currentScale);
                viewH = (int) (GAME_HEIGHT * currentScale);
                offsetX = (getWidth() - viewW) / 2;
                offsetY = (getHeight() - viewH) / 2;

                // Draw game buffer
                gameBufferImage.getRGB(pixelBuffer, 0, GAME_WIDTH, 0, 0, GAME_WIDTH, GAME_HEIGHT);
                screenBufferedImage.setRGB(0, 0, GAME_WIDTH, GAME_HEIGHT, pixelBuffer, 0, GAME_WIDTH);

                java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
                g2d.drawImage(screenBufferedImage, offsetX, offsetY, viewW, viewH, null);
            }
        };

        panel.setPreferredSize(new Dimension(GAME_WIDTH * SCALE, GAME_HEIGHT * SCALE));
        panel.setFocusable(true);

        // Mouse (Touch) Input mapping
        MouseAdapter mouseAdapter = new MouseAdapter() {
            private Point toGameCoords(Point p) {
                float gx = (p.x - offsetX) / currentScale;
                float gy = (p.y - offsetY) / currentScale;
                int ix = Math.max(0, Math.min(GAME_WIDTH - 1, (int) gx));
                int iy = Math.max(0, Math.min(GAME_HEIGHT - 1, (int) gy));
                return new Point(ix, iy);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Point pt = toGameCoords(e.getPoint());
                invokeCanvasMethod("pointerPressed", pt.x, pt.y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Point pt = toGameCoords(e.getPoint());
                invokeCanvasMethod("pointerReleased", pt.x, pt.y);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Point pt = toGameCoords(e.getPoint());
                invokeCanvasMethod("pointerDragged", pt.x, pt.y);
            }
        };

        panel.addMouseListener(mouseAdapter);
        panel.addMouseMotionListener(mouseAdapter);

        // Keyboard mapping (Arrows, Enter, Space, Numpad)
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int j2meKey = mapKey(e.getKeyCode());
                if (j2meKey != 0) invokeCanvasMethod("keyPressed", j2meKey);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int j2meKey = mapKey(e.getKeyCode());
                if (j2meKey != 0) invokeCanvasMethod("keyReleased", j2meKey);
            }

            private int mapKey(int keyCode) {
                switch (keyCode) {
                    case KeyEvent.VK_UP: case KeyEvent.VK_W: return javax.microedition.lcdui.Canvas.KEY_NUM2;
                    case KeyEvent.VK_LEFT: case KeyEvent.VK_A: return javax.microedition.lcdui.Canvas.KEY_NUM4;
                    case KeyEvent.VK_RIGHT: case KeyEvent.VK_D: return javax.microedition.lcdui.Canvas.KEY_NUM6;
                    case KeyEvent.VK_DOWN: case KeyEvent.VK_S: return javax.microedition.lcdui.Canvas.KEY_NUM8;
                    case KeyEvent.VK_SPACE: case KeyEvent.VK_ENTER: return javax.microedition.lcdui.Canvas.KEY_NUM5;
                    case KeyEvent.VK_1: return javax.microedition.lcdui.Canvas.KEY_NUM1;
                    case KeyEvent.VK_3: return javax.microedition.lcdui.Canvas.KEY_NUM3;
                    case KeyEvent.VK_7: return javax.microedition.lcdui.Canvas.KEY_NUM7;
                    case KeyEvent.VK_9: return javax.microedition.lcdui.Canvas.KEY_NUM9;
                    case KeyEvent.VK_0: return javax.microedition.lcdui.Canvas.KEY_NUM0;
                    default: return 0;
                }
            }
        });

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);

        // Start MIDlet
        try {
            midlet.startApp();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Game Render Loop (~35 FPS)
        Timer timer = new Timer(28, e -> {
            Displayable current = Display.getDisplay(midlet).getCurrent();
            if (current instanceof javax.microedition.lcdui.Canvas) {
                javax.microedition.lcdui.Canvas c = (javax.microedition.lcdui.Canvas) current;
                try {
                    Method m = c.getClass().getDeclaredMethod("paint", Graphics.class);
                    m.setAccessible(true);
                    m.invoke(c, gameGraphics);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            panel.repaint();
        });
        timer.start();
    }

    private void invokeCanvasMethod(String name, int a1, int a2) {
        Displayable current = Display.getDisplay(midlet).getCurrent();
        if (current instanceof javax.microedition.lcdui.Canvas) {
            try {
                Method m = current.getClass().getDeclaredMethod(name, int.class, int.class);
                m.setAccessible(true);
                m.invoke(current, a1, a2);
            } catch (Exception ignored) {}
        }
    }

    private void invokeCanvasMethod(String name, int a1) {
        Displayable current = Display.getDisplay(midlet).getCurrent();
        if (current instanceof javax.microedition.lcdui.Canvas) {
            try {
                Method m = current.getClass().getDeclaredMethod(name, int.class);
                m.setAccessible(true);
                m.invoke(current, a1);
            } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DesktopLauncher launcher = new DesktopLauncher();
            launcher.setVisible(true);
        });
    }
}
