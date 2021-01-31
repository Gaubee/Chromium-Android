/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Used to forward download requests to the client.
 */
public interface IDownloadCallbackClient extends android.os.IInterface
{
  /** Default implementation for IDownloadCallbackClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
  {
    @Override public boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void allowDownload(java.lang.String uriString, java.lang.String requestMethod, java.lang.String requestInitiatorString, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IClientDownload createClientDownload(org.chromium.weblayer_private.interfaces.IDownload impl) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void downloadStarted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
    {
    }
    @Override public void downloadProgressChanged(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
    {
    }
    @Override public void downloadCompleted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
    {
    }
    @Override public void downloadFailed(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IDownloadCallbackClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IDownloadCallbackClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IDownloadCallbackClient))) {
        return ((org.chromium.weblayer_private.interfaces.IDownloadCallbackClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IDownloadCallbackClient.Stub.Proxy(obj);
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
        case TRANSACTION_interceptDownload:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          long _arg4;
          _arg4 = data.readLong();
          boolean _result = this.interceptDownload(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_allowDownload:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg3;
          _arg3 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.allowDownload(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createClientDownload:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IDownload _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IDownload.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IClientDownload _result = this.createClientDownload(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_downloadStarted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientDownload _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientDownload.Stub.asInterface(data.readStrongBinder());
          this.downloadStarted(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_downloadProgressChanged:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientDownload _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientDownload.Stub.asInterface(data.readStrongBinder());
          this.downloadProgressChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_downloadCompleted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientDownload _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientDownload.Stub.asInterface(data.readStrongBinder());
          this.downloadCompleted(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_downloadFailed:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientDownload _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientDownload.Stub.asInterface(data.readStrongBinder());
          this.downloadFailed(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
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
      @Override public boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uriString);
          _data.writeString(userAgent);
          _data.writeString(contentDisposition);
          _data.writeString(mimetype);
          _data.writeLong(contentLength);
          boolean _status = mRemote.transact(Stub.TRANSACTION_interceptDownload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().interceptDownload(uriString, userAgent, contentDisposition, mimetype, contentLength);
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
      @Override public void allowDownload(java.lang.String uriString, java.lang.String requestMethod, java.lang.String requestInitiatorString, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uriString);
          _data.writeString(requestMethod);
          _data.writeString(requestInitiatorString);
          _data.writeStrongBinder((((valueCallback!=null))?(valueCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_allowDownload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().allowDownload(uriString, requestMethod, requestInitiatorString, valueCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IClientDownload createClientDownload(org.chromium.weblayer_private.interfaces.IDownload impl) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IClientDownload _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((impl!=null))?(impl.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createClientDownload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createClientDownload(impl);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IClientDownload.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void downloadStarted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((download!=null))?(download.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_downloadStarted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().downloadStarted(download);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void downloadProgressChanged(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((download!=null))?(download.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_downloadProgressChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().downloadProgressChanged(download);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void downloadCompleted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((download!=null))?(download.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_downloadCompleted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().downloadCompleted(download);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void downloadFailed(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((download!=null))?(download.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_downloadFailed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().downloadFailed(download);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient sDefaultImpl;
    }
    static final int TRANSACTION_interceptDownload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_allowDownload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_createClientDownload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_downloadStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_downloadProgressChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_downloadCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_downloadFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IDownloadCallbackClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException;
  void allowDownload(java.lang.String uriString, java.lang.String requestMethod, java.lang.String requestInitiatorString, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IClientDownload createClientDownload(org.chromium.weblayer_private.interfaces.IDownload impl) throws android.os.RemoteException;
  void downloadStarted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException;
  void downloadProgressChanged(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException;
  void downloadCompleted(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException;
  void downloadFailed(org.chromium.weblayer_private.interfaces.IClientDownload download) throws android.os.RemoteException;
}
