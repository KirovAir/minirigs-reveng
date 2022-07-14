package android.support.p015d;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: android.support.d.k */
class C0214k implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f680a;

    C0214k() {
    }

    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        Rect rect3 = this.f680a;
        if (rect3 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.f680a;
    }
}
