package com.hardwire.blob;

import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;

public final class ay extends l implements Runnable {
   private int b;
   ah a;
   x c;

   public ay(ag var1, int var2) {
      super(var1);
      this.b = var2;
      switch (var2) {
         case 0:
            return;
         case 1:
            return;
         case 2:
            return;
         case 3:
            x var3 = super.a.g();
            super.a = var3;
            return;
         default:
            throw new IllegalStateException();
      }
   }

   protected final void a() {
      switch (this.b) {
         case 0:
            if ((this = this).a.a()) {
               x var14 = super.a.b();
               super.b = var14;
            } else {
               x var15 = super.a.c();
               super.b = var15;
            }

            j.a().a(0);
            String var16 = j.a().a(8);
            Object var8 = null;
            super.a(var16);
            this.a(false);
            new Thread(this).start();
            return;
         case 1:
            ay var5;
            (var5 = this).a(false);
            j.a().a(0);
            String var12 = j.a().a(10, new String[]{var5.a.a()});
            var5.a(var12);
            x var13 = var5.a.a((Throwable)null, var5.c);
            var5.b = var13;
            Thread var10000 = new Thread(var5);
            Object var7 = null;
            var10000.start();
            return;
         case 2:
            ay var4;
            (var4 = this).a(false);
            j.a().a(0);
            ah var1 = var4.a.b();
            String var10 = j.a().a(13, new String[]{var1.a()});
            var4.a(var10);
            x var11 = var4.a.m();
            var4.b = var11;
            new Thread(var4).start();
            return;
         case 3:
            ay var3;
            (var3 = this).a(false);
            j.a().a(0);
            String var2 = j.a().a(5);
            var3.a(var2);
            x var9 = var3.a.n();
            var3.b = var9;
            new Thread(var3).start();
            return;
         default:
            throw new IllegalStateException();
      }
   }

   public final void run() {
      switch (this.b) {
         case 0:
            try {
               try {
                  aw var119;
                  (var119 = super.a.a()).a();

                  while (var119.a) {
                     try {
                        Thread.sleep(250L);
                     } catch (InterruptedException var102) {
                     }
                  }

                  return;
               } catch (IOException var112) {
                  return;
               }
            } catch (Throwable var113) {
            } finally {
               this.a(true);
            }

            return;
         case 1:
            try {
               an var118 = super.a.a();

               try {
                  super.a.a(this.a);
                  ah var133 = this.a;
                  an var131 = var118;
                  synchronized (var118.b) {
                     if (var131.a()) {
                        throw new IllegalStateException();
                     }

                     if (var133 == null) {
                        throw new NullPointerException();
                     }

                     var131.a = new r(var131, var133);
                     r var136 = var131.a;
                     var131.a.a.start();

                     try {
                        var131.a.c();
                     } catch (InterruptedException var97) {
                     }

                     var136 = var131.a;
                     Throwable var134 = var131.a.a;
                     if (var131.a.a != null) {
                        if (var134 instanceof SecurityException) {
                           throw (SecurityException)var134;
                        }

                        if (var134 instanceof IOException) {
                           throw (IOException)var134;
                        }
                     }

                     var136 = var131.a;
                     if (!var131.a.a) {
                        throw new IOException();
                     }
                  }
               } catch (SecurityException var99) {
                  x var130 = super.a.a(var99, this.c);
                  super.b = var130;
               } catch (BluetoothStateException var100) {
                  x var129 = super.a.a(var100, this.c);
                  super.b = var129;
               } catch (IOException var101) {
                  x var128 = super.a.a(var101, this.c);
                  super.b = var128;
               }

               if (var118.a()) {
                  super.a.b(this.a);
                  x var132 = super.a.k();
                  super.b = var132;
               }

               return;
            } catch (Throwable var110) {
               x var127 = super.a.a((Throwable)null, this.c);
               super.b = var127;
            } finally {
               this.a(true);
            }

            return;
         case 2:
            try {
               an var117 = super.a.a();

               try {
                  an var125 = var117;
                  synchronized (var117.b) {
                     if (var125.a()) {
                        var125.b = false;
                        var125.a.a();

                        try {
                           long var6 = 5000L;
                           r var4 = var125.a;

                           for (long var8 = 0L; var8 < var6 && var4.a.isAlive(); var8 += 250L) {
                              Thread.sleep(250L);
                           }

                           var4.a.isAlive();
                        } catch (InterruptedException var105) {
                        }
                     }
                  }
               } catch (IOException var107) {
               }

               if (!var117.a()) {
                  x var126 = super.a.l();
                  super.b = var126;
               }

               return;
            } catch (Throwable var108) {
            } finally {
               this.a(true);
            }

            return;
         case 3:
            ay var115;
            ay var1 = var115 = this;

            try {
               aw var120 = var115.a.a();

               try {
                  var120.a(var1);
                  Vector var116 = var120.a;
                  if (var120.a != null && var116.size() > 0) {
                     x var124 = var115.a.h();
                     var115.b = var124;
                     return;
                  }
               } catch (SecurityException var94) {
                  x var123 = var115.a.a(var94);
                  var115.b = var123;
               } catch (BluetoothStateException var95) {
                  x var122 = var115.a.a(var95);
                  var115.b = var122;
               } catch (IOException var96) {
                  x var121 = var115.a.a(var96);
                  var115.b = var121;
               }

               return;
            } catch (Throwable var103) {
               x var2 = var115.a.a(var103);
               var115.b = var2;
            } finally {
               var115.a(true);
            }

            return;
         default:
            throw new IllegalStateException();
      }
   }

   public final void a(String var1) {
      super.a(var1);
   }
}
