package android.support.p026v4.p027a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;

/* renamed from: android.support.v4.a.a */
public class C0391a {

    /* renamed from: a */
    private static final Object f1292a = new Object();

    /* renamed from: b */
    private static TypedValue f1293b;

    /* renamed from: a */
    public static boolean m1621a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: a */
    public static Drawable m1620a(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f1292a) {
            if (f1293b == null) {
                f1293b = new TypedValue();
            }
            context.getResources().getValue(i, f1293b, true);
            i2 = f1293b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: b */
    public static ColorStateList m1622b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static int m1623c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static int m1619a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
