package android.support.constraint.p013a;

import android.support.constraint.p013a.C0164g;

/* renamed from: android.support.constraint.a.b */
public class C0157b {

    /* renamed from: a */
    C0164g f528a = null;

    /* renamed from: b */
    float f529b = 0.0f;

    /* renamed from: c */
    float f530c = 0.0f;

    /* renamed from: d */
    boolean f531d = false;

    /* renamed from: e */
    final float f532e = 0.001f;

    /* renamed from: f */
    final C0139a f533f;

    /* renamed from: g */
    boolean f534g = false;

    public C0157b(C0158c cVar) {
        this.f533f = new C0139a(this, cVar);
    }

    /* renamed from: a */
    public void mo527a() {
        this.f533f.mo411a(this);
    }

    /* renamed from: b */
    public boolean mo533b() {
        return this.f533f.mo417b();
    }

    /* renamed from: c */
    public boolean mo535c() {
        C0164g gVar = this.f528a;
        return gVar != null && (gVar.f562f == C0164g.C0166b.UNRESTRICTED || this.f530c >= 0.0f);
    }

    public String toString() {
        return mo536d();
    }

    /* renamed from: d */
    public String mo536d() {
        String str;
        boolean z;
        String str2;
        if (this.f528a == null) {
            str = "" + "0";
        } else {
            str = "" + this.f528a;
        }
        String str3 = str + " = ";
        if (this.f530c != 0.0f) {
            str3 = str3 + this.f530c;
            z = true;
        } else {
            z = false;
        }
        int i = this.f533f.f388a;
        for (int i2 = 0; i2 < i; i2++) {
            C0164g a = this.f533f.mo408a(i2);
            if (a != null) {
                float b = this.f533f.mo415b(i2);
                String gVar = a.toString();
                if (!z) {
                    if (b < 0.0f) {
                        str2 = str2 + "- ";
                        b *= -1.0f;
                    }
                } else if (b > 0.0f) {
                    str2 = str2 + " + ";
                } else {
                    str2 = str2 + " - ";
                    b *= -1.0f;
                }
                if (b == 1.0f) {
                    str2 = str2 + gVar;
                } else {
                    str2 = str2 + b + " " + gVar;
                }
                z = true;
            }
        }
        if (z) {
            return str2;
        }
        return str2 + "0.0";
    }

    /* renamed from: e */
    public void mo537e() {
        this.f528a = null;
        this.f533f.mo409a();
        this.f529b = 0.0f;
        this.f530c = 0.0f;
        this.f534g = false;
    }

    /* renamed from: a */
    public boolean mo529a(C0164g gVar) {
        return this.f533f.mo418b(gVar);
    }

    /* renamed from: a */
    public C0157b mo520a(C0164g gVar, int i) {
        this.f528a = gVar;
        this.f530c = (float) i;
        this.f534g = true;
        return this;
    }

    /* renamed from: b */
    public C0157b mo530b(C0164g gVar, int i) {
        if (i < 0) {
            this.f530c = (float) (i * -1);
            this.f533f.mo414a(gVar, 1.0f);
        } else {
            this.f530c = (float) i;
            this.f533f.mo414a(gVar, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0157b mo522a(C0164g gVar, C0164g gVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f530c = (float) i;
        }
        if (!z) {
            this.f533f.mo414a(gVar, -1.0f);
            this.f533f.mo414a(gVar2, 1.0f);
        } else {
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: c */
    public C0157b mo534c(C0164g gVar, int i) {
        this.f533f.mo414a(gVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C0157b mo525a(C0164g gVar, C0164g gVar2, C0164g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f530c = (float) i;
        }
        if (!z) {
            this.f533f.mo414a(gVar, -1.0f);
            this.f533f.mo414a(gVar2, 1.0f);
            this.f533f.mo414a(gVar3, 1.0f);
        } else {
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
            this.f533f.mo414a(gVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0157b mo531b(C0164g gVar, C0164g gVar2, C0164g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f530c = (float) i;
        }
        if (!z) {
            this.f533f.mo414a(gVar, -1.0f);
            this.f533f.mo414a(gVar2, 1.0f);
            this.f533f.mo414a(gVar3, -1.0f);
        } else {
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
            this.f533f.mo414a(gVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0157b mo519a(float f, float f2, float f3, C0164g gVar, int i, C0164g gVar2, int i2, C0164g gVar3, int i3, C0164g gVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f530c = (float) (((-i) - i2) + i3 + i4);
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
            this.f533f.mo414a(gVar4, 1.0f);
            this.f533f.mo414a(gVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f530c = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
            this.f533f.mo414a(gVar4, f4);
            this.f533f.mo414a(gVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0157b mo523a(C0164g gVar, C0164g gVar2, int i, float f, C0164g gVar3, C0164g gVar4, int i2, boolean z) {
        if (gVar2 == gVar3) {
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar4, 1.0f);
            this.f533f.mo414a(gVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f533f.mo414a(gVar, 1.0f);
            this.f533f.mo414a(gVar2, -1.0f);
            this.f533f.mo414a(gVar3, -1.0f);
            this.f533f.mo414a(gVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f530c = (float) ((-i) + i2);
            }
        } else {
            float f2 = 1.0f - f;
            this.f533f.mo414a(gVar, f2 * 1.0f);
            this.f533f.mo414a(gVar2, f2 * -1.0f);
            this.f533f.mo414a(gVar3, -1.0f * f);
            this.f533f.mo414a(gVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f530c = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0157b mo521a(C0164g gVar, C0164g gVar2) {
        this.f533f.mo414a(gVar, 1.0f);
        this.f533f.mo414a(gVar2, -1.0f);
        return this;
    }

    /* renamed from: a */
    public C0157b mo524a(C0164g gVar, C0164g gVar2, C0164g gVar3, float f) {
        this.f533f.mo414a(gVar, -1.0f);
        this.f533f.mo414a(gVar2, 1.0f - f);
        this.f533f.mo414a(gVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0157b mo526a(C0164g gVar, C0164g gVar2, C0164g gVar3, C0164g gVar4, float f) {
        this.f533f.mo414a(gVar, -1.0f);
        this.f533f.mo414a(gVar2, 1.0f);
        this.f533f.mo414a(gVar3, f);
        this.f533f.mo414a(gVar4, -f);
        return this;
    }

    /* renamed from: a */
    public boolean mo528a(C0157b bVar) {
        this.f533f.mo412a(this, bVar);
        return true;
    }

    /* renamed from: f */
    public void mo538f() {
        float f = this.f530c;
        if (f < 0.0f) {
            this.f530c = f * -1.0f;
            this.f533f.mo420c();
        }
    }

    /* renamed from: g */
    public void mo539g() {
        C0164g d = this.f533f.mo421d();
        if (d != null) {
            mo532b(d);
        }
        if (this.f533f.f388a == 0) {
            this.f534g = true;
        }
    }

    /* renamed from: b */
    public void mo532b(C0164g gVar) {
        C0164g gVar2 = this.f528a;
        if (gVar2 != null) {
            this.f533f.mo414a(gVar2, -1.0f);
            this.f528a = null;
        }
        float a = this.f533f.mo407a(gVar) * -1.0f;
        this.f528a = gVar;
        this.f529b = 1.0f;
        if (a != 1.0f) {
            this.f530c /= a;
            this.f533f.mo410a(a);
        }
    }
}
