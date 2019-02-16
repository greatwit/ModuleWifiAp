package com.great.happyness.ui.qrcode;

import com.google.zxing.Result;
import android.graphics.Bitmap;

public interface IQrcodeListener {
	void callQrcode(final long decodeTime, final Result obj, Bitmap barcode);
	void msgQrcode(int msg);
	void onDrawViewfinder();
}