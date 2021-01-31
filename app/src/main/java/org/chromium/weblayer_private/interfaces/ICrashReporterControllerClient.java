/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface ICrashReporterControllerClient extends android.os.IInterface
{
  /** Default implementation for ICrashReporterControllerClient. */
  class Default implements org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient
  {
    @Override public void onPendingCrashReports(java.lang.String[] localIds) throws android.os.RemoteException
    {
    }
    @Override public void onCrashDeleted(java.lang.String localId) throws android.os.RemoteException
    {
    }
    @Override public void onCrashUploadSucceeded(java.lang.String localId, java.lang.String reportId) throws android.os.RemoteException
    {
    }
    @Override public void onCrashUploadFailed(java.lang.String localId, java.lang.String failureMessage) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient))) {
        return ((org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient.Stub.Proxy(obj);
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
        case TRANSACTION_onPendingCrashReports:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          this.onPendingCrashReports(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onCrashDeleted:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onCrashDeleted(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onCrashUploadSucceeded:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onCrashUploadSucceeded(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onCrashUploadFailed:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onCrashUploadFailed(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient
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
      @Override public void onPendingCrashReports(java.lang.String[] localIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(localIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPendingCrashReports, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPendingCrashReports(localIds);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onCrashDeleted(java.lang.String localId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCrashDeleted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCrashDeleted(localId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onCrashUploadSucceeded(java.lang.String localId, java.lang.String reportId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          _data.writeString(reportId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCrashUploadSucceeded, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCrashUploadSucceeded(localId, reportId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onCrashUploadFailed(java.lang.String localId, java.lang.String failureMessage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(localId);
          _data.writeString(failureMessage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCrashUploadFailed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCrashUploadFailed(localId, failureMessage);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient sDefaultImpl;
    }
    static final int TRANSACTION_onPendingCrashReports = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onCrashDeleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onCrashUploadSucceeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onCrashUploadFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.ICrashReporterControllerClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void onPendingCrashReports(java.lang.String[] localIds) throws android.os.RemoteException;
  void onCrashDeleted(java.lang.String localId) throws android.os.RemoteException;
  void onCrashUploadSucceeded(java.lang.String localId, java.lang.String reportId) throws android.os.RemoteException;
  void onCrashUploadFailed(java.lang.String localId, java.lang.String failureMessage) throws android.os.RemoteException;
}
