package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.bc */
class C0951bc extends Drawable {

    /* renamed from: a */
    static C0952a f3468a;

    /* renamed from: b */
    private static final double f3469b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f3470c;

    /* renamed from: d */
    private Paint f3471d;

    /* renamed from: e */
    private Paint f3472e;

    /* renamed from: f */
    private Paint f3473f;

    /* renamed from: g */
    private final RectF f3474g;

    /* renamed from: h */
    private float f3475h;

    /* renamed from: i */
    private Path f3476i;

    /* renamed from: j */
    private float f3477j;

    /* renamed from: k */
    private float f3478k;

    /* renamed from: l */
    private float f3479l;

    /* renamed from: m */
    private ColorStateList f3480m;

    /* renamed from: n */
    private boolean f3481n;

    /* renamed from: o */
    private final int f3482o;

    /* renamed from: p */
    private final int f3483p;

    /* renamed from: q */
    private boolean f3484q;

    /* renamed from: r */
    private boolean f3485r;

    /* renamed from: android.support.v7.widget.bc$a */
    interface C0952a {
        /* renamed from: a */
        void mo3908a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: b */
    private void m4997b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3480m = colorStateList;
        this.f3471d.setColor(this.f3480m.getColorForState(getState(), this.f3480m.getDefaultColor()));
    }

    /* renamed from: d */
    private int m4999d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4701a(boolean z) {
        this.f3484q = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f3471d.setAlpha(i);
        this.f3472e.setAlpha(i);
        this.f3473f.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3481n = true;
    }

    /* renamed from: a */
    private void m4994a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float d = (float) m4999d(f);
            float d2 = (float) m4999d(f2);
            if (d > d2) {
                if (!this.f3485r) {
                    this.f3485r = true;
                }
                d = d2;
            }
            if (this.f3479l != d || this.f3477j != d2) {
                this.f3479l = d;
                this.f3477j = d2;
                this.f3478k = (float) ((int) ((d * 1.5f) + ((float) this.f3470c) + 0.5f));
                this.f3481n = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m4993a(this.f3477j, this.f3475h, this.f3484q));
        int ceil2 = (int) Math.ceil((double) m4996b(this.f3477j, this.f3475h, this.f3484q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    static float m4993a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f3469b) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    static float m4996b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f3469b) * ((double) f2))) : f;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3480m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f3471d.getColor() == colorForState) {
            return false;
        }
        this.f3471d.setColor(colorForState);
        this.f3481n = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f3480m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3471d.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4698a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f3475h != f2) {
                this.f3475h = f2;
                this.f3481n = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    public void draw(Canvas canvas) {
        if (this.f3481n) {
            m4998b(getBounds());
            this.f3481n = false;
        }
        canvas.translate(0.0f, this.f3479l / 2.0f);
        m4995a(canvas);
        canvas.translate(0.0f, (-this.f3479l) / 2.0f);
        f3468a.mo3908a(canvas, this.f3474g, this.f3475h, this.f3471d);
    }

    /* renamed from: a */
    private void m4995a(Canvas canvas) {
        float f = this.f3475h;
        float f2 = (-f) - this.f3478k;
        float f3 = f + ((float) this.f3470c) + (this.f3479l / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f3474g.width() - f4 > 0.0f;
        boolean z2 = this.f3474g.height() - f4 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f3474g.left + f3, this.f3474g.top + f3);
        canvas.drawPath(this.f3476i, this.f3472e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3474g.width() - f4, -this.f3475h, this.f3473f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f3474g.right - f3, this.f3474g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3476i, this.f3472e);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f3474g.width() - f4, (-this.f3475h) + this.f3478k, this.f3473f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f3474g.left + f3, this.f3474g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3476i, this.f3472e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3474g.height() - f4, -this.f3475h, this.f3473f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f3474g.right - f3, this.f3474g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3476i, this.f3472e);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f3474g.height() - f4, -this.f3475h, this.f3473f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: g */
    private void m5000g() {
        float f = this.f3475h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f3478k;
        rectF2.inset(-f2, -f2);
        Path path = this.f3476i;
        if (path == null) {
            this.f3476i = new Path();
        } else {
            path.reset();
        }
        this.f3476i.setFillType(Path.FillType.EVEN_ODD);
        this.f3476i.moveTo(-this.f3475h, 0.0f);
        this.f3476i.rLineTo(-this.f3478k, 0.0f);
        this.f3476i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3476i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3476i.close();
        float f3 = this.f3475h;
        float f4 = this.f3478k;
        Paint paint = this.f3472e;
        float f5 = f3 + f4;
        int i = this.f3482o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f3483p}, new float[]{0.0f, f3 / (f3 + f4), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f3473f;
        float f6 = this.f3475h;
        float f7 = this.f3478k;
        int i2 = this.f3482o;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f3483p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f3473f.setAntiAlias(false);
    }

    /* renamed from: b */
    private void m4998b(Rect rect) {
        float f = this.f3477j * 1.5f;
        this.f3474g.set(((float) rect.left) + this.f3477j, ((float) rect.top) + f, ((float) rect.right) - this.f3477j, ((float) rect.bottom) - f);
        m5000g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo4697a() {
        return this.f3475h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4700a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4703b(float f) {
        m4994a(f, this.f3477j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4705c(float f) {
        m4994a(this.f3479l, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo4702b() {
        return this.f3479l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo4704c() {
        return this.f3477j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo4706d() {
        float f = this.f3477j;
        return (Math.max(f, this.f3475h + ((float) this.f3470c) + (f / 2.0f)) * 2.0f) + ((this.f3477j + ((float) this.f3470c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo4708e() {
        float f = this.f3477j;
        return (Math.max(f, this.f3475h + ((float) this.f3470c) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f3477j * 1.5f) + ((float) this.f3470c)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4699a(ColorStateList colorStateList) {
        m4997b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo4709f() {
        return this.f3480m;
    }
}
