package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ad extends Canvas implements av {
   private Main a;
   private d a;
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public Image[] a;
   public int e;
   private Image[] b;
   private int k = -1;
   private Image[] c;
   private int[] a;
   private boolean[] a;
   private int l;
   public boolean a = false;
   private int m;
   private int n;
   public boolean b = true;
   public boolean c = false;
   public byte[][] a;
   private int o;
   public int f;
   private int p;
   private byte a;
   private long a;
   public int g;
   private int q;
   private int r;
   private int s;
   private static char[][] a = new char[][]{
      {' '},
      {'-', '_'},
      {'0'},
      {'1', '@', '-', '_', '*', '#', '+'},
      {'a', 'b', 'c', '2'},
      {'d', 'e', 'f', '3'},
      {'g', 'h', 'i', '4'},
      {'j', 'k', 'l', '5'},
      {'m', 'n', 'o', '6'},
      {'p', 'q', 'r', 's', '7'},
      {'t', 'u', 'v', '8'},
      {'w', 'x', 'y', 'z', '9'}
   };
   private short a;
   public StringBuffer a;
   private long b;
   private int t;
   public int h;
   private int u;
   public boolean d;
   public boolean e;
   public int i;
   public int j;
   private byte[] a = null;
   private InputStream a;
   public boolean f = false;

   public ad(Main var1) {
      this.a = var1;
      this.a = this.a.a;
      this.setFullScreenMode(true);
      this.b();
   }

   public final void a() {
      this.m = 0;
      this.a("/images.img");
      this.a = new Image[4];

      for (int var1 = 0; var1 < 3; var1++) {
         this.a[var1] = this.a();
      }

      this.b = new Image[4];

      for (int var2 = 0; var2 < this.b.length; var2++) {
         this.b[var2] = this.a();
      }

      this.n = (a - (this.b[1].getWidth() << 1)) * 9 / 10;
   }

   public final void b() {
      a = this.getWidth();
      b = this.getHeight();
      c = a >> 1;
      d = b >> 1;
   }

   public final Image a(int var1) {
      return this.c[this.a[var1]];
   }

   public final void c() {
      try {
         int var1 = 0;
         this.a = new int[1024];
         short var2 = 0;
         short var3 = 0;

         for (int var11 = 0; var11 < 1024; var11++) {
            this.a[var11] = -1;
         }

         DataInputStream var4 = null;

         try {
            var2 = (var4 = new DataInputStream(Main.a("/images.map"))).readShort();
            var1 = 0;

            while (var1 < var2) {
               short var5 = var4.readShort();
               this.a[var5] = var1++;
            }
         } catch (Exception var9) {
         }

         try {
            var4.close();
         } catch (Exception var7) {
         }

         try {
            var3 = (var4 = new DataInputStream(Main.a("/images2.map"))).readShort();

            for (int var13 = 0; var13 < var3; var13++) {
               short var15 = var4.readShort();
               this.a[var15 + 256] = var2 + var13;
            }
         } catch (Exception var8) {
         }

         try {
            var4.close();
         } catch (Exception var6) {
         }

         this.c = new Image[var2 + var3];

         for (int var14 = 7; var14 < var2; var14++) {
            this.c[var14] = this.a();
            this.b(1);
         }

         this.n();
         this.l = var2;
         this.a = new boolean[var3];
      } catch (Exception var10) {
      }
   }

   public final void d() {
      try {
         for (int var1 = 0; var1 < this.a.length; var1++) {
            if (!this.a[var1]) {
               this.c[var1 + this.l] = null;
            }
         }

         System.gc();
         boolean var9 = false;
         int var2 = -1;

         for (int var3 = 0; var3 < this.a.length; var3++) {
            if (this.a[var3] && this.c[var3 + this.l] == null) {
               if (var3 + this.l == this.a[ac.a[2] + 6]) {
                  this.c[var3 + this.l] = Image.createImage("/img_tiles/fg/6_alpha.png");
               } else if (var3 + this.l == this.a[ac.a[2] + 7]) {
                  this.c[var3 + this.l] = Image.createImage("/img_tiles/fg/7_alpha.png");
               } else if (var3 + this.l == this.a[ac.a[2] + 36]) {
                  this.c[var3 + this.l] = Image.createImage("/img_tiles/fg/36_alpha.png");
               } else if (var3 + this.l == this.a[471]) {
                  this.c[var3 + this.l] = Image.createImage("/img_gish/dark_corner_alpha.png");
                  this.a.a.a.a();
               } else {
                  if (!var9) {
                     this.a("/images2.img");
                     var9 = true;
                  }

                  while (var2 < var3 - 1) {
                     ad var4 = this;
                     int var5 = 256 * var4.a.read() + var4.a.read();
                     int var6 = var4.a.read() * 3;

                     for (int var7 = 0; var7 < 10; var7++) {
                        var4.a.read();
                     }

                     for (int var10 = 0; var10 < var6 + 4; var10++) {
                        var4.a.read();
                     }

                     for (int var11 = 0; var11 < var5 + 4; var11++) {
                        var4.a.read();
                     }

                     var2++;
                  }

                  this.c[var3 + this.l] = this.a();
                  var2 = var3;
               }
            }
         }

         if (var9) {
            this.n();
         }
      } catch (Exception var8) {
      }
   }

   public final void a(int var1) {
      if (var1 >= 256) {
         if (var1 == ac.a[0] + 8 || var1 == ac.a[0] + 9) {
            for (int var7 = 0; var7 < 2; var7++) {
               this.a[this.a[ac.a[0] + 8 + var7] - this.l] = true;
            }
         } else if (var1 == ac.a[0] + 30) {
            for (int var6 = 0; var6 < 4; var6++) {
               this.a[this.a[var6 + 272] - this.l] = true;
            }
         } else if (var1 == ac.a[0] + 36) {
            for (int var5 = 0; var5 < 4; var5++) {
               this.a[this.a[var5 + 564] - this.l] = true;
            }
         } else if (var1 == ac.a[2] + 7) {
            this.a[this.a[var1] - this.l] = true;

            for (int var4 = 0; var4 < 4; var4++) {
               this.a[this.a[var4 + 464] - this.l] = true;
            }
         } else if (var1 != ac.a[2] + 37) {
            if ((var1 = this.a[var1] - this.l) >= 0) {
               this.a[var1] = true;
            }
         } else {
            for (int var2 = 0; var2 < 4; var2++) {
               this.a[this.a[var2 + 460] - this.l] = true;
            }
         }
      }
   }

   public final void e() {
      for (int var1 = 0; var1 < this.a.length; var1++) {
         this.a[var1] = false;
      }
   }

   public final void f() {
      byte[][][] var1;
      int var2 = (var1 = ac.a[this.a.a.a.j])[0].length;
      int var3 = var1[0][0].length;

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < var2; var5++) {
            for (int var6 = 0; var6 < var3; var6++) {
               this.a(ac.a[var4] + var1[var4][var5][var6]);
            }
         }
      }
   }

   public final Image[] a(int var1, int var2, boolean var3) {
      Image[] var6;
      if (var3) {
         var6 = new Image[var2 << 1];

         for (int var5 = 0; var5 < var2; var5++) {
            Image var4 = this.a(var1 + var5);
            var6[var5 << 1] = var4;
            var6[(var5 << 1) + 1] = Image.createImage(var4, 0, 0, var4.getWidth(), var4.getHeight(), 2);
         }
      } else {
         var6 = new Image[var2];

         for (int var7 = 0; var7 < var2; var7++) {
            var6[var7] = this.a(var1 + var7);
         }
      }

      return var6;
   }

   public static void a(Graphics var0, Image[] var1, int var2, int var3, int var4, boolean var5, boolean var6, int var7) {
      if (var6) {
         var0.drawImage(var1[(var4 << 1) + (var5 ? 1 : 0)], var2, var3, var7);
      } else {
         Image var8 = var1[var4];
         var0.drawRegion(var8, 0, 0, var8.getWidth(), var8.getHeight(), var5 ? 2 : 0, var2, var3, var7);
      }
   }

   public final Image[] a(int var1) {
      Image[] var6 = new Image[16];

      for (int var2 = 0; var2 < var6.length; var2++) {
         if (var2 < 4) {
            var6[var2] = this.a(var2 + 145);
         } else {
            Image var3;
            int var4 = (var3 = this.a(145 + (var2 & 3))).getWidth();
            int var5 = var3.getHeight();
            var6[var2] = Image.createImage(var3, 0, 0, var4, var5, var2 < 8 ? 5 : (var2 < 12 ? 3 : 6));
         }
      }

      return var6;
   }

   public static void a(Graphics var0, Image[] var1, int var2, int var3, int var4) {
      var4 = (y.a(var4 + 205887) << 4) / 6588397;
      var0.drawImage(var1[var4], var2, var3, 3);
   }

   public final Image[] a(int var1, boolean var2) {
      Image[] var7 = new Image[32];

      for (int var3 = 0; var3 < var7.length; var3++) {
         if (var3 < 8) {
            var7[var3] = this.a(var1 + var3);
         } else {
            Image var4;
            int var5 = (var4 = this.a(var1 + (var3 & 7))).getWidth();
            int var6 = var4.getHeight();
            var7[var3] = Image.createImage(var4, 0, 0, var5, var6, var3 < 16 ? 5 : (var3 < 24 ? 3 : 6));
         }
      }

      return var7;
   }

   public static void a(Graphics var0, Image[] var1, as var2, int var3) {
      var3 = (y.a(var3 + 102943) << 5) / 6588397;
      if (var1.length <= 8 && var3 >= 8) {
         Image var4 = var1[var3 & 7];
         var3 = var3 < 16 ? 5 : (var3 < 24 ? 3 : 6);
         var0.drawRegion(var4, 0, 0, var4.getWidth(), var4.getHeight(), var3, var2.a, var2.b, 3);
      } else {
         var0.drawImage(var1[var3], var2.a, var2.b, 3);
      }
   }

   public final Image b(int var1) {
      Graphics var2;
      Image var3;
      (var2 = (var3 = Image.createImage(this.a.d(54) + 1, d.c(0) + 1)).getGraphics()).setColor(-13684945);
      var2.fillRect(0, 0, var3.getWidth(), var3.getHeight());
      this.a.a(var2, 54, 1, 0, 0);
      return var3;
   }

   public final void g() {
      this.b(1);
   }

   public final void b(int var1) {
      this.m += var1;
      if (this.k * this.n / 196 != this.m * this.n / 196) {
         this.m();
      }
   }

   public final void h() {
      this.m = 196;
      this.m();

      for (int var1 = 0; var1 < this.b.length; var1++) {
         this.b[var1] = null;
      }

      this.b = null;
   }

   protected final void paint(Graphics var1) {
      if (!this.f) {
         this.setFullScreenMode(true);
         this.b();
         var1.setClip(0, 0, a, b);
         if (this.a) {
            var1.setColor(0);
            var1.fillRect(0, 0, a, b);
            this.a.a(var1, 0, c, d, 3);
            this.c = false;
         } else {
            switch (this.a.a) {
               case 0:
                  this.a.a.a.a(var1);
                  break;
               case 1:
                  this.a.a.b(var1);
                  break;
               case 2:
                  int[] var6 = new int[]{1912910, 16777215, 2056, 0};
                  int var7 = this.e >= this.a.length ? this.a.length - 1 : this.e;
                  var1.setColor(var6[var7]);
                  var1.fillRect(0, 0, a, b);
                  if (this.a[var7] != null) {
                     var1.drawImage(this.a[var7], c, d, 3);
                  }
                  break;
               case 3:
                  if (this.b == null) {
                     return;
                  }

                  if (this.b) {
                     var1.setColor(0);
                     var1.fillRect(0, 0, a, b);
                  }

                  int var2;
                  int var3 = (var2 = c - (this.n >> 1)) + this.m * this.n / 196;
                  if (!this.b) {
                     for (int var5 = var2 + this.k * this.n / 196; var5 < var3; var5++) {
                        var1.drawImage(this.b[0], var5, d, 6);
                     }
                  } else {
                     var1.drawImage(this.b[1], var2, d, 10);
                     int var4 = var2 + this.n;

                     while (var2 < var3) {
                        var1.drawImage(this.b[0], var2, d, 6);
                        var2++;
                     }

                     while (var2 < var4) {
                        var1.drawImage(this.b[2], var2, d, 6);
                        var2++;
                     }

                     var1.drawImage(this.b[3], var2, d, 6);
                  }

                  if (this.m == 196) {
                     a(var1, this.b, c - (this.n >> 1) + this.n + (this.b[1].getWidth() >> 1), d, 1, true, false, 3);
                  }

                  this.k = this.m;
                  this.b = false;
            }

            this.c = false;
         }
      }
   }

   public final void a(short var1, String var2, int var3) {
      this.a = 58;
      this.u = -1;
      this.a = new StringBuffer(var2);
      this.h = 11;
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a.a(var1, this.a, var2, var3, 0);
      var1.setColor(var4);
      var3 += 1 + d.c(this.a.a(this.a));
      var1.fillRect(var2, var3, this.h * d.a(0, d.a(0, 'm')), d.c(0));
      this.a.a(var1, 0, this.a.toString(), var2 + 1, var3 - 1, 0);
   }

   public final void c(int var1) {
      if (var1 != 35 && var1 != -8) {
         if (this.a.length() < this.h && (var1 == 35 || var1 == 42 || var1 >= 48 && var1 <= 57)) {
            int var2 = var1 - 46;
            if (var1 == 42) {
               var2 += 5;
            } else if (var1 == 35) {
               var2 += 11;
            }

            if (this.u != var2 || System.currentTimeMillis() - this.b > 500L) {
               this.a.append(a[var2][0]);
               this.t = 1;
            } else if (this.t < a[var2].length) {
               this.a.setCharAt(this.a.length() - 1, a[var2][this.t]);
               this.t++;
            }

            this.u = var2;
            this.b = System.currentTimeMillis();
         }
      } else {
         if (this.a.length() > 0) {
            this.a.deleteCharAt(this.a.length() - 1);
         }

         this.u = -1;
      }
   }

   public final void a(byte[][] var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.p = 3;
      this.f = 0;
      var2 = d.c(3) + 1;
      this.o = var5 / var2;
      if (this.o > var1.length) {
         this.o = var1.length;
      }

      this.q = 0;

      for (int var7 = 0; var7 < var1.length; var7++) {
         var5 = d.a(3, var1[var7]);
         if (this.q < var5) {
            this.q = var5;
         }
      }

      this.a = 0;
      this.g = this.o * var2;
      this.r = 3;
      this.s = var4;
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      byte[][] var6 = this.a;
      int var7 = this.f + Math.min(var6.length, this.o);
      int var12;
      var4 = var12 = var3 + ((var4 >> 1) - ((var7 - this.f) * (1 + d.c(this.p)) >> 1));

      for (int var8 = this.f; var8 < var7; var4 += 1 + d.c(this.p)) {
         if (var6[var8].length > 0) {
            if (var6[var8][0] == -3) {
               var1.setColor(this.s);
               var1.fillRect(var2, var4 - 1, d.a(this.r, var6[var8]) + 1, d.c(this.r) + 2);
               this.a.a(var1, this.r, var6[var8], var2 + 1, var4, 20);
               var4++;
            } else {
               this.a.a(var1, this.p, var6[var8], var2, var4, 20);
            }
         }

         var8++;
      }

      if (var6.length > this.o) {
         int var17 = var5;
         var4 = var12;
         var2 = this.g;
         var17++;
         var4++;
         var2 -= 2;
         var1.setColor(255, 255, 255);
         var4 += var2 * this.f / (var6.length - 1);
         var2 = 2 + var2 * (this.o - 1) / (var6.length - 1);
         var1.fillRect(--var17, var4, 4, var2);
      }
   }

   public final void i() {
      if (this.a != 0) {
         if (System.currentTimeMillis() - this.a > 100L) {
            if (this.a == 1) {
               if (this.f + this.o < this.a.length) {
                  this.f++;
                  this.repaint();
               }
            } else if (this.f > 0) {
               this.f--;
               this.repaint();
            }

            this.a = System.currentTimeMillis();
         }
      }
   }

   public final void j() {
      this.a = -1;
      this.a = 0L;
      this.i();
   }

   public final void k() {
      this.a = 1;
      this.a = 0L;
      this.i();
   }

   public final void l() {
      this.a = 0;
   }

   public static boolean a(int var0) {
      return var0 == -7 || var0 > 20 && var0 == 7;
   }

   public static boolean b(int var0) {
      return var0 == -5;
   }

   public static boolean c(int var0) {
      return var0 == -6 || var0 > 20 && var0 == 6;
   }

   public final int a(int var1) {
      switch (var1) {
         case -5:
         case 53:
            if (this.a.a == 0 && this.a.a.c == 0) {
               return 9;
            }

            return 8;
         case -4:
         case 54:
            return 3;
         case -3:
         case 52:
            return 2;
         case -2:
         case 56:
            return 1;
         case -1:
         case 50:
            return 0;
         case 0:
         case 1:
         case 2:
         case 3:
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
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         default:
            return Integer.MIN_VALUE;
         case 35:
            return 10;
         case 42:
            return 9;
         case 48:
            return 11;
         case 49:
            return 4;
         case 51:
            return 5;
         case 55:
            return 6;
         case 57:
            return 7;
      }
   }

   public static int b(int var0) {
      switch (var0) {
         case 0:
            return 50;
         case 1:
            return 56;
         case 2:
            return 52;
         case 3:
            return 54;
         case 4:
            return 49;
         case 5:
            return 51;
         case 6:
            return 55;
         case 7:
            return 57;
         case 8:
            return 53;
         case 9:
            return 42;
         case 10:
            return 35;
         case 11:
            return 48;
         default:
            return Integer.MIN_VALUE;
      }
   }

   protected final void keyPressed(int var1) {
      if (!this.a) {
         switch (this.a.a) {
            case 0:
               this.a.a.a.a(var1);
               return;
            case 1:
               this.a.a.a(var1);
               return;
            case 2:
               this.e++;
         }
      }
   }

   protected final void keyReleased(int var1) {
      if (!this.a) {
         try {
            switch (this.a.a) {
               case 0:
                  this.a.a.a.b(var1);
                  break;
               case 1:
                  this.a.a.b(var1);
               default:
                  return;
            }
         } catch (Exception var2) {
         }
      }
   }

   public final void a(v var1) {
      if (!this.a) {
         try {
            switch (this.a.a) {
               case 0:
                  this.a.a.a.a(var1);
                  break;
               case 1:
                  this.a.a.a(var1);
               default:
                  return;
            }
         } catch (Exception var2) {
         }
      }
   }

   public final void b(v var1) {
      if (!this.a) {
         try {
            switch (this.a.a) {
               case 0:
                  this.a.a.a.b(var1);
                  break;
               case 1:
                  this.a.a.b(var1);
               default:
                  return;
            }
         } catch (Exception var2) {
         }
      }
   }

   public final void a(o var1) {
      if (!this.a) {
         try {
            switch (this.a.a) {
               case 0:
                  this.a.a.a.a(var1);
            }
         } catch (Exception var2) {
         }
      }
   }

   protected final void pointerPressed(int var1, int var2) {
      try {
         if (this.a) {
            return;
         }

         switch (this.a.a) {
            case 0:
               this.a.a.a.a(var1, var2);
               break;
            case 1:
               this.a.a.a(var1, var2);
               break;
            case 2:
               this.e++;
            default:
               return;
         }
      } catch (Exception var3) {
      }
   }

   protected final void pointerReleased(int var1, int var2) {
      try {
         if (this.a) {
            return;
         }

         this.d = false;
         if (this.e) {
            this.e = false;
            this.a = 0;
            return;
         }

         switch (this.a.a) {
            case 0:
               this.a.a.a.b();
               break;
            case 1:
               this.a.a.b(var1, var2);
            default:
               return;
         }
      } catch (Exception var3) {
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      try {
         if (!this.a) {
            if (this.d) {
               if (this.a.a == 1 && this.a.a.b == 0) {
                  int var6;
                  if ((var6 = this.j + (this.i - var2) / this.a.a.d) != this.a.a.c) {
                     this.e = true;
                  }

                  int var7 = this.a.a.a();
                  if (var6 + this.a.a.b >= var7) {
                     var6 = var7 - this.a.a.b;
                  }

                  if (var6 < 0) {
                     var6 = 0;
                  }

                  this.a.a.c = var6;
                  if (this.a.a.a < this.a.a.c) {
                     this.a.a.a = this.a.a.c;
                  } else if (this.a.a.a >= this.a.a.c + this.a.a.b) {
                     this.a.a.a = this.a.a.c + this.a.a.b - 1;
                  }
               } else if (this.a.a == 1 && this.a.a.b == 1 || this.a.a == 0 && this.a.a.c == 6) {
                  int var3;
                  if ((var3 = this.j + (this.i - var2) / (1 + d.c(this.p))) != this.f) {
                     this.e = true;
                  }

                  int var4 = this.a.length;
                  if (var3 + this.o >= var4) {
                     var3 = var4 - this.o;
                  }

                  if (var3 < 0) {
                     var3 = 0;
                  }

                  if (this.f != var3) {
                     this.f = var3;
                     this.repaint();
                  }
               }

               if (this.e) {
                  return;
               }
            }

            switch (this.a.a) {
               case 0:
                  this.a.a.a.b(var1, var2);
            }
         }
      } catch (Exception var5) {
      }
   }

   protected final void hideNotify() {
      this.a.c();
   }

   protected final void showNotify() {
      this.a.d();
   }

   private void a(String var1) {
      this.a = Main.a(var1);
   }

   private void n() {
      try {
         this.a = null;
         this.a.close();
         this.a = null;
      } catch (Exception var1) {
      }
   }

   private Image a() {
      int var1 = 0;

      try {
         int var2 = 256 * (this.a.read() & 0xFF) + (this.a.read() & 0xFF);
         int var3 = (this.a.read() & 0xFF) * 3;
         int var4 = this.a.read() & 0xFF;
         var1 = var2 + var3 + 69 + var4 * 13;
         if (this.a == null || var1 > this.a.length) {
            this.a = null;
            this.a = new byte[var1];
         }

         this.a[0] = -119;
         this.a[1] = 80;
         this.a[2] = 78;
         this.a[3] = 71;
         this.a[4] = 13;
         this.a[5] = 10;
         this.a[6] = 26;
         this.a[7] = 10;
         this.a[8] = 0;
         this.a[9] = 0;
         this.a[10] = 0;
         this.a[11] = 13;
         this.a[12] = 73;
         this.a[13] = 72;
         this.a[14] = 68;
         this.a[15] = 82;
         this.a[16] = 0;
         this.a[17] = 0;
         this.a[18] = (byte)this.a.read();
         this.a[19] = (byte)this.a.read();
         this.a[20] = 0;
         this.a[21] = 0;
         this.a[22] = (byte)this.a.read();
         this.a[23] = (byte)this.a.read();
         this.a[24] = (byte)this.a.read();
         this.a[25] = 3;
         this.a[26] = 0;
         this.a[27] = 0;
         this.a[28] = 0;
         this.a[29] = (byte)this.a.read();
         this.a[30] = (byte)this.a.read();
         this.a[31] = (byte)this.a.read();
         this.a[32] = (byte)this.a.read();
         this.a[33] = 0;
         this.a[34] = 0;
         this.a[35] = (byte)(var3 >> 8);
         this.a[36] = (byte)var3;
         this.a[37] = 80;
         this.a[38] = 76;
         this.a[39] = 84;
         this.a[40] = 69;

         for (int var5 = 0; var5 < var3 + 4; var5++) {
            this.a[var5 + 41] = (byte)this.a.read();
         }

         int var8 = var3 + 41 + 4;
         if (var4 == 1) {
            this.a[var8++] = 0;
            this.a[var8++] = 0;
            this.a[var8++] = 0;
            this.a[var8++] = 1;
            this.a[var8++] = 116;
            this.a[var8++] = 82;
            this.a[var8++] = 78;
            this.a[var8++] = 83;
            this.a[var8++] = 0;
            this.a[var8++] = 64;
            this.a[var8++] = -26;
            this.a[var8++] = -40;
            this.a[var8++] = 102;
         }

         this.a[var8++] = 0;
         this.a[var8++] = 0;
         this.a[var8++] = (byte)(var2 >> 8);
         this.a[var8++] = (byte)var2;
         this.a[var8++] = 73;
         this.a[var8++] = 68;
         this.a[var8++] = 65;
         this.a[var8++] = 84;

         for (int var7 = 0; var7 < var2 + 4; var7++) {
            this.a[var8++] = (byte)this.a.read();
         }

         this.a[var8++] = 0;
         this.a[var8++] = 0;
         this.a[var8++] = 0;
         this.a[var8++] = 0;
         this.a[var8++] = 73;
         this.a[var8++] = 69;
         this.a[var8++] = 78;
         this.a[var8++] = 68;
         this.a[var8++] = -82;
         this.a[var8++] = 66;
         this.a[var8++] = 96;
         this.a[var8] = -126;
      } catch (Exception var6) {
      }

      return this.a == null ? null : Image.createImage(this.a, 0, var1);
   }

   public final void m() {
      if (this.isShown()) {
         this.c = true;
         this.repaint();

         while (this.c) {
            Thread.yield();

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var1) {
            }
         }
      }
   }

   protected final void sizeChanged(int var1, int var2) {
      new Thread(new f(this, this.a, null)).start();
   }
}
