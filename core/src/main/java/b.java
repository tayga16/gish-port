/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class b {
    protected static Hashtable a = new Hashtable();
    private Vector a;
    private boolean a = null;
    private Hashtable c;
    protected Hashtable b;

    protected b() {
    }

    protected final void a() {
        this.b();
        b b2 = this;
        this.c = null;
        try {
            b2.c = az.a(true);
        }
        catch (IOException iOException) {}
        this.a = this.d();
    }

    protected final void b() {
        this.b = null;
        try {
            this.b = az.a(false);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    protected final void c() {
        try {
            Hashtable hashtable = this.b;
            az.a(hashtable, false);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    private void d() {
        try {
            Hashtable hashtable = this.c;
            az.a(hashtable, true);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final ah a(int n2) {
        Object object = null;
        object = this.a ? this.b : this.c;
        if ((object = n.a((Hashtable)object, n2)) == null && this.a) {
            object = n.a(this.c, n2);
        }
        return object;
    }

    public final void a(int n2, ah ah2) {
        n.a(this.c, n2, ah2);
        this.d();
        if (this.a) {
            n.a(this.b, n2, ah2);
            this.c();
        }
    }

    public final boolean a() {
        Hashtable hashtable = null;
        hashtable = this.a ? this.b : this.c;
        if (this.a && !this.b.containsKey("zp.ace") && this.c.containsKey("zp.ace")) {
            this.a(n.a(this.c));
        }
        boolean bl = true;
        if (!hashtable.containsKey("zp.ace")) {
            if (this.b()) {
                bl = this.c();
            }
            this.a(bl);
        } else {
            bl = n.a(hashtable);
        }
        return bl;
    }

    public final void a(boolean bl) {
        n.a(this.c, bl);
        this.d();
        if (this.a) {
            n.a(this.b, bl);
            this.c();
        }
    }

    public final Vector a() {
        if (this.a == null) {
            String string;
            this.a = new Vector();
            int n2 = 1;
            while ((string = this.a(n2)) != null) {
                ++n2;
                int n3 = string.indexOf(58);
                if (n3 < 0) continue;
                String string2 = string.substring(0, n3);
                string = string.substring(n3 + 1);
                if (string2 == null || string == null) continue;
                this.a.addElement(w.a(string2, string));
            }
        }
        return this.a;
    }

    protected abstract String a(int var1);

    protected abstract boolean b();

    protected abstract boolean c();

    protected abstract boolean d();
}

