package com.hardwire.blob;

public final class ak {
   private int a;
   private int b;
   private int c;
   private int d;
   private long[] a;
   private long[] b;
   private int[] a;
   private int[] b;
   private int[][] a;

   public ak(int var1, int var2, int var3) {
      this.a = var1 >> 15;
      this.b = var2 >> 15;
      if (var1 % 32768 != 0) {
         this.a++;
      }

      if (var2 % 32768 != 0) {
         this.b++;
      }

      this.c = (var3 >> 6) + 1;
      this.d = this.c << 6;
      this.a = new long[this.a * this.c];
      this.b = new long[this.b * this.c];
      this.a = new int[this.d + 1];
      this.b = new int[this.d + 1];
   }

   public final int[] a(int var1, int var2, int[] var3, boolean var4) {
      int[] var29 = this.a;
      if (var2 != 0 && this.c != 0) {
         var2 = var3[0] >> 15;
         int var5 = var3[1] >> 15;
         int var6 = var3[2] >> 15;
         int var26 = var3[3] >> 15;
         var2 = var2 < 0 ? 0 : var2;
         var5 = var5 < 0 ? 0 : var5;
         var6 = var6 >= this.a ? this.a - 1 : var6;
         int var27 = var26 >= this.b ? this.b - 1 : var26;
         var2 *= this.c;
         var5 *= this.c;
         var6 *= this.c;
         int var28 = var27 * this.c;
         int var7 = 0;
         int var8 = var1 >> 6;
         int var9 = var1 == -1 ? -1 : var1 - (var8 << 6);
         long var17 = var1 == -1 ? 0L : (var9 == 63 ? -1L : (1L << var9 + 1) - 1L);

         for (int var22 = var1 == -1 ? 0 : var8; var22 != this.c; var22++) {
            long var13 = 0L;
            long var11 = 0L;

            for (int var20 = var2; var20 <= var6; var20 += this.c) {
               var13 |= this.a[var20 + var22];
            }

            for (int var36 = var5; var36 <= var28; var36 += this.c) {
               var11 |= this.b[var36 + var22];
            }

            var11 &= var13;

            while (var11 != 0L) {
               long var37;
               if (((var37 = var11 & -var11) & var17) == 0L || var22 != var8) {
                  var9 = 0;
                  if ((var37 & 4294967295L) == 0L) {
                     var9 += 32;
                  }

                  if ((var37 & 65535L << var9) == 0L) {
                     var9 += 16;
                  }

                  if ((var37 & 255L << var9) == 0L) {
                     var9 += 8;
                  }

                  if ((var37 & 15L << var9) == 0L) {
                     var9 += 4;
                  }

                  if ((var37 & 3L << var9) == 0L) {
                     var9 += 2;
                  }

                  if ((var37 & 1L << var9) == 0L) {
                     var9++;
                  }

                  var29[++var7] = var9 + (var22 << 6);
               }

               var11 ^= var37;
            }
         }

         var29[0] = var7;
         return var29;
      } else {
         var29[0] = 0;
         return var29;
      }
   }

