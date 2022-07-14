package com.android.p046a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.a.i */
public class C1084i extends Thread {

    /* renamed from: a */
    private final BlockingQueue<C1089n<?>> f3894a;

    /* renamed from: b */
    private final C1083h f3895b;

    /* renamed from: c */
    private final C1072b f3896c;

    /* renamed from: d */
    private final C1098q f3897d;

    /* renamed from: e */
    private volatile boolean f3898e = false;

    public C1084i(BlockingQueue<C1089n<?>> blockingQueue, C1083h hVar, C1072b bVar, C1098q qVar) {
        this.f3894a = blockingQueue;
        this.f3895b = hVar;
        this.f3896c = bVar;
        this.f3897d = qVar;
    }

    /* renamed from: a */
    public void mo5178a() {
        this.f3898e = true;
        interrupt();
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m5609a(C1089n<?> nVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(nVar.mo5191b());
        }
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m5611b();
            } catch (InterruptedException unused) {
                if (this.f3898e) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m5611b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1089n take = this.f3894a.take();
        try {
            take.mo5190a("network-queue-take");
            if (take.mo5198g()) {
                take.mo5193b("network-discard-cancelled");
                take.mo5215x();
                return;
            }
            m5609a(take);
            C1086k a = this.f3895b.mo5094a(take);
            take.mo5190a("network-http-complete");
            if (!a.f3903e || !take.mo5214w()) {
                C1095p a2 = take.mo5139a(a);
                take.mo5190a("network-parse-complete");
                if (take.mo5208q() && a2.f3940b != null) {
                    this.f3896c.mo5102a(take.mo5196d(), a2.f3940b);
                    take.mo5190a("network-cache-written");
                }
                take.mo5213v();
                this.f3897d.mo5168a((C1089n<?>) take, (C1095p<?>) a2);
                take.mo5189a((C1095p<?>) a2);
                return;
            }
            take.mo5193b("not-modified");
            take.mo5215x();
        } catch (C1102u e) {
            e.mo5224a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m5610a(take, e);
            take.mo5215x();
        } catch (Exception e2) {
            C1103v.m5677a(e2, "Unhandled exception %s", e2.toString());
            C1102u uVar = new C1102u((Throwable) e2);
            uVar.mo5224a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f3897d.mo5170a((C1089n<?>) take, uVar);
            take.mo5215x();
        }
    }

    /* renamed from: a */
    private void m5610a(C1089n<?> nVar, C1102u uVar) {
        this.f3897d.mo5170a(nVar, nVar.mo5187a(uVar));
    }
}
