package com.minirig.android.p049b;

import android.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: com.minirig.android.b.f */
public class C1257f {
    /* renamed from: a */
    public static byte[] m6121a(String str) {
        byte[] bArr = new byte[0];
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Log.e("StringUtils", "Failed to convert message string to byte array");
            return bArr;
        }
    }

    /* renamed from: a */
    public static String m6120a(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Log.e("StringUtils", "Unable to convert message bytes to string");
            return null;
        }
    }
}
