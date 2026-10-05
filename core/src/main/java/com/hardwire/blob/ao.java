package com.hardwire.blob;

import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;

final class ao implements ah, DiscoveryListener {
   private static final UUID[] a = new UUID[]{new UUID("8e1f0cf7508f4875b62cfbb67fd34812", false)};
   private static final UUID[] b = new UUID[]{new UUID(4353L)};
   private String a = null;
   private RemoteDevice a = null;
   private ah a = null;
   private volatile boolean a = false;
   private volatile int a = -1;
   private int b;
   private Vector a;

   ao(String var1, RemoteDevice var2) {
      this.a = var1;
      this.a = var2;
   }

   public final String b() {
      return this.a().b();
   }

   private ah a() {
      if (this.a == null) {
         String var1;
         if ((var1 = this.c()) == null) {
            throw new IOException();
         }

         this.a = w.a(this.a, var1);
      }

      return this.a;
   }

   private String c() {
      String var1 = null;

      for (int var2 = 0; var1 == null && var2 < 3; var2++) {
         if (var2 > 0) {
            try {
               Thread.sleep(var2 * 1000);
            } catch (InterruptedException var5) {
            }
         }

         ao var6 = this;
         ao var3 = this;
         this.a = new Vector();
         var3.b = -1;
         var3.a = false;
         var3.a = -1;
         UUID[] var4 = a;
         if (var3.a != null && var3.a.startsWith("ZeemoteLink")) {
            var4 = b;
         }

         var3.b = aw.a().searchServices(null, var4, var3.a, var3);
         if (var3.b < 0) {
            throw new IOException();
         }

         var3.c();
         if ((var1 = var6.a.size() > 0 ? ((ServiceRecord)var6.a.elementAt(0)).getConnectionURL(0, false) : null) == null && this.a != 6) {
            break;
         }
      }

      return var1;
   }

   public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
      throw new IllegalStateException();
   }

   public final void inquiryCompleted(int var1) {
      throw new IllegalStateException();
   }

   public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         this.a.addElement(var2[var3]);
      }
   }

   public final synchronized void serviceSearchCompleted(int var1, int var2) {
      this.a = var2;
      this.a = true;
      this.notify();
   }

   private synchronized void c() {
      if (!this.a) {
         try {
            this.wait(60000L);
         } catch (InterruptedException var4) {
         }

         if (!this.a) {
            try {
               ao var1 = this;
               if (aw.a().cancelServiceSearch(var1.b)) {
                  try {
                     this.wait(5000L);
                  } catch (InterruptedException var2) {
                  }
               }
            } catch (IOException var3) {
            }
         }
      }

      if (!this.a) {
         this.a = true;
      }
   }

   static boolean a(String var0) {
      return var0 != null && var0.length() >= "btspp:".length() && var0.substring(0, "btspp:".length()).equalsIgnoreCase("btspp:");
   }

   static LocalDevice a() {
      LocalDevice var0 = null;

      try {
         var0 = LocalDevice.getLocalDevice();
      } catch (NullPointerException var1) {
      }

      return var0;
   }

   public final void a() {
      this.a().a();
   }

   public final void b() {
      if (this.a != null) {
         this.a.b();
      }
   }

   public final String a() {
      return this.a;
   }

   public final boolean a() {
      return this.a != null ? this.a.a() : false;
   }

   public final byte[] a(byte[] var1) {
      if (this.a != null) {
         return this.a.a(var1);
      } else {
         throw new IOException();
      }
   }

   public final void a(r var1) {
      if (this.a != null) {
         this.a.a(var1);
      } else {
         throw new IllegalStateException();
      }
   }

   public final boolean b() {
      return this.a().b();
   }

   public final void a(byte[] var1) {
      if (this.a != null) {
         this.a.a(var1);
      } else {
         throw new IOException();
      }
   }
}
