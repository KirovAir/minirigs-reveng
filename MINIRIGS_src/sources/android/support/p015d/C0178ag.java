package android.support.p015d;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.d.ag */
class C0178ag extends C0177af {

    /* renamed from: a */
    private static Method f598a;

    /* renamed from: b */
    private static boolean f599b;

    C0178ag() {
    }

    /* renamed from: a */
    public void mo597a(View view, int i, int i2, int i3, int i4) {
        m665a();
        Method method = f598a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m665a() {
        if (!f599b) {
            Class<View> cls = View.class;
            try {
                f598a = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f598a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f599b = true;
        }
    }
}
