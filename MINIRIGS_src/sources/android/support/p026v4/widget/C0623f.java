package android.support.p026v4.widget;

import android.support.p026v4.p035g.C0527j;
import android.support.p026v4.p035g.C0532l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.widget.f */
public final class C0623f<T> {

    /* renamed from: a */
    private final C0527j.C0528a<ArrayList<T>> f1935a = new C0527j.C0529b(10);

    /* renamed from: b */
    private final C0532l<T, ArrayList<T>> f1936b = new C0532l<>();

    /* renamed from: c */
    private final ArrayList<T> f1937c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1938d = new HashSet<>();

    /* renamed from: a */
    public void mo2442a(T t) {
        if (!this.f1936b.containsKey(t)) {
            this.f1936b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo2445b(T t) {
        return this.f1936b.containsKey(t);
    }

    /* renamed from: a */
    public void mo2443a(T t, T t2) {
        if (!this.f1936b.containsKey(t) || !this.f1936b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1936b.get(t);
        if (arrayList == null) {
            arrayList = m2774c();
            this.f1936b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: c */
    public List mo2446c(T t) {
        return this.f1936b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2447d(T t) {
        int size = this.f1936b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f1936b.mo2096c(i);
            if (c != null && c.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1936b.mo2095b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2448e(T t) {
        int size = this.f1936b.size();
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f1936b.mo2096c(i);
            if (c != null && c.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2441a() {
        int size = this.f1936b.size();
        for (int i = 0; i < size; i++) {
            ArrayList c = this.f1936b.mo2096c(i);
            if (c != null) {
                m2773a(c);
            }
        }
        this.f1936b.clear();
    }

    /* renamed from: b */
    public ArrayList<T> mo2444b() {
        this.f1937c.clear();
        this.f1938d.clear();
        int size = this.f1936b.size();
        for (int i = 0; i < size; i++) {
            m2772a(this.f1936b.mo2095b(i), this.f1937c, this.f1938d);
        }
        return this.f1937c;
    }

    /* renamed from: a */
    private void m2772a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f1936b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2772a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: c */
    private ArrayList<T> m2774c() {
        ArrayList<T> a = this.f1935a.mo2086a();
        return a == null ? new ArrayList<>() : a;
    }

    /* renamed from: a */
    private void m2773a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1935a.mo2087a(arrayList);
    }
}
