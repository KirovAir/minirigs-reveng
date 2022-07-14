package android.support.p039v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p026v4.app.C0481u;
import android.support.p026v4.p036h.C0580e;
import android.support.p026v4.p036h.C0582f;
import android.support.p026v4.p036h.C0592p;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.p036h.C0605w;
import android.support.p026v4.p036h.C0606x;
import android.support.p026v4.p036h.C0608z;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.view.C0729d;
import android.support.p039v7.view.C0731f;
import android.support.p039v7.view.C0733g;
import android.support.p039v7.view.C0738i;
import android.support.p039v7.view.menu.C0751f;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.ActionBarContextView;
import android.support.p039v7.widget.C0854ai;
import android.support.p039v7.widget.C0876ao;
import android.support.p039v7.widget.C0968bn;
import android.support.p039v7.widget.C0977bs;
import android.support.p039v7.widget.C0984bv;
import android.support.p039v7.widget.C1009l;
import android.support.p039v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.f */
class C0673f extends C0672e implements C0754h.C0755a, LayoutInflater.Factory2 {

    /* renamed from: u */
    private static final boolean f2107u = (Build.VERSION.SDK_INT < 21);

    /* renamed from: v */
    private static final int[] f2108v = {16842836};

    /* renamed from: w */
    private static boolean f2109w = true;

    /* renamed from: A */
    private C0690g f2110A;

    /* renamed from: B */
    private boolean f2111B = true;

    /* renamed from: C */
    private boolean f2112C;

    /* renamed from: D */
    private ViewGroup f2113D;

    /* renamed from: E */
    private TextView f2114E;

    /* renamed from: F */
    private View f2115F;

    /* renamed from: G */
    private boolean f2116G;

    /* renamed from: H */
    private boolean f2117H;

    /* renamed from: I */
    private boolean f2118I;

    /* renamed from: J */
    private C0689f[] f2119J;

    /* renamed from: K */
    private C0689f f2120K;

    /* renamed from: L */
    private boolean f2121L;

    /* renamed from: M */
    private int f2122M = -100;

    /* renamed from: N */
    private boolean f2123N;

    /* renamed from: O */
    private C0686d f2124O;

    /* renamed from: P */
    private final Runnable f2125P = new Runnable() {
        public void run() {
            if ((C0673f.this.f2149t & 1) != 0) {
                C0673f.this.mo2619g(0);
            }
            if ((C0673f.this.f2149t & 4096) != 0) {
                C0673f.this.mo2619g(108);
            }
            C0673f fVar = C0673f.this;
            fVar.f2148s = false;
            fVar.f2149t = 0;
        }
    };

    /* renamed from: Q */
    private boolean f2126Q;

    /* renamed from: R */
    private Rect f2127R;

    /* renamed from: S */
    private Rect f2128S;

    /* renamed from: T */
    private AppCompatViewInflater f2129T;

    /* renamed from: a */
    final Context f2130a;

    /* renamed from: b */
    final Window f2131b;

    /* renamed from: c */
    final Window.Callback f2132c;

    /* renamed from: d */
    final Window.Callback f2133d;

    /* renamed from: e */
    final C0671d f2134e;

    /* renamed from: f */
    C0664a f2135f;

    /* renamed from: g */
    MenuInflater f2136g;

    /* renamed from: h */
    C0726b f2137h;

    /* renamed from: i */
    ActionBarContextView f2138i;

    /* renamed from: j */
    PopupWindow f2139j;

    /* renamed from: k */
    Runnable f2140k;

    /* renamed from: l */
    C0601v f2141l = null;

    /* renamed from: m */
    boolean f2142m;

    /* renamed from: n */
    boolean f2143n;

    /* renamed from: o */
    boolean f2144o;

    /* renamed from: p */
    boolean f2145p;

    /* renamed from: q */
    boolean f2146q;

    /* renamed from: r */
    boolean f2147r;

    /* renamed from: s */
    boolean f2148s;

    /* renamed from: t */
    int f2149t;

    /* renamed from: x */
    private CharSequence f2150x;

    /* renamed from: y */
    private C0854ai f2151y;

    /* renamed from: z */
    private C0682a f2152z;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2608a(ViewGroup viewGroup) {
    }

