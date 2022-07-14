package android.support.design.p020d;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.design.d.c */
public final class C0286c {

    /* renamed from: a */
    private final View f866a;

    /* renamed from: b */
    private boolean f867b;

    /* renamed from: c */
    private int f868c;

    /* renamed from: a */
    public boolean mo930a() {
        return this.f867b;
    }

    /* renamed from: b */
    public Bundle mo931b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f867b);
        bundle.putInt("expandedComponentIdHint", this.f868c);
        return bundle;
    }

    /* renamed from: a */
    public void mo929a(Bundle bundle) {
        this.f867b = bundle.getBoolean("expanded", false);
        this.f868c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f867b) {
            m1028d();
        }
    }

    /* renamed from: a */
    public void mo928a(int i) {
        this.f868c = i;
    }

    /* renamed from: c */
    public int mo932c() {
        return this.f868c;
    }

    /* renamed from: d */
    private void m1028d() {
        ViewParent parent = this.f866a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo1178b(this.f866a);
        }
    }
}
