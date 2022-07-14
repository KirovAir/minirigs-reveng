package android.support.p015d;

import android.graphics.Matrix;
import android.support.p015d.C0212j;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.d.ah */
class C0179ah {
    C0179ah() {
    }

    /* renamed from: a */
    public void mo592a(View view, float f) {
        Float f2 = (Float) view.getTag(C0212j.C0213a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public float mo591a(View view) {
        Float f = (Float) view.getTag(C0212j.C0213a.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: b */
    public void mo593b(View view) {
        if (view.getTag(C0212j.C0213a.save_non_transition_alpha) == null) {
            view.setTag(C0212j.C0213a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: c */
    public void mo594c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0212j.C0213a.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo595a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo595a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public void mo596b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo596b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo597a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
