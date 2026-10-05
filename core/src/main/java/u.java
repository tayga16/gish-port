/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.ServiceRecord
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.bluetooth.ServiceRecord;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class u {
    private Main a;
    private ar a;
    private ad a;
    private d a;
    public byte a;
    public byte b;
    private int i = 10;
    private Vector a;
    private int j;
    public int a;
    private int k;
    private short[] a;
    private short[] b;
    private byte[] a;
    public int b;
    public int c;
    public int d;
    private byte[] b;
    private boolean a;
    private byte[][] a;
    private boolean b;
    private boolean c;
    private boolean d;
    private Image a;
    private Image b;
    private Image c;
    private boolean e;
    private boolean f;
    public int e;
    public int f;
    public int g;
    public int h;
    private int l = 0;
    private String[] a;
    private byte[] c;
    public byte c;
    private boolean g;
    private long a;
    private int m;
    private p a;
    private static short[][] a = new short[][]{{11, 24, 62, 9, 7, 27, 2}, {10, 3, 9, 7, 27, 29}, {32, 204, 33, 103, 65, 68, 69, 16, 15}, null, {19, 18}, null, {25, 26, 94, 145}, {205, 25, 26, 94, 145}, {10, 3, 48, 9, 7, 27, 29}, {25, 43, 44, 45, 151, 94}, {205, 25, 43, 44, 45, 151, 94}, null, null, null, {10, 9, 7, 27, 29}, null, null, null, null};
    private static final short[][][] a = new short[][][]{null, null, new short[][]{{-1, 0, 10}, {-1, 0, 10}, {5, 6}, {5, 6}, {67, 70, 66}, {67, 70, 66, 71}, {5, 6}, null, null, null}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /*
     * WARNING - void declaration
     */
    private void a(byte by, boolean bl, int n2, int n3) {
        boolean bl2;
        void var4_7;
        void var5_8 = var4_7;
        var4_7 = bl2;
        bl2 = bl;
        byte by2 = by;
        u u2 = this;
        this.b = 0;
        u2.j = by2;
        u2.a = 0;
        u2.b = bl2;
        u2.a = false;
        if (a[u2.j] != null) {
            u2.b = new byte[a[u2.j].length];
            u2.d = d.c(u2.a.a(a[u2.j][0]));
        } else {
            u2.d = d.c(0);
        }
        u2.d -= 2;
        u2.c = 0;
        u2.b = var5_8 / u2.d;
        u2.k = var4_7;
        int n4 = u2.a();
        u2.a = new byte[n4];
        u2.a = new short[n4];
        u2.b = new short[n4];
        switch (this.j) {
            case 2: {
                this.b[0] = !Main.i ? (byte)0 : (byte)Main.e;
                this.b[1] = !Main.j ? (byte)0 : (byte)Main.f;
                this.b[2] = (byte)(!this.a.g ? 1 : 0);
                this.b[3] = (byte)(!this.a.a.b ? 1 : 0);
                this.b[4] = (byte)this.a.a.g;
                this.b[5] = (byte)this.a.d;
                this.b[6] = (byte)(!this.a.a.c ? 1 : 0);
            }
        }
        this.j();
    }

    private void c(int n2) {
        this.a = true;
        switch (this.j) {
            case 2: {
                if (n2 == 0) {
                    Main.i = true;
                    Main.e = this.b[n2];
                    if (Main.e > 0) {
                        this.a.c(12);
                        this.a.a(2, false);
                    }
                }
                if (n2 == 1) {
                    Main.j = true;
                    Main.f = this.b[n2];
                    if (Main.f == 0) {
                        this.a.c(12);
                    } else {
                        this.a.b(12);
                        this.a.a(12, true);
                    }
                }
                if (n2 != 2 || !(this.a.g = this.b[n2] == 0)) break;
                this.a.a(70);
            }
        }
    }

    private void g() {
        if (!this.a) {
            return;
        }
        switch (this.j) {
            case 2: {
                Main.e = this.b[0];
                Main.f = this.b[1];
                this.a.g = this.b[2] == 0;
                this.a.a.b = this.b[3] == 0;
                this.a.a.g = this.b[4];
                this.a.d = this.b[5];
                this.a.a.c = this.b[6] == 0;
                this.a.a();
                this.a.a = true;
                this.a.m();
                this.m();
                this.a.a = false;
            }
        }
    }

    private void h() {
        if (!this.a.a(12)) {
            this.a.a(3, false);
        }
        block5 : switch (this.a) {
            case 0: {
                switch (a[this.j][this.a]) {
                    case 11: {
                        this.k();
                        this.a((byte)5);
                        break block5;
                    }
                    case 24: {
                        this.k();
                        this.a((byte)6);
                        break block5;
                    }
                    case 62: {
                        this.k();
                        if (Main.a("score")) {
                            this.a((byte)28);
                            break block5;
                        }
                        this.a((byte)32);
                        break block5;
                    }
                    case 9: {
                        this.k();
                        this.a((byte)3);
                        break block5;
                    }
                    case 7: {
                        this.k();
                        this.a((byte)2);
                        break block5;
                    }
                    case 27: {
                        this.k();
                        this.a((byte)12);
                        break block5;
                    }
                    case 2: {
                        this.k();
                        this.a((byte)49);
                    }
                }
                return;
            }
            case 1: {
                switch (a[this.j][this.a]) {
                    case 10: {
                        this.i();
                        break block5;
                    }
                    case 3: {
                        this.k();
                        if (this.a.e == 4 || this.a.e == 5) {
                            this.a((byte)48);
                            break block5;
                        }
                        this.a((byte)13);
                        break block5;
                    }
                    case 48: {
                        this.k();
                        this.a((byte)24);
                        break block5;
                    }
                    case 9: {
                        this.k();
                        this.a((byte)15);
                        break block5;
                    }
                    case 7: {
                        this.k();
                        this.a((byte)18);
                        break block5;
                    }
                    case 27: {
                        this.k();
                        this.a((byte)19);
                        break block5;
                    }
                    case 29: {
                        this.k();
                        this.a((byte)14);
                    }
                }
                return;
            }
            case 49: {
                this.a.f = true;
                return;
            }
            case 3: 
            case 15: {
                switch (a[this.j][this.a]) {
                    case 15: {
                        this.g();
                        this.a.b = this.a.a;
                        x x2 = this.a.b.a();
                        this.a.b = this.a.a;
                        this.c = this.a;
                        this.k();
                        try {
                            x x3 = x2;
                            if (x3.a == 0) {
                                ((m)x2).a();
                            }
                        }
                        catch (Exception exception) {}
                        this.e();
                        break block5;
                    }
                    case 16: {
                        this.g();
                        this.k();
                        this.a(this.a == 15 ? (byte)43 : 41);
                    }
                }
                return;
            }
            case 4: {
                this.a.b = d.a[this.a];
                this.l();
                this.a.removeAllElements();
                this.a.a((byte)1, (byte)1);
                return;
            }
            case 6: {
                switch (a[this.j][this.a]) {
                    case 19: {
                        this.k();
                        this.a((byte)9);
                        at at2 = this.a.a;
                        at2.a();
                        at2.a = 0;
                        at2.b = 0;
                        new Thread(at2).start();
                        break block5;
                    }
                    case 18: {
                        this.k();
                        this.a((byte)8);
                        at at3 = this.a.a;
                        at3.a();
                        at3.a = 1;
                        at3.b = 1;
                        new Thread(at3).start();
                    }
                }
                return;
            }
            case 7: {
                this.a.a = true;
                this.a.m();
                int n2 = this.a;
                at at4 = this.a.a;
                this.a.a.a = n2;
                at4.b = (byte)2;
                new Thread(at4).start();
                return;
            }
            case 17: {
                switch (a[this.j][this.a]) {
                    case 205: {
                        try {
                            this.a.a("msave");
                            this.a.b = this.a.a.readInt();
                            this.a.h = this.a.a.readInt();
                            this.a.i = this.a.a.readInt();
                            this.a.j = this.a.a.readInt();
                            this.a.a(false);
                        }
                        catch (Exception exception) {}
                        this.b((byte)2);
                        break block5;
                    }
                    case 25: {
                        this.k();
                        if (!Main.a("msave")) {
                            this.a = (byte)23;
                            this.h();
                            break block5;
                        }
                        this.a((byte)23);
                        break block5;
                    }
                    case 43: {
                        this.k();
                        this.a((byte)20);
                        break block5;
                    }
                    case 44: {
                        this.k();
                        this.a((byte)21);
                        break block5;
                    }
                    case 45: {
                        this.k();
                        this.a((byte)22);
                        break block5;
                    }
                    case 151: {
                        this.k();
                        this.a((byte)47);
                        break block5;
                    }
                    case 94: {
                        this.k();
                        this.a((byte)45);
                    }
                }
                return;
            }
            case 45: {
                this.a.b = d.b[this.a];
                this.b((byte)3);
                return;
            }
            case 47: {
                this.a.b = d.c[this.a];
                this.b((byte)3);
                return;
            }
            case 20: {
                this.a.b = d.d[this.a];
                this.b((byte)3);
                return;
            }
            case 21: {
                this.a.b = d.e[this.a];
                this.b((byte)4);
                return;
            }
            case 22: {
                this.a.b = d.f[this.a];
                this.b((byte)5);
                return;
            }
            case 23: {
                this.a.c("msave");
                this.a.b = d.d[0];
                this.a.h = 0;
                this.a.i = 0;
                this.a.j = 0;
                this.b((byte)2);
                return;
            }
            case 24: {
                this.a((byte)17);
                return;
            }
            case 5: {
                switch (a[this.j][this.a]) {
                    case 205: {
                        try {
                            this.a.a("save");
                            this.a.b = this.a.a.readInt();
                            this.a.h = this.a.a.readInt();
                            this.a.i = this.a.a.readInt();
                            this.a.j = this.a.a.readInt();
                            this.a.a(false);
                        }
                        catch (Exception exception) {}
                        this.a.a((byte)1, (byte)0);
                        break block5;
                    }
                    case 25: {
                        this.k();
                        if (!Main.a("save")) {
                            this.a = (byte)16;
                            this.h();
                            break block5;
                        }
                        this.a((byte)16);
                        break block5;
                    }
                    case 26: {
                        this.k();
                        this.a((byte)4);
                        break block5;
                    }
                    case 94: {
                        this.k();
                        this.a((byte)44);
                        break block5;
                    }
                    case 145: {
                        this.k();
                        this.a((byte)46);
                    }
                }
                return;
            }
            case 44: {
                this.a.b = d.b[this.a];
                this.l();
                this.a.removeAllElements();
                this.a.a((byte)1, (byte)1);
                return;
            }
            case 13: {
                if (this.a.b == 2 || this.a.b == 4) {
                    this.a.a = 1;
                }
                this.l();
                this.a.a = 0;
                this.a.d = (byte)2;
                return;
            }
            case 14: 
            case 25: {
                if (this.a.b == 2 || this.a.b == 4) {
                    this.a.a.b();
                }
                this.a.d();
                this.a((byte)0);
                return;
            }
            case 16: {
                this.a.c("save");
                this.a.b = 93;
                this.a.h = 0;
                this.a.i = 0;
                this.a.j = 0;
                this.l();
                this.a.removeAllElements();
                this.a.a((byte)1, (byte)0);
                return;
            }
            case 26: {
                if (this.a.a.length() == 0) break;
                this.a.a = true;
                this.a.m();
                boolean bl = false;
                try {
                    int n3;
                    String[] stringArray = new String[]{"", "", "", ""};
                    int[] nArray = new int[]{0, 0, 0, 0};
                    int[] nArray2 = new int[]{3540000, 3540000, 3540000, 3540000};
                    int[] nArray3 = new int[]{0, 0, 0, 0};
                    if (Main.a("score")) {
                        this.a.a("score");
                        for (n3 = 0; n3 < 4; ++n3) {
                            stringArray[n3] = this.a.a.readUTF();
                            nArray[n3] = this.a.a.readInt();
                            nArray2[n3] = this.a.a.readInt();
                            nArray3[n3] = this.a.a.readInt();
                        }
                        this.a.a(false);
                    }
                    n3 = 0;
                    if (this.a.b != 1) {
                        n3 = 2;
                    }
                    if (this.a.h > nArray[n3 + 0]) {
                        bl = true;
                        stringArray[n3 + 0] = this.a.a.toString();
                        nArray[n3 + 0] = this.a.h;
                        nArray2[n3 + 0] = this.a.i;
                        nArray3[n3 + 0] = this.a.j;
                    }
                    if (this.a.i < nArray2[n3 + 1]) {
                        bl = true;
                        stringArray[n3 + 1] = this.a.a.toString();
                        nArray[n3 + 1] = this.a.h;
                        nArray2[n3 + 1] = this.a.i;
                        nArray3[n3 + 1] = this.a.j;
                    }
                    this.a.b("score");
                    for (int i2 = 0; i2 < 4; ++i2) {
                        this.a.a.writeUTF(stringArray[i2]);
                        this.a.a.writeInt(nArray[i2]);
                        this.a.a.writeInt(nArray2[i2]);
                        this.a.a.writeInt(nArray3[i2]);
                    }
                    this.a.a(true);
                }
                catch (Exception exception) {}
                this.a.a = false;
                this.a.removeAllElements();
                this.a(bl ? (byte)30 : 31);
                return;
            }
            case 27: {
                this.a((byte)33);
                try {
                    int n4;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Object object = new DataOutputStream(byteArrayOutputStream);
                    int n5 = 0;
                    int n6 = 0;
                    this.a.a("score");
                    ((FilterOutputStream)object).write((System.getProperty("microedition.platform") + "\n").getBytes());
                    for (int i3 = 0; i3 < 4; ++i3) {
                        int n7;
                        String string = this.a.a.readUTF();
                        String string2 = string + "\n";
                        for (n7 = 0; n7 < string2.length(); ++n7) {
                            n6 += string2.charAt(n7);
                        }
                        ((FilterOutputStream)object).write(string2.getBytes());
                        n7 = this.a.a.readInt();
                        n6 += n7;
                        n4 = this.a.a.readInt();
                        int n8 = this.a(n5);
                        n5 = n8;
                        n5 = this.a(n5);
                        ((DataOutputStream)object).writeInt((n7 + this.c[n8]) * this.c[n5]);
                        n7 = this.a.a.readInt();
                        int n9 = this.a(n5);
                        n5 = n9;
                        n5 = this.a(n5);
                        ((DataOutputStream)object).writeInt((n4 - this.c[n9]) * this.c[n5]);
                        int n10 = this.a(n5);
                        n5 = n10;
                        n5 = this.a(n5);
                        ((DataOutputStream)object).writeInt((n7 + this.c[n10]) * this.c[n5]);
                        n6 += n4 / 1000;
                        n6 += n7;
                    }
                    int n11 = this.a(n5);
                    n5 = n11;
                    int n12 = this.a(n5);
                    n5 = n12;
                    int n13 = this.a(n5);
                    n5 = n13;
                    n5 = this.a(n5);
                    ((DataOutputStream)object).writeInt((int)((long)n6 * (long)this.c[n11] % (long)(this.c[n12] * this.c[n13] * this.c[n5] * this.c[this.a(n5)])));
                    ((DataOutputStream)object).writeByte(1);
                    this.a.a(false);
                    if (this.a == null) {
                        this.a = new p(this.a);
                    }
                    n4 = 0;
                    object = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream = null;
                    Runnable runnable = this.a;
                    this.a.a = (byte[])object;
                    ((p)runnable).a = null;
                    ((p)runnable).a = 0;
                    runnable = new Thread(runnable);
                    ((Thread)runnable).setPriority(10);
                    ((Thread)runnable).start();
                }
                catch (Exception exception) {}
                System.gc();
                return;
            }
            case 28: {
                this.a((byte)27);
                return;
            }
            case 39: {
                x x4;
                this.a.b = this.a.a;
                x x5 = x4 = this.a.b.a();
                if (x4.a == 0) {
                    ((m)x4).a();
                }
                this.e();
                return;
            }
            case 37: {
                h h2;
                h h3 = h2 = (h)this.a.b.a();
                if (h2.a[this.a].compareTo(j.a().a(4)) == 0) {
                    this.g = true;
                }
                h2.a(this.a);
                this.e();
                return;
            }
            case 41: 
            case 42: 
            case 43: {
                this.a.a = true;
                this.a.m();
                d.a = this.a;
                if (this.a.a != null) {
                    this.a.b.b();
                    this.a.b.c();
                }
                this.a.e();
                j.a("/tz." + d.a[d.a]);
                j.b("UTF-8");
                j.a().a();
                this.a.a = false;
                if (this.a == 41) {
                    this.a((byte)3);
                    this.c();
                    this.a = true;
                    return;
                }
                if (this.a == 43) {
                    this.a((byte)15);
                    this.c();
                    this.a = true;
                    return;
                }
                this.a();
                return;
            }
            case 40: {
                Main.h = true;
                Main.i = true;
                if (Main.e == 0) {
                    Main.e = 5;
                }
                this.a((byte)50);
                return;
            }
            case 50: {
                Main.j = true;
                if (Main.f == 0) {
                    Main.f = 3;
                }
                this.a((byte)0);
            }
        }
    }

    public final void a() {
        this.a.b = 1;
        this.c = 0;
        if (Main.e) {
            this.c = (byte)40;
        } else {
            Main.h = true;
        }
        this.a.b = this.a.a;
        if (this.a.b.c()) {
            x x2;
            x x3 = x2 = this.a.b.a();
            if (x2.a == 0) {
                ((m)x2).b();
            }
            this.e();
            return;
        }
        if (Main.e) {
            this.a((byte)39);
            return;
        }
        if (Main.e) {
            this.a((byte)40);
            return;
        }
        Main.h = true;
        this.a((byte)0);
    }

    private int a(int n2) {
        if (++n2 == this.c.length) {
            n2 = 0;
        }
        return n2;
    }

    private void i() {
        switch (this.a) {
            case 1: {
                this.k();
                this.l();
                this.a.a.c();
                this.a.a = 0;
                this.a.c(12);
                return;
            }
            case 4: 
            case 16: 
            case 44: 
            case 46: {
                this.a((byte)5);
                this.c();
                return;
            }
            case 3: {
                this.g();
            }
            case 2: 
            case 5: 
            case 6: 
            case 12: 
            case 49: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 15: {
                this.g();
                this.a.c(12);
            }
            case 13: 
            case 14: 
            case 18: 
            case 19: 
            case 24: 
            case 48: {
                this.a((byte)1);
                this.c();
                return;
            }
            case 7: {
                this.a((byte)6);
                this.c();
                return;
            }
            case 9: {
                at at2 = this.a.a;
                if (at2.a == 0) {
                    try {
                        at2.a.setDiscoverable(0);
                    }
                    catch (Exception exception) {}
                }
                this.a.a.b();
            }
            case 10: 
            case 11: {
                this.a((byte)6);
                this.c();
                return;
            }
            case 17: {
                this.k();
                this.a((byte)25);
                return;
            }
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 25: 
            case 45: 
            case 47: {
                this.a((byte)17);
                this.c();
                return;
            }
            case 27: {
                this.a((byte)28);
                return;
            }
            case 28: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 29: {
                this.a((byte)17);
                return;
            }
            case 30: {
                this.a(this.a.b != 1 ? (byte)29 : 28);
                return;
            }
            case 31: {
                this.a(this.a.b != 1 ? (byte)17 : 0);
                return;
            }
            case 32: {
                this.a((byte)0);
                this.c();
                return;
            }
            case 33: 
            case 34: 
            case 35: {
                this.a((byte)28);
                return;
            }
            case 39: {
                this.a(this.c);
                return;
            }
            case 36: {
                ((i)this.a.b.a()).a();
                this.e();
                return;
            }
            case 37: {
                ((h)this.a.b.a()).a();
                this.e();
                return;
            }
            case 38: {
                ((l)this.a.b.a()).a();
                this.e();
                return;
            }
            case 41: {
                this.a((byte)3);
                this.c();
                return;
            }
            case 43: {
                this.a((byte)15);
                this.c();
                return;
            }
            case 40: {
                Main.h = true;
                Main.i = false;
                Main.e = 0;
                this.a((byte)50);
                return;
            }
            case 50: {
                Main.j = false;
                Main.f = 0;
                this.a((byte)0);
            }
        }
    }

    public final void b() {
        if (this.a == null) {
            this.a = this.a.a(1);
            this.b = this.a.a(0);
        }
    }

    public final void a(byte n2) {
        try {
            this.a.a = false;
            this.l();
            this.d();
            int n3 = this.e - 2;
            int n4 = this.f;
            this.a = n2;
            switch (this.a) {
                case 0: {
                    if (Main.e) {
                        this.m();
                        Main.e = false;
                    }
                    this.a((byte)0, false, n3, n4);
                    if (!this.a.a) {
                        this.a.a(12, true);
                    }
                    Main.k = true;
                    break;
                }
                case 1: {
                    this.a((byte)(this.a.b == 1 ? 1 : (this.a.b == 2 ? 8 : 14)), true, n3, n4);
                    break;
                }
                case 2: 
                case 18: {
                    byte[][] byArray = this.a.a(this.a.a.a() ? 206 : 8);
                    byte[][] byArray2 = this.a.a(154);
                    byte[][] byArrayArray = new byte[byArray.length + byArray2.length][];
                    System.arraycopy(byArray, 0, byArrayArray, 0, byArray.length);
                    System.arraycopy(byArray2, 0, byArrayArray, byArray.length, byArray2.length);
                    this.a(byArrayArray, false, true);
                    break;
                }
                case 49: {
                    this.a(202, true, true);
                    break;
                }
                case 3: 
                case 15: {
                    this.a((byte)2, true, n3, n4);
                    break;
                }
                case 4: {
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    int n5 = this.a.a.readInt();
                    n2 = n5;
                    if (n5 == 0) {
                        this.a.a(false);
                        this.a.a = false;
                        this.a(138, false, true);
                        break;
                    }
                    byte[][] byArrayArray = new byte[6][];
                    byte[][] byArrayArray2 = byArrayArray;
                    byArrayArray[1] = d.a(0, " (");
                    byArrayArray2[3] = new byte[]{d.a(0, '/')};
                    byArrayArray2[5] = new byte[]{d.a(0, ')')};
                    this.a.a.readInt();
                    this.a.a.readInt();
                    this.a = new byte[n2][];
                    for (int i2 = 0; i2 < this.a.length; ++i2) {
                        int n6 = 0;
                        for (n2 = 0; n2 < Main.a[i2]; ++n2) {
                            if (!this.a.a.readBoolean()) continue;
                            ++n6;
                        }
                        if (Main.a[i2] == 0) {
                            this.a[i2] = this.a.a(d.a[i2]);
                            continue;
                        }
                        byArrayArray2[0] = this.a.a(d.a[i2]);
                        byArrayArray2[2] = d.a(0, n6);
                        byArrayArray2[4] = d.a(0, Main.a[i2]);
                        this.a[i2] = d.a(byArrayArray2);
                    }
                    this.a.a(false);
                    this.a.a = false;
                    this.a((byte)3, true, n3, n4);
                    break;
                }
                case 44: 
                case 45: {
                    int n7;
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    this.a.a.readInt();
                    this.a.a.readInt();
                    n2 = this.a.a.readInt();
                    this.a.a(false);
                    this.a.a = false;
                    int n8 = 0;
                    for (n7 = 0; n7 < Main.b.length; ++n7) {
                        if (n2 < Main.b[n7]) continue;
                        n8 = n7 + 1;
                    }
                    if (n8 == 0) {
                        this.a(144, false, true);
                        break;
                    }
                    this.a = new byte[n8][];
                    for (n7 = 0; n7 < n8; ++n7) {
                        this.a[n7] = this.a.a(d.b[n7]);
                    }
                    this.a((byte)17, true, n3, n4);
                    break;
                }
                case 46: {
                    int n9;
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    this.a.a.readInt();
                    this.a.a.readInt();
                    this.a.a.readInt();
                    for (n2 = 0; n2 < Main.a.length; n2 = (int)(n2 + 1)) {
                        for (n9 = 0; n9 < Main.a[n2]; ++n9) {
                            this.a.a.readBoolean();
                        }
                    }
                    byte[][] byArrayArray = new byte[Main.a.length][];
                    n9 = 0;
                    for (int i3 = 0; i3 < Main.a.length; ++i3) {
                        boolean bl = this.a.a.readBoolean();
                        if (!bl) continue;
                        byArrayArray[n9++] = d.a(3, Main.e[i3]);
                    }
                    this.a.a(false);
                    this.a.a = false;
                    if (n9 == 0) {
                        this.a(153, false, true);
                        break;
                    }
                    byte[][] byArray = this.a.a(146);
                    byte[][] byArrayArray3 = new byte[byArray.length + n9][];
                    System.arraycopy(byArray, 0, byArrayArray3, 0, byArray.length);
                    System.arraycopy(byArrayArray, 0, byArrayArray3, byArray.length, n9);
                    this.a(byArrayArray3, false, true);
                    break;
                }
                case 5: {
                    this.a(Main.a("save") ? (byte)7 : 6, true, n3, n4);
                    break;
                }
                case 6: {
                    this.a((byte)4, true, n3, n4);
                    break;
                }
                case 7: {
                    this.a = new byte[this.a.length][];
                    for (n2 = 0; n2 < this.a.length; n2 = (int)(n2 + 1)) {
                        this.a[n2] = d.a(0, this.a[n2]);
                    }
                    this.a((byte)5, true, n3, n4);
                    break;
                }
                case 8: {
                    this.a(20, false, false);
                    break;
                }
                case 9: {
                    this.a(21, false, true);
                    break;
                }
                case 10: {
                    this.a(22, false, true);
                    break;
                }
                case 48: {
                    this.a(160, false, true);
                    break;
                }
                case 11: {
                    this.a(23, false, true);
                    break;
                }
                case 17: {
                    this.a(Main.a("msave") ? (byte)10 : 9, true, n3, n4);
                    break;
                }
                case 47: {
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    n2 = this.a.a.readInt();
                    this.a.a(false);
                    this.a.a = false;
                    if (n2 == 0) {
                        this.a(138, false, true);
                        break;
                    }
                    byte[][] byArrayArray = new byte[n2][];
                    int n10 = 0;
                    for (int i4 = 0; i4 < n2; ++i4) {
                        if (d.a(d.c, (int)d.a[i4]) == -1) continue;
                        byArrayArray[n10++] = this.a.a(d.a[i4]);
                    }
                    this.a = new byte[n10][];
                    System.arraycopy(byArrayArray, 0, this.a, 0, n10);
                    this.a((byte)18, true, n3, n4);
                    break;
                }
                case 20: {
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    this.a.a.readInt();
                    n2 = this.a.a.readInt();
                    this.a.a(false);
                    this.a.a = false;
                    if (n2 == 0) {
                        this.a(152, false, true);
                        break;
                    }
                    this.a = new byte[n2][];
                    for (int i5 = 0; i5 < n2; ++i5) {
                        this.a[i5] = this.a.a(d.d[i5]);
                    }
                    this.a((byte)13, true, n3, n4);
                    break;
                }
                case 21: {
                    int n11;
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    this.a.a.readInt();
                    this.a.a.readInt();
                    n2 = this.a.a.readInt();
                    this.a.a(false);
                    this.a.a = false;
                    int n12 = 0;
                    for (n11 = 0; n11 < Main.c.length; ++n11) {
                        if (n2 < Main.c[n11]) continue;
                        n12 = n11 + 1;
                    }
                    this.a = new byte[n12 += 5][];
                    for (n11 = 0; n11 < n12; ++n11) {
                        this.a[n11] = this.a.a(d.e[n11]);
                    }
                    this.a((byte)11, true, n3, n4);
                    break;
                }
                case 22: {
                    int n13;
                    this.a.a = true;
                    this.a.m();
                    this.a.a("achi");
                    this.a.a.readInt();
                    this.a.a.readInt();
                    n2 = this.a.a.readInt();
                    this.a.a(false);
                    this.a.a = false;
                    int n14 = 0;
                    for (n13 = 0; n13 < Main.d.length; ++n13) {
                        if (n2 < Main.d[n13]) continue;
                        n14 = n13 + 1;
                    }
                    this.a = new byte[n14 += 5][];
                    for (n13 = 0; n13 < n14; ++n13) {
                        this.a[n13] = this.a.a(d.f[n13]);
                    }
                    this.a((byte)12, true, n3, n4);
                    break;
                }
                case 23: {
                    this.a(31, true, true);
                    break;
                }
                case 24: {
                    this.a(30, true, true);
                    break;
                }
                case 25: {
                    this.a(49, true, true);
                    break;
                }
                case 12: 
                case 19: {
                    this.a(28, false, true);
                    break;
                }
                case 13: 
                case 14: {
                    this.a(30, true, true);
                    break;
                }
                case 16: {
                    this.a(31, true, true);
                    break;
                }
                case 26: {
                    this.b = (byte)2;
                    this.a.a((short)58, "", 11);
                    break;
                }
                case 27: {
                    this.a(55, true, true);
                    break;
                }
                case 30: {
                    this.a(61, false, true);
                    break;
                }
                case 31: {
                    this.a(60, false, true);
                    break;
                }
                case 32: {
                    this.a(64, false, true);
                    break;
                }
                case 33: {
                    this.a(56, false, true);
                    break;
                }
                case 34: {
                    this.a(22, false, true);
                    break;
                }
                case 35: {
                    this.a = null;
                    this.a(57, false, true);
                    break;
                }
                case 28: 
                case 29: {
                    this.a.a = true;
                    this.a.m();
                    byte[][] byArray = this.a();
                    this.a.a = false;
                    this.a(byArray, this.a == 28, true);
                    break;
                }
                case 39: {
                    this.a(14, true, true);
                    break;
                }
                case 36: {
                    i i6 = (i)this.a.b.a();
                    byte by = this.a.a(28);
                    i i7 = i6;
                    this.a(d.a(by, d.a((int)by, i7.a), d.a()), false, true);
                    break;
                }
                case 37: {
                    h h2;
                    h h3 = h2 = (h)this.a.b.a();
                    String[] stringArray = h2.a;
                    this.a = new byte[stringArray.length][];
                    for (int i8 = 0; i8 < stringArray.length; ++i8) {
                        this.a[i8] = d.a(0, stringArray[i8]);
                    }
                    this.a((byte)15, true, n3, n4);
                    break;
                }
                case 38: {
                    l l2 = (l)this.a.b.a();
                    byte by = this.a.a(28);
                    l l3 = l2;
                    this.a(d.a(by, d.a((int)by, l3.a), d.a()), false, l2.a());
                    break;
                }
                case 42: {
                    this.a = d.a;
                    this.a((byte)16, false, n3, n4);
                    break;
                }
                case 41: 
                case 43: {
                    this.a = d.a;
                    this.a((byte)16, true, n3, n4);
                    this.a = d.a;
                    break;
                }
                case 40: {
                    this.a(17, true, true);
                    break;
                }
                case 50: {
                    this.a(203, true, true);
                }
            }
            u u2 = this;
            n3 = u2.f;
            n4 = u2.e;
            if (u2.b == 1) {
                n3 = u2.a.a.length * (d.c(u2.a.a(8)) + 1);
            } else if (u2.b == 0) {
                int n15 = u2.a();
                n3 = n15 < u2.b ? n15 : u2.b;
                n3 = n3 * u2.d;
                n4 = 0;
                for (int i9 = 0; i9 < n15; ++i9) {
                    int n16 = u2.a(u2.j, i9);
                    if (n16 <= n4) continue;
                    n4 = n16;
                }
            } else if (u2.b == 2) {
                n3 = 2 * (d.c(0) + 1);
            }
            int n17 = u2.e - n4;
            if (n17 > 0) {
                u2.g += n17 >> 1;
                u2.e -= n17;
            }
            if ((n17 = u2.f - n3) > 0) {
                u2.h += n17 >> 1;
                u2.f -= n17;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private byte[][] a() {
        Object object = null;
        this.a.a("score");
        object = d.a(3, "^");
        byte[] byArray = d.a(3, "~");
        byte[] byArray2 = d.a(3, " ");
        String[] stringArray = new String[4];
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        try {
            for (int i2 = 0; i2 < 4; ++i2) {
                stringArray[i2] = this.a.a.readUTF();
                nArray[i2] = this.a.a.readInt();
                nArray2[i2] = this.a.a.readInt();
                this.a.a.readInt();
            }
        }
        catch (Exception exception) {}
        byte[][] byArrayArray = new byte[][]{object, this.a.a(11), byArray, this.a.a(59), d.a(3, stringArray[0]), byArray, this.a.a(36), byArray2, d.a(3, nArray[0]), byArray, this.a.a(37), byArray2, ac.a(nArray2[0]), byArray, byArray, this.a.a(59), d.a(3, stringArray[1]), byArray, this.a.a(36), byArray2, d.a(3, nArray[1]), byArray, this.a.a(37), byArray2, ac.a(nArray2[1]), byArray, byArray, object, this.a.a(24), byArray, this.a.a(59), d.a(3, stringArray[2]), byArray, this.a.a(36), byArray2, d.a(3, nArray[2]), byArray, this.a.a(37), byArray2, ac.a(nArray2[2]), byArray, byArray, this.a.a(59), d.a(3, stringArray[3]), byArray, this.a.a(36), byArray2, d.a(3, nArray[3]), byArray, this.a.a(37), byArray2, ac.a(nArray2[3])};
        this.a.a(false);
        object = d.a(3, d.a(byArrayArray), ad.a - 10);
        System.gc();
        return object;
    }

    private void b(byte by) {
        this.a.a = true;
        this.a.m();
        if (this.a.a != null) {
            this.a.a = true;
            this.a.a.a(new byte[]{2});
            this.a.d();
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.a.b);
            dataOutputStream.writeByte(by);
        }
        catch (IOException iOException) {
            this.a((byte)10);
            this.a.a = false;
            return;
        }
        if (!this.a.a.a(byteArrayOutputStream.toByteArray())) {
            this.a((byte)10);
        } else {
            try {
                this.l();
                this.a.removeAllElements();
                this.a.e[1] = 0;
                this.a.e[0] = 0;
                this.a.a((byte)2, by);
            }
            catch (RuntimeException runtimeException) {
                this.a.a.b();
                this.a((byte)10);
            }
        }
        this.a.a = false;
    }

    public final void a(boolean bl) {
        String[] stringArray;
        if (bl) {
            this.a((byte)10);
            return;
        }
        at at2 = this.a.a;
        if (at2.a == null) {
            stringArray = new String[]{};
        } else {
            int n2 = at2.a.size();
            String[] stringArray2 = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                ServiceRecord serviceRecord = (ServiceRecord)at2.a.elementAt(i2);
                serviceRecord = serviceRecord.getAttributeValue(256);
                stringArray2[i2] = (String)serviceRecord.getValue();
            }
            stringArray = this.a = stringArray2;
        }
        if (this.a.length == 0) {
            this.a((byte)11);
            return;
        }
        this.a((byte)7);
    }

    public final void b(boolean bl) {
        if (bl) {
            this.a((byte)10);
        }
    }

    public final void c(boolean bl) {
        if (bl) {
            this.a((byte)10);
            return;
        }
        while (!this.a.a.a()) {
            try {
                this.a();
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {}
        }
        if (this.a.a.a) {
            this.a((byte)6);
            return;
        }
        InputStream inputStream = this.a.a.a();
        if (inputStream == null) {
            this.a((byte)10);
            return;
        }
        try {
            inputStream = new DataInputStream(inputStream);
            this.a.b = ((DataInputStream)inputStream).readShort();
            byte by = ((DataInputStream)inputStream).readByte();
            this.l();
            this.a.removeAllElements();
            this.a.e[1] = 0;
            this.a.e[0] = 0;
            this.a.a((byte)4, by);
            return;
        }
        catch (Exception exception) {
            this.a.a.b();
            this.a((byte)10);
            return;
        }
    }

    public final void d(boolean bl) {
        if (bl) {
            this.a.a = false;
            this.a((byte)10);
            return;
        }
        this.a((byte)17);
    }

    private void a(int n2, boolean bl, boolean bl2) {
        this.b = 1;
        this.c = bl;
        this.d = bl2;
        this.a.a(this.a.a(n2), 3, 3, -11579569, this.f);
        this.a.repaint();
    }

    private void a(byte[][] byArray, boolean bl, boolean bl2) {
        this.b = 1;
        this.c = bl;
        this.d = bl2;
        this.a.a(byArray, 3, 3, -11579569, this.f);
        this.a.repaint();
    }

    public final int a() {
        if (a[this.j] != null) {
            return a[this.j].length;
        }
        return this.a.length;
    }

    private int a(int n2, int n3) {
        int n4 = 0;
        if (a[n2] != null) {
            n4 = this.a.d(a[n2][n3]);
            byte by = this.a.a(a[n2][n3]);
            if (a[n2] != null && a[n2][n3] != null) {
                n4 = a[n2][n3][0] < 0 ? (n4 += d.a((int)by, d.a((int)by, String.valueOf(this.b[n3])))) : (n4 += d.a((int)by, this.a.a(a[n2][n3][this.b[n3]])));
            }
        } else {
            n4 = d.a(0, this.a[n3]);
        }
        return n4;
    }

    private void j() {
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.a(this.j, i2);
            this.a[i2] = n3 > this.k ? (byte)1 : 0;
            this.b[i2] = (short)(n3 - this.k);
        }
    }

    public final void c() {
        int n2 = this.a.size();
        if (n2 > 0) {
            this.a = ((int[])this.a.elementAt(n2 - 1))[0];
            this.a.removeElementAt(n2 - 1);
            if (this.a < 0) {
                this.a = 0;
            }
            if (this.a > (n2 = this.a()) - 1) {
                this.a = 0;
            }
            if (this.a < this.c) {
                this.c = this.a;
                return;
            }
            if (this.a >= this.c + this.b) {
                this.c = this.a - this.b + 1;
            }
        }
    }

    private void k() {
        this.a.addElement(new int[]{this.a});
        if (this.a.size() > this.i) {
            this.a.removeElementAt(0);
        }
    }

    public u(Main main) {
        this.a = main;
        this.a = this.a.a;
        this.a = this.a.a;
        this.a = this.a.a;
        this.a = (byte)-1;
        this.a = new Vector(10);
        this.c = d.a(0, "hardwirerockshard");
        int n2 = 0;
        while (n2 < this.c.length) {
            int n3 = n2++;
            this.c[n3] = (byte)(this.c[n3] + 1);
        }
    }

    public final void d() {
        if (ad.b >= 300) {
            this.e = ad.a - 70;
            this.f = ad.b - 110;
            this.g = 35;
            this.h = 55;
        } else {
            this.g = 35;
            this.h = 18;
            this.e = ad.a - 70;
            this.f = ad.b - this.h - this.a.a(0).getHeight();
            if (this.a.a == 0 && this.a.c == 7) {
                this.h += 20;
            }
        }
        if (ad.b >= 300) {
            if (this.a.a == 0 && this.a.c == 7) {
                this.h += 40;
                return;
            }
            this.h += 50;
            this.f -= 50;
        }
    }

    public final void a(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, ad.a, ad.b);
        if (this.a.a != 0 || this.a.c != 7) {
            graphics.drawImage(this.a.a(242), 10, 50, 20);
            graphics.drawImage(this.a.a(242), 50, 100, 20);
            graphics.drawImage(this.a.a(242), ad.a - 40, 70, 24);
            graphics.drawImage(this.a.a(242), ad.a - 100, 130, 24);
            graphics.drawImage(this.a.a(242), ad.a - 20, ad.b - 40, 40);
            graphics.drawImage(this.a.a(242), 30, ad.b - 40, 36);
            graphics.drawImage(this.a.a(243), ad.a - 40, ad.b - 10, 40);
            graphics.drawImage(this.a.a(243), 70, 70, 24);
        }
        graphics.drawImage(this.a.a(238), 0, 0, 20);
        graphics.drawImage(this.a.a(239), ad.a, 0, 24);
        graphics.drawImage(this.a.a(240), ad.a, ad.b, 40);
        graphics.drawImage(this.a.a(241), 0, ad.b, 36);
        if (this.b == 2) {
            return;
        }
        int n2 = 0;
        if (this.l > 10 && (this.l & 0x20) == 0) {
            switch (this.l & 0x1F) {
                case 0: 
                case 4: {
                    n2 = 1;
                    break;
                }
                case 1: 
                case 3: {
                    n2 = 2;
                    break;
                }
                case 2: {
                    n2 = 3;
                }
            }
        }
        if (ad.b >= 300 && (this.a.a != 0 || this.a.c == 7)) {
            graphics.drawImage(this.a.a(244), ad.c, 20 + this.a.a(245).getHeight(), 17);
            if (n2 != 3) {
                graphics.drawImage(this.a.a(n2 + 245), ad.c, 20 + (this.a.a(245).getHeight() >> 1), 3);
            }
        }
    }

    private void l() {
        this.b = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.b = null;
    }

    public final boolean a() {
        try {
            if (this.f) {
                this.i();
            } else if (this.e) {
                this.h();
            }
            this.e = false;
            this.f = false;
            if (this.a.b != null) {
                x x2;
                x x3 = x2 = this.a.b.a();
                if (x2.a == 2) {
                    x3 = (l)x2;
                    if (((l)x3).a) {
                        ((l)x2).b();
                        this.e();
                    }
                }
            }
            if (this.b == 1) {
                this.a.i();
                if (this.a != 38) {
                    return false;
                }
            }
        }
        catch (Exception exception) {}
        return true;
    }

    public final void e() {
        x x2;
        Main.c = true;
        x x3 = x2 = this.a.b.a();
        switch (x2.a) {
            case 3: {
                this.a((byte)36);
                this.a.m();
                long l2 = System.currentTimeMillis();
                while (this.a.b.a() == x2 && System.currentTimeMillis() - l2 < 2000L) {
                    try {
                        this.a();
                        Thread.sleep(1L);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                if (this.a.b.a() != x2) break;
                this.i();
                return;
            }
            case 2: {
                Main.c = false;
                this.m = 1;
                this.a = System.currentTimeMillis();
                this.a((byte)38);
                return;
            }
            case 1: {
                this.a((byte)37);
                return;
            }
            default: {
                this.g = false;
                this.a.a = this.a.b;
                if (this.a.a == 1) {
                    this.a(this.c);
                    this.c();
                    return;
                }
                if (this.a.a != 0 || this.a.c != 6) break;
                this.a.c = 0;
                this.a.m();
                this.a.c = (byte)6;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(Graphics graphics) {
        try {
            ++this.l;
            this.a(graphics);
            switch (this.b) {
                case 1: {
                    this.a.b(graphics, this.g, this.h, this.f, this.g + this.e - 2);
                    if (this.a == 38) {
                        int n2;
                        if (System.currentTimeMillis() - this.a >= 1000L) {
                            ++this.m;
                            if (this.m > 4) {
                                this.m = 0;
                            }
                            this.a = System.currentTimeMillis();
                        }
                        String string = "";
                        for (n2 = 0; n2 < this.m; ++n2) {
                            string = string + '.';
                        }
                        n2 = this.g;
                        int n3 = this.h + this.a.a.length * (3 + d.c(1));
                        this.a.a(graphics, 3, string, n2, n3, 20);
                    }
                    if (this.c) {
                        if (this.a == 28 || this.a == 29) {
                            if (this.c == null) {
                                this.c = this.a.b(54);
                            }
                            graphics.drawImage(this.c, 0, ad.b, 36);
                        } else {
                            graphics.drawImage(this.b, 0, ad.b, 36);
                        }
                    }
                    if (!this.d) return;
                    graphics.drawImage(this.a, ad.a, ad.b, 40);
                    return;
                }
                case 2: {
                    int n4 = this.h;
                    int n5 = 25 / (ad.a / d.a(0, "m")) + 2;
                    if (n4 < (n5 *= d.c(0))) {
                        n4 = n5;
                    }
                    this.a.a(graphics, this.g + 1, n4, -11579569, 0);
                    graphics.drawImage(this.b, 0, ad.b, 36);
                    int n6 = d.a(0, "m");
                    n5 = 1;
                    n4 = 0;
                    for (char c2 = 'a'; c2 <= 'z'; c2 = (char)(c2 + '\u0001')) {
                        this.a.a(graphics, 0, String.valueOf(c2), n5, n4, 0);
                        if ((n5 += n6) + n6 <= ad.a) continue;
                        n5 = 1;
                        n4 += d.c(0);
                    }
                    n4 = 25 / (ad.a / n6) + 1;
                    this.a.a(graphics, 0, "del", 1, n4 * d.c(0), 0);
                    return;
                }
                case 0: {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12 = this.a();
                    int n13 = n11 = n12 < this.b ? n12 : this.b;
                    if (this.a != null) {
                        n10 = this.h + 1 + (this.f >> 1) - (n11 * this.d >> 1);
                        for (n9 = this.c; n9 < this.c + n11; ++n9) {
                            int n14 = n10 + (n9 - this.c) * this.d;
                            int n15 = ad.c - (d.a(0, this.a[n9]) >> 1);
                            if (this.a[n9] != 0) {
                                n15 = ad.c - (this.k >> 1) - this.a[n9];
                            }
                            n8 = ad.c - (this.k >> 1);
                            int n16 = ad.c + (this.k >> 1);
                            n7 = 0;
                            n7 = n9 == this.a ? 0 : 2;
                            d.a(graphics, n7, this.a[n9], n15, n14, n8, n16, 0);
                        }
                    } else {
                        n10 = this.h + 1 + (this.f >> 1) - (n11 * this.d >> 1);
                        for (n9 = this.c; n9 < this.c + n11; ++n9) {
                            int n17 = n10 + (n9 - this.c) * this.d;
                            n8 = this.a.d(a[this.j][n9]);
                            byte[] byArray = null;
                            n7 = this.a.a(a[this.j][n9]);
                            if (a[this.j] != null && a[this.j][n9] != null) {
                                byArray = a[this.j][n9][0] < 0 ? d.a(n7, String.valueOf(this.b[n9])) : this.a.a(a[this.j][n9][this.b[n9]]);
                                n8 += d.a(n7, byArray);
                            }
                            int n18 = ad.c - (n8 >> 1);
                            if (this.a[n9] != 0) {
                                n18 = ad.c - (this.k >> 1) - this.a[n9];
                            }
                            n7 = ad.c - (this.k >> 1);
                            int n19 = ad.c + (this.k >> 1);
                            int n20 = 0;
                            n20 = n9 == this.a ? 0 : 2;
                            d.a(graphics, n20, this.a.a(a[this.j][n9]), n18, n17, n7, n19, 0);
                            if (byArray == null) continue;
                            d.a(graphics, n20, byArray, n18 + n8, n17, n7, n19, 8);
                            if (n9 != this.a) continue;
                            n7 = n17;
                            boolean bl = a[this.j][n9][0] < 0 && this.b[this.a] < a[this.j][n9][2] || a[this.j][n9][0] > 0 && (this.b[n9] < a[this.j][n9].length - 1 || a[this.j][n9].length == 2);
                            n8 = a[this.j][n9][0] < 0 && this.b[this.a] > a[this.j][n9][1] || a[this.j][n9][0] > 0 && (this.b[n9] > 0 || a[this.j][n9].length == 2) ? 1 : 0;
                            Graphics graphics2 = graphics;
                            u u2 = this;
                            if (n8 == 0 && !bl) continue;
                            ++n7;
                            n19 = u2.d >> 1;
                            n20 = 0;
                            n20 = u2.l % 6;
                            if (n20 > 3) {
                                n20 = 6 - n20;
                            }
                            if (n8 != 0) {
                                graphics2.drawImage(u2.a.a(231), n20 + 1, n7 + n19, 6);
                            }
                            if (!bl) continue;
                            graphics2.drawImage(u2.a.a(232), ad.a - 1 - n20, n7 + n19, 10);
                        }
                    }
                    for (n10 = this.c; n10 < this.c + n11; ++n10) {
                        if (this.a[n10] == 0) continue;
                        if (this.a[n10] > 0) {
                            int n21 = n10;
                            this.a[n21] = (short)(this.a[n21] + 2);
                            if (this.a[n10] <= this.b[n10]) continue;
                            this.a[n10] = this.b[n10];
                            this.a[n10] = -1;
                            continue;
                        }
                        int n22 = n10;
                        this.a[n22] = (short)(this.a[n22] - 2);
                        if (this.a[n10] >= 0) continue;
                        this.a[n10] = 0;
                        this.a[n10] = 1;
                    }
                    if (a[this.j] == null || a[this.j][this.a] == null) {
                        graphics.drawImage(this.b, 0, ad.b, 36);
                    }
                    if (this.b) {
                        graphics.drawImage(this.a, ad.a, ad.b, 40);
                    }
                    if (n12 <= this.b) return;
                    if (this.c > 0) {
                        graphics.drawImage(this.a.a(1000), ad.c, ad.b, 33);
                    }
                    if (this.c + this.b >= this.a()) return;
                    graphics.drawImage(this.a.a(1001), ad.c, ad.b, 33);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final void a(int n2, int n3) {
        if (n2 < this.a.getWidth() && n3 > ad.b - this.b.getHeight()) {
            this.a(-6);
        } else if (n2 >= ad.a - this.a.getWidth() && n3 > ad.b - this.a.getHeight()) {
            this.a(-7);
        }
        if (this.b == 1 || this.b == 0) {
            this.a.d = true;
            this.a.e = false;
            this.a.i = n3;
            if (this.b == 0) {
                this.a.j = this.c;
                return;
            }
            if (this.b == 1) {
                this.a.j = this.a.f;
            }
        }
    }

    public final void b(int n2, int n3) {
        block10: {
            if (this.b == 0) {
                int n4 = this.a();
                int n5 = n4 < this.b ? n4 : this.b;
                n4 = this.h + 1 + (this.f >> 1) - (n5 * this.d >> 1);
                for (int i2 = this.c; i2 < this.c + n5; ++i2) {
                    int n6 = n4 + (i2 - this.c) * this.d;
                    if (n3 <= n6 || n3 > n6 + this.d) continue;
                    n6 = this.a(this.j, i2);
                    if (n2 >= ad.a - n6 >> 1 && n2 <= ad.a + n6 >> 1) {
                        this.a = i2;
                    }
                    if (this.a != i2) continue;
                    if (n2 < 60 && this.a == null && a[this.j] != null && a[this.j][this.a] != null) {
                        this.a(ad.b(2));
                    } else if (n2 > ad.a - 60 && this.a == null && a[this.j] != null && a[this.j][this.a] != null) {
                        this.a(ad.b(3));
                    } else {
                        this.a(-6);
                    }
                    break block10;
                }
                return;
            }
            if (this.b == 2) {
                int n7 = d.a(0, "m");
                int n8 = ad.a / n7;
                n7 = (n2 - 1) / n7;
                int n9 = n3 / d.c(0);
                char c2 = n7 + n9 * n8;
                if (this.a.a.length() < this.a.h && c2 <= '\u0019') {
                    c2 = (char)(c2 + 97);
                    this.a.a.append(c2);
                }
                n9 = (25 / n8 + 1) * d.c(0);
                if (this.a.a.length() > 0 && n2 < 1 + d.a(0, "del") && n3 >= n9 && n3 <= n9 + d.c(0)) {
                    this.a.a.deleteCharAt(this.a.a.length() - 1);
                }
            }
        }
    }

    public final void a(v v2) {
        if (this.g) {
            return;
        }
        switch (v2.a) {
            case 1: {
                this.a(ad.b(0));
                return;
            }
            case 2: {
                this.a(ad.b(1));
                return;
            }
            case 3: {
                this.a(ad.b(2));
                return;
            }
            case 4: {
                this.a(ad.b(3));
                return;
            }
            case 5: {
                this.a(-6);
                return;
            }
            case 8: {
                this.a(-7);
            }
        }
    }

    public final void b(v v2) {
        if (this.g) {
            return;
        }
        switch (v2.a) {
            case 1: {
                this.b(ad.b(0));
                return;
            }
            case 2: {
                this.b(ad.b(1));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n2) {
        try {
            block1 : switch (this.b) {
                case 1: {
                    if (ad.a(n2)) {
                        if (!this.d) return;
                        this.f = true;
                        return;
                    }
                    if (this.c && (ad.c(n2) || this.a.a(n2) == 8)) {
                        this.e = true;
                        return;
                    }
                    switch (this.a.a(n2)) {
                        case 0: {
                            this.a.j();
                            break block1;
                        }
                        case 1: {
                            this.a.k();
                        }
                    }
                    return;
                }
                case 2: {
                    if (ad.a(n2)) {
                        this.f = true;
                        return;
                    }
                    if (!ad.c(n2) && !ad.b(n2)) {
                        this.a.c(n2);
                        return;
                    }
                    this.e = true;
                    return;
                }
                case 0: {
                    if (ad.a(n2)) {
                        if (!this.b) return;
                        this.f = true;
                        return;
                    }
                    if (ad.c(n2) || this.a.a(n2) == 8) {
                        this.e = true;
                        return;
                    }
                    if (n2 == -8) {
                        return;
                    }
                    n2 = this.a.a(n2);
                    switch (n2) {
                        case 0: {
                            --this.a;
                            if (this.a < this.c) {
                                this.c = this.a;
                            }
                            if (this.a >= 0) return;
                            n2 = this.a();
                            this.a = n2 - 1;
                            this.c = n2 - this.b;
                            if (this.c >= 0) return;
                            this.c = 0;
                            return;
                        }
                        case 1: {
                            ++this.a;
                            n2 = this.a();
                            if (this.a > n2 - 1) {
                                this.a = 0;
                                this.c = 0;
                            }
                            if (this.a - this.c < this.b) return;
                            this.c = this.a - this.b + 1;
                            return;
                        }
                        case 2: 
                        case 3: {
                            n2 = n2 == 2 ? 1 : 0;
                            if (this.a != null) return;
                            if (a[this.j] == null) return;
                            if (a[this.j][this.a] == null) return;
                            if (a[this.j][this.a][0] < 0) {
                                if (n2 != 0 && this.b[this.a] > a[this.j][this.a][1]) {
                                    this.b[this.a] = (byte)Math.max(a[this.j][this.a][1], this.b[this.a] + a[this.j][this.a][0]);
                                    this.c(this.a);
                                    this.j();
                                    return;
                                }
                                if (n2 != 0) return;
                                if (this.b[this.a] >= a[this.j][this.a][2]) return;
                                this.b[this.a] = (byte)Math.min(a[this.j][this.a][2], this.b[this.a] - a[this.j][this.a][0]);
                                this.c(this.a);
                                this.j();
                                return;
                            }
                            if (n2 != 0 && (this.b[this.a] > 0 || a[this.j][this.a].length == 2)) {
                                int n3 = this.a;
                                this.b[n3] = (byte)(this.b[n3] - 1);
                                if (this.b[this.a] < 0) {
                                    this.b[this.a] = (byte)(a[this.j][this.a].length - 1);
                                }
                                this.c(this.a);
                                this.j();
                                return;
                            }
                            if (n2 != 0) return;
                            if (this.b[this.a] >= a[this.j][this.a].length - 1) {
                                if (a[this.j][this.a].length != 2) return;
                            }
                            int n4 = this.a;
                            this.b[n4] = (byte)(this.b[n4] + 1);
                            this.b[this.a] = (byte)(this.b[this.a] % a[this.j][this.a].length);
                            this.c(this.a);
                            this.j();
                        }
                    }
                }
            }
            return;
        }
        catch (Exception exception) {}
    }

    public final void b(int n2) {
        switch (this.b) {
            case 1: {
                switch (this.a.a(n2)) {
                    case 0: 
                    case 1: {
                        this.a.l();
                    }
                }
            }
        }
    }

    private void m() {
        try {
            this.a.b("settings");
            this.a.a.writeByte(Main.e);
            this.a.a.writeBoolean(this.a.g);
            this.a.a.writeByte(this.a.a.g);
            this.a.a.writeByte(this.a.d);
            this.a.a.writeBoolean(this.a.a.c);
            this.a.a.writeByte(d.a);
            this.a.a.writeBoolean(this.a.a.b);
            this.a.a.writeByte(Main.f);
            this.a.a(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f() {
        try {
            this.a.a("settings");
            Main.e = this.a.a.readByte();
            this.a.g = this.a.a.readBoolean();
            this.a.a.g = this.a.a.readByte();
            this.a.d = this.a.a.readByte();
            this.a.a.c = this.a.a.readBoolean();
            d.a = this.a.a.readByte();
            this.a.a.b = this.a.a.readBoolean();
            Main.f = this.a.a.readByte();
            this.a.a(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

