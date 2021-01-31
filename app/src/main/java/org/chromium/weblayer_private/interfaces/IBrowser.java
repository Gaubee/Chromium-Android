/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IBrowser extends android.os.IInterface
{
  /** Default implementation for IBrowser. */
  class Default implements org.chromium.weblayer_private.interfaces.IBrowser
  {
    @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setTopView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException
    {
    }
    // |valueCallback| is a wrapped ValueCallback<Boolean> instead. The bool value in |valueCallback|
    // indicates is whether the request was successful. Request might fail if it is subsumed by a
    // following request, or if this object is destroyed.

    @Override public void setSupportsEmbedding(boolean enable, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
    {
    }
    // Sets the active tab, returns false if tab is not attached to this fragment.

    @Override public boolean setActiveTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int getActiveTabId() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.util.List getTabs() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setClient(org.chromium.weblayer_private.interfaces.IBrowserClient client) throws android.os.RemoteException
    {
    }
    @Override public void addTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
    {
    }
    @Override public void destroyTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.IUrlBarController getUrlBarController() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setBottomView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException
    {
    }
    @Override public org.chromium.weblayer_private.interfaces.ITab createTab() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setTopViewAndScrollingBehavior(org.chromium.weblayer_private.interfaces.IObjectWrapper view, int minHeight, boolean onlyExpandControlsAtPageTop, boolean animate) throws android.os.RemoteException
    {
    }
    @Override public boolean isRestoringPreviousState() throws android.os.RemoteException
    {
      return false;
    }
    // Added in 88.

    @Override public void setBrowserControlsOffsetsEnabled(boolean enable) throws android.os.RemoteException
    {
    }
    // Added in 89.

    @Override public void setMinimumSurfaceSize(int width, int height) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IBrowser
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IBrowser";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IBrowser interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IBrowser asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IBrowser))) {
        return ((org.chromium.weblayer_private.interfaces.IBrowser)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IBrowser.Stub.Proxy(obj);
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
        case TRANSACTION_getProfile:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IProfile _result = this.getProfile();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setTopView:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.setTopView(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setSupportsEmbedding:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.setSupportsEmbedding(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setActiveTab:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ITab _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ITab.Stub.asInterface(data.readStrongBinder());
          boolean _result = this.setActiveTab(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getActiveTabId:
        {
          data.enforceInterface(descriptor);
          int _result = this.getActiveTabId();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getTabs:
        {
          data.enforceInterface(descriptor);
          java.util.List _result = this.getTabs();
          reply.writeNoException();
          reply.writeList(_result);
          return true;
        }
        case TRANSACTION_setClient:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IBrowserClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IBrowserClient.Stub.asInterface(data.readStrongBinder());
          this.setClient(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addTab:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ITab _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ITab.Stub.asInterface(data.readStrongBinder());
          this.addTab(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_destroyTab:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ITab _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.ITab.Stub.asInterface(data.readStrongBinder());
          this.destroyTab(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getUrlBarController:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IUrlBarController _result = this.getUrlBarController();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setBottomView:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.setBottomView(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createTab:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.ITab _result = this.createTab();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setTopViewAndScrollingBehavior:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          this.setTopViewAndScrollingBehavior(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isRestoringPreviousState:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isRestoringPreviousState();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_setBrowserControlsOffsetsEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setBrowserControlsOffsetsEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setMinimumSurfaceSize:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setMinimumSurfaceSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IBrowser
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
      @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IProfile _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProfile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getProfile();
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
      @Override public void setTopView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((view!=null))?(view.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTopView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTopView(view);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // |valueCallback| is a wrapped ValueCallback<Boolean> instead. The bool value in |valueCallback|
      // indicates is whether the request was successful. Request might fail if it is subsumed by a
      // following request, or if this object is destroyed.

      @Override public void setSupportsEmbedding(boolean enable, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          _data.writeStrongBinder((((valueCallback!=null))?(valueCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSupportsEmbedding, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setSupportsEmbedding(enable, valueCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Sets the active tab, returns false if tab is not attached to this fragment.

      @Override public boolean setActiveTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((tab!=null))?(tab.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setActiveTab, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setActiveTab(tab);
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
      @Override public int getActiveTabId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getActiveTabId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getActiveTabId();
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
      @Override public java.util.List getTabs() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTabs, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTabs();
          }
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readArrayList(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setClient(org.chromium.weblayer_private.interfaces.IBrowserClient client) throws android.os.RemoteException
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
      @Override public void addTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((tab!=null))?(tab.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_addTab, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addTab(tab);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void destroyTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((tab!=null))?(tab.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_destroyTab, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().destroyTab(tab);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.IUrlBarController getUrlBarController() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IUrlBarController _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUrlBarController, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getUrlBarController();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IUrlBarController.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setBottomView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((view!=null))?(view.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBottomView, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBottomView(view);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public org.chromium.weblayer_private.interfaces.ITab createTab() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ITab _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createTab, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createTab();
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ITab.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setTopViewAndScrollingBehavior(org.chromium.weblayer_private.interfaces.IObjectWrapper view, int minHeight, boolean onlyExpandControlsAtPageTop, boolean animate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((view!=null))?(view.asBinder()):(null)));
          _data.writeInt(minHeight);
          _data.writeInt(((onlyExpandControlsAtPageTop)?(1):(0)));
          _data.writeInt(((animate)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTopViewAndScrollingBehavior, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTopViewAndScrollingBehavior(view, minHeight, onlyExpandControlsAtPageTop, animate);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean isRestoringPreviousState() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isRestoringPreviousState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isRestoringPreviousState();
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
      // Added in 88.

      @Override public void setBrowserControlsOffsetsEnabled(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBrowserControlsOffsetsEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBrowserControlsOffsetsEnabled(enable);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Added in 89.

      @Override public void setMinimumSurfaceSize(int width, int height) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(width);
          _data.writeInt(height);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMinimumSurfaceSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setMinimumSurfaceSize(width, height);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.chromium.weblayer_private.interfaces.IBrowser sDefaultImpl;
    }
    static final int TRANSACTION_getProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setTopView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setSupportsEmbedding = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setActiveTab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getActiveTabId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getTabs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_addTab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_destroyTab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getUrlBarController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setBottomView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_createTab = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setTopViewAndScrollingBehavior = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_isRestoringPreviousState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setBrowserControlsOffsetsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setMinimumSurfaceSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IBrowser impl) {
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
    public static org.chromium.weblayer_private.interfaces.IBrowser getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  org.chromium.weblayer_private.interfaces.IProfile getProfile() throws android.os.RemoteException;
  void setTopView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException;
  // |valueCallback| is a wrapped ValueCallback<Boolean> instead. The bool value in |valueCallback|
  // indicates is whether the request was successful. Request might fail if it is subsumed by a
  // following request, or if this object is destroyed.

  void setSupportsEmbedding(boolean enable, org.chromium.weblayer_private.interfaces.IObjectWrapper valueCallback) throws android.os.RemoteException;
  // Sets the active tab, returns false if tab is not attached to this fragment.

  boolean setActiveTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException;
  int getActiveTabId() throws android.os.RemoteException;
  java.util.List getTabs() throws android.os.RemoteException;
  void setClient(org.chromium.weblayer_private.interfaces.IBrowserClient client) throws android.os.RemoteException;
  void addTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException;
  void destroyTab(org.chromium.weblayer_private.interfaces.ITab tab) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.IUrlBarController getUrlBarController() throws android.os.RemoteException;
  void setBottomView(org.chromium.weblayer_private.interfaces.IObjectWrapper view) throws android.os.RemoteException;
  org.chromium.weblayer_private.interfaces.ITab createTab() throws android.os.RemoteException;
  void setTopViewAndScrollingBehavior(org.chromium.weblayer_private.interfaces.IObjectWrapper view, int minHeight, boolean onlyExpandControlsAtPageTop, boolean animate) throws android.os.RemoteException;
  boolean isRestoringPreviousState() throws android.os.RemoteException;
  // Added in 88.

  void setBrowserControlsOffsetsEnabled(boolean enable) throws android.os.RemoteException;
  // Added in 89.

  void setMinimumSurfaceSize(int width, int height) throws android.os.RemoteException;
}
