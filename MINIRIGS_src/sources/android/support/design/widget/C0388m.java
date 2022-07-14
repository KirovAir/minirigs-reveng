package android.support.design.widget;

import android.support.p026v4.p036h.C0594r;
import android.view.View;

/* renamed from: android.support.design.widget.m */
class C0388m {

    /* renamed from: a */
    private final View f1285a;

    /* renamed from: b */
    private int f1286b;

    /* renamed from: c */
    private int f1287c;

    /* renamed from: d */
    private int f1288d;

    /* renamed from: e */
    private int f1289e;

    public C0388m(View view) {
        this.f1285a = view;
    }

    /* renamed from: a */
    public void mo1438a() {
        this.f1286b = this.f1285a.getTop();
        this.f1287c = this.f1285a.getLeft();
        m1612c();
    }

    /* renamed from: c */
    private void m1612c() {
        View view = this.f1285a;
        C0594r.m2601e(view, this.f1288d - (view.getTop() - this.f1286b));
        View view2 = this.f1285a;
        C0594r.m2603f(view2, this.f1289e - (view2.getLeft() - this.f1287c));
    }

    /* renamed from: a */
    public boolean mo1439a(int i) {
        if (this.f1288d == i) {
            return false;
        }
        this.f1288d = i;
        m1612c();
        return true;
    }

    /* renamed from: b */
    public boolean mo1441b(int i) {
        if (this.f1289e == i) {
            return false;
        }
        this.f1289e = i;
        m1612c();
        return true;
    }

    /* renamed from: b */
    public int mo1440b() {
        return this.f1288d;
    }
}
