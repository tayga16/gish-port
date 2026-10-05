package com.hardwire.blob;

import java.util.Vector;

public final class ab {
   private int g = 16;
   private int h = 32;
   private int i = 32;
   public Vector a;
   public Vector b;
   public Vector c;
   public boolean a;
   public au[] a;
   public int a;
   public am[] a;
   public int b;
   public aa[] a;
   public int c;
   public byte[][] a;
   public byte[][] b;
   public as[][] a;
   public boolean[] a;
   public int d;
   public int e;
   public ar a;
   public ak a;
   public ak b;
   public ak c;
   public int[][] a;
   public int[] a;
   public int[] b;
   public int[][] b;
   public int f;
   public boolean b = false;

   public final void a(byte[][] var1, byte[][] var2, as[][] var3, boolean[] var4, int var5, int var6, int var7, int var8) {
      this.h = var6;
      this.g = var7;
      this.i = var8;
      this.a = var1;
      this.b = var2;
      if (this.a != null) {
         this.a = var3;
         this.a = var4;
         this.d = 15;
         this.a = new ak(this.a.length << this.d, this.a[0].length << this.d, this.h);
         this.c = new ak(this.a.length << this.d, this.a[0].length << this.d, this.i);
         this.b = new ak(this.a.length << this.d, this.a[0].length << this.d, this.g);
         this.a = new am[this.h];
         this.b = 0;
         this.a = new au[this.g];
         this.a = 0;
         this.a = new aa[this.i];
         this.c = 0;
         this.a = true;
         int var9 = this.b.size();

         for (int var12 = 0; var12 < var9; var12++) {
            this.a((am)this.b.elementAt(var12));
         }

         int var10 = this.a.size();

         for (int var13 = 0; var13 < var10; var13++) {
            this.a((au)this.a.elementAt(var13));
         }

         int var11 = this.c.size();

         for (int var14 = 0; var14 < var11; var14++) {
            this.a((aa)this.c.elementAt(var14));
         }

         this.b.removeAllElements();
         this.a.removeAllElements();
         this.c.removeAllElements();
         this.b = null;
         this.a = null;
         this.c = null;

         for (int var15 = 0; var15 < this.b; var15++) {
            this.a.a(var15, this.a[var15].a());
         }

         for (int var16 = 0; var16 < this.a; var16++) {
            this.b.a(var16, this.a[var16].a());
         }

         for (int var17 = 0; var17 < this.c; var17++) {
            this.c.a(var17, this.a[var17].a());
         }
      }
   }

   public final void a(am var1) {
      if (!this.a) {
         this.b.addElement(var1);
      } else {
         var1.d &= -17;
         var1.i = this.b;
         this.a[this.b++] = var1;
         if (this.a != null) {
            this.a.a(this.b - 1, var1.a());
         }
      }
   }

   public final void a(au var1) {
      if (!this.a) {
         this.a.addElement(var1);
      } else {
         this.a[this.a++] = var1;
         var1.b = this.a - 1;
         if (this.b != null) {
            this.b.a(var1.b, var1.a());
         }
      }
   }

   public final void b(am var1) {
      for (int var2 = 0; var2 < this.b; var2++) {
         if (this.a[var2] == var1) {
            this.a(var2);
            return;
         }
      }
   }

   public final void a(int var1) {
      this.a.b(var1, this.a[var1].a());
      this.b--;
      if (var1 != this.b) {
         this.a.b(this.b, this.a[this.b].a());
      }

      am var2 = this.a[this.b];
      if (this.b > var1) {
         this.a[var1] = this.a[this.b];
         this.a[var1].i = var1;
         this.a.a(var1, this.a[var1].a());
      }

      this.a[this.b] = null;
      if (this.a != null) {
         int var3 = -1;

         for (int var4 = 1; var4 <= this.a[0]; var4++) {
            if (this.a[var4] == var1) {
               var3 = var4;
            }

            if (this.a[var4] == this.b) {
               this.a[var4] = var2.i;
            }
         }

         if (var3 != -1) {
            if (var3 < this.a[0]) {
               this.a[var3] = this.a[this.a[0]];
            }

            this.a[0]--;
         }
      }
   }

   public final void a(aa var1) {
      if (!this.a) {
         this.c.addElement(var1);
      } else {
         this.a[this.c++] = var1;
         var1.c = this.c - 1;
         if (this.c != null) {
            this.c.a(this.c - 1, var1.a());
         }
      }
   }

