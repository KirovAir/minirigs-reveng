package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0241a;
import android.support.design.p024h.C0297a;
import android.support.design.widget.BaseTransientBottomBar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: f */
    private static final int[] f1145f = {C0241a.C0243b.snackbarButtonStyle};

    /* renamed from: d */
    private final AccessibilityManager f1146d;

    /* renamed from: e */
    private boolean f1147e;

    private Snackbar(ViewGroup viewGroup, View view, C0297a aVar) {
        super(viewGroup, view, aVar);
        this.f1146d = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: d */
    public void mo1093d() {
        super.mo1093d();
    }

    /* renamed from: e */
    public void mo1095e() {
        super.mo1095e();
    }

    /* renamed from: a */
    public static Snackbar m1446a(View view, CharSequence charSequence, int i) {
        ViewGroup a = m1447a(view);
        if (a != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(a.getContext()).inflate(m1448a(a.getContext()) ? C0241a.C0248g.mtrl_layout_snackbar_include : C0241a.C0248g.design_layout_snackbar_include, a, false);
            Snackbar snackbar = new Snackbar(a, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo1336a(charSequence);
            snackbar.mo1088a(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: a */
    protected static boolean m1448a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1145f);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static ViewGroup m1447a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public Snackbar mo1336a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f1013b.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: c */
    public int mo1091c() {
        if (!this.f1147e || !this.f1146d.isTouchExplorationEnabled()) {
            return super.mo1091c();
        }
        return -2;
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.C0336e {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
}
