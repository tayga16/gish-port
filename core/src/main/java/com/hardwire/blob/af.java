package com.hardwire.blob;

import javax.microedition.lcdui.Graphics;

public final class af {
   private byte a;
   private int[] a;
   private int[] b;
   private int[] c;
   private boolean a = false;
   private int[] d;

   public final void a(Graphics var1, int var2) {
      if (this.a == 4) {
         int var12 = this.c.length / 3;
         var1.setColor(var2);

         for (int var14 = 0; var14 < var12; var14++) {
            var2 = var14 * 3;
            int var5 = this.c[var2];
            int var6 = this.c[var2 + 1];
            var2 = this.c[var2 + 2];
            var1.fillTriangle(this.a[var5], this.b[var5], this.a[var6], this.b[var6], this.a[var2], this.b[var2]);
         }
      } else if (this.a == 3) {
         var1.setColor(var2);
         int var11 = this.a.length - 1;
         var2 = 0;

         for (int var13 = var11 - 1; var2 < var11; var13 = var2++) {
            var1.fillTriangle(this.a[var13], this.b[var13], this.a[var2], this.b[var2], this.a[var11], this.b[var11]);
         }
      } else {
         if (this.a == 6) {
            var1.setColor(var2);
            int var3 = this.a.length;
            var2 = 2;

            for (int var4 = 1; var2 < var3; var4 = var2++) {
               var1.fillTriangle(this.a[var4], this.b[var4], this.a[var2], this.b[var2], this.a[0], this.b[0]);
            }
         }
      }
   }

   public af(byte var1, int var2) {
      this.a = var1;
      if (this.a == 2 || this.a == 3 || this.a == 6 || this.a == 4 || this.a == 5 || this.a == 8) {
         this.a = new int[this.a == 3 ? var2 + 1 : var2];
         this.b = new int[this.a == 3 ? var2 + 1 : var2];
      }
   }

   public final void a(s[] var1, as var2) {
      if (this.a == 2 || this.a == 3 || this.a == 6 || this.a == 4 || this.a == 5 || this.a == 8) {
         int var3 = var1.length;

         for (int var4 = 0; var4 < var3; var4++) {
            as var5 = var1[var4].a;
            this.a[var4] = var5.a >> 10;
            this.b[var4] = var5.b >> 10;
         }

         if (this.a == 3) {
            this.a[var1.length] = var2.a >> 10;
            this.b[var1.length] = var2.b >> 10;
         }
      }

      if (this.a == 1 || this.a == 4) {
         s[] var23 = var1;
         af var22 = this;
         if (this.c != null && !var22.a) {
            int var24 = var22.c.length / 3;
            boolean var26 = false;

            for (int var6 = 0; var6 < var24; var6++) {
               int var28 = var6 * 3;
               as var7 = var23[var22.c[var28]].a;
               as var8 = var23[var22.c[var28 + 1]].a;
               as var29 = var23[var22.c[var28 + 2]].a;
               if ((int)((long)(var8.a - var7.a) * (var29.b - var7.b) - (long)(var8.b - var7.b) * (var29.a - var7.a) >> 10) >= 0) {
                  var26 = true;
                  break;
               }
            }

            if (!var26) {
               return;
            }
         }

         if (var22.c == null) {
            var22.c = new int[(var23.length - 2) * 3];
         }

         int var25 = 0;
         int var27 = var23.length;
         if (var22.d == null) {
            var22.d = new int[var27];
         }

         int var30 = 0;

         while (var30 < var27) {
            var22.d[var30] = var30++;
         }

         var30 = var27 << 1;
         int var36 = var27 - 1;

         while (var27 > 2) {
            if (0 >= var30--) {
               var22.a = true;
               return;
            }

            int var37 = var36;
            if (var36 >= var27) {
               var37 = 0;
            }

            if ((var36 = var37 + 1) >= var27) {
               var36 = 0;
            }

            int var39;
            if ((var39 = var36 + 1) >= var27) {
               var39 = 0;
            }

            int var14 = var27;
            int[] var13 = var22.d;
            int var12 = var39;
            int var11 = var36;
            int var10 = var37;
            s[] var9 = var23;
            as var15 = var23[var13[var11]].a;
            as var16 = var9[var13[var10]].a;
            as var17 = var9[var13[var12]].a;
            boolean var10000;
            if ((int)((long)(var15.a - var16.a) * (var17.b - var16.b) - (long)(var15.b - var16.b) * (var17.a - var16.a) >> 10) < 0) {
               var10000 = false;
            } else {
               int var18 = 0;

               while (true) {
                  if (var18 >= var14) {
                     var10000 = true;
                     break;
                  }

                  if (var18 != var10 && var18 != var11 && var18 != var12) {
                     as var19 = var9[var13[var18]].a;
                     int var20 = (int)((long)(var17.a - var15.a) * (var19.b - var15.b) - (long)(var17.b - var15.b) * (var19.a - var15.a) >> 10);
                     int var21 = (int)((long)(var15.a - var16.a) * (var19.b - var16.b) - (long)(var15.b - var16.b) * (var19.a - var16.a) >> 10);
                     int var40 = (int)((long)(var16.a - var17.a) * (var19.b - var17.b) - (long)(var16.b - var17.b) * (var19.a - var17.a) >> 10);
                     if (var20 >= 0 && var21 >= 0 && var40 >= 0) {
                        var10000 = false;
                        break;
                     }
                  }

                  var18++;
               }
            }

            if (var10000) {
               var30 = var25 * 3;
               var22.c[var30++] = var22.d[var39];
               var22.c[var30++] = var22.d[var36];
               var22.c[var30] = var22.d[var37];
               var25++;
               var30 = var36;

               for (int var38 = var36 + 1; var38 < var27; var30 = var38++) {
                  var22.d[var30] = var22.d[var38];
               }

               if (var36 >= --var27) {
                  var36 = 0;
               }

               var30 = var27 << 1;
            }
         }
      }
   }
}
