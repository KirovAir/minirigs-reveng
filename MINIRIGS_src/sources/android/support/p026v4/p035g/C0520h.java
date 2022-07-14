package android.support.p026v4.p035g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.g.h */
abstract class C0520h<K, V> {

    /* renamed from: b */
    C0520h<K, V>.b f1722b;

    /* renamed from: c */
    C0520h<K, V>.c f1723c;

    /* renamed from: d */
    C0520h<K, V>.e f1724d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1971a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1972a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1973a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1974a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1975a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1976a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1977b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1978b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1979c();

    C0520h() {
    }

    /* renamed from: android.support.v4.g.h$a */
    final class C0521a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1725a;

        /* renamed from: b */
        int f1726b;

        /* renamed from: c */
        int f1727c;

        /* renamed from: d */
        boolean f1728d = false;

        C0521a(int i) {
            this.f1725a = i;
            this.f1726b = C0520h.this.mo1971a();
        }

        public boolean hasNext() {
            return this.f1727c < this.f1726b;
        }

        public T next() {
            if (hasNext()) {
                T a = C0520h.this.mo1973a(this.f1727c, this.f1725a);
                this.f1727c++;
                this.f1728d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1728d) {
                this.f1727c--;
                this.f1726b--;
                this.f1728d = false;
                C0520h.this.mo1975a(this.f1727c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.g.h$d */
    final class C0524d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f1732a;

        /* renamed from: b */
        int f1733b;

        /* renamed from: c */
        boolean f1734c = false;

        C0524d() {
            this.f1732a = C0520h.this.mo1971a() - 1;
            this.f1733b = -1;
        }

        public boolean hasNext() {
            return this.f1733b < this.f1732a;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1733b++;
                this.f1734c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1734c) {
                C0520h.this.mo1975a(this.f1733b);
                this.f1733b--;
                this.f1732a--;
                this.f1734c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.f1734c) {
                return C0520h.this.mo1973a(this.f1733b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1734c) {
                return C0520h.this.mo1973a(this.f1733b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f1734c) {
                return C0520h.this.mo1974a(this.f1733b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (!this.f1734c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0515c.m2260a(entry.getKey(), C0520h.this.mo1973a(this.f1733b, 0)) || !C0515c.m2260a(entry.getValue(), C0520h.this.mo1973a(this.f1733b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            int i;
            if (this.f1734c) {
                int i2 = 0;
                Object a = C0520h.this.mo1973a(this.f1733b, 0);
                Object a2 = C0520h.this.mo1973a(this.f1733b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.g.h$b */
    final class C0522b implements Set<Map.Entry<K, V>> {
        C0522b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = C0520h.this.mo1971a();
            for (Map.Entry entry : collection) {
                C0520h.this.mo1976a(entry.getKey(), entry.getValue());
            }
            return a != C0520h.this.mo1971a();
        }

        public void clear() {
            C0520h.this.mo1979c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0520h.this.mo1972a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0515c.m2260a(C0520h.this.mo1973a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0520h.this.mo1971a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0524d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0520h.this.mo1971a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C0520h.m2286a(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a = C0520h.this.mo1971a() - 1; a >= 0; a--) {
                Object a2 = C0520h.this.mo1973a(a, 0);
                Object a3 = C0520h.this.mo1973a(a, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }
    }

    /* renamed from: android.support.v4.g.h$c */
    final class C0523c implements Set<K> {
        C0523c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0520h.this.mo1979c();
        }

        public boolean contains(Object obj) {
            return C0520h.this.mo1972a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0520h.m2285a(C0520h.this.mo1978b(), collection);
        }

        public boolean isEmpty() {
            return C0520h.this.mo1971a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0521a(0);
        }

        public boolean remove(Object obj) {
            int a = C0520h.this.mo1972a(obj);
            if (a < 0) {
                return false;
            }
            C0520h.this.mo1975a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0520h.m2287b(C0520h.this.mo1978b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0520h.m2288c(C0520h.this.mo1978b(), collection);
        }

        public int size() {
            return C0520h.this.mo1971a();
        }

        public Object[] toArray() {
            return C0520h.this.mo2025b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0520h.this.mo2024a(tArr, 0);
        }

        public boolean equals(Object obj) {
            return C0520h.m2286a(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int a = C0520h.this.mo1971a() - 1; a >= 0; a--) {
                Object a2 = C0520h.this.mo1973a(a, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }
    }

    /* renamed from: android.support.v4.g.h$e */
    final class C0525e implements Collection<V> {
        C0525e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0520h.this.mo1979c();
        }

        public boolean contains(Object obj) {
            return C0520h.this.mo1977b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0520h.this.mo1971a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0521a(1);
        }

        public boolean remove(Object obj) {
            int b = C0520h.this.mo1977b(obj);
            if (b < 0) {
                return false;
            }
            C0520h.this.mo1975a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = C0520h.this.mo1971a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0520h.this.mo1973a(i, 1))) {
                    C0520h.this.mo1975a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = C0520h.this.mo1971a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0520h.this.mo1973a(i, 1))) {
                    C0520h.this.mo1975a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0520h.this.mo1971a();
        }

        public Object[] toArray() {
            return C0520h.this.mo2025b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0520h.this.mo2024a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m2285a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m2287b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m2288c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public Object[] mo2025b(int i) {
        int a = mo1971a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo1973a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] mo2024a(T[] tArr, int i) {
        int a = mo1971a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo1973a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> boolean m2286a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (NullPointerException unused) {
            return false;
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo2026d() {
        if (this.f1722b == null) {
            this.f1722b = new C0522b();
        }
        return this.f1722b;
    }

    /* renamed from: e */
    public Set<K> mo2027e() {
        if (this.f1723c == null) {
            this.f1723c = new C0523c();
        }
        return this.f1723c;
    }

    /* renamed from: f */
    public Collection<V> mo2028f() {
        if (this.f1724d == null) {
            this.f1724d = new C0525e();
        }
        return this.f1724d;
    }
}
