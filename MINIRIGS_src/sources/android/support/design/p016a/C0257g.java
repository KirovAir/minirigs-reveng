package android.support.design.p016a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: android.support.design.a.g */
public class C0257g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f773a = new float[9];

    /* renamed from: b */
    private final float[] f774b = new float[9];

    /* renamed from: c */
    private final Matrix f775c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f773a);
        matrix2.getValues(this.f774b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f774b;
            float f2 = fArr[i];
            float[] fArr2 = this.f773a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f775c.setValues(this.f774b);
        return this.f775c;
    }
}
