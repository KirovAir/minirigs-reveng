package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.g */
class C1004g {

    /* renamed from: a */
    private final View f3683a;

    /* renamed from: b */
    private final C1009l f3684b;

    /* renamed from: c */
    private int f3685c = -1;

    /* renamed from: d */
    private C0966bl f3686d;

    /* renamed from: e */
    private C0966bl f3687e;

    /* renamed from: f */
    private C0966bl f3688f;

    C1004g(View view) {
        this.f3683a = view;
        this.f3684b = C1009l.m5329a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4901a(AttributeSet attributeSet, int i) {
        C0968bn a = C0968bn.m5093a(this.f3683a.getContext(), attributeSet, C0639a.C0649j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo4794g(C0639a.C0649j.ViewBackgroundHelper_android_background)) {
                this.f3685c = a.mo4793g(C0639a.C0649j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3684b.mo4943b(this.f3683a.getContext(), this.f3685c);
                if (b != null) {
                    mo4903b(b);
                }
            }
            if (a.mo4794g(C0639a.C0649j.ViewBackgroundHelper_backgroundTint)) {
                C0594r.m2581a(this.f3683a, a.mo4790e(C0639a.C0649j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo4794g(C0639a.C0649j.ViewBackgroundHelper_backgroundTintMode)) {
                C0594r.m2582a(this.f3683a, C0867al.m4294a(a.mo4778a(C0639a.C0649j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4781a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4897a(int i) {
        this.f3685c = i;
        C1009l lVar = this.f3684b;
        mo4903b(lVar != null ? lVar.mo4943b(this.f3683a.getContext(), i) : null);
        mo4904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4900a(Drawable drawable) {
        this.f3685c = -1;
        mo4903b((ColorStateList) null);
        mo4904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4898a(ColorStateList colorStateList) {
        if (this.f3687e == null) {
            this.f3687e = new C0966bl();
        }
        C0966bl blVar = this.f3687e;
        blVar.f3549a = colorStateList;
        blVar.f3552d = true;
        mo4904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo4896a() {
        C0966bl blVar = this.f3687e;
        if (blVar != null) {
            return blVar.f3549a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4899a(PorterDuff.Mode mode) {
        if (this.f3687e == null) {
            this.f3687e = new C0966bl();
        }
        C0966bl blVar = this.f3687e;
        blVar.f3550b = mode;
        blVar.f3551c = true;
        mo4904c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo4902b() {
        C0966bl blVar = this.f3687e;
        if (blVar != null) {
            return blVar.f3550b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4904c() {
        Drawable background = this.f3683a.getBackground();
        if (background == null) {
            return;
        }
        if (!m5305d() || !m5304b(background)) {
            C0966bl blVar = this.f3687e;
            if (blVar != null) {
                C1009l.m5332a(background, blVar, this.f3683a.getDrawableState());
                return;
            }
            C0966bl blVar2 = this.f3686d;
            if (blVar2 != null) {
                C1009l.m5332a(background, blVar2, this.f3683a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4903b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3686d == null) {
                this.f3686d = new C0966bl();
            }
            C0966bl blVar = this.f3686d;
            blVar.f3549a = colorStateList;
            blVar.f3552d = true;
        } else {
            this.f3686d = null;
        }
        mo4904c();
    }

    /* renamed from: d */
    private boolean m5305d() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3686d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m5304b(Drawable drawable) {
        if (this.f3688f == null) {
            this.f3688f = new C0966bl();
        }
        C0966bl blVar = this.f3688f;
        blVar.mo4776a();
        ColorStateList s = C0594r.m2618s(this.f3683a);
        if (s != null) {
            blVar.f3552d = true;
            blVar.f3549a = s;
        }
        PorterDuff.Mode t = C0594r.m2619t(this.f3683a);
        if (t != null) {
            blVar.f3551c = true;
            blVar.f3550b = t;
        }
        if (!blVar.f3552d && !blVar.f3551c) {
            return false;
        }
        C1009l.m5332a(drawable, blVar, this.f3683a.getDrawableState());
        return true;
    }
}
