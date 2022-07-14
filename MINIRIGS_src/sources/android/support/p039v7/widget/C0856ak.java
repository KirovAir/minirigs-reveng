package android.support.p039v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.widget.C0904ay;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.ak */
public class C0856ak extends C0960bg {

    /* renamed from: i */
    private static TimeInterpolator f3038i;

    /* renamed from: a */
    ArrayList<ArrayList<C0904ay.C0945x>> f3039a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C0866b>> f3040b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C0865a>> f3041c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C0904ay.C0945x> f3042d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C0904ay.C0945x> f3043e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C0904ay.C0945x> f3044f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C0904ay.C0945x> f3045g = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0904ay.C0945x> f3046j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0904ay.C0945x> f3047k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0866b> f3048l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C0865a> f3049m = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ak$b */
    private static class C0866b {

        /* renamed from: a */
        public C0904ay.C0945x f3084a;

        /* renamed from: b */
        public int f3085b;

        /* renamed from: c */
        public int f3086c;

        /* renamed from: d */
        public int f3087d;

        /* renamed from: e */
        public int f3088e;

        C0866b(C0904ay.C0945x xVar, int i, int i2, int i3, int i4) {
            this.f3084a = xVar;
            this.f3085b = i;
            this.f3086c = i2;
            this.f3087d = i3;
            this.f3088e = i4;
        }
    }

    /* renamed from: android.support.v7.widget.ak$a */
    private static class C0865a {

        /* renamed from: a */
        public C0904ay.C0945x f3078a;

        /* renamed from: b */
        public C0904ay.C0945x f3079b;

        /* renamed from: c */
        public int f3080c;

        /* renamed from: d */
        public int f3081d;

        /* renamed from: e */
        public int f3082e;

        /* renamed from: f */
        public int f3083f;

        private C0865a(C0904ay.C0945x xVar, C0904ay.C0945x xVar2) {
            this.f3078a = xVar;
            this.f3079b = xVar2;
        }

        C0865a(C0904ay.C0945x xVar, C0904ay.C0945x xVar2, int i, int i2, int i3, int i4) {
            this(xVar, xVar2);
            this.f3080c = i;
            this.f3081d = i2;
            this.f3082e = i3;
            this.f3083f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3078a + ", newHolder=" + this.f3079b + ", fromX=" + this.f3080c + ", fromY=" + this.f3081d + ", toX=" + this.f3082e + ", toY=" + this.f3083f + '}';
        }
    }

