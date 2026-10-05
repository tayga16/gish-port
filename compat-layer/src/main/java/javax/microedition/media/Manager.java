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
        private int state = Player.PREFETCHED;

        public void start() { state = Player.STARTED; }
        public void stop() { state = Player.PREFETCHED; }
        public void close() { state = Player.CLOSED; }
        public void prefetch() { state = Player.PREFETCHED; }
        public void realize() { state = Player.REALIZED; }
        public void setLoopCount(int count) {}
        public Control getControl(String controlType) {
            if (controlType != null && controlType.contains("VolumeControl")) return this;
            return null;
        }
        public int getState() { return state; }
        public void addPlayerListener(PlayerListener playerListener) {}
        public int setLevel(int level) { this.vol = level; return level; }
        public int getLevel() { return vol; }
    }
}
