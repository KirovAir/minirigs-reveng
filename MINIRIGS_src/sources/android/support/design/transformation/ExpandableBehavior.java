package android.support.design.transformation;

import android.content.Context;
import android.support.design.p020d.C0285b;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.C0346b<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f952a = 0;

    /* renamed from: a */
    public abstract boolean mo997a(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo998a(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = mo996a(r3, r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo836a(android.support.design.widget.CoordinatorLayout r3, final android.view.View r4, int r5) {
        /*
            r2 = this;
            boolean r5 = android.support.p026v4.p036h.C0594r.m2622w(r4)
            if (r5 != 0) goto L_0x002f
            android.support.design.d.b r3 = r2.mo996a(r3, r4)
            if (r3 == 0) goto L_0x002f
            boolean r5 = r3.mo927a()
            boolean r5 = r2.m1095a((boolean) r5)
            if (r5 == 0) goto L_0x002f
            boolean r5 = r3.mo927a()
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r2.f952a = r5
            int r5 = r2.f952a
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            android.support.design.transformation.ExpandableBehavior$1 r1 = new android.support.design.transformation.ExpandableBehavior$1
            r1.<init>(r4, r5, r3)
            r0.addOnPreDrawListener(r1)
        L_0x002f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.transformation.ExpandableBehavior.mo836a(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: b */
    public boolean mo999b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C0285b bVar = (C0285b) view2;
        if (!m1095a(bVar.mo927a())) {
            return false;
        }
        this.f952a = bVar.mo927a() ? 1 : 2;
        return mo998a((View) bVar, view, bVar.mo927a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0285b mo996a(CoordinatorLayout coordinatorLayout, View view) {
        List<View> c = coordinatorLayout.mo1182c(view);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            View view2 = c.get(i);
            if (mo997a(coordinatorLayout, view, view2)) {
                return (C0285b) view2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m1095a(boolean z) {
        if (z) {
            int i = this.f952a;
            return i == 0 || i == 2;
        } else if (this.f952a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
