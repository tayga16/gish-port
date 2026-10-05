package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.DataElement;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;

public final class at implements Runnable {
   private int b;
   private int c;
   private L2CAPConnection a;
   LocalDevice a;
   private L2CAPConnectionNotifier a;
   Vector a;
   private String a;
   int a;
   byte a;
   byte b;
   private u a;
   private boolean b;
   public boolean a;
   private boolean c = false;

   public at(u var1) {
      this.a = null;
      this.b = false;
      this.a = var1;
   }

   void a() {
      if (!this.c) {
         try {
            this.a = LocalDevice.getLocalDevice();
            this.a = this.a.getFriendlyName();
            if (this.a != null && this.a.length() != 0 && this.a.compareTo(" ") != 0) {
               StringBuffer var1;
               int var2 = (var1 = new StringBuffer(this.a)).length();

               for (int var3 = 0; var3 < var2; var3++) {
                  char var4;
                  if (((var4 = var1.charAt(var3)) < 'A' || var4 > 'Z') && (var4 < 'a' || var4 > 'z') && (var4 < '0' || var4 > '9')) {
                     var1.setCharAt(var3, '_');
                  }
               }

               this.a = var1.toString();
            } else {
               this.a = "unknown";
            }

            this.c = true;
         } catch (Exception var5) {
         }
      }
   }

   public final void run() {
      switch (this.b) {
         case 0:
            at var19 = this;
            boolean var21 = false;
            Main.c = false;
            if (!var19.b) {
               try {
                  var19.a.setDiscoverable(10390323);
                  String var22 = "btl2cap://localhost:01834587449266546213012382234327;ReceiveMTU=512;TransmitMTU=512;authenticate=true;authorize=true;encrypt=false;name="
                     + var19.a;
                  var19.a = (L2CAPConnectionNotifier)Connector.open(var22);
                  ServiceRecord var24;
                  (var24 = var19.a.getRecord(var19.a)).setAttributeValue(8, new DataElement(8, 255L));
                  var24.setDeviceServiceClasses(4194304);
               } catch (Exception var14) {
                  var21 = true;
               }

               Main.c = true;
               var19.a.b(var21);
               if (!var21) {
                  var19.b = true;

                  try {
                     var19.a = var19.a.acceptAndOpen();
                     var19.b = var19.a.getReceiveMTU();
                     var19.c = var19.a.getTransmitMTU();
                     var19.b = false;
                     var19.a = false;
                     Main.c = false;

                     try {
                        var19.a.setDiscoverable(0);
                        var19.a.close();
                     } catch (Exception var12) {
                     }

                     Main.c = true;
                  } catch (Exception var13) {
                     var21 = true;
                  }
               }

               var19.a.c(var21);
               return;
            }

            try {
               var19.a.setDiscoverable(10390323);
            } catch (Exception var16) {
            }

            Main.c = true;
            break;
         case 1:
            at var18 = this;
            boolean var20 = false;

            try {
               DiscoveryAgent var3 = var18.a.getDiscoveryAgent();
               var18.a.setDiscoverable(0);
               z var23;
               synchronized (var23 = new z(var18)) {
                  var3.startInquiry(10390323, var23);

                  try {
                     var23.wait();
                  } catch (InterruptedException var10) {
                  }
               }

               Enumeration var5 = var23.a.elements();

               while (var5.hasMoreElements()) {
                  synchronized (var23) {
                     var3.searchServices(
                        new int[]{256}, new UUID[]{new UUID("01834587449266546213012382234327", false)}, (RemoteDevice)var5.nextElement(), var23
                     );

                     try {
                        var23.wait();
                     } catch (InterruptedException var8) {
                     }
                  }
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var7) {
               }

               var18.a = var23.b;
            } catch (Exception var17) {
               var20 = true;
            }

            var18.a.a(var20);
            return;
         case 2:
            at var1 = this;
            boolean var2 = false;
            Main.c = false;

            try {
               String var4;
               if ((var4 = ((ServiceRecord)var1.a.elementAt(var1.a)).getConnectionURL(1, false)).indexOf("ReceiveMTU") == -1) {
                  var4 = var4 + ";ReceiveMTU=512";
               }

               if (var4.indexOf("TransmitMTU") == -1) {
                  var4 = var4 + ";TransmitMTU=512";
               }

               var1.a = (L2CAPConnection)Connector.open(var4);
               var1.b = var1.a.getReceiveMTU();
               var1.c = var1.a.getTransmitMTU();
               var1.a = false;
            } catch (Exception var15) {
               var2 = true;
            }

            Main.c = true;
            var1.a.d(var2);
      }
   }

   public final void b() {
      try {
         this.a = true;
         this.a.close();
      } catch (Exception var2) {
      }

      try {
         this.a.setDiscoverable(0);
      } catch (Exception var1) {
      }
   }

   public final ByteArrayInputStream a() {
      try {
         byte[] var1 = new byte[this.b];
         this.a.receive(var1);
         return new ByteArrayInputStream(var1);
      } catch (Exception var2) {
         return null;
      }
   }

   public final boolean a() {
      if (this.a) {
         return true;
      }

      try {
         return this.a.ready();
      } catch (IOException var1) {
         return true;
      }
   }

   public final boolean a(byte[] var1) {
      try {
         this.a.send(var1);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }
}
