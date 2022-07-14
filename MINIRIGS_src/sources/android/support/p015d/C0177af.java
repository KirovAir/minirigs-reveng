package android.support.p015d;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.d.af */
class C0177af extends C0176ae {

    /* renamed from: a */
    private static Method f594a;

    /* renamed from: b */
    private static boolean f595b;

    /* renamed from: c */
    private static Method f596c;

    /* renamed from: d */
    private static boolean f597d;

    C0177af() {
    }

    /* renamed from: a */
    public void mo595a(View view, Matrix matrix) {
        m661a();
        Method method = f594a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo596b(View view, Matrix matrix) {
        m662b();
        Method method = f596c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    private void m661a() {
        if (!f595b) {
            try {
                f594a = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f594a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f595b = true;
        }
    }

    /* renamed from: b */
    private void m662b() {
        if (!f597d) {
            try {
                f596c = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f596c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f597d = true;
        }
    }
}
