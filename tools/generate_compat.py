import os

base = r'C:\Users\ALEXX\gish-mobile-port\compat-layer\src\main\java'

files = {}

# MIDlet
files['javax/microedition/midlet/MIDlet.java'] = """package javax.microedition.midlet;

public abstract class MIDlet {
    public static MIDlet currentMIDlet;

    public MIDlet() {
        currentMIDlet = this;
    }

    public abstract void startApp();
    public abstract void pauseApp();
    public abstract void destroyApp(boolean unconditional);

    public void notifyDestroyed() {
        System.out.println("[MIDlet] Game terminated.");
    }

    public String getAppProperty(String key) {
        if ("MIDlet-Touch-Support".equalsIgnoreCase(key)) return "TRUE";
        if ("Nokia-MIDlet-On-Screen-Keypad".equalsIgnoreCase(key)) return "no";
        return null;
    }
}
"""

# Displayable
files['javax/microedition/lcdui/Displayable.java'] = """package javax.microedition.lcdui;

public abstract class Displayable {
    protected int width = 240;
    protected int height = 320;
    protected boolean shown = false;

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public boolean isShown() { return shown; }
}
"""

# Display
files['javax/microedition/lcdui/Display.java'] = """package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public class Display {
    private static Display instance = new Display();
    private Displayable current;

    public static Display getDisplay(MIDlet m) {
        return instance;
    }

    public void setCurrent(Displayable d) {
        if (this.current instanceof Canvas) {
            ((Canvas) this.current).hideNotify();
        }
        this.current = d;
        if (d instanceof Canvas) {
            ((Canvas) d).showNotify();
        }
    }

    public Displayable getCurrent() {
        return current;
    }

    public boolean vibrate(int duration) {
        return true;
    }

    public int numColors() { return 65536; }
    public boolean isColor() { return true; }
}
"""

# Font
files['javax/microedition/lcdui/Font.java'] = """package javax.microedition.lcdui;

public class Font {
    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 2;
    public static final int SIZE_SMALL = 8;
    public static final int SIZE_MEDIUM = 0;
    public static final int SIZE_LARGE = 16;
    public static final int FACE_SYSTEM = 0;

    private static Font defaultFont = new Font();

    public static Font getDefaultFont() { return defaultFont; }
    public static Font getFont(int face, int style, int size) { return defaultFont; }

    public int getHeight() { return 14; }
    public int charWidth(char ch) { return 8; }
    public int stringWidth(String str) { return str != null ? str.length() * 8 : 0; }
    public int substringWidth(String str, int offset, int len) { return len * 8; }
}
"""

# DeviceControl
files['com/nokia/mid/ui/DeviceControl.java'] = """package com.nokia.mid.ui;

public class DeviceControl {
    public static void setLights(int num, int level) {}
    public static void vibrate(int duration) {}
}
"""

# VolumeControl
files['javax/microedition/media/control/VolumeControl.java'] = """package javax.microedition.media.control;

public interface VolumeControl {
    int setLevel(int level);
    int getLevel();
}
"""

# PlayerListener
files['javax/microedition/media/PlayerListener.java'] = """package javax.microedition.media;

public interface PlayerListener {
    String STARTED = "started";
    String STOPPED = "stopped";
    String END_OF_MEDIA = "endOfMedia";
    void playerUpdate(Player player, String event, Object eventData);
}
"""

# Player
files['javax/microedition/media/Player.java'] = """package javax.microedition.media;

public interface Player {
    void start();
    void stop();
    void close();
    void prefetch();
    void realize();
    void setLoopCount(int count);
    Object getControl(String controlType);
    void addPlayerListener(PlayerListener playerListener);
}
"""

# Manager
files['javax/microedition/media/Manager.java'] = """package javax.microedition.media;

import java.io.InputStream;
import javax.microedition.media.control.VolumeControl;

public class Manager {
    public static Player createPlayer(final InputStream is, String type) {
        return new DummyPlayer();
    }

    public static Player createPlayer(String locator) {
        return new DummyPlayer();
    }

    private static class DummyPlayer implements Player, VolumeControl {
        private int vol = 100;
        public void start() {}
        public void stop() {}
        public void close() {}
        public void prefetch() {}
        public void realize() {}
        public void setLoopCount(int count) {}
        public Object getControl(String controlType) {
            if (controlType != null && controlType.contains("VolumeControl")) return this;
            return null;
        }
        public void addPlayerListener(PlayerListener playerListener) {}
        public int setLevel(int level) { this.vol = level; return level; }
        public int getLevel() { return vol; }
    }
}
"""

