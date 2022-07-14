package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p036h.C0576c;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0741a implements C0489b {

    /* renamed from: a */
    private final int f2448a;

    /* renamed from: b */
    private final int f2449b;

    /* renamed from: c */
    private final int f2450c;

    /* renamed from: d */
    private final int f2451d;

    /* renamed from: e */
    private CharSequence f2452e;

    /* renamed from: f */
    private CharSequence f2453f;

    /* renamed from: g */
    private Intent f2454g;

    /* renamed from: h */
    private char f2455h;

    /* renamed from: i */
    private int f2456i = 4096;

    /* renamed from: j */
    private char f2457j;

    /* renamed from: k */
    private int f2458k = 4096;

    /* renamed from: l */
    private Drawable f2459l;

    /* renamed from: m */
    private int f2460m = 0;

    /* renamed from: n */
    private Context f2461n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f2462o;

    /* renamed from: p */
    private CharSequence f2463p;

    /* renamed from: q */
    private CharSequence f2464q;

    /* renamed from: r */
    private ColorStateList f2465r = null;

    /* renamed from: s */
    private PorterDuff.Mode f2466s = null;

    /* renamed from: t */
    private boolean f2467t = false;

    /* renamed from: u */
    private boolean f2468u = false;

    /* renamed from: v */
    private int f2469v = 16;

    /* renamed from: a */
    public C0576c mo1892a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public View getActionView() {
        return null;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public void setShowAsAction(int i) {
    }

    public C0741a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2461n = context;
        this.f2448a = i2;
        this.f2449b = i;
        this.f2450c = i3;
        this.f2451d = i4;
        this.f2452e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f2457j;
    }

    public int getAlphabeticModifiers() {
        return this.f2458k;
    }

    public int getGroupId() {
        return this.f2449b;
    }

    public Drawable getIcon() {
        return this.f2459l;
    }

    public Intent getIntent() {
        return this.f2454g;
    }

    public int getItemId() {
        return this.f2448a;
    }

    public char getNumericShortcut() {
        return this.f2455h;
    }

    public int getNumericModifiers() {
        return this.f2456i;
    }

    public int getOrder() {
        return this.f2451d;
    }

    public CharSequence getTitle() {
        return this.f2452e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2453f;
        return charSequence != null ? charSequence : this.f2452e;
    }

    public boolean isCheckable() {
        return (this.f2469v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f2469v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f2469v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f2469v & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2457j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2457j = Character.toLowerCase(c);
        this.f2458k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2469v = z | (this.f2469v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2469v = (z ? 2 : 0) | (this.f2469v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2469v = (z ? 16 : 0) | (this.f2469v & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2459l = drawable;
        this.f2460m = 0;
        m3357b();
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2460m = i;
        this.f2459l = C0391a.m1620a(this.f2461n, i);
        m3357b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2454g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2455h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2455h = c;
        this.f2456i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2462o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2455h = c;
        this.f2457j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2455h = c;
        this.f2456i = KeyEvent.normalizeMetaState(i);
        this.f2457j = Character.toLowerCase(c2);
        this.f2458k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2452e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f2452e = this.f2461n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2453f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f2469v & 8;
        if (z) {
            i = 0;
        }
        this.f2469v = i2 | i;
        return this;
    }

    /* renamed from: a */
    public C0489b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0489b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0489b mo1890a(C0576c cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0489b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0489b setContentDescription(CharSequence charSequence) {
        this.f2463p = charSequence;
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f2463p;
    }

    /* renamed from: b */
    public C0489b setTooltipText(CharSequence charSequence) {
        this.f2464q = charSequence;
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f2464q;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2465r = colorStateList;
        this.f2467t = true;
        m3357b();
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f2465r;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2466s = mode;
        this.f2468u = true;
        m3357b();
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2466s;
    }

    /* renamed from: b */
    private void m3357b() {
        if (this.f2459l == null) {
            return;
        }
        if (this.f2467t || this.f2468u) {
            this.f2459l = C0540a.m2390g(this.f2459l);
            this.f2459l = this.f2459l.mutate();
            if (this.f2467t) {
                C0540a.m2379a(this.f2459l, this.f2465r);
            }
            if (this.f2468u) {
                C0540a.m2382a(this.f2459l, this.f2466s);
            }
        }
    }
}
