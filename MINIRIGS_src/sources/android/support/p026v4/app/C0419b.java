package android.support.p026v4.app;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: android.support.v4.app.b */
public final class C0419b {
    /* renamed from: a */
    public static boolean m1727a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
