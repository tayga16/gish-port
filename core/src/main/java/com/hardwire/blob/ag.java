package com.hardwire.blob;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;

public final class ag {
   private an a;
   private b a;
   private aw a;
   private x a;
   private m a;
   private ax a;
   private ax b;
   private ax c;
   private ay a;
   private ay b;
   private ax d;
   private ay c;
   private ay d;
   private static Hashtable a = new Hashtable(1);
   private boolean a = true;
   private ah a = null;
   private boolean b = true;
   private ah b = null;
   private boolean c = false;

   final boolean a() {
      return this.a;
   }

   final void a(boolean var1) {
      this.a = var1;
      this.a = null;
   }

   final boolean b() {
      return this.a != null;
   }

   final void a(ah var1) {
      this.a = var1;
   }

   final ah a() {
      return this.a;
   }

   public static ag a(an var0, b var1) {
      ag var2;
      if ((var2 = (ag)a.get(var0)) == null) {
         var2 = new ag(var0, var1);
         a.put(var0, var2);
      }

      return var2;
   }

   private ag(an var1, b var2) {
      this.a = var1;
      this.a = var2;
      this.a((x)null, this.b());
   }

   final an a() {
      return this.a;
   }

   final aw a() {
      if (this.a == null) {
         ae var1;
         if ((var1 = w.a()).a == null) {
            var1.a = new aw();
         }

         this.a = var1.a;
      }

      return this.a;
   }

   public final x a() {
      return this.a;
   }

   public final boolean c() {
      return this.a != null ? this.a.a() : this.b;
   }

   public final void b(boolean var1) {
      if (this.a != null) {
         this.a.a(var1);
      } else {
         this.b = var1;
      }
   }

   final ah b() {
      if (this.a != null) {
         an var1 = this.a;
         return this.a.a(this.a.a);
      } else {
         return this.b;
      }
   }

   final void b(ah var1) {
      ah var2 = null;
      if (this.a != null) {
         an var3 = this.a;
         var2 = this.a.a(this.a.a);
         var3 = this.a;
         this.a.a(this.a.a, var1);
      } else {
         var2 = this.b;
         this.b = var1;
      }

      this.c = false;
      if (!this.c()) {
         try {
            if (var2 == null || !var2.b().equalsIgnoreCase(var1.b())) {
               this.b(true);
               this.c = true;
            }

            return;
         } catch (IOException var4) {
         }
      }
   }

   final boolean d() {
      return this.b() != null;
   }

   final Vector a() {
      return this.a != null ? this.a.a() : null;
   }

   final boolean e() {
      Vector var1;
      return (var1 = this.a()) != null && var1.size() > 0;
   }

   final x b() {
      if (this.a == null) {
         this.a = new m(this);
      }

      return this.a;
   }

   final x c() {
      if (this.a == null) {
         this.a = new ax(this, 1);
      }

      return this.a;
   }

   final x d() {
      if (this.b == null) {
         this.b = new ax(this, 0);
      }

      return this.b;
   }

   final x e() {
      if (this.c == null) {
         this.c = new ax(this, 3);
      }

      return this.c;
   }

   final x f() {
      if (this.a == null) {
         this.a = new ay(this, 3);
      }

      return this.a;
   }

   final x g() {
      if (this.b == null) {
         this.b = new ay(this, 0);
      }

      return this.b;
   }

   final x h() {
      if (this.d == null) {
         this.d = new ax(this, 2);
      }

      return this.d;
   }

   final x i() {
      if (this.c == null) {
         this.c = new ay(this, 2);
      }

      return this.c;
   }

   final x a(x var1, x var2) {
      if (var1 != this.a) {
         throw new IllegalStateException();
      }

      var2.a();
      this.a = var2;
      return var2;
   }

   final x a(ah var1, x var2) {
      if (this.d == null) {
         this.d = new ay(this, 1);
      }

      x var3 = var2;
      var2 = this.d;
      this.d.c = var3;
      ah var6 = var1;
      var2 = this.d;
      this.d.a = var6;
      return this.d;
   }

   final x j() {
      return this.a(this.b(), this.c());
   }

   final x k() {
      i var1 = new i(this);
      j.a().a(0);
      ah var2 = this.b();
      String var4 = j.a().a(11, new String[]{var2.a()});
      var1.a = var4;
      if (this.c) {
         i var5 = new i(this);
         j.a().a(0);
         var4 = j.a().a(31);
         var5.a = var4;
         x var7 = this.b();
         var5.a = var7;
         i var8 = var5;
         var1.a = var8;
      } else {
         x var9 = this.b();
         var1.a = var9;
      }

      return var1;
   }

   final x a(Throwable var1, x var2) {
      i var4 = new i(this);
      j.a().a(0);
      String var5;
      if (var1 instanceof SecurityException) {
         var5 = j.a().a(27);
      } else if (var1 instanceof BluetoothStateException) {
         var5 = j.a().a(29);
      } else {
         var5 = j.a().a(12);
      }

      String var3 = var5;
      var4.a = var3;
      x var6 = var2;
      var4.a = var6;
      return var4;
   }

   final x l() {
      i var1 = new i(this);
      j.a().a(0);
      ah var2 = this.b();
      String var3 = j.a().a(14, new String[]{var2.a()});
      var1.a = var3;
      x var4 = this.c();
      var1.a = var4;
      return var1;
   }

   final x m() {
      i var1 = new i(this);
      j.a().a(0);
      String var3 = j.a().a(15);
      var1.a = var3;
      x var4 = this.d();
      var1.a = var4;
      return var1;
   }

   final x n() {
      i var1 = new i(this);
      j.a().a(0);
      String var3 = j.a().a(9);
      var1.a = var3;
      x var4 = this.c();
      var1.a = var4;
      return var1;
   }

   final x a(Throwable var1) {
      i var2 = new i(this);
      j.a().a(0);
      x var4 = this.c();
      var2.a = var4;
      String var5;
      if (var1 instanceof SecurityException) {
         var5 = j.a().a(26);
      } else if (var1 instanceof BluetoothStateException) {
         var5 = j.a().a(28);
      } else {
         var5 = j.a().a(25);
      }

      String var6 = var5;
      var2.a = var6;
      return var2;
   }

   private x a(String var1, x var2) {
      i var4 = new i(this);
      j.a().a(0);
      String var3 = var1;
      var4.a = var3;
      x var5 = var2;
      var4.a = var5;
      return var4;
   }

   final x a(boolean var1, x var2) {
      return var1 ? this.a(j.a().a(21), var2) : this.a(j.a().a(22), var2);
   }
}
