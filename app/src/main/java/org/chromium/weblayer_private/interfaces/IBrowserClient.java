/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IBrowserClient extends android.os.IInterface
{
  /** Default implementation for IBrowserClient. */
  class Default implements org.chromium.weblayer_private.interfaces.IBrowserClient
  {
    @Override public void onActiveTabChanged(int activeTabId) throws android.os.RemoteException
    {
    }
    @Override public void onTabAdded(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
    {
    }
    @Override public void onTabRemoved(int tabId) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IRemoteFragment createMediaRouteDialogFragment() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void onRestoreCompleted() throws android.os.RemoteException
    {
    }
    // Added in 88.

    @Override public void onBrowserControlsOffsetsChanged(boolean isTop, int controlsOffset) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IBrowserClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IBrowserClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IBrowserClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IBrowserClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IBrowserClient))) {
        return ((org.chromium.weblayer_private.interfaces.IBrowserClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IBrowserClient.Stub.Proxy(obj);
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
        case TRANSACTION_onActiveTabChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onActiveTabChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onTabAdded:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ITab _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ITab.Stub.asInterface(data.readStrongBinder());
          this.onTabAdded(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onTabRemoved:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onTabRemoved(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createMediaRouteDialogFragment:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragment _result = this.createMediaRouteDialogFragment();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_onRestoreCompleted:
        {
          data.enforceInterface(descriptor);
          this.onRestoreCompleted();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onBrowserControlsOffsetsChanged:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          int _arg1;
          _arg1 = data.readInt();
          this.onBrowserControlsOffsetsChanged(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IBrowserClient
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
      @Override public void onActiveTabChanged(int activeTabId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(activeTabId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActiveTabChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActiveTabChanged(activeTabId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onTabAdded(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((tab!=null))?(tab.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTabAdded, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTabAdded(tab);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onTabRemoved(int tabId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(tabId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTabRemoved, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTabRemoved(tabId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IRemoteFragment createMediaRouteDialogFragment() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IRemoteFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createMediaRouteDialogFragment, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createMediaRouteDialogFragment();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IRemoteFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void onRestoreCompleted() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRestoreCompleted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRestoreCompleted();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Added in 88.

      @Override public void onBrowserControlsOffsetsChanged(boolean isTop, int controlsOffset) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isTop)?(1):(0)));
          _data.writeInt(controlsOffset);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBrowserControlsOffsetsChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onBrowserControlsOffsetsChanged(isTop, controlsOffset);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IBrowserClient sDefaultImpl;
    }
    static final int TRANSACTION_onActiveTabChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onTabAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onTabRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_createMediaRouteDialogFragment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onRestoreCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onBrowserControlsOffsetsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IBrowserClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.IBrowserClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void onActiveTabChanged(int activeTabId) throws android.os.RemoteException;
  void onTabAdded(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException;
  void onTabRemoved(int tabId) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IRemoteFragment createMediaRouteDialogFragment() throws android.os.RemoteException;
  void onRestoreCompleted() throws android.os.RemoteException;
  // Added in 88.

  void onBrowserControlsOffsetsChanged(boolean isTop, int controlsOffset) throws android.os.RemoteException;
}
