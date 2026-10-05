package javax.microedition.media;

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
