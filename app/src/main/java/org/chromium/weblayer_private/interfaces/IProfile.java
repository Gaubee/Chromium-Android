/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IProfile extends android.os.IInterface
{
  /** Default implementation for IProfile. */
  class Default implements org.chromium.weblayer_private.interfaces.IProfile
  {
    @Override public void destroy() throws android.os.RemoteException
    {
    }
    @Override public void clearBrowsingData(int[] dataTypes, long fromMillis, long toMillis, org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getName() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setDownloadDirectory(java.lang.String directory) throws android.os.RemoteException
    {
    }
    @Override public void destroyAndDeleteDataFromDisk(org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException
    {
    }
    @Override public void setDownloadCallbackClient(org.chromium.weblayer_private.interfaces.IDownloadCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.ICookieManager getCookieManager() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setBooleanSetting(int type, boolean value) throws android.os.RemoteException
    {
    }
    @Override public boolean getBooleanSetting(int type) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void getBrowserPersistenceIds(org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
    {
    }
    @Override public void removeBrowserPersistenceStorage(java.lang.String[] ids, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
    {
    }
    @Override public void prepareForPossibleCrossOriginNavigation() throws android.os.RemoteException
    {
    }
    @Override public void getCachedFaviconForPageUri(java.lang.String uri, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
    {
    }
    @Override public void setUserIdentityCallbackClient(org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient client) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IPrerenderController getPrerenderController() throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean isIncognito() throws android.os.RemoteException
    {
      return false;
    }
    @Override public void setClient(org.chromium.weblayer_private.interfaces.IProfileClient client) throws android.os.RemoteException
    {
    }
    @Override public void destroyAndDeleteDataFromDiskSoon(org.chromium.weblayer_private.interfaces.IObjectWrapper completeCallback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IProfile
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IProfile";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IProfile interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IProfile asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IProfile))) {
        return ((org.chromium.weblayer_private.interfaces.IProfile)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IProfile.Stub.Proxy(obj);
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
        case TRANSACTION_destroy:
        {
          data.enforceInterface(descriptor);
          this.destroy();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_clearBrowsingData:
        {
          data.enforceInterface(descriptor);
          int[] _arg0;
          _arg0 = data.createIntArray();
          long _arg1;
          _arg1 = data.readLong();
          long _arg2;
          _arg2 = data.readLong();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg3;
          _arg3 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.clearBrowsingData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setDownloadDirectory:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.setDownloadDirectory(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_destroyAndDeleteDataFromDisk:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.destroyAndDeleteDataFromDisk(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setDownloadCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IDownloadCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IDownloadCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setDownloadCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCookieManager:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ICookieManager _result = this.getCookieManager();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setBooleanSetting:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.setBooleanSetting(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getBooleanSetting:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.getBooleanSetting(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getBrowserPersistenceIds:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.getBrowserPersistenceIds(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeBrowserPersistenceStorage:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.removeBrowserPersistenceStorage(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_prepareForPossibleCrossOriginNavigation:
        {
          data.enforceInterface(descriptor);
          this.prepareForPossibleCrossOriginNavigation();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCachedFaviconForPageUri:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.getCachedFaviconForPageUri(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setUserIdentityCallbackClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient.Stub.asInterface(data.readStrongBinder());
          this.setUserIdentityCallbackClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrerenderController:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IPrerenderController _result = this.getPrerenderController();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_isIncognito:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isIncognito();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_setClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IProfileClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IProfileClient.Stub.asInterface(data.readStrongBinder());
          this.setClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_destroyAndDeleteDataFromDiskSoon:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.destroyAndDeleteDataFromDiskSoon(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IProfile
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
      @Override public void destroy() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().destroy();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void clearBrowsingData(int[] dataTypes, long fromMillis, long toMillis, org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(dataTypes);
          _data.writeLong(fromMillis);
          _data.writeLong(toMillis);
          _data.writeStrongBinder((((completionCallback!=null))?(completionCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearBrowsingData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().clearBrowsingData(dataTypes, fromMillis, toMillis, completionCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getName();
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
      @Override public void setDownloadDirectory(java.lang.String directory) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(directory);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDownloadDirectory, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDownloadDirectory(directory);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyAndDeleteDataFromDisk(org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((completionCallback!=null))?(completionCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyAndDeleteDataFromDisk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().destroyAndDeleteDataFromDisk(completionCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDownloadCallbackClient(org.chromium.weblayer_private.interfaces.IDownloadCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDownloadCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setDownloadCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.ICookieManager getCookieManager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ICookieManager _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCookieManager, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCookieManager();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ICookieManager.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setBooleanSetting(int type, boolean value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(((value)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBooleanSetting, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBooleanSetting(type, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean getBooleanSetting(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBooleanSetting, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getBooleanSetting(type);
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
      @Override public void getBrowserPersistenceIds(org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((resultCallback!=null))?(resultCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBrowserPersistenceIds, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getBrowserPersistenceIds(resultCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeBrowserPersistenceStorage(java.lang.String[] ids, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(ids);
          _data.writeStrongBinder((((resultCallback!=null))?(resultCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeBrowserPersistenceStorage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeBrowserPersistenceStorage(ids, resultCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void prepareForPossibleCrossOriginNavigation() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareForPossibleCrossOriginNavigation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().prepareForPossibleCrossOriginNavigation();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getCachedFaviconForPageUri(java.lang.String uri, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uri);
          _data.writeStrongBinder((((resultCallback!=null))?(resultCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCachedFaviconForPageUri, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getCachedFaviconForPageUri(uri, resultCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setUserIdentityCallbackClient(org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserIdentityCallbackClient, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setUserIdentityCallbackClient(client);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IPrerenderController getPrerenderController() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IPrerenderController _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrerenderController, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrerenderController();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IPrerenderController.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isIncognito() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isIncognito, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isIncognito();
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
      @Override public void setClient(org.chromium.weblayer_private.interfaces.IProfileClient client) throws android.os.RemoteException
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
      @Override public void destroyAndDeleteDataFromDiskSoon(org.chromium.weblayer_private.interfaces.IObjectWrapper completeCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((completeCallback!=null))?(completeCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyAndDeleteDataFromDiskSoon, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().destroyAndDeleteDataFromDiskSoon(completeCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IProfile sDefaultImpl;
    }
    static final int TRANSACTION_destroy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_clearBrowsingData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setDownloadDirectory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_destroyAndDeleteDataFromDisk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setDownloadCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getCookieManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setBooleanSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getBooleanSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getBrowserPersistenceIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_removeBrowserPersistenceStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_prepareForPossibleCrossOriginNavigation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getCachedFaviconForPageUri = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setUserIdentityCallbackClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getPrerenderController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_isIncognito = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_destroyAndDeleteDataFromDiskSoon = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IProfile impl) {
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
    public static org.chromium.weblayer_private.interfaces.IProfile getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  void destroy() throws android.os.RemoteException;
  void clearBrowsingData(int[] dataTypes, long fromMillis, long toMillis, org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException;
  java.lang.String getName() throws android.os.RemoteException;
  void setDownloadDirectory(java.lang.String directory) throws android.os.RemoteException;
  void destroyAndDeleteDataFromDisk(org.chromium.weblayer_private.interfaces.IObjectWrapper completionCallback) throws android.os.RemoteException;
  void setDownloadCallbackClient(org.chromium.weblayer_private.interfaces.IDownloadCallbackClient client) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.ICookieManager getCookieManager() throws android.os.RemoteException;
  void setBooleanSetting(int type, boolean value) throws android.os.RemoteException;
  boolean getBooleanSetting(int type) throws android.os.RemoteException;
  void getBrowserPersistenceIds(org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException;
  void removeBrowserPersistenceStorage(java.lang.String[] ids, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException;
  void prepareForPossibleCrossOriginNavigation() throws android.os.RemoteException;
  void getCachedFaviconForPageUri(java.lang.String uri, org.chromium.weblayer_private.interfaces.IObjectWrapper resultCallback) throws android.os.RemoteException;
  void setUserIdentityCallbackClient(org.chromium.weblayer_private.interfaces.IUserIdentityCallbackClient client) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IPrerenderController getPrerenderController() throws android.os.RemoteException;
  boolean isIncognito() throws android.os.RemoteException;
  void setClient(org.chromium.weblayer_private.interfaces.IProfileClient client) throws android.os.RemoteException;
  void destroyAndDeleteDataFromDiskSoon(org.chromium.weblayer_private.interfaces.IObjectWrapper completeCallback) throws android.os.RemoteException;
}
