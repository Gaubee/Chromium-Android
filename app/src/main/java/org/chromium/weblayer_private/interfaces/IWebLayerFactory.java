/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
// Factory for creating IWebLayer as well as determining if a particular version
// of a client is supported.

public interface IWebLayerFactory extends android.os.IInterface
{
  /** Default implementation for IWebLayerFactory. */
  class Default implements org.chromium.weblayer_private.interfaces.IWebLayerFactory
  {
    // Returns true if a client with the specified version is supported.

    @Override public boolean isClientSupported() throws android.os.RemoteException
    {
      return false;
    }
    // Creates a new IWebLayer. It is expected that a client has a single
    // IWebLayer. Further, at this time, only a single client is supported.

    @Override public org.chromium.weblayer_private.interfaces.IWebLayer createWebLayer() throws android.os.RemoteException
    {
      return null;
    }
    // Returns the full version string of the implementation.

    @Override public java.lang.String getImplementationVersion() throws android.os.RemoteException
    {
      return null;
    }
    // Returns the major version of the implementation.

    @Override public int getImplementationMajorVersion() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IWebLayerFactory
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IWebLayerFactory";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IWebLayerFactory interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IWebLayerFactory asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IWebLayerFactory))) {
        return ((org.chromium.weblayer_private.interfaces.IWebLayerFactory)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IWebLayerFactory.Stub.Proxy(obj);
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
        case TRANSACTION_isClientSupported:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isClientSupported();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_createWebLayer:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IWebLayer _result = this.createWebLayer();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getImplementationVersion:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getImplementationVersion();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getImplementationMajorVersion:
        {
          data.enforceInterface(descriptor);
          int _result = this.getImplementationMajorVersion();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IWebLayerFactory
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
      // Returns true if a client with the specified version is supported.

      @Override public boolean isClientSupported() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isClientSupported, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isClientSupported();
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
      // Creates a new IWebLayer. It is expected that a client has a single
      // IWebLayer. Further, at this time, only a single client is supported.

      @Override public org.chromium.weblayer_private.interfaces.IWebLayer createWebLayer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IWebLayer _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createWebLayer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createWebLayer();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IWebLayer.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Returns the full version string of the implementation.

      @Override public java.lang.String getImplementationVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImplementationVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getImplementationVersion();
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
      // Returns the major version of the implementation.

      @Override public int getImplementationMajorVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImplementationMajorVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getImplementationMajorVersion();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.weblayer_private.interfaces.IWebLayerFactory sDefaultImpl;
    }
    static final int TRANSACTION_isClientSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_createWebLayer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getImplementationVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getImplementationMajorVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IWebLayerFactory impl) {
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
    public static org.chromium.weblayer_private.interfaces.IWebLayerFactory getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Returns true if a client with the specified version is supported.

  boolean isClientSupported() throws android.os.RemoteException;
  // Creates a new IWebLayer. It is expected that a client has a single
  // IWebLayer. Further, at this time, only a single client is supported.

  org.chromium.weblayer_private.interfaces.IWebLayer createWebLayer() throws android.os.RemoteException;
  // Returns the full version string of the implementation.

  java.lang.String getImplementationVersion() throws android.os.RemoteException;
  // Returns the major version of the implementation.

  int getImplementationMajorVersion() throws android.os.RemoteException;
}
