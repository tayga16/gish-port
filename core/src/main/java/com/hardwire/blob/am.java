package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class am {
    public Vector a;
    public Vector b;
    private Vector c;
    public t[] a;
    public s[] a;
    public s[] b;
    public int a;
    public as a;
    public as b;
    public as c;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int[] a;
    public boolean a;
    public t[] b;
    public int g;
    public int h;
    public t[] c;
    public s[] c;
    public am[] a;
    public int i;
    public int j = 0;
    public Object a = new Vector();

    public am(int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.b = new Vector();
        this.c = new Vector();
        this.a = n2;
        this.d = 0;
        if (bl) {
            this.d |= 4;
        }
        if (bl2) {
            this.d |= 8;
        }
        if (bl4) {
            this.d |= 0x40;
        }
        if (bl3) {
            this.d |= 0x80;
        }
        this.c = 1024;
        this.h = 1;
    }

    public final int[] a() {
        if (this.a) {
            this.a[1] = Integer.MAX_VALUE;
            this.a[0] = Integer.MAX_VALUE;
            this.a[3] = Integer.MIN_VALUE;
            this.a[2] = Integer.MIN_VALUE;
            int n2 = this.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                as as2 = this.a[i2].a;
                if (as2.a < this.a[0]) {
                    this.a[0] = as2.a;
                }
                if (as2.a > this.a[2]) {
                    this.a[2] = as2.a;
                }
                if (as2.b < this.a[1]) {
                    this.a[1] = as2.b;
                }
                if (as2.b <= this.a[3]) continue;
                this.a[3] = as2.b;
            }
            this.a = false;
        }
        return this.a;
    }

    public final void a(as[] asArray, int n2) {
        for (int i2 = 0; i2 < asArray.length; ++i2) {
            this.a.addElement(new s(asArray[i2], n2));
        }
    }

    public final void a(t t2) {
        this.b.addElement(t2);
    }

    public final boolean a(t t2) {
        if (this.g == this.b.length) {
            return false;
        }
        this.b[this.g++] = t2;
        return true;
    }

    public final void a(s s2) {
        this.a.addElement(s2);
    }

    public final void a(am am2) {
        if (am2 != null && !this.c.contains(am2)) {
            this.c.addElement(am2);
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        t t2;
        int n6;
        n2 = this.a.size();
        int n7 = n2 >> 1;
        for (n6 = 0; n6 < n7; ++n6) {
            t2 = new t((s)this.a.elementAt(n6 * 2), (s)this.a.elementAt(n6 * 2 + 1), 1024, n4, -1);
            this.a(t2);
        }
        for (n6 = 0; n6 < n7; ++n6) {
            int n8 = n6 * 2 + 2;
            if (n8 >= n2) {
                n8 = 0;
            }
            t2 = new t((s)this.a.elementAt(n6 * 2 + 1), (s)this.a.elementAt(n8), n3, n5, -1);
            this.a(t2);
        }
        if (n2 % 2 != 0) {
            this.a(new t((s)this.a.elementAt(n2 - 1), (s)this.a.elementAt(0), 1024, n4, -1));
        }
    }

    public final void a() {
        int n2;
        this.a = new s[this.a.size()];
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = (s)this.a.elementAt(n2);
        }
        this.a.removeAllElements();
        this.a = new t[this.b.size()];
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = (t)this.b.elementAt(n2);
        }
        this.b.removeAllElements();
        if ((this.d & 4) != 0) {
            this.e = this.a();
            if (this.e < 0) {
                this.e = -this.e;
            }
            am am2 = this;
            int n3 = 0;
            int n4 = am2.a.length;
            int n5 = 0;
            int n6 = n4 - 1;
            while (n5 < n4) {
                n3 += am2.a[n5].a.b(am2.a[n6].a).c();
                n6 = n5++;
            }
            this.f = n3;
        }
        if ((this.d & 8) != 0) {
            this.b = new t[this.a.length];
            this.g = 0;
        }
        if ((this.d & 0x40) != 0) {
            this.b = new s[this.a.length];
            for (int i2 = 0; i2 < this.b.length; ++i2) {
                this.b[i2] = new s(new as(this.a[i2].a), Integer.MAX_VALUE);
            }
        }
        if ((this.d & 0x80) != 0) {
            this.c = new as();
            for (int i3 = 0; i3 < this.a.length; ++i3) {
                this.c.a(this.a[i3].a);
            }
            this.c.b(this.a.length);
        }
    }

    public final void b() {
        int n2;
        int n3 = this.b.size();
        if (n3 == 0) {
            this.c = null;
        } else {
            this.c = new t[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = (t)this.b.elementAt(n2);
            }
            this.b.removeAllElements();
        }
        this.b = null;
        n3 = this.a.size();
        if (n3 == 0) {
            this.c = null;
        } else {
            this.c = new s[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = (s)this.a.elementAt(n2);
            }
            this.a.removeAllElements();
        }
        this.a = null;
        n3 = this.c.size();
        if (n3 == 0) {
            this.a = null;
        } else {
            this.a = new am[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.a[n2] = (am)this.c.elementAt(n2);
            }
            this.c.removeAllElements();
        }
        this.c = null;
    }

    public final s[] a() {
        if (this.b != null) {
            return this.b;
        }
        return this.a;
    }

    public final boolean a() {
        return this.g != 0;
    }

    public final void c() {
        for (int i2 = 0; i2 < this.g; ++i2) {
            this.b[i2].a();
            this.b[i2] = null;
        }
        this.g = 0;
    }

    public final int a() {
        int n2 = 0;
        int n3 = this.a.length;
        int n4 = 0;
        int n5 = n3 - 1;
        int n6 = n3 - 2;
        while (n4 < n3) {
            n2 = (int)((long)n2 + ((long)this.a[n5].a.a * (long)(this.a[n4].a.b - this.a[n6].a.b) >> 10));
            n6 = n5;
            n5 = n4++;
        }
        return n2 >>= 1;
    }

    public final void a(as as2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2].a == Integer.MAX_VALUE) continue;
            this.a[i2].c.a += as2.a;
            this.a[i2].c.b += as2.b;
        }
    }

    public final void b(as as2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].a(as2);
        }
    }

    public final boolean a(as as2) {
        boolean bl = false;
        int n2 = 0;
        int n3 = this.a.length - 1;
        while (n2 < this.a.length) {
            as as3 = this.a[n3].a;
            as as4 = this.a[n2].a;
            if (as3.b <= as2.b && as4.b > as2.b || as3.b > as2.b && as4.b <= as2.b) {
                int n4 = (int)((long)(as4.a - as3.a) * (long)(as2.b - as3.b) >> 10);
                int n5 = (int)((long)(as4.b - as3.b) * (long)(as2.a - as3.a) >> 10);
                if (as4.b >= as3.b && n4 >= n5 || as4.b < as3.b && n4 <= n5) {
                    bl = !bl;
                }
            }
            n3 = n2++;
        }
        return bl;
    }

    public final void d() {
        this.a = null;
        this.b = null;
    }

    public final void e() {
        int n2 = this.a.length;
        as as2 = new as();
        for (int i2 = 0; i2 < n2; ++i2) {
            s s2 = this.a[i2];
            as2.a = s2.a.a - s2.b.a;
            as2.b = s2.a.b - s2.b.b;
            if ((long)as2.a * (long)as2.a + (long)as2.b * (long)as2.b <= 0x4000000L) continue;
            as2.b();
            s2.b.a = s2.a.a - (as2.a << 13 >> 10);
            s2.b.b = s2.a.b - (as2.b << 13 >> 10);
        }
    }

    public final as a() {
        if (this.a == null) {
            this.a = new as();
            int n2 = this.a.length;
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                s s2 = this.a[i2];
                if ((s2.b & 0x10) != 0) continue;
                this.a.a += s2.a.a;
                this.a.b += s2.a.b;
                ++n3;
            }
            this.a.a /= n3;
            this.a.b /= n3;
        }
        return this.a;
    }

    public final as b() {
        if (this.b == null) {
            this.b = new as();
            int n2 = 0;
            if ((this.b & 2) != 0) {
                int n3 = this.a.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    if ((this.a[i2].b & 2) == 0) continue;
                    ++n2;
                    this.b.a(this.a[i2].a);
                }
            } else {
                int n4 = this.a.length;
                for (int i3 = 0; i3 < n4; ++i3) {
                    if ((this.a[i3].b & 5) == 0) continue;
                    ++n2;
                    this.b.a(this.a[i3].a);
                }
            }
            if (n2 == this.a.length) {
                this.b.a = 0;
                this.b.b = 1024;
            } else if (n2 != 0) {
                this.b.b(n2);
                this.b.b(this.a());
            }
        }
        return this.b;
    }

    public final as c() {
        as as2 = new as();
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            s s2 = this.a[i2];
            as2.a += s2.a.a - s2.b.a;
            as2.b += s2.a.b - s2.b.b;
        }
        as2.b(this.a.length);
        return as2;
    }

    public final void a(int n2, int n3, int n4, boolean bl) {
        int n5 = (int)(((long)(this.a[3] - n2) << 10) / (long)(this.a[3] - this.a[1]));
        if (n5 > 1024) {
            n5 = 1024;
        }
        if (n5 > 0) {
            n3 = (int)((long)(-n3) * (long)n5 >> 9);
            as as2 = new as(0, n3 -= this.c().b >> n4);
            if (!bl) {
                for (n4 = 0; n4 < this.a.length; ++n4) {
                    if (this.a[n4].a.b < n2) continue;
                    this.a[n4].a(as2);
                }
                return;
            }
            this.b(as2);
        }
    }

    public final void a(Graphics graphics, as as2, int n2) {
        s[] sArray = this.a();
        int n3 = sArray.length;
        graphics.setColor(n2);
        n2 = sArray[n3 - 1].a.a + as2.a >> 10;
        int n4 = sArray[n3 - 1].a.b + as2.b >> 10;
        for (int i2 = 0; i2 < n3; ++i2) {
            as as3 = sArray[i2].a;
            int n5 = as3.a + as2.a >> 10;
            int n6 = as3.b + as2.b >> 10;
            graphics.drawLine(n5, n6, n2, n4);
            n2 = n5;
            n4 = n6;
        }
    }
}