# RecordStore & exceptions
files['javax/microedition/rms/RecordStoreException.java'] = """package javax.microedition.rms;

public class RecordStoreException extends Exception {
    public RecordStoreException() {}
    public RecordStoreException(String s) { super(s); }
}
"""

files['javax/microedition/rms/RecordStoreNotFoundException.java'] = """package javax.microedition.rms;

public class RecordStoreNotFoundException extends RecordStoreException {
    public RecordStoreNotFoundException() {}
    public RecordStoreNotFoundException(String s) { super(s); }
}
"""

files['javax/microedition/rms/RecordEnumeration.java'] = """package javax.microedition.rms;

public interface RecordEnumeration {
    int numRecords();
    byte[] nextRecord() throws RecordStoreException;
    int nextRecordId() throws RecordStoreException;
    boolean hasNextElement();
    void reset();
    void destroy();
}
"""

files['javax/microedition/rms/RecordStore.java'] = """package javax.microedition.rms;

import java.io.*;
import java.util.*;

public class RecordStore {
    private static final Map<String, RecordStore> stores = new HashMap<String, RecordStore>();
    private final String name;
    private final List<byte[]> records = new ArrayList<byte[]>();

    private RecordStore(String name) {
        this.name = name;
        load();
    }

    public static synchronized RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary)
            throws RecordStoreException {
        RecordStore rs = stores.get(recordStoreName);
        if (rs == null) {
            rs = new RecordStore(recordStoreName);
            stores.put(recordStoreName, rs);
        }
        return rs;
    }

    public void closeRecordStore() throws RecordStoreException {
        save();
    }

    public static void deleteRecordStore(String name) {
        stores.remove(name);
        new File(name + ".rms").delete();
    }

    public static String[] listRecordStores() {
        return stores.keySet().toArray(new String[0]);
    }

    public int getNumRecords() {
        return records.size();
    }

    public int getSize() {
        int total = 0;
        for (byte[] b : records) if (b != null) total += b.length;
        return total;
    }

    public int getSizeAvailable() { return 1024 * 1024; }

    public synchronized int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException {
        byte[] copy = new byte[numBytes];
        System.arraycopy(data, offset, copy, 0, numBytes);
        records.add(copy);
        save();
        return records.size();
    }

    public synchronized void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws RecordStoreException {
        int idx = recordId - 1;
        while (records.size() <= idx) records.add(null);
        byte[] copy = new byte[numBytes];
        System.arraycopy(newData, offset, copy, 0, numBytes);
        records.set(idx, copy);
        save();
    }

    public synchronized byte[] getRecord(int recordId) throws RecordStoreException {
        int idx = recordId - 1;
        if (idx < 0 || idx >= records.size() || records.get(idx) == null) {
            throw new RecordStoreException("Invalid record id: " + recordId);
        }
        return records.get(idx);
    }

    public synchronized int getRecord(int recordId, byte[] buffer, int offset) throws RecordStoreException {
        byte[] rec = getRecord(recordId);
        System.arraycopy(rec, 0, buffer, offset, rec.length);
        return rec.length;
    }

    public synchronized void deleteRecord(int recordId) throws RecordStoreException {
        int idx = recordId - 1;
        if (idx >= 0 && idx < records.size()) {
            records.set(idx, null);
            save();
        }
    }

    private void save() {
        try {
            File dir = new File(System.getProperty("user.home", "."), ".gish_save");
            dir.mkdirs();
            File file = new File(dir, name + ".rms");
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeInt(records.size());
            for (byte[] rec : records) {
                if (rec == null) {
                    dos.writeInt(-1);
                } else {
                    dos.writeInt(rec.length);
                    dos.write(rec);
                }
            }
            dos.close();
        } catch (Exception ignored) {}
    }

    private void load() {
        try {
            File dir = new File(System.getProperty("user.home", "."), ".gish_save");
            File file = new File(dir, name + ".rms");
            if (!file.exists()) return;
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            int count = dis.readInt();
            records.clear();
            for (int i = 0; i < count; i++) {
                int len = dis.readInt();
                if (len == -1) {
                    records.add(null);
                } else {
                    byte[] b = new byte[len];
                    dis.readFully(b);
                    records.add(b);
                }
            }
            dis.close();
        } catch (Exception ignored) {}
    }
}
"""

# IO Connections
files['javax/microedition/io/Connection.java'] = """package javax.microedition.io;
import java.io.IOException;
public interface Connection {
    void close() throws IOException;
}
"""

files['javax/microedition/io/StreamConnection.java'] = """package javax.microedition.io;
import java.io.*;
public interface StreamConnection extends Connection {
    InputStream openInputStream() throws IOException;
    DataInputStream openDataInputStream() throws IOException;
    OutputStream openOutputStream() throws IOException;
    DataOutputStream openDataOutputStream() throws IOException;
}
"""

