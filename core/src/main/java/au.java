/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class au {
    public as[] a;
    public as a;
    public as[] b;
    public int a;
    public int[] a;
    private int[] b;
    private ab a;
    public int b;

    public au(ab ab2, as[] asArray, as as2) {
        this.a = ab2;
        this.a = asArray;
        this.a = as2;
        this.a = 0;
        this.a = new int[4];
        this.b = new int[4];
        this.a[1] = Integer.MAX_VALUE;
        this.a[0] = Integer.MAX_VALUE;
        this.a[3] = Integer.MIN_VALUE;
        this.a[2] = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2].a < this.a[0]) {
                this.a[0] = this.a[i2].a;
            }
            if (this.a[i2].a > this.a[2]) {
                this.a[2] = this.a[i2].a;
            }
            if (this.a[i2].b < this.a[1]) {
                this.a[1] = this.a[i2].b;
            }
            if (this.a[i2].b <= this.a[3]) continue;
            this.a[3] = this.a[i2].b;
        }
    }

    public final int[] a() {
        this.b[0] = this.a[0] + this.a.a;
        this.b[1] = this.a[1] + this.a.b;
        this.b[2] = this.a[2] + this.a.a;
        this.b[3] = this.a[3] + this.a.b;
        return this.b;
    }

    public final void a(as object) {
        as as2 = ((as)object).b(this.a);
        object = this;
        for (int i2 = 0; i2 < ((au)object).a; ++i2) {
            ((au)object).b[i2].a(as2);
        }
        as as3 = new as(((au)object).a);
        ((au)object).a.a(as2);
        if (((au)object).a.b != null) {
            ((au)object).a.b.a(((au)object).b, ((au)object).a[0] + as3.a, ((au)object).a[1] + as3.b, ((au)object).a[2] + as3.a, ((au)object).a[3] + as3.b, ((au)object).a[0] + ((au)object).a.a, ((au)object).a[1] + ((au)object).a.b, ((au)object).a[2] + ((au)object).a.a, ((au)object).a[3] + ((au)object).a.b);
        }
    }

    public final void b(as as2) {
        if (this.b == null) {
            this.b = new as[8];
        } else if (this.a == this.b.length) {
            as[] asArray = new as[this.a << 1];
            System.arraycopy(this.b, 0, asArray, 0, this.a);
            this.b = asArray;
        }
        this.b[this.a++] = as2;
    }
}

