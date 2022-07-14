package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p039v7.widget.C0876ao;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0876ao {

    /* renamed from: a */
    private C0876ao.C0877a f2760a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0876ao.C0877a aVar) {
        this.f2760a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0876ao.C0877a aVar = this.f2760a;
        if (aVar != null) {
            aVar.mo2635a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
