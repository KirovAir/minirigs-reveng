package com.minirig.android.p048a;

import android.util.Log;
import com.minirig.android.p049b.C1257f;

/* renamed from: com.minirig.android.a.c */
public class MinirigCommandGenerator {

    /* renamed from: a */
    public String currentCommand;

    /* renamed from: b */
    public int f4395b = 0;

    /* renamed from: c */
    private String f4396c = MinirigCommandGenerator.class.getSimpleName();

    /* renamed from: d */
    private String f4397d;

    /* renamed from: a */
    public byte[] toByteArray(String str, String str2) {
        this.f4397d = str;
        this.currentCommand = str2;
        byte[] a = C1257f.m6121a(str);
        if (a.length == 0) {
            Log.d(this.f4396c, "Unable to convert message to bytes");
        }
        return a;
    }

    /* renamed from: a */
    public String setName(String str) {
        String str2 = "N SET NAME=" + str;
        this.currentCommand = "SET_NAME";
        return str2;
    }

    /* renamed from: b */
    public String setNameShort(String str) {
        String str2 = "N SET NAME_SHORT=" + str.substring(0, Math.min(str.length(), 7));
        this.currentCommand = "SET_NAME_SHORT";
        return str2;
    }

    /* renamed from: a */
    public String setEqBand(String str, int i) {
        String num = Integer.toString(i);
        if (num.length() == 1) {
            num = "0" + num;
        }
        String str2 = "q p " + str + " " + num;
        this.currentCommand = "SET_EQ_BAND";
        return str2;
    }

    /* renamed from: b */
    public String setPowerSaving(String str, int i) {
        String str2 = "q b " + str + " " + Integer.toString(i);
        this.currentCommand = "SET_POWER_SAVING";
        return str2;
    }

    /* renamed from: c */
    public String setDefinedEq(String str) {
        String str2 = "q" + str;
        this.currentCommand = "SET_DEFINED_EQ";
        return str2;
    }
}
