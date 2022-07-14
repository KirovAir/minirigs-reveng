package android.support.p015d;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.p026v4.p036h.C0594r;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.d.ad */
class C0173ad {

    /* renamed from: a */
    static final Property<View, Float> f585a = new Property<View, Float>(Float.class, "translationAlpha") {
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0173ad.m648c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C0173ad.m642a(view, f.floatValue());
        }
    };

    /* renamed from: b */
    static final Property<View, Rect> f586b = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* renamed from: a */
        public Rect get(View view) {
            return C0594r.m2624y(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C0594r.m2583a(view, rect);
        }
    };

    /* renamed from: c */
    private static final C0179ah f587c;

    /* renamed from: d */
    private static Field f588d;

    /* renamed from: e */
    private static boolean f589e;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            f587c = new C0178ag();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f587c = new C0177af();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f587c = new C0176ae();
        } else {
            f587c = new C0179ah();
        }
    }

    /* renamed from: a */
    static C0172ac m640a(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0171ab(view);
        }
        return C0169aa.m627d(view);
    }

    /* renamed from: b */
    static C0186al m646b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0185ak(view);
        }
        return new C0184aj(view.getWindowToken());
    }

    /* renamed from: a */
    static void m642a(View view, float f) {
        f587c.mo592a(view, f);
    }

    /* renamed from: c */
    static float m648c(View view) {
        return f587c.mo591a(view);
    }

    /* renamed from: d */
    static void m649d(View view) {
        f587c.mo593b(view);
    }

    /* renamed from: e */
    static void m650e(View view) {
        f587c.mo594c(view);
    }

    /* renamed from: a */
    static void m643a(View view, int i) {
        m641a();
        Field field = f588d;
        if (field != null) {
            try {
                f588d.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m645a(View view, Matrix matrix) {
        f587c.mo595a(view, matrix);
    }

    /* renamed from: b */
    static void m647b(View view, Matrix matrix) {
        f587c.mo596b(view, matrix);
    }

    /* renamed from: a */
    static void m644a(View view, int i, int i2, int i3, int i4) {
        f587c.mo597a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static void m641a() {
        if (!f589e) {
            try {
                f588d = View.class.getDeclaredField("mViewFlags");
                f588d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f589e = true;
        }
    }
}
