package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f2748a;

    /* renamed from: b */
    private int f2749b = -1;

    /* renamed from: c */
    private int f2750c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ButtonBarLayout);
        this.f2748a = obtainStyledAttributes.getBoolean(C0639a.C0649j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f2748a != z) {
            this.f2748a = z;
            if (!this.f2748a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f2748a) {
            if (size > this.f2749b && m3703a()) {
                setStacked(false);
            }
            this.f2749b = size;
        }
        if (m3703a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f2748a && !m3703a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m3702a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m3703a()) {
                int a2 = m3702a(a + 1);
                i4 = a2 >= 0 ? paddingTop + getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) : paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0594r.m2609j(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    /* renamed from: a */
    private int m3702a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f2750c, super.getMinimumHeight());
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0639a.C0645f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    private boolean m3703a() {
        return getOrientation() == 1;
    }
}
