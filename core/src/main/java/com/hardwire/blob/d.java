package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d {
    public static int a = 0;
    private static final String[] c = new String[]{"english", "deutsch", "fran\u00e7ais", "espa\u00f1ol", "italiano", "\u010de\u0161tina"};
    public static final String[] a = new String[]{"en", "de", "fr", "es", "it", "cz"};
    public static byte[][] a;
    public static final short[] a;
    public static final short[] b;
    public static final short[] c;
    public static final short[] d;
    public static final short[] e;
    public static final short[] f;
    public static final short[] g;
    public static final String[] b;
    public boolean[] a;
    private static char[][] a;
    private static String[] d;
    private static String[] e;
    private static int[] a;
    private static final int[] b;
    private static int[][] a;
    private static int[] c;
    private static int[] d;
    private static Main a;
    private static Image[] a;
    private static int[] e;
    private static int[][] b;
    private static int[][] c;
    private static boolean[][] a;
    private byte[][] b;
    private byte[][][] a;
    private byte[] a;

    public static int a(int n2) {
        if (d.a.a.e == 0) {
            for (int i2 = 0; i2 < a.length - 1; ++i2) {
                if (a[i2] != n2) continue;
                return a[i2 + 1];
            }
        } else {
            for (int i3 = 0; i3 < d.length - 1; ++i3) {
                if (d[i3] != n2) continue;
                return d[i3 + 1];
            }
        }
        return -1;
    }

    public static int a(short[] sArray, int n2) {
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            if (sArray[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    private void a(boolean[] blArray) {
        for (int i2 = 0; i2 < blArray.length; ++i2) {
            if (!blArray[i2]) continue;
            this.a[i2] = 3;
        }
        this.a[13] = 3;
        this.a[157] = 3;
        this.a[156] = 3;
        this.a[155] = 3;
    }

    private static boolean[] a(int n2) {
        boolean[] blArray = new boolean[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            blArray[i2] = false;
        }
        blArray[8] = true;
        blArray[28] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[30] = true;
        blArray[31] = true;
        blArray[49] = true;
        blArray[55] = true;
        blArray[56] = true;
        blArray[57] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[64] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[138] = true;
        blArray[144] = true;
        blArray[152] = true;
        blArray[137] = true;
        blArray[153] = true;
        blArray[146] = true;
        blArray[154] = true;
        blArray[160] = true;
        blArray[202] = true;
        blArray[203] = true;
        blArray[206] = true;
        blArray[207] = true;
        blArray[208] = true;
        blArray[209] = true;
        blArray[210] = true;
        blArray[211] = true;
        blArray[212] = true;
        blArray[213] = true;
        return blArray;
    }

    public final void a() {
        this.a = null;
        this.a = new boolean[200];
        this.b = null;
        this.a = null;
        this.a = new byte[200][][];
    }

    public final void b() {
        int n2;
        if (this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2] = null;
            }
        }
        if (this.b != null) {
            for (n2 = 0; n2 < this.b.length; ++n2) {
                this.b[n2] = null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        block18: {
            boolean bl = false;
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (!this.a[i2]) {
                    this.a[i2] = null;
                    continue;
                }
                if (this.a[i2] != null) continue;
                bl = true;
            }
            if (!bl) return;
            InputStream inputStream = null;
            try {
                inputStream = Main.a("/tl_pointer." + a[a]);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i3 = 0; i3 < this.a.length; ++i3) {
                    int n2;
                    if (!this.a[i3] || this.a[i3] != null) {
                        while ((n2 = inputStream.read()) != 124 && n2 != -1 && n2 != 0) {
                        }
                    } else {
                        while ((n2 = inputStream.read()) != 124 && n2 != -1 && n2 != 0) {
                            byteArrayOutputStream.write(n2);
                        }
                        this.a[i3] = d.a(3, d.a(3, d.a(byteArrayOutputStream.toByteArray())), ad.a - 10);
                        byteArrayOutputStream.reset();
                    }
                    if (n2 != 0) {
                        continue;
                    }
                    break;
                }
            }
            catch (Exception exception) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
                break block18;
            }
            catch (Throwable throwable) {
                try {
                    inputStream.close();
                    throw throwable;
                }
                catch (IOException iOException) {}
                throw throwable;
            }
            try {
                inputStream.close();
            }
            catch (IOException iOException) {}
        }
        System.gc();
    }

    public d(Main main) {
        a = main;
    }

    public static void d() {
        a = new Image[4];
        e = new int[4];
        b = new int[4][];
        c = new int[4][];
        a = new boolean[4][];
        d.a(0, 8);
        d.a(1, 7);
        d.a(2, 237);
        d.a(3, 230);
        a = new byte[c.length][];
        for (int i2 = 0; i2 < a.length; ++i2) {
            d.a[i2] = d.a(0, c[i2]);
        }
        System.gc();
    }

    public static int b(int n2) {
        return c[0];
    }

    public final void a(Graphics graphics, int n2, String string, int n3, int n4, int n5) {
        d.a(graphics, n2, d.a(n2, string), n3, n4, Integer.MIN_VALUE, Integer.MAX_VALUE, n5);
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        if (this.b[n2] == null) {
            return;
        }
        d.a(graphics, this.a[n2], this.b[n2], n3, n4, Integer.MIN_VALUE, Integer.MAX_VALUE, n5);
    }

    public final void a(Graphics graphics, int n2, byte[] byArray, int n3, int n4, int n5) {
        d.a(graphics, n2, byArray, n3, n4, Integer.MIN_VALUE, Integer.MAX_VALUE, n5);
    }

    public static void a(Graphics graphics, int n2, byte[] byArray, int n3, int n4, int n5, int n6, int n7) {
        byte[] byArray2;
        if (byArray == null) {
            return;
        }
        if ((n7 & 8) != 0) {
            int n8 = n3;
            byArray2 = byArray;
            n3 = n2;
            n3 = n8 - d.a(n3, byArray2, byArray2.length);
        } else if ((n7 & 1) != 0) {
            int n9 = n3;
            byArray2 = byArray;
            n3 = n2;
            n3 = n9 - (d.a(n3, byArray2, byArray2.length) >> 1);
        }
        if ((n7 & 0x20) != 0 || (n7 & 0x40) != 0) {
            n4 -= e[n2];
        } else if ((n7 & 2) != 0) {
            n4 -= e[n2] >> 1;
        }
        n7 = graphics.getClipX();
        int n10 = graphics.getClipY();
        int n11 = graphics.getClipWidth();
        int n12 = graphics.getClipHeight();
        int n13 = byArray.length;
        for (int i2 = 0; i2 < n13; ++i2) {
            if (byArray[i2] == -3) continue;
            if (byArray[i2] == -1) {
                n3 += c[n2] + d[n2];
                continue;
            }
            int n14 = n3;
            if (a[n2][byArray[i2]]) {
                n14 += (a[n2][byArray[i2 - 1]] >> 1) - (a[n2][byArray[i2]] >> 1);
            }
            if (n14 < n6 && n14 + a[n2][byArray[i2]] >= n5) {
                int n15 = n14 < n5 ? n5 : n14;
                int n16 = n14 + a[n2][byArray[i2]];
                n16 = n16 > n6 ? n6 : n16;
                graphics.setClip(n15, n4, n16 - n15, e[n2]);
                graphics.drawImage(a[n2], n14 - b[n2][byArray[i2]], n4 - c[n2][byArray[i2]], 20);
            }
            if (i2 >= n13 - 1) continue;
            if (a[n2][byArray[i2]]) {
                n3 += a[n2][byArray[i2 - 1]] + d[n2];
                continue;
            }
            if ((byArray[i2 + 1] != -1 || a[n2][byArray[i2]]) && (byArray[i2 + 1] == -1 || a[n2][byArray[i2 + 1]])) continue;
            n3 += a[n2][byArray[i2]] + d[n2];
        }
        graphics.setClip(n7, n10, n11, n12);
    }

    public final byte a(int n2) {
        return this.a[n2];
    }

    public final byte[] a(int n2) {
        return this.b[n2];
    }

    public final byte[][] a(int n2) {
        return this.a[n2];
    }

    public static int c(int n2) {
        return e[n2];
    }

    public static int a(int n2, String object) {
        object = d.a(0, (String)object);
        n2 = 0;
        return d.a(0, (byte[])object, ((Object)object).length);
    }

    public final int d(int n2) {
        if (this.b[n2] == null) {
            return 0;
        }
        byte[] byArray = this.b[n2];
        n2 = this.a[n2];
        return d.a(n2, byArray, byArray.length);
    }

    public static int a(int n2, byte[] byArray) {
        return d.a(n2, byArray, byArray.length);
    }

    private static int a(int n2, byte[] byArray, int n3) {
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (byArray[i2] == -3) continue;
            if (byArray[i2] == -1) {
                n4 += c[n2] + d[n2];
                continue;
            }
            if (a[n2][byArray[i2]]) continue;
            n4 += a[n2][byArray[i2]] + d[n2];
        }
        return n4;
    }

    public static int a(int n2, byte by) {
        if (by == -1) {
            return c[n2] + d[n2];
        }
        if (by == -3 || a[n2][by]) {
            return 0;
        }
        return a[n2][by] + d[n2];
    }

    public static byte a(int n2, char c2) {
        return (byte)d[n2].indexOf(c2);
    }

    public static byte[] a(int n2, String string) {
        int n3;
        string = string.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            n3 = "\u011b\u0161\u010d\u0159\u017e\u00fd\u00e1\u00ed\u00e9\u00fa\u016f\u010f\u0165\u0148\u00e4\u00e5\u00e2\u00f6\u00e8\u00e0\u00ea\u00fc\u00fb\u00f9\u00f4\u00f3\u00f2\u00ec\u00ee\u00f1\u00b4\u2019\u2018".indexOf(string.charAt(i2));
            if (n3 == -1) {
                stringBuffer.append(string.charAt(i2));
                continue;
            }
            stringBuffer.append(a[n3][0]);
            if (a[n3].length <= 1) continue;
            stringBuffer.append(a[n3][1]);
        }
        byte[] byArray = new byte[stringBuffer.length()];
        for (n3 = 0; n3 < byArray.length; ++n3) {
            char c2 = stringBuffer.charAt(n3);
            byArray[n3] = c2 == ' ' ? -1 : (c2 == '~' ? -2 : (c2 == '^' ? -3 : (byte)d[n2].indexOf(c2)));
        }
        return byArray;
    }

    public static byte[] a(int n2, int n3) {
        n2 = (byte)d[n2].indexOf(48);
        if (n3 <= 0) {
            return new byte[]{n2};
        }
        if (n3 < 10) {
            return new byte[]{(byte)(n2 + n3)};
        }
        if (n3 < 100) {
            return new byte[]{(byte)(n2 + n3 / 10), (byte)(n2 + n3 % 10)};
        }
        if (n3 < 1000) {
            return new byte[]{(byte)(n2 + n3 / 100), (byte)(n2 + n3 / 10 % 10), (byte)(n2 + n3 % 10)};
        }
        if (n3 < 10000) {
            return new byte[]{(byte)(n2 + n3 / 1000), (byte)(n2 + n3 / 100 % 10), (byte)(n2 + n3 / 10 % 10), (byte)(n2 + n3 % 10)};
        }
        if (n3 < 100000) {
            return new byte[]{(byte)(n2 + n3 / 10000), (byte)(n2 + n3 / 1000 % 10), (byte)(n2 + n3 / 100 % 10), (byte)(n2 + n3 / 10 % 10), (byte)(n2 + n3 % 10)};
        }
        if (n3 < 1000000) {
            return new byte[]{(byte)(n2 + n3 / 100000), (byte)(n2 + n3 / 10000 % 10), (byte)(n2 + n3 / 1000 % 10), (byte)(n2 + n3 / 100 % 10), (byte)(n2 + n3 / 10 % 10), (byte)(n2 + n3 % 10)};
        }
        return null;
    }

    /*
     * Loose catch block
     */
    public final void e() {
        block18: {
            int n2;
            int n3;
            Object object;
            InputStream inputStream;
            block17: {
                int n4;
                this.b = null;
                this.a = null;
                System.gc();
                inputStream = null;
                inputStream = Main.a("/t_pointer." + a[a]);
                object = new Vector<String>();
                Closeable closeable = new ByteArrayOutputStream();
                n3 = 0;
                while ((n4 = inputStream.read()) != -1 && n4 != 0) {
                    if (n4 == 124) {
                        ((Vector)object).addElement(d.a(((ByteArrayOutputStream)closeable).toByteArray()));
                        ((ByteArrayOutputStream)closeable).reset();
                        continue;
                    }
                    ((ByteArrayOutputStream)closeable).write(n4);
                    n3 += n4;
                }
                closeable = new DataInputStream(inputStream);
                n2 = ((DataInputStream)closeable).readInt();
                if (n3 == n2) break block17;
                try {
                    inputStream.close();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
            n2 = ((Vector)object).size();
            this.b = new byte[n2][];
            this.a = new byte[n2][][];
            this.a = new byte[n2];
            boolean[] blArray = d.a(n2);
            for (n3 = 0; n3 < n2; ++n3) {
                this.a[n3] = 0;
            }
            this.a(blArray);
            int n5 = d.a();
            int n6 = ad.a - 10;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string = (String)((Vector)object).elementAt(i2);
                if (blArray[i2]) {
                    this.a[i2] = d.a(this.a[i2], d.a((int)this.a[i2], string), i2 == 207 || i2 == 208 || i2 == 209 || i2 == 210 || i2 == 211 || i2 == 212 || i2 == 213 ? n6 : n5);
                    continue;
                }
                this.b[i2] = d.a((int)this.a[i2], string);
            }
            ((Vector)object).removeAllElements();
            byte[][] byArray = this.a[28];
            byte[][] byArrayArray = new byte[byArray.length + 1][];
            object = byArrayArray;
            byArrayArray[0] = byArray[0];
            object[1] = d.a((int)this.a[28], "v" + a.getAppProperty("MIDlet-Version"));
            System.arraycopy(byArray, 1, object, 2, byArray.length - 1);
            this.a[28] = (byte[][])object;
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                return;
            }
            catch (Exception exception) {
                try {
                    inputStream.close();
                    break block18;
                }
                catch (IOException iOException) {
                    return;
                }
            }
            catch (Throwable throwable) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
                throw throwable;
            }
        }
    }

    public static int a() {
        return ad.a - 70 - 4;
    }

    private static void a(int n2, int n3) {
        try {
            int n4;
            d.a[n2] = d.a.a.a(n3);
            n3 = d[n2].length();
            d.e[n2] = a[n2].getHeight() / a[n2];
            d.b[n2] = new int[n3];
            d.c[n2] = new int[n3];
            int n5 = 0;
            int n6 = 0;
            for (n4 = 0; n4 < n3; ++n4) {
                if (n5 + a[n2][n4] > a[n2].getWidth()) {
                    n5 = 0;
                    n6 += e[n2];
                }
                d.b[n2][n4] = n5;
                d.c[n2][n4] = n6;
                n5 += a[n2][n4];
            }
            d.a[n2] = new boolean[n3];
            for (n4 = 0; n4 < n3; ++n4) {
                d.a[n2][n4] = e[n2].indexOf(d[n2].charAt(n4)) != -1;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void a(Vector vector, byte[] byArray, int n2) {
        if (n2 > 1 && byArray[n2 - 1] == -1) {
            --n2;
        }
        byte[] byArray2 = new byte[n2];
        System.arraycopy(byArray, 0, byArray2, 0, n2);
        vector.addElement(byArray2);
    }

    public static byte[] a(byte[][] byArray) {
        int n2 = 0;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            n2 += byArray[i2].length;
        }
        byte[] byArray2 = new byte[n2];
        n2 = 0;
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            System.arraycopy(byArray[i3], 0, byArray2, n2, byArray[i3].length);
            n2 += byArray[i3].length;
        }
        return byArray2;
    }

    public static byte[][] a(int n2, byte[] byArray, int n3) {
        int n4;
        Vector vector = new Vector();
        byte[] byArray2 = new byte[200];
        byte[] byArray3 = new byte[50];
        int n5 = 0;
        int n6 = 0;
        for (n4 = 0; n4 < byArray.length; ++n4) {
            int n7;
            if (byArray[n4] != -1 && byArray[n4] != -2 || n4 < byArray.length - 1 && (byArray[n4 + 1] == 42 || byArray[n4 + 1] == 43)) {
                if (d.a(n2, byArray3, n6) + d.a(n2, byArray[n4]) > n3) {
                    if (n5 > 0) {
                        d.a(vector, byArray2, n5);
                    }
                    d.a(vector, byArray3, n6);
                    n5 = 0;
                    n6 = 1;
                    byArray3[0] = byArray[n4];
                    continue;
                }
                byArray3[n6++] = byArray[n4];
                continue;
            }
            if (d.a(n2, byArray2, n5) + d.a(n2, byArray3, n6) > n3) {
                d.a(vector, byArray2, n5);
                n5 = 0;
                byArray3[n6++] = -1;
                for (n7 = 0; n7 < n6; ++n7) {
                    byArray2[n5++] = byArray3[n7];
                }
                n6 = 0;
            } else {
                if (n6 == 0 || byArray[n4] != -2) {
                    byArray3[n6++] = -1;
                }
                for (n7 = 0; n7 < n6; ++n7) {
                    byArray2[n5++] = byArray3[n7];
                }
                n6 = 0;
            }
            if (byArray[n4] != -2) continue;
            d.a(vector, byArray2, n5);
            n5 = 0;
        }
        if (d.a(n2, byArray2, n5) + d.a(n2, byArray3, n6) < n3) {
            for (n4 = 0; n4 < n6; ++n4) {
                byArray2[n5++] = byArray3[n4];
            }
            if (n5 > 0) {
                d.a(vector, byArray2, n5);
            }
        } else {
            if (n5 > 0) {
                d.a(vector, byArray2, n5);
            }
            if (n6 > 0) {
                d.a(vector, byArray3, n6);
            }
        }
        byte[][] byArrayArray = new byte[vector.size()][];
        vector.copyInto((Object[])byArrayArray);
        vector.removeAllElements();
        return byArrayArray;
    }

    private static String a(byte[] byArray) {
        try {
            return new String(byArray, "UTF-8");
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        a = new short[]{73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134};
        b = new short[]{139, 140, 141, 142, 143};
        c = new short[]{73, 74, 75, 76, 78, 79, 80, 81, 82, 83, 85, 86, 87, 88, 89, 91, 92, 104, 105, 106, 108, 109, 110, 111, 113, 114, 115, 116, 118, 119, 120, 121, 122, 124, 125, 126, 127, 129, 130, 131, 132, 134};
        d = new short[]{42, 63, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 188, 189};
        e = new short[]{46, 72, 184, 185, 186, 187, 190, 191, 192, 193};
        f = new short[]{47, 96, 194, 195, 196, 197, 198, 199, 200, 201};
        g = new short[]{42, 63, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 188, 189, 46, 72, 184, 185, 186, 187, 190, 191, 192, 193, 47, 96, 194, 195, 196, 197, 198, 199, 200, 201, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 139, 140, 141, 142, 143, 93, -111, -222};
        b = new String[]{"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "c11", "c12", "c13", "c14", "c15", "c16", "c17", "c18", "c19", "c20", "c21", "c22", "c23", "c24", "c25", "c26", "d0", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "r0", "r1", "r2", "r3", "r4", "r5", "r6", "r7", "r8", "r9", "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13", "s14", "s15", "s16", "s17", "s18", "e0", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9", "e10", "e11", "e12", "e13", "e14", "e15", "h0", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12", "h13", "h14", "h15", "pl0", "pl1", "pl2", "pl3", "pl4", "i", "train2", "ai0"};
        a = new char[][]{{'e', '\u02c7'}, {'s', '\u02c7'}, {'c', '\u02c7'}, {'r', '\u02c7'}, {'z', '\u02c7'}, {'y', '\u00b4'}, {'a', '\u00b4'}, {'i', '\u00b4'}, {'e', '\u00b4'}, {'u', '\u00b4'}, {'u', '\u00b0'}, {'d', '\u02c7'}, {'t', '\u02c7'}, {'n', '\u02c7'}, {'a', '\u00a8'}, {'a', '\u00b0'}, {'a', '\u00a7'}, {'o', '\u00a8'}, {'e', '`'}, {'a', '`'}, {'e', '\u00a7'}, {'u', '\u00a8'}, {'u', '\u00a7'}, {'u', '`'}, {'o', '\u00a7'}, {'o', '\u00b4'}, {'o', '`'}, {'i', '`'}, {'i', '\u00a7'}, {'n', '\u02dc'}, {'\''}, {'\''}, {'\''}};
        d = new String[]{"abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_\u02c7\u00a7\u00a8\u00b0\u00b4`\u02dc\u00bf\u00a1\u00df\u00e7", "013", "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_\u02c7\u00a7\u00a8\u00b0\u00b4`\u02dc\u00bf\u00a1\u00df\u00e7", "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_\u02c7\u00a7\u00a8\u00b0\u00b4`\u02dc\u00bf\u00a1\u00df\u00e7", "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_\u02c7\u00a7\u00a8\u00b0\u00b4`\u02dc\u00bf\u00a1\u00df\u00e7"};
        e = new String[]{"\u02c7\u00b4`\u00a7\u00b0\u00a8\u02dc", "", "\u02c7\u00b4`\u00a7\u00b0\u00a8\u02dc", "\u02c7\u00b4`\u00a7\u00b0\u00a8\u02dc", "\u02c7\u00b4`\u00a7\u00b0\u00a8\u02dc"};
        a = new int[]{5, 1, 5, 3};
        b = new int[]{17, 17, 17, 17, 17, 17, 17, 17, 9, 17, 17, 17, 25, 17, 17, 17, 17, 17, 17, 21, 17, 17, 25, 19, 17, 17, 17, 11, 17, 17, 17, 17, 17, 17, 17, 17, 9, 9, 9, 9, 9, 18, 9, 17, 21, 13, 13, 25, 21, 15, 17, 17, 17, 17, 17, 9, 16, 16, 17, 17, 9, 19, 17};
        a = new int[][]{b, {6, 3, 6}, b, {11, 11, 11, 11, 11, 11, 11, 11, 5, 11, 11, 11, 17, 11, 11, 11, 11, 11, 11, 13, 11, 11, 17, 11, 11, 11, 11, 7, 11, 11, 11, 11, 11, 11, 11, 11, 5, 5, 5, 5, 5, 11, 5, 11, 17, 9, 9, 15, 14, 11, 13, 11, 7, 7, 11, 7, 8, 7, 9, 11, 5, 13, 11}};
        c = new int[]{17, 6, 17, 11};
        d = new int[]{-1, 1, -1, 0};
    }
}

