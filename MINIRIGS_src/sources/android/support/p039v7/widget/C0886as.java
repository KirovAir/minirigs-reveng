package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.as */
public class C0886as extends ViewGroup {

    /* renamed from: a */
    private boolean f3178a;

    /* renamed from: b */
    private int f3179b;

    /* renamed from: c */
    private int f3180c;

    /* renamed from: d */
    private int f3181d;

    /* renamed from: e */
    private int f3182e;

    /* renamed from: f */
    private int f3183f;

    /* renamed from: g */
    private float f3184g;

    /* renamed from: h */
    private boolean f3185h;

    /* renamed from: i */
    private int[] f3186i;

    /* renamed from: j */
    private int[] f3187j;

    /* renamed from: k */
    private Drawable f3188k;

    /* renamed from: l */
    private int f3189l;

    /* renamed from: m */
    private int f3190m;

    /* renamed from: n */
    private int f3191n;

    /* renamed from: o */
    private int f3192o;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4083a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4084a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4090b(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4097d(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0886as(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0886as(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0886as(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3178a = true;
        this.f3179b = -1;
        this.f3180c = 0;
        this.f3182e = 8388659;
        C0968bn a = C0968bn.m5093a(context, attributeSet, C0639a.C0649j.LinearLayoutCompat, i, 0);
        int a2 = a.mo4778a(C0639a.C0649j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo4778a(C0639a.C0649j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo4782a(C0639a.C0649j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f3184g = a.mo4777a(C0639a.C0649j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3179b = a.mo4778a(C0639a.C0649j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3185h = a.mo4782a(C0639a.C0649j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo4780a(C0639a.C0649j.LinearLayoutCompat_divider));
        this.f3191n = a.mo4778a(C0639a.C0649j.LinearLayoutCompat_showDividers, 0);
        this.f3192o = a.mo4789e(C0639a.C0649j.LinearLayoutCompat_dividerPadding, 0);
        a.mo4781a();
    }

    public void setShowDividers(int i) {
        if (i != this.f3191n) {
            requestLayout();
        }
        this.f3191n = i;
    }

    public int getShowDividers() {
        return this.f3191n;
    }

    public Drawable getDividerDrawable() {
        return this.f3188k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3188k) {
            this.f3188k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f3189l = drawable.getIntrinsicWidth();
                this.f3190m = drawable.getIntrinsicHeight();
            } else {
                this.f3189l = 0;
                this.f3190m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f3192o = i;
    }

    public int getDividerPadding() {
        return this.f3192o;
    }

    public int getDividerWidth() {
        return this.f3189l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f3188k != null) {
            if (this.f3181d == 1) {
                mo4087a(canvas);
            } else {
                mo4094b(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4087a(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View b = mo4091b(i2);
            if (!(b == null || b.getVisibility() == 8 || !mo4096c(i2))) {
                mo4088a(canvas, (b.getTop() - ((C0887a) b.getLayoutParams()).topMargin) - this.f3190m);
            }
        }
        if (mo4096c(virtualChildCount)) {
            View b2 = mo4091b(virtualChildCount - 1);
            if (b2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f3190m;
            } else {
                i = b2.getBottom() + ((C0887a) b2.getLayoutParams()).bottomMargin;
            }
            mo4088a(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4094b(Canvas canvas) {
        int i;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0984bv.m5212a(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View b = mo4091b(i3);
            if (!(b == null || b.getVisibility() == 8 || !mo4096c(i3))) {
                C0887a aVar = (C0887a) b.getLayoutParams();
                if (a) {
                    i2 = b.getRight() + aVar.rightMargin;
                } else {
                    i2 = (b.getLeft() - aVar.leftMargin) - this.f3189l;
                }
                mo4095b(canvas, i2);
            }
        }
        if (mo4096c(virtualChildCount)) {
            View b2 = mo4091b(virtualChildCount - 1);
            if (b2 != null) {
                C0887a aVar2 = (C0887a) b2.getLayoutParams();
                if (a) {
                    i = (b2.getLeft() - aVar2.leftMargin) - this.f3189l;
                } else {
                    i = b2.getRight() + aVar2.rightMargin;
                }
            } else if (a) {
                i = getPaddingLeft();
            } else {
                i = (getWidth() - getPaddingRight()) - this.f3189l;
            }
            mo4095b(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4088a(Canvas canvas, int i) {
        this.f3188k.setBounds(getPaddingLeft() + this.f3192o, i, (getWidth() - getPaddingRight()) - this.f3192o, this.f3190m + i);
        this.f3188k.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4095b(Canvas canvas, int i) {
        this.f3188k.setBounds(i, getPaddingTop() + this.f3192o, this.f3189l + i, (getHeight() - getPaddingBottom()) - this.f3192o);
        this.f3188k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f3178a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3185h = z;
    }

    public int getBaseline() {
        int i;
        if (this.f3179b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f3179b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f3180c;
                if (this.f3181d == 1 && (i = this.f3182e & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3183f) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3183f;
                    }
                }
                return i3 + ((C0887a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f3179b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3179b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f3179b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4091b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3184g;
    }

    public void setWeightSum(float f) {
        this.f3184g = Math.max(0.0f, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f3181d == 1) {
            mo4085a(i, i2);
        } else {
            mo4092b(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4096c(int i) {
        if (i == 0) {
            return (this.f3191n & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.f3191n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f3191n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0340  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4085a(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f3183f = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f3179b
            boolean r15 = r7.f3185h
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x01a0
            android.view.View r4 = r7.mo4091b((int) r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f3183f
            int r10 = r7.mo4097d(r6)
            int r4 = r4 + r10
            r7.f3183f = r4
            r23 = r11
            r4 = r22
            r22 = r13
            goto L_0x0194
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005e
            int r1 = r7.mo4084a((android.view.View) r4, (int) r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            r22 = r13
            goto L_0x0194
        L_0x005e:
            boolean r1 = r7.mo4096c(r6)
            if (r1 == 0) goto L_0x006b
            int r1 = r7.f3183f
            int r10 = r7.f3190m
            int r1 = r1 + r10
            r7.f3183f = r1
        L_0x006b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.as$a r10 = (android.support.p039v7.widget.C0886as.C0887a) r10
            float r1 = r10.f3193g
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a9
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a9
            float r0 = r10.f3193g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            int r0 = r7.f3183f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f3183f = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r8 = r24
            r30 = r26
            r18 = 1
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x011b
        L_0x00a9:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00ba
            float r0 = r10.f3193g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ba
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00bc
        L_0x00ba:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00bc:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            int r0 = r7.f3183f
            r28 = r0
            goto L_0x00c9
        L_0x00c7:
            r28 = 0
        L_0x00c9:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r4
            r23 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r22
            r22 = r13
            r13 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.mo4089a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f8
            r10.height = r0
        L_0x00f8:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f3183f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.mo4090b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f3183f = r1
            if (r15 == 0) goto L_0x011a
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x011b
        L_0x011a:
            r0 = r9
        L_0x011b:
            if (r14 < 0) goto L_0x0125
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0125
            int r1 = r7.f3183f
            r7.f3180c = r1
        L_0x0125:
            if (r11 >= r14) goto L_0x0136
            float r1 = r10.f3193g
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0136:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0143
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0143
            r1 = 1
            r20 = 1
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0165
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0165
            r8 = 1
            goto L_0x0166
        L_0x0165:
            r8 = 0
        L_0x0166:
            float r9 = r10.f3193g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0178
            if (r1 == 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            r2 = r4
        L_0x0170:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x0182
        L_0x0178:
            if (r1 == 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r2 = r4
        L_0x017c:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0182:
            int r2 = r7.mo4084a((android.view.View) r3, (int) r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0194:
            int r6 = r6 + 1
            r13 = r22
            r11 = r23
            r8 = r34
            r9 = r35
            goto L_0x002a
        L_0x01a0:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f3183f
            if (r2 <= 0) goto L_0x01c0
            r2 = r23
            boolean r3 = r7.mo4096c(r2)
            if (r3 == 0) goto L_0x01c2
            int r3 = r7.f3183f
            int r4 = r7.f3190m
            int r3 = r3 + r4
            r7.f3183f = r3
            goto L_0x01c2
        L_0x01c0:
            r2 = r23
        L_0x01c2:
            if (r15 == 0) goto L_0x0211
            r3 = r22
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01cc
            if (r3 != 0) goto L_0x0213
        L_0x01cc:
            r4 = 0
            r7.f3183f = r4
            r4 = 0
        L_0x01d0:
            if (r4 >= r2) goto L_0x0213
            android.view.View r6 = r7.mo4091b((int) r4)
            if (r6 != 0) goto L_0x01e2
            int r6 = r7.f3183f
            int r11 = r7.mo4097d(r4)
            int r6 = r6 + r11
            r7.f3183f = r6
            goto L_0x020c
        L_0x01e2:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01ee
            int r6 = r7.mo4084a((android.view.View) r6, (int) r4)
            int r4 = r4 + r6
            goto L_0x020c
        L_0x01ee:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            android.support.v7.widget.as$a r11 = (android.support.p039v7.widget.C0886as.C0887a) r11
            int r14 = r7.f3183f
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo4090b((android.view.View) r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.f3183f = r6
        L_0x020c:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01d0
        L_0x0211:
            r3 = r22
        L_0x0213:
            int r4 = r7.f3183f
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f3183f = r4
            int r4 = r7.f3183f
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r10 = r9
            r6 = r35
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f3183f
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0284
            if (r9 == 0) goto L_0x0243
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0243
            goto L_0x0284
        L_0x0243:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x027f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x027f
            r1 = 0
        L_0x024e:
            if (r1 >= r2) goto L_0x027f
            android.view.View r3 = r7.mo4091b((int) r1)
            if (r3 == 0) goto L_0x027c
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x025f
            goto L_0x027c
        L_0x025f:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            android.support.v7.widget.as$a r9 = (android.support.p039v7.widget.C0886as.C0887a) r9
            float r9 = r9.f3193g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x027c
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x027c:
            int r1 = r1 + 1
            goto L_0x024e
        L_0x027f:
            r1 = r8
            r11 = r34
            goto L_0x0377
        L_0x0284:
            float r10 = r7.f3184g
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x028b
            r0 = r10
        L_0x028b:
            r10 = 0
            r7.f3183f = r10
            r11 = r0
            r0 = 0
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x0295:
            if (r0 >= r2) goto L_0x0366
            android.view.View r13 = r7.mo4091b((int) r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a9
            r21 = r11
            r11 = r34
            goto L_0x035f
        L_0x02a9:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.as$a r14 = (android.support.p039v7.widget.C0886as.C0887a) r14
            float r10 = r14.f3193g
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x030a
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r9 = getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02ed
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02e1
            goto L_0x02ef
        L_0x02e1:
            if (r15 <= 0) goto L_0x02e4
            goto L_0x02e5
        L_0x02e4:
            r15 = 0
        L_0x02e5:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            goto L_0x02ff
        L_0x02ed:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02ef:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02f8
            r15 = 0
        L_0x02f8:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
        L_0x02ff:
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x0311
        L_0x030a:
            r10 = r11
            r11 = r34
            r18 = r9
            r21 = r10
        L_0x0311:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x032c
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x032f
            r15 = 1
            goto L_0x0330
        L_0x032c:
            r23 = r1
            r1 = -1
        L_0x032f:
            r15 = 0
        L_0x0330:
            if (r15 == 0) goto L_0x0333
            goto L_0x0334
        L_0x0333:
            r9 = r10
        L_0x0334:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x0340
            int r9 = r14.width
            if (r9 != r1) goto L_0x0340
            r9 = 1
            goto L_0x0341
        L_0x0340:
            r9 = 0
        L_0x0341:
            int r10 = r7.f3183f
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo4090b((android.view.View) r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f3183f = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x035f:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x0295
        L_0x0366:
            r11 = r34
            int r0 = r7.f3183f
            int r3 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f3183f = r0
            r0 = r8
        L_0x0377:
            if (r19 != 0) goto L_0x037e
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x037e
            goto L_0x037f
        L_0x037e:
            r0 = r5
        L_0x037f:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x039d
            r7.m4368c(r2, r6)
        L_0x039d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0886as.mo4085a(int, int):void");
    }

    /* renamed from: c */
    private void m4368c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo4091b(i3);
            if (b.getVisibility() != 8) {
                C0887a aVar = (C0887a) b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4092b(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f3183f = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f3186i
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f3187j
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f3186i = r0
            int[] r0 = new int[r14]
            r7.f3187j = r0
        L_0x0026:
            int[] r15 = r7.f3186i
            int[] r6 = r7.f3187j
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f3178a
            boolean r3 = r7.f3185h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0215
            android.view.View r6 = r7.mo4091b((int) r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f3183f
            int r6 = r7.mo4097d(r1)
            int r5 = r5 + r6
            r7.f3183f = r5
            r33 = r3
            r37 = r4
            goto L_0x0205
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008d
            int r5 = r7.mo4084a((android.view.View) r6, (int) r1)
            int r1 = r1 + r5
            r33 = r3
            r37 = r4
            goto L_0x0205
        L_0x008d:
            boolean r5 = r7.mo4096c(r1)
            if (r5 == 0) goto L_0x009a
            int r5 = r7.f3183f
            int r10 = r7.f3189l
            int r5 = r5 + r10
            r7.f3183f = r5
        L_0x009a:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.as$a r10 = (android.support.p039v7.widget.C0886as.C0887a) r10
            float r5 = r10.f3193g
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00f0
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f0
            float r0 = r10.f3193g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            if (r19 == 0) goto L_0x00be
            int r0 = r7.f3183f
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f3183f = r0
            goto L_0x00cc
        L_0x00be:
            int r0 = r7.f3183f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f3183f = r0
        L_0x00cc:
            if (r4 == 0) goto L_0x00e1
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x016f
        L_0x00e1:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r31 = -2
            goto L_0x0171
        L_0x00f0:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ff
            float r0 = r10.f3193g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x0102
        L_0x00ff:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0102:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            int r0 = r7.f3183f
            r30 = r0
            goto L_0x010d
        L_0x010b:
            r30 = 0
        L_0x010d:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r40
            r30 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            r6 = r34
            r0.mo4089a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x0136
            r10.width = r0
        L_0x0136:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x014f
            int r1 = r7.f3183f
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo4090b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.f3183f = r1
            goto L_0x0166
        L_0x014f:
            r3 = r30
            int r1 = r7.f3183f
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo4090b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f3183f = r1
        L_0x0166:
            if (r33 == 0) goto L_0x016f
            int r14 = java.lang.Math.max(r0, r14)
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0171
        L_0x016f:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0171:
            if (r13 == r1) goto L_0x017c
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x017c
            r0 = 1
            r28 = 1
            goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01c5
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01c2
            int r9 = r10.f3194h
            if (r9 >= 0) goto L_0x01a1
            int r9 = r7.f3182e
            goto L_0x01a3
        L_0x01a1:
            int r9 = r10.f3194h
        L_0x01a3:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
            r1 = r21
            goto L_0x01c7
        L_0x01c2:
            r1 = r21
            goto L_0x01c7
        L_0x01c5:
            r1 = r21
        L_0x01c7:
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01d4
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01d4
            r6 = 1
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            float r9 = r10.f3193g
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01e8
            if (r0 == 0) goto L_0x01de
            goto L_0x01df
        L_0x01de:
            r2 = r4
        L_0x01df:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            r10 = r35
            goto L_0x01f7
        L_0x01e8:
            r10 = r23
            if (r0 == 0) goto L_0x01ed
            r4 = r2
        L_0x01ed:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
            r10 = r35
        L_0x01f7:
            int r0 = r7.mo4084a((android.view.View) r3, (int) r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x0205:
            int r1 = r1 + 1
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r9 = r40
            r10 = 0
            goto L_0x0061
        L_0x0215:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f3183f
            if (r3 <= 0) goto L_0x0236
            boolean r3 = r7.mo4096c(r11)
            if (r3 == 0) goto L_0x0236
            int r3 = r7.f3183f
            int r4 = r7.f3189l
            int r3 = r3 + r4
            r7.f3183f = r3
        L_0x0236:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x024c
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x024c
            r3 = r15[r17]
            if (r3 != r4) goto L_0x024c
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0249
            goto L_0x024c
        L_0x0249:
            r23 = r6
            goto L_0x027d
        L_0x024c:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x027d:
            if (r33 == 0) goto L_0x02e7
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0285
            if (r12 != 0) goto L_0x02e7
        L_0x0285:
            r3 = 0
            r7.f3183f = r3
            r3 = 0
        L_0x0289:
            if (r3 >= r11) goto L_0x02e4
            android.view.View r4 = r7.mo4091b((int) r3)
            if (r4 != 0) goto L_0x029d
            int r4 = r7.f3183f
            int r5 = r7.mo4097d(r3)
            int r4 = r4 + r5
            r7.f3183f = r4
            r22 = r1
            goto L_0x02df
        L_0x029d:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x02ad
            int r4 = r7.mo4084a((android.view.View) r4, (int) r3)
            int r3 = r3 + r4
            r22 = r1
            goto L_0x02df
        L_0x02ad:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.as$a r5 = (android.support.p039v7.widget.C0886as.C0887a) r5
            if (r19 == 0) goto L_0x02c8
            int r6 = r7.f3183f
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo4090b((android.view.View) r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f3183f = r6
            r22 = r1
            goto L_0x02df
        L_0x02c8:
            int r6 = r7.f3183f
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo4090b((android.view.View) r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f3183f = r1
        L_0x02df:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0289
        L_0x02e4:
            r22 = r1
            goto L_0x02e9
        L_0x02e7:
            r22 = r1
        L_0x02e9:
            int r1 = r7.f3183f
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f3183f = r1
            int r1 = r7.f3183f
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f3183f
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x035a
            if (r3 == 0) goto L_0x0316
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0316
            goto L_0x035a
        L_0x0316:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0352
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0352
            r2 = 0
        L_0x0321:
            if (r2 >= r11) goto L_0x0352
            android.view.View r3 = r7.mo4091b((int) r2)
            if (r3 == 0) goto L_0x034f
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0332
            goto L_0x034f
        L_0x0332:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.as$a r5 = (android.support.p039v7.widget.C0886as.C0887a) r5
            float r5 = r5.f3193g
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x034f
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x034f:
            int r2 = r2 + 1
            goto L_0x0321
        L_0x0352:
            r26 = r11
            r2 = r22
            r3 = r40
            goto L_0x050b
        L_0x035a:
            float r5 = r7.f3184g
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0361
            r0 = r5
        L_0x0361:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f3183f = r6
            r10 = r2
            r9 = r23
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x037b:
            if (r0 >= r11) goto L_0x04b2
            android.view.View r14 = r7.mo4091b((int) r0)
            if (r14 == 0) goto L_0x04a1
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x0394
            r4 = r3
            r26 = r11
            r3 = r40
            r24 = 4
            goto L_0x04a8
        L_0x0394:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            android.support.v7.widget.as$a r5 = (android.support.p039v7.widget.C0886as.C0887a) r5
            float r4 = r5.f3193g
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03fd
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r3 = r40
            r11 = -1
            int r2 = getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03db
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03cf
            goto L_0x03dd
        L_0x03cf:
            if (r8 <= 0) goto L_0x03d2
            goto L_0x03d3
        L_0x03d2:
            r8 = 0
        L_0x03d3:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            goto L_0x03ed
        L_0x03db:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03dd:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03e6
            r8 = 0
        L_0x03e6:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
        L_0x03ed:
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x0403
        L_0x03fd:
            r4 = r3
            r26 = r11
            r3 = r40
            r11 = -1
        L_0x0403:
            if (r19 == 0) goto L_0x0422
            int r8 = r7.f3183f
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo4090b((android.view.View) r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f3183f = r8
            r23 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x043e
        L_0x0422:
            int r8 = r7.f3183f
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo4090b((android.view.View) r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f3183f = r2
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x043e:
            if (r13 == r2) goto L_0x0447
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x0447
            r2 = 1
            goto L_0x0448
        L_0x0447:
            r2 = 0
        L_0x0448:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0459
            goto L_0x045a
        L_0x0459:
            r8 = r11
        L_0x045a:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x0467
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x0468
            r8 = 1
            goto L_0x0469
        L_0x0467:
            r10 = -1
        L_0x0468:
            r8 = 0
        L_0x0469:
            if (r37 == 0) goto L_0x0499
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0496
            int r10 = r5.f3194h
            if (r10 >= 0) goto L_0x0478
            int r5 = r7.f3182e
            goto L_0x047a
        L_0x0478:
            int r5 = r5.f3194h
        L_0x047a:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x049b
        L_0x0496:
            r24 = 4
            goto L_0x049b
        L_0x0499:
            r24 = 4
        L_0x049b:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x04a8
        L_0x04a1:
            r4 = r3
            r26 = r11
            r3 = r40
            r24 = 4
        L_0x04a8:
            int r0 = r0 + 1
            r3 = r4
            r11 = r26
            r5 = -1
            r8 = r39
            goto L_0x037b
        L_0x04b2:
            r26 = r11
            r3 = r40
            int r0 = r7.f3183f
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f3183f = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04d9
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04d9
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04d9
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04d7
            goto L_0x04d9
        L_0x04d7:
            r0 = r6
            goto L_0x0507
        L_0x04d9:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x0507:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x050b:
            if (r27 != 0) goto L_0x0512
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x0512
            goto L_0x0513
        L_0x0512:
            r0 = r2
        L_0x0513:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x053c
            r1 = r26
            r0 = r39
            r7.m4369d(r1, r0)
        L_0x053c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0886as.mo4092b(int, int):void");
    }

    /* renamed from: d */
    private void m4369d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo4091b(i3);
            if (b.getVisibility() != 8) {
                C0887a aVar = (C0887a) b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4089a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3181d == 1) {
            mo4086a(i, i2, i3, i4);
        } else {
            mo4093b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4086a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f3182e;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        if (i9 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f3183f) / 2);
        } else if (i9 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f3183f;
        }
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View b = mo4091b(i11);
            if (b == null) {
                i5 += mo4097d(i11);
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0887a aVar = (C0887a) b.getLayoutParams();
                int i12 = aVar.f3194h;
                if (i12 < 0) {
                    i12 = i10;
                }
                int a = C0579d.m2523a(i12, C0594r.m2602f(this)) & 7;
                if (a == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                } else if (a != 5) {
                    i6 = aVar.leftMargin + paddingLeft;
                } else {
                    i6 = (paddingRight - measuredWidth) - aVar.rightMargin;
                }
                if (mo4096c(i11)) {
                    i5 += this.f3190m;
                }
                int i13 = i5 + aVar.topMargin;
                m4367a(b, i6, i13 + mo4083a(b), measuredWidth, measuredHeight);
                i11 += mo4084a(b, i11);
                i5 = i13 + measuredHeight + aVar.bottomMargin + mo4090b(b);
            }
            i11++;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4093b(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = android.support.p039v7.widget.C0984bv.m5212a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f3182e
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f3178a
            int[] r13 = r6.f3186i
            int[] r14 = r6.f3187j
            int r1 = android.support.p026v4.p036h.C0594r.m2602f(r24)
            int r1 = android.support.p026v4.p036h.C0579d.m2523a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f3183f
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f3183f
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0156
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo4091b((int) r2)
            if (r0 != 0) goto L_0x0082
            int r0 = r6.mo4097d(r2)
            int r1 = r1 + r0
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
            goto L_0x014a
        L_0x0082:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x013e
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            android.support.v7.widget.as$a r4 = (android.support.p039v7.widget.C0886as.C0887a) r4
            if (r12 == 0) goto L_0x00aa
            r18 = r3
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00ae
            int r3 = r0.getBaseline()
            goto L_0x00af
        L_0x00aa:
            r18 = r3
            r19 = r10
        L_0x00ae:
            r3 = -1
        L_0x00af:
            int r10 = r4.f3194h
            if (r10 >= 0) goto L_0x00b4
            r10 = r11
        L_0x00b4:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00fa
            r11 = 48
            if (r10 == r11) goto L_0x00e6
            r11 = 80
            if (r10 == r11) goto L_0x00c9
            r3 = r7
            r11 = -1
            r21 = 1
            goto L_0x0108
        L_0x00c9:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00e2
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
            r3 = r10
            r21 = 1
            goto L_0x0108
        L_0x00e2:
            r3 = r10
            r21 = 1
            goto L_0x0108
        L_0x00e6:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00f6
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
            r3 = r10
            goto L_0x0108
        L_0x00f6:
            r21 = 1
            r3 = r10
            goto L_0x0108
        L_0x00fa:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x0108:
            boolean r10 = r6.mo4096c(r2)
            if (r10 == 0) goto L_0x0111
            int r10 = r6.f3189l
            int r1 = r1 + r10
        L_0x0111:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo4083a((android.view.View) r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m4367a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo4090b((android.view.View) r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo4084a((android.view.View) r0, (int) r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x014a
        L_0x013e:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x014a:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0886as.mo4093b(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m4367a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.f3181d != i) {
            this.f3181d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f3181d;
    }

    public void setGravity(int i) {
        if (this.f3182e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3182e = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f3182e;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f3182e;
        if ((8388615 & i3) != i2) {
            this.f3182e = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f3182e;
        if ((i3 & 112) != i2) {
            this.f3182e = i2 | (i3 & -113);
            requestLayout();
        }
    }

    /* renamed from: b */
    public C0887a generateLayoutParams(AttributeSet attributeSet) {
        return new C0887a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0887a generateDefaultLayoutParams() {
        int i = this.f3181d;
        if (i == 0) {
            return new C0887a(-2, -2);
        }
        if (i == 1) {
            return new C0887a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0887a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0887a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0887a;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0886as.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0886as.class.getName());
    }

    /* renamed from: android.support.v7.widget.as$a */
    public static class C0887a extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f3193g;

        /* renamed from: h */
        public int f3194h;

        public C0887a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3194h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.LinearLayoutCompat_Layout);
            this.f3193g = obtainStyledAttributes.getFloat(C0639a.C0649j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f3194h = obtainStyledAttributes.getInt(C0639a.C0649j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0887a(int i, int i2) {
            super(i, i2);
            this.f3194h = -1;
            this.f3193g = 0.0f;
        }

        public C0887a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3194h = -1;
        }
    }
}
