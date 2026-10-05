/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.BluetoothStateException
 */
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ag {
    private an a;
    private b a;
    private aw a;
    private x a;
    private m a;
    private ax a;
    private ax b;
    private ax c;
    private ay a;
    private ay b;
    private ax d;
    private ay c;
    private ay d;
    private static Hashtable a = new Hashtable(1);
    private boolean a;
    private ah a = null;
    private boolean b;
    private ah b = null;
    private boolean c = false;

    final boolean a() {
        return this.a;
    }

    final void a(boolean bl) {
        this.a = bl;
        this.a = null;
    }

    final boolean b() {
        return this.a != null;
    }

    final void a(ah ah2) {
        this.a = ah2;
    }

    final ah a() {
        return this.a;
    }

    public static ag a(an an2, b b2) {
        ag ag2 = (ag)a.get(an2);
        if (ag2 == null) {
            ag2 = new ag(an2, b2);
            a.put(an2, ag2);
        }
        return ag2;
    }

    private ag(an an2, b b2) {
        this.a = an2;
        this.a = b2;
        this.a((x)null, this.b());
    }

    final an a() {
        return this.a;
    }

    final aw a() {
        if (this.a == null) {
            ae ae2 = w.a();
            if (ae2.a == null) {
                ae2.a = new aw();
            }
            this.a = ae2.a;
        }
        return this.a;
    }

    public final x a() {
        return this.a;
    }

    public final boolean c() {
        if (this.a != null) {
            return this.a.a();
        }
        return this.b;
    }

    public final void b(boolean bl) {
        if (this.a != null) {
            this.a.a(bl);
            return;
        }
        this.b = bl;
    }

    final ah b() {
        if (this.a != null) {
            an an2 = this.a;
            return this.a.a(an2.a);
        }
        return this.b;
    }

    final void b(ah ah2) {
        ah ah3 = null;
        if (this.a != null) {
            an an2 = this.a;
            ah3 = this.a.a(an2.a);
            an2 = this.a;
            this.a.a(an2.a, ah2);
        } else {
            ah3 = this.b;
            this.b = ah2;
        }
        this.c = false;
        if (!this.c()) {
            try {
                if (ah3 == null || !ah3.b().equalsIgnoreCase(ah2.b())) {
                    this.b(true);
                    this.c = true;
                }
                return;
            }
            catch (IOException iOException) {}
        }
    }

    final boolean d() {
        return this.b() != null;
    }

    final Vector a() {
        if (this.a != null) {
            return this.a.a();
        }
        return null;
    }

    final boolean e() {
        return (this = ((ag)this).a()) != null && ((Vector)this).size() > 0;
    }

    final x b() {
        if (this.a == null) {
            this.a = new m(this);
        }
        return this.a;
    }

    final x c() {
        if (this.a == null) {
            this.a = new ax(this, 1);
        }
        return this.a;
    }

    final x d() {
        if (this.b == null) {
            this.b = new ax(this, 0);
        }
        return this.b;
    }

    final x e() {
        if (this.c == null) {
            this.c = new ax(this, 3);
        }
        return this.c;
    }

    final x f() {
        if (this.a == null) {
            this.a = new ay(this, 3);
        }
        return this.a;
    }

    final x g() {
        if (this.b == null) {
            this.b = new ay(this, 0);
        }
        return this.b;
    }

    final x h() {
        if (this.d == null) {
            this.d = new ax(this, 2);
        }
        return this.d;
    }

    final x i() {
        if (this.c == null) {
            this.c = new ay(this, 2);
        }
        return this.c;
    }

    final x a(x x2, x x3) {
        if (x2 != this.a) {
            throw new IllegalStateException();
        }
        x3.a();
        this.a = x3;
        return x3;
    }

    final x a(ah ah2, x x2) {
        if (this.d == null) {
            this.d = new ay(this, 1);
        }
        Object object = x2;
        x2 = this.d;
        this.d.c = object;
        object = ah2;
        x2 = this.d;
        this.d.a = object;
        return this.d;
    }

    final x j() {
        return this.a(this.b(), this.c());
    }

    final x k() {
        i i2 = new i(this);
        j.a().a(0);
        Object object = this.b();
        Object object2 = j.a().a(11, new String[]{object.a()});
        Object object3 = i2;
        i2.a = object2;
        if (this.c) {
            object = new i(this);
            j.a().a(0);
            object2 = j.a().a(31);
            object3 = object;
            ((i)object).a = object2;
            object2 = this.b();
            object3 = object;
            ((i)object).a = object2;
            object2 = object;
            object3 = i2;
            i2.a = object2;
        } else {
            object2 = this.b();
            object3 = i2;
            i2.a = object2;
        }
        return i2;
    }

    final x a(Throwable object, x x2) {
        i i2 = new i((ag)((Object)i2));
        j.a().a(0);
        object = object instanceof SecurityException ? j.a().a(27) : (object instanceof BluetoothStateException ? j.a().a(29) : j.a().a(12));
        Object object2 = object;
        object = i2;
        i2.a = object2;
        object2 = x2;
        object = i2;
        i2.a = object2;
        return i2;
    }

    final x l() {
        i i2 = new i(this);
        j.a().a(0);
        Object object = this.b();
        Object object2 = j.a().a(14, new String[]{object.a()});
        object = i2;
        i2.a = object2;
        object2 = this.c();
        object = i2;
        i2.a = object2;
        return i2;
    }

    final x m() {
        i i2 = new i(this);
        j.a().a(0);
        Object object = j.a().a(15);
        i i3 = i2;
        i2.a = object;
        object = this.d();
        i3 = i2;
        i2.a = object;
        return i2;
    }

    final x n() {
        i i2 = new i(this);
        j.a().a(0);
        Object object = j.a().a(9);
        i i3 = i2;
        i2.a = object;
        object = this.c();
        i3 = i2;
        i2.a = object;
        return i2;
    }

    final x a(Throwable throwable) {
        i i2 = new i((ag)((Object)string));
        j.a().a(0);
        Object object = ((ag)((Object)string)).c();
        i i3 = i2;
        i2.a = object;
        String string = throwable instanceof SecurityException ? j.a().a(26) : (throwable instanceof BluetoothStateException ? j.a().a(28) : j.a().a(25));
        object = string;
        i3 = i2;
        i2.a = object;
        return i2;
    }

    private x a(String object, x x2) {
        i i2 = new i((ag)((Object)i2));
        j.a().a(0);
        Object object2 = object;
        object = i2;
        i2.a = object2;
        object2 = x2;
        object = i2;
        i2.a = object2;
        return i2;
    }

    final x a(boolean bl, x x2) {
        if (bl) {
            return this.a(j.a().a(21), x2);
        }
        return this.a(j.a().a(22), x2);
    }
}