    static {
        if (f2107u && !f2109w) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (m3041a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                /* renamed from: a */
                private boolean m3041a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    if (message.contains("drawable") || message.contains("Drawable")) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    C0673f(Context context, Window window, C0671d dVar) {
        this.f2130a = context;
        this.f2131b = window;
        this.f2134e = dVar;
        this.f2132c = this.f2131b.getCallback();
        Window.Callback callback = this.f2132c;
        if (!(callback instanceof C0685c)) {
            this.f2133d = new C0685c(callback);
            this.f2131b.setCallback(this.f2133d);
            C0968bn a = C0968bn.m5092a(context, (AttributeSet) null, f2108v);
            Drawable b = a.mo4784b(0);
            if (b != null) {
                this.f2131b.setBackgroundDrawable(b);
            }
            a.mo4781a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    public void mo2584a(Bundle bundle) {
        Window.Callback callback = this.f2132c;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0481u.m2160b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0664a k = mo2622k();
                if (k == null) {
                    this.f2126Q = true;
                } else {
                    k.mo2529c(true);
                }
            }
        }
        if (bundle != null && this.f2122M == -100) {
            this.f2122M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: b */
    public void mo2590b(Bundle bundle) {
        m2985u();
    }

    /* renamed from: a */
    public C0664a mo2581a() {
        m2984t();
        return this.f2135f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C0664a mo2622k() {
        return this.f2135f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Window.Callback mo2623l() {
        return this.f2131b.getCallback();
    }

    /* renamed from: t */
    private void m2984t() {
        m2985u();
        if (this.f2142m && this.f2135f == null) {
            Window.Callback callback = this.f2132c;
            if (callback instanceof Activity) {
                this.f2135f = new C0700l((Activity) callback, this.f2143n);
            } else if (callback instanceof Dialog) {
                this.f2135f = new C0700l((Dialog) callback);
            }
            C0664a aVar = this.f2135f;
            if (aVar != null) {
                aVar.mo2529c(this.f2126Q);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Context mo2624m() {
        C0664a a = mo2581a();
        Context b = a != null ? a.mo2527b() : null;
        return b == null ? this.f2130a : b;
    }

    /* renamed from: b */
    public MenuInflater mo2588b() {
        if (this.f2136g == null) {
            m2984t();
            C0664a aVar = this.f2135f;
            this.f2136g = new C0733g(aVar != null ? aVar.mo2527b() : this.f2130a);
        }
        return this.f2136g;
    }

    /* renamed from: a */
    public <T extends View> T mo2582a(int i) {
        m2985u();
        return this.f2131b.findViewById(i);
    }

    /* renamed from: a */
    public void mo2583a(Configuration configuration) {
        C0664a a;
        if (this.f2142m && this.f2112C && (a = mo2581a()) != null) {
            a.mo2522a(configuration);
        }
        C1009l.m5329a().mo4942a(this.f2130a);
        mo2600i();
    }

    /* renamed from: c */
    public void mo2592c() {
        mo2600i();
    }

    /* renamed from: d */
    public void mo2595d() {
        C0664a a = mo2581a();
        if (a != null) {
            a.mo2531d(false);
        }
        C0686d dVar = this.f2124O;
        if (dVar != null) {
            dVar.mo2659d();
        }
    }

    /* renamed from: e */
    public void mo2596e() {
        C0664a a = mo2581a();
        if (a != null) {
            a.mo2531d(true);
        }
    }

    /* renamed from: a */
    public void mo2585a(View view) {
        m2985u();
        ViewGroup viewGroup = (ViewGroup) this.f2113D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2132c.onContentChanged();
    }

    /* renamed from: b */
    public void mo2589b(int i) {
        m2985u();
        ViewGroup viewGroup = (ViewGroup) this.f2113D.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2130a).inflate(i, viewGroup);
        this.f2132c.onContentChanged();
    }

    /* renamed from: a */
    public void mo2586a(View view, ViewGroup.LayoutParams layoutParams) {
        m2985u();
        ViewGroup viewGroup = (ViewGroup) this.f2113D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2132c.onContentChanged();
    }

    /* renamed from: b */
    public void mo2591b(View view, ViewGroup.LayoutParams layoutParams) {
        m2985u();
        ((ViewGroup) this.f2113D.findViewById(16908290)).addView(view, layoutParams);
        this.f2132c.onContentChanged();
    }

    /* renamed from: c */
    public void mo2593c(Bundle bundle) {
        int i = this.f2122M;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: g */
    public void mo2598g() {
        if (this.f2148s) {
            this.f2131b.getDecorView().removeCallbacks(this.f2125P);
        }
        this.f2147r = true;
        C0664a aVar = this.f2135f;
        if (aVar != null) {
            aVar.mo2536g();
        }
        C0686d dVar = this.f2124O;
        if (dVar != null) {
            dVar.mo2659d();
        }
    }

    /* renamed from: u */
    private void m2985u() {
        if (!this.f2112C) {
            this.f2113D = m2986v();
            CharSequence n = mo2625n();
            if (!TextUtils.isEmpty(n)) {
                C0854ai aiVar = this.f2151y;
                if (aiVar != null) {
                    aiVar.setWindowTitle(n);
                } else if (mo2622k() != null) {
                    mo2622k().mo2523a(n);
                } else {
                    TextView textView = this.f2114E;
                    if (textView != null) {
                        textView.setText(n);
                    }
                }
            }
            m2987w();
            mo2608a(this.f2113D);
            this.f2112C = true;
            C0689f a = mo2601a(0, false);
            if (this.f2147r) {
                return;
            }
            if (a == null || a.f2182j == null) {
                m2981j(108);
            }
        }
    }

    /* renamed from: v */
    private ViewGroup m2986v() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f2130a.obtainStyledAttributes(C0639a.C0649j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0639a.C0649j.AppCompatTheme_windowNoTitle, false)) {
                mo2594c(1);
            } else if (obtainStyledAttributes.getBoolean(C0639a.C0649j.AppCompatTheme_windowActionBar, false)) {
                mo2594c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0639a.C0649j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo2594c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0639a.C0649j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo2594c(10);
            }
            this.f2145p = obtainStyledAttributes.getBoolean(C0639a.C0649j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f2131b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f2130a);
            if (this.f2146q) {
                if (this.f2144o) {
                    viewGroup = (ViewGroup) from.inflate(C0639a.C0646g.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C0639a.C0646g.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    C0594r.m2586a((View) viewGroup, (C0592p) new C0592p() {
                        /* renamed from: a */
                        public C0608z mo1109a(View view, C0608z zVar) {
                            int b = zVar.mo2315b();
                            int h = C0673f.this.mo2620h(b);
                            if (b != h) {
                                zVar = zVar.mo2314a(zVar.mo2313a(), h, zVar.mo2316c(), zVar.mo2317d());
                            }
                            return C0594r.m2576a(view, zVar);
                        }
                    });
                } else {
                    ((C0876ao) viewGroup).setOnFitSystemWindowsListener(new C0876ao.C0877a() {
                        /* renamed from: a */
                        public void mo2635a(Rect rect) {
                            rect.top = C0673f.this.mo2620h(rect.top);
                        }
                    });
                }
            } else if (this.f2145p) {
                viewGroup = (ViewGroup) from.inflate(C0639a.C0646g.abc_dialog_title_material, (ViewGroup) null);
                this.f2143n = false;
                this.f2142m = false;
            } else if (this.f2142m) {
                TypedValue typedValue = new TypedValue();
                this.f2130a.getTheme().resolveAttribute(C0639a.C0640a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0729d(this.f2130a, typedValue.resourceId);
                } else {
                    context = this.f2130a;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0639a.C0646g.abc_screen_toolbar, (ViewGroup) null);
                this.f2151y = (C0854ai) viewGroup.findViewById(C0639a.C0645f.decor_content_parent);
                this.f2151y.setWindowCallback(mo2623l());
                if (this.f2143n) {
                    this.f2151y.mo3348a(109);
                }
                if (this.f2116G) {
                    this.f2151y.mo3348a(2);
                }
                if (this.f2117H) {
                    this.f2151y.mo3348a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f2151y == null) {
                    this.f2114E = (TextView) viewGroup.findViewById(C0639a.C0645f.title);
                }
                C0984bv.m5213b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0639a.C0645f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f2131b.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f2131b.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.C0795a() {
                    /* renamed from: a */
                    public void mo2636a() {
                    }

                    /* renamed from: b */
                    public void mo2637b() {
                        C0673f.this.mo2632s();
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2142m + ", windowActionBarOverlay: " + this.f2143n + ", android:windowIsFloating: " + this.f2145p + ", windowActionModeOverlay: " + this.f2144o + ", windowNoTitle: " + this.f2146q + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: w */
    private void m2987w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2113D.findViewById(16908290);
        View decorView = this.f2131b.getDecorView();
        contentFrameLayout.mo3494a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2130a.obtainStyledAttributes(C0639a.C0649j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0639a.C0649j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: c */
    public boolean mo2594c(int i) {
        int k = m2982k(i);
        if (this.f2146q && k == 108) {
            return false;
        }
        if (this.f2142m && k == 1) {
            this.f2142m = false;
        }
        switch (k) {
            case 1:
                m2988x();
                this.f2146q = true;
                return true;
            case 2:
                m2988x();
                this.f2116G = true;
                return true;
            case 5:
                m2988x();
                this.f2117H = true;
                return true;
            case 10:
                m2988x();
                this.f2144o = true;
                return true;
            case 108:
                m2988x();
                this.f2142m = true;
                return true;
            case 109:
                m2988x();
                this.f2143n = true;
                return true;
            default:
                return this.f2131b.requestFeature(k);
        }
    }

    /* renamed from: a */
    public final void mo2587a(CharSequence charSequence) {
        this.f2150x = charSequence;
        C0854ai aiVar = this.f2151y;
        if (aiVar != null) {
            aiVar.setWindowTitle(charSequence);
        } else if (mo2622k() != null) {
            mo2622k().mo2523a(charSequence);
        } else {
            TextView textView = this.f2114E;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final CharSequence mo2625n() {
        Window.Callback callback = this.f2132c;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f2150x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2616d(int i) {
        if (i == 108) {
            C0664a a = mo2581a();
            if (a != null) {
                a.mo2533e(false);
            }
        } else if (i == 0) {
            C0689f a2 = mo2601a(i, true);
            if (a2.f2187o) {
                mo2606a(a2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2617e(int i) {
        C0664a a;
        if (i == 108 && (a = mo2581a()) != null) {
            a.mo2533e(true);
        }
    }

    /* renamed from: a */
    public boolean mo2610a(C0754h hVar, MenuItem menuItem) {
        C0689f a;
        Window.Callback l = mo2623l();
        if (l == null || this.f2147r || (a = mo2602a((Menu) hVar.mo3102q())) == null) {
            return false;
        }
        return l.onMenuItemSelected(a.f2173a, menuItem);
    }

    /* renamed from: a */
    public void mo2607a(C0754h hVar) {
        m2972a(hVar, true);
    }

    /* renamed from: a */
    public C0726b mo2603a(C0726b.C0727a aVar) {
        C0671d dVar;
        if (aVar != null) {
            C0726b bVar = this.f2137h;
            if (bVar != null) {
                bVar.mo2703c();
            }
            C0683b bVar2 = new C0683b(aVar);
            C0664a a = mo2581a();
            if (a != null) {
                this.f2137h = a.mo2520a((C0726b.C0727a) bVar2);
                C0726b bVar3 = this.f2137h;
                if (!(bVar3 == null || (dVar = this.f2134e) == null)) {
                    dVar.mo2556a(bVar3);
                }
            }
            if (this.f2137h == null) {
                this.f2137h = mo2612b((C0726b.C0727a) bVar2);
            }
            return this.f2137h;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: f */
    public void mo2597f() {
        C0664a a = mo2581a();
        if (a == null || !a.mo2534e()) {
            m2981j(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.p039v7.view.C0726b mo2612b(android.support.p039v7.view.C0726b.C0727a r8) {
        /*
            r7 = this;
            r7.mo2630q()
            android.support.v7.view.b r0 = r7.f2137h
            if (r0 == 0) goto L_0x000a
            r0.mo2703c()
        L_0x000a:
            boolean r0 = r8 instanceof android.support.p039v7.app.C0673f.C0683b
            if (r0 != 0) goto L_0x0014
            android.support.v7.app.f$b r0 = new android.support.v7.app.f$b
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            android.support.v7.app.d r0 = r7.f2134e
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f2147r
            if (r2 != 0) goto L_0x0022
            android.support.v7.view.b r0 = r0.mo2554a((android.support.p039v7.view.C0726b.C0727a) r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f2137h = r0
            goto L_0x0166
        L_0x0029:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2138i
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f2145p
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f2130a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = android.support.p039v7.p040a.C0639a.C0640a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f2130a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f2130a
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f2130a
        L_0x006a:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f2138i = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = android.support.p039v7.p040a.C0639a.C0640a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f2139j = r5
            android.widget.PopupWindow r5 = r7.f2139j
            r6 = 2
            android.support.p026v4.widget.C0628k.m2792a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f2139j
            android.support.v7.widget.ActionBarContextView r6 = r7.f2138i
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f2139j
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = android.support.p039v7.p040a.C0639a.C0640a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f2138i
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f2139j
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.f$6 r0 = new android.support.v7.app.f$6
            r0.<init>()
            r7.f2140k = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f2113D
            int r4 = android.support.p039v7.p040a.C0639a.C0645f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p039v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo2624m()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo3856a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p039v7.widget.ActionBarContextView) r0
            r7.f2138i = r0
        L_0x00d6:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2138i
            if (r0 == 0) goto L_0x0166
            r7.mo2630q()
            android.support.v7.widget.ActionBarContextView r0 = r7.f2138i
            r0.mo3325c()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f2138i
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f2138i
            android.widget.PopupWindow r6 = r7.f2139j
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo2700b()
            boolean r8 = r8.mo2642a((android.support.p039v7.view.C0726b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x0164
            r0.mo2704d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            r8.mo3322a(r0)
            r7.f2137h = r0
            boolean r8 = r7.mo2626o()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012e
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            android.support.v4.h.v r8 = android.support.p026v4.p036h.C0594r.m2610k(r8)
            android.support.v4.h.v r8 = r8.mo2296a((float) r0)
            r7.f2141l = r8
            android.support.v4.h.v r8 = r7.f2141l
            android.support.v7.app.f$7 r0 = new android.support.v7.app.f$7
            r0.<init>()
            r8.mo2298a((android.support.p026v4.p036h.C0605w) r0)
            goto L_0x0154
        L_0x012e:
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0154
            android.support.v7.widget.ActionBarContextView r8 = r7.f2138i
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p026v4.p036h.C0594r.m2614o(r8)
        L_0x0154:
            android.widget.PopupWindow r8 = r7.f2139j
            if (r8 == 0) goto L_0x0166
            android.view.Window r8 = r7.f2131b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f2140k
            r8.post(r0)
            goto L_0x0166
        L_0x0164:
            r7.f2137h = r1
        L_0x0166:
            android.support.v7.view.b r8 = r7.f2137h
            if (r8 == 0) goto L_0x0171
            android.support.v7.app.d r0 = r7.f2134e
            if (r0 == 0) goto L_0x0171
            r0.mo2556a((android.support.p039v7.view.C0726b) r8)
        L_0x0171:
            android.support.v7.view.b r8 = r7.f2137h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.app.C0673f.mo2612b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f2113D;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2626o() {
        /*
            r1 = this;
            boolean r0 = r1.f2112C
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f2113D
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p026v4.p036h.C0594r.m2622w(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.app.C0673f.mo2626o():boolean");
    }

    /* renamed from: p */
    public boolean mo2629p() {
        return this.f2111B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2630q() {
        C0601v vVar = this.f2141l;
        if (vVar != null) {
            vVar.mo2303b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo2631r() {
        C0726b bVar = this.f2137h;
        if (bVar != null) {
            bVar.mo2703c();
            return true;
        }
        C0664a a = mo2581a();
        if (a == null || !a.mo2535f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2609a(int i, KeyEvent keyEvent) {
        C0664a a = mo2581a();
        if (a != null && a.mo2525a(i, keyEvent)) {
            return true;
        }
        C0689f fVar = this.f2120K;
        if (fVar == null || !m2974a(fVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f2120K == null) {
                C0689f a2 = mo2601a(0, true);
                m2977b(a2, keyEvent);
                boolean a3 = m2974a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f2185m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        C0689f fVar2 = this.f2120K;
        if (fVar2 != null) {
            fVar2.f2186n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2611a(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f2132c;
        boolean z = true;
        if (((callback instanceof C0580e.C0581a) || (callback instanceof C0691g)) && (decorView = this.f2131b.getDecorView()) != null && C0580e.m2530a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2132c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo2615c(keyCode, keyEvent) : mo2614b(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2614b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2121L;
            this.f2121L = false;
            C0689f a = mo2601a(0, false);
            if (a != null && a.f2187o) {
                if (!z) {
                    mo2606a(a, true);
                }
                return true;
            } else if (mo2631r()) {
                return true;
            }
        } else if (i == 82) {
            m2980e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2615c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f2121L = z;
        } else if (i == 82) {
            m2979d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo2604a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f2129T == null) {
            String string = this.f2130a.obtainStyledAttributes(C0639a.C0649j.AppCompatTheme).getString(C0639a.C0649j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f2129T = new AppCompatViewInflater();
            } else {
                try {
                    this.f2129T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2129T = new AppCompatViewInflater();
                }
            }
        }
        if (f2107u) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m2975a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f2129T.createView(view, str, context, attributeSet, z, f2107u, true, C0977bs.m5172a());
    }

    /* renamed from: a */
    private boolean m2975a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2131b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0594r.m2625z((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: h */
    public void mo2599h() {
        LayoutInflater from = LayoutInflater.from(this.f2130a);
        if (from.getFactory() == null) {
            C0582f.m2532a(from, this);
        } else if (!(from.getFactory2() instanceof C0673f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo2604a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: a */
    private void m2971a(C0689f fVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!fVar.f2187o && !this.f2147r) {
            if (fVar.f2173a == 0) {
                if ((this.f2130a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback l = mo2623l();
            if (l == null || l.onMenuOpened(fVar.f2173a, fVar.f2182j)) {
                WindowManager windowManager = (WindowManager) this.f2130a.getSystemService("window");
                if (windowManager != null && m2977b(fVar, keyEvent)) {
                    if (fVar.f2179g == null || fVar.f2189q) {
                        if (fVar.f2179g == null) {
                            if (!m2973a(fVar) || fVar.f2179g == null) {
                                return;
                            }
                        } else if (fVar.f2189q && fVar.f2179g.getChildCount() > 0) {
                            fVar.f2179g.removeAllViews();
                        }
                        if (m2978c(fVar) && fVar.mo2667a()) {
                            ViewGroup.LayoutParams layoutParams2 = fVar.f2180h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            fVar.f2179g.setBackgroundResource(fVar.f2174b);
                            ViewParent parent = fVar.f2180h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(fVar.f2180h);
                            }
                            fVar.f2179g.addView(fVar.f2180h, layoutParams2);
                            if (!fVar.f2180h.hasFocus()) {
                                fVar.f2180h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (!(fVar.f2181i == null || (layoutParams = fVar.f2181i.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        fVar.f2186n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, fVar.f2176d, fVar.f2177e, 1002, 8519680, -3);
                        layoutParams3.gravity = fVar.f2175c;
                        layoutParams3.windowAnimations = fVar.f2178f;
                        windowManager.addView(fVar.f2179g, layoutParams3);
                        fVar.f2187o = true;
                        return;
                    }
                    i = -2;
                    fVar.f2186n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, fVar.f2176d, fVar.f2177e, 1002, 8519680, -3);
                    layoutParams32.gravity = fVar.f2175c;
                    layoutParams32.windowAnimations = fVar.f2178f;
                    windowManager.addView(fVar.f2179g, layoutParams32);
                    fVar.f2187o = true;
                    return;
                }
                return;
            }
            mo2606a(fVar, true);
        }
    }

    /* renamed from: a */
    private boolean m2973a(C0689f fVar) {
        fVar.mo2665a(mo2624m());
        fVar.f2179g = new C0688e(fVar.f2184l);
        fVar.f2175c = 81;
        return true;
    }

    /* renamed from: a */
    private void m2972a(C0754h hVar, boolean z) {
        C0854ai aiVar = this.f2151y;
        if (aiVar == null || !aiVar.mo3356e() || (ViewConfiguration.get(this.f2130a).hasPermanentMenuKey() && !this.f2151y.mo3359g())) {
            C0689f a = mo2601a(0, true);
            a.f2189q = true;
            mo2606a(a, false);
            m2971a(a, (KeyEvent) null);
            return;
        }
        Window.Callback l = mo2623l();
        if (this.f2151y.mo3357f() && z) {
            this.f2151y.mo3367i();
            if (!this.f2147r) {
                l.onPanelClosed(108, mo2601a(0, true).f2182j);
            }
        } else if (l != null && !this.f2147r) {
            if (this.f2148s && (this.f2149t & 1) != 0) {
                this.f2131b.getDecorView().removeCallbacks(this.f2125P);
                this.f2125P.run();
            }
            C0689f a2 = mo2601a(0, true);
            if (a2.f2182j != null && !a2.f2190r && l.onPreparePanel(0, a2.f2181i, a2.f2182j)) {
                l.onMenuOpened(108, a2.f2182j);
                this.f2151y.mo3366h();
            }
        }
    }

    /* renamed from: b */
    private boolean m2976b(C0689f fVar) {
        Context context = this.f2130a;
        if ((fVar.f2173a == 0 || fVar.f2173a == 108) && this.f2151y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0639a.C0640a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0639a.C0640a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0639a.C0640a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0729d dVar = new C0729d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0754h hVar = new C0754h(context);
        hVar.mo3048a((C0754h.C0755a) this);
        fVar.mo2666a(hVar);
        return true;
    }

    /* renamed from: c */
    private boolean m2978c(C0689f fVar) {
        if (fVar.f2181i != null) {
            fVar.f2180h = fVar.f2181i;
            return true;
        } else if (fVar.f2182j == null) {
            return false;
        } else {
            if (this.f2110A == null) {
                this.f2110A = new C0690g();
            }
            fVar.f2180h = (View) fVar.mo2664a((C0770o.C0771a) this.f2110A);
            if (fVar.f2180h != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    private boolean m2977b(C0689f fVar, KeyEvent keyEvent) {
        C0854ai aiVar;
        C0854ai aiVar2;
        C0854ai aiVar3;
        if (this.f2147r) {
            return false;
        }
        if (fVar.f2185m) {
            return true;
        }
        C0689f fVar2 = this.f2120K;
        if (!(fVar2 == null || fVar2 == fVar)) {
            mo2606a(fVar2, false);
        }
        Window.Callback l = mo2623l();
        if (l != null) {
            fVar.f2181i = l.onCreatePanelView(fVar.f2173a);
        }
        boolean z = fVar.f2173a == 0 || fVar.f2173a == 108;
        if (z && (aiVar3 = this.f2151y) != null) {
            aiVar3.mo3368j();
        }
        if (fVar.f2181i == null && (!z || !(mo2622k() instanceof C0694i))) {
            if (fVar.f2182j == null || fVar.f2190r) {
                if (fVar.f2182j == null && (!m2976b(fVar) || fVar.f2182j == null)) {
                    return false;
                }
                if (z && this.f2151y != null) {
                    if (this.f2152z == null) {
                        this.f2152z = new C0682a();
                    }
                    this.f2151y.mo3349a(fVar.f2182j, this.f2152z);
                }
                fVar.f2182j.mo3089h();
                if (!l.onCreatePanelMenu(fVar.f2173a, fVar.f2182j)) {
                    fVar.mo2666a((C0754h) null);
                    if (z && (aiVar2 = this.f2151y) != null) {
                        aiVar2.mo3349a((Menu) null, this.f2152z);
                    }
                    return false;
                }
                fVar.f2190r = false;
            }
            fVar.f2182j.mo3089h();
            if (fVar.f2191s != null) {
                fVar.f2182j.mo3068b(fVar.f2191s);
                fVar.f2191s = null;
            }
            if (!l.onPreparePanel(0, fVar.f2181i, fVar.f2182j)) {
                if (z && (aiVar = this.f2151y) != null) {
                    aiVar.mo3349a((Menu) null, this.f2152z);
                }
                fVar.f2182j.mo3091i();
                return false;
            }
            fVar.f2188p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            fVar.f2182j.setQwertyMode(fVar.f2188p);
            fVar.f2182j.mo3091i();
        }
        fVar.f2185m = true;
        fVar.f2186n = false;
        this.f2120K = fVar;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2613b(C0754h hVar) {
        if (!this.f2118I) {
            this.f2118I = true;
            this.f2151y.mo3369k();
            Window.Callback l = mo2623l();
            if (l != null && !this.f2147r) {
                l.onPanelClosed(108, hVar);
            }
            this.f2118I = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2618f(int i) {
        mo2606a(mo2601a(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2606a(C0689f fVar, boolean z) {
        C0854ai aiVar;
        if (!z || fVar.f2173a != 0 || (aiVar = this.f2151y) == null || !aiVar.mo3357f()) {
            WindowManager windowManager = (WindowManager) this.f2130a.getSystemService("window");
            if (!(windowManager == null || !fVar.f2187o || fVar.f2179g == null)) {
                windowManager.removeView(fVar.f2179g);
                if (z) {
                    mo2605a(fVar.f2173a, fVar, (Menu) null);
                }
            }
            fVar.f2185m = false;
            fVar.f2186n = false;
            fVar.f2187o = false;
            fVar.f2180h = null;
            fVar.f2189q = true;
            if (this.f2120K == fVar) {
                this.f2120K = null;
                return;
            }
            return;
        }
        mo2613b(fVar.f2182j);
    }

    /* renamed from: d */
    private boolean m2979d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0689f a = mo2601a(i, true);
        if (!a.f2187o) {
            return m2977b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2980e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            android.support.v7.view.b r0 = r3.f2137h
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.f$f r2 = r3.mo2601a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            android.support.v7.widget.ai r4 = r3.f2151y
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo3356e()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f2130a
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            android.support.v7.widget.ai r4 = r3.f2151y
            boolean r4 = r4.mo3357f()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f2147r
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m2977b((android.support.p039v7.app.C0673f.C0689f) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0063
            android.support.v7.widget.ai r4 = r3.f2151y
            boolean r4 = r4.mo3366h()
            goto L_0x006a
        L_0x003c:
            android.support.v7.widget.ai r4 = r3.f2151y
            boolean r4 = r4.mo3367i()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f2187o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f2186n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f2185m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f2190r
            if (r4 == 0) goto L_0x005b
            r2.f2185m = r1
            boolean r4 = r3.m2977b((android.support.p039v7.app.C0673f.C0689f) r2, (android.view.KeyEvent) r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m2971a((android.support.p039v7.app.C0673f.C0689f) r2, (android.view.KeyEvent) r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f2187o
            r3.mo2606a((android.support.p039v7.app.C0673f.C0689f) r2, (boolean) r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f2130a
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.app.C0673f.m2980e(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2605a(int i, C0689f fVar, Menu menu) {
        if (menu == null) {
            if (fVar == null && i >= 0) {
                C0689f[] fVarArr = this.f2119J;
                if (i < fVarArr.length) {
                    fVar = fVarArr[i];
                }
            }
            if (fVar != null) {
                menu = fVar.f2182j;
            }
        }
        if ((fVar == null || fVar.f2187o) && !this.f2147r) {
            this.f2132c.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0689f mo2602a(Menu menu) {
        C0689f[] fVarArr = this.f2119J;
        int length = fVarArr != null ? fVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0689f fVar = fVarArr[i];
            if (fVar != null && fVar.f2182j == menu) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0689f mo2601a(int i, boolean z) {
        C0689f[] fVarArr = this.f2119J;
        if (fVarArr == null || fVarArr.length <= i) {
            C0689f[] fVarArr2 = new C0689f[(i + 1)];
            if (fVarArr != null) {
                System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            }
            this.f2119J = fVarArr2;
            fVarArr = fVarArr2;
        }
        C0689f fVar = fVarArr[i];
        if (fVar != null) {
            return fVar;
        }
        C0689f fVar2 = new C0689f(i);
        fVarArr[i] = fVar2;
        return fVar2;
    }

    /* renamed from: a */
    private boolean m2974a(C0689f fVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((fVar.f2185m || m2977b(fVar, keyEvent)) && fVar.f2182j != null) {
            z = fVar.f2182j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2151y == null) {
            mo2606a(fVar, true);
        }
        return z;
    }

    /* renamed from: j */
    private void m2981j(int i) {
        this.f2149t = (1 << i) | this.f2149t;
        if (!this.f2148s) {
            C0594r.m2587a(this.f2131b.getDecorView(), this.f2125P);
            this.f2148s = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2619g(int i) {
        C0689f a;
        C0689f a2 = mo2601a(i, true);
        if (a2.f2182j != null) {
            Bundle bundle = new Bundle();
            a2.f2182j.mo3047a(bundle);
            if (bundle.size() > 0) {
                a2.f2191s = bundle;
            }
            a2.f2182j.mo3089h();
            a2.f2182j.clear();
        }
        a2.f2190r = true;
        a2.f2189q = true;
        if ((i == 108 || i == 0) && this.f2151y != null && (a = mo2601a(0, false)) != null) {
            a.f2185m = false;
            m2977b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo2620h(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f2138i;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2138i.getLayoutParams();
            z = true;
            if (this.f2138i.isShown()) {
                if (this.f2127R == null) {
                    this.f2127R = new Rect();
                    this.f2128S = new Rect();
                }
                Rect rect = this.f2127R;
                Rect rect2 = this.f2128S;
                rect.set(0, i, 0, 0);
                C0984bv.m5211a(this.f2113D, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f2115F;
                    if (view == null) {
                        this.f2115F = new View(this.f2130a);
                        this.f2115F.setBackgroundColor(this.f2130a.getResources().getColor(C0639a.C0642c.abc_input_method_navigation_guard));
                        this.f2113D.addView(this.f2115F, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2115F.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f2115F == null) {
                    z = false;
                }
                if (!this.f2144o && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.f2138i.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f2115F;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: x */
    private void m2988x() {
        if (this.f2112C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: k */
    private int m2982k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2632s() {
        C0854ai aiVar = this.f2151y;
        if (aiVar != null) {
            aiVar.mo3369k();
        }
        if (this.f2139j != null) {
            this.f2131b.getDecorView().removeCallbacks(this.f2140k);
            if (this.f2139j.isShowing()) {
                try {
                    this.f2139j.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2139j = null;
        }
        mo2630q();
        C0689f a = mo2601a(0, false);
        if (a != null && a.f2182j != null) {
            a.f2182j.close();
        }
    }

    /* renamed from: i */
    public boolean mo2600i() {
        int y = m2989y();
        int i = mo2621i(y);
        boolean l = i != -1 ? m2983l(i) : false;
        if (y == 0) {
            m2990z();
            this.f2124O.mo2658c();
        }
        this.f2123N = true;
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2621i(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f2130a.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m2990z();
        return this.f2124O.mo2656a();
    }

    /* renamed from: y */
    private int m2989y() {
        int i = this.f2122M;
        return i != -100 ? i : m2949j();
    }

    /* renamed from: l */
    private boolean m2983l(int i) {
        Resources resources = this.f2130a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2970A()) {
            ((Activity) this.f2130a).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0693h.m3077a(resources);
        return true;
    }

    /* renamed from: z */
    private void m2990z() {
        if (this.f2124O == null) {
            this.f2124O = new C0686d(C0698k.m3106a(this.f2130a));
        }
    }

    /* renamed from: A */
    private boolean m2970A() {
        if (this.f2123N) {
            Context context = this.f2130a;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f2130a, this.f2130a.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: android.support.v7.app.f$b */
    class C0683b implements C0726b.C0727a {

        /* renamed from: b */
        private C0726b.C0727a f2163b;

        public C0683b(C0726b.C0727a aVar) {
            this.f2163b = aVar;
        }

        /* renamed from: a */
        public boolean mo2642a(C0726b bVar, Menu menu) {
            return this.f2163b.mo2642a(bVar, menu);
        }

        /* renamed from: b */
        public boolean mo2644b(C0726b bVar, Menu menu) {
            return this.f2163b.mo2644b(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo2643a(C0726b bVar, MenuItem menuItem) {
            return this.f2163b.mo2643a(bVar, menuItem);
        }

        /* renamed from: a */
        public void mo2641a(C0726b bVar) {
            this.f2163b.mo2641a(bVar);
            if (C0673f.this.f2139j != null) {
                C0673f.this.f2131b.getDecorView().removeCallbacks(C0673f.this.f2140k);
            }
            if (C0673f.this.f2138i != null) {
                C0673f.this.mo2630q();
                C0673f fVar = C0673f.this;
                fVar.f2141l = C0594r.m2610k(fVar.f2138i).mo2296a(0.0f);
                C0673f.this.f2141l.mo2298a((C0605w) new C0606x() {
                    /* renamed from: b */
                    public void mo2310b(View view) {
                        C0673f.this.f2138i.setVisibility(8);
                        if (C0673f.this.f2139j != null) {
                            C0673f.this.f2139j.dismiss();
                        } else if (C0673f.this.f2138i.getParent() instanceof View) {
                            C0594r.m2614o((View) C0673f.this.f2138i.getParent());
                        }
                        C0673f.this.f2138i.removeAllViews();
                        C0673f.this.f2141l.mo2298a((C0605w) null);
                        C0673f.this.f2141l = null;
                    }
                });
            }
            if (C0673f.this.f2134e != null) {
                C0673f.this.f2134e.mo2561b(C0673f.this.f2137h);
            }
            C0673f.this.f2137h = null;
        }
    }

    /* renamed from: android.support.v7.app.f$g */
    private final class C0690g implements C0770o.C0771a {
        C0690g() {
        }

        /* renamed from: a */
        public void mo2639a(C0754h hVar, boolean z) {
            C0754h q = hVar.mo3102q();
            boolean z2 = q != hVar;
            C0673f fVar = C0673f.this;
            if (z2) {
                hVar = q;
            }
            C0689f a = fVar.mo2602a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0673f.this.mo2605a(a.f2173a, a, q);
                C0673f.this.mo2606a(a, true);
                return;
            }
            C0673f.this.mo2606a(a, z);
        }

        /* renamed from: a */
        public boolean mo2640a(C0754h hVar) {
            Window.Callback l;
            if (hVar != null || !C0673f.this.f2142m || (l = C0673f.this.mo2623l()) == null || C0673f.this.f2147r) {
                return true;
            }
            l.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.f$a */
    private final class C0682a implements C0770o.C0771a {
        C0682a() {
        }

        /* renamed from: a */
        public boolean mo2640a(C0754h hVar) {
            Window.Callback l = C0673f.this.mo2623l();
            if (l == null) {
                return true;
            }
            l.onMenuOpened(108, hVar);
            return true;
        }

        /* renamed from: a */
        public void mo2639a(C0754h hVar, boolean z) {
            C0673f.this.mo2613b(hVar);
        }
    }

    /* renamed from: android.support.v7.app.f$f */
    protected static final class C0689f {

        /* renamed from: a */
        int f2173a;

        /* renamed from: b */
        int f2174b;

        /* renamed from: c */
        int f2175c;

        /* renamed from: d */
        int f2176d;

        /* renamed from: e */
        int f2177e;

        /* renamed from: f */
        int f2178f;

        /* renamed from: g */
        ViewGroup f2179g;

        /* renamed from: h */
        View f2180h;

        /* renamed from: i */
        View f2181i;

        /* renamed from: j */
        C0754h f2182j;

        /* renamed from: k */
        C0751f f2183k;

        /* renamed from: l */
        Context f2184l;

        /* renamed from: m */
        boolean f2185m;

        /* renamed from: n */
        boolean f2186n;

        /* renamed from: o */
        boolean f2187o;

        /* renamed from: p */
        public boolean f2188p;

        /* renamed from: q */
        boolean f2189q = false;

        /* renamed from: r */
        boolean f2190r;

        /* renamed from: s */
        Bundle f2191s;

        C0689f(int i) {
            this.f2173a = i;
        }

        /* renamed from: a */
        public boolean mo2667a() {
            if (this.f2180h == null) {
                return false;
            }
            if (this.f2181i == null && this.f2183k.mo3021a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2665a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0639a.C0640a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0639a.C0640a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0639a.C0648i.Theme_AppCompat_CompactMenu, true);
            }
            C0729d dVar = new C0729d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f2184l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0639a.C0649j.AppCompatTheme);
            this.f2174b = obtainStyledAttributes.getResourceId(C0639a.C0649j.AppCompatTheme_panelBackground, 0);
            this.f2178f = obtainStyledAttributes.getResourceId(C0639a.C0649j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2666a(C0754h hVar) {
            C0751f fVar;
            C0754h hVar2 = this.f2182j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.mo3070b((C0770o) this.f2183k);
                }
                this.f2182j = hVar;
                if (hVar != null && (fVar = this.f2183k) != null) {
                    hVar.mo3050a((C0770o) fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0772p mo2664a(C0770o.C0771a aVar) {
            if (this.f2182j == null) {
                return null;
            }
            if (this.f2183k == null) {
                this.f2183k = new C0751f(this.f2184l, C0639a.C0646g.abc_list_menu_item_layout);
                this.f2183k.mo2983a(aVar);
                this.f2182j.mo3050a((C0770o) this.f2183k);
            }
            return this.f2183k.mo3020a(this.f2179g);
        }
    }

    /* renamed from: android.support.v7.app.f$e */
    private class C0688e extends ContentFrameLayout {
        public C0688e(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0673f.this.mo2611a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m3062a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0673f.this.mo2618f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0705a.m3168b(getContext(), i));
        }

        /* renamed from: a */
        private boolean m3062a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    /* renamed from: android.support.v7.app.f$c */
    class C0685c extends C0738i {
        public void onContentChanged() {
        }

        C0685c(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0673f.this.mo2611a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0673f.this.mo2609a(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0754h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0754h hVar = menu instanceof C0754h ? (C0754h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo3074c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.mo3074c(false);
            }
            return onPreparePanel;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0673f.this.mo2617e(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0673f.this.mo2616d(i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (C0673f.this.mo2629p()) {
                return mo2645a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo2645a(ActionMode.Callback callback) {
            C0731f.C0732a aVar = new C0731f.C0732a(C0673f.this.f2130a, callback);
            C0726b a = C0673f.this.mo2603a((C0726b.C0727a) aVar);
            if (a != null) {
                return aVar.mo2871b(a);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C0673f.this.mo2629p() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo2645a(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0689f a = C0673f.this.mo2601a(0, true);
            if (a == null || a.f2182j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f2182j, i);
            }
        }
    }

    /* renamed from: android.support.v7.app.f$d */
    final class C0686d {

        /* renamed from: b */
        private C0698k f2167b;

        /* renamed from: c */
        private boolean f2168c;

        /* renamed from: d */
        private BroadcastReceiver f2169d;

        /* renamed from: e */
        private IntentFilter f2170e;

        C0686d(C0698k kVar) {
            this.f2167b = kVar;
            this.f2168c = kVar.mo2681a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2656a() {
            this.f2168c = this.f2167b.mo2681a();
            return this.f2168c ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2657b() {
            boolean a = this.f2167b.mo2681a();
            if (a != this.f2168c) {
                this.f2168c = a;
                C0673f.this.mo2600i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2658c() {
            mo2659d();
            if (this.f2169d == null) {
                this.f2169d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C0686d.this.mo2657b();
                    }
                };
            }
            if (this.f2170e == null) {
                this.f2170e = new IntentFilter();
                this.f2170e.addAction("android.intent.action.TIME_SET");
                this.f2170e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f2170e.addAction("android.intent.action.TIME_TICK");
            }
            C0673f.this.f2130a.registerReceiver(this.f2169d, this.f2170e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2659d() {
            if (this.f2169d != null) {
                C0673f.this.f2130a.unregisterReceiver(this.f2169d);
                this.f2169d = null;
            }
        }
    }
}
