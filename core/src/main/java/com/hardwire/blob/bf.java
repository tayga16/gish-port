package com.hardwire.blob;

public class bf {
   private an a;

   public bf(an var1) {
      this.a = var1;
   }

   public final an a() {
      return this.a;
   }

   protected static int a(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < var1) {
         var0 = var1;
      } else if (var0 > var2) {
         var0 = var2;
      }

      if ((var0 = (int)Math.floor((float)(var0 - var1) / (var2 - var1) * (var4 - var3) + 0.5) + var3) < var3) {
         var0 = var3;
      } else if (var0 > var4) {
         var0 = var4;
      }

      return var0;
   }
}
