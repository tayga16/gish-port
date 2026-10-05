package com.hardwire.blob;

import java.io.InputStream;

final class al extends InputStream {
   private InputStream a;
   private byte[] a;
   private int a = 0;
   private int b = 0;

   al(InputStream var1) {
      this(var1, 500);
   }

   private al(InputStream var1, int var2) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      this.a = var1;
      this.a = new byte[500];
   }

   public final int read() {
      if (this.a >= this.b) {
         int var1;
         if ((var1 = this.a.read(this.a)) == -1) {
            return -1;
         }

         this.a = 0;
         this.b = var1;
      }

      return this.a[this.a++] & 0xFF;
   }

   public final int available() {
      return this.b - this.a + this.a.available();
   }

   public final long skip(long var1) {
      return 0L;
   }

   public final void close() {
      this.a.close();
   }
}
