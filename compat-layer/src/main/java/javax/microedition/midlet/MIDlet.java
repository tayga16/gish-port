package javax.microedition.midlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

public abstract class MIDlet {
    public static MIDlet currentMIDlet;
    public static Object assetManager;
    public static File filesDir;

    public MIDlet() {
        currentMIDlet = this;
    }

    public static void setAssetManager(Object am) {
        assetManager = am;
    }

    public static void setFilesDir(File dir) {
        filesDir = dir;
    }

    public static InputStream getResourceAsStream(String name) {
        if (name == null) return null;
        String cleanName = name;
        while (cleanName.startsWith("/")) {
            cleanName = cleanName.substring(1);
        }

        // 1. Try Android AssetManager via reflection (for APK assets)
        if (assetManager != null) {
            try {
                Method openMethod = assetManager.getClass().getMethod("open", String.class);
                return (InputStream) openMethod.invoke(assetManager, cleanName);
            } catch (Exception ignored) {}
        }

        // 2. Try ClassLoader
        try {
            ClassLoader cl = MIDlet.class.getClassLoader();
            if (cl != null) {
                InputStream is = cl.getResourceAsStream(cleanName);
                if (is != null) return is;
                is = cl.getResourceAsStream("/" + cleanName);
                if (is != null) return is;
            }
        } catch (Exception ignored) {}

        // 3. Try MIDlet.class
        try {
            InputStream is = MIDlet.class.getResourceAsStream("/" + cleanName);
            if (is != null) return is;
        } catch (Exception ignored) {}

        // 4. Try filesDir
        if (filesDir != null) {
            File f = new File(filesDir, cleanName);
            if (f.exists() && f.isFile()) {
                try {
                    return new FileInputStream(f);
                } catch (Exception ignored) {}
            }
        }

        return null;
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
