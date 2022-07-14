package android.arch.lifecycle;

import android.arch.lifecycle.C0065d;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0064c[] f138a;

    CompositeGeneratedAdaptersObserver(C0064c[] cVarArr) {
        this.f138a = cVarArr;
    }

    /* renamed from: a */
    public void mo141a(C0073g gVar, C0065d.C0066a aVar) {
        C0079k kVar = new C0079k();
        for (C0064c a : this.f138a) {
            a.mo179a(gVar, aVar, false, kVar);
        }
        for (C0064c a2 : this.f138a) {
            a2.mo179a(gVar, aVar, true, kVar);
        }
    }
}
