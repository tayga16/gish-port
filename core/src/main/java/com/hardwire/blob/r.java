package com.hardwire.blob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Timer;

public final class r implements Runnable {
   private an a;
   private c a;
   public Thread a;
   ah a;
   private Object a = new Object();
   private volatile boolean c = true;
   public volatile boolean a;
   volatile boolean b;
   private Object b = new Object();
   private Timer a;
   private byte[] a;
   private byte[] b;
   private int a;
   private short[] a;
   private short[] b;
   private int b;
   private int c;
   public Throwable a = null;

   public r(an var1, ah var2) {
      this.a = var1;
      this.a = new Thread(this);
      this.a = var2;
      this.a = new short[6];
      this.b = new short[6];

      for (int var3 = 0; var3 < this.a.length; var3++) {
         this.a[var3] = 254;
         this.b[var3] = 254;
      }

      this.a = new c();
      this.a = new Timer();
   }

   public final void a() {
      synchronized (this.a) {
         this.c = false;
         this.a.notify();
      }

      this.a.b();
   }

   void b() {
      try {
         this.a();
      } catch (IOException var1) {
      }
   }

   public final void run() {
      this.a = null;
      boolean var1 = false;

      try {
         if (var1 = this.a.b()) {
            this.a.a(this);
         }

         this.a.a();
      } catch (SecurityException var10) {
         this.a = var10;
         this.b();
      } catch (IOException var11) {
         if (this.c) {
            this.a = var11;
            this.b();
         }
      }

      if (this.c) {
         e var2 = new e(this);
         this.a.schedule(var2, 15000L);
      }

      int var15 = 0;
      if (var1) {
         synchronized (this.a) {
            while (this.c) {
               try {
                  this.a.wait();
               } catch (InterruptedException var8) {
               }
            }
         }
      } else {
         label233:
         while (true) {
            label176:
            while (true) {
               if (!this.c) {
                  break label233;
               }

               switch (var15 = this.a()) {
                  case 0:
                     var13 = this;
                     if (this.a != 0 && var13.b[0] == -95) {
                        if (!var13.b) {
                           switch (var13.b[1]) {
                              case 3:
                              case 4:
                              case 5:
                                 break label176;
                           }
                        } else if (var13.a) {
                           break label176;
                        }
                     }
                     break;
                  default:
                     var15 = var15;
                     r var12 = this;
                     switch (var15) {
                        case -2:
                           if (var12.c) {
                              var12.b();
                           }
                           break;
                        case -1:
                           if (var12.c) {
                              var12.b();
                           }
                           break;
                        default:
                           if (var12.c) {
                              var12.b();
                           }

                           throw new IllegalStateException();
                     }
               }
            }

            switch (var13.b[1]) {
               case -3:
               case 8:
                  if (var13.a >= 5) {
                     byte var35 = (byte)(var13.b[2] & 127);
                     boolean var61 = false;
                     int var58 = null;
                     byte var53 = var13.b[3];
                     var58 = var13.b[4];
                     if (var13.b[1] == -3) {
                        if (var53 == var13.b && var59 == var13.c) {
                           continue;
                        }

                        var13.b = var53;
                        var13.c = var59;
                     }

                     c var36 = var13.a;
                     c var37 = var13.a;
                     c var38 = var13.a;
                     c var39 = var13.a;
                     var13.a.a(var35, var53, var59, var13.a.g, var13.a.h, var13.a.g, var13.a.h);
                  }
               case -2:
               case -1:
               case 0:
               case 1:
               case 2:
               case 6:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               default:
                  continue;
               case 3:
                  if (var13.a >= 45) {
                     var15 = a(var13.b, 2);
                     int var52 = a(var13.b, 4);
                     int var57 = a(var13.b, 10);
                     int var84 = var15;
                     c var74 = var13.a;
                     var13.a.a = var84;
                     var84 = var52;
                     var74 = var13.a;
                     var13.a.b = var84;
                     var84 = var57;
                     var74 = var13.a;
                     var13.a.c = var84;
                  }
                  continue;
               case 4:
                  if (var13.a >= 37) {
                     short var33 = a(var13.b, 2);
                     short var49 = a(var13.b, 3);
                     short var56 = a(var13.b, 4);
                     String var60 = a(var13.b, 5, var56);
                     c var71 = var13.a;
                     if (var33 < var13.a.d) {
                        var49 = var49;
                        short var82 = var33;
                        var71 = var13.a;
                        var13.a.a[var82] = var49;
                        String var51 = var60;
                        var82 = var33;
                        var71 = var13.a;
                        var13.a.a[var82] = var51;
                     }
                  }
                  continue;
               case 5:
                  if (var13.a < 7) {
                     continue;
                  }

                  byte var31 = var13.b[2];
                  int var46 = b(var13.b, 3);
                  switch (var31) {
                     case -1:
                        if (!var13.b) {
                           r var32 = var13;
                           if (var13.c && w.a()) {
                              var32.d();
                           }

                           c var70 = var13.a;
                           var13.a(var13.a.e <= 0 || var70.f > 0);
                        }
                     case 0:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     default:
                        continue;
                     case 1:
                        int var81 = var46;
                        c var69 = var13.a;
                        var13.a.d = var81;
                        if (var81 > 0) {
                           var69.a = new String[var81];
                           var69.a = new int[var81];
                        }
                        continue;
                     case 2:
                        int var80 = var46;
                        c var68 = var13.a;
                        var13.a.e = var80;
                        continue;
                     case 3:
                        int var79 = var46;
                        c var67 = var13.a;
                        var13.a.f = var79;
                        var46 = var79;
                        var67.g = -c.a(2, var46 - 1);
                        var46 = var79;
                        var67.h = c.a(2, var46 - 1) - 1;
                        continue;
                     case 14:
                        int var78 = var46;
                        c var66 = var13.a;
                        var13.a.i = var78;
                        continue;
                     case 15:
                        int var77 = var46;
                        c var65 = var13.a;
                        var13.a.k = var77;
                        continue;
                     case 16:
                        int var7 = var46;
                        c var64 = var13.a;
                        var13.a.j = var7;
                        continue;
                  }
               case 7:
                  if (var13.a < 8) {
                     continue;
                  }

                  var15 = 0;

                  for (int var42 = 2; var42 < 8; var42++) {
                     var13.b[var15] = a(var13.b, var42);
                     var15++;
                  }

                  var15 = 0;

                  for (int var43 = 0; var43 < var13.b.length && var13.b[var43] != 254 && var13.b[var43] != 255; var43++) {
                     if (var13.b[var43] == var13.a[var15]) {
                        var15++;
                     } else if (var13.b[var43] < var13.a[var15]) {
                        var13.a.a(var13.b[var43]);
                     } else {
                        var13.a.b(var13.a[var15]);
                        var43--;
                        var15++;
                     }
                  }

                  for (int var44 = var15; var44 < var13.a.length && var13.a[var44] != 254; var44++) {
                     var13.a.b(var13.a[var44]);
                  }

                  int var45 = 0;

                  while (true) {
                     if (var45 >= var13.a.length) {
                        continue label233;
                     }

                     var13.a[var45] = var13.b[var45];
                     var45++;
                  }
               case 9:
                  if (var13.a >= 7) {
                     byte var24 = (byte)(var13.b[2] & 127);
                     short var41 = b(var13.b, 3);
                     short var55 = b(var13.b, 5);
                     c var25 = var13.a;
                     c var26 = var13.a;
                     c var27 = var13.a;
                     c var28 = var13.a;
                     var13.a.a(var24, var41, var55, var13.a.g, var13.a.h, var13.a.g, var13.a.h);
                  }
                  continue;
               case 10:
                  if (var13.a >= 11) {
                     byte var19 = (byte)(var13.b[2] & 127);
                     int var40 = b(var13.b, 3);
                     int var54 = b(var13.b, 7);
                     c var20 = var13.a;
                     c var21 = var13.a;
                     c var22 = var13.a;
                     c var23 = var13.a;
                     var13.a.a(var19, var40, var54, var13.a.g, var13.a.h, var13.a.g, var13.a.h);
                  }
                  continue;
               case 17:
            }

            if (var13.a >= 4) {
               var15 = a(var13.b, 2);
               c var6 = var13.a;
               int var3 = var13.a.i;
               var6 = var13.a;
               int var4 = var13.a.j;
               var6 = var13.a;
               int var5 = var13.a.k;
               if (var15 < var5) {
                  var15 = var5;
               } else if (var15 > var3) {
                  var15 = var3;
               }

               var13.a.a(var15, var3, var4, var5);
            }
         }
      }

      if (this.b) {
         if (this.a) {
            this.a.a();
            return;
         }
      } else {
         this.a(false);
      }
   }

