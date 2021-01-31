/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface ITab extends android.os.IInterface
{
  /** Default implementation for ITab. */
  class Default implements org.chromium.weblayer_private.interfaces.ITab
  {
    @Override public void setClient(org.chromium.weblayer_private.interfaces.ITabClient client) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.INavigationController createNavigationController(org.chromium.weblayer_private.interfaces.INavigationControllerClient client) throws android.os.RemoteException
    {
      return null;
    }
    // ID 2 was setDownloadCallbackClient and was removed in M89.

    @Override public void setErrorPageCallbackClient(org.chromium.weblayer_private.interfaces.IErrorPageCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public void setFullscreenCallbackClient(org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public void executeScript(java.lang.String script, boolean useSeparateIsolate, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
    {
    }
    @Override public void setNewTabsEnabled(boolean enabled) throws android.os.RemoteException
    {
    }
    // Returns a unique identifier for this Tab. The id is *not* unique across
    // restores. The id is intended for the client library to avoid creating duplicate client objects
    // for the same ITab.

    @Override public int getId() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public boolean setFindInPageCallbackClient(org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient client) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void findInPage(java.lang.String searchText, boolean forward) throws android.os.RemoteException
    {
    }
    // And and removed in 82; superseded by dismissTransientUi().
    // void dismissTabModalOverlay() = 10;

    @Override public void dispatchBeforeUnloadAndClose() throws android.os.RemoteException
    {
    }
    @Override public boolean dismissTransientUi() throws android.os.RemoteException
    {
      return false;
    }
    @Override public java.lang.String getGuid() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setMediaCaptureCallbackClient(org.chromium.weblayer_private.interfaces.IMediaCaptureCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public void stopMediaCapturing() throws android.os.RemoteException
    {
    }
    @Override public void captureScreenShot(float scale, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
    {
    }
    @Override public boolean setData(java.util.Map data) throws android.os.RemoteException
    {
      return false;
    }
    @Override public java.util.Map getData() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void registerWebMessageCallback(java.lang.String jsObjectName, java.util.List<java.lang.String> allowedOrigins, org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public void unregisterWebMessageCallback(java.lang.String jsObjectName) throws android.os.RemoteException
    {
    }
    @Override public boolean canTranslate() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void showTranslateUi() throws android.os.RemoteException
    {
    }
    @Override public void setGoogleAccountsCallbackClient(org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IFaviconFetcher createFaviconFetcher(org.chromium.weblayer_private.interfaces.IFaviconFetcherClient client) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setTranslateTargetLanguage(java.lang.String targetLanguage) throws android.os.RemoteException
    {
    }
    @Override public void setScrollOffsetsEnabled(boolean enabled) throws android.os.RemoteException
    {
    }
    // Added in 88

    @Override public void setFloatingActionModeOverride(int actionModeItemTypes) throws android.os.RemoteException
    {
    }
    @Override public boolean willAutomaticallyReloadAfterCrash() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void setDesktopUserAgentEnabled(boolean enable) throws android.os.RemoteException
    {
    }
    @Override public boolean isDesktopUserAgentEnabled() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void download(org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.ITab
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.ITab";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.ITab interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.ITab asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.ITab))) {
        return ((org.chromium.weblayer_private.interfaces.ITab)iin);
      }
      return new org.chromium.weblayer_private.interfaces.ITab.Stub.Proxy(obj);
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
          org.chromium.weblayer_private.interfaces.ITabClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ITabClient.Stub.asInterface(data.readStrongBinder());
          this.setClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createNavigationController:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.INavigationControllerClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.INavigationControllerClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.INavigationController _result = this.createNavigationController(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setErrorPageCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IErrorPageCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IErrorPageCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setErrorPageCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFullscreenCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setFullscreenCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_executeScript:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.executeScript(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setNewTabsEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setNewTabsEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getId:
        {
          data.enforceInterface(descriptor);
          int _result = this.getId();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setFindInPageCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.setFindInPageCallbackClient(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_findInPage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.findInPage(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_dispatchBeforeUnloadAndClose:
        {
          data.enforceInterface(descriptor);
          this.dispatchBeforeUnloadAndClose();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_dismissTransientUi:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.dismissTransientUi();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getGuid:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getGuid();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setMediaCaptureCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IMediaCaptureCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IMediaCaptureCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setMediaCaptureCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stopMediaCapturing:
        {
          data.enforceInterface(descriptor);
          this.stopMediaCapturing();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_captureScreenShot:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.captureScreenShot(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setData:
        {
          data.enforceInterface(descriptor);
          java.util.Map _arg0;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg0 = data.readHashMap(cl);
          boolean _result = this.setData(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getData:
        {
          data.enforceInterface(descriptor);
          java.util.Map _result = this.getData();
          reply.writeNoException();
          reply.writeMap(_result);
          return true;
        }
        case TRANSACTION_registerWebMessageCallback:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.util.List<java.lang.String> _arg1;
          _arg1 = data.createStringArrayList();
          org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.registerWebMessageCallback(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterWebMessageCallback:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.unregisterWebMessageCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_canTranslate:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.canTranslate();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_showTranslateUi:
        {
          data.enforceInterface(descriptor);
          this.showTranslateUi();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setGoogleAccountsCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setGoogleAccountsCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createFaviconFetcher:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IFaviconFetcherClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IFaviconFetcherClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IFaviconFetcher _result = this.createFaviconFetcher(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setTranslateTargetLanguage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.setTranslateTargetLanguage(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setScrollOffsetsEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setScrollOffsetsEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFloatingActionModeOverride:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.setFloatingActionModeOverride(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_willAutomaticallyReloadAfterCrash:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.willAutomaticallyReloadAfterCrash();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_setDesktopUserAgentEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setDesktopUserAgentEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isDesktopUserAgentEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isDesktopUserAgentEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_download:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IContextMenuParams _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IContextMenuParams.Stub.asInterface(data.readStrongBinder());
          this.download(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.ITab
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
      @Override public void setClient(org.chromium.weblayer_private.interfaces.ITabClient client) throws android.os.RemoteException
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
      @Override public org.chromium.weblayer_private.interfaces.INavigationController createNavigationController(org.chromium.weblayer_private.interfaces.INavigationControllerClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.INavigationController _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createNavigationController, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createNavigationController(client);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.INavigationController.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // ID 2 was setDownloadCallbackClient and was removed in M89.

      @Override public void setErrorPageCallbackClient(org.chromium.weblayer_private.interfaces.IErrorPageCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setErrorPageCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setErrorPageCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setFullscreenCallbackClient(org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFullscreenCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFullscreenCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void executeScript(java.lang.String script, boolean useSeparateIsolate, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(script);
          _data.writeInt(((useSeparateIsolate)?(1):(0)));
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_executeScript, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().executeScript(script, useSeparateIsolate, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setNewTabsEnabled(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNewTabsEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setNewTabsEnabled(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns a unique identifier for this Tab. The id is *not* unique across
      // restores. The id is intended for the client library to avoid creating duplicate client objects
      // for the same ITab.

      @Override public int getId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getId();
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
      @Override public boolean setFindInPageCallbackClient(org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFindInPageCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setFindInPageCallbackClient(client);
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
      @Override public void findInPage(java.lang.String searchText, boolean forward) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(searchText);
          _data.writeInt(((forward)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_findInPage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findInPage(searchText, forward);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // And and removed in 82; superseded by dismissTransientUi().
      // void dismissTabModalOverlay() = 10;

      @Override public void dispatchBeforeUnloadAndClose() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dispatchBeforeUnloadAndClose, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().dispatchBeforeUnloadAndClose();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean dismissTransientUi() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dismissTransientUi, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dismissTransientUi();
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
      @Override public java.lang.String getGuid() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getGuid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getGuid();
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
      @Override public void setMediaCaptureCallbackClient(org.chromium.weblayer_private.interfaces.IMediaCaptureCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMediaCaptureCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setMediaCaptureCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stopMediaCapturing() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopMediaCapturing, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stopMediaCapturing();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void captureScreenShot(float scale, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(scale);
          _data.writeStrongBinder((((resultCallback!=null))?(resultCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_captureScreenShot, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().captureScreenShot(scale, resultCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean setData(java.util.Map data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeMap(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setData(data);
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
      @Override public java.util.Map getData() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getData();
          }
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void registerWebMessageCallback(java.lang.String jsObjectName, java.util.List<java.lang.String> allowedOrigins, org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(jsObjectName);
          _data.writeStringList(allowedOrigins);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerWebMessageCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerWebMessageCallback(jsObjectName, allowedOrigins, client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterWebMessageCallback(java.lang.String jsObjectName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(jsObjectName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterWebMessageCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterWebMessageCallback(jsObjectName);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean canTranslate() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_canTranslate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().canTranslate();
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
      @Override public void showTranslateUi() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_showTranslateUi, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().showTranslateUi();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setGoogleAccountsCallbackClient(org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGoogleAccountsCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setGoogleAccountsCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IFaviconFetcher createFaviconFetcher(org.chromium.weblayer_private.interfaces.IFaviconFetcherClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IFaviconFetcher _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createFaviconFetcher, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createFaviconFetcher(client);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IFaviconFetcher.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setTranslateTargetLanguage(java.lang.String targetLanguage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(targetLanguage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTranslateTargetLanguage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTranslateTargetLanguage(targetLanguage);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setScrollOffsetsEnabled(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setScrollOffsetsEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setScrollOffsetsEnabled(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Added in 88

      @Override public void setFloatingActionModeOverride(int actionModeItemTypes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(actionModeItemTypes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFloatingActionModeOverride, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFloatingActionModeOverride(actionModeItemTypes);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean willAutomaticallyReloadAfterCrash() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_willAutomaticallyReloadAfterCrash, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().willAutomaticallyReloadAfterCrash();
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
      @Override public void setDesktopUserAgentEnabled(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDesktopUserAgentEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDesktopUserAgentEnabled(enable);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean isDesktopUserAgentEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isDesktopUserAgentEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isDesktopUserAgentEnabled();
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
      @Override public void download(org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((contextMenuParams!=null))?(contextMenuParams.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_download, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().download(contextMenuParams);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.ITab sDefaultImpl;
    }
    static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_createNavigationController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setErrorPageCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setFullscreenCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_executeScript = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setNewTabsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setFindInPageCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_findInPage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_dispatchBeforeUnloadAndClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_dismissTransientUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getGuid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setMediaCaptureCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_stopMediaCapturing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_captureScreenShot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_registerWebMessageCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_unregisterWebMessageCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_canTranslate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_showTranslateUi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_setGoogleAccountsCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_createFaviconFetcher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setTranslateTargetLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setScrollOffsetsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_setFloatingActionModeOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_willAutomaticallyReloadAfterCrash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setDesktopUserAgentEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_isDesktopUserAgentEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_download = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.ITab impl) {
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
    public static org.chromium.weblayer_private.interfaces.ITab getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void setClient(org.chromium.weblayer_private.interfaces.ITabClient client) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.INavigationController createNavigationController(org.chromium.weblayer_private.interfaces.INavigationControllerClient client) throws android.os.RemoteException;
  // ID 2 was setDownloadCallbackClient and was removed in M89.

  void setErrorPageCallbackClient(org.chromium.weblayer_private.interfaces.IErrorPageCallbackClient client) throws android.os.RemoteException;
  void setFullscreenCallbackClient(org.chromium.weblayer_private.interfaces.IFullscreenCallbackClient client) throws android.os.RemoteException;
  void executeScript(java.lang.String script, boolean useSeparateIsolate, org.chromium.weblayer_private.interfaces.IObjectWrapper callback) throws android.os.RemoteException;
  void setNewTabsEnabled(boolean enabled) throws android.os.RemoteException;
  // Returns a unique identifier for this Tab. The id is *not* unique across
  // restores. The id is intended for the client library to avoid creating duplicate client objects
  // for the same ITab.

  int getId() throws android.os.RemoteException;
  boolean setFindInPageCallbackClient(org.chromium.weblayer_private.interfaces.IFindInPageCallbackClient client) throws android.os.RemoteException;
  void findInPage(java.lang.String searchText, boolean forward) throws android.os.RemoteException;
  // And and removed in 82; superseded by dismissTransientUi().
  // void dismissTabModalOverlay() = 10;

  void dispatchBeforeUnloadAndClose() throws android.os.RemoteException;
  boolean dismissTransientUi() throws android.os.RemoteException;
  java.lang.String getGuid() throws android.os.RemoteException;
  void setMediaCaptureCallbackClient(org.chromium.weblayer_private.interfaces.IMediaCaptureCallbackClient client) throws android.os.RemoteException;
  void stopMediaCapturing() throws android.os.RemoteException;
  void captureScreenShot(float scale, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException;
  boolean setData(java.util.Map data) throws android.os.RemoteException;
  java.util.Map getData() throws android.os.RemoteException;
  void registerWebMessageCallback(java.lang.String jsObjectName, java.util.List<java.lang.String> allowedOrigins, org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient client) throws android.os.RemoteException;
  void unregisterWebMessageCallback(java.lang.String jsObjectName) throws android.os.RemoteException;
  boolean canTranslate() throws android.os.RemoteException;
  void showTranslateUi() throws android.os.RemoteException;
  void setGoogleAccountsCallbackClient(org.chromium.weblayer_private.interfaces.IGoogleAccountsCallbackClient client) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IFaviconFetcher createFaviconFetcher(org.chromium.weblayer_private.interfaces.IFaviconFetcherClient client) throws android.os.RemoteException;
  void setTranslateTargetLanguage(java.lang.String targetLanguage) throws android.os.RemoteException;
  void setScrollOffsetsEnabled(boolean enabled) throws android.os.RemoteException;
  // Added in 88

  void setFloatingActionModeOverride(int actionModeItemTypes) throws android.os.RemoteException;
  boolean willAutomaticallyReloadAfterCrash() throws android.os.RemoteException;
  void setDesktopUserAgentEnabled(boolean enable) throws android.os.RemoteException;
  boolean isDesktopUserAgentEnabled() throws android.os.RemoteException;
  void download(org.chromium.weblayer_private.interfaces.IContextMenuParams contextMenuParams) throws android.os.RemoteException;
}
