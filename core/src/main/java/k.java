/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class k {
    public au a;
    public byte a;
    public boolean a;
    public boolean b;
    public byte b;
    ar a;
    public as a;
    public as b;
    public int a;
    public int b;

    public k(ar asArray, byte by, as as2, as as3, int n2) {
        this.a = asArray;
        this.b = by;
        asArray = null;
        switch (this.b) {
            case 0: {
                asArray = y.a(96, 32, true);
                break;
            }
            case 1: {
                asArray = y.a(32, 96, true);
                as as4 = new as(0, 64).b();
                as2.b(as4);
                as3.b(as4);
                break;
            }
            case 2: {
                asArray = y.a(64, 32, true);
                break;
            }
            case 3: {
                asArray = y.a(32, 288, true);
                as as5 = new as(0, 256).b();
                as2.b(as5);
                as3.b(as5);
            }
        }
        ((as)((Object)asArray[0])).a -= 512;
        asArray[0].b -= 512;
        asArray[1].b -= 512;
        asArray[3].a -= 512;
        asArray[4].a -= 512;
        asArray[4].b -= 512;
        this.a = new as(as2);
        this.a = new au(this.a.a, asArray, as2);
        this.b = new as(as3);
        this.b = as3.b(as2).c() / (n2 * 500);
        this.a = 0;
        this.a = false;
        if (this.a.a != null && this.a.a.b) {
            this.a.a.a(this.a);
        }
    }

    public final void a(byte by, int n2) {
        this.a = by;
        this.a = true;
        if (this.a == 1 && (n2 > 0 && this.a == this.b || n2 < 0 && this.a == 0)) {
            k k2 = this;
            this.a = false;
        }
        if (n2 < 0 && this.a < this.b) {
            this.a = this.b + this.b - this.a;
            return;
        }
        if (n2 > 0 && this.a >= this.b) {
            this.a = this.b + this.b - this.a;
        }
    }

    public final byte a() {
        if (this.a) {
            if (this.a < this.b) {
                return 1;
            }
            return 3;
        }
        if (this.a == 0) {
            return 0;
        }
        if (this.a == this.b) {
            return 2;
        }
        if (this.a < this.b) {
            return 1;
        }
        return 3;
    }
}