   public final void a(s var1) {
      for (int var2 = 0; var2 < this.c; var2++) {
         if (this.a[var2].a.equals(var1)) {
            this.b(var2);
            return;
         }
      }
   }

   public final void b(int var1) {
      this.c.b(var1, this.a[var1].a());
      this.c--;
      aa var2 = this.a[this.c];
      if (var1 < this.c) {
         this.c.b(this.c, this.a[this.c].a());
         this.a[var1] = this.a[this.c];
         this.c.a(var1, this.a[var1].a());
         this.a[var1].c = var1;
      }

      this.a[this.c] = null;
      if (this.b != null) {
         int var3 = -1;

         for (int var4 = 1; var4 <= this.b[0]; var4++) {
            if (this.b[var4] == var1) {
               var3 = var4;
            }

            if (this.b[var4] == this.c) {
               this.b[var4] = var2.c;
            }
         }

         if (var3 != -1) {
            if (var3 < this.b[0]) {
               this.b[var3] = this.b[this.b[0]];
            }

            this.b[0]--;
         }
      }
   }

   public void a() {
      if (this.a == null) {
         this.a = this.a.a(-1, this.b, this.a);
         int var1 = this.a[0];

         for (int var2 = 1; var2 <= var1; var2++) {
            this.a[this.a[var2]].d |= 16;
         }

         for (int var7 = 1; var7 <= var1; var7++) {
            am var3;
            if ((var3 = this.a[this.a[var7]]).a != null) {
               for (int var4 = 0; var4 < var3.a.length; var4++) {
                  if ((var3.a[var4].d & 48) == 0) {
                     var3.a[var4].d |= 16;
                     this.a[++this.a[0]] = var3.a[var4].i;
                     var1++;
                  }
               }
            }
         }
      }

      if (this.b == null) {
         this.b = this.c.a(-1, this.c, this.a);
         int var6 = this.b[0];

         for (int var8 = 1; var8 <= var6; var8++) {
            aa var9;
            if ((var9 = this.a[this.b[var8]]).a != null) {
               boolean var10 = false;

               for (int var5 = 1; var5 <= var6; var5++) {
                  if (var8 != var5 && this.b[var5] == var9.a.c) {
                     var10 = true;
                     break;
                  }
               }

               if (!var10) {
                  this.b[++this.b[0]] = var9.a.c;
                  var6++;
               }
            }
         }
      }
   }

   public static boolean a(s var0, s var1, as[] var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = var4 - var6;
      int var10 = var5 - var3;
      int var11 = Integer.MAX_VALUE;
      int var12 = 1;
      int var13 = 0;
      if (var2[0].a == var2[var2.length - 1].a && var2[0].b == var2[var2.length - 1].b) {
         var12 = 0;
         var13 = var2.length - 2;
      }

      for (; var12 < var2.length - 1; var13 = var12++) {
         int var14 = var12 + 1;
         if (var2[var14] == null) {
            var12 += 2;
         } else {
            as var15 = var2[var13];
            as var16 = var2[var12];
            as var20 = var2[var14];
            if ((var14 = (int)((long)var9 * (var16.a - var3) + (long)var10 * (var16.b - var4) >> 10)) >= 0 && var14 < var11) {
               int var17 = var15.a + var20.a >> 1;
               var13 = var15.b + var20.b >> 1;
               int var28 = (int)((long)(var17 - var5) * (var16.b - var6) - (long)(var13 - var6) * (var16.a - var5) >> 10);
               int var33 = (int)((long)(var17 - var3) * (var16.b - var4) - (long)(var13 - var4) * (var16.a - var3) >> 10);
               if ((var28 ^ var33) < 0) {
                  int var22;
                  int var29 = (var22 = (int)((long)(var3 - var17) * (var6 - var13) - (long)(var4 - var13) * (var5 - var17) >> 10)) + var33 - var28;
                  if ((var22 ^ var29) < 0) {
                     var11 = var14;
                  }
               }
            }
         }
      }

      if (var11 == Integer.MAX_VALUE) {
         return false;
      }

      long var30 = (long)var9 * var9 + (long)var10 * var10 >> 10;
      var13 = (int)((long)var9 * var11 / var30);
      int var27 = (int)((long)var10 * var11 / var30);
      if (var0.a != Integer.MAX_VALUE) {
         var0.a.a += var13;
         var0.a.b += var27;
      }

      if (var1.a != Integer.MAX_VALUE) {
         var1.a.a += var13;
         var1.a.b += var27;
      }

      if (var7 != 0) {
         if (var8) {
            int var35 = y.a(var9, var10);
            var9 = (int)(((long)var9 << 10) / var35);
            var10 = (int)(((long)var10 << 10) / var35);
            var13 = (var0.a.a + var1.a.a >> 1) - (var0.b.a + var1.b.a >> 1);
            int var31 = (var0.a.b + var1.a.b >> 1) - (var0.b.b + var1.b.b >> 1);
            int var34 = -var10 * var13 + var9 * var31 >> 10;
            if (var7 != 1024) {
               var34 = var34 * var7 >> 10;
            }

            var13 = -var10 * var34 >> 10;
            int var32 = var9 * var34 >> 10;
            var0.b.a += var13 >> 1;
            var0.b.b += var32 >> 1;
            var1.b.a += var13 >> 1;
            var1.b.b += var32 >> 1;
         } else if (var7 == 1024) {
            var0.b.a = var0.a.a;
            var0.b.b = var0.a.b;
            var1.b.a = var1.a.a;
            var1.b.b = var1.a.b;
         } else {
            var0.b.a = var0.b.a + ((var0.a.a - var0.b.a) * var7 >> 10);
            var0.b.b = var0.b.b + ((var0.a.b - var0.b.b) * var7 >> 10);
            var1.b.a = var1.b.a + ((var1.a.a - var1.b.a) * var7 >> 10);
            var1.b.b = var1.b.b + ((var1.a.b - var1.b.b) * var7 >> 10);
         }
      }

      return true;
   }

