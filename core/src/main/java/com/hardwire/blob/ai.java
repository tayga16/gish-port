package com.hardwire.blob;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ai {
   public byte a;
   public aa a;
   public aa b;
   private int b;
   public boolean a;
   private q a;
   private ar a;
   private static final int[][] a = new int[][]{
      {279, 280, 288, 293}, {218, 219, 230, 234, 227}, {238, -1, 239, 242, 248}, {251, -1, 256, 252, 304}, {297, 306}, {300}
   };
   private static final int[][] b = new int[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 3}, {1, 0, 3, 6, 3}, {1, 0, 3, 4, 2}, {3, 2}, {4}};
   private static final byte[][] a = new byte[][]{{1, 8, 4, 4, 0}, {1, 8, 4, 4, 0}, {1, 0, 3, 6, 3}, {8, 0, 3, 4, 0}, {4, 0, 12, 2, 0}, {4, 0, 10, 0, 0}};
   private static final byte[][] b = new byte[][]{{0, 2, 2, 4, 0}, {0, 2, 4, 6, 0}, {0, 0, 4, 4, 0}, {2, 0, 4, 4, 0}, {4, 0, 2, 0, 0}, {4, 0, 2, 0, 0}};
   private static int[] c = new int[]{3, 1, 4, -1, 2, 1, 1};
   public byte b;
   public byte c;
   public static final int[] a = new int[]{0, 1, 2, -1, 3, 4, 5};
   public byte d;
   private static Image[][][] a;
   public boolean b;
   private boolean d;
   public int a;
   private int c;
   private int[] d;
   public boolean c;
   private static final int[] e = new int[]{52428800, 1048576000, 1048576000, -1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
   private static final int[] f = new int[]{500, 400, 250, 0, 2764, 0, 0};
   private static final int[] g = new int[]{3145728, 2621440, Integer.MAX_VALUE, -1, 5242880, Integer.MAX_VALUE, 3145728};
   private static int[] h = new int[]{1992294, 2621440, 0, -1, 6291456, -1, 3145728};
   private static final int[] i = new int[]{500, 300, 200, 0, 0, 0, 0};
   public static final int[] b = new int[]{10240, 20480, 0, -1, 5120, 512, 512};
   private static final int[] j = new int[]{3072, 3072, 0, -1, 0};

   public ai(ar var1) {
      this.a = var1;
      this.a = 2;
   }

   public final void a(byte var1, as var2, boolean var3) {
      this.d = var1;
      this.a = 0;
      this.a = false;
      this.b = false;
      this.a = null;
      this.b = null;
      this.b = 0;
      this.c = 0;
      this.a = -1;
      this.c = 0;
      if (this.d == 4) {
         this.a = new aa(new s(var2, 0), 39936);
         this.a.b = 0;
         this.d = false;
      } else {
         if (this.d == 0) {
            this.a = new aa(new s(var2, 6144), 12288);
            this.d = true;
         } else if (this.d == 1) {
            var2.b += 3072;
            this.a = new aa(new s(var2, 16384), 13312);
            this.b = new aa(new s(var2.b(new as(0, 32768)), 16384), 14336);
            this.b.d = 2;
            this.b.a = this;
            this.a.d = 5;
            this.a.a = this;
            this.b.b = 0;
            if (this.a.a != null && this.a.a.b) {
               this.a.a.a(this.b);
            }

            this.b = this.b.a.a.b - this.a.a.a.b;
            this.b.a = this.a;
            this.a.a = this.b;
            this.d = true;
         } else if (this.d == 2) {
            this.a = new aa(new s(var2, 1000000), 15360);
            this.d = false;
         } else if (this.d == 5) {
            this.a = new aa(new s(var2.b(new as(0, 32768)), Integer.MAX_VALUE), 45056);
            this.a.b = 0;
            this.c = 40;
            this.d = false;
         } else if (this.d == 6) {
            this.a = new aa(new s(var2.b(new as(0, 13312)), Integer.MAX_VALUE), 13312);
            this.a.b = 0;
            this.d = false;
         }

         if (this.b == null) {
            this.a.d = 2;
            this.a.a = this;
         }

         if (this.d != 5 && this.d != 6) {
            this.a.b = 102;
         }

         if (this.a.a != null && this.a.a.b) {
            this.a.a.a(this.a);
         }
      }
   }

   public final int[] a() {
      if (this.d == 6) {
         if (this.d == null) {
            this.d = new int[4];
         }

         this.d[0] = this.a.a.a.a - this.a.a;
         this.d[2] = this.a.a.a.a + this.a.a;
         this.d[3] = this.d[1] = this.a.a.a.b + this.a.a * (this.c < 0 ? -1 : 1);
         if (this.c < 0) {
            this.d[3] = this.d[3] + (-this.c << 15);
         } else {
            this.d[1] = this.d[1] - (this.c << 15);
         }

         return this.d;
      } else {
         if (this.b == null) {
            return this.a.a();
         }

         if (this.d == null) {
            this.d = new int[4];
         }

         int[] var1 = this.b.a();
         this.d[0] = var1[0];
         this.d[1] = var1[1];
         this.d[2] = var1[2];
         this.d[3] = var1[3];
         if (this.d == 1) {
            this.d[3] = this.d[3] + 38912;
         }

         return this.d;
      }
   }

   public static void a(ad var0) {
      if (a == null) {
         a = new Image[a.length][][];
      }

      for (int var1 = 0; var1 < a.length; var1++) {
         if (var0.a(256 + a[var1][0]) == null) {
            a[var1] = null;
         } else {
            a[var1] = new Image[a[var1].length][];

            for (int var2 = 0; var2 < a[var1].length; var2++) {
               if (a[var1][var2] != -1) {
                  a[var1][var2] = var0.a(256 + a[var1][var2], b[var1][var2], var1 < 2);
               }
            }
         }
      }
   }

   public static void a(ad var0, int var1) {
      for (int var2 = 0; var2 < a[var1].length; var2++) {
         if (a[var1][var2] != -1) {
            for (int var3 = 0; var3 < b[var1][var2]; var3++) {
               var0.a(256 + a[var1][var2] + var3);
            }
         }
      }
   }

   private int a() {
      switch (this.a) {
         case 0:
         case 6:
            return 0;
         case 1:
            return 2;
         case 2:
         default:
            return 0;
         case 3:
            return 1;
         case 4:
            return 3;
         case 5:
            return 4;
      }
   }

   public final void a(byte var1) {
      if (this.a.b != 4 && (this.d == 2 || this.d == 5) && var1 == 4) {
         boolean var2 = false;
         int var3 = this.a.a.length;

         for (int var4 = 0; var4 < var3; var4++) {
            if (this.a.a[var4].a == 2 && this.a.a[var4].d == 0) {
               var2 = true;
               break;
            }
         }

         if (this.d == 5) {
            this.c = 100;
         }

         if (var2 && this.d == 2) {
            this.c = 45;
         }

         if (!var2) {
            return;
         }
      }

      this.a = var1;
      this.b = 0;
      this.c = 0;
   }

   public final boolean a() {
      return this.a == 1 || this.a == 2 || this.a == 5;
   }

   public final void a(Graphics var1) {
      if (this.a != 2) {
         int var2 = this.a();
         if (this.b < a[a[this.d]][var2]) {
            int var3 = this.a.a.a.a >> 10;
            int var4 = this.a.a.a.b >> 10;
            if (this.d == 4) {
               Image var5 = a[a[this.d]][0][0];
               byte var6 = this.b;
               if (var2 == 0) {
                  var6 = 0;
                  if (this.b < 4) {
                     var4 += (this.b << 1) - 4;
                  } else {
                     var4 += (7 - this.b << 1) - 4;
                  }
               }

               ad.a(
                  var1,
                  a[a[this.d]][var2],
                  var3 + (a[a[this.d]][var2][var6].getWidth() - var5.getWidth() >> 1) * (this.a ? 1 : -1),
                  var4 + (var5.getHeight() >> 1),
                  var6,
                  !this.a,
                  false,
                  33
               );
               if (this.a == 0 || this.a == 3) {
                  int var8 = -1;
                  if ((this.a.a.d & 16) == 0) {
                     var8 = (var8 = this.a.a.d >> 1 & 15) != 0 && var8 != 2 ? (var8 == 1 ? 1 : -1) : 0;
                  }

                  if (var8 != -1) {
                     ad.a(var1, a[a[this.d]][4], var3 + 11 * (this.a ? 1 : -1), var4 - 15, var8, !this.a, false, 3);
                  }
               }
            } else if (this.d == 5) {
               var4 += 48;
               if (this.a == 1) {
                  if (this.a.b == 128) {
                     var4 += this.b * 7;
                  } else {
                     var4 += this.b * 10;
                  }
               }

               Image[] var18 = a[a[this.d]][0];
               var1.drawImage(var18[0], var3, var4, 33);
               int var20 = -1;
               if ((this.a.a.d & 16) == 0) {
                  var20 = (var20 = this.a.a.d >> 1 & 15) != 0 && var20 != 2 ? (var20 == 1 ? 1 : -1) : 0;
               }

               if (this.a == 6) {
                  var20 = 1;
               }

               if (var20 != -1) {
                  var1.drawImage(a[a[this.d]][1][var20], var3, var4, 33);
               }

               ad.a(var1, var18, var3 - 16, var4, 2, false, false, 40);
               ad.a(var1, var18, var3 + 16, var4, 2, true, false, 36);
               var4 -= 37;
               byte var10 = a[a[this.d]][0];
               byte var22 = 0;
               if (!this.a()) {
                  var22 = (byte)(this.b << 1 < var10 >> 1 ? this.b << 1 : var10 - (this.b << 1));
               }

               int var7 = -2 + this.a.b * 6;
               if (this.a.b > 0) {
                  var7 += var22;
                  var22 = 0;
               }

               if (this.a == 6) {
                  var7 = -10;
                  var22 = -3;
                  var4 += 5;
               }

               ad.a(var1, var18, var3 - var7, var4 - var22 + (var10 >> 1), 1, false, false, 40);
               ad.a(var1, var18, var3 + var7, var4 + var22, 1, true, false, 36);
            } else if (this.d == 6) {
               int var19 = this.c < 0 ? -this.c : this.c;
               int var23 = this.c < 0 ? -1 : 1;
               var4 += ((var19 * 32 - this.a.b << 5) / 32 + (this.a.a >> 10)) * var23;

               for (int var11 = 0; var11 < var19; var11++) {
                  var1.drawImage(a[a[this.d]][0][this.b], var3, var4 - (var11 << 5) * var23, 1 | (this.c < 0 ? 16 : 32));
               }
            } else if (this.d == 2) {
               var1.drawImage(a[a[this.d]][var2][this.b], var3, var4 + 16, 33);
               if (var2 == 3 && this.b >= 3 && this.b <= 5) {
                  var1.drawImage(a[a[a[this.d]]][4][this.b - 3], var3, var4 - 14, 33);
               }
            } else {
               if (this.d == 0) {
                  var4 += 12;
               } else if (this.d == 1) {
                  var4 += 13;
               }

               ad.a(var1, a[a[this.d]][var2], var3, var4, this.b, this.a, true, 33);
            }
         }

         if (this.b != null) {
            if (this.a == 5) {
               int var13 = this.b.a * (5 - this.b) / 5 >> 10;
               var1.setColor(49, 49, 49);
               var1.fillArc((this.b.a.a.a >> 10) - var13, (this.b.a.a.b >> 10) - var13, var13 << 1, var13 << 1, 0, 360);
               return;
            }

            int var12 = this.a != 4 && this.a != 1 ? 1 : 2;
            as var17;
            if (this.a != null && (var17 = this.a.a.a().b(this.b.a.a)).b < 0 && (var17.a < 0 ? -var17.a : var17.a) < -var17.b) {
               var12 = 0;
            }

            ad.a(var1, a[this.d][4], this.b.a.a.a >> 10, this.b.a.a.b >> 10, var12, var12 == 0 ? false : this.a, true, 3);
         }
      }
   }

   private void a(int var1) {
      ai var2 = this.a.a[var1];
      int var4 = this.a.a.a.a >> 15;
      int var5 = this.a.a.a.b >> 15;
      boolean var6;
      as var11;
      if (this.a.b == 128 && var1 <= 1) {
         var6 = false;
         int var12 = var1 == 0 ? -3 : 3;
         var11 = this.a.a.a.a(new as(var12 << 15, 311296));
      } else {
         if (var6 = y.b(0, 1) == 1) {
            var5 -= 3;
         }

         int var8 = 0;

         boolean var7;
         do {
            if (this.a.b == 128) {
               var3 = (var1 & 1) == 0 ? y.b(-6, -2) : y.b(2, 6);
            } else if (var6) {
               var3 = y.b(-8, 1);
            } else {
               var3 = y.b(-7, -2);
            }

            var7 = false;

            for (int var9 = 0; var9 < this.a.a.length; var9++) {
               ai var10;
               if ((var10 = this.a.a[var9]).d == 6 && !var10.a() && var10.a.a.a.a >> 15 == var4 + var3 && var10.a.a.a.b >> 15 == var5) {
                  var7 = true;
               }
            }
         } while (var7 && ++var8 < 100);

         var11 = this.a.a.a.a(new as(var3 << 15, 16384 - (var6 ? 131072 : 0)));
      }

      var2.a((byte)6, var11, true);
      if (this.a.b == 123) {
         var2.a = 200;
      }

      if (var6) {
         var2.a.a.a.b = var2.a.a.a.b + (var2.a.a << 1);
         var2.c = -y.b(1, 2);
      } else if (this.a.b == 128 && var1 <= 1) {
         var2.c = 2;
      } else {
         var2.c = y.b(1, 2);
      }
   }

   public final void a() {
      if (this.a != 2) {
         if (this.d == 6 && this.a == 1) {
            this.a.b -= 3;
            if (this.a.b <= 0) {
               this.a = 2;
               this.d = 0;
            }
         } else {
            int var1;
            if ((var1 = this.a()) == 4) {
               if (this.c == 1) {
                  this.c = 0;
                  this.b++;
                  if (this.b == 5) {
                     this.a = 2;
                     this.a.a.b(this.b.c);
                  }
               }

               this.c++;
            } else {
               if (this.c >= b[a[this.d]][var1]) {
                  this.c = 0;
                  this.b++;
                  if (this.a == 1) {
                     if (this.b != null) {
                        if (this.b >= 15 && (this.b.a.b & 2) != 0) {
                           this.a = 5;
                           this.b = 0;
                           this.c = 0;
                           return;
                        }
                     } else if (this.b == a[a[this.d]][var1]) {
                        this.a = 2;
                        if (this.d == 4 || this.d == 5) {
                           this.a.a.c = 6;
                        }

                        if (this.d == 5) {
                           this.a = 1;
                           this.b--;
                        }

                        return;
                     }
                  } else if (this.b == a[a[this.d]][var1]) {
                     this.b = 0;
                     if (var1 == 3 && this.c > 0) {
                        this.a((byte)0);
                     }
                  }
               }

               this.c++;
               if (this.a != 1) {
                  if (this.a.b == 77
                     || (this.a.a.b & 2) == 0
                     || (this.a.a.b & 64) == 0 && (this.b == null || (this.b.a.b & 64) == 0)
                     || (var1 = this.a.a.a.b - this.a.a.b.b) <= j[this.d] && var1 >= -j[this.d]) {
                     if (this.d == 2 && this.a.a()[1] >= this.a.e << 15) {
                        this.a = 2;
                     } else {
                        if ((var1 = this.a.a(this.a.a())) != -1) {
                           if (!this.b && this.a.a.g > 0 && y.a(this.a.a.d, this.a.a())) {
                              aa var18 = this.a;
                              this.a.a.a(this.a.a.a.a >> 10, var1 << 5, 2);
                           }

                           this.b = true;
                           int var10001 = var1 << 15;
                           short var11 = 6;
                           var11 = 200;
                           int var19 = var10001;
                           aa var13 = this.a;
                           if ((var19 = (int)(((long)(this.a.a[3] - var19) << 10) / (var13.a[3] - var13.a[1]))) > 1024) {
                              var19 = 1024;
                           }

                           if (var19 > 0) {
                              var19 = (int)((long)-200 * var19 >> 9) - (var13.a.a.b - var13.a.b.b >> 6);
                              var13.a(new as(0, var19));
                           }
                        } else {
                           this.b = false;
                        }

                        if (this.b != null) {
                           var1 = this.b.a.a.a + this.a.a.a.a >> 1;
                           this.b.a.a.a = var1;
                           this.a.a.a.a = var1;
                           int var22 = this.b.a.a.b - this.a.a.a.b - this.b >> 1;
                           this.b.a.a.b -= var22;
                           this.a.a.a.b += var22;
                        }

                        if (this.a.b == 93) {
                           int var16 = 0;
                           if (this.a.a.c <= 1) {
                              var16 = -f[this.d] >> 2;
                              this.a = false;
                           } else {
                              if (this.a.a.a.a >> 15 >= 19) {
                                 var16 = -f[this.d] >> 2;
                              } else {
                                 var16 = f[this.d] << 1;
                              }

                              this.a = true;
                           }

                           this.a.a(new as(var16, 0));
                           if (this.a != 3) {
                              this.a((byte)3);
                           }

                           if (this.b.a.a.b >> 15 >= this.a.e) {
                              this.a.a.c++;
                              this.a.a.b(this.a.a[0].a);
                              this.a.a.b(this.a.a[1].a);
                              this.a.a.a(this.a.a);
                              this.a.a.a(this.b.a);
                              this.a.a = null;
                              this.a.a = new ap[0];
                              this.a.a = null;
                              this.a.a = new t[0];
                              this.a.a = null;
                              this.a.a = new ai[0];
                              this.a.a.g();
                              this.a.a.c(15);
                           }
                        } else {
                           aa var23 = this.a;
                           as var15 = this.a.a.a;
                           if (this.a != null) {
                              if (this.a.a()) {
                                 this.a = null;
                              } else if (this.a.a.a().b(var15).d() > e[this.d]) {
                                 this.a = null;
                              }
                           }

                           if (this.a == null) {
                              for (int var24 = 0; var24 < this.a.a.length; var24++) {
                                 int var3;
                                 if (!this.a.a[var24].a()
                                    && (var3 = this.a.a[var24].a.a().b(var15).d()) >= 0
                                    && var3 <= e[this.d]
                                    && (this.a == null || var3 < this.a.a.a().b(var15).d())) {
                                    this.a = this.a.a[var24];
                                 }
                              }
                           }

                           if (this.a != null) {
                              as var25 = this.a.a.a().b(var15);
                              if (this.d == 4) {
                                 if (this.a.b == 107) {
                                    if (this.a.a.c == 0) {
                                       this.a = true;
                                       return;
                                    }

                                    if (var25.d() > h[this.d] / 2) {
                                       var25.b();
                                       if (this.a.b < f[this.d]) {
                                          this.a.b = this.a.b + f[this.d] / 30;
                                       }

                                       var25.a(this.a.b);
                                       var15.a(var25);
                                       this.a = var25.a >= 0;
                                       var23 = this.a;
                                       this.a.a = true;
                                    }

                                    if (this.a.a.c == 3) {
                                       int var35 = var15.a >> 15;
                                       int var4 = var15.b >> 15;
                                       boolean var27 = false;

                                       for (int var5 = var35 - 1; var5 <= var35 + 1; var5++) {
                                          for (int var6 = var4 - 1; var6 <= var4 + 1; var6++) {
                                             if (var5 >= 0 && var6 >= 0 && var5 < this.a.d && var6 < this.a.e && this.a.a[0][var5][var6] == 30) {
                                                var27 = true;
                                             }
                                          }
                                       }

                                       if (var27) {
                                          this.a.a.c = 4;
                                          this.a.a.c(97);
                                          return;
                                       }
                                    }

                                    if (this.a.a.c == 4) {
                                       this.a.a.c = 5;
                                       this.b();
                                    }

                                    if (this.a.a.c != 1) {
                                       return;
                                    }
                                 } else {
                                    if (this.a.a.c == 0) {
                                       this.a = true;
                                       return;
                                    }

                                    if (this.a.a.c == 4) {
                                       this.a.a.c = 5;
                                       this.b();
                                    }

                                    if (var25.d() > h[this.d] / 2) {
                                       var25.b();
                                       if (this.a.b < f[this.d] / 2) {
                                          this.a.b = this.a.b + f[this.d] / 60;
                                       }

                                       var25.a(this.a.b);
                                       var15.a(var25);
                                       this.a = var25.a >= 0;
                                       var23 = this.a;
                                       this.a.a = true;
                                    }

                                    if (this.a.a.c == 3 && y.b(this.a.a.d, this.a.a())) {
                                       this.a.a.c = 4;
                                       this.a.a.c(107);
                                    }
                                 }
                              } else {
                                 if (var25.a < -5120) {
                                    this.a = false;
                                 }

                                 if (var25.a > 5120) {
                                    this.a = true;
                                 }

                                 if (var25.d() > h[this.d] && this.d && (this.b || (this.a.a.b & 1) != 0)) {
                                    int var36 = 0;
                                    if ((this.a.a.b & 1) != 0 && this.b) {
                                       var36 = f[this.d] >> 1;
                                    } else if (this.b) {
                                       var36 = f[this.d] >> 4;
                                    } else {
                                       var36 = f[this.d];
                                    }

                                    this.a.a(new as(this.a ? var36 : -var36, 0));
                                 }
                              }
                           }

                           label630: {
                              if (this.a == 4) {
                                 if (this.a == null && this.d != 2) {
                                    this.a((byte)0);
                                    break label630;
                                 }

                                 if (this.a == null || this.a.a.a().b(var15).d() <= g[this.d]) {
                                    if ((this.d == 2 || this.d == 5) && this.a.b != 189) {
                                       if (this.b == c[this.d] && this.c == 1) {
                                          int var34 = this.a.a.length;

                                          for (int var39 = 0; var39 < var34; var39++) {
                                             ai var40;
                                             if ((var40 = this.a.a[var39]).a == 2 && var40.d == 0) {
                                                if (this.d == 2) {
                                                   if (y.a(this.a.a.d, this.a())) {
                                                      this.a.a.a(11, false);
                                                   }

                                                   if (this.a.b == 2 && y.a(this.a.d, this.a())) {
                                                      this.a.a.addElement(new byte[]{13});
                                                   }

                                                   var40.a((byte)0, var15.a(new as(0, -23552)), true);
                                                   var40.a = 60;
                                                   var40.a.a.b.a = var40.a.a.a.a + ((this.a ? -1 : 1) * y.b(1, 2) << 10);
                                                   var40.a.a.b.b = var40.a.a.a.b + (y.b(2, 5) << 10);
                                                   break label630;
                                                }

                                                if (this.a.b != 128 || var39 > 1) {
                                                   this.a(var39);
                                                   break label630;
                                                }
                                             }
                                          }
                                       }
                                       break label630;
                                    }

                                    if (this.b == c[this.d] && this.c == 1 && this.a.a.a().b(var15).d() <= h[this.d]) {
                                       if (this.a == -1) {
                                          if (y.a(this.a.a.d, this.a())) {
                                             this.a.a.a(10, false);
                                          }

                                          if (this.a.b == 2 && y.a(this.a.d, this.a())) {
                                             this.a.a.addElement(new byte[]{12});
                                          }
                                       }

                                       if (this.d == 4 && this.a.b == 112) {
                                          this.a.b(b[this.d] >> 1);
                                       } else {
                                          this.a.b(b[this.d]);
                                       }

                                       if (this.d == 4) {
                                          this.a.b = 0;
                                       }
                                    }
                                    break label630;
                                 }

                                 if (!this.d) {
                                    this.a((byte)0);
                                    break label630;
                                 }
                              } else {
                                 if (this.d == 5) {
                                    if (this.a.b == 123 && this.a.a.c == 2 && y.b(this.a.a.d, this.a())) {
                                       this.b();
                                       return;
                                    }

                                    if (this.a.b == 128 && this.a.a.c == 0) {
                                       for (int var32 = 0; var32 < this.a.a.length - 1; var32++) {
                                          this.a(var32);
                                       }

                                       this.a.a.c = 1;
                                    }

                                    if (this.a == 0 && this.a.a.c == 1 && this.a.b == 0 && this.c == 0) {
                                       this.a((byte)4);
                                    }

                                    if (this.a == 0 && this.a != null && this.a.b == 128) {
                                       int var33;
                                       if ((var33 = this.a.a.a.a - this.a.a.a().a) < 0) {
                                          var33 = -var33;
                                       }

                                       boolean var38 = var33 < 32768;
                                       if (this.a.a[0].a() && this.a.a[1].a() && this.a.a.a()[3] < this.a.a.a.b - this.a.a) {
                                          var38 = false;
                                       }

                                       if (var38 && this.a.b < 3) {
                                          if (++this.a.b == 3) {
                                             this.a.a.b(this.a.c);
                                          }
                                       } else if (!var38 && this.a.b > 0 && this.a.b-- == 3) {
                                          this.a.a.a(this.a);
                                       }
                                    }

                                    if (this.a == 0
                                       && this.a.b == 128
                                       && this.a.b == 0
                                       && this.a.a[0].a()
                                       && this.a.a[1].a()
                                       && this.a != null
                                       && this.a.a.a().b < this.a.a.a.b + this.a.a) {
                                       this.a((byte)6);
                                       this.a.a.c(150);
                                       this.a.b = 2;
                                    }
                                    break label630;
                                 }

                                 if (this.d == 6) {
                                    int var31 = 32 * (this.c < 0 ? -this.c : this.c);
                                    if (this.a.b < var31) {
                                       this.a.b += 3;
                                       if (this.a.b > var31) {
                                          this.a.b = var31;
                                       }
                                    }

                                    if (this.a != null && y.a(this.a.a.a(), this.a())) {
                                       this.a.b(b[this.d]);
                                    }
                                    break label630;
                                 }

                                 if (this.d == 2 || this.a != null && this.c == 0 && this.a.a.a().b(var15).d() <= g[this.d]) {
                                    this.a((byte)4);
                                    break label630;
                                 }

                                 if (this.a == 3) {
                                    int var30;
                                    if ((var30 = this.a.a.a.a - this.a.a.b.a) > -i[this.d] && var30 < i[this.d]) {
                                       this.a((byte)0);
                                    }
                                    break label630;
                                 }

                                 int var29;
                                 if (!this.d || this.a != 0 || (var29 = this.a.a.a.a - this.a.a.b.a) > -i[this.d] && var29 < i[this.d]) {
                                    break label630;
                                 }
                              }

                              this.a((byte)3);
                           }

                           if (this.d != 6 && this.c > 0) {
                              this.c--;
                           }

                           if (this.a != -1) {
                              this.a--;
                              if (this.a == 0) {
                                 this.b();
                              }
                           }
                        }
                     }
                  } else {
                     for (int var8 = 0; var8 < this.a.a.length; var8++) {
                        this.a.e[var8] = this.a.e[var8] + 30;
                     }

                     aa var2 = this.a;
                     as var9 = this.a.a.a;
                     this.a.a.a(var9.a >> 10, var9.b >> 10, 30, 30);
                     this.b();
                  }
               }
            }
         }
      }
   }

   public final void b() {
      if (!this.a()) {
         if ((this.d != 5 || this.a.b == 128) && this.a == -1 && y.a(this.a.a.d, this.a())) {
            this.a.a.a(this.d == 1 ? 8 : 4, false);
         }

         this.a((byte)1);
         this.a = null;
         if (this.d != 4 && (this.d != 5 || this.a.b != 3)) {
            this.a.a.b(this.a.c);
         }

         if (this.d == 5 && this.a.b == 128) {
            int var1 = this.a.a.a.a >> 15;
            int var2 = this.a.a.a.b >> 15;
            this.a.a[1][var1][var2 + 2] = 69;
            this.a.a.a(var1, var2 + 2);
         }

         this.a.a = null;
         if (this.b != null) {
            this.b.a = null;
         }
      }
   }
}