files['javax/microedition/io/HttpConnection.java'] = """package javax.microedition.io;
public interface HttpConnection extends StreamConnection {
    int HTTP_OK = 200;
}
"""

files['javax/microedition/io/Connector.java'] = """package javax.microedition.io;
import java.io.IOException;
public class Connector {
    public static Connection open(String name) throws IOException {
        return null;
    }
}
"""

# Canvas
files['javax/microedition/lcdui/Canvas.java'] = """package javax.microedition.lcdui;

public abstract class Canvas extends Displayable {
    public static final int UP = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int DOWN = 6;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;

    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;

    public Canvas() {
        this.width = 240;
        this.height = 320;
    }

    public boolean isDoubleBuffered() { return true; }
    public void setFullScreenMode(boolean mode) {}

    public void repaint() {}
    public void repaint(int x, int y, int width, int height) {}
    public void serviceRepaints() {}

    public int getGameAction(int keyCode) {
        switch (keyCode) {
            case KEY_NUM2: return UP;
            case KEY_NUM4: return LEFT;
            case KEY_NUM6: return RIGHT;
            case KEY_NUM8: return DOWN;
            case KEY_NUM5: return FIRE;
            default: return keyCode;
        }
    }

    public int getKeyCode(int gameAction) {
        switch (gameAction) {
            case UP: return KEY_NUM2;
            case LEFT: return KEY_NUM4;
            case RIGHT: return KEY_NUM6;
            case DOWN: return KEY_NUM8;
            case FIRE: return KEY_NUM5;
            default: return gameAction;
        }
    }

    protected abstract void paint(Graphics g);
    protected void keyPressed(int keyCode) {}
    protected void keyReleased(int keyCode) {}
    protected void pointerPressed(int x, int y) {}
    protected void pointerReleased(int x, int y) {}
    protected void pointerDragged(int x, int y) {}
    protected void showNotify() { shown = true; }
    protected void hideNotify() { shown = false; }
    protected void sizeChanged(int w, int h) {
        this.width = w;
        this.height = h;
    }
}
"""

# Image & Graphics (Hardware-independent ARGB raster)
files['javax/microedition/lcdui/Image.java'] = """package javax.microedition.lcdui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Image {
    private final int width;
    private final int height;
    private final int[] rgbData;
    private final boolean mutable;
    private Graphics graphics;

    public Image(int width, int height, boolean mutable) {
        this.width = width;
        this.height = height;
        this.mutable = mutable;
        this.rgbData = new int[width * height];
    }

    public Image(int width, int height, int[] rgbData, boolean mutable) {
        this.width = width;
        this.height = height;
        this.mutable = mutable;
        this.rgbData = rgbData;
    }

    public static Image createImage(String name) throws java.io.IOException {
        if (!name.startsWith("/")) name = "/" + name;
        InputStream is = Image.class.getResourceAsStream(name);
        if (is == null) {
            throw new java.io.IOException("Resource not found: " + name);
        }
        return createImage(is);
    }

    public static Image createImage(InputStream is) throws java.io.IOException {
        BufferedImage bi = ImageIO.read(is);
        if (bi == null) throw new java.io.IOException("Failed to decode image from stream");
        int w = bi.getWidth();
        int h = bi.getHeight();
        int[] rgb = new int[w * h];
        bi.getRGB(0, 0, w, h, rgb, 0, w);
        return new Image(w, h, rgb, false);
    }

    public static Image createImage(byte[] data, int offset, int length) {
        try {
            return createImage(new ByteArrayInputStream(data, offset, length));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Image createImage(int width, int height) {
        return new Image(width, height, true);
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        int[] copy = new int[width * height];
        System.arraycopy(rgb, 0, copy, 0, copy.length);
        if (!processAlpha) {
            for (int i = 0; i < copy.length; i++) copy[i] |= 0xFF000000;
        }
        return new Image(width, height, copy, false);
    }

    public static Image createImage(Image image, int x, int y, int width, int height, int transform) {
        int[] srcRGB = image.rgbData;
        int srcW = image.width;
        int dstW = (transform == 5 || transform == 6 || transform == 4 || transform == 7) ? height : width;
        int dstH = (transform == 5 || transform == 6 || transform == 4 || transform == 7) ? width : height;
        int[] dstRGB = new int[dstW * dstH];

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                int pixel = srcRGB[(y + r) * srcW + (x + c)];
                int dx = c, dy = r;
                switch (transform) {
                    case 0: dx = c; dy = r; break; // TRANS_NONE
                    case 2: dx = width - 1 - c; dy = r; break; // TRANS_MIRROR
                    case 3: dx = width - 1 - c; dy = height - 1 - r; break; // TRANS_ROT180
                    case 1: dx = c; dy = height - 1 - r; break; // TRANS_MIRROR_ROT180
                    case 5: dx = height - 1 - r; dy = c; break; // TRANS_ROT90
                    case 6: dx = r; dy = width - 1 - c; break; // TRANS_ROT270
                    case 7: dx = r; dy = c; break; // TRANS_MIRROR_ROT90
                    case 4: dx = height - 1 - r; dy = width - 1 - c; break; // TRANS_MIRROR_ROT270
                }
                dstRGB[dy * dstW + dx] = pixel;
            }
        }
        return new Image(dstW, dstH, dstRGB, false);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public boolean isMutable() { return mutable; }
    public int[] getRgbData() { return rgbData; }

    public Graphics getGraphics() {
        if (!mutable) throw new IllegalStateException("Cannot get graphics from immutable image");
        if (graphics == null) graphics = new Graphics(this);
        return graphics;
    }

    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {
        for (int r = 0; r < height; r++) {
            System.arraycopy(this.rgbData, (y + r) * this.width + x, rgbData, offset + r * scanlength, width);
        }
    }
}
"""

