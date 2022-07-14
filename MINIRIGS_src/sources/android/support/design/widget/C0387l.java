package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.design.widget.l */
class C0387l<V extends View> extends CoordinatorLayout.C0346b<V> {

    /* renamed from: a */
    private C0388m f1282a;

    /* renamed from: b */
    private int f1283b = 0;

    /* renamed from: c */
    private int f1284c = 0;

    public C0387l() {
    }

    public C0387l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo836a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo1412b(coordinatorLayout, v, i);
        if (this.f1282a == null) {
            this.f1282a = new C0388m(v);
        }
        this.f1282a.mo1438a();
        int i2 = this.f1283b;
        if (i2 != 0) {
            this.f1282a.mo1439a(i2);
            this.f1283b = 0;
        }
        int i3 = this.f1284c;
        if (i3 == 0) {
            return true;
        }
        this.f1282a.mo1441b(i3);
        this.f1284c = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1412b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo1168a((View) v, i);
    }

    /* renamed from: a */
    public boolean mo1076a(int i) {
        C0388m mVar = this.f1282a;
        if (mVar != null) {
            return mVar.mo1439a(i);
        }
        this.f1283b = i;
        return false;
    }

    /* renamed from: b */
    public int mo1077b() {
        C0388m mVar = this.f1282a;
        if (mVar != null) {
            return mVar.mo1440b();
        }
        return 0;
    }
}
