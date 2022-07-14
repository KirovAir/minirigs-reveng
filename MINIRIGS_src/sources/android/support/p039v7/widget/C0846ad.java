package android.support.p039v7.widget;

import android.content.res.ColorStateList;

/* renamed from: android.support.v7.widget.ad */
class C0846ad implements C0850ag {
    /* renamed from: a */
    public void mo3907a() {
    }

    C0846ad() {
    }

    /* renamed from: a */
    public void mo3910a(C0849af afVar, float f) {
        m4147j(afVar).mo4682a(f);
    }

    /* renamed from: b */
    public void mo3913b(C0849af afVar, float f) {
        m4147j(afVar).mo4683a(f, afVar.mo3926b(), afVar.mo3927c());
        mo3918f(afVar);
    }

    /* renamed from: a */
    public float mo3909a(C0849af afVar) {
        return m4147j(afVar).mo4681a();
    }

    /* renamed from: b */
    public float mo3912b(C0849af afVar) {
        return mo3916d(afVar) * 2.0f;
    }

    /* renamed from: c */
    public float mo3914c(C0849af afVar) {
        return mo3916d(afVar) * 2.0f;
    }

    /* renamed from: d */
    public float mo3916d(C0849af afVar) {
        return m4147j(afVar).mo4685b();
    }

    /* renamed from: c */
    public void mo3915c(C0849af afVar, float f) {
        afVar.mo3928d().setElevation(f);
    }

    /* renamed from: e */
    public float mo3917e(C0849af afVar) {
        return afVar.mo3928d().getElevation();
    }

    /* renamed from: f */
    public void mo3918f(C0849af afVar) {
        if (!afVar.mo3926b()) {
            afVar.mo3925a(0, 0, 0, 0);
            return;
        }
        float a = mo3909a(afVar);
        float d = mo3916d(afVar);
        int ceil = (int) Math.ceil((double) C0951bc.m4996b(a, d, afVar.mo3927c()));
        int ceil2 = (int) Math.ceil((double) C0951bc.m4993a(a, d, afVar.mo3927c()));
        afVar.mo3925a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public void mo3919g(C0849af afVar) {
        mo3913b(afVar, mo3909a(afVar));
    }

    /* renamed from: h */
    public void mo3920h(C0849af afVar) {
        mo3913b(afVar, mo3909a(afVar));
    }

    /* renamed from: a */
    public void mo3911a(C0849af afVar, ColorStateList colorStateList) {
        m4147j(afVar).mo4684a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo3921i(C0849af afVar) {
        return m4147j(afVar).mo4686c();
    }

    /* renamed from: j */
    private C0950bb m4147j(C0849af afVar) {
        return (C0950bb) afVar.mo3923a();
    }
}
