package android.support.constraint.p013a.p014a;

import android.support.constraint.p013a.C0158c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.h */
public class C0156h extends C0147c {

    /* renamed from: H */
    protected ArrayList<C0147c> f527H = new ArrayList<>();

    /* renamed from: a */
    public void mo449a() {
        this.f527H.clear();
        super.mo449a();
    }

    /* renamed from: b */
    public void mo517b(C0147c cVar) {
        this.f527H.add(cVar);
        if (cVar.mo461b() != null) {
            ((C0156h) cVar.mo461b()).mo518c(cVar);
        }
        cVar.mo456a((C0147c) this);
    }

    /* renamed from: c */
    public void mo518c(C0147c cVar) {
        this.f527H.remove(cVar);
        cVar.mo456a((C0147c) null);
    }

    /* renamed from: C */
    public C0150d mo516C() {
        C0147c b = mo461b();
        C0150d dVar = this instanceof C0150d ? (C0150d) this : null;
        while (b != null) {
            C0147c b2 = b.mo461b();
            if (b instanceof C0150d) {
                dVar = (C0150d) b;
                b = b2;
            } else {
                b = b2;
            }
        }
        return dVar;
    }

    /* renamed from: b */
    public void mo464b(int i, int i2) {
        super.mo464b(i, i2);
        int size = this.f527H.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f527H.get(i3).mo464b(mo490o(), mo491p());
        }
    }

    /* renamed from: w */
    public void mo499w() {
        super.mo499w();
        ArrayList<C0147c> arrayList = this.f527H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0147c cVar = this.f527H.get(i);
                cVar.mo464b(mo488m(), mo489n());
                if (!(cVar instanceof C0150d)) {
                    cVar.mo499w();
                }
            }
        }
    }

    /* renamed from: A */
    public void mo503A() {
        mo499w();
        ArrayList<C0147c> arrayList = this.f527H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0147c cVar = this.f527H.get(i);
                if (cVar instanceof C0156h) {
                    ((C0156h) cVar).mo503A();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo457a(C0158c cVar) {
        super.mo457a(cVar);
        int size = this.f527H.size();
        for (int i = 0; i < size; i++) {
            this.f527H.get(i).mo457a(cVar);
        }
    }
}
