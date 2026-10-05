package javax.microedition.lcdui;

public class Graphics {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;

    public static final int SOLID = 0;
    public static final int DOTTED = 1;

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
    private Font font;
    private int strokeStyle = SOLID;

    public Graphics(Image target) {
        this.targetImage = target;
        this.targetWidth = target.getWidth();
        this.targetHeight = target.getHeight();
        this.targetPixels = target.getRgbData();
        this.clipW = this.targetWidth;
        this.clipH = this.targetHeight;
        this.font = Font.getDefaultFont();
    }

    public void setColor(int RGB) {
        this.color = 0xFF000000 | (RGB & 0x00FFFFFF);
    }

    public void setColor(int r, int g, int b) {
        this.color = 0xFF000000 | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | (b & 0xFF);
    }

    public int getColor() { return this.color & 0x00FFFFFF; }

    public void setFont(Font f) {
        this.font = (f != null) ? f : Font.getDefaultFont();
    }

    public Font getFont() {
        return this.font != null ? this.font : Font.getDefaultFont();
    }

    public void setStrokeStyle(int style) {
        this.strokeStyle = style;
    }

    public int getStrokeStyle() {
        return strokeStyle;
    }

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

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        x1 += transX; y1 += transY;
        x2 += transX; y2 += transY;
        x3 += transX; y3 += transY;

        // Sort vertices by Y ascending: p1, p2, p3
        if (y1 > y2) { int tx = x1; x1 = x2; x2 = tx; int ty = y1; y1 = y2; y2 = ty; }
        if (y1 > y3) { int tx = x1; x1 = x3; x3 = tx; int ty = y1; y1 = y3; y3 = ty; }
        if (y2 > y3) { int tx = x2; x2 = x3; x3 = tx; int ty = y2; y2 = y3; y3 = ty; }

        if (y1 == y3) return; // Degenerate

        int minY = Math.max(clipY, y1);
        int maxY = Math.min(clipY + clipH - 1, y3);

        for (int y = minY; y <= maxY; y++) {
            // Find edge intersections
            int xa = x1 + (int)((long)(y - y1) * (x3 - x1) / (y3 - y1));
            int xb;
            if (y < y2) {
                xb = (y2 == y1) ? x1 : x1 + (int)((long)(y - y1) * (x2 - x1) / (y2 - y1));
            } else {
                xb = (y3 == y2) ? x2 : x2 + (int)((long)(y - y2) * (x3 - x2) / (y3 - y2));
            }

            int left = Math.min(xa, xb);
            int right = Math.max(xa, xb);

            int startX = Math.max(clipX, left);
            int endX = Math.min(clipX + clipW - 1, right);

            int row = y * targetWidth;
            for (int x = startX; x <= endX; x++) {
                targetPixels[row + x] = color;
            }
        }
    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        if (width <= 0 || height <= 0) return;
        x += transX;
        y += transY;

        int rx = width / 2;
        int ry = height / 2;
        int cx = x + rx;
        int cy = y + ry;

        int startY = Math.max(clipY, y);
        int endY = Math.min(clipY + clipH - 1, y + height);

        for (int py = startY; py <= endY; py++) {
            int dy = py - cy;
            double dyNorm = (double) dy / (ry > 0 ? ry : 1);
            if (Math.abs(dyNorm) > 1.0) continue;
            double dxNorm = Math.sqrt(Math.max(0.0, 1.0 - dyNorm * dyNorm));
            int spanX = (int)(dxNorm * rx);

            int startX = Math.max(clipX, cx - spanX);
            int endX = Math.min(clipX + clipW - 1, cx + spanX);

            int row = py * targetWidth;
            for (int px = startX; px <= endX; px++) {
                targetPixels[row + px] = color;
            }
        }
    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        if (width <= 0 || height <= 0) return;
        x += transX;
        y += transY;
        int rx = width / 2;
        int ry = height / 2;
        int cx = x + rx;
        int cy = y + ry;

        // Draw approximate ellipse outline
        int steps = Math.max(16, (rx + ry) / 2);
        int prevX = -1, prevY = -1;
        for (int i = 0; i <= steps; i++) {
            double rad = 2 * Math.PI * i / steps;
            int px = cx + (int)(rx * Math.cos(rad));
            int py = cy + (int)(ry * Math.sin(rad));
            if (prevX != -1) {
                drawLine(prevX - transX, prevY - transY, px - transX, py - transY);
            }
            prevX = px;
            prevY = py;
        }
    }

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        fillRect(x, y, width, height);
    }

    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        drawRect(x, y, width, height);
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
        // Gish uses custom bitmap fonts from images.img
    }

    public void drawSubstring(String str, int offset, int len, int x, int y, int anchor) {
        if (str != null) drawString(str.substring(offset, offset + len), x, y, anchor);
    }

    public void drawChar(char character, int x, int y, int anchor) {
        drawString(String.valueOf(character), x, y, anchor);
    }

    public void drawChars(char[] data, int offset, int length, int x, int y, int anchor) {
        if (data != null) drawString(new String(data, offset, length), x, y, anchor);
    }
}
