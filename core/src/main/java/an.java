/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class an {
    public final Object a;
    public final Object b;
    public Vector a;
    public Vector b;
    private Vector c = null;
    volatile boolean a;
    public int a;
    public c a;
    public r a = 1;
    public boolean b = true;

    public an(int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(av av2) {
        if (av2 == null) {
            throw new NullPointerException();
        }
        Object object = this.a;
        synchronized (object) {
            if (this.c == null) {
                this.c = new Vector(1);
            }
            this.c.addElement(av2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2) {
        Object object = this.a;
        synchronized (object) {
            if (this.a && this.b != null) {
                v v2 = new v(this, n2);
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((ad)this.b.elementAt(i2)).a(v2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void b(int n2) {
        Object object = this.a;
        synchronized (object) {
            if (this.a && this.b != null) {
                v v2 = new v(this, n2);
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    ((ad)this.b.elementAt(i2)).b(v2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        Object object = this.a;
        synchronized (object) {
            if (this.a && this.c != null) {
                o o2 = new o(this, n2, n3, n4, n5, n6, n7, n8);
                for (n3 = 0; n3 < this.c.size(); ++n3) {
                    ((av)this.c.elementAt(n3)).a(o2);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2, int n3, int n4, int n5) {
        Object object = this.a;
        synchronized (object) {
            if (this.a && this.a != null) {
                new a(this, n2, n3, n4, n5);
                for (n3 = 0; n3 < this.a.size(); ++n3) {
                    this.a.elementAt(n3);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a() {
        Object object = this.a;
        synchronized (object) {
            if (this.a && this.a != null) {
                new g(this, this.b);
                for (int i2 = 0; i2 < this.a.size(); ++i2) {
                    ((Main)this.a.elementAt(i2)).f();
                }
            }
        }
        this.b = true;
    }

    public final boolean a() {
        if (this.a != null) {
            r r2 = this.a;
            if (r2.a != null && r2.a.a() && r2.a) {
                return true;
            }
        }
        return false;
    }
}

