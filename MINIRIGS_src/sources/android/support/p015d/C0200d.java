package android.support.p015d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.support.p015d.C0216m;
import android.support.p026v4.p036h.C0594r;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.d.d */
public class C0200d extends C0180ai {
    public C0200d(int i) {
        mo601a(i);
    }

    public C0200d() {
    }

    /* renamed from: a */
    public void mo602a(C0232s sVar) {
        super.mo602a(sVar);
        sVar.f745a.put("android:fade:transitionAlpha", Float.valueOf(C0173ad.m648c(sVar.f746b)));
    }

    /* renamed from: a */
    private Animator m718a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0173ad.m642a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0173ad.f585a, new float[]{f2});
        ofFloat.addListener(new C0202a(view));
        mo678a((C0216m.C0222c) new C0223n() {
            /* renamed from: a */
            public void mo609a(C0216m mVar) {
                C0173ad.m642a(view, 1.0f);
                C0173ad.m650e(view);
                mVar.mo692b((C0216m.C0222c) this);
            }
        });
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo600a(ViewGroup viewGroup, View view, C0232s sVar, C0232s sVar2) {
        float f = 0.0f;
        float a = m717a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m718a(view, f, 1.0f);
    }

    /* renamed from: b */
    public Animator mo606b(ViewGroup viewGroup, View view, C0232s sVar, C0232s sVar2) {
        C0173ad.m649d(view);
        return m718a(view, m717a(sVar, 1.0f), 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f745a.get("android:fade:transitionAlpha");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m717a(android.support.p015d.C0232s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f745a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p015d.C0200d.m717a(android.support.d.s, float):float");
    }

    /* renamed from: android.support.d.d$a */
    private static class C0202a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f658a;

        /* renamed from: b */
        private boolean f659b = false;

        C0202a(View view) {
            this.f658a = view;
        }

        public void onAnimationStart(Animator animator) {
            if (C0594r.m2616q(this.f658a) && this.f658a.getLayerType() == 0) {
                this.f659b = true;
                this.f658a.setLayerType(2, (Paint) null);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C0173ad.m642a(this.f658a, 1.0f);
            if (this.f659b) {
                this.f658a.setLayerType(0, (Paint) null);
            }
        }
    }
}
