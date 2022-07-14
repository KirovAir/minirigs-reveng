package android.support.design.p016a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: android.support.design.a.f */
public class C0256f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f772a = new Matrix();

    public C0256f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f772a.set(imageView.getImageMatrix());
        return this.f772a;
    }
}
