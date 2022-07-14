package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p026v4.widget.C0625h;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.p */
public class C1018p {

    /* renamed from: a */
    private final ImageView f3719a;

    /* renamed from: b */
    private C0966bl f3720b;

    /* renamed from: c */
    private C0966bl f3721c;

    /* renamed from: d */
    private C0966bl f3722d;

    public C1018p(ImageView imageView) {
        this.f3719a = imageView;
    }

    /* renamed from: a */
    public void mo4965a(AttributeSet attributeSet, int i) {
        int g;
        C0968bn a = C0968bn.m5093a(this.f3719a.getContext(), attributeSet, C0639a.C0649j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3719a.getDrawable();
            if (!(drawable != null || (g = a.mo4793g(C0639a.C0649j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0705a.m3168b(this.f3719a.getContext(), g)) == null)) {
                this.f3719a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0867al.m4295a(drawable);
            }
            if (a.mo4794g(C0639a.C0649j.AppCompatImageView_tint)) {
                C0625h.m2785a(this.f3719a, a.mo4790e(C0639a.C0649j.AppCompatImageView_tint));
            }
            if (a.mo4794g(C0639a.C0649j.AppCompatImageView_tintMode)) {
                C0625h.m2786a(this.f3719a, C0867al.m4294a(a.mo4778a(C0639a.C0649j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4781a();
        }
    }

    /* renamed from: a */
    public void mo4962a(int i) {
        if (i != 0) {
            Drawable b = C0705a.m3168b(this.f3719a.getContext(), i);
            if (b != null) {
                C0867al.m4295a(b);
            }
            this.f3719a.setImageDrawable(b);
        } else {
            this.f3719a.setImageDrawable((Drawable) null);
        }
        mo4969d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4966a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3719a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4963a(ColorStateList colorStateList) {
        if (this.f3721c == null) {
            this.f3721c = new C0966bl();
        }
        C0966bl blVar = this.f3721c;
        blVar.f3549a = colorStateList;
        blVar.f3552d = true;
        mo4969d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo4967b() {
        C0966bl blVar = this.f3721c;
        if (blVar != null) {
            return blVar.f3549a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4964a(PorterDuff.Mode mode) {
        if (this.f3721c == null) {
            this.f3721c = new C0966bl();
        }
        C0966bl blVar = this.f3721c;
        blVar.f3550b = mode;
        blVar.f3551c = true;
        mo4969d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo4968c() {
        C0966bl blVar = this.f3721c;
        if (blVar != null) {
            return blVar.f3550b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4969d() {
        Drawable drawable = this.f3719a.getDrawable();
        if (drawable != null) {
            C0867al.m4295a(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m5362e() || !m5361a(drawable)) {
            C0966bl blVar = this.f3721c;
            if (blVar != null) {
                C1009l.m5332a(drawable, blVar, this.f3719a.getDrawableState());
                return;
            }
            C0966bl blVar2 = this.f3720b;
            if (blVar2 != null) {
                C1009l.m5332a(drawable, blVar2, this.f3719a.getDrawableState());
            }
        }
    }

    /* renamed from: e */
    private boolean m5362e() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3720b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5361a(Drawable drawable) {
        if (this.f3722d == null) {
            this.f3722d = new C0966bl();
        }
        C0966bl blVar = this.f3722d;
        blVar.mo4776a();
        ColorStateList a = C0625h.m2784a(this.f3719a);
        if (a != null) {
            blVar.f3552d = true;
            blVar.f3549a = a;
        }
        PorterDuff.Mode b = C0625h.m2787b(this.f3719a);
        if (b != null) {
            blVar.f3551c = true;
            blVar.f3550b = b;
        }
        if (!blVar.f3552d && !blVar.f3551c) {
            return false;
        }
        C1009l.m5332a(drawable, blVar, this.f3719a.getDrawableState());
        return true;
    }
}
