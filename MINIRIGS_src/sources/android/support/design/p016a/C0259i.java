package android.support.design.p016a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: android.support.design.a.i */
public class C0259i {

    /* renamed from: a */
    private long f777a = 0;

    /* renamed from: b */
    private long f778b = 300;

    /* renamed from: c */
    private TimeInterpolator f779c = null;

    /* renamed from: d */
    private int f780d = 0;

    /* renamed from: e */
    private int f781e = 1;

    public C0259i(long j, long j2) {
        this.f777a = j;
        this.f778b = j2;
    }

    public C0259i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f777a = j;
        this.f778b = j2;
        this.f779c = timeInterpolator;
    }

    /* renamed from: a */
    public void mo765a(Animator animator) {
        animator.setStartDelay(mo764a());
        animator.setDuration(mo766b());
        animator.setInterpolator(mo767c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo768d());
            valueAnimator.setRepeatMode(mo769e());
        }
    }

    /* renamed from: a */
    public long mo764a() {
        return this.f777a;
    }

    /* renamed from: b */
    public long mo766b() {
        return this.f778b;
    }

    /* renamed from: c */
    public TimeInterpolator mo767c() {
        TimeInterpolator timeInterpolator = this.f779c;
        return timeInterpolator != null ? timeInterpolator : C0251a.f764b;
    }

    /* renamed from: d */
    public int mo768d() {
        return this.f780d;
    }

    /* renamed from: e */
    public int mo769e() {
        return this.f781e;
    }

    /* renamed from: a */
    static C0259i m898a(ValueAnimator valueAnimator) {
        C0259i iVar = new C0259i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m899b(valueAnimator));
        iVar.f780d = valueAnimator.getRepeatCount();
        iVar.f781e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m899b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C0251a.f764b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C0251a.f765c;
        }
        return interpolator instanceof DecelerateInterpolator ? C0251a.f766d : interpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0259i iVar = (C0259i) obj;
        if (mo764a() == iVar.mo764a() && mo766b() == iVar.mo766b() && mo768d() == iVar.mo768d() && mo769e() == iVar.mo769e()) {
            return mo767c().getClass().equals(iVar.mo767c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo764a() ^ (mo764a() >>> 32))) * 31) + ((int) (mo766b() ^ (mo766b() >>> 32)))) * 31) + mo767c().getClass().hashCode()) * 31) + mo768d()) * 31) + mo769e();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo764a() + " duration: " + mo766b() + " interpolator: " + mo767c().getClass() + " repeatCount: " + mo768d() + " repeatMode: " + mo769e() + "}\n";
    }
}
