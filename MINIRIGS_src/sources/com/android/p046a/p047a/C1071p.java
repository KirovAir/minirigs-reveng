package com.android.p046a.p047a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.p046a.C1083h;
import com.android.p046a.C1093o;
import java.io.File;

/* renamed from: com.android.a.a.p */
public class C1071p {
    /* renamed from: a */
    public static C1093o m5584a(Context context, C1042b bVar) {
        C1043c cVar;
        if (bVar != null) {
            cVar = new C1043c(bVar);
        } else if (Build.VERSION.SDK_INT >= 9) {
            cVar = new C1043c((C1042b) new C1054j());
        } else {
            String str = "volley/0";
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            cVar = new C1043c((C1053i) new C1049f(AndroidHttpClient.newInstance(str)));
        }
        return m5585a(context, (C1083h) cVar);
    }

    /* renamed from: a */
    private static C1093o m5585a(Context context, C1083h hVar) {
        C1093o oVar = new C1093o(new C1046e(new File(context.getCacheDir(), "volley")), hVar);
        oVar.mo5218a();
        return oVar;
    }

    /* renamed from: a */
    public static C1093o m5583a(Context context) {
        return m5584a(context, (C1042b) null);
    }
}
