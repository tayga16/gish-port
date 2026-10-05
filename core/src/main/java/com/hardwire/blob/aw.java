package com.hardwire.blob;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public final class aw implements DiscoveryListener {
   private static DiscoveryAgent a;
   private ay a = null;
   private Vector b = null;
   public Vector a = null;
   public volatile boolean a = false;
   private volatile boolean b = true;
   private volatile int a = -1;

   public final void a(ay var1) {
      if (this.a) {
         throw new IllegalStateException();
      }

      this.a = var1;
      this.a = true;

      try {
         this.b = new Vector();
         this.a = new Vector();
         this.b = false;
         this.a = -1;
         boolean var10000 = a().startInquiry(10390323, this);
         boolean var15 = false;
         if (!var10000) {
            throw new IOException();
         }

         this.b();
         if (this.a == -1 || this.a == 7) {
            throw new IOException();
         }

         int var16 = 0;
         int var2 = this.b.size();
         int[] var3 = new int[2];
         Enumeration var4 = this.b.elements();

         while (var4.hasMoreElements()) {
            var3[0] = ++var16;
            var3[1] = var2;
            this.a.a(j.a().a(7, var3));
            RemoteDevice var5;
            String var6 = (var5 = (RemoteDevice)var4.nextElement()).getBluetoothAddress();
            String var7 = null;

            for (int var8 = 0; var7 == null && var8 < 3; var8++) {
               try {
                  if (var8 > 0) {
                     try {
                        Thread.sleep(var8 * 1000);
                     } catch (InterruptedException var12) {
                     }
                  }

                  var7 = var5.getFriendlyName(true);
               } catch (IOException var13) {
               }
            }

            if (var7 != null && (var7 = var7.trim()).length() <= 0) {
               var7 = null;
            }

            String var18 = var7;
            if (var7 == null) {
               var18 = var6;
            }

            ao var17 = new ao(var18, var5);
            this.a.addElement(var17);
         }
      } finally {
         this.a = false;
      }
   }

   public final void a() {
      a().cancelInquiry(this);
   }

   private synchronized void b() {
      if (!this.b) {
         try {
            this.wait(60000L);
         } catch (InterruptedException var3) {
         }

         if (!this.b) {
            try {
               this.a();

               try {
                  this.wait(5000L);
               } catch (InterruptedException var1) {
               }
            } catch (IOException var2) {
            }
         }
      }

      if (!this.b) {
         this.b = true;
      }
   }

   public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
      switch (var2.getMajorDeviceClass()) {
         case 256:
         case 512:
         case 768:
            return;
         default:
            this.b.addElement(var1);
            int var3 = this.b.size();
            this.a.a(j.a().a(6, new int[]{var3}));
      }
   }

   public final synchronized void inquiryCompleted(int var1) {
      this.a = var1;
      this.b = true;
      this.notify();
   }

   public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
      throw new IllegalStateException();
   }

   public final void serviceSearchCompleted(int var1, int var2) {
      throw new IllegalStateException();
   }

   static DiscoveryAgent a() {
      if (a == null) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var2) {
         }

         LocalDevice var0;
         if ((var0 = ao.a()) == null) {
            throw new IOException();
         }

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
         }

         a = var0.getDiscoveryAgent();
      }

      return a;
   }
}
