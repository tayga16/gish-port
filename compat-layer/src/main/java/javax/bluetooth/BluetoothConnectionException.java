package javax.bluetooth;
import java.io.IOException;
public class BluetoothConnectionException extends IOException {
    public static final int UNKNOWN_PSM = 1;
    public BluetoothConnectionException(int error) {}
    public BluetoothConnectionException(int error, String msg) { super(msg); }
}