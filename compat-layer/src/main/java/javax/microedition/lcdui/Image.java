package javax.microedition.lcdui;

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