   public static as a(s var0, as[] var1, int var2, int var3, int var4) {
      int var5 = Integer.MAX_VALUE;
      int var6 = 0;
      int var7 = 0;
      as var8 = new as();
      int var11 = 1;

      for (int var10 = 0; var11 < var1.length; var10 = var11++) {
         if (var1[var11] == null) {
            var11++;
         } else {
            var8.a = var1[var10].b - var1[var11].b;
            var8.b = var1[var11].a - var1[var10].a;
            int var9 = var2 - var1[var10].a;
            var10 = var3 - var1[var10].b;
            if ((long)var9 * var8.a + (long)var10 * var8.b < 0L) {
               return null;
            }

            var8.a();
            if ((var9 = var9 * var8.a + var10 * var8.b >> 10) < var5) {
               var5 = var9;
               var6 = var8.a;
               var7 = var8.b;
            }
         }
      }

      var0.a.a -= var6 * var5 >> 10;
      var0.a.b -= var7 * var5 >> 10;
      if (var4 != 0) {
         if (var4 == 1024) {
            var0.b.a = var0.a.a;
            var0.b.b = var0.a.b;
         } else {
            var0.b.a = var0.b.a + ((var0.a.a - var0.b.a) * var4 >> 10);
            var0.b.b = var0.b.b + ((var0.a.b - var0.b.b) * var4 >> 10);
         }
      }

      var8.a = var6;
      var8.b = var7;
      return var8;
   }

   public static as a(s var0, int var1, as[] var2, int var3, int var4, int var5) {
      int var6 = Integer.MAX_VALUE;
      int var7 = 0;
      int var8 = 0;
      as var9 = new as();
      int var10 = var2.length;
      int var11 = 1;

      for (int var12 = 0; var11 < var10; var12 = var11++) {
         if (var2[var11] == null) {
            var11++;
         } else {
            as var13 = var2[var11];
            as var19 = var2[var12];
            int var14 = var13.a - var19.a;
            int var15 = var13.b - var19.b;
            int var16 = var3 - var19.a;
            var12 = var4 - var19.b;
            int var17;
            if ((var17 = (int)((long)var14 * var16 + (long)var15 * var12 >> 10)) < 0) {
               int var18 = y.a(var16, var12);
               int var22;
               if ((var22 = var1 - var18) >= 0 && var22 < var6) {
                  var6 = var22;
                  var7 = (int)(((long)(-var16) << 10) / var18);
                  var8 = (int)(((long)(-var12) << 10) / var18);
               }
            } else {
               int var27 = (int)((long)var14 * var14 + (long)var15 * var15 >> 10);
               if (var17 <= var27) {
                  var9.a = -var15;
                  var9.b = var14;
                  var9.a();
                  int var23;
                  if ((var23 = (var9.a * var16 + var9.b * var12 >> 10) + var1) < 0) {
                     return null;
                  }

                  if (var23 < var6) {
                     var6 = var23;
                     var7 = var9.a;
                     var8 = var9.b;
                  }
               } else if (var11 == var10 - 1 || var2[var11 + 1] == null) {
                  var16 = var3 - var13.a;
                  var12 = var4 - var13.b;
                  int var24 = y.a(var16, var12);
                  if ((var14 = var1 - var24) >= 0 && var14 < var6) {
                     var6 = var14;
                     var7 = (int)(((long)(-var16) << 10) / var24);
                     var8 = (int)(((long)(-var12) << 10) / var24);
                  }
               }
            }
         }
      }

      var0.a.a -= var7 * var6 >> 10;
      var0.a.b -= var8 * var6 >> 10;
      if (var5 != 0) {
         if (var5 == 1024) {
            var0.b.a = var0.a.a;
            var0.b.b = var0.a.b;
         } else {
            var0.b.a = var0.b.a + ((var0.a.a - var0.b.a) * var5 >> 10);
            var0.b.b = var0.b.b + ((var0.a.b - var0.b.b) * var5 >> 10);
         }
      }

      var9.a = var7;
      var9.b = var8;
      return var9;
   }

