package android.support.p039v7.widget;

import android.support.p039v7.widget.C0904ay;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.ah */
class C0851ah {

    /* renamed from: a */
    final C0853b f3033a;

    /* renamed from: b */
    final C0852a f3034b = new C0852a();

    /* renamed from: c */
    final List<View> f3035c = new ArrayList();

    /* renamed from: android.support.v7.widget.ah$b */
    interface C0853b {
        /* renamed from: a */
        int mo3955a();

        /* renamed from: a */
        int mo3956a(View view);

        /* renamed from: a */
        void mo3957a(int i);

        /* renamed from: a */
        void mo3958a(View view, int i);

        /* renamed from: a */
        void mo3959a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        C0904ay.C0945x mo3960b(View view);

        /* renamed from: b */
        View mo3961b(int i);

        /* renamed from: b */
        void mo3962b();

        /* renamed from: c */
        void mo3963c(int i);

        /* renamed from: c */
        void mo3964c(View view);

        /* renamed from: d */
        void mo3965d(View view);
    }

    C0851ah(C0853b bVar) {
        this.f3033a = bVar;
    }

    /* renamed from: g */
    private void m4198g(View view) {
        this.f3035c.add(view);
        this.f3033a.mo3964c(view);
    }

    /* renamed from: h */
    private boolean m4199h(View view) {
        if (!this.f3035c.remove(view)) {
            return false;
        }
        this.f3033a.mo3965d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3934a(View view, boolean z) {
        mo3933a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3933a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3033a.mo3955a();
        } else {
            i2 = m4197f(i);
        }
        this.f3034b.mo3949a(i2, z);
        if (z) {
            m4198g(view);
        }
        this.f3033a.mo3958a(view, i2);
    }

    /* renamed from: f */
    private int m4197f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3033a.mo3955a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f3034b.mo3953e(i2));
            if (e == 0) {
                while (this.f3034b.mo3951c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3931a(View view) {
        int a = this.f3033a.mo3956a(view);
        if (a >= 0) {
            if (this.f3034b.mo3952d(a)) {
                m4199h(view);
            }
            this.f3033a.mo3957a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3930a(int i) {
        int f = m4197f(i);
        View b = this.f3033a.mo3961b(f);
        if (b != null) {
            if (this.f3034b.mo3952d(f)) {
                m4199h(b);
            }
            this.f3033a.mo3957a(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3937b(int i) {
        return this.f3033a.mo3961b(m4197f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3929a() {
        this.f3034b.mo3947a();
        for (int size = this.f3035c.size() - 1; size >= 0; size--) {
            this.f3033a.mo3965d(this.f3035c.get(size));
            this.f3035c.remove(size);
        }
        this.f3033a.mo3962b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3939c(int i) {
        int size = this.f3035c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3035c.get(i2);
            C0904ay.C0945x b = this.f3033a.mo3960b(view);
            if (b.mo4606d() == i && !b.mo4616n() && !b.mo4619q()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3932a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3033a.mo3955a();
        } else {
            i2 = m4197f(i);
        }
        this.f3034b.mo3949a(i2, z);
        if (z) {
            m4198g(view);
        }
        this.f3033a.mo3959a(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3935b() {
        return this.f3033a.mo3955a() - this.f3035c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3938c() {
        return this.f3033a.mo3955a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo3941d(int i) {
        return this.f3033a.mo3961b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3943e(int i) {
        int f = m4197f(i);
        this.f3034b.mo3952d(f);
        this.f3033a.mo3963c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3936b(View view) {
        int a = this.f3033a.mo3956a(view);
        if (a != -1 && !this.f3034b.mo3951c(a)) {
            return a - this.f3034b.mo3953e(a);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3940c(View view) {
        return this.f3035c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3942d(View view) {
        int a = this.f3033a.mo3956a(view);
        if (a >= 0) {
            this.f3034b.mo3948a(a);
            m4198g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3944e(View view) {
        int a = this.f3033a.mo3956a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3034b.mo3951c(a)) {
            this.f3034b.mo3950b(a);
            m4199h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3034b.toString() + ", hidden list:" + this.f3035c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo3945f(View view) {
        int a = this.f3033a.mo3956a(view);
        if (a == -1) {
            m4199h(view);
            return true;
        } else if (!this.f3034b.mo3951c(a)) {
            return false;
        } else {
            this.f3034b.mo3952d(a);
            m4199h(view);
            this.f3033a.mo3957a(a);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.ah$a */
    static class C0852a {

        /* renamed from: a */
        long f3036a = 0;

        /* renamed from: b */
        C0852a f3037b;

        C0852a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3948a(int i) {
            if (i >= 64) {
                m4217b();
                this.f3037b.mo3948a(i - 64);
                return;
            }
            this.f3036a |= 1 << i;
        }

        /* renamed from: b */
        private void m4217b() {
            if (this.f3037b == null) {
                this.f3037b = new C0852a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3950b(int i) {
            if (i >= 64) {
                C0852a aVar = this.f3037b;
                if (aVar != null) {
                    aVar.mo3950b(i - 64);
                    return;
                }
                return;
            }
            this.f3036a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3951c(int i) {
            if (i < 64) {
                return (this.f3036a & (1 << i)) != 0;
            }
            m4217b();
            return this.f3037b.mo3951c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3947a() {
            this.f3036a = 0;
            C0852a aVar = this.f3037b;
            if (aVar != null) {
                aVar.mo3947a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3949a(int i, boolean z) {
            if (i >= 64) {
                m4217b();
                this.f3037b.mo3949a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3036a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3036a;
            this.f3036a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo3948a(i);
            } else {
                mo3950b(i);
            }
            if (z2 || this.f3037b != null) {
                m4217b();
                this.f3037b.mo3949a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3952d(int i) {
            if (i >= 64) {
                m4217b();
                return this.f3037b.mo3952d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3036a & j) != 0;
            this.f3036a &= ~j;
            long j2 = j - 1;
            long j3 = this.f3036a;
            this.f3036a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            C0852a aVar = this.f3037b;
            if (aVar != null) {
                if (aVar.mo3951c(0)) {
                    mo3948a(63);
                }
                this.f3037b.mo3952d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3953e(int i) {
            C0852a aVar = this.f3037b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3036a);
                }
                return Long.bitCount(this.f3036a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3036a & ((1 << i) - 1));
            } else {
                return aVar.mo3953e(i - 64) + Long.bitCount(this.f3036a);
            }
        }

        public String toString() {
            if (this.f3037b == null) {
                return Long.toBinaryString(this.f3036a);
            }
            return this.f3037b.toString() + "xx" + Long.toBinaryString(this.f3036a);
        }
    }
}
