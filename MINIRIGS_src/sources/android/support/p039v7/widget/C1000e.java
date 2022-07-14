package android.support.p039v7.widget;

import android.support.p026v4.p035g.C0527j;
import android.support.p039v7.widget.C0899aw;
import android.support.p039v7.widget.C0904ay;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.e */
class C1000e implements C0899aw.C0900a {

    /* renamed from: a */
    final ArrayList<C1002b> f3668a;

    /* renamed from: b */
    final ArrayList<C1002b> f3669b;

    /* renamed from: c */
    final C1001a f3670c;

    /* renamed from: d */
    Runnable f3671d;

    /* renamed from: e */
    final boolean f3672e;

    /* renamed from: f */
    final C0899aw f3673f;

    /* renamed from: g */
    private C0527j.C0528a<C1002b> f3674g;

    /* renamed from: h */
    private int f3675h;

    /* renamed from: android.support.v7.widget.e$a */
    interface C1001a {
        /* renamed from: a */
        C0904ay.C0945x mo4352a(int i);

        /* renamed from: a */
        void mo4353a(int i, int i2);

        /* renamed from: a */
        void mo4354a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4355a(C1002b bVar);

        /* renamed from: b */
        void mo4356b(int i, int i2);

        /* renamed from: b */
        void mo4357b(C1002b bVar);

        /* renamed from: c */
        void mo4358c(int i, int i2);

        /* renamed from: d */
        void mo4360d(int i, int i2);
    }

    C1000e(C1001a aVar) {
        this(aVar, false);
    }

