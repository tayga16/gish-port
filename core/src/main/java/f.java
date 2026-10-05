/*
 * Decompiled with CFR 0.152.
 */
import com.hardwire.blob.Main;

final class f
implements Runnable {
    private Main a;

    private f(ad ad2, Main main) {
        this.a = main;
    }

    public final void run() {
        try {
            if (!Main.b) {
                return;
            }
            this.a.a.b();
            this.a.a.a = true;
            this.a.a.m();
            this.a.a.f = true;
            if (this.a.a != null && this.a.a.a != null) {
                this.a.b.b();
                this.a.b.c();
            }
            if (this.a.a != null) {
                this.a.a.e();
            }
            this.a.a.f = false;
            this.a.a.c = false;
            this.a.a.a = false;
            if (this.a.a != 1) {
                if (this.a.a == 0 && this.a.a.c == 6) {
                    this.a.a.a.d();
                }
                return;
            }
            this.a.a.a(this.a.a.a);
        }
        catch (Exception exception) {}
    }

    f(ad ad2, Main main, bc bc2) {
        this(ad2, main);
    }
}

