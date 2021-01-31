/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Holds on to the native ContextMenuParams object.
 */
public interface IContextMenuParams extends android.os.IInterface
{
  /** Default implementation for IContextMenuParams. */
  class Default implements org.chromium.weblayer_private.interfaces.IContextMenuParams
  {
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IContextMenuParams
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IContextMenuParams";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IContextMenuParams interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IContextMenuParams asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IContextMenuParams))) {
        return ((org.chromium.weblayer_private.interfaces.IContextMenuParams)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IContextMenuParams.Stub.Proxy(obj);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IContextMenuParams
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
      public static org.chromium.weblayer_private.interfaces.IContextMenuParams sDefaultImpl;
    }
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IContextMenuParams impl) {
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
    public static org.chromium.weblayer_private.interfaces.IContextMenuParams getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
}
