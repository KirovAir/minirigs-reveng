package android.support.p026v4.p029b.p030a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p026v4.p036h.C0576c;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.b.a.b */
public interface C0489b extends MenuItem {
    /* renamed from: a */
    C0489b mo1890a(C0576c cVar);

    /* renamed from: a */
    C0489b mo1891a(CharSequence charSequence);

    /* renamed from: a */
    C0576c mo1892a();

    /* renamed from: b */
    C0489b mo1893b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
