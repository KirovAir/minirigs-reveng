package android.support.p015d;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.d.ae */
class C0176ae extends C0179ah {

    /* renamed from: a */
    private static Method f590a;

    /* renamed from: b */
    private static boolean f591b;

    /* renamed from: c */
    private static Method f592c;

    /* renamed from: d */
    private static boolean f593d;

    /* renamed from: b */
    public void mo593b(View view) {
    }

    /* renamed from: c */
    public void mo594c(View view) {
    }

    C0176ae() {
    }

    /* renamed from: a */
    public void mo592a(View view, float f) {
        m655a();
        Method method = f590a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public float mo591a(View view) {
        m656b();
        Method method = f592c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo591a(view);
    }

    /* renamed from: a */
    private void m655a() {
        if (!f591b) {
            Class<View> cls = View.class;
            try {
                f590a = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f590a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f591b = true;
        }
    }

    /* renamed from: b */
    private void m656b() {
        if (!f593d) {
            try {
                f592c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f592c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f593d = true;
        }
    }
}
