package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0241a;
import android.support.design.p016a.C0251a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.p031c.C0491a;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0586j;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0608z;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.C0347c(mo1237a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f982a;

    /* renamed from: b */
    private int f983b;

    /* renamed from: c */
    private int f984c;

    /* renamed from: d */
    private boolean f985d;

    /* renamed from: e */
    private int f986e;

    /* renamed from: f */
    private C0608z f987f;

    /* renamed from: g */
    private List<C0318a> f988g;

    /* renamed from: h */
    private boolean f989h;

    /* renamed from: i */
    private boolean f990i;

    /* renamed from: j */
    private boolean f991j;

    /* renamed from: k */
    private boolean f992k;

    /* renamed from: l */
    private int[] f993l;

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public interface C0318a<T extends AppBarLayout> {
        /* renamed from: a */
        void mo1083a(T t, int i);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1136g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m1136g();
        boolean z2 = false;
        this.f985d = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0319b) getChildAt(i5).getLayoutParams()).mo1085b() != null) {
                this.f985d = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f989h) {
            if (this.f992k || m1135f()) {
                z2 = true;
            }
            m1134b(z2);
        }
    }

    /* renamed from: f */
    private boolean m1135f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0319b) getChildAt(i).getLayoutParams()).mo1086c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m1136g() {
        this.f982a = -1;
        this.f983b = -1;
        this.f984c = -1;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean z) {
        mo1018a(z, C0594r.m2622w(this));
    }

    /* renamed from: a */
    public void mo1018a(boolean z, boolean z2) {
        m1133a(z, z2, true);
    }

    /* renamed from: a */
    private void m1133a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f986e = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0319b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0319b generateDefaultLayoutParams() {
        return new C0319b(-1, -2);
    }

    /* renamed from: a */
    public C0319b generateLayoutParams(AttributeSet attributeSet) {
        return new C0319b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0319b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C0319b((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0319b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0319b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1020b() {
        return this.f985d;
    }

    public final int getTotalScrollRange() {
        int i = this.f982a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0319b bVar = (C0319b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f1008a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0594r.m2609j(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f982a = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1021c() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i = this.f983b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0319b bVar = (C0319b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = bVar.f1008a;
            if ((i3 & 5) == 5) {
                int i4 = i2 + bVar.topMargin + bVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 = i4 + C0594r.m2609j(childAt);
                } else if ((i3 & 2) != 0) {
                    i2 = i4 + (measuredHeight - C0594r.m2609j(childAt));
                } else {
                    i2 = i4 + (measuredHeight - getTopInset());
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.f983b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f984c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0319b bVar = (C0319b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i4 = bVar.f1008a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0594r.m2609j(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f984c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1017a(int i) {
        List<C0318a> list = this.f988g;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0318a aVar = this.f988g.get(i2);
                if (aVar != null) {
                    aVar.mo1083a(this, i);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int j = C0594r.m2609j(this);
        if (j != 0) {
            return (j * 2) + topInset;
        }
        int childCount = getChildCount();
        int j2 = childCount >= 1 ? C0594r.m2609j(getChildAt(childCount - 1)) : 0;
        if (j2 != 0) {
            return (j2 * 2) + topInset;
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f993l == null) {
            this.f993l = new int[4];
        }
        int[] iArr = this.f993l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f990i ? C0241a.C0243b.state_liftable : -C0241a.C0243b.state_liftable;
        iArr[1] = (!this.f990i || !this.f991j) ? -C0241a.C0243b.state_lifted : C0241a.C0243b.state_lifted;
        iArr[2] = this.f990i ? C0241a.C0243b.state_collapsible : -C0241a.C0243b.state_collapsible;
        iArr[3] = (!this.f990i || !this.f991j) ? -C0241a.C0243b.state_collapsed : C0241a.C0243b.state_collapsed;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* renamed from: b */
    private boolean m1134b(boolean z) {
        if (this.f990i == z) {
            return false;
        }
        this.f990i = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1019a(boolean z) {
        if (this.f991j == z) {
            return false;
        }
        this.f991j = z;
        refreshDrawableState();
        return true;
    }

    public void setLiftOnScroll(boolean z) {
        this.f992k = z;
    }

    /* renamed from: d */
    public boolean mo1023d() {
        return this.f992k;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0389n.m1617a(this, f);
        }
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f986e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1024e() {
        this.f986e = 0;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0608z zVar = this.f987f;
        if (zVar != null) {
            return zVar.mo2315b();
        }
        return 0;
    }

    /* renamed from: android.support.design.widget.AppBarLayout$b */
    public static class C0319b extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f1008a = 1;

        /* renamed from: b */
        Interpolator f1009b;

        public C0319b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.AppBarLayout_Layout);
            this.f1008a = obtainStyledAttributes.getInt(C0241a.C0250i.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0241a.C0250i.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f1009b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0241a.C0250i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0319b(int i, int i2) {
            super(i, i2);
        }

        public C0319b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0319b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0319b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo1084a() {
            return this.f1008a;
        }

        /* renamed from: b */
        public Interpolator mo1085b() {
            return this.f1009b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1086c() {
            int i = this.f1008a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1048a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1053a(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1049a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo1054a(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1050a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.mo1055a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1051a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo1056a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1076a(int i) {
            return super.mo1076a(i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1058a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo836a(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1059a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1061a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1060a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo867a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo1077b() {
            return super.mo1077b();
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Parcelable mo1064b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1065b(coordinatorLayout, appBarLayout);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends C0374e<T> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f994b;

        /* renamed from: c */
        private int f995c;

        /* renamed from: d */
        private ValueAnimator f996d;

        /* renamed from: e */
        private int f997e = -1;

        /* renamed from: f */
        private boolean f998f;

        /* renamed from: g */
        private float f999g;

        /* renamed from: h */
        private WeakReference<View> f1000h;

        /* renamed from: i */
        private C0315a f1001i;

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$a */
        public static abstract class C0315a<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo1069a(T t);
        }

        /* renamed from: a */
        private static boolean m1154a(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo867a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo1023d() || m1155a(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f996d) != null) {
                valueAnimator.cancel();
            }
            this.f1000h = null;
            this.f995c = i2;
            return z;
        }

        /* renamed from: a */
        private boolean m1155a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo1021c() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: a */
        public void mo1056a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo1408b(coordinatorLayout, t, i2, i5, i4);
                    m1150a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: a */
        public void mo1055a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo1408b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m1150a(i4, t, view, i5);
            }
            if (t.mo1023d()) {
                t.mo1019a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        private void m1150a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int a = mo1043a();
                if ((i < 0 && a == 0) || (i > 0 && a == (-t.getDownNestedScrollRange()))) {
                    C0594r.m2599d(view, 1);
                }
            }
        }

        /* renamed from: a */
        public void mo1054a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f995c == 0 || i == 1) {
                m1158c(coordinatorLayout, t);
            }
            this.f1000h = new WeakReference<>(view);
        }

        /* renamed from: a */
        private void m1151a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo1043a() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m1152a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m1152a(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int a = mo1043a();
            if (a == i) {
                ValueAnimator valueAnimator = this.f996d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f996d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f996d;
            if (valueAnimator2 == null) {
                this.f996d = new ValueAnimator();
                this.f996d.setInterpolator(C0251a.f767e);
                this.f996d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.mo1407a_(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f996d.setDuration((long) Math.min(i2, 600));
            this.f996d.setIntValues(new int[]{a, i});
            this.f996d.start();
        }

        /* renamed from: a */
        private int m1148a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0319b bVar = (C0319b) childAt.getLayoutParams();
                if (m1154a(bVar.mo1084a(), 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private void m1158c(CoordinatorLayout coordinatorLayout, T t) {
            int a = mo1043a();
            int a2 = m1148a(t, a);
            if (a2 >= 0) {
                View childAt = t.getChildAt(a2);
                C0319b bVar = (C0319b) childAt.getLayoutParams();
                int a3 = bVar.mo1084a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m1154a(a3, 2)) {
                        i2 += C0594r.m2609j(childAt);
                    } else if (m1154a(a3, 5)) {
                        int j = C0594r.m2609j(childAt) + i2;
                        if (a < j) {
                            i = j;
                        } else {
                            i2 = j;
                        }
                    }
                    if (m1154a(a3, 32)) {
                        i += bVar.topMargin;
                        i2 -= bVar.bottomMargin;
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m1151a(coordinatorLayout, t, C0491a.m2181a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1061a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0349e) t.getLayoutParams()).height != -2) {
                return super.mo1061a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo1169a((View) t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo836a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo836a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f997e;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f998f) {
                    i2 = i4 + C0594r.m2609j(childAt) + t.getTopInset();
                } else {
                    i2 = i4 + Math.round(((float) childAt.getHeight()) * this.f999g);
                }
                mo1407a_(coordinatorLayout, t, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m1151a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo1407a_(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1151a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo1407a_(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo1024e();
            this.f997e = -1;
            mo1076a(C0491a.m2181a(mo1077b(), -t.getTotalScrollRange(), 0));
            m1153a(coordinatorLayout, t, mo1077b(), 0, true);
            t.mo1017a(mo1077b());
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1067c(T t) {
            C0315a aVar = this.f1001i;
            if (aVar != null) {
                return aVar.mo1069a(t);
            }
            WeakReference<View> weakReference = this.f1000h;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1052a(CoordinatorLayout coordinatorLayout, T t) {
            m1158c(coordinatorLayout, t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo1063b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo1046a(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1045a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int a = mo1043a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f994b = 0;
            } else {
                int a2 = C0491a.m2181a(i, i2, i3);
                if (a != a2) {
                    int b = t.mo1020b() ? m1156b(t, a2) : a2;
                    boolean a3 = mo1076a(b);
                    i4 = a - a2;
                    this.f994b = a2 - b;
                    if (!a3 && t.mo1020b()) {
                        coordinatorLayout.mo1178b((View) t);
                    }
                    t.mo1017a(mo1077b());
                    m1153a(coordinatorLayout, t, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* renamed from: b */
        private int m1156b(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C0319b bVar = (C0319b) childAt.getLayoutParams();
                Interpolator b = bVar.mo1085b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = bVar.mo1084a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + bVar.topMargin + bVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0594r.m2609j(childAt);
                        }
                    }
                    if (C0594r.m2615p(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1153a(android.support.design.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m1157c((android.support.design.widget.AppBarLayout) r7, (int) r8)
                if (r0 == 0) goto L_0x0073
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                android.support.design.widget.AppBarLayout$b r1 = (android.support.design.widget.AppBarLayout.C0319b) r1
                int r1 = r1.mo1084a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0046
                int r2 = android.support.p026v4.p036h.C0594r.m2609j(r0)
                if (r9 <= 0) goto L_0x0031
                r9 = r1 & 12
                if (r9 == 0) goto L_0x0031
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x002f
                r8 = 1
                goto L_0x0047
            L_0x002f:
                r8 = 0
                goto L_0x0047
            L_0x0031:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0046
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0044
                r8 = 1
                goto L_0x0047
            L_0x0044:
                r8 = 0
                goto L_0x0047
            L_0x0046:
                r8 = 0
            L_0x0047:
                boolean r9 = r7.mo1023d()
                if (r9 == 0) goto L_0x005c
                android.view.View r9 = r5.m1149a((android.support.design.widget.CoordinatorLayout) r6)
                if (r9 == 0) goto L_0x005c
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x005b
                r8 = 1
                goto L_0x005c
            L_0x005b:
                r8 = 0
            L_0x005c:
                boolean r8 = r7.mo1019a((boolean) r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x0073
                if (r10 != 0) goto L_0x0070
                if (r8 == 0) goto L_0x0073
                boolean r6 = r5.m1159d(r6, r7)
                if (r6 == 0) goto L_0x0073
            L_0x0070:
                r7.jumpDrawablesToCurrentState()
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.m1153a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: d */
        private boolean m1159d(CoordinatorLayout coordinatorLayout, T t) {
            List<View> d = coordinatorLayout.mo1188d((View) t);
            int size = d.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C0346b b = ((CoordinatorLayout.C0349e) d.get(i).getLayoutParams()).mo1248b();
                if (!(b instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) b).mo1414d() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: c */
        private static View m1157c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private View m1149a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C0586j) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1043a() {
            return mo1077b() + this.f994b;
        }

        /* renamed from: b */
        public Parcelable mo1065b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable b = super.mo1065b(coordinatorLayout, t);
            int b2 = mo1077b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    C0316b bVar = new C0316b(b);
                    bVar.f1005a = i;
                    if (bottom == C0594r.m2609j(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.f1007c = z;
                    bVar.f1006b = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return b;
        }

        /* renamed from: a */
        public void mo1053a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C0316b) {
                C0316b bVar = (C0316b) parcelable;
                super.mo1053a(coordinatorLayout, t, bVar.mo2188a());
                this.f997e = bVar.f1005a;
                this.f999g = bVar.f1006b;
                this.f998f = bVar.f1007c;
                return;
            }
            super.mo1053a(coordinatorLayout, t, parcelable);
            this.f997e = -1;
        }

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$b */
        protected static class C0316b extends C0556a {
            public static final Parcelable.Creator<C0316b> CREATOR = new Parcelable.ClassLoaderCreator<C0316b>() {
                /* renamed from: a */
                public C0316b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0316b(parcel, classLoader);
                }

                /* renamed from: a */
                public C0316b createFromParcel(Parcel parcel) {
                    return new C0316b(parcel, (ClassLoader) null);
                }

                /* renamed from: a */
                public C0316b[] newArray(int i) {
                    return new C0316b[i];
                }
            };

            /* renamed from: a */
            int f1005a;

            /* renamed from: b */
            float f1006b;

            /* renamed from: c */
            boolean f1007c;

            public C0316b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1005a = parcel.readInt();
                this.f1006b = parcel.readFloat();
                this.f1007c = parcel.readByte() != 0;
            }

            public C0316b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f1005a);
                parcel.writeFloat(this.f1006b);
                parcel.writeByte(this.f1007c ? (byte) 1 : 0);
            }
        }
    }

    public static class ScrollingViewBehavior extends C0376f {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1076a(int i) {
            return super.mo1076a(i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo836a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo836a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1061a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1061a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo1077b() {
            return super.mo1077b();
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.ScrollingViewBehavior_Layout);
            mo1411b(obtainStyledAttributes.getDimensionPixelSize(C0241a.C0250i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo997a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public boolean mo999b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m1202a(view, view2);
            m1203b(view, view2);
            return false;
        }

        /* renamed from: a */
        public boolean mo1080a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo1082b(coordinatorLayout.mo1182c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1245a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo1018a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m1202a(View view, View view2) {
            CoordinatorLayout.C0346b b = ((CoordinatorLayout.C0349e) view2.getLayoutParams()).mo1248b();
            if (b instanceof BaseBehavior) {
                C0594r.m2601e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) b).f994b) + mo1410a()) - mo1413c(view2));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo1078a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m1201a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a */
        private static int m1201a(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0346b b = ((CoordinatorLayout.C0349e) appBarLayout.getLayoutParams()).mo1248b();
            if (b instanceof BaseBehavior) {
                return ((BaseBehavior) b).mo1043a();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout mo1082b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo1081b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo1081b(view);
        }

        /* renamed from: b */
        private void m1203b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo1023d()) {
                    appBarLayout.mo1019a(view.getScrollY() > 0);
                }
            }
        }
    }
}
