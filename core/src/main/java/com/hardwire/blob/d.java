package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d {
   public static int a = 0;
   private static final String[] c = new String[]{"english", "deutsch", "français", "español", "italiano", "čeština"};
   public static final String[] a = new String[]{"en", "de", "fr", "es", "it", "cz"};
   public static byte[][] a;
   public static final short[] a = new short[]{
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      91,
      92,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      123,
      124,
      125,
      126,
      127,
      128,
      129,
      130,
      131,
      132,
      133,
      134
   };
   public static final short[] b = new short[]{139, 140, 141, 142, 143};
   public static final short[] c = new short[]{
      73,
      74,
      75,
      76,
      78,
      79,
      80,
      81,
      82,
      83,
      85,
      86,
      87,
      88,
      89,
      91,
      92,
      104,
      105,
      106,
      108,
      109,
      110,
      111,
      113,
      114,
      115,
      116,
      118,
      119,
      120,
      121,
      122,
      124,
      125,
      126,
      127,
      129,
      130,
      131,
      132,
      134
   };
   public static final short[] d = new short[]{
      42, 63, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 188, 189
   };
   public static final short[] e = new short[]{46, 72, 184, 185, 186, 187, 190, 191, 192, 193};
   public static final short[] f = new short[]{47, 96, 194, 195, 196, 197, 198, 199, 200, 201};
   public static final short[] g = new short[]{
      42,
      63,
      161,
      162,
      163,
      164,
      165,
      166,
      167,
      168,
      169,
      170,
      171,
      172,
      173,
      174,
      175,
      176,
      177,
      178,
      179,
      180,
      181,
      182,
      183,
      188,
      189,
      46,
      72,
      184,
      185,
      186,
      187,
      190,
      191,
      192,
      193,
      47,
      96,
      194,
      195,
      196,
      197,
      198,
      199,
      200,
      201,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      91,
      92,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      123,
      124,
      125,
      126,
      127,
      128,
      129,
      130,
      131,
      132,
      133,
      134,
      139,
      140,
      141,
      142,
      143,
      93,
      -111,
      -222
   };
   public static final String[] b = new String[]{
      "c0",
      "c1",
      "c2",
      "c3",
      "c4",
      "c5",
      "c6",
      "c7",
      "c8",
      "c9",
      "c10",
      "c11",
      "c12",
      "c13",
      "c14",
      "c15",
      "c16",
      "c17",
      "c18",
      "c19",
      "c20",
      "c21",
      "c22",
      "c23",
      "c24",
      "c25",
      "c26",
      "d0",
      "d1",
      "d2",
      "d3",
      "d4",
      "d5",
      "d6",
      "d7",
      "d8",
      "d9",
      "r0",
      "r1",
      "r2",
      "r3",
      "r4",
      "r5",
      "r6",
      "r7",
      "r8",
      "r9",
      "s0",
      "s1",
      "s2",
      "s3",
      "s4",
      "s5",
      "s6",
      "s7",
      "s8",
      "s9",
      "s10",
      "s11",
      "s12",
      "s13",
      "s14",
      "s15",
      "s16",
      "s17",
      "s18",
      "e0",
      "e1",
      "e2",
      "e3",
      "e4",
      "e5",
      "e6",
      "e7",
      "e8",
      "e9",
      "e10",
      "e11",
      "e12",
      "e13",
      "e14",
      "e15",
      "h0",
      "h1",
      "h2",
      "h3",
      "h4",
      "h5",
      "h6",
      "h7",
      "h8",
      "h9",
      "h10",
      "h11",
      "h12",
      "h13",
      "h14",
      "h15",
      "pl0",
      "pl1",
      "pl2",
      "pl3",
      "pl4",
      "i",
      "train2",
      "ai0"
   };
   public boolean[] a;
   private static char[][] a = new char[][]{
      {'e', 'ˇ'},
      {'s', 'ˇ'},
      {'c', 'ˇ'},
      {'r', 'ˇ'},
      {'z', 'ˇ'},
      {'y', '´'},
      {'a', '´'},
      {'i', '´'},
      {'e', '´'},
      {'u', '´'},
      {'u', '°'},
      {'d', 'ˇ'},
      {'t', 'ˇ'},
      {'n', 'ˇ'},
      {'a', '¨'},
      {'a', '°'},
      {'a', '§'},
      {'o', '¨'},
      {'e', '`'},
      {'a', '`'},
      {'e', '§'},
      {'u', '¨'},
      {'u', '§'},
      {'u', '`'},
      {'o', '§'},
      {'o', '´'},
      {'o', '`'},
      {'i', '`'},
      {'i', '§'},
      {'n', '˜'},
      {'\''},
      {'\''},
      {'\''}
   };
   private static String[] d = new String[]{
      "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_ˇ§¨°´`˜¿¡ßç",
      "013",
      "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_ˇ§¨°´`˜¿¡ßç",
      "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_ˇ§¨°´`˜¿¡ßç",
      "abcdefghijklmnopqrstuvwxyz0123456789.,:;'\"!?/()#@*-_ˇ§¨°´`˜¿¡ßç"
   };
   private static String[] e = new String[]{"ˇ´`§°¨˜", "", "ˇ´`§°¨˜", "ˇ´`§°¨˜", "ˇ´`§°¨˜"};
   private static int[] a = new int[]{5, 1, 5, 3};
   private static final int[] b = new int[]{
      17,
      17,
      17,
      17,
      17,
      17,
      17,
      17,
      9,
      17,
      17,
      17,
      25,
      17,
      17,
      17,
      17,
      17,
      17,
      21,
      17,
      17,
      25,
      19,
      17,
      17,
      17,
      11,
      17,
      17,
      17,
      17,
      17,
      17,
      17,
      17,
      9,
      9,
      9,
      9,
      9,
      18,
      9,
      17,
      21,
      13,
      13,
      25,
      21,
      15,
      17,
      17,
      17,
      17,
      17,
      9,
      16,
      16,
      17,
      17,
      9,
      19,
      17
   };
   private static int[][] a;
   private static int[] c = new int[]{17, 6, 17, 11};
   private static int[] d = new int[]{-1, 1, -1, 0};
   private static Main a;
   private static Image[] a;
   private static int[] e;
   private static int[][] b;
   private static int[][] c;
   private static boolean[][] a;
   private byte[][] b;
   private byte[][][] a;
   private byte[] a;

   public static int a(int var0) {
      if (a.a.e == 0) {
         for (int var1 = 0; var1 < a.length - 1; var1++) {
            if (a[var1] == var0) {
               return a[var1 + 1];
            }
         }
      } else {
         for (int var2 = 0; var2 < d.length - 1; var2++) {
            if (d[var2] == var0) {
               return d[var2 + 1];
            }
         }
      }

      return -1;
   }

   public static int a(short[] var0, int var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   private void a(boolean[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2]) {
            this.a[var2] = 3;
         }
      }

      this.a[13] = 3;
      this.a[155] = this.a[156] = this.a[157] = 3;
   }

   private static boolean[] a(int var0) {
      boolean[] var1 = new boolean[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = false;
      }

      var1[8] = true;
      var1[28] = true;
      var1[20] = true;
      var1[21] = true;
      var1[22] = true;
      var1[23] = true;
      var1[30] = true;
      var1[31] = true;
      var1[49] = true;
      var1[55] = true;
      var1[56] = true;
      var1[57] = true;
      var1[60] = true;
      var1[61] = true;
      var1[64] = true;
      var1[14] = true;
      var1[17] = true;
      var1[138] = true;
      var1[144] = true;
      var1[152] = true;
      var1[137] = true;
      var1[153] = true;
      var1[146] = true;
      var1[154] = true;
      var1[160] = true;
      var1[202] = true;
      var1[203] = true;
      var1[206] = true;
      var1[207] = true;
      var1[208] = true;
      var1[209] = true;
      var1[210] = true;
      var1[211] = true;
      var1[212] = true;
      var1[213] = true;
      return var1;
   }

   public final void a() {
      this.a = null;
      this.a = new boolean[200];
      this.b = null;
      this.a = null;
      this.a = new byte[200][][];
   }

   public final void b() {
      if (this.a != null) {
         for (int var1 = 0; var1 < this.a.length; var1++) {
            this.a[var1] = null;
         }
      }

      if (this.b != null) {
         for (int var2 = 0; var2 < this.b.length; var2++) {
            this.b[var2] = null;
         }
      }
   }

   public final void c() {
      boolean var1 = false;

      for (int var2 = 0; var2 < this.a.length; var2++) {
         if (!this.a[var2]) {
            this.a[var2] = null;
         } else if (this.a[var2] == null) {
            var1 = true;
         }
      }

      if (var1) {
         InputStream var14 = null;

         try {
            var14 = Main.a("/tl_pointer." + a[a]);
            ByteArrayOutputStream var13 = new ByteArrayOutputStream();

            for (int var4 = 0; var4 < this.a.length; var4++) {
               int var3;
               if (this.a[var4] && this.a[var4] == null) {
                  while ((var3 = var14.read()) != 124 && var3 != -1 && var3 != 0) {
                     var13.write(var3);
                  }

                  this.a[var4] = a(3, a(3, a(var13.toByteArray())), ad.a - 10);
                  var13.reset();
               } else {
                  while ((var3 = var14.read()) != 124 && var3 != -1 && var3 != 0) {
                  }
               }

               if (var3 == 0) {
                  break;
               }
            }
         } catch (Exception var11) {
         } finally {
            try {
               var14.close();
            } catch (IOException var10) {
            }
         }

         System.gc();
      }
   }

   public d(Main var1) {
      a = var1;
   }

   public static void d() {
      a = new Image[4];
      e = new int[4];
      b = new int[4][];
      c = new int[4][];
      a = new boolean[4][];
      a(0, (int)8);
      a(1, (int)7);
      a(2, (int)237);
      a(3, (int)230);
      a = new byte[c.length][];

      for (int var0 = 0; var0 < a.length; var0++) {
         a[var0] = a(0, c[var0]);
      }

      System.gc();
   }

   public static int b(int var0) {
      return c[0];
   }

   public final void a(Graphics var1, int var2, String var3, int var4, int var5, int var6) {
      a(var1, var2, a(var2, var3), var4, var5, Integer.MIN_VALUE, Integer.MAX_VALUE, var6);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      if (this.b[var2] != null) {
         a(var1, this.a[var2], this.b[var2], var3, var4, Integer.MIN_VALUE, Integer.MAX_VALUE, var5);
      }
   }

   public final void a(Graphics var1, int var2, byte[] var3, int var4, int var5, int var6) {
      a(var1, var2, var3, var4, var5, Integer.MIN_VALUE, Integer.MAX_VALUE, var6);
   }

   public static void a(Graphics var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 != null) {
         if ((var7 & 8) != 0) {
            byte[] var8 = var2;
            var3 -= a(var1, var8, var8.length);
         } else if ((var7 & 1) != 0) {
            byte[] var17 = var2;
            var3 -= a(var1, var17, var17.length) >> 1;
         }

         if ((var7 & 32) != 0 || (var7 & 64) != 0) {
            var4 -= e[var1];
         } else if ((var7 & 2) != 0) {
            var4 -= e[var1] >> 1;
         }

         var7 = var0.getClipX();
         int var18 = var0.getClipY();
         int var9 = var0.getClipWidth();
         int var10 = var0.getClipHeight();
         int var14 = var2.length;

         for (int var15 = 0; var15 < var14; var15++) {
            if (var2[var15] != -3) {
               if (var2[var15] == -1) {
                  var3 += c[var1] + d[var1];
               } else {
                  int var11 = var3;
                  if (a[var1][var2[var15]]) {
                     var11 += (a[var1][var2[var15 - 1]] >> 1) - (a[var1][var2[var15]] >> 1);
                  }

                  if (var11 < var6 && var11 + a[var1][var2[var15]] >= var5) {
                     int var12 = var11 < var5 ? var5 : var11;
                     int var13;
                     var13 = (var13 = var11 + a[var1][var2[var15]]) > var6 ? var6 : var13;
                     var0.setClip(var12, var4, var13 - var12, e[var1]);
                     var0.drawImage(a[var1], var11 - b[var1][var2[var15]], var4 - c[var1][var2[var15]], 20);
                  }

                  if (var15 < var14 - 1) {
                     if (a[var1][var2[var15]]) {
                        var3 += a[var1][var2[var15 - 1]] + d[var1];
                     } else if (var2[var15 + 1] == -1 && !a[var1][var2[var15]] || var2[var15 + 1] != -1 && !a[var1][var2[var15 + 1]]) {
                        var3 += a[var1][var2[var15]] + d[var1];
                     }
                  }
               }
            }
         }

         var0.setClip(var7, var18, var9, var10);
      }
   }

   public final byte a(int var1) {
      return this.a[var1];
   }

   public final byte[] a(int var1) {
      return this.b[var1];
   }

   public final byte[][] a(int var1) {
      return this.a[var1];
   }

   public static int c(int var0) {
      return e[var0];
   }

   public static int a(int var0, String var1) {
      byte[] var3 = a(0, var1);
      boolean var2 = false;
      return a(0, var3, var3.length);
   }

   public final int d(int var1) {
      if (this.b[var1] == null) {
         return 0;
      }

      byte var10000 = this.a[var1];
      byte[] var2 = this.b[var1];
      return a(var10000, var2, var2.length);
   }

   public static int a(int var0, byte[] var1) {
      return a(var0, var1, var1.length);
   }

   private static int a(int var0, byte[] var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         if (var1[var4] != -3) {
            if (var1[var4] == -1) {
               var3 += c[var0] + d[var0];
            } else if (!a[var0][var1[var4]]) {
               var3 += a[var0][var1[var4]] + d[var0];
            }
         }
      }

      return var3;
   }

   public static int a(int var0, byte var1) {
      if (var1 == -1) {
         return c[var0] + d[var0];
      } else {
         return var1 != -3 && !a[var0][var1] ? a[var0][var1] + d[var0] : 0;
      }
   }

   public static byte a(int var0, char var1) {
      return (byte)d[var0].indexOf(var1);
   }

   public static byte[] a(int var0, String var1) {
      var1 = var1.toLowerCase();
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var1.length(); var3++) {
         int var4;
         if ((var4 = "ěščřžýáíéúůďťňäåâöèàêüûùôóòìîñ´’‘".indexOf(var1.charAt(var3))) == -1) {
            var2.append(var1.charAt(var3));
         } else {
            var2.append(a[var4][0]);
            if (a[var4].length > 1) {
               var2.append(a[var4][1]);
            }
         }
      }

      byte[] var7 = new byte[var2.length()];

      for (int var8 = 0; var8 < var7.length; var8++) {
         char var6;
         if ((var6 = var2.charAt(var8)) == ' ') {
            var7[var8] = -1;
         } else if (var6 == '~') {
            var7[var8] = -2;
         } else if (var6 == '^') {
            var7[var8] = -3;
         } else {
            var7[var8] = (byte)d[var0].indexOf(var6);
         }
      }

      return var7;
   }

   public static byte[] a(int var0, int var1) {
      byte var2 = (byte)d[var0].indexOf(48);
      if (var1 <= 0) {
         return new byte[]{var2};
      } else if (var1 < 10) {
         return new byte[]{(byte)(var2 + var1)};
      } else if (var1 < 100) {
         return new byte[]{(byte)(var2 + var1 / 10), (byte)(var2 + var1 % 10)};
      } else if (var1 < 1000) {
         return new byte[]{(byte)(var2 + var1 / 100), (byte)(var2 + var1 / 10 % 10), (byte)(var2 + var1 % 10)};
      } else if (var1 < 10000) {
         return new byte[]{(byte)(var2 + var1 / 1000), (byte)(var2 + var1 / 100 % 10), (byte)(var2 + var1 / 10 % 10), (byte)(var2 + var1 % 10)};
      } else if (var1 < 100000) {
         return new byte[]{
            (byte)(var2 + var1 / 10000),
            (byte)(var2 + var1 / 1000 % 10),
            (byte)(var2 + var1 / 100 % 10),
            (byte)(var2 + var1 / 10 % 10),
            (byte)(var2 + var1 % 10)
         };
      } else {
         return var1 < 1000000
            ? new byte[]{
               (byte)(var2 + var1 / 100000),
               (byte)(var2 + var1 / 10000 % 10),
               (byte)(var2 + var1 / 1000 % 10),
               (byte)(var2 + var1 / 100 % 10),
               (byte)(var2 + var1 / 10 % 10),
               (byte)(var2 + var1 % 10)
            }
            : null;
      }
   }

   public final void e() {
      this.b = null;
      this.a = null;
      System.gc();
      InputStream var1 = null;

      try {
         var1 = Main.a("/t_pointer." + a[a]);
         Vector var2 = new Vector();
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         int var5 = 0;

         int var4;
         while ((var4 = var1.read()) != -1 && var4 != 0) {
            if (var4 == 124) {
               var2.addElement(a(var3.toByteArray()));
               var3.reset();
            } else {
               var3.write(var4);
               var5 += var4;
            }
         }

         int var19 = new DataInputStream(var1).readInt();
         if (var5 == var19) {
            int var20 = var2.size();
            this.b = new byte[var20][];
            this.a = new byte[var20][][];
            this.a = new byte[var20];
            boolean[] var21 = a(var20);

            for (int var22 = 0; var22 < var20; var22++) {
               this.a[var22] = 0;
            }

            this.a(var21);
            int var6 = a();
            int var7 = ad.a - 10;

            for (int var8 = 0; var8 < var20; var8++) {
               String var23 = (String)var2.elementAt(var8);
               if (var21[var8]) {
                  this.a[var8] = a(
                     this.a[var8],
                     a(this.a[var8], var23),
                     var8 != 207 && var8 != 208 && var8 != 209 && var8 != 210 && var8 != 211 && var8 != 212 && var8 != 213 ? var6 : var7
                  );
               } else {
                  this.b[var8] = a(this.a[var8], var23);
               }
            }

            var2.removeAllElements();
            byte[][] var18;
            byte[][] var24;
            (var18 = new byte[(var24 = this.a[28]).length + 1][])[0] = var24[0];
            var18[1] = a(this.a[28], "v" + a.getAppProperty("MIDlet-Version"));
            System.arraycopy(var24, 1, var18, 2, var24.length - 1);
            this.a[28] = var18;
            return;
         }
      } catch (Exception var16) {
         return;
      } finally {
         try {
            var1.close();
         } catch (IOException var15) {
         }
      }
   }

   public static int a() {
      return ad.a - 70 - 4;
   }

   private static void a(int var0, int var1) {
      try {
         a[var0] = a.a.a(var1);
         var1 = d[var0].length();
         e[var0] = a[var0].getHeight() / a[var0];
         b[var0] = new int[var1];
         c[var0] = new int[var1];
         int var2 = 0;
         int var3 = 0;

         for (int var4 = 0; var4 < var1; var4++) {
            if (var2 + a[var0][var4] > a[var0].getWidth()) {
               var2 = 0;
               var3 += e[var0];
            }

            b[var0][var4] = var2;
            c[var0][var4] = var3;
            var2 += a[var0][var4];
         }

         a[var0] = new boolean[var1];

         for (int var7 = 0; var7 < var1; var7++) {
            a[var0][var7] = e[var0].indexOf(d[var0].charAt(var7)) != -1;
         }
      } catch (Exception var5) {
      }
   }

   private static void a(Vector var0, byte[] var1, int var2) {
      if (var2 > 1 && var1[var2 - 1] == -1) {
         var2--;
      }

      byte[] var3 = new byte[var2];
      System.arraycopy(var1, 0, var3, 0, var2);
      var0.addElement(var3);
   }

   public static byte[] a(byte[][] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1 += var0[var2].length;
      }

      byte[] var5 = new byte[var1];
      var1 = 0;

      for (int var3 = 0; var3 < var0.length; var3++) {
         System.arraycopy(var0[var3], 0, var5, var1, var0[var3].length);
         var1 += var0[var3].length;
      }

      return var5;
   }

   public static byte[][] a(int var0, byte[] var1, int var2) {
      Vector var3 = new Vector();
      byte[] var4 = new byte[200];
      byte[] var5 = new byte[50];
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var1.length; var8++) {
         if ((var1[var8] == -1 || var1[var8] == -2) && (var8 >= var1.length - 1 || var1[var8 + 1] != 42 && var1[var8 + 1] != 43)) {
            if (a(var0, var4, var6) + a(var0, var5, var7) > var2) {
               a(var3, var4, var6);
               var6 = 0;
               var5[var7++] = -1;

               for (int var9 = 0; var9 < var7; var9++) {
                  var4[var6++] = var5[var9];
               }

               var7 = 0;
            } else {
               if (var7 == 0 || var1[var8] != -2) {
                  var5[var7++] = -1;
               }

               for (int var13 = 0; var13 < var7; var13++) {
                  var4[var6++] = var5[var13];
               }

               var7 = 0;
            }

            if (var1[var8] == -2) {
               a(var3, var4, var6);
               var6 = 0;
            }
         } else if (a(var0, var5, var7) + a(var0, var1[var8]) > var2) {
            if (var6 > 0) {
               a(var3, var4, var6);
            }

            a(var3, var5, var7);
            var6 = 0;
            var7 = 1;
            var5[0] = var1[var8];
         } else {
            var5[var7++] = var1[var8];
         }
      }

      if (a(var0, var4, var6) + a(var0, var5, var7) < var2) {
         for (int var11 = 0; var11 < var7; var11++) {
            var4[var6++] = var5[var11];
         }

         if (var6 > 0) {
            a(var3, var4, var6);
         }
      } else {
         if (var6 > 0) {
            a(var3, var4, var6);
         }

         if (var7 > 0) {
            a(var3, var5, var7);
         }
      }

      byte[][] var12 = new byte[var3.size()][];
      var3.copyInto(var12);
      var3.removeAllElements();
      return var12;
   }

   private static String a(byte[] var0) {
      try {
         return new String(var0, "UTF-8");
      } catch (Exception var1) {
         return null;
      }
   }

   static {
      a = new int[][]{
         b,
         {6, 3, 6},
         b,
         {
               11,
               11,
               11,
               11,
               11,
               11,
               11,
               11,
               5,
               11,
               11,
               11,
               17,
               11,
               11,
               11,
               11,
               11,
               11,
               13,
               11,
               11,
               17,
               11,
               11,
               11,
               11,
               7,
               11,
               11,
               11,
               11,
               11,
               11,
               11,
               11,
               5,
               5,
               5,
               5,
               5,
               11,
               5,
               11,
               17,
               9,
               9,
               15,
               14,
               11,
               13,
               11,
               7,
               7,
               11,
               7,
               8,
               7,
               9,
               11,
               5,
               13,
               11
         }
      };
   }
}
