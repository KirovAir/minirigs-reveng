package com.minirig.android.data;

import android.arch.p003b.p006b.C0046e;
import android.arch.p003b.p006b.C0047f;
import android.content.Context;

public abstract class AppDatabase extends C0047f {

    /* renamed from: d */
    private static AppDatabase f4672d;

    /* renamed from: j */
    public abstract C1275d mo5588j();

    /* renamed from: a */
    public static AppDatabase m6130a(Context context) {
        if (f4672d == null) {
            f4672d = C0046e.m133a(context, AppDatabase.class, C1273b.f4681d).mo123a().mo124b().mo125c();
        }
        return f4672d;
    }
}
