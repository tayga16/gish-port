package javax.bluetooth;
import java.io.IOException;
public class RemoteDevice {
    protected RemoteDevice(String address) {}
    public String getBluetoothAddress() { return "000000000000"; }
    public String getFriendlyName(boolean alwaysAsk) throws IOException { return "Remote"; }
}