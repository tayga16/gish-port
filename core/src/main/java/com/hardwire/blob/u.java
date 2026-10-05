package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DataElement;
import javax.bluetooth.ServiceRecord;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class u {
   private Main a;
   private ar a;
   private ad a;
   private d a;
   public byte a;
   public byte b;
   private int i = 10;
   private Vector a;
   private int j;
   public int a;
   private int k;
   private short[] a;
   private short[] b;
   private byte[] a;
   public int b;
   public int c;
   public int d;
   private byte[] b;
   private boolean a;
   private byte[][] a;
   private boolean b;
   private boolean c;
   private boolean d;
   private Image a;
   private Image b;
   private Image c;
   private boolean e;
   private boolean f;
   public int e;
   public int f;
   public int g;
   public int h;
   private int l = 0;
   private String[] a;
   private byte[] c;
   public byte c;
   private boolean g;
   private long a;
   private int m;
   private p a;
   private static short[][] a = new short[][]{
      {11, 24, 62, 9, 7, 27, 2},
      {10, 3, 9, 7, 27, 29},
      {32, 204, 33, 103, 65, 68, 69, 16, 15},
      null,
      {19, 18},
      null,
      {25, 26, 94, 145},
      {205, 25, 26, 94, 145},
      {10, 3, 48, 9, 7, 27, 29},
      {25, 43, 44, 45, 151, 94},
      {205, 25, 43, 44, 45, 151, 94},
      null,
      null,
      null,
      {10, 9, 7, 27, 29},
      null,
      null,
      null,
      null
   };
   private static final short[][][] a = new short[][][]{
      null,
      null,
      {{-1, 0, 10}, {-1, 0, 10}, {5, 6}, {5, 6}, {67, 70, 66}, {67, 70, 66, 71}, {5, 6}, null, null, null},
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
   };

   private void a(byte var1, boolean var2, int var3, int var4) {
      int var5 = var4;
      var4 = var3;
      boolean var9 = (boolean)var2;
      var2 = var1;
      u var6 = this;
      this.b = 0;
      var6.j = var2;
      var6.a = 0;
      var6.b = var9;
      var6.a = false;
      if (a[var6.j] != null) {
         var6.b = new byte[a[var6.j].length];
         var6.d = d.c(var6.a.a(a[var6.j][0]));
      } else {
         var6.d = d.c(0);
      }

      var6.d -= 2;
      var6.c = 0;
      var6.b = var5 / var6.d;
      var6.k = var4;
      var2 = var6.a();
      var6.a = new byte[var2];
      var6.a = new short[var2];
      var6.b = new short[var2];
      switch (this.j) {
         case 2:
            if (!Main.i) {
               this.b[0] = 0;
            } else {
               this.b[0] = (byte)Main.e;
            }

            if (!Main.j) {
               this.b[1] = 0;
            } else {
               this.b[1] = (byte)Main.f;
            }

            this.b[2] = (byte)(this.a.g ? 0 : 1);
            this.b[3] = (byte)(this.a.a.b ? 0 : 1);
            this.b[4] = (byte)this.a.a.g;
            this.b[5] = (byte)this.a.d;
            this.b[6] = (byte)(this.a.a.c ? 0 : 1);
         default:
            this.j();
      }
   }

   private void c(int var1) {
      this.a = true;
      switch (this.j) {
         case 2:
            if (var1 == 0) {
               Main.i = true;
               if ((Main.e = this.b[var1]) > 0) {
                  this.a.c(12);
                  this.a.a(2, false);
               }
            }

            if (var1 == 1) {
               Main.j = true;
               if ((Main.f = this.b[var1]) == 0) {
                  this.a.c(12);
               } else {
                  this.a.b(12);
                  this.a.a(12, true);
               }
            }

            if (var1 == 2 && (this.a.g = this.b[var1] == 0)) {
               this.a.a(70);
            }
      }
   }

   private void g() {
      if (this.a) {
         switch (this.j) {
            case 2:
               Main.e = this.b[0];
               Main.f = this.b[1];
               this.a.g = this.b[2] == 0;
               this.a.a.b = this.b[3] == 0;
               this.a.a.g = this.b[4];
               this.a.d = this.b[5];
               this.a.a.c = this.b[6] == 0;
               this.a.a();
               this.a.a = true;
               this.a.m();
               this.m();
               this.a.a = false;
         }
      }
   }

   private void h() {
      if (!this.a.a(12)) {
         this.a.a(3, false);
      }

      switch (this.a) {
         case 0:
            switch (a[this.j][this.a]) {
               case 2:
                  this.k();
                  this.a((byte)49);
               default:
                  return;
               case 7:
                  this.k();
                  this.a((byte)2);
                  return;
               case 9:
                  this.k();
                  this.a((byte)3);
                  return;
               case 11:
                  this.k();
                  this.a((byte)5);
                  return;
               case 24:
                  this.k();
                  this.a((byte)6);
                  return;
               case 27:
                  this.k();
                  this.a((byte)12);
                  return;
               case 62:
                  this.k();
                  if (Main.a("score")) {
                     this.a((byte)28);
                  } else {
                     this.a((byte)32);
                  }

                  return;
            }
         case 1:
            switch (a[this.j][this.a]) {
               case 3:
                  this.k();
                  if (this.a.e != 4 && this.a.e != 5) {
                     this.a((byte)13);
                  } else {
                     this.a((byte)48);
                  }
                  break;
               case 7:
                  this.k();
                  this.a((byte)18);
                  break;
               case 9:
                  this.k();
                  this.a((byte)15);
                  break;
               case 10:
                  this.i();
                  break;
               case 27:
                  this.k();
                  this.a((byte)19);
                  break;
               case 29:
                  this.k();
                  this.a((byte)14);
               default:
                  return;
               case 48:
                  this.k();
                  this.a((byte)24);
            }
         case 2:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 18:
         case 19:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 38:
         case 46:
         case 48:
         default:
            break;
         case 3:
         case 15:
            switch (a[this.j][this.a]) {
               case 15:
                  this.g();
                  this.a.b = this.a.a;
                  x var21 = this.a.b.a();
                  this.a.b = this.a.a;
                  this.c = this.a;
                  this.k();

                  try {
                     if (var21.a == 0) {
                        ((m)var21).a();
                     }
                  } catch (Exception var10) {
                  }

                  this.e();
                  return;
               case 16:
                  this.g();
                  this.k();
                  this.a((byte)(this.a == 15 ? 43 : 41));
               default:
                  return;
            }
         case 4:
            this.a.b = d.a[this.a];
            this.l();
            this.a.removeAllElements();
            this.a.a((byte)1, (byte)1);
            return;
         case 5:
            switch (a[this.j][this.a]) {
               case 25:
                  this.k();
                  if (!Main.a("save")) {
                     this.a = 16;
                     this.h();
                  } else {
                     this.a((byte)16);
                  }

                  return;
               case 26:
                  this.k();
                  this.a((byte)4);
                  return;
               case 94:
                  this.k();
                  this.a((byte)44);
                  return;
               case 145:
                  this.k();
                  this.a((byte)46);
               default:
                  return;
               case 205:
                  try {
                     this.a.a("save");
                     this.a.b = this.a.a.readInt();
                     this.a.h = this.a.a.readInt();
                     this.a.i = this.a.a.readInt();
                     this.a.j = this.a.a.readInt();
                     this.a.a(false);
                  } catch (Exception var8) {
                  }

                  this.a.a((byte)1, (byte)0);
                  return;
            }
         case 6:
            switch (a[this.j][this.a]) {
               case 18:
                  this.k();
                  this.a((byte)8);
                  at var20 = this.a.a;
                  this.a.a.a();
                  var20.a = 1;
                  var20.b = 1;
                  new Thread(var20).start();
               default:
                  return;
               case 19:
                  this.k();
                  this.a((byte)9);
                  at var19 = this.a.a;
                  this.a.a.a();
                  var19.a = 0;
                  var19.b = 0;
                  new Thread(var19).start();
                  return;
            }
         case 7:
            this.a.a = true;
            this.a.m();
            int var25 = this.a;
            at var18 = this.a.a;
            this.a.a.a = var25;
            var18.b = 2;
            new Thread(var18).start();
            return;
         case 13:
            if (this.a.b == 2 || this.a.b == 4) {
               this.a.a = 1;
            }

            this.l();
            this.a.a = 0;
            this.a.d = 2;
            return;
         case 14:
         case 25:
            if (this.a.b == 2 || this.a.b == 4) {
               this.a.a.b();
            }

            this.a.d();
            this.a((byte)0);
            return;
         case 16:
            this.a.c("save");
            this.a.b = 93;
            this.a.h = 0;
            this.a.i = 0;
            this.a.j = 0;
            this.l();
            this.a.removeAllElements();
            this.a.a((byte)1, (byte)0);
            return;
         case 17:
            switch (a[this.j][this.a]) {
               case 25:
                  this.k();
                  if (!Main.a("msave")) {
                     this.a = 23;
                     this.h();
                  } else {
                     this.a((byte)23);
                  }

                  return;
               case 43:
                  this.k();
                  this.a((byte)20);
                  return;
               case 44:
                  this.k();
                  this.a((byte)21);
                  return;
               case 45:
                  this.k();
                  this.a((byte)22);
                  return;
               case 94:
                  this.k();
                  this.a((byte)45);
               default:
                  return;
               case 151:
                  this.k();
                  this.a((byte)47);
                  return;
               case 205:
                  try {
                     this.a.a("msave");
                     this.a.b = this.a.a.readInt();
                     this.a.h = this.a.a.readInt();
                     this.a.i = this.a.a.readInt();
                     this.a.j = this.a.a.readInt();
                     this.a.a(false);
                  } catch (Exception var9) {
                  }

                  this.b((byte)2);
                  return;
            }
         case 20:
            this.a.b = d.d[this.a];
            this.b((byte)3);
            return;
         case 21:
            this.a.b = d.e[this.a];
            this.b((byte)4);
            return;
         case 22:
            this.a.b = d.f[this.a];
            this.b((byte)5);
            return;
         case 23:
            this.a.c("msave");
            this.a.b = d.d[0];
            this.a.h = 0;
            this.a.i = 0;
            this.a.j = 0;
            this.b((byte)2);
            return;
         case 24:
            this.a((byte)17);
            return;
         case 26:
            if (this.a.a.length() != 0) {
               this.a.a = true;
               this.a.m();
               boolean var17 = false;

               try {
                  String[] var24 = new String[]{"", "", "", ""};
                  int[] var28 = new int[]{0, 0, 0, 0};
                  int[] var38 = new int[]{3540000, 3540000, 3540000, 3540000};
                  int[] var41 = new int[]{0, 0, 0, 0};
                  if (Main.a("score")) {
                     this.a.a("score");

                     for (int var42 = 0; var42 < 4; var42++) {
                        var24[var42] = this.a.a.readUTF();
                        var28[var42] = this.a.a.readInt();
                        var38[var42] = this.a.a.readInt();
                        var41[var42] = this.a.a.readInt();
                     }

                     this.a.a(false);
                  }

                  byte var43 = 0;
                  if (this.a.b != 1) {
                     var43 = 2;
                  }

                  if (this.a.h > var28[var43 + 0]) {
                     var17 = true;
                     var24[var43 + 0] = this.a.a.toString();
                     var28[var43 + 0] = this.a.h;
                     var38[var43 + 0] = this.a.i;
                     var41[var43 + 0] = this.a.j;
                  }

                  if (this.a.i < var38[var43 + 1]) {
                     var17 = true;
                     var24[var43 + 1] = this.a.a.toString();
                     var28[var43 + 1] = this.a.h;
                     var38[var43 + 1] = this.a.i;
                     var41[var43 + 1] = this.a.j;
                  }

                  this.a.b("score");

                  for (int var47 = 0; var47 < 4; var47++) {
                     this.a.a.writeUTF(var24[var47]);
                     this.a.a.writeInt(var28[var47]);
                     this.a.a.writeInt(var38[var47]);
                     this.a.a.writeInt(var41[var47]);
                  }

                  this.a.a(true);
               } catch (Exception var12) {
               }

               this.a.a = false;
               this.a.removeAllElements();
               this.a((byte)(var17 ? 30 : 31));
               return;
            }
            break;
         case 27:
            this.a((byte)33);

            try {
               ByteArrayOutputStream var22 = new ByteArrayOutputStream();
               DataOutputStream var26 = new DataOutputStream(var22);
               int var4 = 0;
               int var5 = 0;
               this.a.a("score");
               var26.write((System.getProperty("microedition.platform") + "\n").getBytes());

               for (int var6 = 0; var6 < 4; var6++) {
                  String var7 = this.a.a.readUTF();
                  String var1 = var7 + "\n";

                  for (int var44 = 0; var44 < var1.length(); var44++) {
                     var5 += var1.charAt(var44);
                  }

                  var26.write(var1.getBytes());
                  int var45 = this.a.a.readInt();
                  var5 += var45;
                  int var13 = this.a.a.readInt();
                  int var29;
                  int var30;
                  var26.writeInt((var45 + this.c[var29 = this.a(var4)]) * this.c[var30 = this.a(var29)]);
                  int var46 = this.a.a.readInt();
                  int var31;
                  int var32;
                  var26.writeInt((var13 - this.c[var31 = this.a(var30)]) * this.c[var32 = this.a(var31)]);
                  int var33;
                  var26.writeInt((var46 + this.c[var33 = this.a(var32)]) * this.c[var4 = this.a(var33)]);
                  int var40;
                  var5 = (var40 = var5 + var13 / 1000) + var46;
               }

               int var34;
               int var35;
               int var36;
               int var37;
               var26.writeInt(
                  (int)(
                     (long)var5
                        * this.c[var34 = this.a(var4)]
                        % (this.c[var35 = this.a(var34)] * this.c[var36 = this.a(var35)] * this.c[var37 = this.a(var36)] * this.c[this.a(var37)])
                  )
               );
               var26.writeByte(1);
               this.a.a(false);
               if (this.a == null) {
                  this.a = new p(this.a);
               }

               p var10000 = this.a;
               byte[] var10002 = var22.toByteArray();
               boolean var14 = false;
               byte[] var27 = var10002;
               Object var23 = null;
               p var15 = var10000;
               var10000.a = var27;
               var15.a = null;
               var15.a = 0;
               Thread var16;
               (var16 = new Thread(var15)).setPriority(10);
               var16.start();
            } catch (Exception var11) {
            }

            System.gc();
            return;
         case 28:
            this.a((byte)27);
            return;
         case 37:
            h var3;
            if ((var3 = (h)this.a.b.a()).a[this.a].compareTo(j.a().a(4)) == 0) {
               this.g = true;
            }

            var3.a(this.a);
            this.e();
            return;
         case 39:
            this.a.b = this.a.a;
            x var2;
            if ((var2 = this.a.b.a()).a == 0) {
               ((m)var2).a();
            }

            this.e();
            return;
         case 40:
            Main.h = true;
            Main.i = true;
            if (Main.e == 0) {
               Main.e = 5;
            }

            this.a((byte)50);
            return;
         case 41:
         case 42:
         case 43:
            this.a.a = true;
            this.a.m();
            d.a = this.a;
            if (this.a.a != null) {
               this.a.b.b();
               this.a.b.c();
            }

            this.a.e();
            j.a("/tz." + d.a[d.a]);
            j.b("UTF-8");
            j.a().a();
            this.a.a = false;
            if (this.a == 41) {
               this.a((byte)3);
               this.c();
               this.a = true;
               return;
            }

            if (this.a == 43) {
               this.a((byte)15);
               this.c();
               this.a = true;
               return;
            }

            this.a();
            return;
         case 44:
            this.a.b = d.b[this.a];
            this.l();
            this.a.removeAllElements();
            this.a.a((byte)1, (byte)1);
            return;
         case 45:
            this.a.b = d.b[this.a];
            this.b((byte)3);
            return;
         case 47:
            this.a.b = d.c[this.a];
            this.b((byte)3);
            return;
         case 49:
            this.a.f = true;
            return;
         case 50:
            Main.j = true;
            if (Main.f == 0) {
               Main.f = 3;
            }

            this.a((byte)0);
      }
   }

   public final void a() {
      this.a.b = 1;
      this.c = 0;
      if (Main.e) {
         this.c = 40;
      } else {
         Main.h = true;
      }

      this.a.b = this.a.a;
      if (this.a.b.c()) {
         x var1;
         if ((var1 = this.a.b.a()).a == 0) {
            ((m)var1).b();
         }

         this.e();
      } else if (Main.e) {
         this.a((byte)39);
      } else if (Main.e) {
         this.a((byte)40);
      } else {
         Main.h = true;
         this.a((byte)0);
      }
   }

   private int a(int var1) {
      if (++var1 == this.c.length) {
         var1 = 0;
      }

      return var1;
   }

   private void i() {
      switch (this.a) {
         case 1:
            this.k();
            this.l();
            this.a.a.c();
            this.a.a = 0;
            this.a.c(12);
            return;
         case 3:
            this.g();
         case 2:
         case 5:
         case 6:
         case 12:
         case 49:
            this.a((byte)0);
            this.c();
            return;
         case 4:
         case 16:
         case 44:
         case 46:
            this.a((byte)5);
            this.c();
            return;
         case 7:
            this.a((byte)6);
            this.c();
            return;
         case 9:
            at var1 = this.a.a;
            if (this.a.a.a == 0) {
               try {
                  var1.a.setDiscoverable(0);
               } catch (Exception var2) {
               }
            }

            this.a.a.b();
         case 10:
         case 11:
            this.a((byte)6);
            this.c();
            return;
         case 15:
            this.g();
            this.a.c(12);
         case 13:
         case 14:
         case 18:
         case 19:
         case 24:
         case 48:
            this.a((byte)1);
            this.c();
            return;
         case 17:
            this.k();
            this.a((byte)25);
            return;
         case 20:
         case 21:
         case 22:
         case 23:
         case 25:
         case 45:
         case 47:
            this.a((byte)17);
            this.c();
            return;
         case 27:
            this.a((byte)28);
            return;
         case 28:
            this.a((byte)0);
            this.c();
            return;
         case 29:
            this.a((byte)17);
            return;
         case 30:
            this.a((byte)(this.a.b != 1 ? 29 : 28));
            return;
         case 31:
            this.a((byte)(this.a.b != 1 ? 17 : 0));
            return;
         case 32:
            this.a((byte)0);
            this.c();
            return;
         case 33:
         case 34:
         case 35:
            this.a((byte)28);
            return;
         case 36:
            ((i)this.a.b.a()).a();
            this.e();
            return;
         case 37:
            ((h)this.a.b.a()).a();
            this.e();
            return;
         case 38:
            ((l)this.a.b.a()).a();
            this.e();
            return;
         case 39:
            this.a(this.c);
            return;
         case 40:
            Main.h = true;
            Main.i = false;
            Main.e = 0;
            this.a((byte)50);
            return;
         case 41:
            this.a((byte)3);
            this.c();
            return;
         case 43:
            this.a((byte)15);
            this.c();
            return;
         case 50:
            Main.j = false;
            Main.f = 0;
            this.a((byte)0);
         case 8:
         case 26:
         case 42:
      }
   }

   public final void b() {
      if (this.a == null) {
         this.a = this.a.a(1);
         this.b = this.a.a(0);
      }
   }

   public final void a(byte var1) {
      try {
         this.a.a = false;
         this.l();
         this.d();
         int var2 = this.e - 2;
         int var3 = this.f;
         this.a = (byte)var1;
         switch (this.a) {
            case 0:
               if (Main.e) {
                  this.m();
                  Main.e = false;
               }

               this.a((byte)0, false, var2, var3);
               if (!this.a.a) {
                  this.a.a(12, true);
               }

               Main.k = true;
               break;
            case 1:
               this.a((byte)(this.a.b == 1 ? 1 : (this.a.b == 2 ? 8 : 14)), true, var2, var3);
               break;
            case 2:
            case 18:
               byte[][] var19 = this.a.a(this.a.a.a() ? 206 : 8);
               byte[][] var34 = this.a.a(154);
               byte[][] var50 = new byte[var19.length + var34.length][];
               System.arraycopy(var19, 0, var50, 0, var19.length);
               System.arraycopy(var34, 0, var50, var19.length, var34.length);
               this.a(var50, false, true);
               break;
            case 3:
            case 15:
               this.a((byte)2, true, var2, var3);
               break;
            case 4:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               if ((var1 = this.a.a.readInt()) == 0) {
                  this.a.a(false);
                  this.a.a = false;
                  this.a(138, false, true);
               } else {
                  byte[][] var33;
                  (var33 = new byte[6][])[1] = d.a(0, " (");
                  var33[3] = new byte[]{d.a(0, '/')};
                  var33[5] = new byte[]{d.a(0, ')')};
                  this.a.a.readInt();
                  this.a.a.readInt();
                  this.a = new byte[var1][];

                  for (int var49 = 0; var49 < this.a.length; var49++) {
                     int var54 = 0;

                     for (int var18 = 0; var18 < Main.a[var49]; var18++) {
                        if (this.a.a.readBoolean()) {
                           var54++;
                        }
                     }

                     if (Main.a[var49] == 0) {
                        this.a[var49] = this.a.a(d.a[var49]);
                     } else {
                        var33[0] = this.a.a(d.a[var49]);
                        var33[2] = d.a(0, var54);
                        var33[4] = d.a(0, Main.a[var49]);
                        this.a[var49] = d.a(var33);
                     }
                  }

                  this.a.a(false);
                  this.a.a = false;
                  this.a((byte)3, true, var2, var3);
               }
               break;
            case 5:
               this.a((byte)(Main.a("save") ? 7 : 6), true, var2, var3);
               break;
            case 6:
               this.a((byte)4, true, var2, var3);
               break;
            case 7:
               this.a = new byte[this.a.length][];

               for (int var16 = 0; var16 < this.a.length; var16++) {
                  this.a[var16] = d.a(0, this.a[var16]);
               }

               this.a((byte)5, true, var2, var3);
               break;
            case 8:
               this.a(20, false, false);
               break;
            case 9:
               this.a(21, false, true);
               break;
            case 10:
               this.a(22, false, true);
               break;
            case 11:
               this.a(23, false, true);
               break;
            case 12:
            case 19:
               this.a(28, false, true);
               break;
            case 13:
            case 14:
               this.a(30, true, true);
               break;
            case 16:
               this.a(31, true, true);
               break;
            case 17:
               this.a((byte)(Main.a("msave") ? 10 : 9), true, var2, var3);
               break;
            case 20:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               this.a.a.readInt();
               var1 = this.a.a.readInt();
               this.a.a(false);
               this.a.a = false;
               if (var1 == 0) {
                  this.a(152, false, true);
               } else {
                  this.a = new byte[var1][];

                  for (int var32 = 0; var32 < var1; var32++) {
                     this.a[var32] = this.a.a(d.d[var32]);
                  }

                  this.a((byte)13, true, var2, var3);
               }
               break;
            case 21:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               this.a.a.readInt();
               this.a.a.readInt();
               var1 = this.a.a.readInt();
               this.a.a(false);
               this.a.a = false;
               int var30 = 0;

               for (int var47 = 0; var47 < Main.c.length; var47++) {
                  if (var1 >= Main.c[var47]) {
                     var30 = var47 + 1;
                  }
               }

               var30 += 5;
               this.a = new byte[var30][];

               for (int var48 = 0; var48 < var30; var48++) {
                  this.a[var48] = this.a.a(d.e[var48]);
               }

               this.a((byte)11, true, var2, var3);
               break;
            case 22:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               this.a.a.readInt();
               this.a.a.readInt();
               var1 = this.a.a.readInt();
               this.a.a(false);
               this.a.a = false;
               int var28 = 0;

               for (int var45 = 0; var45 < Main.d.length; var45++) {
                  if (var1 >= Main.d[var45]) {
                     var28 = var45 + 1;
                  }
               }

               var28 += 5;
               this.a = new byte[var28][];

               for (int var46 = 0; var46 < var28; var46++) {
                  this.a[var46] = this.a.a(d.f[var46]);
               }

               this.a((byte)12, true, var2, var3);
               break;
            case 23:
               this.a(31, true, true);
               break;
            case 24:
               this.a(30, true, true);
               break;
            case 25:
               this.a(49, true, true);
               break;
            case 26:
               this.b = 2;
               this.a.a((short)58, "", 11);
               break;
            case 27:
               this.a(55, true, true);
               break;
            case 28:
            case 29:
               this.a.a = true;
               this.a.m();
               byte[][] var12 = this.a();
               this.a.a = false;
               this.a(var12, this.a == 28, true);
               break;
            case 30:
               this.a(61, false, true);
               break;
            case 31:
               this.a(60, false, true);
               break;
            case 32:
               this.a(64, false, true);
               break;
            case 33:
               this.a(56, false, true);
               break;
            case 34:
               this.a(22, false, true);
               break;
            case 35:
               this.a = null;
               this.a(57, false, true);
               break;
            case 36:
               i var27 = (i)this.a.b.a();
               byte var44 = this.a.a(28);
               this.a(d.a(var44, d.a(var44, var27.a), d.a()), false, true);
               break;
            case 37:
               String[] var43 = ((h)this.a.b.a()).a;
               this.a = new byte[var43.length][];

               for (int var53 = 0; var53 < var43.length; var53++) {
                  this.a[var53] = d.a(0, var43[var53]);
               }

               this.a((byte)15, true, var2, var3);
               break;
            case 38:
               l var26 = (l)this.a.b.a();
               byte var42 = this.a.a(28);
               this.a(d.a(var42, d.a(var42, var26.a), d.a()), false, var26.a());
               break;
            case 39:
               this.a(14, true, true);
               break;
            case 40:
               this.a(17, true, true);
               break;
            case 41:
            case 43:
               this.a = d.a;
               this.a((byte)16, true, var2, var3);
               this.a = d.a;
               break;
            case 42:
               this.a = d.a;
               this.a((byte)16, false, var2, var3);
               break;
            case 44:
            case 45:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               this.a.a.readInt();
               this.a.a.readInt();
               var1 = this.a.a.readInt();
               this.a.a(false);
               this.a.a = false;
               int var25 = 0;

               for (int var40 = 0; var40 < Main.b.length; var40++) {
                  if (var1 >= Main.b[var40]) {
                     var25 = var40 + 1;
                  }
               }

               if (var25 == 0) {
                  this.a(144, false, true);
               } else {
                  this.a = new byte[var25][];

                  for (int var41 = 0; var41 < var25; var41++) {
                     this.a[var41] = this.a.a(d.b[var41]);
                  }

                  this.a((byte)17, true, var2, var3);
               }
               break;
            case 46:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               this.a.a.readInt();
               this.a.a.readInt();
               this.a.a.readInt();

               for (int var9 = 0; var9 < Main.a.length; var9++) {
                  for (int var23 = 0; var23 < Main.a[var9]; var23++) {
                     this.a.a.readBoolean();
                  }
               }

               byte[][] var10 = new byte[Main.a.length][];
               int var24 = 0;

               for (int var38 = 0; var38 < Main.a.length; var38++) {
                  if (this.a.a.readBoolean()) {
                     var10[var24++] = d.a(3, Main.e[var38]);
                  }
               }

               this.a.a(false);
               this.a.a = false;
               if (var24 == 0) {
                  this.a(153, false, true);
               } else {
                  byte[][] var39;
                  byte[][] var52 = new byte[(var39 = this.a.a(146)).length + var24][];
                  System.arraycopy(var39, 0, var52, 0, var39.length);
                  System.arraycopy(var10, 0, var52, var39.length, var24);
                  this.a(var52, false, true);
               }
               break;
            case 47:
               this.a.a = true;
               this.a.m();
               this.a.a("achi");
               var1 = this.a.a.readInt();
               this.a.a(false);
               this.a.a = false;
               if (var1 == 0) {
                  this.a(138, false, true);
               } else {
                  byte[][] var4 = new byte[var1][];
                  int var5 = 0;

                  for (int var6 = 0; var6 < var1; var6++) {
                     if (d.a(d.c, d.a[var6]) != -1) {
                        var4[var5++] = this.a.a(d.a[var6]);
                     }
                  }

                  this.a = new byte[var5][];
                  System.arraycopy(var4, 0, this.a, 0, var5);
                  this.a((byte)18, true, var2, var3);
               }
               break;
            case 48:
               this.a(160, false, true);
               break;
            case 49:
               this.a(202, true, true);
               break;
            case 50:
               this.a(203, true, true);
         }

         u var20 = this;
         var2 = this.f;
         var3 = var20.e;
         if (var20.b == 1) {
            var2 = var20.a.a.length * (d.c(var20.a.a(8)) + 1);
         } else if (var20.b == 0) {
            int var35;
            var2 = ((var35 = var20.a()) < var20.b ? var35 : var20.b) * var20.d;
            var3 = 0;

            for (int var51 = 0; var51 < var35; var51++) {
               int var55;
               if ((var55 = var20.a(var20.j, var51)) > var3) {
                  var3 = var55;
               }
            }
         } else if (var20.b == 2) {
            var2 = 2 * (d.c(0) + 1);
         }

         int var36;
         if ((var36 = var20.e - var3) > 0) {
            var20.g += var36 >> 1;
            var20.e -= var36;
         }

         if ((var36 = var20.f - var2) > 0) {
            var20.h += var36 >> 1;
            var20.f -= var36;
         }
      } catch (Exception var7) {
      }
   }

   private byte[][] a() {
      B var1 = null;
      this.a.a("score");
      var1 = d.a(3, "^");
      byte[] var2 = d.a(3, "~");
      byte[] var3 = d.a(3, " ");
      String[] var4 = new String[4];
      int[] var5 = new int[4];
      int[] var6 = new int[4];

      try {
         for (int var7 = 0; var7 < 4; var7++) {
            var4[var7] = this.a.a.readUTF();
            var5[var7] = this.a.a.readInt();
            var6[var7] = this.a.a.readInt();
            this.a.a.readInt();
         }
      } catch (Exception var8) {
      }

      byte[][] var11 = new byte[][]{
         (byte[])var1,
         this.a.a(11),
         var2,
         this.a.a(59),
         d.a(3, var4[0]),
         var2,
         this.a.a(36),
         var3,
         d.a(3, var5[0]),
         var2,
         this.a.a(37),
         var3,
         ac.a(var6[0]),
         var2,
         var2,
         this.a.a(59),
         d.a(3, var4[1]),
         var2,
         this.a.a(36),
         var3,
         d.a(3, var5[1]),
         var2,
         this.a.a(37),
         var3,
         ac.a(var6[1]),
         var2,
         var2,
         (byte[])var1,
         this.a.a(24),
         var2,
         this.a.a(59),
         d.a(3, var4[2]),
         var2,
         this.a.a(36),
         var3,
         d.a(3, var5[2]),
         var2,
         this.a.a(37),
         var3,
         ac.a(var6[2]),
         var2,
         var2,
         this.a.a(59),
         d.a(3, var4[3]),
         var2,
         this.a.a(36),
         var3,
         d.a(3, var5[3]),
         var2,
         this.a.a(37),
         var3,
         ac.a(var6[3])
      };
      this.a.a(false);
      var1 = d.a(3, d.a(var11), ad.a - 10);
      System.gc();
      return (byte[][])var1;
   }

   private void b(byte var1) {
      this.a.a = true;
      this.a.m();
      if (this.a.a != null) {
         this.a.a = true;
         this.a.a.a(new byte[]{2});
         this.a.d();

         try {
            Thread.sleep(500L);
         } catch (InterruptedException var6) {
         }
      }

      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      DataOutputStream var3 = new DataOutputStream(var2);

      try {
         var3.writeShort(this.a.b);
         var3.writeByte(var1);
      } catch (IOException var5) {
         this.a((byte)10);
         this.a.a = false;
         return;
      }

      if (!this.a.a.a(var2.toByteArray())) {
         this.a((byte)10);
      } else {
         try {
            this.l();
            this.a.removeAllElements();
            this.a.e[0] = this.a.e[1] = 0;
            this.a.a((byte)2, var1);
         } catch (RuntimeException var4) {
            this.a.a.b();
            this.a((byte)10);
         }
      }

      this.a.a = false;
   }

   public final void a(boolean var1) {
      if (var1) {
         this.a((byte)10);
      } else {
         at var6 = this.a.a;
         String[] var10001;
         if (this.a.a.a == null) {
            var10001 = new String[0];
         } else {
            int var2;
            String[] var3 = new String[var2 = var6.a.size()];

            for (int var4 = 0; var4 < var2; var4++) {
               DataElement var5 = ((ServiceRecord)var6.a.elementAt(var4)).getAttributeValue(256);
               var3[var4] = (String)var5.getValue();
            }

            var10001 = var3;
         }

         this.a = var10001;
         if (this.a.length == 0) {
            this.a((byte)11);
         } else {
            this.a((byte)7);
         }
      }
   }

   public final void b(boolean var1) {
      if (var1) {
         this.a((byte)10);
      }
   }

   public final void c(boolean var1) {
      if (var1) {
         this.a((byte)10);
      } else {
         while (!this.a.a.a()) {
            try {
               this.a();
               Thread.sleep(1L);
            } catch (InterruptedException var3) {
            }
         }

         if (this.a.a.a) {
            this.a((byte)6);
         } else {
            ByteArrayInputStream var4;
            if ((var4 = this.a.a.a()) == null) {
               this.a((byte)10);
            } else {
               try {
                  DataInputStream var5 = new DataInputStream(var4);
                  this.a.b = var5.readShort();
                  var1 = var5.readByte();
                  this.l();
                  this.a.removeAllElements();
                  this.a.e[0] = this.a.e[1] = 0;
                  this.a.a((byte)4, var1);
               } catch (Exception var2) {
                  this.a.a.b();
                  this.a((byte)10);
               }
            }
         }
      }
   }

   public final void d(boolean var1) {
      if (var1) {
         this.a.a = false;
         this.a((byte)10);
      } else {
         this.a((byte)17);
      }
   }

   private void a(int var1, boolean var2, boolean var3) {
      this.b = 1;
      this.c = var2;
      this.d = var3;
      this.a.a(this.a.a(var1), 3, 3, -11579569, this.f);
      this.a.repaint();
   }

   private void a(byte[][] var1, boolean var2, boolean var3) {
      this.b = 1;
      this.c = var2;
      this.d = var3;
      this.a.a(var1, 3, 3, -11579569, this.f);
      this.a.repaint();
   }

   public final int a() {
      return a[this.j] != null ? a[this.j].length : this.a.length;
   }

   private int a(int var1, int var2) {
      int var3 = 0;
      if (a[var1] != null) {
         var3 = this.a.d(a[var1][var2]);
         byte var4 = this.a.a(a[var1][var2]);
         if (a[var1] != null && a[var1][var2] != null) {
            if (a[var1][var2][0] < 0) {
               var3 += d.a(var4, d.a(var4, String.valueOf(this.b[var2])));
            } else {
               var3 += d.a(var4, this.a.a(a[var1][var2][this.b[var2]]));
            }
         }
      } else {
         var3 = d.a(0, this.a[var2]);
      }

      return var3;
   }

   private void j() {
      int var1 = this.a.length;

      for (int var2 = 0; var2 < var1; var2++) {
         int var3;
         if ((var3 = this.a(this.j, var2)) > this.k) {
            this.a[var2] = 1;
         } else {
            this.a[var2] = 0;
         }

         this.b[var2] = (short)(var3 - this.k);
      }
   }

   public final void c() {
      int var1;
      if ((var1 = this.a.size()) > 0) {
         this.a = ((int[])this.a.elementAt(var1 - 1))[0];
         this.a.removeElementAt(var1 - 1);
         if (this.a < 0) {
            this.a = 0;
         }

         var1 = this.a();
         if (this.a > var1 - 1) {
            this.a = 0;
         }

         if (this.a < this.c) {
            this.c = this.a;
            return;
         }

         if (this.a >= this.c + this.b) {
            this.c = this.a - this.b + 1;
         }
      }
   }

   private void k() {
      this.a.addElement(new int[]{this.a});
      if (this.a.size() > this.i) {
         this.a.removeElementAt(0);
      }
   }

   public u(Main var1) {
      this.a = var1;
      this.a = this.a.a;
      this.a = this.a.a;
      this.a = this.a.a;
      this.a = -1;
      this.a = new Vector(10);
      this.c = d.a(0, "hardwirerockshard");

      for (int var2 = 0; var2 < this.c.length; var2++) {
         this.c[var2]++;
      }
   }

   public final void d() {
      if (ad.b >= 300) {
         this.e = ad.a - 70;
         this.f = ad.b - 110;
         this.g = 35;
         this.h = 55;
      } else {
         this.g = 35;
         this.h = 18;
         this.e = ad.a - 70;
         this.f = ad.b - this.h - this.a.a(0).getHeight();
         if (this.a.a == 0 && this.a.c == 7) {
            this.h += 20;
         }
      }

      if (ad.b >= 300) {
         if (this.a.a == 0 && this.a.c == 7) {
            this.h += 40;
            return;
         }

         this.h += 50;
         this.f -= 50;
      }
   }

   public final void a(Graphics var1) {
      var1.setColor(0);
      var1.fillRect(0, 0, ad.a, ad.b);
      if (this.a.a != 0 || this.a.c != 7) {
         var1.drawImage(this.a.a(242), 10, 50, 20);
         var1.drawImage(this.a.a(242), 50, 100, 20);
         var1.drawImage(this.a.a(242), ad.a - 40, 70, 24);
         var1.drawImage(this.a.a(242), ad.a - 100, 130, 24);
         var1.drawImage(this.a.a(242), ad.a - 20, ad.b - 40, 40);
         var1.drawImage(this.a.a(242), 30, ad.b - 40, 36);
         var1.drawImage(this.a.a(243), ad.a - 40, ad.b - 10, 40);
         var1.drawImage(this.a.a(243), 70, 70, 24);
      }

      var1.drawImage(this.a.a(238), 0, 0, 20);
      var1.drawImage(this.a.a(239), ad.a, 0, 24);
      var1.drawImage(this.a.a(240), ad.a, ad.b, 40);
      var1.drawImage(this.a.a(241), 0, ad.b, 36);
      if (this.b != 2) {
         byte var2 = 0;
         if (this.l > 10 && (this.l & 32) == 0) {
            switch (this.l & 31) {
               case 0:
               case 4:
                  var2 = 1;
                  break;
               case 1:
               case 3:
                  var2 = 2;
                  break;
               case 2:
                  var2 = 3;
            }
         }

         if (ad.b >= 300 && (this.a.a != 0 || this.a.c == 7)) {
            var1.drawImage(this.a.a(244), ad.c, 20 + this.a.a(245).getHeight(), 17);
            if (var2 != 3) {
               var1.drawImage(this.a.a(var2 + 245), ad.c, 20 + (this.a.a(245).getHeight() >> 1), 3);
            }
         }
      }
   }

   private void l() {
      this.b = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.b = null;
   }

   public final boolean a() {
      try {
         if (this.f) {
            this.i();
         } else if (this.e) {
            this.h();
         }

         this.f = this.e = false;
         x var1;
         l var2;
         if (this.a.b != null && (var1 = this.a.b.a()).a == 2 && (var2 = (l)var1).a) {
            ((l)var1).b();
            this.e();
         }

         if (this.b == 1) {
            this.a.i();
            if (this.a != 38) {
               return false;
            }
         }
      } catch (Exception var3) {
      }

      return true;
   }

   public final void e() {
      Main.c = true;
      x var1;
      switch ((var1 = this.a.b.a()).a) {
         case 1:
            this.a((byte)37);
            return;
         case 2:
            Main.c = false;
            this.m = 1;
            this.a = System.currentTimeMillis();
            this.a((byte)38);
            return;
         case 3:
            this.a((byte)36);
            this.a.m();
            long var2 = System.currentTimeMillis();

            while (this.a.b.a() == var1 && System.currentTimeMillis() - var2 < 2000L) {
               try {
                  this.a();
                  Thread.sleep(1L);
               } catch (InterruptedException var4) {
               }
            }

            if (this.a.b.a() == var1) {
               this.i();
               return;
            }
            break;
         default:
            this.g = false;
            this.a.a = this.a.b;
            if (this.a.a == 1) {
               this.a(this.c);
               this.c();
               return;
            }

            if (this.a.a == 0 && this.a.c == 6) {
               this.a.c = 0;
               this.a.m();
               this.a.c = 6;
            }
      }
   }

   public final void b(Graphics var1) {
      try {
         this.l++;
         this.a(var1);
         switch (this.b) {
            case 0:
               int var28;
               int var27 = (var28 = this.a()) < this.b ? var28 : this.b;
               if (this.a != null) {
                  int var29 = this.h + 1 + (this.f >> 1) - (var27 * this.d >> 1);

                  for (int var31 = this.c; var31 < this.c + var27; var31++) {
                     int var19 = var29 + (var31 - this.c) * this.d;
                     int var25 = ad.c - (d.a(0, this.a[var31]) >> 1);
                     if (this.a[var31] != 0) {
                        var25 = ad.c - (this.k >> 1) - this.a[var31];
                     }

                     int var33 = ad.c - (this.k >> 1);
                     int var35 = ad.c + (this.k >> 1);
                     int var39 = 0;
                     var39 = var31 == this.a ? 0 : 2;
                     d.a(var1, var39, this.a[var31], var25, var19, var33, var35, 0);
                  }
               } else {
                  int var6 = this.h + 1 + (this.f >> 1) - (var27 * this.d >> 1);

                  for (int var7 = this.c; var7 < this.c + var27; var7++) {
                     int var17 = var6 + (var7 - this.c) * this.d;
                     int var8 = this.a.d(a[this.j][var7]);
                     byte[] var9 = null;
                     int var10 = this.a.a(a[this.j][var7]);
                     if (a[this.j] != null && a[this.j][var7] != null) {
                        if (a[this.j][var7][0] < 0) {
                           var9 = d.a(var10, String.valueOf(this.b[var7]));
                        } else {
                           var9 = this.a.a(a[this.j][var7][this.b[var7]]);
                        }

                        var8 += d.a(var10, var9);
                     }

                     int var23 = ad.c - (var8 >> 1);
                     if (this.a[var7] != 0) {
                        var23 = ad.c - (this.k >> 1) - this.a[var7];
                     }

                     var10 = ad.c - (this.k >> 1);
                     int var11 = ad.c + (this.k >> 1);
                     int var12 = 0;
                     var12 = var7 == this.a ? 0 : 2;
                     d.a(var1, var12, this.a.a(a[this.j][var7]), var23, var17, var10, var11, 0);
                     if (var9 != null) {
                        d.a(var1, var12, var9, var23 + var8, var17, var10, var11, 8);
                        if (var7 == this.a) {
                           boolean var10002 = a[this.j][var7][0] < 0 && this.b[this.a] > a[this.j][var7][1]
                              || a[this.j][var7][0] > 0 && (this.b[var7] > 0 || a[this.j][var7].length == 2);
                           boolean var10003 = a[this.j][var7][0] < 0 && this.b[this.a] < a[this.j][var7][2]
                              || a[this.j][var7][0] > 0 && (this.b[var7] < a[this.j][var7].length - 1 || a[this.j][var7].length == 2);
                           var10 = var17;
                           boolean var34 = var10003;
                           boolean var32 = var10002;
                           Graphics var24 = var1;
                           u var18 = this;
                           if (var32 || var34) {
                              var10++;
                              var11 = var18.d >> 1;
                              int var43 = 0;
                              if ((var43 = var18.l % 6) > 3) {
                                 var43 = 6 - var43;
                              }

                              if (var32) {
                                 var24.drawImage(var18.a.a(231), var43 + 1, var10 + var11, 6);
                              }

                              if (var34) {
                                 var24.drawImage(var18.a.a(232), ad.a - 1 - var43, var10 + var11, 10);
                              }
                           }
                        }
                     }
                  }
               }

               for (int var30 = this.c; var30 < this.c + var27; var30++) {
                  if (this.a[var30] != 0) {
                     if (this.a[var30] > 0) {
                        this.a[var30] = (short)(this.a[var30] + 2);
                        if (this.a[var30] > this.b[var30]) {
                           this.a[var30] = this.b[var30];
                           this.a[var30] = -1;
                        }
                     } else {
                        this.a[var30] = (short)(this.a[var30] - 2);
                        if (this.a[var30] < 0) {
                           this.a[var30] = 0;
                           this.a[var30] = 1;
                        }
                     }
                  }
               }

               if (a[this.j] == null || a[this.j][this.a] == null) {
                  var1.drawImage(this.b, 0, ad.b, 36);
               }

               if (this.b) {
                  var1.drawImage(this.a, ad.a, ad.b, 40);
               }

               if (var28 > this.b) {
                  if (this.c > 0) {
                     var1.drawImage(this.a.a(1000), ad.c, ad.b, 33);
                  }

                  if (this.c + this.b < this.a()) {
                     var1.drawImage(this.a.a(1001), ad.c, ad.b, 33);
                  }
               }
               break;
            case 1:
               this.a.b(var1, this.g, this.h, this.f, this.g + this.e - 2);
               if (this.a == 38) {
                  if (System.currentTimeMillis() - this.a >= 1000L) {
                     this.m++;
                     if (this.m > 4) {
                        this.m = 0;
                     }

                     this.a = System.currentTimeMillis();
                  }

                  String var16 = "";

                  for (int var21 = 0; var21 < this.m; var21++) {
                     var16 = var16 + '.';
                  }

                  int var22 = this.g;
                  int var26 = this.h + this.a.a.length * (3 + d.c(1));
                  this.a.a(var1, 3, var16, var22, var26, 20);
               }

               if (this.c) {
                  if (this.a != 28 && this.a != 29) {
                     var1.drawImage(this.b, 0, ad.b, 36);
                  } else {
                     if (this.c == null) {
                        this.c = this.a.b(54);
                     }

                     var1.drawImage(this.c, 0, ad.b, 36);
                  }
               }

               if (this.d) {
                  var1.drawImage(this.a, ad.a, ad.b, 40);
                  return;
               }
               break;
            case 2:
               int var2 = this.h;
               int var3 = (25 / (ad.a / d.a(0, "m")) + 2) * d.c(0);
               if (var2 < var3) {
                  var2 = var3;
               }

               this.a.a(var1, this.g + 1, var2, -11579569, 0);
               var1.drawImage(this.b, 0, ad.b, 36);
               int var4 = d.a(0, "m");
               var3 = 1;
               var2 = 0;

               for (char var5 = 'a'; var5 <= 'z'; var5++) {
                  this.a.a(var1, 0, String.valueOf(var5), var3, var2, 0);
                  if ((var3 += var4) + var4 > ad.a) {
                     var3 = 1;
                     var2 += d.c(0);
                  }
               }

               var2 = 25 / (ad.a / var4) + 1;
               this.a.a(var1, 0, "del", 1, var2 * d.c(0), 0);
               return;
         }
      } catch (Exception var13) {
      }
   }

   public final void a(int var1, int var2) {
      if (var1 < this.a.getWidth() && var2 > ad.b - this.b.getHeight()) {
         this.a(-6);
      } else if (var1 >= ad.a - this.a.getWidth() && var2 > ad.b - this.a.getHeight()) {
         this.a(-7);
      }

      if (this.b == 1 || this.b == 0) {
         this.a.d = true;
         this.a.e = false;
         this.a.i = var2;
         if (this.b == 0) {
            this.a.j = this.c;
            return;
         }

         if (this.b == 1) {
            this.a.j = this.a.f;
         }
      }
   }

   public final void b(int var1, int var2) {
      if (this.b == 0) {
         int var3;
         int var4 = (var3 = this.a()) < this.b ? var3 : this.b;
         var3 = this.h + 1 + (this.f >> 1) - (var4 * this.d >> 1);
         int var5 = this.c;

         while (true) {
            if (var5 >= this.c + var4) {
               return;
            }

            int var6 = var3 + (var5 - this.c) * this.d;
            if (var2 > var6 && var2 <= var6 + this.d) {
               var6 = this.a(this.j, var5);
               if (var1 >= ad.a - var6 >> 1 && var1 <= ad.a + var6 >> 1) {
                  this.a = var5;
               }

               if (this.a == var5) {
                  if (var1 < 60 && this.a == null && a[this.j] != null && a[this.j][this.a] != null) {
                     this.a(ad.b(2));
                  } else if (var1 > ad.a - 60 && this.a == null && a[this.j] != null && a[this.j][this.a] != null) {
                     this.a(ad.b(3));
                  } else {
                     this.a(-6);
                  }
                  break;
               }
            }

            var5++;
         }
      } else if (this.b == 2) {
         int var8 = d.a(0, "m");
         int var10 = ad.a / var8;
         var8 = (var1 - 1) / var8;
         int var11 = var2 / d.c(0);
         int var14 = var8 + var11 * var10;
         if (this.a.a.length() < this.a.h && var14 <= 25) {
            char var15 = (char)(var14 + 97);
            this.a.a.append(var15);
         }

         var11 = (25 / var10 + 1) * d.c(0);
         if (this.a.a.length() > 0 && var1 < 1 + d.a(0, "del") && var2 >= var11 && var2 <= var11 + d.c(0)) {
            this.a.a.deleteCharAt(this.a.a.length() - 1);
         }
      }
   }

   public final void a(v var1) {
      if (!this.g) {
         switch (var1.a) {
            case 1:
               this.a(ad.b(0));
               return;
            case 2:
               this.a(ad.b(1));
               return;
            case 3:
               this.a(ad.b(2));
               return;
            case 4:
               this.a(ad.b(3));
               return;
            case 5:
               this.a(-6);
               return;
            case 8:
               this.a(-7);
            case 6:
            case 7:
         }
      }
   }

   public final void b(v var1) {
      if (!this.g) {
         switch (var1.a) {
            case 1:
               this.b(ad.b(0));
               return;
            case 2:
               this.b(ad.b(1));
         }
      }
   }

   public final void a(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield u.b B
      // 004: tableswitch 886 0 2 180 28 136
      // 020: iload 1
      // 021: invokestatic ad.a (I)Z
      // 024: ifeq 034
      // 027: aload 0
      // 028: getfield u.d Z
      // 02b: ifeq 033
      // 02e: aload 0
      // 02f: bipush 1
      // 030: putfield u.f Z
      // 033: return
      // 034: aload 0
      // 035: getfield u.c Z
      // 038: ifeq 055
      // 03b: iload 1
      // 03c: invokestatic ad.c (I)Z
      // 03f: ifne 04f
      // 042: aload 0
      // 043: getfield u.a Lad;
      // 046: iload 1
      // 047: invokevirtual ad.a (I)I
      // 04a: bipush 8
      // 04c: if_icmpne 055
      // 04f: aload 0
      // 050: bipush 1
      // 051: putfield u.e Z
      // 054: return
      // 055: aload 0
      // 056: getfield u.a Lad;
      // 059: iload 1
      // 05a: invokevirtual ad.a (I)I
      // 05d: lookupswitch 44 2 0 27 1 37
      // 078: aload 0
      // 079: getfield u.a Lad;
      // 07c: invokevirtual ad.j ()V
      // 07f: goto 37a
      // 082: aload 0
      // 083: getfield u.a Lad;
      // 086: invokevirtual ad.k ()V
      // 089: goto 37c
      // 08c: iload 1
      // 08d: invokestatic ad.a (I)Z
      // 090: ifeq 099
      // 093: aload 0
      // 094: bipush 1
      // 095: putfield u.f Z
      // 098: return
      // 099: iload 1
      // 09a: invokestatic ad.c (I)Z
      // 09d: ifne 0a7
      // 0a0: iload 1
      // 0a1: invokestatic ad.b (I)Z
      // 0a4: ifeq 0ad
      // 0a7: aload 0
      // 0a8: bipush 1
      // 0a9: putfield u.e Z
      // 0ac: return
      // 0ad: aload 0
      // 0ae: getfield u.a Lad;
      // 0b1: iload 1
      // 0b2: invokevirtual ad.c (I)V
      // 0b5: goto 37c
      // 0b8: iload 1
      // 0b9: invokestatic ad.a (I)Z
      // 0bc: ifeq 0cc
      // 0bf: aload 0
      // 0c0: getfield u.b Z
      // 0c3: ifeq 0cb
      // 0c6: aload 0
      // 0c7: bipush 1
      // 0c8: putfield u.f Z
      // 0cb: return
      // 0cc: iload 1
      // 0cd: invokestatic ad.c (I)Z
      // 0d0: ifne 0e0
      // 0d3: aload 0
      // 0d4: getfield u.a Lad;
      // 0d7: iload 1
      // 0d8: invokevirtual ad.a (I)I
      // 0db: bipush 8
      // 0dd: if_icmpne 0e6
      // 0e0: aload 0
      // 0e1: bipush 1
      // 0e2: putfield u.e Z
      // 0e5: return
      // 0e6: iload 1
      // 0e7: bipush -8
      // 0e9: if_icmpne 0ed
      // 0ec: return
      // 0ed: aload 0
      // 0ee: getfield u.a Lad;
      // 0f1: iload 1
      // 0f2: invokevirtual ad.a (I)I
      // 0f5: dup
      // 0f6: istore 1
      // 0f7: tableswitch 643 0 3 29 102 171 171
      // 114: aload 0
      // 115: dup
      // 116: getfield u.a I
      // 119: bipush 1
      // 11a: isub
      // 11b: putfield u.a I
      // 11e: aload 0
      // 11f: getfield u.a I
      // 122: aload 0
      // 123: getfield u.c I
      // 126: if_icmpge 131
      // 129: aload 0
      // 12a: aload 0
      // 12b: getfield u.a I
      // 12e: putfield u.c I
      // 131: aload 0
      // 132: getfield u.a I
      // 135: ifge 15a
      // 138: aload 0
      // 139: invokevirtual u.a ()I
      // 13c: istore 1
      // 13d: aload 0
      // 13e: iload 1
      // 13f: bipush 1
      // 140: isub
      // 141: putfield u.a I
      // 144: aload 0
      // 145: iload 1
      // 146: aload 0
      // 147: getfield u.b I
      // 14a: isub
      // 14b: putfield u.c I
      // 14e: aload 0
      // 14f: getfield u.c I
      // 152: ifge 15a
      // 155: aload 0
      // 156: bipush 0
      // 157: putfield u.c I
      // 15a: goto 37c
      // 15d: aload 0
      // 15e: dup
      // 15f: getfield u.a I
      // 162: bipush 1
      // 163: iadd
      // 164: putfield u.a I
      // 167: aload 0
      // 168: invokevirtual u.a ()I
      // 16b: istore 1
      // 16c: aload 0
      // 16d: getfield u.a I
      // 170: iload 1
      // 171: bipush 1
      // 172: isub
      // 173: if_icmple 180
      // 176: aload 0
      // 177: bipush 0
      // 178: putfield u.a I
      // 17b: aload 0
      // 17c: bipush 0
      // 17d: putfield u.c I
      // 180: aload 0
      // 181: getfield u.a I
      // 184: aload 0
      // 185: getfield u.c I
      // 188: isub
      // 189: aload 0
      // 18a: getfield u.b I
      // 18d: if_icmplt 19f
      // 190: aload 0
      // 191: aload 0
      // 192: getfield u.a I
      // 195: aload 0
      // 196: getfield u.b I
      // 199: isub
      // 19a: bipush 1
      // 19b: iadd
      // 19c: putfield u.c I
      // 19f: goto 37c
      // 1a2: iload 1
      // 1a3: bipush 2
      // 1a4: if_icmpne 1ab
      // 1a7: bipush 1
      // 1a8: goto 1ac
      // 1ab: bipush 0
      // 1ac: istore 1
      // 1ad: aload 0
      // 1ae: getfield u.a [[B
      // 1b1: ifnonnull 37a
      // 1b4: getstatic u.a [[[S
      // 1b7: aload 0
      // 1b8: getfield u.j I
      // 1bb: aaload
      // 1bc: ifnull 37a
      // 1bf: getstatic u.a [[[S
      // 1c2: aload 0
      // 1c3: getfield u.j I
      // 1c6: aaload
      // 1c7: aload 0
      // 1c8: getfield u.a I
      // 1cb: aaload
      // 1cc: ifnull 37a
      // 1cf: getstatic u.a [[[S
      // 1d2: aload 0
      // 1d3: getfield u.j I
      // 1d6: aaload
      // 1d7: aload 0
      // 1d8: getfield u.a I
      // 1db: aaload
      // 1dc: bipush 0
      // 1dd: saload
      // 1de: ifge 2a7
      // 1e1: iload 1
      // 1e2: ifeq 244
      // 1e5: aload 0
      // 1e6: getfield u.b [B
      // 1e9: aload 0
      // 1ea: getfield u.a I
      // 1ed: baload
      // 1ee: getstatic u.a [[[S
      // 1f1: aload 0
      // 1f2: getfield u.j I
      // 1f5: aaload
      // 1f6: aload 0
      // 1f7: getfield u.a I
      // 1fa: aaload
      // 1fb: bipush 1
      // 1fc: saload
      // 1fd: if_icmple 244
      // 200: aload 0
      // 201: getfield u.b [B
      // 204: aload 0
      // 205: getfield u.a I
      // 208: getstatic u.a [[[S
      // 20b: aload 0
      // 20c: getfield u.j I
      // 20f: aaload
      // 210: aload 0
      // 211: getfield u.a I
      // 214: aaload
      // 215: bipush 1
      // 216: saload
      // 217: aload 0
      // 218: getfield u.b [B
      // 21b: aload 0
      // 21c: getfield u.a I
      // 21f: baload
      // 220: getstatic u.a [[[S
      // 223: aload 0
      // 224: getfield u.j I
      // 227: aaload
      // 228: aload 0
      // 229: getfield u.a I
      // 22c: aaload
      // 22d: bipush 0
      // 22e: saload
      // 22f: iadd
      // 230: invokestatic java/lang/Math.max (II)I
      // 233: i2b
      // 234: bastore
      // 235: aload 0
      // 236: aload 0
      // 237: getfield u.a I
      // 23a: invokespecial u.c (I)V
      // 23d: aload 0
      // 23e: invokespecial u.j ()V
      // 241: goto 37c
      // 244: iload 1
      // 245: ifne 37a
      // 248: aload 0
      // 249: getfield u.b [B
      // 24c: aload 0
      // 24d: getfield u.a I
      // 250: baload
      // 251: getstatic u.a [[[S
      // 254: aload 0
      // 255: getfield u.j I
      // 258: aaload
      // 259: aload 0
      // 25a: getfield u.a I
      // 25d: aaload
      // 25e: bipush 2
      // 25f: saload
      // 260: if_icmpge 37a
      // 263: aload 0
      // 264: getfield u.b [B
      // 267: aload 0
      // 268: getfield u.a I
      // 26b: getstatic u.a [[[S
      // 26e: aload 0
      // 26f: getfield u.j I
      // 272: aaload
      // 273: aload 0
      // 274: getfield u.a I
      // 277: aaload
      // 278: bipush 2
      // 279: saload
      // 27a: aload 0
      // 27b: getfield u.b [B
      // 27e: aload 0
      // 27f: getfield u.a I
      // 282: baload
      // 283: getstatic u.a [[[S
      // 286: aload 0
      // 287: getfield u.j I
      // 28a: aaload
      // 28b: aload 0
      // 28c: getfield u.a I
      // 28f: aaload
      // 290: bipush 0
      // 291: saload
      // 292: isub
      // 293: invokestatic java/lang/Math.min (II)I
      // 296: i2b
      // 297: bastore
      // 298: aload 0
      // 299: aload 0
      // 29a: getfield u.a I
      // 29d: invokespecial u.c (I)V
      // 2a0: aload 0
      // 2a1: invokespecial u.j ()V
      // 2a4: goto 37c
      // 2a7: iload 1
      // 2a8: ifeq 30c
      // 2ab: aload 0
      // 2ac: getfield u.b [B
      // 2af: aload 0
      // 2b0: getfield u.a I
      // 2b3: baload
      // 2b4: ifgt 2c9
      // 2b7: getstatic u.a [[[S
      // 2ba: aload 0
      // 2bb: getfield u.j I
      // 2be: aaload
      // 2bf: aload 0
      // 2c0: getfield u.a I
      // 2c3: aaload
      // 2c4: arraylength
      // 2c5: bipush 2
      // 2c6: if_icmpne 30c
      // 2c9: aload 0
      // 2ca: getfield u.b [B
      // 2cd: aload 0
      // 2ce: getfield u.a I
      // 2d1: dup2
      // 2d2: baload
      // 2d3: bipush 1
      // 2d4: isub
      // 2d5: i2b
      // 2d6: bastore
      // 2d7: aload 0
      // 2d8: getfield u.b [B
      // 2db: aload 0
      // 2dc: getfield u.a I
      // 2df: baload
      // 2e0: ifge 2fd
      // 2e3: aload 0
      // 2e4: getfield u.b [B
      // 2e7: aload 0
      // 2e8: getfield u.a I
      // 2eb: getstatic u.a [[[S
      // 2ee: aload 0
      // 2ef: getfield u.j I
      // 2f2: aaload
      // 2f3: aload 0
      // 2f4: getfield u.a I
      // 2f7: aaload
      // 2f8: arraylength
      // 2f9: bipush 1
      // 2fa: isub
      // 2fb: i2b
      // 2fc: bastore
      // 2fd: aload 0
      // 2fe: aload 0
      // 2ff: getfield u.a I
      // 302: invokespecial u.c (I)V
      // 305: aload 0
      // 306: invokespecial u.j ()V
      // 309: goto 37c
      // 30c: iload 1
      // 30d: ifne 37a
      // 310: aload 0
      // 311: getfield u.b [B
      // 314: aload 0
      // 315: getfield u.a I
      // 318: baload
      // 319: getstatic u.a [[[S
      // 31c: aload 0
      // 31d: getfield u.j I
      // 320: aaload
      // 321: aload 0
      // 322: getfield u.a I
      // 325: aaload
      // 326: arraylength
      // 327: bipush 1
      // 328: isub
      // 329: if_icmplt 33e
      // 32c: getstatic u.a [[[S
      // 32f: aload 0
      // 330: getfield u.j I
      // 333: aaload
      // 334: aload 0
      // 335: getfield u.a I
      // 338: aaload
      // 339: arraylength
      // 33a: bipush 2
      // 33b: if_icmpne 37a
      // 33e: aload 0
      // 33f: getfield u.b [B
      // 342: aload 0
      // 343: getfield u.a I
      // 346: dup2
      // 347: baload
      // 348: bipush 1
      // 349: iadd
      // 34a: i2b
      // 34b: bastore
      // 34c: aload 0
      // 34d: getfield u.b [B
      // 350: aload 0
      // 351: getfield u.a I
      // 354: aload 0
      // 355: getfield u.b [B
      // 358: aload 0
      // 359: getfield u.a I
      // 35c: baload
      // 35d: getstatic u.a [[[S
      // 360: aload 0
      // 361: getfield u.j I
      // 364: aaload
      // 365: aload 0
      // 366: getfield u.a I
      // 369: aaload
      // 36a: arraylength
      // 36b: irem
      // 36c: i2b
      // 36d: bastore
      // 36e: aload 0
      // 36f: aload 0
      // 370: getfield u.a I
      // 373: invokespecial u.c (I)V
      // 376: aload 0
      // 377: invokespecial u.j ()V
      // 37a: return
      // 37b: pop
      // 37c: return
      // try (0 -> 12): 441 java/lang/Exception
      // try (13 -> 28): 441 java/lang/Exception
      // try (29 -> 48): 441 java/lang/Exception
      // try (49 -> 58): 441 java/lang/Exception
      // try (59 -> 73): 441 java/lang/Exception
      // try (74 -> 86): 441 java/lang/Exception
      // try (91 -> 440): 441 java/lang/Exception
   }

   public final void b(int var1) {
      switch (this.b) {
         case 1:
            switch (this.a.a(var1)) {
               case 0:
               case 1:
                  this.a.l();
            }
      }
   }

   private void m() {
      try {
         this.a.b("settings");
         this.a.a.writeByte(Main.e);
         this.a.a.writeBoolean(this.a.g);
         this.a.a.writeByte(this.a.a.g);
         this.a.a.writeByte(this.a.d);
         this.a.a.writeBoolean(this.a.a.c);
         this.a.a.writeByte(d.a);
         this.a.a.writeBoolean(this.a.a.b);
         this.a.a.writeByte(Main.f);
         this.a.a(true);
      } catch (Exception var1) {
      }
   }

   public final void f() {
      try {
         this.a.a("settings");
         Main.e = this.a.a.readByte();
         this.a.g = this.a.a.readBoolean();
         this.a.a.g = this.a.a.readByte();
         this.a.d = this.a.a.readByte();
         this.a.a.c = this.a.a.readBoolean();
         d.a = this.a.a.readByte();
         this.a.a.b = this.a.a.readBoolean();
         Main.f = this.a.a.readByte();
         this.a.a(false);
      } catch (Exception var1) {
      }
   }
}
