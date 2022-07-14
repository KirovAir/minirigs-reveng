package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.bb */
class C0950bb extends Drawable {

    /* renamed from: a */
    private float f3457a;

    /* renamed from: b */
    private final Paint f3458b;

    /* renamed from: c */
    private final RectF f3459c;

    /* renamed from: d */
    private final Rect f3460d;

    /* renamed from: e */
    private float f3461e;

    /* renamed from: f */
    private boolean f3462f;

    /* renamed from: g */
    private boolean f3463g;

    /* renamed from: h */
    private ColorStateList f3464h;

    /* renamed from: i */
    private PorterDuffColorFilter f3465i;

    /* renamed from: j */
    private ColorStateList f3466j;

    /* renamed from: k */
    private PorterDuff.Mode f3467k;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: b */
    private void m4986b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3464h = colorStateList;
        this.f3458b.setColor(this.f3464h.getColorForState(getState(), this.f3464h.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4683a(float f, boolean z, boolean z2) {
        if (f != this.f3461e || this.f3462f != z || this.f3463g != z2) {
            this.f3461e = f;
            this.f3462f = z;
            this.f3463g = z2;
            m4985a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo4681a() {
        return this.f3461e;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f3458b;
        if (this.f3465i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3465i);
            z = true;
        }
        RectF rectF = this.f3459c;
        float f = this.f3457a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: a */
    private void m4985a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3459c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f3460d.set(rect);
        if (this.f3462f) {
            float a = C0951bc.m4993a(this.f3461e, this.f3457a, this.f3463g);
            this.f3460d.inset((int) Math.ceil((double) C0951bc.m4996b(this.f3461e, this.f3457a, this.f3463g)), (int) Math.ceil((double) a));
            this.f3459c.set(this.f3460d);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4985a(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3460d, this.f3457a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4682a(float f) {
        if (f != this.f3457a) {
            this.f3457a = f;
            m4985a((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f3458b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3458b.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public float mo4685b() {
        return this.f3457a;
    }

    /* renamed from: a */
    public void mo4684a(ColorStateList colorStateList) {
        m4986b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public ColorStateList mo4686c() {
        return this.f3464h;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3466j = colorStateList;
        this.f3465i = m4984a(this.f3466j, this.f3467k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3467k = mode;
        this.f3465i = m4984a(this.f3466j, this.f3467k);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3464h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f3458b.getColor();
        if (z) {
            this.f3458b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3466j;
        if (colorStateList2 == null || (mode = this.f3467k) == null) {
            return z;
        }
        this.f3465i = m4984a(colorStateList2, mode);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f3464h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3466j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f3464h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0950bb.isStateful():boolean");
    }

    /* renamed from: a */
    private PorterDuffColorFilter m4984a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
