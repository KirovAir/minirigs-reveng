package android.support.p015d;

import android.support.p015d.C0216m;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p036h.C0594r;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.d.o */
public class C0224o {

    /* renamed from: a */
    static ArrayList<ViewGroup> f727a = new ArrayList<>();

    /* renamed from: b */
    private static C0216m f728b = new C0187b();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<C0511a<ViewGroup, ArrayList<C0216m>>>> f729c = new ThreadLocal<>();

    /* renamed from: a */
    static C0511a<ViewGroup, ArrayList<C0216m>> m819a() {
        C0511a<ViewGroup, ArrayList<C0216m>> aVar;
        WeakReference weakReference = f729c.get();
        if (weakReference != null && (aVar = (C0511a) weakReference.get()) != null) {
            return aVar;
        }
        C0511a<ViewGroup, ArrayList<C0216m>> aVar2 = new C0511a<>();
        f729c.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: b */
    private static void m821b(ViewGroup viewGroup, C0216m mVar) {
        if (mVar != null && viewGroup != null) {
            C0225a aVar = new C0225a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: android.support.d.o$a */
    private static class C0225a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        C0216m f730a;

        /* renamed from: b */
        ViewGroup f731b;

        public void onViewAttachedToWindow(View view) {
        }

        C0225a(C0216m mVar, ViewGroup viewGroup) {
            this.f730a = mVar;
            this.f731b = viewGroup;
        }

        /* renamed from: a */
        private void m823a() {
            this.f731b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f731b.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            m823a();
            C0224o.f727a.remove(this.f731b);
            ArrayList arrayList = C0224o.m819a().get(this.f731b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0216m) it.next()).mo702e(this.f731b);
                }
            }
            this.f730a.mo688a(true);
        }

        public boolean onPreDraw() {
            m823a();
            if (!C0224o.f727a.remove(this.f731b)) {
                return true;
            }
            final C0511a<ViewGroup, ArrayList<C0216m>> a = C0224o.m819a();
            ArrayList arrayList = a.get(this.f731b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f731b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f730a);
            this.f730a.mo678a((C0216m.C0222c) new C0223n() {
                /* renamed from: a */
                public void mo609a(C0216m mVar) {
                    ((ArrayList) a.get(C0225a.this.f731b)).remove(mVar);
                }
            });
            this.f730a.mo687a(this.f731b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0216m) it.next()).mo702e(this.f731b);
                }
            }
            this.f730a.mo685a(this.f731b);
            return true;
        }
    }

    /* renamed from: c */
    private static void m822c(ViewGroup viewGroup, C0216m mVar) {
        ArrayList arrayList = m819a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0216m) it.next()).mo700d(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo687a(viewGroup, true);
        }
        C0215l a = C0215l.m754a(viewGroup);
        if (a != null) {
            a.mo675a();
        }
    }

    /* renamed from: a */
    public static void m820a(ViewGroup viewGroup, C0216m mVar) {
        if (!f727a.contains(viewGroup) && C0594r.m2622w(viewGroup)) {
            f727a.add(viewGroup);
            if (mVar == null) {
                mVar = f728b;
            }
            C0216m o = mVar.clone();
            m822c(viewGroup, o);
            C0215l.m755a(viewGroup, (C0215l) null);
            m821b(viewGroup, o);
        }
    }
}
