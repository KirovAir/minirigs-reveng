package android.support.p026v4.p035g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.g.a */
public class C0511a<K, V> extends C0532l<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0520h<K, V> f1691a;

    public C0511a() {
    }

    public C0511a(int i) {
        super(i);
    }

    public C0511a(C0532l lVar) {
        super(lVar);
    }

    /* renamed from: b */
    private C0520h<K, V> m2228b() {
        if (this.f1691a == null) {
            this.f1691a = new C0520h<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1971a() {
                    return C0511a.this.f1746h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1973a(int i, int i2) {
                    return C0511a.this.f1745g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1972a(Object obj) {
                    return C0511a.this.mo2089a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1977b(Object obj) {
                    return C0511a.this.mo2094b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo1978b() {
                    return C0511a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1976a(K k, V v) {
                    C0511a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo1974a(int i, V v) {
                    return C0511a.this.mo2091a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1975a(int i) {
                    C0511a.this.mo2100d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1979c() {
                    C0511a.this.clear();
                }
            };
        }
        return this.f1691a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo2092a(this.f1746h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: a */
    public boolean mo1966a(Collection<?> collection) {
        return C0520h.m2288c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m2228b().mo2026d();
    }

    public Set<K> keySet() {
        return m2228b().mo2027e();
    }

    public Collection<V> values() {
        return m2228b().mo2028f();
    }
}
