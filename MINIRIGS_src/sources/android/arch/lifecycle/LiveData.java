package android.arch.lifecycle;

import android.arch.lifecycle.C0065d;
import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p002b.C0006b;
import java.util.Map;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f141b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f142a = new Object();

    /* renamed from: c */
    private C0006b<C0081m<T>, LiveData<T>.a> f143c = new C0006b<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f144d = 0;

    /* renamed from: e */
    private volatile Object f145e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f146f;

    /* renamed from: g */
    private int f147g;

    /* renamed from: h */
    private boolean f148h;

    /* renamed from: i */
    private boolean f149i;

    /* renamed from: j */
    private final Runnable f150j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo152b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo153c() {
    }

    public LiveData() {
        Object obj = f141b;
        this.f145e = obj;
        this.f146f = obj;
        this.f147g = -1;
        this.f150j = new Runnable() {
            public void run() {
                Object b;
                synchronized (LiveData.this.f142a) {
                    b = LiveData.this.f146f;
                    Object unused = LiveData.this.f146f = LiveData.f141b;
                }
                LiveData.this.mo151a(b);
            }
        };
    }

    /* renamed from: a */
    private void m202a(LiveData<T>.a aVar) {
        if (aVar.f155d) {
            if (!aVar.mo156a()) {
                aVar.mo159a(false);
                return;
            }
            int i = aVar.f156e;
            int i2 = this.f147g;
            if (i < i2) {
                aVar.f156e = i2;
                aVar.f154c.mo196a(this.f145e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m206b(LiveData<T>.a aVar) {
        if (this.f148h) {
            this.f149i = true;
            return;
        }
        this.f148h = true;
        do {
            this.f149i = false;
            if (aVar == null) {
                C0006b<K, V>.d c = this.f143c.mo14c();
                while (c.hasNext()) {
                    m202a((LiveData<T>.a) (C0059a) ((Map.Entry) c.next()).getValue());
                    if (this.f149i) {
                        break;
                    }
                }
            } else {
                m202a(aVar);
                aVar = null;
            }
        } while (this.f149i);
        this.f148h = false;
    }

    /* renamed from: a */
    public void mo149a(C0073g gVar, C0081m<T> mVar) {
        if (gVar.mo191d().mo180a() != C0065d.C0067b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            C0059a a = this.f143c.mo7a(mVar, lifecycleBoundObserver);
            if (a != null && !a.mo157a(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (a == null) {
                gVar.mo191d().mo181a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo150a(C0081m<T> mVar) {
        m204a("removeObserver");
        C0059a b = this.f143c.mo8b(mVar);
        if (b != null) {
            b.mo158b();
            b.mo159a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo151a(T t) {
        m204a("setValue");
        this.f147g++;
        this.f145e = t;
        m206b((LiveData<T>.a) null);
    }

    /* renamed from: a */
    public T mo148a() {
        T t = this.f145e;
        if (t != f141b) {
            return t;
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo154d() {
        return this.f144d > 0;
    }

    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0073g f152a;

        LifecycleBoundObserver(C0073g gVar, C0081m<T> mVar) {
            super(mVar);
            this.f152a = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo156a() {
            return this.f152a.mo191d().mo180a().mo183a(C0065d.C0067b.STARTED);
        }

        /* renamed from: a */
        public void mo141a(C0073g gVar, C0065d.C0066a aVar) {
            if (this.f152a.mo191d().mo180a() == C0065d.C0067b.DESTROYED) {
                LiveData.this.mo150a(this.f154c);
            } else {
                mo159a(mo156a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo157a(C0073g gVar) {
            return this.f152a == gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo158b() {
            this.f152a.mo191d().mo182b(this);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0059a {

        /* renamed from: c */
        final C0081m<T> f154c;

        /* renamed from: d */
        boolean f155d;

        /* renamed from: e */
        int f156e = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo156a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo157a(C0073g gVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo158b() {
        }

        C0059a(C0081m<T> mVar) {
            this.f154c = mVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo159a(boolean z) {
            if (z != this.f155d) {
                this.f155d = z;
                int i = 1;
                boolean z2 = LiveData.this.f144d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f144d;
                if (!this.f155d) {
                    i = -1;
                }
                int unused = liveData.f144d = c + i;
                if (z2 && this.f155d) {
                    LiveData.this.mo152b();
                }
                if (LiveData.this.f144d == 0 && !this.f155d) {
                    LiveData.this.mo153c();
                }
                if (this.f155d) {
                    LiveData.this.m206b((LiveData<T>.a) this);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m204a(String str) {
        if (!C0000a.m0a().mo3b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }
}
