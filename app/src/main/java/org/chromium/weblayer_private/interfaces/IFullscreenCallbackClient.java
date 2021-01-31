/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Used to forward FullscreenCallback calls to the client.
 */
public interface IFullscreenCallbackClient extends android.os.IInterface
{
  /** Default implementation for IFullscreenCallbackClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient
  {
    // exitFullscreenWrapper is a ValueCallback<Void> that when run exits
    // fullscreen.

    @Override public void enterFullscreen(org.chromium.weblayer_private.interfaces.IObjectWrapper exitFullscreenWrapper) throws android.os.RemoteException
    {
    }
    @Override public void exitFullscreen() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient))) {
        return ((org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient.Stub.Proxy(obj);
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
        case TRANSACTION_enterFullscreen:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.enterFullscreen(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_exitFullscreen:
        {
          data.enforceInterface(descriptor);
          this.exitFullscreen();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient
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
      // exitFullscreenWrapper is a ValueCallback<Void> that when run exits
      // fullscreen.

      @Override public void enterFullscreen(org.chromium.weblayer_private.interfaces.IObjectWrapper exitFullscreenWrapper) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((exitFullscreenWrapper!=null))?(exitFullscreenWrapper.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_enterFullscreen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enterFullscreen(exitFullscreenWrapper);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void exitFullscreen() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitFullscreen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().exitFullscreen();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient sDefaultImpl;
    }
    static final int TRANSACTION_enterFullscreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_exitFullscreen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // exitFullscreenWrapper is a ValueCallback<Void> that when run exits
  // fullscreen.

  void enterFullscreen(org.chromium.weblayer_private.interfaces.IObjectWrapper exitFullscreenWrapper) throws android.os.RemoteException;
  void exitFullscreen() throws android.os.RemoteException;
}
