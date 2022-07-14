package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p027a.p028a.C0402f;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bn */
public class C0968bn {

    /* renamed from: a */
    private final Context f3554a;

    /* renamed from: b */
    private final TypedArray f3555b;

    /* renamed from: c */
    private TypedValue f3556c;

    /* renamed from: a */
    public static C0968bn m5092a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0968bn(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0968bn m5093a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0968bn(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public static C0968bn m5091a(Context context, int i, int[] iArr) {
        return new C0968bn(context, context.obtainStyledAttributes(i, iArr));
    }

    private C0968bn(Context context, TypedArray typedArray) {
        this.f3554a = context;
        this.f3555b = typedArray;
    }

    /* renamed from: a */
    public Drawable mo4780a(int i) {
        int resourceId;
        if (!this.f3555b.hasValue(i) || (resourceId = this.f3555b.getResourceId(i, 0)) == 0) {
            return this.f3555b.getDrawable(i);
        }
        return C0705a.m3168b(this.f3554a, resourceId);
    }

    /* renamed from: b */
    public Drawable mo4784b(int i) {
        int resourceId;
        if (!this.f3555b.hasValue(i) || (resourceId = this.f3555b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1009l.m5329a().mo4940a(this.f3554a, resourceId, true);
    }

    /* renamed from: a */
    public Typeface mo4779a(int i, int i2, C0402f.C0403a aVar) {
        int resourceId = this.f3555b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3556c == null) {
            this.f3556c = new TypedValue();
        }
        return C0402f.m1666a(this.f3554a, resourceId, this.f3556c, i2, aVar);
    }

    /* renamed from: c */
    public CharSequence mo4786c(int i) {
        return this.f3555b.getText(i);
    }

    /* renamed from: d */
    public String mo4788d(int i) {
        return this.f3555b.getString(i);
    }

    /* renamed from: a */
    public boolean mo4782a(int i, boolean z) {
        return this.f3555b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo4778a(int i, int i2) {
        return this.f3555b.getInt(i, i2);
    }

    /* renamed from: a */
    public float mo4777a(int i, float f) {
        return this.f3555b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo4783b(int i, int i2) {
        return this.f3555b.getColor(i, i2);
    }

    /* renamed from: e */
    public ColorStateList mo4790e(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f3555b.hasValue(i) || (resourceId = this.f3555b.getResourceId(i, 0)) == 0 || (a = C0705a.m3165a(this.f3554a, resourceId)) == null) {
            return this.f3555b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: c */
    public int mo4785c(int i, int i2) {
        return this.f3555b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int mo4787d(int i, int i2) {
        return this.f3555b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int mo4789e(int i, int i2) {
        return this.f3555b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int mo4791f(int i, int i2) {
        return this.f3555b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo4793g(int i, int i2) {
        return this.f3555b.getResourceId(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo4792f(int i) {
        return this.f3555b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo4794g(int i) {
        return this.f3555b.hasValue(i);
    }

    /* renamed from: a */
    public void mo4781a() {
        this.f3555b.recycle();
    }
}
