package com.hardwire.blob;

import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;

public final class aj extends b {
   private MIDlet a = null;

   public static b a(MIDlet var0) {
      if (!b.a.containsKey(var0)) {
         aj var1 = new aj(var0);
         b.a.put(var0, var1);
      }

      return (b)b.a.get(var0);
   }

   private aj(MIDlet var1) {
      this.a = var1;
      this.a();
   }

   protected final String a(int var1) {
      return this.a.getAppProperty("controller-quickconnect-" + var1);
   }

   protected final boolean b() {
      return this.a.getAppProperty("zc-ac-enabled") != null;
   }

   protected final boolean c() {
      String var1;
      return (var1 = this.a.getAppProperty("zc-ac-enabled")) != null && var1.equals("true");
   }

   protected final boolean d() {
      boolean var1 = false;
      if (super.b != null) {
         MIDlet var3 = this.a;
         Hashtable var2 = super.b;
         String var4 = var3.getAppProperty("MIDlet-Vendor");
         String var11 = var3.getAppProperty("MIDlet-Name");
         String var21 = var11;
         String var12 = var4;
         if (!var2.containsKey(n.a(var12, var21))) {
            boolean var22 = true;
            var3 = this.a;
            var2 = super.b;
            var4 = var3.getAppProperty("MIDlet-Vendor");
            String var14 = var3.getAppProperty("MIDlet-Name");
            boolean var6 = true;
            String var24 = var14;
            String var15 = var4;
            var2 = var2;
            String var16 = n.a(var15, var24);
            var2.put(var16, "true");
            this.c();
            this.b();
         }

         if (super.b != null) {
            var3 = this.a;
            var2 = super.b;
            var4 = var3.getAppProperty("MIDlet-Vendor");
            String var18 = var3.getAppProperty("MIDlet-Name");
            String var26 = var18;
            String var19 = var4;
            var2 = var2;
            String var20 = n.a(var19, var26);
            String var10;
            var1 = (var10 = (String)var2.get(var20)) != null && var10.equals("true");
         }
      }

      return var1;
   }
}
