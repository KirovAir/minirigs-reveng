package android.support.p026v4.p027a;

import android.content.Context;
import android.os.Process;
import android.support.p026v4.app.C0420c;

/* renamed from: android.support.v4.a.c */
public final class C0409c {
    /* renamed from: a */
    public static int m1698a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0420c.m1729a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0420c.m1728a(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m1697a(Context context, String str) {
        return m1698a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
