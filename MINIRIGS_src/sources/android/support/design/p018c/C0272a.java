package android.support.design.p018c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.support.design.p018c.C0278d;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: android.support.design.c.a */
public final class C0272a {
    /* renamed from: a */
    public static Animator m990a(C0278d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C0278d.C0281b.f861a, C0278d.C0280a.f859a, new C0278d.C0283d[]{new C0278d.C0283d(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C0278d.C0283d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f865c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a */
    public static Animator.AnimatorListener m989a(final C0278d dVar) {
        return new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                dVar.mo889a();
            }

            public void onAnimationEnd(Animator animator) {
                dVar.mo891b();
            }
        };
    }
}