   private int a() {
      try {
         this.a = this.a.a(this.a);
      } catch (IOException var1) {
         return -2;
      }

      if (this.a == null) {
         return -1;
      }

      this.a = this.a[0];
      if (this.a < 0) {
         return -1;
      }

      if (this.b == null || this.b.length < this.a) {
         this.b = new byte[this.a];
      }

      System.arraycopy(this.a, 1, this.b, 0, this.a);
      return 0;
   }

   private void d() {
      c var1 = this.a;
      if (this.a.c == 3) {
         var1 = this.a;
         if (this.a.a <= 1) {
            var1 = this.a;
            if (this.a.b < 1) {
               try {
                  byte[] var7 = new byte[]{4, -94, 6, 8, 0};
                  this.a.a(var7);
                  byte[] var8 = new byte[]{4, -94, 6, -3, 1};
                  this.a.a(var8);
                  return;
               } catch (IOException var3) {
                  if (this.c) {
                     this.b();
                  }

                  return;
               }
            }
         }
      }

      try {
         byte[] var6 = new byte[]{4, -94, 25, 1, -12};
         this.a.a(var6);
      } catch (IOException var2) {
         if (this.c) {
            this.b();
         }
      }
   }

   private void a(boolean var1) {
      synchronized (this.b) {
         if (!this.b) {
            this.b = true;
            this.a = var1;
            if (var1) {
               c var3 = this.a;
               an var7 = this.a;
               this.a.a = var3;
               var3 = this.a;
               an var8 = this.a;
               synchronized (this.a.a) {
                  if (var8.a && var8.a != null) {
                     new bf(var8);

                     for (int var4 = 0; var4 < var8.a.size(); var4++) {
                        var8.a.elementAt(var4);
                     }
                  }
               }
            }

            this.b.notify();
         }
      }
   }

   public final void c() {
      while (!this.b) {
         synchronized (this.b) {
            this.b.wait();
         }
      }
   }

   private static short a(byte[] var0, int var1) {
      return (short)(var0[var1] & 0xFF);
   }

   private static short b(byte[] var0, int var1) {
      return (short)((var0[var1 + 1] & 255) + ((var0[var1] & 255) << 8));
   }

   private static int a(byte[] var0, int var1) {
      return (var0[var1 + 1] & 0xFF) + ((var0[var1] & 0xFF) << 8);
   }

   private static int b(byte[] var0, int var1) {
      return (var0[var1 + 3] & 0xFF) + ((var0[var1 + 2] & 0xFF) << 8) + ((var0[var1 + 1] & 0xFF) << 16) + ((var0[var1] & 0xFF) << 24);
   }

   private static String a(byte[] var0, int var1, int var2) {
      try {
         return new String(var0, var1, var2, "UTF-8");
      } catch (UnsupportedEncodingException var3) {
         return null;
      }
   }
}
