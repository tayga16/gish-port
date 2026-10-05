package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class af {
    private byte a;
    private int[] a;
    private int[] b;
    private int[] c;
    private boolean a = false;
    private int[] d;

    public final void a(Graphics graphics, int n2) {
        if (this.a == 4) {
            int n3 = this.c.length / 3;
            graphics.setColor(n2);
            for (int i2 = 0; i2 < n3; ++i2) {
                n2 = i2 * 3;
                int n4 = this.c[n2];
                int n5 = this.c[n2 + 1];
                n2 = this.c[n2 + 2];
                graphics.fillTriangle(this.a[n4], this.b[n4], this.a[n5], this.b[n5], this.a[n2], this.b[n2]);
            }
            return;
        }
        if (this.a == 3) {
            graphics.setColor(n2);
            int n6 = this.a.length - 1;
            n2 = 0;
            int n7 = n6 - 1;
            while (n2 < n6) {
                graphics.fillTriangle(this.a[n7], this.b[n7], this.a[n2], this.b[n2], this.a[n6], this.b[n6]);
                n7 = n2++;
            }
            return;
        }
        if (this.a == 6) {
            graphics.setColor(n2);
            int n8 = this.a.length;
            n2 = 2;
            int n9 = 1;
            while (n2 < n8) {
                graphics.fillTriangle(this.a[n9], this.b[n9], this.a[n2], this.b[n2], this.a[0], this.b[0]);
                n9 = n2++;
            }
        }
    }

    public af(byte by, int n2) {
        this.a = by;
        if (this.a == 2 || this.a == 3 || this.a == 6 || this.a == 4 || this.a == 5 || this.a == 8) {
            this.a = new int[this.a == 3 ? n2 + 1 : n2];
            this.b = new int[this.a == 3 ? n2 + 1 : n2];
        }
    }

    public final void a(s[] object, as sArray) {
        block20: {
            int n2;
            int n3;
            int n4;
            int n5;
            block21: {
                as as2;
                if (this.a == 2 || this.a == 3 || this.a == 6 || this.a == 4 || this.a == 5 || this.a == 8) {
                    n5 = ((s[])object).length;
                    for (n4 = 0; n4 < n5; ++n4) {
                        as2 = object[n4].a;
                        this.a[n4] = as2.a >> 10;
                        this.b[n4] = as2.b >> 10;
                    }
                    if (this.a == 3) {
                        this.a[((s[])object).length] = sArray.a >> 10;
                        this.b[((s[])object).length] = sArray.b >> 10;
                    }
                }
                if (this.a != 1 && this.a != 4) break block20;
                sArray = object;
                object = this;
                if (object.c == null || object.a) break block21;
                n5 = object.c.length / 3;
                n4 = 0;
                for (n3 = 0; n3 < n5; ++n3) {
                    int n6 = n3 * 3;
                    as as3 = sArray[object.c[n6]].a;
                    as as4 = sArray[object.c[n6 + 1]].a;
                    as2 = sArray[object.c[n6 + 2]].a;
                    if ((int)((long)(as4.a - as3.a) * (long)(as2.b - as3.b) - (long)(as4.b - as3.b) * (long)(as2.a - as3.a) >> 10) < 0) continue;
                    n4 = 1;
                    break;
                }
                if (n4 == 0) break block20;
            }
            if (object.c == null) {
                object.c = new int[(sArray.length - 2) * 3];
            }
            n5 = 0;
            n4 = sArray.length;
            if (object.d == null) {
                object.d = new int[n4];
            }
            for (n2 = 0; n2 < n4; ++n2) {
                object.d[n2] = n2;
            }
            n2 = n4 << 1;
            n3 = n4 - 1;
            while (n4 > 2) {
                boolean bl;
                int n7;
                int n8;
                block19: {
                    if (0 >= n2--) {
                        object.a = true;
                        return;
                    }
                    n8 = n3;
                    if (n8 >= n4) {
                        n8 = 0;
                    }
                    if ((n3 = n8 + 1) >= n4) {
                        n3 = 0;
                    }
                    if ((n7 = n3 + 1) >= n4) {
                        n7 = 0;
                    }
                    int n9 = n4;
                    int[] nArray = object.d;
                    int n10 = n7;
                    int n11 = n3;
                    int n12 = n8;
                    s[] sArray2 = sArray;
                    as as5 = sArray[nArray[n11]].a;
                    as as6 = sArray2[nArray[n12]].a;
                    as as7 = sArray2[nArray[n10]].a;
                    if ((int)((long)(as5.a - as6.a) * (long)(as7.b - as6.b) - (long)(as5.b - as6.b) * (long)(as7.a - as6.a) >> 10) < 0) {
                        bl = false;
                    } else {
                        for (int i2 = 0; i2 < n9; ++i2) {
                            if (i2 == n12 || i2 == n11 || i2 == n10) continue;
                            as as8 = sArray2[nArray[i2]].a;
                            int n13 = (int)((long)(as7.a - as5.a) * (long)(as8.b - as5.b) - (long)(as7.b - as5.b) * (long)(as8.a - as5.a) >> 10);
                            int n14 = (int)((long)(as5.a - as6.a) * (long)(as8.b - as6.b) - (long)(as5.b - as6.b) * (long)(as8.a - as6.a) >> 10);
                            int n15 = (int)((long)(as6.a - as7.a) * (long)(as8.b - as7.b) - (long)(as6.b - as7.b) * (long)(as8.a - as7.a) >> 10);
                            if (n13 < 0 || n14 < 0 || n15 < 0) continue;
                            bl = false;
                            break block19;
                        }
                        bl = true;
                    }
                }
                if (!bl) continue;
                n2 = n5 * 3;
                object.c[n2++] = object.d[n7];
                object.c[n2++] = object.d[n3];
                object.c[n2] = object.d[n8];
                ++n5;
                n2 = n3;
                n8 = n3 + 1;
                while (n8 < n4) {
                    object.d[n2] = object.d[n8];
                    n2 = n8++;
                }
                if (n3 >= --n4) {
                    n3 = 0;
                }
                n2 = n4 << 1;
            }
            object.a = false;
        }
    }
}

