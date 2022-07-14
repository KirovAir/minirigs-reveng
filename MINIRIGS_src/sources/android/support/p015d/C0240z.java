package android.support.p015d;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.d.z */
class C0240z {

    /* renamed from: a */
    private static Method f758a;

    /* renamed from: b */
    private static boolean f759b;

    /* renamed from: a */
    static void m879a(ViewGroup viewGroup, boolean z) {
        m878a();
        Method method = f758a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e2);
            }
        }
    }

    /* renamed from: a */
    private static void m878a() {
        if (!f759b) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f758a = cls.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f758a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f759b = true;
        }
    }
}
