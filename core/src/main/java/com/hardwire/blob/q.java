package com.hardwire.blob;

import com.hardwire.blob.Main;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class q {
   public byte a;
   public aa[] a;
   private int[][] a;
   public int a;
   private int k;
   public int b;
   private static int[] a = new int[]{-16777216, -15592170};
   private static final int[][][] a = new int[][][]{{{50, 49, 20}, {200, 200, 200}}, {{58, 49, 20}, {200, 200, 200}}, {{64, 8, 0}, {200, 200, 200}}};
   public byte b;
   public byte c;
   public byte d;
   private int l;
   public int c;
   public int d;
   public int e;
   private am b;
   private int m;
   public boolean a;
   public boolean b;
   public boolean c;
   public int f;
   public int g;
   private ar a;
   private ac a;
   public am a;
   private af a;
   private static Image[][] a;
   private int n = Integer.MAX_VALUE;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private int x;
   private boolean i;
   public boolean d;
   public boolean e;
   public boolean f;
   public boolean g;
   public boolean h;
   private int y;
   public int h;
   public int i;
   private boolean j;
   public int j;
   public byte e;

   public q(ar var1, byte var2, byte var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.e = var3;
      this.a = this.a.a;
      this.a(var4, var5);
      if (this.a == 1) {
         for (int var6 = 516; var6 <= 530; var6++) {
            this.a.a.a(var6);
         }
      }
   }

   public static void a(ad var0) {
      (a = new Image[2][])[0] = var0.a(110, true);
      if (var0.a(516) == null) {
         a[1] = null;
      } else {
         a[1] = var0.a(516, true);
      }
   }

   public final void a(int var1, int var2) {
      as var4 = new as(var1 << 10, var2 << 10);
      if (this.a != null) {
         if (this.d == 1) {
            var4 = this.a.a();
            var2 = this.a.a.length;
            if (this.a.a != null && this.a.a.b) {
               for (int var3 = 0; var3 < var2; var3++) {
                  this.a.a.a(this.a.a[var3]);
               }
            }
         } else {
            var4 = this.a.a();
            if (this.a.a != null && this.a.a.b) {
               this.a.a.b(this.a);
            }
         }

         am var6 = this.a;
         this.a.a = null;
         var6.a = null;
         var6.a = null;
         var6.b = null;
         var6.b = null;
         var6.c = null;
         var6.c = null;
         var6.a = null;
         var6.b = null;
         var6.c = null;
      }

      this.d = 0;
      this.y = 0;
      this.j = 0;
      this.b = false;
      this.a = false;
      this.c = 0;
      this.d = 102400;
      this.e = Integer.MIN_VALUE;
      this.o = -1;
      this.p = 20;
      this.q = -1;
      this.s = -1;
      this.t = -1;
      this.a = null;
      this.a = null;
      this.a = new aa[16];
      this.a = new int[16][2];
      this.a = 0;
      this.k = 0;
      this.u = -1;
      this.a = null;
      this.a = new am(0, true, true, false, false);
      this.a.j = 1;
      this.a.a = this;
      this.a.h = 2;
      this.l = 24;
      byte var7 = 18;
      if (this.e == 1) {
         this.l = 20;
         var7 = 14;
      } else if (this.e == 2) {
         this.l = 26;
      } else if (this.e == 3) {
         this.l = 30;
      }

      as[] var9 = y.a(this.l, var7);

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8].a(var4);
      }

      this.a.a(var9, 1024);
      this.a.a(1024, 1024, -1, -1);
      this.a.a();
      this.a.b();
      if (this.a.a != null && this.a.a.b) {
         this.a.a.a(this.a);
      }

      this.a = null;
      this.a = new af((byte)4, var9.length);
      this.b = this.c = 0;
   }

   public final void a(ai var1) {
      if (!var1.a() && var1.d != 2) {
         if (var1.d == 5 && (this.a.b != 123 || this.a.c <= 1) && var1.a != 6) {
            this.b(ai.b[var1.d]);
            return;
         }

         long var2;
         if ((var2 = this.a.c().a()) > 52428800L || this.e > 0 && var2 > 0L) {
            if (var1.a == -1) {
               this.a.e[this.b] = this.a.e[this.b] + 30;
               aa var4 = var1.a;
               as var5 = var1.a.a.a;
               this.a.a(var5.a >> 10, var5.b >> 10, 30, 30);
            }

            var1.b();
         }
      }
   }

   public final void a(am var1) {
      if (this.d == 0 && this.c == 2) {
         if (var1.j == 1 && ((q)var1.a).a == 1 && ((q)var1.a).e == 1) {
            return;
         }

         this.b = var1;
         this.m = 3;
      }
   }

   public final void a(int var1) {
      int var2;
      int var3 = (var2 = this.a.a().a >> 10) >> 5;
      if (!this.a.a(var3, var1)) {
         int var4 = this.a.a()[0] >> 15;
         var2 = var3 - 1;

         while (var2 >= var4 && !this.a.a(var2, var1)) {
            var2--;
         }

         if (!this.a.a(var2, var1)) {
            var4 = this.a.a()[2] >> 15;
            var2 = var3 + 1;

            while (var2 >= var4 && !this.a.a(var2, var1)) {
               var2++;
            }
         }

         var2 = (var2 << 5) + 16;
      }

      this.a.a(var2, var1 << 5, 2);
   }

   public final void a() {
      this.c = this.a.c == 6 && (this.a.b == 107 || this.a.b == 112 || this.a.b == 123 || this.a.b == 128) || this.a.c == 2 && this.a.b == 133;
      if (this.d == 0) {
         if (this.a.b == 123 && this.a.c == 1 && this.a.e[this.b] >= 300) {
            this.a.c(137);
            this.a.c++;

            for (int var1 = 0; var1 < this.a.a.length; var1++) {
               if (this.a.a[var1].d == 6) {
                  this.a.a[var1].b();
               }
            }
         }

         if (this.a.b == 128
            && this.a.a[0].a()
            && this.a.a[1].a()
            && !this.a.a[this.a.a.length - 1].a()
            && this.a.a().a >> 15 == this.a.a[this.a.a.length - 1].a.a.a.a >> 15
            && this.a.a().b >> 15 >= this.a.a[this.a.a.length - 1].a.a.a.b >> 15) {
            this.a.b(new as(0, -5000));
            this.b = 1;
         }

         int[] var11 = this.a.a();
         if (this.a != 1 || this.e == 0) {
            int var2 = var11[0] >> 15;
            int var3 = var11[1] >> 15;
            int var4 = var11[2] >> 15;
            int var5 = var11[3] >> 15;
            var2 = var2 < 0 ? 0 : var2;
            var3 = var3 < 0 ? 0 : var3;
            var4 = var4 >= this.a.d ? this.a.d - 1 : var4;
            var5 = var5 >= this.a.e ? this.a.e - 1 : var5;
            as var6 = new as();

            for (int var17 = var2; var17 <= var4; var17++) {
               for (int var7 = var3; var7 <= var5; var7++) {
                  byte var8;
                  if ((var8 = this.a.a[1][var17][var7]) != 8 && var8 != 9 && var8 != 70) {
                     if (var8 == 13) {
                        this.c = true;
                     } else if (var8 == 43 && this.a.b == 1) {
                        this.a.f[this.b]++;
                        this.a.a[1][var17][var7] = -1;
                        int[] var78 = null;

                        for (int var85 = 0; var85 < this.a.a.a.length; var85++) {
                           if (this.a.a.a[var85][0] == var17 && this.a.a.a[var85][1] == var7) {
                              var78 = this.a.a.a(d.a(d.a, this.a.b), var85);
                           }
                        }

                        if (this.b == this.a.f) {
                           this.a.a(var78);
                        } else if (this.a.b == 2) {
                           this.a.a.addElement(new byte[]{16});
                        }
                     } else if (this.a.f[var17] && this.a.e[var7]) {
                        boolean var77 = false;

                        for (int var82 = 0; var82 < this.a.c; var82++) {
                           if (this.a.a[var82][0] == var17 && this.a.a[var82][1] == var7) {
                              short var89 = this.a.a[var82][2];
                              var77 = true;
                              if (this.a.b == 2) {
                                 if (this.a.e == 2 || this.a.e == 3 && d.a(d.d, this.a.b) != -1) {
                                    this.a.c(var89);
                                    this.a.a.addElement(new byte[]{14, (byte)var89});
                                 }
                              } else if (this.b == this.a.f) {
                                 this.a.c(var89);
                              }

                              for (int var83 = 0; var83 < this.a.c; var83++) {
                                 if (this.a.a[var83][2] == var89
                                    && this.a.a[var83][0] >= var17 - 4
                                    && this.a.a[var83][0] <= var17 + 4
                                    && this.a.a[var83][1] >= var7 - 4
                                    && this.a.a[var83][1] <= var7 + 4) {
                                    this.a.f[this.a.a[var83][0]] = this.a.e[this.a.a[var83][1]] = false;
                                    this.a.c--;
                                    if (var83 != this.a.c) {
                                       this.a.a[var83] = this.a.a[this.a.c];
                                    }

                                    this.a.a[this.a.c] = null;
                                    var83--;
                                 }
                              }
                              break;
                           }
                        }

                        if (var77) {
                           for (int var84 = 0; var84 < this.a.c; var84++) {
                              this.a.f[this.a.a[var84][0]] = this.a.e[this.a.a[var84][1]] = true;
                           }
                        }
                     }
                  } else {
                     var6.a = (var17 << 15) + 16384;
                     var6.b = (var7 << 15) + 16384;
                     if (this.a.a(var6)) {
                        switch (var8) {
                           case 8:
                              if (this.b == this.a.f) {
                                 this.a.a.a(1, false);
                                 this.a.a(var6.a >> 10, var6.b >> 10, 5);
                              }

                              this.d += 10240;
                              if (this.d > 102400) {
                                 this.d = 102400;
                              }

                              if (this.a.b == 2) {
                                 byte var76 = 2;
                                 if (this.b == this.a.g) {
                                    var76 = 3;
                                 }

                                 this.a.a.addElement(new byte[]{var76, (byte)var17, (byte)var7});
                              }
                              break;
                           case 9:
                              if (this.b == this.a.f) {
                                 this.a.a.a(2, false);
                                 this.a.a(var6.a >> 10, var6.b >> 10, 4);
                              }

                              this.a.e[this.b] = this.a.e[this.b] + 10;
                              this.a.a(var6.a >> 10, var6.b >> 10, 10, 10);
                              if (this.a.b == 2) {
                                 byte var75 = 0;
                                 if (this.b == this.a.g) {
                                    var75 = 1;
                                 }

                                 this.a.a.addElement(new byte[]{var75, (byte)var17, (byte)var7});
                              }
                              break;
                           case 70:
                              var8 = d.a(d.a, this.a.b);
                              this.a.a.a(var8, -1);
                              this.a.a[1][var17][var7] = -1;
                              byte[][] var9;
                              byte[][] var10 = new byte[(var9 = this.a.a.a(137)).length][];
                              System.arraycopy(var9, 0, var10, 0, var9.length - 1);
                              var10[var10.length - 1] = d.a(new byte[][]{var9[var9.length - 1], {d.a(3, ' ')}, d.a(3, Main.e[var8])});
                              this.a.e = 0;
                              this.a.f = -11;
                              this.a.a.a(var10, 3, 3, -11579569, ad.b / 2 - 20);
                              this.a.d = 6;
                        }

                        this.a.a[1][var17][var7] = -1;
                     }
                  }
               }
            }
         }

         if (this.e != Integer.MIN_VALUE) {
            this.e--;
         }

         if (this.b != null) {
            this.m--;
            if (this.m == 0) {
               this.b = null;
            }
         }

         int var18;
         if ((var18 = this.a.a(var11)) != -1) {
            if (y.a(this.a.d, var11)) {
               if (!this.a && this.a.c().d() > 10240) {
                  this.a.a.a(7, false);
                  if (this.a.g > 0) {
                     this.a(var18);
                  }
               }

               if (this.a.g > 1 && this.a.a()[1] >> 15 < var18) {
                  this.a.b(this.a.a().a >> 10, var18 << 5, 16, 1);
               }
            }

            this.a = true;
            this.a.a(var18 << 15, 200, 5, false);
            if (this.a.a == 2) {
               this.b(2048);
            }
         } else {
            this.a = false;
         }

         if (this.a == 1 && this.e > 0) {
            q var12 = this;
            this.b();
            label950:
            switch (var12.e) {
               case 1:
                  as var24 = var12.a.a();
                  if (var12.a.a[1][var24.a >> 15][var24.b >> 15] == 13) {
                     var12.a.c(80);
                  }

                  switch (var12.a.c) {
                     case 1:
                        var12.b = 0;
                        var12.g = true;
                        if (var12.a.a().a >> 15 >= 10) {
                           var12.a.c++;
                        }
                        break label950;
                     case 2:
                        var12.b = 2;
                        var12.g = true;
                        if (var12.a.a().a >> 15 >= 13) {
                           var12.a.c++;
                        }
                        break label950;
                     case 3:
                        var12.b = 0;
                        var12.g = true;
                        if (var12.a.a().a >> 15 > 28) {
                           var12.a.c++;
                        }
                        break label950;
                     case 4:
                        var12.b = 2;
                        var12.g = true;
                        var12.d = true;
                        if (var12.a.a().b >> 15 <= 5) {
                           var12.a.c++;
                        } else if (var12.a.a().a >> 15 < 29 && var12.a.a().b >> 15 >= 10) {
                           var12.a.c = 2;
                        }
                        break label950;
                     case 5:
                        var12.b = 2;
                        var12.f = true;
                        var12.d = true;
                        if (var12.a.a().a >> 15 < 27) {
                           var12.a.c++;
                        } else if (var12.a.a().a >> 15 < 29 && var12.a.a().b >> 15 >= 10) {
                           var12.a.c = 2;
                        }
                        break label950;
                     case 6:
                        var12.b = 0;
                        var12.e = true;
                        var12.f = true;
                        if (var12.a.a().a >> 15 <= 22) {
                           var12.a.c++;
                        }
                        break label950;
                     case 7:
                        var12.b = 2;
                        var12.d = true;
                        var12.f = true;
                        if (var12.a.a().b >> 15 <= 1) {
                           var12.a.c++;
                        }
                        break label950;
                     case 8:
                        var12.b = 0;
                        var12.g = true;
                        if (var12.a.a().b >> 15 >= 18) {
                           var12.a.c++;
                        } else if (var12.a.a().a >> 15 <= 30 && var12.a.a().b >> 15 >= 5) {
                           var12.a.c = 7;
                        }
                        break label950;
                     case 9:
                        var12.b = 2;
                        var12.g = true;
                     default:
                        break label950;
                  }
               case 2:
                  if (var12.a.c == 0) {
                     var12.a.c = 1;
                  }

                  if (var12.a.c != 1) {
                     break;
                  }

                  q var22 = var12.a.a[0];
                  var12.b = 2;
                  as var38 = var22.a.a();
                  as var44 = var12.a.a();
                  as var53 = var38.b(var44);
                  if (var38.b < var44.b && var44.b >> 15 > 1 && var38.b >> 15 < 15) {
                     var18 = var38.a >> 15;
                     int var61 = var44.a >> 15;
                     if (var18 < 7) {
                        if (var61 > 1) {
                           var12.f = true;
                        }

                        var12.d = true;
                     } else if (var18 > 7) {
                        if (var61 < 13) {
                           var12.g = true;
                        }

                        var12.d = true;
                     }
                  } else {
                     if (var53.a > 0) {
                        var12.g = true;
                     } else if (var53.a < 0) {
                        var12.f = true;
                     }

                     if (var53.b > 0) {
                        var12.e = true;
                     } else if (var53.b < 0) {
                        var12.d = true;
                     }
                  }
                  break;
               case 3:
                  if (var12.a.c == 0) {
                     k var20;
                     (var20 = var12.a.a[0]).a = false;
                     k var21;
                     (var21 = var12.a.a[1]).a = false;
                  } else {
                     var12.a.c = 1;
                     if (!var12.a.a[0].a) {
                        var12.a.a[0].a((byte)0, 0);
                        var12.a.a[1].a((byte)0, 0);
                     }

                     q var19 = var12.a.a[0];
                     var12.b = 2;
                     as var37 = var19.a.a();
                     as var43 = var12.a.a();
                     as var52;
                     if ((var52 = var37.b(var43)).a > 0) {
                        var12.g = true;
                     } else if (var52.a < 0) {
                        var12.f = true;
                     }

                     if (var12.b == null && var43.b >> 15 > 5) {
                        var12.d = true;
                     } else if (var52.b > 0) {
                        var12.e = true;
                     } else if (var52.b < 0) {
                        var12.d = true;
                     }
                  }
            }
         }

         q var13 = this;
         if (this.a.b == 93) {
            if (var13.a.c == 0) {
               var13.g = true;
               var13.b = 2;
               if (var13.a.a().a >> 15 >= 7) {
                  var13.a.c++;
                  var13.a.c(9);
               }
            } else if (var13.a.c == 1) {
               var13.g = true;
            } else if (var13.a.c == 2) {
               var13.b = 0;
               var13.g = false;
            } else if (var13.a.c >= 3) {
               var13.a.c();
               var13.g = true;
            }
         } else if (var13.a.b == 90 && var13.a == 0) {
            if (var13.a.c == 0 && var13.a.a().a > 206438) {
               var13.a.c = 1;

               for (int var25 = 0; var25 < var13.a.a.length; var25++) {
                  var13.a.a[var25].b.c(var13.a.a[var25].a);
               }

               var13.a.c(74);
            }
         } else if (var13.a.b == 134 && var13.a.c == 1) {
            var13.b();
            var13.g = true;
            var13.b = 0;
         }

         if (var13.h && var13.b != null) {
            if (var13.b == var13.a.f) {
               var13.a.a.a(0, false);
            } else {
               var13.a.a.addElement(new byte[]{9});
            }

            as var26 = var13.b.a().b(var13.a.a());
            boolean var39;
            boolean var45 = (var39 = var13.b.j == 1) && ((q)var13.b.a).e == 2;
            boolean var54 = var39 && ((q)var13.b.a).e == 3;
            if (var39) {
               ((q)var13.b.a).a.c();
            }

            var26.a(var45 ? 200 : (var39 ? 100 : 400));
            var13.b.a(var26);
            var26.a(!var45 && !var54 ? (var39 ? -1024 : -256) : -512);
            var13.a.a(var26);
            var13.a.c();
            var13.b = null;
            var13.e = 0;
         }

         if (var13.h && var13.e < -20) {
            var13.e = 56;
         }

         if (var13.b != var13.c) {
            if (var13.b != 2 && var13.c == 2) {
               var13.a.c();
            }

            var13.c = var13.b;
         }

         int var27 = 0;
         as var40 = var13.a.b();
         if (var13.y == 0
            && (var13.d && !var13.i || var13.j && var13.i < -100)
            && (var13.a.b & 1) != 0
            && var40.a < var40.b
            && var40.a > -var40.b
            && var40.b > 0) {
            var13.j = false;
            if ((var13.a.b & 2) == 0) {
               var27 = 1;
            } else {
               var13.y = 1;
            }
         } else if (!var13.d && var13.i >= -100) {
            var13.y = 0;
         }

         if (var13.y > 0) {
            int[] var46 = var13.a.a();
            if (++var13.y > 10 || var13.y == 2 && var46[3] - var46[1] < (var13.l << 10) * 14 / 10) {
               var27 = 1;
               var13.y = 0;
            }
         }

         var13.i = var13.d;
         if (!var13.j && var13.i >= -100) {
            var13.j = true;
         } else if (var13.j && var13.i < -100) {
            var13.j = false;
         }

         if (var13.c == 1) {
            var13.a.c = 0;
         } else {
            var13.a.c = 1024;
         }

         int var62 = var13.c == 2;
         am var55 = var13.a;
         if (var62) {
            var55.d |= 1;
         } else {
            var55.d &= -2;
         }

         if (var27 && !var40.a()) {
            as var47 = null;
            var47 = new as(0, -1024);
            int var56 = Integer.MAX_VALUE;
            var27 = Integer.MIN_VALUE;
            var62 = 0;
            int var68;
            int[] var79 = new int[var68 = var13.a.a.length];

            for (int var86 = 0; var86 < var68; var86++) {
               var79[var86] = var13.a.a[var86].a.a * var47.a + var13.a.a[var86].a.b * var47.b >> 10;
               if (var79[var86] < var56) {
                  var56 = var79[var86];
               }

               if (var79[var86] > var27) {
                  var27 = var79[var86];
               }

               if ((var13.a.a[var86].b & 1) != 0) {
                  var62++;
               }
            }

            if ((var27 = var27 - var56) != 0 && var62 > 0) {
               if (var13.b == var13.a.f) {
                  var13.a.a.a(0, false);
               } else if (var13.a.b == 2) {
                  var13.a.a.addElement(new byte[]{11});
               }

               var47.a(25000);
               var47.a((int)(((long)var62 << 20) / ((long)var27 * var68)));

               for (int var87 = 0; var87 < var68; var87++) {
                  if ((var13.a.a[var87].b & 1) == 0) {
                     var79[var87] -= var56;
                     var13.a.a[var87].c.a = (int)(var13.a.a[var87].c.a + ((long)var47.a * var79[var87] >> 10));
                     var13.a.a[var87].c.b = (int)(var13.a.a[var87].c.b + ((long)var47.b * var79[var87] >> 10));
                  }
               }
            }

            if (var13.c == 2) {
               var13.a.c();
            }
         }

         boolean var90;
         label835: {
            label1138: {
               if (var13.c == 2) {
                  if (var13.b) {
                     break label1138;
                  }

                  var55 = var13.a;
                  var62 = 0;

                  while (true) {
                     if (var62 < var55.g) {
                        if (var55.b[var62].a == null) {
                           var62++;
                           continue;
                        }

                        var90 = true;
                     } else {
                        var90 = false;
                     }

                     if (var90) {
                        break label1138;
                     }
                     break;
                  }
               }

               var90 = false;
               break label835;
            }

            var90 = true;
         }

         int var49 = var90;
         as var58 = new as();
         if (var13.f || var13.g) {
            var58.a((var13.f ? -1 : (var13.g ? 1 : 0)) * (var49 ? 150 : (var13.a && (var13.a.b & 2) == 0 ? 100 : 50)), 0);
         }

         if (var13.d) {
            if (var49) {
               if (var40.b < 0) {
                  var58.a(0, -350);
               } else if (!var40.a()) {
                  var58.a(0, (int)(-350L * (var40.a < 0 ? -var40.a : var40.a) / var40.c()));
               }
            } else if (!var13.a) {
               var58.a(0, -100);
            }
         }

         label804: {
            as var91;
            byte var10001;
            short var10002;
            if (var13.y > 0) {
               var91 = var58;
               var10001 = 0;
               var10002 = 1000;
            } else {
               if (!var13.e) {
                  break label804;
               }

               var91 = var58;
               var10001 = 0;
               var10002 = (short)((var13.a.b & 2) != 0 ? 500 : (var13.a ? 400 : 100));
            }

            var91.a(var10001, var10002);
         }

         if (var58.a()) {
            if (var13.h != 0) {
               var58.a(var13.h * (var49 ? 150 : (var13.a && (var13.a.b & 2) == 0 ? 100 : 50)) / 127, 0);
            }

            if (var13.i < 0) {
               if (var49) {
                  if (var40.b < 0) {
                     var58.a(0, -var13.i * -350 / 127);
                  } else if (!var40.a()) {
                     var58.a(0, -var13.i * (int)(-350L * (var40.a < 0 ? -var40.a : var40.a) / var40.c()) / 127);
                  }
               } else if (!var13.a) {
                  var58.a(0, -var13.i * -100 / 127);
               }
            }

            if (var13.i > 0) {
               var58.a(0, var13.i * ((var13.a.b & 2) != 0 ? 500 : (var13.a ? 400 : 100)) / 127);
            }
         }

         if ((var13.j & 130) != 0) {
            var58.a(150, 0);
         }

         if ((var13.j & 68) != 0) {
            var58.a(-150, 0);
         }

         if ((var13.j & 192) != 0) {
            var58.a(0, -350);
         } else if ((var13.j & 8) != 0) {
            var58.a(0, -700);
         }

         if (var13.e == 1) {
            var58.a(1945);
         } else if (var13.e == 2 || var13.e == 3) {
            var58.a(1331);
         }

         if (!var58.a()) {
            as var65 = var58;
            var55 = var13.a;

            for (int var30 = 0; var30 < var55.a.length; var30++) {
               s var69;
               if (((var69 = var55.a[var30]).b & 5) == 0) {
                  as var80 = var65;
                  var69 = var69;
                  if (var69.a != Integer.MAX_VALUE) {
                     var69.c.a = var69.c.a + var80.a;
                     var69.c.b = var69.c.b + var80.b;
                  }
               }
            }
         }

         if ((var13.a.b & 1) != 0) {
            as var31 = new as(!var13.f && (var13.j & 32) == 0 ? (!var13.g && (var13.j & 16) == 0 ? 0 : 1) : -1, var13.d ? -1 : (var13.e ? 1 : 0));
            int var66 = 0;
            if (var31.a()) {
               var31.b(var13.h, var13.i);
               var66 = 1;
            }

            if (!var31.a() && !var40.a() && (var31.a != 0 || var31.b != -1 || var40.b <= 0 || var40.a >= var40.b && var40.a <= -var40.b)) {
               int var71;
               var71 = (var71 = var40.a(var31)) > 0 ? -1 : (var71 < 0 ? 1 : 0);
               as var81 = var13.a.a();
               if (var66) {
                  var71 = var31.c() * var71 * (!var49 && var13.a.a() ? 200 : 300) / 127 << 10;
               } else {
                  var71 = var71 * (!var49 && var13.a.a() ? 200 : 300) << 10;
               }

               int var88 = var13.a.a.length;

               for (int var32 = 0; var32 < var88; var32++) {
                  s var41;
                  var49 = -(var41 = var13.a.a[var32]).a.b + var81.b;
                  int var60 = var41.a.a - var81.a;
                  if (var49 != 0 && var60 != 0) {
                     var66 = var71 / y.a(var49, var60);
                     var41.c.a += var49 * var66 >> 10;
                     var41.c.b += var60 * var66 >> 10;
                  }
               }
            }
         }

         var13.j = 0;
         if (this.a.b != 128) {
            q var14 = this;
            if ((var27 = this.a.a()) < 0) {
               var27 = -var27;
            }

            if (var27 < var14.a.e >> 1) {
               var14.b(102400);
            }
         }
      } else if (this.d == 1) {
         am var34 = this.a;
         this.a.a = true;
         this.a.d();
         this.a.e();
         if (this.a.b == 1 && this.r++ >= 100) {
            if (this.a == 0) {
               this.a.d = 2;
            } else if (this.e == 3 && this.a.a[this.a.f].d == 0 && !this.a.a[this.a.f].c) {
               this.a.c(168);
            }
         }

         if ((this.a.e == 4 || this.a.e == 5) && this.r++ >= 50) {
            this.a.d = 5;
            if (this.a.b == 2) {
               this.a.a = 3;
            }

            this.a.a = this.b == 0 ? 1 : 0;
            this.a.e[this.a.a]++;
         }
      } else if (this.d == 2) {
         this.c++;
         if (this.c == 10) {
            this.c = 0;
            this.d = 0;
         }
      }

      if (this.a.g > 1 || this.a.b == 84) {
         for (int var15 = 0; var15 != this.a; var15++) {
            int[] var35 = this.a[var15];
            if (this.a.b == 1 && !y.a(this.a.d, this.a[var15].a()) || this.a.b == 2 && !this.a.a(this.a[var15].a())) {
               var35[0] = 30;
               var35[1] = 3;
            }

            if (var35[0] == 30) {
               if (++var35[1] == 4) {
                  this.a.a.b(this.a[var15].c);
                  this.a--;
                  if (var15 != this.a) {
                     this.a[var15] = this.a[this.a];
                     var35[0] = this.a[this.a][0];
                     var35[1] = this.a[this.a][1];
                  }

                  this.a[this.a] = null;
                  var15--;
               }
            } else if (var35[0] < 29 || (this.a[var15].a.b & 1) != 0) {
               var35[0]++;
            }
         }

         if (this.k > 0) {
            this.k--;
         }
      }

      this.b = false;
   }

   public final boolean a() {
      return this.d == 1;
   }

   public final void b(int var1) {
      if (this.b == this.a.f) {
         this.a.a.a(Main.b / Main.c);
      }

      this.c = 2;
      this.d -= var1;
      if (this.d <= 0) {
         this.d = 0;
         q var2 = this;
         if (this.d == 0 && (var2.a != 1 || var2.e == 0 || var2.e == 3)) {
            if (y.a(var2.a.d, var2.a.a())) {
               var2.a.a.a(4, false);
            }

            var2.d = 1;
            var2.r = 0;
            var2.a.a.b(var2.a);
            int var3 = var2.a.a.length;

            for (int var4 = 0; var4 < var3; var4++) {
               aa var5 = new aa(var2.a.a[var4], 4096);
               if (var2.a != 1 || var2.e == 0) {
                  var5.d = 6;
               }

               var5.a = var2;
               var2.a.a.a(var5);
            }

            var2.g = var3;
         }
      }

      if ((this.a.g > 1 || this.a.b == 84) && this.k == 0) {
         this.k = 2;
         if ((var1 = var1 >> 10) == 0) {
            var1 = 1;
         }

         int[] var7 = this.a.a();

         for (int var8 = 0; this.a != 16 && var8 < var1; var8++) {
            s var9;
            (var9 = new s(new as(y.b(var7[0] + 5120, var7[2] - 5120), y.b(var7[1] + 5120, var7[3] - 10240)), 2048)).b.a = var9.a.a + y.b(-3072, 3072);
            var9.b.b = var9.a.b + y.b(2048, 3072);
            this.a[this.a] = new aa(var9, 5120);
            this.a[this.a].b = true;
            this.a.a.a(this.a[this.a]);
            this.a[this.a][0] = 0;
            this.a[this.a][1] = 0;
            this.a++;
         }
      }
   }

   public final void b() {
      this.d = this.e = this.f = this.g = this.h = false;
      this.h = this.i = 0;
      this.j = true;
   }

   public final void a(Graphics var1) {
      if (this.a.g > 1 || this.a.b == 84) {
         var1.setColor(74, 0, 0);

         for (int var2 = 0; var2 != this.a; var2++) {
            int var3 = this.a[var2].a.a.a >> 10;
            int var4 = this.a[var2].a.a.b >> 10;
            if (this.a[var2][0] == 30) {
               int var5 = 5 * (5 - this.a[var2][1]) / 6 << 10 >> 10;
               var1.fillArc(var3 - var5, var4 - var5, var5 << 1, var5 << 1, 0, 360);
            } else {
               var1.drawImage(this.a.a.a(this.a[var2][0] > 15 ? 129 : 118), var3, var4, 3);
            }
         }
      }

      if (this.d == 0) {
         if (this.a && this.a.g > 1 && (this.a.d & 1) == 0 && y.b(0, 1) == 0) {
            as var20 = this.a.a();
            this.a.b(var20.a >> 10, var20.b >> 10, 0, 2);
         }

         if (this.o == -1) {
            int var21 = 1647099 - this.n;
            if (this.p == 0 && (this.a.b & 1) != 0 && var21 < 183011 && var21 > -183011) {
               int var29 = 0;
               if (this.a.b == 1) {
                  var29 = this.a.c().d();
                  this.f = var29;
               }

               if (var29 < 1024) {
                  if (y.b(0, 2) == 0) {
                     this.o = 0;
                  } else {
                     this.p = 5;
                  }
               }
            }
         } else {
            this.o++;
            if (this.o == 5) {
               this.o = -1;
               this.p = 20;
               this.n = 1647099;
            }
         }

         if (this.p > 0) {
            this.p--;
         }

         if (this.e > 0) {
            this.n = 1647099;
            this.q = -1;
            if (this.s < 1) {
               this.s++;
            }
         } else if (this.s > -1) {
            this.s--;
         } else if (this.q == -1 && (this.a.b & 1) == 0) {
            int var22;
            if ((var22 = 1647099 - this.n) < 253399 && var22 > -253399) {
               this.r++;
               if (this.r == 2) {
                  this.q = 0;
                  this.r = 0;
               }
            }
         } else if (this.q < 2 && this.q > -1) {
            this.q++;
         } else if (this.q == 2 && (this.a.b & 1) != 0) {
            this.q = 3;
         } else {
            label429: {
               if (this.q > 2) {
                  this.q++;
                  if (this.q != 6) {
                     break label429;
                  }

                  this.q = -1;
               }

               this.r = 0;
            }
         }

         if (this.q != -1 || this.s != -1 || this.t != -1) {
            this.n = 1647099;
         } else if (this.o == -1) {
            as var23;
            if ((var23 = this.a.b()).a()) {
               var23.b = 1024;
            }

            int var30 = var23.a();
            if (this.n == Integer.MAX_VALUE) {
               this.n = var30;
            } else {
               int var35;
               if ((var35 = var30 - this.n) < -3294198) {
                  var35 += 6588397;
               } else if (var35 > 3294198) {
                  var35 -= 6588397;
               }

               this.n = y.a(this.n + var35 / 6);
            }
         }

         this.a.a(this.a.a, this.a.a());
         int var24 = 0;
         if (this.a == 1) {
            var24 = -6710887;
         } else {
            var24 = a[this.b];
         }

         if (this.c > 0) {
            if (this.t++ == 2) {
               this.t = 0;
            }

            var24 = new int[]{-65536, -5177344, -10878976}[this.t];
            this.c--;
         } else {
            this.t = -1;
         }

         this.a.a(var1, var24);

         try {
            if (this.a.g > 1 && this.t == -1) {
               Graphics var31 = var1;
               q var26 = this;
               as var36;
               int var43 = (var36 = this.a.a()).a >> 15;
               int var6 = var36.b >> 15;
               byte var7;
               if (var43 >= 0 && var6 >= 0 && var43 < var26.a.d && var6 < var26.a.e && (var7 = var26.a.a[0][var43][var6]) > -1 && !ar.b[var7]) {
                  int var8 = var26.a.a.length;
                  int var9 = -1;
                  int var10 = 0;
                  if (var26.u == var43 && var26.v == var6) {
                     var9 = var26.w;
                     var10 = var26.x;
                  } else {
                     int var11 = Integer.MAX_VALUE;
                     var7 = var43 - 8;
                     int var12 = var6 - 8;
                     int var13 = var43 + 8;
                     int var14 = var6 + 8;
                     var7 = var7 < 0 ? 0 : var7;
                     var12 = var12 < 0 ? 0 : var12;
                     var13 = var13 >= var26.a.d ? var26.a.d - 1 : var13;
                     var14 = var14 >= var26.a.e ? var26.a.e - 1 : var14;

                     for (int var15 = var7; var15 <= var13; var15++) {
                        for (int var16 = var12; var16 <= var14; var16++) {
                           byte var58;
                           if (((var58 = var26.a.a[0][var15][var16]) == 8 || var58 == 9 || var58 == 30 || var58 == 36 || var26.a.a[2][var15][var16] == 37)
                              && var26.a.a(var36.a, var36.b, var15 << 15, var16 << 15)) {
                              var58 = var15 - var43;
                              int var17 = var16 - var6;
                              int var18;
                              if ((var18 = var58 * var58 + var17 * var17) < var11) {
                                 var9 = var15;
                                 var10 = var16;
                                 var11 = var18;
                              }
                           }
                        }
                     }
                  }

                  if (var9 != -1) {
                     var26.u = var43;
                     var26.v = var6;
                     var26.w = var9;
                     var26.x = var10;
                     int var66 = (var9 << 15) + 16384 - var36.a;
                     int var37 = (var10 << 15) + 16384 - var36.b;
                     var7 = y.a(var66, var37);
                     var66 = (int)(((long)var66 << 10) / var7);
                     int var38 = (int)(((long)var37 << 10) / var7);
                     var31.setColor(a[var26.a.a][var26.a][0], a[var26.a.a][var26.a][1], a[var26.a.a][var26.a][2]);
                     int var69 = 0;
                     int var71 = var8 - 1;
                     int var73 = var8 - 2;
                     int var74 = var8 - 3;

                     while (var69 < var8) {
                        as var75 = var26.a.a[var69].a;
                        as var61 = var26.a.a[var71].a;
                        as var76 = var26.a.a[var73].a;
                        as var77 = var26.a.a[var74].a;
                        var43 = var61.b - var76.b;
                        var6 = var76.a - var61.a;
                        if (var43 * var66 + var6 * var38 > 0
                           && var6 * (var75.a - var61.a) - var43 * (var75.b - var61.b) <= 0
                           && var6 * (var76.a - var77.a) - var43 * (var76.b - var77.b) <= 0) {
                           var9 = y.a(var43, var6);
                           var43 = (int)(((long)var43 << 10) / var9);
                           var6 = (int)(((long)var6 << 10) / var9);
                           if ((var9 = var43 * var38 - var6 * var66 >> 10) < 341 && var9 > -341) {
                              var9 = (var61.a + var76.a >> 1) - var43 * 5;
                              var7 = (var61.b + var76.b >> 1) - var6 * 5;
                              if (var43 < 0) {
                                 var43 = -var43;
                              }

                              if (var6 < 0) {
                                 var6 = -var6;
                              }

                              var43 = (8 * (1024 - var43) >> 10) + 2;
                              var6 = (8 * (1024 - var6) >> 10) + 2;
                              var31.fillArc((var9 >> 10) - var43, (var7 >> 10) - var6, var43 << 1, var6 << 1, 0, 360);
                           }
                        }

                        var74 = var73;
                        var73 = var71;
                        var71 = var69++;
                     }
                  }
               }
            }
         } catch (Exception var19) {
         }

         if (this.a == 1) {
            this.a.a(var1, as.a, this.c == 0 ? 6118749 : (this.c == 2 ? 13421772 : 10834699));
         } else {
            this.a.a(var1, as.a, this.c == 1 ? 8610063 : (this.c == 2 ? (this.a.g == 0 ? 8947848 : 6513507) : (this.a.g == 0 ? 3552822 : 0)));
         }

         as var32;
         as var39;
         (var39 = (var32 = this.a.a()).b(new as(this.n, 3072L, false))).a >>= 10;
         var39.b >>= 10;
         Image var47 = null;
         if (this.t != -1) {
            var47 = this.a.a.a(this.a == 1 ? 525 : 125);
            var1.drawImage(var47, var32.a >> 10, (var32.b >> 10) - 1, 3);
            var1.drawImage(this.a.a.a(126 + this.t), var32.a >> 10, (var32.b >> 10) - 20, 3);
         } else if (this.s != -1) {
            var47 = this.a.a.a(this.a == 1 ? 529 + this.s : 123 + this.s);
            var1.drawImage(var47, var32.a >> 10, var32.b >> 10, 3);
         } else if (this.q != -1) {
            int var40 = this.q < 3 ? this.q : 5 - this.q;
            var47 = this.a.a.a(this.a == 1 ? var40 + 526 : var40 + 120);
            var1.drawImage(var47, var32.a >> 10, (var32.b >> 10) + 1, 3);
         } else {
            if (this.o != -1) {
               if (this.o != 2) {
                  var47 = this.a.a.a(this.o != 0 && this.o != 4 ? (this.a == 1 ? 524 : 119) : (this.a == 1 ? 516 : 110));
                  var1.drawImage(var47, var39.a, var39.b, 3);
               }

               return;
            }

            ad.a(var1, a[this.a], var39, this.n - 1647099);
         }
      } else {
         if (this.d == 1) {
            int var28 = this.a.a.length;

            for (int var34 = 0; var34 < var28; var34++) {
               s var41;
               if (((var41 = this.a.a[var34]).b & 16) == 0) {
                  int var52 = var41.a.a >> 10;
                  int var42 = var41.a.b >> 10;
                  if (this.a == 1) {
                     var1.setColor(-6710887);
                     var1.fillArc(var52 - 4, var42 - 4, 8, 8, 0, 360);
                  } else {
                     var1.drawImage(this.a.a.a(109), var52, var42, 3);
                  }
               }
            }

            return;
         }

         if (this.d == 2) {
            if (this.a == 1) {
               var1.setColor(-6710887);
            } else {
               var1.setColor(a[this.b]);
            }

            as var27 = this.a.a();
            int var33 = this.c * 24 / 10 << 10 >> 10;
            var1.fillArc((var27.a >> 10) - var33, (var27.b >> 10) - var33, var33 << 1, var33 << 1, 0, 360);
         }
      }
   }
}
