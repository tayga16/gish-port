package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.bluetooth.BluetoothStateException
 */
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;

public final class ay
extends l
implements Runnable {
    private int b;
    ah a;
    x c;

    public ay(ag object, int n2) {
        super((ag)object);
        this.b = n2;
        switch (n2) {
            case 0: {
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                object = this;
                x x2 = ((x)this).a.g();
                object = this;
                ((l)this).a = x2;
                return;
            }
        }
        throw new IllegalStateException();
    }

    protected final void a() {
        switch (this.b) {
            case 0: {
                Object object;
                ay ay2 = this;
                if (((x)this).a.a()) {
                    ay2 = this;
                    object = ((x)ay2).a.b();
                    ay2 = this;
                    ((l)this).b = object;
                } else {
                    ay2 = this;
                    object = ((x)ay2).a.c();
                    ay2 = this;
                    ((l)this).b = object;
                }
                j.a().a(0);
                object = j.a().a(8);
                ay2 = null;
                super.a((String)object);
                this.a(false);
                new Thread(this).start();
                return;
            }
            case 1: {
                this.a(false);
                j.a().a(0);
                Object object = j.a().a(10, new String[]{this.a.a()});
                ay ay3 = this;
                super.a((String)object);
                ay3 = this;
                object = ((x)ay3).a.a((Throwable)null, this.c);
                ay3 = this;
                ((l)this).b = object;
                ay3 = null;
                new Thread(this).start();
                return;
            }
            case 2: {
                this.a(false);
                j.a().a(0);
                Object object = this;
                object = ((x)object).a.b();
                Object object2 = j.a().a(13, new String[]{object.a()});
                object = this;
                super.a((String)object2);
                object = this;
                object2 = ((x)object).a.m();
                object = this;
                ((l)this).b = object2;
                new Thread(this).start();
                return;
            }
            case 3: {
                this.a(false);
                j.a().a(0);
                Object object = j.a().a(5);
                ay ay4 = this;
                super.a((String)object);
                ay4 = this;
                object = ((x)ay4).a.n();
                ay4 = this;
                ((l)this).b = object;
                new Thread(this).start();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        switch (this.b) {
            case 0: {
                try {
                    try {
                        ay ay2 = this;
                        aw aw2 = ((x)ay2).a.a();
                        aw2.a();
                        while (true) {
                            aw aw3 = aw2;
                            if (!aw3.a) return;
                            try {
                                Thread.sleep(250L);
                            }
                            catch (InterruptedException interruptedException) {}
                        }
                    }
                    catch (IOException iOException) {}
                    return;
                }
                catch (Throwable throwable) {
                    return;
                }
                finally {
                    this.a(true);
                }
            }
            case 1: {
                try {
                    Object object;
                    Object object2 = this;
                    an an2 = ((x)object2).a.a();
                    try {
                        object2 = this;
                        ((x)object2).a.a(this.a);
                        object2 = this.a;
                        object = an2;
                        Object object3 = ((an)object).b;
                        synchronized (object3) {
                            if (((an)object).a()) {
                                throw new IllegalStateException();
                            }
                            if (object2 == null) {
                                throw new NullPointerException();
                            }
                            r r2 = ((an)object).a = new r((an)object, (ah)object2);
                            r2.a.start();
                            try {
                                ((an)object).a.c();
                            }
                            catch (InterruptedException interruptedException) {
                            }
                            r2 = ((an)object).a;
                            object2 = r2.a;
                            if (object2 != null) {
                                if (object2 instanceof SecurityException) {
                                    throw (SecurityException)object2;
                                }
                                if (object2 instanceof IOException) {
                                    throw (IOException)object2;
                                }
                            }
                            r2 = ((an)object).a;
                            if (!r2.a) {
                                throw new IOException();
                            }
                        }
                    }
                    catch (SecurityException securityException) {
                        object2 = this;
                        object = ((x)object2).a.a(securityException, this.c);
                        object2 = this;
                        ((l)this).b = object;
                    }
                    catch (BluetoothStateException bluetoothStateException) {
                        object2 = this;
                        object = ((x)object2).a.a(bluetoothStateException, this.c);
                        object2 = this;
                        ((l)this).b = object;
                    }
                    catch (IOException iOException) {
                        object2 = this;
                        object = ((x)object2).a.a(iOException, this.c);
                        object2 = this;
                        ((l)this).b = object;
                    }
                    if (!an2.a()) return;
                    object2 = this;
                    ((x)object2).a.b(this.a);
                    object2 = this;
                    object = ((x)object2).a.k();
                    object2 = this;
                    ((l)this).b = object;
                    return;
                }
                catch (Throwable throwable) {
                    ay ay3 = this;
                    x x2 = ((x)ay3).a.a((Throwable)null, this.c);
                    ay3 = this;
                    ((l)this).b = x2;
                    return;
                }
                finally {
                    this.a(true);
                }
            }
            case 2: {
                try {
                    Object object;
                    Object object4 = this;
                    an an3 = ((x)object4).a.a();
                    try {
                        object = an3;
                        object4 = ((an)object).b;
                        synchronized (object4) {
                            if (!((an)object).a()) {
                            } else {
                                ((an)object).b = false;
                                ((an)object).a.a();
                                try {
                                    long l2 = 5000L;
                                    r r3 = ((an)object).a;
                                    for (long i2 = 0L; i2 < l2 && r3.a.isAlive(); i2 += 250L) {
                                        Thread.sleep(250L);
                                    }
                                    r3.a.isAlive();
                                }
                                catch (InterruptedException interruptedException) {}
                            }
                        }
                    }
                    catch (IOException iOException) {}
                    if (an3.a()) return;
                    object4 = this;
                    object = ((x)object4).a.l();
                    object4 = this;
                    ((l)this).b = object;
                    return;
                }
                catch (Throwable throwable) {
                    return;
                }
                finally {
                    this.a(true);
                }
            }
            case 3: {
                Object object = this;
                try {
                    Object object5 = this;
                    Object object6 = ((x)object5).a.a();
                    try {
                        ((aw)object6).a((ay)object);
                        object5 = object6;
                        object = ((aw)object5).a;
                        if (object == null || ((Vector)object).size() <= 0) return;
                        object5 = this;
                        object6 = ((x)object5).a.h();
                        object5 = this;
                        ((l)this).b = object6;
                        return;
                    }
                    catch (SecurityException securityException) {
                        object5 = this;
                        object6 = ((x)object5).a.a(securityException);
                        object5 = this;
                        ((l)this).b = object6;
                        return;
                    }
                    catch (BluetoothStateException bluetoothStateException) {
                        object5 = this;
                        object6 = ((x)object5).a.a(bluetoothStateException);
                        object5 = this;
                        ((l)this).b = object6;
                        return;
                    }
                    catch (IOException iOException) {
                        object5 = this;
                        object6 = ((x)object5).a.a(iOException);
                        object5 = this;
                        ((l)this).b = object6;
                    }
                    return;
                }
                catch (Throwable throwable) {
                    ay ay4 = this;
                    x x3 = ((x)ay4).a.a(throwable);
                    ay4 = this;
                    ((l)this).b = x3;
                    return;
                }
                finally {
                    this.a(true);
                }
            }
        }
        throw new IllegalStateException();
    }

    public final void a(String string) {
        super.a(string);
    }
}