    /* renamed from: a */
    public void mo3996a() {
        boolean z = !this.f3046j.isEmpty();
        boolean z2 = !this.f3048l.isEmpty();
        boolean z3 = !this.f3049m.isEmpty();
        boolean z4 = !this.f3047k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<C0904ay.C0945x> it = this.f3046j.iterator();
            while (it.hasNext()) {
                m4278u(it.next());
            }
            this.f3046j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3048l);
                this.f3040b.add(arrayList);
                this.f3048l.clear();
                C08571 r6 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C0866b bVar = (C0866b) it.next();
                            C0856ak.this.mo4003b(bVar.f3084a, bVar.f3085b, bVar.f3086c, bVar.f3087d, bVar.f3088e);
                        }
                        arrayList.clear();
                        C0856ak.this.f3040b.remove(arrayList);
                    }
                };
                if (z) {
                    C0594r.m2588a(((C0866b) arrayList.get(0)).f3084a.f3434a, (Runnable) r6, mo4390g());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3049m);
                this.f3041c.add(arrayList2);
                this.f3049m.clear();
                C08582 r62 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C0856ak.this.mo3997a((C0865a) it.next());
                        }
                        arrayList2.clear();
                        C0856ak.this.f3041c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0594r.m2588a(((C0865a) arrayList2.get(0)).f3078a.f3434a, (Runnable) r62, mo4390g());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3047k);
                this.f3039a.add(arrayList3);
                this.f3047k.clear();
                C08593 r5 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C0856ak.this.mo4007c((C0904ay.C0945x) it.next());
                        }
                        arrayList3.clear();
                        C0856ak.this.f3039a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long g = z ? mo4390g() : 0;
                    long e = z2 ? mo4387e() : 0;
                    if (z3) {
                        j = mo4392h();
                    }
                    C0594r.m2588a(((C0904ay.C0945x) arrayList3.get(0)).f3434a, (Runnable) r5, g + Math.max(e, j));
                    return;
                }
                r5.run();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3999a(C0904ay.C0945x xVar) {
        m4279v(xVar);
        this.f3046j.add(xVar);
        return true;
    }

    /* renamed from: u */
    private void m4278u(final C0904ay.C0945x xVar) {
        final View view = xVar.f3434a;
        final ViewPropertyAnimator animate = view.animate();
        this.f3044f.add(xVar);
        animate.setDuration(mo4390g()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C0856ak.this.mo4755l(xVar);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                C0856ak.this.mo4752i(xVar);
                C0856ak.this.f3044f.remove(xVar);
                C0856ak.this.mo4006c();
            }
        }).start();
    }

    /* renamed from: b */
    public boolean mo4005b(C0904ay.C0945x xVar) {
        m4279v(xVar);
        xVar.f3434a.setAlpha(0.0f);
        this.f3047k.add(xVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4007c(final C0904ay.C0945x xVar) {
        final View view = xVar.f3434a;
        final ViewPropertyAnimator animate = view.animate();
        this.f3042d.add(xVar);
        animate.alpha(1.0f).setDuration(mo4388f()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C0856ak.this.mo4757n(xVar);
            }

            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0856ak.this.mo4754k(xVar);
                C0856ak.this.f3042d.remove(xVar);
                C0856ak.this.mo4006c();
            }
        }).start();
    }

    /* renamed from: a */
    public boolean mo4000a(C0904ay.C0945x xVar, int i, int i2, int i3, int i4) {
        View view = xVar.f3434a;
        int translationX = i + ((int) xVar.f3434a.getTranslationX());
        int translationY = i2 + ((int) xVar.f3434a.getTranslationY());
        m4279v(xVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4753j(xVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3048l.add(new C0866b(xVar, translationX, translationY, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4003b(C0904ay.C0945x xVar, int i, int i2, int i3, int i4) {
        final View view = xVar.f3434a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f3043e.add(xVar);
        final C0904ay.C0945x xVar2 = xVar;
        animate.setDuration(mo4387e()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C0856ak.this.mo4756m(xVar2);
            }

            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener((Animator.AnimatorListener) null);
                C0856ak.this.mo4753j(xVar2);
                C0856ak.this.f3043e.remove(xVar2);
                C0856ak.this.mo4006c();
            }
        }).start();
    }

    /* renamed from: a */
    public boolean mo4001a(C0904ay.C0945x xVar, C0904ay.C0945x xVar2, int i, int i2, int i3, int i4) {
        if (xVar == xVar2) {
            return mo4000a(xVar, i, i2, i3, i4);
        }
        float translationX = xVar.f3434a.getTranslationX();
        float translationY = xVar.f3434a.getTranslationY();
        float alpha = xVar.f3434a.getAlpha();
        m4279v(xVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        xVar.f3434a.setTranslationX(translationX);
        xVar.f3434a.setTranslationY(translationY);
        xVar.f3434a.setAlpha(alpha);
        if (xVar2 != null) {
            m4279v(xVar2);
            xVar2.f3434a.setTranslationX((float) (-i5));
            xVar2.f3434a.setTranslationY((float) (-i6));
            xVar2.f3434a.setAlpha(0.0f);
        }
        this.f3049m.add(new C0865a(xVar, xVar2, i, i2, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3997a(final C0865a aVar) {
        final View view;
        C0904ay.C0945x xVar = aVar.f3078a;
        final View view2 = null;
        if (xVar == null) {
            view = null;
        } else {
            view = xVar.f3434a;
        }
        C0904ay.C0945x xVar2 = aVar.f3079b;
        if (xVar2 != null) {
            view2 = xVar2.f3434a;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(mo4392h());
            this.f3045g.add(aVar.f3078a);
            duration.translationX((float) (aVar.f3082e - aVar.f3080c));
            duration.translationY((float) (aVar.f3083f - aVar.f3081d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    C0856ak.this.mo4749b(aVar.f3078a, true);
                }

                public void onAnimationEnd(Animator animator) {
                    duration.setListener((Animator.AnimatorListener) null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C0856ak.this.mo4748a(aVar.f3078a, true);
                    C0856ak.this.f3045g.remove(aVar.f3078a);
                    C0856ak.this.mo4006c();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f3045g.add(aVar.f3079b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4392h()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    C0856ak.this.mo4749b(aVar.f3079b, false);
                }

                public void onAnimationEnd(Animator animator) {
                    animate.setListener((Animator.AnimatorListener) null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C0856ak.this.mo4748a(aVar.f3079b, false);
                    C0856ak.this.f3045g.remove(aVar.f3079b);
                    C0856ak.this.mo4006c();
                }
            }).start();
        }
    }

    /* renamed from: a */
    private void m4275a(List<C0865a> list, C0904ay.C0945x xVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0865a aVar = list.get(size);
            if (m4276a(aVar, xVar) && aVar.f3078a == null && aVar.f3079b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m4277b(C0865a aVar) {
        if (aVar.f3078a != null) {
            m4276a(aVar, aVar.f3078a);
        }
        if (aVar.f3079b != null) {
            m4276a(aVar, aVar.f3079b);
        }
    }

    /* renamed from: a */
    private boolean m4276a(C0865a aVar, C0904ay.C0945x xVar) {
        boolean z = false;
        if (aVar.f3079b == xVar) {
            aVar.f3079b = null;
        } else if (aVar.f3078a != xVar) {
            return false;
        } else {
            aVar.f3078a = null;
            z = true;
        }
        xVar.f3434a.setAlpha(1.0f);
        xVar.f3434a.setTranslationX(0.0f);
        xVar.f3434a.setTranslationY(0.0f);
        mo4748a(xVar, z);
        return true;
    }

    /* renamed from: d */
    public void mo4009d(C0904ay.C0945x xVar) {
        View view = xVar.f3434a;
        view.animate().cancel();
        int size = this.f3048l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3048l.get(size).f3084a == xVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4753j(xVar);
                this.f3048l.remove(size);
            }
        }
        m4275a((List<C0865a>) this.f3049m, xVar);
        if (this.f3046j.remove(xVar)) {
            view.setAlpha(1.0f);
            mo4752i(xVar);
        }
        if (this.f3047k.remove(xVar)) {
            view.setAlpha(1.0f);
            mo4754k(xVar);
        }
        for (int size2 = this.f3041c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3041c.get(size2);
            m4275a((List<C0865a>) arrayList, xVar);
            if (arrayList.isEmpty()) {
                this.f3041c.remove(size2);
            }
        }
        for (int size3 = this.f3040b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3040b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0866b) arrayList2.get(size4)).f3084a == xVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4753j(xVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3040b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3039a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3039a.get(size5);
            if (arrayList3.remove(xVar)) {
                view.setAlpha(1.0f);
                mo4754k(xVar);
                if (arrayList3.isEmpty()) {
                    this.f3039a.remove(size5);
                }
            }
        }
        this.f3044f.remove(xVar);
        this.f3042d.remove(xVar);
        this.f3045g.remove(xVar);
        this.f3043e.remove(xVar);
        mo4006c();
    }

    /* renamed from: v */
    private void m4279v(C0904ay.C0945x xVar) {
        if (f3038i == null) {
            f3038i = new ValueAnimator().getInterpolator();
        }
        xVar.f3434a.animate().setInterpolator(f3038i);
        mo4009d(xVar);
    }

    /* renamed from: b */
    public boolean mo4004b() {
        return !this.f3047k.isEmpty() || !this.f3049m.isEmpty() || !this.f3048l.isEmpty() || !this.f3046j.isEmpty() || !this.f3043e.isEmpty() || !this.f3044f.isEmpty() || !this.f3042d.isEmpty() || !this.f3045g.isEmpty() || !this.f3040b.isEmpty() || !this.f3039a.isEmpty() || !this.f3041c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4006c() {
        if (!mo4004b()) {
            mo4394i();
        }
    }

    /* renamed from: d */
    public void mo4008d() {
        int size = this.f3048l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0866b bVar = this.f3048l.get(size);
            View view = bVar.f3084a.f3434a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4753j(bVar.f3084a);
            this.f3048l.remove(size);
        }
        for (int size2 = this.f3046j.size() - 1; size2 >= 0; size2--) {
            mo4752i(this.f3046j.get(size2));
            this.f3046j.remove(size2);
        }
        int size3 = this.f3047k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0904ay.C0945x xVar = this.f3047k.get(size3);
            xVar.f3434a.setAlpha(1.0f);
            mo4754k(xVar);
            this.f3047k.remove(size3);
        }
        for (int size4 = this.f3049m.size() - 1; size4 >= 0; size4--) {
            m4277b(this.f3049m.get(size4));
        }
        this.f3049m.clear();
        if (mo4004b()) {
            for (int size5 = this.f3040b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3040b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0866b bVar2 = (C0866b) arrayList.get(size6);
                    View view2 = bVar2.f3084a.f3434a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4753j(bVar2.f3084a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3040b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3039a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3039a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0904ay.C0945x xVar2 = (C0904ay.C0945x) arrayList2.get(size8);
                    xVar2.f3434a.setAlpha(1.0f);
                    mo4754k(xVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3039a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3041c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3041c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4277b((C0865a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3041c.remove(arrayList3);
                    }
                }
            }
            mo3998a((List<C0904ay.C0945x>) this.f3044f);
            mo3998a((List<C0904ay.C0945x>) this.f3043e);
            mo3998a((List<C0904ay.C0945x>) this.f3042d);
            mo3998a((List<C0904ay.C0945x>) this.f3045g);
            mo4394i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3998a(List<C0904ay.C0945x> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3434a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo4002a(C0904ay.C0945x xVar, List<Object> list) {
        return !list.isEmpty() || super.mo4002a(xVar, list);
    }
}
