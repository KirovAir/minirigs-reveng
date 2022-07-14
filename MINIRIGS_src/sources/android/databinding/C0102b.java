package android.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: android.databinding.b */
public class C0102b<C, T, A> implements Cloneable {

    /* renamed from: a */
    private List<C> f230a;

    /* renamed from: b */
    private long f231b;

    /* renamed from: c */
    private long[] f232c;

    /* renamed from: d */
    private int f233d;

    /* renamed from: e */
    private final C0103a<C, T, A> f234e;

    /* renamed from: android.databinding.b$a */
    public static abstract class C0103a<C, T, A> {
        /* renamed from: a */
        public abstract void mo228a(C c, T t, int i, A a);
    }

    /* renamed from: a */
    public synchronized void mo233a(T t, int i, A a) {
        this.f233d++;
        m332c(t, i, a);
        this.f233d--;
        if (this.f233d == 0) {
            if (this.f232c != null) {
                for (int length = this.f232c.length - 1; length >= 0; length--) {
                    long j = this.f232c[length];
                    if (j != 0) {
                        m327a((length + 1) * 64, j);
                        this.f232c[length] = 0;
                    }
                }
            }
            if (this.f231b != 0) {
                m327a(0, this.f231b);
                this.f231b = 0;
            }
        }
    }

    /* renamed from: b */
    private void m331b(T t, int i, A a) {
        m329a(t, i, a, 0, Math.min(64, this.f230a.size()), this.f231b);
    }

    /* renamed from: c */
    private void m332c(T t, int i, A a) {
        int size = this.f230a.size();
        long[] jArr = this.f232c;
        int length = jArr == null ? -1 : jArr.length - 1;
        m328a(t, i, a, length);
        m329a(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: a */
    private void m328a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m331b(t, i, a);
            return;
        }
        long j = this.f232c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f230a.size(), i3 + 64);
        m328a(t, i, a, i2 - 1);
        m329a(t, i, a, i3, min, j);
    }

    /* renamed from: a */
    private void m329a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f234e.mo228a(this.f230a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m330a(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f231b) != 0;
        }
        long[] jArr = this.f232c;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i2]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m327a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f230a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: a */
    public synchronized C0102b<C, T, A> clone() {
        C0102b<C, T, A> bVar;
        CloneNotSupportedException e;
        try {
            bVar = (C0102b) super.clone();
            try {
                bVar.f231b = 0;
                bVar.f232c = null;
                bVar.f233d = 0;
                bVar.f230a = new ArrayList();
                int size = this.f230a.size();
                for (int i = 0; i < size; i++) {
                    if (!m330a(i)) {
                        bVar.f230a.add(this.f230a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return bVar;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            bVar = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return bVar;
        }
        return bVar;
    }
}
