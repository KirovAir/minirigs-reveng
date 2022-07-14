package android.support.design.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.p016a.C0251a;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0346b<V> {

    /* renamed from: a */
    private int f816a = 0;

    /* renamed from: b */
    private int f817b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewPropertyAnimator f818c;

    /* renamed from: a */
    public boolean mo837a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo836a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f816a = v.getMeasuredHeight();
        return super.mo836a(coordinatorLayout, v, i);
    }

    /* renamed from: a */
    public void mo834a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f817b != 1 && i2 > 0) {
            mo838b(v);
        } else if (this.f817b != 2 && i2 < 0) {
            mo835a(v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo835a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f818c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f817b = 2;
        m935a(v, 0, 225, C0251a.f766d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo838b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f818c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f817b = 1;
        m935a(v, this.f816a, 175, C0251a.f765c);
    }

    /* renamed from: a */
    private void m935a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f818c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f818c = null;
            }
        });
    }
}
