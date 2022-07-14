package android.support.constraint.p013a.p014a;

import android.support.constraint.p013a.C0159d;
import android.support.constraint.p013a.C0160e;
import android.support.constraint.p013a.p014a.C0142b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.e */
public class C0151e extends C0147c {

    /* renamed from: A */
    protected float f507A = -1.0f;

    /* renamed from: B */
    protected int f508B = -1;

    /* renamed from: C */
    protected int f509C = -1;

    /* renamed from: D */
    private C0142b f510D = this.f465b;

    /* renamed from: E */
    private int f511E = 0;

    /* renamed from: F */
    private boolean f512F = false;

    /* renamed from: G */
    private int f513G = 0;

    /* renamed from: H */
    private C0153f f514H = new C0153f();

    /* renamed from: I */
    private int f515I = 8;

    public C0151e() {
        this.f472i.clear();
        this.f472i.add(this.f510D);
    }

    /* renamed from: k */
    public void mo509k(int i) {
        if (this.f511E != i) {
            this.f511E = i;
            this.f472i.clear();
            if (this.f511E == 1) {
                this.f510D = this.f464a;
            } else {
                this.f510D = this.f465b;
            }
            this.f472i.add(this.f510D);
        }
    }

    /* renamed from: a */
    public C0142b mo448a(C0142b.C0146c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.f511E == 1) {
                    return this.f510D;
                }
                return null;
            case TOP:
            case BOTTOM:
                if (this.f511E == 0) {
                    return this.f510D;
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: v */
    public ArrayList<C0142b> mo498v() {
        return this.f472i;
    }

    /* renamed from: e */
    public void mo508e(float f) {
        if (f > -1.0f) {
            this.f507A = f;
            this.f508B = -1;
            this.f509C = -1;
        }
    }

    /* renamed from: l */
    public void mo510l(int i) {
        if (i > -1) {
            this.f507A = -1.0f;
            this.f508B = i;
            this.f509C = -1;
        }
    }

    /* renamed from: m */
    public void mo511m(int i) {
        if (i > -1) {
            this.f507A = -1.0f;
            this.f508B = -1;
            this.f509C = i;
        }
    }

    /* renamed from: a */
    public void mo458a(C0160e eVar, int i) {
        C0150d dVar = (C0150d) mo461b();
        if (dVar != null) {
            C0142b a = dVar.mo448a(C0142b.C0146c.LEFT);
            C0142b a2 = dVar.mo448a(C0142b.C0146c.RIGHT);
            if (this.f511E == 0) {
                a = dVar.mo448a(C0142b.C0146c.TOP);
                a2 = dVar.mo448a(C0142b.C0146c.BOTTOM);
            }
            if (this.f508B != -1) {
                eVar.mo553c(C0159d.m583a(eVar, eVar.mo541a((Object) this.f510D), eVar.mo541a((Object) a), this.f508B, false));
            } else if (this.f509C != -1) {
                eVar.mo553c(C0159d.m583a(eVar, eVar.mo541a((Object) this.f510D), eVar.mo541a((Object) a2), -this.f509C, false));
            } else if (this.f507A != -1.0f) {
                eVar.mo553c(C0159d.m584a(eVar, eVar.mo541a((Object) this.f510D), eVar.mo541a((Object) a), eVar.mo541a((Object) a2), this.f507A, this.f512F));
                int i2 = this.f513G;
            }
        }
    }

    /* renamed from: b */
    public void mo466b(C0160e eVar, int i) {
        if (mo461b() != null) {
            int b = eVar.mo548b((Object) this.f510D);
            if (this.f511E == 1) {
                mo463b(b);
                mo469c(0);
                mo475e(mo461b().mo487l());
                mo473d(0);
                return;
            }
            mo463b(0);
            mo469c(b);
            mo473d(mo461b().mo486k());
            mo475e(0);
        }
    }
}
