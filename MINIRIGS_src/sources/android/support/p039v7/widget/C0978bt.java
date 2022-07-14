package android.support.p039v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.bt */
class C0978bt {

    /* renamed from: a */
    final C0980b f3601a;

    /* renamed from: b */
    C0979a f3602b = new C0979a();

    /* renamed from: android.support.v7.widget.bt$b */
    interface C0980b {
        /* renamed from: a */
        int mo4493a();

        /* renamed from: a */
        int mo4494a(View view);

        /* renamed from: a */
        View mo4495a(int i);

        /* renamed from: b */
        int mo4496b();

        /* renamed from: b */
        int mo4497b(View view);
    }

    C0978bt(C0980b bVar) {
        this.f3601a = bVar;
    }

    /* renamed from: android.support.v7.widget.bt$a */
    static class C0979a {

        /* renamed from: a */
        int f3603a = 0;

        /* renamed from: b */
        int f3604b;

        /* renamed from: c */
        int f3605c;

        /* renamed from: d */
        int f3606d;

        /* renamed from: e */
        int f3607e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4819a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        C0979a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4822a(int i, int i2, int i3, int i4) {
            this.f3604b = i;
            this.f3605c = i2;
            this.f3606d = i3;
            this.f3607e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4821a(int i) {
            this.f3603a = i | this.f3603a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4820a() {
            this.f3603a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4823b() {
            int i = this.f3603a;
            if ((i & 7) != 0 && (i & (mo4819a(this.f3606d, this.f3604b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3603a;
            if ((i2 & 112) != 0 && (i2 & (mo4819a(this.f3606d, this.f3605c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3603a;
            if ((i3 & 1792) != 0 && (i3 & (mo4819a(this.f3607e, this.f3604b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3603a;
            if ((i4 & 28672) == 0 || (i4 & (mo4819a(this.f3607e, this.f3605c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4817a(int i, int i2, int i3, int i4) {
        int a = this.f3601a.mo4493a();
        int b = this.f3601a.mo4496b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3601a.mo4495a(i);
            this.f3602b.mo4822a(a, b, this.f3601a.mo4494a(a2), this.f3601a.mo4497b(a2));
            if (i3 != 0) {
                this.f3602b.mo4820a();
                this.f3602b.mo4821a(i3);
                if (this.f3602b.mo4823b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3602b.mo4820a();
                this.f3602b.mo4821a(i4);
                if (this.f3602b.mo4823b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4818a(View view, int i) {
        this.f3602b.mo4822a(this.f3601a.mo4493a(), this.f3601a.mo4496b(), this.f3601a.mo4494a(view), this.f3601a.mo4497b(view));
        if (i == 0) {
            return false;
        }
        this.f3602b.mo4820a();
        this.f3602b.mo4821a(i);
        return this.f3602b.mo4823b();
    }
}
