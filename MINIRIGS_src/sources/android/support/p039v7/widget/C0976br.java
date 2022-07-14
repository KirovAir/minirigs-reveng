package android.support.p039v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p039v7.p040a.C0639a;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.br */
class C0976br {

    /* renamed from: a */
    private final Context f3592a;

    /* renamed from: b */
    private final View f3593b;

    /* renamed from: c */
    private final TextView f3594c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f3595d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f3596e = new Rect();

    /* renamed from: f */
    private final int[] f3597f = new int[2];

    /* renamed from: g */
    private final int[] f3598g = new int[2];

    C0976br(Context context) {
        this.f3592a = context;
        this.f3593b = LayoutInflater.from(this.f3592a).inflate(C0639a.C0646g.abc_tooltip, (ViewGroup) null);
        this.f3594c = (TextView) this.f3593b.findViewById(C0639a.C0645f.message);
        this.f3595d.setTitle(getClass().getSimpleName());
        this.f3595d.packageName = this.f3592a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f3595d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0639a.C0648i.Animation_AppCompat_Tooltip;
        this.f3595d.flags = 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4813a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo4814b()) {
            mo4812a();
        }
        this.f3594c.setText(charSequence);
        m5168a(view, i, i2, z, this.f3595d);
        ((WindowManager) this.f3592a.getSystemService("window")).addView(this.f3593b, this.f3595d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4812a() {
        if (mo4814b()) {
            ((WindowManager) this.f3592a.getSystemService("window")).removeView(this.f3593b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4814b() {
        return this.f3593b.getParent() != null;
    }

    /* renamed from: a */
    private void m5168a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3592a.getResources().getDimensionPixelOffset(C0639a.C0643d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3592a.getResources().getDimensionPixelOffset(C0639a.C0643d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3592a.getResources().getDimensionPixelOffset(z ? C0639a.C0643d.tooltip_y_offset_touch : C0639a.C0643d.tooltip_y_offset_non_touch);
        View a = m5167a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f3596e);
        if (this.f3596e.left < 0 && this.f3596e.top < 0) {
            Resources resources = this.f3592a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3596e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f3598g);
        view.getLocationOnScreen(this.f3597f);
        int[] iArr = this.f3597f;
        int i5 = iArr[0];
        int[] iArr2 = this.f3598g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3593b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3593b.getMeasuredHeight();
        int[] iArr3 = this.f3597f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f3596e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: a */
    private static View m5167a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
