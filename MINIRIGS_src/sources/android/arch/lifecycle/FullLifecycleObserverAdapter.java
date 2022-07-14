package android.arch.lifecycle;

import android.arch.lifecycle.C0065d;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f139a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f139a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo141a(C0073g gVar, C0065d.C0066a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f139a.mo142a(gVar);
                return;
            case ON_START:
                this.f139a.mo143b(gVar);
                return;
            case ON_RESUME:
                this.f139a.mo144c(gVar);
                return;
            case ON_PAUSE:
                this.f139a.mo145d(gVar);
                return;
            case ON_STOP:
                this.f139a.mo146e(gVar);
                return;
            case ON_DESTROY:
                this.f139a.mo147f(gVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
