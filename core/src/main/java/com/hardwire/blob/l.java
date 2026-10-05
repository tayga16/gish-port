package com.hardwire.blob;

public abstract class l extends x {
   public volatile String a;
   public volatile boolean a;
   x a;
   x b;
   private volatile bd a;

   l(ag var1) {
      super(2, var1);
   }

   synchronized void a(String var1) {
      this.a = var1;
   }

   final synchronized void a(boolean var1) {
      this.a = var1;
   }

   public final boolean a() {
      return this.a != null;
   }

   public final synchronized x a() {
      if (this.a()) {
         this.a((bd)null);
         return super.a.a(this, this.a);
      } else {
         throw new IllegalStateException();
      }
   }

   public final x b() {
      if (!this.a) {
         throw new IllegalStateException();
      }

      this.a((bd)null);
      return super.a.a(this, this.b);
   }

   private synchronized void a(bd var1) {
      this.a = null;
   }
}
