package com.hardwire.blob;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class b {
   protected static Hashtable a = new Hashtable();
   private Vector a = null;
   private boolean a;
   private Hashtable c;
   protected Hashtable b;

   protected b() {
   }

   protected final void a() {
      this.b();
      b var1 = this;
      this.c = null;

      try {
         var1.c = az.a(true);
      } catch (IOException var2) {
      }

      this.a = this.d();
   }

   protected final void b() {
      this.b = null;

      try {
         this.b = az.a(false);
      } catch (IOException var1) {
      }
   }

   protected final void c() {
      try {
         Hashtable var1 = this.b;
         az.a(this.b, false);
      } catch (IOException var2) {
      }
   }

   private void d() {
      try {
         Hashtable var1 = this.c;
         az.a(this.c, true);
      } catch (IOException var2) {
      }
   }

   public final ah a(int var1) {
      Hashtable var2 = null;
      if (this.a) {
         var2 = this.b;
      } else {
         var2 = this.c;
      }

      ah var4;
      if ((var4 = n.a(var2, var1)) == null && this.a) {
         var4 = n.a(this.c, var1);
      }

      return var4;
   }

   public final void a(int var1, ah var2) {
      n.a(this.c, var1, var2);
      this.d();
      if (this.a) {
         n.a(this.b, var1, var2);
         this.c();
      }
   }

   public final boolean a() {
      Hashtable var1 = null;
      if (this.a) {
         var1 = this.b;
      } else {
         var1 = this.c;
      }

      if (this.a && !this.b.containsKey("zp.ace") && this.c.containsKey("zp.ace")) {
         this.a(n.a(this.c));
      }

      boolean var2 = true;
      if (!var1.containsKey("zp.ace")) {
         if (this.b()) {
            var2 = this.c();
         }

         this.a(var2);
      } else {
         var2 = n.a(var1);
      }

      return var2;
   }

   public final void a(boolean var1) {
      n.a(this.c, var1);
      this.d();
      if (this.a) {
         n.a(this.b, var1);
         this.c();
      }
   }

   public final Vector a() {
      if (this.a == null) {
         this.a = new Vector();
         int var1 = 1;

         String var2;
         while ((var2 = this.a(var1)) != null) {
            var1++;
            int var3;
            if ((var3 = var2.indexOf(58)) >= 0) {
               String var4 = var2.substring(0, var3);
               var2 = var2.substring(var3 + 1);
               if (var4 != null && var2 != null) {
                  this.a.addElement(w.a(var4, var2));
               }
            }
         }
      }

      return this.a;
   }

   protected abstract String a(int var1);

   protected abstract boolean b();

   protected abstract boolean c();

   protected abstract boolean d();
}
