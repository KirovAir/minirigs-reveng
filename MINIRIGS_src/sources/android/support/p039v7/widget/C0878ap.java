package android.support.p039v7.widget;

import android.os.SystemClock;
import android.support.p039v7.view.menu.C0776s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.ap */
public abstract class C0878ap implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f3143a;

    /* renamed from: b */
    private final int f3144b;

    /* renamed from: c */
    final View f3145c;

    /* renamed from: d */
    private final int f3146d;

    /* renamed from: e */
    private Runnable f3147e;

    /* renamed from: f */
    private Runnable f3148f;

    /* renamed from: g */
    private boolean f3149g;

    /* renamed from: h */
    private int f3150h;

    /* renamed from: i */
    private final int[] f3151i = new int[2];

    /* renamed from: a */
    public abstract C0776s mo2921a();

    public void onViewAttachedToWindow(View view) {
    }

    public C0878ap(View view) {
        this.f3145c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3143a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3144b = ViewConfiguration.getTapTimeout();
        this.f3146d = (this.f3144b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3149g;
        if (z2) {
            z = m4341b(motionEvent) || !mo4060c();
        } else {
            z = m4338a(motionEvent) && mo2922b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3145c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3149g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3149g = false;
        this.f3150h = -1;
        Runnable runnable = this.f3147e;
        if (runnable != null) {
            this.f3145c.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2922b() {
        C0776s a = mo2921a();
        if (a == null || a.mo3008d()) {
            return true;
        }
        a.mo2998a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4060c() {
        C0776s a = mo2921a();
        if (a == null || !a.mo3008d()) {
            return true;
        }
        a.mo3005c();
        return true;
    }

    /* renamed from: a */
    private boolean m4338a(MotionEvent motionEvent) {
        View view = this.f3145c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3150h = motionEvent.getPointerId(0);
                if (this.f3147e == null) {
                    this.f3147e = new C0879a();
                }
                view.postDelayed(this.f3147e, (long) this.f3144b);
                if (this.f3148f == null) {
                    this.f3148f = new C0880b();
                }
                view.postDelayed(this.f3148f, (long) this.f3146d);
                break;
            case 1:
            case 3:
                m4343e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3150h);
                if (findPointerIndex >= 0 && !m4339a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f3143a)) {
                    m4343e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
        }
        return false;
    }

    /* renamed from: e */
    private void m4343e() {
        Runnable runnable = this.f3148f;
        if (runnable != null) {
            this.f3145c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3147e;
        if (runnable2 != null) {
            this.f3145c.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4061d() {
        m4343e();
        View view = this.f3145c;
        if (view.isEnabled() && !view.isLongClickable() && mo2922b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3149g = true;
        }
    }

    /* renamed from: b */
    private boolean m4341b(MotionEvent motionEvent) {
        C0868am amVar;
        View view = this.f3145c;
        C0776s a = mo2921a();
        if (a == null || !a.mo3008d() || (amVar = (C0868am) a.mo3009e()) == null || !amVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m4342b(view, obtainNoHistory);
        m4340a(amVar, obtainNoHistory);
        boolean a2 = amVar.mo4027a(obtainNoHistory, this.f3150h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m4339a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m4340a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3151i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m4342b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3151i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: android.support.v7.widget.ap$a */
    private class C0879a implements Runnable {
        C0879a() {
        }

        public void run() {
            ViewParent parent = C0878ap.this.f3145c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    private class C0880b implements Runnable {
        C0880b() {
        }

        public void run() {
            C0878ap.this.mo4061d();
        }
    }
}
