package com.hardwire.blob;

import java.util.TimerTask;

final class e extends TimerTask {
   private final r a;

   e(r var1) {
      this.a = var1;
   }

   public final void run() {
      r var1 = this.a;
      if (!this.a.b) {
         var1 = this.a;
         this.a.b();
      }
   }
}
