package android.support.p039v7.view;

import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.p036h.C0605w;
import android.support.p026v4.p036h.C0606x;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0736h {

    /* renamed from: a */
    final ArrayList<C0601v> f2405a = new ArrayList<>();

    /* renamed from: b */
    C0605w f2406b;

    /* renamed from: c */
    private long f2407c = -1;

    /* renamed from: d */
    private Interpolator f2408d;

    /* renamed from: e */
    private boolean f2409e;

    /* renamed from: f */
    private final C0606x f2410f = new C0606x() {

        /* renamed from: b */
        private boolean f2412b = false;

        /* renamed from: c */
        private int f2413c = 0;

        /* renamed from: a */
        public void mo2309a(View view) {
            if (!this.f2412b) {
                this.f2412b = true;
                if (C0736h.this.f2406b != null) {
                    C0736h.this.f2406b.mo2309a((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2889a() {
            this.f2413c = 0;
            this.f2412b = false;
            C0736h.this.mo2887b();
        }

        /* renamed from: b */
        public void mo2310b(View view) {
            int i = this.f2413c + 1;
            this.f2413c = i;
            if (i == C0736h.this.f2405a.size()) {
                if (C0736h.this.f2406b != null) {
                    C0736h.this.f2406b.mo2310b((View) null);
                }
                mo2889a();
            }
        }
    };

    /* renamed from: a */
    public C0736h mo2882a(C0601v vVar) {
        if (!this.f2409e) {
            this.f2405a.add(vVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0736h mo2883a(C0601v vVar, C0601v vVar2) {
        this.f2405a.add(vVar);
        vVar2.mo2302b(vVar.mo2295a());
        this.f2405a.add(vVar2);
        return this;
    }

    /* renamed from: a */
    public void mo2886a() {
        if (!this.f2409e) {
            Iterator<C0601v> it = this.f2405a.iterator();
            while (it.hasNext()) {
                C0601v next = it.next();
                long j = this.f2407c;
                if (j >= 0) {
                    next.mo2297a(j);
                }
                Interpolator interpolator = this.f2408d;
                if (interpolator != null) {
                    next.mo2300a(interpolator);
                }
                if (this.f2406b != null) {
                    next.mo2298a((C0605w) this.f2410f);
                }
                next.mo2304c();
            }
            this.f2409e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2887b() {
        this.f2409e = false;
    }

    /* renamed from: c */
    public void mo2888c() {
        if (this.f2409e) {
            Iterator<C0601v> it = this.f2405a.iterator();
            while (it.hasNext()) {
                it.next().mo2303b();
            }
            this.f2409e = false;
        }
    }

    /* renamed from: a */
    public C0736h mo2881a(long j) {
        if (!this.f2409e) {
            this.f2407c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0736h mo2885a(Interpolator interpolator) {
        if (!this.f2409e) {
            this.f2408d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0736h mo2884a(C0605w wVar) {
        if (!this.f2409e) {
            this.f2406b = wVar;
        }
        return this;
    }
}
