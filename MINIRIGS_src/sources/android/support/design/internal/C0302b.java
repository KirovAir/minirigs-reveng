package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0241a;
import android.util.AttributeSet;

/* renamed from: android.support.design.internal.b */
public final class C0302b {

    /* renamed from: a */
    private static final int[] f950a = {C0241a.C0243b.colorPrimary};

    /* renamed from: b */
    private static final int[] f951b = {C0241a.C0243b.colorSecondary};

    /* renamed from: a */
    public static TypedArray m1085a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1087a(context, attributeSet, i, i2);
        m1091b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: a */
    private static void m1087a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C0241a.C0250i.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m1090b(context);
        }
        m1086a(context);
    }

    /* renamed from: b */
    private static void m1091b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C0241a.C0250i.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(C0241a.C0250i.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z = m1092c(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: c */
    private static boolean m1092c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    public static void m1086a(Context context) {
        m1088a(context, f950a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m1090b(Context context) {
        m1088a(context, f951b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m1089a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m1088a(Context context, int[] iArr, String str) {
        if (!m1089a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }
}
