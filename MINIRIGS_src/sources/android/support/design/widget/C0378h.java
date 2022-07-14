package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.p039v7.p043c.p044a.C0719c;

/* renamed from: android.support.design.widget.h */
public class C0378h extends C0719c {

    /* renamed from: a */
    static final double f1249a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    final Paint f1250b;

    /* renamed from: c */
    final Paint f1251c;

    /* renamed from: d */
    final RectF f1252d;

    /* renamed from: e */
    float f1253e;

    /* renamed from: f */
    Path f1254f;

    /* renamed from: g */
    float f1255g;

    /* renamed from: h */
    float f1256h;

    /* renamed from: i */
    float f1257i;

    /* renamed from: j */
    float f1258j;

    /* renamed from: k */
    private boolean f1259k;

    /* renamed from: l */
    private final int f1260l;

    /* renamed from: m */
    private final int f1261m;

    /* renamed from: n */
    private final int f1262n;

    /* renamed from: o */
    private boolean f1263o;

    /* renamed from: p */
    private float f1264p;

    /* renamed from: q */
    private boolean f1265q;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: c */
    private static int m1576c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f1250b.setAlpha(i);
        this.f1251c.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1259k = true;
    }

    /* renamed from: a */
    public void mo1417a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = (float) m1576c(f);
        float c2 = (float) m1576c(f2);
        if (c > c2) {
            if (!this.f1265q) {
                this.f1265q = true;
            }
            c = c2;
        }
        if (this.f1258j != c || this.f1256h != c2) {
            this.f1258j = c;
            this.f1256h = c2;
            this.f1257i = (float) Math.round(c * 1.5f);
            this.f1255g = c2;
            this.f1259k = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo1416a(float f) {
        mo1417a(f, this.f1256h);
    }

    /* renamed from: a */
    public float mo1415a() {
        return this.f1258j;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1572a(this.f1256h, this.f1253e, this.f1263o));
        int ceil2 = (int) Math.ceil((double) m1575b(this.f1256h, this.f1253e, this.f1263o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    public static float m1572a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f1249a) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    public static float m1575b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1249a) * ((double) f2))) : f;
    }

    public void draw(Canvas canvas) {
        if (this.f1259k) {
            m1574a(getBounds());
            this.f1259k = false;
        }
        m1573a(canvas);
        super.draw(canvas);
    }

    /* renamed from: b */
    public final void mo1418b(float f) {
        if (this.f1264p != f) {
            this.f1264p = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m1573a(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f1264p, this.f1252d.centerX(), this.f1252d.centerY());
        float f5 = this.f1253e;
        float f6 = (-f5) - this.f1257i;
        float f7 = f5 * 2.0f;
        boolean z = this.f1252d.width() - f7 > 0.0f;
        boolean z2 = this.f1252d.height() - f7 > 0.0f;
        float f8 = this.f1258j;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas2.translate(this.f1252d.left + f5, this.f1252d.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f1254f, this.f1250b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f1252d.width() - f7, -this.f1253e, this.f1251c);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.f1252d.right - f5, this.f1252d.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f1254f, this.f1250b);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f1252d.width() - f7, (-this.f1253e) + this.f1257i, this.f1251c);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f1252d.left + f5, this.f1252d.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f1254f, this.f1250b);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f1252d.height() - f7, -this.f1253e, this.f1251c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.f1252d.right - f5, this.f1252d.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f1254f, this.f1250b);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f1252d.height() - f7, -this.f1253e, this.f1251c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: c */
    private void m1577c() {
        float f = this.f1253e;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1257i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1254f;
        if (path == null) {
            this.f1254f = new Path();
        } else {
            path.reset();
        }
        this.f1254f.setFillType(Path.FillType.EVEN_ODD);
        this.f1254f.moveTo(-this.f1253e, 0.0f);
        this.f1254f.rLineTo(-this.f1257i, 0.0f);
        this.f1254f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1254f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1254f.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f1253e / f3;
            Paint paint = this.f1250b;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f1260l, this.f1261m, this.f1262n}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        this.f1251c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f1260l, this.f1261m, this.f1262n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1251c.setAntiAlias(false);
    }

    /* renamed from: a */
    private void m1574a(Rect rect) {
        float f = this.f1256h * 1.5f;
        this.f1252d.set(((float) rect.left) + this.f1256h, ((float) rect.top) + f, ((float) rect.right) - this.f1256h, ((float) rect.bottom) - f);
        mo2803b().setBounds((int) this.f1252d.left, (int) this.f1252d.top, (int) this.f1252d.right, (int) this.f1252d.bottom);
        m1577c();
    }
}
