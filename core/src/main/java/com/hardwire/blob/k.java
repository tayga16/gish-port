package com.hardwire.blob;

public final class k {
   public au a;
   public byte a;
   public boolean a;
   public boolean b;
   public byte b;
   ar a;
   public as a;
   public as b;
   public int a;
   public int b;

   public k(ar var1, byte var2, as var3, as var4, int var5) {
      this.a = var1;
      this.b = var2;
      as[] var6 = null;
      switch (this.b) {
         case 0:
            var6 = y.a(96, 32, true);
            break;
         case 1:
            var6 = y.a(32, 96, true);
            as var8 = new as(0, 64).b();
            var3.b(var8);
            var4.b(var8);
            break;
         case 2:
            var6 = y.a(64, 32, true);
            break;
         case 3:
            var6 = y.a(32, 288, true);
            as var7 = new as(0, 256).b();
            var3.b(var7);
            var4.b(var7);
      }

      var6[0].a -= 512;
      var6[0].b -= 512;
      var6[1].b -= 512;
      var6[3].a -= 512;
      var6[4].a -= 512;
      var6[4].b -= 512;
      this.a = new as(var3);
      this.a = new au(this.a.a, var6, var3);
      this.b = new as(var4);
      this.b = var4.b(var3).c() / (var5 * 500);
      this.a = 0;
      this.a = false;
      if (this.a.a != null && this.a.a.b) {
         this.a.a.a(this.a);
      }
   }

   public final void a(byte var1, int var2) {
      this.a = var1;
      this.a = true;
      if (this.a == 1 && (var2 > 0 && this.a == this.b || var2 < 0 && this.a == 0)) {
         this.a = false;
      }

      if (var2 < 0 && this.a < this.b) {
         this.a = this.b + this.b - this.a;
      } else {
         if (var2 > 0 && this.a >= this.b) {
            this.a = this.b + this.b - this.a;
         }
      }
   }

   public final byte a() {
      if (this.a) {
         return (byte)(this.a < this.b ? 1 : 3);
      } else if (this.a == 0) {
         return 0;
      } else if (this.a == this.b) {
         return 2;
      } else {
         return (byte)(this.a < this.b ? 1 : 3);
      }
   }
}
