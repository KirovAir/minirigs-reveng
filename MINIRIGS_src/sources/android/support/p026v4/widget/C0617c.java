package android.support.p026v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c */
public final class C0617c {

    /* renamed from: a */
    private static Field f1921a;

    /* renamed from: b */
    private static boolean f1922b;

    /* renamed from: a */
    public static void m2756a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0632n) {
            ((C0632n) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2757a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0632n) {
            ((C0632n) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m2755a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1922b) {
            try {
                f1921a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1921a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f1922b = true;
        }
        Field field = f1921a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f1921a = null;
            }
        }
        return null;
    }
}
