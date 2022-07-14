package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AnimatorSet f957a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo1001b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo998a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f957a != null;
        if (z3) {
            this.f957a.cancel();
        }
        this.f957a = mo1001b(view, view2, z, z3);
        this.f957a.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                AnimatorSet unused = ExpandableTransformationBehavior.this.f957a = null;
            }
        });
        this.f957a.start();
        if (!z2) {
            this.f957a.end();
        }
        return true;
    }
}
