package android.support.p026v4.p035g;

/* renamed from: android.support.v4.g.j */
public final class C0527j {

    /* renamed from: android.support.v4.g.j$a */
    public interface C0528a<T> {
        /* renamed from: a */
        T mo2086a();

        /* renamed from: a */
        boolean mo2087a(T t);
    }

    /* renamed from: android.support.v4.g.j$b */
    public static class C0529b<T> implements C0528a<T> {

        /* renamed from: a */
        private final Object[] f1737a;

        /* renamed from: b */
        private int f1738b;

        public C0529b(int i) {
            if (i > 0) {
                this.f1737a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo2086a() {
            int i = this.f1738b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f1737a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f1738b = i - 1;
            return t;
        }

        /* renamed from: a */
        public boolean mo2087a(T t) {
            if (!m2309b(t)) {
                int i = this.f1738b;
                Object[] objArr = this.f1737a;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.f1738b = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        /* renamed from: b */
        private boolean m2309b(T t) {
            for (int i = 0; i < this.f1738b; i++) {
                if (this.f1737a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.g.j$c */
    public static class C0530c<T> extends C0529b<T> {

        /* renamed from: a */
        private final Object f1739a = new Object();

        public C0530c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo2086a() {
            T a;
            synchronized (this.f1739a) {
                a = super.mo2086a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo2087a(T t) {
            boolean a;
            synchronized (this.f1739a) {
                a = super.mo2087a(t);
            }
            return a;
        }
    }
}
