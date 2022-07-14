package android.support.p026v4.p036h.p038b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.h.b.d */
abstract class C0575d implements Interpolator {

    /* renamed from: a */
    private final float[] f1814a;

    /* renamed from: b */
    private final float f1815b = (1.0f / ((float) (this.f1814a.length - 1)));

    protected C0575d(float[] fArr) {
        this.f1814a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1814a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f1815b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f1814a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
