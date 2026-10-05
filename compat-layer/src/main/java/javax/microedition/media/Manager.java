package javax.microedition.media;

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
