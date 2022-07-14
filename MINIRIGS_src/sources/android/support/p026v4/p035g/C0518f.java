package android.support.p026v4.p035g;

/* renamed from: android.support.v4.g.f */
public class C0518f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1709a = new Object();

    /* renamed from: b */
    private boolean f1710b;

    /* renamed from: c */
    private long[] f1711c;

    /* renamed from: d */
    private Object[] f1712d;

    /* renamed from: e */
    private int f1713e;

    public C0518f() {
        this(10);
    }

    public C0518f(int i) {
        this.f1710b = false;
        if (i == 0) {
            this.f1711c = C0515c.f1705b;
            this.f1712d = C0515c.f1706c;
        } else {
            int b = C0515c.m2261b(i);
            this.f1711c = new long[b];
            this.f1712d = new Object[b];
        }
        this.f1713e = 0;
    }

    /* renamed from: a */
    public C0518f<E> clone() {
        try {
            C0518f<E> fVar = (C0518f) super.clone();
            fVar.f1711c = (long[]) this.f1711c.clone();
            fVar.f1712d = (Object[]) this.f1712d.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public E mo2004a(long j) {
        return mo2005a(j, (Object) null);
    }

    /* renamed from: a */
    public E mo2005a(long j, E e) {
        int a = C0515c.m2259a(this.f1711c, this.f1713e, j);
        if (a >= 0) {
            E[] eArr = this.f1712d;
            if (eArr[a] != f1709a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f1712d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2009b(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f1711c
            int r1 = r2.f1713e
            int r3 = android.support.p026v4.p035g.C0515c.m2259a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f1712d
            r0 = r4[r3]
            java.lang.Object r1 = f1709a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f1710b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p035g.C0518f.mo2009b(long):void");
    }

    /* renamed from: a */
    public void mo2006a(int i) {
        Object[] objArr = this.f1712d;
        Object obj = objArr[i];
        Object obj2 = f1709a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f1710b = true;
        }
    }

    /* renamed from: d */
    private void m2265d() {
        int i = this.f1713e;
        long[] jArr = this.f1711c;
        Object[] objArr = this.f1712d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1709a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1710b = false;
        this.f1713e = i2;
    }

    /* renamed from: b */
    public void mo2010b(long j, E e) {
        int a = C0515c.m2259a(this.f1711c, this.f1713e, j);
        if (a >= 0) {
            this.f1712d[a] = e;
            return;
        }
        int i = ~a;
        if (i < this.f1713e) {
            Object[] objArr = this.f1712d;
            if (objArr[i] == f1709a) {
                this.f1711c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1710b && this.f1713e >= this.f1711c.length) {
            m2265d();
            i = ~C0515c.m2259a(this.f1711c, this.f1713e, j);
        }
        int i2 = this.f1713e;
        if (i2 >= this.f1711c.length) {
            int b = C0515c.m2261b(i2 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.f1711c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1712d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1711c = jArr;
            this.f1712d = objArr2;
        }
        int i3 = this.f1713e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f1711c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f1712d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f1713e - i);
        }
        this.f1711c[i] = j;
        this.f1712d[i] = e;
        this.f1713e++;
    }

    /* renamed from: b */
    public int mo2007b() {
        if (this.f1710b) {
            m2265d();
        }
        return this.f1713e;
    }

    /* renamed from: b */
    public long mo2008b(int i) {
        if (this.f1710b) {
            m2265d();
        }
        return this.f1711c[i];
    }

    /* renamed from: c */
    public E mo2012c(int i) {
        if (this.f1710b) {
            m2265d();
        }
        return this.f1712d[i];
    }

    /* renamed from: c */
    public int mo2011c(long j) {
        if (this.f1710b) {
            m2265d();
        }
        return C0515c.m2259a(this.f1711c, this.f1713e, j);
    }

    /* renamed from: c */
    public void mo2013c() {
        int i = this.f1713e;
        Object[] objArr = this.f1712d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1713e = 0;
        this.f1710b = false;
    }

    /* renamed from: c */
    public void mo2014c(long j, E e) {
        int i = this.f1713e;
        if (i == 0 || j > this.f1711c[i - 1]) {
            if (this.f1710b && this.f1713e >= this.f1711c.length) {
                m2265d();
            }
            int i2 = this.f1713e;
            if (i2 >= this.f1711c.length) {
                int b = C0515c.m2261b(i2 + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.f1711c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1712d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1711c = jArr;
                this.f1712d = objArr;
            }
            this.f1711c[i2] = j;
            this.f1712d[i2] = e;
            this.f1713e = i2 + 1;
            return;
        }
        mo2010b(j, e);
    }

    public String toString() {
        if (mo2007b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1713e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1713e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2008b(i));
            sb.append('=');
            Object c = mo2012c(i);
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
