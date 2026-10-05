package javax.microedition.lcdui;

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
