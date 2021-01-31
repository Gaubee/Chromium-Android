/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IWebMessageCallbackClient extends android.os.IInterface
{
  /** Default implementation for IWebMessageCallbackClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient
  {
    @Override public void onNewReplyProxy(org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy proxy, int proxyId, boolean isMainFrame, java.lang.String sourceOrigin) throws android.os.RemoteException
    {
    }
    @Override public void onPostMessage(int proxyId, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override public void onReplyProxyDestroyed(int proxyId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient))) {
        return ((org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient.Stub.Proxy(obj);
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
        case TRANSACTION_onNewReplyProxy:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          java.lang.String _arg3;
          _arg3 = data.readString();
          this.onNewReplyProxy(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onPostMessage:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onPostMessage(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onReplyProxyDestroyed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onReplyProxyDestroyed(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient
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
      @Override public void onNewReplyProxy(org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy proxy, int proxyId, boolean isMainFrame, java.lang.String sourceOrigin) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((proxy!=null))?(proxy.asBinder()):(null)));
          _data.writeInt(proxyId);
          _data.writeInt(((isMainFrame)?(1):(0)));
          _data.writeString(sourceOrigin);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onNewReplyProxy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onNewReplyProxy(proxy, proxyId, isMainFrame, sourceOrigin);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onPostMessage(int proxyId, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(proxyId);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPostMessage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPostMessage(proxyId, message);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onReplyProxyDestroyed(int proxyId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(proxyId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onReplyProxyDestroyed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onReplyProxyDestroyed(proxyId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient sDefaultImpl;
    }
    static final int TRANSACTION_onNewReplyProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onPostMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onReplyProxyDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void onNewReplyProxy(org.chromium.weblayer_private.interfaces.IWebMessageReplyProxy proxy, int proxyId, boolean isMainFrame, java.lang.String sourceOrigin) throws android.os.RemoteException;
  void onPostMessage(int proxyId, java.lang.String message) throws android.os.RemoteException;
  void onReplyProxyDestroyed(int proxyId) throws android.os.RemoteException;
}
