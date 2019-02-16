/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\android_env\\workspace\\ModuleWifiAp\\src\\com\\great\\happyness\\service\\aidl\\IServiceListen.aidl
 */
package com.great.happyness.service.aidl;
// Declare any non-default types here with import statements

public interface IServiceListen extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.great.happyness.service.aidl.IServiceListen
{
private static final java.lang.String DESCRIPTOR = "com.great.happyness.service.aidl.IServiceListen";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.great.happyness.service.aidl.IServiceListen interface,
 * generating a proxy if needed.
 */
public static com.great.happyness.service.aidl.IServiceListen asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.great.happyness.service.aidl.IServiceListen))) {
return ((com.great.happyness.service.aidl.IServiceListen)iin);
}
return new com.great.happyness.service.aidl.IServiceListen.Stub.Proxy(obj);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.great.happyness.service.aidl.IServiceListen
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
}
}
}
