package com.hardwire.blob;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

final class az {
   private az() {
   }

   static Hashtable a(boolean var0) {
      RecordStore var1 = null;

      try {
         if (var0) {
            var1 = a("com.zeemote.zc.lzp", true);
         } else {
            var1 = a();
         }

         return a(var1);
      } finally {
         if (null != var1) {
            try {
               var1.closeRecordStore();
            } catch (RecordStoreException var5) {
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static void a(Hashtable var0, boolean var1) {
      RecordStore var2 = null;

      try {
         if (var1) {
            var2 = a("com.zeemote.zc.lzp", true);
         } else {
            var2 = a();
         }

         RecordStore var36 = var2;
         var0 = var0;
         RecordEnumeration var3 = null;
         DataOutputStream var4 = null;
         ByteArrayOutputStream var5 = null;
         boolean var26 = false /* VF: Semaphore variable */;

         try {
            var26 = true;
            var5 = new ByteArrayOutputStream();
            (var4 = new DataOutputStream(var5)).writeInt(1);
            Enumeration var6 = var0.keys();

            while (var6.hasMoreElements()) {
               String var7 = (String)var6.nextElement();
               String var8 = (String)var0.get(var7);
               var4.writeUTF(var7);
               var4.writeUTF(var8);
            }

            var4.flush();
            var4.close();
            var4 = null;
            byte[] var37 = var5.toByteArray();
            var3 = var36.enumerateRecords(null, null, false);

            while (var3.hasNextElement()) {
               var36.deleteRecord(var3.nextRecordId());
            }

            var36.addRecord(var37, 0, var37.length);
            var26 = false;
         } catch (RecordStoreException var31) {
            throw new IOException(var31.getMessage());
         } catch (SecurityException var32) {
            throw new IOException(var32.getMessage());
         } finally {
            if (var26) {
               if (null != var3) {
                  var3.destroy();
               }

               if (null != var5) {
                  try {
                     var5.close();
                  } catch (IOException var29) {
                  }
               }

               if (null != var4) {
                  try {
                     var4.close();
                  } catch (IOException var28) {
                  }
               }
            }
         }

         if (null != var3) {
            var3.destroy();
         }

         if (null != var5) {
            try {
               var5.close();
            } catch (IOException var30) {
            }
         }
      } finally {
         if (null != var2) {
            try {
               var2.closeRecordStore();
            } catch (RecordStoreException var27) {
            }
         }
      }
   }

   private static RecordStore a() {
      try {
         return RecordStore.openRecordStore("gzp", "Zeemote, Inc.", "Zeemote Manager");
      } catch (RecordStoreException var1) {
         throw new IOException(var1.getMessage());
      } catch (SecurityException var2) {
         throw new IOException(var2.getMessage());
      }
   }

   private static Hashtable a(RecordStore var0) {
      RecordEnumeration var1 = null;
      DataInputStream var2 = null;

      try {
         var1 = var0.enumerateRecords(null, null, false);
         Hashtable var12 = new Hashtable();
         byte[] var3;
         if (var1.hasNextElement() && (var3 = var1.nextRecord()) != null && (var2 = new DataInputStream(new ByteArrayInputStream(var3))).available() > 0) {
            int var10000 = var2.readInt();
            boolean var13 = false;
            if (var10000 != 1) {
               throw new IOException();
            }

            while (var2.available() > 0) {
               String var14 = var2.readUTF();
               String var4 = var2.readUTF();
               var12.put(var14, var4);
            }
         }

         return var12;
      } catch (RecordStoreException var10) {
         throw new IOException(var10.getMessage());
      } finally {
         if (null != var2) {
            try {
               var2.close();
            } catch (IOException var9) {
            }
         }

         if (null != var1) {
            var1.destroy();
         }
      }
   }

   private static RecordStore a(String var0, boolean var1) {
      RecordStore var4 = null;

      try {
         (var4 = RecordStore.openRecordStore(var0, true)).setMode(0, true);
         return var4;
      } catch (RecordStoreException var2) {
         throw new IOException(var2.getMessage());
      } catch (SecurityException var3) {
         throw new IOException(var3.getMessage());
      }
   }
}
