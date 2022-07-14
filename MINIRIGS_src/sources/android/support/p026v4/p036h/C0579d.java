package android.support.p026v4.p036h;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: android.support.v4.h.d */
public final class C0579d {
    /* renamed from: a */
    public static void m2524a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: a */
    public static int m2523a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
