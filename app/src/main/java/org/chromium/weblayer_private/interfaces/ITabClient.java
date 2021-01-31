/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Interface used by Tab to inform the client of changes. This largely duplicates the
 * TabCallback interface, but is a singleton to avoid unnecessary IPC.
 */
public interface ITabClient extends android.os.IInterface
{
  /** Default implementation for ITabClient. */
  class Default implements org.chromium.weblayer_private.interfaces.ITabClient
  {
    @Override public void visibleUriChanged(java.lang.String uriString) throws android.os.RemoteException
    {
    }
    @Override public void onNewTab(int tabId, int mode) throws android.os.RemoteException
    {
    }
    @Override public void onRenderProcessGone() throws android.os.RemoteException
    {
    }
    // ID 3 was onCloseTab and was removed in M87.
    // Deprecated in M88.

    @Override public void showContextMenu(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl) throws android.os.RemoteException
    {
    }
    @Override public void onTabModalStateChanged(boolean isTabModalShowing) throws android.os.RemoteException
    {
    }
    @Override public void onTitleUpdated(org.chromium.weblayer_private.interfaces.IObjectWrapper title) throws android.os.RemoteException
    {
    }
    @Override public void bringTabToFront() throws android.os.RemoteException
    {
    }
    @Override public void onTabDestroyed() throws android.os.RemoteException
    {
    }
    @Override public void onBackgroundColorChanged(int color) throws android.os.RemoteException
    {
    }
    @Override public void onScrollNotification(int notificationType, float currentScrollRatio) throws android.os.RemoteException
    {
    }
    @Override public void onVerticalScrollOffsetChanged(int offset) throws android.os.RemoteException
    {
    }
    // Added in M88

