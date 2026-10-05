package com.hardwire.blob;

import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class Main extends MIDlet implements Runnable {
   public static int a;
   public static int b;
   public static int c = 1;
   public ar a;
   public u a;
   public ad a;
   public d a;
   public d b;
   private Display a;
   public byte a;
   public boolean a = false;
   private boolean l = false;
   private static boolean m = false;
   public static boolean b = false;
   public static boolean c = true;
   public static boolean d = true;
   public static boolean e = false;
   public boolean f;
   public boolean g = true;
   private int g;
   private long a;
   public int d = 2;
   private long b;
   private RecordStore a = null;
   private ByteArrayOutputStream a;
   public DataOutputStream a;
   private ByteArrayInputStream a;
   public DataInputStream a;
   public at a;
   public an a;
   public ag a;
   public byte b;
   public ag b;
   public static final int[] a = new int[]{
      1, 2, 1, 1, 0, 2, 1, 1, 2, 1, 2, 0, 6, 3, 2, 1, 2, 0, 0, 2, 3, 1, 1, 0, 1, 1, 1, 1, 0, 1, 2, 2, 3, 0, 1, 2, 1, 3, 2, 0, 2, 1, 2, 2, 0, 2, 2, 1, 2, 0, 1
   };
   public static final int[] b = new int[]{2, 10, 25, 50, 71};
   public static final int[] c = new int[]{5, 20, 35, 45, 60};
   public static final int[] d = new int[]{12, 30, 40, 55, 65};
   public static final int[] e = new int[]{
      0,
      4953,
      1758,
      0,
      0,
      0,
      3467,
      0,
      0,
      0,
      8734,
      0,
      0,
      0,
      5719,
      0,
      0,
      0,
      0,
      0,
      6187,
      0,
      0,
      0,
      0,
      0,
      4731,
      0,
      0,
      0,
      0,
      0,
      7317,
      0,
      0,
      0,
      0,
      2479,
      0,
      0,
      0,
      6729,
      0,
      0,
      0,
      9347,
      0,
      0,
      3971,
      0,
      0
   };
   public int[][] a;
   private boolean n = false;
   public static boolean h = false;
   public static int e = 5;
   public static boolean i = true;
   private boolean o;
   public static int f = 4;
   public static boolean j = true;
   public static boolean k = false;
   private Player[] a = null;
   private VolumeControl[] a = null;
   private static Class a;

   protected void startApp() {
      if (m) {
         this.d();
      } else {
         m = true;
         this.a = 2;
         this.a = new d(this);
         this.b = new d(this);
         this.a = new ad(this);
         this.a = new ar(this);
         this.a = new u(this);
         this.a = new at(this.a);
         this.a.a();
         this.a = Display.getDisplay(this);
         this.a.setCurrent(this.a);
         this.a.repaint();
         new Thread(this).start();
      }
   }

   public final int[] a(int var1, int var2) {
      boolean[][] var3 = new boolean[a.length][];
      boolean[] var4 = new boolean[a.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var3[var5] = new boolean[a[var5]];
      }

      try {
         this.a("achi");
         int var12 = this.a.readInt();
         int var6 = this.a.readInt();
         int var7 = this.a.readInt();

         for (int var8 = 0; var8 < var3.length; var8++) {
            for (int var9 = 0; var9 < var3[var8].length; var9++) {
               var3[var8][var9] = this.a.readBoolean();
            }
         }

         for (int var13 = 0; var13 < var4.length; var13++) {
            var4[var13] = this.a.readBoolean();
         }

         this.a(false);
         boolean var14;
         if (var2 == -1) {
            var14 = !var4[var1];
            var4[var1] = true;
         } else if (var14 = !var3[var1][var2]) {
            var3[var1][var2] = true;
            var7++;
         }

         this.b("achi");
         this.a.writeInt(var12);
         this.a.writeInt(var6);
         this.a.writeInt(var7);

         for (int var15 = 0; var15 < var3.length; var15++) {
            for (int var11 = 0; var11 < var3[var15].length; var11++) {
               this.a.writeBoolean(var3[var15][var11]);
            }
         }

         for (int var16 = 0; var16 < var4.length; var16++) {
            this.a.writeBoolean(var4[var16]);
         }

         this.a(true);
         if (var14) {
            for (int var17 = 0; var17 < b.length; var17++) {
               if (b[var17] == var7) {
                  return new int[]{1, var7};
               }
            }

            for (int var18 = 0; var18 < c.length; var18++) {
               if (c[var18] == var7) {
                  return new int[]{5, var7};
               }
            }

            for (int var19 = 0; var19 < d.length; var19++) {
               if (d[var19] == var7) {
                  return new int[]{4, var7};
               }
            }

            return new int[]{3, var7};
         }
      } catch (Exception var10) {
      }

      return new int[]{0, 0};
   }

   public final void a() {
      switch (this.d) {
         case 0:
            a = 160;
            b = 160;
            c = 4;
            return;
         case 1:
            a = 115;
            b = 115;
            c = 3;
            return;
         case 2:
            a = 70;
            b = 70;
            c = 2;
            return;
         case 3:
            a = 31;
            b = 31;
            c = 1;
      }
   }

   public void run() {
      if (this.a == 2 || this.a == 3) {
         for (int var1 = 0; var1 < 3; var1++) {
            this.a.e = var1;
            this.a.m();

            for (int var2 = 0; this.a == 2 && this.a.e == var1 && var2 < 60; var2++) {
               try {
                  Thread.sleep(50L);
               } catch (InterruptedException var13) {
               }
            }

            this.a.a[var1] = null;
         }

         this.a.e = 3;

         try {
            this.a.a[3] = Image.createImage("/ze_logo.png");
         } catch (IOException var12) {
         }

         this.a.m();

         for (int var18 = 0; this.a == 2 && this.a.e == 3 && var18 < 60; var18++) {
            try {
               Thread.sleep(50L);
            } catch (InterruptedException var11) {
            }
         }

         this.a.a[3] = null;
         Main var19 = this;

         try {
            var19.a = 3;
            var19.a.m();
            System.gc();
            e = !a("settings");
            var19.a.c();
            var19.a.g();
            if (!e) {
               var19.a.f();
            }

            var19.a.b(4);
            d.d();
            var19.a.e();
            var19.b.a();
            var19.a.b(10);
            ap.a = new af[5];

            for (int var3 = 0; var3 < ap.a.length; var3++) {
               byte var22 = -1;
               switch (var3) {
                  case 0:
                     var22 = 4;
                     break;
                  case 1:
                  case 4:
                     var22 = 4;
                     break;
                  case 2:
                     var22 = 4;
                     break;
                  case 3:
                     var22 = 10;
               }

               if (var3 == 3) {
                  ap.a[var3] = new af((byte)6, var22);
               } else {
                  ap.a[var3] = new af((byte)6, var22);
               }
            }

            var19.a.b(4);
            q.a(var19.a);
            var19.a.b(10);
            var19.a.a.a = var19.a.a(145);
            var19.a.b(4);
            new q(var19.a, (byte)0, (byte)0, 0, 0);
            var19.a.b(4);
            new ap(var19.a, (byte)0, 0, 0);
            var19.a.b(4);
            new ai(var19.a);
            var19.a.b(4);
            new bb(var19.a, (byte)0, new k(var19.a, (byte)0, new as(), new as(), 1), 0, 0);
            var19.a.b(4);
            Main var28 = var19;
            var19.n = false;
            var28.g();
            var19.a.g();
            var19.a.b();
            j.a("/tz." + d.a[d.a]);
            j.b("UTF-8");
            j.a().a();
            var19.a = new an(1);
            ad var4 = var19.a;
            an var29 = var19.a;
            if (var4 == null) {
               throw new NullPointerException();
            }

            synchronized (var29.a) {
               if (var29.b == null) {
                  var29.b = new Vector(1);
               }

               var29.b.addElement(var4);
            }

            var19.a.a(var19.a);
            ba var23;
            ba var10000 = var23 = new ba();
            var4 = var19.a;
            ba var30 = var10000;
            if (var4 == null) {
               throw new NullPointerException();
            }

            synchronized (var30) {
               if (var30.a == null) {
                  var30.a = new Vector(1);
               }

               var30.a.addElement(var4);
            }

            var19.a.a(var23);
            Main var37 = var19;
            an var31 = var19.a;
            if (var37 == null) {
               throw new NullPointerException();
            }

            synchronized (var31.a) {
               if (var31.a == null) {
                  var31.a = new Vector(1);
               }

               var31.a.addElement(var37);
            }

            b var24 = aj.a(var19);
            var19.a = ag.a(var19.a, var24);
            if (e) {
               var19.a.b(false);
            }

            if (!a("achi")) {
               var19.b("achi");
               var19.a.writeInt(0);
               var19.a.writeInt(0);
               var19.a.writeInt(0);

               for (int var25 = 0; var25 < a.length; var25++) {
                  for (int var32 = 0; var32 < a[var25]; var32++) {
                     var19.a.writeBoolean(false);
                  }
               }

               for (int var26 = 0; var26 < a.length; var26++) {
                  var19.a.writeBoolean(false);
               }

               var19.a(true);
            }

            var19.a.h();
            System.gc();
         } catch (Exception var17) {
         }

         var19.a();
         b = true;
         this.a = 1;
         this.a.b = 0;
         this.b();
         if (!e) {
            this.a.a();
         } else {
            String var20 = this.getAppProperty("default-lang");
            int var27 = -1;
            if (var20 != null) {
               for (int var33 = 0; var33 < d.a.length; var33++) {
                  if (var20.compareTo(d.a[var33]) == 0) {
                     var27 = var33;
                     break;
                  }
               }
            }

            if (var27 == -1) {
               this.a.a((byte)42);
            } else {
               d.a = var27;
               this.a.e();
               this.a.a();
            }
         }

         this.a = 1;
         this.a.m();

         try {
            Thread.sleep(10L);
         } catch (InterruptedException var10) {
         }
      }

      this.g = 0;
      this.f = false;

      do {
         long var21 = 0L;
         long var34 = 0L;

         do {
            try {
               this.b();
               var34 = System.currentTimeMillis();
               boolean var39 = true;
               this.o = false;
               if (!this.a.a) {
                  switch (this.a) {
                     case 0:
                        this.a.c();
                        break;
                     case 1:
                        var39 = this.a.a();
                  }
               }

               if (!this.f && var39) {
                  this.a.m();
               }

               long var6;
               if (this.a.a() && (var6 = System.currentTimeMillis()) - this.b >= 1000L) {
                  this.b = var6;
                  DeviceControl.setLights(0, 100);
               }

               var21 = System.currentTimeMillis() - var34;
               this.g++;
            } catch (Exception var8) {
            }
         } while (var21 >= this.a() && !this.f);

         long var40;
         var40 = (var40 = this.a() - var21) < 1L ? 1L : var40;

         try {
            Thread.sleep(var40);
         } catch (InterruptedException var9) {
         }
      } while (!this.f);

      this.destroyApp(true);
   }

   public final void b() {
      if (this.a) {
         while (!this.l) {
            try {
               Thread.sleep(1L);
            } catch (Exception var1) {
            }
         }

         this.a = false;
         this.a.a = true;
         this.a.m();
         this.h();
         this.g();
         if (k && !this.a) {
            this.a(12, true);
         }

         this.a.a = false;
         if (this.a == 0 && this.a.c == 0 && d) {
            this.a.a.a(-7);
         } else if (this.a == 0 && this.a.c == 6) {
            this.a.a.e = 0;
         }

         if (this.a != 1 || this.a.b != 0) {
            this.a.m();
         }
      }
   }

   private int a() {
      if (this.a == 0) {
         if (this.a.b == 1) {
            return b;
         } else if (this.a.b == 2) {
            return a;
         } else {
            return this.a.c != 6 && this.a.c != 9 && this.a.c != 5 ? 0 : b;
         }
      } else {
         return b;
      }
   }

   public final void c() {
      this.l = false;
      if (c && !this.a) {
         this.a = true;
         boolean var1 = k;
         this.c(12);
         k = var1;
         this.h();
      }

      this.a.b = true;
   }

   public final void d() {
      if (this.a) {
         this.l = true;
      }
   }

   public final void a(String var1) {
      var1 = "gi" + var1;

      try {
         this.a.closeRecordStore();
      } catch (Exception var3) {
      }

      try {
         this.a = RecordStore.openRecordStore(var1, false);
         this.a = new ByteArrayInputStream(this.a.getRecord(1));
         this.a = new DataInputStream(this.a);
      } catch (Exception var2) {
      }
   }

   public final void b(String var1) {
      var1 = "gi" + var1;

      try {
         this.a.closeRecordStore();
      } catch (Exception var4) {
      }

      try {
         RecordStore.deleteRecordStore(var1);
      } catch (RecordStoreNotFoundException var3) {
      }

      try {
         this.a = RecordStore.openRecordStore(var1, true);
         this.a = new ByteArrayOutputStream();
         this.a = new DataOutputStream(this.a);
      } catch (RecordStoreNotFoundException var2) {
      }
   }

   public final void c(String var1) {
      var1 = "gi" + var1;

      try {
         this.a.closeRecordStore();
      } catch (Exception var3) {
      }

      try {
         RecordStore.deleteRecordStore(var1);
      } catch (Exception var2) {
      }
   }

   public final void a(boolean var1) {
      try {
         if (var1) {
            this.a.flush();
            byte[] var4 = this.a.toByteArray();
            this.a.addRecord(var4, 0, var4.length);
            this.a.close();
            this.a.close();
         } else {
            this.a.close();
            this.a.close();
         }
      } catch (Exception var3) {
      }

      try {
         this.a.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   public static boolean a(String var0) {
      var0 = "gi" + var0;

      try {
         RecordStore var5;
         int var1 = (var5 = RecordStore.openRecordStore(var0, false)).getNumRecords();
         var5.closeRecordStore();
         if (var1 > 0) {
            return true;
         }

         return false;
      } catch (RecordStoreNotFoundException var2) {
      } catch (RecordStoreException var3) {
      }

      return false;
   }

   protected void pauseApp() {
      this.c();
   }

   protected void destroyApp(boolean var1) {
      this.f = true;
      Display.getDisplay(this).setCurrent(null);
      this.notifyDestroyed();
   }

   public final void a(int var1) {
      long var2 = System.currentTimeMillis();
      if (this.g && var2 - this.a > var1) {
         this.a = var2;

         try {
            this.a.vibrate(var1);
            return;
         } catch (Exception var4) {
         }
      }
   }

   public final void e() {
      as var1 = new as(-512, -512);
      as var2 = new as(32768, -512);
      as var3 = new as(-512, 32768);
      as var4 = new as(32768, 32768);
      as var5 = new as(512, -512);
      as var6 = new as(32256, -512);
      as var7 = new as(-512, 32256);
      as var8 = new as(33280, 32256);
      as var9 = new as(1024, 1024);
      as var10 = new as(-1024, 1024);
      this.a.a = new as[][]{
         {var1, var2},
         {var2, var4},
         {var4, var3},
         {var3, var1},
         {var1, var2, var4},
         {var2, var4, var3},
         {var4, var3, var1},
         {var3, var1, var2},
         {var1, var2, null, var4, var3},
         {var2, var4, null, var3, var1},
         {var1, var2, var4, var3},
         {var2, var4, var3, var1},
         {var4, var3, var1, var2},
         {var3, var1, var2, var4},
         {var1, var2, var4, var3, var1},
         {var5, var8},
         {var7, var6},
         {var8.a(var10), var5.a(var10)},
         {var6.a(var9), var7.a(var9)},
         {new as(var3.a, 14336), new as(var4.a, 14336)},
         {new as(14336, var4.b), new as(14336, var2.b)},
         {new as(var2.a, 18432), new as(var1.a, 18432)},
         {new as(18432, var1.b), new as(18432, var3.b)},
         {var5, var8, var7},
         {var8, var7, var6},
         {var8.a(var10), var5.a(var10), var6.a(var9)},
         {var5.a(var10), var6.a(var9), var7.a(var9)},
         {new as(var1.a, 15360), var1, var2, new as(var2.a, 15360), new as(var1.a, 15360)},
         {new as(8192, var1.b), new as(24576, var1.b), new as(24576, var4.b), new as(8192, var4.b), new as(8192, var1.b)}
      };
      this.a.a = new byte[this.a.d][this.a.e];

      for (int var11 = 0; var11 < this.a.d; var11++) {
         for (int var12 = 0; var12 < this.a.e; var12++) {
            this.a(var11, var12);
         }
      }
   }

   public final void a(int var1, int var2) {
      byte[][] var3 = this.a.a;
      byte var4;
      if ((var4 = this.a(var1, var2)) == 0) {
         if (!ar.a[this.a.a[1][var1][var2]]) {
            this.a.a[0][var1][var2] = -1;
         }
      } else {
         if (this.a.a[0][var1][var2] == -1 && this.a.b != 93) {
            this.a.a[0][var1][var2] = 11;
         }

         if (this.a.a.a != 0 && this.a.a[0][var1][var2] == 11) {
            this.a.a[0][var1][var2] = 51;
         }
      }

      label289: {
         switch (var4) {
            case -1:
               var3[var1][var2] = -1;
               return;
            case 0:
               var4 = 0;
               byte var5 = this.a(var1 - 1, var2);
               byte var6 = this.a(var1 + 1, var2);
               byte var7 = this.a(var1, var2 - 1);
               int var8 = this.a(var1, var2 + 1);
               if (var5 == 0) {
                  var4++;
               }

               if (var6 == 0) {
                  var4++;
               }

               if (var7 == 0) {
                  var4++;
               }

               if (var8 == 0) {
                  var4++;
               }

               switch (var4) {
                  case 0:
                     break label289;
                  case 1:
                     if (var5 == 0) {
                        var3[var1][var2] = 10;
                        return;
                     } else if (var7 == 0) {
                        var3[var1][var2] = 11;
                        return;
                     } else {
                        if (var6 == 0) {
                           var3[var1][var2] = 12;
                        } else {
                           if (var8 != 0) {
                              return;
                           }

                           var3[var1][var2] = 13;
                        }

                        return;
                     }
                  case 2:
                     if (var7 != 0 && var6 != 0) {
                        var3[var1][var2] = (byte)(this.a(var1 - 1, var2 + 1) == -1 ? 14 : 4);
                        return;
                     } else if (var6 != 0 && var8 != 0) {
                        var3[var1][var2] = (byte)(this.a(var1 - 1, var2 - 1) == -1 ? 14 : 5);
                        return;
                     } else if (var8 != 0 && var5 != 0) {
                        var3[var1][var2] = (byte)(this.a(var1 + 1, var2 - 1) == -1 ? 14 : 6);
                        return;
                     } else if (var5 != 0 && var7 != 0) {
                        var3[var1][var2] = (byte)(this.a(var1 + 1, var2 + 1) == -1 ? 14 : 7);
                        return;
                     } else {
                        if (var7 != 0 && var8 != 0) {
                           var3[var1][var2] = 8;
                        } else {
                           if (var5 == 0 || var6 == 0) {
                              return;
                           }

                           var3[var1][var2] = 9;
                        }

                        return;
                     }
                  case 3:
                     if (var7 != 0) {
                        var6 = this.a(var1 + 1, var2 + 1);
                        if ((var7 = this.a(var1 - 1, var2 + 1)) == -1 && var6 == -1) {
                           break label289;
                        }

                        if (var7 == -1) {
                           var3[var1][var2] = 12;
                           return;
                        } else {
                           if (var6 == -1) {
                              var3[var1][var2] = 10;
                           } else {
                              var3[var1][var2] = 0;
                           }

                           return;
                        }
                     } else if (var6 != 0) {
                        byte var11 = this.a(var1 - 1, var2 - 1);
                        var7 = this.a(var1 - 1, var2 + 1);
                        if (var11 == -1 && var7 == -1) {
                           break label289;
                        }

                        if (var11 == -1) {
                           var3[var1][var2] = 13;
                           return;
                        } else {
                           if (var7 == -1) {
                              var3[var1][var2] = 11;
                           } else {
                              var3[var1][var2] = 1;
                           }

                           return;
                        }
                     } else if (var8 != 0) {
                        var5 = this.a(var1 + 1, var2 - 1);
                        byte var12 = this.a(var1 - 1, var2 - 1);
                        if (var5 == -1 && var12 == -1) {
                           break label289;
                        }

                        if (var5 == -1) {
                           var3[var1][var2] = 10;
                           return;
                        } else {
                           if (var12 == -1) {
                              var3[var1][var2] = 12;
                           } else {
                              var3[var1][var2] = 2;
                           }

                           return;
                        }
                     } else {
                        if (var5 == 0) {
                           return;
                        }

                        var5 = this.a(var1 + 1, var2 - 1);
                        var6 = this.a(var1 + 1, var2 + 1);
                        if (var5 == -1 && var6 == -1) {
                           break label289;
                        }

                        if (var5 == -1) {
                           var3[var1][var2] = 13;
                           return;
                        } else {
                           if (var6 == -1) {
                              var3[var1][var2] = 11;
                           } else {
                              var3[var1][var2] = 3;
                           }

                           return;
                        }
                     }
                  case 4:
                     byte var10 = this.a(var1 - 1, var2 - 1);
                     var5 = this.a(var1 + 1, var2 - 1);
                     var6 = this.a(var1 + 1, var2 + 1);
                     var7 = this.a(var1 - 1, var2 + 1);
                     var8 = 0;
                     if (var10 == -1) {
                        var8++;
                     }

                     if (var5 == -1) {
                        var8++;
                     }

                     if (var6 == -1) {
                        var8++;
                     }

                     if (var7 == -1) {
                        var8++;
                     }

                     if (var8 >= 3) {
                        return;
                     }

                     if (var10 == -1 && var5 == -1) {
                        var3[var1][var2] = 13;
                        return;
                     } else if (var5 == -1 && var6 == -1) {
                        var3[var1][var2] = 10;
                        return;
                     } else if (var6 == -1 && var7 == -1) {
                        var3[var1][var2] = 11;
                        return;
                     } else if (var7 == -1 && var10 == -1) {
                        var3[var1][var2] = 12;
                        return;
                     } else if ((var10 != -1 || var6 != -1) && (var5 != -1 || var7 != -1)) {
                        if (var10 == -1) {
                           var3[var1][var2] = 7;
                           return;
                        } else if (var5 == -1) {
                           var3[var1][var2] = 4;
                           return;
                        } else if (var6 == -1) {
                           var3[var1][var2] = 5;
                           return;
                        } else {
                           if (var7 == -1) {
                              var3[var1][var2] = 6;
                           } else {
                              var3[var1][var2] = -1;
                           }

                           return;
                        }
                     } else {
                        var3[var1][var2] = 14;
                        return;
                     }
                  default:
                     return;
               }
            case 1:
               switch (this.a.a[1][var1][var2]) {
                  case 1:
                  case 16:
                  case 37:
                  case 68:
                     var3[var1][var2] = (byte)(this.a(var1, var2 + 1) != 0 ? 23 : 15);
                     return;
                  case 2:
                  case 17:
                  case 38:
                  case 67:
                     var3[var1][var2] = (byte)(this.a(var1, var2 + 1) != 0 ? 24 : 16);
                     return;
                  case 3:
                  case 39:
                  case 55:
                     var3[var1][var2] = (byte)(this.a(var1, var2 - 1) != 0 ? 25 : 17);
                     return;
                  case 4:
                  case 40:
                  case 57:
                     var3[var1][var2] = (byte)(this.a(var1, var2 - 1) != 0 ? 26 : 18);
                     return;
                  case 5:
                  case 6:
                  case 8:
                  case 9:
                  case 13:
                  case 14:
                  case 15:
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
                  case 35:
                  case 36:
                  case 41:
                  case 42:
                  case 43:
                  case 44:
                  case 45:
                  case 46:
                  case 47:
                  case 48:
                  case 49:
                  case 50:
                  case 51:
                  case 52:
                  case 53:
                  case 54:
                  case 56:
                  case 58:
                  case 59:
                  case 61:
                  case 62:
                  case 63:
                  case 64:
                  case 65:
                  case 66:
                  default:
                     break;
                  case 7:
                     var3[var1][var2] = 19;
                     return;
                  case 10:
                  case 11:
                  case 12:
                     var3[var1][var2] = (byte)(10 + this.a.a[1][var1][var2]);
                     return;
                  case 60:
                     var3[var1][var2] = 27;
                     return;
                  case 69:
                     var3[var1][var2] = 28;
               }
         }

         return;
      }

      var3[var1][var2] = 14;
   }

   public final byte a(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.a.d && var2 < this.a.e) {
         switch (this.a.a[1][var1][var2]) {
            case -1:
            case 8:
            case 9:
            case 13:
            case 43:
            case 70:
               return -1;
            case 0:
            case 5:
            case 6:
            case 14:
            case 15:
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
            case 35:
            case 36:
            case 41:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 58:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            default:
               return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            case 37:
            case 38:
            case 39:
            case 40:
            case 55:
            case 57:
            case 60:
            case 67:
            case 68:
            case 69:
               return 1;
         }
      } else {
         return 0;
      }
   }

   private static s a(am var0, as var1) {
      long var2 = Long.MAX_VALUE;
      int var6 = -1;

      for (int var7 = 0; var7 < var0.a.length; var7++) {
         long var4;
         if ((var4 = var1.b(var0.a[var7].a).d()) < var2 && var4 <= 8192L) {
            var6 = var7;
            var2 = var4;
         }
      }

      return var6 == -1 ? null : var0.a[var6];
   }

   public final DataInputStream a(String var1) {
      try {
         DataInputStream var2 = null;
         var2 = null;
         if ((var2 = a("/" + var1 + ".lvl")) == null) {
            return null;
         }

         var2 = new DataInputStream(var2);
         this.a.e();
         this.a.d = var2.readByte() & 255;
         this.a.e = var2.readByte() & 255;
         this.a.a.b = this.a.a.a;
         this.a.a.a = var2.readByte();
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }

   public final void a(DataInputStream var1) {
      try {
         this.a.a(468 + this.a.a.a);
         if (this.a.b == 112) {
            for (int var2 = 0; var2 < 4; var2++) {
               this.a.a(var2 + 531);
            }
         }

         int var29 = var1.readByte();
         int var3 = var1.readByte();
         int var4 = var29 + var3;
         int var5 = 0;
         int[][] var6 = new int[var4][3];

         for (int var7 = 0; var7 < var4; var7++) {
            var6[var7][0] = var1.readByte() & 255;
            var6[var7][1] = var1.readByte() & 255;
            var6[var7][2] = var1.readByte() & 255;
            if (var6[var7][2] - 2 == 2) {
               var3 += 3;
            } else if (var6[var7][2] - 2 == 5) {
               var3 += 10;
            } else if (var6[var7][2] == 1) {
               var5++;
            }
         }

         this.a.a = new q[(this.a.b == 1 ? 1 : var5) + var29 - var5];
         this.a.a = new ai[var3];
         var3 = 0;
         int var53 = 0;
         var29 = 0;
         var5 = 0;

         for (int var8 = 0; var8 < var4; var8++) {
            switch (var6[var8][2]) {
               case 1:
                  if (this.a.b != 1 || var5 == 0) {
                     this.a.a[var29] = new q(this.a, (byte)(var5 == 0 ? 0 : 1), (byte)0, (var6[var8][0] << 5) - 16, (this.a.e - var6[var8][1] << 5) + 16);
                     this.a.a[var29].b = var29++;
                     var5++;
                  }
                  break;
               case 5:
                  this.a.a[var29] = new q(
                     this.a, (byte)1, (byte)(this.a.b == 90 ? 1 : (this.a.b == 133 ? 3 : 2)), (var6[var8][0] << 5) - 16, (this.a.e - var6[var8][1] << 5) + 16
                  );
                  this.a.a[var29].b = var29++;
                  break;
               default:
                  byte var9 = (byte)(var6[var8][2] - 2);
                  int var10 = 0;
                  if (var9 != 2 && var9 != 5) {
                     var10 = var3++;
                  } else {
                     var10 = this.a.a.length - 1 - var53++;
                  }

                  this.a.a[var10] = new ai(this.a);
                  this.a.a[var10].a(var9, new as((var6[var8][0] << 15) - 16384, (this.a.e - var6[var8][1] << 15) + 16384), true);
                  ai.a(this.a, ai.a[var9]);
                  if (var9 == 2) {
                     ai.a(this.a, ai.a[0]);
                  } else if (var9 == 5) {
                     ai.a(this.a, ai.a[6]);
                  }
            }
         }

         for (int var56 = var3; var56 < this.a.a.length; var56++) {
            if (this.a.a[var56] == null) {
               this.a.a[var56] = new ai(this.a);
               this.a.a[var56].d = 0;
            }
         }

         int var57 = var1.readByte() & 255;
         this.a.a = new ap[var57];
         am[][] var60 = new am[this.a.d][this.a.e];

         for (int var62 = 0; var62 < var57; var62++) {
            var29 = (var1.readByte() & 255) - 1;
            var3 = this.a.e - (var1.readByte() & 255);
            var4 = (var1.readByte() & 255) - 1;
            this.a.a[var62] = new ap(this.a, (byte)var4, var29, var3);
            this.a.a[var62].a();
            am var46 = this.a.a[var62].a;
            switch (var4) {
               case 0:
               case 5:
                  var60[var29][var3] = var46;
                  break;
               case 1:
               case 2:
                  var60[var29][var3] = var46;
                  var60[var29 + 1][var3] = var46;
                  var60[var29 + 2][var3] = var46;
                  break;
               case 3:
               case 6:
                  var60[var29][var3] = var46;
                  var60[var29][var3 - 1] = var46;
                  var60[var29][var3 - 2] = var46;
                  break;
               case 4:
                  var60[var29][var3] = var46;
                  var60[var29][var3 - 1] = var46;
                  var60[var29 + 1][var3] = var46;
                  var60[var29 + 1][var3 - 1] = var46;
                  break;
               case 7:
                  var60[var29][var3] = var46;
                  var60[var29 + 1][var3] = var46;
                  break;
               case 8:
                  var60[var29][var3] = var46;
                  var60[var29 + 1][var3] = var46;
                  var60[var29 + 2][var3] = var46;
                  var60[var29 + 3][var3] = var46;
               case 9:
               case 10:
               default:
                  break;
               case 11:
                  for (int var50 = 0; var50 < 8; var50++) {
                     var60[var29 + var50][var3] = var46;
                  }
            }
         }

         this.a.d = new boolean[this.a.d];
         this.a.c = new boolean[this.a.e];
         int var63 = var1.readByte() & 255;
         this.a.a = new bb[var63];
         var63 = 0;
         var29 = var1.readByte() & 255;
         this.a.a = new k[var29];

         for (int var40 = 0; var40 < var29; var40++) {
            var4 = var1.readByte() - 1;
            byte var47 = var1.readByte();
            byte var51 = var1.readByte();
            as var54 = new as((var1.readByte() & 255) - 1 << 15, this.a.e - (var1.readByte() & 255) << 15);
            as var58 = new as((var1.readByte() & 255) - 1 << 15, this.a.e - (var1.readByte() & 255) << 15);
            this.a.a[var40] = new k(this.a, (byte)var4, var54, var58, var47);
            if (var51 == 0) {
               this.a.a[var40].a((byte)0, 0);
            } else if (var51 == 5) {
               this.a.a[var40].a((byte)1, 0);
            } else {
               this.a.a[var63] = new bb(this.a, (byte)var51, this.a.a[var40], (var1.readByte() & 255) - 1, this.a.e - (var1.readByte() & 255));
               this.a.d[this.a.a[var63].a] = true;
               this.a.c[this.a.a[var63].b] = true;
               var63++;
            }
         }

         var3 = var1.readByte() & 255;
         Vector var44 = new Vector();
         as var52 = new as();
         as var55 = new as();
         int[][] var59 = new int[][]{{-1, -1}, {1, -1}, {1, 1}, {-1, 1}, {0, 0}};
         am var11 = null;

         for (int var15 = 0; var15 < var3; var15++) {
            int var16 = (var29 = var1.readByte() & 255) >> 4;
            int var17 = var29 & 15;
            s var65 = null;
            int[][] var18 = new int[var17][3];

            for (int var19 = 0; var19 < var17; var19++) {
               var18[var19][1] = (var1.readByte() & 255) - 1;
               var18[var19][2] = this.a.e - (var1.readByte() & 255);
               var18[var19][0] = var1.readByte();
            }

            for (int var81 = 0; var81 < var17; var81++) {
               s var34 = null;
               int var20 = var18[var81][0];
               var5 = var18[var81][1];
               int var12 = var18[var81][2];
               var52.a = var5 << 5;
               var52.b = var12 << 5;
               int var13 = var59[var20][0];
               int var14 = var59[var20][1];
               switch (var20) {
                  case 1:
                     var52.a += 32;
                     break;
                  case 2:
                     var52.a += 32;
                     var52.b += 32;
                     break;
                  case 3:
                     var52.b += 32;
                     break;
                  case 4:
                     var52.a += 16;
                     var52.b += 16;
               }

               var52.a <<= 10;
               var52.b <<= 10;
               if (var81 == 0 || var81 == var17 - 1) {
                  am var85 = null;
                  if (var60[var5][var12] != null && (var34 = a(var60[var5][var12], var52)) != null) {
                     var85 = var60[var5][var12];
                  }

                  if (var34 == null && var60[var5 + var13][var12] != null && (var34 = a(var60[var5 + var13][var12], var52)) != null) {
                     var85 = var60[var5 + var13][var12];
                  }

                  if (var34 == null && var60[var5 + var13][var12 + var14] != null && (var34 = a(var60[var5 + var13][var12 + var14], var52)) != null) {
                     var85 = var60[var5 + var13][var12 + var14];
                  }

                  if (var34 == null && var60[var5][var12 + var14] != null && (var34 = a(var60[var5][var12 + var14], var52)) != null) {
                     var85 = var60[var5][var12 + var14];
                  }

                  if (var81 == 0) {
                     if (var85 == null) {
                        var5 = var18[var17 - 1][1];
                        var12 = var18[var17 - 1][2];
                        var13 = var59[var18[var17 - 1][0]][0];
                        var14 = var59[var18[var17 - 1][0]][1];
                        if (var60[var5][var12] != null) {
                           var85 = var60[var5][var12];
                        } else if (var60[var5 + var13][var12] != null) {
                           var85 = var60[var5 + var13][var12];
                        } else if (var60[var5 + var13][var12 + var14] != null) {
                           var85 = var60[var5 + var13][var12 + var14];
                        } else if (var60[var5][var12 + var14] != null) {
                           var85 = var60[var5][var12 + var14];
                        }
                     }

                     var11 = var85;
                     if (var12 - 1 >= 0) {
                        var11.a(var60[var5][var12 - 1]);
                        if (var5 - 1 >= 0) {
                           var11.a(var60[var5 - 1][var12 - 1]);
                        }

                        if (var5 + 1 < this.a.d) {
                           var11.a(var60[var5 + 1][var12 - 1]);
                        }
                     }
                  } else if (var85 != null && var85 != var11) {
                     var85.a(var11);
                     var11.a(var85);
                  }
               }

               if (var81 >= 1) {
                  t var49 = null;
                  if (var65 == null && var34 == null) {
                     if (var81 == 1) {
                        (var34 = new s(new as(var52), 1024)).b |= 32;
                        var11.a(var34);
                        var49 = new t(var34, new as(var55), ar.a[var16], ar.b[var16], ar.c[var16]);
                     }
                  } else if (var34 == null) {
                     if (var81 == var17 - 1) {
                        as var86 = new as(var52);
                        var49 = new t(var65, var86, ar.a[var16], ar.b[var16], ar.c[var16]);

                        for (int var66 = 0; var66 < this.a.a.length; var66++) {
                           if (y.a(this.a.a[var66].a.a(), var86)) {
                              this.a.a[var66].a.b(var86);
                              break;
                           }
                        }
                     } else {
                        (var34 = new s(new as(var52), 1024)).b |= 32;
                        var11.a(var34);
                        var49 = new t(var65, var34, ar.a[var16], ar.b[var16], ar.c[var16]);
                     }
                  } else if (var65 == null) {
                     var49 = new t(var34, new as(var55), ar.a[var16], ar.b[var16], ar.c[var16]);
                  } else {
                     var49 = new t(var65, var34, ar.a[var16], ar.b[var16], ar.c[var16]);
                  }

                  if (var16 == 1) {
                     var49.a = 1;
                  }

                  var44.addElement(var49);
                  t var67 = var49;
                  var11.b.addElement(var67);
               }

               var65 = var34;
               var55.c(var52);
            }
         }

         int var70 = var44.size();
         this.a.a = new t[var70];

         for (int var35 = 0; var35 < var70; var35++) {
            this.a.a[var35] = (t)var44.elementAt(var35);
         }

         var44.removeAllElements();

         for (int var36 = 0; var36 < this.a.a.length; var36++) {
            this.a.a[var36].a.b();
         }

         System.gc();
         boolean var37 = d.a(d.a, this.a.b) != -1;
         this.a = null;
         if (var37) {
            this.a = new int[a[d.a(d.a, this.a.b)]][2];
         }

         this.a.l = 0;
         this.a.a = new byte[3][this.a.d][this.a.e];

         for (int var72 = 0; var72 < this.a.d; var72++) {
            for (int var75 = this.a.e - 1; var75 >= 0; var75--) {
               for (int var77 = 0; var77 < 3; var77++) {
                  byte var82 = var1.readByte();
                  this.a.a[var77][var72][var75] = (byte)((var82 & 255) - 1);
                  byte var87;
                  if ((var87 = this.a.a[var77][var72][var75]) != -1) {
                     this.a.a(ac.a[var77] + var87);
                  }
               }

               if (this.a.a[1][var72][var75] == 43) {
                  if (var37) {
                     this.a[this.a.l][0] = var72;
                     this.a[this.a.l][1] = var75;
                  }

                  this.a.l++;
               }

               if (this.a.a[1][var72][var75] == 70 && var37) {
                  if (this.a.b != 1) {
                     this.a.a[1][var72][var75] = -1;
                  } else {
                     this.a("achi");
                     this.a.readInt();
                     this.a.readInt();
                     this.a.readInt();

                     for (int var78 = 0; var78 < a.length; var78++) {
                        for (int var83 = 0; var83 < a[var78]; var83++) {
                           this.a.readBoolean();
                        }
                     }

                     int var79 = d.a(d.a, this.a.b);

                     for (int var84 = 0; var84 < a.length; var84++) {
                        boolean var88 = this.a.readBoolean();
                        if (var84 == var79 && var88) {
                           this.a.a[1][var72][var75] = -1;
                           break;
                        }
                     }

                     this.a(false);
                  }
               }
            }
         }

         var70 = this.b.a.length;

         for (int var73 = 0; var73 < var70; var73++) {
            this.b.a[var73] = false;
         }

         this.a.f = new boolean[this.a.d];
         this.a.e = new boolean[this.a.e];
         this.a.c = var1.readByte() & 255;
         this.a.a = new short[this.a.c][3];

         for (int var74 = 0; var74 < this.a.c; var74++) {
            this.a.a[var74][0] = (short)((var1.readByte() & 255) - 1);
            this.a.a[var74][1] = (short)(this.a.e - (var1.readByte() & 255));
            this.a.a[var74][2] = (short)((var1.readByte() & 255) - 1);
            this.a.f[this.a.a[var74][0]] = true;
            this.a.e[this.a.a[var74][1]] = true;
            this.b.a[this.a.a[var74][2]] = true;
            short var76 = ac.a[this.a.a[var74][2]];

            for (int var80 = 0; var80 <= 11; var80++) {
               if ((var76 & 1 << var80) != 0) {
                  this.a.a(256 + ac.b[var80]);
                  this.a.a(256 + ac.c[var80] + 8);
               }
            }
         }
      } catch (Exception var27) {
      } finally {
         try {
            var1.close();
         } catch (Exception var26) {
         }
      }

      if (this.a.b == 107) {
         this.a.a(471);
      }

      this.a.d();
      ai.a(this.a);
      q.a(this.a);
      this.b.c();
   }

   public static InputStream a(String var0) {
      return (a == null ? (a = a("com.hardwire.blob.Main")) : a).getResourceAsStream(var0);
   }

   private void g() {
      if (!this.n) {
         if (this.a == null) {
            this.a = new Player[13];
            this.a = new VolumeControl[this.a.length];
         }

         for (int var1 = 0; var1 < this.a.length; var1++) {
            this.a[var1] = null;
            this.d(var1);
            if (!b) {
               this.a.b(4);
            }
         }

         this.n = true;
      }
   }

   private void d(int var1) {
      if (var1 < this.a.length) {
         String var2 = "";
         switch (var1) {
            case 0:
               var2 = "/sound/gishhit";
               break;
            case 1:
               var2 = "/sound/tarball";
               break;
            case 2:
               var2 = "/sound/amber";
               break;
            case 3:
               var2 = "/sound/CLICK015";
               break;
            case 4:
               var2 = "/sound/squish";
               break;
            case 5:
               var2 = "/sound/switch";
               break;
            case 6:
               var2 = "/sound/blockbreak";
               break;
            case 7:
               var2 = "/sound/splash";
               break;
            case 8:
               var2 = "/sound/necksnap";
               break;
            case 9:
               var2 = "/sound/ropebreak";
               break;
            case 10:
               var2 = "/sound/bobattack";
               break;
            case 11:
               var2 = "/sound/visattack";
               break;
            case 12:
               var2 = "/sound/sewer.mp3";
         }

         if (var1 != 12) {
            var2 = var2 + ".wav";
         }

         InputStream var3 = null;

         try {
            var3 = a(var2);
         } catch (Exception var8) {
         }

         try {
            if (var1 == 12) {
               this.a[var1] = Manager.createPlayer(var3, "audio/mpeg");
            } else {
               this.a[var1] = Manager.createPlayer(var3, "audio/x-wav");
            }
         } catch (Exception var7) {
         }

         try {
            this.a[var1].realize();
         } catch (Exception var6) {
         }

         try {
            this.a[var1].prefetch();
         } catch (Exception var5) {
         }

         try {
            var3.close();
         } catch (Exception var4) {
         }
      }
   }

   private void h() {
      if (this.n) {
         if (this.a != null) {
            for (int var1 = 0; var1 < this.a.length; var1++) {
               if (this.a[var1] != null) {
                  try {
                     this.a[var1].close();
                  } catch (Exception var2) {
                  }

                  this.a[var1] = null;
               }
            }

            this.n = false;
         }
      }
   }

   public final boolean a(int var1) {
      try {
         return this.a[12].getState() == 400;
      } catch (Exception var2) {
         return false;
      }
   }

   public final void a(int var1, boolean var2) {
      try {
         if (var1 == 12) {
            if (!j) {
               return;
            }

            if (f == 0) {
               return;
            }

            k = true;
            if (this.a[var1].getState() == 400) {
               return;
            }
         } else {
            if (!i || !h) {
               return;
            }

            if (this.o) {
               return;
            }

            if (e == 0) {
               return;
            }

            if (var1 >= this.a.length) {
               switch (var1) {
                  case 3:
                     var1 = 1;
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  default:
                     break;
                  case 8:
                     var1 = 4;
                     break;
                  case 9:
                     var1 = 6;
                     break;
                  case 10:
                     return;
                  case 11:
                     var1 = 0;
               }
            }

            if (var1 >= this.a.length) {
               return;
            }

            if (this.a[var1] == null) {
               return;
            }

            boolean var3 = false;

            for (int var4 = var1; var4 == var1; var4++) {
               if (var4 != 12 && this.a[var4].getState() == 400) {
                  var3 = true;
               }
            }

            if (var3) {
               return;
            }
         }

         try {
            if (this.a[var1] == null || this.a[var1].getState() == 0) {
               this.a[var1] = null;
               this.a[var1] = null;
               this.d(var1);
            }
         } catch (Exception var8) {
         }

         try {
            if (this.a[var1].getState() != 300) {
               this.a[var1].prefetch();
            }
         } catch (Exception var7) {
         }

         this.b(var1);

         try {
            this.a[var1].setLoopCount(var2 ? -1 : 1);
         } catch (Exception var6) {
         }

         try {
            this.a[var1].start();
            if (var1 != 12) {
               this.o = true;
            }
         } catch (Exception var5) {
            return;
         }
      } catch (Exception var9) {
      }
   }

   public final void b(int var1) {
      if (this.a[var1] == null) {
         try {
            this.a[var1] = (VolumeControl)this.a[var1].getControl("VolumeControl");
         } catch (Exception var3) {
         }
      }

      if (this.a[var1] != null) {
         try {
            if (var1 != 12) {
               this.a[var1].setLevel(e * 10);
               return;
            }

            this.a[var1].setLevel(f * 10);
         } catch (Exception var2) {
         }
      }
   }

   public final void c(int var1) {
      k = false;
      boolean var4 = false;

      try {
         var4 = this.a[12].getState() == 400;
      } catch (Exception var3) {
      }

      try {
         if (var4) {
            this.a[12].stop();
         }
      } catch (Exception var2) {
      }
   }

   public final void f() {
      this.b = this.a;
      if (this.b.a().a == 0) {
         this.b = this.a;
         this.a.c = this.a.a;
         ((m)this.b.a()).a();
         this.a.e();
         this.a = 1;
      }
   }

   private static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var1) {
         throw new NoClassDefFoundError(var1.getMessage());
      }
   }
}
