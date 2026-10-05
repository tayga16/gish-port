/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ax
extends h {
    private int b;
    private boolean a = false;
    private boolean b = false;

    protected ax(ag object, int n2) {
        super((ag)object);
        this.b = n2;
        switch (n2) {
            case 0: {
                object = this;
                x x2 = ((x)this).a.b();
                object = this;
                ((h)this).a = x2;
                return;
            }
            case 1: {
                object = this;
                x x3 = ((x)this).a.b();
                object = this;
                ((h)this).a = x3;
                return;
            }
            case 2: {
                this.b();
                return;
            }
            case 3: {
                this.b();
                return;
            }
        }
        throw new IllegalStateException();
    }

    protected final void a() {
        switch (this.b) {
            case 0: {
                j.a().a(0);
                ax ax2 = this;
                String[] stringArray = ((h)this).a;
                if (((h)this).a == null || stringArray.length != 2) {
                    stringArray = new String[2];
                }
                stringArray[0] = j.a().a(4);
                ax2 = this;
                stringArray[1] = ((x)ax2).a.c() ? j.a().a(20) : j.a().a(19);
                String[] stringArray2 = stringArray;
                ax2 = this;
                ((h)this).a = stringArray2;
                return;
            }
            case 1: {
                j.a().a(0);
                int n2 = 1;
                ++n2;
                ax ax3 = this;
                if (((x)ax3).a.b()) {
                    ++n2;
                } else {
                    ax3 = this;
                    if (((x)ax3).a.d()) {
                        this.a = true;
                        ++n2;
                    }
                }
                ax3 = this;
                if (((x)ax3).a.e()) {
                    this.b = true;
                    ++n2;
                }
                ax3 = this;
                String[] stringArray = ((h)ax3).a;
                if (((h)ax3).a == null || stringArray.length != n2) {
                    stringArray = new String[n2];
                }
                n2 = 0;
                ax3 = this;
                if (((x)ax3).a.b()) {
                    ++n2;
                    stringArray[0] = j.a().a(24);
                } else if (this.a) {
                    ++n2;
                    stringArray[0] = j.a().a(1);
                }
                if (this.b) {
                    stringArray[n2++] = j.a().a(2);
                }
                stringArray[n2++] = j.a().a(3);
                ax3 = this;
                stringArray[n2] = ((x)ax3).a.c() ? j.a().a(20) : j.a().a(19);
                String[] stringArray3 = stringArray;
                ax3 = this;
                ((h)this).a = stringArray3;
                return;
            }
            case 2: {
                this.c();
                return;
            }
            case 3: {
                this.c();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final x a(int var1_1) {
        switch (this.b) {
            case 0: {
                var2_4 /* !! */  = null;
                var3_6 = this;
                var2_4 /* !! */  = var3_6.a;
                if (var1_1 < 0 || var1_1 > var2_4 /* !! */ .length - 1) {
                    throw new IllegalArgumentException();
                }
                var3_6 = this;
                var1_2 = var3_6.a[var1_1];
                if (var1_2.equals(j.a().a(4))) {
                    var3_6 = this;
                    var2_4 /* !! */  = var3_6.a.i();
                } else if (var1_2.equals(j.a().a(20))) {
                    var3_6 = this;
                    var2_4 /* !! */  = this.a(false, var3_6.a.d());
                } else if (var1_2.equals(j.a().a(19))) {
                    var3_6 = this;
                    var2_4 /* !! */  = this.a(true, var3_6.a.d());
                } else {
                    throw new IllegalArgumentException();
                }
                var3_6 = this;
                return var3_6.a.a(this, (x)var2_4 /* !! */ );
            }
            case 1: {
                var2_5 /* !! */  = null;
                var3_7 = this;
                var2_5 /* !! */  = var3_7.a;
                if (var1_1 < 0 || var1_1 > var2_5 /* !! */ .length - 1) {
                    throw new IllegalArgumentException();
                }
                var3_7 = this;
                var1_3 = var3_7.a[var1_1];
                if (!var1_3.equals(j.a().a(1)) || !this.a) ** GOTO lbl37
                var3_7 = this;
                var2_5 /* !! */  = var3_7.a.j();
                ** GOTO lbl64
lbl37:
                // 1 sources

                if (!var1_3.equals(j.a().a(24))) ** GOTO lbl-1000
                var3_7 = this;
                if (var3_7.a.b()) {
                    v0 = this;
                    var3_7 = v0;
                    v1 = this;
                    var3_7 = v1;
                    var3_7 = this;
                    var2_5 /* !! */  = v0.a.a(v1.a.a(), var3_7.a.c());
                } else if (var1_3.equals(j.a().a(2)) && this.b) {
                    var3_7 = this;
                    var2_5 /* !! */  = var3_7.a.e();
                } else if (var1_3.equals(j.a().a(3))) {
                    var3_7 = this;
                    var2_5 /* !! */  = var3_7.a.f();
                } else if (var1_3.equals(j.a().a(20))) {
                    var3_7 = this;
                    var2_5 /* !! */  = this.a(false, var3_7.a.c());
                } else if (var1_3.equals(j.a().a(19))) {
                    var3_7 = this;
                    var2_5 /* !! */  = this.a(true, var3_7.a.c());
                } else {
                    throw new IllegalArgumentException();
                }
lbl64:
                // 6 sources

                var3_7 = this;
                return var3_7.a.a(this, (x)var2_5 /* !! */ );
            }
            case 2: {
                return this.b(var1_1);
            }
            case 3: {
                return this.b(var1_1);
            }
        }
        throw new IllegalStateException();
    }

    private x a(boolean bl, x x2) {
        ax ax2 = this;
        ((x)ax2).a.b(bl);
        ax2 = this;
        return ((x)ax2).a.a(bl, x2);
    }

    private void b() {
        ax ax2 = this;
        x x2 = ((x)ax2).a.c();
        ax2 = this;
        ((h)this).a = x2;
    }

    private void c() {
        j.a().a(0);
        Object object = this.a();
        String[] stringArray = new String[((Vector)object).size()];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            ah ah2 = (ah)((Vector)object).elementAt(i2);
            stringArray[i2] = ah2.a();
        }
        object = this;
        ((h)this).a = stringArray;
    }

    private x b(int n2) {
        Object var2_3 = null;
        int n3 = n2;
        Object object = null;
        object = this.a();
        if (n3 < 0 || n3 > ((Vector)object).size() - 1) {
            throw new IllegalArgumentException();
        }
        if ((object = (ah)((Vector)object).elementAt(n3)) == null) {
            throw new IllegalArgumentException();
        }
        ax ax2 = this;
        x x2 = ((x)ax2).a.a((ah)object, (x)this);
        ax2 = this;
        return ((x)ax2).a.a(this, x2);
    }

    private Vector a() {
        switch (this.b) {
            case 2: {
                Object object = this;
                object = ((x)object).a.a();
                return ((aw)object).a;
            }
            case 3: {
                ax ax2 = this;
                return ((x)ax2).a.a();
            }
        }
        throw new IllegalStateException();
    }
}

