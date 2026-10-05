package com.hardwire.blob;

import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

final class z implements DiscoveryListener {
   public Vector a = new Vector();
   public Vector b = new Vector();

   public z(at var1) {
   }

   public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
      if (var2.getMajorDeviceClass() == 512 && (var2.getServiceClasses() & 4194304) != 0 && !this.a.contains(var1)) {
         this.a.addElement(var1);
      }
   }

   public final void inquiryCompleted(int var1) {
      synchronized (this) {
         this.notify();
      }
   }

   public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
      if (var2 != null && var2.length == 1) {
         this.b.addElement(var2[0]);
      }
   }

   public final void serviceSearchCompleted(int var1, int var2) {
      synchronized (this) {
         this.notify();
      }
   }
}
