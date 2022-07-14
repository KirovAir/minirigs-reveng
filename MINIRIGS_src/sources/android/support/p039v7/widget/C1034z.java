package android.support.p039v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p027a.p028a.C0402f;
import android.support.p026v4.widget.C0616b;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p040a.C0639a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.z */
class C1034z {

    /* renamed from: a */
    private final TextView f3765a;

    /* renamed from: b */
    private C0966bl f3766b;

    /* renamed from: c */
    private C0966bl f3767c;

    /* renamed from: d */
    private C0966bl f3768d;

    /* renamed from: e */
    private C0966bl f3769e;

    /* renamed from: f */
    private C0966bl f3770f;

    /* renamed from: g */
    private C0966bl f3771g;

    /* renamed from: h */
    private final C0842aa f3772h;

    /* renamed from: i */
    private int f3773i = 0;

    /* renamed from: j */
    private Typeface f3774j;

    /* renamed from: k */
    private boolean f3775k;

    C1034z(TextView textView) {
        this.f3765a = textView;
        this.f3772h = new C0842aa(this.f3765a);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo5049a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f3765a.getContext();
        C1009l a = C1009l.m5329a();
        C0968bn a2 = C0968bn.m5093a(context, attributeSet2, C0639a.C0649j.AppCompatTextHelper, i2, 0);
        int g = a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3766b = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableTop)) {
            this.f3767c = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableRight)) {
            this.f3768d = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3769e = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableStart)) {
                this.f3770f = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.mo4794g(C0639a.C0649j.AppCompatTextHelper_android_drawableEnd)) {
                this.f3771g = m5394a(context, a, a2.mo4793g(C0639a.C0649j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.mo4781a();
        boolean z3 = this.f3765a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0968bn a3 = C0968bn.m5091a(context, g, C0639a.C0649j.TextAppearance);
            if (z3 || !a3.mo4794g(C0639a.C0649j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo4782a(C0639a.C0649j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m5395a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList e = a3.mo4794g(C0639a.C0649j.TextAppearance_android_textColor) ? a3.mo4790e(C0639a.C0649j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo4794g(C0639a.C0649j.TextAppearance_android_textColorHint) ? a3.mo4790e(C0639a.C0649j.TextAppearance_android_textColorHint) : null;
                if (a3.mo4794g(C0639a.C0649j.TextAppearance_android_textColorLink)) {
                    ColorStateList colorStateList4 = e;
                    colorStateList2 = a3.mo4790e(C0639a.C0649j.TextAppearance_android_textColorLink);
                    colorStateList3 = colorStateList4;
                } else {
                    ColorStateList colorStateList5 = e;
                    colorStateList2 = null;
                    colorStateList3 = colorStateList5;
                }
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo4781a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C0968bn a4 = C0968bn.m5093a(context, attributeSet2, C0639a.C0649j.TextAppearance, i2, 0);
        if (z3 || !a4.mo4794g(C0639a.C0649j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a4.mo4782a(C0639a.C0649j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo4794g(C0639a.C0649j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo4790e(C0639a.C0649j.TextAppearance_android_textColor);
            }
            if (a4.mo4794g(C0639a.C0649j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.mo4790e(C0639a.C0649j.TextAppearance_android_textColorHint);
            }
            if (a4.mo4794g(C0639a.C0649j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.mo4790e(C0639a.C0649j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.mo4794g(C0639a.C0649j.TextAppearance_android_textSize) && a4.mo4789e(C0639a.C0649j.TextAppearance_android_textSize, -1) == 0) {
            this.f3765a.setTextSize(0, 0.0f);
        }
        m5395a(context, a4);
        a4.mo4781a();
        if (colorStateList3 != null) {
            this.f3765a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3765a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3765a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            mo5051a(z);
        }
        Typeface typeface = this.f3774j;
        if (typeface != null) {
            this.f3765a.setTypeface(typeface, this.f3773i);
        }
        this.f3772h.mo3877a(attributeSet2, i2);
        if (C0616b.f1920a && this.f3772h.mo3873a() != 0) {
            int[] e2 = this.f3772h.mo3882e();
            if (e2.length > 0) {
                if (((float) this.f3765a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f3765a.setAutoSizeTextTypeUniformWithConfiguration(this.f3772h.mo3880c(), this.f3772h.mo3881d(), this.f3772h.mo3879b(), 0);
                } else {
                    this.f3765a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
                }
            }
        }
        C0968bn a5 = C0968bn.m5092a(context, attributeSet2, C0639a.C0649j.AppCompatTextView);
        int e3 = a5.mo4789e(C0639a.C0649j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int e4 = a5.mo4789e(C0639a.C0649j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int e5 = a5.mo4789e(C0639a.C0649j.AppCompatTextView_lineHeight, -1);
        a5.mo4781a();
        if (e3 != -1) {
            C0630m.m2805b(this.f3765a, e3);
        }
        if (e4 != -1) {
            C0630m.m2807c(this.f3765a, e4);
        }
        if (e5 != -1) {
            C0630m.m2809d(this.f3765a, e5);
        }
    }

    /* renamed from: a */
    private void m5395a(Context context, C0968bn bnVar) {
        String d;
        this.f3773i = bnVar.mo4778a(C0639a.C0649j.TextAppearance_android_textStyle, this.f3773i);
        boolean z = true;
        if (bnVar.mo4794g(C0639a.C0649j.TextAppearance_android_fontFamily) || bnVar.mo4794g(C0639a.C0649j.TextAppearance_fontFamily)) {
            this.f3774j = null;
            int i = bnVar.mo4794g(C0639a.C0649j.TextAppearance_fontFamily) ? C0639a.C0649j.TextAppearance_fontFamily : C0639a.C0649j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f3765a);
                try {
                    this.f3774j = bnVar.mo4779a(i, this.f3773i, (C0402f.C0403a) new C0402f.C0403a() {
                        /* renamed from: a */
                        public void mo1462a(int i) {
                        }

                        /* renamed from: a */
                        public void mo1464a(Typeface typeface) {
                            C1034z.this.mo5050a((WeakReference<TextView>) weakReference, typeface);
                        }
                    });
                    if (this.f3774j != null) {
                        z = false;
                    }
                    this.f3775k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3774j == null && (d = bnVar.mo4788d(i)) != null) {
                this.f3774j = Typeface.create(d, this.f3773i);
            }
        } else if (bnVar.mo4794g(C0639a.C0649j.TextAppearance_android_typeface)) {
            this.f3775k = false;
            switch (bnVar.mo4778a(C0639a.C0649j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f3774j = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f3774j = Typeface.SERIF;
                    return;
                case 3:
                    this.f3774j = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5050a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f3775k) {
            this.f3774j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f3773i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5048a(Context context, int i) {
        ColorStateList e;
        C0968bn a = C0968bn.m5091a(context, i, C0639a.C0649j.TextAppearance);
        if (a.mo4794g(C0639a.C0649j.TextAppearance_textAllCaps)) {
            mo5051a(a.mo4782a(C0639a.C0649j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo4794g(C0639a.C0649j.TextAppearance_android_textColor) && (e = a.mo4790e(C0639a.C0649j.TextAppearance_android_textColor)) != null) {
            this.f3765a.setTextColor(e);
        }
        if (a.mo4794g(C0639a.C0649j.TextAppearance_android_textSize) && a.mo4789e(C0639a.C0649j.TextAppearance_android_textSize, -1) == 0) {
            this.f3765a.setTextSize(0, 0.0f);
        }
        m5395a(context, a);
        a.mo4781a();
        Typeface typeface = this.f3774j;
        if (typeface != null) {
            this.f3765a.setTypeface(typeface, this.f3773i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5051a(boolean z) {
        this.f3765a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5044a() {
        if (!(this.f3766b == null && this.f3767c == null && this.f3768d == null && this.f3769e == null)) {
            Drawable[] compoundDrawables = this.f3765a.getCompoundDrawables();
            m5396a(compoundDrawables[0], this.f3766b);
            m5396a(compoundDrawables[1], this.f3767c);
            m5396a(compoundDrawables[2], this.f3768d);
            m5396a(compoundDrawables[3], this.f3769e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f3770f != null || this.f3771g != null) {
            Drawable[] compoundDrawablesRelative = this.f3765a.getCompoundDrawablesRelative();
            m5396a(compoundDrawablesRelative[0], this.f3770f);
            m5396a(compoundDrawablesRelative[2], this.f3771g);
        }
    }

    /* renamed from: a */
    private void m5396a(Drawable drawable, C0966bl blVar) {
        if (drawable != null && blVar != null) {
            C1009l.m5332a(drawable, blVar, this.f3765a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0966bl m5394a(Context context, C1009l lVar, int i) {
        ColorStateList b = lVar.mo4943b(context, i);
        if (b == null) {
            return null;
        }
        C0966bl blVar = new C0966bl();
        blVar.f3552d = true;
        blVar.f3549a = b;
        return blVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5052a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0616b.f1920a) {
            mo5054b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5046a(int i, float f) {
        if (!C0616b.f1920a && !mo5055c()) {
            m5397b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5054b() {
        this.f3772h.mo3883f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5055c() {
        return this.f3772h.mo3884g();
    }

    /* renamed from: b */
    private void m5397b(int i, float f) {
        this.f3772h.mo3875a(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5045a(int i) {
        this.f3772h.mo3874a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5047a(int i, int i2, int i3, int i4) {
        this.f3772h.mo3876a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5053a(int[] iArr, int i) {
        this.f3772h.mo3878a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo5056d() {
        return this.f3772h.mo3873a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo5057e() {
        return this.f3772h.mo3879b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo5058f() {
        return this.f3772h.mo3880c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5059g() {
        return this.f3772h.mo3881d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo5060h() {
        return this.f3772h.mo3882e();
    }
}
