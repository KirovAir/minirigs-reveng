package android.support.p039v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.p036h.C0605w;
import android.support.p026v4.p036h.C0606x;
import android.support.p026v4.p036h.C0607y;
import android.support.p039v7.app.C0664a;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0725a;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.view.C0733g;
import android.support.p039v7.view.C0736h;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.widget.ActionBarContainer;
import android.support.p039v7.widget.ActionBarContextView;
import android.support.p039v7.widget.ActionBarOverlayLayout;
import android.support.p039v7.widget.C0855aj;
import android.support.p039v7.widget.C0955bf;
import android.support.p039v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.l */
public class C0700l extends C0664a implements ActionBarOverlayLayout.C0786a {

    /* renamed from: s */
    static final /* synthetic */ boolean f2227s = (!C0700l.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f2228t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f2229u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f2230A;

    /* renamed from: B */
    private boolean f2231B;

    /* renamed from: C */
    private ArrayList<C0664a.C0666b> f2232C = new ArrayList<>();

    /* renamed from: D */
    private boolean f2233D;

    /* renamed from: E */
    private int f2234E = 0;

    /* renamed from: F */
    private boolean f2235F;

    /* renamed from: G */
    private boolean f2236G = true;

    /* renamed from: H */
    private boolean f2237H;

    /* renamed from: a */
    Context f2238a;

    /* renamed from: b */
    ActionBarOverlayLayout f2239b;

    /* renamed from: c */
    ActionBarContainer f2240c;

    /* renamed from: d */
    C0855aj f2241d;

    /* renamed from: e */
    ActionBarContextView f2242e;

    /* renamed from: f */
    View f2243f;

    /* renamed from: g */
    C0955bf f2244g;

    /* renamed from: h */
    C0704a f2245h;

    /* renamed from: i */
    C0726b f2246i;

    /* renamed from: j */
    C0726b.C0727a f2247j;

    /* renamed from: k */
    boolean f2248k = true;

    /* renamed from: l */
    boolean f2249l;

    /* renamed from: m */
    boolean f2250m;

    /* renamed from: n */
    C0736h f2251n;

    /* renamed from: o */
    boolean f2252o;

    /* renamed from: p */
    final C0605w f2253p = new C0606x() {
        /* renamed from: b */
        public void mo2310b(View view) {
            if (C0700l.this.f2248k && C0700l.this.f2243f != null) {
                C0700l.this.f2243f.setTranslationY(0.0f);
                C0700l.this.f2240c.setTranslationY(0.0f);
            }
            C0700l.this.f2240c.setVisibility(8);
            C0700l.this.f2240c.setTransitioning(false);
            C0700l lVar = C0700l.this;
            lVar.f2251n = null;
            lVar.mo2686h();
            if (C0700l.this.f2239b != null) {
                C0594r.m2614o(C0700l.this.f2239b);
            }
        }
    };

    /* renamed from: q */
    final C0605w f2254q = new C0606x() {
        /* renamed from: b */
        public void mo2310b(View view) {
            C0700l lVar = C0700l.this;
            lVar.f2251n = null;
            lVar.f2240c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0607y f2255r = new C0607y() {
        /* renamed from: a */
        public void mo2312a(View view) {
            ((View) C0700l.this.f2240c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f2256v;

    /* renamed from: w */
    private Activity f2257w;

    /* renamed from: x */
    private Dialog f2258x;

    /* renamed from: y */
    private ArrayList<Object> f2259y = new ArrayList<>();

    /* renamed from: z */
    private int f2260z = -1;

    /* renamed from: a */
    static boolean m3112a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: m */
    public void mo2694m() {
    }

    public C0700l(Activity activity, boolean z) {
        this.f2257w = activity;
        View decorView = activity.getWindow().getDecorView();
        m3111a(decorView);
        if (!z) {
            this.f2243f = decorView.findViewById(16908290);
        }
    }

    public C0700l(Dialog dialog) {
        this.f2258x = dialog;
        m3111a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m3111a(View view) {
        this.f2239b = (ActionBarOverlayLayout) view.findViewById(C0639a.C0645f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2239b;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2241d = m3113b(view.findViewById(C0639a.C0645f.action_bar));
        this.f2242e = (ActionBarContextView) view.findViewById(C0639a.C0645f.action_context_bar);
        this.f2240c = (ActionBarContainer) view.findViewById(C0639a.C0645f.action_bar_container);
        C0855aj ajVar = this.f2241d;
        if (ajVar == null || this.f2242e == null || this.f2240c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f2238a = ajVar.mo3976b();
        boolean z = (this.f2241d.mo3993o() & 4) != 0;
        if (z) {
            this.f2230A = true;
        }
        C0725a a = C0725a.m3257a(this.f2238a);
        mo2524a(a.mo2839f() || z);
        m3114k(a.mo2837d());
        TypedArray obtainStyledAttributes = this.f2238a.obtainStyledAttributes((AttributeSet) null, C0639a.C0649j.ActionBar, C0639a.C0640a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0639a.C0649j.ActionBar_hideOnContentScroll, false)) {
            mo2528b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0639a.C0649j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2521a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private C0855aj m3113b(View view) {
        if (view instanceof C0855aj) {
            return (C0855aj) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo2521a(float f) {
        C0594r.m2577a((View) this.f2240c, f);
    }

    /* renamed from: a */
    public void mo2522a(Configuration configuration) {
        m3114k(C0725a.m3257a(this.f2238a).mo2837d());
    }

    /* renamed from: k */
    private void m3114k(boolean z) {
        this.f2233D = z;
        if (!this.f2233D) {
            this.f2241d.mo3971a((C0955bf) null);
            this.f2240c.setTabContainer(this.f2244g);
        } else {
            this.f2240c.setTabContainer((C0955bf) null);
            this.f2241d.mo3971a(this.f2244g);
        }
        boolean z2 = true;
        boolean z3 = mo2688i() == 2;
        C0955bf bfVar = this.f2244g;
        if (bfVar != null) {
            if (z3) {
                bfVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2239b;
                if (actionBarOverlayLayout != null) {
                    C0594r.m2614o(actionBarOverlayLayout);
                }
            } else {
                bfVar.setVisibility(8);
            }
        }
        this.f2241d.mo3975a(!this.f2233D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2239b;
        if (this.f2233D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2686h() {
        C0726b.C0727a aVar = this.f2247j;
        if (aVar != null) {
            aVar.mo2641a(this.f2246i);
            this.f2246i = null;
            this.f2247j = null;
        }
    }

    /* renamed from: a */
    public void mo2682a(int i) {
        this.f2234E = i;
    }

    /* renamed from: d */
    public void mo2531d(boolean z) {
        C0736h hVar;
        this.f2237H = z;
        if (!z && (hVar = this.f2251n) != null) {
            hVar.mo2888c();
        }
    }

    /* renamed from: e */
    public void mo2533e(boolean z) {
        if (z != this.f2231B) {
            this.f2231B = z;
            int size = this.f2232C.size();
            for (int i = 0; i < size; i++) {
                this.f2232C.get(i).mo2537a(z);
            }
        }
    }

    /* renamed from: f */
    public void mo2684f(boolean z) {
        mo2683a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public void mo2524a(boolean z) {
        this.f2241d.mo3978b(z);
    }

    /* renamed from: a */
    public void mo2523a(CharSequence charSequence) {
        this.f2241d.mo3974a(charSequence);
    }

    /* renamed from: a */
    public void mo2683a(int i, int i2) {
        int o = this.f2241d.mo3993o();
        if ((i2 & 4) != 0) {
            this.f2230A = true;
        }
        this.f2241d.mo3979c((i & i2) | ((~i2) & o));
    }

    /* renamed from: i */
    public int mo2688i() {
        return this.f2241d.mo3994p();
    }

    /* renamed from: a */
    public int mo2519a() {
        return this.f2241d.mo3993o();
    }

    /* renamed from: a */
    public C0726b mo2520a(C0726b.C0727a aVar) {
        C0704a aVar2 = this.f2245h;
        if (aVar2 != null) {
            aVar2.mo2703c();
        }
        this.f2239b.setHideOnContentScrollEnabled(false);
        this.f2242e.mo3325c();
        C0704a aVar3 = new C0704a(this.f2242e.getContext(), aVar);
        if (!aVar3.mo2705e()) {
            return null;
        }
        this.f2245h = aVar3;
        aVar3.mo2704d();
        this.f2242e.mo3322a(aVar3);
        mo2691j(true);
        this.f2242e.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: g */
    public void mo2685g(boolean z) {
        this.f2248k = z;
    }

    /* renamed from: n */
    private void m3116n() {
        if (!this.f2235F) {
            this.f2235F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2239b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m3115l(false);
        }
    }

    /* renamed from: j */
    public void mo2690j() {
        if (this.f2250m) {
            this.f2250m = false;
            m3115l(true);
        }
    }

    /* renamed from: o */
    private void m3117o() {
        if (this.f2235F) {
            this.f2235F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2239b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m3115l(false);
        }
    }

    /* renamed from: k */
    public void mo2692k() {
        if (!this.f2250m) {
            this.f2250m = true;
            m3115l(true);
        }
    }

    /* renamed from: b */
    public void mo2528b(boolean z) {
        if (!z || this.f2239b.mo3350a()) {
            this.f2252o = z;
            this.f2239b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: l */
    private void m3115l(boolean z) {
        if (m3112a(this.f2249l, this.f2250m, this.f2235F)) {
            if (!this.f2236G) {
                this.f2236G = true;
                mo2687h(z);
            }
        } else if (this.f2236G) {
            this.f2236G = false;
            mo2689i(z);
        }
    }

    /* renamed from: h */
    public void mo2687h(boolean z) {
        View view;
        View view2;
        C0736h hVar = this.f2251n;
        if (hVar != null) {
            hVar.mo2888c();
        }
        this.f2240c.setVisibility(0);
        if (this.f2234E != 0 || (!this.f2237H && !z)) {
            this.f2240c.setAlpha(1.0f);
            this.f2240c.setTranslationY(0.0f);
            if (this.f2248k && (view = this.f2243f) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2254q.mo2310b((View) null);
        } else {
            this.f2240c.setTranslationY(0.0f);
            float f = (float) (-this.f2240c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f2240c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f2240c.setTranslationY(f);
            C0736h hVar2 = new C0736h();
            C0601v b = C0594r.m2610k(this.f2240c).mo2301b(0.0f);
            b.mo2299a(this.f2255r);
            hVar2.mo2882a(b);
            if (this.f2248k && (view2 = this.f2243f) != null) {
                view2.setTranslationY(f);
                hVar2.mo2882a(C0594r.m2610k(this.f2243f).mo2301b(0.0f));
            }
            hVar2.mo2885a(f2229u);
            hVar2.mo2881a(250);
            hVar2.mo2884a(this.f2254q);
            this.f2251n = hVar2;
            hVar2.mo2886a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2239b;
        if (actionBarOverlayLayout != null) {
            C0594r.m2614o(actionBarOverlayLayout);
        }
    }

    /* renamed from: i */
    public void mo2689i(boolean z) {
        View view;
        C0736h hVar = this.f2251n;
        if (hVar != null) {
            hVar.mo2888c();
        }
        if (this.f2234E != 0 || (!this.f2237H && !z)) {
            this.f2253p.mo2310b((View) null);
            return;
        }
        this.f2240c.setAlpha(1.0f);
        this.f2240c.setTransitioning(true);
        C0736h hVar2 = new C0736h();
        float f = (float) (-this.f2240c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f2240c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0601v b = C0594r.m2610k(this.f2240c).mo2301b(f);
        b.mo2299a(this.f2255r);
        hVar2.mo2882a(b);
        if (this.f2248k && (view = this.f2243f) != null) {
            hVar2.mo2882a(C0594r.m2610k(view).mo2301b(f));
        }
        hVar2.mo2885a(f2228t);
        hVar2.mo2881a(250);
        hVar2.mo2884a(this.f2253p);
        this.f2251n = hVar2;
        hVar2.mo2886a();
    }

    /* renamed from: j */
    public void mo2691j(boolean z) {
        C0601v vVar;
        C0601v vVar2;
        if (z) {
            m3116n();
        } else {
            m3117o();
        }
        if (m3118p()) {
            if (z) {
                vVar = this.f2241d.mo3966a(4, 100);
                vVar2 = this.f2242e.mo3321a(0, 200);
            } else {
                vVar2 = this.f2241d.mo3966a(0, 200);
                vVar = this.f2242e.mo3321a(8, 100);
            }
            C0736h hVar = new C0736h();
            hVar.mo2883a(vVar, vVar2);
            hVar.mo2886a();
        } else if (z) {
            this.f2241d.mo3982d(4);
            this.f2242e.setVisibility(0);
        } else {
            this.f2241d.mo3982d(0);
            this.f2242e.setVisibility(8);
        }
    }

    /* renamed from: p */
    private boolean m3118p() {
        return C0594r.m2622w(this.f2240c);
    }

    /* renamed from: b */
    public Context mo2527b() {
        if (this.f2256v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2238a.getTheme().resolveAttribute(C0639a.C0640a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2256v = new ContextThemeWrapper(this.f2238a, i);
            } else {
                this.f2256v = this.f2238a;
            }
        }
        return this.f2256v;
    }

    /* renamed from: l */
    public void mo2693l() {
        C0736h hVar = this.f2251n;
        if (hVar != null) {
            hVar.mo2888c();
            this.f2251n = null;
        }
    }

    /* renamed from: f */
    public boolean mo2535f() {
        C0855aj ajVar = this.f2241d;
        if (ajVar == null || !ajVar.mo3980c()) {
            return false;
        }
        this.f2241d.mo3981d();
        return true;
    }

    /* renamed from: android.support.v7.app.l$a */
    public class C0704a extends C0726b implements C0754h.C0755a {

        /* renamed from: b */
        private final Context f2265b;

        /* renamed from: c */
        private final C0754h f2266c;

        /* renamed from: d */
        private C0726b.C0727a f2267d;

        /* renamed from: e */
        private WeakReference<View> f2268e;

        public C0704a(Context context, C0726b.C0727a aVar) {
            this.f2265b = context;
            this.f2267d = aVar;
            this.f2266c = new C0754h(context).mo3040a(1);
            this.f2266c.mo3048a((C0754h.C0755a) this);
        }

        /* renamed from: a */
        public MenuInflater mo2695a() {
            return new C0733g(this.f2265b);
        }

        /* renamed from: b */
        public Menu mo2700b() {
            return this.f2266c;
        }

        /* renamed from: c */
        public void mo2703c() {
            if (C0700l.this.f2245h == this) {
                if (!C0700l.m3112a(C0700l.this.f2249l, C0700l.this.f2250m, false)) {
                    C0700l lVar = C0700l.this;
                    lVar.f2246i = this;
                    lVar.f2247j = this.f2267d;
                } else {
                    this.f2267d.mo2641a(this);
                }
                this.f2267d = null;
                C0700l.this.mo2691j(false);
                C0700l.this.f2242e.mo3324b();
                C0700l.this.f2241d.mo3967a().sendAccessibilityEvent(32);
                C0700l.this.f2239b.setHideOnContentScrollEnabled(C0700l.this.f2252o);
                C0700l.this.f2245h = null;
            }
        }

        /* renamed from: d */
        public void mo2704d() {
            if (C0700l.this.f2245h == this) {
                this.f2266c.mo3089h();
                try {
                    this.f2267d.mo2644b(this, this.f2266c);
                } finally {
                    this.f2266c.mo3091i();
                }
            }
        }

        /* renamed from: e */
        public boolean mo2705e() {
            this.f2266c.mo3089h();
            try {
                return this.f2267d.mo2642a((C0726b) this, (Menu) this.f2266c);
            } finally {
                this.f2266c.mo3091i();
            }
        }

        /* renamed from: a */
        public void mo2697a(View view) {
            C0700l.this.f2242e.setCustomView(view);
            this.f2268e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo2698a(CharSequence charSequence) {
            C0700l.this.f2242e.setSubtitle(charSequence);
        }

        /* renamed from: b */
        public void mo2702b(CharSequence charSequence) {
            C0700l.this.f2242e.setTitle(charSequence);
        }

        /* renamed from: a */
        public void mo2696a(int i) {
            mo2702b((CharSequence) C0700l.this.f2238a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo2701b(int i) {
            mo2698a((CharSequence) C0700l.this.f2238a.getResources().getString(i));
        }

        /* renamed from: f */
        public CharSequence mo2706f() {
            return C0700l.this.f2242e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo2707g() {
            return C0700l.this.f2242e.getSubtitle();
        }

        /* renamed from: a */
        public void mo2699a(boolean z) {
            super.mo2699a(z);
            C0700l.this.f2242e.setTitleOptional(z);
        }

        /* renamed from: h */
        public boolean mo2708h() {
            return C0700l.this.f2242e.mo3326d();
        }

        /* renamed from: i */
        public View mo2709i() {
            WeakReference<View> weakReference = this.f2268e;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo2610a(C0754h hVar, MenuItem menuItem) {
            C0726b.C0727a aVar = this.f2267d;
            if (aVar != null) {
                return aVar.mo2643a((C0726b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo2607a(C0754h hVar) {
            if (this.f2267d != null) {
                mo2704d();
                C0700l.this.f2242e.mo3323a();
            }
        }
    }

    /* renamed from: c */
    public void mo2529c(boolean z) {
        if (!this.f2230A) {
            mo2684f(z);
        }
    }

    /* renamed from: a */
    public boolean mo2525a(int i, KeyEvent keyEvent) {
        Menu b;
        C0704a aVar = this.f2245h;
        if (aVar == null || (b = aVar.mo2700b()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }
}
