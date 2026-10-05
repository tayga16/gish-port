package com.hardwire.blob;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class am {
   public Vector a;
   public Vector b;
   private Vector c;
   public t[] a;
   public s[] a;
   public s[] b;
   public int a;
   public as a;
   public as b;
   public as c;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int[] a = new int[4];
   public boolean a = true;
   public t[] b;
   public int g;
   public int h;
   public t[] c;
   public s[] c;
   public am[] a;
   public int i;
   public int j = 0;
   public Object a;

   public am(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.a = new Vector();
      this.b = new Vector();
      this.c = new Vector();
      this.a = var1;
      this.d = 0;
      if (var2) {
         this.d |= 4;
      }

      if (var3) {
         this.d |= 8;
      }

      if (var5) {
         this.d |= 64;
      }

      if (var4) {
         this.d |= 128;
      }

      this.c = 1024;
      this.h = 1;
   }

   public final int[] a() {
      if (this.a) {
         this.a[0] = this.a[1] = Integer.MAX_VALUE;
         this.a[2] = this.a[3] = Integer.MIN_VALUE;
         int var1 = this.a.length;

         for (int var2 = 0; var2 < var1; var2++) {
            as var3 = this.a[var2].a;
            if (this.a[var2].a.a < this.a[0]) {
               this.a[0] = var3.a;
            }

            if (var3.a > this.a[2]) {
               this.a[2] = var3.a;
            }

            if (var3.b < this.a[1]) {
               this.a[1] = var3.b;
            }

            if (var3.b > this.a[3]) {
               this.a[3] = var3.b;
            }
         }

         this.a = false;
      }

      return this.a;
   }

   public final void a(as[] var1, int var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         this.a.addElement(new s(var1[var3], var2));
      }
   }

   public final void a(t var1) {
      this.b.addElement(var1);
   }

   public final boolean a(t var1) {
      if (this.g == this.b.length) {
         return false;
      }

      this.b[this.g++] = var1;
      return true;
   }

   public final void a(s var1) {
      this.a.addElement(var1);
   }

   public final void a(am var1) {
      if (var1 != null && !this.c.contains(var1)) {
         this.c.addElement(var1);
      }
   }

   public final void a(int var1, int var2, int var3, int var4) {
      int var5 = (var1 = this.a.size()) >> 1;

      for (int var6 = 0; var6 < var5; var6++) {
         t var7 = new t((s)this.a.elementAt(var6 * 2), (s)this.a.elementAt(var6 * 2 + 1), 1024, var3, -1);
         this.a(var7);
      }

      for (int var9 = 0; var9 < var5; var9++) {
         int var10;
         if ((var10 = var9 * 2 + 2) >= var1) {
            var10 = 0;
         }

         t var11 = new t((s)this.a.elementAt(var9 * 2 + 1), (s)this.a.elementAt(var10), var2, var4, -1);
         this.a(var11);
      }

      if (var1 % 2 != 0) {
         this.a(new t((s)this.a.elementAt(var1 - 1), (s)this.a.elementAt(0), 1024, var3, -1));
      }
   }

   public final void a() {
      this.a = new s[this.a.size()];

      for (int var1 = 0; var1 < this.a.length; var1++) {
         this.a[var1] = (s)this.a.elementAt(var1);
      }

      this.a.removeAllElements();
      this.a = new t[this.b.size()];

      for (int var6 = 0; var6 < this.a.length; var6++) {
         this.a[var6] = (t)this.b.elementAt(var6);
      }

      this.b.removeAllElements();
      if ((this.d & 4) != 0) {
         this.e = this.a();
         if (this.e < 0) {
            this.e = -this.e;
         }

         am var7 = this;
         int var2 = 0;
         int var3 = var7.a.length;
         int var4 = 0;

         for (int var5 = var3 - 1; var4 < var3; var5 = var4++) {
            var2 += var7.a[var4].a.b(var7.a[var5].a).c();
         }

         this.f = var2;
      }

      if ((this.d & 8) != 0) {
         this.b = new t[this.a.length];
         this.g = 0;
      }

      if ((this.d & 64) != 0) {
         this.b = new s[this.a.length];

         for (int var8 = 0; var8 < this.b.length; var8++) {
            this.b[var8] = new s(new as(this.a[var8].a), Integer.MAX_VALUE);
         }
      }

      if ((this.d & 128) != 0) {
         this.c = new as();

         for (int var9 = 0; var9 < this.a.length; var9++) {
            this.c.a(this.a[var9].a);
         }

         this.c.b(this.a.length);
      }
   }

   public final void b() {
      int var1;
      if ((var1 = this.b.size()) == 0) {
         this.c = null;
      } else {
         this.c = new t[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.c[var2] = (t)this.b.elementAt(var2);
         }

         this.b.removeAllElements();
      }

      this.b = null;
      if ((var1 = this.a.size()) == 0) {
         this.c = null;
      } else {
         this.c = new s[var1];

         for (int var5 = 0; var5 < var1; var5++) {
            this.c[var5] = (s)this.a.elementAt(var5);
         }

         this.a.removeAllElements();
      }

      this.a = null;
      if ((var1 = this.c.size()) == 0) {
         this.a = null;
      } else {
         this.a = new am[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            this.a[var6] = (am)this.c.elementAt(var6);
         }

         this.c.removeAllElements();
      }

      this.c = null;
   }

   public final s[] a() {
      return this.b != null ? this.b : this.a;
   }

   public final boolean a() {
      return this.g != 0;
   }

   public final void c() {
      for (int var1 = 0; var1 < this.g; var1++) {
         this.b[var1].a();
         this.b[var1] = null;
      }

      this.g = 0;
   }

   public final int a() {
      int var1 = 0;
      int var2 = this.a.length;
      int var3 = 0;
      int var4 = var2 - 1;
      int var5 = var2 - 2;

      while (var3 < var2) {
         var1 = (int)(var1 + ((long)this.a[var4].a.a * (this.a[var3].a.b - this.a[var5].a.b) >> 10));
         var5 = var4;
         var4 = var3++;
      }

      int var6;
      return var6 = var1 >> 1;
   }

   public final void a(as var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         if (this.a[var2].a != Integer.MAX_VALUE) {
            this.a[var2].c.a = this.a[var2].c.a + var1.a;
            this.a[var2].c.b = this.a[var2].c.b + var1.b;
         }
      }
   }

   public final void b(as var1) {
      for (int var2 = 0; var2 < this.a.length; var2++) {
         this.a[var2].a(var1);
      }
   }

   public final boolean a(as var1) {
      boolean var2 = false;
      int var3 = 0;

      for (int var4 = this.a.length - 1; var3 < this.a.length; var4 = var3++) {
         as var8 = this.a[var4].a;
         as var5 = this.a[var3].a;
         if (var8.b <= var1.b && var5.b > var1.b || var8.b > var1.b && var5.b <= var1.b) {
            int var6 = (int)((long)(var5.a - var8.a) * (var1.b - var8.b) >> 10);
            int var7 = (int)((long)(var5.b - var8.b) * (var1.a - var8.a) >> 10);
            if (var5.b >= var8.b && var6 >= var7 || var5.b < var8.b && var6 <= var7) {
               var2 = !var2;
            }
         }
      }

      return var2;
   }

   public final void d() {
      this.a = null;
      this.b = null;
   }

   public final void e() {
      int var1 = this.a.length;
      as var2 = new as();

      for (int var3 = 0; var3 < var1; var3++) {
         s var4 = this.a[var3];
         var2.a = var4.a.a - var4.b.a;
         var2.b = var4.a.b - var4.b.b;
         if ((long)var2.a * var2.a + (long)var2.b * var2.b > 67108864L) {
            var2.b();
            var4.b.a = var4.a.a - (var2.a << 13 >> 10);
            var4.b.b = var4.a.b - (var2.b << 13 >> 10);
         }
      }
   }

   public final as a() {
      if (this.a == null) {
         this.a = new as();
         int var1 = this.a.length;
         int var2 = 0;

         for (int var3 = 0; var3 < var1; var3++) {
            s var4;
            if (((var4 = this.a[var3]).b & 16) == 0) {
               this.a.a = this.a.a + var4.a.a;
               this.a.b = this.a.b + var4.a.b;
               var2++;
            }
         }

         this.a.a /= var2;
         this.a.b /= var2;
      }

      return this.a;
   }

   public final as b() {
      if (this.b == null) {
         this.b = new as();
         int var1 = 0;
         if ((this.b & 2) != 0) {
            int var4 = this.a.length;

            for (int var5 = 0; var5 < var4; var5++) {
               if ((this.a[var5].b & 2) != 0) {
                  var1++;
                  this.b.a(this.a[var5].a);
               }
            }
         } else {
            int var2 = this.a.length;

            for (int var3 = 0; var3 < var2; var3++) {
               if ((this.a[var3].b & 5) != 0) {
                  var1++;
                  this.b.a(this.a[var3].a);
               }
            }
         }

         if (var1 == this.a.length) {
            this.b.a = 0;
            this.b.b = 1024;
         } else if (var1 != 0) {
            this.b.b(var1);
            this.b.b(this.a());
         }
      }

      return this.b;
   }

   public final as c() {
      as var1 = new as();
      int var2 = this.a.length;

      for (int var3 = 0; var3 < var2; var3++) {
         s var4 = this.a[var3];
         var1.a = var1.a + (var4.a.a - var4.b.a);
         var1.b = var1.b + (var4.a.b - var4.b.b);
      }

      var1.b(this.a.length);
      return var1;
   }

   public final void a(int var1, int var2, int var3, boolean var4) {
      int var5;
      if ((var5 = (int)(((long)(this.a[3] - var1) << 10) / (this.a[3] - this.a[1]))) > 1024) {
         var5 = 1024;
      }

      if (var5 > 0) {
         var2 = (int)((long)(-var2) * var5 >> 9) - (this.c().b >> var3);
         as var7 = new as(0, var2);
         if (!var4) {
            for (int var8 = 0; var8 < this.a.length; var8++) {
               if (this.a[var8].a.b >= var1) {
                  this.a[var8].a(var7);
               }
            }

            return;
         }

         this.b(var7);
      }
   }

   public final void a(Graphics var1, as var2, int var3) {
      s[] var4;
      int var5 = (var4 = this.a()).length;
      var1.setColor(var3);
      var3 = var4[var5 - 1].a.a + var2.a >> 10;
      int var6 = var4[var5 - 1].a.b + var2.b >> 10;

      for (int var7 = 0; var7 < var5; var7++) {
         as var8 = var4[var7].a;
         int var9 = var4[var7].a.a + var2.a >> 10;
         int var11 = var8.b + var2.b >> 10;
         var1.drawLine(var9, var11, var3, var6);
         var3 = var9;
         var6 = var11;
      }
   }
}
