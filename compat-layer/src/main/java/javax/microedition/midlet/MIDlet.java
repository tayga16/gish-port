package javax.microedition.midlet;

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
