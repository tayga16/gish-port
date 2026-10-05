package javax.microedition.rms;

import java.io.*;
import java.util.*;
import javax.microedition.midlet.MIDlet;

public class RecordStore {
    private static final Map<String, RecordStore> stores = new HashMap<String, RecordStore>();
    private final String name;
    private final List<byte[]> records = new ArrayList<byte[]>();

    private RecordStore(String name) {
        this.name = name;
        load();
    }

    public static synchronized RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary)
            throws RecordStoreException {
        RecordStore rs = stores.get(recordStoreName);
        if (rs == null) {
            rs = new RecordStore(recordStoreName);
            stores.put(recordStoreName, rs);
        }
        return rs;
    }

    public static synchronized RecordStore openRecordStore(String recordStoreName, String vendorName, String suiteName)
            throws RecordStoreException {
        return openRecordStore(recordStoreName, true);
    }

    public void setMode(int authmode, boolean writable) throws RecordStoreException {
        // Mode setting not needed for standalone emulator
    }

    public void closeRecordStore() throws RecordStoreException {
        save();
    }

    public static void deleteRecordStore(String name) {
        stores.remove(name);
        File file = new File(getSaveDir(), name + ".rms");
        if (file.exists()) file.delete();
    }

    public static String[] listRecordStores() {
        return stores.keySet().toArray(new String[0]);
    }

    public int getNumRecords() {
        return records.size();
    }

    public int getSize() {
        int total = 0;
        for (byte[] b : records) if (b != null) total += b.length;
        return total;
    }

    public int getSizeAvailable() { return 1024 * 1024; }

    public synchronized int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException {
        byte[] copy = new byte[numBytes];
        System.arraycopy(data, offset, copy, 0, numBytes);
        records.add(copy);
        save();
        return records.size();
    }

    public synchronized void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws RecordStoreException {
        int idx = recordId - 1;
        while (records.size() <= idx) records.add(null);
        byte[] copy = new byte[numBytes];
        System.arraycopy(newData, offset, copy, 0, numBytes);
        records.set(idx, copy);
        save();
    }

    public synchronized byte[] getRecord(int recordId) throws RecordStoreException {
        int idx = recordId - 1;
        if (idx < 0 || idx >= records.size() || records.get(idx) == null) {
            throw new RecordStoreException("Invalid record id: " + recordId);
        }
        return records.get(idx);
    }

    public synchronized int getRecord(int recordId, byte[] buffer, int offset) throws RecordStoreException {
        byte[] rec = getRecord(recordId);
        System.arraycopy(rec, 0, buffer, offset, rec.length);
        return rec.length;
    }

    public synchronized void deleteRecord(int recordId) throws RecordStoreException {
        int idx = recordId - 1;
        if (idx >= 0 && idx < records.size()) {
            records.set(idx, null);
            save();
        }
    }

    private static File getSaveDir() {
        if (MIDlet.filesDir != null) {
            File dir = new File(MIDlet.filesDir, "rms");
            dir.mkdirs();
            return dir;
        }
        File dir = new File(System.getProperty("user.home", "."), ".gish_save");
        dir.mkdirs();
        return dir;
    }

    private void save() {
        try {
            File dir = getSaveDir();
            File file = new File(dir, name + ".rms");
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeInt(records.size());
            for (byte[] rec : records) {
                if (rec == null) {
                    dos.writeInt(-1);
                } else {
                    dos.writeInt(rec.length);
                    dos.write(rec);
                }
            }
            dos.close();
        } catch (Exception ignored) {}
    }

    private void load() {
        try {
            File dir = getSaveDir();
            File file = new File(dir, name + ".rms");
            if (!file.exists()) return;
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            int count = dis.readInt();
            records.clear();
            for (int i = 0; i < count; i++) {
                int len = dis.readInt();
                if (len == -1) {
                    records.add(null);
                } else {
                    byte[] b = new byte[len];
                    dis.readFully(b);
                    records.add(b);
                }
            }
            dis.close();
        } catch (Exception ignored) {}
    }
}