files['javax/microedition/lcdui/Graphics.java'] = """package javax.microedition.lcdui;

public class Graphics {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;

    private final Image targetImage;
    private final int[] targetPixels;
    private final int targetWidth;
    private final int targetHeight;

    private int color = 0xFF000000;
    private int transX = 0;
    private int transY = 0;
    private int clipX = 0;
    private int clipY = 0;
    private int clipW;
    private int clipH;

    public Graphics(Image target) {
        this.targetImage = target;
        this.targetWidth = target.getWidth();
        this.targetHeight = target.getHeight();
        this.targetPixels = target.getRgbData();
        this.clipW = this.targetWidth;
        this.clipH = this.targetHeight;
    }

    public void setColor(int RGB) {
        this.color = 0xFF000000 | (RGB & 0x00FFFFFF);
    }

    public void setColor(int r, int g, int b) {
        this.color = 0xFF000000 | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | (b & 0xFF);
    }

    public int getColor() { return this.color & 0x00FFFFFF; }

    public void translate(int x, int y) {
        this.transX += x;
        this.transY += y;
    }

    public int getTranslateX() { return transX; }
    public int getTranslateY() { return transY; }

    public void setClip(int x, int y, int width, int height) {
        int rx = x + transX;
        int ry = y + transY;
        this.clipX = Math.max(0, rx);
        this.clipY = Math.max(0, ry);
        int rMaxX = Math.min(targetWidth, rx + width);
        int rMaxY = Math.min(targetHeight, ry + height);
        this.clipW = Math.max(0, rMaxX - clipX);
        this.clipH = Math.max(0, rMaxY - clipY);
    }

    public void clipRect(int x, int y, int width, int height) {
        int rx = x + transX;
        int ry = y + transY;
        int newX = Math.max(clipX, rx);
        int newY = Math.max(clipY, ry);
        int newMaxX = Math.min(clipX + clipW, rx + width);
        int newMaxY = Math.min(clipY + clipH, ry + height);
        this.clipX = newX;
        this.clipY = newY;
        this.clipW = Math.max(0, newMaxX - newX);
        this.clipH = Math.max(0, newMaxY - newY);
    }

    public int getClipX() { return clipX - transX; }
    public int getClipY() { return clipY - transY; }
    public int getClipWidth() { return clipW; }
    public int getClipHeight() { return clipH; }

    public void fillRect(int x, int y, int width, int height) {
        int startX = Math.max(clipX, x + transX);
        int startY = Math.max(clipY, y + transY);
        int endX = Math.min(clipX + clipW, x + transX + width);
        int endY = Math.min(clipY + clipH, y + transY + height);

        for (int py = startY; py < endY; py++) {
            int row = py * targetWidth;
            for (int px = startX; px < endX; px++) {
                targetPixels[row + px] = color;
            }
        }
    }

    public void drawRect(int x, int y, int width, int height) {
        drawLine(x, y, x + width, y);
        drawLine(x + width, y, x + width, y + height);
        drawLine(x + width, y + height, x, y + height);
        drawLine(x, y + height, x, y);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        x1 += transX; y1 += transY;
        x2 += transX; y2 += transY;
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            if (x1 >= clipX && x1 < clipX + clipW && y1 >= clipY && y1 < clipY + clipH) {
                targetPixels[y1 * targetWidth + x1] = color;
            }
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) { err -= dy; x1 += sx; }
            if (e2 < dx) { err += dx; y1 += sy; }
        }
    }

    public void drawImage(Image img, int x, int y, int anchor) {
        if (img == null) return;
        drawRegion(img, 0, 0, img.getWidth(), img.getHeight(), 0, x, y, anchor);
    }

    public void drawRegion(Image src, int x_src, int y_src, int width, int height,
                           int transform, int x_dest, int y_dest, int anchor) {
        if (src == null || width <= 0 || height <= 0) return;
        x_dest += transX;
        y_dest += transY;

        int transW = (transform == 5 || transform == 6 || transform == 4 || transform == 7) ? height : width;
        int transH = (transform == 5 || transform == 6 || transform == 4 || transform == 7) ? width : height;

        if ((anchor & HCENTER) != 0) x_dest -= transW / 2;
        else if ((anchor & RIGHT) != 0) x_dest -= transW;

        if ((anchor & VCENTER) != 0) y_dest -= transH / 2;
        else if ((anchor & BOTTOM) != 0) y_dest -= transH;

        int[] srcPixels = src.getRgbData();
        int srcW = src.getWidth();

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                int dx = c, dy = r;
                switch (transform) {
                    case 0: dx = c; dy = r; break;
                    case 2: dx = width - 1 - c; dy = r; break;
                    case 3: dx = width - 1 - c; dy = height - 1 - r; break;
                    case 1: dx = c; dy = height - 1 - r; break;
                    case 5: dx = height - 1 - r; dy = c; break;
                    case 6: dx = r; dy = width - 1 - c; break;
                    case 7: dx = r; dy = c; break;
                    case 4: dx = height - 1 - r; dy = width - 1 - c; break;
                }
                int px = x_dest + dx;
                int py = y_dest + dy;
                if (px >= clipX && px < clipX + clipW && py >= clipY && py < clipY + clipH) {
                    int pixel = srcPixels[(y_src + r) * srcW + (x_src + c)];
                    int alpha = (pixel >>> 24);
                    if (alpha == 255) {
                        targetPixels[py * targetWidth + px] = pixel;
                    } else if (alpha > 0) {
                        int dstPixel = targetPixels[py * targetWidth + px];
                        int invAlpha = 255 - alpha;
                        int red = ((pixel >> 16 & 0xFF) * alpha + (dstPixel >> 16 & 0xFF) * invAlpha) / 255;
                        int green = ((pixel >> 8 & 0xFF) * alpha + (dstPixel >> 8 & 0xFF) * invAlpha) / 255;
                        int blue = ((pixel & 0xFF) * alpha + (dstPixel & 0xFF) * invAlpha) / 255;
                        targetPixels[py * targetWidth + px] = 0xFF000000 | (red << 16) | (green << 8) | blue;
                    }
                }
            }
        }
    }

    public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha) {
        x += transX;
        y += transY;
        for (int r = 0; r < height; r++) {
            int py = y + r;
            if (py < clipY || py >= clipY + clipH) continue;
            for (int c = 0; c < width; c++) {
                int px = x + c;
                if (px < clipX || px >= clipX + clipW) continue;
                int pixel = rgbData[offset + r * scanlength + c];
                if (!processAlpha) pixel |= 0xFF000000;
                int alpha = (pixel >>> 24);
                if (alpha == 255) {
                    targetPixels[py * targetWidth + px] = pixel;
                } else if (alpha > 0) {
                    int dstPixel = targetPixels[py * targetWidth + px];
                    int invAlpha = 255 - alpha;
                    int red = ((pixel >> 16 & 0xFF) * alpha + (dstPixel >> 16 & 0xFF) * invAlpha) / 255;
                    int green = ((pixel >> 8 & 0xFF) * alpha + (dstPixel >> 8 & 0xFF) * invAlpha) / 255;
                    int blue = ((pixel & 0xFF) * alpha + (dstPixel & 0xFF) * invAlpha) / 255;
                    targetPixels[py * targetWidth + px] = 0xFF000000 | (red << 16) | (green << 8) | blue;
                }
            }
        }
    }

    public void drawString(String str, int x, int y, int anchor) {
        // Fallback simple string renderer or bitmap font (Gish mobile has its own custom bitmap fonts)
    }
}
"""

for rel_path, content in files.items():
    p = os.path.join(base, rel_path.replace('/', os.sep))
    os.makedirs(os.path.dirname(p), exist_ok=True)
    with open(p, 'w', encoding='utf-8') as f:
        f.write(content)

print(f'Successfully created {len(files)} compat-layer files.')
