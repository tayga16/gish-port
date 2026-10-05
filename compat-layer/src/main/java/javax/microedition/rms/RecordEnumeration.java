package javax.microedition.rms;

public interface RecordEnumeration {
    int numRecords();
    byte[] nextRecord() throws RecordStoreException;
    int nextRecordId() throws RecordStoreException;
    boolean hasNextElement();
    void reset();
    void destroy();
}
