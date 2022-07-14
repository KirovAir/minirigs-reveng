package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0065d;
import android.content.Context;
import android.os.Bundle;
import android.support.p026v4.app.C0425f;
import android.support.p026v4.app.C0432g;
import android.support.p026v4.app.C0439k;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.e */
class C0068e {

    /* renamed from: a */
    private static AtomicBoolean f174a = new AtomicBoolean(false);

    /* renamed from: a */
    static void m239a(Context context) {
        if (!f174a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0070b());
        }
    }

    /* renamed from: android.arch.lifecycle.e$b */
    static class C0070b extends C0063b {

        /* renamed from: a */
        private final C0071c f175a = new C0071c();

        C0070b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C0432g) {
                ((C0432g) activity).mo1651f().mo1718a(this.f175a, true);
            }
            C0087p.m298a(activity);
        }

        public void onActivityStopped(Activity activity) {
            if (activity instanceof C0432g) {
                C0068e.m245b((C0432g) activity, C0065d.C0067b.CREATED);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof C0432g) {
                C0068e.m245b((C0432g) activity, C0065d.C0067b.CREATED);
            }
        }
    }

    /* renamed from: android.arch.lifecycle.e$a */
    public static class C0069a extends C0425f {
        /* renamed from: a */
        public void mo184a() {
            super.mo184a();
            mo185a(C0065d.C0066a.ON_PAUSE);
        }

        /* renamed from: b */
        public void mo186b() {
            super.mo186b();
            mo185a(C0065d.C0066a.ON_STOP);
        }

        /* renamed from: c */
        public void mo187c() {
            super.mo187c();
            mo185a(C0065d.C0066a.ON_DESTROY);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo185a(C0065d.C0066a aVar) {
            C0068e.m244b(mo1622o(), aVar);
        }
    }

    /* renamed from: a */
    private static void m242a(C0439k kVar, C0065d.C0067b bVar) {
        List<C0425f> c = kVar.mo1721c();
        if (c != null) {
            for (C0425f next : c) {
                if (next != null) {
                    m243a((Object) next, bVar);
                    if (next.mo1626p()) {
                        m242a(next.mo1619m(), bVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m243a(Object obj, C0065d.C0067b bVar) {
        if (obj instanceof C0077i) {
            ((C0077i) obj).mo195a().mo193a(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m245b(C0432g gVar, C0065d.C0067b bVar) {
        m243a((Object) gVar, bVar);
        m242a(gVar.mo1651f(), bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m244b(C0425f fVar, C0065d.C0066a aVar) {
        if (fVar instanceof C0077i) {
            ((C0077i) fVar).mo195a().mo192a(aVar);
        }
    }

    /* renamed from: android.arch.lifecycle.e$c */
    static class C0071c extends C0439k.C0440a {
        C0071c() {
        }

        /* renamed from: a */
        public void mo189a(C0439k kVar, C0425f fVar, Bundle bundle) {
            C0068e.m244b(fVar, C0065d.C0066a.ON_CREATE);
            if ((fVar instanceof C0077i) && fVar.mo1619m().mo1716a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fVar.mo1619m().mo1717a().mo1509a(new C0069a(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo1518b();
            }
        }

        /* renamed from: a */
        public void mo188a(C0439k kVar, C0425f fVar) {
            C0068e.m244b(fVar, C0065d.C0066a.ON_START);
        }

        /* renamed from: b */
        public void mo190b(C0439k kVar, C0425f fVar) {
            C0068e.m244b(fVar, C0065d.C0066a.ON_RESUME);
        }
    }
}
