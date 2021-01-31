/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface ICrashReporterController extends android.os.IInterface
{
  /** Default implementation for ICrashReporterController. */
  class Default implements org.chromium.weblayer_private.interfaces.ICrashReporterController
  {
    @Override public void setClient(org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient client) throws android.os.RemoteException
    {
    }
    @Override public void checkForPendingCrashReports() throws android.os.RemoteException
    {
    }
    @Override public android.os.Bundle getCrashKeys(java.lang.String localId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void deleteCrash(java.lang.String localId) throws android.os.RemoteException
    {
    }
    @Override public void uploadCrash(java.lang.String localId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.ICrashReporterController
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.ICrashReporterController";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.ICrashReporterController interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.ICrashReporterController asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.ICrashReporterController))) {
        return ((org.chromium.weblayer_private.interfaces.ICrashReporterController)iin);
      }
      return new org.chromium.weblayer_private.interfaces.ICrashReporterController.Stub.Proxy(obj);
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
        case TRANSACTION_setClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient.Stub.asInterface(data.readStrongBinder());
          this.setClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_checkForPendingCrashReports:
        {
          data.enforceInterface(descriptor);
          this.checkForPendingCrashReports();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCrashKeys:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.Bundle _result = this.getCrashKeys(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_deleteCrash:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.deleteCrash(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_uploadCrash:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.uploadCrash(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.ICrashReporterController
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
      @Override public void setClient(org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void checkForPendingCrashReports() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkForPendingCrashReports, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkForPendingCrashReports();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.os.Bundle getCrashKeys(java.lang.String localId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCrashKeys, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCrashKeys(localId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.os.Bundle.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void deleteCrash(java.lang.String localId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteCrash, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().deleteCrash(localId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void uploadCrash(java.lang.String localId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_uploadCrash, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().uploadCrash(localId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.ICrashReporterController sDefaultImpl;
    }
    static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_checkForPendingCrashReports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getCrashKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deleteCrash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_uploadCrash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.ICrashReporterController impl) {
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
    public static org.chromium.weblayer_private.interfaces.ICrashReporterController getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void setClient(org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient client) throws android.os.RemoteException;
  void checkForPendingCrashReports() throws android.os.RemoteException;
  android.os.Bundle getCrashKeys(java.lang.String localId) throws android.os.RemoteException;
  void deleteCrash(java.lang.String localId) throws android.os.RemoteException;
  void uploadCrash(java.lang.String localId) throws android.os.RemoteException;
}
