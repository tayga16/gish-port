package com.hardwire.blob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.bluetooth.BluetoothConnectionException;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

final class be implements ah {
   private String a = null;
   private String b = null;
   private Connection a = null;
   private StreamConnection a;
   private InputStream a;
   private OutputStream a;
   boolean a = true;

   public be(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String b() {
      return this.b;
   }

   public final void a() {
      String var1 = this.b;
      if (this.b == null) {
         throw new IOException();
      }

      try {
         if (ao.a(var1)) {
            ao.a();
         }

         for (int var2 = 0; this.a == null && var2 < 1; var2++) {
            try {
               this.a = Connector.open(var1);
            } catch (BluetoothConnectionException var4) {
               if (var4.getStatus() != 5) {
                  throw var4;
               }
            }
         }

         if (this.a == null) {
            throw new IOException();
         }

         if (this.a instanceof StreamConnection) {
            this.a = (StreamConnection)this.a;
            if (this.a) {
               this.a = new al(this.a.openInputStream());
            } else {
               this.a = this.a.openInputStream();
            }

            this.a = this.a.openOutputStream();
         } else {
            throw new IOException();
         }
      } catch (IllegalArgumentException var5) {
         throw new IOException();
      } catch (SecurityException var6) {
         throw var6;
      } catch (RuntimeException var7) {
         throw new IOException();
      }
   }

   public final void b() {
      try {
         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         if (this.a != null) {
            this.a.close();
            this.a = null;
         }
      } finally {
         this.a = null;
         this.a = null;
         this.a = null;
         this.a = null;
      }
   }

   public final boolean a() {
      return this.a != null;
   }

   public final String a() {
      return this.a;
   }

   public final boolean b() {
      return false;
   }

   public final void a(r var1) {
      throw new RuntimeException();
   }

   public final byte[] a(byte[] var1) {
      this = this;
      int var2 = 0;
      int var4 = null;
      if ((var2 = this.a.read()) < 0) {
         return null;
      }

      if (var1 == null || var1.length < var2 + 1) {
         var1 = new byte[var2 + 1];
      }

      var1[0] = (byte)var2;

      for (int var3 = 1; var3 <= var2; var3++) {
         var4 = null;
         if ((var4 = this.a.read()) < 0) {
            return null;
         }

         var1[var3] = (byte)var4;
      }

      return var1;
   }

   public final void a(byte[] var1) {
      be var2;
      (var2 = this).a.write(var1);
      var2.a.flush();
   }
}
