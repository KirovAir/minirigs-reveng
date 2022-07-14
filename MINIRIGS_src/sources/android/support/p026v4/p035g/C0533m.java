package android.support.p026v4.p035g;

/* renamed from: android.support.v4.g.m */
public class C0533m<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1747a = new Object();

    /* renamed from: b */
    private boolean f1748b;

    /* renamed from: c */
    private int[] f1749c;

    /* renamed from: d */
    private Object[] f1750d;

    /* renamed from: e */
    private int f1751e;

    public C0533m() {
        this(10);
    }

    public C0533m(int i) {
        this.f1748b = false;
        if (i == 0) {
            this.f1749c = C0515c.f1704a;
            this.f1750d = C0515c.f1706c;
        } else {
            int a = C0515c.m2257a(i);
            this.f1749c = new int[a];
            this.f1750d = new Object[a];
        }
        this.f1751e = 0;
    }

    /* renamed from: a */
    public C0533m<E> clone() {
        try {
            C0533m<E> mVar = (C0533m) super.clone();
            mVar.f1749c = (int[]) this.f1749c.clone();
            mVar.f1750d = (Object[]) this.f1750d.clone();
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public E mo2110a(int i) {
        return mo2111a(i, (Object) null);
    }

    /* renamed from: a */
    public E mo2111a(int i, E e) {
        int a = C0515c.m2258a(this.f1749c, this.f1751e, i);
        if (a >= 0) {
            E[] eArr = this.f1750d;
            if (eArr[a] != f1747a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f1750d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2113b(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f1749c
            int r1 = r3.f1751e
            int r4 = android.support.p026v4.p035g.C0515c.m2258a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f1750d
            r1 = r0[r4]
            java.lang.Object r2 = f1747a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f1748b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p035g.C0533m.mo2113b(int):void");
    }

    /* renamed from: c */
    public void mo2116c(int i) {
        mo2113b(i);
    }

    /* renamed from: d */
    private void m2330d() {
        int i = this.f1751e;
        int[] iArr = this.f1749c;
        Object[] objArr = this.f1750d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1747a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1748b = false;
        this.f1751e = i2;
    }

    /* renamed from: b */
    public void mo2114b(int i, E e) {
        int a = C0515c.m2258a(this.f1749c, this.f1751e, i);
        if (a >= 0) {
            this.f1750d[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 < this.f1751e) {
            Object[] objArr = this.f1750d;
            if (objArr[i2] == f1747a) {
                this.f1749c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f1748b && this.f1751e >= this.f1749c.length) {
            m2330d();
            i2 = ~C0515c.m2258a(this.f1749c, this.f1751e, i);
        }
        int i3 = this.f1751e;
        if (i3 >= this.f1749c.length) {
            int a2 = C0515c.m2257a(i3 + 1);
            int[] iArr = new int[a2];
            Object[] objArr2 = new Object[a2];
            int[] iArr2 = this.f1749c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1750d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1749c = iArr;
            this.f1750d = objArr2;
        }
        int i4 = this.f1751e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f1749c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f1750d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1751e - i2);
        }
        this.f1749c[i2] = i;
        this.f1750d[i2] = e;
        this.f1751e++;
    }

    /* renamed from: b */
    public int mo2112b() {
        if (this.f1748b) {
            m2330d();
        }
        return this.f1751e;
    }

    /* renamed from: d */
    public int mo2119d(int i) {
        if (this.f1748b) {
            m2330d();
        }
        return this.f1749c[i];
    }

    /* renamed from: e */
    public E mo2120e(int i) {
        if (this.f1748b) {
            m2330d();
        }
        return this.f1750d[i];
    }

    /* renamed from: c */
    public void mo2115c() {
        int i = this.f1751e;
        Object[] objArr = this.f1750d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1751e = 0;
        this.f1748b = false;
    }

    /* renamed from: c */
    public void mo2117c(int i, E e) {
        int i2 = this.f1751e;
        if (i2 == 0 || i > this.f1749c[i2 - 1]) {
            if (this.f1748b && this.f1751e >= this.f1749c.length) {
                m2330d();
            }
            int i3 = this.f1751e;
            if (i3 >= this.f1749c.length) {
                int a = C0515c.m2257a(i3 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.f1749c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1750d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1749c = iArr;
                this.f1750d = objArr;
            }
            this.f1749c[i3] = i;
            this.f1750d[i3] = e;
            this.f1751e = i3 + 1;
            return;
        }
        mo2114b(i, e);
    }

    public String toString() {
        if (mo2112b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1751e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1751e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2119d(i));
            sb.append('=');
            Object e = mo2120e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
