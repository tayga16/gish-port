package com.hardwire.blob;

public final class bb {
   public byte a;
   public short a;
   public short b;
   public boolean a;
   public boolean b;
   public int[] a;
   ar a;
   public k a;
   byte b;
   byte c;

   public bb(ar var1, byte var2, k var3, int var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = (short)var4;
      this.b = (short)var5;
      this.b = false;
      this.a = new int[]{this.a - 1 << 15, this.b - 1 << 15, this.a + 1 << 15, this.b << 15};
   }

   public final void a() {
      this.b = false;
      switch (this.a) {
         case 3:
            if (this.a.a) {
               k var1 = this.a;
               this.a.a = false;
               return;
            }
            break;
         case 4:
            if (this.a.a() != 0) {
               this.a.a((byte)1, -1);
            }
      }
   }

   public final void b() {
      this.b = true;
      switch (this.a) {
         case 1:
            if (!this.a.a) {
               this.a.a((byte)0, 0);
               return;
            }
            break;
         case 2:
            if (!this.a.a) {
               this.a.a((byte)1, 0);
               return;
            }
            break;
         case 3:
            if (!this.a.a) {
               this.a.a((byte)0, 0);
               return;
            }
            break;
         case 4:
            if (this.a.a() != 2) {
               this.a.a((byte)1, 1);
            }
      }
   }

   public final boolean a() {
      return (this.b || this.a == 1 || this.a == 2) && (this.a == 4 || this.a.a);
   }
}
