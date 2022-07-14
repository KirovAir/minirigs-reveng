package android.support.design.widget;

import android.content.Context;
import android.support.p026v4.p031c.C0491a;
import android.support.p026v4.p036h.C0594r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* renamed from: android.support.design.widget.e */
abstract class C0374e<V extends View> extends C0387l<V> {

    /* renamed from: a */
    OverScroller f1235a;

    /* renamed from: b */
    private Runnable f1236b;

    /* renamed from: c */
    private boolean f1237c;

    /* renamed from: d */
    private int f1238d = -1;

    /* renamed from: e */
    private int f1239e;

    /* renamed from: f */
    private int f1240f = -1;

    /* renamed from: g */
    private VelocityTracker f1241g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1052a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1067c(V v) {
        return false;
    }

    public C0374e() {
    }

    public C0374e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public boolean mo1120b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1240f < 0) {
            this.f1240f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f1237c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1237c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo1067c(v) && coordinatorLayout.mo1175a((View) v, x, y)) {
                    this.f1239e = y;
                    this.f1238d = motionEvent.getPointerId(0);
                    m1545d();
                    break;
                }
            case 1:
            case 3:
                this.f1237c = false;
                this.f1238d = -1;
                VelocityTracker velocityTracker = this.f1241g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1241g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f1238d;
                if (!(i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1)) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    if (Math.abs(y2 - this.f1239e) > this.f1240f) {
                        this.f1237c = true;
                        this.f1239e = y2;
                        break;
                    }
                }
                break;
        }
        VelocityTracker velocityTracker2 = this.f1241g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f1237c;
    }

    /* renamed from: a */
    public boolean mo1011a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f1240f < 0) {
            this.f1240f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.mo1175a((View) v, (int) motionEvent.getX(), y) && mo1067c(v)) {
                    this.f1239e = y;
                    this.f1238d = motionEvent.getPointerId(0);
                    m1545d();
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.f1241g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.f1241g.computeCurrentVelocity(1000);
                    mo1406a(coordinatorLayout, v, -mo1046a(v), 0, this.f1241g.getYVelocity(this.f1238d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1238d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f1239e - y2;
                    if (this.f1237c || Math.abs(i3) <= (i2 = this.f1240f)) {
                        i = i3;
                    } else {
                        this.f1237c = true;
                        i = i3 > 0 ? i3 - i2 : i3 + i2;
                    }
                    if (this.f1237c) {
                        this.f1239e = y2;
                        mo1408b(coordinatorLayout, v, i, mo1063b(v), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f1237c = false;
        this.f1238d = -1;
        VelocityTracker velocityTracker2 = this.f1241g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f1241g = null;
        }
        VelocityTracker velocityTracker3 = this.f1241g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a_ */
    public int mo1407a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1045a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1045a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int a;
        int b = mo1077b();
        if (i2 == 0 || b < i2 || b > i3 || b == (a = C0491a.m2181a(i, i2, i3))) {
            return 0;
        }
        mo1076a(a);
        return b - a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1043a() {
        return mo1077b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo1408b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1045a(coordinatorLayout, v, mo1043a() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo1406a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f1236b;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f1236b = null;
        }
        if (this.f1235a == null) {
            this.f1235a = new OverScroller(v.getContext());
        }
        this.f1235a.fling(0, mo1077b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f1235a.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f1236b = new C0375a(coordinatorLayout, v);
            C0594r.m2587a((View) v, this.f1236b);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo1052a(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1063b(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1046a(V v) {
        return v.getHeight();
    }

    /* renamed from: d */
    private void m1545d() {
        if (this.f1241g == null) {
            this.f1241g = VelocityTracker.obtain();
        }
    }

    /* renamed from: android.support.design.widget.e$a */
    private class C0375a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f1243b;

        /* renamed from: c */
        private final V f1244c;

        C0375a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1243b = coordinatorLayout;
            this.f1244c = v;
        }

        public void run() {
            if (this.f1244c != null && C0374e.this.f1235a != null) {
                if (C0374e.this.f1235a.computeScrollOffset()) {
                    C0374e eVar = C0374e.this;
                    eVar.mo1407a_(this.f1243b, this.f1244c, eVar.f1235a.getCurrY());
                    C0594r.m2587a((View) this.f1244c, (Runnable) this);
                    return;
                }
                C0374e.this.mo1052a(this.f1243b, this.f1244c);
            }
        }
    }
}
