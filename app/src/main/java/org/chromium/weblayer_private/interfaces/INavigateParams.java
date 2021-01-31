/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Provides parameters for NavigationController.navigate.
 */
public interface INavigateParams extends android.os.IInterface
{
  /** Default implementation for INavigateParams. */
  class Default implements org.chromium.weblayer_private.interfaces.INavigateParams
  {
    @Override public void replaceCurrentEntry() throws android.os.RemoteException
    {
    }
    @Override public void disableIntentProcessing() throws android.os.RemoteException
    {
    }
    @Override public void disableNetworkErrorAutoReload() throws android.os.RemoteException
    {
    }
    @Override public void enableAutoPlay() throws android.os.RemoteException
    {
    }
    @Override public void setResponse(org.chromium.weblayer_private.interfaces.IObjectWrapper response) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.INavigateParams
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.INavigateParams";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.INavigateParams interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.INavigateParams asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.INavigateParams))) {
        return ((org.chromium.weblayer_private.interfaces.INavigateParams)iin);
      }
      return new org.chromium.weblayer_private.interfaces.INavigateParams.Stub.Proxy(obj);
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
        case TRANSACTION_replaceCurrentEntry:
        {
          data.enforceInterface(descriptor);
          this.replaceCurrentEntry();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_disableIntentProcessing:
        {
          data.enforceInterface(descriptor);
          this.disableIntentProcessing();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_disableNetworkErrorAutoReload:
        {
          data.enforceInterface(descriptor);
          this.disableNetworkErrorAutoReload();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enableAutoPlay:
        {
          data.enforceInterface(descriptor);
          this.enableAutoPlay();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setResponse:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.setResponse(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.INavigateParams
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
      @Override public void replaceCurrentEntry() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_replaceCurrentEntry, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().replaceCurrentEntry();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void disableIntentProcessing() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableIntentProcessing, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().disableIntentProcessing();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void disableNetworkErrorAutoReload() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableNetworkErrorAutoReload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().disableNetworkErrorAutoReload();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void enableAutoPlay() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableAutoPlay, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enableAutoPlay();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setResponse(org.chromium.weblayer_private.interfaces.IObjectWrapper response) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((response!=null))?(response.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setResponse, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setResponse(response);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.INavigateParams sDefaultImpl;
    }
    static final int TRANSACTION_replaceCurrentEntry = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_disableIntentProcessing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_disableNetworkErrorAutoReload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_enableAutoPlay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.INavigateParams impl) {
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
    public static org.chromium.weblayer_private.interfaces.INavigateParams getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void replaceCurrentEntry() throws android.os.RemoteException;
  void disableIntentProcessing() throws android.os.RemoteException;
  void disableNetworkErrorAutoReload() throws android.os.RemoteException;
  void enableAutoPlay() throws android.os.RemoteException;
  void setResponse(org.chromium.weblayer_private.interfaces.IObjectWrapper response) throws android.os.RemoteException;
}
