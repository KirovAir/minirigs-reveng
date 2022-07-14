package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0583g;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.app.C0664a;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.view.C0728c;
import android.support.p039v7.view.C0733g;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0780u;
import android.support.p039v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f2944A;

    /* renamed from: B */
    private int f2945B;

    /* renamed from: C */
    private boolean f2946C;

    /* renamed from: D */
    private boolean f2947D;

    /* renamed from: E */
    private final ArrayList<View> f2948E;

    /* renamed from: F */
    private final ArrayList<View> f2949F;

    /* renamed from: G */
    private final int[] f2950G;

    /* renamed from: H */
    private final ActionMenuView.C0792e f2951H;

    /* renamed from: I */
    private C0969bo f2952I;

    /* renamed from: J */
    private C0986c f2953J;

    /* renamed from: K */
    private C0834a f2954K;

    /* renamed from: L */
    private C0770o.C0771a f2955L;

    /* renamed from: M */
    private C0754h.C0755a f2956M;

    /* renamed from: N */
    private boolean f2957N;

    /* renamed from: O */
    private final Runnable f2958O;

    /* renamed from: a */
    private ActionMenuView f2959a;

    /* renamed from: b */
    ImageButton f2960b;

    /* renamed from: c */
    View f2961c;

    /* renamed from: d */
    int f2962d;

    /* renamed from: e */
    C0836c f2963e;

    /* renamed from: f */
    private TextView f2964f;

    /* renamed from: g */
    private TextView f2965g;

    /* renamed from: h */
    private ImageButton f2966h;

    /* renamed from: i */
    private ImageView f2967i;

    /* renamed from: j */
    private Drawable f2968j;

    /* renamed from: k */
    private CharSequence f2969k;

    /* renamed from: l */
    private Context f2970l;

    /* renamed from: m */
    private int f2971m;

    /* renamed from: n */
    private int f2972n;

    /* renamed from: o */
    private int f2973o;

    /* renamed from: p */
    private int f2974p;

    /* renamed from: q */
    private int f2975q;

    /* renamed from: r */
    private int f2976r;

    /* renamed from: s */
    private int f2977s;

    /* renamed from: t */
    private int f2978t;

    /* renamed from: u */
    private C0953bd f2979u;

    /* renamed from: v */
    private int f2980v;

    /* renamed from: w */
    private int f2981w;

    /* renamed from: x */
    private int f2982x;

    /* renamed from: y */
    private CharSequence f2983y;

    /* renamed from: z */
    private CharSequence f2984z;

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0836c {
        /* renamed from: a */
        boolean mo3849a(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2982x = 8388627;
        this.f2948E = new ArrayList<>();
        this.f2949F = new ArrayList<>();
        this.f2950G = new int[2];
        this.f2951H = new ActionMenuView.C0792e() {
            /* renamed from: a */
            public boolean mo3427a(MenuItem menuItem) {
                if (Toolbar.this.f2963e != null) {
                    return Toolbar.this.f2963e.mo3849a(menuItem);
                }
                return false;
            }
        };
        this.f2958O = new Runnable() {
            public void run() {
                Toolbar.this.mo3780d();
            }
        };
        C0968bn a = C0968bn.m5093a(getContext(), attributeSet, C0639a.C0649j.Toolbar, i, 0);
        this.f2972n = a.mo4793g(C0639a.C0649j.Toolbar_titleTextAppearance, 0);
        this.f2973o = a.mo4793g(C0639a.C0649j.Toolbar_subtitleTextAppearance, 0);
        this.f2982x = a.mo4785c(C0639a.C0649j.Toolbar_android_gravity, this.f2982x);
        this.f2962d = a.mo4785c(C0639a.C0649j.Toolbar_buttonGravity, 48);
        int d = a.mo4787d(C0639a.C0649j.Toolbar_titleMargin, 0);
        d = a.mo4794g(C0639a.C0649j.Toolbar_titleMargins) ? a.mo4787d(C0639a.C0649j.Toolbar_titleMargins, d) : d;
        this.f2978t = d;
        this.f2977s = d;
        this.f2976r = d;
        this.f2975q = d;
        int d2 = a.mo4787d(C0639a.C0649j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f2975q = d2;
        }
        int d3 = a.mo4787d(C0639a.C0649j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f2976r = d3;
        }
        int d4 = a.mo4787d(C0639a.C0649j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f2977s = d4;
        }
        int d5 = a.mo4787d(C0639a.C0649j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f2978t = d5;
        }
        this.f2974p = a.mo4789e(C0639a.C0649j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo4787d(C0639a.C0649j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo4787d(C0639a.C0649j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo4789e(C0639a.C0649j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo4789e(C0639a.C0649j.Toolbar_contentInsetRight, 0);
        m4072s();
        this.f2979u.mo4721b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f2979u.mo4718a(d6, d7);
        }
        this.f2980v = a.mo4787d(C0639a.C0649j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2981w = a.mo4787d(C0639a.C0649j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2968j = a.mo4780a(C0639a.C0649j.Toolbar_collapseIcon);
        this.f2969k = a.mo4786c(C0639a.C0649j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo4786c(C0639a.C0649j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo4786c(C0639a.C0649j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f2970l = getContext();
        setPopupTheme(a.mo4793g(C0639a.C0649j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo4780a(C0639a.C0649j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo4786c(C0639a.C0649j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo4780a(C0639a.C0649j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo4786c(C0639a.C0649j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo4794g(C0639a.C0649j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo4783b(C0639a.C0649j.Toolbar_titleTextColor, -1));
        }
        if (a.mo4794g(C0639a.C0649j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo4783b(C0639a.C0649j.Toolbar_subtitleTextColor, -1));
        }
        a.mo4781a();
    }

    public void setPopupTheme(int i) {
        if (this.f2971m != i) {
            this.f2971m = i;
            if (i == 0) {
                this.f2970l = getContext();
            } else {
                this.f2970l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2971m;
    }

    public int getTitleMarginStart() {
        return this.f2975q;
    }

    public void setTitleMarginStart(int i) {
        this.f2975q = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f2977s;
    }

    public void setTitleMarginTop(int i) {
        this.f2977s = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f2976r;
    }

    public void setTitleMarginEnd(int i) {
        this.f2976r = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f2978t;
    }

    public void setTitleMarginBottom(int i) {
        this.f2978t = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m4072s();
        C0953bd bdVar = this.f2979u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        bdVar.mo4719a(z);
    }

    public void setLogo(int i) {
        setLogo(C0705a.m3168b(getContext(), i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2959a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3775a() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            android.support.v7.widget.ActionMenuView r0 = r1.f2959a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo3396a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.Toolbar.mo3775a():boolean");
    }

    /* renamed from: b */
    public boolean mo3777b() {
        ActionMenuView actionMenuView = this.f2959a;
        return actionMenuView != null && actionMenuView.mo3407g();
    }

    /* renamed from: c */
    public boolean mo3778c() {
        ActionMenuView actionMenuView = this.f2959a;
        return actionMenuView != null && actionMenuView.mo3415h();
    }

    /* renamed from: d */
    public boolean mo3780d() {
        ActionMenuView actionMenuView = this.f2959a;
        return actionMenuView != null && actionMenuView.mo3405e();
    }

    /* renamed from: e */
    public boolean mo3781e() {
        ActionMenuView actionMenuView = this.f2959a;
        return actionMenuView != null && actionMenuView.mo3406f();
    }

    /* renamed from: a */
    public void mo3773a(C0754h hVar, C0986c cVar) {
        if (hVar != null || this.f2959a != null) {
            m4068o();
            C0754h d = this.f2959a.mo3403d();
            if (d != hVar) {
                if (d != null) {
                    d.mo3070b((C0770o) this.f2953J);
                    d.mo3070b((C0770o) this.f2954K);
                }
                if (this.f2954K == null) {
                    this.f2954K = new C0834a();
                }
                cVar.mo4846d(true);
                if (hVar != null) {
                    hVar.mo3051a((C0770o) cVar, this.f2970l);
                    hVar.mo3051a((C0770o) this.f2954K, this.f2970l);
                } else {
                    cVar.mo2980a(this.f2970l, (C0754h) null);
                    this.f2954K.mo2980a(this.f2970l, (C0754h) null);
                    cVar.mo2990b(true);
                    this.f2954K.mo2990b(true);
                }
                this.f2959a.setPopupTheme(this.f2971m);
                this.f2959a.setPresenter(cVar);
                this.f2953J = cVar;
            }
        }
    }

    /* renamed from: f */
    public void mo3782f() {
        ActionMenuView actionMenuView = this.f2959a;
        if (actionMenuView != null) {
            actionMenuView.mo3416i();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m4066m();
            if (!m4065d(this.f2967i)) {
                m4058a((View) this.f2967i, true);
            }
        } else {
            ImageView imageView = this.f2967i;
            if (imageView != null && m4065d(imageView)) {
                removeView(this.f2967i);
                this.f2949F.remove(this.f2967i);
            }
        }
        ImageView imageView2 = this.f2967i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2967i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4066m();
        }
        ImageView imageView = this.f2967i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2967i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: m */
    private void m4066m() {
        if (this.f2967i == null) {
            this.f2967i = new C1019q(getContext());
        }
    }

    /* renamed from: g */
    public boolean mo3783g() {
        C0834a aVar = this.f2954K;
        return (aVar == null || aVar.f2989b == null) ? false : true;
    }

    /* renamed from: h */
    public void mo3813h() {
        C0834a aVar = this.f2954K;
        C0758j jVar = aVar == null ? null : aVar.f2989b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f2983y;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2964f == null) {
                Context context = getContext();
                this.f2964f = new AppCompatTextView(context);
                this.f2964f.setSingleLine();
                this.f2964f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2972n;
                if (i != 0) {
                    this.f2964f.setTextAppearance(context, i);
                }
                int i2 = this.f2944A;
                if (i2 != 0) {
                    this.f2964f.setTextColor(i2);
                }
            }
            if (!m4065d(this.f2964f)) {
                m4058a((View) this.f2964f, true);
            }
        } else {
            TextView textView = this.f2964f;
            if (textView != null && m4065d(textView)) {
                removeView(this.f2964f);
                this.f2949F.remove(this.f2964f);
            }
        }
        TextView textView2 = this.f2964f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2983y = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f2984z;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2965g == null) {
                Context context = getContext();
                this.f2965g = new AppCompatTextView(context);
                this.f2965g.setSingleLine();
                this.f2965g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2973o;
                if (i != 0) {
                    this.f2965g.setTextAppearance(context, i);
                }
                int i2 = this.f2945B;
                if (i2 != 0) {
                    this.f2965g.setTextColor(i2);
                }
            }
            if (!m4065d(this.f2965g)) {
                m4058a((View) this.f2965g, true);
            }
        } else {
            TextView textView = this.f2965g;
            if (textView != null && m4065d(textView)) {
                removeView(this.f2965g);
                this.f2949F.remove(this.f2965g);
            }
        }
        TextView textView2 = this.f2965g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2984z = charSequence;
    }

    /* renamed from: a */
    public void mo3772a(Context context, int i) {
        this.f2972n = i;
        TextView textView = this.f2964f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public void mo3776b(Context context, int i) {
        this.f2973o = i;
        TextView textView = this.f2965g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.f2944A = i;
        TextView textView = this.f2964f;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.f2945B = i;
        TextView textView = this.f2965g;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2966h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4069p();
        }
        ImageButton imageButton = this.f2966h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0705a.m3168b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m4069p();
            if (!m4065d(this.f2966h)) {
                m4058a((View) this.f2966h, true);
            }
        } else {
            ImageButton imageButton = this.f2966h;
            if (imageButton != null && m4065d(imageButton)) {
                removeView(this.f2966h);
                this.f2949F.remove(this.f2966h);
            }
        }
        ImageButton imageButton2 = this.f2966h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2966h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m4069p();
        this.f2966h.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m4067n();
        return this.f2959a.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m4067n();
        this.f2959a.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m4067n();
        return this.f2959a.getOverflowIcon();
    }

    /* renamed from: n */
    private void m4067n() {
        m4068o();
        if (this.f2959a.mo3403d() == null) {
            C0754h hVar = (C0754h) this.f2959a.getMenu();
            if (this.f2954K == null) {
                this.f2954K = new C0834a();
            }
            this.f2959a.setExpandedActionViewsExclusive(true);
            hVar.mo3051a((C0770o) this.f2954K, this.f2970l);
        }
    }

    /* renamed from: o */
    private void m4068o() {
        if (this.f2959a == null) {
            this.f2959a = new ActionMenuView(getContext());
            this.f2959a.setPopupTheme(this.f2971m);
            this.f2959a.setOnMenuItemClickListener(this.f2951H);
            this.f2959a.mo3395a(this.f2955L, this.f2956M);
            C0835b j = generateDefaultLayoutParams();
            j.f2099a = 8388613 | (this.f2962d & 112);
            this.f2959a.setLayoutParams(j);
            m4058a((View) this.f2959a, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0733g(getContext());
    }

    public void setOnMenuItemClickListener(C0836c cVar) {
        this.f2963e = cVar;
    }

    /* renamed from: a */
    public void mo3771a(int i, int i2) {
        m4072s();
        this.f2979u.mo4718a(i, i2);
    }

    public int getContentInsetStart() {
        C0953bd bdVar = this.f2979u;
        if (bdVar != null) {
            return bdVar.mo4722c();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C0953bd bdVar = this.f2979u;
        if (bdVar != null) {
            return bdVar.mo4723d();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        C0953bd bdVar = this.f2979u;
        if (bdVar != null) {
            return bdVar.mo4717a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0953bd bdVar = this.f2979u;
        if (bdVar != null) {
            return bdVar.mo4720b();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2980v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2980v) {
            this.f2980v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2981w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2981w) {
            this.f2981w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2980v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        ActionMenuView actionMenuView = this.f2959a;
        if (actionMenuView != null) {
            C0754h d = actionMenuView.mo3403d();
            z = d != null && d.hasVisibleItems();
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2981w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C0594r.m2602f(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0594r.m2602f(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: p */
    private void m4069p() {
        if (this.f2966h == null) {
            this.f2966h = new C1017o(getContext(), (AttributeSet) null, C0639a.C0640a.toolbarNavigationButtonStyle);
            C0835b j = generateDefaultLayoutParams();
            j.f2099a = 8388611 | (this.f2962d & 112);
            this.f2966h.setLayoutParams(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3814i() {
        if (this.f2960b == null) {
            this.f2960b = new C1017o(getContext(), (AttributeSet) null, C0639a.C0640a.toolbarNavigationButtonStyle);
            this.f2960b.setImageDrawable(this.f2968j);
            this.f2960b.setContentDescription(this.f2969k);
            C0835b j = generateDefaultLayoutParams();
            j.f2099a = 8388611 | (this.f2962d & 112);
            j.f2991b = 2;
            this.f2960b.setLayoutParams(j);
            this.f2960b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo3813h();
                }
            });
        }
    }

    /* renamed from: a */
    private void m4058a(View view, boolean z) {
        C0835b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = generateLayoutParams(layoutParams);
        } else {
            bVar = (C0835b) layoutParams;
        }
        bVar.f2991b = 1;
        if (!z || this.f2961c == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.f2949F.add(view);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0837d dVar = new C0837d(super.onSaveInstanceState());
        C0834a aVar = this.f2954K;
        if (!(aVar == null || aVar.f2989b == null)) {
            dVar.f2992a = this.f2954K.f2989b.getItemId();
        }
        dVar.f2993b = mo3777b();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0837d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0837d dVar = (C0837d) parcelable;
        super.onRestoreInstanceState(dVar.mo2188a());
        ActionMenuView actionMenuView = this.f2959a;
        C0754h d = actionMenuView != null ? actionMenuView.mo3403d() : null;
        if (!(dVar.f2992a == 0 || this.f2954K == null || d == null || (findItem = d.findItem(dVar.f2992a)) == null)) {
            findItem.expandActionView();
        }
        if (dVar.f2993b) {
            m4070q();
        }
    }

    /* renamed from: q */
    private void m4070q() {
        removeCallbacks(this.f2958O);
        post(this.f2958O);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2958O);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2946C = false;
        }
        if (!this.f2946C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2946C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2946C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2947D = false;
        }
        if (!this.f2947D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2947D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2947D = false;
        }
        return true;
    }

    /* renamed from: a */
    private void m4057a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m4054a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: r */
    private boolean m4071r() {
        if (!this.f2957N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m4060a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f2950G;
        if (C0984bv.m5212a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m4060a((View) this.f2966h)) {
            m4057a((View) this.f2966h, i, 0, i2, 0, this.f2974p);
            i5 = this.f2966h.getMeasuredWidth() + m4062b((View) this.f2966h);
            i4 = Math.max(0, this.f2966h.getMeasuredHeight() + m4064c(this.f2966h));
            i3 = View.combineMeasuredStates(0, this.f2966h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m4060a((View) this.f2960b)) {
            m4057a((View) this.f2960b, i, 0, i2, 0, this.f2974p);
            i5 = this.f2960b.getMeasuredWidth() + m4062b((View) this.f2960b);
            i4 = Math.max(i4, this.f2960b.getMeasuredHeight() + m4064c(this.f2960b));
            i3 = View.combineMeasuredStates(i3, this.f2960b.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m4060a((View) this.f2959a)) {
            m4057a((View) this.f2959a, i, max, i2, 0, this.f2974p);
            i6 = this.f2959a.getMeasuredWidth() + m4062b((View) this.f2959a);
            i4 = Math.max(i4, this.f2959a.getMeasuredHeight() + m4064c(this.f2959a));
            i3 = View.combineMeasuredStates(i3, this.f2959a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m4060a(this.f2961c)) {
            max2 += m4054a(this.f2961c, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2961c.getMeasuredHeight() + m4064c(this.f2961c));
            i3 = View.combineMeasuredStates(i3, this.f2961c.getMeasuredState());
        }
        if (m4060a((View) this.f2967i)) {
            max2 += m4054a((View) this.f2967i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2967i.getMeasuredHeight() + m4064c(this.f2967i));
            i3 = View.combineMeasuredStates(i3, this.f2967i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0835b) childAt.getLayoutParams()).f2991b == 0 && m4060a(childAt)) {
                i11 += m4054a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m4064c(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f2977s + this.f2978t;
        int i14 = this.f2975q + this.f2976r;
        if (m4060a((View) this.f2964f)) {
            m4054a((View) this.f2964f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f2964f.getMeasuredWidth() + m4062b((View) this.f2964f);
            i7 = this.f2964f.getMeasuredHeight() + m4064c(this.f2964f);
            i9 = View.combineMeasuredStates(i3, this.f2964f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m4060a((View) this.f2965g)) {
            int i15 = i7 + i13;
            i8 = Math.max(i8, m4054a((View) this.f2965g, i, i11 + i14, i2, i15, iArr));
            i7 += this.f2965g.getMeasuredHeight() + m4064c(this.f2965g);
            i9 = View.combineMeasuredStates(i9, this.f2965g.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int max3 = Math.max(i10, i7);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m4071r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char c;
        int i19;
        int i20;
        boolean z3 = C0594r.m2602f(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.f2950G;
        iArr[1] = 0;
        iArr[0] = 0;
        int j = C0594r.m2609j(this);
        int min = j >= 0 ? Math.min(j, i4 - i2) : 0;
        if (!m4060a((View) this.f2966h)) {
            i6 = paddingLeft;
            i5 = i21;
        } else if (z3) {
            i5 = m4063b(this.f2966h, i21, iArr, min);
            i6 = paddingLeft;
        } else {
            i6 = m4055a(this.f2966h, paddingLeft, iArr, min);
            i5 = i21;
        }
        if (m4060a((View) this.f2960b)) {
            if (z3) {
                i5 = m4063b(this.f2960b, i5, iArr, min);
            } else {
                i6 = m4055a(this.f2960b, i6, iArr, min);
            }
        }
        if (m4060a((View) this.f2959a)) {
            if (z3) {
                i6 = m4055a(this.f2959a, i6, iArr, min);
            } else {
                i5 = m4063b(this.f2959a, i5, iArr, min);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i6);
        iArr[1] = Math.max(0, currentContentInsetRight - (i21 - i5));
        int max = Math.max(i6, currentContentInsetLeft);
        int min2 = Math.min(i5, i21 - currentContentInsetRight);
        if (m4060a(this.f2961c)) {
            if (z3) {
                min2 = m4063b(this.f2961c, min2, iArr, min);
            } else {
                max = m4055a(this.f2961c, max, iArr, min);
            }
        }
        if (m4060a((View) this.f2967i)) {
            if (z3) {
                min2 = m4063b(this.f2967i, min2, iArr, min);
            } else {
                max = m4055a(this.f2967i, max, iArr, min);
            }
        }
        boolean a = m4060a((View) this.f2964f);
        boolean a2 = m4060a((View) this.f2965g);
        if (a) {
            C0835b bVar = (C0835b) this.f2964f.getLayoutParams();
            i8 = paddingRight;
            i9 = bVar.topMargin + this.f2964f.getMeasuredHeight() + bVar.bottomMargin + 0;
        } else {
            i8 = paddingRight;
            i9 = 0;
        }
        if (a2) {
            C0835b bVar2 = (C0835b) this.f2965g.getLayoutParams();
            i10 = width;
            i9 += bVar2.topMargin + this.f2965g.getMeasuredHeight() + bVar2.bottomMargin;
        } else {
            i10 = width;
        }
        if (a || a2) {
            TextView textView = a ? this.f2964f : this.f2965g;
            TextView textView2 = a2 ? this.f2965g : this.f2964f;
            C0835b bVar3 = (C0835b) textView.getLayoutParams();
            C0835b bVar4 = (C0835b) textView2.getLayoutParams();
            if ((!a || this.f2964f.getMeasuredWidth() <= 0) && (!a2 || this.f2965g.getMeasuredWidth() <= 0)) {
                i12 = paddingLeft;
                z2 = false;
            } else {
                i12 = paddingLeft;
                z2 = true;
            }
            int i22 = this.f2982x & 112;
            i11 = min;
            if (i22 == 48) {
                i14 = max;
                i15 = getPaddingTop() + bVar3.topMargin + this.f2977s;
            } else if (i22 != 80) {
                int i23 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                i14 = max;
                if (i23 < bVar3.topMargin + this.f2977s) {
                    i23 = bVar3.topMargin + this.f2977s;
                } else {
                    int i24 = (((height - paddingBottom) - i9) - i23) - paddingTop;
                    if (i24 < bVar3.bottomMargin + this.f2978t) {
                        i23 = Math.max(0, i23 - ((bVar4.bottomMargin + this.f2978t) - i24));
                    }
                }
                i15 = paddingTop + i23;
            } else {
                i14 = max;
                i15 = (((height - paddingBottom) - bVar4.bottomMargin) - this.f2978t) - i9;
            }
            if (z3) {
                if (z2) {
                    i18 = this.f2975q;
                    c = 1;
                } else {
                    c = 1;
                    i18 = 0;
                }
                int i25 = i18 - iArr[c];
                i7 -= Math.max(0, i25);
                iArr[c] = Math.max(0, -i25);
                if (a) {
                    int measuredWidth = i7 - this.f2964f.getMeasuredWidth();
                    int measuredHeight = this.f2964f.getMeasuredHeight() + i15;
                    this.f2964f.layout(measuredWidth, i15, i7, measuredHeight);
                    i19 = measuredWidth - this.f2976r;
                    i15 = measuredHeight + ((C0835b) this.f2964f.getLayoutParams()).bottomMargin;
                } else {
                    i19 = i7;
                }
                if (a2) {
                    C0835b bVar5 = (C0835b) this.f2965g.getLayoutParams();
                    int i26 = i15 + bVar5.topMargin;
                    this.f2965g.layout(i7 - this.f2965g.getMeasuredWidth(), i26, i7, this.f2965g.getMeasuredHeight() + i26);
                    i20 = i7 - this.f2976r;
                    int i27 = bVar5.bottomMargin;
                } else {
                    i20 = i7;
                }
                if (z2) {
                    i7 = Math.min(i19, i20);
                }
                max = i14;
                i13 = 0;
            } else {
                i13 = 0;
                int i28 = (z2 ? this.f2975q : 0) - iArr[0];
                max = i14 + Math.max(0, i28);
                iArr[0] = Math.max(0, -i28);
                if (a) {
                    int measuredWidth2 = this.f2964f.getMeasuredWidth() + max;
                    int measuredHeight2 = this.f2964f.getMeasuredHeight() + i15;
                    this.f2964f.layout(max, i15, measuredWidth2, measuredHeight2);
                    i16 = measuredWidth2 + this.f2976r;
                    i15 = measuredHeight2 + ((C0835b) this.f2964f.getLayoutParams()).bottomMargin;
                } else {
                    i16 = max;
                }
                if (a2) {
                    C0835b bVar6 = (C0835b) this.f2965g.getLayoutParams();
                    int i29 = i15 + bVar6.topMargin;
                    int measuredWidth3 = this.f2965g.getMeasuredWidth() + max;
                    this.f2965g.layout(max, i29, measuredWidth3, this.f2965g.getMeasuredHeight() + i29);
                    i17 = measuredWidth3 + this.f2976r;
                    int i30 = bVar6.bottomMargin;
                } else {
                    i17 = max;
                }
                if (z2) {
                    max = Math.max(i16, i17);
                }
            }
        } else {
            i12 = paddingLeft;
            i11 = min;
            i13 = 0;
        }
        m4059a((List<View>) this.f2948E, 3);
        int size = this.f2948E.size();
        int i31 = max;
        for (int i32 = 0; i32 < size; i32++) {
            i31 = m4055a(this.f2948E.get(i32), i31, iArr, i11);
        }
        int i33 = i11;
        m4059a((List<View>) this.f2948E, 5);
        int size2 = this.f2948E.size();
        for (int i34 = 0; i34 < size2; i34++) {
            i7 = m4063b(this.f2948E.get(i34), i7, iArr, i33);
        }
        m4059a((List<View>) this.f2948E, 1);
        int a3 = m4056a((List<View>) this.f2948E, iArr);
        int i35 = (i12 + (((i10 - i12) - i8) / 2)) - (a3 / 2);
        int i36 = a3 + i35;
        if (i35 >= i31) {
            i31 = i36 > i7 ? i35 - (i36 - i7) : i35;
        }
        int size3 = this.f2948E.size();
        while (i13 < size3) {
            i31 = m4055a(this.f2948E.get(i13), i31, iArr, i33);
            i13++;
        }
        this.f2948E.clear();
    }

    /* renamed from: a */
    private int m4056a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = list.get(i5);
            C0835b bVar = (C0835b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i4;
            int i8 = bVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = max4;
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private int m4055a(View view, int i, int[] iArr, int i2) {
        C0835b bVar = (C0835b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m4053a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: b */
    private int m4063b(View view, int i, int[] iArr, int i2) {
        C0835b bVar = (C0835b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m4053a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: a */
    private int m4053a(View view, int i) {
        C0835b bVar = (C0835b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a = m4052a(bVar.f2099a);
        if (a == 48) {
            return getPaddingTop() - i2;
        }
        if (a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < bVar.topMargin) {
            i3 = bVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < bVar.bottomMargin) {
                i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m4052a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2982x & 112;
    }

    /* renamed from: a */
    private void m4059a(List<View> list, int i) {
        boolean z = C0594r.m2602f(this) == 1;
        int childCount = getChildCount();
        int a = C0579d.m2523a(i, C0594r.m2602f(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0835b bVar = (C0835b) childAt.getLayoutParams();
                if (bVar.f2991b == 0 && m4060a(childAt) && m4061b(bVar.f2099a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0835b bVar2 = (C0835b) childAt2.getLayoutParams();
            if (bVar2.f2991b == 0 && m4060a(childAt2) && m4061b(bVar2.f2099a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m4061b(int i) {
        int f = C0594r.m2602f(this);
        int a = C0579d.m2523a(i, f) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        return f == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private boolean m4060a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m4062b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0583g.m2534a(marginLayoutParams) + C0583g.m2535b(marginLayoutParams);
    }

    /* renamed from: c */
    private int m4064c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public C0835b generateLayoutParams(AttributeSet attributeSet) {
        return new C0835b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0835b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0835b) {
            return new C0835b((C0835b) layoutParams);
        }
        if (layoutParams instanceof C0664a.C0665a) {
            return new C0835b((C0664a.C0665a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0835b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0835b(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0835b generateDefaultLayoutParams() {
        return new C0835b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0835b);
    }

    public C0855aj getWrapper() {
        if (this.f2952I == null) {
            this.f2952I = new C0969bo(this, true);
        }
        return this.f2952I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3816k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0835b) childAt.getLayoutParams()).f2991b == 2 || childAt == this.f2959a)) {
                removeViewAt(childCount);
                this.f2949F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3817l() {
        for (int size = this.f2949F.size() - 1; size >= 0; size--) {
            addView(this.f2949F.get(size));
        }
        this.f2949F.clear();
    }

    /* renamed from: d */
    private boolean m4065d(View view) {
        return view.getParent() == this || this.f2949F.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.f2957N = z;
        requestLayout();
    }

    /* renamed from: a */
    public void mo3774a(C0770o.C0771a aVar, C0754h.C0755a aVar2) {
        this.f2955L = aVar;
        this.f2956M = aVar2;
        ActionMenuView actionMenuView = this.f2959a;
        if (actionMenuView != null) {
            actionMenuView.mo3395a(aVar, aVar2);
        }
    }

    /* renamed from: s */
    private void m4072s() {
        if (this.f2979u == null) {
            this.f2979u = new C0953bd();
        }
    }

    /* access modifiers changed from: package-private */
    public C0986c getOuterActionMenuPresenter() {
        return this.f2953J;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f2970l;
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0835b extends C0664a.C0665a {

        /* renamed from: b */
        int f2991b = 0;

        public C0835b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0835b(int i, int i2) {
            super(i, i2);
            this.f2099a = 8388627;
        }

        public C0835b(C0835b bVar) {
            super((C0664a.C0665a) bVar);
            this.f2991b = bVar.f2991b;
        }

        public C0835b(C0664a.C0665a aVar) {
            super(aVar);
        }

        public C0835b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo3848a(marginLayoutParams);
        }

        public C0835b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3848a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0837d extends C0556a {
        public static final Parcelable.Creator<C0837d> CREATOR = new Parcelable.ClassLoaderCreator<C0837d>() {
            /* renamed from: a */
            public C0837d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0837d(parcel, classLoader);
            }

            /* renamed from: a */
            public C0837d createFromParcel(Parcel parcel) {
                return new C0837d(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0837d[] newArray(int i) {
                return new C0837d[i];
            }
        };

        /* renamed from: a */
        int f2992a;

        /* renamed from: b */
        boolean f2993b;

        public C0837d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2992a = parcel.readInt();
            this.f2993b = parcel.readInt() != 0;
        }

        public C0837d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2992a);
            parcel.writeInt(this.f2993b ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0834a implements C0770o {

        /* renamed from: a */
        C0754h f2988a;

        /* renamed from: b */
        C0758j f2989b;

        /* renamed from: a */
        public void mo2981a(C0754h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo2983a(C0770o.C0771a aVar) {
        }

        /* renamed from: a */
        public boolean mo2987a(C0780u uVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2991b() {
            return false;
        }

        C0834a() {
        }

        /* renamed from: a */
        public void mo2980a(Context context, C0754h hVar) {
            C0758j jVar;
            C0754h hVar2 = this.f2988a;
            if (!(hVar2 == null || (jVar = this.f2989b) == null)) {
                hVar2.mo3082d(jVar);
            }
            this.f2988a = hVar;
        }

        /* renamed from: b */
        public void mo2990b(boolean z) {
            if (this.f2989b != null) {
                C0754h hVar = this.f2988a;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2988a.getItem(i) == this.f2989b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo2992b(this.f2988a, this.f2989b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2986a(C0754h hVar, C0758j jVar) {
            Toolbar.this.mo3814i();
            ViewParent parent = Toolbar.this.f2960b.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2960b);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2960b);
            }
            Toolbar.this.f2961c = jVar.getActionView();
            this.f2989b = jVar;
            ViewParent parent2 = Toolbar.this.f2961c.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2961c);
                }
                C0835b j = Toolbar.this.generateDefaultLayoutParams();
                j.f2099a = 8388611 | (Toolbar.this.f2962d & 112);
                j.f2991b = 2;
                Toolbar.this.f2961c.setLayoutParams(j);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.f2961c);
            }
            Toolbar.this.mo3816k();
            Toolbar.this.requestLayout();
            jVar.mo3132e(true);
            if (Toolbar.this.f2961c instanceof C0728c) {
                ((C0728c) Toolbar.this.f2961c).mo2844a();
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo2992b(C0754h hVar, C0758j jVar) {
            if (Toolbar.this.f2961c instanceof C0728c) {
                ((C0728c) Toolbar.this.f2961c).mo2845b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2961c);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2960b);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2961c = null;
            toolbar3.mo3817l();
            this.f2989b = null;
            Toolbar.this.requestLayout();
            jVar.mo3132e(false);
            return true;
        }
    }
}
