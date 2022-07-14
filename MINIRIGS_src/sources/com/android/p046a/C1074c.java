package com.android.p046a;

import android.os.Process;
import com.android.p046a.C1072b;
import com.android.p046a.C1089n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.a.c */
public class C1074c extends Thread {

    /* renamed from: a */
    private static final boolean f3870a = C1103v.f3946b;

    /* renamed from: b */
    private final BlockingQueue<C1089n<?>> f3871b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C1089n<?>> f3872c;

    /* renamed from: d */
    private final C1072b f3873d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1098q f3874e;

    /* renamed from: f */
    private volatile boolean f3875f = false;

    /* renamed from: g */
    private final C1076a f3876g;

    public C1074c(BlockingQueue<C1089n<?>> blockingQueue, BlockingQueue<C1089n<?>> blockingQueue2, C1072b bVar, C1098q qVar) {
        this.f3871b = blockingQueue;
        this.f3872c = blockingQueue2;
        this.f3873d = bVar;
        this.f3874e = qVar;
        this.f3876g = new C1076a(this);
    }

    /* renamed from: a */
    public void mo5159a() {
        this.f3875f = true;
        interrupt();
    }

    public void run() {
        if (f3870a) {
            C1103v.m5676a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3873d.mo5101a();
        while (true) {
            try {
                m5593b();
            } catch (InterruptedException unused) {
                if (this.f3875f) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m5593b() {
        final C1089n take = this.f3871b.take();
        take.mo5190a("cache-queue-take");
        if (take.mo5198g()) {
            take.mo5193b("cache-discard-canceled");
            return;
        }
        C1072b.C1073a a = this.f3873d.mo5099a(take.mo5196d());
        if (a == null) {
            take.mo5190a("cache-miss");
            if (!this.f3876g.m5596b(take)) {
                this.f3872c.put(take);
            }
        } else if (a.mo5157a()) {
            take.mo5190a("cache-hit-expired");
            take.mo5183a(a);
            if (!this.f3876g.m5596b(take)) {
                this.f3872c.put(take);
            }
        } else {
            take.mo5190a("cache-hit");
            C1095p a2 = take.mo5139a(new C1086k(a.f3862a, a.f3868g));
            take.mo5190a("cache-hit-parsed");
            if (!a.mo5158b()) {
                this.f3874e.mo5168a((C1089n<?>) take, (C1095p<?>) a2);
                return;
            }
            take.mo5190a("cache-hit-refresh-needed");
            take.mo5183a(a);
            a2.f3942d = true;
            if (!this.f3876g.m5596b(take)) {
                this.f3874e.mo5169a(take, a2, new Runnable() {
                    public void run() {
                        try {
                            C1074c.this.f3872c.put(take);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
            } else {
                this.f3874e.mo5168a((C1089n<?>) take, (C1095p<?>) a2);
            }
        }
    }

    /* renamed from: com.android.a.c$a */
    private static class C1076a implements C1089n.C1091a {

        /* renamed from: a */
        private final Map<String, List<C1089n<?>>> f3879a = new HashMap();

        /* renamed from: b */
        private final C1074c f3880b;

        C1076a(C1074c cVar) {
            this.f3880b = cVar;
        }

        /* renamed from: a */
        public void mo5163a(C1089n<?> nVar, C1095p<?> pVar) {
            List<C1089n> remove;
            if (pVar.f3940b == null || pVar.f3940b.mo5157a()) {
                mo5162a(nVar);
                return;
            }
            String d = nVar.mo5196d();
            synchronized (this) {
                remove = this.f3879a.remove(d);
            }
            if (remove != null) {
                if (C1103v.f3946b) {
                    C1103v.m5676a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), d);
                }
                for (C1089n a : remove) {
                    this.f3880b.f3874e.mo5168a((C1089n<?>) a, pVar);
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo5162a(C1089n<?> nVar) {
            String d = nVar.mo5196d();
            List remove = this.f3879a.remove(d);
            if (remove != null && !remove.isEmpty()) {
                if (C1103v.f3946b) {
                    C1103v.m5676a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), d);
                }
                C1089n nVar2 = (C1089n) remove.remove(0);
                this.f3879a.put(d, remove);
                nVar2.mo5188a((C1089n.C1091a) this);
                try {
                    this.f3880b.f3872c.put(nVar2);
                } catch (InterruptedException e) {
                    C1103v.m5679c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f3880b.mo5159a();
                }
            }
            return;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean m5596b(com.android.p046a.C1089n<?> r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.String r0 = r6.mo5196d()     // Catch:{ all -> 0x0052 }
                java.util.Map<java.lang.String, java.util.List<com.android.a.n<?>>> r1 = r5.f3879a     // Catch:{ all -> 0x0052 }
                boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003a
                java.util.Map<java.lang.String, java.util.List<com.android.a.n<?>>> r1 = r5.f3879a     // Catch:{ all -> 0x0052 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
                if (r1 != 0) goto L_0x001e
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
                r1.<init>()     // Catch:{ all -> 0x0052 }
            L_0x001e:
                java.lang.String r4 = "waiting-for-response"
                r6.mo5190a((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
                r1.add(r6)     // Catch:{ all -> 0x0052 }
                java.util.Map<java.lang.String, java.util.List<com.android.a.n<?>>> r6 = r5.f3879a     // Catch:{ all -> 0x0052 }
                r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
                boolean r6 = com.android.p046a.C1103v.f3946b     // Catch:{ all -> 0x0052 }
                if (r6 == 0) goto L_0x0038
                java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
                r1[r3] = r0     // Catch:{ all -> 0x0052 }
                com.android.p046a.C1103v.m5678b(r6, r1)     // Catch:{ all -> 0x0052 }
            L_0x0038:
                monitor-exit(r5)
                return r2
            L_0x003a:
                java.util.Map<java.lang.String, java.util.List<com.android.a.n<?>>> r1 = r5.f3879a     // Catch:{ all -> 0x0052 }
                r4 = 0
                r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
                r6.mo5188a((com.android.p046a.C1089n.C1091a) r5)     // Catch:{ all -> 0x0052 }
                boolean r6 = com.android.p046a.C1103v.f3946b     // Catch:{ all -> 0x0052 }
                if (r6 == 0) goto L_0x0050
                java.lang.String r6 = "new request, sending to network %s"
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
                r1[r3] = r0     // Catch:{ all -> 0x0052 }
                com.android.p046a.C1103v.m5678b(r6, r1)     // Catch:{ all -> 0x0052 }
            L_0x0050:
                monitor-exit(r5)
                return r3
            L_0x0052:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p046a.C1074c.C1076a.m5596b(com.android.a.n):boolean");
        }
    }
}
