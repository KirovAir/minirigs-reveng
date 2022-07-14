package android.support.p039v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p026v4.widget.C0628k;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.s */
class C1021s extends PopupWindow {

    /* renamed from: a */
    private static final boolean f3728a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f3729b;

    public C1021s(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m5371a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m5371a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0968bn a = C0968bn.m5093a(context, attributeSet, C0639a.C0649j.PopupWindow, i, i2);
        if (a.mo4794g(C0639a.C0649j.PopupWindow_overlapAnchor)) {
            m5372a(a.mo4782a(C0639a.C0649j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo4780a(C0639a.C0649j.PopupWindow_android_popupBackground));
        a.mo4781a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f3728a && this.f3729b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3728a && this.f3729b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (!f3728a || !this.f3729b) ? i2 : i2 - view.getHeight(), i3, i4);
    }

    /* renamed from: a */
    private void m5372a(boolean z) {
        if (f3728a) {
            this.f3729b = z;
        } else {
            C0628k.m2794a((PopupWindow) this, z);
        }
    }
}
