package com.hardwire.blob;

import java.util.Vector;

final class ax extends h {
   private int b;
   private boolean a = false;
   private boolean b = false;

   protected ax(ag var1, int var2) {
      super(var1);
      this.b = var2;
      switch (var2) {
         case 0:
            x var4 = super.a.b();
            super.a = var4;
            return;
         case 1:
            x var3 = super.a.b();
            super.a = var3;
            return;
         case 2:
            this.b();
            return;
         case 3:
            this.b();
            return;
         default:
            throw new IllegalStateException();
      }
   }

   protected final void a() {
      switch (this.b) {
         case 0:
            j.a().a(0);
            String[] var10;
            if ((var10 = (this = this).a) == null || var10.length != 2) {
               var10 = new String[2];
            }

            var10[0] = j.a().a(4);
            if (super.a.c()) {
               var10[1] = j.a().a(20);
            } else {
               var10[1] = j.a().a(19);
            }

            String[] var9 = var10;
            super.a = var9;
            return;
         case 1:
            j.a().a(0);
            int var1 = 1;
            var1++;
            if (super.a.b()) {
               var1++;
            } else if (super.a.d()) {
               this.a = true;
               var1++;
            }

            if (super.a.e()) {
               this.b = true;
               var1++;
            }

            String[] var2 = super.a;
            if (super.a == null || var2.length != var1) {
               var2 = new String[var1];
            }

            var1 = 0;
            if (super.a.b()) {
               var1++;
               var2[0] = j.a().a(24);
            } else if (this.a) {
               var1++;
               var2[0] = j.a().a(1);
            }

            if (this.b) {
               var2[var1++] = j.a().a(2);
            }

            var2[var1++] = j.a().a(3);
            if (super.a.c()) {
               var2[var1] = j.a().a(20);
            } else {
               var2[var1] = j.a().a(19);
            }

            String[] var8 = var2;
            super.a = var8;
            return;
         case 2:
            this.c();
            return;
         case 3:
            this.c();
            return;
         default:
            throw new IllegalStateException();
      }
   }

   public final x a(int var1) {
      switch (this.b) {
         case 0:
            this = this;
            x var10 = null;
            var10 = super.a;
            if (var1 >= 0 && var1 <= ((Object[])var10).length - 1) {
               String var7;
               if ((var7 = super.a[var1]).equals(j.a().a(4))) {
                  var10 = super.a.i();
               } else if (var7.equals(j.a().a(20))) {
                  var10 = this.a(false, super.a.d());
               } else {
                  if (!var7.equals(j.a().a(19))) {
                     throw new IllegalArgumentException();
                  }

                  var10 = this.a(true, super.a.d());
               }

               return super.a.a(this, var10);
            }

            throw new IllegalArgumentException();
         case 1:
            this = this;
            x var2 = null;
            var2 = super.a;
            if (var1 >= 0 && var1 <= ((Object[])var2).length - 1) {
               String var6;
               if ((var6 = super.a[var1]).equals(j.a().a(1)) && this.a) {
                  var2 = super.a.j();
               } else if (var6.equals(j.a().a(24)) && super.a.b()) {
                  var2 = super.a.a(super.a.a(), super.a.c());
               } else if (var6.equals(j.a().a(2)) && this.b) {
                  var2 = super.a.e();
               } else if (var6.equals(j.a().a(3))) {
                  var2 = super.a.f();
               } else if (var6.equals(j.a().a(20))) {
                  var2 = this.a(false, super.a.c());
               } else {
                  if (!var6.equals(j.a().a(19))) {
                     throw new IllegalArgumentException();
                  }

                  var2 = this.a(true, super.a.c());
               }

               return super.a.a(this, var2);
            } else {
               throw new IllegalArgumentException();
            }
         case 2:
            return this.b(var1);
         case 3:
            return this.b(var1);
         default:
            throw new IllegalStateException();
      }
   }

   private x a(boolean var1, x var2) {
      super.a.b(var1);
      return super.a.a(var1, var2);
   }

   private void b() {
      x var2 = super.a.c();
      super.a = var2;
   }

   private void c() {
      j.a().a(0);
      Vector var1;
      ax var5;
      String[] var2 = new String[(var1 = (var5 = this).a()).size()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         ah var4 = (ah)var1.elementAt(var3);
         var2[var3] = var4.a();
      }

      var2 = var2;
      var5.a = var2;
   }

   private x b(int var1) {
      int var2 = null;
      var2 = var1;
      Vector var4 = null;
      var4 = this.a();
      if (var2 < 0 || var2 > var4.size() - 1) {
         throw new IllegalArgumentException();
      }

      ah var6;
      if ((var6 = (ah)var4.elementAt(var2)) == null) {
         throw new IllegalArgumentException();
      }

      x var8 = super.a.a(var6, this);
      return super.a.a(this, var8);
   }

   private Vector a() {
      switch (this.b) {
         case 2:
            return super.a.a().a;
         case 3:
            return super.a.a();
         default:
            throw new IllegalStateException();
      }
   }
}
