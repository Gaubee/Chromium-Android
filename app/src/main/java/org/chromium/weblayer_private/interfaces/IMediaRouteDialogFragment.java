/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IMediaRouteDialogFragment extends android.os.IInterface
{
  /** Default implementation for IMediaRouteDialogFragment. */
  class Default implements org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment
  {
    @Override public org.chromium.weblayer_private.interfaces.IRemoteFragment asRemoteFragment() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment))) {
        return ((org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment.Stub.Proxy(obj);
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
        case TRANSACTION_asRemoteFragment:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragment _result = this.asRemoteFragment();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment
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
      @Override public org.chromium.weblayer_private.interfaces.IRemoteFragment asRemoteFragment() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IRemoteFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_asRemoteFragment, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().asRemoteFragment();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IRemoteFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment sDefaultImpl;
    }
    static final int TRANSACTION_asRemoteFragment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment impl) {
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
    public static org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  org.chromium.weblayer_private.interfaces.IRemoteFragment asRemoteFragment() throws android.os.RemoteException;
}
