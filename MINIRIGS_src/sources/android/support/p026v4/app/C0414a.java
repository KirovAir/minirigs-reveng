package android.support.p026v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p026v4.p027a.C0391a;

/* renamed from: android.support.v4.app.a */
public class C0414a extends C0391a {

    /* renamed from: a */
    private static C0417b f1336a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0416a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$b */
    public interface C0417b {
        /* renamed from: a */
        boolean mo1504a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo1505a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface C0418c {
        /* renamed from: a */
        void mo1506a(int i);
    }

    /* renamed from: a */
    public static C0417b m1720a() {
        return f1336a;
    }

    /* renamed from: a */
    public static void m1721a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1722a(final Activity activity, final String[] strArr, final int i) {
        C0417b bVar = f1336a;
        if (bVar != null && bVar.mo1505a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0418c) {
                ((C0418c) activity).mo1506a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0416a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0416a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m1723a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
