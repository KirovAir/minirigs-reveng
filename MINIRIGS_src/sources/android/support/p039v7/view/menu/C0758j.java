package android.support.p039v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p036h.C0576c;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.view.menu.C0772p;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0758j implements C0489b {

    /* renamed from: A */
    private View f2569A;

    /* renamed from: B */
    private C0576c f2570B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f2571C;

    /* renamed from: D */
    private boolean f2572D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f2573E;

    /* renamed from: a */
    C0754h f2574a;

    /* renamed from: b */
    private final int f2575b;

    /* renamed from: c */
    private final int f2576c;

    /* renamed from: d */
    private final int f2577d;

    /* renamed from: e */
    private final int f2578e;

    /* renamed from: f */
    private CharSequence f2579f;

    /* renamed from: g */
    private CharSequence f2580g;

    /* renamed from: h */
    private Intent f2581h;

    /* renamed from: i */
    private char f2582i;

    /* renamed from: j */
    private int f2583j = 4096;

    /* renamed from: k */
    private char f2584k;

    /* renamed from: l */
    private int f2585l = 4096;

    /* renamed from: m */
    private Drawable f2586m;

    /* renamed from: n */
    private int f2587n = 0;

    /* renamed from: o */
    private C0780u f2588o;

    /* renamed from: p */
    private Runnable f2589p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f2590q;

    /* renamed from: r */
    private CharSequence f2591r;

    /* renamed from: s */
    private CharSequence f2592s;

    /* renamed from: t */
    private ColorStateList f2593t = null;

    /* renamed from: u */
    private PorterDuff.Mode f2594u = null;

    /* renamed from: v */
    private boolean f2595v = false;

    /* renamed from: w */
    private boolean f2596w = false;

    /* renamed from: x */
    private boolean f2597x = false;

    /* renamed from: y */
    private int f2598y = 16;

    /* renamed from: z */
    private int f2599z = 0;

    C0758j(C0754h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2574a = hVar;
        this.f2575b = i2;
        this.f2576c = i;
        this.f2577d = i3;
        this.f2578e = i4;
        this.f2579f = charSequence;
        this.f2599z = i5;
    }

    /* renamed from: b */
    public boolean mo3126b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2590q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0754h hVar = this.f2574a;
        if (hVar.mo3055a(hVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f2589p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2581h != null) {
            try {
                this.f2574a.mo3085f().startActivity(this.f2581h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0576c cVar = this.f2570B;
        if (cVar == null || !cVar.mo2265d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f2598y & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2598y |= 16;
        } else {
            this.f2598y &= -17;
        }
        this.f2574a.mo3071b(false);
        return this;
    }

    public int getGroupId() {
        return this.f2576c;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2575b;
    }

    public int getOrder() {
        return this.f2577d;
    }

    /* renamed from: c */
    public int mo3127c() {
        return this.f2578e;
    }

    public Intent getIntent() {
        return this.f2581h;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2581h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f2584k;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2584k == c) {
            return this;
        }
        this.f2584k = Character.toLowerCase(c);
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2584k == c && this.f2585l == i) {
            return this;
        }
        this.f2584k = Character.toLowerCase(c);
        this.f2585l = KeyEvent.normalizeMetaState(i);
        this.f2574a.mo3071b(false);
        return this;
    }

    public int getAlphabeticModifiers() {
        return this.f2585l;
    }

    public char getNumericShortcut() {
        return this.f2582i;
    }

    public int getNumericModifiers() {
        return this.f2583j;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f2582i == c) {
            return this;
        }
        this.f2582i = c;
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2582i == c && this.f2583j == i) {
            return this;
        }
        this.f2582i = c;
        this.f2583j = KeyEvent.normalizeMetaState(i);
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2582i = c;
        this.f2584k = Character.toLowerCase(c2);
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2582i = c;
        this.f2583j = KeyEvent.normalizeMetaState(i);
        this.f2584k = Character.toLowerCase(c2);
        this.f2585l = KeyEvent.normalizeMetaState(i2);
        this.f2574a.mo3071b(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo3129d() {
        return this.f2574a.mo3075c() ? this.f2584k : this.f2582i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo3131e() {
        char d = mo3129d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f2574a.mo3085f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2574a.mo3085f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0639a.C0647h.abc_prepend_shortcut_label));
        }
        int i = this.f2574a.mo3075c() ? this.f2585l : this.f2583j;
        m3495a(sb, i, 65536, resources.getString(C0639a.C0647h.abc_menu_meta_shortcut_label));
        m3495a(sb, i, 4096, resources.getString(C0639a.C0647h.abc_menu_ctrl_shortcut_label));
        m3495a(sb, i, 2, resources.getString(C0639a.C0647h.abc_menu_alt_shortcut_label));
        m3495a(sb, i, 1, resources.getString(C0639a.C0647h.abc_menu_shift_shortcut_label));
        m3495a(sb, i, 4, resources.getString(C0639a.C0647h.abc_menu_sym_shortcut_label));
        m3495a(sb, i, 8, resources.getString(C0639a.C0647h.abc_menu_function_shortcut_label));
        if (d == 8) {
            sb.append(resources.getString(C0639a.C0647h.abc_menu_delete_shortcut_label));
        } else if (d == 10) {
            sb.append(resources.getString(C0639a.C0647h.abc_menu_enter_shortcut_label));
        } else if (d != ' ') {
            sb.append(d);
        } else {
            sb.append(resources.getString(C0639a.C0647h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m3495a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo3133f() {
        return this.f2574a.mo3081d() && mo3129d() != 0;
    }

    public SubMenu getSubMenu() {
        return this.f2588o;
    }

    public boolean hasSubMenu() {
        return this.f2588o != null;
    }

    /* renamed from: a */
    public void mo3121a(C0780u uVar) {
        this.f2588o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2579f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo3120a(C0772p.C0773a aVar) {
        if (aVar == null || !aVar.mo968a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2579f = charSequence;
        this.f2574a.mo3071b(false);
        C0780u uVar = this.f2588o;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f2574a.mo3085f().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2580g;
        if (charSequence == null) {
            charSequence = this.f2579f;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2580g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f2579f;
        }
        this.f2574a.mo3071b(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f2586m;
        if (drawable != null) {
            return m3494a(drawable);
        }
        if (this.f2587n == 0) {
            return null;
        }
        Drawable b = C0705a.m3168b(this.f2574a.mo3085f(), this.f2587n);
        this.f2587n = 0;
        this.f2586m = b;
        return m3494a(b);
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2587n = 0;
        this.f2586m = drawable;
        this.f2597x = true;
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2586m = null;
        this.f2587n = i;
        this.f2597x = true;
        this.f2574a.mo3071b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2593t = colorStateList;
        this.f2595v = true;
        this.f2597x = true;
        this.f2574a.mo3071b(false);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f2593t;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2594u = mode;
        this.f2596w = true;
        this.f2597x = true;
        this.f2574a.mo3071b(false);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2594u;
    }

    /* renamed from: a */
    private Drawable m3494a(Drawable drawable) {
        if (drawable != null && this.f2597x && (this.f2595v || this.f2596w)) {
            drawable = C0540a.m2390g(drawable).mutate();
            if (this.f2595v) {
                C0540a.m2379a(drawable, this.f2593t);
            }
            if (this.f2596w) {
                C0540a.m2382a(drawable, this.f2594u);
            }
            this.f2597x = false;
        }
        return drawable;
    }

    public boolean isCheckable() {
        return (this.f2598y & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f2598y;
        this.f2598y = z | (i & true) ? 1 : 0;
        if (i != this.f2598y) {
            this.f2574a.mo3071b(false);
        }
        return this;
    }

    /* renamed from: a */
    public void mo3123a(boolean z) {
        this.f2598y = (z ? 4 : 0) | (this.f2598y & -5);
    }

    /* renamed from: g */
    public boolean mo3134g() {
        return (this.f2598y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f2598y & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f2598y & 4) != 0) {
            this.f2574a.mo3052a((MenuItem) this);
        } else {
            mo3125b(z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3125b(boolean z) {
        int i = this.f2598y;
        this.f2598y = (z ? 2 : 0) | (i & -3);
        if (i != this.f2598y) {
            this.f2574a.mo3071b(false);
        }
    }

    public boolean isVisible() {
        C0576c cVar = this.f2570B;
        if (cVar == null || !cVar.mo2263b()) {
            if ((this.f2598y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f2598y & 8) != 0 || !this.f2570B.mo2264c()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3128c(boolean z) {
        int i = this.f2598y;
        this.f2598y = (z ? 0 : 8) | (i & -9);
        if (i != this.f2598y) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (mo3128c(z)) {
            this.f2574a.mo3049a(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2590q = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2579f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3122a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2573E = contextMenuInfo;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2573E;
    }

    /* renamed from: h */
    public void mo3147h() {
        this.f2574a.mo3069b(this);
    }

    /* renamed from: i */
    public boolean mo3149i() {
        return this.f2574a.mo3103r();
    }

    /* renamed from: j */
    public boolean mo3154j() {
        return (this.f2598y & 32) == 32;
    }

    /* renamed from: k */
    public boolean mo3155k() {
        return (this.f2599z & 1) == 1;
    }

    /* renamed from: l */
    public boolean mo3156l() {
        return (this.f2599z & 2) == 2;
    }

    /* renamed from: d */
    public void mo3130d(boolean z) {
        if (z) {
            this.f2598y |= 32;
        } else {
            this.f2598y &= -33;
        }
    }

    /* renamed from: m */
    public boolean mo3157m() {
        return (this.f2599z & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2599z = i;
                this.f2574a.mo3069b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* renamed from: a */
    public C0489b setActionView(View view) {
        int i;
        this.f2569A = view;
        this.f2570B = null;
        if (view != null && view.getId() == -1 && (i = this.f2575b) > 0) {
            view.setId(i);
        }
        this.f2574a.mo3069b(this);
        return this;
    }

    /* renamed from: a */
    public C0489b setActionView(int i) {
        Context f = this.f2574a.mo3085f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    public View getActionView() {
        View view = this.f2569A;
        if (view != null) {
            return view;
        }
        C0576c cVar = this.f2570B;
        if (cVar == null) {
            return null;
        }
        this.f2569A = cVar.mo2258a((MenuItem) this);
        return this.f2569A;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: a */
    public C0576c mo1892a() {
        return this.f2570B;
    }

    /* renamed from: a */
    public C0489b mo1890a(C0576c cVar) {
        C0576c cVar2 = this.f2570B;
        if (cVar2 != null) {
            cVar2.mo2267f();
        }
        this.f2569A = null;
        this.f2570B = cVar;
        this.f2574a.mo3071b(true);
        C0576c cVar3 = this.f2570B;
        if (cVar3 != null) {
            cVar3.mo2260a((C0576c.C0578b) new C0576c.C0578b() {
                /* renamed from: a */
                public void mo2269a(boolean z) {
                    C0758j.this.f2574a.mo3049a(C0758j.this);
                }
            });
        }
        return this;
    }

    /* renamed from: b */
    public C0489b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!mo3158n()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2571C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2574a.mo3076c(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.f2599z & 8) == 0) {
            return false;
        }
        if (this.f2569A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2571C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2574a.mo3082d(this);
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo3158n() {
        C0576c cVar;
        if ((this.f2599z & 8) == 0) {
            return false;
        }
        if (this.f2569A == null && (cVar = this.f2570B) != null) {
            this.f2569A = cVar.mo2258a((MenuItem) this);
        }
        if (this.f2569A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo3132e(boolean z) {
        this.f2572D = z;
        this.f2574a.mo3071b(false);
    }

    public boolean isActionViewExpanded() {
        return this.f2572D;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2571C = onActionExpandListener;
        return this;
    }

    /* renamed from: a */
    public C0489b setContentDescription(CharSequence charSequence) {
        this.f2591r = charSequence;
        this.f2574a.mo3071b(false);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f2591r;
    }

    /* renamed from: b */
    public C0489b setTooltipText(CharSequence charSequence) {
        this.f2592s = charSequence;
        this.f2574a.mo3071b(false);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f2592s;
    }
}
