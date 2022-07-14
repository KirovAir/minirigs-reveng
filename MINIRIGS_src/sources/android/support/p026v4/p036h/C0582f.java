package android.support.p026v4.p036h;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.h.f */
public final class C0582f {

    /* renamed from: a */
    private static Field f1823a;

    /* renamed from: b */
    private static boolean f1824b;

    /* renamed from: b */
    private static void m2533b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f1824b) {
            try {
                f1823a = LayoutInflater.class.getDeclaredField("mFactory2");
                f1823a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1824b = true;
        }
        Field field = f1823a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m2532a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m2533b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m2533b(layoutInflater, factory2);
            }
        }
    }
}
