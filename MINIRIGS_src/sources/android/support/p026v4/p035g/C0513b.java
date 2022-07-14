package android.support.p026v4.p035g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.g.b */
public final class C0513b<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f1693c = new int[0];

    /* renamed from: d */
    private static final Object[] f1694d = new Object[0];

    /* renamed from: e */
    private static Object[] f1695e;

    /* renamed from: f */
    private static int f1696f;

    /* renamed from: g */
    private static Object[] f1697g;

    /* renamed from: h */
    private static int f1698h;

    /* renamed from: a */
    Object[] f1699a;

    /* renamed from: b */
    int f1700b;

    /* renamed from: i */
    private int[] f1701i;

    /* renamed from: j */
    private C0520h<E, E> f1702j;

    /* renamed from: a */
    private int m2240a(Object obj, int i) {
        int i2 = this.f1700b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0515c.m2258a(this.f1701i, i2, i);
        if (a < 0 || obj.equals(this.f1699a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1701i[i3] == i) {
            if (obj.equals(this.f1699a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1701i[i4] == i) {
            if (obj.equals(this.f1699a[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private int m2239a() {
        int i = this.f1700b;
        if (i == 0) {
            return -1;
        }
        int a = C0515c.m2258a(this.f1701i, i, 0);
        if (a < 0 || this.f1699a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1701i[i2] == 0) {
            if (this.f1699a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1701i[i3] == 0) {
            if (this.f1699a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: d */
    private void m2243d(int i) {
        if (i == 8) {
            synchronized (C0513b.class) {
                if (f1697g != null) {
                    Object[] objArr = f1697g;
                    this.f1699a = objArr;
                    f1697g = (Object[]) objArr[0];
                    this.f1701i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1698h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0513b.class) {
                if (f1695e != null) {
                    Object[] objArr2 = f1695e;
                    this.f1699a = objArr2;
                    f1695e = (Object[]) objArr2[0];
                    this.f1701i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1696f--;
                    return;
                }
            }
        }
        this.f1701i = new int[i];
        this.f1699a = new Object[i];
    }

    /* renamed from: a */
    private static void m2241a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0513b.class) {
                if (f1698h < 10) {
                    objArr[0] = f1697g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1697g = objArr;
                    f1698h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0513b.class) {
                if (f1696f < 10) {
                    objArr[0] = f1695e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1695e = objArr;
                    f1696f++;
                }
            }
        }
    }

    public C0513b() {
        this(0);
    }

    public C0513b(int i) {
        if (i == 0) {
            this.f1701i = f1693c;
            this.f1699a = f1694d;
        } else {
            m2243d(i);
        }
        this.f1700b = 0;
    }

    public void clear() {
        int i = this.f1700b;
        if (i != 0) {
            m2241a(this.f1701i, this.f1699a, i);
            this.f1701i = f1693c;
            this.f1699a = f1694d;
            this.f1700b = 0;
        }
    }

    /* renamed from: a */
    public void mo1981a(int i) {
        int[] iArr = this.f1701i;
        if (iArr.length < i) {
            Object[] objArr = this.f1699a;
            m2243d(i);
            int i2 = this.f1700b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1701i, 0, i2);
                System.arraycopy(objArr, 0, this.f1699a, 0, this.f1700b);
            }
            m2241a(iArr, objArr, this.f1700b);
        }
    }

    public boolean contains(Object obj) {
        return mo1980a(obj) >= 0;
    }

    /* renamed from: a */
    public int mo1980a(Object obj) {
        return obj == null ? m2239a() : m2240a(obj, obj.hashCode());
    }

    /* renamed from: b */
    public E mo1984b(int i) {
        return this.f1699a[i];
    }

    public boolean isEmpty() {
        return this.f1700b <= 0;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m2239a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m2240a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f1700b;
        if (i4 >= this.f1701i.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f1701i;
            Object[] objArr = this.f1699a;
            m2243d(i5);
            int[] iArr2 = this.f1701i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1699a, 0, objArr.length);
            }
            m2241a(iArr, objArr, this.f1700b);
        }
        int i6 = this.f1700b;
        if (i3 < i6) {
            int[] iArr3 = this.f1701i;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1699a;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1700b - i3);
        }
        this.f1701i[i3] = i;
        this.f1699a[i3] = e;
        this.f1700b++;
        return true;
    }

    public boolean remove(Object obj) {
        int a = mo1980a(obj);
        if (a < 0) {
            return false;
        }
        mo1985c(a);
        return true;
    }

    /* renamed from: c */
    public E mo1985c(int i) {
        E[] eArr = this.f1699a;
        E e = eArr[i];
        int i2 = this.f1700b;
        if (i2 <= 1) {
            m2241a(this.f1701i, eArr, i2);
            this.f1701i = f1693c;
            this.f1699a = f1694d;
            this.f1700b = 0;
        } else {
            int[] iArr = this.f1701i;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f1700b--;
                int i4 = this.f1700b;
                if (i < i4) {
                    int[] iArr2 = this.f1701i;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f1699a;
                    System.arraycopy(objArr, i5, objArr, i, this.f1700b - i);
                }
                this.f1699a[this.f1700b] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f1701i;
                Object[] objArr2 = this.f1699a;
                m2243d(i3);
                this.f1700b--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f1701i, 0, i);
                    System.arraycopy(objArr2, 0, this.f1699a, 0, i);
                }
                int i6 = this.f1700b;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f1701i, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f1699a, i, this.f1700b - i);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f1700b;
    }

    public Object[] toArray() {
        int i = this.f1700b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1699a, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1700b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1700b);
        }
        System.arraycopy(this.f1699a, 0, tArr, 0, this.f1700b);
        int length = tArr.length;
        int i = this.f1700b;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f1700b) {
            try {
                if (!set.contains(mo1984b(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException unused) {
                return false;
            } catch (ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f1701i;
        int i = this.f1700b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1700b * 14);
        sb.append('{');
        for (int i = 0; i < this.f1700b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1984b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private C0520h<E, E> m2242b() {
        if (this.f1702j == null) {
            this.f1702j = new C0520h<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1971a() {
                    return C0513b.this.f1700b;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1973a(int i, int i2) {
                    return C0513b.this.f1699a[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1972a(Object obj) {
                    return C0513b.this.mo1980a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1977b(Object obj) {
                    return C0513b.this.mo1980a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<E, E> mo1978b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1976a(E e, E e2) {
                    C0513b.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo1974a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1975a(int i) {
                    C0513b.this.mo1985c(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1979c() {
                    C0513b.this.clear();
                }
            };
        }
        return this.f1702j;
    }

    public Iterator<E> iterator() {
        return m2242b().mo2027e().iterator();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1981a(this.f1700b + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1700b - 1; i >= 0; i--) {
            if (!collection.contains(this.f1699a[i])) {
                mo1985c(i);
                z = true;
            }
        }
        return z;
    }
}
