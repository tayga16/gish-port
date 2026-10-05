package com.hardwire.blob;

public final class as {
   public int a;
   public int b;
   public static final as a = new as(0, 0);

   public as() {
      this.a = this.b = 0;
   }

   public as(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public as(as var1) {
      this.a = var1.a;
      this.b = var1.b;
   }

   public as(int var1, long var2, boolean var4) {
      var1 = y.a(var1);
      var4 = false;
      boolean var5 = false;
      if (var1 > 3294198) {
         var5 = true;
         var1 = 6588397 - var1;
      }

      if (var1 > 1647099) {
         var4 = true;
         var1 = 3294198 - var1;
      }

      var1 = var1 * (y.a.length - 1) / 1647099;
      this.a = y.a[y.a.length - 1 - var1];
      this.b = y.a[var1];
      if (var4) {
         this.a = -this.a;
      }

      if (var5) {
         this.b = -this.b;
      }

      this.a = (int)(this.a * var2 >> 10);
      this.b = (int)(this.b * var2 >> 10);
   }

   public final as a() {
      return new as(-this.a, -this.b);
   }

   public final int a() {
      if (this.a()) {
         return 0;
      }

      int var1 = this.a < 0 ? -this.a : this.a;
      int var2 = this.b < 0 ? -this.b : this.b;
      boolean var3 = false;
      if (var1 < var2) {
         var3 = true;
         var1 ^= var2;
         var2 ^= var1;
         var1 ^= var2;
      }

      var1 = var2 * (y.b.length - 1) / var1;
      var1 = y.b[var1] << 10;
      if (var3) {
         var1 = 1647099 - var1;
      }

      if (this.a < 0 && this.b < 0) {
         var1 += 3294198;
      } else if (this.a < 0) {
         var1 = 3294198 - var1;
      } else if (this.b < 0) {
         var1 = 6588397 - var1;
      }

      return var1;
   }

   public final as b() {
      this.a <<= 10;
      this.b <<= 10;
      return this;
   }

   public final void a(as var1) {
      this.a = this.a + var1.a;
      this.b = this.b + var1.b;
   }

   public final void a(int var1, int var2) {
      this.a += var1;
      this.b += var2;
   }

   public final void b(as var1) {
      this.a = this.a - var1.a;
      this.b = this.b - var1.b;
   }

   public final void a(int var1) {
      this.a = (int)((long)this.a * var1 >> 10);
      this.b = (int)((long)this.b * var1 >> 10);
   }

   public final void b(int var1) {
      this.a /= var1;
      this.b /= var1;
   }

   public final void c(int var1) {
      this.a = (int)(((long)this.a << 10) / var1);
      this.b = (int)(((long)this.b << 10) / var1);
   }

   public final as a(as var1) {
      return new as(this.a + var1.a, this.b + var1.b);
   }

   public final as b(as var1) {
      return new as(this.a - var1.a, this.b - var1.b);
   }

   public final int a(as var1) {
      return this.a * var1.b - this.b * var1.a;
   }

   public final boolean a() {
      return this.a == 0 && this.b == 0;
   }

   public final void c(as var1) {
      this.a = var1.a;
      this.b = var1.b;
   }

   public final void b(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int b() {
      int var1;
      if ((var1 = this.c()) == 1024) {
         return var1;
      }

      this.a = (int)(((long)this.a << 10) / var1);
      this.b = (int)(((long)this.b << 10) / var1);
      return var1;
   }

   public final void a() {
      if (this.a == 0) {
         this.b = this.b < 0 ? -1024 : 1024;
      } else if (this.b == 0) {
         this.a = this.a < 0 ? -1024 : 1024;
      } else if (this.a == this.b) {
         if (this.a < 0) {
            this.a = -724;
            this.b = -724;
         } else {
            this.a = 724;
            this.b = 724;
         }
      } else if (this.a == -this.b) {
         if (this.a < 0) {
            this.a = -724;
            this.b = 724;
         } else {
            this.a = 724;
            this.b = -724;
         }
      } else {
         this.b();
      }
   }

   public final int c() {
      return y.a(this.a, this.b);
   }

   public final int d() {
      return (int)((long)this.a * this.a + (long)this.b * this.b >> 10);
   }

   public final long a() {
      return (long)this.a * this.a + (long)this.b * this.b;
   }
}
