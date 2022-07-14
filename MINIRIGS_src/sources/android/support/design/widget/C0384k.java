package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.k */
public final class C0384k {

    /* renamed from: a */
    ValueAnimator f1275a = null;

    /* renamed from: b */
    private final ArrayList<C0386a> f1276b = new ArrayList<>();

    /* renamed from: c */
    private C0386a f1277c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f1278d = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            if (C0384k.this.f1275a == animator) {
                C0384k.this.f1275a = null;
            }
        }
    };

    /* renamed from: a */
    public void mo1436a(int[] iArr, ValueAnimator valueAnimator) {
        C0386a aVar = new C0386a(iArr, valueAnimator);
        valueAnimator.addListener(this.f1278d);
        this.f1276b.add(aVar);
    }

    /* renamed from: a */
    public void mo1435a(int[] iArr) {
        C0386a aVar;
        int size = this.f1276b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f1276b.get(i);
            if (StateSet.stateSetMatches(aVar.f1280a, iArr)) {
                break;
            }
            i++;
        }
        C0386a aVar2 = this.f1277c;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                m1604b();
            }
            this.f1277c = aVar;
            if (aVar != null) {
                m1603a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m1603a(C0386a aVar) {
        this.f1275a = aVar.f1281b;
        this.f1275a.start();
    }

    /* renamed from: b */
    private void m1604b() {
        ValueAnimator valueAnimator = this.f1275a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1275a = null;
        }
    }

    /* renamed from: a */
    public void mo1434a() {
        ValueAnimator valueAnimator = this.f1275a;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f1275a = null;
        }
    }

    /* renamed from: android.support.design.widget.k$a */
    static class C0386a {

        /* renamed from: a */
        final int[] f1280a;

        /* renamed from: b */
        final ValueAnimator f1281b;

        C0386a(int[] iArr, ValueAnimator valueAnimator) {
            this.f1280a = iArr;
            this.f1281b = valueAnimator;
        }
    }
}
