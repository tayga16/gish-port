package com.hardwire.blob;

import java.io.IOException;
import java.io.InputStream;

public final class j {
   private static String a = null;
   private static String b = null;
   private static j a;
   private String[] a;
   private static Class a;

   private j(String[] var1) {
      this.a = var1;
   }

   public final void a() {
      j var1 = b();
      this.a = var1.a;
   }

   public final String a(int var1, Object[] var2) {
      if (var1 >= 0 && var1 < this.a.length) {
         String var7;
         if ((var7 = this.a[var1]) == null) {
            return null;
         }

         StringBuffer var8 = new StringBuffer();

         for (int var3 = 0; var3 < var7.length(); var3++) {
            char var4;
            if ((var4 = var7.charAt(var3)) == '\\') {
               var4 = var7.charAt(++var3);
               var8.append(var4);
            } else if (var4 != '%') {
               var8.append(var4);
            } else {
               StringBuffer var9 = new StringBuffer();

               char var6;
               for (int var5 = var3 + 1; var5 < var7.length() && Character.isDigit(var6 = var7.charAt(var5)); var5++) {
                  var9.append(var6);
                  var3++;
               }

               int var11 = Integer.parseInt(var9.toString());
               if (var2 == null) {
                  throw new ArrayIndexOutOfBoundsException();
               }

               var8.append(var2[var11]);
            }
         }

         return var8.toString();
      } else {
         return null;
      }
   }

   public final String a(int var1) {
      return this.a(var1, (Object[])null);
   }

   public final String a(int var1, int[] var2) {
      Object[] var3 = null;
      var3 = new Object[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var4] = new Integer(var2[var4]);
      }

      return this.a(var1, var3);
   }

   public static j a() {
      if (a == null) {
         a = b();
      }

      return a;
   }

   private static j b() {
      String var0 = a;

      try {
         if (var0 == null) {
            var0 = "en-US";
            var0 = ("/zc-" + var0 + ".txt").replace('_', '-');
         }

         String[] var3 = a(a(var0, b), 0, 0);
         return new j(var3);
      } catch (IOException var1) {
         throw new RuntimeException();
      }
   }

   public static void a(String var0) {
      a = var0;
   }

   public static void b(String var0) {
      b = var0;
   }

   private static final String[] a(String var0, int var1, int var2) {
      if (var1 >= var0.length()) {
         return new String[var2];
      }

      int var3 = 0;
      char var4 = 0;

      char var6;
      for (int var5 = var1; var5 < var0.length() && (var6 = var0.charAt(var5)) != '\n'; var5++) {
         var4 = var6;
         var3++;
      }

      int var7 = var3;
      if (var4 == '\r') {
         var7--;
      }

      if (var7 > 0) {
         var2++;
      }

      String[] var8 = a(var0, var1 + var3 + 1, var2);
      if (var7 > 0) {
         var8[var2 - 1] = var0.substring(var1, var1 + var7).intern();
      }

      return var8;
   }

   private static String a(String var0, String var1) {
      InputStream var2 = null;
      var2 = (a == null ? (a = a("j")) : a).getResourceAsStream(var0);
      if (null == var2) {
         throw new IOException();
      }

      var0 = a(var2, var1);

      try {
         var2.close();
      } catch (IOException var3) {
      }

      return var0;
   }

   private static String a(InputStream var0, String var1) {
      byte[] var2 = new byte[1024];
      int var3 = 0;
      int var4 = 0;

      while ((var4 = var0.read()) > 0) {
         if (var3 >= var2.length) {
            int var5 = var2.length;
            var5 += 512;
            byte[] var8 = new byte[var5];
            System.arraycopy(var2, 0, var8, 0, var2.length);
            var2 = var8;
         }

         var2[var3++] = (byte)var4;
      }

      var0.close();
      return var1 == null ? new String(var2, 0, var3) : new String(var2, 0, var3, var1);
   }

   private static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var1) {
         throw new NoClassDefFoundError(var1.getMessage());
      }
   }
}