   public static boolean a(am var0, am var1) {
      int var2 = 0;
      int var3 = var0.a.length;
      int var4 = var1.a.length;
      int[] var5 = var0.a();
      int[] var6 = var1.a();
      int var7 = 0;
      int var8 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var30 = 0;
      int var31 = var3 - 1;
      int var9 = var3 - 2;

      while (var30 < var3) {
         s var24;
         as var29 = (var24 = var0.a[var31]).a;
         if (var24.a != Integer.MAX_VALUE && y.a(var6, var29) && var1.a(var29)) {
            int var20 = var0.a[var9].a.b - var0.a[var30].a.b;
            int var21 = var0.a[var30].a.a - var0.a[var9].a.a;
            var2 = Integer.MAX_VALUE;
            var9 = -1;
            int var10 = Integer.MAX_VALUE;
            var14 = -1;
            int var32 = 0;

            for (int var33 = var4 - 1; var32 < var4; var33 = var32++) {
               s var27 = var1.a[var32];
               int var22;
               int var23;
               s var25;
               if ((var25 = var1.a[var33]).a.a > var27.a.a) {
                  var23 = var25.a.a;
                  var22 = var27.a.a;
               } else {
                  var23 = var27.a.a;
                  var22 = var25.a.a;
               }

               if (var23 >= var5[0] && var22 <= var5[2]) {
                  if (var25.a.b > var27.a.b) {
                     var23 = var25.a.b;
                     var22 = var27.a.b;
                  } else {
                     var23 = var27.a.b;
                     var22 = var25.a.b;
                  }

                  if (var23 >= var5[1] && var22 <= var5[3]) {
                     var22 = var27.a.a - var25.a.a;
                     var23 = var27.a.b - var25.a.b;
                     int var69 = var29.a - var25.a.a;
                     int var72 = var29.b - var25.a.b;
                     int var26;
                     if ((var26 = (int)((long)var22 * var69 + (long)var23 * var72 >> 10)) < 0) {
                        int var76 = y.a(var69, var72);
                        if ((int)((long)(-var23) * var20 + (long)var22 * var21 >> 10) > 0) {
                           if (var76 < var10) {
                              var10 = var76;
                              var18 = var69;
                              var19 = var72;
                              var14 = -1;
                              var12 = var33;
                           }
                        } else if (var76 < var2) {
                           var2 = var76;
                           var16 = var69;
                           var17 = var72;
                           var9 = -1;
                           var7 = var33;
                        }
                     } else {
                        int var28 = (int)((long)var22 * var22 + (long)var23 * var23 >> 10);
                        if (var26 <= var28) {
                           int var77 = y.a(var22, var23);
                           var22 = (int)(((long)var22 << 10) / var77);
                           var23 = (int)(((long)var23 << 10) / var77);
                           int var78 = (int)((long)var22 * var72 - (long)var23 * var69 >> 10);
                           if ((int)((long)(-var23) * var20 + (long)var22 * var21 >> 10) > 0) {
                              if (var78 < var10) {
                                 var10 = var78;
                                 var18 = -var23;
                                 var19 = var22;
                                 var12 = var33;
                                 var13 = var32;
                                 var14 = var26;
                                 var15 = var28;
                              }
                           } else if (var78 < var2) {
                              var2 = var78;
                              var16 = -var23;
                              var17 = var22;
                              var7 = var33;
                              var8 = var32;
                              var9 = var26;
                              var11 = var28;
                           }
                        }
                     }
                  }
               }
            }

            if (var2 == Integer.MAX_VALUE || var10 != Integer.MAX_VALUE && (var10 < 0 ? -var10 : var10) < (var2 < 0 ? -var2 : var2) >> 1) {
               var2 = var10;
               var16 = var18;
               var17 = var19;
               var7 = var12;
               var8 = var13;
               var9 = var14;
               var11 = var15;
            }

            if (var9 == -1) {
               var24 = var0.a[var31];
               s var73 = var1.a[var7];
               int var62;
               if (var24.a == var73.a) {
                  var62 = 512;
               } else if (var24.a == var73.a << 1) {
                  var62 = 682;
               } else if (var24.a == var73.a >> 1) {
                  var62 = 341;
               } else {
                  var62 = (int)(((long)var24.a << 10) / (var24.a + var73.a));
               }

               int var67 = var62 - 1024;
               if ((var16 != 0 || var17 != 0) && (var21 = var0.c + var1.c >> 1) != 0) {
                  var14 = var24.a.a - var24.b.a - var73.a.a + var73.b.a;
                  var20 = var24.a.b - var24.b.b - var73.a.b + var73.b.b;
                  long var38 = ((long)(-var17) * var14 + (long)var16 * var20 << 10) / ((long)var16 * var16 + (long)var17 * var17);
                  if (var21 != 1024) {
                     var38 = var38 * var21 >> 10;
                  }

                  var14 = (int)(-var17 * var38 >> 10);
                  var20 = (int)(var16 * var38 >> 10);
                  var24.b.a -= var14 * var67 >> 10;
                  var24.b.b -= var20 * var67 >> 10;
                  var73.b.a -= var14 * var62 >> 10;
                  var73.b.b -= var20 * var62 >> 10;
               }

               var24.a.a += var16 * var67 >> 10;
               var24.a.b += var17 * var67 >> 10;
               var73.a.a += var16 * var62 >> 10;
               var73.a.b += var17 * var62 >> 10;
               var24.b |= 1;
               var73.b |= 1;
               if (((var0.d & 1) != 0 || (var1.d & 1) != 0) && (var24.b & 4) == 0 && (var73.b & 4) == 0) {
                  t var80 = new t(var24, var73, 512, 10240, 0);
                  boolean var82;
                  if ((var0.d & 1) != 0) {
                     var82 = var0.a(var80);
                  } else {
                     var82 = var1.a(var80);
                  }

                  if (var82) {
                     var24.b |= 4;
                     var73.b |= 4;
                  }
               }
            } else {
               var24 = var0.a[var31];
               s var79 = var1.a[var8];
               s var74 = var1.a[var7];
               int var63;
               if (var24.a == Integer.MAX_VALUE) {
                  var63 = 1024;
               } else if (var74.a == Integer.MAX_VALUE) {
                  var63 = 0;
               } else if (var24.a == var74.a && var74.a == var79.a) {
                  var63 = 512;
               } else if (var24.a == var74.a << 1 && var74.a == var79.a) {
                  var63 = 682;
               } else if (var24.a == var74.a >> 1 && var74.a == var79.a) {
                  var63 = 341;
               } else {
                  var63 = (int)(((long)var24.a << 10) / (var24.a + (var79.a + var74.a >> 1)));
               }

               int var68 = var63 - 1024;
               if (var11 == 0) {
                  var9 = 0;
               } else {
                  var9 = (int)(((long)var9 << 10) / var11);
               }

               var10 = 1024 - var9;
               if ((var16 != 0 || var17 != 0) && (var21 = var0.c + var1.c >> 1) != 0) {
                  var14 = var24.a.a - var24.b.a - (var74.a.a + var79.a.a >> 1) + (var74.b.a + var79.b.a >> 1);
                  var20 = var24.a.b - var24.b.b - (var74.a.b + var79.a.b >> 1) + (var74.b.b + var79.b.b >> 1);
                  int var75 = -var17 * var14 + var16 * var20 >> 10;
                  if (var21 != 1024) {
                     var75 = var75 * var21 >> 10;
                  }

                  var14 = -var17 * var75 >> 10;
                  var20 = var16 * var75 >> 10;
                  var24.b.a -= var14 * var68 >> 10;
                  var24.b.b -= var20 * var68 >> 10;
                  var14 = var14 * var63 >> 10;
                  var20 = var20 * var63 >> 10;
                  var74.b.a -= var14 * var10 >> 10;
                  var74.b.b -= var20 * var10 >> 10;
                  var79.b.a -= var14 * var9 >> 10;
                  var79.b.b -= var20 * var9 >> 10;
               }

               var16 = var16 * var2 >> 10;
               var17 = var17 * var2 >> 10;
               var24.a.a += var16 * var68 >> 10;
               var24.a.b += var17 * var68 >> 10;
               var14 = var16 * var63 >> 10;
               var20 = var17 * var63 >> 10;
               var74.a.a += var14 * var10 >> 10;
               var74.a.b += var20 * var10 >> 10;
               var79.a.a += var14 * var9 >> 10;
               var79.a.b += var20 * var9 >> 10;
               var24.b |= 1;
               var74.b |= 1;
               var79.b |= 1;
               if (((var0.d & 1) != 0 || (var1.d & 1) != 0) && (var24.b & 4) == 0) {
                  t var81 = new t(var24, new aq(var74, var79, var9), 512, 10240, 0);
                  boolean var83;
                  if ((var0.d & 1) != 0) {
                     var83 = var0.a(var81);
                  } else {
                     var83 = var1.a(var81);
                  }

                  if (var83) {
                     var24.b |= 4;
                  }
               }
            }

            var2 = 1;
         }

         var9 = var31;
         var31 = var30++;
      }

      return (boolean)var2;
   }

