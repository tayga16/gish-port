/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nokia.mid.ui.DeviceControl
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
package com.hardwire.blob;

import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Main
extends MIDlet
implements Runnable {
    public static int a;
    public static int b;
    public static int c;
    public ar a;
    public u a;
    public ad a;
    public d a;
    public d b;
    private Display a;
    public byte a;
    public boolean a;
    private boolean l = false;
    private static boolean m;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public boolean f;
    public boolean g;
    private int g = true;
    private long a;
    public int d = 2;
    private long b;
    private RecordStore a;
    private ByteArrayOutputStream a;
    public DataOutputStream a;
    private ByteArrayInputStream a;
    public DataInputStream a;
    public at a;
    public an a;
    public ag a;
    public byte b;
    public ag b;
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public int[][] a;
    private boolean n = false;
    public static boolean h;
    public static int e;
    public static boolean i;
    private boolean o;
    public static int f;
    public static boolean j;
    public static boolean k;
    private Player[] a;
    private VolumeControl[] a = null;
    private static Class a;

    protected void startApp() {
        if (m) {
            this.d();
            return;
        }
        m = true;
        this.a = (byte)2;
        this.a = new d(this);
        this.b = new d(this);
        this.a = new ad(this);
        this.a = new ar(this);
        this.a = new u(this);
        this.a = new at(this.a);
        this.a.a();
        this.a = Display.getDisplay((MIDlet)this);
        this.a.setCurrent((Displayable)this.a);
        this.a.repaint();
        new Thread(this).start();
    }

    public final int[] a(int n2, int n3) {
        int n4;
        boolean[][] blArrayArray = new boolean[a.length][];
        boolean[] blArray = new boolean[a.length];
        for (n4 = 0; n4 < blArrayArray.length; ++n4) {
            blArrayArray[n4] = new boolean[a[n4]];
        }
        try {
            int n5;
            int n6;
            this.a("achi");
            n4 = this.a.readInt();
            int n7 = this.a.readInt();
            int n8 = this.a.readInt();
            for (n6 = 0; n6 < blArrayArray.length; ++n6) {
                for (n5 = 0; n5 < blArrayArray[n6].length; ++n5) {
                    blArrayArray[n6][n5] = this.a.readBoolean();
                }
            }
            for (n6 = 0; n6 < blArray.length; ++n6) {
                blArray[n6] = this.a.readBoolean();
            }
            this.a(false);
            if (n3 == -1) {
                n6 = !blArray[n2] ? 1 : 0;
                blArray[n2] = true;
            } else {
                n6 = !blArrayArray[n2][n3] ? 1 : 0;
                if (n6 != 0) {
                    blArrayArray[n2][n3] = true;
                    ++n8;
                }
            }
            this.b("achi");
            this.a.writeInt(n4);
            this.a.writeInt(n7);
            this.a.writeInt(n8);
            for (n5 = 0; n5 < blArrayArray.length; ++n5) {
                for (n2 = 0; n2 < blArrayArray[n5].length; ++n2) {
                    this.a.writeBoolean(blArrayArray[n5][n2]);
                }
            }
            for (n5 = 0; n5 < blArray.length; ++n5) {
                this.a.writeBoolean(blArray[n5]);
            }
            this.a(true);
            if (n6 != 0) {
                for (n5 = 0; n5 < b.length; ++n5) {
                    if (b[n5] != n8) continue;
                    return new int[]{1, n8};
                }
                for (n5 = 0; n5 < c.length; ++n5) {
                    if (c[n5] != n8) continue;
                    return new int[]{5, n8};
                }
                for (n5 = 0; n5 < d.length; ++n5) {
                    if (d[n5] != n8) continue;
                    return new int[]{4, n8};
                }
                return new int[]{3, n8};
            }
        }
        catch (Exception exception) {}
        return new int[]{0, 0};
    }

    public final void a() {
        switch (this.d) {
            case 0: {
                a = 160;
                b = 160;
                c = 4;
                return;
            }
            case 1: {
                a = 115;
                b = 115;
                c = 3;
                return;
            }
            case 2: {
                a = 70;
                b = 70;
                c = 2;
                return;
            }
            case 3: {
                a = 31;
                b = 31;
                c = 1;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        if (this.a == 2 || this.a == 3) {
            int n2;
            int n3;
            for (n3 = 0; n3 < 3; ++n3) {
                this.a.e = n3;
                this.a.m();
                for (n2 = 0; this.a == 2 && this.a.e == n3 && n2 < 60; ++n2) {
                    try {
                        Thread.sleep(50L);
                        continue;
                    }
                    catch (InterruptedException interruptedException) {}
                }
                this.a.a[n3] = null;
            }
            this.a.e = 3;
            try {
                this.a.a[3] = Image.createImage((String)"/ze_logo.png");
            }
            catch (IOException iOException) {}
            this.a.m();
            for (n3 = 0; this.a == 2 && this.a.e == 3 && n3 < 60; ++n3) {
                try {
                    Thread.sleep(50L);
                    continue;
                }
                catch (InterruptedException interruptedException) {}
            }
            this.a.a[3] = null;
            Object object = this;
            try {
                ((Main)object).a = (byte)3;
                ((Main)object).a.m();
                System.gc();
                e = !Main.a("settings");
                ((Main)object).a.c();
                ((Main)object).a.g();
                if (!e) {
                    ((Main)object).a.f();
                }
                ((Main)object).a.b(4);
                d.d();
                ((Main)object).a.e();
                ((Main)object).b.a();
                ((Main)object).a.b(10);
                ap.a = new af[5];
                for (int i2 = 0; i2 < ap.a.length; ++i2) {
                    n2 = -1;
                    switch (i2) {
                        case 0: {
                            n2 = 4;
                            break;
                        }
                        case 1: 
                        case 4: {
                            n2 = 4;
                            break;
                        }
                        case 2: {
                            n2 = 4;
                            break;
                        }
                        case 3: {
                            n2 = 10;
                        }
                    }
                    ap.a[i2] = i2 == 3 ? new af(6, n2) : new af(6, n2);
                }
                ((Main)object).a.b(4);
                q.a(((Main)object).a);
                ((Main)object).a.b(10);
                ((Main)object).a.a.a = ((Main)object).a.a(145);
                ((Main)object).a.b(4);
                new q(((Main)object).a, 0, 0, 0, 0);
                ((Main)object).a.b(4);
                new ap(((Main)object).a, 0, 0, 0);
                ((Main)object).a.b(4);
                new ai(((Main)object).a);
                ((Main)object).a.b(4);
                new bb(((Main)object).a, 0, new k(((Main)object).a, 0, new as(), new as(), 1), 0, 0);
                ((Main)object).a.b(4);
                Object object2 = object;
                ((Main)object).n = false;
                super.g();
                ((Main)object).a.g();
                ((Main)object).a.b();
                j.a("/tz." + d.a[d.a]);
                j.b("UTF-8");
                j.a().a();
                ((Main)object).a = new an(1);
                Object object3 = ((Main)object).a;
                object2 = ((Main)object).a;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                Object object4 = ((an)object2).a;
                synchronized (object4) {
                    if (((an)object2).b == null) {
                        ((an)object2).b = new Vector(1);
                    }
                    ((an)object2).b.addElement(object3);
                }
                ((Main)object).a.a(((Main)object).a);
                Object object5 = new ba();
                object3 = ((Main)object).a;
                object2 = object5;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                object4 = object2;
                synchronized (object4) {
                    if (((ba)object2).a == null) {
                        ((ba)object2).a = new Vector(1);
                    }
                    ((ba)object2).a.addElement(object3);
                }
                ((Main)object).a.a((av)object5);
                object3 = object;
                object2 = ((Main)object).a;
                if (object3 == null) {
                    throw new NullPointerException();
                }
                object4 = ((an)object2).a;
                synchronized (object4) {
                    if (((an)object2).a == null) {
                        ((an)object2).a = new Vector(1);
                    }
                    ((an)object2).a.addElement(object3);
                }
                object5 = aj.a((MIDlet)object);
                ((Main)object).a = ag.a(((Main)object).a, (b)object5);
                if (e) {
                    ((Main)object).a.b(false);
                }
                if (!Main.a("achi")) {
                    int n4;
                    ((Main)object).b("achi");
                    ((Main)object).a.writeInt(0);
                    ((Main)object).a.writeInt(0);
                    ((Main)object).a.writeInt(0);
                    for (n4 = 0; n4 < a.length; ++n4) {
                        for (int i3 = 0; i3 < a[n4]; ++i3) {
                            ((Main)object).a.writeBoolean(false);
                        }
                    }
                    for (n4 = 0; n4 < a.length; ++n4) {
                        ((Main)object).a.writeBoolean(false);
                    }
                    ((Main)object).a(true);
                }
                ((Main)object).a.h();
                System.gc();
            }
            catch (Exception exception) {}
            ((Main)object).a();
            b = true;
            this.a = 1;
            this.a.b = 0;
            this.b();
            if (e) {
                object = this.getAppProperty("default-lang");
                int n5 = -1;
                if (object != null) {
                    for (int i4 = 0; i4 < d.a.length; ++i4) {
                        if (((String)object).compareTo(d.a[i4]) != 0) continue;
                        n5 = i4;
                        break;
                    }
                }
                if (n5 == -1) {
                    this.a.a((byte)42);
                } else {
                    d.a = n5;
                    this.a.e();
                    this.a.a();
                }
            } else {
                this.a.a();
            }
            this.a = 1;
            this.a.m();
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.g = 0;
        this.f = false;
        do {
            long l2 = 0L;
            long l3 = 0L;
            do {
                try {
                    long l4;
                    this.b();
                    l3 = System.currentTimeMillis();
                    boolean bl = true;
                    this.o = false;
                    if (!this.a.a) {
                        switch (this.a) {
                            case 0: {
                                this.a.c();
                                break;
                            }
                            case 1: {
                                bl = this.a.a();
                            }
                        }
                    }
                    if (!this.f && bl) {
                        this.a.m();
                    }
                    if (this.a.a() && (l4 = System.currentTimeMillis()) - this.b >= 1000L) {
                        this.b = l4;
                        DeviceControl.setLights((int)0, (int)100);
                    }
                    l2 = System.currentTimeMillis() - l3;
                    ++this.g;
                }
                catch (Exception exception) {}
            } while (l2 >= (long)this.a() && !this.f);
            long l5 = (long)this.a() - l2;
            l5 = l5 < 1L ? 1L : l5;
            try {
                Thread.sleep(l5);
            }
            catch (InterruptedException interruptedException) {}
        } while (!this.f);
        this.destroyApp(true);
    }

    public final void b() {
        if (this.a) {
            while (!this.l) {
                try {
                    Thread.sleep(1L);
                }
                catch (Exception exception) {}
            }
            this.a = false;
            this.a.a = true;
            this.a.m();
            this.h();
            this.g();
            if (k && !this.a) {
                this.a(12, true);
            }
            this.a.a = false;
            if (this.a == 0 && this.a.c == 0 && d) {
                this.a.a.a(-7);
            } else if (this.a == 0 && this.a.c == 6) {
                this.a.a.e = 0;
            }
            if (this.a != 1 || this.a.b != 0) {
                this.a.m();
            }
        }
    }

    private int a() {
        if (this.a == 0) {
            if (this.a.b == 1) {
                return b;
            }
            if (this.a.b == 2) {
                return a;
            }
            if (this.a.c == 6 || this.a.c == 9 || this.a.c == 5) {
                return b;
            }
            return 0;
        }
        return b;
    }

    public final void c() {
        this.l = false;
        if (c && !this.a) {
            this.a = true;
            boolean bl = k;
            this.c(12);
            k = bl;
            this.h();
        }
        this.a.b = true;
    }

    public final void d() {
        if (this.a) {
            this.l = true;
        }
    }

    public final void a(String string) {
        string = "gi" + string;
        try {
            this.a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            this.a = RecordStore.openRecordStore((String)string, (boolean)false);
            this.a = new ByteArrayInputStream(this.a.getRecord(1));
            this.a = new DataInputStream(this.a);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(String string) {
        string = "gi" + string;
        try {
            this.a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            RecordStore.deleteRecordStore((String)string);
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {}
        try {
            this.a = RecordStore.openRecordStore((String)string, (boolean)true);
            this.a = new ByteArrayOutputStream();
            this.a = new DataOutputStream(this.a);
            return;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            return;
        }
    }

    public final void c(String string) {
        string = "gi" + string;
        try {
            this.a.closeRecordStore();
        }
        catch (Exception exception) {}
        try {
            RecordStore.deleteRecordStore((String)string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(boolean bl) {
        try {
            if (bl) {
                this.a.flush();
                byte[] byArray = this.a.toByteArray();
                this.a.addRecord(byArray, 0, byArray.length);
                this.a.close();
                this.a.close();
            } else {
                this.a.close();
                this.a.close();
            }
        }
        catch (Exception exception) {}
        try {
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean a(String string) {
        string = "gi" + string;
        try {
            string = RecordStore.openRecordStore((String)string, (boolean)false);
            int n2 = string.getNumRecords();
            string.closeRecordStore();
            return n2 > 0;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
        }
        catch (RecordStoreException recordStoreException) {}
        return false;
    }

    protected void pauseApp() {
        this.c();
    }

    protected void destroyApp(boolean bl) {
        this.f = true;
        Display.getDisplay((MIDlet)this).setCurrent(null);
        this.notifyDestroyed();
    }

    public final void a(int n2) {
        long l2 = System.currentTimeMillis();
        if (this.g && l2 - this.a > (long)n2) {
            this.a = l2;
            try {
                this.a.vibrate(n2);
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void e() {
        as as2 = new as(-512, -512);
        as as3 = new as(32768, -512);
        as as4 = new as(-512, 32768);
        as as5 = new as(32768, 32768);
        as as6 = new as(512, -512);
        as as7 = new as(32256, -512);
        as as8 = new as(-512, 32256);
        as as9 = new as(33280, 32256);
        as as10 = new as(1024, 1024);
        as as11 = new as(-1024, 1024);
        this.a.a = new as[][]{{as2, as3}, {as3, as5}, {as5, as4}, {as4, as2}, {as2, as3, as5}, {as3, as5, as4}, {as5, as4, as2}, {as4, as2, as3}, {as2, as3, null, as5, as4}, {as3, as5, null, as4, as2}, {as2, as3, as5, as4}, {as3, as5, as4, as2}, {as5, as4, as2, as3}, {as4, as2, as3, as5}, {as2, as3, as5, as4, as2}, {as6, as9}, {as8, as7}, {as9.a(as11), as6.a(as11)}, {as7.a(as10), as8.a(as10)}, {new as(as4.a, 14336), new as(as5.a, 14336)}, {new as(14336, as5.b), new as(14336, as3.b)}, {new as(as3.a, 18432), new as(as2.a, 18432)}, {new as(18432, as2.b), new as(18432, as4.b)}, {as6, as9, as8}, {as9, as8, as7}, {as9.a(as11), as6.a(as11), as7.a(as10)}, {as6.a(as11), as7.a(as10), as8.a(as10)}, {new as(as2.a, 15360), as2, as3, new as(as3.a, 15360), new as(as2.a, 15360)}, {new as(8192, as2.b), new as(24576, as2.b), new as(24576, as5.b), new as(8192, as5.b), new as(8192, as2.b)}};
        this.a.a = new byte[this.a.d][this.a.e];
        for (int i2 = 0; i2 < this.a.d; ++i2) {
            for (int i3 = 0; i3 < this.a.e; ++i3) {
                this.a(i2, i3);
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void a(int n2, int n3) {
        byte[][] byArray = this.a.a;
        int n4 = this.a(n2, n3);
        if (n4 == 0) {
            if (!ar.a[this.a.a[1][n2][n3]]) {
                this.a.a[0][n2][n3] = -1;
            }
        } else {
            if (this.a.a[0][n2][n3] == -1 && this.a.b != 93) {
                this.a.a[0][n2][n3] = 11;
            }
            if (this.a.a.a != 0 && this.a.a[0][n2][n3] == 11) {
                this.a.a[0][n2][n3] = 51;
            }
        }
        switch (n4) {
            case -1: {
                byArray[n2][n3] = -1;
                return;
            }
            case 0: {
                n4 = 0;
                byte by = this.a(n2 - 1, n3);
                byte by2 = this.a(n2 + 1, n3);
                byte by3 = this.a(n2, n3 - 1);
                int n5 = this.a(n2, n3 + 1);
                if (by == 0) {
                    ++n4;
                }
                if (by2 == 0) {
                    ++n4;
                }
                if (by3 == 0) {
                    ++n4;
                }
                if (n5 == 0) {
                    ++n4;
                }
                int n6 = Integer.MIN_VALUE;
                block22: do {
                    switch (n6 == Integer.MIN_VALUE ? n4 : n6) {
                        case 4: {
                            n4 = this.a(n2 - 1, n3 - 1);
                            by = this.a(n2 + 1, n3 - 1);
                            by2 = this.a(n2 + 1, n3 + 1);
                            by3 = this.a(n2 - 1, n3 + 1);
                            n5 = 0;
                            if (n4 == -1) {
                                ++n5;
                            }
                            if (by == -1) {
                                ++n5;
                            }
                            if (by2 == -1) {
                                ++n5;
                            }
                            if (by3 == -1) {
                                ++n5;
                            }
                            n6 = 0;
                            if (n5 >= 3) continue block22;
                            if (n4 == -1 && by == -1) {
                                byArray[n2][n3] = 13;
                                return;
                            }
                            if (by == -1 && by2 == -1) {
                                byArray[n2][n3] = 10;
                                return;
                            }
                            if (by2 == -1 && by3 == -1) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            if (by3 == -1 && n4 == -1) {
                                byArray[n2][n3] = 12;
                                return;
                            }
                            if (n4 == -1 && by2 == -1 || by == -1 && by3 == -1) {
                                byArray[n2][n3] = 14;
                                return;
                            }
                            if (n4 == -1) {
                                byArray[n2][n3] = 7;
                                return;
                            }
                            if (by == -1) {
                                byArray[n2][n3] = 4;
                                return;
                            }
                            if (by2 == -1) {
                                byArray[n2][n3] = 5;
                                return;
                            }
                            if (by3 == -1) {
                                byArray[n2][n3] = 6;
                                return;
                            }
                            byArray[n2][n3] = -1;
                            return;
                        }
                        case 3: {
                            if (by3 != 0) {
                                by2 = this.a(n2 + 1, n3 + 1);
                                by3 = this.a(n2 - 1, n3 + 1);
                                if (by3 == -1) {
                                    n6 = 0;
                                    if (by2 == -1) continue block22;
                                }
                                if (by3 == -1) {
                                    byArray[n2][n3] = 12;
                                    return;
                                }
                                if (by2 == -1) {
                                    byArray[n2][n3] = 10;
                                    return;
                                }
                                byArray[n2][n3] = 0;
                                return;
                            }
                            if (by2 != 0) {
                                n4 = this.a(n2 - 1, n3 - 1);
                                by3 = this.a(n2 - 1, n3 + 1);
                                if (n4 == -1) {
                                    n6 = 0;
                                    if (by3 == -1) continue block22;
                                }
                                if (n4 == -1) {
                                    byArray[n2][n3] = 13;
                                    return;
                                }
                                if (by3 == -1) {
                                    byArray[n2][n3] = 11;
                                    return;
                                }
                                byArray[n2][n3] = 1;
                                return;
                            }
                            if (n5 != 0) {
                                by = this.a(n2 + 1, n3 - 1);
                                n4 = this.a(n2 - 1, n3 - 1);
                                if (by == -1) {
                                    n6 = 0;
                                    if (n4 == -1) continue block22;
                                }
                                if (by == -1) {
                                    byArray[n2][n3] = 10;
                                    return;
                                }
                                if (n4 == -1) {
                                    byArray[n2][n3] = 12;
                                    return;
                                }
                                byArray[n2][n3] = 2;
                                return;
                            }
                            if (by == 0) return;
                            by = this.a(n2 + 1, n3 - 1);
                            by2 = this.a(n2 + 1, n3 + 1);
                            if (by == -1) {
                                n6 = 0;
                                if (by2 == -1) continue block22;
                            }
                            if (by == -1) {
                                byArray[n2][n3] = 13;
                                return;
                            }
                            if (by2 == -1) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            byArray[n2][n3] = 3;
                            return;
                        }
                        case 2: {
                            if (by3 != 0 && by2 != 0) {
                                byArray[n2][n3] = (byte)(this.a(n2 - 1, n3 + 1) == -1 ? 14 : 4);
                                return;
                            }
                            if (by2 != 0 && n5 != 0) {
                                byArray[n2][n3] = (byte)(this.a(n2 - 1, n3 - 1) == -1 ? 14 : 5);
                                return;
                            }
                            if (n5 != 0 && by != 0) {
                                byArray[n2][n3] = (byte)(this.a(n2 + 1, n3 - 1) == -1 ? 14 : 6);
                                return;
                            }
                            if (by != 0 && by3 != 0) {
                                byArray[n2][n3] = (byte)(this.a(n2 + 1, n3 + 1) == -1 ? 14 : 7);
                                return;
                            }
                            if (by3 != 0 && n5 != 0) {
                                byArray[n2][n3] = 8;
                                return;
                            }
                            if (by == 0) return;
                            if (by2 == 0) return;
                            byArray[n2][n3] = 9;
                            return;
                        }
                        case 1: {
                            if (by == 0) {
                                byArray[n2][n3] = 10;
                                return;
                            }
                            if (by3 == 0) {
                                byArray[n2][n3] = 11;
                                return;
                            }
                            if (by2 == 0) {
                                byArray[n2][n3] = 12;
                                return;
                            }
                            if (n5 != 0) return;
                            byArray[n2][n3] = 13;
                            return;
                        }
                        case 0: {
                            byArray[n2][n3] = 14;
                            return;
                        }
                    }
                    return;
                } while (true);
                return;
            }
            case 1: {
                switch (this.a.a[1][n2][n3]) {
                    case 1: 
                    case 16: 
                    case 37: 
                    case 68: {
                        byArray[n2][n3] = (byte)(this.a(n2, n3 + 1) != 0 ? 23 : 15);
                        return;
                    }
                    case 2: 
                    case 17: 
                    case 38: 
                    case 67: {
                        byArray[n2][n3] = (byte)(this.a(n2, n3 + 1) != 0 ? 24 : 16);
                        return;
                    }
                    case 3: 
                    case 39: 
                    case 55: {
                        byArray[n2][n3] = (byte)(this.a(n2, n3 - 1) != 0 ? 25 : 17);
                        return;
                    }
                    case 4: 
                    case 40: 
                    case 57: {
                        byArray[n2][n3] = (byte)(this.a(n2, n3 - 1) != 0 ? 26 : 18);
                        return;
                    }
                    case 7: {
                        byArray[n2][n3] = 19;
                        return;
                    }
                    case 10: 
                    case 11: 
                    case 12: {
                        byArray[n2][n3] = (byte)(10 + this.a.a[1][n2][n3]);
                        return;
                    }
                    case 60: {
                        byArray[n2][n3] = 27;
                        return;
                    }
                    case 69: {
                        byArray[n2][n3] = 28;
                    }
                }
                return;
            }
        }
    }

    public final byte a(int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 >= this.a.d || n3 >= this.a.e) {
            return 0;
        }
        n2 = this.a.a[1][n2][n3];
        switch (n2) {
            case -1: 
            case 8: 
            case 9: 
            case 13: 
            case 43: 
            case 70: {
                return -1;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 7: 
            case 10: 
            case 11: 
            case 12: 
            case 16: 
            case 17: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 55: 
            case 57: 
            case 60: 
            case 67: 
            case 68: 
            case 69: {
                return 1;
            }
        }
        return 0;
    }

    private static s a(am am2, as as2) {
        long l2 = Long.MAX_VALUE;
        int n2 = -1;
        for (int i2 = 0; i2 < am2.a.length; ++i2) {
            long l3 = as2.b(am2.a[i2].a).d();
            if (l3 >= l2 || l3 > 8192L) continue;
            n2 = i2;
            l2 = l3;
        }
        if (n2 == -1) {
            return null;
        }
        return am2.a[n2];
    }

    public final DataInputStream a(String string) {
        try {
            InputStream inputStream = null;
            inputStream = null;
            inputStream = Main.a("/" + string + ".lvl");
            if (inputStream == null) {
                return null;
            }
            inputStream = new DataInputStream(inputStream);
            this.a.e();
            this.a.d = ((DataInputStream)inputStream).readByte() & 0xFF;
            this.a.e = ((DataInputStream)inputStream).readByte() & 0xFF;
            this.a.a.b = this.a.a.a;
            this.a.a.a = ((DataInputStream)inputStream).readByte();
            return inputStream;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(DataInputStream dataInputStream) {
        block82: {
            try {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                this.a.a(468 + this.a.a.a);
                if (this.a.b == 112) {
                    for (n10 = 0; n10 < 4; ++n10) {
                        this.a.a(n10 + 531);
                    }
                }
                n10 = dataInputStream.readByte();
                int n11 = dataInputStream.readByte();
                int n12 = n10 + n11;
                int n13 = 0;
                Object object = new int[n12][3];
                for (n9 = 0; n9 < n12; ++n9) {
                    object[n9][0] = dataInputStream.readByte() & 0xFF;
                    object[n9][1] = dataInputStream.readByte() & 0xFF;
                    object[n9][2] = dataInputStream.readByte() & 0xFF;
                    if (object[n9][2] - 2 == 2) {
                        n11 += 3;
                        continue;
                    }
                    if (object[n9][2] - 2 == 5) {
                        n11 += 10;
                        continue;
                    }
                    if (object[n9][2] != 1) continue;
                    ++n13;
                }
                this.a.a = new q[(this.a.b == 1 ? 1 : n13) + n10 - n13];
                this.a.a = new ai[n11];
                n11 = 0;
                n9 = 0;
                n10 = 0;
                n13 = 0;
                block30: for (n8 = 0; n8 < n12; ++n8) {
                    switch (object[n8][2]) {
                        case 1: {
                            if (this.a.b == 1 && n13 != 0) continue block30;
                            this.a.a[n10] = new q(this.a, n13 == 0 ? (byte)0 : 1, 0, (object[n8][0] << 5) - 16, (this.a.e - object[n8][1] << 5) + 16);
                            this.a.a[n10].b = n10;
                            ++n10;
                            ++n13;
                            continue block30;
                        }
                        case 5: {
                            this.a.a[n10] = new q(this.a, 1, this.a.b == 90 ? (byte)1 : (this.a.b == 133 ? (byte)3 : 2), (object[n8][0] << 5) - 16, (this.a.e - object[n8][1] << 5) + 16);
                            this.a.a[n10].b = n10;
                            ++n10;
                            continue block30;
                        }
                        default: {
                            byte by = (byte)(object[n8][2] - 2);
                            n7 = 0;
                            n7 = by != 2 && by != 5 ? n11++ : this.a.a.length - 1 - n9++;
                            this.a.a[n7] = new ai(this.a);
                            this.a.a[n7].a(by, new as((object[n8][0] << 15) - 16384, (this.a.e - object[n8][1] << 15) + 16384), true);
                            ai.a(this.a, ai.a[by]);
                            if (by == 2) {
                                ai.a(this.a, ai.a[0]);
                                continue block30;
                            }
                            if (by != 5) continue block30;
                            ai.a(this.a, ai.a[6]);
                        }
                    }
                }
                for (n8 = (int)n11; n8 < this.a.a.length; ++n8) {
                    if (this.a.a[n8] != null) continue;
                    this.a.a[n8] = new ai(this.a);
                    this.a.a[n8].d = 0;
                }
                n8 = dataInputStream.readByte() & 0xFF;
                this.a.a = new ap[n8];
                am[][] amArray = new am[this.a.d][this.a.e];
                block32: for (n7 = 0; n7 < n8; ++n7) {
                    n10 = (dataInputStream.readByte() & 0xFF) - 1;
                    n11 = this.a.e - (dataInputStream.readByte() & 0xFF);
                    n12 = (dataInputStream.readByte() & 0xFF) - 1;
                    this.a.a[n7] = new ap(this.a, (byte)n12, n10, n11);
                    this.a.a[n7].a();
                    am am2 = this.a.a[n7].a;
                    switch (n12) {
                        case 0: 
                        case 5: {
                            amArray[n10][n11] = am2;
                            continue block32;
                        }
                        case 1: 
                        case 2: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 2][n11] = am2;
                            continue block32;
                        }
                        case 7: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            continue block32;
                        }
                        case 3: 
                        case 6: {
                            amArray[n10][n11] = am2;
                            amArray[n10][n11 - 1] = am2;
                            amArray[n10][n11 - 2] = am2;
                            continue block32;
                        }
                        case 4: {
                            amArray[n10][n11] = am2;
                            amArray[n10][n11 - 1] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 1][n11 - 1] = am2;
                            continue block32;
                        }
                        case 8: {
                            amArray[n10][n11] = am2;
                            amArray[n10 + 1][n11] = am2;
                            amArray[n10 + 2][n11] = am2;
                            amArray[n10 + 3][n11] = am2;
                            continue block32;
                        }
                        case 11: {
                            for (int i2 = 0; i2 < 8; ++i2) {
                                amArray[n10 + i2][n11] = am2;
                            }
                            continue block32;
                        }
                    }
                }
                this.a.d = new boolean[this.a.d];
                this.a.c = new boolean[this.a.e];
                n7 = dataInputStream.readByte() & 0xFF;
                this.a.a = new bb[n7];
                n7 = 0;
                n10 = dataInputStream.readByte() & 0xFF;
                this.a.a = new k[n10];
                for (n11 = 0; n11 < n10; ++n11) {
                    n12 = dataInputStream.readByte() - 1;
                    n13 = dataInputStream.readByte();
                    byte by = dataInputStream.readByte();
                    as as2 = new as((dataInputStream.readByte() & 0xFF) - 1 << 15, this.a.e - (dataInputStream.readByte() & 0xFF) << 15);
                    as as3 = new as((dataInputStream.readByte() & 0xFF) - 1 << 15, this.a.e - (dataInputStream.readByte() & 0xFF) << 15);
                    this.a.a[n11] = new k(this.a, (byte)n12, as2, as3, n13);
                    if (by == 0) {
                        this.a.a[n11].a((byte)0, 0);
                        continue;
                    }
                    if (by == 5) {
                        this.a.a[n11].a((byte)1, 0);
                        continue;
                    }
                    this.a.a[n7] = new bb(this.a, by, this.a.a[n11], (dataInputStream.readByte() & 0xFF) - 1, this.a.e - (dataInputStream.readByte() & 0xFF));
                    this.a.d[this.a.a[n7].a] = true;
                    this.a.c[this.a.a[n7].b] = true;
                    ++n7;
                }
                n11 = dataInputStream.readByte() & 0xFF;
                Vector<am> vector = new Vector<am>();
                object = new as();
                as as4 = new as();
                int[][] nArrayArray = new int[][]{{-1, -1}, {1, -1}, {1, 1}, {-1, 1}, {0, 0}};
                am am3 = null;
                for (n6 = 0; n6 < n11; ++n6) {
                    n10 = dataInputStream.readByte() & 0xFF;
                    n5 = n10 >> 4;
                    n4 = n10 & 0xF;
                    s s2 = null;
                    int[][] nArray = new int[n4][3];
                    for (n3 = 0; n3 < n4; ++n3) {
                        nArray[n3][1] = (dataInputStream.readByte() & 0xFF) - 1;
                        nArray[n3][2] = this.a.e - (dataInputStream.readByte() & 0xFF);
                        nArray[n3][0] = dataInputStream.readByte();
                    }
                    for (n3 = 0; n3 < n4; ++n3) {
                        s s3;
                        block85: {
                            Object object2;
                            block81: {
                                block87: {
                                    block86: {
                                        block83: {
                                            am am4;
                                            block84: {
                                                s3 = null;
                                                n2 = nArray[n3][0];
                                                n13 = nArray[n3][1];
                                                int n14 = nArray[n3][2];
                                                object.a = n13 << 5;
                                                object.b = n14 << 5;
                                                int n15 = nArrayArray[n2][0];
                                                int n16 = nArrayArray[n2][1];
                                                switch (n2) {
                                                    case 1: {
                                                        object.a += 32;
                                                        break;
                                                    }
                                                    case 2: {
                                                        object.a += 32;
                                                        object.b += 32;
                                                        break;
                                                    }
                                                    case 3: {
                                                        object.b += 32;
                                                        break;
                                                    }
                                                    case 4: {
                                                        object.a += 16;
                                                        object.b += 16;
                                                        break;
                                                    }
                                                }
                                                object.a <<= 10;
                                                object.b <<= 10;
                                                if (n3 != 0 && n3 != n4 - 1) break block83;
                                                am4 = null;
                                                if (amArray[n13][n14] != null && (s3 = Main.a(amArray[n13][n14], (as)object)) != null) {
                                                    am4 = amArray[n13][n14];
                                                }
                                                if (s3 == null && amArray[n13 + n15][n14] != null && (s3 = Main.a(amArray[n13 + n15][n14], (as)object)) != null) {
                                                    am4 = amArray[n13 + n15][n14];
                                                }
                                                if (s3 == null && amArray[n13 + n15][n14 + n16] != null && (s3 = Main.a(amArray[n13 + n15][n14 + n16], (as)object)) != null) {
                                                    am4 = amArray[n13 + n15][n14 + n16];
                                                }
                                                if (s3 == null && amArray[n13][n14 + n16] != null && (s3 = Main.a(amArray[n13][n14 + n16], (as)object)) != null) {
                                                    am4 = amArray[n13][n14 + n16];
                                                }
                                                if (n3 != 0) break block84;
                                                if (am4 == null) {
                                                    n13 = nArray[n4 - 1][1];
                                                    n14 = nArray[n4 - 1][2];
                                                    n15 = nArrayArray[nArray[n4 - 1][0]][0];
                                                    n16 = nArrayArray[nArray[n4 - 1][0]][1];
                                                    if (amArray[n13][n14] != null) {
                                                        am4 = amArray[n13][n14];
                                                    } else if (amArray[n13 + n15][n14] != null) {
                                                        am4 = amArray[n13 + n15][n14];
                                                    } else if (amArray[n13 + n15][n14 + n16] != null) {
                                                        am4 = amArray[n13 + n15][n14 + n16];
                                                    } else if (amArray[n13][n14 + n16] != null) {
                                                        am4 = amArray[n13][n14 + n16];
                                                    }
                                                }
                                                am3 = am4;
                                                if (n14 - 1 >= 0) {
                                                    am3.a(amArray[n13][n14 - 1]);
                                                    if (n13 - 1 >= 0) {
                                                        am3.a(amArray[n13 - 1][n14 - 1]);
                                                    }
                                                    if (n13 + 1 < this.a.d) {
                                                        am3.a(amArray[n13 + 1][n14 - 1]);
                                                    }
                                                }
                                                break block83;
                                            }
                                            if (am4 != null && am4 != am3) {
                                                am4.a(am3);
                                                am3.a(am4);
                                            }
                                        }
                                        if (n3 < 1) break block85;
                                        object2 = null;
                                        if (s2 != null || s3 != null) break block86;
                                        if (n3 == 1) {
                                            s3 = new s(new as((as)object), 1024);
                                            s3.b |= 0x20;
                                            am3.a(s3);
                                            object2 = new t(s3, new as(as4), ar.a[n5], ar.b[n5], ar.c[n5]);
                                        }
                                        break block81;
                                    }
                                    if (s3 != null) break block87;
                                    if (n3 == n4 - 1) {
                                        as as5 = new as((as)object);
                                        object2 = new t(s2, as5, ar.a[n5], ar.b[n5], ar.c[n5]);
                                        for (int i3 = 0; i3 < this.a.a.length; ++i3) {
                                            if (!y.a(this.a.a[i3].a.a(), as5)) continue;
                                            this.a.a[i3].a.b(as5);
                                            break block81;
                                        }
                                        break block81;
                                    } else {
                                        s3 = new s(new as((as)object), 1024);
                                        s3.b |= 0x20;
                                        am3.a(s3);
                                        object2 = new t(s2, s3, ar.a[n5], ar.b[n5], ar.c[n5]);
                                    }
                                    break block81;
                                }
                                object2 = s2 == null ? new t(s3, new as(as4), ar.a[n5], ar.b[n5], ar.c[n5]) : new t(s2, s3, ar.a[n5], ar.b[n5], ar.c[n5]);
                            }
                            if (n5 == 1) {
                                ((t)object2).a = 1;
                            }
                            vector.addElement((am)object2);
                            s2 = object2;
                            object2 = am3;
                            ((am)object2).b.addElement(s2);
                        }
                        s2 = s3;
                        as4.c((as)object);
                    }
                }
                n6 = vector.size();
                this.a.a = new t[n6];
                for (n10 = 0; n10 < n6; ++n10) {
                    this.a.a[n10] = (t)vector.elementAt(n10);
                }
                vector.removeAllElements();
                for (n10 = 0; n10 < this.a.a.length; ++n10) {
                    this.a.a[n10].a.b();
                }
                System.gc();
                n10 = d.a(d.a, this.a.b) != -1 ? 1 : 0;
                this.a = null;
                if (n10 != 0) {
                    this.a = new int[a[d.a(d.a, this.a.b)]][2];
                }
                this.a.l = 0;
                this.a.a = new byte[3][this.a.d][this.a.e];
                for (n5 = 0; n5 < this.a.d; ++n5) {
                    for (n4 = this.a.e - 1; n4 >= 0; --n4) {
                        int n17;
                        for (n17 = 0; n17 < 3; ++n17) {
                            n3 = dataInputStream.readByte();
                            this.a.a[n17][n5][n4] = (byte)((n3 & 0xFF) - 1);
                            n2 = this.a.a[n17][n5][n4];
                            if (n2 == -1) continue;
                            this.a.a(ac.a[n17] + n2);
                        }
                        if (this.a.a[1][n5][n4] == 43) {
                            if (n10 != 0) {
                                this.a[this.a.l][0] = n5;
                                this.a[this.a.l][1] = n4;
                            }
                            ++this.a.l;
                        }
                        if (this.a.a[1][n5][n4] != 70 || n10 == 0) continue;
                        if (this.a.b != 1) {
                            this.a.a[1][n5][n4] = -1;
                            continue;
                        }
                        this.a("achi");
                        this.a.readInt();
                        this.a.readInt();
                        this.a.readInt();
                        for (n17 = 0; n17 < a.length; ++n17) {
                            for (n3 = 0; n3 < a[n17]; ++n3) {
                                this.a.readBoolean();
                            }
                        }
                        n17 = d.a(d.a, this.a.b);
                        for (n3 = 0; n3 < a.length; ++n3) {
                            n2 = this.a.readBoolean() ? 1 : 0;
                            if (n3 != n17 || n2 == 0) continue;
                            this.a.a[1][n5][n4] = -1;
                            break;
                        }
                        this.a(false);
                    }
                }
                n6 = this.b.a.length;
                for (n5 = 0; n5 < n6; ++n5) {
                    this.b.a[n5] = false;
                }
                this.a.f = new boolean[this.a.d];
                this.a.e = new boolean[this.a.e];
                this.a.c = dataInputStream.readByte() & 0xFF;
                this.a.a = new short[this.a.c][3];
                for (n5 = 0; n5 < this.a.c; ++n5) {
                    this.a.a[n5][0] = (short)((dataInputStream.readByte() & 0xFF) - 1);
                    this.a.a[n5][1] = (short)(this.a.e - (dataInputStream.readByte() & 0xFF));
                    this.a.a[n5][2] = (short)((dataInputStream.readByte() & 0xFF) - 1);
                    this.a.f[this.a.a[n5][0]] = true;
                    this.a.e[this.a.a[n5][1]] = true;
                    this.b.a[this.a.a[n5][2]] = true;
                    n4 = ac.a[this.a.a[n5][2]];
                    for (int i4 = 0; i4 <= 11; ++i4) {
                        if ((n4 & 1 << i4) == 0) continue;
                        this.a.a(256 + ac.b[i4]);
                        this.a.a(256 + ac.c[i4] + 8);
                    }
                }
            }
            catch (Exception exception) {
                try {
                    dataInputStream.close();
                }
                catch (Exception exception2) {}
                break block82;
            }
            catch (Throwable throwable) {
                try {
                    dataInputStream.close();
                    throw throwable;
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                dataInputStream.close();
            }
            catch (Exception exception) {}
        }
        if (this.a.b == 107) {
            this.a.a(471);
        }
        this.a.d();
        ai.a(this.a);
        q.a(this.a);
        this.b.c();
    }

    public static InputStream a(String string) {
        return (a == null ? (a = Main.a("com.hardwire.blob.Main")) : a).getResourceAsStream(string);
    }

    private void g() {
        if (this.n) {
            return;
        }
        if (this.a == null) {
            this.a = new Player[13];
            this.a = new VolumeControl[this.a.length];
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = null;
            this.d(i2);
            if (b) continue;
            this.a.b(4);
        }
        this.n = true;
    }

    private void d(int n2) {
        if (n2 >= this.a.length) {
            return;
        }
        String string = "";
        switch (n2) {
            case 2: {
                string = "/sound/amber";
                break;
            }
            case 1: {
                string = "/sound/tarball";
                break;
            }
            case 0: {
                string = "/sound/gishhit";
                break;
            }
            case 3: {
                string = "/sound/CLICK015";
                break;
            }
            case 6: {
                string = "/sound/blockbreak";
                break;
            }
            case 7: {
                string = "/sound/splash";
                break;
            }
            case 4: {
                string = "/sound/squish";
                break;
            }
            case 5: {
                string = "/sound/switch";
                break;
            }
            case 10: {
                string = "/sound/bobattack";
                break;
            }
            case 8: {
                string = "/sound/necksnap";
                break;
            }
            case 9: {
                string = "/sound/ropebreak";
                break;
            }
            case 11: {
                string = "/sound/visattack";
                break;
            }
            case 12: {
                string = "/sound/sewer.mp3";
            }
        }
        if (n2 != 12) {
            string = string + ".wav";
        }
        InputStream inputStream = null;
        try {
            inputStream = Main.a(string);
        }
        catch (Exception exception) {}
        try {
            this.a[n2] = n2 == 12 ? Manager.createPlayer((InputStream)inputStream, (String)"audio/mpeg") : Manager.createPlayer((InputStream)inputStream, (String)"audio/x-wav");
        }
        catch (Exception exception) {}
        try {
            this.a[n2].realize();
        }
        catch (Exception exception) {}
        try {
            this.a[n2].prefetch();
        }
        catch (Exception exception) {}
        try {
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void h() {
        if (!this.n) {
            return;
        }
        if (this.a == null) {
            return;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null) continue;
            try {
                this.a[i2].close();
            }
            catch (Exception exception) {}
            this.a[i2] = null;
        }
        this.n = false;
    }

    public final boolean a(int n2) {
        try {
            return this.a[12].getState() == 400;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public final void a(int n2, boolean bl) {
        try {
            if (n2 == 12) {
                if (!j) {
                    return;
                }
                if (f == 0) {
                    return;
                }
                k = true;
                if (this.a[n2].getState() == 400) {
                    return;
                }
            } else {
                if (!i || !h) {
                    return;
                }
                if (this.o) {
                    return;
                }
                if (e == 0) {
                    return;
                }
                if (n2 >= this.a.length) {
                    switch (n2) {
                        case 8: {
                            n2 = 4;
                            break;
                        }
                        case 9: {
                            n2 = 6;
                            break;
                        }
                        case 10: {
                            return;
                        }
                        case 11: {
                            n2 = 0;
                            break;
                        }
                        case 3: {
                            n2 = 1;
                        }
                    }
                }
                if (n2 >= this.a.length) {
                    return;
                }
                if (this.a[n2] == null) {
                    return;
                }
                boolean bl2 = false;
                for (int i2 = n2; i2 == n2; ++i2) {
                    if (i2 == 12 || this.a[i2].getState() != 400) continue;
                    bl2 = true;
                }
                if (bl2) {
                    return;
                }
            }
            try {
                if (this.a[n2] == null || this.a[n2].getState() == 0) {
                    this.a[n2] = null;
                    this.a[n2] = null;
                    this.d(n2);
                }
            }
            catch (Exception exception) {}
            try {
                if (this.a[n2].getState() != 300) {
                    this.a[n2].prefetch();
                }
            }
            catch (Exception exception) {}
            this.b(n2);
            try {
                this.a[n2].setLoopCount(bl ? -1 : 1);
            }
            catch (Exception exception) {}
            try {
                this.a[n2].start();
                if (n2 != 12) {
                    this.o = true;
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void b(int n2) {
        if (this.a[n2] == null) {
            try {
                this.a[n2] = (VolumeControl)this.a[n2].getControl("VolumeControl");
            }
            catch (Exception exception) {}
        }
        if (this.a[n2] == null) {
            return;
        }
        try {
            if (n2 != 12) {
                this.a[n2].setLevel(e * 10);
                return;
            }
            this.a[n2].setLevel(f * 10);
        }
        catch (Exception exception) {}
    }

    public final void c(int n2) {
        k = false;
        n2 = 0;
        try {
            n2 = this.a[12].getState() == 400 ? 1 : 0;
        }
        catch (Exception exception) {}
        try {
            if (n2 != 0) {
                this.a[12].stop();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f() {
        this.b = this.a;
        x x2 = this.b.a();
        if (x2.a == 0) {
            this.b = this.a;
            this.a.c = this.a.a;
            ((m)this.b.a()).a();
            this.a.e();
            this.a = 1;
        }
    }

    private static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static {
        c = 1;
        m = false;
        b = false;
        c = true;
        d = true;
        e = false;
        a = new int[]{1, 2, 1, 1, 0, 2, 1, 1, 2, 1, 2, 0, 6, 3, 2, 1, 2, 0, 0, 2, 3, 1, 1, 0, 1, 1, 1, 1, 0, 1, 2, 2, 3, 0, 1, 2, 1, 3, 2, 0, 2, 1, 2, 2, 0, 2, 2, 1, 2, 0, 1};
        b = new int[]{2, 10, 25, 50, 71};
        c = new int[]{5, 20, 35, 45, 60};
        d = new int[]{12, 30, 40, 55, 65};
        e = new int[]{0, 4953, 1758, 0, 0, 0, 3467, 0, 0, 0, 8734, 0, 0, 0, 5719, 0, 0, 0, 0, 0, 6187, 0, 0, 0, 0, 0, 4731, 0, 0, 0, 0, 0, 7317, 0, 0, 0, 0, 2479, 0, 0, 0, 6729, 0, 0, 0, 9347, 0, 0, 3971, 0, 0};
        h = false;
        e = 5;
        i = true;
        f = 4;
        j = true;
        k = false;
    }
}

