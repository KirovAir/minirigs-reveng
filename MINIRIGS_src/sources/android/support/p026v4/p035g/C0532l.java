package android.support.p026v4.p035g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.g.l */
public class C0532l<K, V> {

    /* renamed from: b */
    static Object[] f1740b;

    /* renamed from: c */
    static int f1741c;

    /* renamed from: d */
    static Object[] f1742d;

    /* renamed from: e */
    static int f1743e;

    /* renamed from: f */
    int[] f1744f;

    /* renamed from: g */
    Object[] f1745g;

    /* renamed from: h */
    int f1746h;

    /* renamed from: a */
    private static int m2317a(int[] iArr, int i, int i2) {
        try {
            return C0515c.m2258a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2090a(Object obj, int i) {
        int i2 = this.f1746h;
        if (i2 == 0) {
            return -1;
        }
        int a = m2317a(this.f1744f, i2, i);
        if (a < 0 || obj.equals(this.f1745g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1744f[i3] == i) {
            if (obj.equals(this.f1745g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1744f[i4] == i) {
            if (obj.equals(this.f1745g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2088a() {
        int i = this.f1746h;
        if (i == 0) {
            return -1;
        }
        int a = m2317a(this.f1744f, i, 0);
        if (a < 0 || this.f1745g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1744f[i2] == 0) {
            if (this.f1745g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1744f[i3] == 0) {
            if (this.f1745g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: e */
    private void m2319e(int i) {
        if (i == 8) {
            synchronized (C0511a.class) {
                if (f1742d != null) {
                    Object[] objArr = f1742d;
                    this.f1745g = objArr;
                    f1742d = (Object[]) objArr[0];
                    this.f1744f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1743e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0511a.class) {
                if (f1740b != null) {
                    Object[] objArr2 = f1740b;
                    this.f1745g = objArr2;
                    f1740b = (Object[]) objArr2[0];
                    this.f1744f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1741c--;
                    return;
                }
            }
        }
        this.f1744f = new int[i];
        this.f1745g = new Object[(i << 1)];
    }

    /* renamed from: a */
    private static void m2318a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0511a.class) {
                if (f1743e < 10) {
                    objArr[0] = f1742d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1742d = objArr;
                    f1743e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0511a.class) {
                if (f1741c < 10) {
                    objArr[0] = f1740b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1740b = objArr;
                    f1741c++;
                }
            }
        }
    }

    public C0532l() {
        this.f1744f = C0515c.f1704a;
        this.f1745g = C0515c.f1706c;
        this.f1746h = 0;
    }

    public C0532l(int i) {
        if (i == 0) {
            this.f1744f = C0515c.f1704a;
            this.f1745g = C0515c.f1706c;
        } else {
            m2319e(i);
        }
        this.f1746h = 0;
    }

    public C0532l(C0532l<K, V> lVar) {
        this();
        if (lVar != null) {
            mo2093a(lVar);
        }
    }

    public void clear() {
        int i = this.f1746h;
        if (i > 0) {
            int[] iArr = this.f1744f;
            Object[] objArr = this.f1745g;
            this.f1744f = C0515c.f1704a;
            this.f1745g = C0515c.f1706c;
            this.f1746h = 0;
            m2318a(iArr, objArr, i);
        }
        if (this.f1746h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo2092a(int i) {
        int i2 = this.f1746h;
        int[] iArr = this.f1744f;
        if (iArr.length < i) {
            Object[] objArr = this.f1745g;
            m2319e(i);
            if (this.f1746h > 0) {
                System.arraycopy(iArr, 0, this.f1744f, 0, i2);
                System.arraycopy(objArr, 0, this.f1745g, 0, i2 << 1);
            }
            m2318a(iArr, objArr, i2);
        }
        if (this.f1746h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo2089a(obj) >= 0;
    }

    /* renamed from: a */
    public int mo2089a(Object obj) {
        return obj == null ? mo2088a() : mo2090a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2094b(Object obj) {
        int i = this.f1746h * 2;
        Object[] objArr = this.f1745g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return mo2094b(obj) >= 0;
    }

    public V get(Object obj) {
        int a = mo2089a(obj);
        if (a >= 0) {
            return this.f1745g[(a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public K mo2095b(int i) {
        return this.f1745g[i << 1];
    }

    /* renamed from: c */
    public V mo2096c(int i) {
        return this.f1745g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V mo2091a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f1745g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f1746h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f1746h;
        if (k == null) {
            i2 = mo2088a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo2090a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f1745g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f1744f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1744f;
            Object[] objArr = this.f1745g;
            m2319e(i6);
            if (i3 == this.f1746h) {
                int[] iArr2 = this.f1744f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1745g, 0, objArr.length);
                }
                m2318a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1744f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f1745g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f1746h - i5) << 1);
        }
        int i8 = this.f1746h;
        if (i3 == i8) {
            int[] iArr4 = this.f1744f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f1745g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f1746h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public void mo2093a(C0532l<? extends K, ? extends V> lVar) {
        int i = lVar.f1746h;
        mo2092a(this.f1746h + i);
        if (this.f1746h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(lVar.mo2095b(i2), lVar.mo2096c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(lVar.f1744f, 0, this.f1744f, 0, i);
            System.arraycopy(lVar.f1745g, 0, this.f1745g, 0, i << 1);
            this.f1746h = i;
        }
    }

    public V remove(Object obj) {
        int a = mo2089a(obj);
        if (a >= 0) {
            return mo2100d(a);
        }
        return null;
    }

    /* renamed from: d */
    public V mo2100d(int i) {
        int i2;
        V[] vArr = this.f1745g;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f1746h;
        if (i4 <= 1) {
            m2318a(this.f1744f, (Object[]) vArr, i4);
            this.f1744f = C0515c.f1704a;
            this.f1745g = C0515c.f1706c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f1744f;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f1744f;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f1745g;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f1745g;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f1744f;
                Object[] objArr3 = this.f1745g;
                m2319e(i5);
                if (i4 == this.f1746h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f1744f, 0, i);
                        System.arraycopy(objArr3, 0, this.f1745g, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f1744f, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f1745g, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f1746h) {
            this.f1746h = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.f1746h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0532l) {
            C0532l lVar = (C0532l) obj;
            if (size() != lVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1746h) {
                try {
                    Object b = mo2095b(i);
                    Object c = mo2096c(i);
                    Object obj2 = lVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !lVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1746h) {
                try {
                    Object b2 = mo2095b(i2);
                    Object c2 = mo2096c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException unused3) {
                    return false;
                } catch (ClassCastException unused4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] iArr = this.f1744f;
        Object[] objArr = this.f1745g;
        int i = this.f1746h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1746h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1746h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo2095b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo2096c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
