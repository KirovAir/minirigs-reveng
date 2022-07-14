package android.support.design.transformation;

import android.content.Context;
import android.os.Build;
import android.support.design.C0241a;
import android.support.design.p016a.C0258h;
import android.support.design.p016a.C0260j;
import android.support.design.transformation.FabTransformationBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.p036h.C0594r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: a */
    private Map<View, Integer> f981a;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FabTransformationBehavior.C0310a mo1003a(Context context, boolean z) {
        int i;
        if (z) {
            i = C0241a.C0242a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C0241a.C0242a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C0310a aVar = new FabTransformationBehavior.C0310a();
        aVar.f974a = C0258h.m891a(context, i);
        aVar.f975b = new C0260j(17, 0.0f, 0.0f);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo998a(View view, View view2, boolean z, boolean z2) {
        m1130a(view2, z);
        return super.mo998a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m1130a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f981a = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0349e) && (((CoordinatorLayout.C0349e) childAt.getLayoutParams()).mo1248b() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f981a;
                        if (map != null && map.containsKey(childAt)) {
                            C0594r.m2592b(childAt, this.f981a.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f981a.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0594r.m2592b(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f981a = null;
            }
        }
    }
}
