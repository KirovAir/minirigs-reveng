package android.support.p026v4.p036h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.h.v */
public final class C0601v {

    /* renamed from: a */
    Runnable f1848a = null;

    /* renamed from: b */
    Runnable f1849b = null;

    /* renamed from: c */
    int f1850c = -1;

    /* renamed from: d */
    private WeakReference<View> f1851d;

    C0601v(View view) {
        this.f1851d = new WeakReference<>(view);
    }

    /* renamed from: android.support.v4.h.v$a */
    static class C0604a implements C0605w {

        /* renamed from: a */
        C0601v f1858a;

        /* renamed from: b */
        boolean f1859b;

        C0604a(C0601v vVar) {
            this.f1858a = vVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.support.v4.h.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2309a(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f1859b = r0
                android.support.v4.h.v r0 = r3.f1858a
                int r0 = r0.f1850c
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                android.support.v4.h.v r0 = r3.f1858a
                java.lang.Runnable r0 = r0.f1848a
                if (r0 == 0) goto L_0x0020
                android.support.v4.h.v r0 = r3.f1858a
                java.lang.Runnable r0 = r0.f1848a
                android.support.v4.h.v r2 = r3.f1858a
                r2.f1848a = r1
                r0.run()
            L_0x0020:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof android.support.p026v4.p036h.C0605w
                if (r2 == 0) goto L_0x002d
                r1 = r0
                android.support.v4.h.w r1 = (android.support.p026v4.p036h.C0605w) r1
            L_0x002d:
                if (r1 == 0) goto L_0x0032
                r1.mo2309a(r4)
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p036h.C0601v.C0604a.mo2309a(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.support.v4.h.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2310b(android.view.View r4) {
            /*
                r3 = this;
                android.support.v4.h.v r0 = r3.f1858a
                int r0 = r0.f1850c
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x0013
                android.support.v4.h.v r0 = r3.f1858a
                int r0 = r0.f1850c
                r4.setLayerType(r0, r2)
                android.support.v4.h.v r0 = r3.f1858a
                r0.f1850c = r1
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x001d
                boolean r0 = r3.f1859b
                if (r0 != 0) goto L_0x0043
            L_0x001d:
                android.support.v4.h.v r0 = r3.f1858a
                java.lang.Runnable r0 = r0.f1849b
                if (r0 == 0) goto L_0x002e
                android.support.v4.h.v r0 = r3.f1858a
                java.lang.Runnable r0 = r0.f1849b
                android.support.v4.h.v r1 = r3.f1858a
                r1.f1849b = r2
                r0.run()
            L_0x002e:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof android.support.p026v4.p036h.C0605w
                if (r1 == 0) goto L_0x003b
                r2 = r0
                android.support.v4.h.w r2 = (android.support.p026v4.p036h.C0605w) r2
            L_0x003b:
                if (r2 == 0) goto L_0x0040
                r2.mo2310b(r4)
            L_0x0040:
                r4 = 1
                r3.f1859b = r4
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p036h.C0601v.C0604a.mo2310b(android.view.View):void");
        }

        /* renamed from: c */
        public void mo2311c(View view) {
            Object tag = view.getTag(2113929216);
            C0605w wVar = tag instanceof C0605w ? (C0605w) tag : null;
            if (wVar != null) {
                wVar.mo2311c(view);
            }
        }
    }

    /* renamed from: a */
    public C0601v mo2297a(long j) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0601v mo2296a(float f) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0601v mo2301b(float f) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public long mo2295a() {
        View view = (View) this.f1851d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public C0601v mo2300a(Interpolator interpolator) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0601v mo2302b(long j) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void mo2303b() {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void mo2304c() {
        View view = (View) this.f1851d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C0601v mo2298a(C0605w wVar) {
        View view = (View) this.f1851d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m2647a(view, wVar);
            } else {
                view.setTag(2113929216, wVar);
                m2647a(view, new C0604a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m2647a(final View view, final C0605w wVar) {
        if (wVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    wVar.mo2311c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    wVar.mo2310b(view);
                }

                public void onAnimationStart(Animator animator) {
                    wVar.mo2309a(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C0601v mo2299a(final C0607y yVar) {
        final View view = (View) this.f1851d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C06032 r1 = null;
            if (yVar != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        yVar.mo2312a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
