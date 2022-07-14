package android.support.p026v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.q */
public class C0638q {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1977a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1978b = new ThreadLocal<>();

    /* renamed from: a */
    static void m2864a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f1977a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1977a.set(matrix);
        } else {
            matrix.reset();
        }
        m2865a((ViewParent) viewGroup, view, matrix);
        RectF rectF = f1978b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1978b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: b */
    public static void m2866b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2864a(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m2865a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2865a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
