package android.support.constraint.p013a;

import android.support.constraint.p013a.C0164g;
import android.support.constraint.p013a.p014a.C0142b;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
public class C0160e {

    /* renamed from: a */
    int f540a;

    /* renamed from: b */
    int f541b;

    /* renamed from: c */
    int f542c;

    /* renamed from: d */
    C0164g[] f543d;

    /* renamed from: e */
    private int f544e = 0;

    /* renamed from: f */
    private HashMap<String, C0164g> f545f = null;

    /* renamed from: g */
    private C0157b f546g;

    /* renamed from: h */
    private int f547h = 32;

    /* renamed from: i */
    private int f548i;

    /* renamed from: j */
    private C0157b[] f549j;

    /* renamed from: k */
    private boolean[] f550k;

    /* renamed from: l */
    private final C0158c f551l;

    /* renamed from: m */
    private C0164g[] f552m;

    /* renamed from: n */
    private int f553n;

    /* renamed from: o */
    private C0157b[] f554o;

    public C0160e() {
        int i = this.f547h;
        this.f548i = i;
        this.f549j = null;
        this.f550k = new boolean[i];
        this.f540a = 1;
        this.f541b = 0;
        this.f542c = i;
        this.f552m = new C0164g[1000];
        this.f553n = 0;
        this.f543d = new C0164g[256];
        this.f554o = new C0157b[32];
        this.f549j = new C0157b[i];
        m591i();
        this.f551l = new C0158c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo542a() {
        this.f547h *= 2;
        this.f549j = (C0157b[]) Arrays.copyOf(this.f549j, this.f547h);
        C0158c cVar = this.f551l;
        cVar.f539e = (C0164g[]) Arrays.copyOf(cVar.f539e, this.f547h);
        int i = this.f547h;
        this.f550k = new boolean[i];
        this.f548i = i;
        this.f542c = i;
        m592j();
        this.f546g = null;
    }

    /* renamed from: i */
    private void m591i() {
        int i = 0;
        while (true) {
            C0157b[] bVarArr = this.f549j;
            if (i < bVarArr.length) {
                C0157b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f551l.f536b.mo562a(bVar);
                }
                this.f549j[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    private void m592j() {
        if (this.f546g != null) {
            this.f551l.f536b.mo562a(this.f546g);
        }
    }

    /* renamed from: b */
    public void mo549b() {
        for (C0164g gVar : this.f551l.f539e) {
            if (gVar != null) {
                gVar.mo563a();
            }
        }
        this.f551l.f537c.mo561a(this.f552m, this.f553n);
        this.f553n = 0;
        Arrays.fill(this.f551l.f539e, (Object) null);
        HashMap<String, C0164g> hashMap = this.f545f;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f544e = 0;
        m592j();
        this.f546g = null;
        this.f540a = 1;
        for (int i = 0; i < this.f541b; i++) {
            this.f549j[i].f531d = false;
        }
        m591i();
        this.f541b = 0;
    }

    /* renamed from: a */
    public C0164g mo541a(Object obj) {
        C0164g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f540a + 1 >= this.f548i) {
            mo542a();
        }
        if (obj instanceof C0142b) {
            C0142b bVar = (C0142b) obj;
            gVar = bVar.mo433a();
            if (gVar == null) {
                bVar.mo435a(this.f551l);
                gVar = bVar.mo433a();
            }
            if (gVar.f558b == -1 || gVar.f558b > this.f544e || this.f551l.f539e[gVar.f558b] == null) {
                if (gVar.f558b != -1) {
                    gVar.mo563a();
                }
                this.f544e++;
                this.f540a++;
                gVar.f558b = this.f544e;
                gVar.f562f = C0164g.C0166b.UNRESTRICTED;
                this.f551l.f539e[this.f544e] = gVar;
            }
        }
        return gVar;
    }

    /* renamed from: c */
    public C0157b mo552c() {
        C0157b a = this.f551l.f536b.mo560a();
        if (a == null) {
            return new C0157b(this.f551l);
        }
        a.mo537e();
        return a;
    }

    /* renamed from: d */
    public C0164g mo555d() {
        if (this.f540a + 1 >= this.f548i) {
            mo542a();
        }
        C0164g a = m587a(C0164g.C0166b.SLACK);
        this.f544e++;
        this.f540a++;
        a.f558b = this.f544e;
        this.f551l.f539e[this.f544e] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo543a(C0157b bVar) {
        bVar.mo521a(mo556e(), mo556e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo544a(C0157b bVar, int i) {
        bVar.mo534c(mo556e(), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0164g mo556e() {
        if (this.f540a + 1 >= this.f548i) {
            mo542a();
        }
        C0164g a = m587a(C0164g.C0166b.ERROR);
        this.f544e++;
        this.f540a++;
        a.f558b = this.f544e;
        this.f551l.f539e[this.f544e] = a;
        return a;
    }

    /* renamed from: a */
    private final C0164g m587a(C0164g.C0166b bVar) {
        C0164g a = this.f551l.f537c.mo560a();
        if (a == null) {
            a = new C0164g(this.f551l, bVar);
        }
        a.mo563a();
        a.mo565a(bVar);
        C0164g[] gVarArr = this.f552m;
        int i = this.f553n;
        this.f553n = i + 1;
        gVarArr[i] = a;
        return a;
    }

    /* renamed from: b */
    public int mo548b(Object obj) {
        C0164g a = ((C0142b) obj).mo433a();
        if (a != null) {
            return (int) (a.f561e + 0.5f);
        }
        return 0;
    }

    /* renamed from: f */
    public void mo557f() {
        C0157b bVar = this.f546g;
        if (bVar != null) {
            bVar.mo537e();
        } else {
            this.f546g = mo552c();
        }
        for (int i = 1; i < this.f540a; i++) {
            C0164g gVar = this.f551l.f539e[i];
            if (gVar.f562f == C0164g.C0166b.ERROR) {
                this.f546g.f533f.mo414a(gVar, 1.0f);
            }
        }
    }

    /* renamed from: g */
    public void mo558g() {
        mo557f();
        mo550b(this.f546g);
    }

    /* renamed from: b */
    public void mo550b(C0157b bVar) {
        bVar.f533f.mo413a(bVar, this.f549j);
        if (!bVar.mo533b()) {
            m593k();
            return;
        }
        try {
            m590f(bVar);
            m589e(bVar);
            m593k();
        } catch (Exception e) {
            m593k();
            throw e;
        }
    }

    /* renamed from: d */
    private void m588d(C0157b bVar) {
        if (this.f541b > 0) {
            bVar.f533f.mo413a(bVar, this.f549j);
            if (bVar.f533f.f388a == 0) {
                bVar.f534g = true;
            }
        }
    }

    /* renamed from: c */
    public void mo553c(C0157b bVar) {
        C0157b[] bVarArr;
        if (bVar != null) {
            if (this.f541b + 1 >= this.f542c || this.f540a + 1 >= this.f548i) {
                mo542a();
            }
            if (!bVar.f534g) {
                m588d(bVar);
                bVar.mo538f();
                bVar.mo539g();
                if (!bVar.mo535c()) {
                    return;
                }
            }
            if (this.f549j[this.f541b] != null) {
                this.f551l.f536b.mo562a(this.f549j[this.f541b]);
            }
            if (!bVar.f534g) {
                bVar.mo527a();
            }
            this.f549j[this.f541b] = bVar;
            C0164g gVar = bVar.f528a;
            int i = this.f541b;
            gVar.f559c = i;
            this.f541b = i + 1;
            int i2 = bVar.f528a.f565i;
            if (i2 > 0) {
                while (true) {
                    bVarArr = this.f554o;
                    if (bVarArr.length >= i2) {
                        break;
                    }
                    this.f554o = new C0157b[(bVarArr.length * 2)];
                }
                System.arraycopy(bVar.f528a.f564h, 0, bVarArr, 0, i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    C0157b bVar2 = bVarArr[i3];
                    if (bVar2 != bVar) {
                        bVar2.f533f.mo412a(bVar2, bVar);
                        bVar2.mo527a();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private int m589e(C0157b bVar) {
        C0157b bVar2 = bVar;
        for (int i = 0; i < this.f540a; i++) {
            this.f550k[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            i2++;
            C0164g e = bVar2.f533f.mo422e();
            if (e != null) {
                if (this.f550k[e.f558b]) {
                    e = null;
                } else {
                    this.f550k[e.f558b] = true;
                    i3++;
                    if (i3 >= this.f540a) {
                        z = true;
                    }
                }
            }
            if (e != null) {
                float c = bVar2.f533f.mo419c(e);
                int i4 = -1;
                int i5 = 0;
                float f = Float.MAX_VALUE;
                for (int i6 = 0; i6 < this.f541b; i6++) {
                    C0157b bVar3 = this.f549j[i6];
                    if (bVar3.f528a.f562f != C0164g.C0166b.UNRESTRICTED && bVar3.mo529a(e)) {
                        float f2 = bVar3.f530c;
                        float c2 = bVar3.f533f.mo419c(e);
                        if (c2 > 0.0f) {
                            float f3 = c / c2;
                            if (e.f560d >= i5 && f3 < f) {
                                f = f3;
                                i5 = e.f560d;
                                i4 = i6;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0157b bVar4 = this.f549j[i4];
                    bVar4.f528a.f559c = -1;
                    bVar4.mo532b(e);
                    bVar4.f528a.f559c = i4;
                    for (int i7 = 0; i7 < this.f541b; i7++) {
                        this.f549j[i7].mo528a(bVar4);
                    }
                    bVar2.mo528a(bVar4);
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* renamed from: f */
    private int m590f(C0157b bVar) {
        boolean z;
        int i;
        C0157b bVar2 = bVar;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f541b) {
                z = false;
                break;
            } else if (this.f549j[i2].f528a.f562f != C0164g.C0166b.UNRESTRICTED && this.f549j[i2].f530c < 0.0f) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            boolean z2 = false;
            i = 0;
            while (!z2) {
                i++;
                int i3 = -1;
                int i4 = -1;
                int i5 = Integer.MAX_VALUE;
                float f = Float.MAX_VALUE;
                for (int i6 = 0; i6 < this.f541b; i6++) {
                    C0157b bVar3 = this.f549j[i6];
                    if (bVar3.f528a.f562f != C0164g.C0166b.UNRESTRICTED && bVar3.f530c < 0.0f) {
                        float f2 = f;
                        int i7 = i5;
                        int i8 = i4;
                        int i9 = i3;
                        for (int i10 = 1; i10 < this.f540a; i10++) {
                            C0164g gVar = this.f551l.f539e[i10];
                            float c = bVar3.f533f.mo419c(gVar);
                            if (c > 0.0f) {
                                float c2 = bVar2.f533f.mo419c(gVar) / c;
                                if (gVar.f560d <= i7 && c2 < f2) {
                                    i7 = gVar.f560d;
                                    f2 = c2;
                                    i9 = i6;
                                    i8 = i10;
                                }
                            }
                        }
                        i3 = i9;
                        i4 = i8;
                        i5 = i7;
                        f = f2;
                    }
                }
                if (i3 != -1) {
                    C0157b bVar4 = this.f549j[i3];
                    bVar4.f528a.f559c = -1;
                    bVar4.mo532b(this.f551l.f539e[i4]);
                    bVar4.f528a.f559c = i3;
                    for (int i11 = 0; i11 < this.f541b; i11++) {
                        this.f549j[i11].mo528a(bVar4);
                    }
                    bVar2.mo528a(bVar4);
                } else {
                    z2 = true;
                }
            }
        } else {
            i = 0;
        }
        int i12 = 0;
        while (i12 < this.f541b && (this.f549j[i12].f528a.f562f == C0164g.C0166b.UNRESTRICTED || this.f549j[i12].f530c >= 0.0f)) {
            i12++;
        }
        return i;
    }

    /* renamed from: k */
    private void m593k() {
        for (int i = 0; i < this.f541b; i++) {
            C0157b bVar = this.f549j[i];
            bVar.f528a.f561e = bVar.f530c;
        }
    }

    /* renamed from: h */
    public C0158c mo559h() {
        return this.f551l;
    }

    /* renamed from: a */
    public void mo547a(C0164g gVar, C0164g gVar2, int i, int i2) {
        C0157b c = mo552c();
        C0164g d = mo555d();
        d.f560d = i2;
        c.mo525a(gVar, gVar2, d, i);
        mo553c(c);
    }

    /* renamed from: b */
    public void mo551b(C0164g gVar, C0164g gVar2, int i, int i2) {
        C0157b c = mo552c();
        C0164g d = mo555d();
        d.f560d = i2;
        c.mo531b(gVar, gVar2, d, i);
        mo553c(c);
    }

    /* renamed from: a */
    public void mo546a(C0164g gVar, C0164g gVar2, int i, float f, C0164g gVar3, C0164g gVar4, int i2, int i3) {
        int i4 = i3;
        C0157b c = mo552c();
        c.mo523a(gVar, gVar2, i, f, gVar3, gVar4, i2, false);
        C0164g e = mo556e();
        C0164g e2 = mo556e();
        e.f560d = i4;
        e2.f560d = i4;
        c.mo521a(e, e2);
        mo553c(c);
    }

    /* renamed from: c */
    public void mo554c(C0164g gVar, C0164g gVar2, int i, int i2) {
        C0157b c = mo552c();
        c.mo522a(gVar, gVar2, i);
        C0164g e = mo556e();
        C0164g e2 = mo556e();
        e.f560d = i2;
        e2.f560d = i2;
        c.mo521a(e, e2);
        mo553c(c);
    }

    /* renamed from: a */
    public void mo545a(C0164g gVar, int i) {
        int i2 = gVar.f559c;
        if (gVar.f559c != -1) {
            C0157b bVar = this.f549j[i2];
            if (bVar.f534g) {
                bVar.f530c = (float) i;
                return;
            }
            C0157b c = mo552c();
            c.mo530b(gVar, i);
            mo553c(c);
            return;
        }
        C0157b c2 = mo552c();
        c2.mo520a(gVar, i);
        mo553c(c2);
    }
}
