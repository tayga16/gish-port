package javax.bluetooth;
public interface ServiceRecord {
    int NOAUTHENTICATE_NOENCRYPT = 0;
    int AUTHENTICATE_NOENCRYPT = 1;
    int AUTHENTICATE_ENCRYPT = 2;
    String getConnectionURL(int requiredSecurity, boolean mustBeMaster);
    RemoteDevice getHostDevice();
    int[] getAttributeIDs();
    DataElement getAttributeValue(int attrID);
    boolean setAttributeValue(int attrID, DataElement attrValue);
    boolean populateRecord(int[] attrIDs) throws java.io.IOException;
}