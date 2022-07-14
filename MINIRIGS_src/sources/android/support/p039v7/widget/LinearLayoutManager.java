package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p039v7.widget.C0904ay;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C0904ay.C0922i implements C0904ay.C0939t.C0941b {

    /* renamed from: a */
    private C0801c f2773a;

    /* renamed from: b */
    private boolean f2774b;

    /* renamed from: c */
    private boolean f2775c = false;

    /* renamed from: d */
    private boolean f2776d = false;

    /* renamed from: e */
    private boolean f2777e = true;

    /* renamed from: f */
    private boolean f2778f;

    /* renamed from: g */
    private final C0800b f2779g = new C0800b();

    /* renamed from: h */
    private int f2780h = 2;

    /* renamed from: i */
    int f2781i = 1;

    /* renamed from: j */
    C0901ax f2782j;

    /* renamed from: k */
    boolean f2783k = false;

    /* renamed from: l */
    int f2784l = -1;

    /* renamed from: m */
    int f2785m = Integer.MIN_VALUE;

    /* renamed from: n */
    C0802d f2786n = null;

    /* renamed from: o */
    final C0799a f2787o = new C0799a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3521a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, C0799a aVar, int i) {
    }

    /* renamed from: c */
    public boolean mo3560c() {
        return true;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        mo3555b(i);
        mo3556b(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0904ay.C0922i.C0926b a = m4688a(context, attributeSet, i, i2);
        mo3555b(a.f3370a);
        mo3556b(a.f3372c);
        mo3530a(a.f3373d);
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3514a() {
        return new C0904ay.C0927j(-2, -2);
    }

    /* renamed from: a */
    public void mo3550a(C0904ay ayVar, C0904ay.C0934p pVar) {
        super.mo3550a(ayVar, pVar);
        if (this.f2778f) {
            mo4452c(pVar);
            pVar.mo4520a();
        }
    }

    /* renamed from: a */
    public void mo3551a(AccessibilityEvent accessibilityEvent) {
        super.mo3551a(accessibilityEvent);
        if (mo4488v() > 0) {
            accessibilityEvent.setFromIndex(mo3578m());
            accessibilityEvent.setToIndex(mo3579n());
        }
    }

    /* renamed from: d */
    public Parcelable mo3563d() {
        C0802d dVar = this.f2786n;
        if (dVar != null) {
            return new C0802d(dVar);
        }
        C0802d dVar2 = new C0802d();
        if (mo4488v() > 0) {
            mo3574i();
            boolean z = this.f2774b ^ this.f2783k;
            dVar2.f2811c = z;
            if (z) {
                View M = m3760M();
                dVar2.f2810b = this.f2782j.mo4177d() - this.f2782j.mo4174b(M);
                dVar2.f2809a = mo4458d(M);
            } else {
                View L = m3759L();
                dVar2.f2809a = mo4458d(L);
                dVar2.f2810b = this.f2782j.mo4170a(L) - this.f2782j.mo4175c();
            }
        } else {
            dVar2.mo3593b();
        }
        return dVar2;
    }

    /* renamed from: a */
    public void mo3549a(Parcelable parcelable) {
        if (parcelable instanceof C0802d) {
            this.f2786n = (C0802d) parcelable;
            mo4481o();
        }
    }

    /* renamed from: e */
    public boolean mo3566e() {
        return this.f2781i == 0;
    }

    /* renamed from: f */
    public boolean mo3569f() {
        return this.f2781i == 1;
    }

    /* renamed from: a */
    public void mo3530a(boolean z) {
        mo3552a((String) null);
        if (this.f2776d != z) {
            this.f2776d = z;
            mo4481o();
        }
    }

    /* renamed from: g */
    public int mo3570g() {
        return this.f2781i;
    }

    /* renamed from: b */
    public void mo3555b(int i) {
        if (i == 0 || i == 1) {
            mo3552a((String) null);
            if (i != this.f2781i || this.f2782j == null) {
                this.f2782j = C0901ax.m4442a(this, i);
                this.f2787o.f2788a = this.f2782j;
                this.f2781i = i;
                mo4481o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: K */
    private void m3758K() {
        if (this.f2781i == 1 || !mo3573h()) {
            this.f2783k = this.f2775c;
        } else {
            this.f2783k = !this.f2775c;
        }
    }

    /* renamed from: b */
    public void mo3556b(boolean z) {
        mo3552a((String) null);
        if (z != this.f2775c) {
            this.f2775c = z;
            mo4481o();
        }
    }

    /* renamed from: c */
    public View mo3559c(int i) {
        int v = mo4488v();
        if (v == 0) {
            return null;
        }
        int d = i - mo4458d(mo4474i(0));
        if (d >= 0 && d < v) {
            View i2 = mo4474i(d);
            if (mo4458d(i2) == i) {
                return i2;
            }
        }
        return super.mo3559c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo3553b(C0904ay.C0942u uVar) {
        if (uVar.mo4580d()) {
            return this.f2782j.mo4181f();
        }
        return 0;
    }

    /* renamed from: d */
    public PointF mo3562d(int i) {
        if (mo4488v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4458d(mo4474i(0))) {
            z = true;
        }
        if (z != this.f2783k) {
            i2 = -1;
        }
        if (this.f2781i == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: c */
    public void mo3536c(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View c;
        int i5;
        int i6 = -1;
        if (!(this.f2786n == null && this.f2784l == -1) && uVar.mo4581e() == 0) {
            mo4452c(pVar);
            return;
        }
        C0802d dVar = this.f2786n;
        if (dVar != null && dVar.mo3592a()) {
            this.f2784l = this.f2786n.f2809a;
        }
        mo3574i();
        this.f2773a.f2797a = false;
        m3758K();
        View E = mo4409E();
        if (!this.f2787o.f2792e || this.f2784l != -1 || this.f2786n != null) {
            this.f2787o.mo3580a();
            C0799a aVar = this.f2787o;
            aVar.f2791d = this.f2783k ^ this.f2776d;
            m3769a(pVar, uVar, aVar);
            this.f2787o.f2792e = true;
        } else if (E != null && (this.f2782j.mo4170a(E) >= this.f2782j.mo4177d() || this.f2782j.mo4174b(E) <= this.f2782j.mo4175c())) {
            this.f2787o.mo3581a(E, mo4458d(E));
        }
        int b = mo3553b(uVar);
        if (this.f2773a.f2806j >= 0) {
            i = b;
            b = 0;
        } else {
            i = 0;
        }
        int c2 = b + this.f2782j.mo4175c();
        int g = i + this.f2782j.mo4183g();
        if (!(!uVar.mo4577a() || (i4 = this.f2784l) == -1 || this.f2785m == Integer.MIN_VALUE || (c = mo3559c(i4)) == null)) {
            if (this.f2783k) {
                i5 = (this.f2782j.mo4177d() - this.f2782j.mo4174b(c)) - this.f2785m;
            } else {
                i5 = this.f2785m - (this.f2782j.mo4170a(c) - this.f2782j.mo4175c());
            }
            if (i5 > 0) {
                c2 += i5;
            } else {
                g -= i5;
            }
        }
        if (this.f2787o.f2791d) {
            if (this.f2783k) {
                i6 = 1;
            }
        } else if (!this.f2783k) {
            i6 = 1;
        }
        mo3521a(pVar, uVar, this.f2787o, i6);
        mo4418a(pVar);
        this.f2773a.f2808l = mo3576k();
        this.f2773a.f2805i = uVar.mo4577a();
        if (this.f2787o.f2791d) {
            m3773b(this.f2787o);
            C0801c cVar = this.f2773a;
            cVar.f2804h = c2;
            mo3545a(pVar, cVar, uVar, false);
            i3 = this.f2773a.f2798b;
            int i7 = this.f2773a.f2800d;
            if (this.f2773a.f2799c > 0) {
                g += this.f2773a.f2799c;
            }
            m3765a(this.f2787o);
            C0801c cVar2 = this.f2773a;
            cVar2.f2804h = g;
            cVar2.f2800d += this.f2773a.f2801e;
            mo3545a(pVar, this.f2773a, uVar, false);
            i2 = this.f2773a.f2798b;
            if (this.f2773a.f2799c > 0) {
                int i8 = this.f2773a.f2799c;
                m3779g(i7, i3);
                C0801c cVar3 = this.f2773a;
                cVar3.f2804h = i8;
                mo3545a(pVar, cVar3, uVar, false);
                i3 = this.f2773a.f2798b;
            }
        } else {
            m3765a(this.f2787o);
            C0801c cVar4 = this.f2773a;
            cVar4.f2804h = g;
            mo3545a(pVar, cVar4, uVar, false);
            i2 = this.f2773a.f2798b;
            int i9 = this.f2773a.f2800d;
            if (this.f2773a.f2799c > 0) {
                c2 += this.f2773a.f2799c;
            }
            m3773b(this.f2787o);
            C0801c cVar5 = this.f2773a;
            cVar5.f2804h = c2;
            cVar5.f2800d += this.f2773a.f2801e;
            mo3545a(pVar, this.f2773a, uVar, false);
            i3 = this.f2773a.f2798b;
            if (this.f2773a.f2799c > 0) {
                int i10 = this.f2773a.f2799c;
                mo3511a(i9, i2);
                C0801c cVar6 = this.f2773a;
                cVar6.f2804h = i10;
                mo3545a(pVar, cVar6, uVar, false);
                i2 = this.f2773a.f2798b;
            }
        }
        if (mo4488v() > 0) {
            if (this.f2783k ^ this.f2776d) {
                int a = m3761a(i2, pVar, uVar, true);
                int i11 = i3 + a;
                int i12 = i2 + a;
                int b2 = m3771b(i11, pVar, uVar, false);
                i3 = i11 + b2;
                i2 = i12 + b2;
            } else {
                int b3 = m3771b(i3, pVar, uVar, true);
                int i13 = i3 + b3;
                int i14 = i2 + b3;
                int a2 = m3761a(i14, pVar, uVar, false);
                i3 = i13 + a2;
                i2 = i14 + a2;
            }
        }
        m3775b(pVar, uVar, i3, i2);
        if (!uVar.mo4577a()) {
            this.f2782j.mo4171a();
        } else {
            this.f2787o.mo3580a();
        }
        this.f2774b = this.f2776d;
    }

    /* renamed from: a */
    public void mo3524a(C0904ay.C0942u uVar) {
        super.mo3524a(uVar);
        this.f2786n = null;
        this.f2784l = -1;
        this.f2785m = Integer.MIN_VALUE;
        this.f2787o.mo3580a();
    }

    /* renamed from: b */
    private void m3775b(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i, int i2) {
        C0904ay.C0934p pVar2 = pVar;
        C0904ay.C0942u uVar2 = uVar;
        if (uVar.mo4578b() && mo4488v() != 0 && !uVar.mo4577a() && mo3535b()) {
            List<C0904ay.C0945x> c = pVar.mo4537c();
            int size = c.size();
            int d = mo4458d(mo4474i(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0904ay.C0945x xVar = c.get(i5);
                if (!xVar.mo4619q()) {
                    char c2 = 1;
                    if ((xVar.mo4606d() < d) != this.f2783k) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.f2782j.mo4180e(xVar.f3434a);
                    } else {
                        i4 += this.f2782j.mo4180e(xVar.f3434a);
                    }
                }
            }
            this.f2773a.f2807k = c;
            if (i3 > 0) {
                m3779g(mo4458d(m3759L()), i);
                C0801c cVar = this.f2773a;
                cVar.f2804h = i3;
                cVar.f2799c = 0;
                cVar.mo3588a();
                mo3545a(pVar2, this.f2773a, uVar2, false);
            }
            if (i4 > 0) {
                mo3511a(mo4458d(m3760M()), i2);
                C0801c cVar2 = this.f2773a;
                cVar2.f2804h = i4;
                cVar2.f2799c = 0;
                cVar2.mo3588a();
                mo3545a(pVar2, this.f2773a, uVar2, false);
            }
            this.f2773a.f2807k = null;
        }
    }

    /* renamed from: a */
    private void m3769a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, C0799a aVar) {
        if (!m3770a(uVar, aVar) && !m3776b(pVar, uVar, aVar)) {
            aVar.mo3583b();
            aVar.f2789b = this.f2776d ? uVar.mo4581e() - 1 : 0;
        }
    }

    /* renamed from: b */
    private boolean m3776b(C0904ay.C0934p pVar, C0904ay.C0942u uVar, C0799a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo4488v() == 0) {
            return false;
        }
        View E = mo4409E();
        if (E != null && aVar.mo3582a(E, uVar)) {
            aVar.mo3581a(E, mo4458d(E));
            return true;
        } else if (this.f2774b != this.f2776d) {
            return false;
        } else {
            if (aVar.f2791d) {
                view = m3777f(pVar, uVar);
            } else {
                view = m3778g(pVar, uVar);
            }
            if (view == null) {
                return false;
            }
            aVar.mo3584b(view, mo4458d(view));
            if (!uVar.mo4577a() && mo3535b()) {
                if (this.f2782j.mo4170a(view) >= this.f2782j.mo4177d() || this.f2782j.mo4174b(view) < this.f2782j.mo4175c()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f2791d) {
                        i = this.f2782j.mo4177d();
                    } else {
                        i = this.f2782j.mo4175c();
                    }
                    aVar.f2790c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m3770a(C0904ay.C0942u uVar, C0799a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (uVar.mo4577a() || (i = this.f2784l) == -1) {
            return false;
        }
        if (i < 0 || i >= uVar.mo4581e()) {
            this.f2784l = -1;
            this.f2785m = Integer.MIN_VALUE;
            return false;
        }
        aVar.f2789b = this.f2784l;
        C0802d dVar = this.f2786n;
        if (dVar != null && dVar.mo3592a()) {
            aVar.f2791d = this.f2786n.f2811c;
            if (aVar.f2791d) {
                aVar.f2790c = this.f2782j.mo4177d() - this.f2786n.f2810b;
            } else {
                aVar.f2790c = this.f2782j.mo4175c() + this.f2786n.f2810b;
            }
            return true;
        } else if (this.f2785m == Integer.MIN_VALUE) {
            View c = mo3559c(this.f2784l);
            if (c == null) {
                if (mo4488v() > 0) {
                    if ((this.f2784l < mo4458d(mo4474i(0))) == this.f2783k) {
                        z = true;
                    }
                    aVar.f2791d = z;
                }
                aVar.mo3583b();
            } else if (this.f2782j.mo4180e(c) > this.f2782j.mo4181f()) {
                aVar.mo3583b();
                return true;
            } else if (this.f2782j.mo4170a(c) - this.f2782j.mo4175c() < 0) {
                aVar.f2790c = this.f2782j.mo4175c();
                aVar.f2791d = false;
                return true;
            } else if (this.f2782j.mo4177d() - this.f2782j.mo4174b(c) < 0) {
                aVar.f2790c = this.f2782j.mo4177d();
                aVar.f2791d = true;
                return true;
            } else {
                if (aVar.f2791d) {
                    i2 = this.f2782j.mo4174b(c) + this.f2782j.mo4173b();
                } else {
                    i2 = this.f2782j.mo4170a(c);
                }
                aVar.f2790c = i2;
            }
            return true;
        } else {
            boolean z2 = this.f2783k;
            aVar.f2791d = z2;
            if (z2) {
                aVar.f2790c = this.f2782j.mo4177d() - this.f2785m;
            } else {
                aVar.f2790c = this.f2782j.mo4175c() + this.f2785m;
            }
            return true;
        }
    }

    /* renamed from: a */
    private int m3761a(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar, boolean z) {
        int d;
        int d2 = this.f2782j.mo4177d() - i;
        if (d2 <= 0) {
            return 0;
        }
        int i2 = -mo3557c(-d2, pVar, uVar);
        int i3 = i + i2;
        if (!z || (d = this.f2782j.mo4177d() - i3) <= 0) {
            return i2;
        }
        this.f2782j.mo4172a(d);
        return d + i2;
    }

    /* renamed from: b */
    private int m3771b(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar, boolean z) {
        int c;
        int c2 = i - this.f2782j.mo4175c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -mo3557c(c2, pVar, uVar);
        int i3 = i + i2;
        if (!z || (c = i3 - this.f2782j.mo4175c()) <= 0) {
            return i2;
        }
        this.f2782j.mo4172a(-c);
        return i2 - c;
    }

    /* renamed from: a */
    private void m3765a(C0799a aVar) {
        mo3511a(aVar.f2789b, aVar.f2790c);
    }

    /* renamed from: a */
    private void mo3511a(int i, int i2) {
        this.f2773a.f2799c = this.f2782j.mo4177d() - i2;
        this.f2773a.f2801e = this.f2783k ? -1 : 1;
        C0801c cVar = this.f2773a;
        cVar.f2800d = i;
        cVar.f2802f = 1;
        cVar.f2798b = i2;
        cVar.f2803g = Integer.MIN_VALUE;
    }

    /* renamed from: b */
    private void m3773b(C0799a aVar) {
        m3779g(aVar.f2789b, aVar.f2790c);
    }

    /* renamed from: g */
    private void m3779g(int i, int i2) {
        this.f2773a.f2799c = i2 - this.f2782j.mo4175c();
        C0801c cVar = this.f2773a;
        cVar.f2800d = i;
        cVar.f2801e = this.f2783k ? 1 : -1;
        C0801c cVar2 = this.f2773a;
        cVar2.f2802f = -1;
        cVar2.f2798b = i2;
        cVar2.f2803g = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo3573h() {
        return mo4486t() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3574i() {
        if (this.f2773a == null) {
            this.f2773a = mo3575j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0801c mo3575j() {
        return new C0801c();
    }

    /* renamed from: e */
    public void mo3565e(int i) {
        this.f2784l = i;
        this.f2785m = Integer.MIN_VALUE;
        C0802d dVar = this.f2786n;
        if (dVar != null) {
            dVar.mo3593b();
        }
        mo4481o();
    }

    /* renamed from: a */
    public int mo3512a(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2781i == 1) {
            return 0;
        }
        return mo3557c(i, pVar, uVar);
    }

    /* renamed from: b */
    public int mo3532b(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2781i == 0) {
            return 0;
        }
        return mo3557c(i, pVar, uVar);
    }

    /* renamed from: c */
    public int mo3558c(C0904ay.C0942u uVar) {
        return m3781i(uVar);
    }

    /* renamed from: d */
    public int mo3561d(C0904ay.C0942u uVar) {
        return m3781i(uVar);
    }

    /* renamed from: e */
    public int mo3564e(C0904ay.C0942u uVar) {
        return m3783j(uVar);
    }

    /* renamed from: f */
    public int mo3568f(C0904ay.C0942u uVar) {
        return m3783j(uVar);
    }

    /* renamed from: g */
    public int mo3571g(C0904ay.C0942u uVar) {
        return m3785k(uVar);
    }

    /* renamed from: h */
    public int mo3572h(C0904ay.C0942u uVar) {
        return m3785k(uVar);
    }

    /* renamed from: i */
    private int m3781i(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        mo3574i();
        C0901ax axVar = this.f2782j;
        View a = m3762a(!this.f2777e, true);
        return C0954be.m5022a(uVar, axVar, a, m3772b(!this.f2777e, true), this, this.f2777e, this.f2783k);
    }

    /* renamed from: j */
    private int m3783j(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        mo3574i();
        C0901ax axVar = this.f2782j;
        View a = m3762a(!this.f2777e, true);
        return C0954be.m5021a(uVar, axVar, a, m3772b(!this.f2777e, true), this, this.f2777e);
    }

    /* renamed from: k */
    private int m3785k(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        mo3574i();
        C0901ax axVar = this.f2782j;
        View a = m3762a(!this.f2777e, true);
        return C0954be.m5023b(uVar, axVar, a, m3772b(!this.f2777e, true), this, this.f2777e);
    }

    /* renamed from: a */
    private void m3764a(int i, int i2, boolean z, C0904ay.C0942u uVar) {
        int i3;
        this.f2773a.f2808l = mo3576k();
        this.f2773a.f2804h = mo3553b(uVar);
        C0801c cVar = this.f2773a;
        cVar.f2802f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f2804h += this.f2782j.mo4183g();
            View M = m3760M();
            C0801c cVar2 = this.f2773a;
            if (!this.f2783k) {
                i4 = 1;
            }
            cVar2.f2801e = i4;
            this.f2773a.f2800d = mo4458d(M) + this.f2773a.f2801e;
            this.f2773a.f2798b = this.f2782j.mo4174b(M);
            i3 = this.f2782j.mo4174b(M) - this.f2782j.mo4177d();
        } else {
            View L = m3759L();
            this.f2773a.f2804h += this.f2782j.mo4175c();
            C0801c cVar3 = this.f2773a;
            if (this.f2783k) {
                i4 = 1;
            }
            cVar3.f2801e = i4;
            this.f2773a.f2800d = mo4458d(L) + this.f2773a.f2801e;
            this.f2773a.f2798b = this.f2782j.mo4170a(L);
            i3 = (-this.f2782j.mo4170a(L)) + this.f2782j.mo4175c();
        }
        C0801c cVar4 = this.f2773a;
        cVar4.f2799c = i2;
        if (z) {
            cVar4.f2799c -= i3;
        }
        this.f2773a.f2803g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo3576k() {
        return this.f2782j.mo4184h() == 0 && this.f2782j.mo4179e() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3525a(C0904ay.C0942u uVar, C0801c cVar, C0904ay.C0922i.C0925a aVar) {
        int i = cVar.f2800d;
        if (i >= 0 && i < uVar.mo4581e()) {
            aVar.mo4078b(i, Math.max(0, cVar.f2803g));
        }
    }

    /* renamed from: a */
    public void mo3548a(int i, C0904ay.C0922i.C0925a aVar) {
        int i2;
        boolean z;
        C0802d dVar = this.f2786n;
        int i3 = -1;
        if (dVar == null || !dVar.mo3592a()) {
            m3758K();
            z = this.f2783k;
            i2 = this.f2784l;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.f2786n.f2811c;
            i2 = this.f2786n.f2809a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2780h && i2 >= 0 && i2 < i; i4++) {
            aVar.mo4078b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo3547a(int i, int i2, C0904ay.C0942u uVar, C0904ay.C0922i.C0925a aVar) {
        if (this.f2781i != 0) {
            i = i2;
        }
        if (mo4488v() != 0 && i != 0) {
            mo3574i();
            m3764a(i > 0 ? 1 : -1, Math.abs(i), true, uVar);
            mo3525a(uVar, this.f2773a, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3557c(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (mo4488v() == 0 || i == 0) {
            return 0;
        }
        this.f2773a.f2797a = true;
        mo3574i();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3764a(i2, abs, true, uVar);
        int a = this.f2773a.f2803g + mo3545a(pVar, this.f2773a, uVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2782j.mo4172a(-i);
        this.f2773a.f2806j = i;
        return i;
    }

    /* renamed from: a */
    public void mo3552a(String str) {
        if (this.f2786n == null) {
            super.mo3552a(str);
        }
    }

    /* renamed from: a */
    private void m3767a(C0904ay.C0934p pVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4415a(i3, pVar);
                }
                return;
            }
            while (i > i2) {
                mo4415a(i, pVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m3766a(C0904ay.C0934p pVar, int i) {
        if (i >= 0) {
            int v = mo4488v();
            if (this.f2783k) {
                int i2 = v - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View i4 = mo4474i(i3);
                    if (this.f2782j.mo4174b(i4) > i || this.f2782j.mo4176c(i4) > i) {
                        m3767a(pVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i5 = 0; i5 < v; i5++) {
                View i6 = mo4474i(i5);
                if (this.f2782j.mo4174b(i6) > i || this.f2782j.mo4176c(i6) > i) {
                    m3767a(pVar, 0, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m3774b(C0904ay.C0934p pVar, int i) {
        int v = mo4488v();
        if (i >= 0) {
            int e = this.f2782j.mo4179e() - i;
            if (this.f2783k) {
                for (int i2 = 0; i2 < v; i2++) {
                    View i3 = mo4474i(i2);
                    if (this.f2782j.mo4170a(i3) < e || this.f2782j.mo4178d(i3) < e) {
                        m3767a(pVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View i6 = mo4474i(i5);
                if (this.f2782j.mo4170a(i6) < e || this.f2782j.mo4178d(i6) < e) {
                    m3767a(pVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m3768a(C0904ay.C0934p pVar, C0801c cVar) {
        if (cVar.f2797a && !cVar.f2808l) {
            if (cVar.f2802f == -1) {
                m3774b(pVar, cVar.f2803g);
            } else {
                m3766a(pVar, cVar.f2803g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3545a(C0904ay.C0934p pVar, C0801c cVar, C0904ay.C0942u uVar, boolean z) {
        int i = cVar.f2799c;
        if (cVar.f2803g != Integer.MIN_VALUE) {
            if (cVar.f2799c < 0) {
                cVar.f2803g += cVar.f2799c;
            }
            m3768a(pVar, cVar);
        }
        int i2 = cVar.f2799c + cVar.f2804h;
        C0800b bVar = this.f2779g;
        while (true) {
            if ((!cVar.f2808l && i2 <= 0) || !cVar.mo3590a(uVar)) {
                break;
            }
            bVar.mo3586a();
            mo3522a(pVar, uVar, cVar, bVar);
            if (!bVar.f2794b) {
                cVar.f2798b += bVar.f2793a * cVar.f2802f;
                if (!bVar.f2795c || this.f2773a.f2807k != null || !uVar.mo4577a()) {
                    cVar.f2799c -= bVar.f2793a;
                    i2 -= bVar.f2793a;
                }
                if (cVar.f2803g != Integer.MIN_VALUE) {
                    cVar.f2803g += bVar.f2793a;
                    if (cVar.f2799c < 0) {
                        cVar.f2803g += cVar.f2799c;
                    }
                    m3768a(pVar, cVar);
                }
                if (z && bVar.f2796d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2799c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3522a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, C0801c cVar, C0800b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3587a(pVar);
        if (a == null) {
            bVar.f2794b = true;
            return;
        }
        C0904ay.C0927j jVar = (C0904ay.C0927j) a.getLayoutParams();
        if (cVar.f2807k == null) {
            if (this.f2783k == (cVar.f2802f == -1)) {
                mo4447b(a);
            } else {
                mo4448b(a, 0);
            }
        } else {
            if (this.f2783k == (cVar.f2802f == -1)) {
                mo4423a(a);
            } else {
                mo4424a(a, 0);
            }
        }
        mo4425a(a, 0, 0);
        bVar.f2793a = this.f2782j.mo4180e(a);
        if (this.f2781i == 1) {
            if (mo3573h()) {
                i5 = mo4491y() - mo4407C();
                i4 = i5 - this.f2782j.mo4182f(a);
            } else {
                i4 = mo4405A();
                i5 = this.f2782j.mo4182f(a) + i4;
            }
            if (cVar.f2802f == -1) {
                int i6 = cVar.f2798b;
                i3 = cVar.f2798b - bVar.f2793a;
                i2 = i5;
                i = i6;
            } else {
                int i7 = cVar.f2798b;
                i = cVar.f2798b + bVar.f2793a;
                i2 = i5;
                i3 = i7;
            }
        } else {
            int B = mo4406B();
            int f = this.f2782j.mo4182f(a) + B;
            if (cVar.f2802f == -1) {
                i3 = B;
                i2 = cVar.f2798b;
                i = f;
                i4 = cVar.f2798b - bVar.f2793a;
            } else {
                int i8 = cVar.f2798b;
                i2 = cVar.f2798b + bVar.f2793a;
                i3 = B;
                i = f;
                i4 = i8;
            }
        }
        mo4426a(a, i4, i3, i2, i);
        if (jVar.mo4499d() || jVar.mo4500e()) {
            bVar.f2795c = true;
        }
        bVar.f2796d = a.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo3577l() {
        return (mo4490x() == 1073741824 || mo4489w() == 1073741824 || !mo4414J()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3567f(int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                return (this.f2781i != 1 && mo3573h()) ? 1 : -1;
                            case 2:
                                return (this.f2781i != 1 && mo3573h()) ? -1 : 1;
                            default:
                                return Integer.MIN_VALUE;
                        }
                    } else if (this.f2781i == 1) {
                        return 1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f2781i == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f2781i == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f2781i == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: L */
    private View m3759L() {
        return mo4474i(this.f2783k ? mo4488v() - 1 : 0);
    }

    /* renamed from: M */
    private View m3760M() {
        return mo4474i(this.f2783k ? 0 : mo4488v() - 1);
    }

    /* renamed from: a */
    private View m3762a(boolean z, boolean z2) {
        if (this.f2783k) {
            return mo3546a(mo4488v() - 1, -1, z, z2);
        }
        return mo3546a(0, mo4488v(), z, z2);
    }

    /* renamed from: b */
    private View m3772b(boolean z, boolean z2) {
        if (this.f2783k) {
            return mo3546a(0, mo4488v(), z, z2);
        }
        return mo3546a(mo4488v() - 1, -1, z, z2);
    }

    /* renamed from: f */
    private View m3777f(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2783k) {
            return m3780h(pVar, uVar);
        }
        return m3782i(pVar, uVar);
    }

    /* renamed from: g */
    private View m3778g(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2783k) {
            return m3782i(pVar, uVar);
        }
        return m3780h(pVar, uVar);
    }

    /* renamed from: h */
    private View m3780h(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3517a(pVar, uVar, 0, mo4488v(), uVar.mo4581e());
    }

    /* renamed from: i */
    private View m3782i(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3517a(pVar, uVar, mo4488v() - 1, -1, uVar.mo4581e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3517a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i, int i2, int i3) {
        mo3574i();
        int c = this.f2782j.mo4175c();
        int d = this.f2782j.mo4177d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = mo4474i(i);
            int d2 = mo4458d(i5);
            if (d2 >= 0 && d2 < i3) {
                if (((C0904ay.C0927j) i5.getLayoutParams()).mo4499d()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.f2782j.mo4170a(i5) < d && this.f2782j.mo4174b(i5) >= c) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: j */
    private View m3784j(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2783k) {
            return m3787l(pVar, uVar);
        }
        return m3788m(pVar, uVar);
    }

    /* renamed from: k */
    private View m3786k(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2783k) {
            return m3788m(pVar, uVar);
        }
        return m3787l(pVar, uVar);
    }

    /* renamed from: l */
    private View m3787l(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3554b(0, mo4488v());
    }

    /* renamed from: m */
    private View m3788m(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3554b(mo4488v() - 1, -1);
    }

    /* renamed from: m */
    public int mo3578m() {
        View a = mo3546a(0, mo4488v(), false, true);
        if (a == null) {
            return -1;
        }
        return mo4458d(a);
    }

    /* renamed from: n */
    public int mo3579n() {
        View a = mo3546a(mo4488v() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo4458d(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3546a(int i, int i2, boolean z, boolean z2) {
        mo3574i();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f2781i == 0) {
            return this.f3360r.mo4817a(i, i2, i4, i3);
        }
        return this.f3361s.mo4817a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3554b(int i, int i2) {
        int i3;
        int i4;
        mo3574i();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4474i(i);
        }
        if (this.f2782j.mo4170a(mo4474i(i)) < this.f2782j.mo4175c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f2781i == 0) {
            return this.f3360r.mo4817a(i, i2, i4, i3);
        }
        return this.f3361s.mo4817a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo3518a(View view, int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        int f;
        View view2;
        View view3;
        m3758K();
        if (mo4488v() == 0 || (f = mo3567f(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo3574i();
        mo3574i();
        m3764a(f, (int) (((float) this.f2782j.mo4181f()) * 0.33333334f), false, uVar);
        C0801c cVar = this.f2773a;
        cVar.f2803g = Integer.MIN_VALUE;
        cVar.f2797a = false;
        mo3545a(pVar, cVar, uVar, true);
        if (f == -1) {
            view2 = m3786k(pVar, uVar);
        } else {
            view2 = m3784j(pVar, uVar);
        }
        if (f == -1) {
            view3 = m3759L();
        } else {
            view3 = m3760M();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: b */
    public boolean mo3535b() {
        return this.f2786n == null && this.f2774b == this.f2776d;
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0801c {

        /* renamed from: a */
        boolean f2797a = true;

        /* renamed from: b */
        int f2798b;

        /* renamed from: c */
        int f2799c;

        /* renamed from: d */
        int f2800d;

        /* renamed from: e */
        int f2801e;

        /* renamed from: f */
        int f2802f;

        /* renamed from: g */
        int f2803g;

        /* renamed from: h */
        int f2804h = 0;

        /* renamed from: i */
        boolean f2805i = false;

        /* renamed from: j */
        int f2806j;

        /* renamed from: k */
        List<C0904ay.C0945x> f2807k = null;

        /* renamed from: l */
        boolean f2808l;

        C0801c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3590a(C0904ay.C0942u uVar) {
            int i = this.f2800d;
            return i >= 0 && i < uVar.mo4581e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo3587a(C0904ay.C0934p pVar) {
            if (this.f2807k != null) {
                return m3842b();
            }
            View c = pVar.mo4536c(this.f2800d);
            this.f2800d += this.f2801e;
            return c;
        }

        /* renamed from: b */
        private View m3842b() {
            int size = this.f2807k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2807k.get(i).f3434a;
                C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
                if (!jVar.mo4499d() && this.f2800d == jVar.mo4501f()) {
                    mo3589a(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo3588a() {
            mo3589a((View) null);
        }

        /* renamed from: a */
        public void mo3589a(View view) {
            View b = mo3591b(view);
            if (b == null) {
                this.f2800d = -1;
            } else {
                this.f2800d = ((C0904ay.C0927j) b.getLayoutParams()).mo4501f();
            }
        }

        /* renamed from: b */
        public View mo3591b(View view) {
            int f;
            int size = this.f2807k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2807k.get(i2).f3434a;
                C0904ay.C0927j jVar = (C0904ay.C0927j) view3.getLayoutParams();
                if (view3 != view && !jVar.mo4499d() && (f = (jVar.mo4501f() - this.f2800d) * this.f2801e) >= 0 && f < i) {
                    if (f == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = f;
                }
            }
            return view2;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$d */
    public static class C0802d implements Parcelable {
        public static final Parcelable.Creator<C0802d> CREATOR = new Parcelable.Creator<C0802d>() {
            /* renamed from: a */
            public C0802d createFromParcel(Parcel parcel) {
                return new C0802d(parcel);
            }

            /* renamed from: a */
            public C0802d[] newArray(int i) {
                return new C0802d[i];
            }
        };

        /* renamed from: a */
        int f2809a;

        /* renamed from: b */
        int f2810b;

        /* renamed from: c */
        boolean f2811c;

        public int describeContents() {
            return 0;
        }

        public C0802d() {
        }

        C0802d(Parcel parcel) {
            this.f2809a = parcel.readInt();
            this.f2810b = parcel.readInt();
            this.f2811c = parcel.readInt() != 1 ? false : true;
        }

        public C0802d(C0802d dVar) {
            this.f2809a = dVar.f2809a;
            this.f2810b = dVar.f2810b;
            this.f2811c = dVar.f2811c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3592a() {
            return this.f2809a >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3593b() {
            this.f2809a = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2809a);
            parcel.writeInt(this.f2810b);
            parcel.writeInt(this.f2811c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C0799a {

        /* renamed from: a */
        C0901ax f2788a;

        /* renamed from: b */
        int f2789b;

        /* renamed from: c */
        int f2790c;

        /* renamed from: d */
        boolean f2791d;

        /* renamed from: e */
        boolean f2792e;

        C0799a() {
            mo3580a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3580a() {
            this.f2789b = -1;
            this.f2790c = Integer.MIN_VALUE;
            this.f2791d = false;
            this.f2792e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3583b() {
            int i;
            if (this.f2791d) {
                i = this.f2788a.mo4177d();
            } else {
                i = this.f2788a.mo4175c();
            }
            this.f2790c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2789b + ", mCoordinate=" + this.f2790c + ", mLayoutFromEnd=" + this.f2791d + ", mValid=" + this.f2792e + '}';
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3582a(View view, C0904ay.C0942u uVar) {
            C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
            return !jVar.mo4499d() && jVar.mo4501f() >= 0 && jVar.mo4501f() < uVar.mo4581e();
        }

        /* renamed from: a */
        public void mo3581a(View view, int i) {
            int b = this.f2788a.mo4173b();
            if (b >= 0) {
                mo3584b(view, i);
                return;
            }
            this.f2789b = i;
            if (this.f2791d) {
                int d = (this.f2788a.mo4177d() - b) - this.f2788a.mo4174b(view);
                this.f2790c = this.f2788a.mo4177d() - d;
                if (d > 0) {
                    int e = this.f2790c - this.f2788a.mo4180e(view);
                    int c = this.f2788a.mo4175c();
                    int min = e - (c + Math.min(this.f2788a.mo4170a(view) - c, 0));
                    if (min < 0) {
                        this.f2790c += Math.min(d, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a = this.f2788a.mo4170a(view);
            int c2 = a - this.f2788a.mo4175c();
            this.f2790c = a;
            if (c2 > 0) {
                int d2 = (this.f2788a.mo4177d() - Math.min(0, (this.f2788a.mo4177d() - b) - this.f2788a.mo4174b(view))) - (a + this.f2788a.mo4180e(view));
                if (d2 < 0) {
                    this.f2790c -= Math.min(c2, -d2);
                }
            }
        }

        /* renamed from: b */
        public void mo3584b(View view, int i) {
            if (this.f2791d) {
                this.f2790c = this.f2788a.mo4174b(view) + this.f2788a.mo4173b();
            } else {
                this.f2790c = this.f2788a.mo4170a(view);
            }
            this.f2789b = i;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0800b {

        /* renamed from: a */
        public int f2793a;

        /* renamed from: b */
        public boolean f2794b;

        /* renamed from: c */
        public boolean f2795c;

        /* renamed from: d */
        public boolean f2796d;

        protected C0800b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3586a() {
            this.f2793a = 0;
            this.f2794b = false;
            this.f2795c = false;
            this.f2796d = false;
        }
    }
}