   public static int a(as var0, s[] var1, s[] var2) {
      int[] var3 = new int[var1.length];
      int var4 = (int)((long)var1[0].a.a * var0.a + (long)var1[0].a.b * var0.b >> 10);
      var3[0] = var4;

      for (int var5 = 1; var5 < var1.length; var5++) {
         var3[var5] = (int)((long)var1[var5].a.a * var0.a + (long)var1[var5].a.b * var0.b >> 10);
         if (var3[var5] < var4) {
            var4 = var3[var5];
         }
      }

      int var12 = 0;
      int[] var6 = new int[2];
      boolean var7 = false;

      for (int var10 = 0; var10 < var1.length; var10++) {
         if (var3[var10] < var4 + 1024) {
            int var11 = (int)((long)var1[var10].a.a * -var0.b + (long)var1[var10].a.b * var0.a >> 10);
            if (var12 < 2) {
               var6[var12] = var11;
               var2[var12] = var1[var10];
               if (++var12 > 1) {
                  var7 = var6[1] > var6[0];
               }
            } else {
               int var8 = var7 ? 0 : 1;
               int var9 = var7 ? 1 : 0;
               if (var11 < var6[var8]) {
                  var6[var8] = var11;
                  var2[var8] = var1[var10];
               } else if (var11 > var6[var9]) {
                  var6[var9] = var11;
                  var2[var9] = var1[var10];
               }
            }
         }
      }

      return var12;
   }

