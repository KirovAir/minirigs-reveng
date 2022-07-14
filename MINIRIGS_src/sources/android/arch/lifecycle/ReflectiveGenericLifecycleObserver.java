package android.arch.lifecycle;

import android.arch.lifecycle.C0060a;
import android.arch.lifecycle.C0065d;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f158a;

    /* renamed from: b */
    private final C0060a.C0061a f159b = C0060a.f161a.mo167b(this.f158a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f158a = obj;
    }

    /* renamed from: a */
    public void mo141a(C0073g gVar, C0065d.C0066a aVar) {
        this.f159b.mo168a(gVar, aVar, this.f158a);
    }
}
