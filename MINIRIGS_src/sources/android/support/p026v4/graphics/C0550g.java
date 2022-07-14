package android.support.p026v4.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.g */
public class C0550g extends C0549f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2172a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1789a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1795g.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo2179f(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
