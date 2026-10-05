/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ar {
    public static final int[] a = new int[]{1024, 1024, 682, 341, 1024, 341};
    public static final int[] b = new int[]{-1, -1, -1536, -1, -1, -1536};
    public static final int[] c = new int[]{-1, -1, -1, -1, 32768, -1};
    private static boolean[] g = new boolean[]{true, true, true, true, true, true, false, true, false, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static final boolean[] a = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    public static final boolean[] b = new boolean[]{true, true, true, false, false, false, false, false, false, true, false, true, false, true, false, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
    private static final short[] a = new short[]{0, 4, 8, 2, 4, 12, 10, 2, 8, 6, 12, 14, 10, 0, 14, 32, 16, 128, 64, 0, 0, 0, 0, 40, 24, 128, 64, 8, 0};
    public Main a;
    public ad a;
    public d a;
    public ac a;
    private at a;
    public Vector a;
    public byte a;
    public boolean a;
    public int[] d;
    public int a;
    public byte b;
    public byte c;
    public byte d;
    public int b = (byte)-1;
    public ab a;
    public ap[] a;
    public k[] a;
    public ai[] a;
    public bb[] a;
    public q[] a;
    public t[] a;
    public byte[][][] a;
    public byte[][] a;
    public as[][] a;
    public boolean[] c;
    public boolean[] d;
    public boolean[] e;
    public boolean[] f;
    public short[][] a;
    public int c = (byte)-1;
    public int d = (byte)-1;
    public int e;
    public int[][] a;
    public int f;
    public int g;
    public byte e;
    public int[] e = new int[10];
    public int[] f = new int[10];
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    private int p;
    public int o;

    public ar(Main object) {
        this.a = object;
        this.a = this.a.a;
        this.a = this.a.a;
        this.a = new ab();
        ar ar2 = this;
        object = this.a;
        this.a.a = ar2;
        this.a = new ac(this.a, this);
    }

    public final boolean a(byte by, byte by2) {
        try {
            this.a.c(12);
            this.d();
            DataInputStream dataInputStream = this.a.a(d.b[d.a(d.g, this.b)]);
            if (dataInputStream == null) {
                return false;
            }
            do {
                this.a.j = y.b(0, ac.a.length - 1);
            } while (ac.e[this.a.j] != this.a.a);
            if (this.a.b == -1 || this.a.b != this.a.a) {
                this.a.a = true;
                this.a.m();
                this.a.a = false;
            }
            if (this.a.b != -1 && this.a.b != this.a.a) {
                this.a.e();
            }
            this.a.f();
            this.a.d();
            this.a.a.a = false;
            this.c = (byte)7;
            this.d = (byte)7;
            this.a.h = Integer.MAX_VALUE;
            this.a.a = 0;
            this.a.m();
            long l2 = System.currentTimeMillis();
            this.e = by2;
            this.b = by;
            this.a = this.a.a;
            this.a = 0;
            if (this.b == 2 && this.a == null) {
                this.a = new Vector();
            }
            if (this.b == 4) {
                this.f = 1;
                this.g = 0;
            } else {
                this.f = 0;
                this.g = 1;
            }
            if ((this.b & 3) != 0) {
                int[][] nArray = this.a = new int[this.b == 2 ? 2 : 1][4];
                by = (byte)200;
                ab ab2 = this.a;
                this.a.e = 200;
                ab2.a = nArray;
                ab2.b = new Vector();
                ab2.a = new Vector();
                ab2.c = new Vector();
                ab2.b = new int[16][2];
                ab2.a = false;
                ab2.b = true;
            }
            System.gc();
            this.a.a(dataInputStream);
            System.gc();
            this.a.e();
            if ((this.b & 3) != 0) {
                int n2 = (this.a.length << 1) + 18 * this.a.length;
                this.a.a(this.a, this.a[1], this.a, g, 15, this.a.length + this.a.length + this.a.length, this.a.length, n2 += 16 * this.a.length);
            }
            this.k = 0;
            if (this.e != 4 && this.e != 5) {
                this.f[1] = 0;
                this.f[0] = 0;
                this.e[1] = 0;
                this.e[0] = 0;
            }
            this.o = 0;
            if (this.e == 4 || this.e == 5) {
                this.m = 1;
                this.p = -1;
            } else {
                this.m = -1;
            }
            this.a.e();
            long l3 = System.currentTimeMillis() - l2;
            if (l3 < 500L) {
                Thread.sleep(500L - l3);
            }
        }
        catch (Exception exception) {
            return false;
        }
        System.gc();
        Main.d = false;
        this.c = 0;
        this.d = 0;
        this.a.h = 0;
        return true;
    }

    public final int a(int[] nArray) {
        int n2 = nArray[0] >> 15;
        int n3 = nArray[1] >> 15;
        int n4 = nArray[2] >> 15;
        int n5 = nArray[3] >> 15;
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 >= this.d) {
            n4 = this.d - 1;
        }
        if (n5 >= this.e) {
            n5 = this.e - 1;
        }
        while (n3 <= n5) {
            for (int i2 = n2; i2 <= n4; ++i2) {
                switch (this.a[2][i2][n3]) {
                    case 6: 
                    case 7: 
                    case 36: {
                        return n3;
                    }
                }
            }
            ++n3;
        }
        return -1;
    }

    public final boolean a(int n2, int n3) {
        switch (this.a[2][n2][n3]) {
            case 6: 
            case 7: 
            case 36: {
                return true;
            }
        }
        return false;
    }

    private void e() {
        long l2;
        long l3 = l2 = System.currentTimeMillis();
        while (!this.a && !this.a.a()) {
            this.a.b();
            long l4 = System.currentTimeMillis();
            if (l4 - l2 > 500L && l4 - l3 > (long)Main.a) {
                if (this.a.a == 1) {
                    if (this.a.a.a()) {
                        this.a.m();
                    }
                } else {
                    this.a.a = true;
                    this.a.m();
                    this.a.a = false;
                }
                l3 = System.currentTimeMillis();
                continue;
            }
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void f() {
        this.d();
        this.a.a.b();
        this.a.a.a((byte)10);
        this.a.a = 1;
    }

    private boolean a(DataInputStream dataInputStream) {
        switch (dataInputStream.readByte()) {
            case 1: {
                this.d = (byte)2;
                dataInputStream.close();
                return true;
            }
            case 2: {
                this.a.a.c(false);
                return true;
            }
            case 3: {
                this.b = dataInputStream.readInt();
                this.a = dataInputStream.readByte();
                this.e[0] = dataInputStream.readInt();
                this.e[1] = dataInputStream.readInt();
                this.f[0] = dataInputStream.readInt();
                this.f[1] = dataInputStream.readInt();
                if (this.e == 2) {
                    this.h = dataInputStream.readInt();
                    this.i = dataInputStream.readInt();
                    this.j = dataInputStream.readInt();
                }
                this.d = (byte)5;
                return true;
            }
            case 4: {
                this.m = dataInputStream.readInt();
                this.p = dataInputStream.readInt();
                this.n = dataInputStream.readInt();
                return true;
            }
            case 5: {
                if (this.m < 0) {
                    this.m = 0;
                    this.p = 4;
                }
                return true;
            }
        }
        return false;
    }

    private boolean a() {
        byte by = this.a;
        this.a = 0;
        switch (by) {
            case 1: {
                this.a.a(new byte[]{1});
                return true;
            }
            case 2: {
                this.a.a(new byte[]{2});
                return true;
            }
            case 5: {
                this.a.a(new byte[]{5});
                return true;
            }
            case 3: {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(this.b);
                dataOutputStream.writeByte(this.a);
                dataOutputStream.writeInt(this.e[0]);
                dataOutputStream.writeInt(this.e[1]);
                dataOutputStream.writeInt(this.f[0]);
                dataOutputStream.writeInt(this.f[1]);
                if (this.e == 2) {
                    dataOutputStream.writeInt(this.h);
                    dataOutputStream.writeInt(this.i);
                    dataOutputStream.writeInt(this.j);
                }
                this.a.a(byteArrayOutputStream.toByteArray());
                return true;
            }
        }
        return false;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        if (this.b == 4) {
            try {
                if (this.m >= 0 && this.o > 0) {
                    this.a = (byte)5;
                }
                if (this.a()) {
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeInt(this.a.d[0]);
                dataOutputStream.writeInt(this.a.d[1]);
                dataOutputStream.writeInt(this.a.d[2]);
                dataOutputStream.writeInt(this.a.d[3]);
                int n2 = 0;
                if (this.a[this.f].d) {
                    n2 = 1;
                }
                if (this.a[this.f].e) {
                    n2 = (byte)(n2 | 2);
                }
                if (this.a[this.f].f) {
                    n2 = (byte)(n2 | 4);
                }
                if (this.a[this.f].g) {
                    n2 = (byte)(n2 | 8);
                }
                if (this.a[this.f].h) {
                    n2 = (byte)(n2 | 0x20);
                }
                dataOutputStream.writeByte(n2);
                dataOutputStream.writeByte(this.a[this.f].h);
                dataOutputStream.writeByte(this.a[this.f].i);
                dataOutputStream.writeByte(this.a[this.f].b);
                if (!this.a.a(byteArrayOutputStream.toByteArray())) {
                    this.f();
                }
                return;
            }
            catch (IOException iOException) {
                this.f();
                return;
            }
        }
        if (this.b == 2) {
            this.a.removeAllElements();
            this.e();
            if (this.a) {
                return;
            }
            ByteArrayInputStream byteArrayInputStream = null;
            byteArrayInputStream = this.a.a();
            if (byteArrayInputStream == null) {
                this.f();
                return;
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                if (this.a(dataInputStream)) {
                    return;
                }
                if (this.d == null) {
                    this.d = new int[4];
                }
                this.d[0] = dataInputStream.readInt();
                this.d[1] = dataInputStream.readInt();
                this.d[2] = dataInputStream.readInt();
                this.d[3] = dataInputStream.readInt();
                byte by = dataInputStream.readByte();
                this.a[this.g].d = (by & 1) != 0;
                this.a[this.g].e = (by & 2) != 0;
                this.a[this.g].f = (by & 4) != 0;
                this.a[this.g].g = (by & 8) != 0;
                this.a[this.g].h = (by & 0x20) != 0;
                this.a[this.g].h = dataInputStream.readByte();
                this.a[this.g].i = dataInputStream.readByte();
                this.a[this.g].b = dataInputStream.readByte();
                return;
            }
            catch (IOException iOException) {
                this.f();
            }
        }
    }

    public final void b() {
        block110: {
            if (this.a) {
                return;
            }
            try {
                if (this.b == 2) {
                    try {
                        Object object;
                        int n2;
                        int n3;
                        Object object2;
                        int n4;
                        if (this.a()) {
                            return;
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        if (this.m >= 0 && this.o > 0) {
                            ar ar2 = this;
                            if (ar2.m >= 0 && ar2.o > 0) {
                                if (ar2.p == -1) {
                                    if (ar2.a.h >= 4) {
                                        ar2.p = 0;
                                        ar2.n = 0;
                                    }
                                } else if (ar2.p == 0 && ar2.n < 3) {
                                    ++ar2.n;
                                } else if (ar2.p < 4) {
                                    ++ar2.p;
                                } else if (ar2.n < 6) {
                                    ++ar2.n;
                                } else {
                                    --ar2.m;
                                    ar2.p = -1;
                                }
                            }
                            dataOutputStream.writeByte(4);
                            dataOutputStream.writeInt(this.m);
                            dataOutputStream.writeInt(this.p);
                            dataOutputStream.writeInt(this.n);
                            if (!this.a.a(byteArrayOutputStream.toByteArray())) {
                                this.f();
                            }
                            return;
                        }
                        this.d[0] = this.d[0] - 32768;
                        this.d[1] = this.d[1] - 32768;
                        this.d[2] = this.d[2] + 32768;
                        this.d[3] = this.d[3] + 32768;
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeInt(this.k);
                        int n5 = this.a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.a[n4];
                            dataOutputStream.writeByte(((q)object2).a);
                            n3 = ((q)object2).a;
                            for (n2 = 0; n2 < n3; ++n2) {
                                object = ((q)object2).a[n2].a.a;
                                dataOutputStream.writeShort(((as)object).a >> 10);
                                dataOutputStream.writeShort(((as)object).b >> 10);
                            }
                            for (n2 = 0; n2 < ((q)object2).a.a.length; ++n2) {
                                object = ((q)object2).a.a[n2];
                                dataOutputStream.writeShort(((s)object).a.a >> 10);
                                dataOutputStream.writeShort(((s)object).a.b >> 10);
                                dataOutputStream.writeByte(((s)object).b);
                            }
                            dataOutputStream.writeByte(((q)object2).d >> 10);
                            n2 = this.e[n4] << 1;
                            if (((q)object2).a) {
                                n2 |= 1;
                            }
                            dataOutputStream.writeShort(n2);
                            byte by = ((q)object2).c;
                            n2 = by;
                            n2 = by | ((q)object2).d << 2;
                            if (((q)object2).e > 0) {
                                n2 |= 0x10;
                            }
                            dataOutputStream.writeByte(n2 |= ((q)object2).a.b << 5);
                            if (((q)object2).d == 2) {
                                dataOutputStream.writeByte(((q)object2).c);
                            }
                            dataOutputStream.writeInt(((q)object2).a.c().d());
                        }
                        n5 = this.a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.a[n4];
                            if (((ai)object2).a == 2 || !y.a(this.d, ((ai)object2).a())) continue;
                            dataOutputStream.writeByte(n4);
                            dataOutputStream.writeShort(((ai)object2).a.a.a.a >> 10);
                            dataOutputStream.writeShort(((ai)object2).a.a.a.b >> 10);
                            if (((ai)object2).b != null) {
                                dataOutputStream.writeShort(((ai)object2).b.a.a.a >> 10);
                                dataOutputStream.writeShort(((ai)object2).b.a.a.b >> 10);
                            }
                            n3 = ((ai)object2).a;
                            if (((ai)object2).a) {
                                n3 = (short)(n3 | 8);
                            }
                            if (((ai)object2).a != -1) {
                                n3 = (short)(n3 | 0x10);
                            }
                            if (((ai)object2).b) {
                                n3 = (short)(n3 | 0x20);
                            }
                            short s2 = (short)(n3 | ((ai)object2).b << 6);
                            n3 = s2;
                            n3 = (short)(s2 | ((ai)object2).c << 11);
                            dataOutputStream.writeShort(n3);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.a[n4];
                            if (!y.a(this.d, ((k)object2).a.a())) continue;
                            dataOutputStream.writeByte(n4);
                            dataOutputStream.writeShort(((k)object2).a.a.a >> 10);
                            dataOutputStream.writeShort(((k)object2).a.a.b >> 10);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object = object2 = this.a[n4];
                            if (!y.a(this.d, ((bb)object).a)) continue;
                            dataOutputStream.writeByte(n4);
                            int n6 = n3 = this.a[n4].b ? 1 : 0;
                            if (this.a[n4].a.a) {
                                n3 |= 2;
                            }
                            dataOutputStream.writeByte(n3);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.a.length;
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = this.a[n4];
                            if (!y.a(this.d, ((ap)object2).a.a())) continue;
                            dataOutputStream.writeByte(n4);
                            n3 = ((ap)object2).a.a.length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                object = ((ap)object2).a.a[n2].a;
                                dataOutputStream.writeShort(((as)object).a >> 10);
                                dataOutputStream.writeShort(((as)object).b >> 10);
                            }
                            if (((ap)object2).a.c != null) {
                                n3 = ((ap)object2).a.c.length;
                                for (n2 = 0; n2 < n3; ++n2) {
                                    object = ((ap)object2).a.c[n2].a;
                                    dataOutputStream.writeShort(((as)object).a >> 10);
                                    dataOutputStream.writeShort(((as)object).b >> 10);
                                }
                            }
                            if (((ap)object2).a.c != null) {
                                n3 = ((ap)object2).a.c.length;
                                for (n2 = 0; n2 < n3; ++n2) {
                                    object = ((ap)object2).a.c[n2];
                                    if (object == null) {
                                        dataOutputStream.writeShort(Short.MAX_VALUE);
                                        continue;
                                    }
                                    if (((t)object).b != null) {
                                        dataOutputStream.writeShort(Short.MIN_VALUE);
                                        continue;
                                    }
                                    if (((t)object).b != null) continue;
                                    dataOutputStream.writeShort(((t)object).a.a >> 10);
                                    dataOutputStream.writeShort(((t)object).a.b >> 10);
                                }
                            }
                            n2 = ((ap)object2).a;
                            if (((ap)object2).b) {
                                n2 |= 4;
                            }
                            dataOutputStream.writeByte(n2);
                        }
                        dataOutputStream.writeByte(-1);
                        n5 = this.a.size();
                        dataOutputStream.writeByte(n5);
                        for (n4 = 0; n4 < n5; ++n4) {
                            object2 = (byte[])this.a.elementAt(n4);
                            for (n3 = 0; n3 < ((Object)object2).length; ++n3) {
                                dataOutputStream.writeByte((int)object2[n3]);
                            }
                        }
                        this.a.removeAllElements();
                        if (!this.a.a(byteArrayOutputStream.toByteArray())) {
                            this.f();
                        }
                        break block110;
                    }
                    catch (IOException iOException) {
                        this.f();
                    }
                    break block110;
                }
                if (this.b == 4) {
                    this.e();
                    if (this.a) {
                        return;
                    }
                    ByteArrayInputStream byteArrayInputStream = null;
                    byteArrayInputStream = this.a.a();
                    if (byteArrayInputStream == null) {
                        this.f();
                        break block110;
                    }
                    try {
                        int n7;
                        int n8;
                        Object object;
                        int n9;
                        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                        if (this.a(dataInputStream)) {
                            return;
                        }
                        this.k = dataInputStream.readInt();
                        int n10 = this.a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            Object object3;
                            object = this.a[n9];
                            this.a[n9].a = dataInputStream.readByte();
                            n8 = ((q)object).a;
                            for (n7 = 0; n7 < n8; ++n7) {
                                if (((q)object).a[n7] == null) {
                                    ((q)object).a[n7] = new aa(new s(new as(), 2048), 5120);
                                }
                                object3 = ((q)object).a[n7].a;
                                ((q)object).a[n7].a.b.a = ((s)object3).a.a = dataInputStream.readShort() << 10;
                                ((s)object3).b.b = ((s)object3).a.b = dataInputStream.readShort() << 10;
                            }
                            for (n7 = 0; n7 < ((q)object).a.a.length; ++n7) {
                                object3 = ((q)object).a.a[n7];
                                ((q)object).a.a[n7].b.a = ((s)object3).a.a = dataInputStream.readShort() << 10;
                                ((s)object3).b.b = ((s)object3).a.b = dataInputStream.readShort() << 10;
                                ((s)object3).b = dataInputStream.readByte();
                            }
                            n7 = dataInputStream.readByte() << 10;
                            if (((q)object).d > n7) {
                                ((q)object).c = 2;
                                if (((q)object).b == this.f) {
                                    this.a.a(Main.b / 2);
                                }
                            }
                            ((q)object).d = n7;
                            int n11 = dataInputStream.readShort() & 0xFFFF;
                            this.e[n9] = n11 >> 1;
                            boolean bl = (n11 & 1) != 0;
                            n8 = ((q)object).a ? 1 : 0;
                            ((q)object).a = bl;
                            n11 = dataInputStream.readByte();
                            ((q)object).c = (byte)(n11 & 3);
                            byte by = (byte)(n11 >> 2 & 3);
                            n7 = by;
                            if (by == 1 && ((q)object).d != 1 && y.a(this.a.d, ((q)object).a.a())) {
                                this.a.a(4, false);
                            }
                            ((q)object).d = n7;
                            if ((n11 >> 4 & 1) != 0) {
                                if (((q)object).e == 0) {
                                    ((q)object).e = 1;
                                }
                            } else {
                                ((q)object).e = 0;
                            }
                            ((q)object).a.b = n11 >> 5;
                            if (n7 == 2) {
                                ((q)object).c = dataInputStream.readByte();
                            }
                            ((q)object).f = dataInputStream.readInt();
                            ((q)object).a.d();
                            object3 = ((q)object).a;
                            ((q)object).a.a = true;
                            if (((q)object).a() || !y.a(this.a.d, ((q)object).a.a())) continue;
                            n7 = this.a(((q)object).a.a());
                            if (bl && n8 == 0 && ((q)object).f > 10240) {
                                this.a.a(7, false);
                                if (this.a.g > 0) {
                                    ((q)object).a(n7);
                                }
                            }
                            if (this.a.g <= 1 || ((q)object).a.a()[1] >> 15 >= n7) continue;
                            this.a.b(((q)object).a.a().a >> 10, n7 << 5, 16, 1);
                        }
                        while (true) {
                            boolean bl;
                            boolean bl2;
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            object = this.a[n9];
                            aa aa2 = ((ai)object).a;
                            ((ai)object).a.a = true;
                            if (((ai)object).b != null) {
                                aa2 = ((ai)object).b;
                                ((ai)object).b.a = true;
                            }
                            ((ai)object).a.a.b.a = ((ai)object).a.a.a.a = dataInputStream.readShort() << 10;
                            ((ai)object).a.a.b.b = ((ai)object).a.a.a.b = dataInputStream.readShort() << 10;
                            if (((ai)object).b != null) {
                                ((ai)object).b.a.b.a = ((ai)object).b.a.a.a = dataInputStream.readShort() << 10;
                                ((ai)object).b.a.b.b = ((ai)object).b.a.a.b = dataInputStream.readShort() << 10;
                            }
                            short s3 = dataInputStream.readShort();
                            n8 = s3;
                            n7 = (byte)(s3 & 7);
                            boolean bl3 = bl2 = (n8 >> 4 & 1) != 0;
                            if (n7 != ((ai)object).a) {
                                if (!bl2 && n7 == 1 && ((ai)object).a != 2) {
                                    this.a.a(((ai)object).d == 1 ? 8 : 4, false);
                                    aa aa3 = ((ai)object).a;
                                    as as2 = aa3.a.a;
                                    this.a.a(as2.a >> 10, as2.b >> 10, 30, 30);
                                }
                                if (n7 != 1 || ((ai)object).a != 2) {
                                    ((ai)object).a((byte)n7);
                                }
                            }
                            boolean bl4 = ((ai)object).a = (n8 >> 3 & 1) != 0;
                            if ((n8 >> 4 & 1) != 0) {
                                ((ai)object).a = 0;
                            }
                            if ((bl = (n8 >> 5 & 1) != 0) && !((ai)object).b && this.a.g > 0 && y.a(this.a.d, ((ai)object).a.a())) {
                                aa aa4 = ((ai)object).a;
                                this.a.a(aa4.a.a.a >> 10, this.a(((ai)object).a.a()) << 5, 2);
                            }
                            ((ai)object).b = bl;
                            ((ai)object).b = (byte)(n8 >> 6 & 0x1F);
                            ((ai)object).c = (byte)(n8 >> 11);
                            ((ai)object).c = true;
                        }
                        n10 = this.a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.a[n9].c) {
                                this.a[n9].c = false;
                                continue;
                            }
                            if (this.a[n9].a == 2) continue;
                            int[] nArray = this.a[n9].a.a();
                            object = nArray;
                            object[3] = Integer.MIN_VALUE;
                            object[2] = Integer.MIN_VALUE;
                            object[1] = Integer.MIN_VALUE;
                            nArray[0] = Integer.MIN_VALUE;
                            if (this.a[n9].b == null) continue;
                            int[] nArray2 = this.a[n9].b.a();
                            object = nArray2;
                            object[3] = Integer.MIN_VALUE;
                            object[2] = Integer.MIN_VALUE;
                            object[1] = Integer.MIN_VALUE;
                            nArray2[0] = Integer.MIN_VALUE;
                        }
                        while (true) {
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            object = this.a[n9];
                            this.a[n9].a.a.a = dataInputStream.readShort() << 10;
                            ((k)object).a.a.b = dataInputStream.readShort() << 10;
                            ((k)object).b = true;
                        }
                        n10 = this.a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.a[n9].b) {
                                this.a[n9].b = false;
                                continue;
                            }
                            this.a[n9].a.a.b(0x3FFFFFFF, 0x3FFFFFFF);
                        }
                        while (true) {
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            byte by2 = dataInputStream.readByte();
                            n8 = (by2 & 1) != 0 ? 1 : 0;
                            boolean bl = this.a[n9].a.a = (by2 & 2) != 0;
                            if (n8 != 0 && !this.a[n9].b) {
                                bb bb2 = this.a[n9];
                                if (y.a(this.a.d, bb2.a)) {
                                    this.a.a(5, false);
                                }
                            }
                            if (n8 != 0 && !this.a[n9].b) {
                                this.a[n9].b();
                                continue;
                            }
                            if (n8 != 0 || !this.a[n9].b) continue;
                            this.a[n9].a();
                        }
                        while (true) {
                            short s4;
                            byte by = dataInputStream.readByte();
                            n9 = by;
                            if (by == -1) break;
                            ap ap2 = this.a[n9];
                            n8 = ap2.a.a.length;
                            for (n7 = 0; n7 < n8; ++n7) {
                                s s5 = ap2.a.a[n7];
                                ap2.a.a[n7].b.a = s5.a.a = dataInputStream.readShort() << 10;
                                s5.b.b = s5.a.b = dataInputStream.readShort() << 10;
                            }
                            if (ap2.a.c != null) {
                                n8 = ap2.a.c.length;
                                for (n7 = 0; n7 < n8; ++n7) {
                                    s s6 = ap2.a.c[n7];
                                    ap2.a.c[n7].b.a = s6.a.a = dataInputStream.readShort() << 10;
                                    s6.b.b = s6.a.b = dataInputStream.readShort() << 10;
                                }
                            }
                            if (ap2.a.c != null) {
                                n8 = ap2.a.c.length;
                                for (n7 = 0; n7 < n8; ++n7) {
                                    t t2 = ap2.a.c[n7];
                                    s4 = dataInputStream.readShort();
                                    if (s4 == Short.MAX_VALUE) {
                                        ap2.a.c[n7] = null;
                                        continue;
                                    }
                                    if (s4 == Short.MIN_VALUE) continue;
                                    t2.a.a = s4 << 10;
                                    t2.a.b = dataInputStream.readShort() << 10;
                                }
                            }
                            byte by3 = dataInputStream.readByte();
                            n7 = by3;
                            byte by4 = (byte)(by3 & 3);
                            if (ap2.a != by4) {
                                if (by4 == 2 && ap2.a != 2) {
                                    ap2.b();
                                }
                                if (by4 != 1 || ap2.a != 2) {
                                    ap2.a = by4;
                                }
                            }
                            s4 = (n7 >> 2 & 1) != 0 ? (short)1 : 0;
                            ap2.a.d();
                            am am2 = ap2.a;
                            ap2.a.a = true;
                            if (s4 != 0 && !ap2.b && this.a.g > 0 && y.a(this.a.d, ap2.a.a())) {
                                this.a.a(ap2.a.a().a >> 10, this.a(ap2.a.a()) << 5, 2);
                            }
                            ap2.b = s4;
                            ap2.a = true;
                        }
                        n10 = this.a.length;
                        for (n9 = 0; n9 < n10; ++n9) {
                            if (this.a[n9].a) {
                                this.a[n9].a = false;
                                continue;
                            }
                            int[] nArray = this.a[n9].a.a();
                            int[] nArray3 = nArray;
                            nArray3[3] = Integer.MIN_VALUE;
                            nArray3[2] = Integer.MIN_VALUE;
                            nArray3[1] = Integer.MIN_VALUE;
                            nArray[0] = Integer.MIN_VALUE;
                        }
                        n10 = dataInputStream.readByte();
                        block41: for (n9 = 0; n9 < n10; ++n9) {
                            byte by = dataInputStream.readByte();
                            switch (by >> 1) {
                                case 0: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.a.a(2, false);
                                        this.a.a((n8 << 5) + 16, (n7 << 5) + 16, 4);
                                    }
                                    this.a[1][n8][n7] = -1;
                                    this.a.a((n8 << 5) + 16, (n7 << 5) + 16, 10, 10);
                                    continue block41;
                                }
                                case 1: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.a.a(1, false);
                                        this.a.a((n8 << 5) + 16, (n7 << 5) + 16, 5);
                                    }
                                    this.a[1][n8][n7] = -1;
                                    continue block41;
                                }
                                case 2: {
                                    if ((by & 1) != 0) {
                                        this.a.a(9, false);
                                    }
                                    this.a[dataInputStream.readByte() & 0xFF] = null;
                                    continue block41;
                                }
                                case 3: {
                                    n8 = dataInputStream.readByte() & 0xFF;
                                    n7 = dataInputStream.readByte() & 0xFF;
                                    if ((by & 1) != 0) {
                                        this.a.a(6, false);
                                        int n12 = (n8 << 5) + 16;
                                        int n13 = (n7 << 5) + 16;
                                        this.a.a(n12, n13, 1);
                                        this.a.b(n12, n13, 16, 0);
                                    }
                                    this.a[1][n8][n7] = -1;
                                    continue block41;
                                }
                                case 4: {
                                    this.a[this.f].b = this.a[this.f].c;
                                }
                                case 5: {
                                    this.a.a(0, false);
                                    continue block41;
                                }
                                case 6: {
                                    if ((by & 1) != 0) {
                                        this.a.a(11, false);
                                        continue block41;
                                    }
                                    this.a.a(10, false);
                                    continue block41;
                                }
                                case 7: {
                                    this.a.c(dataInputStream.readByte() & 0xFF);
                                }
                            }
                        }
                        break block110;
                    }
                    catch (IOException iOException) {
                        this.f();
                    }
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c() {
        try {
            switch (this.c) {
                case 0: {
                    this.a.h();
                    if (this.a.d > 10) {
                        Main.d = true;
                    }
                    break;
                }
                case 6: {
                    this.a.i();
                }
            }
        }
        catch (Exception exception) {}
        try {
            if (this.a != 0 || this.d == this.c) return;
            this.c = this.d;
            switch (this.d) {
                case 2: {
                    this.a(this.b, this.e);
                    return;
                }
                case 5: {
                    if (this.b == 93) {
                        this.b = d.a[0];
                        this.a("save", this.b);
                        this.a((byte)1, (byte)0);
                        return;
                    }
                    if (this.e == 0 || this.e == 2) {
                        ar ar2 = this;
                        try {
                            ar2.a.a("achi");
                            int n2 = ar2.a.a.readInt();
                            int n3 = ar2.a.a.readInt();
                            ar2.a.i = ar2.a.a.readInt();
                            byte[] byArray = new byte[200];
                            int n4 = ar2.a.a.read(byArray);
                            ar2.a.a(false);
                            boolean bl = false;
                            if (ar2.e == 0 && d.a(d.a, ar2.b) + 1 > n2) {
                                n2 = d.a(d.a, ar2.b) + 1;
                                bl = true;
                            } else if (ar2.e == 2 && d.a(d.d, ar2.b) + 1 > n3) {
                                n3 = d.a(d.d, ar2.b) + 1;
                                bl = true;
                            }
                            if (bl) {
                                ar2.a.b("achi");
                                ar2.a.a.writeInt(n2);
                                ar2.a.a.writeInt(n3);
                                ar2.a.a.writeInt(ar2.a.i);
                                ar2.a.a.write(byArray, 0, n4);
                                ar2.a.a(true);
                            }
                        }
                        catch (Exception exception) {}
                    }
                    this.a.d = 0;
                    return;
                }
                case 4: {
                    if (this.e != 0 && this.e != 2) return;
                    int n5 = d.a(this.b);
                    if (n5 == -1) return;
                    this.a(this.e == 0 ? "save" : "msave", n5);
                    return;
                }
                case 8: {
                    this.d();
                    if (this.e == 0 || this.e == 2) {
                        if (this.e == 0 && this.b == d.a[d.a.length - 1] || this.e == 2 && this.b == d.d[d.d.length - 1]) {
                            if (this.b == 2) {
                                this.a.a = 1;
                                this.a.a.a((byte)26);
                                return;
                            } else if (this.b == 4) {
                                this.a.a.a((byte)9);
                                this.a.a = 1;
                                this.a.m();
                                this.a.a.c(false);
                                return;
                            } else {
                                this.a.a = 1;
                                this.a.a.a((byte)26);
                            }
                            return;
                        } else {
                            this.b = d.a(this.b);
                            this.d = (byte)2;
                        }
                        return;
                    }
                    if (this.b == 1) {
                        this.a.a = 1;
                        this.a.a.a((byte)4);
                        this.a.a.a = d.a(d.a, this.b) - 1;
                        this.a.a.a(ad.b(1));
                        return;
                    }
                    if (this.e == 4 || this.e == 5) {
                        if (this.e[0] == 5 || this.e[1] == 5) {
                            if (this.b == 2) {
                                this.a.a = 1;
                                this.a.a.a((byte)17);
                                return;
                            } else {
                                this.a.a = 1;
                                this.a.a.a((byte)9);
                                this.a.a.c(false);
                            }
                            return;
                        } else {
                            this.d = (byte)2;
                        }
                        return;
                    }
                    if (this.b == 4) {
                        this.a.a = 1;
                        this.a.a.a((byte)9);
                        this.a.a.c(false);
                        return;
                    }
                    if (this.b != 2) return;
                    this.a.a = 1;
                    if (d.a(d.d, this.b) != -1) {
                        this.a.a.a((byte)20);
                        this.a.a.a = d.a(d.d, this.b) - 1;
                        this.a.a.a(ad.b(1));
                    } else {
                        this.a.a.a((byte)47);
                        this.a.a.a = d.a(d.c, this.b) - 1;
                        this.a.a.a(ad.b(1));
                    }
                    if (this.a.a.a != -1) return;
                    this.a.a.a = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void a(String string, int n2) {
        try {
            this.a.b(string);
            this.a.a.writeInt(n2);
            this.a.a.writeInt(this.h);
            this.a.a.writeInt(this.i);
            this.a.a.writeInt(this.j);
        }
        catch (Exception exception) {}
        this.a.a(true);
    }

    public final void d() {
        this.a.f();
        this.a = null;
        this.d = null;
        this.c = null;
        this.f = null;
        this.e = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        this.a = null;
        if (this.a != null) {
            int n2;
            ab ab2 = this.a;
            this.a.b = false;
            if (ab2.a != null) {
                for (n2 = 0; n2 < ab2.a; ++n2) {
                    ab2.a[n2] = null;
                }
                ab2.a = null;
                ab2.a = 0;
            }
            if (ab2.a != null) {
                for (n2 = 0; n2 < ab2.b; ++n2) {
                    ab2.a[n2] = null;
                }
                ab2.a = null;
                ab2.b = 0;
            }
            if (ab2.a != null) {
                for (n2 = 0; n2 < ab2.c; ++n2) {
                    ab2.a[n2] = null;
                }
                ab2.a = null;
                ab2.c = 0;
            }
            ab2.b = null;
            ab2.a = null;
            ab2.a = null;
            ab2.b = null;
            ab2.a = null;
            ab2.b = null;
            ab2.c = null;
            ab2.a = null;
            ab2.b = null;
            ab2.a = null;
            ab2.a = null;
        }
        if (this.a != null) {
            this.a.removeAllElements();
        }
        this.a = null;
        System.gc();
    }

    public final void a(aa aa2, int n2, int n3) {
        ai ai2;
        Object object;
        int n4;
        if (this.d[n2] && this.c[n3]) {
            n4 = this.a.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                bb bb2 = this.a[i2];
                if (bb2.a != n2 || bb2.b != n3 || aa2.a.a.b >= n3 << 15) continue;
                if (!bb2.b) {
                    object = bb2;
                    if (y.a(this.a.d, ((bb)object).a)) {
                        this.a.a(5, false);
                    }
                }
                bb2.a = true;
            }
        }
        if (!(aa2.d != 2 && aa2.d != 5 || (n4 = this.a[1][n2][n3]) != 7 && n4 != 10 && n4 != 11 && n4 != 12 || (ai2 = (ai)aa2.a).a())) {
            ai2.b();
            int n5 = 0;
            while (n5 < this.a.length) {
                int n6 = n5++;
                this.e[n6] = this.e[n6] + 30;
            }
            object = aa2;
            as as2 = ((aa)object).a.a;
            this.a.a(as2.a >> 10, as2.b >> 10, 30, 30);
        }
    }

    public final void a(am am2, int n2, int n3) {
        int n4;
        int n5;
        if (this.d[n2] && this.c[n3]) {
            int n6 = this.a.length;
            for (n5 = 0; n5 < n6; ++n5) {
                bb bb2 = this.a[n5];
                if (bb2.a != n2 || bb2.b != n3) continue;
                boolean bl = false;
                for (n4 = 0; n4 < am2.a.length; ++n4) {
                    as as2 = am2.a[n4].a;
                    if (as2.a < n2 << 15 || as2.a > n2 + 1 << 15 || as2.b >= (n3 << 15) + 4096) continue;
                    bl = true;
                    break;
                }
                if (!bl) continue;
                if (!bb2.b) {
                    bb bb3 = bb2;
                    if (y.a(this.a.d, bb3.a)) {
                        this.a.a(5, false);
                    }
                }
                bb2.a = true;
            }
        }
        if (am2.j == 1) {
            long l2;
            q q2 = (q)am2.a;
            n5 = this.a[1][n2][n3];
            if (a[n5] && ((l2 = q2.a.c().a()) > 0x1E00000L || q2.e > 0 && l2 > 0L)) {
                int n7;
                boolean bl = y.a(this.a.d, q2.a.a());
                n4 = bl ? 1 : 0;
                if (bl) {
                    this.a.a(6, false);
                    int n8 = (n2 << 5) + 16;
                    int n9 = (n3 << 5) + 16;
                    this.a.a(n8, n9, 1);
                    this.a.b(n8, n9, 16, 0);
                }
                if (this.b == 2) {
                    this.a.addElement(new byte[]{(byte)(6 | (y.a(this.d, q2.a.a()) ? 1 : 0)), (byte)n2, (byte)n3});
                }
                int n10 = (n2 << 15) - 2048;
                int n11 = (n3 << 15) - 2048;
                n5 = (n2 + 1 << 15) + 2048;
                int n12 = (n3 + 1 << 15) + 2048;
                for (n7 = 0; n7 < q2.a.g; ++n7) {
                    t t2 = q2.a.b[n7];
                    if (t2.a == null || t2.a.a < n10 || t2.a.a > n5 || t2.a.b < n11 || t2.a.b > n12) continue;
                    t2.a();
                }
                this.a[1][n2][n3] = -1;
                this.a[n2][n3] = -1;
                n10 = n2 - 1;
                n11 = n3 - 1;
                n5 = n2 + 1;
                n12 = n3 + 1;
                for (n7 = n10; n7 <= n5; ++n7) {
                    for (int i2 = n11; i2 <= n12; ++i2) {
                        if (n10 < 0 || n11 < 0 || n5 >= this.d || n12 >= this.e) continue;
                        this.a.a(n7, i2);
                    }
                }
                return;
            }
            if (n5 == 7 || n5 == 10 || n5 == 11 || n5 == 12) {
                q2.b(1024);
            }
            if (q2.e == 0 && q2.c == 2 && g[n5]) {
                as as3 = q2.a.a();
                int n13 = as3.a >> 15;
                n4 = as3.b >> 15;
                short s2 = a[this.a[n2][n3]];
                if (!q2.f && q2.h == 0 && n13 < n2 && (s2 & 2) != 0) {
                    q2.j |= 2;
                }
                if ((q2.d || q2.i < 0) && (q2.j & 6) != 0 && n4 <= n3 && (s2 & 0x30) != 0) {
                    q2.j |= s2 & 0x30;
                }
                if (!q2.g && q2.h == 0 && n13 > n2 && (s2 & 4) != 0) {
                    q2.j |= 4;
                }
                if (!q2.e && !q2.d && q2.i == 0 && n4 > n3 && (s2 & 8) != 0) {
                    q2.j |= 8;
                }
                if (!q2.e && !q2.d && q2.i == 0 && n4 >= n3 && (s2 & 0xC0) != 0) {
                    q2.j |= 0xC0;
                }
            }
        }
    }

    public final void a(am am2) {
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.a[i2].a.equals(am2)) continue;
            this.a[i2].b();
        }
    }

    public static void a(am am2, am am3) {
        if (am2.j == 1) {
            ((q)am2.a).a(am3);
        }
        if (am3.j == 1) {
            ((q)am3.a).a(am2);
        }
        if (am2.j == 1 && am3.j == 4) {
            ((q)am2.a).b = true;
            return;
        }
        if (am3.j == 1 && am2.j == 4) {
            ((q)am3.a).b = true;
        }
    }

    public final void a(am object, aa object2) {
        if (((am)object).j == 1 && ((aa)object2).d == 2) {
            ((q)((am)object).a).a((ai)((aa)object2).a);
            return;
        }
        if (((am)object).j == 3 && ((aa)object2).d == 2) {
            object2 = (ai)((aa)object2).a;
            object = (ap)((am)object).a;
            if (!(((ap)object).a.b == 93 || ((ai)object2).a() || ((ai)object2).d == 2 && ((ap)object).b != 4 || ((ai)object2).d == 5 || ((ap)object).a.c().a() <= 0xA00000L)) {
                int n2 = 0;
                while (n2 < ((ap)object).a.a.length) {
                    int n3 = n2++;
                    ((ap)object).a.e[n3] = ((ap)object).a.e[n3] + 30;
                }
                Object object3 = ((ai)object2).a;
                object3 = ((aa)object3).a.a;
                ((ap)object).a.a.a(((as)object3).a >> 10, ((as)object3).b >> 10, 30, 30);
                ((ai)object2).b();
            }
            return;
        }
        if (this.b == 93 && ((am)object).j == 3 && ((aa)object2).d == 5 && this.a.c <= 1) {
            ++this.a.c;
            this.a.c(10);
            return;
        }
        if (this.e != 4 && this.e != 5 && ((am)object).j == 1 && (((q)((am)object).a).a != 1 || ((q)((am)object).a).e == 0) && ((aa)object2).d == 6) {
            this.a.b(((aa)object2).c);
            ((aa)object2).a.b |= 0x10;
            object2 = (q)((aa)object2).a;
            --((q)object2).g;
            if (((q)object2).g == 0) {
                ((q)object2).a = null;
                object = ((q)((am)object).a).a.a();
                int n4 = ((as)object).a >> 15;
                int n5 = ((as)object).b >> 15;
                if (this.a.a(n4, n5 - 1) != 0) {
                    ((q)object2).a(n4 << 5, n5 - 1 << 5);
                } else if (this.a.a(n4 - 1, n5) != 0) {
                    ((q)object2).a(n4 - 1 << 5, n5 << 5);
                } else if (this.a.a(n4 + 1, n5) != 0) {
                    ((q)object2).a(n4 + 1 << 5, n5 << 5);
                } else {
                    ((q)object2).a(n4 << 5, n5 + 1 << 5);
                }
                ((q)object2).d >>= 2;
                ((q)object2).d = (byte)2;
            }
        }
    }
}

