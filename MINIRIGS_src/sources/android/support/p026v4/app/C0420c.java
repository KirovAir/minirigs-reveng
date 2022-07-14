package android.support.p026v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: android.support.v4.app.c */
public final class C0420c {
    /* renamed from: a */
    public static String m1729a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    /* renamed from: a */
    public static int m1728a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }
}
