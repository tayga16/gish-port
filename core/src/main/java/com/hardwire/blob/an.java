package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.util.Vector;

public final class an {
   public final Object a = new Object();
   public final Object b = new Object();
   public Vector a = null;
   public Vector b = null;
   private Vector c = null;
   volatile boolean a = true;
   public int a;
   public c a;
   public r a = null;
   public boolean b = true;

   public an(int var1) {
      this.a = 1;
   }

   public final void a(av var1) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      synchronized (this.a) {
         if (this.c == null) {
            this.c = new Vector(1);
         }

         this.c.addElement(var1);
      }
   }

   protected final void a(int var1) {
      synchronized (this.a) {
         if (this.a && this.b != null) {
            v var5 = new v(this, var1);

            for (int var3 = 0; var3 < this.b.size(); var3++) {
               ((ad)this.b.elementAt(var3)).a(var5);
            }
         }
      }
   }

   protected final void b(int var1) {
      synchronized (this.a) {
         if (this.a && this.b != null) {
            v var5 = new v(this, var1);

            for (int var3 = 0; var3 < this.b.size(); var3++) {
               ((ad)this.b.elementAt(var3)).b(var5);
            }
         }
      }
   }

   protected final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      synchronized (this.a) {
         if (this.a && this.c != null) {
            o var10 = new o(this, var1, var2, var3, var4, var5, var6, var7);

            for (int var11 = 0; var11 < this.c.size(); var11++) {
               ((av)this.c.elementAt(var11)).a(var10);
            }
         }
      }
   }

   protected final void a(int var1, int var2, int var3, int var4) {
      synchronized (this.a) {
         if (this.a && this.a != null) {
            new a(this, var1, var2, var3, var4);

            for (int var7 = 0; var7 < this.a.size(); var7++) {
               this.a.elementAt(var7);
            }
         }
      }
   }

   protected final void a() {
      synchronized (this.a) {
         if (this.a && this.a != null) {
            new g(this, this.b);

            for (int var2 = 0; var2 < this.a.size(); var2++) {
               ((Main)this.a.elementAt(var2)).f();
            }
         }
      }

      this.b = true;
   }

   public final boolean a() {
      if (this.a != null) {
         r var1 = this.a;
         if (this.a.a != null && var1.a.a() && var1.a) {
            return true;
         }
      }

      return false;
   }
}
