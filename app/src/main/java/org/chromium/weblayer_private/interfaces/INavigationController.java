/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface INavigationController extends android.os.IInterface
{
  /** Default implementation for INavigationController. */
  class Default implements org.chromium.weblayer_private.interfaces.INavigationController
  {
    // Deprecated in M89.

    @Override public void navigate(java.lang.String uri, org.chromium.weblayer_private.interfaces.NavigateParams params) throws android.os.RemoteException
    {
    }
    @Override public void goBack() throws android.os.RemoteException
    {
    }
    @Override public void goForward() throws android.os.RemoteException
    {
    }
    @Override public void reload() throws android.os.RemoteException
    {
    }
    @Override public void stop() throws android.os.RemoteException
    {
    }
    @Override public int getNavigationListSize() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getNavigationListCurrentIndex() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.lang.String getNavigationEntryDisplayUri(int index) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean canGoBack() throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean canGoForward() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void goToIndex(int index) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getNavigationEntryTitle(int index) throws android.os.RemoteException
    {
      return null;
    }
    // ID 12 was replace and was removed in M83.

    @Override public boolean isNavigationEntrySkippable(int index) throws android.os.RemoteException
    {
      return false;
    }
    // Deprecated in M89.

    @Override public void navigate2(java.lang.String uri, boolean shouldReplaceEntry, boolean disableIntentProcessing, boolean disableNetworkErrorAutoReload, boolean enableAutoPlay) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.INavigateParams createNavigateParams() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void navigate3(java.lang.String uri, org.chromium.weblayer_private.interfaces.INavigateParams params) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.INavigationController
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.INavigationController";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.INavigationController interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.INavigationController asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.INavigationController))) {
        return ((org.chromium.weblayer_private.interfaces.INavigationController)iin);
      }
      return new org.chromium.weblayer_private.interfaces.INavigationController.Stub.Proxy(obj);
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
        case TRANSACTION_navigate:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.NavigateParams _arg1;
          if ((0!=data.readInt())) {
            _arg1 = org.chromium.weblayer_private.interfaces.NavigateParams.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.navigate(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_goBack:
        {
          data.enforceInterface(descriptor);
          this.goBack();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_goForward:
        {
          data.enforceInterface(descriptor);
          this.goForward();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_reload:
        {
          data.enforceInterface(descriptor);
          this.reload();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stop:
        {
          data.enforceInterface(descriptor);
          this.stop();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getNavigationListSize:
        {
          data.enforceInterface(descriptor);
          int _result = this.getNavigationListSize();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getNavigationListCurrentIndex:
        {
          data.enforceInterface(descriptor);
          int _result = this.getNavigationListCurrentIndex();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getNavigationEntryDisplayUri:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getNavigationEntryDisplayUri(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_canGoBack:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.canGoBack();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_canGoForward:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.canGoForward();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_goToIndex:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.goToIndex(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getNavigationEntryTitle:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getNavigationEntryTitle(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_isNavigationEntrySkippable:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.isNavigationEntrySkippable(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_navigate2:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          this.navigate2(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createNavigateParams:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.INavigateParams _result = this.createNavigateParams();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_navigate3:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.INavigateParams _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.INavigateParams.Stub.asInterface(data.readStrongBinder());
          this.navigate3(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.INavigationController
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
      // Deprecated in M89.

      @Override public void navigate(java.lang.String uri, org.chromium.weblayer_private.interfaces.NavigateParams params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          if ((params!=null)) {
            _data.writeInt(1);
            params.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigate(uri, params);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void goBack() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_goBack, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().goBack();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void goForward() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_goForward, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().goForward();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void reload() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reload();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getNavigationListSize() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNavigationListSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNavigationListSize();
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
      @Override public int getNavigationListCurrentIndex() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNavigationListCurrentIndex, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNavigationListCurrentIndex();
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
      @Override public java.lang.String getNavigationEntryDisplayUri(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNavigationEntryDisplayUri, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNavigationEntryDisplayUri(index);
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
      @Override public boolean canGoBack() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_canGoBack, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().canGoBack();
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
      @Override public boolean canGoForward() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_canGoForward, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().canGoForward();
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
      @Override public void goToIndex(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_goToIndex, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().goToIndex(index);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getNavigationEntryTitle(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNavigationEntryTitle, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNavigationEntryTitle(index);
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
      // ID 12 was replace and was removed in M83.

      @Override public boolean isNavigationEntrySkippable(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNavigationEntrySkippable, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isNavigationEntrySkippable(index);
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
      // Deprecated in M89.

      @Override public void navigate2(java.lang.String uri, boolean shouldReplaceEntry, boolean disableIntentProcessing, boolean disableNetworkErrorAutoReload, boolean enableAutoPlay) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          _data.writeInt(((shouldReplaceEntry)?(1):(0)));
          _data.writeInt(((disableIntentProcessing)?(1):(0)));
          _data.writeInt(((disableNetworkErrorAutoReload)?(1):(0)));
          _data.writeInt(((enableAutoPlay)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigate2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigate2(uri, shouldReplaceEntry, disableIntentProcessing, disableNetworkErrorAutoReload, enableAutoPlay);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.INavigateParams createNavigateParams() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.INavigateParams _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createNavigateParams, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createNavigateParams();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.INavigateParams.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void navigate3(java.lang.String uri, org.chromium.weblayer_private.interfaces.INavigateParams params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          _data.writeStrongBinder((((params!=null))?(params.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigate3, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigate3(uri, params);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.INavigationController sDefaultImpl;
    }
    static final int TRANSACTION_navigate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_goBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_goForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_reload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getNavigationListSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getNavigationListCurrentIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getNavigationEntryDisplayUri = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_canGoBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_canGoForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_goToIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getNavigationEntryTitle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_isNavigationEntrySkippable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_navigate2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_createNavigateParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_navigate3 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.INavigationController impl) {
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
    public static org.chromium.weblayer_private.interfaces.INavigationController getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Deprecated in M89.

  void navigate(java.lang.String uri, org.chromium.weblayer_private.interfaces.NavigateParams params) throws android.os.RemoteException;
  void goBack() throws android.os.RemoteException;
  void goForward() throws android.os.RemoteException;
  void reload() throws android.os.RemoteException;
  void stop() throws android.os.RemoteException;
  int getNavigationListSize() throws android.os.RemoteException;
  int getNavigationListCurrentIndex() throws android.os.RemoteException;
  java.lang.String getNavigationEntryDisplayUri(int index) throws android.os.RemoteException;
  boolean canGoBack() throws android.os.RemoteException;
  boolean canGoForward() throws android.os.RemoteException;
  void goToIndex(int index) throws android.os.RemoteException;
  java.lang.String getNavigationEntryTitle(int index) throws android.os.RemoteException;
  // ID 12 was replace and was removed in M83.

  boolean isNavigationEntrySkippable(int index) throws android.os.RemoteException;
  // Deprecated in M89.

  void navigate2(java.lang.String uri, boolean shouldReplaceEntry, boolean disableIntentProcessing, boolean disableNetworkErrorAutoReload, boolean enableAutoPlay) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.INavigateParams createNavigateParams() throws android.os.RemoteException;
  void navigate3(java.lang.String uri, org.chromium.weblayer_private.interfaces.INavigateParams params) throws android.os.RemoteException;
}
