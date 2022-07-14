package android.support.p039v7.widget;

import android.support.p039v7.widget.C0904ay;
import android.view.View;

/* renamed from: android.support.v7.widget.bg */
public abstract class C0960bg extends C0904ay.C0916f {

    /* renamed from: h */
    boolean f3514h = true;

    /* renamed from: a */
    public abstract boolean mo3999a(C0904ay.C0945x xVar);

    /* renamed from: a */
    public abstract boolean mo4000a(C0904ay.C0945x xVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo4001a(C0904ay.C0945x xVar, C0904ay.C0945x xVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo4005b(C0904ay.C0945x xVar);

    /* renamed from: c */
    public void mo4750c(C0904ay.C0945x xVar, boolean z) {
    }

    /* renamed from: d */
    public void mo4751d(C0904ay.C0945x xVar, boolean z) {
    }

    /* renamed from: o */
    public void mo4758o(C0904ay.C0945x xVar) {
    }

    /* renamed from: p */
    public void mo4759p(C0904ay.C0945x xVar) {
    }

    /* renamed from: q */
    public void mo4760q(C0904ay.C0945x xVar) {
    }

    /* renamed from: r */
    public void mo4761r(C0904ay.C0945x xVar) {
    }

    /* renamed from: s */
    public void mo4762s(C0904ay.C0945x xVar) {
    }

    /* renamed from: t */
    public void mo4763t(C0904ay.C0945x xVar) {
    }

    /* renamed from: h */
    public boolean mo4393h(C0904ay.C0945x xVar) {
        return !this.f3514h || xVar.mo4616n();
    }

    /* renamed from: a */
    public boolean mo4383a(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2) {
        int i = cVar.f3345a;
        int i2 = cVar.f3346b;
        View view = xVar.f3434a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3345a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3346b;
        if (xVar.mo4619q() || (i == left && i2 == top)) {
            return mo3999a(xVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4000a(xVar, i, i2, left, top);
    }

    /* renamed from: b */
    public boolean mo4385b(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2) {
        if (cVar == null || (cVar.f3345a == cVar2.f3345a && cVar.f3346b == cVar2.f3346b)) {
            return mo4005b(xVar);
        }
        return mo4000a(xVar, cVar.f3345a, cVar.f3346b, cVar2.f3345a, cVar2.f3346b);
    }

    /* renamed from: c */
    public boolean mo4386c(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2) {
        if (cVar.f3345a == cVar2.f3345a && cVar.f3346b == cVar2.f3346b) {
            mo4753j(xVar);
            return false;
        }
        return mo4000a(xVar, cVar.f3345a, cVar.f3346b, cVar2.f3345a, cVar2.f3346b);
    }

    /* renamed from: a */
    public boolean mo4384a(C0904ay.C0945x xVar, C0904ay.C0945x xVar2, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3345a;
        int i4 = cVar.f3346b;
        if (xVar2.mo4605c()) {
            int i5 = cVar.f3345a;
            i = cVar.f3346b;
            i2 = i5;
        } else {
            i2 = cVar2.f3345a;
            i = cVar2.f3346b;
        }
        return mo4001a(xVar, xVar2, i3, i4, i2, i);
    }

    /* renamed from: i */
    public final void mo4752i(C0904ay.C0945x xVar) {
        mo4759p(xVar);
        mo4389f(xVar);
    }

    /* renamed from: j */
    public final void mo4753j(C0904ay.C0945x xVar) {
        mo4763t(xVar);
        mo4389f(xVar);
    }

    /* renamed from: k */
    public final void mo4754k(C0904ay.C0945x xVar) {
        mo4761r(xVar);
        mo4389f(xVar);
    }

    /* renamed from: a */
    public final void mo4748a(C0904ay.C0945x xVar, boolean z) {
        mo4751d(xVar, z);
        mo4389f(xVar);
    }

    /* renamed from: l */
    public final void mo4755l(C0904ay.C0945x xVar) {
        mo4758o(xVar);
    }

    /* renamed from: m */
    public final void mo4756m(C0904ay.C0945x xVar) {
        mo4762s(xVar);
    }

    /* renamed from: n */
    public final void mo4757n(C0904ay.C0945x xVar) {
        mo4760q(xVar);
    }

    /* renamed from: b */
    public final void mo4749b(C0904ay.C0945x xVar, boolean z) {
        mo4750c(xVar, z);
    }
}
