package android.support.design.p018c;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.p018c.C0276c;
import android.support.design.widget.C0377g;
import android.util.Property;

/* renamed from: android.support.design.c.d */
public interface C0278d extends C0276c.C0277a {
    /* renamed from: a */
    void mo889a();

    /* renamed from: b */
    void mo891b();

    int getCircularRevealScrimColor();

    C0283d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0283d dVar);

    /* renamed from: android.support.design.c.d$d */
    public static class C0283d {

        /* renamed from: a */
        public float f863a;

        /* renamed from: b */
        public float f864b;

        /* renamed from: c */
        public float f865c;

        private C0283d() {
        }

        public C0283d(float f, float f2, float f3) {
            this.f863a = f;
            this.f864b = f2;
            this.f865c = f3;
        }

        public C0283d(C0283d dVar) {
            this(dVar.f863a, dVar.f864b, dVar.f865c);
        }

        /* renamed from: a */
        public void mo924a(float f, float f2, float f3) {
            this.f863a = f;
            this.f864b = f2;
            this.f865c = f3;
        }

        /* renamed from: a */
        public void mo925a(C0283d dVar) {
            mo924a(dVar.f863a, dVar.f864b, dVar.f865c);
        }

        /* renamed from: a */
        public boolean mo926a() {
            return this.f865c == Float.MAX_VALUE;
        }
    }

    /* renamed from: android.support.design.c.d$b */
    public static class C0281b extends Property<C0278d, C0283d> {

        /* renamed from: a */
        public static final Property<C0278d, C0283d> f861a = new C0281b("circularReveal");

        private C0281b(String str) {
            super(C0283d.class, str);
        }

        /* renamed from: a */
        public C0283d get(C0278d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(C0278d dVar, C0283d dVar2) {
            dVar.setRevealInfo(dVar2);
        }
    }

    /* renamed from: android.support.design.c.d$a */
    public static class C0280a implements TypeEvaluator<C0283d> {

        /* renamed from: a */
        public static final TypeEvaluator<C0283d> f859a = new C0280a();

        /* renamed from: b */
        private final C0283d f860b = new C0283d();

        /* renamed from: a */
        public C0283d evaluate(float f, C0283d dVar, C0283d dVar2) {
            this.f860b.mo924a(C0377g.m1567a(dVar.f863a, dVar2.f863a, f), C0377g.m1567a(dVar.f864b, dVar2.f864b, f), C0377g.m1567a(dVar.f865c, dVar2.f865c, f));
            return this.f860b;
        }
    }

    /* renamed from: android.support.design.c.d$c */
    public static class C0282c extends Property<C0278d, Integer> {

        /* renamed from: a */
        public static final Property<C0278d, Integer> f862a = new C0282c("circularRevealScrimColor");

        private C0282c(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C0278d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(C0278d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }
}
