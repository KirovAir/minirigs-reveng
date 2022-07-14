package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.p036h.C0605w;
import android.support.p026v4.p036h.C0606x;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.view.menu.C0741a;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.widget.bo */
public class C0969bo implements C0855aj {

    /* renamed from: a */
    Toolbar f3557a;

    /* renamed from: b */
    CharSequence f3558b;

    /* renamed from: c */
    Window.Callback f3559c;

    /* renamed from: d */
    boolean f3560d;

    /* renamed from: e */
    private int f3561e;

    /* renamed from: f */
    private View f3562f;

    /* renamed from: g */
    private View f3563g;

    /* renamed from: h */
    private Drawable f3564h;

    /* renamed from: i */
    private Drawable f3565i;

    /* renamed from: j */
    private Drawable f3566j;

    /* renamed from: k */
    private boolean f3567k;

    /* renamed from: l */
    private CharSequence f3568l;

    /* renamed from: m */
    private CharSequence f3569m;

    /* renamed from: n */
    private C0986c f3570n;

    /* renamed from: o */
    private int f3571o;

    /* renamed from: p */
    private int f3572p;

    /* renamed from: q */
    private Drawable f3573q;

    /* renamed from: b */
    public void mo3978b(boolean z) {
    }

    public C0969bo(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0639a.C0647h.abc_action_bar_up_description, C0639a.C0644e.abc_ic_ab_back_material);
    }

    public C0969bo(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f3571o = 0;
        this.f3572p = 0;
        this.f3557a = toolbar;
        this.f3558b = toolbar.getTitle();
        this.f3568l = toolbar.getSubtitle();
        this.f3567k = this.f3558b != null;
        this.f3566j = toolbar.getNavigationIcon();
        C0968bn a = C0968bn.m5093a(toolbar.getContext(), (AttributeSet) null, C0639a.C0649j.ActionBar, C0639a.C0640a.actionBarStyle, 0);
        this.f3573q = a.mo4780a(C0639a.C0649j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.mo4786c(C0639a.C0649j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo4797b(c);
            }
            CharSequence c2 = a.mo4786c(C0639a.C0649j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                mo4799c(c2);
            }
            Drawable a2 = a.mo4780a(C0639a.C0649j.ActionBar_logo);
            if (a2 != null) {
                mo4796b(a2);
            }
            Drawable a3 = a.mo4780a(C0639a.C0649j.ActionBar_icon);
            if (a3 != null) {
                mo3969a(a3);
            }
            if (this.f3566j == null && (drawable = this.f3573q) != null) {
                mo4798c(drawable);
            }
            mo3979c(a.mo4778a(C0639a.C0649j.ActionBar_displayOptions, 0));
            int g = a.mo4793g(C0639a.C0649j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo4795a(LayoutInflater.from(this.f3557a.getContext()).inflate(g, this.f3557a, false));
                mo3979c(this.f3561e | 16);
            }
            int f = a.mo4791f(C0639a.C0649j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3557a.getLayoutParams();
                layoutParams.height = f;
                this.f3557a.setLayoutParams(layoutParams);
            }
            int d = a.mo4787d(C0639a.C0649j.ActionBar_contentInsetStart, -1);
            int d2 = a.mo4787d(C0639a.C0649j.ActionBar_contentInsetEnd, -1);
            if (d >= 0 || d2 >= 0) {
                this.f3557a.mo3771a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo4793g(C0639a.C0649j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f3557a;
                toolbar2.mo3772a(toolbar2.getContext(), g2);
            }
            int g3 = a.mo4793g(C0639a.C0649j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f3557a;
                toolbar3.mo3776b(toolbar3.getContext(), g3);
            }
            int g4 = a.mo4793g(C0639a.C0649j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f3557a.setPopupTheme(g4);
            }
        } else {
            this.f3561e = m5113r();
        }
        a.mo4781a();
        mo4801e(i);
        this.f3569m = this.f3557a.getNavigationContentDescription();
        this.f3557a.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: a */
            final C0741a f3574a = new C0741a(C0969bo.this.f3557a.getContext(), 0, 16908332, 0, 0, C0969bo.this.f3558b);

            public void onClick(View view) {
                if (C0969bo.this.f3559c != null && C0969bo.this.f3560d) {
                    C0969bo.this.f3559c.onMenuItemSelected(0, this.f3574a);
                }
            }
        });
    }

    /* renamed from: e */
    public void mo4801e(int i) {
        if (i != this.f3572p) {
            this.f3572p = i;
            if (TextUtils.isEmpty(this.f3557a.getNavigationContentDescription())) {
                mo4802f(this.f3572p);
            }
        }
    }

    /* renamed from: r */
    private int m5113r() {
        if (this.f3557a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3573q = this.f3557a.getNavigationIcon();
        return 15;
    }

    /* renamed from: a */
    public ViewGroup mo3967a() {
        return this.f3557a;
    }

    /* renamed from: b */
    public Context mo3976b() {
        return this.f3557a.getContext();
    }

    /* renamed from: c */
    public boolean mo3980c() {
        return this.f3557a.mo3783g();
    }

    /* renamed from: d */
    public void mo3981d() {
        this.f3557a.mo3813h();
    }

    /* renamed from: a */
    public void mo3973a(Window.Callback callback) {
        this.f3559c = callback;
    }

    /* renamed from: a */
    public void mo3974a(CharSequence charSequence) {
        if (!this.f3567k) {
            m5112e(charSequence);
        }
    }

    /* renamed from: e */
    public CharSequence mo3983e() {
        return this.f3557a.getTitle();
    }

    /* renamed from: b */
    public void mo4797b(CharSequence charSequence) {
        this.f3567k = true;
        m5112e(charSequence);
    }

    /* renamed from: e */
    private void m5112e(CharSequence charSequence) {
        this.f3558b = charSequence;
        if ((this.f3561e & 8) != 0) {
            this.f3557a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void mo4799c(CharSequence charSequence) {
        this.f3568l = charSequence;
        if ((this.f3561e & 8) != 0) {
            this.f3557a.setSubtitle(charSequence);
        }
    }

    /* renamed from: f */
    public void mo3984f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo3985g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: a */
    public void mo3968a(int i) {
        mo3969a(i != 0 ? C0705a.m3168b(mo3976b(), i) : null);
    }

    /* renamed from: a */
    public void mo3969a(Drawable drawable) {
        this.f3564h = drawable;
        m5114s();
    }

    /* renamed from: b */
    public void mo3977b(int i) {
        mo4796b(i != 0 ? C0705a.m3168b(mo3976b(), i) : null);
    }

    /* renamed from: b */
    public void mo4796b(Drawable drawable) {
        this.f3565i = drawable;
        m5114s();
    }

    /* renamed from: s */
    private void m5114s() {
        Drawable drawable;
        int i = this.f3561e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3565i;
            if (drawable == null) {
                drawable = this.f3564h;
            }
        } else {
            drawable = this.f3564h;
        }
        this.f3557a.setLogo(drawable);
    }

    /* renamed from: h */
    public boolean mo3986h() {
        return this.f3557a.mo3775a();
    }

    /* renamed from: i */
    public boolean mo3987i() {
        return this.f3557a.mo3777b();
    }

    /* renamed from: j */
    public boolean mo3988j() {
        return this.f3557a.mo3778c();
    }

    /* renamed from: k */
    public boolean mo3989k() {
        return this.f3557a.mo3780d();
    }

    /* renamed from: l */
    public boolean mo3990l() {
        return this.f3557a.mo3781e();
    }

    /* renamed from: m */
    public void mo3991m() {
        this.f3560d = true;
    }

    /* renamed from: a */
    public void mo3972a(Menu menu, C0770o.C0771a aVar) {
        if (this.f3570n == null) {
            this.f3570n = new C0986c(this.f3557a.getContext());
            this.f3570n.mo2979a(C0639a.C0645f.action_menu_presenter);
        }
        this.f3570n.mo2983a(aVar);
        this.f3557a.mo3773a((C0754h) menu, this.f3570n);
    }

    /* renamed from: n */
    public void mo3992n() {
        this.f3557a.mo3782f();
    }

    /* renamed from: o */
    public int mo3993o() {
        return this.f3561e;
    }

    /* renamed from: c */
    public void mo3979c(int i) {
        View view;
        int i2 = this.f3561e ^ i;
        this.f3561e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5116u();
                }
                m5115t();
            }
            if ((i2 & 3) != 0) {
                m5114s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3557a.setTitle(this.f3558b);
                    this.f3557a.setSubtitle(this.f3568l);
                } else {
                    this.f3557a.setTitle((CharSequence) null);
                    this.f3557a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f3563g) != null) {
                if ((i & 16) != 0) {
                    this.f3557a.addView(view);
                } else {
                    this.f3557a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3971a(C0955bf bfVar) {
        Toolbar toolbar;
        View view = this.f3562f;
        if (view != null && view.getParent() == (toolbar = this.f3557a)) {
            toolbar.removeView(this.f3562f);
        }
        this.f3562f = bfVar;
        if (bfVar != null && this.f3571o == 2) {
            this.f3557a.addView(this.f3562f, 0);
            Toolbar.C0835b bVar = (Toolbar.C0835b) this.f3562f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f2099a = 8388691;
            bfVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo3975a(boolean z) {
        this.f3557a.setCollapsible(z);
    }

    /* renamed from: p */
    public int mo3994p() {
        return this.f3571o;
    }

    /* renamed from: a */
    public void mo4795a(View view) {
        View view2 = this.f3563g;
        if (!(view2 == null || (this.f3561e & 16) == 0)) {
            this.f3557a.removeView(view2);
        }
        this.f3563g = view;
        if (view != null && (this.f3561e & 16) != 0) {
            this.f3557a.addView(this.f3563g);
        }
    }

    /* renamed from: a */
    public C0601v mo3966a(final int i, long j) {
        return C0594r.m2610k(this.f3557a).mo2296a(i == 0 ? 1.0f : 0.0f).mo2297a(j).mo2298a((C0605w) new C0606x() {

            /* renamed from: c */
            private boolean f3578c = false;

            /* renamed from: a */
            public void mo2309a(View view) {
                C0969bo.this.f3557a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo2310b(View view) {
                if (!this.f3578c) {
                    C0969bo.this.f3557a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo2311c(View view) {
                this.f3578c = true;
            }
        });
    }

    /* renamed from: c */
    public void mo4798c(Drawable drawable) {
        this.f3566j = drawable;
        m5115t();
    }

    /* renamed from: t */
    private void m5115t() {
        if ((this.f3561e & 4) != 0) {
            Toolbar toolbar = this.f3557a;
            Drawable drawable = this.f3566j;
            if (drawable == null) {
                drawable = this.f3573q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f3557a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: d */
    public void mo4800d(CharSequence charSequence) {
        this.f3569m = charSequence;
        m5116u();
    }

    /* renamed from: f */
    public void mo4802f(int i) {
        mo4800d((CharSequence) i == 0 ? null : mo3976b().getString(i));
    }

    /* renamed from: u */
    private void m5116u() {
        if ((this.f3561e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3569m)) {
            this.f3557a.setNavigationContentDescription(this.f3572p);
        } else {
            this.f3557a.setNavigationContentDescription(this.f3569m);
        }
    }

    /* renamed from: d */
    public void mo3982d(int i) {
        this.f3557a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo3970a(C0770o.C0771a aVar, C0754h.C0755a aVar2) {
        this.f3557a.mo3774a(aVar, aVar2);
    }

    /* renamed from: q */
    public Menu mo3995q() {
        return this.f3557a.getMenu();
    }
}