    C1000e(C1001a aVar, boolean z) {
        this.f3674g = new C0527j.C0529b(30);
        this.f3668a = new ArrayList<>();
        this.f3669b = new ArrayList<>();
        this.f3675h = 0;
        this.f3670c = aVar;
        this.f3672e = z;
        this.f3673f = new C0899aw(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4875a() {
        mo4877a((List<C1002b>) this.f3668a);
        mo4877a((List<C1002b>) this.f3669b);
        this.f3675h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4880b() {
        this.f3673f.mo4165a(this.f3668a);
        int size = this.f3668a.size();
        for (int i = 0; i < size; i++) {
            C1002b bVar = this.f3668a.get(i);
            int i2 = bVar.f3676a;
            if (i2 == 4) {
                m5276d(bVar);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m5279f(bVar);
                        break;
                    case 2:
                        m5275c(bVar);
                        break;
                }
            } else {
                m5274b(bVar);
            }
            Runnable runnable = this.f3671d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3668a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4882c() {
        int size = this.f3669b.size();
        for (int i = 0; i < size; i++) {
            this.f3670c.mo4357b(this.f3669b.get(i));
        }
        mo4877a((List<C1002b>) this.f3669b);
        this.f3675h = 0;
    }

    /* renamed from: b */
    private void m5274b(C1002b bVar) {
        m5280g(bVar);
    }

    /* renamed from: c */
    private void m5275c(C1002b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3677b;
        int i2 = bVar.f3677b + bVar.f3679d;
        int i3 = bVar.f3677b;
        int i4 = 0;
        char c2 = 65535;
        while (i3 < i2) {
            if (this.f3670c.mo4352a(i3) != null || m5277d(i3)) {
                if (c2 == 0) {
                    m5278e(mo4168a(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5280g(mo4168a(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3679d) {
            mo4169a(bVar);
            bVar = mo4168a(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m5278e(bVar);
        } else {
            m5280g(bVar);
        }
    }

    /* renamed from: d */
    private void m5276d(C1002b bVar) {
        int i = bVar.f3677b;
        int i2 = bVar.f3677b + bVar.f3679d;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        for (int i5 = bVar.f3677b; i5 < i2; i5++) {
            if (this.f3670c.mo4352a(i5) != null || m5277d(i5)) {
                if (c == 0) {
                    m5278e(mo4168a(4, i3, i4, bVar.f3678c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m5280g(mo4168a(4, i3, i4, bVar.f3678c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.f3679d) {
            Object obj = bVar.f3678c;
            mo4169a(bVar);
            bVar = mo4168a(4, i3, i4, obj);
        }
        if (c == 0) {
            m5278e(bVar);
        } else {
            m5280g(bVar);
        }
    }

    /* renamed from: e */
    private void m5278e(C1002b bVar) {
        int i;
        if (bVar.f3676a == 1 || bVar.f3676a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m5273b(bVar.f3677b, bVar.f3676a);
        int i2 = bVar.f3677b;
        int i3 = bVar.f3676a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i4 = b;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f3679d; i7++) {
            int b2 = m5273b(bVar.f3677b + (i * i7), bVar.f3676a);
            int i8 = bVar.f3676a;
            if (i8 != 2 ? i8 != 4 ? false : b2 == i4 + 1 : b2 == i4) {
                i6++;
            } else {
                C1002b a = mo4168a(bVar.f3676a, i4, i6, bVar.f3678c);
                mo4876a(a, i5);
                mo4169a(a);
                if (bVar.f3676a == 4) {
                    i5 += i6;
                }
                i4 = b2;
                i6 = 1;
            }
        }
        Object obj = bVar.f3678c;
        mo4169a(bVar);
        if (i6 > 0) {
            C1002b a2 = mo4168a(bVar.f3676a, i4, i6, obj);
            mo4876a(a2, i5);
            mo4169a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4876a(C1002b bVar, int i) {
        this.f3670c.mo4355a(bVar);
        int i2 = bVar.f3676a;
        if (i2 == 2) {
            this.f3670c.mo4353a(i, bVar.f3679d);
        } else if (i2 == 4) {
            this.f3670c.mo4354a(i, bVar.f3679d, bVar.f3678c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: b */
    private int m5273b(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f3669b.size() - 1; size >= 0; size--) {
            C1002b bVar = this.f3669b.get(size);
            if (bVar.f3676a == 8) {
                if (bVar.f3677b < bVar.f3679d) {
                    i4 = bVar.f3677b;
                    i3 = bVar.f3679d;
                } else {
                    i4 = bVar.f3679d;
                    i3 = bVar.f3677b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.f3677b) {
                        if (i2 == 1) {
                            bVar.f3677b++;
                            bVar.f3679d++;
                        } else if (i2 == 2) {
                            bVar.f3677b--;
                            bVar.f3679d--;
                        }
                    }
                } else if (i4 == bVar.f3677b) {
                    if (i2 == 1) {
                        bVar.f3679d++;
                    } else if (i2 == 2) {
                        bVar.f3679d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f3677b++;
                    } else if (i2 == 2) {
                        bVar.f3677b--;
                    }
                    i--;
                }
            } else if (bVar.f3677b <= i) {
                if (bVar.f3676a == 1) {
                    i -= bVar.f3679d;
                } else if (bVar.f3676a == 2) {
                    i += bVar.f3679d;
                }
            } else if (i2 == 1) {
                bVar.f3677b++;
            } else if (i2 == 2) {
                bVar.f3677b--;
            }
        }
        for (int size2 = this.f3669b.size() - 1; size2 >= 0; size2--) {
            C1002b bVar2 = this.f3669b.get(size2);
            if (bVar2.f3676a == 8) {
                if (bVar2.f3679d == bVar2.f3677b || bVar2.f3679d < 0) {
                    this.f3669b.remove(size2);
                    mo4169a(bVar2);
                }
            } else if (bVar2.f3679d <= 0) {
                this.f3669b.remove(size2);
                mo4169a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: d */
    private boolean m5277d(int i) {
        int size = this.f3669b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1002b bVar = this.f3669b.get(i2);
            if (bVar.f3676a == 8) {
                if (mo4874a(bVar.f3679d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f3676a == 1) {
                int i3 = bVar.f3677b + bVar.f3679d;
                for (int i4 = bVar.f3677b; i4 < i3; i4++) {
                    if (mo4874a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m5279f(C1002b bVar) {
        m5280g(bVar);
    }

    /* renamed from: g */
    private void m5280g(C1002b bVar) {
        this.f3669b.add(bVar);
        int i = bVar.f3676a;
        if (i == 4) {
            this.f3670c.mo4354a(bVar.f3677b, bVar.f3679d, bVar.f3678c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f3670c.mo4358c(bVar.f3677b, bVar.f3679d);
                    return;
                case 2:
                    this.f3670c.mo4356b(bVar.f3677b, bVar.f3679d);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
            }
        } else {
            this.f3670c.mo4360d(bVar.f3677b, bVar.f3679d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4883d() {
        return this.f3668a.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4878a(int i) {
        return (i & this.f3675h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4879b(int i) {
        return mo4874a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4874a(int i, int i2) {
        int size = this.f3669b.size();
        while (i2 < size) {
            C1002b bVar = this.f3669b.get(i2);
            if (bVar.f3676a == 8) {
                if (bVar.f3677b == i) {
                    i = bVar.f3679d;
                } else {
                    if (bVar.f3677b < i) {
                        i--;
                    }
                    if (bVar.f3679d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f3677b > i) {
                continue;
            } else if (bVar.f3676a == 2) {
                if (i < bVar.f3677b + bVar.f3679d) {
                    return -1;
                }
                i -= bVar.f3679d;
            } else if (bVar.f3676a == 1) {
                i += bVar.f3679d;
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4884e() {
        mo4882c();
        int size = this.f3668a.size();
        for (int i = 0; i < size; i++) {
            C1002b bVar = this.f3668a.get(i);
            int i2 = bVar.f3676a;
            if (i2 == 4) {
                this.f3670c.mo4357b(bVar);
                this.f3670c.mo4354a(bVar.f3677b, bVar.f3679d, bVar.f3678c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f3670c.mo4357b(bVar);
                        this.f3670c.mo4358c(bVar.f3677b, bVar.f3679d);
                        break;
                    case 2:
                        this.f3670c.mo4357b(bVar);
                        this.f3670c.mo4353a(bVar.f3677b, bVar.f3679d);
                        break;
                }
            } else {
                this.f3670c.mo4357b(bVar);
                this.f3670c.mo4360d(bVar.f3677b, bVar.f3679d);
            }
            Runnable runnable = this.f3671d;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4877a((List<C1002b>) this.f3668a);
        this.f3675h = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4881c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.e$b> r0 = r5.f3668a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.e$b> r2 = r5.f3668a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.e$b r2 = (android.support.p039v7.widget.C1000e.C1002b) r2
            int r3 = r2.f3676a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f3677b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f3677b
            int r4 = r2.f3679d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f3679d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f3677b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f3679d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f3677b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f3679d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f3677b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f3679d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C1000e.mo4881c(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4885f() {
        return !this.f3669b.isEmpty() && !this.f3668a.isEmpty();
    }

    /* renamed from: android.support.v7.widget.e$b */
    static class C1002b {

        /* renamed from: a */
        int f3676a;

        /* renamed from: b */
        int f3677b;

        /* renamed from: c */
        Object f3678c;

        /* renamed from: d */
        int f3679d;

        C1002b(int i, int i2, int i3, Object obj) {
            this.f3676a = i;
            this.f3677b = i2;
            this.f3679d = i3;
            this.f3678c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4886a() {
            int i = this.f3676a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4886a() + ",s:" + this.f3677b + "c:" + this.f3679d + ",p:" + this.f3678c + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1002b bVar = (C1002b) obj;
            int i = this.f3676a;
            if (i != bVar.f3676a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3679d - this.f3677b) == 1 && this.f3679d == bVar.f3677b && this.f3677b == bVar.f3679d) {
                return true;
            }
            if (this.f3679d != bVar.f3679d || this.f3677b != bVar.f3677b) {
                return false;
            }
            Object obj2 = this.f3678c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3678c)) {
                    return false;
                }
            } else if (bVar.f3678c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3676a * 31) + this.f3677b) * 31) + this.f3679d;
        }
    }

    /* renamed from: a */
    public C1002b mo4168a(int i, int i2, int i3, Object obj) {
        C1002b a = this.f3674g.mo2086a();
        if (a == null) {
            return new C1002b(i, i2, i3, obj);
        }
        a.f3676a = i;
        a.f3677b = i2;
        a.f3679d = i3;
        a.f3678c = obj;
        return a;
    }

    /* renamed from: a */
    public void mo4169a(C1002b bVar) {
        if (!this.f3672e) {
            bVar.f3678c = null;
            this.f3674g.mo2087a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4877a(List<C1002b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4169a(list.get(i));
        }
        list.clear();
    }
}
