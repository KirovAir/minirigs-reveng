package android.support.design.p021e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p039v7.p041b.p042a.C0705a;

/* renamed from: android.support.design.e.a */
public class C0287a {
    /* renamed from: a */
    public static ColorStateList m1034a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C0705a.m3165a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: b */
    public static Drawable m1035b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C0705a.m3168b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }
}
