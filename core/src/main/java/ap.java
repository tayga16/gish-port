/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ap {
    public byte a;
    public am a;
    public boolean a;
    public static af[] a;
    ar a;
    int a;
    public byte b;
    byte c;
    static int[][] a;
    public int b;
    public int c;
    public boolean b;

    public ap(ar ar2, byte by, int n2, int n3) {
        this.a = ar2;
        this.b = by;
        this.b = n2;
        this.c = n3;
    }

    public final void a() {
        this.a = 0;
        this.a = -1;
        this.b = false;
        int n2 = this.b << 15;
        int n3 = this.c << 15;
        Object object = null;
        switch (this.b) {
            case 0: {
                object = y.a(32);
                this.c = 0;
                break;
            }
            case 1: {
                object = y.a(96, 32, false);
                this.c = 1;
                break;
            }
            case 7: {
                object = y.a(64, 32, false);
                this.c = 0;
                break;
            }
            case 2: {
                object = y.a(96, 32, false);
                this.c = 1;
                break;
            }
            case 8: {
                object = y.a(128, 32, false);
                this.c = 1;
                break;
            }
            case 6: {
                object = new as[]{new as(33, -63), new as(31, 31), new as(0, 32), new as(0, -64)};
                y.a(object);
                this.c = 1;
                break;
            }
            case 3: {
                object = new as[]{new as(32, -64), new as(32, 32), new as(0, 32), new as(0, -64)};
                y.a(object);
                this.c = 1;
                break;
            }
            case 10: {
                object = new as[]{new as(32, -96), new as(32, 32), new as(0, 32), new as(0, -96)};
                y.a(object);
                this.c = 1;
                break;
            }
            case 4: {
                object = new as[]{new as(2, 2), new as(62, 2), new as(62, 62), new as(1, 62)};
                y.a(object);
                this.c = (byte)2;
                n3 -= 32 << 10;
                break;
            }
            case 5: {
                object = y.a(16, 10);
                this.c = (byte)3;
                n2 += 16384;
                break;
            }
            case 9: {
                object = y.a(96, 21, false);
                this.c = (byte)4;
                break;
            }
            case 11: {
                object = y.a(256, 32, false);
                this.c = 1;
            }
        }
        this.a = null;
        this.a = new am(this.b == 5 ? 100000 : 0, false, false, this.b == 2 || this.b == 8 || this.b == 11, this.b == 0 || this.b == 4 || this.b == 7 || this.b == 9);
        int n4 = this.a.j = this.b == 2 || this.b == 8 || this.b == 11 ? 4 : 3;
        if (this.b == 9) {
            this.a.h = 2;
        }
        this.a.a = this;
        int n5 = this.b != 5 ? 1 : 0;
        am am2 = this.a;
        am2.d = n5 != 0 ? (am2.d |= 2) : (am2.d &= 0xFFFFFFFD);
        for (int i2 = 0; i2 < ((as[])object).length; ++i2) {
            object[i2].a += n2;
            object[i2].b += n3;
        }
        this.a.a((as[])object, this.b == 4 ? 51200 : 2048);
        if (this.b != 5) {
            this.a.a(1024, 1024, -512, -512);
            n2 = -512;
            n5 = 1024;
            am am3 = this.a;
            n2 = am3.a.size();
            n2 >>= 1;
            for (n3 = 0; n3 < n2; ++n3) {
                object = new t((s)am3.a.elementAt(n3), (s)am3.a.elementAt(n2 + n3), 1024, -512, -1);
                am3.a((t)object);
            }
        } else {
            this.a.a(1024, 512, -512, -512);
        }
        this.a.a();
        if (this.b == 6) {
            this.a.a[2].a = Integer.MAX_VALUE;
        }
        if (this.a.a != null && this.a.a.b) {
            this.a.a.a(this.a);
        }
    }

    public final void b() {
        this.a = (byte)2;
        as as2 = this.a.a();
        this.a.a.a(as2.a >> 10, as2.b >> 10, 0);
    }
}

