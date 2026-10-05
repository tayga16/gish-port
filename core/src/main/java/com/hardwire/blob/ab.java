package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ab {
    private int g = 16;
    private int h = 32;
    private int i = 32;
    public Vector a;
    public Vector b;
    public Vector c;
    public boolean a;
    public au[] a;
    public int a;
    public am[] a;
    public int b;
    public aa[] a;
    public int c;
    public byte[][] a;
    public byte[][] b;
    public as[][] a;
    public boolean[] a;
    public int d;
    public int e;
    public ar a;
    public ak a;
    public ak b;
    public ak c;
    public int[][] a;
    public int[] a;
    public int[] b;
    public int[][] b;
    public int f;
    public boolean b = false;

    public final void a(byte[][] byArray, byte[][] byArray2, as[][] asArray, boolean[] blArray, int n2, int n3, int n4, int n5) {
        int n6;
        this.h = n3;
        this.g = n4;
        this.i = n5;
        this.a = byArray;
        this.b = byArray2;
        if (this.a == null) {
            return;
        }
        this.a = asArray;
        this.a = blArray;
        this.d = 15;
        this.a = new ak(this.a.length << this.d, this.a[0].length << this.d, this.h);
        this.c = new ak(this.a.length << this.d, this.a[0].length << this.d, this.i);
        this.b = new ak(this.a.length << this.d, this.a[0].length << this.d, this.g);
        this.a = new am[this.h];
        this.b = 0;
        this.a = new au[this.g];
        this.a = 0;
        this.a = new aa[this.i];
        this.c = 0;
        this.a = true;
        int n7 = this.b.size();
        for (n6 = 0; n6 < n7; ++n6) {
            this.a((am)this.b.elementAt(n6));
        }
        n7 = this.a.size();
        for (n6 = 0; n6 < n7; ++n6) {
            this.a((au)this.a.elementAt(n6));
        }
        n7 = this.c.size();
        for (n6 = 0; n6 < n7; ++n6) {
            this.a((aa)this.c.elementAt(n6));
        }
        this.b.removeAllElements();
        this.a.removeAllElements();
        this.c.removeAllElements();
        this.b = null;
        this.a = null;
        this.c = null;
        for (n6 = 0; n6 < this.b; ++n6) {
            this.a.a(n6, this.a[n6].a());
        }
        for (n6 = 0; n6 < this.a; ++n6) {
            this.b.a(n6, this.a[n6].a());
        }
        for (n6 = 0; n6 < this.c; ++n6) {
            this.c.a(n6, this.a[n6].a());
        }
    }

    public final void a(am am2) {
        if (!this.a) {
            this.b.addElement(am2);
            return;
        }
        am2.d &= 0xFFFFFFEF;
        am2.i = this.b;
        this.a[this.b++] = am2;
        if (this.a != null) {
            this.a.a(this.b - 1, am2.a());
        }
    }

    public final void a(au au2) {
        if (!this.a) {
            this.a.addElement(au2);
            return;
        }
        this.a[this.a++] = au2;
        au2.b = this.a - 1;
        if (this.b != null) {
            this.b.a(au2.b, au2.a());
        }
    }

    public final void b(am am2) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.a[i2] != am2) continue;
            this.a(i2);
            return;
        }
    }

    public final void a(int n2) {
        this.a.b(n2, this.a[n2].a());
        --this.b;
        if (n2 != this.b) {
            this.a.b(this.b, this.a[this.b].a());
        }
        am am2 = this.a[this.b];
        if (this.b > n2) {
            this.a[n2] = this.a[this.b];
            this.a[n2].i = n2;
            this.a.a(n2, this.a[n2].a());
        }
        this.a[this.b] = null;
        if (this.a != null) {
            int n3 = -1;
            for (int i2 = 1; i2 <= this.a[0]; ++i2) {
                if (this.a[i2] == n2) {
                    n3 = i2;
                }
                if (this.a[i2] != this.b) continue;
                this.a[i2] = am2.i;
            }
            if (n3 != -1) {
                if (n3 < this.a[0]) {
                    this.a[n3] = this.a[this.a[0]];
                }
                this.a[0] = this.a[0] - 1;
            }
        }
    }

    public final void a(aa aa2) {
        if (!this.a) {
            this.c.addElement(aa2);
            return;
        }
        this.a[this.c++] = aa2;
        aa2.c = this.c - 1;
        if (this.c != null) {
            this.c.a(this.c - 1, aa2.a());
        }
    }

    public final void a(s s2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (!this.a[i2].a.equals(s2)) continue;
            this.b(i2);
            return;
        }
    }

    public final void b(int n2) {
        this.c.b(n2, this.a[n2].a());
        --this.c;
        aa aa2 = this.a[this.c];
        if (n2 < this.c) {
            this.c.b(this.c, this.a[this.c].a());
            this.a[n2] = this.a[this.c];
            this.c.a(n2, this.a[n2].a());
            this.a[n2].c = n2;
        }
        this.a[this.c] = null;
        if (this.b != null) {
            int n3 = -1;
            for (int i2 = 1; i2 <= this.b[0]; ++i2) {
                if (this.b[i2] == n2) {
                    n3 = i2;
                }
                if (this.b[i2] != this.c) continue;
                this.b[i2] = aa2.c;
            }
            if (n3 != -1) {
                if (n3 < this.b[0]) {
                    this.b[n3] = this.b[this.b[0]];
                }
                this.b[0] = this.b[0] - 1;
            }
        }
    }

    public void a() {
        int n2;
        Object object;
        int n3;
        int n4;
        if (this.a == null) {
            this.a = this.a.a(-1, this.b, this.a);
            n4 = this.a[0];
            for (n3 = 1; n3 <= n4; ++n3) {
                this.a[this.a[n3]].d |= 0x10;
            }
            for (n3 = 1; n3 <= n4; ++n3) {
                object = this.a[this.a[n3]];
                if (((am)object).a == null) continue;
                for (n2 = 0; n2 < ((am)object).a.length; ++n2) {
                    if ((((am)object).a[n2].d & 0x30) != 0) continue;
                    ((am)object).a[n2].d |= 0x10;
                    this.a[0] = this.a[0] + 1;
                    this.a[this.a[0]] = ((am)object).a[n2].i;
                    ++n4;
                }
            }
        }
        if (this.b == null) {
            this.b = this.c.a(-1, this.c, this.a);
            n4 = this.b[0];
            for (n3 = 1; n3 <= n4; ++n3) {
                object = this.a[this.b[n3]];
                if (((aa)object).a == null) continue;
                n2 = 0;
                for (int i2 = 1; i2 <= n4; ++i2) {
                    if (n3 == i2 || this.b[i2] != ((aa)object).a.c) continue;
                    n2 = 1;
                    break;
                }
                if (n2 != 0) continue;
                this.b[0] = this.b[0] + 1;
                this.b[this.b[0]] = ((aa)object).a.c;
                ++n4;
            }
        }
    }

    public static boolean a(s s2, s s3, as[] asArray, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7;
        int n8;
        int n9 = n3 - n5;
        int n10 = n4 - n2;
        int n11 = Integer.MAX_VALUE;
        int n12 = 1;
        int n13 = 0;
        if (asArray[0].a == asArray[asArray.length - 1].a && asArray[0].b == asArray[asArray.length - 1].b) {
            n12 = 0;
            n13 = asArray.length - 2;
        }
        while (n12 < asArray.length - 1) {
            n8 = n12 + 1;
            if (asArray[n8] == null) {
                n12 += 2;
            } else {
                int n14;
                int n15;
                int n16;
                as as2 = asArray[n13];
                as as3 = asArray[n12];
                as as4 = asArray[n8];
                n8 = (int)((long)n9 * (long)(as3.a - n2) + (long)n10 * (long)(as3.b - n3) >> 10);
                if (n8 >= 0 && n8 < n11 && ((n16 = (int)((long)((n7 = as2.a + as4.a >> 1) - n4) * (long)(as3.b - n5) - (long)((n15 = as2.b + as4.b >> 1) - n5) * (long)(as3.a - n4) >> 10)) ^ (n14 = (int)((long)(n7 - n2) * (long)(as3.b - n3) - (long)(n15 - n3) * (long)(as3.a - n2) >> 10))) < 0 && ((n15 = (int)((long)(n2 - n7) * (long)(n5 - n15) - (long)(n3 - n15) * (long)(n4 - n7) >> 10)) ^ (n16 = n15 + n14 - n16)) < 0) {
                    n11 = n8;
                }
            }
            n13 = n12++;
        }
        if (n11 == Integer.MAX_VALUE) {
            return false;
        }
        long l2 = (long)n9 * (long)n9 + (long)n10 * (long)n10 >> 10;
        n13 = (int)((long)n9 * (long)n11 / l2);
        n8 = (int)((long)n10 * (long)n11 / l2);
        if (s2.a != Integer.MAX_VALUE) {
            s2.a.a += n13;
            s2.a.b += n8;
        }
        if (s3.a != Integer.MAX_VALUE) {
            s3.a.a += n13;
            s3.a.b += n8;
        }
        if (n6 != 0) {
            if (bl) {
                n7 = y.a(n9, n10);
                n9 = (int)(((long)n9 << 10) / (long)n7);
                n10 = (int)(((long)n10 << 10) / (long)n7);
                n13 = (s2.a.a + s3.a.a >> 1) - (s2.b.a + s3.b.a >> 1);
                int n17 = (s2.a.b + s3.a.b >> 1) - (s2.b.b + s3.b.b >> 1);
                int n18 = -n10 * n13 + n9 * n17 >> 10;
                if (n6 != 1024) {
                    n18 = n18 * n6 >> 10;
                }
                n13 = -n10 * n18 >> 10;
                n17 = n9 * n18 >> 10;
                s2.b.a += n13 >> 1;
                s2.b.b += n17 >> 1;
                s3.b.a += n13 >> 1;
                s3.b.b += n17 >> 1;
            } else if (n6 == 1024) {
                s2.b.a = s2.a.a;
                s2.b.b = s2.a.b;
                s3.b.a = s3.a.a;
                s3.b.b = s3.a.b;
            } else {
                s2.b.a += (s2.a.a - s2.b.a) * n6 >> 10;
                s2.b.b += (s2.a.b - s2.b.b) * n6 >> 10;
                s3.b.a += (s3.a.a - s3.b.a) * n6 >> 10;
                s3.b.b += (s3.a.b - s3.b.b) * n6 >> 10;
            }
        }
        return true;
    }

    public static as a(s s2, as[] asArray, int n2, int n3, int n4) {
        int n5 = Integer.MAX_VALUE;
        int n6 = 0;
        int n7 = 0;
        as as2 = new as();
        int n8 = 0;
        for (int i2 = 1; i2 < asArray.length; ++i2) {
            if (asArray[i2] != null) {
                as2.a = asArray[n8].b - asArray[i2].b;
                as2.b = asArray[i2].a - asArray[n8].a;
                int n9 = n2 - asArray[n8].a;
                n8 = n3 - asArray[n8].b;
                if ((long)n9 * (long)as2.a + (long)n8 * (long)as2.b < 0L) {
                    return null;
                }
                as2.a();
                n9 = n9 * as2.a + n8 * as2.b >> 10;
                if (n9 < n5) {
                    n5 = n9;
                    n6 = as2.a;
                    n7 = as2.b;
                }
            }
            n8 = ++i2;
        }
        s2.a.a -= n6 * n5 >> 10;
        s2.a.b -= n7 * n5 >> 10;
        if (n4 != 0) {
            if (n4 == 1024) {
                s2.b.a = s2.a.a;
                s2.b.b = s2.a.b;
            } else {
                s2.b.a += (s2.a.a - s2.b.a) * n4 >> 10;
                s2.b.b += (s2.a.b - s2.b.b) * n4 >> 10;
            }
        }
        as2.a = n6;
        as2.b = n7;
        return as2;
    }

    public static as a(s s2, int n2, as[] asArray, int n3, int n4, int n5) {
        int n6 = Integer.MAX_VALUE;
        int n7 = 0;
        int n8 = 0;
        as as2 = new as();
        int n9 = asArray.length;
        int n10 = 0;
        for (int i2 = 1; i2 < n9; ++i2) {
            if (asArray[i2] != null) {
                int n11;
                as as3 = asArray[i2];
                as as4 = asArray[n10];
                int n12 = as3.a - as4.a;
                int n13 = n3 - as4.a;
                int n14 = as3.b - as4.b;
                n10 = n4 - as4.b;
                int n15 = (int)((long)n12 * (long)n13 + (long)n14 * (long)n10 >> 10);
                if (n15 < 0) {
                    n11 = y.a(n13, n10);
                    int n16 = n2 - n11;
                    if (n16 >= 0 && n16 < n6) {
                        n6 = n16;
                        n7 = (int)(((long)(-n13) << 10) / (long)n11);
                        n8 = (int)(((long)(-n10) << 10) / (long)n11);
                    }
                } else {
                    int n17;
                    n11 = (int)((long)n12 * (long)n12 + (long)n14 * (long)n14 >> 10);
                    if (n15 <= n11) {
                        as2.a = -n14;
                        as2.b = n12;
                        as2.a();
                        int n18 = (as2.a * n13 + as2.b * n10 >> 10) + n2;
                        if (n18 < 0) {
                            return null;
                        }
                        if (n18 < n6) {
                            n6 = n18;
                            n7 = as2.a;
                            n8 = as2.b;
                        }
                    } else if ((i2 == n9 - 1 || asArray[i2 + 1] == null) && (n12 = n2 - (n17 = y.a(n13 = n3 - as3.a, n10 = n4 - as3.b))) >= 0 && n12 < n6) {
                        n6 = n12;
                        n7 = (int)(((long)(-n13) << 10) / (long)n17);
                        n8 = (int)(((long)(-n10) << 10) / (long)n17);
                    }
                }
            }
            n10 = ++i2;
        }
        s2.a.a -= n7 * n6 >> 10;
        s2.a.b -= n8 * n6 >> 10;
        if (n5 != 0) {
            if (n5 == 1024) {
                s2.b.a = s2.a.a;
                s2.b.b = s2.a.b;
            } else {
                s2.b.a += (s2.a.a - s2.b.a) * n5 >> 10;
                s2.b.b += (s2.a.b - s2.b.b) * n5 >> 10;
            }
        }
        as2.a = n7;
        as2.b = n8;
        return as2;
    }

    public static boolean a(am am2, am am3) {
        int n2 = 0;
        int n3 = am2.a.length;
        int n4 = am3.a.length;
        int[] nArray = am2.a();
        int[] nArray2 = am3.a();
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = n3 - 1;
        int n18 = n3 - 2;
        while (n16 < n3) {
            s s2 = am2.a[n17];
            as as2 = s2.a;
            if (s2.a != Integer.MAX_VALUE && y.a(nArray2, as2) && am3.a(as2)) {
                int n19;
                int n20;
                int n21;
                s s3;
                s s4;
                int n22 = am2.a[n18].a.b - am2.a[n16].a.b;
                int n23 = am2.a[n16].a.a - am2.a[n18].a.a;
                n2 = Integer.MAX_VALUE;
                n18 = -1;
                int n24 = Integer.MAX_VALUE;
                n10 = -1;
                int n25 = 0;
                int n26 = n4 - 1;
                while (n25 < n4) {
                    s4 = am3.a[n25];
                    s3 = am3.a[n26];
                    if (s3.a.a > s4.a.a) {
                        n21 = s3.a.a;
                        n20 = s4.a.a;
                    } else {
                        n21 = s4.a.a;
                        n20 = s3.a.a;
                    }
                    if (n21 >= nArray[0] && n20 <= nArray[2]) {
                        if (s3.a.b > s4.a.b) {
                            n21 = s3.a.b;
                            n20 = s4.a.b;
                        } else {
                            n21 = s4.a.b;
                            n20 = s3.a.b;
                        }
                        if (n21 >= nArray[1] && n20 <= nArray[3]) {
                            n20 = s4.a.a - s3.a.a;
                            int n27 = as2.a - s3.a.a;
                            n21 = s4.a.b - s3.a.b;
                            int n28 = as2.b - s3.a.b;
                            n19 = (int)((long)n20 * (long)n27 + (long)n21 * (long)n28 >> 10);
                            if (n19 < 0) {
                                int n29 = y.a(n27, n28);
                                if ((int)((long)(-n21) * (long)n22 + (long)n20 * (long)n23 >> 10) > 0) {
                                    if (n29 < n24) {
                                        n24 = n29;
                                        n14 = n27;
                                        n15 = n28;
                                        n10 = -1;
                                        n8 = n26;
                                    }
                                } else if (n29 < n2) {
                                    n2 = n29;
                                    n12 = n27;
                                    n13 = n28;
                                    n18 = -1;
                                    n5 = n26;
                                }
                            } else {
                                int n30 = (int)((long)n20 * (long)n20 + (long)n21 * (long)n21 >> 10);
                                if (n19 <= n30) {
                                    int n31 = y.a(n20, n21);
                                    n20 = (int)(((long)n20 << 10) / (long)n31);
                                    n21 = (int)(((long)n21 << 10) / (long)n31);
                                    n31 = (int)((long)n20 * (long)n28 - (long)n21 * (long)n27 >> 10);
                                    if ((int)((long)(-n21) * (long)n22 + (long)n20 * (long)n23 >> 10) > 0) {
                                        if (n31 < n24) {
                                            n24 = n31;
                                            n14 = -n21;
                                            n15 = n20;
                                            n8 = n26;
                                            n9 = n25;
                                            n10 = n19;
                                            n11 = n30;
                                        }
                                    } else if (n31 < n2) {
                                        n2 = n31;
                                        n12 = -n21;
                                        n13 = n20;
                                        n5 = n26;
                                        n6 = n25;
                                        n18 = n19;
                                        n7 = n30;
                                    }
                                }
                            }
                        }
                    }
                    n26 = n25++;
                }
                if (n2 == Integer.MAX_VALUE || n24 != Integer.MAX_VALUE && (n24 < 0 ? -n24 : n24) < (n2 < 0 ? -n2 : n2) >> 1) {
                    n2 = n24;
                    n12 = n14;
                    n13 = n15;
                    n5 = n8;
                    n6 = n9;
                    n18 = n10;
                    n7 = n11;
                }
                if (n18 == -1) {
                    s2 = am2.a[n17];
                    s3 = am3.a[n5];
                    n20 = s2.a == s3.a ? 512 : (s2.a == s3.a << 1 ? 682 : (s2.a == s3.a >> 1 ? 341 : (int)(((long)s2.a << 10) / (long)(s2.a + s3.a))));
                    n21 = n20 - 1024;
                    if ((n12 != 0 || n13 != 0) && (n23 = am2.c + am3.c >> 1) != 0) {
                        n10 = s2.a.a - s2.b.a - s3.a.a + s3.b.a;
                        n22 = s2.a.b - s2.b.b - s3.a.b + s3.b.b;
                        long l2 = ((long)(-n13) * (long)n10 + (long)n12 * (long)n22 << 10) / ((long)n12 * (long)n12 + (long)n13 * (long)n13);
                        if (n23 != 1024) {
                            l2 = l2 * (long)n23 >> 10;
                        }
                        n10 = (int)((long)(-n13) * l2 >> 10);
                        n22 = (int)((long)n12 * l2 >> 10);
                        s2.b.a -= n10 * n21 >> 10;
                        s2.b.b -= n22 * n21 >> 10;
                        s3.b.a -= n10 * n20 >> 10;
                        s3.b.b -= n22 * n20 >> 10;
                    }
                    s2.a.a += n12 * n21 >> 10;
                    s2.a.b += n13 * n21 >> 10;
                    s3.a.a += n12 * n20 >> 10;
                    s3.a.b += n13 * n20 >> 10;
                    s2.b |= 1;
                    s3.b |= 1;
                    if (((am2.d & 1) != 0 || (am3.d & 1) != 0) && (s2.b & 4) == 0 && (s3.b & 4) == 0) {
                        t t2 = new t(s2, s3, 512, 10240, 0);
                        n26 = (am2.d & 1) != 0 ? (int)(am2.a(t2) ? 1 : 0) : (int)(am3.a(t2) ? 1 : 0);
                        if (n26 != 0) {
                            s2.b |= 4;
                            s3.b |= 4;
                        }
                    }
                } else {
                    s2 = am2.a[n17];
                    s4 = am3.a[n6];
                    s3 = am3.a[n5];
                    n20 = s2.a == Integer.MAX_VALUE ? 1024 : (s3.a == Integer.MAX_VALUE ? 0 : (s2.a == s3.a && s3.a == s4.a ? 512 : (s2.a == s3.a << 1 && s3.a == s4.a ? 682 : (s2.a == s3.a >> 1 && s3.a == s4.a ? 341 : (int)(((long)s2.a << 10) / (long)(s2.a + (s4.a + s3.a >> 1)))))));
                    n21 = n20 - 1024;
                    n18 = n7 == 0 ? 0 : (int)(((long)n18 << 10) / (long)n7);
                    n24 = 1024 - n18;
                    if ((n12 != 0 || n13 != 0) && (n23 = am2.c + am3.c >> 1) != 0) {
                        n10 = s2.a.a - s2.b.a - (s3.a.a + s4.a.a >> 1) + (s3.b.a + s4.b.a >> 1);
                        n22 = s2.a.b - s2.b.b - (s3.a.b + s4.a.b >> 1) + (s3.b.b + s4.b.b >> 1);
                        n19 = -n13 * n10 + n12 * n22 >> 10;
                        if (n23 != 1024) {
                            n19 = n19 * n23 >> 10;
                        }
                        n10 = -n13 * n19 >> 10;
                        n22 = n12 * n19 >> 10;
                        s2.b.a -= n10 * n21 >> 10;
                        s2.b.b -= n22 * n21 >> 10;
                        n10 = n10 * n20 >> 10;
                        n22 = n22 * n20 >> 10;
                        s3.b.a -= n10 * n24 >> 10;
                        s3.b.b -= n22 * n24 >> 10;
                        s4.b.a -= n10 * n18 >> 10;
                        s4.b.b -= n22 * n18 >> 10;
                    }
                    n12 = n12 * n2 >> 10;
                    n13 = n13 * n2 >> 10;
                    s2.a.a += n12 * n21 >> 10;
                    s2.a.b += n13 * n21 >> 10;
                    n10 = n12 * n20 >> 10;
                    n22 = n13 * n20 >> 10;
                    s3.a.a += n10 * n24 >> 10;
                    s3.a.b += n22 * n24 >> 10;
                    s4.a.a += n10 * n18 >> 10;
                    s4.a.b += n22 * n18 >> 10;
                    s2.b |= 1;
                    s3.b |= 1;
                    s4.b |= 1;
                    if (((am2.d & 1) != 0 || (am3.d & 1) != 0) && (s2.b & 4) == 0) {
                        t t3 = new t(s2, new aq(s3, s4, n18), 512, 10240, 0);
                        n26 = (am2.d & 1) != 0 ? (int)(am2.a(t3) ? 1 : 0) : (int)(am3.a(t3) ? 1 : 0);
                        if (n26 != 0) {
                            s2.b |= 4;
                        }
                    }
                }
                n2 = 1;
            }
            n18 = n17;
            n17 = n16++;
        }
        return n2 != 0;
    }

    public static int a(as as2, s[] sArray, s[] sArray2) {
        int n2;
        int n3;
        int[] nArray = new int[sArray.length];
        nArray[0] = n3 = (int)((long)sArray[0].a.a * (long)as2.a + (long)sArray[0].a.b * (long)as2.b >> 10);
        for (n2 = 1; n2 < sArray.length; ++n2) {
            nArray[n2] = (int)((long)sArray[n2].a.a * (long)as2.a + (long)sArray[n2].a.b * (long)as2.b >> 10);
            if (nArray[n2] >= n3) continue;
            n3 = nArray[n2];
        }
        n2 = 0;
        int[] nArray2 = new int[2];
        boolean bl = false;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            int n4;
            if (nArray[i2] >= n3 + 1024) continue;
            int n5 = (int)((long)sArray[i2].a.a * (long)(-as2.b) + (long)sArray[i2].a.b * (long)as2.a >> 10);
            if (n2 < 2) {
                nArray2[n2] = n5;
                sArray2[n2] = sArray[i2];
                if (++n2 <= 1) continue;
                bl = nArray2[1] > nArray2[0];
                continue;
            }
            int n6 = bl ? 0 : 1;
            int n7 = n4 = bl ? 1 : 0;
            if (n5 < nArray2[n6]) {
                nArray2[n6] = n5;
                sArray2[n6] = sArray[i2];
                continue;
            }
            if (n5 <= nArray2[n4]) continue;
            nArray2[n4] = n5;
            sArray2[n4] = sArray[i2];
        }
        return n2;
    }

    public static boolean a(s[] sArray, s[] sArray2, int[][] object, int[] nArray, int n2) {
        object = object[n2];
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i2 = 0; i2 < 2; ++i2) {
            int n7;
            s[] sArray3 = i2 == 0 ? sArray : sArray2;
            as as2 = sArray3[0].a;
            int n8 = n7 = (int)((long)as2.a * (long)object[0] + (long)as2.b * (long)object[1] >> 10);
            int n9 = sArray3.length;
            for (int i3 = 1; i3 < n9; ++i3) {
                as2 = sArray3[i3].a;
                int n10 = (int)((long)as2.a * (long)object[0] + (long)as2.b * (long)object[1] >> 10);
                if (n10 < n8) {
                    n8 = n10;
                    continue;
                }
                if (n10 <= n7) continue;
                n7 = n10;
            }
            if (i2 == 0) {
                n3 = n7 - n8 >> 1;
                n4 = n7 + n8 >> 1;
                continue;
            }
            n5 = n8 - n3 - n4;
            n6 = n7 + n3 - n4;
        }
        if (n5 <= 0 && n6 >= 0) {
            if ((n5 < 0 ? -n5 : n5) < (n6 < 0 ? -n6 : n6)) {
                object[0] = -object[0];
                object[1] = -object[1];
                nArray[n2] = -n5;
            } else {
                nArray[n2] = n6;
            }
            return true;
        }
        return false;
    }
}

