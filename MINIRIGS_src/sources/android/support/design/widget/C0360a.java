package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.C0534a;

/* renamed from: android.support.design.widget.a */
public class C0360a extends Drawable {

    /* renamed from: a */
    final Paint f1168a;

    /* renamed from: b */
    final Rect f1169b;

    /* renamed from: c */
    final RectF f1170c;

    /* renamed from: d */
    final C0361a f1171d;

    /* renamed from: e */
    float f1172e;

    /* renamed from: f */
    private int f1173f;

    /* renamed from: g */
    private int f1174g;

    /* renamed from: h */
    private int f1175h;

    /* renamed from: i */
    private int f1176i;

    /* renamed from: j */
    private ColorStateList f1177j;

    /* renamed from: k */
    private int f1178k;

    /* renamed from: l */
    private boolean f1179l;

    /* renamed from: m */
    private float f1180m;

    public Drawable.ConstantState getConstantState() {
        return this.f1171d;
    }

    public void draw(Canvas canvas) {
        if (this.f1179l) {
            this.f1168a.setShader(m1479a());
            this.f1179l = false;
        }
        float strokeWidth = this.f1168a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f1170c;
        copyBounds(this.f1169b);
        rectF.set(this.f1169b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f1180m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f1168a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f1172e);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.f1168a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo1350a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1178k = colorStateList.getColorForState(getState(), this.f1178k);
        }
        this.f1177j = colorStateList;
        this.f1179l = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1168a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f1172e > 0.0f ? -3 : -2;
    }

    /* renamed from: a */
    public final void mo1349a(float f) {
        if (f != this.f1180m) {
            this.f1180m = f;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1179l = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1177j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f1177j;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f1178k)) == this.f1178k)) {
            this.f1179l = true;
            this.f1178k = colorForState;
        }
        if (this.f1179l) {
            invalidateSelf();
        }
        return this.f1179l;
    }

    /* renamed from: a */
    private Shader m1479a() {
        Rect rect = this.f1169b;
        copyBounds(rect);
        float height = this.f1172e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0534a.m2342a(this.f1173f, this.f1178k), C0534a.m2342a(this.f1174g, this.f1178k), C0534a.m2342a(C0534a.m2344b(this.f1174g, 0), this.f1178k), C0534a.m2342a(C0534a.m2344b(this.f1176i, 0), this.f1178k), C0534a.m2342a(this.f1176i, this.f1178k), C0534a.m2342a(this.f1175h, this.f1178k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: android.support.design.widget.a$a */
    private class C0361a extends Drawable.ConstantState {

        /* renamed from: a */
        final /* synthetic */ C0360a f1181a;

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return this.f1181a;
        }
    }
}
