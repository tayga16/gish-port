package javax.microedition.media;

public interface Player {
    int UNREALIZED = 100;
    int REALIZED = 200;
    int PREFETCHED = 300;
    int STARTED = 400;
    int CLOSED = 0;

    void start();
    void stop();
    void close();
    void prefetch();
    void realize();
    void setLoopCount(int count);
    Control getControl(String controlType);
    int getState();
    void addPlayerListener(PlayerListener playerListener);
}
