package android.support.design.p023g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0541b;

/* renamed from: android.support.design.g.c */
public class C0291c extends Drawable implements C0541b {

    /* renamed from: a */
    private final Paint f879a;

    /* renamed from: b */
    private final Matrix[] f880b;

    /* renamed from: c */
    private final Matrix[] f881c;

    /* renamed from: d */
    private final C0292d[] f882d;

    /* renamed from: e */
    private final Matrix f883e;

    /* renamed from: f */
    private final Path f884f;

    /* renamed from: g */
    private final PointF f885g;

    /* renamed from: h */
    private final C0292d f886h;

    /* renamed from: i */
    private final Region f887i;

    /* renamed from: j */
    private final Region f888j;

    /* renamed from: k */
    private final float[] f889k;

    /* renamed from: l */
    private final float[] f890l;

    /* renamed from: m */
    private C0296e f891m;

    /* renamed from: n */
    private boolean f892n;

    /* renamed from: o */
    private boolean f893o;

    /* renamed from: p */
    private float f894p;

    /* renamed from: q */
    private int f895q;

    /* renamed from: r */
    private int f896r;

    /* renamed from: s */
    private int f897s;

    /* renamed from: t */
    private int f898t;

    /* renamed from: u */
    private float f899u;

    /* renamed from: v */
    private float f900v;

    /* renamed from: w */
    private Paint.Style f901w;

    /* renamed from: x */
    private PorterDuffColorFilter f902x;

    /* renamed from: y */
    private PorterDuff.Mode f903y;

    /* renamed from: z */
    private ColorStateList f904z;

    /* renamed from: a */
    private static int m1041a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public ColorStateList mo934a() {
        return this.f904z;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f904z = colorStateList;
        m1047b();
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f903y = mode;
        m1047b();
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setAlpha(int i) {
        this.f898t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f879a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f887i.set(bounds);
        m1049b(bounds.width(), bounds.height(), this.f884f);
        this.f888j.setPath(this.f884f, this.f887i);
        this.f887i.op(this.f888j, Region.Op.DIFFERENCE);
        return this.f887i;
    }

    /* renamed from: a */
    public void mo935a(float f) {
        this.f894p = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f879a.setColorFilter(this.f902x);
        int alpha = this.f879a.getAlpha();
        this.f879a.setAlpha(m1041a(alpha, this.f898t));
        this.f879a.setStrokeWidth(this.f900v);
        this.f879a.setStyle(this.f901w);
        int i = this.f896r;
        if (i > 0 && this.f892n) {
            this.f879a.setShadowLayer((float) this.f897s, 0.0f, (float) i, this.f895q);
        }
        if (this.f891m != null) {
            m1049b(canvas.getWidth(), canvas.getHeight(), this.f884f);
            canvas.drawPath(this.f884f, this.f879a);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f879a);
        }
        this.f879a.setAlpha(alpha);
    }

    /* renamed from: a */
    public void mo936a(int i, int i2, Path path) {
        path.rewind();
        if (this.f891m != null) {
            for (int i3 = 0; i3 < 4; i3++) {
                m1043a(i3, i, i2);
                m1048b(i3, i, i2);
            }
            for (int i4 = 0; i4 < 4; i4++) {
                m1045a(i4, path);
                m1050b(i4, path);
            }
            path.close();
        }
    }

    /* renamed from: a */
    private void m1043a(int i, int i2, int i3) {
        m1044a(i, i2, i3, this.f885g);
        m1042a(i).mo933a(m1051c(i, i2, i3), this.f894p, this.f882d[i]);
        this.f880b[i].reset();
        this.f880b[i].setTranslate(this.f885g.x, this.f885g.y);
        this.f880b[i].preRotate((float) Math.toDegrees((double) (m1052d(((i - 1) + 4) % 4, i2, i3) + 1.5707964f)));
    }

    /* renamed from: b */
    private void m1048b(int i, int i2, int i3) {
        this.f889k[0] = this.f882d[i].f907c;
        this.f889k[1] = this.f882d[i].f908d;
        this.f880b[i].mapPoints(this.f889k);
        float d = m1052d(i, i2, i3);
        this.f881c[i].reset();
        Matrix matrix = this.f881c[i];
        float[] fArr = this.f889k;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f881c[i].preRotate((float) Math.toDegrees((double) d));
    }

