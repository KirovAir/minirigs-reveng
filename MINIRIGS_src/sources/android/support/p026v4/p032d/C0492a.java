package android.support.p026v4.p032d;

import android.os.Build;
import android.os.Trace;

/* renamed from: android.support.v4.d.a */
public final class C0492a {
    /* renamed from: a */
    public static void m2183a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m2182a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
