package android.support.p039v7.widget;

import android.graphics.Rect;
import android.support.p039v7.widget.C0904ay;
import android.view.View;

/* renamed from: android.support.v7.widget.ax */
public abstract class C0901ax {

    /* renamed from: a */
    protected final C0904ay.C0922i f3245a;

    /* renamed from: b */
    final Rect f3246b;

    /* renamed from: c */
    private int f3247c;

    /* renamed from: a */
    public abstract int mo4170a(View view);

    /* renamed from: a */
    public abstract void mo4172a(int i);

    /* renamed from: b */
    public abstract int mo4174b(View view);

    /* renamed from: c */
    public abstract int mo4175c();

    /* renamed from: c */
    public abstract int mo4176c(View view);

    /* renamed from: d */
    public abstract int mo4177d();

    /* renamed from: d */
    public abstract int mo4178d(View view);

    /* renamed from: e */
    public abstract int mo4179e();

    /* renamed from: e */
    public abstract int mo4180e(View view);

    /* renamed from: f */
    public abstract int mo4181f();

    /* renamed from: f */
    public abstract int mo4182f(View view);

    /* renamed from: g */
    public abstract int mo4183g();

    /* renamed from: h */
    public abstract int mo4184h();

    /* renamed from: i */
    public abstract int mo4185i();

    private C0901ax(C0904ay.C0922i iVar) {
        this.f3247c = Integer.MIN_VALUE;
        this.f3246b = new Rect();
        this.f3245a = iVar;
    }

    /* renamed from: a */
    public void mo4171a() {
        this.f3247c = mo4181f();
    }

    /* renamed from: b */
    public int mo4173b() {
        if (Integer.MIN_VALUE == this.f3247c) {
            return 0;
        }
        return mo4181f() - this.f3247c;
    }

    /* renamed from: a */
    public static C0901ax m4442a(C0904ay.C0922i iVar, int i) {
        switch (i) {
            case 0:
                return m4441a(iVar);
            case 1:
                return m4443b(iVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: a */
    public static C0901ax m4441a(C0904ay.C0922i iVar) {
        return new C0901ax(iVar) {
            /* renamed from: d */
            public int mo4177d() {
                return this.f3245a.mo4491y() - this.f3245a.mo4407C();
            }

            /* renamed from: e */
            public int mo4179e() {
                return this.f3245a.mo4491y();
            }

            /* renamed from: a */
            public void mo4172a(int i) {
                this.f3245a.mo3705j(i);
            }

            /* renamed from: c */
            public int mo4175c() {
                return this.f3245a.mo4405A();
            }

            /* renamed from: e */
            public int mo4180e(View view) {
                C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
                return this.f3245a.mo4466f(view) + jVar.leftMargin + jVar.rightMargin;
            }

            /* renamed from: f */
            public int mo4182f(View view) {
                C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
                return this.f3245a.mo4469g(view) + jVar.topMargin + jVar.bottomMargin;
            }

            /* renamed from: b */
            public int mo4174b(View view) {
                return this.f3245a.mo4475j(view) + ((C0904ay.C0927j) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo4170a(View view) {
                return this.f3245a.mo4471h(view) - ((C0904ay.C0927j) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo4176c(View view) {
                this.f3245a.mo4431a(view, true, this.f3246b);
                return this.f3246b.right;
            }

            /* renamed from: d */
            public int mo4178d(View view) {
                this.f3245a.mo4431a(view, true, this.f3246b);
                return this.f3246b.left;
            }

            /* renamed from: f */
            public int mo4181f() {
                return (this.f3245a.mo4491y() - this.f3245a.mo4405A()) - this.f3245a.mo4407C();
            }

            /* renamed from: g */
            public int mo4183g() {
                return this.f3245a.mo4407C();
            }

            /* renamed from: h */
            public int mo4184h() {
                return this.f3245a.mo4489w();
            }

            /* renamed from: i */
            public int mo4185i() {
                return this.f3245a.mo4490x();
            }
        };
    }

    /* renamed from: b */
    public static C0901ax m4443b(C0904ay.C0922i iVar) {
        return new C0901ax(iVar) {
            /* renamed from: d */
            public int mo4177d() {
                return this.f3245a.mo4492z() - this.f3245a.mo4408D();
            }

            /* renamed from: e */
            public int mo4179e() {
                return this.f3245a.mo4492z();
            }

            /* renamed from: a */
            public void mo4172a(int i) {
                this.f3245a.mo3708k(i);
            }

            /* renamed from: c */
            public int mo4175c() {
                return this.f3245a.mo4406B();
            }

            /* renamed from: e */
            public int mo4180e(View view) {
                C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
                return this.f3245a.mo4469g(view) + jVar.topMargin + jVar.bottomMargin;
            }

            /* renamed from: f */
            public int mo4182f(View view) {
                C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
                return this.f3245a.mo4466f(view) + jVar.leftMargin + jVar.rightMargin;
            }

            /* renamed from: b */
            public int mo4174b(View view) {
                return this.f3245a.mo4476k(view) + ((C0904ay.C0927j) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: a */
            public int mo4170a(View view) {
                return this.f3245a.mo4473i(view) - ((C0904ay.C0927j) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo4176c(View view) {
                this.f3245a.mo4431a(view, true, this.f3246b);
                return this.f3246b.bottom;
            }

            /* renamed from: d */
            public int mo4178d(View view) {
                this.f3245a.mo4431a(view, true, this.f3246b);
                return this.f3246b.top;
            }

            /* renamed from: f */
            public int mo4181f() {
                return (this.f3245a.mo4492z() - this.f3245a.mo4406B()) - this.f3245a.mo4408D();
            }

            /* renamed from: g */
            public int mo4183g() {
                return this.f3245a.mo4408D();
            }

            /* renamed from: h */
            public int mo4184h() {
                return this.f3245a.mo4490x();
            }

            /* renamed from: i */
            public int mo4185i() {
                return this.f3245a.mo4489w();
            }
        };
    }
}
