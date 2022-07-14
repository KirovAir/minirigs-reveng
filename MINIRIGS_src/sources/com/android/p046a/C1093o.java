package com.android.p046a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.a.o */
public class C1093o {

    /* renamed from: a */
    private final AtomicInteger f3929a;

    /* renamed from: b */
    private final Set<C1089n<?>> f3930b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C1089n<?>> f3931c;

    /* renamed from: d */
    private final PriorityBlockingQueue<C1089n<?>> f3932d;

    /* renamed from: e */
    private final C1072b f3933e;

    /* renamed from: f */
    private final C1083h f3934f;

    /* renamed from: g */
    private final C1098q f3935g;

    /* renamed from: h */
    private final C1084i[] f3936h;

    /* renamed from: i */
    private C1074c f3937i;

    /* renamed from: j */
    private final List<C1094a> f3938j;

    /* renamed from: com.android.a.o$a */
    public interface C1094a<T> {
        /* renamed from: a */
        void mo5222a(C1089n<T> nVar);
    }

    public C1093o(C1072b bVar, C1083h hVar, int i, C1098q qVar) {
        this.f3929a = new AtomicInteger();
        this.f3930b = new HashSet();
        this.f3931c = new PriorityBlockingQueue<>();
        this.f3932d = new PriorityBlockingQueue<>();
        this.f3938j = new ArrayList();
        this.f3933e = bVar;
        this.f3934f = hVar;
        this.f3936h = new C1084i[i];
        this.f3935g = qVar;
    }

    public C1093o(C1072b bVar, C1083h hVar, int i) {
        this(bVar, hVar, i, new C1079f(new Handler(Looper.getMainLooper())));
    }

    public C1093o(C1072b bVar, C1083h hVar) {
        this(bVar, hVar, 4);
    }

    /* renamed from: a */
    public void mo5218a() {
        mo5219b();
        this.f3937i = new C1074c(this.f3931c, this.f3932d, this.f3933e, this.f3935g);
        this.f3937i.start();
        for (int i = 0; i < this.f3936h.length; i++) {
            C1084i iVar = new C1084i(this.f3932d, this.f3934f, this.f3933e, this.f3935g);
            this.f3936h[i] = iVar;
            iVar.start();
        }
    }

    /* renamed from: b */
    public void mo5219b() {
        C1074c cVar = this.f3937i;
        if (cVar != null) {
            cVar.mo5159a();
        }
        for (C1084i iVar : this.f3936h) {
            if (iVar != null) {
                iVar.mo5178a();
            }
        }
    }

    /* renamed from: c */
    public int mo5221c() {
        return this.f3929a.incrementAndGet();
    }

    /* renamed from: a */
    public <T> C1089n<T> mo5217a(C1089n<T> nVar) {
        nVar.mo5184a(this);
        synchronized (this.f3930b) {
            this.f3930b.add(nVar);
        }
        nVar.mo5182a(mo5221c());
        nVar.mo5190a("add-to-queue");
        if (!nVar.mo5208q()) {
            this.f3932d.add(nVar);
            return nVar;
        }
        this.f3931c.add(nVar);
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void mo5220b(C1089n<T> nVar) {
        synchronized (this.f3930b) {
            this.f3930b.remove(nVar);
        }
        synchronized (this.f3938j) {
            for (C1094a a : this.f3938j) {
                a.mo5222a(nVar);
            }
        }
    }
}
