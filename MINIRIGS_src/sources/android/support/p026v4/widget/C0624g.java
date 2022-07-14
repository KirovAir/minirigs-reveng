package android.support.p026v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.g */
public final class C0624g {
    /* renamed from: a */
    public static void m2783a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
