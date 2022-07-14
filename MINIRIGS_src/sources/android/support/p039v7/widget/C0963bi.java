package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p026v4.graphics.C0534a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bi */
class C0963bi {

    /* renamed from: a */
    static final int[] f3535a = {-16842910};

    /* renamed from: b */
    static final int[] f3536b = {16842908};

    /* renamed from: c */
    static final int[] f3537c = {16843518};

    /* renamed from: d */
    static final int[] f3538d = {16842919};

    /* renamed from: e */
    static final int[] f3539e = {16842912};

    /* renamed from: f */
    static final int[] f3540f = {16842913};

    /* renamed from: g */
    static final int[] f3541g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f3542h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f3543i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f3544j = new int[1];

    /* renamed from: a */
    public static int m5081a(Context context, int i) {
        int[] iArr = f3544j;
        iArr[0] = i;
        C0968bn a = C0968bn.m5092a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4783b(0, 0);
        } finally {
            a.mo4781a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m5084b(Context context, int i) {
        int[] iArr = f3544j;
        iArr[0] = i;
        C0968bn a = C0968bn.m5092a(context, (AttributeSet) null, iArr);
        try {
            return a.mo4790e(0);
        } finally {
            a.mo4781a();
        }
    }

    /* renamed from: c */
    public static int m5085c(Context context, int i) {
        ColorStateList b = m5084b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f3535a, b.getDefaultColor());
        }
        TypedValue a = m5083a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m5082a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m5083a() {
        TypedValue typedValue = f3543i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3543i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m5082a(Context context, int i, float f) {
        int a = m5081a(context, i);
        return C0534a.m2344b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
