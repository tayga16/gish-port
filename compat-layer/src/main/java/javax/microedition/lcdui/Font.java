package javax.microedition.lcdui;

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