   public final int[] a(int var1, int var2, int[][] var3) {
      if (var2 != 0 && this.c != 0) {
         var1 = var3.length;
         if (this.a == null || var1 != this.a.length) {
            this.a = null;
            this.a = new int[var1][4];
         }

         for (int var16 = 0; var16 < var1; var16++) {
            int[] var6;
            (var6 = this.a[var16])[0] = var3[var16][0] >> 15;
            var6[1] = var3[var16][1] >> 15;
            var6[2] = var3[var16][2] >> 15;
            var6[3] = var3[var16][3] >> 15;
            var6[0] = var6[0] < 0 ? 0 : var6[0];
            var6[1] = var6[1] < 0 ? 0 : var6[1];
            var6[2] = var6[2] >= this.a ? this.a - 1 : var6[2];
            var6[3] = var6[3] >= this.b ? this.b - 1 : var6[3];
            var6[0] *= this.c;
            var6[1] *= this.c;
            var6[2] *= this.c;
            var6[3] *= this.c;
         }

         var2 = 0;

         for (int var18 = 0; var18 != this.c; var18++) {
            long var8 = 0L;

            for (int var13 = 0; var13 < var1; var13++) {
               long var10 = 0L;
               long var21 = 0L;
               int var14 = this.a[var13][2];

               for (int var4 = this.a[var13][0]; var4 <= var14; var4 += this.c) {
                  var10 |= this.a[var4 + var18];
               }

               var14 = this.a[var13][3];

               for (int var19 = this.a[var13][1]; var19 <= var14; var19 += this.c) {
                  var21 |= this.b[var19 + var18];
               }

               var8 |= var21 & var10;
            }

            while (var8 != 0L) {
               long var22 = var8 & -var8;
               if (0L == 0L || var18 != -1) {
                  int var20 = 0;
                  if ((var22 & 4294967295L) == 0L) {
                     var20 += 32;
                  }

                  if ((var22 & 65535L << var20) == 0L) {
                     var20 += 16;
                  }

                  if ((var22 & 255L << var20) == 0L) {
                     var20 += 8;
                  }

                  if ((var22 & 15L << var20) == 0L) {
                     var20 += 4;
                  }

                  if ((var22 & 3L << var20) == 0L) {
                     var20 += 2;
                  }

                  if ((var22 & 1L << var20) == 0L) {
                     var20++;
                  }

                  this.b[++var2] = var20 + (var18 << 6);
               }

               var8 ^= var22;
            }
         }

         this.b[0] = var2;
         return this.b;
      } else {
         this.b[0] = 0;
         return this.b;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 >>= 15;
      var3 >>= 15;
      var4 >>= 15;
      var5 >>= 15;
      var6 >>= 15;
      var7 >>= 15;
      var8 >>= 15;
      var9 >>= 15;
      if (var2 != var6 || var3 != var7 || var4 != var8 || var5 != var9) {
         this.b(var1, var2, var3, var4, var5);
         this.a(var1, var6, var7, var8, var9);
      }
   }

   public final void a(int var1, int[] var2) {
      this.a(var1, var2[0] >> 15, var2[1] >> 15, var2[2] >> 15, var2[3] >> 15);
   }

   public final void b(int var1, int[] var2) {
      this.b(var1, var2[0] >> 15, var2[1] >> 15, var2[2] >> 15, var2[3] >> 15);
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      var2 = var2 < 0 ? 0 : var2;
      var3 = var3 < 0 ? 0 : var3;
      var4 = var4 >= this.a ? this.a - 1 : var4;
      var5 = var5 >= this.b ? this.b - 1 : var5;
      int var6 = var2 * this.c;
      int var7 = var3 * this.c;
      int var8 = var1 >> 6;
      var1 -= var8 << 6;
      long var9 = 1L << var1;

      while (var2 <= var4) {
         this.a[var6 + var8] = this.a[var6 + var8] | var9;
         var2++;
         var6 += this.c;
      }

      while (var3 <= var5) {
         this.b[var7 + var8] = this.b[var7 + var8] | var9;
         var3++;
         var7 += this.c;
      }
   }

   private void b(int var1, int var2, int var3, int var4, int var5) {
      var2 = var2 < 0 ? 0 : var2;
      var3 = var3 < 0 ? 0 : var3;
      var4 = var4 >= this.a ? this.a - 1 : var4;
      var5 = var5 >= this.b ? this.b - 1 : var5;
      int var6 = var2 * this.c;
      int var7 = var3 * this.c;
      int var8 = var1 >> 6;
      var1 -= var8 << 6;
      long var9 = ~(1L << var1);

      while (var2 <= var4) {
         this.a[var6 + var8] = this.a[var6 + var8] & var9;
         var2++;
         var6 += this.c;
      }

      while (var3 <= var5) {
         this.b[var7 + var8] = this.b[var7 + var8] & var9;
         var3++;
         var7 += this.c;
      }
   }
}
