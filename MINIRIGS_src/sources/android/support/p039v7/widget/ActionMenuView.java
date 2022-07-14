package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p039v7.view.menu.ActionMenuItemView;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.C0886as;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0886as implements C0754h.C0756b, C0772p {

    /* renamed from: a */
    C0754h.C0755a f2702a;

    /* renamed from: b */
    C0792e f2703b;

    /* renamed from: c */
    private C0754h f2704c;

    /* renamed from: d */
    private Context f2705d;

    /* renamed from: e */
    private int f2706e;

    /* renamed from: f */
    private boolean f2707f;

    /* renamed from: g */
    private C0986c f2708g;

    /* renamed from: h */
    private C0770o.C0771a f2709h;

    /* renamed from: i */
    private boolean f2710i;

    /* renamed from: j */
    private int f2711j;

    /* renamed from: k */
    private int f2712k;

    /* renamed from: l */
    private int f2713l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0788a {
        /* renamed from: c */
        boolean mo2906c();

        /* renamed from: d */
        boolean mo2907d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0792e {
        /* renamed from: a */
        boolean mo3427a(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2712k = (int) (56.0f * f);
        this.f2713l = (int) (f * 4.0f);
        this.f2705d = context;
        this.f2706e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f2706e != i) {
            this.f2706e = i;
            if (i == 0) {
                this.f2705d = getContext();
            } else {
                this.f2705d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2706e;
    }

    public void setPresenter(C0986c cVar) {
        this.f2708g = cVar;
        this.f2708g.mo4843a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0986c cVar = this.f2708g;
        if (cVar != null) {
            cVar.mo2990b(false);
            if (this.f2708g.mo4851h()) {
                this.f2708g.mo4848e();
                this.f2708g.mo4847d();
            }
        }
    }

    public void setOnMenuItemClickListener(C0792e eVar) {
        this.f2703b = eVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0754h hVar;
        boolean z = this.f2710i;
        this.f2710i = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2710i) {
            this.f2711j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f2710i || (hVar = this.f2704c) == null || size == this.f2711j)) {
            this.f2711j = size;
            hVar.mo3071b(true);
        }
        int childCount = getChildCount();
        if (!this.f2710i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0790c cVar = (C0790c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m3657c(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0240 A[LOOP:5: B:134:0x0240->B:138:0x025f, LOOP_START, PHI: r13 
      PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:133:0x023e, B:138:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0269  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3657c(int r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f2712k
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r9)
            return
        L_0x0035:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r14 = r7
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0045:
            if (r7 >= r8) goto L_0x00c5
            android.view.View r11 = r0.getChildAt(r7)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            boolean r3 = r11 instanceof android.support.p039v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0066
            int r9 = r0.f2713l
            r20 = r13
            r13 = 0
            r11.setPadding(r9, r13, r9, r13)
            goto L_0x0069
        L_0x0066:
            r20 = r13
            r13 = 0
        L_0x0069:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.p039v7.widget.ActionMenuView.C0790c) r9
            r9.f2719f = r13
            r9.f2716c = r13
            r9.f2715b = r13
            r9.f2717d = r13
            r9.leftMargin = r13
            r9.rightMargin = r13
            if (r3 == 0) goto L_0x0088
            r3 = r11
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.p039v7.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.mo2905b()
            if (r3 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            r9.f2718e = r3
            boolean r3 = r9.f2714a
            if (r3 == 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = r14
        L_0x0092:
            int r3 = m3656a(r11, r4, r3, r6, r5)
            int r13 = java.lang.Math.max(r15, r3)
            boolean r15 = r9.f2717d
            if (r15 == 0) goto L_0x00a0
            int r16 = r16 + 1
        L_0x00a0:
            boolean r9 = r9.f2714a
            if (r9 == 0) goto L_0x00a5
            r12 = 1
        L_0x00a5:
            int r14 = r14 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto L_0x00bb
            int r3 = r9 << r7
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r10
        L_0x00bc:
            r15 = r13
            r13 = r20
        L_0x00bf:
            int r7 = r7 + 1
            r3 = r19
            r9 = 0
            goto L_0x0045
        L_0x00c5:
            r19 = r3
            r3 = 2
            if (r12 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            r20 = 1
            if (r16 <= 0) goto L_0x0175
            if (r14 <= 0) goto L_0x0175
            r9 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r11 = 0
            r22 = 0
        L_0x00e0:
            if (r9 >= r8) goto L_0x0114
            android.view.View r24 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r7
            r7 = r24
            android.support.v7.widget.ActionMenuView$c r7 = (android.support.p039v7.widget.ActionMenuView.C0790c) r7
            r24 = r10
            boolean r10 = r7.f2717d
            if (r10 != 0) goto L_0x00f7
            goto L_0x010d
        L_0x00f7:
            int r10 = r7.f2715b
            if (r10 >= r3) goto L_0x0103
            int r3 = r7.f2715b
            long r10 = r20 << r9
            r22 = r10
            r11 = 1
            goto L_0x010d
        L_0x0103:
            int r7 = r7.f2715b
            if (r7 != r3) goto L_0x010d
            long r26 = r20 << r9
            long r22 = r22 | r26
            int r11 = r11 + 1
        L_0x010d:
            int r9 = r9 + 1
            r10 = r24
            r7 = r25
            goto L_0x00e0
        L_0x0114:
            r25 = r7
            r24 = r10
            long r17 = r17 | r22
            if (r11 <= r14) goto L_0x0120
            r11 = r1
            r26 = r2
            goto L_0x017c
        L_0x0120:
            int r3 = r3 + 1
            r7 = 0
        L_0x0123:
            if (r7 >= r8) goto L_0x016f
            android.view.View r9 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r10 = (android.support.p039v7.widget.ActionMenuView.C0790c) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r7
            r11 = r1
            long r1 = (long) r2
            long r20 = r22 & r1
            r27 = 0
            int r25 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r25 != 0) goto L_0x0147
            int r9 = r10.f2715b
            if (r9 != r3) goto L_0x0144
            long r17 = r17 | r1
        L_0x0144:
            r20 = r3
            goto L_0x0167
        L_0x0147:
            if (r5 == 0) goto L_0x015b
            boolean r1 = r10.f2718e
            if (r1 == 0) goto L_0x015b
            r1 = 1
            if (r14 != r1) goto L_0x015b
            int r2 = r0.f2713l
            int r1 = r2 + r4
            r20 = r3
            r3 = 0
            r9.setPadding(r1, r3, r2, r3)
            goto L_0x015d
        L_0x015b:
            r20 = r3
        L_0x015d:
            int r1 = r10.f2715b
            r2 = 1
            int r1 = r1 + r2
            r10.f2715b = r1
            r10.f2719f = r2
            int r14 = r14 + -1
        L_0x0167:
            int r7 = r7 + 1
            r1 = r11
            r3 = r20
            r2 = r26
            goto L_0x0123
        L_0x016f:
            r10 = r24
            r3 = 2
            r7 = 1
            goto L_0x00d0
        L_0x0175:
            r11 = r1
            r26 = r2
            r25 = r7
            r24 = r10
        L_0x017c:
            if (r12 != 0) goto L_0x0183
            r1 = 1
            if (r13 != r1) goto L_0x0184
            r2 = 1
            goto L_0x0185
        L_0x0183:
            r1 = 1
        L_0x0184:
            r2 = 0
        L_0x0185:
            if (r14 <= 0) goto L_0x023b
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x023b
            int r13 = r13 - r1
            if (r14 < r13) goto L_0x0194
            if (r2 != 0) goto L_0x0194
            if (r15 <= r1) goto L_0x023b
        L_0x0194:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x01d5
            long r2 = r17 & r20
            r5 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x01b6
            r13 = 0
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p039v7.widget.ActionMenuView.C0790c) r2
            boolean r2 = r2.f2718e
            if (r2 != 0) goto L_0x01b7
            float r1 = r1 - r5
            goto L_0x01b7
        L_0x01b6:
            r13 = 0
        L_0x01b7:
            int r2 = r8 + -1
            r3 = 1
            int r7 = r3 << r2
            long r9 = (long) r7
            long r9 = r17 & r9
            r15 = 0
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x01d6
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p039v7.widget.ActionMenuView.C0790c) r2
            boolean r2 = r2.f2718e
            if (r2 != 0) goto L_0x01d6
            float r1 = r1 - r5
            goto L_0x01d6
        L_0x01d5:
            r13 = 0
        L_0x01d6:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01e1
            int r14 = r14 * r4
            float r2 = (float) r14
            float r2 = r2 / r1
            int r9 = (int) r2
            goto L_0x01e2
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            r1 = 0
        L_0x01e3:
            if (r1 >= r8) goto L_0x023c
            r2 = 1
            int r3 = r2 << r1
            long r2 = (long) r3
            long r2 = r17 & r2
            r14 = 0
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x01f4
            r2 = 1
            r5 = 2
            goto L_0x0238
        L_0x01f4:
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p039v7.widget.ActionMenuView.C0790c) r3
            boolean r2 = r2 instanceof android.support.p039v7.view.menu.ActionMenuItemView
            if (r2 == 0) goto L_0x0218
            r3.f2716c = r9
            r2 = 1
            r3.f2719f = r2
            if (r1 != 0) goto L_0x0213
            boolean r2 = r3.f2718e
            if (r2 != 0) goto L_0x0213
            int r2 = -r9
            r5 = 2
            int r2 = r2 / r5
            r3.leftMargin = r2
            goto L_0x0214
        L_0x0213:
            r5 = 2
        L_0x0214:
            r2 = 1
            r25 = 1
            goto L_0x0238
        L_0x0218:
            r5 = 2
            boolean r2 = r3.f2714a
            if (r2 == 0) goto L_0x0229
            r3.f2716c = r9
            r2 = 1
            r3.f2719f = r2
            int r7 = -r9
            int r7 = r7 / r5
            r3.rightMargin = r7
            r25 = 1
            goto L_0x0238
        L_0x0229:
            r2 = 1
            if (r1 == 0) goto L_0x0230
            int r7 = r9 / 2
            r3.leftMargin = r7
        L_0x0230:
            int r7 = r8 + -1
            if (r1 == r7) goto L_0x0238
            int r7 = r9 / 2
            r3.rightMargin = r7
        L_0x0238:
            int r1 = r1 + 1
            goto L_0x01e3
        L_0x023b:
            r13 = 0
        L_0x023c:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r25 == 0) goto L_0x0262
        L_0x0240:
            if (r13 >= r8) goto L_0x0262
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p039v7.widget.ActionMenuView.C0790c) r3
            boolean r5 = r3.f2719f
            if (r5 != 0) goto L_0x0251
            goto L_0x025f
        L_0x0251:
            int r5 = r3.f2715b
            int r5 = r5 * r4
            int r3 = r3.f2716c
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L_0x025f:
            int r13 = r13 + 1
            goto L_0x0240
        L_0x0262:
            if (r11 == r1) goto L_0x0269
            r1 = r24
            r2 = r26
            goto L_0x026d
        L_0x0269:
            r1 = r19
            r2 = r26
        L_0x026d:
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.ActionMenuView.m3657c(int, int):void");
    }

    /* renamed from: a */
    static int m3656a(View view, int i, int i2, int i3, int i4) {
        C0790c cVar = (C0790c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo2905b();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f2714a || !z2) {
            z = false;
        }
        cVar.f2717d = z;
        cVar.f2715b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f2710i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0984bv.m5212a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0790c cVar = (C0790c) childAt.getLayoutParams();
                if (cVar.f2714a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo3397a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean a2 = mo3397a(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0790c cVar2 = (C0790c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2714a) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0790c cVar3 = (C0790c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2714a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i6++;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3416i();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2708g.mo4842a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2708g.mo4844c();
    }

    /* renamed from: a */
    public boolean mo3396a() {
        return this.f2707f;
    }

    public void setOverflowReserved(boolean z) {
        this.f2707f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0790c mo3417j() {
        C0790c cVar = new C0790c(-2, -2);
        cVar.f3194h = 16;
        return cVar;
    }

    /* renamed from: a */
    public C0790c generateLayoutParams(AttributeSet attributeSet) {
        return new C0790c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0790c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo3417j();
        }
        C0790c cVar = layoutParams instanceof C0790c ? new C0790c((C0790c) layoutParams) : new C0790c(layoutParams);
        if (cVar.f3194h <= 0) {
            cVar.f3194h = 16;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0790c);
    }

    /* renamed from: c */
    public C0790c mo3401c() {
        C0790c b = mo3417j();
        b.f2714a = true;
        return b;
    }

    /* renamed from: a */
    public boolean mo2924a(C0758j jVar) {
        return this.f2704c.mo3056a((MenuItem) jVar, 0);
    }

    /* renamed from: a */
    public void mo982a(C0754h hVar) {
        this.f2704c = hVar;
    }

    public Menu getMenu() {
        if (this.f2704c == null) {
            Context context = getContext();
            this.f2704c = new C0754h(context);
            this.f2704c.mo3048a((C0754h.C0755a) new C0791d());
            this.f2708g = new C0986c(context);
            this.f2708g.mo4845c(true);
            C0986c cVar = this.f2708g;
            C0770o.C0771a aVar = this.f2709h;
            if (aVar == null) {
                aVar = new C0789b();
            }
            cVar.mo2983a(aVar);
            this.f2704c.mo3051a((C0770o) this.f2708g, this.f2705d);
            this.f2708g.mo4843a(this);
        }
        return this.f2704c;
    }

    /* renamed from: a */
    public void mo3395a(C0770o.C0771a aVar, C0754h.C0755a aVar2) {
        this.f2709h = aVar;
        this.f2702a = aVar2;
    }

    /* renamed from: d */
    public C0754h mo3403d() {
        return this.f2704c;
    }

    /* renamed from: e */
    public boolean mo3405e() {
        C0986c cVar = this.f2708g;
        return cVar != null && cVar.mo4847d();
    }

    /* renamed from: f */
    public boolean mo3406f() {
        C0986c cVar = this.f2708g;
        return cVar != null && cVar.mo4848e();
    }

    /* renamed from: g */
    public boolean mo3407g() {
        C0986c cVar = this.f2708g;
        return cVar != null && cVar.mo4851h();
    }

    /* renamed from: h */
    public boolean mo3415h() {
        C0986c cVar = this.f2708g;
        return cVar != null && cVar.mo4852i();
    }

    /* renamed from: i */
    public void mo3416i() {
        C0986c cVar = this.f2708g;
        if (cVar != null) {
            cVar.mo4849f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3397a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0788a)) {
            z = false | ((C0788a) childAt).mo2907d();
        }
        return (i <= 0 || !(childAt2 instanceof C0788a)) ? z : z | ((C0788a) childAt2).mo2906c();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2708g.mo4846d(z);
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0791d implements C0754h.C0755a {
        C0791d() {
        }

        /* renamed from: a */
        public boolean mo2610a(C0754h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f2703b != null && ActionMenuView.this.f2703b.mo3427a(menuItem);
        }

        /* renamed from: a */
        public void mo2607a(C0754h hVar) {
            if (ActionMenuView.this.f2702a != null) {
                ActionMenuView.this.f2702a.mo2607a(hVar);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0789b implements C0770o.C0771a {
        /* renamed from: a */
        public void mo2639a(C0754h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2640a(C0754h hVar) {
            return false;
        }

        C0789b() {
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0790c extends C0886as.C0887a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f2714a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f2715b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f2716c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f2717d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f2718e;

        /* renamed from: f */
        boolean f2719f;

        public C0790c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0790c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0790c(C0790c cVar) {
            super(cVar);
            this.f2714a = cVar.f2714a;
        }

        public C0790c(int i, int i2) {
            super(i, i2);
            this.f2714a = false;
        }
    }
}
