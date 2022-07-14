package android.arch.lifecycle;

import android.arch.lifecycle.C0065d;
import android.arch.p000a.p002b.C0005a;
import android.arch.p000a.p002b.C0006b;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.h */
public class C0074h extends C0065d {

    /* renamed from: a */
    private C0005a<C0072f, C0076a> f176a = new C0005a<>();

    /* renamed from: b */
    private C0065d.C0067b f177b;

    /* renamed from: c */
    private final WeakReference<C0073g> f178c;

    /* renamed from: d */
    private int f179d = 0;

    /* renamed from: e */
    private boolean f180e = false;

    /* renamed from: f */
    private boolean f181f = false;

    /* renamed from: g */
    private ArrayList<C0065d.C0067b> f182g = new ArrayList<>();

    public C0074h(C0073g gVar) {
        this.f178c = new WeakReference<>(gVar);
        this.f177b = C0065d.C0067b.INITIALIZED;
    }

    /* renamed from: a */
    public void mo193a(C0065d.C0067b bVar) {
        m257b(bVar);
    }

    /* renamed from: a */
    public void mo192a(C0065d.C0066a aVar) {
        m257b(m256b(aVar));
    }

    /* renamed from: b */
    private void m257b(C0065d.C0067b bVar) {
        if (this.f177b != bVar) {
            this.f177b = bVar;
            if (this.f180e || this.f179d != 0) {
                this.f181f = true;
                return;
            }
            this.f180e = true;
            m264d();
            this.f180e = false;
        }
    }

    /* renamed from: b */
    private boolean m259b() {
        if (this.f176a.mo11a() == 0) {
            return true;
        }
        C0065d.C0067b bVar = this.f176a.mo15d().getValue().f185a;
        C0065d.C0067b bVar2 = this.f176a.mo16e().getValue().f185a;
        if (bVar == bVar2 && this.f177b == bVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private C0065d.C0067b m260c(C0072f fVar) {
        Map.Entry<C0072f, C0076a> d = this.f176a.mo10d(fVar);
        C0065d.C0067b bVar = null;
        C0065d.C0067b bVar2 = d != null ? d.getValue().f185a : null;
        if (!this.f182g.isEmpty()) {
            ArrayList<C0065d.C0067b> arrayList = this.f182g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m254a(m254a(this.f177b, bVar2), bVar);
    }

    /* renamed from: a */
    public void mo181a(C0072f fVar) {
        C0073g gVar;
        C0076a aVar = new C0076a(fVar, this.f177b == C0065d.C0067b.DESTROYED ? C0065d.C0067b.DESTROYED : C0065d.C0067b.INITIALIZED);
        if (this.f176a.mo7a(fVar, aVar) == null && (gVar = (C0073g) this.f178c.get()) != null) {
            boolean z = this.f179d != 0 || this.f180e;
            C0065d.C0067b c = m260c(fVar);
            this.f179d++;
            while (aVar.f185a.compareTo(c) < 0 && this.f176a.mo9c(fVar)) {
                m262c(aVar.f185a);
                aVar.mo194a(gVar, m265e(aVar.f185a));
                m261c();
                c = m260c(fVar);
            }
            if (!z) {
                m264d();
            }
            this.f179d--;
        }
    }

    /* renamed from: c */
    private void m261c() {
        ArrayList<C0065d.C0067b> arrayList = this.f182g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private void m262c(C0065d.C0067b bVar) {
        this.f182g.add(bVar);
    }

    /* renamed from: b */
    public void mo182b(C0072f fVar) {
        this.f176a.mo8b(fVar);
    }

    /* renamed from: a */
    public C0065d.C0067b mo180a() {
        return this.f177b;
    }

    /* renamed from: b */
    static C0065d.C0067b m256b(C0065d.C0066a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0065d.C0067b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0065d.C0067b.STARTED;
            case ON_RESUME:
                return C0065d.C0067b.RESUMED;
            case ON_DESTROY:
                return C0065d.C0067b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: d */
    private static C0065d.C0066a m263d(C0065d.C0067b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0065d.C0066a.ON_DESTROY;
            case STARTED:
                return C0065d.C0066a.ON_STOP;
            case RESUMED:
                return C0065d.C0066a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: e */
    private static C0065d.C0066a m265e(C0065d.C0067b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0065d.C0066a.ON_CREATE;
            case CREATED:
                return C0065d.C0066a.ON_START;
            case STARTED:
                return C0065d.C0066a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: a */
    private void m255a(C0073g gVar) {
        C0006b<K, V>.d c = this.f176a.mo14c();
        while (c.hasNext() && !this.f181f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0076a aVar = (C0076a) entry.getValue();
            while (aVar.f185a.compareTo(this.f177b) < 0 && !this.f181f && this.f176a.mo9c(entry.getKey())) {
                m262c(aVar.f185a);
                aVar.mo194a(gVar, m265e(aVar.f185a));
                m261c();
            }
        }
    }

    /* renamed from: b */
    private void m258b(C0073g gVar) {
        Iterator<Map.Entry<C0072f, C0076a>> b = this.f176a.mo13b();
        while (b.hasNext() && !this.f181f) {
            Map.Entry next = b.next();
            C0076a aVar = (C0076a) next.getValue();
            while (aVar.f185a.compareTo(this.f177b) > 0 && !this.f181f && this.f176a.mo9c(next.getKey())) {
                C0065d.C0066a d = m263d(aVar.f185a);
                m262c(m256b(d));
                aVar.mo194a(gVar, d);
                m261c();
            }
        }
    }

    /* renamed from: d */
    private void m264d() {
        C0073g gVar = (C0073g) this.f178c.get();
        if (gVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m259b()) {
            this.f181f = false;
            if (this.f177b.compareTo(this.f176a.mo15d().getValue().f185a) < 0) {
                m258b(gVar);
            }
            Map.Entry<C0072f, C0076a> e = this.f176a.mo16e();
            if (!this.f181f && e != null && this.f177b.compareTo(e.getValue().f185a) > 0) {
                m255a(gVar);
            }
        }
        this.f181f = false;
    }

    /* renamed from: a */
    static C0065d.C0067b m254a(C0065d.C0067b bVar, C0065d.C0067b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: android.arch.lifecycle.h$a */
    static class C0076a {

        /* renamed from: a */
        C0065d.C0067b f185a;

        /* renamed from: b */
        GenericLifecycleObserver f186b;

        C0076a(C0072f fVar, C0065d.C0067b bVar) {
            this.f186b = C0078j.m273a((Object) fVar);
            this.f185a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo194a(C0073g gVar, C0065d.C0066a aVar) {
            C0065d.C0067b b = C0074h.m256b(aVar);
            this.f185a = C0074h.m254a(this.f185a, b);
            this.f186b.mo141a(gVar, aVar);
            this.f185a = b;
        }
    }
}
