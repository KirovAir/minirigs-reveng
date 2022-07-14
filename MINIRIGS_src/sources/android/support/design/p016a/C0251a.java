package android.support.design.p016a;

import android.animation.TimeInterpolator;
import android.support.p026v4.p036h.p038b.C0572a;
import android.support.p026v4.p036h.p038b.C0573b;
import android.support.p026v4.p036h.p038b.C0574c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.a.a */
public class C0251a {

    /* renamed from: a */
    public static final TimeInterpolator f763a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f764b = new C0573b();

    /* renamed from: c */
    public static final TimeInterpolator f765c = new C0572a();

    /* renamed from: d */
    public static final TimeInterpolator f766d = new C0574c();

    /* renamed from: e */
    public static final TimeInterpolator f767e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m880a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
