package android.support.design.widget;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.support.design.C0241a;
import android.view.View;

/* renamed from: android.support.design.widget.n */
class C0389n {

    /* renamed from: a */
    private static final int[] f1290a = {16843848};

    /* renamed from: a */
    static void m1617a(View view, float f) {
        int integer = view.getResources().getInteger(C0241a.C0247f.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0241a.C0243b.state_liftable, -C0241a.C0243b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
