package com.hardwire.blob;

import com.hardwire.blob.Main;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class p implements Runnable {
   private Main a;
   byte[] a;
   String a;
   private boolean a;
   byte a;
   private HttpConnection a = null;

   public final void run() {
      String var1 = "http://hardwire.cz:80/gish/";
      switch (this.a) {
         case 0:
            var1 = var1 + "upload_score.php";
         default:
            var1 = var1.replace(' ', '+');
            Main.c = false;
            this.a = null;
            InputStream var2 = null;
            OutputStream var3 = null;
            StringBuffer var4 = null;
            this.a = false;

            try {
               this.a = (HttpConnection)Connector.open(var1, 3);
               if (this.a != null) {
                  this.a.setRequestProperty("Content-Type", "application/octet-stream");
                  this.a.setRequestProperty("Content-Length", Integer.toString(this.a.length + (this.a == null ? 0 : this.a.length())));
                  this.a.setRequestMethod("POST");
                  var3 = this.a.openOutputStream();
                  if (this.a != null) {
                     var3.write(this.a.getBytes());
                  }

                  var3.write(this.a);
                  switch (this.a.getResponseCode()) {
                     case 200:
                     case 201:
                        var4 = new StringBuffer();
                        var2 = this.a.openInputStream();

                        while ((var16 = var2.read()) != -1) {
                           var4.append((char)var16);
                        }

                        if (var4.toString().compareTo("ok") != 0) {
                           this.a = true;
                        }
                        break;
                     default:
                        this.a = true;
                  }
               }
            } catch (Exception var13) {
               this.a = true;
            } finally {
               try {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  if (this.a != null) {
                     this.a.close();
                  }
               } catch (IOException var11) {
               }

               this.a = null;
            }

            Main.c = true;
            if (var4 != null && var4.length() > 0 && var4.charAt(var4.length() - 1) == 0) {
               var4.delete(var4.length() - 1, var4.length());
            }

            if (var4 != null && var4.toString().compareTo("ok") != 0) {
               this.a = true;
            }

            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var12) {
            }

            if (this.a) {
               this.a.a.a((byte)34);
            } else {
               switch (this.a) {
                  case 0:
                     this.a.a.a((byte)35);
               }
            }

            this.a = null;
            this.a = null;
      }
   }

   public p(Main var1) {
      this.a = var1;
   }
}
