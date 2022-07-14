package android.support.design.p023g;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: android.support.design.g.d */
public class C0292d {

    /* renamed from: a */
    public float f905a;

    /* renamed from: b */
    public float f906b;

    /* renamed from: c */
    public float f907c;

    /* renamed from: d */
    public float f908d;

    /* renamed from: e */
    private final List<C0295c> f909e;

    /* renamed from: android.support.design.g.d$c */
    public static abstract class C0295c {

        /* renamed from: g */
        protected final Matrix f919g = new Matrix();

        /* renamed from: a */
        public abstract void mo946a(Matrix matrix, Path path);
    }

    /* renamed from: a */
    public void mo942a(float f, float f2) {
        this.f905a = f;
        this.f906b = f2;
        this.f907c = f;
        this.f908d = f2;
        this.f909e.clear();
    }

    /* renamed from: b */
    public void mo945b(float f, float f2) {
        C0294b bVar = new C0294b();
        float unused = bVar.f917a = f;
        float unused2 = bVar.f918b = f2;
        this.f909e.add(bVar);
        this.f907c = f;
        this.f908d = f2;
    }

    /* renamed from: a */
    public void mo943a(float f, float f2, float f3, float f4, float f5, float f6) {
        C0293a aVar = new C0293a(f, f2, f3, f4);
        aVar.f915e = f5;
        aVar.f916f = f6;
        this.f909e.add(aVar);
        double d = (double) (f5 + f6);
        this.f907c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f908d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    /* renamed from: a */
    public void mo944a(Matrix matrix, Path path) {
        int size = this.f909e.size();
        for (int i = 0; i < size; i++) {
            this.f909e.get(i).mo946a(matrix, path);
        }
    }

    /* renamed from: android.support.design.g.d$b */
    public static class C0294b extends C0295c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f917a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f918b;

        /* renamed from: a */
        public void mo946a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f919g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f917a, this.f918b);
            path.transform(matrix);
        }
    }

    /* renamed from: android.support.design.g.d$a */
    public static class C0293a extends C0295c {

        /* renamed from: h */
        private static final RectF f910h = new RectF();

        /* renamed from: a */
        public float f911a;

        /* renamed from: b */
        public float f912b;

        /* renamed from: c */
        public float f913c;

        /* renamed from: d */
        public float f914d;

        /* renamed from: e */
        public float f915e;

        /* renamed from: f */
        public float f916f;

        public C0293a(float f, float f2, float f3, float f4) {
            this.f911a = f;
            this.f912b = f2;
            this.f913c = f3;
            this.f914d = f4;
        }

        /* renamed from: a */
        public void mo946a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f919g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f910h.set(this.f911a, this.f912b, this.f913c, this.f914d);
            path.arcTo(f910h, this.f915e, this.f916f, false);
            path.transform(matrix);
        }
    }
}
