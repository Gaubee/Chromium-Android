/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/** Interface to forward service calls to the service implementation. */
public interface IChildProcessService extends android.os.IInterface
{
  /** Default implementation for IChildProcessService. */
  class Default implements org.chromium.weblayer_private.interfaces.IChildProcessService
  {
    @Override public void onCreate() throws android.os.RemoteException
    {
    }
    @Override public void onDestroy() throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper onBind(org.chromium.weblayer_private.interfaces.IObjectWrapper intent) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IChildProcessService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IChildProcessService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IChildProcessService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IChildProcessService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IChildProcessService))) {
        return ((org.chromium.weblayer_private.interfaces.IChildProcessService)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IChildProcessService.Stub.Proxy(obj);
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
        case TRANSACTION_onCreate:
        {
          data.enforceInterface(descriptor);
          this.onCreate();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onDestroy:
        {
          data.enforceInterface(descriptor);
          this.onDestroy();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onBind:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.onBind(_arg0);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IChildProcessService
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
      @Override public void onCreate() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCreate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCreate();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onDestroy() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDestroy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onDestroy();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper onBind(org.chromium.weblayer_private.interfaces.IObjectWrapper intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((intent!=null))?(intent.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBind, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().onBind(intent);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.weblayer_private.interfaces.IChildProcessService sDefaultImpl;
    }
    static final int TRANSACTION_onCreate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onBind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IChildProcessService impl) {
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
    public static org.chromium.weblayer_private.interfaces.IChildProcessService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void onCreate() throws android.os.RemoteException;
  void onDestroy() throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper onBind(org.chromium.weblayer_private.interfaces.IObjectWrapper intent) throws android.os.RemoteException;
}
