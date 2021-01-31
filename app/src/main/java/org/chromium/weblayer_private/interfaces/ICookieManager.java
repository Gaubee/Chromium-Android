/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface ICookieManager extends android.os.IInterface
{
  /** Default implementation for ICookieManager. */
  class Default implements org.chromium.weblayer_private.interfaces.ICookieManager
  {
    @Override public boolean setCookie(java.lang.String url, java.lang.String value, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void getCookie(java.lang.String url, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper addCookieChangedCallback(java.lang.String url, java.lang.String name, org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient callback) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.ICookieManager
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.ICookieManager";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.ICookieManager interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.ICookieManager asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.ICookieManager))) {
        return ((org.chromium.weblayer_private.interfaces.ICookieManager)iin);
      }
      return new org.chromium.weblayer_private.interfaces.ICookieManager.Stub.Proxy(obj);
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
        case TRANSACTION_setCookie:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.setCookie(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getCookie:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.getCookie(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addCookieChangedCallback:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.addCookieChangedCallback(_arg0, _arg1, _arg2);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.ICookieManager
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
      @Override public boolean setCookie(java.lang.String url, java.lang.String value, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(url);
          _data.writeString(value);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCookie, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setCookie(url, value, callback);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void getCookie(java.lang.String url, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(url);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCookie, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getCookie(url, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper addCookieChangedCallback(java.lang.String url, java.lang.String name, org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(url);
          _data.writeString(name);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_addCookieChangedCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addCookieChangedCallback(url, name, callback);
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
      public static org.chromium.weblayer_private.interfaces.ICookieManager sDefaultImpl;
    }
    static final int TRANSACTION_setCookie = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getCookie = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_addCookieChangedCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.ICookieManager impl) {
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
    public static org.chromium.weblayer_private.interfaces.ICookieManager getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  boolean setCookie(java.lang.String url, java.lang.String value, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException;
  void getCookie(java.lang.String url, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper addCookieChangedCallback(java.lang.String url, java.lang.String name, org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient callback) throws android.os.RemoteException;
}
