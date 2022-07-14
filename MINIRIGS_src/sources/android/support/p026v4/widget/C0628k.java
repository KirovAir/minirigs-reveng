package android.support.p026v4.widget;

import android.os.Build;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0594r;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.k */
public final class C0628k {

    /* renamed from: a */
    private static Method f1940a;

    /* renamed from: b */
    private static boolean f1941b;

    /* renamed from: c */
    private static Field f1942c;

    /* renamed from: d */
    private static boolean f1943d;

    /* renamed from: a */
    public static void m2793a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0579d.m2523a(i3, C0594r.m2602f(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m2794a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!f1943d) {
                try {
                    f1942c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1942c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f1943d = true;
            }
            Field field = f1942c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2792a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f1941b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1940a = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f1940a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1941b = true;
        }
        Method method = f1940a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
