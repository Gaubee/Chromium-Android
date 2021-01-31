/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IRemoteFragmentClient extends android.os.IInterface
{
  /** Default implementation for IRemoteFragmentClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IRemoteFragmentClient
  {
    @Override public void superOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
    {
    }
    @Override public void superOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException
    {
    }
    @Override public void superOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
    {
    }
    @Override public void superOnStart() throws android.os.RemoteException
    {
    }
    @Override public void superOnResume() throws android.os.RemoteException
    {
    }
    @Override public void superOnPause() throws android.os.RemoteException
    {
    }
    @Override public void superOnStop() throws android.os.RemoteException
    {
    }
    @Override public void superOnDestroyView() throws android.os.RemoteException
    {
    }
    @Override public void superOnDetach() throws android.os.RemoteException
    {
    }
    @Override public void superOnDestroy() throws android.os.RemoteException
    {
    }
    @Override public void superOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getActivity() throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean startActivityForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean startIntentSenderForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper fillInIntent, int flagsMask, int flagsValues, int extraFlags, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean shouldShowRequestPermissionRationale(java.lang.String permission) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void requestPermissions(java.lang.String[] permissions, int requestCode) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getView() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void removeFragmentFromFragmentManager() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IRemoteFragmentClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IRemoteFragmentClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IRemoteFragmentClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IRemoteFragmentClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IRemoteFragmentClient))) {
        return ((org.chromium.weblayer_private.interfaces.IRemoteFragmentClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.Proxy(obj);
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
        case TRANSACTION_superOnCreate:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.superOnCreate(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnAttach:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.superOnAttach(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnActivityCreated:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.superOnActivityCreated(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnStart:
        {
          data.enforceInterface(descriptor);
          this.superOnStart();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnResume:
        {
          data.enforceInterface(descriptor);
          this.superOnResume();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnPause:
        {
          data.enforceInterface(descriptor);
          this.superOnPause();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnStop:
        {
          data.enforceInterface(descriptor);
          this.superOnStop();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnDestroyView:
        {
          data.enforceInterface(descriptor);
          this.superOnDestroyView();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnDetach:
        {
          data.enforceInterface(descriptor);
          this.superOnDetach();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnDestroy:
        {
          data.enforceInterface(descriptor);
          this.superOnDestroy();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_superOnSaveInstanceState:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.superOnSaveInstanceState(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getActivity:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.getActivity();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_startActivityForResult:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.startActivityForResult(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_startIntentSenderForResult:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg6;
          _arg6 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.startIntentSenderForResult(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_shouldShowRequestPermissionRationale:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.shouldShowRequestPermissionRationale(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_requestPermissions:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int _arg1;
          _arg1 = data.readInt();
          this.requestPermissions(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getView:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.getView();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_removeFragmentFromFragmentManager:
        {
          data.enforceInterface(descriptor);
          this.removeFragmentFromFragmentManager();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IRemoteFragmentClient
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
      @Override public void superOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((savedInstanceState!=null))?(savedInstanceState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnCreate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnCreate(savedInstanceState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((context!=null))?(context.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnAttach, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnAttach(context);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((savedInstanceState!=null))?(savedInstanceState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnActivityCreated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnActivityCreated(savedInstanceState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnStart() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnStart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnStart();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnResume() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnResume, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnResume();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnPause() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnPause, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnPause();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnStop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnStop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnStop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnDestroyView() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnDestroyView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnDestroyView();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnDetach() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnDetach, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnDetach();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnDestroy() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnDestroy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnDestroy();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void superOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((outState!=null))?(outState.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_superOnSaveInstanceState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().superOnSaveInstanceState(outState);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getActivity() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActivity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getActivity();
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
      @Override public boolean startActivityForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((intent!=null))?(intent.asBinder()):(null)));
          _data.writeInt(requestCode);
          _data.writeStrongBinder((((options!=null))?(options.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_startActivityForResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startActivityForResult(intent, requestCode, options);
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
      @Override public boolean startIntentSenderForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper fillInIntent, int flagsMask, int flagsValues, int extraFlags, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((intent!=null))?(intent.asBinder()):(null)));
          _data.writeInt(requestCode);
          _data.writeStrongBinder((((fillInIntent!=null))?(fillInIntent.asBinder()):(null)));
          _data.writeInt(flagsMask);
          _data.writeInt(flagsValues);
          _data.writeInt(extraFlags);
          _data.writeStrongBinder((((options!=null))?(options.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_startIntentSenderForResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
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
      @Override public boolean shouldShowRequestPermissionRationale(java.lang.String permission) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(permission);
          boolean _status = mRemote.transact(Stub.TRANSACTION_shouldShowRequestPermissionRationale, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().shouldShowRequestPermissionRationale(permission);
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
      @Override public void requestPermissions(java.lang.String[] permissions, int requestCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(permissions);
          _data.writeInt(requestCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestPermissions, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestPermissions(permissions, requestCode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getView() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getView();
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
      @Override public void removeFragmentFromFragmentManager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeFragmentFromFragmentManager, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeFragmentFromFragmentManager();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IRemoteFragmentClient sDefaultImpl;
    }
    static final int TRANSACTION_superOnCreate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_superOnAttach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_superOnActivityCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_superOnStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_superOnResume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_superOnPause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_superOnStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_superOnDestroyView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_superOnDetach = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_superOnDestroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_superOnSaveInstanceState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_startActivityForResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_startIntentSenderForResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_shouldShowRequestPermissionRationale = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_requestPermissions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_removeFragmentFromFragmentManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IRemoteFragmentClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void superOnCreate(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException;
  void superOnAttach(org.chromium.weblayer_private.interfaces.IObjectWrapper context) throws android.os.RemoteException;
  void superOnActivityCreated(org.chromium.weblayer_private.interfaces.IObjectWrapper savedInstanceState) throws android.os.RemoteException;
  void superOnStart() throws android.os.RemoteException;
  void superOnResume() throws android.os.RemoteException;
  void superOnPause() throws android.os.RemoteException;
  void superOnStop() throws android.os.RemoteException;
  void superOnDestroyView() throws android.os.RemoteException;
  void superOnDetach() throws android.os.RemoteException;
  void superOnDestroy() throws android.os.RemoteException;
  void superOnSaveInstanceState(org.chromium.weblayer_private.interfaces.IObjectWrapper outState) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper getActivity() throws android.os.RemoteException;
  boolean startActivityForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException;
  boolean startIntentSenderForResult(org.chromium.weblayer_private.interfaces.IObjectWrapper intent, int requestCode, org.chromium.weblayer_private.interfaces.IObjectWrapper fillInIntent, int flagsMask, int flagsValues, int extraFlags, org.chromium.weblayer_private.interfaces.IObjectWrapper options) throws android.os.RemoteException;
  boolean shouldShowRequestPermissionRationale(java.lang.String permission) throws android.os.RemoteException;
  void requestPermissions(java.lang.String[] permissions, int requestCode) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper getView() throws android.os.RemoteException;
  void removeFragmentFromFragmentManager() throws android.os.RemoteException;
}
