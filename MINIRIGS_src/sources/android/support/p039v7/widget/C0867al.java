package android.support.p039v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.p026v4.graphics.drawable.C0542c;
import android.support.p039v7.p043c.p044a.C0719c;

/* renamed from: android.support.v7.widget.al */
public class C0867al {

    /* renamed from: a */
    public static final Rect f3089a = new Rect();

    /* renamed from: b */
    private static Class<?> f3090b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f3090b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    static void m4295a(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m4297c(drawable);
        }
    }

    /* renamed from: b */
    public static boolean m4296b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable b : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m4296b(b)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C0542c) {
            return m4296b(((C0542c) drawable).mo2129a());
        } else {
            if (drawable instanceof C0719c) {
                return m4296b(((C0719c) drawable).mo2803b());
            }
            if (drawable instanceof ScaleDrawable) {
                return m4296b(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: c */
    private static void m4297c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C0963bi.f3539e);
        } else {
            drawable.setState(C0963bi.f3542h);
        }
        drawable.setState(state);
    }

    /* renamed from: a */
    public static PorterDuff.Mode m4294a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
