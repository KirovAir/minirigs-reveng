package com.minirig.android.p048a;

/* renamed from: com.minirig.android.a.d */
public class C1229d {
    /* renamed from: a */
    public String mo5473a(String str) {
        return Integer.toString(Integer.parseInt(str, 16));
    }

    /* renamed from: a */
    public String mo5472a(int i) {
        return m6010b(i / 60) + ":" + m6010b(i % 60);
    }

    /* renamed from: b */
    public static String m6010b(int i) {
        if (i < 9) {
            return "0" + i;
        }
        return i + "";
    }

    /* renamed from: c */
    public static String m6011c(int i) {
        if (i < 60) {
            return (i % 60) + " minutes";
        } else if (i < 1440) {
            return ((i / 60) % 24) + " hours, " + (i % 60) + " minutes";
        } else {
            return ((i / 24) / 60) + " days, " + ((i / 60) % 24) + " hours, " + (i % 60) + " minutes";
        }
    }
}
