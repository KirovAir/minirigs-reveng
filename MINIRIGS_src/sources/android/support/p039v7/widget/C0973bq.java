package android.support.p039v7.widget;

import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0598s;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.bq */
class C0973bq implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static C0973bq f3579j;

    /* renamed from: k */
    private static C0973bq f3580k;

    /* renamed from: a */
    private final View f3581a;

    /* renamed from: b */
    private final CharSequence f3582b;

    /* renamed from: c */
    private final int f3583c;

    /* renamed from: d */
    private final Runnable f3584d = new Runnable() {
        public void run() {
            C0973bq.this.mo4805a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f3585e = new Runnable() {
        public void run() {
            C0973bq.this.mo4804a();
        }
    };

    /* renamed from: f */
    private int f3586f;

    /* renamed from: g */
    private int f3587g;

    /* renamed from: h */
    private C0976br f3588h;

    /* renamed from: i */
    private boolean f3589i;

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: a */
    public static void m5160a(View view, CharSequence charSequence) {
        C0973bq bqVar = f3579j;
        if (bqVar != null && bqVar.f3581a == view) {
            m5159a((C0973bq) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0973bq bqVar2 = f3580k;
            if (bqVar2 != null && bqVar2.f3581a == view) {
                bqVar2.mo4804a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0973bq(view, charSequence);
    }

    private C0973bq(View view, CharSequence charSequence) {
        this.f3581a = view;
        this.f3582b = charSequence;
        this.f3583c = C0598s.m2635a(ViewConfiguration.get(this.f3581a.getContext()));
        m5164d();
        this.f3581a.setOnLongClickListener(this);
        this.f3581a.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.f3586f = view.getWidth() / 2;
        this.f3587g = view.getHeight() / 2;
        mo4805a(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3588h != null && this.f3589i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3581a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m5164d();
                mo4804a();
            }
        } else if (this.f3581a.isEnabled() && this.f3588h == null && m5161a(motionEvent)) {
            m5159a(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        mo4804a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4805a(boolean z) {
        long j;
        if (C0594r.m2625z(this.f3581a)) {
            m5159a((C0973bq) null);
            C0973bq bqVar = f3580k;
            if (bqVar != null) {
                bqVar.mo4804a();
            }
            f3580k = this;
            this.f3589i = z;
            this.f3588h = new C0976br(this.f3581a.getContext());
            this.f3588h.mo4813a(this.f3581a, this.f3586f, this.f3587g, this.f3589i, this.f3582b);
            this.f3581a.addOnAttachStateChangeListener(this);
            if (this.f3589i) {
                j = 2500;
            } else if ((C0594r.m2613n(this.f3581a) & 1) == 1) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3581a.removeCallbacks(this.f3585e);
            this.f3581a.postDelayed(this.f3585e, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4804a() {
        if (f3580k == this) {
            f3580k = null;
            C0976br brVar = this.f3588h;
            if (brVar != null) {
                brVar.mo4812a();
                this.f3588h = null;
                m5164d();
                this.f3581a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3579j == this) {
            m5159a((C0973bq) null);
        }
        this.f3581a.removeCallbacks(this.f3585e);
    }

    /* renamed from: a */
    private static void m5159a(C0973bq bqVar) {
        C0973bq bqVar2 = f3579j;
        if (bqVar2 != null) {
            bqVar2.m5163c();
        }
        f3579j = bqVar;
        C0973bq bqVar3 = f3579j;
        if (bqVar3 != null) {
            bqVar3.m5162b();
        }
    }

    /* renamed from: b */
    private void m5162b() {
        this.f3581a.postDelayed(this.f3584d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m5163c() {
        this.f3581a.removeCallbacks(this.f3584d);
    }

    /* renamed from: a */
    private boolean m5161a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f3586f) <= this.f3583c && Math.abs(y - this.f3587g) <= this.f3583c) {
            return false;
        }
        this.f3586f = x;
        this.f3587g = y;
        return true;
    }

    /* renamed from: d */
    private void m5164d() {
        this.f3586f = Integer.MAX_VALUE;
        this.f3587g = Integer.MAX_VALUE;
    }
}
