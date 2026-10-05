/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s {
    public as a;
    public as b;
    public as c;
    public int a;
    private as d;
    public int b;

    public s(as as2, int n2) {
        this.a = as2;
        this.a = n2;
        this.b = new as(as2);
        if (n2 != Integer.MAX_VALUE) {
            this.c = new as();
            this.d = new as();
        }
    }

    public final void a() {
        if (this.a == Integer.MAX_VALUE) {
            this.b.a = this.a.a;
            this.b.b = this.a.b;
            return;
        }
        this.d.a = this.a.a;
        this.d.b = this.a.b;
        this.a.a <<= 1;
        this.a.b <<= 1;
        this.a.a -= this.b.a;
        this.a.b -= this.b.b;
        if (this.a == 1024) {
            this.a.a += this.c.a;
            this.a.b += this.c.b;
        } else if (this.a == 2048) {
            this.a.a += this.c.a >> 1;
            this.a.b += this.c.b >> 1;
        } else {
            this.a.a += (int)(((long)this.c.a << 10) / (long)this.a);
            this.a.b += (int)(((long)this.c.b << 10) / (long)this.a);
        }
        this.b.a = this.d.a;
        this.b.b = this.d.b;
        this.c.b = 0;
        this.c.a = 0;
    }

    public final void a(as as2) {
        if (this.a == Integer.MAX_VALUE) {
            return;
        }
        if (this.a == 1024) {
            this.c.a += as2.a;
            this.c.b += as2.b;
            return;
        }
        if (this.a == 2048) {
            this.c.a += as2.a << 1;
            this.c.b += as2.b << 1;
            return;
        }
        this.c.a += (int)((long)as2.a * (long)this.a >> 10);
        this.c.b += (int)((long)as2.b * (long)this.a >> 10);
    }
}

