package android.support.p026v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.C0587k;
import android.support.p026v4.p036h.C0588l;
import android.support.p026v4.p036h.C0590n;
import android.support.p026v4.p036h.C0591o;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p026v4.p036h.p037a.C0569e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0587k, C0590n {

    /* renamed from: w */
    private static final C0609a f1861w = new C0609a();

    /* renamed from: x */
    private static final int[] f1862x = {16843130};

    /* renamed from: A */
    private float f1863A;

    /* renamed from: B */
    private C0610b f1864B;

    /* renamed from: a */
    private long f1865a;

    /* renamed from: b */
    private final Rect f1866b;

    /* renamed from: c */
    private OverScroller f1867c;

    /* renamed from: d */
    private EdgeEffect f1868d;

    /* renamed from: e */
    private EdgeEffect f1869e;

    /* renamed from: f */
    private int f1870f;

    /* renamed from: g */
    private boolean f1871g;

    /* renamed from: h */
    private boolean f1872h;

    /* renamed from: i */
    private View f1873i;

    /* renamed from: j */
    private boolean f1874j;

    /* renamed from: k */
    private VelocityTracker f1875k;

    /* renamed from: l */
    private boolean f1876l;

    /* renamed from: m */
    private boolean f1877m;

    /* renamed from: n */
    private int f1878n;

    /* renamed from: o */
    private int f1879o;

    /* renamed from: p */
    private int f1880p;

    /* renamed from: q */
    private int f1881q;

    /* renamed from: r */
    private final int[] f1882r;

    /* renamed from: s */
    private final int[] f1883s;

    /* renamed from: t */
    private int f1884t;

    /* renamed from: u */
    private int f1885u;

    /* renamed from: v */
    private C0611c f1886v;

    /* renamed from: y */
    private final C0591o f1887y;

    /* renamed from: z */
    private final C0588l f1888z;

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0610b {
        /* renamed from: a */
        void mo2382a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m2684b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    public boolean mo1176a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1866b = new Rect();
        this.f1871g = true;
        this.f1872h = false;
        this.f1873i = null;
        this.f1874j = false;
        this.f1877m = true;
        this.f1881q = -1;
        this.f1882r = new int[2];
        this.f1883s = new int[2];
        m2677a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1862x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1887y = new C0591o(this);
        this.f1888z = new C0588l(this);
        setNestedScrollingEnabled(true);
        C0594r.m2585a((View) this, (C0570b) f1861w);
    }

    /* renamed from: a */
    public boolean mo2322a(int i, int i2) {
        return this.f1888z.mo2278a(i, i2);
    }

    /* renamed from: a */
    public void mo2272a(int i) {
        this.f1888z.mo2286c(i);
    }

    /* renamed from: b */
    public boolean mo2332b(int i) {
        return this.f1888z.mo2277a(i);
    }

    /* renamed from: a */
    public boolean mo2324a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1888z.mo2280a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo2325a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1888z.mo2282a(i, i2, iArr, iArr2, i3);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1888z.mo2273a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1888z.mo2274a();
    }

    public boolean startNestedScroll(int i) {
        return mo2322a(i, 0);
    }

    public void stopNestedScroll() {
        mo2272a(0);
    }

    public boolean hasNestedScrollingParent() {
        return mo2332b(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2324a(i, i2, i3, i4, iArr, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2325a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1888z.mo2276a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1888z.mo2275a(f, f2);
    }

    /* renamed from: b */
    public void mo1181b(View view, View view2, int i, int i2) {
        this.f1887y.mo2290a(view, view2, i, i2);
        mo2322a(2, i2);
    }

    /* renamed from: c */
    public void mo1184c(View view, int i) {
        this.f1887y.mo2288a(view, i);
        mo2272a(i);
    }

    /* renamed from: a */
    public void mo1170a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        mo2324a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    /* renamed from: a */
    public void mo1171a(View view, int i, int i2, int[] iArr, int i3) {
        mo2325a(i, i2, iArr, (int[]) null, i3);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1176a(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1181b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1184c(view, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1170a(view, i, i2, i3, i4, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1171a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2694h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.f1887y.mo2287a();
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: a */
    private void m2677a() {
        this.f1867c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1878n = viewConfiguration.getScaledTouchSlop();
        this.f1879o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1880p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(C0610b bVar) {
        this.f1864B = bVar;
    }

    /* renamed from: b */
    private boolean m2686b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1876l) {
            this.f1876l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1877m = z;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0610b bVar = this.f1864B;
        if (bVar != null) {
            bVar.mo2382a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1876l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2326a(keyEvent);
    }

    /* renamed from: a */
    public boolean mo2326a(KeyEvent keyEvent) {
        this.f1866b.setEmpty();
        int i = 130;
        if (!m2686b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 62) {
                switch (keyCode) {
                    case 19:
                        if (!keyEvent.isAltPressed()) {
                            return mo2349e(33);
                        }
                        return mo2342d(33);
                    case 20:
                        if (!keyEvent.isAltPressed()) {
                            return mo2349e(130);
                        }
                        return mo2342d(130);
                    default:
                        return false;
                }
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo2334c(i);
                return false;
            }
        }
    }

    /* renamed from: d */
    private boolean m2689d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m2687c() {
        VelocityTracker velocityTracker = this.f1875k;
        if (velocityTracker == null) {
            this.f1875k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private void m2688d() {
        if (this.f1875k == null) {
            this.f1875k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m2690e() {
        VelocityTracker velocityTracker = this.f1875k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1875k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2690e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1874j) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (m2689d((int) motionEvent.getX(), y)) {
                        this.f1870f = y;
                        this.f1881q = motionEvent.getPointerId(0);
                        m2687c();
                        this.f1875k.addMovement(motionEvent);
                        this.f1867c.computeScrollOffset();
                        this.f1874j = !this.f1867c.isFinished();
                        mo2322a(2, 0);
                        break;
                    } else {
                        this.f1874j = false;
                        m2690e();
                        break;
                    }
                case 1:
                case 3:
                    this.f1874j = false;
                    this.f1881q = -1;
                    m2690e();
                    if (this.f1867c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0594r.m2598d(this);
                    }
                    mo2272a(0);
                    break;
                case 2:
                    int i2 = this.f1881q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1870f) > this.f1878n && (2 & getNestedScrollAxes()) == 0) {
                                this.f1874j = true;
                                this.f1870f = y2;
                                m2688d();
                                this.f1875k.addMovement(motionEvent);
                                this.f1884t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        } else {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                            break;
                        }
                    }
                    break;
            }
        } else {
            m2678a(motionEvent);
        }
        return this.f1874j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        MotionEvent motionEvent2 = motionEvent;
        m2688d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1884t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f1884t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f1867c.isFinished();
                    this.f1874j = z;
                    if (z && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.f1867c.isFinished()) {
                        this.f1867c.abortAnimation();
                    }
                    this.f1870f = (int) motionEvent.getY();
                    this.f1881q = motionEvent2.getPointerId(0);
                    mo2322a(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.f1875k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1880p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1881q);
                if (Math.abs(yVelocity) > this.f1879o) {
                    m2694h(-yVelocity);
                } else if (this.f1867c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0594r.m2598d(this);
                }
                this.f1881q = -1;
                m2691f();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1881q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f1870f - y;
                    if (mo2325a(0, i2, this.f1883s, this.f1882r, 0)) {
                        i2 -= this.f1883s[1];
                        obtain.offsetLocation(0.0f, (float) this.f1882r[1]);
                        this.f1884t += this.f1882r[1];
                    }
                    if (this.f1874j || Math.abs(i2) <= this.f1878n) {
                        i = i2;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1874j = true;
                        i = i2 > 0 ? i2 - this.f1878n : i2 + this.f1878n;
                    }
                    if (this.f1874j) {
                        this.f1870f = y - this.f1882r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i3 = scrollRange;
                        int i4 = i;
                        int i5 = findPointerIndex;
                        if (mo2323a(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo2332b(0)) {
                            this.f1875k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!mo2324a(0, scrollY2, 0, i4 - scrollY2, this.f1882r, 0)) {
                            if (z2) {
                                m2692g();
                                int i6 = scrollY + i4;
                                if (i6 < 0) {
                                    C0624g.m2783a(this.f1868d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (!this.f1869e.isFinished()) {
                                        this.f1869e.onRelease();
                                    }
                                } else {
                                    int i7 = i5;
                                    if (i6 > i3) {
                                        C0624g.m2783a(this.f1869e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i7) / ((float) getWidth())));
                                        if (!this.f1868d.isFinished()) {
                                            this.f1868d.onRelease();
                                        }
                                    }
                                }
                                EdgeEffect edgeEffect = this.f1868d;
                                if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f1869e.isFinished())) {
                                    C0594r.m2598d(this);
                                    break;
                                }
                            }
                        } else {
                            int i8 = this.f1870f;
                            int[] iArr = this.f1882r;
                            this.f1870f = i8 - iArr[1];
                            obtain.offsetLocation(0.0f, (float) iArr[1]);
                            this.f1884t += this.f1882r[1];
                            break;
                        }
                    }
                } else {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1881q + " in onTouchEvent");
                    break;
                }
                break;
            case 3:
                if (this.f1874j && getChildCount() > 0 && this.f1867c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0594r.m2598d(this);
                }
                this.f1881q = -1;
                m2691f();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f1870f = (int) motionEvent2.getY(actionIndex);
                this.f1881q = motionEvent2.getPointerId(actionIndex);
                break;
            case 6:
                m2678a(motionEvent);
                this.f1870f = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1881q));
                break;
        }
        VelocityTracker velocityTracker2 = this.f1875k;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m2678a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1881q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1870f = (int) motionEvent.getY(i);
            this.f1881q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1875k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1874j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1863A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1863A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1863A;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2323a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i13 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
        } else {
            i13 = i9;
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            i11 = i15;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !mo2332b(1)) {
            this.f1867c.springBack(i13, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i13, i11, z2, z3);
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: a */
    private View m2676a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public boolean mo2334c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1866b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f1866b.top + height > bottom) {
                    this.f1866b.top = bottom - height;
                }
            }
        } else {
            this.f1866b.top = getScrollY() - height;
            if (this.f1866b.top < 0) {
                this.f1866b.top = 0;
            }
        }
        Rect rect = this.f1866b;
        rect.bottom = rect.top + height;
        return m2679a(i, this.f1866b.top, this.f1866b.bottom);
    }

    /* renamed from: d */
    public boolean mo2342d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1866b;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1866b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1866b;
            rect2.top = rect2.bottom - height;
        }
        return m2679a(i, this.f1866b.top, this.f1866b.bottom);
    }

    /* renamed from: a */
    private boolean m2679a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2676a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2693g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo2349e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2682a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2693g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1866b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1866b);
            m2693g(mo2321a(this.f1866b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2681a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: a */
    private boolean m2681a(View view) {
        return !m2682a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2682a(View view, int i, int i2) {
        view.getDrawingRect(this.f1866b);
        offsetDescendantRectToMyCoords(view, this.f1866b);
        return this.f1866b.bottom + i >= getScrollY() && this.f1866b.top - i <= getScrollY() + i2;
    }

    /* renamed from: g */
    private void m2693g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1877m) {
            mo2331b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: b */
    public final void mo2331b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1865a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f1885u = getScrollY();
                OverScroller overScroller = this.f1867c;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                C0594r.m2598d(this);
            } else {
                if (!this.f1867c.isFinished()) {
                    this.f1867c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1865a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo2333c(int i, int i2) {
        mo2331b(i - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        int i;
        if (this.f1867c.computeScrollOffset()) {
            this.f1867c.getCurrX();
            int currY = this.f1867c.getCurrY();
            int i2 = currY - this.f1885u;
            int i3 = mo2325a(0, i2, this.f1883s, (int[]) null, 1) ? i2 - this.f1883s[1] : i2;
            if (i3 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i4 = scrollY;
                mo2323a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i4;
                if (!mo2324a(0, scrollY2, 0, i3 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m2692g();
                        if (currY <= 0 && i4 > 0) {
                            this.f1868d.onAbsorb((int) this.f1867c.getCurrVelocity());
                        } else if (currY >= scrollRange && i4 < scrollRange) {
                            this.f1869e.onAbsorb((int) this.f1867c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f1885u = currY;
            C0594r.m2598d(this);
            return;
        }
        if (mo2332b(1)) {
            mo2272a(1);
            i = 0;
        } else {
            i = 0;
        }
        this.f1885u = i;
    }

    /* renamed from: b */
    private void m2685b(View view) {
        view.getDrawingRect(this.f1866b);
        offsetDescendantRectToMyCoords(view, this.f1866b);
        int a = mo2321a(this.f1866b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    private boolean m2680a(Rect rect, boolean z) {
        int a = mo2321a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2331b(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2321a(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = (rect.top - scrollY) + 0;
            } else {
                i2 = (rect.bottom - i4) + 0;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1871g) {
            m2685b(view2);
        } else {
            this.f1873i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m2681a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2680a(rect, z);
    }

    public void requestLayout() {
        this.f1871g = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1871g = false;
        View view = this.f1873i;
        if (view != null && m2683a(view, (View) this)) {
            m2685b(this.f1873i);
        }
        this.f1873i = null;
        if (!this.f1872h) {
            if (this.f1886v != null) {
                scrollTo(getScrollX(), this.f1886v.f1889a);
                this.f1886v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m2684b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1872h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1872h = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2682a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1866b);
            offsetDescendantRectToMyCoords(findFocus, this.f1866b);
            m2693g(mo2321a(this.f1866b));
        }
    }

    /* renamed from: a */
    private static boolean m2683a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2683a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo2350f(int i) {
        if (getChildCount() > 0) {
            mo2322a(2, 1);
            this.f1867c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1885u = getScrollY();
            C0594r.m2598d(this);
        }
    }

    /* renamed from: h */
    private void m2694h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo2350f(i);
        }
    }

    /* renamed from: f */
    private void m2691f() {
        this.f1874j = false;
        m2690e();
        mo2272a(0);
        EdgeEffect edgeEffect = this.f1868d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1869e.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = m2684b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = m2684b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    /* renamed from: g */
    private void m2692g() {
        if (getOverScrollMode() == 2) {
            this.f1868d = null;
            this.f1869e = null;
        } else if (this.f1868d == null) {
            Context context = getContext();
            this.f1868d = new EdgeEffect(context);
            this.f1869e = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1868d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1868d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1868d.setSize(width, height);
                if (this.f1868d.draw(canvas)) {
                    C0594r.m2598d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1869e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1869e.setSize(width2, height2);
                if (this.f1869e.draw(canvas)) {
                    C0594r.m2598d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0611c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0611c cVar = (C0611c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1886v = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0611c cVar = new C0611c(super.onSaveInstanceState());
        cVar.f1889a = getScrollY();
        return cVar;
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C0611c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0611c> CREATOR = new Parcelable.Creator<C0611c>() {
            /* renamed from: a */
            public C0611c createFromParcel(Parcel parcel) {
                return new C0611c(parcel);
            }

            /* renamed from: a */
            public C0611c[] newArray(int i) {
                return new C0611c[i];
            }
        };

        /* renamed from: a */
        public int f1889a;

        C0611c(Parcelable parcelable) {
            super(parcelable);
        }

        C0611c(Parcel parcel) {
            super(parcel);
            this.f1889a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1889a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1889a + "}";
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0609a extends C0570b {
        C0609a() {
        }

        /* renamed from: a */
        public boolean mo1110a(View view, int i, Bundle bundle) {
            if (super.mo1110a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2333c(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2333c(0, max);
                return true;
            }
        }

        /* renamed from: a */
        public void mo981a(View view, C0563c cVar) {
            int scrollRange;
            super.mo981a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo2202a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo2209c(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo2200a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo2200a(4096);
                }
            }
        }

        /* renamed from: a */
        public void mo1161a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1161a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0569e.m2498a(accessibilityEvent, nestedScrollView.getScrollX());
            C0569e.m2499b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }
}
