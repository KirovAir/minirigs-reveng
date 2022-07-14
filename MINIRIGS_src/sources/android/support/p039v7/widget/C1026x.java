package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.x */
class C1026x extends C1022t {

    /* renamed from: a */
    private final SeekBar f3737a;

    /* renamed from: b */
    private Drawable f3738b;

    /* renamed from: c */
    private ColorStateList f3739c = null;

    /* renamed from: d */
    private PorterDuff.Mode f3740d = null;

    /* renamed from: e */
    private boolean f3741e = false;

    /* renamed from: f */
    private boolean f3742f = false;

    C1026x(SeekBar seekBar) {
        super(seekBar);
        this.f3737a = seekBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4988a(AttributeSet attributeSet, int i) {
        super.mo4988a(attributeSet, i);
        C0968bn a = C0968bn.m5093a(this.f3737a.getContext(), attributeSet, C0639a.C0649j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo4784b(C0639a.C0649j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f3737a.setThumb(b);
        }
        mo4999a(a.mo4780a(C0639a.C0649j.AppCompatSeekBar_tickMark));
        if (a.mo4794g(C0639a.C0649j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3740d = C0867al.m4294a(a.mo4778a(C0639a.C0649j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3740d);
            this.f3742f = true;
        }
        if (a.mo4794g(C0639a.C0649j.AppCompatSeekBar_tickMarkTint)) {
            this.f3739c = a.mo4790e(C0639a.C0649j.AppCompatSeekBar_tickMarkTint);
            this.f3741e = true;
        }
        a.mo4781a();
        m5378d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4999a(Drawable drawable) {
        Drawable drawable2 = this.f3738b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3738b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3737a);
            C0540a.m2385b(drawable, C0594r.m2602f(this.f3737a));
            if (drawable.isStateful()) {
                drawable.setState(this.f3737a.getDrawableState());
            }
            m5378d();
        }
        this.f3737a.invalidate();
    }

    /* renamed from: d */
    private void m5378d() {
        if (this.f3738b == null) {
            return;
        }
        if (this.f3741e || this.f3742f) {
            this.f3738b = C0540a.m2390g(this.f3738b.mutate());
            if (this.f3741e) {
                C0540a.m2379a(this.f3738b, this.f3739c);
            }
            if (this.f3742f) {
                C0540a.m2382a(this.f3738b, this.f3740d);
            }
            if (this.f3738b.isStateful()) {
                this.f3738b.setState(this.f3737a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5000b() {
        Drawable drawable = this.f3738b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5001c() {
        Drawable drawable = this.f3738b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3737a.getDrawableState())) {
            this.f3737a.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4998a(Canvas canvas) {
        if (this.f3738b != null) {
            int max = this.f3737a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3738b.getIntrinsicWidth();
                int intrinsicHeight = this.f3738b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3738b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3737a.getWidth() - this.f3737a.getPaddingLeft()) - this.f3737a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3737a.getPaddingLeft(), (float) (this.f3737a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3738b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
