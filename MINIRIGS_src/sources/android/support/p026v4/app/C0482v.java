package android.support.p026v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.v */
class C0482v implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f1622a;

    /* renamed from: b */
    private ViewTreeObserver f1623b;

    /* renamed from: c */
    private final Runnable f1624c;

    private C0482v(View view, Runnable runnable) {
        this.f1622a = view;
        this.f1623b = view.getViewTreeObserver();
        this.f1624c = runnable;
    }

    /* renamed from: a */
    public static C0482v m2163a(View view, Runnable runnable) {
        C0482v vVar = new C0482v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    public boolean onPreDraw() {
        mo1873a();
        this.f1624c.run();
        return true;
    }

    /* renamed from: a */
    public void mo1873a() {
        if (this.f1623b.isAlive()) {
            this.f1623b.removeOnPreDrawListener(this);
        } else {
            this.f1622a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1622a.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
        this.f1623b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1873a();
    }
}
