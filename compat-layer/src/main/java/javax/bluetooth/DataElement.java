package javax.bluetooth;
public class DataElement {
    public static final int NULL = 0;
    public static final int U_INT_1 = 8;
    public static final int U_INT_2 = 9;
    public static final int U_INT_4 = 10;
    public static final int STRING = 32;
    public static final int DATSEQ = 48;
    public DataElement(int valueType) {}
    public DataElement(boolean bool) {}
    public DataElement(int valueType, long value) {}
    public DataElement(int valueType, Object value) {}
    public void addElement(DataElement elem) {}
    public void insertElementAt(DataElement elem, int index) {}
    public int getDataType() { return 0; }
    public long getLong() { return 0; }
    public boolean getBoolean() { return false; }
    public Object getValue() { return null; }
}