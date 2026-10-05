package com.hardwire.blob;

import java.io.IOException;
import java.util.Hashtable;

final class n {
   private n() {
   }

   static String a(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("ap.ug.");
      var2.append(a(var0));
      var2.append('|');
      var2.append(a(var1));
      return var2.toString();
   }

   private static String a(int var0) {
      return "zp.lc." + var0;
   }

   static ah a(Hashtable var0, int var1) {
      String var7 = a(var1);
      String var5;
      if ((var5 = (String)var0.get(var7)) == null) {
         return null;
      }

      String var8 = var5;
      boolean var2 = false;
      int var3 = 0;

      int var10000;
      while (true) {
         if (var3 >= var8.length()) {
            var10000 = -1;
            break;
         }

         char var4 = var8.charAt(var3);
         if (!var2 && var4 == '\\') {
            var2 = true;
         } else {
            if (!var2 && var4 == '|') {
               var10000 = var3;
               break;
            }

            var2 = false;
         }

         var3++;
      }

      var1 = var10000;
      if (var10000 >= 0) {
         String var10 = b(var5.substring(0, var1));
         String var6 = b(var5.substring(var1 + 1));
         return w.a(var10, var6);
      } else {
         return null;
      }
   }

   static void a(Hashtable var0, int var1, ah var2) {
      String var5 = a(var1);
      StringBuffer var3 = null;
      if (var2 != null) {
         try {
            (var3 = new StringBuffer()).append(a(var2.a()));
            var3.append('|');
            var3.append(a(var2.b()));
            String var7 = var3.toString();
            var0.put(var5, var7);
         } catch (IOException var4) {
         }
      } else {
         var0.remove(var5);
      }
   }

   static boolean a(Hashtable var0) {
      return var0.get("zp.ace").equals("true");
   }

   static void a(Hashtable var0, boolean var1) {
      if (var1) {
         var0.put("zp.ace", "true");
      } else {
         var0.put("zp.ace", "false");
      }
   }

   private static String a(String var0) {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3;
         if ((var3 = var0.charAt(var2)) == '\\' || var3 == '|') {
            var1.append('\\');
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   private static String b(String var0) {
      StringBuffer var1 = new StringBuffer();
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (!var2 && var4 == '\\') {
            var2 = true;
         } else {
            var1.append(var4);
            var2 = false;
         }
      }

      return var1.toString();
   }
}
