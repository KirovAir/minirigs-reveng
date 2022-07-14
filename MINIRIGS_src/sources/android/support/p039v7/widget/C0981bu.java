package android.support.p039v7.widget;

import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p035g.C0518f;
import android.support.p026v4.p035g.C0527j;
import android.support.p039v7.widget.C0904ay;

/* renamed from: android.support.v7.widget.bu */
class C0981bu {

    /* renamed from: a */
    final C0511a<C0904ay.C0945x, C0982a> f3608a = new C0511a<>();

    /* renamed from: b */
    final C0518f<C0904ay.C0945x> f3609b = new C0518f<>();

    /* renamed from: android.support.v7.widget.bu$b */
    interface C0983b {
        /* renamed from: a */
        void mo4348a(C0904ay.C0945x xVar);

        /* renamed from: a */
        void mo4349a(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2);

        /* renamed from: b */
        void mo4350b(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2);

        /* renamed from: c */
        void mo4351c(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar, C0904ay.C0916f.C0919c cVar2);
    }

    C0981bu() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4825a() {
        this.f3608a.clear();
        this.f3609b.mo2013c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4827a(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar == null) {
            aVar = C0982a.m5204a();
            this.f3608a.put(xVar, aVar);
        }
        aVar.f3612b = cVar;
        aVar.f3611a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4829a(C0904ay.C0945x xVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar == null || (aVar.f3611a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0904ay.C0916f.C0919c mo4830b(C0904ay.C0945x xVar) {
        return m5187a(xVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0904ay.C0916f.C0919c mo4833c(C0904ay.C0945x xVar) {
        return m5187a(xVar, 8);
    }

    /* renamed from: a */
    private C0904ay.C0916f.C0919c m5187a(C0904ay.C0945x xVar, int i) {
        C0982a c;
        C0904ay.C0916f.C0919c cVar;
        int a = this.f3608a.mo2089a((Object) xVar);
        if (a < 0 || (c = this.f3608a.mo2096c(a)) == null || (c.f3611a & i) == 0) {
            return null;
        }
        c.f3611a &= ~i;
        if (i == 4) {
            cVar = c.f3612b;
        } else if (i == 8) {
            cVar = c.f3613c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((c.f3611a & 12) == 0) {
            this.f3608a.mo2100d(a);
            C0982a.m5205a(c);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4826a(long j, C0904ay.C0945x xVar) {
        this.f3609b.mo2010b(j, xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4832b(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar == null) {
            aVar = C0982a.m5204a();
            this.f3608a.put(xVar, aVar);
        }
        aVar.f3611a |= 2;
        aVar.f3612b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4835d(C0904ay.C0945x xVar) {
        C0982a aVar = this.f3608a.get(xVar);
        return (aVar == null || (aVar.f3611a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0904ay.C0945x mo4824a(long j) {
        return this.f3609b.mo2004a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4834c(C0904ay.C0945x xVar, C0904ay.C0916f.C0919c cVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar == null) {
            aVar = C0982a.m5204a();
            this.f3608a.put(xVar, aVar);
        }
        aVar.f3613c = cVar;
        aVar.f3611a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4836e(C0904ay.C0945x xVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar == null) {
            aVar = C0982a.m5204a();
            this.f3608a.put(xVar, aVar);
        }
        aVar.f3611a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4837f(C0904ay.C0945x xVar) {
        C0982a aVar = this.f3608a.get(xVar);
        if (aVar != null) {
            aVar.f3611a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4828a(C0983b bVar) {
        for (int size = this.f3608a.size() - 1; size >= 0; size--) {
            C0904ay.C0945x b = this.f3608a.mo2095b(size);
            C0982a d = this.f3608a.mo2100d(size);
            if ((d.f3611a & 3) == 3) {
                bVar.mo4348a(b);
            } else if ((d.f3611a & 1) != 0) {
                if (d.f3612b == null) {
                    bVar.mo4348a(b);
                } else {
                    bVar.mo4349a(b, d.f3612b, d.f3613c);
                }
            } else if ((d.f3611a & 14) == 14) {
                bVar.mo4350b(b, d.f3612b, d.f3613c);
            } else if ((d.f3611a & 12) == 12) {
                bVar.mo4351c(b, d.f3612b, d.f3613c);
            } else if ((d.f3611a & 4) != 0) {
                bVar.mo4349a(b, d.f3612b, (C0904ay.C0916f.C0919c) null);
            } else if ((d.f3611a & 8) != 0) {
                bVar.mo4350b(b, d.f3612b, d.f3613c);
            } else {
                int i = d.f3611a;
            }
            C0982a.m5205a(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4838g(C0904ay.C0945x xVar) {
        int b = this.f3609b.mo2007b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (xVar == this.f3609b.mo2012c(b)) {
                this.f3609b.mo2006a(b);
                break;
            } else {
                b--;
            }
        }
        C0982a remove = this.f3608a.remove(xVar);
        if (remove != null) {
            C0982a.m5205a(remove);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4831b() {
        C0982a.m5206b();
    }

    /* renamed from: h */
    public void mo4839h(C0904ay.C0945x xVar) {
        mo4837f(xVar);
    }

    /* renamed from: android.support.v7.widget.bu$a */
    static class C0982a {

        /* renamed from: d */
        static C0527j.C0528a<C0982a> f3610d = new C0527j.C0529b(20);

        /* renamed from: a */
        int f3611a;

        /* renamed from: b */
        C0904ay.C0916f.C0919c f3612b;

        /* renamed from: c */
        C0904ay.C0916f.C0919c f3613c;

        private C0982a() {
        }

        /* renamed from: a */
        static C0982a m5204a() {
            C0982a a = f3610d.mo2086a();
            return a == null ? new C0982a() : a;
        }

        /* renamed from: a */
        static void m5205a(C0982a aVar) {
            aVar.f3611a = 0;
            aVar.f3612b = null;
            aVar.f3613c = null;
            f3610d.mo2087a(aVar);
        }

        /* renamed from: b */
        static void m5206b() {
            do {
            } while (f3610d.mo2086a() != null);
        }
    }
}
