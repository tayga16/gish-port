package com.hardwire.blob;

public final class t {
   public s a;
   public s b;
   public as a;
   private aq a;
   private int a;
   private int b;
   private int c;
   public byte a;
   private as b = new as();

   public t(s var1, s var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.a = null;
      this.b = var3;
      this.c = var4;
      this.a = var5;
      if (this.a == -1) {
         this.a = this.a.a.b(this.b.a).c();
      }

      if (this.c < -1) {
         this.c = (int)((long)(-this.a) * this.c >> 10);
      }

      this.a = 0;
   }

   public t(s var1, as var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = null;
      this.a = null;
      this.b = var3;
      this.c = var4;
      this.a = var5;
      if (this.a == -1) {
         this.a = this.a.a.b(this.a).c();
      }

      if (this.c < -1) {
         this.c = (int)((long)(-this.a) * this.c >> 10);
      }

      this.a = 0;
   }

   public t(s var1, aq var2, int var3, int var4, int var5) {
      this.a = var1;
      this.a = null;
      this.b = null;
      this.a = var2;
      this.b = 512;
      this.c = 10240;
      this.a = 0;
      if (this.a == -1) {
         this.a = this.a.a.b(this.a).c();
      }

      if (this.c < -1) {
         this.c = (int)((long)(-this.a) * this.c >> 10);
      }

      this.a = 0;
   }

   public final boolean a(boolean var1) {
      if ((this.a.b & 16) == 0 && (this.b == null || (this.b.b & 16) == 0)) {
         if (this.b == null) {
            if (this.a == null) {
               int var2 = 1024 - this.a.a;
               this.b.a = this.a.a.a - (int)((long)this.a.a.a.a * var2 >> 10) - (int)((long)this.a.b.a.a * this.a.a >> 10);
               this.b.b = this.a.a.b - (int)((long)this.a.a.a.b * var2 >> 10) - (int)((long)this.a.b.a.b * this.a.a >> 10);
            } else {
               this.b.a = this.a.a.a - this.a.a;
               this.b.b = this.a.a.b - this.a.b;
            }
         } else {
            this.b.a = this.a.a.a - this.b.a.a;
            this.b.b = this.a.a.b - this.b.a.b;
         }

         int var7;
         if ((var7 = this.b.c()) == 0) {
            return false;
         }

         if (!var1 || this.c == -1 || (this.c <= this.a || var7 <= this.c) && (this.c >= this.a || var7 >= this.c)) {
            var1 = var7 - this.a;
            if (this.a == 1 && var1 < 0) {
               return false;
            }

            if (this.a == 2 && var1 > 0) {
               return false;
            }

            if (this.b == 512) {
               var1 >>= 1;
            } else if (this.b < 1024) {
               var1 = (int)((long)this.b * var1 >> 10);
            }

            this.b.a = (this.b.a << 10) / var7;
            this.b.b = (this.b.b << 10) / var7;
            var7 = var1;
            int var3 = var1;
            if (this.b != null && this.b.a != Integer.MAX_VALUE) {
               if (this.a.a != Integer.MAX_VALUE) {
                  if (this.a.a == this.b.a) {
                     var7 = var3 = var1 >> 1;
                  } else {
                     var7 = var1 * this.b.a / (this.a.a + this.b.a);
                     var3 = var1 - var7;
                  }
               }

               this.b.a.a = this.b.a.a + (this.b.a * var3 >> 10);
               this.b.a.b = this.b.a.b + (this.b.b * var3 >> 10);
            } else if (this.a != null && this.a.a.a != Integer.MAX_VALUE && this.a.b.a != Integer.MAX_VALUE) {
               if (this.a.a != Integer.MAX_VALUE) {
                  int var4 = this.a.a.a + this.a.b.a >> 1;
                  if (this.a.a == var4) {
                     var7 = var3 = var1 >> 1;
                  } else {
                     var7 = var1 * var4 / (this.a.a + var4);
                     var3 = var1 - var7;
                  }
               }

               int var9 = this.b.a * var3 >> 10;
               var1 = this.b.b * var3 >> 10;
               this.a.a.a.a = this.a.a.a.a + (var9 * (1024 - this.a.a) >> 10);
               this.a.a.a.b = this.a.a.a.b + (var1 * (1024 - this.a.a) >> 10);
               this.a.b.a.a = this.a.b.a.a + (var9 * this.a.a >> 10);
               this.a.b.a.b = this.a.b.a.b + (var1 * this.a.a >> 10);
            }

            if (this.a.a != Integer.MAX_VALUE) {
               this.a.a.a = this.a.a.a - (this.b.a * var7 >> 10);
               this.a.a.b = this.a.a.b - (this.b.b * var7 >> 10);
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public final void a() {
      this.a.b &= -13;
      if (this.b != null) {
         this.b.b &= -13;
      } else {
         if (this.a != null) {
            this.a.a = Integer.MAX_VALUE;
         }
      }
   }
}
