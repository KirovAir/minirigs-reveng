package android.support.p026v4.p036h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.p026v4.p029b.p030a.C0489b;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: android.support.v4.h.h */
public final class C0584h {
    /* renamed from: a */
    public static MenuItem m2536a(MenuItem menuItem, C0576c cVar) {
        if (menuItem instanceof C0489b) {
            return ((C0489b) menuItem).mo1890a(cVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m2540a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).mo1891a(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m2542b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).mo1893b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m2537a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m2541b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m2538a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2539a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C0489b) {
            ((C0489b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