    @Override public void onActionItemClicked(int actionModeItemType, org.chromium.weblayer_private.interfaces.IObjectWrapper selectedString) throws android.os.RemoteException
    {
    }
    @Override public void showContextMenu2(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl, boolean isImage, boolean isVideo, boolean canDownload, org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.ITabClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.ITabClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.ITabClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.ITabClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.ITabClient))) {
        return ((org.chromium.weblayer_private.interfaces.ITabClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.ITabClient.Stub.Proxy(obj);
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
        case TRANSACTION_visibleUriChanged:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.visibleUriChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onNewTab:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.onNewTab(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onRenderProcessGone:
        {
          data.enforceInterface(descriptor);
          this.onRenderProcessGone();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_showContextMenu:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg3;
          _arg3 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg4;
          _arg4 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.showContextMenu(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onTabModalStateChanged:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.onTabModalStateChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onTitleUpdated:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.onTitleUpdated(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_bringTabToFront:
        {
          data.enforceInterface(descriptor);
          this.bringTabToFront();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onTabDestroyed:
        {
          data.enforceInterface(descriptor);
          this.onTabDestroyed();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onBackgroundColorChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onBackgroundColorChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onScrollNotification:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          float _arg1;
          _arg1 = data.readFloat();
          this.onScrollNotification(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onVerticalScrollOffsetChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onVerticalScrollOffsetChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onActionItemClicked:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.onActionItemClicked(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_showContextMenu2:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg3;
          _arg3 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg4;
          _arg4 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          boolean _arg5;
          _arg5 = (0!=data.readInt());
          boolean _arg6;
          _arg6 = (0!=data.readInt());
          boolean _arg7;
          _arg7 = (0!=data.readInt());
          org.chromium.weblayer_private.interfaces.IContextMenuParams _arg8;
          _arg8 = org.chromium.weblayer_private.interfaces.IContextMenuParams.Stub.asInterface(data.readStrongBinder());
          this.showContextMenu2(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.ITabClient
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
      @Override public void visibleUriChanged(java.lang.String uriString) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uriString);
          boolean _status = mRemote.transact(Stub.TRANSACTION_visibleUriChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().visibleUriChanged(uriString);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onNewTab(int tabId, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(tabId);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onNewTab, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onNewTab(tabId, mode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onRenderProcessGone() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRenderProcessGone, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRenderProcessGone();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // ID 3 was onCloseTab and was removed in M87.
      // Deprecated in M88.

      @Override public void showContextMenu(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((pageUrl!=null))?(pageUrl.asBinder()):(null)));
          _data.writeStrongBinder((((linkUrl!=null))?(linkUrl.asBinder()):(null)));
          _data.writeStrongBinder((((linkText!=null))?(linkText.asBinder()):(null)));
          _data.writeStrongBinder((((titleOrAltText!=null))?(titleOrAltText.asBinder()):(null)));
          _data.writeStrongBinder((((srcUrl!=null))?(srcUrl.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_showContextMenu, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().showContextMenu(pageUrl, linkUrl, linkText, titleOrAltText, srcUrl);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onTabModalStateChanged(boolean isTabModalShowing) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isTabModalShowing)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTabModalStateChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTabModalStateChanged(isTabModalShowing);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onTitleUpdated(org.chromium.weblayer_private.interfaces.IObjectWrapper title) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((title!=null))?(title.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTitleUpdated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTitleUpdated(title);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void bringTabToFront() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bringTabToFront, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().bringTabToFront();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onTabDestroyed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTabDestroyed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTabDestroyed();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onBackgroundColorChanged(int color) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(color);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBackgroundColorChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onBackgroundColorChanged(color);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onScrollNotification(int notificationType, float currentScrollRatio) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(notificationType);
          _data.writeFloat(currentScrollRatio);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onScrollNotification, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onScrollNotification(notificationType, currentScrollRatio);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onVerticalScrollOffsetChanged(int offset) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(offset);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onVerticalScrollOffsetChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onVerticalScrollOffsetChanged(offset);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Added in M88

      @Override public void onActionItemClicked(int actionModeItemType, org.chromium.weblayer_private.interfaces.IObjectWrapper selectedString) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(actionModeItemType);
          _data.writeStrongBinder((((selectedString!=null))?(selectedString.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onActionItemClicked, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onActionItemClicked(actionModeItemType, selectedString);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void showContextMenu2(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl, boolean isImage, boolean isVideo, boolean canDownload, org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((pageUrl!=null))?(pageUrl.asBinder()):(null)));
          _data.writeStrongBinder((((linkUrl!=null))?(linkUrl.asBinder()):(null)));
          _data.writeStrongBinder((((linkText!=null))?(linkText.asBinder()):(null)));
          _data.writeStrongBinder((((titleOrAltText!=null))?(titleOrAltText.asBinder()):(null)));
          _data.writeStrongBinder((((srcUrl!=null))?(srcUrl.asBinder()):(null)));
          _data.writeInt(((isImage)?(1):(0)));
          _data.writeInt(((isVideo)?(1):(0)));
          _data.writeInt(((canDownload)?(1):(0)));
          _data.writeStrongBinder((((contextMenuParams!=null))?(contextMenuParams.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_showContextMenu2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().showContextMenu2(pageUrl, linkUrl, linkText, titleOrAltText, srcUrl, isImage, isVideo, canDownload, contextMenuParams);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.ITabClient sDefaultImpl;
    }
    static final int TRANSACTION_visibleUriChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onNewTab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onRenderProcessGone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_showContextMenu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onTabModalStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onTitleUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_bringTabToFront = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onTabDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onBackgroundColorChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onScrollNotification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onVerticalScrollOffsetChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onActionItemClicked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_showContextMenu2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.ITabClient impl) {
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
    public static org.chromium.weblayer_private.interfaces.ITabClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void visibleUriChanged(java.lang.String uriString) throws android.os.RemoteException;
  void onNewTab(int tabId, int mode) throws android.os.RemoteException;
  void onRenderProcessGone() throws android.os.RemoteException;
  // ID 3 was onCloseTab and was removed in M87.
  // Deprecated in M88.

  void showContextMenu(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl) throws android.os.RemoteException;
  void onTabModalStateChanged(boolean isTabModalShowing) throws android.os.RemoteException;
  void onTitleUpdated(org.chromium.weblayer_private.interfaces.IObjectWrapper title) throws android.os.RemoteException;
  void bringTabToFront() throws android.os.RemoteException;
  void onTabDestroyed() throws android.os.RemoteException;
  void onBackgroundColorChanged(int color) throws android.os.RemoteException;
  void onScrollNotification(int notificationType, float currentScrollRatio) throws android.os.RemoteException;
  void onVerticalScrollOffsetChanged(int offset) throws android.os.RemoteException;
  // Added in M88

  void onActionItemClicked(int actionModeItemType, org.chromium.weblayer_private.interfaces.IObjectWrapper selectedString) throws android.os.RemoteException;
  void showContextMenu2(org.chromium.weblayer_private.interfaces.IObjectWrapper pageUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkUrl, org.chromium.weblayer_private.interfaces.IObjectWrapper linkText, org.chromium.weblayer_private.interfaces.IObjectWrapper titleOrAltText, org.chromium.weblayer_private.interfaces.IObjectWrapper srcUrl, boolean isImage, boolean isVideo, boolean canDownload, org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException;
}
