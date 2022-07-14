package com.android.p046a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.a.f */
public class C1079f implements C1098q {

    /* renamed from: a */
    private final Executor f3885a;

    public C1079f(final Handler handler) {
        this.f3885a = new Executor() {
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public void mo5168a(C1089n<?> nVar, C1095p<?> pVar) {
        mo5169a(nVar, pVar, (Runnable) null);
    }

    /* renamed from: a */
    public void mo5169a(C1089n<?> nVar, C1095p<?> pVar, Runnable runnable) {
        nVar.mo5213v();
        nVar.mo5190a("post-response");
        this.f3885a.execute(new C1081a(nVar, pVar, runnable));
    }

    /* renamed from: a */
    public void mo5170a(C1089n<?> nVar, C1102u uVar) {
        nVar.mo5190a("post-error");
        this.f3885a.execute(new C1081a(nVar, C1095p.m5664a(uVar), (Runnable) null));
    }

    /* renamed from: com.android.a.f$a */
    private class C1081a implements Runnable {

        /* renamed from: b */
        private final C1089n f3889b;

        /* renamed from: c */
        private final C1095p f3890c;

        /* renamed from: d */
        private final Runnable f3891d;

        public C1081a(C1089n nVar, C1095p pVar, Runnable runnable) {
            this.f3889b = nVar;
            this.f3890c = pVar;
            this.f3891d = runnable;
        }

        public void run() {
            if (this.f3889b.mo5198g()) {
                this.f3889b.mo5193b("canceled-at-delivery");
                return;
            }
            if (this.f3890c.mo5223a()) {
                this.f3889b.mo5141b(this.f3890c.f3939a);
            } else {
                this.f3889b.mo5192b(this.f3890c.f3941c);
            }
            if (this.f3890c.f3942d) {
                this.f3889b.mo5190a("intermediate-response");
            } else {
                this.f3889b.mo5193b("done");
            }
            Runnable runnable = this.f3891d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
