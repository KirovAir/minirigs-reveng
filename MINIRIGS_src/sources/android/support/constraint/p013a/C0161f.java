package android.support.constraint.p013a;

/* renamed from: android.support.constraint.a.f */
final class C0161f {

    /* renamed from: android.support.constraint.a.f$a */
    interface C0162a<T> {
        /* renamed from: a */
        T mo560a();

        /* renamed from: a */
        void mo561a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo562a(T t);
    }

    /* renamed from: android.support.constraint.a.f$b */
    static class C0163b<T> implements C0162a<T> {

        /* renamed from: a */
        private final Object[] f555a;

        /* renamed from: b */
        private int f556b;

        public C0163b(int i) {
            if (i > 0) {
                this.f555a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo560a() {
            int i = this.f556b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f555a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f556b = i - 1;
            return t;
        }

        /* renamed from: a */
        public boolean mo562a(T t) {
            int i = this.f556b;
            Object[] objArr = this.f555a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f556b = i + 1;
            return true;
        }

        /* renamed from: a */
        public void mo561a(T[] tArr, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f556b;
                Object[] objArr = this.f555a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f556b = i3 + 1;
                }
            }
        }
    }
}
