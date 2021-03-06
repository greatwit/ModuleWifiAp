/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\android_env\\workspace\\ModuleWifiAp\\src\\com\\great\\happyness\\service\\aidl\\IActivityReq.aidl
 */
package com.great.happyness.service.aidl;
// Declare any non-default types here with import statements

public interface IActivityReq extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.great.happyness.service.aidl.IActivityReq
{
private static final java.lang.String DESCRIPTOR = "com.great.happyness.service.aidl.IActivityReq";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.great.happyness.service.aidl.IActivityReq interface,
 * generating a proxy if needed.
 */
public static com.great.happyness.service.aidl.IActivityReq asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.great.happyness.service.aidl.IActivityReq))) {
return ((com.great.happyness.service.aidl.IActivityReq)iin);
}
return new com.great.happyness.service.aidl.IActivityReq.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
com.great.happyness.service.aidl.IServiceListen _arg0;
_arg0 = com.great.happyness.service.aidl.IServiceListen.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
com.great.happyness.service.aidl.IServiceListen _arg0;
_arg0 = com.great.happyness.service.aidl.IServiceListen.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_action:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.action(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_startUdpServer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startUdpServer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopUdpServer:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopUdpServer();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isUdpServerRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isUdpServerRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.sendData(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.great.happyness.service.aidl.IActivityReq
{
private android.os.IBinder mRemote;
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
@Override public void registerListener(com.great.happyness.service.aidl.IServiceListen listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(com.great.happyness.service.aidl.IServiceListen listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void action(int action, java.lang.String datum) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(action);
_data.writeString(datum);
mRemote.transact(Stub.TRANSACTION_action, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean startUdpServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startUdpServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean stopUdpServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopUdpServer, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isUdpServerRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isUdpServerRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int sendData(java.lang.String addr, int port, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(addr);
_data.writeInt(port);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_sendData, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_action = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startUdpServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopUdpServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_isUdpServerRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void registerListener(com.great.happyness.service.aidl.IServiceListen listener) throws android.os.RemoteException;
public void unregisterListener(com.great.happyness.service.aidl.IServiceListen listener) throws android.os.RemoteException;
public void action(int action, java.lang.String datum) throws android.os.RemoteException;
public boolean startUdpServer() throws android.os.RemoteException;
public boolean stopUdpServer() throws android.os.RemoteException;
public boolean isUdpServerRunning() throws android.os.RemoteException;
public int sendData(java.lang.String addr, int port, java.lang.String data) throws android.os.RemoteException;
}
