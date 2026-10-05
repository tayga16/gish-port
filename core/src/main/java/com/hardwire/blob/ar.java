package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class ar {
   public static final int[] a = new int[]{1024, 1024, 682, 341, 1024, 341};
   public static final int[] b = new int[]{-1, -1, -1536, -1, -1, -1536};
   public static final int[] c = new int[]{-1, -1, -1, -1, 32768, -1};
   private static boolean[] g = new boolean[]{
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      true,
      false,
      false,
      true,
      true,
      true,
      false,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      false
   };
   public static final boolean[] a = new boolean[]{
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      true,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false
   };
   public static final boolean[] b = new boolean[]{
      true,
      true,
      true,
      false,
      false,
      false,
      false,
      false,
      false,
      true,
      false,
      true,
      false,
      true,
      false,
      true,
      true,
      false,
      false,
      false,
      false,
      true,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      false,
      true
   };
   private static final short[] a = new short[]{0, 4, 8, 2, 4, 12, 10, 2, 8, 6, 12, 14, 10, 0, 14, 32, 16, 128, 64, 0, 0, 0, 0, 40, 24, 128, 64, 8, 0};
   public Main a;
   public ad a;
   public d a;
   public ac a;
   private at a;
   public Vector a;
   public byte a;
   public boolean a;
   public int[] d;
   public int a;
   public byte b = -1;
   public byte c = -1;
   public byte d = -1;
   public int b;
   public ab a;
   public ap[] a;
   public k[] a;
   public ai[] a;
   public bb[] a;
   public q[] a;
   public t[] a;
   public byte[][][] a;
   public byte[][] a;
   public as[][] a;
   public boolean[] c;
   public boolean[] d;
   public boolean[] e;
   public boolean[] f;
   public short[][] a;
   public int c;
   public int d;
   public int e;
   public int[][] a;
   public int f;
   public int g;
   public byte e;
   public int[] e = new int[10];
   public int[] f = new int[10];
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   private int p;
   public int o;

   public ar(Main var1) {
      this.a = var1;
      this.a = this.a.a;
      this.a = this.a.a;
      this.a = new ab();
      ar var2 = this;
      ab var3 = this.a;
      this.a.a = var2;
      this.a = new ac(this.a, this);
   }

   public final boolean a(byte var1, byte var2) {
      try {
         this.a.c(12);
         this.d();
         DataInputStream var3;
         if ((var3 = this.a.a(d.b[d.a(d.g, this.b)])) == null) {
            return false;
         }

         do {
            this.a.j = y.b(0, ac.a.length - 1);
         } while (ac.e[this.a.j] != this.a.a);

         if (this.a.b == -1 || this.a.b != this.a.a) {
            this.a.a = true;
            this.a.m();
            this.a.a = false;
         }

         if (this.a.b != -1 && this.a.b != this.a.a) {
            this.a.e();
         }

         this.a.f();
         this.a.d();
         this.a.a.a = false;
         this.d = this.c = 7;
         this.a.h = Integer.MAX_VALUE;
         this.a.a = 0;
         this.a.m();
         long var4 = System.currentTimeMillis();
         this.e = var2;
         this.b = (byte)var1;
         this.a = this.a.a;
         this.a = 0;
         if (this.b == 2 && this.a == null) {
            this.a = new Vector();
         }

         if (this.b == 4) {
            this.f = 1;
            this.g = 0;
         } else {
            this.f = 0;
            this.g = 1;
         }

         if ((this.b & 3) != 0) {
            this.a = new int[this.b == 2 ? 2 : 1][4];
            int[][] var11 = this.a;
            var1 = 200;
            ab var10 = this.a;
            this.a.e = 200;
            var10.a = var11;
            var10.b = new Vector();
            var10.a = new Vector();
            var10.c = new Vector();
            var10.b = new int[16][2];
            var10.a = false;
            var10.b = true;
         }

         System.gc();
         this.a.a(var3);
         System.gc();
         this.a.e();
         if ((this.b & 3) != 0) {
            int var6 = (this.a.length << 1) + 18 * this.a.length + 16 * this.a.length;
            this.a.a(this.a, this.a[1], this.a, g, 15, this.a.length + this.a.length + this.a.length, this.a.length, var6);
         }

         this.k = 0;
         if (this.e != 4 && this.e != 5) {
            this.e[0] = this.e[1] = this.f[0] = this.f[1] = 0;
         }

         this.o = 0;
         if (this.e != 4 && this.e != 5) {
            this.m = -1;
         } else {
            this.m = 1;
            this.p = -1;
         }

         this.a.e();
         long var12;
         if ((var12 = System.currentTimeMillis() - var4) < 500L) {
            Thread.sleep(500L - var12);
         }
      } catch (Exception var8) {
         return false;
      }

      System.gc();
      Main.d = false;
      this.d = this.c = 0;
      this.a.h = 0;
      return true;
   }

   public final int a(int[] var1) {
      int var2 = var1[0] >> 15;
      int var3 = var1[1] >> 15;
      int var4 = var1[2] >> 15;
      int var6 = var1[3] >> 15;
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      if (var4 >= this.d) {
         var4 = this.d - 1;
      }

      if (var6 >= this.e) {
         var6 = this.e - 1;
      }

      for (int var7 = var3; var7 <= var6; var7++) {
         for (int var5 = var2; var5 <= var4; var5++) {
            switch (this.a[2][var5][var7]) {
               case 6:
               case 7:
               case 36:
                  return var7;
            }
         }
      }

      return -1;
   }

   public final boolean a(int var1, int var2) {
      switch (this.a[2][var1][var2]) {
         case 6:
         case 7:
         case 36:
            return true;
         default:
            return false;
      }
   }

   private void e() {
      long var1;
      long var3 = var1 = System.currentTimeMillis();

      while (!this.a && !this.a.a()) {
         this.a.b();
         long var5;
         if ((var5 = System.currentTimeMillis()) - var1 > 500L && var5 - var3 > Main.a) {
            if (this.a.a == 1) {
               if (this.a.a.a()) {
                  this.a.m();
               }
            } else {
               this.a.a = true;
               this.a.m();
               this.a.a = false;
            }

            var3 = System.currentTimeMillis();
         } else {
            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
            }
         }
      }
   }

   private void f() {
      this.d();
      this.a.a.b();
      this.a.a.a((byte)10);
      this.a.a = 1;
   }

   private boolean a(DataInputStream var1) {
      switch (var1.readByte()) {
         case 1:
            this.d = 2;
            var1.close();
            return true;
         case 2:
            this.a.a.c(false);
            return true;
         case 3:
            this.b = var1.readInt();
            this.a = var1.readByte();
            this.e[0] = var1.readInt();
            this.e[1] = var1.readInt();
            this.f[0] = var1.readInt();
            this.f[1] = var1.readInt();
            if (this.e == 2) {
               this.h = var1.readInt();
               this.i = var1.readInt();
               this.j = var1.readInt();
            }

            this.d = 5;
            return true;
         case 4:
            this.m = var1.readInt();
            this.p = var1.readInt();
            this.n = var1.readInt();
            return true;
         case 5:
            if (this.m < 0) {
               this.m = 0;
               this.p = 4;
            }

            return true;
         default:
            return false;
      }
   }

   private boolean a() {
      byte var1 = this.a;
      this.a = 0;
      switch (var1) {
         case 1:
            this.a.a(new byte[]{1});
            return true;
         case 2:
            this.a.a(new byte[]{2});
            return true;
         case 3:
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var2;
            (var2 = new DataOutputStream(var3)).writeByte(3);
            var2.writeInt(this.b);
            var2.writeByte(this.a);
            var2.writeInt(this.e[0]);
            var2.writeInt(this.e[1]);
            var2.writeInt(this.f[0]);
            var2.writeInt(this.f[1]);
            if (this.e == 2) {
               var2.writeInt(this.h);
               var2.writeInt(this.i);
               var2.writeInt(this.j);
            }

            this.a.a(var3.toByteArray());
            return true;
         case 4:
         default:
            return false;
         case 5:
            this.a.a(new byte[]{5});
            return true;
      }
   }

   public final void a() {
      if (!this.a) {
         if (this.b == 4) {
            try {
               if (this.m >= 0 && this.o > 0) {
                  this.a = 5;
               }

               if (!this.a()) {
                  ByteArrayOutputStream var7 = new ByteArrayOutputStream();
                  DataOutputStream var8;
                  (var8 = new DataOutputStream(var7)).writeByte(0);
                  var8.writeInt(this.a.d[0]);
                  var8.writeInt(this.a.d[1]);
                  var8.writeInt(this.a.d[2]);
                  var8.writeInt(this.a.d[3]);
                  byte var9 = 0;
                  if (this.a[this.f].d) {
                     var9 = 1;
                  }

                  if (this.a[this.f].e) {
                     var9 = (byte)(var9 | 2);
                  }

                  if (this.a[this.f].f) {
                     var9 = (byte)(var9 | 4);
                  }

                  if (this.a[this.f].g) {
                     var9 = (byte)(var9 | 8);
                  }

                  if (this.a[this.f].h) {
                     var9 = (byte)(var9 | 32);
                  }

                  var8.writeByte(var9);
                  var8.writeByte(this.a[this.f].h);
                  var8.writeByte(this.a[this.f].i);
                  var8.writeByte(this.a[this.f].b);
                  if (!this.a.a(var7.toByteArray())) {
                     this.f();
                  }
               }
            } catch (IOException var4) {
               this.f();
            }
         } else {
            if (this.b == 2) {
               this.a.removeAllElements();
               this.e();
               if (this.a) {
                  return;
               }

               InputStream var1 = null;
               if ((var1 = this.a.a()) == null) {
                  this.f();
                  return;
               }

               try {
                  DataInputStream var2 = new DataInputStream(var1);
                  if (this.a(var2)) {
                     return;
                  }

                  if (this.d == null) {
                     this.d = new int[4];
                  }

                  this.d[0] = var2.readInt();
                  this.d[1] = var2.readInt();
                  this.d[2] = var2.readInt();
                  this.d[3] = var2.readInt();
                  byte var3 = var2.readByte();
                  this.a[this.g].d = (var3 & 1) != 0;
                  this.a[this.g].e = (var3 & 2) != 0;
                  this.a[this.g].f = (var3 & 4) != 0;
                  this.a[this.g].g = (var3 & 8) != 0;
                  this.a[this.g].h = (var3 & 32) != 0;
                  this.a[this.g].h = var2.readByte();
                  this.a[this.g].i = var2.readByte();
                  this.a[this.g].b = var2.readByte();
                  return;
               } catch (IOException var5) {
                  this.f();
               }
            }
         }
      }
   }

   public final void b() {
      if (!this.a) {
         try {
            if (this.b == 2) {
               try {
                  if (this.a()) {
                     return;
                  }

                  ByteArrayOutputStream var19 = new ByteArrayOutputStream();
                  DataOutputStream var20 = new DataOutputStream(var19);
                  if (this.m >= 0 && this.o > 0) {
                     ar var31 = this;
                     if (this.m >= 0 && var31.o > 0) {
                        if (var31.p == -1) {
                           if (var31.a.h >= 4) {
                              var31.p = 0;
                              var31.n = 0;
                           }
                        } else if (var31.p == 0 && var31.n < 3) {
                           var31.n++;
                        } else if (var31.p < 4) {
                           var31.p++;
                        } else if (var31.n < 6) {
                           var31.n++;
                        } else {
                           var31.m--;
                           var31.p = -1;
                        }
                     }

                     var20.writeByte(4);
                     var20.writeInt(this.m);
                     var20.writeInt(this.p);
                     var20.writeInt(this.n);
                     if (!this.a.a(var19.toByteArray())) {
                        this.f();
                     }

                     return;
                  }

                  this.d[0] = this.d[0] - 32768;
                  this.d[1] = this.d[1] - 32768;
                  this.d[2] = this.d[2] + 32768;
                  this.d[3] = this.d[3] + 32768;
                  var20.writeByte(0);
                  var20.writeInt(this.k);
                  int var25 = this.a.length;

                  for (int var40 = 0; var40 < var25; var40++) {
                     q var54 = this.a[var40];
                     var20.writeByte(var54.a);
                     int var69 = var54.a;

                     for (int var90 = 0; var90 < var69; var90++) {
                        as var115 = var54.a[var90].a.a;
                        var20.writeShort(var115.a >> 10);
                        var20.writeShort(var115.b >> 10);
                     }

                     for (int var91 = 0; var91 < var54.a.a.length; var91++) {
                        s var116 = var54.a.a[var91];
                        var20.writeShort(var116.a.a >> 10);
                        var20.writeShort(var116.a.b >> 10);
                        var20.writeByte(var116.b);
                     }

                     var20.writeByte(var54.d >> 10);
                     int var92 = this.e[var40] << 1;
                     if (var54.a) {
                        var92 |= 1;
                     }

                     var20.writeShort(var92);
                     int var93 = var54.c;
                     var93 = var54.c | var54.d << 2;
                     if (var54.e > 0) {
                        var93 |= 16;
                     }

                     var93 |= var54.a.b << 5;
                     var20.writeByte(var93);
                     if (var54.d == 2) {
                        var20.writeByte(var54.c);
                     }

                     var20.writeInt(var54.a.c().d());
                  }

                  var25 = this.a.length;

                  for (int var41 = 0; var41 < var25; var41++) {
                     ai var55;
                     if ((var55 = this.a[var41]).a != 2 && y.a(this.d, var55.a())) {
                        var20.writeByte(var41);
                        var20.writeShort(var55.a.a.a.a >> 10);
                        var20.writeShort(var55.a.a.a.b >> 10);
                        if (var55.b != null) {
                           var20.writeShort(var55.b.a.a.a >> 10);
                           var20.writeShort(var55.b.a.a.b >> 10);
                        }

                        short var70 = var55.a;
                        if (var55.a) {
                           var70 = (short)(var70 | 8);
                        }

                        if (var55.a != -1) {
                           var70 = (short)(var70 | 16);
                        }

                        if (var55.b) {
                           var70 = (short)(var70 | 32);
                        }

                        short var71;
                        var70 = (short)((var71 = (short)(var70 | var55.b << 6)) | var55.c << 11);
                        var20.writeShort(var70);
                     }
                  }

                  var20.writeByte(-1);
                  var25 = this.a.length;

                  for (int var42 = 0; var42 < var25; var42++) {
                     k var56 = this.a[var42];
                     if (y.a(this.d, var56.a.a())) {
                        var20.writeByte(var42);
                        var20.writeShort(var56.a.a.a >> 10);
                        var20.writeShort(var56.a.a.b >> 10);
                     }
                  }

                  var20.writeByte(-1);
                  var25 = this.a.length;

                  for (int var43 = 0; var43 < var25; var43++) {
                     bb var57 = this.a[var43];
                     if (y.a(this.d, var57.a)) {
                        var20.writeByte(var43);
                        int var73 = this.a[var43].b ? 1 : 0;
                        if (this.a[var43].a.a) {
                           var73 |= 2;
                        }

                        var20.writeByte(var73);
                     }
                  }

                  var20.writeByte(-1);
                  var25 = this.a.length;

                  for (int var44 = 0; var44 < var25; var44++) {
                     ap var58 = this.a[var44];
                     if (y.a(this.d, var58.a.a())) {
                        var20.writeByte(var44);
                        int var74 = var58.a.a.length;

                        for (int var96 = 0; var96 < var74; var96++) {
                           as var117 = var58.a.a[var96].a;
                           var20.writeShort(var117.a >> 10);
                           var20.writeShort(var117.b >> 10);
                        }

                        if (var58.a.c != null) {
                           var74 = var58.a.c.length;

                           for (int var97 = 0; var97 < var74; var97++) {
                              as var118 = var58.a.c[var97].a;
                              var20.writeShort(var118.a >> 10);
                              var20.writeShort(var118.b >> 10);
                           }
                        }

                        if (var58.a.c != null) {
                           var74 = var58.a.c.length;

                           for (int var98 = 0; var98 < var74; var98++) {
                              t var119;
                              if ((var119 = var58.a.c[var98]) == null) {
                                 var20.writeShort(32767);
                              } else if (var119.b != null) {
                                 var20.writeShort(-32768);
                              } else if (var119.b == null) {
                                 var20.writeShort(var119.a.a >> 10);
                                 var20.writeShort(var119.a.b >> 10);
                              }
                           }
                        }

                        byte var99 = var58.a;
                        if (var58.b) {
                           var99 |= 4;
                        }

                        var20.writeByte(var99);
                     }
                  }

                  var20.writeByte(-1);
                  var25 = this.a.size();
                  var20.writeByte(var25);

                  for (int var45 = 0; var45 < var25; var45++) {
                     byte[] var59 = (byte[])this.a.elementAt(var45);

                     for (int var77 = 0; var77 < var59.length; var77++) {
                        var20.writeByte(var59[var77]);
                     }
                  }

                  this.a.removeAllElements();
                  if (!this.a.a(var19.toByteArray())) {
                     this.f();
                  }
               } catch (IOException var9) {
                  this.f();
               }
            } else {
               if (this.b == 4) {
                  this.e();
                  if (this.a) {
                     return;
                  }

                  InputStream var1 = null;
                  if ((var1 = this.a.a()) == null) {
                     this.f();
                     return;
                  }

                  try {
                     DataInputStream var2 = new DataInputStream(var1);
                     if (this.a(var2)) {
                        return;
                     }

                     this.k = var2.readInt();
                     int var3 = this.a.length;

                     for (int var4 = 0; var4 < var3; var4++) {
                        q var5;
                        (var5 = this.a[var4]).a = var2.readByte();
                        int var6 = var5.a;

                        for (int var7 = 0; var7 < var6; var7++) {
                           if (var5.a[var7] == null) {
                              var5.a[var7] = new aa(new s(new as(), 2048), 5120);
                           }

                           s var8 = var5.a[var7].a;
                           var5.a[var7].a.b.a = var8.a.a = var2.readShort() << 10;
                           var8.b.b = var8.a.b = var2.readShort() << 10;
                        }

                        for (int var78 = 0; var78 < var5.a.a.length; var78++) {
                           s var100;
                           (var100 = var5.a.a[var78]).b.a = var100.a.a = var2.readShort() << 10;
                           var100.b.b = var100.a.b = var2.readShort() << 10;
                           var100.b = var2.readByte();
                        }

                        int var79 = var2.readByte() << 10;
                        if (var5.d > var79) {
                           var5.c = 2;
                           if (var5.b == this.f) {
                              this.a.a(Main.b / 2);
                           }
                        }

                        var5.d = var79;
                        int var101 = var2.readShort() & '\uffff';
                        this.e[var4] = var101 >> 1;
                        boolean var13 = (var101 & 1) != 0;
                        boolean var60 = var5.a;
                        var5.a = var13;
                        byte var102 = var2.readByte();
                        var5.c = (byte)(var102 & 3);
                        byte var80;
                        if ((var80 = (byte)(var102 >> 2 & 3)) == 1 && var5.d != 1 && y.a(this.a.d, var5.a.a())) {
                           this.a.a(4, false);
                        }

                        var5.d = (byte)var80;
                        if ((var102 >> 4 & 1) != 0) {
                           if (var5.e == 0) {
                              var5.e = 1;
                           }
                        } else {
                           var5.e = 0;
                        }

                        var5.a.b = var102 >> 5;
                        if (var80 == 2) {
                           var5.c = var2.readByte();
                        }

                        var5.f = var2.readInt();
                        var5.a.d();
                        am var103 = var5.a;
                        var5.a.a = true;
                        if (!var5.a() && y.a(this.a.d, var5.a.a())) {
                           var80 = this.a(var5.a.a());
                           if (var13 && !var60 && var5.f > 10240) {
                              this.a.a(7, false);
                              if (this.a.g > 0) {
                                 var5.a(var80);
                              }
                           }

                           if (this.a.g > 1 && var5.a.a()[1] >> 15 < var80) {
                              this.a.b(var5.a.a().a >> 10, var80 << 5, 16, 1);
                           }
                        }
                     }

                     byte var32;
                     while ((var32 = var2.readByte()) != -1) {
                        ai var46;
                        (var46 = this.a[var32]).a.a = true;
                        if (var46.b != null) {
                           aa var104 = var46.b;
                           var46.b.a = true;
                        }

                        var46.a.a.b.a = var46.a.a.a.a = var2.readShort() << 10;
                        var46.a.a.b.b = var46.a.a.a.b = var2.readShort() << 10;
                        if (var46.b != null) {
                           var46.b.a.b.a = var46.b.a.a.a = var2.readShort() << 10;
                           var46.b.a.b.b = var46.b.a.a.b = var2.readShort() << 10;
                        }

                        short var61;
                        byte var82 = (byte)((var61 = var2.readShort()) & 7);
                        boolean var105 = (var61 >> 4 & 1) != 0;
                        if (var82 != var46.a) {
                           if (!var105 && var82 == 1 && var46.a != 2) {
                              this.a.a(var46.d == 1 ? 8 : 4, false);
                              aa var106 = var46.a;
                              as var14 = var46.a.a.a;
                              this.a.a(var14.a >> 10, var14.b >> 10, 30, 30);
                           }

                           if (var82 != 1 || var46.a != 2) {
                              var46.a(var82);
                           }
                        }

                        var46.a = (var61 >> 3 & 1) != 0;
                        if ((var61 >> 4 & 1) != 0) {
                           var46.a = 0;
                        }

                        boolean var15;
                        if ((var15 = (var61 >> 5 & 1) != 0) && !var46.b && this.a.g > 0 && y.a(this.a.d, var46.a.a())) {
                           aa var107 = var46.a;
                           this.a.a(var46.a.a.a.a >> 10, this.a(var46.a.a()) << 5, 2);
                        }

                        var46.b = var15;
                        var46.b = (byte)(var61 >> 6 & 31);
                        var46.c = (byte)(var61 >> 11);
                        var46.c = true;
                     }

                     var3 = this.a.length;

                     for (int var33 = 0; var33 < var3; var33++) {
                        if (this.a[var33].c) {
                           this.a[var33].c = false;
                        } else if (this.a[var33].a != 2) {
                           int[] var47;
                           (var47 = this.a[var33].a.a())[0] = var47[1] = var47[2] = var47[3] = Integer.MIN_VALUE;
                           if (this.a[var33].b != null) {
                              (var47 = this.a[var33].b.a())[0] = var47[1] = var47[2] = var47[3] = Integer.MIN_VALUE;
                           }
                        }
                     }

                     while ((var32 = var2.readByte()) != -1) {
                        k var49;
                        (var49 = this.a[var32]).a.a.a = var2.readShort() << 10;
                        var49.a.a.b = var2.readShort() << 10;
                        var49.b = true;
                     }

                     var3 = this.a.length;

                     for (int var35 = 0; var35 < var3; var35++) {
                        if (this.a[var35].b) {
                           this.a[var35].b = false;
                        } else {
                           this.a[var35].a.a.b(1073741823, 1073741823);
                        }
                     }

                     while ((var32 = var2.readByte()) != -1) {
                        byte var50;
                        boolean var62 = ((var50 = var2.readByte()) & 1) != 0;
                        this.a[var32].a.a = (var50 & 2) != 0;
                        bb var108;
                        if (var62 && !this.a[var32].b && y.a(this.a.d, (var108 = this.a[var32]).a)) {
                           this.a.a(5, false);
                        }

                        if (var62 && !this.a[var32].b) {
                           this.a[var32].b();
                        } else if (!var62 && this.a[var32].b) {
                           this.a[var32].a();
                        }
                     }

                     while ((var32 = var2.readByte()) != -1) {
                        ap var51;
                        int var63 = (var51 = this.a[var32]).a.a.length;

                        for (int var83 = 0; var83 < var63; var83++) {
                           s var109;
                           (var109 = var51.a.a[var83]).b.a = var109.a.a = var2.readShort() << 10;
                           var109.b.b = var109.a.b = var2.readShort() << 10;
                        }

                        if (var51.a.c != null) {
                           var63 = var51.a.c.length;

                           for (int var84 = 0; var84 < var63; var84++) {
                              s var110;
                              (var110 = var51.a.c[var84]).b.a = var110.a.a = var2.readShort() << 10;
                              var110.b.b = var110.a.b = var2.readShort() << 10;
                           }
                        }

                        if (var51.a.c != null) {
                           var63 = var51.a.c.length;

                           for (int var85 = 0; var85 < var63; var85++) {
                              t var111 = var51.a.c[var85];
                              short var16;
                              if ((var16 = var2.readShort()) == 32767) {
                                 var51.a.c[var85] = null;
                              } else if (var16 != -32768) {
                                 var111.a.a = var16 << 10;
                                 var111.a.b = var2.readShort() << 10;
                              }
                           }
                        }

                        byte var86;
                        byte var112 = (byte)((var86 = var2.readByte()) & 3);
                        if (var51.a != var112) {
                           if (var112 == 2 && var51.a != 2) {
                              var51.b();
                           }

                           if (var112 != 1 || var51.a != 2) {
                              var51.a = var112;
                           }
                        }

                        boolean var17 = (var86 >> 2 & 1) != 0;
                        var51.a.d();
                        am var113 = var51.a;
                        var51.a.a = true;
                        if (var17 && !var51.b && this.a.g > 0 && y.a(this.a.d, var51.a.a())) {
                           this.a.a(var51.a.a().a >> 10, this.a(var51.a.a()) << 5, 2);
                        }

                        var51.b = var17;
                        var51.a = true;
                     }

                     var3 = this.a.length;

                     for (int var38 = 0; var38 < var3; var38++) {
                        if (this.a[var38].a) {
                           this.a[var38].a = false;
                        } else {
                           int[] var52;
                           (var52 = this.a[var38].a.a())[0] = var52[1] = var52[2] = var52[3] = Integer.MIN_VALUE;
                        }
                     }

                     byte var24 = var2.readByte();

                     for (int var39 = 0; var39 < var24; var39++) {
                        byte var53;
                        switch ((var53 = var2.readByte()) >> 1) {
                           case 0:
                              int var68 = var2.readByte() & 255;
                              int var89 = var2.readByte() & 255;
                              if ((var53 & 1) != 0) {
                                 this.a.a(2, false);
                                 this.a.a((var68 << 5) + 16, (var89 << 5) + 16, 4);
                              }

                              this.a[1][var68][var89] = -1;
                              this.a.a((var68 << 5) + 16, (var89 << 5) + 16, 10, 10);
                              break;
                           case 1:
                              int var67 = var2.readByte() & 255;
                              int var88 = var2.readByte() & 255;
                              if ((var53 & 1) != 0) {
                                 this.a.a(1, false);
                                 this.a.a((var67 << 5) + 16, (var88 << 5) + 16, 5);
                              }

                              this.a[1][var67][var88] = -1;
                              break;
                           case 2:
                              if ((var53 & 1) != 0) {
                                 this.a.a(9, false);
                              }

                              this.a[var2.readByte() & 0xFF] = null;
                              break;
                           case 3:
                              int var66 = var2.readByte() & 255;
                              int var87 = var2.readByte() & 255;
                              if ((var53 & 1) != 0) {
                                 this.a.a(6, false);
                                 int var114 = (var66 << 5) + 16;
                                 int var18 = (var87 << 5) + 16;
                                 this.a.a(var114, var18, 1);
                                 this.a.b(var114, var18, 16, 0);
                              }

                              this.a[1][var66][var87] = -1;
                              break;
                           case 4:
                              this.a[this.f].b = this.a[this.f].c;
                           case 5:
                              this.a.a(0, false);
                              break;
                           case 6:
                              if ((var53 & 1) != 0) {
                                 this.a.a(11, false);
                              } else {
                                 this.a.a(10, false);
                              }
                              break;
                           case 7:
                              this.a.c(var2.readByte() & 255);
                        }
                     }

                     return;
                  } catch (IOException var10) {
                     this.f();
                  }
               }

               return;
            }
         } catch (Exception var11) {
         }
      }
   }

   public final void c() {
      try {
         switch (this.c) {
            case 0:
               this.a.h();
               if (this.a.d > 10) {
                  Main.d = true;
               }
               break;
            case 6:
               this.a.i();
         }
      } catch (Exception var7) {
      }

      try {
         if (this.a == 0 && this.d != this.c) {
            this.c = this.d;
            switch (this.d) {
               case 2:
                  this.a(this.b, this.e);
                  return;
               case 3:
               case 6:
               case 7:
               default:
                  break;
               case 4:
                  if (this.e != 0 && this.e != 2) {
                     return;
                  }

                  int var10;
                  if ((var10 = d.a(this.b)) != -1) {
                     this.a(this.e == 0 ? "save" : "msave", var10);
                  }

                  return;
               case 5:
                  if (this.b == 93) {
                     this.b = d.a[0];
                     this.a("save", this.b);
                     this.a((byte)1, (byte)0);
                  } else {
                     if (this.e == 0 || this.e == 2) {
                        ar var1 = this;

                        try {
                           var1.a.a("achi");
                           int var2 = var1.a.a.readInt();
                           int var3 = var1.a.a.readInt();
                           var1.a.i = var1.a.a.readInt();
                           byte[] var4 = new byte[200];
                           int var5 = var1.a.a.read(var4);
                           var1.a.a(false);
                           boolean var6 = false;
                           if (var1.e == 0 && d.a(d.a, var1.b) + 1 > var2) {
                              var2 = d.a(d.a, var1.b) + 1;
                              var6 = true;
                           } else if (var1.e == 2 && d.a(d.d, var1.b) + 1 > var3) {
                              var3 = d.a(d.d, var1.b) + 1;
                              var6 = true;
                           }

                           if (var6) {
                              var1.a.b("achi");
                              var1.a.a.writeInt(var2);
                              var1.a.a.writeInt(var3);
                              var1.a.a.writeInt(var1.a.i);
                              var1.a.a.write(var4, 0, var5);
                              var1.a.a(true);
                           }
                        } catch (Exception var8) {
                        }
                     }

                     this.a.d = 0;
                  }

                  return;
               case 8:
                  this.d();
                  if (this.e == 0 || this.e == 2) {
                     if (this.e == 0 && this.b == d.a[d.a.length - 1] || this.e == 2 && this.b == d.d[d.d.length - 1]) {
                        if (this.b == 2) {
                           this.a.a = 1;
                           this.a.a.a((byte)26);
                           return;
                        } else {
                           if (this.b == 4) {
                              this.a.a.a((byte)9);
                              this.a.a = 1;
                              this.a.m();
                              this.a.a.c(false);
                           } else {
                              this.a.a = 1;
                              this.a.a.a((byte)26);
                           }

                           return;
                        }
                     }

                     this.b = d.a(this.b);
                     this.d = 2;
                     return;
                  }

                  if (this.b == 1) {
                     this.a.a = 1;
                     this.a.a.a((byte)4);
                     this.a.a.a = d.a(d.a, this.b) - 1;
                     this.a.a.a(ad.b(1));
                     return;
                  }

                  if (this.e == 4 || this.e == 5) {
                     if (this.e[0] != 5 && this.e[1] != 5) {
                        this.d = 2;
                        return;
                     }

                     if (this.b == 2) {
                        this.a.a = 1;
                        this.a.a.a((byte)17);
                     } else {
                        this.a.a = 1;
                        this.a.a.a((byte)9);
                        this.a.a.c(false);
                     }

                     return;
                  }

                  if (this.b == 4) {
                     this.a.a = 1;
                     this.a.a.a((byte)9);
                     this.a.a.c(false);
                     return;
                  }

                  if (this.b == 2) {
                     this.a.a = 1;
                     if (d.a(d.d, this.b) != -1) {
                        this.a.a.a((byte)20);
                        this.a.a.a = d.a(d.d, this.b) - 1;
                        this.a.a.a(ad.b(1));
                     } else {
                        this.a.a.a((byte)47);
                        this.a.a.a = d.a(d.c, this.b) - 1;
                        this.a.a.a(ad.b(1));
                     }

                     if (this.a.a.a == -1) {
                        this.a.a.a = 0;
                     }
                  }
            }
         }
      } catch (Exception var9) {
      }
   }

   private void a(String var1, int var2) {
      try {
         this.a.b(var1);
         this.a.a.writeInt(var2);
         this.a.a.writeInt(this.h);
         this.a.a.writeInt(this.i);
         this.a.a.writeInt(this.j);
      } catch (Exception var3) {
      }

      this.a.a(true);
   }

   public final void d() {
      this.a.f();
      this.a = null;
      this.d = null;
      this.c = null;
      this.f = null;
      this.e = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      if (this.a != null) {
         ab var1 = this.a;
         this.a.b = false;
         if (var1.a != null) {
            for (int var2 = 0; var2 < var1.a; var2++) {
               var1.a[var2] = null;
            }

            var1.a = null;
            var1.a = 0;
         }

         if (var1.a != null) {
            for (int var3 = 0; var3 < var1.b; var3++) {
               var1.a[var3] = null;
            }

            var1.a = null;
            var1.b = 0;
         }

         if (var1.a != null) {
            for (int var4 = 0; var4 < var1.c; var4++) {
               var1.a[var4] = null;
            }

            var1.a = null;
            var1.c = 0;
         }

         var1.b = null;
         var1.a = null;
         var1.a = null;
         var1.b = null;
         var1.a = null;
         var1.b = null;
         var1.c = null;
         var1.a = null;
         var1.b = null;
         var1.a = null;
         var1.a = null;
      }

      if (this.a != null) {
         this.a.removeAllElements();
      }

      this.a = null;
      System.gc();
   }

   public final void a(aa var1, int var2, int var3) {
      if (this.d[var2] && this.c[var3]) {
         int var4 = this.a.length;

         for (int var5 = 0; var5 < var4; var5++) {
            bb var6;
            if ((var6 = this.a[var5]).a == var2 && var6.b == var3 && var1.a.a.b < var3 << 15) {
               if (!var6.b && y.a(this.a.d, var6.a)) {
                  this.a.a(5, false);
               }

               var6.a = true;
            }
         }
      }

      byte var8;
      ai var9;
      if ((var1.d == 2 || var1.d == 5) && ((var8 = this.a[1][var2][var3]) == 7 || var8 == 10 || var8 == 11 || var8 == 12) && !(var9 = (ai)var1.a).a()) {
         var9.b();

         for (int var10 = 0; var10 < this.a.length; var10++) {
            this.e[var10] = this.e[var10] + 30;
         }

         as var11 = var1.a.a;
         this.a.a(var11.a >> 10, var11.b >> 10, 30, 30);
      }
   }

   public final void a(am var1, int var2, int var3) {
      if (this.d[var2] && this.c[var3]) {
         int var4 = this.a.length;

         for (int var5 = 0; var5 < var4; var5++) {
            bb var6;
            if ((var6 = this.a[var5]).a == var2 && var6.b == var3) {
               boolean var7 = false;

               for (int var8 = 0; var8 < var1.a.length; var8++) {
                  as var9 = var1.a[var8].a;
                  if (var1.a[var8].a.a >= var2 << 15 && var9.a <= var2 + 1 << 15 && var9.b < (var3 << 15) + 4096) {
                     var7 = true;
                     break;
                  }
               }

               if (var7) {
                  if (!var6.b && y.a(this.a.d, var6.a)) {
                     this.a.a(5, false);
                  }

                  var6.a = true;
               }
            }
         }
      }

      if (var1.j == 1) {
         q var13 = (q)var1.a;
         int var14 = this.a[1][var2][var3];
         long var17;
         if (a[var14] && ((var17 = var13.a.c().a()) > 31457280L || var13.e > 0 && var17 > 0L)) {
            if (y.a(this.a.d, var13.a.a())) {
               this.a.a(6, false);
               int var28 = (var2 << 5) + 16;
               int var10 = (var3 << 5) + 16;
               this.a.a(var28, var10, 1);
               this.a.b(var28, var10, 16, 0);
            }

            if (this.b == 2) {
               this.a.addElement(new byte[]{(byte)(6 | (y.a(this.d, var13.a.a()) ? 1 : 0)), (byte)var2, (byte)var3});
            }

            int var29 = (var2 << 15) - 2048;
            int var11 = (var3 << 15) - 2048;
            var14 = (var2 + 1 << 15) + 2048;
            int var19 = (var3 + 1 << 15) + 2048;

            for (int var22 = 0; var22 < var13.a.g; var22++) {
               t var25;
               if ((var25 = var13.a.b[var22]).a != null && var25.a.a >= var29 && var25.a.a <= var14 && var25.a.b >= var11 && var25.a.b <= var19) {
                  var25.a();
               }
            }

            this.a[1][var2][var3] = -1;
            this.a[var2][var3] = -1;
            var29 = var2 - 1;
            int var12 = var3 - 1;
            var14 = var2 + 1;
            int var20 = var3 + 1;

            for (int var23 = var29; var23 <= var14; var23++) {
               for (int var26 = var12; var26 <= var20; var26++) {
                  if (var29 >= 0 && var12 >= 0 && var14 < this.d && var20 < this.e) {
                     this.a.a(var23, var26);
                  }
               }
            }

            return;
         }

         if (var14 == 7 || var14 == 10 || var14 == 11 || var14 == 12) {
            var13.b(1024);
         }

         if (var13.e == 0 && var13.c == 2 && g[var14]) {
            as var18;
            int var21 = (var18 = var13.a.a()).a >> 15;
            int var24 = var18.b >> 15;
            short var27 = a[this.a[var2][var3]];
            if (!var13.f && var13.h == 0 && var21 < var2 && (var27 & 2) != 0) {
               var13.j |= 2;
            }

            if ((var13.d || var13.i < 0) && (var13.j & 6) != 0 && var24 <= var3 && (var27 & 48) != 0) {
               var13.j |= var27 & 48;
            }

            if (!var13.g && var13.h == 0 && var21 > var2 && (var27 & 4) != 0) {
               var13.j |= 4;
            }

            if (!var13.e && !var13.d && var13.i == 0 && var24 > var3 && (var27 & 8) != 0) {
               var13.j |= 8;
            }

            if (!var13.e && !var13.d && var13.i == 0 && var24 >= var3 && (var27 & 192) != 0) {
               var13.j |= 192;
            }
         }
      }
   }

   public final void a(am var1) {
      int var2 = this.a.length;

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.a[var3].a.equals(var1)) {
            this.a[var3].b();
         }
      }
   }

   public static void a(am var0, am var1) {
      if (var0.j == 1) {
         ((q)var0.a).a(var1);
      }

      if (var1.j == 1) {
         ((q)var1.a).a(var0);
      }

      if (var0.j == 1 && var1.j == 4) {
         ((q)var0.a).b = true;
      } else {
         if (var1.j == 1 && var0.j == 4) {
            ((q)var1.a).b = true;
         }
      }
   }

   public final void a(am var1, aa var2) {
      if (var1.j == 1 && var2.d == 2) {
         ((q)var1.a).a((ai)var2.a);
      } else if (var1.j == 3 && var2.d == 2) {
         ap var12 = (ap)var1.a;
         ai var8 = (ai)var2.a;
         ap var6 = var12;
         if (var12.a.b != 93 && !var8.a() && (var8.d != 2 || var6.b == 4) && var8.d != 5 && var6.a.c().a() > 10485760L) {
            for (int var9 = 0; var9 < var6.a.a.length; var9++) {
               var6.a.e[var9] = var6.a.e[var9] + 30;
            }

            aa var10 = var8.a;
            as var11 = var8.a.a.a;
            var6.a.a.a(var11.a >> 10, var11.b >> 10, 30, 30);
            var8.b();
         }
      } else if (this.b == 93 && var1.j == 3 && var2.d == 5 && this.a.c <= 1) {
         this.a.c++;
         this.a.c(10);
      } else {
         if (this.e != 4 && this.e != 5 && var1.j == 1 && (((q)var1.a).a != 1 || ((q)var1.a).e == 0) && var2.d == 6) {
            this.a.b(var2.c);
            var2.a.b |= 16;
            q var7;
            (var7 = (q)var2.a).g--;
            if (var7.g == 0) {
               var7.a = null;
               as var4;
               int var3 = (var4 = ((q)var1.a).a.a()).a >> 15;
               int var5 = var4.b >> 15;
               if (this.a.a(var3, var5 - 1) != 0) {
                  var7.a(var3 << 5, var5 - 1 << 5);
               } else if (this.a.a(var3 - 1, var5) != 0) {
                  var7.a(var3 - 1 << 5, var5 << 5);
               } else if (this.a.a(var3 + 1, var5) != 0) {
                  var7.a(var3 + 1 << 5, var5 << 5);
               } else {
                  var7.a(var3 << 5, var5 + 1 << 5);
               }

               var7.d >>= 2;
               var7.d = 2;
            }
         }
      }
   }
}
