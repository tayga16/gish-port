package com.hardwire.blob;

public final class w {
   private static ae a;

   private w() {
   }

   public static ah a(String var0, String var1) {
      a();
      String var2 = var1;
      var1 = var0;
      be var3;
      be var10000 = var3 = new be(var1, var2);
      boolean var5 = true;
      var10000.a = true;
      return var3;
   }

   public static ae a() {
      if (a == null) {
         boolean var0 = a();

         try {
            if (var0) {
               Class var10000 = Class.forName("com.zeemote.zc.c");
               var0 = null;
               a = (ae)var10000.newInstance();
            } else {
               a = (ae)Class.forName("ae").newInstance();
            }
         } catch (ClassNotFoundException var1) {
            throw new RuntimeException();
         } catch (InstantiationException var2) {
            throw new RuntimeException();
         } catch (IllegalAccessException var3) {
            throw new RuntimeException();
         }
      }

      return a;
   }

   static boolean a() {
      try {
         Class.forName("net.rim.device.api.system.Device");
         return true;
      } catch (ClassNotFoundException var0) {
         return false;
      }
   }
}
