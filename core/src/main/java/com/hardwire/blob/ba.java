package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ba
implements av {
    public Vector a;
    private int a = 0;
    private int b = 0;
    private final int c;

    public ba() {
        this(60);
    }

    private ba(int n2) {
        this.c = 60;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(v v2) {
        ba ba2 = this;
        synchronized (ba2) {
            if (this.a == null) {
                return;
            }
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                ((ad)this.a.elementAt(i2)).a(v2);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(v v2) {
        ba ba2 = this;
        synchronized (ba2) {
            if (this.a == null) {
                return;
            }
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                ((ad)this.a.elementAt(i2)).b(v2);
            }
            return;
        }
    }

    public final void a(o o2) {
        int n2 = o2.a(-100, 100);
        int n3 = 0;
        if (n2 < -this.c) {
            n3 = 3;
        } else if (n2 > this.c) {
            n3 = 4;
        }
        if (n3 != this.a) {
            if (this.a != 0) {
                this.b(new v(o2.a(), -1, this.a));
            }
            this.a = n3;
            if (n3 != 0) {
                this.a(new v(o2.a(), -1, this.a));
            }
        }
        n2 = o2.b(-100, 100);
        n3 = 0;
        if (n2 < -this.c) {
            n3 = 1;
        } else if (n2 > this.c) {
            n3 = 2;
        }
        if (n3 != this.b) {
            if (this.b != 0) {
                this.b(new v(o2.a(), -1, this.b));
            }
            this.b = n3;
            if (n3 != 0) {
                this.a(new v(o2.a(), -1, this.b));
            }
        }
    }
}

