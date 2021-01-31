/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IUrlBarController extends android.os.IInterface
{
  /** Default implementation for IUrlBarController. */
  class Default implements org.chromium.weblayer_private.interfaces.IUrlBarController
  {
    // ID 0 was deprecatedCreateUrlBarView and was removed in M89.

    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper createUrlBarView(android.os.Bundle options, org.chromium.weblayer_private.interfaces.IObjectWrapper textClickListener, org.chromium.weblayer_private.interfaces.IObjectWrapper textLongClickListener) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IUrlBarController
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IUrlBarController";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IUrlBarController interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IUrlBarController asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IUrlBarController))) {
        return ((org.chromium.weblayer_private.interfaces.IUrlBarController)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IUrlBarController.Stub.Proxy(obj);
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
        case TRANSACTION_createUrlBarView:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.createUrlBarView(_arg0, _arg1, _arg2);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IUrlBarController
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
      // ID 0 was deprecatedCreateUrlBarView and was removed in M89.

      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper createUrlBarView(android.os.Bundle options, org.chromium.weblayer_private.interfaces.IObjectWrapper textClickListener, org.chromium.weblayer_private.interfaces.IObjectWrapper textLongClickListener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((textClickListener!=null))?(textClickListener.asBinder()):(null)));
          _data.writeStrongBinder((((textLongClickListener!=null))?(textLongClickListener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createUrlBarView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createUrlBarView(options, textClickListener, textLongClickListener);
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
      public static org.chromium.weblayer_private.interfaces.IUrlBarController sDefaultImpl;
    }
    static final int TRANSACTION_createUrlBarView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IUrlBarController impl) {
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
    public static org.chromium.weblayer_private.interfaces.IUrlBarController getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // ID 0 was deprecatedCreateUrlBarView and was removed in M89.

  org.chromium.weblayer_private.interfaces.IObjectWrapper createUrlBarView(android.os.Bundle options, org.chromium.weblayer_private.interfaces.IObjectWrapper textClickListener, org.chromium.weblayer_private.interfaces.IObjectWrapper textLongClickListener) throws android.os.RemoteException;
}
