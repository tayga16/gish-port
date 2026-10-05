package com.hardwire.blob;

public final class ap {
   public byte a;
   public am a;
   public boolean a;
   public static af[] a;
   ar a;
   int a;
   public byte b;
   byte c;
   static int[][] a;
   public int b;
   public int c;
   public boolean b;

   public ap(ar var1, byte var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.b = var3;
      this.c = var4;
   }

   public final void a() {
      this.a = 0;
      this.a = -1;
      this.b = false;
      int var1 = this.b << 15;
      int var2 = this.c << 15;
      as[] var3 = null;
      switch (this.b) {
         case 0:
            var3 = y.a(32);
            this.c = 0;
            break;
         case 1:
            var3 = y.a(96, 32, false);
            this.c = 1;
            break;
         case 2:
            var3 = y.a(96, 32, false);
            this.c = 1;
            break;
         case 3:
            y.a(var3 = new as[]{new as(32, -64), new as(32, 32), new as(0, 32), new as(0, -64)});
            this.c = 1;
            break;
         case 4:
            y.a(var3 = new as[]{new as(2, 2), new as(62, 2), new as(62, 62), new as(1, 62)});
            this.c = 2;
            var2 -= 32 << 10;
            break;
         case 5:
            var3 = y.a(16, 10);
            this.c = 3;
            var1 += 16384;
            break;
         case 6:
            y.a(var3 = new as[]{new as(33, -63), new as(31, 31), new as(0, 32), new as(0, -64)});
            this.c = 1;
            break;
         case 7:
            var3 = y.a(64, 32, false);
            this.c = 0;
            break;
         case 8:
            var3 = y.a(128, 32, false);
            this.c = 1;
            break;
         case 9:
            var3 = y.a(96, 21, false);
            this.c = 4;
            break;
         case 10:
            y.a(var3 = new as[]{new as(32, -96), new as(32, 32), new as(0, 32), new as(0, -96)});
            this.c = 1;
            break;
         case 11:
            var3 = y.a(256, 32, false);
            this.c = 1;
      }

      this.a = null;
      this.a = new am(
         this.b == 5 ? 100000 : 0, false, false, this.b == 2 || this.b == 8 || this.b == 11, this.b == 0 || this.b == 4 || this.b == 7 || this.b == 9
      );
      this.a.j = this.b != 2 && this.b != 8 && this.b != 11 ? 3 : 4;
      if (this.b == 9) {
         this.a.h = 2;
      }

      this.a.a = this;
      short var5 = this.b != 5;
      am var4 = this.a;
      if (var5) {
         var4.d |= 2;
      } else {
         var4.d &= -3;
      }

      for (int var10 = 0; var10 < var3.length; var10++) {
         var3[var10].a += var1;
         var3[var10].b += var2;
      }

      this.a.a(var3, this.b == 4 ? 51200 : 2048);
      if (this.b != 5) {
         this.a.a(1024, 1024, -512, -512);
         int var6 = -512;
         var5 = 1024;
         var4 = this.a;
         var6 = this.a.a.size() >> 1;

         for (int var8 = 0; var8 < var6; var8++) {
            t var9 = new t((s)var4.a.elementAt(var8), (s)var4.a.elementAt(var6 + var8), 1024, -512, -1);
            var4.a(var9);
         }
      } else {
         this.a.a(1024, 512, -512, -512);
      }

      this.a.a();
      if (this.b == 6) {
         this.a.a[2].a = Integer.MAX_VALUE;
      }

      if (this.a.a != null && this.a.a.b) {
         this.a.a.a(this.a);
      }
   }

   public final void b() {
      this.a = 2;
      as var1 = this.a.a();
      this.a.a.a(var1.a >> 10, var1.b >> 10, 0);
   }
}