    /* renamed from: a */
    private void m1045a(int i, Path path) {
        this.f889k[0] = this.f882d[i].f905a;
        this.f889k[1] = this.f882d[i].f906b;
        this.f880b[i].mapPoints(this.f889k);
        if (i == 0) {
            float[] fArr = this.f889k;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            float[] fArr2 = this.f889k;
            path.lineTo(fArr2[0], fArr2[1]);
        }
        this.f882d[i].mo944a(this.f880b[i], path);
    }

    /* renamed from: b */
    private void m1050b(int i, Path path) {
        int i2 = (i + 1) % 4;
        this.f889k[0] = this.f882d[i].f907c;
        this.f889k[1] = this.f882d[i].f908d;
        this.f880b[i].mapPoints(this.f889k);
        this.f890l[0] = this.f882d[i2].f905a;
        this.f890l[1] = this.f882d[i2].f906b;
        this.f880b[i2].mapPoints(this.f890l);
        float[] fArr = this.f889k;
        float f = fArr[0];
        float[] fArr2 = this.f890l;
        this.f886h.mo942a(0.0f, 0.0f);
        m1046b(i).mo878a((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1])), this.f894p, this.f886h);
        this.f886h.mo944a(this.f881c[i], path);
    }

    /* renamed from: a */
    private C0289a m1042a(int i) {
        switch (i) {
            case 1:
                return this.f891m.mo948b();
            case 2:
                return this.f891m.mo949c();
            case 3:
                return this.f891m.mo950d();
            default:
                return this.f891m.mo947a();
        }
    }

    /* renamed from: b */
    private C0290b m1046b(int i) {
        switch (i) {
            case 1:
                return this.f891m.mo952f();
            case 2:
                return this.f891m.mo953g();
            case 3:
                return this.f891m.mo954h();
            default:
                return this.f891m.mo951e();
        }
    }

    /* renamed from: a */
    private void m1044a(int i, int i2, int i3, PointF pointF) {
        switch (i) {
            case 1:
                pointF.set((float) i2, 0.0f);
                return;
            case 2:
                pointF.set((float) i2, (float) i3);
                return;
            case 3:
                pointF.set(0.0f, (float) i3);
                return;
            default:
                pointF.set(0.0f, 0.0f);
                return;
        }
    }

    /* renamed from: c */
    private float m1051c(int i, int i2, int i3) {
        m1044a(((i - 1) + 4) % 4, i2, i3, this.f885g);
        float f = this.f885g.x;
        float f2 = this.f885g.y;
        m1044a((i + 1) % 4, i2, i3, this.f885g);
        float f3 = this.f885g.x;
        float f4 = this.f885g.y;
        m1044a(i, i2, i3, this.f885g);
        float f5 = this.f885g.x;
        float f6 = this.f885g.y;
        float atan2 = ((float) Math.atan2((double) (f2 - f6), (double) (f - f5))) - ((float) Math.atan2((double) (f4 - f6), (double) (f3 - f5)));
        return atan2 < 0.0f ? (float) (((double) atan2) + 6.283185307179586d) : atan2;
    }

    /* renamed from: d */
    private float m1052d(int i, int i2, int i3) {
        m1044a(i, i2, i3, this.f885g);
        float f = this.f885g.x;
        float f2 = this.f885g.y;
        m1044a((i + 1) % 4, i2, i3, this.f885g);
        return (float) Math.atan2((double) (this.f885g.y - f2), (double) (this.f885g.x - f));
    }

    /* renamed from: b */
    private void m1049b(int i, int i2, Path path) {
        mo936a(i, i2, path);
        if (this.f899u != 1.0f) {
            this.f883e.reset();
            Matrix matrix = this.f883e;
            float f = this.f899u;
            matrix.setScale(f, f, (float) (i / 2), (float) (i2 / 2));
            path.transform(this.f883e);
        }
    }

    /* renamed from: b */
    private void m1047b() {
        ColorStateList colorStateList = this.f904z;
        if (colorStateList == null || this.f903y == null) {
            this.f902x = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.f902x = new PorterDuffColorFilter(colorForState, this.f903y);
        if (this.f893o) {
            this.f895q = colorForState;
        }
    }
}
