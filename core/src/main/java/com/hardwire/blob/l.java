package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class l
extends x {
    public volatile String a;
    public volatile boolean a;
    x a;
    x b;
    private volatile bd a;

    l(ag ag2) {
        super(2, ag2);
    }

    synchronized void a(String string) {
        this.a = string;
    }

    final synchronized void a(boolean bl) {
        this.a = bl;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final synchronized x a() {
        if (this.a()) {
            this.a((bd)null);
            l l2 = this;
            return ((x)l2).a.a(this, this.a);
        }
        throw new IllegalStateException();
    }

    public final x b() {
        l l2 = this;
        if (!l2.a) {
            throw new IllegalStateException();
        }
        this.a((bd)null);
        l2 = this;
        return ((x)l2).a.a(this, this.b);
    }

    private synchronized void a(bd bd2) {
        this.a = null;
    }
}

