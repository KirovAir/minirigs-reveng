package android.support.design.widget;

/* renamed from: android.support.design.widget.g */
public final class C0377g {
    /* renamed from: a */
    public static float m1567a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    private static float m1570b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: b */
    public static boolean m1571b(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: a */
    public static float m1568a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m1569a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m1570b(m1568a(f, f2, f3, f4), m1568a(f, f2, f5, f4), m1568a(f, f2, f5, f6), m1568a(f, f2, f3, f6));
    }
}
