/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IRemoteFragment extends android.os.IInterface
{
  /** Default implementation for IRemoteFragment. */
  class Default implements org.chromium.weblayer_private.interfaces.IRemoteFragment
  {
    // Using IObjectWrapper instead of Bundle to pass by reference instead of by value.

    @Override public void handleOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
    {
    }
    @Override public void handleOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException
    {
    }
    @Override public void handleOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
    {
    }
    // ID 3 was deprecatedHandleOnCreateView and was removed in M89.

    @Override public void handleOnStart() throws android.os.RemoteException
    {
    }
    @Override public void handleOnResume() throws android.os.RemoteException
    {
    }
    @Override public void handleOnPause() throws android.os.RemoteException
    {
    }
    @Override public void handleOnStop() throws android.os.RemoteException
    {
    }
    @Override public void handleOnDestroyView() throws android.os.RemoteException
    {
    }
    @Override public void handleOnDetach() throws android.os.RemoteException
    {
    }
    @Override public void handleOnDestroy() throws android.os.RemoteException
    {
    }
    @Override public void handleOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException
    {
    }
    // |data| is an Intent with the result returned from the activity.

    @Override public void handleOnActivityResult(int requestCode, int resultCode, org.chromium.weblayer_private.interfaces.IObjectWrapper data) throws android.os.RemoteException
    {
    }
    @Override public void handleOnRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper handleOnCreateView(org.chromium.weblayer_private.interfaces.IObjectWrapper container, org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IRemoteFragment
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IRemoteFragment";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IRemoteFragment interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IRemoteFragment asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IRemoteFragment))) {
        return ((org.chromium.weblayer_private.interfaces.IRemoteFragment)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IRemoteFragment.Stub.Proxy(obj);
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
        case TRANSACTION_handleOnCreate:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.handleOnCreate(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnAttach:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.handleOnAttach(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnActivityCreated:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.handleOnActivityCreated(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnStart:
        {
          data.enforceInterface(descriptor);
          this.handleOnStart();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnResume:
        {
          data.enforceInterface(descriptor);
          this.handleOnResume();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnPause:
        {
          data.enforceInterface(descriptor);
          this.handleOnPause();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnStop:
        {
          data.enforceInterface(descriptor);
          this.handleOnStop();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnDestroyView:
        {
          data.enforceInterface(descriptor);
          this.handleOnDestroyView();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnDetach:
        {
          data.enforceInterface(descriptor);
          this.handleOnDetach();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnDestroy:
        {
          data.enforceInterface(descriptor);
          this.handleOnDestroy();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnSaveInstanceState:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.handleOnSaveInstanceState(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnActivityResult:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.handleOnActivityResult(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnRequestPermissionsResult:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          this.handleOnRequestPermissionsResult(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_handleOnCreateView:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.handleOnCreateView(_arg0, _arg1);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IRemoteFragment
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
      // Using IObjectWrapper instead of Bundle to pass by reference instead of by value.

      @Override public void handleOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((savedInstanceState!=null))?(savedInstanceState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnCreate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnCreate(savedInstanceState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((context!=null))?(context.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnAttach, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnAttach(context);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((savedInstanceState!=null))?(savedInstanceState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnActivityCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnActivityCreated(savedInstanceState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // ID 3 was deprecatedHandleOnCreateView and was removed in M89.

      @Override public void handleOnStart() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnStart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnStart();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnResume() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnResume, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnResume();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnPause() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnPause, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnPause();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnStop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnStop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnStop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnDestroyView() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnDestroyView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnDestroyView();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnDetach() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnDetach, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnDetach();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnDestroy() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnDestroy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnDestroy();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((outState!=null))?(outState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnSaveInstanceState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnSaveInstanceState(outState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // |data| is an Intent with the result returned from the activity.

      @Override public void handleOnActivityResult(int requestCode, int resultCode, org.chromium.weblayer_private.interfaces.IObjectWrapper data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(requestCode);
          _data.writeInt(resultCode);
          _data.writeStrongBinder((((data!=null))?(data.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnActivityResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnActivityResult(requestCode, resultCode, data);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void handleOnRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(requestCode);
          _data.writeStringArray(permissions);
          _data.writeIntArray(grantResults);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnRequestPermissionsResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleOnRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper handleOnCreateView(org.chromium.weblayer_private.interfaces.IObjectWrapper container, org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((container!=null))?(container.asBinder()):(null)));
          _data.writeStrongBinder((((savedInstanceState!=null))?(savedInstanceState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleOnCreateView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().handleOnCreateView(container, savedInstanceState);
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
      public static org.chromium.weblayer_private.interfaces.IRemoteFragment sDefaultImpl;
    }
    static final int TRANSACTION_handleOnCreate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_handleOnAttach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_handleOnActivityCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_handleOnStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_handleOnResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_handleOnPause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_handleOnStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_handleOnDestroyView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_handleOnDetach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_handleOnDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_handleOnSaveInstanceState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_handleOnActivityResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_handleOnRequestPermissionsResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_handleOnCreateView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IRemoteFragment impl) {
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
    public static org.chromium.weblayer_private.interfaces.IRemoteFragment getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Using IObjectWrapper instead of Bundle to pass by reference instead of by value.

  void handleOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException;
  void handleOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException;
  void handleOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException;
  // ID 3 was deprecatedHandleOnCreateView and was removed in M89.

  void handleOnStart() throws android.os.RemoteException;
  void handleOnResume() throws android.os.RemoteException;
  void handleOnPause() throws android.os.RemoteException;
  void handleOnStop() throws android.os.RemoteException;
  void handleOnDestroyView() throws android.os.RemoteException;
  void handleOnDetach() throws android.os.RemoteException;
  void handleOnDestroy() throws android.os.RemoteException;
  void handleOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException;
  // |data| is an Intent with the result returned from the activity.

  void handleOnActivityResult(int requestCode, int resultCode, org.chromium.weblayer_private.interfaces.IObjectWrapper data) throws android.os.RemoteException;
  void handleOnRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper handleOnCreateView(org.chromium.weblayer_private.interfaces.IObjectWrapper container, org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException;
}
