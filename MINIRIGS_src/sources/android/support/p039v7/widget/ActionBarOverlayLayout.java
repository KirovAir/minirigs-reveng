package android.support.p039v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p036h.C0589m;
import android.support.p026v4.p036h.C0591o;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0770o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0589m, C0854ai {

    /* renamed from: e */
    static final int[] f2671e = {C0639a.C0640a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f2672A = new Runnable() {
        public void run() {
            ActionBarOverlayLayout.this.mo3354d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2676c = actionBarOverlayLayout.f2674a.animate().translationY((float) (-ActionBarOverlayLayout.this.f2674a.getHeight())).setListener(ActionBarOverlayLayout.this.f2677d);
        }
    };

    /* renamed from: B */
    private final C0591o f2673B;

    /* renamed from: a */
    ActionBarContainer f2674a;

    /* renamed from: b */
    boolean f2675b;

    /* renamed from: c */
    ViewPropertyAnimator f2676c;

    /* renamed from: d */
    final AnimatorListenerAdapter f2677d = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2676c = null;
            actionBarOverlayLayout.f2675b = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2676c = null;
            actionBarOverlayLayout.f2675b = false;
        }
    };

    /* renamed from: f */
    private int f2678f;

    /* renamed from: g */
    private int f2679g = 0;

    /* renamed from: h */
    private ContentFrameLayout f2680h;

    /* renamed from: i */
    private C0855aj f2681i;

    /* renamed from: j */
    private Drawable f2682j;

    /* renamed from: k */
    private boolean f2683k;

    /* renamed from: l */
    private boolean f2684l;

    /* renamed from: m */
    private boolean f2685m;

    /* renamed from: n */
    private boolean f2686n;

    /* renamed from: o */
    private int f2687o;

    /* renamed from: p */
    private int f2688p;

    /* renamed from: q */
    private final Rect f2689q = new Rect();

    /* renamed from: r */
    private final Rect f2690r = new Rect();

    /* renamed from: s */
    private final Rect f2691s = new Rect();

    /* renamed from: t */
    private final Rect f2692t = new Rect();

    /* renamed from: u */
    private final Rect f2693u = new Rect();

    /* renamed from: v */
    private final Rect f2694v = new Rect();

    /* renamed from: w */
    private final Rect f2695w = new Rect();

    /* renamed from: x */
    private C0786a f2696x;

    /* renamed from: y */
    private OverScroller f2697y;

    /* renamed from: z */
    private final Runnable f2698z = new Runnable() {
        public void run() {
            ActionBarOverlayLayout.this.mo3354d();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2676c = actionBarOverlayLayout.f2674a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2677d);
        }
    };

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0786a {
        /* renamed from: a */
        void mo2682a(int i);

        /* renamed from: g */
        void mo2685g(boolean z);

        /* renamed from: j */
        void mo2690j();

        /* renamed from: k */
        void mo2692k();

        /* renamed from: l */
        void mo2693l();

        /* renamed from: m */
        void mo2694m();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3629a(context);
        this.f2673B = new C0591o(this);
    }

    /* renamed from: a */
    private void m3629a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2671e);
        boolean z = false;
        this.f2678f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2682j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2682j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2683k = z;
        this.f2697y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3354d();
    }

    public void setActionBarVisibilityCallback(C0786a aVar) {
        this.f2696x = aVar;
        if (getWindowToken() != null) {
            this.f2696x.mo2682a(this.f2679g);
            int i = this.f2688p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0594r.m2614o(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f2684l = z;
        this.f2683k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: a */
    public boolean mo3350a() {
        return this.f2684l;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2685m = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3629a(getContext());
        C0594r.m2614o(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo3352c();
        int i2 = this.f2688p ^ i;
        this.f2688p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0786a aVar = this.f2696x;
        if (aVar != null) {
            aVar.mo2685g(!z);
            if (z2 || !z) {
                this.f2696x.mo2690j();
            } else {
                this.f2696x.mo2692k();
            }
        }
        if ((i2 & 256) != 0 && this.f2696x != null) {
            C0594r.m2614o(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2679g = i;
        C0786a aVar = this.f2696x;
        if (aVar != null) {
            aVar.mo2682a(i);
        }
    }

    /* renamed from: a */
    private boolean m3631a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0787b bVar = (C0787b) view.getLayoutParams();
        if (!z || bVar.leftMargin == rect.left) {
            z5 = false;
        } else {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo3352c();
        int n = C0594r.m2613n(this) & 256;
        boolean a = m3631a(this.f2674a, rect, true, true, false, true);
        this.f2692t.set(rect);
        C0984bv.m5211a(this, this.f2692t, this.f2689q);
        if (!this.f2693u.equals(this.f2692t)) {
            this.f2693u.set(this.f2692t);
            a = true;
        }
        if (!this.f2690r.equals(this.f2689q)) {
            this.f2690r.set(this.f2689q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0787b generateDefaultLayoutParams() {
        return new C0787b(-1, -1);
    }

    /* renamed from: a */
    public C0787b generateLayoutParams(AttributeSet attributeSet) {
        return new C0787b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0787b(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0787b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo3352c();
        measureChildWithMargins(this.f2674a, i, 0, i2, 0);
        C0787b bVar = (C0787b) this.f2674a.getLayoutParams();
        int max = Math.max(0, this.f2674a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f2674a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2674a.getMeasuredState());
        boolean z = (C0594r.m2613n(this) & 256) != 0;
        if (z) {
            i3 = this.f2678f;
            if (this.f2685m && this.f2674a.getTabContainer() != null) {
                i3 += this.f2678f;
            }
        } else {
            i3 = this.f2674a.getVisibility() != 8 ? this.f2674a.getMeasuredHeight() : 0;
        }
        this.f2691s.set(this.f2689q);
        this.f2694v.set(this.f2692t);
        if (this.f2684l || z) {
            this.f2694v.top += i3;
            this.f2694v.bottom += 0;
        } else {
            this.f2691s.top += i3;
            this.f2691s.bottom += 0;
        }
        m3631a(this.f2680h, this.f2691s, true, true, true, true);
        if (!this.f2695w.equals(this.f2694v)) {
            this.f2695w.set(this.f2694v);
            this.f2680h.mo3495a(this.f2694v);
        }
        measureChildWithMargins(this.f2680h, i, 0, i2, 0);
        C0787b bVar2 = (C0787b) this.f2680h.getLayoutParams();
        int max3 = Math.max(max, this.f2680h.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f2680h.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2680h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0787b bVar = (C0787b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2682j != null && !this.f2683k) {
            int bottom = this.f2674a.getVisibility() == 0 ? (int) (((float) this.f2674a.getBottom()) + this.f2674a.getTranslationY() + 0.5f) : 0;
            this.f2682j.setBounds(0, bottom, getWidth(), this.f2682j.getIntrinsicHeight() + bottom);
            this.f2682j.draw(canvas);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2674a.getVisibility() != 0) {
            return false;
        }
        return this.f2686n;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2673B.mo2289a(view, view2, i);
        this.f2687o = getActionBarHideOffset();
        mo3354d();
        C0786a aVar = this.f2696x;
        if (aVar != null) {
            aVar.mo2693l();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2687o += i2;
        setActionBarHideOffset(this.f2687o);
    }

    public void onStopNestedScroll(View view) {
        if (this.f2686n && !this.f2675b) {
            if (this.f2687o <= this.f2674a.getHeight()) {
                m3632l();
            } else {
                m3633m();
            }
        }
        C0786a aVar = this.f2696x;
        if (aVar != null) {
            aVar.mo2694m();
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2686n || !z) {
            return false;
        }
        if (m3630a(f, f2)) {
            m3635o();
        } else {
            m3634n();
        }
        this.f2675b = true;
        return true;
    }

    public int getNestedScrollAxes() {
        return this.f2673B.mo2287a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3352c() {
        if (this.f2680h == null) {
            this.f2680h = (ContentFrameLayout) findViewById(C0639a.C0645f.action_bar_activity_content);
            this.f2674a = (ActionBarContainer) findViewById(C0639a.C0645f.action_bar_container);
            this.f2681i = m3628a(findViewById(C0639a.C0645f.action_bar));
        }
    }

    /* renamed from: a */
    private C0855aj m3628a(View view) {
        if (view instanceof C0855aj) {
            return (C0855aj) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2686n) {
            this.f2686n = z;
            if (!z) {
                mo3354d();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2674a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        mo3354d();
        this.f2674a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2674a.getHeight()))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3354d() {
        removeCallbacks(this.f2698z);
        removeCallbacks(this.f2672A);
        ViewPropertyAnimator viewPropertyAnimator = this.f2676c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: l */
    private void m3632l() {
        mo3354d();
        postDelayed(this.f2698z, 600);
    }

    /* renamed from: m */
    private void m3633m() {
        mo3354d();
        postDelayed(this.f2672A, 600);
    }

    /* renamed from: n */
    private void m3634n() {
        mo3354d();
        this.f2698z.run();
    }

    /* renamed from: o */
    private void m3635o() {
        mo3354d();
        this.f2672A.run();
    }

    /* renamed from: a */
    private boolean m3630a(float f, float f2) {
        this.f2697y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2697y.getFinalY() > this.f2674a.getHeight();
    }

    public void setWindowCallback(Window.Callback callback) {
        mo3352c();
        this.f2681i.mo3973a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo3352c();
        this.f2681i.mo3974a(charSequence);
    }

    public CharSequence getTitle() {
        mo3352c();
        return this.f2681i.mo3983e();
    }

    /* renamed from: a */
    public void mo3348a(int i) {
        mo3352c();
        if (i == 2) {
            this.f2681i.mo3984f();
        } else if (i == 5) {
            this.f2681i.mo3985g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        mo3352c();
        this.f2681i.mo3968a(i);
    }

    public void setIcon(Drawable drawable) {
        mo3352c();
        this.f2681i.mo3969a(drawable);
    }

    public void setLogo(int i) {
        mo3352c();
        this.f2681i.mo3977b(i);
    }

    /* renamed from: e */
    public boolean mo3356e() {
        mo3352c();
        return this.f2681i.mo3986h();
    }

    /* renamed from: f */
    public boolean mo3357f() {
        mo3352c();
        return this.f2681i.mo3987i();
    }

    /* renamed from: g */
    public boolean mo3359g() {
        mo3352c();
        return this.f2681i.mo3988j();
    }

    /* renamed from: h */
    public boolean mo3366h() {
        mo3352c();
        return this.f2681i.mo3989k();
    }

    /* renamed from: i */
    public boolean mo3367i() {
        mo3352c();
        return this.f2681i.mo3990l();
    }

    /* renamed from: j */
    public void mo3368j() {
        mo3352c();
        this.f2681i.mo3991m();
    }

    /* renamed from: a */
    public void mo3349a(Menu menu, C0770o.C0771a aVar) {
        mo3352c();
        this.f2681i.mo3972a(menu, aVar);
    }

    /* renamed from: k */
    public void mo3369k() {
        mo3352c();
        this.f2681i.mo3992n();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0787b extends ViewGroup.MarginLayoutParams {
        public C0787b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0787b(int i, int i2) {
            super(i, i2);
        }

        public C0787b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
