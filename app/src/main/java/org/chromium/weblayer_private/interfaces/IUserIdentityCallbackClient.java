/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IUserIdentityCallbackClient extends android.os.IInterface
{
  /** Default implementation for IUserIdentityCallbackClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient
  {
    @Override public java.lang.String getEmail() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getFullName() throws android.os.RemoteException
    {
      return null;
    }
    // avatarLoadedWrapper is a ValueCallback<Bitmap> that updates the profile icon when run.

    @Override public void getAvatar(int desiredSize, org.chromium.weblayer_private.interfaces.IObjectWrapper avatarLoadedWrapper) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient))) {
        return ((org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient.Stub.Proxy(obj);
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
        case TRANSACTION_getEmail:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getEmail();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getFullName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getFullName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getAvatar:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.getAvatar(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient
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
      @Override public java.lang.String getEmail() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEmail, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getEmail();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getFullName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFullName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getFullName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // avatarLoadedWrapper is a ValueCallback<Bitmap> that updates the profile icon when run.

      @Override public void getAvatar(int desiredSize, org.chromium.weblayer_private.interfaces.IObjectWrapper avatarLoadedWrapper) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(desiredSize);
          _data.writeStrongBinder((((avatarLoadedWrapper!=null))?(avatarLoadedWrapper.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvatar, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getAvatar(desiredSize, avatarLoadedWrapper);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient sDefaultImpl;
    }
    static final int TRANSACTION_getEmail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getFullName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getAvatar = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  java.lang.String getEmail() throws android.os.RemoteException;
  java.lang.String getFullName() throws android.os.RemoteException;
  // avatarLoadedWrapper is a ValueCallback<Bitmap> that updates the profile icon when run.

  void getAvatar(int desiredSize, org.chromium.weblayer_private.interfaces.IObjectWrapper avatarLoadedWrapper) throws android.os.RemoteException;
}
