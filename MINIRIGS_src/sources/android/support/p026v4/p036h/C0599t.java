package android.support.p026v4.p036h;

import android.os.Build;
import android.support.p009a.C0106a;
import android.view.ViewGroup;

/* renamed from: android.support.v4.h.t */
public final class C0599t {
    /* renamed from: a */
    public static boolean m2639a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0106a.C0108b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0594r.m2612m(viewGroup) == null) ? false : true;
    }
}
