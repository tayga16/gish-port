package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

final class e
extends TimerTask {
    private final r a;

    e(r r2) {
        this.a = r2;
    }

    public final void run() {
        r r2 = this.a;
        if (!r2.b) {
            r2 = this.a;
            r2.b();
        }
    }
}

