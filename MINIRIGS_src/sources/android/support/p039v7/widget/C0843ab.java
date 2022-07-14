package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ab */
public class C0843ab extends FrameLayout {

    /* renamed from: d */
    private static final int[] f3022d = {16842801};

    /* renamed from: e */
    private static final C0850ag f3023e;

    /* renamed from: a */
    int f3024a;

    /* renamed from: b */
    int f3025b;

    /* renamed from: c */
    final Rect f3026c;

    /* renamed from: f */
    private boolean f3027f;

    /* renamed from: g */
    private boolean f3028g;

    /* renamed from: h */
    private final C0849af f3029h;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f3023e = new C0846ad();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f3023e = new C0844ac();
        } else {
            f3023e = new C0847ae();
        }
        f3023e.mo3907a();
    }

    public boolean getUseCompatPadding() {
        return this.f3027f;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3027f != z) {
            this.f3027f = z;
            f3023e.mo3919g(this.f3029h);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f3023e instanceof C0846ad)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f3023e.mo3912b(this.f3029h)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f3023e.mo3914c(this.f3029h)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.f3024a = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.f3025b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f3023e.mo3911a(this.f3029h, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f3023e.mo3911a(this.f3029h, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f3023e.mo3921i(this.f3029h);
    }

    public int getContentPaddingLeft() {
        return this.f3026c.left;
    }

    public int getContentPaddingRight() {
        return this.f3026c.right;
    }

    public int getContentPaddingTop() {
        return this.f3026c.top;
    }

    public int getContentPaddingBottom() {
        return this.f3026c.bottom;
    }

    public void setRadius(float f) {
        f3023e.mo3910a(this.f3029h, f);
    }

    public float getRadius() {
        return f3023e.mo3916d(this.f3029h);
    }

    public void setCardElevation(float f) {
        f3023e.mo3915c(this.f3029h, f);
    }

    public float getCardElevation() {
        return f3023e.mo3917e(this.f3029h);
    }

    public void setMaxCardElevation(float f) {
        f3023e.mo3913b(this.f3029h, f);
    }

    public float getMaxCardElevation() {
        return f3023e.mo3909a(this.f3029h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3028g;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3028g) {
            this.f3028g = z;
            f3023e.mo3920h(this.f3029h);
        }
    }
}