   public static boolean a(s[] var0, s[] var1, int[][] var2, int[] var3, int var4) {
      int[] var16 = var2[var4];
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      for (int var11 = 0; var11 < 2; var11++) {
         s[] var12;
         if (var11 == 0) {
            var12 = var0;
         } else {
            var12 = var1;
         }

         as var13 = var12[0].a;
         int var6;
         int var5 = var6 = (int)((long)var12[0].a.a * var16[0] + (long)var13.b * var16[1] >> 10);
         int var14 = var12.length;

         for (int var15 = 1; var15 < var14; var15++) {
            var13 = var12[var15].a;
            int var18;
            if ((var18 = (int)((long)var12[var15].a.a * var16[0] + (long)var13.b * var16[1] >> 10)) < var5) {
               var5 = var18;
            } else if (var18 > var6) {
               var6 = var18;
            }
         }

         if (var11 == 0) {
            var7 = var6 - var5 >> 1;
            var8 = var6 + var5 >> 1;
         } else {
            var9 = var5 - var7 - var8;
            var10 = var6 + var7 - var8;
         }
      }

      if (var9 <= 0 && var10 >= 0) {
         if ((var9 < 0 ? -var9 : var9) < (var10 < 0 ? -var10 : var10)) {
            var16[0] = -var16[0];
            var16[1] = -var16[1];
            var3[var4] = -var9;
         } else {
            var3[var4] = var10;
         }

         return true;
      } else {
         return false;
      }
   }
}
