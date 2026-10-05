package com.hardwire.blob;

public final class s {
   public as a;
   public as b;
   public as c;
   public int a;
   private as d;
   public int b;

   public s(as var1, int var2) {
      this.a = var1;
      this.a = var2;
      this.b = new as(var1);
      if (var2 != Integer.MAX_VALUE) {
         this.c = new as();
         this.d = new as();
      }
   }

   public final void a() {
      if (this.a == Integer.MAX_VALUE) {
         this.b.a = this.a.a;
         this.b.b = this.a.b;
      } else {
         this.d.a = this.a.a;
         this.d.b = this.a.b;
         this.a.a <<= 1;
         this.a.b <<= 1;
         this.a.a = this.a.a - this.b.a;
         this.a.b = this.a.b - this.b.b;
         if (this.a == 1024) {
            this.a.a = this.a.a + this.c.a;
            this.a.b = this.a.b + this.c.b;
         } else if (this.a == 2048) {
            this.a.a = this.a.a + (this.c.a >> 1);
            this.a.b = this.a.b + (this.c.b >> 1);
         } else {
            this.a.a = this.a.a + (int)(((long)this.c.a << 10) / this.a);
            this.a.b = this.a.b + (int)(((long)this.c.b << 10) / this.a);
         }

         this.b.a = this.d.a;
         this.b.b = this.d.b;
         this.c.a = this.c.b = 0;
      }
   }

   public final void a(as var1) {
      if (this.a != Integer.MAX_VALUE) {
         if (this.a == 1024) {
            this.c.a = this.c.a + var1.a;
            this.c.b = this.c.b + var1.b;
         } else if (this.a == 2048) {
            this.c.a = this.c.a + (var1.a << 1);
            this.c.b = this.c.b + (var1.b << 1);
         } else {
            this.c.a = this.c.a + (int)((long)var1.a * this.a >> 10);
            this.c.b = this.c.b + (int)((long)var1.b * this.a >> 10);
         }
      }
   }
}
