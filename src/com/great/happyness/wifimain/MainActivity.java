package com.great.happyness.wifimain;


import com.great.happyness.netcodec.NativeCodec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button btn1 = null, btn2 = null,btn3 = null,btn4 = null;
	
	private NativeCodec mCodec = new NativeCodec();
	private boolean mbServRunning = false, mbClientRunning = false;
	private String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button)findViewById(R.id.btn1);
		btn1.setOnClickListener(this);
		btn2 = (Button)findViewById(R.id.btn2);
		btn2.setOnClickListener(this);
		btn3 = (Button)findViewById(R.id.btn3);
		btn3.setOnClickListener(this);
		btn4 = (Button)findViewById(R.id.btn4);
		btn4.setOnClickListener(this);
		
		//mCodec.StartNetWork();
		Log.e(TAG, "onCreate");
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
			case R.id.btn1:
				startActivity(new Intent().setClass(this, CreateWifiActivity.class));
				break;
			case R.id.btn2:
				startActivity(new Intent().setClass(this, ConnectWifiActivity.class));
				break;
			case R.id.btn3:
				if(mbServRunning==false) {
					//mCodec.StartServer("", 8080);
					mCodec.StartRecvFile("192.168.43.1", "9000", "/sdcard/test.wav", "/sdcard/test.wav" );
					mbServRunning = true;
				} else {
					//mCodec.StopServer();
					mCodec.StopRecvFile();
					mbServRunning = false;
				}
				break;
			case R.id.btn4:
				if(mbClientRunning==false) {
					//mbClientRunning = mCodec.StartSend("192.168.43.1", 8080);
					mCodec.StartSendFile( "9000" );
				} else {
					//mCodec.StopSend();
					mCodec.StopSendFile();
					mbClientRunning = false;
				}
				break;
		}
	}
	
	@Override
	protected void onDestroy() {
		if(mbServRunning) {
			//mCodec.StopServer();
			mbServRunning = false;
		}
		//mCodec.StopNetWork();
		Log.e(TAG, "onDestroy");
		super.onDestroy();
	}
	
}
