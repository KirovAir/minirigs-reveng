package android.support.design.p022f;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.p026v4.graphics.C0534a;
import android.util.StateSet;

/* renamed from: android.support.design.f.a */
public class C0288a {

    /* renamed from: a */
    public static final boolean f869a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f870b = {16842919};

    /* renamed from: c */
    private static final int[] f871c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f872d = {16842908};

    /* renamed from: e */
    private static final int[] f873e = {16843623};

    /* renamed from: f */
    private static final int[] f874f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f875g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f876h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f877i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f878j = {16842913};

    /* renamed from: a */
    public static ColorStateList m1038a(ColorStateList colorStateList) {
        if (f869a) {
            return new ColorStateList(new int[][]{f878j, StateSet.NOTHING}, new int[]{m1037a(colorStateList, f874f), m1037a(colorStateList, f870b)});
        }
        int[] iArr = f874f;
        int[] iArr2 = f875g;
        int[] iArr3 = f876h;
        int[] iArr4 = f877i;
        int[] iArr5 = f870b;
        int[] iArr6 = f871c;
        int[] iArr7 = f872d;
        int[] iArr8 = f873e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f878j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m1037a(colorStateList, iArr), m1037a(colorStateList, iArr2), m1037a(colorStateList, iArr3), m1037a(colorStateList, iArr4), 0, m1037a(colorStateList, iArr5), m1037a(colorStateList, iArr6), m1037a(colorStateList, iArr7), m1037a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    private static int m1037a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f869a ? m1036a(colorForState) : colorForState;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m1036a(int i) {
        return C0534a.m2344b(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
