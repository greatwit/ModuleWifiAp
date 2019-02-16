package com.great.happyness.netcodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.util.Log;

@SuppressLint("NewApi") 
public class NativeCodec 
{
	private static String TAG = "NativeCodec";
	
	private static MediaCodec mCodec = null;
	
	public NativeCodec()
	{
	}
	
	static
	{
		try
		{ 
			System.loadLibrary("netudt");
			System.loadLibrary("netcodec");  //
		}
		catch(Throwable e)
		{
			Log.e(TAG, "loadLibrary:"+e.toString());
		}
	}
    
	public native boolean StartNetWork();
	public native boolean StopNetWork();
	public native boolean StartServer(String localip, int localport);
	public native boolean StopServer();
	public native boolean StartSend(String destip, int destport);
	public native boolean StopSend();

	
	
	public native boolean StartSendFile(String destport );
	public native boolean StopSendFile();
	public native boolean StartRecvFile(String destip, String destport, String needFile, String saveFile );
	public native boolean StopRecvFile();
	
}

