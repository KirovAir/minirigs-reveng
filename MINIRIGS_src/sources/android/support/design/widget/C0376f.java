package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.p031c.C0491a;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0608z;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: android.support.design.widget.f */
abstract class C0376f extends C0387l<View> {

    /* renamed from: a */
    final Rect f1245a = new Rect();

    /* renamed from: b */
    final Rect f1246b = new Rect();

    /* renamed from: c */
    private int f1247c = 0;

    /* renamed from: d */
    private int f1248d;

    /* renamed from: c */
    private static int m1557c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo1078a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract View mo1082b(List<View> list);

    public C0376f() {
    }

    public C0376f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo1061a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View b;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (b = mo1082b(coordinatorLayout.mo1182c(view))) == null) {
            return false;
        }
        if (!C0594r.m2615p(b) || C0594r.m2615p(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            C0594r.m2593b(view, true);
            if (C0594r.m2615p(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.mo1169a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + mo1081b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1412b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = mo1082b(coordinatorLayout.mo1182c(view));
        if (b != null) {
            CoordinatorLayout.C0349e eVar = (CoordinatorLayout.C0349e) view.getLayoutParams();
            Rect rect = this.f1245a;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, b.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C0608z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0594r.m2615p(coordinatorLayout) && !C0594r.m2615p(view)) {
                rect.left += lastWindowInsets.mo2313a();
                rect.right -= lastWindowInsets.mo2316c();
            }
            Rect rect2 = this.f1246b;
            C0579d.m2524a(m1557c(eVar.f1106c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo1413c(b);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.f1247c = rect2.top - b.getBottom();
            return;
        }
        super.mo1412b(coordinatorLayout, view, i);
        this.f1247c = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo1413c(View view) {
        if (this.f1248d == 0) {
            return 0;
        }
        float a = mo1078a(view);
        int i = this.f1248d;
        return C0491a.m2181a((int) (a * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1081b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo1410a() {
        return this.f1247c;
    }

    /* renamed from: b */
    public final void mo1411b(int i) {
        this.f1248d = i;
    }

    /* renamed from: d */
    public final int mo1414d() {
        return this.f1248d;
    }
}
