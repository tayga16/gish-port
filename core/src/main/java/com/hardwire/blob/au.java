package com.hardwire.blob;

public final class au {
   public as[] a;
   public as a;
   public as[] b;
   public int a;
   public int[] a;
   private int[] b;
   private ab a;
   public int b;

   public au(ab var1, as[] var2, as var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = 0;
      this.a = new int[4];
      this.b = new int[4];
      this.a[0] = this.a[1] = Integer.MAX_VALUE;
      this.a[2] = this.a[3] = Integer.MIN_VALUE;

      for (int var4 = 0; var4 < this.a.length; var4++) {
         if (this.a[var4].a < this.a[0]) {
            this.a[0] = this.a[var4].a;
         }

         if (this.a[var4].a > this.a[2]) {
            this.a[2] = this.a[var4].a;
         }

         if (this.a[var4].b < this.a[1]) {
            this.a[1] = this.a[var4].b;
         }

         if (this.a[var4].b > this.a[3]) {
            this.a[3] = this.a[var4].b;
         }
      }
   }

   public final int[] a() {
      this.b[0] = this.a[0] + this.a.a;
      this.b[1] = this.a[1] + this.a.b;
      this.b[2] = this.a[2] + this.a.a;
      this.b[3] = this.a[3] + this.a.b;
      return this.b;
   }

   public final void a(as var1) {
      as var2 = var1.b(this.a);
      au var4 = this;

      for (int var3 = 0; var3 < var4.a; var3++) {
         var4.b[var3].a(var2);
      }

      as var5 = new as(var4.a);
      var4.a.a(var2);
      if (var4.a.b != null) {
         var4.a
            .b
            .a(
               var4.b,
               var4.a[0] + var5.a,
               var4.a[1] + var5.b,
               var4.a[2] + var5.a,
               var4.a[3] + var5.b,
               var4.a[0] + var4.a.a,
               var4.a[1] + var4.a.b,
               var4.a[2] + var4.a.a,
               var4.a[3] + var4.a.b
            );
      }
   }

   public final void b(as var1) {
      if (this.b == null) {
         this.b = new as[8];
      } else if (this.a == this.b.length) {
         as[] var2 = new as[this.a << 1];
         System.arraycopy(this.b, 0, var2, 0, this.a);
         this.b = var2;
      }

      this.b[this.a++] = var1;
   }
}
