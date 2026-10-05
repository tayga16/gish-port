/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ai {
    public byte a;
    public aa a;
    public aa b;
    private int b;
    public boolean a;
    private q a;
    private ar a;
    private static final int[][] a = new int[][]{{279, 280, 288, 293}, {218, 219, 230, 234, 227}, {238, -1, 239, 242, 248}, {251, -1, 256, 252, 304}, {297, 306}, {300}};
    private static final int[][] b = new int[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 3}, {1, 0, 3, 6, 3}, {1, 0, 3, 4, 2}, {3, 2}, {4}};
    private static final byte[][] a = new byte[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 0}, {1, 0, 3, 6, 3}, {8, 0, 3, 4, 0}, {4, 0, 12, 2, 0}, {4, 0, 10, 0, 0}};
    private static final byte[][] b = new byte[][]{{0, 2, 2, 4, 0}, {0, 2, 4, 6, 0}, {0, 0, 4, 4, 0}, {2, 0, 4, 4, 0}, {4, 0, 2, 0, 0}, {4, 0, 2, 0, 0}};
    private static int[] c = new int[]{3, 1, 4, -1, 2, 1, 1};
    public byte b;
    public byte c;
    public static final int[] a = new int[]{0, 1, 2, -1, 3, 4, 5};
    public byte d;
    private static Image[][][] a;
    public boolean b;
    private boolean d;
    public int a;
    private int c;
    private int[] d;
    public boolean c;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static int[] h;
    private static final int[] i;
    public static final int[] b;
    private static final int[] j;

    public ai(ar ar2) {
        this.a = ar2;
        this.a = (byte)2;
    }

    public final void a(byte by, as as2, boolean bl) {
        this.d = by;
        this.a = 0;
        this.a = false;
        this.b = false;
        this.a = null;
        this.b = null;
        this.b = 0;
        this.c = 0;
        this.a = -1;
        this.c = 0;
        if (this.d == 4) {
            this.a = new aa(new s(as2, 0), 39936);
            this.a.b = 0;
            this.d = false;
            return;
        }
        if (this.d == 0) {
            this.a = new aa(new s(as2, 6144), 12288);
            this.d = true;
        } else if (this.d == 1) {
            as2.b += 3072;
            this.a = new aa(new s(as2, 16384), 13312);
            this.b = new aa(new s(as2.b(new as(0, 32768)), 16384), 14336);
            this.b.d = 2;
            this.b.a = this;
            this.a.d = 5;
            this.a.a = this;
            this.b.b = 0;
            if (this.a.a != null && this.a.a.b) {
                this.a.a.a(this.b);
            }
            this.b = this.b.a.a.b - this.a.a.a.b;
            this.b.a = this.a;
            this.a.a = this.b;
            this.d = true;
        } else if (this.d == 2) {
            this.a = new aa(new s(as2, 1000000), 15360);
            this.d = false;
        } else if (this.d == 5) {
            this.a = new aa(new s(as2.b(new as(0, 32768)), Integer.MAX_VALUE), 45056);
            this.a.b = 0;
            this.c = 40;
            this.d = false;
        } else if (this.d == 6) {
            this.a = new aa(new s(as2.b(new as(0, 13312)), Integer.MAX_VALUE), 13312);
            this.a.b = 0;
            this.d = false;
        }
        if (this.b == null) {
            this.a.d = 2;
            this.a.a = this;
        }
        if (this.d != 5 && this.d != 6) {
            this.a.b = 102;
        }
        if (this.a.a != null && this.a.a.b) {
            this.a.a.a(this.a);
        }
    }

    public final int[] a() {
        if (this.d == 6) {
            if (this.d == null) {
                this.d = new int[4];
            }
            this.d[0] = this.a.a.a.a - this.a.a;
            this.d[2] = this.a.a.a.a + this.a.a;
            this.d[3] = this.d[1] = this.a.a.a.b + this.a.a * (this.c < 0 ? -1 : 1);
            if (this.c < 0) {
                this.d[3] = this.d[3] + (-this.c << 15);
            } else {
                this.d[1] = this.d[1] - (this.c << 15);
            }
            return this.d;
        }
        if (this.b == null) {
            return this.a.a();
        }
        if (this.d == null) {
            this.d = new int[4];
        }
        int[] nArray = this.b.a();
        this.d[0] = nArray[0];
        this.d[1] = nArray[1];
        this.d[2] = nArray[2];
        this.d[3] = nArray[3];
        if (this.d == 1) {
            this.d[3] = this.d[3] + 38912;
        }
        return this.d;
    }

    public static void a(ad ad2) {
        if (a == null) {
            a = new Image[a.length][][];
        }
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (ad2.a(256 + a[i2][0]) == null) {
                ai.a[i2] = null;
                continue;
            }
            ai.a[i2] = new Image[a[i2].length][];
            for (int i3 = 0; i3 < a[i2].length; ++i3) {
                if (a[i2][i3] == -1) continue;
                ai.a[i2][i3] = ad2.a(256 + a[i2][i3], b[i2][i3], i2 < 2);
            }
        }
    }

    public static void a(ad ad2, int n2) {
        for (int i2 = 0; i2 < a[n2].length; ++i2) {
            if (a[n2][i2] == -1) continue;
            for (int i3 = 0; i3 < b[n2][i2]; ++i3) {
                ad2.a(256 + a[n2][i2] + i3);
            }
        }
    }

    private int a() {
        switch (this.a) {
            case 0: 
            case 6: {
                return 0;
            }
            case 3: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
        }
        return 0;
    }

    public final void a(byte by) {
        if (this.a.b != 4 && (this.d == 2 || this.d == 5) && by == 4) {
            boolean bl = false;
            int n2 = this.a.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a.a[i2].a != 2 || this.a.a[i2].d != 0) continue;
                bl = true;
                break;
            }
            if (this.d == 5) {
                this.c = 100;
            }
            if (bl && this.d == 2) {
                this.c = 45;
            }
            if (!bl) {
                return;
            }
        }
        this.a = by;
        this.b = 0;
        this.c = 0;
    }

    public final boolean a() {
        return this.a == 1 || this.a == 2 || this.a == 5;
    }

    public final void a(Graphics graphics) {
        int n2;
        if (this.a == 2) {
            return;
        }
        int n3 = this.a();
        if (this.b < a[a[this.d]][n3]) {
            n2 = this.a.a.a.a >> 10;
            int n4 = this.a.a.a.b >> 10;
            if (this.d == 4) {
                Image image = a[a[this.d]][0][0];
                byte by = this.b;
                if (n3 == 0) {
                    by = 0;
                    n4 = this.b < 4 ? (n4 += (this.b << 1) - 4) : (n4 += (7 - this.b << 1) - 4);
                }
                ad.a(graphics, a[a[this.d]][n3], n2 + (a[a[this.d]][n3][by].getWidth() - image.getWidth() >> 1) * (this.a ? 1 : -1), n4 + (image.getHeight() >> 1), by, !this.a, false, 33);
                if (this.a == 0 || this.a == 3) {
                    n3 = -1;
                    if ((this.a.a.d & 0x10) == 0) {
                        n3 = this.a.a.d >> 1 & 0xF;
                        int n5 = n3 == 0 || n3 == 2 ? 0 : (n3 = n3 == 1 ? 1 : -1);
                    }
                    if (n3 != -1) {
                        ad.a(graphics, a[a[this.d]][4], n2 + 11 * (this.a ? 1 : -1), n4 - 15, n3, !this.a, false, 3);
                    }
                }
            } else if (this.d == 5) {
                n4 += 48;
                if (this.a == 1) {
                    n4 = this.a.b == 128 ? (n4 += this.b * 7) : (n4 += this.b * 10);
                }
                Image[] imageArray = a[a[this.d]][0];
                graphics.drawImage(imageArray[0], n2, n4, 33);
                int n6 = -1;
                if ((this.a.a.d & 0x10) == 0) {
                    n6 = this.a.a.d >> 1 & 0xF;
                    int n7 = n6 == 0 || n6 == 2 ? 0 : (n6 = n6 == 1 ? 1 : -1);
                }
                if (this.a == 6) {
                    n6 = 1;
                }
                if (n6 != -1) {
                    graphics.drawImage(a[a[this.d]][1][n6], n2, n4, 33);
                }
                ad.a(graphics, imageArray, n2 - 16, n4, 2, false, false, 40);
                ad.a(graphics, imageArray, n2 + 16, n4, 2, true, false, 36);
                n4 -= 37;
                n3 = a[a[this.d]][0];
                n6 = 0;
                if (!this.a()) {
                    n6 = this.b << 1 < n3 >> 1 ? this.b << 1 : n3 - (this.b << 1);
                }
                int n8 = -2 + this.a.b * 6;
                if (this.a.b > 0) {
                    n8 += n6;
                    n6 = 0;
                }
                if (this.a == 6) {
                    n8 = -10;
                    n6 = -3;
                    n4 += 5;
                }
                ad.a(graphics, imageArray, n2 - n8, n4 - n6 + (n3 >> 1), 1, false, false, 40);
                ad.a(graphics, imageArray, n2 + n8, n4 + n6, 1, true, false, 36);
            } else if (this.d == 6) {
                int n9 = this.c < 0 ? -this.c : this.c;
                int n10 = this.c < 0 ? -1 : 1;
                n4 += ((n9 * 32 - this.a.b << 5) / 32 + (this.a.a >> 10)) * n10;
                for (n3 = 0; n3 < n9; ++n3) {
                    graphics.drawImage(a[a[this.d]][0][this.b], n2, n4 - (n3 << 5) * n10, 1 | (this.c < 0 ? 16 : 32));
                }
            } else if (this.d == 2) {
                graphics.drawImage(a[a[this.d]][n3][this.b], n2, n4 + 16, 33);
                if (n3 == 3 && this.b >= 3 && this.b <= 5) {
                    graphics.drawImage(a[a[a[this.d]]][4][this.b - 3], n2, n4 - 14, 33);
                }
            } else {
                if (this.d == 0) {
                    n4 += 12;
                } else if (this.d == 1) {
                    n4 += 13;
                }
                ad.a(graphics, a[a[this.d]][n3], n2, n4, this.b, this.a, true, 33);
            }
        }
        if (this.b != null) {
            if (this.a == 5) {
                n2 = this.b.a * (5 - this.b) / 5 >> 10;
                graphics.setColor(49, 49, 49);
                graphics.fillArc((this.b.a.a.a >> 10) - n2, (this.b.a.a.b >> 10) - n2, n2 << 1, n2 << 1, 0, 360);
                return;
            }
            int n11 = n2 = this.a == 4 || this.a == 1 ? 2 : 1;
            if (this.a != null) {
                as as2 = this.a.a.a().b(this.b.a.a);
                if (as2.b < 0 && (as2.a < 0 ? -as2.a : as2.a) < -as2.b) {
                    n2 = 0;
                }
            }
            ad.a(graphics, a[this.d][4], this.b.a.a.a >> 10, this.b.a.a.b >> 10, n2, n2 == 0 ? false : this.a, true, 3);
        }
    }

    private void a(int n2) {
        as as2;
        boolean bl;
        ai ai2 = this.a.a[n2];
        int n3 = this.a.a.a.a >> 15;
        int n4 = this.a.a.a.b >> 15;
        if (this.a.b == 128 && n2 <= 1) {
            bl = false;
            int n5 = n2 == 0 ? -3 : 3;
            as2 = this.a.a.a.a(new as(n5 << 15, 311296));
        } else {
            int n6;
            boolean bl2;
            bl = y.b(0, 1) == 1;
            if (bl) {
                n4 -= 3;
            }
            int n7 = 0;
            do {
                n6 = this.a.b == 128 ? ((n2 & 1) == 0 ? y.b(-6, -2) : y.b(2, 6)) : (bl ? y.b(-8, 1) : y.b(-7, -2));
                bl2 = false;
                for (int i2 = 0; i2 < this.a.a.length; ++i2) {
                    ai ai3 = this.a.a[i2];
                    if (ai3.d != 6 || ai3.a() || ai3.a.a.a.a >> 15 != n3 + n6 || ai3.a.a.a.b >> 15 != n4) continue;
                    bl2 = true;
                }
            } while (bl2 && ++n7 < 100);
            as2 = this.a.a.a.a(new as(n6 << 15, 16384 - (bl ? 131072 : 0)));
        }
        ai2.a((byte)6, as2, true);
        if (this.a.b == 123) {
            ai2.a = 200;
        }
        if (bl) {
            ai2.a.a.a.b += ai2.a.a << 1;
            ai2.c = -y.b(1, 2);
            return;
        }
        if (this.a.b == 128 && n2 <= 1) {
            ai2.c = 2;
            return;
        }
        ai2.c = y.b(1, 2);
    }

    public final void a() {
        block101: {
            block105: {
                int n2;
                block109: {
                    block108: {
                        as as2;
                        block107: {
                            block106: {
                                int n3;
                                block102: {
                                    block104: {
                                        block103: {
                                            int n4;
                                            if (this.a == 2) {
                                                return;
                                            }
                                            if (this.d == 6 && this.a == 1) {
                                                this.a.b -= 3;
                                                if (this.a.b <= 0) {
                                                    this.a = (byte)2;
                                                    this.d = 0;
                                                }
                                                return;
                                            }
                                            int n5 = this.a();
                                            if (n5 == 4) {
                                                if (this.c == 1) {
                                                    this.c = 0;
                                                    this.b = (byte)(this.b + 1);
                                                    if (this.b == 5) {
                                                        this.a = (byte)2;
                                                        this.a.a.b(this.b.c);
                                                    }
                                                }
                                                this.c = (byte)(this.c + 1);
                                                return;
                                            }
                                            if (this.c >= b[a[this.d]][n5]) {
                                                this.c = 0;
                                                this.b = (byte)(this.b + 1);
                                                if (this.a == 1) {
                                                    if (this.b != null) {
                                                        if (this.b >= 15 && (this.b.a.b & 2) != 0) {
                                                            this.a = (byte)5;
                                                            this.b = 0;
                                                            this.c = 0;
                                                            return;
                                                        }
                                                    } else if (this.b == a[a[this.d]][n5]) {
                                                        this.a = (byte)2;
                                                        if (this.d == 4 || this.d == 5) {
                                                            this.a.a.c = 6;
                                                        }
                                                        if (this.d == 5) {
                                                            this.a = 1;
                                                            this.b = (byte)(this.b - 1);
                                                        }
                                                        return;
                                                    }
                                                } else if (this.b == a[a[this.d]][n5]) {
                                                    this.b = 0;
                                                    if (n5 == 3 && this.c > 0) {
                                                        this.a((byte)0);
                                                    }
                                                }
                                            }
                                            this.c = (byte)(this.c + 1);
                                            if (this.a == 1) {
                                                return;
                                            }
                                            if (this.a.b != 77 && (this.a.a.b & 2) != 0 && ((this.a.a.b & 0x40) != 0 || this.b != null && (this.b.a.b & 0x40) != 0) && ((n5 = this.a.a.a.b - this.a.a.b.b) > j[this.d] || n5 < -j[this.d])) {
                                                n5 = 0;
                                                while (n5 < this.a.a.length) {
                                                    int n6 = n5++;
                                                    this.a.e[n6] = this.a.e[n6] + 30;
                                                }
                                                aa aa2 = this.a;
                                                as as3 = aa2.a.a;
                                                this.a.a.a(as3.a >> 10, as3.b >> 10, 30, 30);
                                                this.b();
                                                return;
                                            }
                                            if (this.d == 2 && this.a.a()[1] >= this.a.e << 15) {
                                                this.a = (byte)2;
                                                return;
                                            }
                                            n5 = this.a.a(this.a.a());
                                            if (n5 != -1) {
                                                if (!this.b && this.a.a.g > 0 && y.a(this.a.a.d, this.a.a())) {
                                                    aa aa3 = this.a;
                                                    this.a.a.a(aa3.a.a.a >> 10, n5 << 5, 2);
                                                }
                                                this.b = true;
                                                int n7 = n5 << 15;
                                                n5 = 6;
                                                n5 = 200;
                                                n4 = n7;
                                                aa aa4 = this.a;
                                                if ((n4 = (int)(((long)(aa4.a[3] - n4) << 10) / (long)(aa4.a[3] - aa4.a[1]))) > 1024) {
                                                    n4 = 1024;
                                                }
                                                if (n4 > 0) {
                                                    n4 = (int)((long)-200 * (long)n4 >> 9);
                                                    aa4.a(new as(0, n4 -= aa4.a.a.b - aa4.a.b.b >> 6));
                                                }
                                            } else {
                                                this.b = false;
                                            }
                                            if (this.b != null) {
                                                int n8;
                                                this.b.a.a.a = n8 = this.b.a.a.a + this.a.a.a.a >> 1;
                                                this.a.a.a.a = n8;
                                                n4 = this.b.a.a.b - this.a.a.a.b - this.b >> 1;
                                                this.b.a.a.b -= n4;
                                                this.a.a.a.b += n4;
                                            }
                                            if (this.a.b == 93) {
                                                int n9 = 0;
                                                if (this.a.a.c <= 1) {
                                                    n9 = -f[this.d] >> 2;
                                                    this.a = false;
                                                } else {
                                                    n9 = this.a.a.a.a >> 15 >= 19 ? -f[this.d] >> 2 : f[this.d] << 1;
                                                    this.a = true;
                                                }
                                                this.a.a(new as(n9, 0));
                                                if (this.a != 3) {
                                                    this.a((byte)3);
                                                }
                                                if (this.b.a.a.b >> 15 >= this.a.e) {
                                                    ++this.a.a.c;
                                                    this.a.a.b(this.a.a[0].a);
                                                    this.a.a.b(this.a.a[1].a);
                                                    this.a.a.a(this.a.a);
                                                    this.a.a.a(this.b.a);
                                                    this.a.a = null;
                                                    this.a.a = new ap[0];
                                                    this.a.a = null;
                                                    this.a.a = new t[0];
                                                    this.a.a = null;
                                                    this.a.a = new ai[0];
                                                    this.a.a.g();
                                                    this.a.a.c(15);
                                                }
                                                return;
                                            }
                                            aa aa5 = this.a;
                                            as2 = aa5.a.a;
                                            if (this.a != null) {
                                                if (this.a.a()) {
                                                    this.a = null;
                                                } else if (this.a.a.a().b(as2).d() > e[this.d]) {
                                                    this.a = null;
                                                }
                                            }
                                            if (this.a == null) {
                                                for (int i2 = 0; i2 < this.a.a.length; ++i2) {
                                                    if (this.a.a[i2].a() || (n3 = this.a.a[i2].a.a().b(as2).d()) < 0 || n3 > e[this.d] || this.a != null && n3 >= this.a.a.a().b(as2).d()) continue;
                                                    this.a = this.a.a[i2];
                                                }
                                            }
                                            if (this.a != null) {
                                                Object object = this.a.a.a().b(as2);
                                                if (this.d == 4) {
                                                    if (this.a.b == 107) {
                                                        if (this.a.a.c == 0) {
                                                            this.a = true;
                                                            return;
                                                        }
                                                        if (((as)object).d() > h[this.d] / 2) {
                                                            ((as)object).b();
                                                            if (this.a.b < f[this.d]) {
                                                                this.a.b += f[this.d] / 30;
                                                            }
                                                            ((as)object).a(this.a.b);
                                                            as2.a((as)object);
                                                            this.a = ((as)object).a >= 0;
                                                            object = this.a;
                                                            this.a.a = true;
                                                        }
                                                        if (this.a.a.c == 3) {
                                                            n3 = as2.a >> 15;
                                                            int n10 = as2.b >> 15;
                                                            boolean bl = false;
                                                            for (int i3 = n3 - 1; i3 <= n3 + 1; ++i3) {
                                                                for (int i4 = n10 - 1; i4 <= n10 + 1; ++i4) {
                                                                    if (i3 < 0 || i4 < 0 || i3 >= this.a.d || i4 >= this.a.e || this.a.a[0][i3][i4] != 30) continue;
                                                                    bl = true;
                                                                }
                                                            }
                                                            if (bl) {
                                                                this.a.a.c = 4;
                                                                this.a.a.c(97);
                                                                return;
                                                            }
                                                        }
                                                        if (this.a.a.c == 4) {
                                                            this.a.a.c = 5;
                                                            this.b();
                                                        }
                                                        if (this.a.a.c != 1) {
                                                            return;
                                                        }
                                                    } else {
                                                        if (this.a.a.c == 0) {
                                                            this.a = true;
                                                            return;
                                                        }
                                                        if (this.a.a.c == 4) {
                                                            this.a.a.c = 5;
                                                            this.b();
                                                        }
                                                        if (((as)object).d() > h[this.d] / 2) {
                                                            ((as)object).b();
                                                            if (this.a.b < f[this.d] / 2) {
                                                                this.a.b += f[this.d] / 60;
                                                            }
                                                            ((as)object).a(this.a.b);
                                                            as2.a((as)object);
                                                            this.a = ((as)object).a >= 0;
                                                            object = this.a;
                                                            this.a.a = true;
                                                        }
                                                        if (this.a.a.c == 3 && y.b(this.a.a.d, this.a.a())) {
                                                            this.a.a.c = 4;
                                                            this.a.a.c(107);
                                                        }
                                                    }
                                                } else {
                                                    if (((as)object).a < -5120) {
                                                        this.a = false;
                                                    }
                                                    if (((as)object).a > 5120) {
                                                        this.a = true;
                                                    }
                                                    if (((as)object).d() > h[this.d] && this.d && (this.b || (this.a.a.b & 1) != 0)) {
                                                        n3 = 0;
                                                        n3 = (this.a.a.b & 1) != 0 && this.b ? f[this.d] >> 1 : (this.b ? f[this.d] >> 4 : f[this.d]);
                                                        this.a.a(new as(this.a ? n3 : -n3, 0));
                                                    }
                                                }
                                            }
                                            if (this.a != 4) break block102;
                                            if (this.a != null || this.d == 2) break block103;
                                            this.a((byte)0);
                                            break block101;
                                        }
                                        if (this.a == null || this.a.a.a().b(as2).d() <= g[this.d]) break block104;
                                        if (this.d) break block105;
                                        this.a((byte)0);
                                        break block101;
                                    }
                                    if ((this.d == 2 || this.d == 5) && this.a.b != 189) {
                                        if (this.b == c[this.d] && this.c == 1) {
                                            int n11 = this.a.a.length;
                                            for (n3 = 0; n3 < n11; ++n3) {
                                                ai ai2 = this.a.a[n3];
                                                if (ai2.a != 2 || ai2.d != 0) continue;
                                                if (this.d == 2) {
                                                    if (y.a(this.a.a.d, this.a())) {
                                                        this.a.a.a(11, false);
                                                    }
                                                    if (this.a.b == 2 && y.a(this.a.d, this.a())) {
                                                        this.a.a.addElement(new byte[]{13});
                                                    }
                                                    ai2.a((byte)0, as2.a(new as(0, -23552)), true);
                                                    ai2.a = 60;
                                                    ai2.a.a.b.a = ai2.a.a.a.a + ((this.a ? -1 : 1) * y.b(1, 2) << 10);
                                                    ai2.a.a.b.b = ai2.a.a.a.b + (y.b(2, 5) << 10);
                                                } else {
                                                    if (this.a.b == 128 && n3 <= 1) continue;
                                                    this.a(n3);
                                                }
                                                break block101;
                                            }
                                        }
                                    } else if (this.b == c[this.d] && this.c == 1 && this.a.a.a().b(as2).d() <= h[this.d]) {
                                        if (this.a == -1) {
                                            if (y.a(this.a.a.d, this.a())) {
                                                this.a.a.a(10, false);
                                            }
                                            if (this.a.b == 2 && y.a(this.a.d, this.a())) {
                                                this.a.a.addElement(new byte[]{12});
                                            }
                                        }
                                        if (this.d == 4 && this.a.b == 112) {
                                            this.a.b(b[this.d] >> 1);
                                        } else {
                                            this.a.b(b[this.d]);
                                        }
                                        if (this.d == 4) {
                                            this.a.b = 0;
                                        }
                                    }
                                    break block101;
                                }
                                if (this.d != 5) break block106;
                                if (this.a.b == 123 && this.a.a.c == 2 && y.b(this.a.a.d, this.a())) {
                                    this.b();
                                    return;
                                }
                                if (this.a.b == 128 && this.a.a.c == 0) {
                                    for (int i5 = 0; i5 < this.a.a.length - 1; ++i5) {
                                        this.a(i5);
                                    }
                                    this.a.a.c = 1;
                                }
                                if (this.a == 0 && this.a.a.c == 1 && this.a.b == 0 && this.c == 0) {
                                    this.a((byte)4);
                                }
                                if (this.a == 0 && this.a != null && this.a.b == 128) {
                                    int n12 = this.a.a.a.a - this.a.a.a().a;
                                    if (n12 < 0) {
                                        n12 = -n12;
                                    }
                                    int n13 = n3 = n12 < 32768 ? 1 : 0;
                                    if (this.a.a[0].a() && this.a.a[1].a() && this.a.a.a()[3] < this.a.a.a.b - this.a.a) {
                                        n3 = 0;
                                    }
                                    if (n3 != 0 && this.a.b < 3) {
                                        if (++this.a.b == 3) {
                                            this.a.a.b(this.a.c);
                                        }
                                    } else if (n3 == 0 && this.a.b > 0 && this.a.b-- == 3) {
                                        this.a.a.a(this.a);
                                    }
                                }
                                if (this.a == 0 && this.a.b == 128 && this.a.b == 0 && this.a.a[0].a() && this.a.a[1].a() && this.a != null && this.a.a.a().b < this.a.a.a.b + this.a.a) {
                                    this.a((byte)6);
                                    this.a.a.c(150);
                                    this.a.b = (byte)2;
                                }
                                break block101;
                            }
                            if (this.d != 6) break block107;
                            int n14 = 32 * (this.c < 0 ? -this.c : this.c);
                            if (this.a.b < n14) {
                                this.a.b += 3;
                                if (this.a.b > n14) {
                                    this.a.b = n14;
                                }
                            }
                            if (this.a != null && y.a(this.a.a.a(), this.a())) {
                                this.a.b(b[this.d]);
                            }
                            break block101;
                        }
                        if (this.d != 2 && (this.a == null || this.c != 0 || this.a.a.a().b(as2).d() > g[this.d])) break block108;
                        this.a((byte)4);
                        break block101;
                    }
                    if (this.a != 3) break block109;
                    int n15 = this.a.a.a.a - this.a.a.b.a;
                    if (n15 > -i[this.d] && n15 < i[this.d]) {
                        this.a((byte)0);
                    }
                    break block101;
                }
                if (!this.d || this.a != 0 || (n2 = this.a.a.a.a - this.a.a.b.a) > -i[this.d] && n2 < i[this.d]) break block101;
            }
            this.a((byte)3);
        }
        if (this.d != 6 && this.c > 0) {
            --this.c;
        }
        if (this.a != -1) {
            --this.a;
            if (this.a == 0) {
                this.b();
            }
        }
    }

    public final void b() {
        if (!this.a()) {
            if ((this.d != 5 || this.a.b == 128) && this.a == -1 && y.a(this.a.a.d, this.a())) {
                this.a.a.a(this.d == 1 ? 8 : 4, false);
            }
            this.a((byte)1);
            this.a = null;
            if (this.d != 4 && (this.d != 5 || this.a.b != 3)) {
                this.a.a.b(this.a.c);
            }
            if (this.d == 5 && this.a.b == 128) {
                int n2 = this.a.a.a.a >> 15;
                int n3 = this.a.a.a.b >> 15;
                this.a.a[1][n2][n3 + 2] = 69;
                this.a.a.a(n2, n3 + 2);
            }
            this.a.a = null;
            if (this.b != null) {
                this.b.a = null;
            }
        }
    }

    static {
        e = new int[]{0x3200000, 1048576000, 1048576000, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        f = new int[]{500, 400, 250, 0, 2764, 0, 0};
        g = new int[]{0x300000, 0x280000, Integer.MAX_VALUE, -1, 0x500000, Integer.MAX_VALUE, 0x300000};
        h = new int[]{0x1E6666, 0x280000, 0, -1, 0x600000, -1, 0x300000};
        i = new int[]{500, 300, 200, 0, 0, 0, 0};
        b = new int[]{10240, 20480, 0, -1, 5120, 512, 512};
        j = new int[]{3072, 3072, 0, -1, 0};
    }
}

