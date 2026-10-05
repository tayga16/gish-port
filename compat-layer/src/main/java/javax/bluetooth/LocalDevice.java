package javax.bluetooth;
public class LocalDevice {
    public static LocalDevice getLocalDevice() throws BluetoothStateException {
        return new LocalDevice();
    }
    public DiscoveryAgent getDiscoveryAgent() { return new DiscoveryAgent(); }
    public String getFriendlyName() { return "Local"; }
    public String getBluetoothAddress() { return "000000000000"; }
    public static boolean isPowerOn() { return false; }
    public boolean setDiscoverable(int mode) throws BluetoothStateException { return false; }
    public ServiceRecord getRecord(javax.microedition.io.Connection notifier) { return null; }
    public void updateRecord(ServiceRecord srvRecord) throws BluetoothStateException {}
}