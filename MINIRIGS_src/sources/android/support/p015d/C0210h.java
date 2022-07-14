package android.support.p015d;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.d.h */
class C0210h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f674a;

    /* renamed from: b */
    private final PathMeasure f675b;

    /* renamed from: c */
    private final float f676c;

    /* renamed from: d */
    private final float[] f677d = new float[2];

    /* renamed from: e */
    private final PointF f678e = new PointF();

    /* renamed from: f */
    private float f679f;

    C0210h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f674a = property;
        this.f675b = new PathMeasure(path, false);
        this.f676c = this.f675b.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f679f);
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f679f = f.floatValue();
        this.f675b.getPosTan(this.f676c * f.floatValue(), this.f677d, (float[]) null);
        PointF pointF = this.f678e;
        float[] fArr = this.f677d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f674a.set(t, pointF);
    }
}
