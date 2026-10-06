package javax.microedition.lcdui;

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

    @Override
    public boolean isShown() {
        return true;
    }

    public boolean isDoubleBuffered() { return true; }
    public void setFullScreenMode(boolean mode) {}

    public void repaint() {
        try {
            java.lang.reflect.Field f = getClass().getDeclaredField("c");
            f.setAccessible(true);
            f.setBoolean(this, false);
        } catch (Throwable ignored) {}
    }
    public void repaint(int x, int y, int width, int height) { repaint(); }
    public void serviceRepaints() { repaint(); }

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
