/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Represents a navigation on the *client* side.
 */
public interface IClientNavigation extends android.os.IInterface
{
  /** Default implementation for IClientNavigation. */
  class Default implements org.chromium.weblayer_private.interfaces.IClientNavigation
  {
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IClientNavigation
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IClientNavigation";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IClientNavigation interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IClientNavigation asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IClientNavigation))) {
        return ((org.chromium.weblayer_private.interfaces.IClientNavigation)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IClientNavigation
    {
      private final android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      public static org.chromium.weblayer_private.interfaces.IClientNavigation sDefaultImpl;
    }
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IClientNavigation impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.weblayer_private.interfaces.IClientNavigation getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
}
