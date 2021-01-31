/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IWebLayer extends android.os.IInterface
{
  /** Default implementation for IWebLayer. */
  class Default implements org.chromium.weblayer_private.interfaces.IWebLayer
  {
    // ID 1 was loadAsyncV80 and was removed in M86.
    // ID 2 was loadSyncV80 and was removed in M86.
    // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
    //
    // @param fragmentClient Representative of the Fragment on the client side through which
    // WebLayer can call methods on Fragment.
    // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
    // (see Fragment#setArguments).

    @Override public org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
    {
      return null;
    }
    // Create or get the profile matching profileName.

    @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException
    {
      return null;
    }
    // Enable or disable DevTools remote debugging server.

    @Override public void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException
    {
    }
    // Returns whether or not the DevTools remote debugging server is enabled.

    @Override public boolean isRemoteDebuggingEnabled() throws android.os.RemoteException
    {
      return false;
    }
    // ID 7 was getCrashReporterControllerV80 and was removed in M86.
    // Initializes WebLayer and starts loading.
    //
    // It is expected that either loadAsync or loadSync is called before anything else.
    //
    // @param appContext     A Context that refers to the Application using WebLayer.
    // @param remoteContext  A Context that refers to the WebLayer provider package.
    // @param loadedCallback A ValueCallback that will be called when load completes.

    @Override public void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException
    {
    }
    // Initializes WebLayer, starts loading and blocks until loading has completed.
    //
    // It is expected that either loadAsync or loadSync is called before anything else.
    //
    // @param appContext    A Context that refers to the Application using WebLayer.
    // @param remoteContext A Context that refers to the WebLayer provider package.

    @Override public void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
    {
    }
    // Returns the singleton crash reporter controller. If WebLayer has not been
    // initialized, does the minimum initialization needed for the crash reporter.

    @Override public org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
    {
      return null;
    }
    // Forwards broadcast from a notification to the implementation.

    @Override public void onReceivedBroadcast(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, android.content.Intent intent) throws android.os.RemoteException
    {
    }
    @Override public void enumerateAllProfileNames(org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
    {
    }
    @Override public void setClient(org.chromium.weblayer_private.interfaces.IWebLayerClient client) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getUserAgentString() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void registerExternalExperimentIDs(java.lang.String trialName, int[] experimentIds) throws android.os.RemoteException
    {
    }
    // Creates the WebLayer counterpart to a SiteSettingsFragment - a SiteSettingsFragmentImpl
    //
    // @param fragmentClient Representative of the Fragment on the client side through which
    // WebLayer can call methods on Fragment.
    // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
    // (see Fragment#setArguments).

    @Override public org.chromium.weblayer_private.interfaces.ISiteSettingsFragment createSiteSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void onMediaSessionServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException
    {
    }
    @Override public void onMediaSessionServiceDestroyed() throws android.os.RemoteException
    {
    }
    @Override public android.os.IBinder initializeImageDecoder(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getApplicationContext() throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment createMediaRouteDialogFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.chromium.weblayer_private.interfaces.IProfile getIncognitoProfile(java.lang.String profileName) throws android.os.RemoteException
    {
      return null;
    }
    // Added in Version 88.

    @Override public void onRemoteMediaServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException
    {
    }
    @Override public void onRemoteMediaServiceDestroyed(int id) throws android.os.RemoteException
    {
    }
    // Creates the WebLayer counterpart to a SettingsFragment - a SettingsFragmentImpl
    //
    // @param fragmentClient Representative of the Fragment on the client side through which
    // WebLayer can call methods on Fragment.
    // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
    // (see Fragment#setArguments).
    // Added in Version 89.

    @Override public org.chromium.weblayer_private.interfaces.ISettingsFragment createSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IWebLayer
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IWebLayer";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IWebLayer interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IWebLayer asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IWebLayer))) {
        return ((org.chromium.weblayer_private.interfaces.IWebLayer)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IWebLayer.Stub.Proxy(obj);
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
        case TRANSACTION_createBrowserFragmentImpl:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragmentClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IBrowserFragment _result = this.createBrowserFragmentImpl(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getProfile:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.IProfile _result = this.getProfile(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setRemoteDebuggingEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setRemoteDebuggingEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isRemoteDebuggingEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isRemoteDebuggingEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_loadAsync:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg2;
          _arg2 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.loadAsync(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_loadSync:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.loadSync(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCrashReporterController:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.ICrashReporterController _result = this.getCrashReporterController(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_onReceivedBroadcast:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          android.content.Intent _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onReceivedBroadcast(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enumerateAllProfileNames:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.enumerateAllProfileNames(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IWebLayerClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IWebLayerClient.Stub.asInterface(data.readStrongBinder());
          this.setClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getUserAgentString:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getUserAgentString();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_registerExternalExperimentIDs:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int[] _arg1;
          _arg1 = data.createIntArray();
          this.registerExternalExperimentIDs(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createSiteSettingsFragmentImpl:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragmentClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.ISiteSettingsFragment _result = this.createSiteSettingsFragmentImpl(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_onMediaSessionServiceStarted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          android.content.Intent _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onMediaSessionServiceStarted(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onMediaSessionServiceDestroyed:
        {
          data.enforceInterface(descriptor);
          this.onMediaSessionServiceDestroyed();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_initializeImageDecoder:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          android.os.IBinder _result = this.initializeImageDecoder(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        case TRANSACTION_getApplicationContext:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _result = this.getApplicationContext();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_createMediaRouteDialogFragmentImpl:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragmentClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment _result = this.createMediaRouteDialogFragmentImpl(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getIncognitoProfile:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.IProfile _result = this.getIncognitoProfile(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_onRemoteMediaServiceStarted:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          android.content.Intent _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.content.Intent.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onRemoteMediaServiceStarted(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onRemoteMediaServiceDestroyed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onRemoteMediaServiceDestroyed(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createSettingsFragmentImpl:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragmentClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.ISettingsFragment _result = this.createSettingsFragmentImpl(_arg0, _arg1);
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
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IWebLayer
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
      // ID 1 was loadAsyncV80 and was removed in M86.
      // ID 2 was loadSyncV80 and was removed in M86.
      // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
      //
      // @param fragmentClient Representative of the Fragment on the client side through which
      // WebLayer can call methods on Fragment.
      // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
      // (see Fragment#setArguments).

      @Override public org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IBrowserFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((fragmentClient!=null))?(fragmentClient.asBinder()):(null)));
          _data.writeStrongBinder((((fragmentArgs!=null))?(fragmentArgs.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createBrowserFragmentImpl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createBrowserFragmentImpl(fragmentClient, fragmentArgs);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IBrowserFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Create or get the profile matching profileName.

      @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IProfile _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProfile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getProfile(profileName);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IProfile.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Enable or disable DevTools remote debugging server.

      @Override public void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRemoteDebuggingEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRemoteDebuggingEnabled(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns whether or not the DevTools remote debugging server is enabled.

      @Override public boolean isRemoteDebuggingEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isRemoteDebuggingEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isRemoteDebuggingEnabled();
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
      // ID 7 was getCrashReporterControllerV80 and was removed in M86.
      // Initializes WebLayer and starts loading.
      //
      // It is expected that either loadAsync or loadSync is called before anything else.
      //
      // @param appContext     A Context that refers to the Application using WebLayer.
      // @param remoteContext  A Context that refers to the WebLayer provider package.
      // @param loadedCallback A ValueCallback that will be called when load completes.

      @Override public void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          _data.writeStrongBinder((((remoteContext!=null))?(remoteContext.asBinder()):(null)));
          _data.writeStrongBinder((((loadedCallback!=null))?(loadedCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadAsync, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadAsync(appContext, remoteContext, loadedCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Initializes WebLayer, starts loading and blocks until loading has completed.
      //
      // It is expected that either loadAsync or loadSync is called before anything else.
      //
      // @param appContext    A Context that refers to the Application using WebLayer.
      // @param remoteContext A Context that refers to the WebLayer provider package.

      @Override public void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          _data.writeStrongBinder((((remoteContext!=null))?(remoteContext.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadSync, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadSync(appContext, remoteContext);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns the singleton crash reporter controller. If WebLayer has not been
      // initialized, does the minimum initialization needed for the crash reporter.

      @Override public org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ICrashReporterController _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          _data.writeStrongBinder((((remoteContext!=null))?(remoteContext.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCrashReporterController, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCrashReporterController(appContext, remoteContext);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ICrashReporterController.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Forwards broadcast from a notification to the implementation.

      @Override public void onReceivedBroadcast(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, android.content.Intent intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onReceivedBroadcast, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onReceivedBroadcast(appContext, intent);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void enumerateAllProfileNames(org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((valueCallback!=null))?(valueCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_enumerateAllProfileNames, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enumerateAllProfileNames(valueCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setClient(org.chromium.weblayer_private.interfaces.IWebLayerClient client) throws android.os.RemoteException
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
      @Override public java.lang.String getUserAgentString() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUserAgentString, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUserAgentString();
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
      @Override public void registerExternalExperimentIDs(java.lang.String trialName, int[] experimentIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(trialName);
          _data.writeIntArray(experimentIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerExternalExperimentIDs, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerExternalExperimentIDs(trialName, experimentIds);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Creates the WebLayer counterpart to a SiteSettingsFragment - a SiteSettingsFragmentImpl
      //
      // @param fragmentClient Representative of the Fragment on the client side through which
      // WebLayer can call methods on Fragment.
      // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
      // (see Fragment#setArguments).

      @Override public org.chromium.weblayer_private.interfaces.ISiteSettingsFragment createSiteSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ISiteSettingsFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((remoteFragmentClient!=null))?(remoteFragmentClient.asBinder()):(null)));
          _data.writeStrongBinder((((fragmentArgs!=null))?(fragmentArgs.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createSiteSettingsFragmentImpl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createSiteSettingsFragmentImpl(remoteFragmentClient, fragmentArgs);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ISiteSettingsFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void onMediaSessionServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((sessionService!=null))?(sessionService.asBinder()):(null)));
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onMediaSessionServiceStarted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onMediaSessionServiceStarted(sessionService, intent);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onMediaSessionServiceDestroyed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onMediaSessionServiceDestroyed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onMediaSessionServiceDestroyed();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.os.IBinder initializeImageDecoder(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          _data.writeStrongBinder((((remoteContext!=null))?(remoteContext.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initializeImageDecoder, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initializeImageDecoder(appContext, remoteContext);
          }
          _reply.readException();
          _result = _reply.readStrongBinder();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.chromium.weblayer_private.interfaces.IObjectWrapper getApplicationContext() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IObjectWrapper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getApplicationContext, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getApplicationContext();
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
      @Override public org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment createMediaRouteDialogFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((remoteFragmentClient!=null))?(remoteFragmentClient.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createMediaRouteDialogFragmentImpl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createMediaRouteDialogFragmentImpl(remoteFragmentClient);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.chromium.weblayer_private.interfaces.IProfile getIncognitoProfile(java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IProfile _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIncognitoProfile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getIncognitoProfile(profileName);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IProfile.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Added in Version 88.

      @Override public void onRemoteMediaServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((sessionService!=null))?(sessionService.asBinder()):(null)));
          if ((intent!=null)) {
            _data.writeInt(1);
            intent.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRemoteMediaServiceStarted, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRemoteMediaServiceStarted(sessionService, intent);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onRemoteMediaServiceDestroyed(int id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRemoteMediaServiceDestroyed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRemoteMediaServiceDestroyed(id);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Creates the WebLayer counterpart to a SettingsFragment - a SettingsFragmentImpl
      //
      // @param fragmentClient Representative of the Fragment on the client side through which
      // WebLayer can call methods on Fragment.
      // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
      // (see Fragment#setArguments).
      // Added in Version 89.

      @Override public org.chromium.weblayer_private.interfaces.ISettingsFragment createSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ISettingsFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((remoteFragmentClient!=null))?(remoteFragmentClient.asBinder()):(null)));
          _data.writeStrongBinder((((fragmentArgs!=null))?(fragmentArgs.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createSettingsFragmentImpl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createSettingsFragmentImpl(remoteFragmentClient, fragmentArgs);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ISettingsFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.weblayer_private.interfaces.IWebLayer sDefaultImpl;
    }
    static final int TRANSACTION_createBrowserFragmentImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setRemoteDebuggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_isRemoteDebuggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_loadAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_loadSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getCrashReporterController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onReceivedBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_enumerateAllProfileNames = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getUserAgentString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_registerExternalExperimentIDs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_createSiteSettingsFragmentImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_onMediaSessionServiceStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_onMediaSessionServiceDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_initializeImageDecoder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getApplicationContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_createMediaRouteDialogFragmentImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getIncognitoProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_onRemoteMediaServiceStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_onRemoteMediaServiceDestroyed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_createSettingsFragmentImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IWebLayer impl) {
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
    public static org.chromium.weblayer_private.interfaces.IWebLayer getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // ID 1 was loadAsyncV80 and was removed in M86.
  // ID 2 was loadSyncV80 and was removed in M86.
  // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
  //
  // @param fragmentClient Representative of the Fragment on the client side through which
  // WebLayer can call methods on Fragment.
  // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
  // (see Fragment#setArguments).

  org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException;
  // Create or get the profile matching profileName.

  org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException;
  // Enable or disable DevTools remote debugging server.

  void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException;
  // Returns whether or not the DevTools remote debugging server is enabled.

  boolean isRemoteDebuggingEnabled() throws android.os.RemoteException;
  // ID 7 was getCrashReporterControllerV80 and was removed in M86.
  // Initializes WebLayer and starts loading.
  //
  // It is expected that either loadAsync or loadSync is called before anything else.
  //
  // @param appContext     A Context that refers to the Application using WebLayer.
  // @param remoteContext  A Context that refers to the WebLayer provider package.
  // @param loadedCallback A ValueCallback that will be called when load completes.

  void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException;
  // Initializes WebLayer, starts loading and blocks until loading has completed.
  //
  // It is expected that either loadAsync or loadSync is called before anything else.
  //
  // @param appContext    A Context that refers to the Application using WebLayer.
  // @param remoteContext A Context that refers to the WebLayer provider package.

  void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException;
  // Returns the singleton crash reporter controller. If WebLayer has not been
  // initialized, does the minimum initialization needed for the crash reporter.

  org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException;
  // Forwards broadcast from a notification to the implementation.

  void onReceivedBroadcast(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, android.content.Intent intent) throws android.os.RemoteException;
  void enumerateAllProfileNames(org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException;
  void setClient(org.chromium.weblayer_private.interfaces.IWebLayerClient client) throws android.os.RemoteException;
  java.lang.String getUserAgentString() throws android.os.RemoteException;
  void registerExternalExperimentIDs(java.lang.String trialName, int[] experimentIds) throws android.os.RemoteException;
  // Creates the WebLayer counterpart to a SiteSettingsFragment - a SiteSettingsFragmentImpl
  //
  // @param fragmentClient Representative of the Fragment on the client side through which
  // WebLayer can call methods on Fragment.
  // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
  // (see Fragment#setArguments).

  org.chromium.weblayer_private.interfaces.ISiteSettingsFragment createSiteSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException;
  void onMediaSessionServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException;
  void onMediaSessionServiceDestroyed() throws android.os.RemoteException;
  android.os.IBinder initializeImageDecoder(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper remoteContext) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IObjectWrapper getApplicationContext() throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IMediaRouteDialogFragment createMediaRouteDialogFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IProfile getIncognitoProfile(java.lang.String profileName) throws android.os.RemoteException;
  // Added in Version 88.

  void onRemoteMediaServiceStarted(org.chromium.weblayer_private.interfaces.IObjectWrapper sessionService, android.content.Intent intent) throws android.os.RemoteException;
  void onRemoteMediaServiceDestroyed(int id) throws android.os.RemoteException;
  // Creates the WebLayer counterpart to a SettingsFragment - a SettingsFragmentImpl
  //
  // @param fragmentClient Representative of the Fragment on the client side through which
  // WebLayer can call methods on Fragment.
  // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
  // (see Fragment#setArguments).
  // Added in Version 89.

  org.chromium.weblayer_private.interfaces.ISettingsFragment createSettingsFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient remoteFragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException;
}
