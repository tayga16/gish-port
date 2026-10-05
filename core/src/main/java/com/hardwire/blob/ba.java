package com.hardwire.blob;

import java.util.Vector;

public final class ba implements av {
   public Vector a = null;
   private int a = 0;
   private int b = 0;
   private final int c = 60;

   public ba() {
      this(60);
   }

   private ba(int var1) {
   }

   private void a(v var1) {
      synchronized (this) {
         if (this.a != null) {
            for (int var3 = 0; var3 < this.a.size(); var3++) {
               ((ad)this.a.elementAt(var3)).a(var1);
            }
         }
      }
   }

   private void b(v var1) {
      synchronized (this) {
         if (this.a != null) {
            for (int var3 = 0; var3 < this.a.size(); var3++) {
               ((ad)this.a.elementAt(var3)).b(var1);
            }
         }
      }
   }

   public final void a(o var1) {
      int var2 = var1.a(-100, 100);
      byte var3 = 0;
      if (var2 < -this.c) {
         var3 = 3;
      } else if (var2 > this.c) {
         var3 = 4;
      }

      if (var3 != this.a) {
         if (this.a != 0) {
            this.b(new v(var1.a(), -1, this.a));
         }

         this.a = var3;
         if (var3 != 0) {
            this.a(new v(var1.a(), -1, this.a));
         }
      }

      var2 = var1.b(-100, 100);
      var3 = 0;
      if (var2 < -this.c) {
         var3 = 1;
      } else if (var2 > this.c) {
         var3 = 2;
      }

      if (var3 != this.b) {
         if (this.b != 0) {
            this.b(new v(var1.a(), -1, this.b));
         }

         this.b = var3;
         if (var3 != 0) {
            this.a(new v(var1.a(), -1, this.b));
         }
      }
   }
}
