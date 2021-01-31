/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Interface used by NavigationController to inform the client of changes. This largely duplicates
 * the NavigationCallback interface, but is a singleton to avoid unnecessary IPC.
 */
public interface INavigationControllerClient extends android.os.IInterface
{
  /** Default implementation for INavigationControllerClient. */
  class Default implements org.chromium.weblayer_private.interfaces.INavigationControllerClient
  {
    @Override public org.chromium.weblayer_private.interfaces.IClientNavigation createClientNavigation(org.chromium.weblayer_private.interfaces.INavigation impl) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void navigationStarted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
    {
    }
    @Override public void navigationRedirected(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
    {
    }
    @Override public void readyToCommitNavigation(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
    {
    }
    @Override public void navigationCompleted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
    {
    }
    @Override public void navigationFailed(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
    {
    }
    @Override public void loadStateChanged(boolean isLoading, boolean toDifferentDocument) throws android.os.RemoteException
    {
    }
    @Override public void loadProgressChanged(double progress) throws android.os.RemoteException
    {
    }
    @Override public void onFirstContentfulPaint() throws android.os.RemoteException
    {
    }
    @Override public void onOldPageNoLongerRendered(java.lang.String uri) throws android.os.RemoteException
    {
    }
    // Added in M88.

    @Override public void onFirstContentfulPaint2(long navigationStartMs, long firstContentfulPaintDurationMs) throws android.os.RemoteException
    {
    }
    @Override public void onLargestContentfulPaint(long navigationStartMs, long largestContentfulPaintDurationMs) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.INavigationControllerClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.INavigationControllerClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.INavigationControllerClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.INavigationControllerClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.INavigationControllerClient))) {
        return ((org.chromium.weblayer_private.interfaces.INavigationControllerClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.INavigationControllerClient.Stub.Proxy(obj);
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
        case TRANSACTION_createClientNavigation:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.INavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.INavigation.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IClientNavigation _result = this.createClientNavigation(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_navigationStarted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientNavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(data.readStrongBinder());
          this.navigationStarted(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_navigationRedirected:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientNavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(data.readStrongBinder());
          this.navigationRedirected(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_readyToCommitNavigation:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientNavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(data.readStrongBinder());
          this.readyToCommitNavigation(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_navigationCompleted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientNavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(data.readStrongBinder());
          this.navigationCompleted(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_navigationFailed:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IClientNavigation _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(data.readStrongBinder());
          this.navigationFailed(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_loadStateChanged:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.loadStateChanged(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_loadProgressChanged:
        {
          data.enforceInterface(descriptor);
          double _arg0;
          _arg0 = data.readDouble();
          this.loadProgressChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onFirstContentfulPaint:
        {
          data.enforceInterface(descriptor);
          this.onFirstContentfulPaint();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onOldPageNoLongerRendered:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onOldPageNoLongerRendered(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onFirstContentfulPaint2:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          long _arg1;
          _arg1 = data.readLong();
          this.onFirstContentfulPaint2(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onLargestContentfulPaint:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          long _arg1;
          _arg1 = data.readLong();
          this.onLargestContentfulPaint(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.INavigationControllerClient
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
      @Override public org.chromium.weblayer_private.interfaces.IClientNavigation createClientNavigation(org.chromium.weblayer_private.interfaces.INavigation impl) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IClientNavigation _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((impl!=null))?(impl.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createClientNavigation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createClientNavigation(impl);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IClientNavigation.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void navigationStarted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((navigation!=null))?(navigation.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigationStarted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigationStarted(navigation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void navigationRedirected(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((navigation!=null))?(navigation.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigationRedirected, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigationRedirected(navigation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void readyToCommitNavigation(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((navigation!=null))?(navigation.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_readyToCommitNavigation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().readyToCommitNavigation(navigation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void navigationCompleted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((navigation!=null))?(navigation.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigationCompleted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigationCompleted(navigation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void navigationFailed(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((navigation!=null))?(navigation.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_navigationFailed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().navigationFailed(navigation);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void loadStateChanged(boolean isLoading, boolean toDifferentDocument) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isLoading)?(1):(0)));
          _data.writeInt(((toDifferentDocument)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadStateChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadStateChanged(isLoading, toDifferentDocument);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void loadProgressChanged(double progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeDouble(progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadProgressChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadProgressChanged(progress);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onFirstContentfulPaint() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFirstContentfulPaint, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onFirstContentfulPaint();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onOldPageNoLongerRendered(java.lang.String uri) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onOldPageNoLongerRendered, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onOldPageNoLongerRendered(uri);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Added in M88.

      @Override public void onFirstContentfulPaint2(long navigationStartMs, long firstContentfulPaintDurationMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(navigationStartMs);
          _data.writeLong(firstContentfulPaintDurationMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFirstContentfulPaint2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onFirstContentfulPaint2(navigationStartMs, firstContentfulPaintDurationMs);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onLargestContentfulPaint(long navigationStartMs, long largestContentfulPaintDurationMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(navigationStartMs);
          _data.writeLong(largestContentfulPaintDurationMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onLargestContentfulPaint, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onLargestContentfulPaint(navigationStartMs, largestContentfulPaintDurationMs);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.INavigationControllerClient sDefaultImpl;
    }
    static final int TRANSACTION_createClientNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_navigationStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_navigationRedirected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_readyToCommitNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_navigationCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_navigationFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_loadStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_loadProgressChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onFirstContentfulPaint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onOldPageNoLongerRendered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onFirstContentfulPaint2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onLargestContentfulPaint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.INavigationControllerClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.INavigationControllerClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  org.chromium.weblayer_private.interfaces.IClientNavigation createClientNavigation(org.chromium.weblayer_private.interfaces.INavigation impl) throws android.os.RemoteException;
  void navigationStarted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException;
  void navigationRedirected(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException;
  void readyToCommitNavigation(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException;
  void navigationCompleted(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException;
  void navigationFailed(org.chromium.weblayer_private.interfaces.IClientNavigation navigation) throws android.os.RemoteException;
  void loadStateChanged(boolean isLoading, boolean toDifferentDocument) throws android.os.RemoteException;
  void loadProgressChanged(double progress) throws android.os.RemoteException;
  void onFirstContentfulPaint() throws android.os.RemoteException;
  void onOldPageNoLongerRendered(java.lang.String uri) throws android.os.RemoteException;
  // Added in M88.

  void onFirstContentfulPaint2(long navigationStartMs, long firstContentfulPaintDurationMs) throws android.os.RemoteException;
  void onLargestContentfulPaint(long navigationStartMs, long largestContentfulPaintDurationMs) throws android.os.RemoteException;
}
