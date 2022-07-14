package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.C0137a;
import android.support.constraint.p013a.p014a.C0140a;
import android.support.constraint.p013a.p014a.C0142b;
import android.support.constraint.p013a.p014a.C0147c;
import android.support.constraint.p013a.p014a.C0150d;
import android.support.constraint.p013a.p014a.C0151e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f334a = new SparseArray<>();

    /* renamed from: b */
    C0150d f335b = new C0150d();

    /* renamed from: c */
    int f336c = -1;

    /* renamed from: d */
    int f337d = -1;

    /* renamed from: e */
    int f338e = -1;

    /* renamed from: f */
    int f339f = -1;

    /* renamed from: g */
    private final ArrayList<C0147c> f340g = new ArrayList<>(100);

    /* renamed from: h */
    private boolean f341h = true;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m419b();
    }

    /* renamed from: b */
    private void m419b() {
        this.f335b.mo459a((Object) this);
        this.f334a.put(getId(), this);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0147c a = m417a(view);
        if ((view instanceof Guideline) && !(a instanceof C0151e)) {
            C0136a aVar = (C0136a) view.getLayoutParams();
            aVar.f361T = new C0151e();
            aVar.f353L = true;
            ((C0151e) aVar.f361T).mo509k(aVar.f349H);
            a = aVar.f361T;
        }
        C0150d dVar = this.f335b;
        a.mo459a((Object) view);
        this.f334a.put(view.getId(), view);
        dVar.mo517b(a);
        a.mo456a((C0147c) dVar);
        this.f341h = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f334a.remove(view.getId());
        this.f335b.mo518c(m417a(view));
        this.f341h = true;
    }

    /* renamed from: c */
    private void m421c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f340g.clear();
            m422d();
        }
    }

    /* renamed from: d */
    private void m422d() {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        C0147c a;
        C0147c a2;
        C0147c a3;
        C0147c a4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0147c a5 = m417a(childAt);
            if (a5 != null) {
                C0136a aVar = (C0136a) childAt.getLayoutParams();
                a5.mo449a();
                a5.mo456a((C0147c) this.f335b);
                a5.mo451a(childAt.getVisibility());
                a5.mo459a((Object) childAt);
                if (!aVar.f351J || !aVar.f350I) {
                    this.f340g.add(a5);
                }
                if (aVar.f353L) {
                    C0151e eVar = (C0151e) a5;
                    if (aVar.f362a != -1) {
                        eVar.mo510l(aVar.f362a);
                    }
                    if (aVar.f363b != -1) {
                        eVar.mo511m(aVar.f363b);
                    }
                    if (aVar.f364c != -1.0f) {
                        eVar.mo508e(aVar.f364c);
                    }
                } else if (!(aVar.f354M == -1 && aVar.f355N == -1 && aVar.f356O == -1 && aVar.f357P == -1 && aVar.f369h == -1 && aVar.f370i == -1 && aVar.f371j == -1 && aVar.f372k == -1 && aVar.f373l == -1 && aVar.f347F == -1 && aVar.f348G == -1)) {
                    int i6 = aVar.f354M;
                    int i7 = aVar.f355N;
                    int i8 = aVar.f356O;
                    int i9 = aVar.f357P;
                    int i10 = aVar.f358Q;
                    int i11 = aVar.f359R;
                    float f3 = aVar.f360S;
                    if (Build.VERSION.SDK_INT < 17) {
                        i6 = aVar.f365d;
                        i7 = aVar.f366e;
                        int i12 = aVar.f367f;
                        int i13 = aVar.f368g;
                        int i14 = aVar.f378q;
                        int i15 = aVar.f380s;
                        float f4 = aVar.f384w;
                        if (i6 == -1 && i7 == -1) {
                            if (aVar.f375n != -1) {
                                i6 = aVar.f375n;
                            } else if (aVar.f374m != -1) {
                                i7 = aVar.f374m;
                            }
                        }
                        if (i12 == -1 && i13 == -1) {
                            if (aVar.f376o != -1) {
                                i3 = aVar.f376o;
                                i2 = i13;
                                i = i15;
                                f = f4;
                                i4 = i14;
                            } else if (aVar.f377p != -1) {
                                i3 = i12;
                                i2 = aVar.f377p;
                                i = i15;
                                f = f4;
                                i4 = i14;
                            }
                        }
                        i3 = i12;
                        i2 = i13;
                        i = i15;
                        f = f4;
                        i4 = i14;
                    } else {
                        i3 = i8;
                        i2 = i9;
                        i = i11;
                        f = f3;
                        i4 = i10;
                    }
                    if (i6 != -1) {
                        C0147c a6 = m416a(i6);
                        if (a6 != null) {
                            f2 = f;
                            a5.mo454a(C0142b.C0146c.LEFT, a6, C0142b.C0146c.LEFT, aVar.leftMargin, i4);
                        } else {
                            f2 = f;
                        }
                    } else {
                        f2 = f;
                        if (!(i7 == -1 || (a4 = m416a(i7)) == null)) {
                            a5.mo454a(C0142b.C0146c.LEFT, a4, C0142b.C0146c.RIGHT, aVar.leftMargin, i4);
                        }
                    }
                    if (i3 != -1) {
                        C0147c a7 = m416a(i3);
                        if (a7 != null) {
                            a5.mo454a(C0142b.C0146c.RIGHT, a7, C0142b.C0146c.LEFT, aVar.rightMargin, i);
                        }
                    } else if (!(i2 == -1 || (a3 = m416a(i2)) == null)) {
                        a5.mo454a(C0142b.C0146c.RIGHT, a3, C0142b.C0146c.RIGHT, aVar.rightMargin, i);
                    }
                    if (aVar.f369h != -1) {
                        C0147c a8 = m416a(aVar.f369h);
                        if (a8 != null) {
                            a5.mo454a(C0142b.C0146c.TOP, a8, C0142b.C0146c.TOP, aVar.topMargin, aVar.f379r);
                        }
                    } else if (!(aVar.f370i == -1 || (a2 = m416a(aVar.f370i)) == null)) {
                        a5.mo454a(C0142b.C0146c.TOP, a2, C0142b.C0146c.BOTTOM, aVar.topMargin, aVar.f379r);
                    }
                    if (aVar.f371j != -1) {
                        C0147c a9 = m416a(aVar.f371j);
                        if (a9 != null) {
                            a5.mo454a(C0142b.C0146c.BOTTOM, a9, C0142b.C0146c.TOP, aVar.bottomMargin, aVar.f381t);
                        }
                    } else if (!(aVar.f372k == -1 || (a = m416a(aVar.f372k)) == null)) {
                        a5.mo454a(C0142b.C0146c.BOTTOM, a, C0142b.C0146c.BOTTOM, aVar.bottomMargin, aVar.f381t);
                    }
                    if (aVar.f373l != -1) {
                        View view = this.f334a.get(aVar.f373l);
                        C0147c a10 = m416a(aVar.f373l);
                        if (!(a10 == null || view == null || !(view.getLayoutParams() instanceof C0136a))) {
                            aVar.f352K = true;
                            ((C0136a) view.getLayoutParams()).f352K = true;
                            a5.mo448a(C0142b.C0146c.BASELINE).mo437a(a10.mo448a(C0142b.C0146c.BASELINE), 0, -1, C0142b.C0145b.STRONG, 0, true);
                            a5.mo448a(C0142b.C0146c.TOP).mo446i();
                            a5.mo448a(C0142b.C0146c.BOTTOM).mo446i();
                        }
                    }
                    if (f2 >= 0.0f && f2 != 0.5f) {
                        a5.mo450a(f2);
                    }
                    if (aVar.f385x >= 0.0f && aVar.f385x != 0.5f) {
                        a5.mo462b(aVar.f385x);
                    }
                    if (!aVar.f350I) {
                        a5.mo455a(C0147c.C0149a.MATCH_CONSTRAINT);
                        a5.mo473d(0);
                        if (aVar.width == -1) {
                            a5.mo473d(this.f335b.mo486k());
                        }
                    } else {
                        a5.mo455a(C0147c.C0149a.FIXED);
                        a5.mo473d(aVar.width);
                    }
                    if (!aVar.f351J) {
                        a5.mo465b(C0147c.C0149a.MATCH_CONSTRAINT);
                        a5.mo475e(0);
                        if (aVar.height == -1) {
                            a5.mo473d(this.f335b.mo487l());
                        }
                    } else {
                        a5.mo465b(C0147c.C0149a.FIXED);
                        a5.mo475e(aVar.height);
                    }
                    if (isInEditMode() && !(aVar.f347F == -1 && aVar.f348G == -1)) {
                        a5.mo452a(aVar.f347F, aVar.f348G);
                    }
                    if (aVar.f386y != null) {
                        a5.mo460a(aVar.f386y);
                    }
                    a5.mo468c(aVar.f343B);
                    a5.mo472d(aVar.f344C);
                    a5.mo483i(aVar.f345D);
                    a5.mo485j(aVar.f346E);
                }
            }
        }
    }

    /* renamed from: a */
    private final C0147c m416a(int i) {
        if (i == 0) {
            return this.f335b;
        }
        View view = this.f334a.get(i);
        if (view == this) {
            return this.f335b;
        }
        if (view == null) {
            return null;
        }
        return ((C0136a) view.getLayoutParams()).f361T;
    }

    /* renamed from: a */
    private final C0147c m417a(View view) {
        if (view == this) {
            return this.f335b;
        }
        if (view == null) {
            return null;
        }
        return ((C0136a) view.getLayoutParams()).f361T;
    }

    /* renamed from: a */
    private void m418a(int i, int i2) {
        int baseline;
        int i3;
        int i4;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0136a aVar = (C0136a) childAt.getLayoutParams();
                C0147c cVar = aVar.f361T;
                if (!aVar.f353L) {
                    int i6 = aVar.width;
                    int i7 = aVar.height;
                    if (aVar.f350I || aVar.f351J) {
                        if (i6 == 0) {
                            i3 = getChildMeasureSpec(i, paddingLeft, -2);
                        } else {
                            i3 = getChildMeasureSpec(i, paddingLeft, i6);
                        }
                        if (i7 == 0) {
                            i4 = getChildMeasureSpec(i2, paddingTop, -2);
                        } else {
                            i4 = getChildMeasureSpec(i2, paddingTop, i7);
                        }
                        childAt.measure(i3, i4);
                        i6 = childAt.getMeasuredWidth();
                        i7 = childAt.getMeasuredHeight();
                    }
                    cVar.mo473d(i6);
                    cVar.mo475e(i7);
                    if (aVar.f352K && (baseline = childAt.getBaseline()) != -1) {
                        cVar.mo481h(baseline);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r16.getPaddingLeft()
            int r4 = r16.getPaddingTop()
            int r5 = r0.f336c
            r6 = -1
            if (r5 == r6) goto L_0x0027
            int r7 = r0.f337d
            if (r7 == r6) goto L_0x0027
            int r8 = r0.f339f
            if (r8 == r6) goto L_0x0027
            int r9 = r0.f338e
            if (r9 == r6) goto L_0x0027
            if (r5 != r3) goto L_0x0027
            if (r7 != r4) goto L_0x0027
            if (r9 != r1) goto L_0x0027
            if (r8 == r2) goto L_0x0034
        L_0x0027:
            android.support.constraint.a.a.d r5 = r0.f335b
            r5.mo463b((int) r3)
            android.support.constraint.a.a.d r5 = r0.f335b
            r5.mo469c((int) r4)
            r16.m420b(r17, r18)
        L_0x0034:
            boolean r5 = r0.f341h
            r7 = 0
            if (r5 == 0) goto L_0x003e
            r0.f341h = r7
            r16.m421c()
        L_0x003e:
            r0.f336c = r3
            r0.f337d = r4
            r0.f338e = r1
            r0.f339f = r2
            r16.m418a(r17, r18)
            r16.m423e()
            java.util.ArrayList<android.support.constraint.a.a.c> r5 = r0.f340g
            int r5 = r5.size()
            int r8 = r16.getPaddingBottom()
            int r4 = r4 + r8
            int r8 = r16.getPaddingRight()
            int r3 = r3 + r8
            if (r5 <= 0) goto L_0x0104
            r9 = 0
            r10 = 0
        L_0x0060:
            if (r7 >= r5) goto L_0x00fe
            java.util.ArrayList<android.support.constraint.a.a.c> r11 = r0.f340g
            java.lang.Object r11 = r11.get(r7)
            android.support.constraint.a.a.c r11 = (android.support.constraint.p013a.p014a.C0147c) r11
            boolean r12 = r11 instanceof android.support.constraint.p013a.p014a.C0151e
            if (r12 == 0) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            java.lang.Object r12 = r11.mo497u()
            android.view.View r12 = (android.view.View) r12
            if (r12 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0083
        L_0x0080:
            r8 = -1
            goto L_0x00f9
        L_0x0083:
            int r13 = r11.mo486k()
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            int r15 = r11.mo487l()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r15 = (android.support.constraint.ConstraintLayout.C0136a) r15
            int r8 = r15.width
            r6 = -2
            if (r8 != r6) goto L_0x00a7
            int r6 = r15.width
            int r13 = getChildMeasureSpec(r1, r3, r6)
            goto L_0x00b1
        L_0x00a7:
            int r8 = r15.height
            if (r8 != r6) goto L_0x00b1
            int r6 = r15.height
            int r14 = getChildMeasureSpec(r2, r4, r6)
        L_0x00b1:
            r12.measure(r13, r14)
            int r6 = r12.getMeasuredWidth()
            int r8 = r12.getMeasuredHeight()
            int r13 = r11.mo486k()
            r14 = 1
            if (r6 == r13) goto L_0x00c7
            r11.mo473d((int) r6)
            r9 = 1
        L_0x00c7:
            int r6 = r11.mo487l()
            if (r8 == r6) goto L_0x00d1
            r11.mo475e(r8)
            r9 = 1
        L_0x00d1:
            boolean r6 = r15.f352K
            if (r6 == 0) goto L_0x00e6
            int r6 = r12.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00e7
            int r13 = r11.mo495t()
            if (r6 == r13) goto L_0x00e7
            r11.mo481h(r6)
            goto L_0x00e8
        L_0x00e6:
            r8 = -1
        L_0x00e7:
            r14 = r9
        L_0x00e8:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r6 < r9) goto L_0x00f8
            int r6 = r12.getMeasuredState()
            int r10 = combineMeasuredStates(r10, r6)
            r9 = r14
            goto L_0x00f9
        L_0x00f8:
            r9 = r14
        L_0x00f9:
            int r7 = r7 + 1
            r6 = -1
            goto L_0x0060
        L_0x00fe:
            if (r9 == 0) goto L_0x0103
            r16.m423e()
        L_0x0103:
            r7 = r10
        L_0x0104:
            android.support.constraint.a.a.d r5 = r0.f335b
            int r5 = r5.mo486k()
            int r5 = r5 + r3
            android.support.constraint.a.a.d r3 = r0.f335b
            int r3 = r3.mo487l()
            int r3 = r3 + r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r4 < r6) goto L_0x012b
            int r1 = resolveSizeAndState(r5, r1, r7)
            int r4 = r7 << 16
            int r2 = resolveSizeAndState(r3, r2, r4)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            r0.setMeasuredDimension(r1, r2)
            goto L_0x012e
        L_0x012b:
            r0.setMeasuredDimension(r5, r3)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private void m420b(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0147c.C0149a aVar = C0147c.C0149a.FIXED;
        C0147c.C0149a aVar2 = C0147c.C0149a.FIXED;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            aVar = C0147c.C0149a.WRAP_CONTENT;
            i3 = 0;
        } else if (mode != 0) {
            i3 = mode != 1073741824 ? 0 : size - paddingLeft;
        } else if (layoutParams.width > 0) {
            i3 = layoutParams.width;
        } else {
            aVar = C0147c.C0149a.WRAP_CONTENT;
            i3 = 0;
        }
        if (mode2 == Integer.MIN_VALUE) {
            aVar2 = C0147c.C0149a.WRAP_CONTENT;
        } else if (mode2 != 0) {
            if (mode2 == 1073741824) {
                i4 = size2 - paddingTop;
            }
        } else if (layoutParams.height > 0) {
            i4 = layoutParams.height;
        } else {
            aVar2 = C0147c.C0149a.WRAP_CONTENT;
        }
        this.f335b.mo455a(aVar);
        this.f335b.mo477f(getMinimumWidth());
        this.f335b.mo473d(i3);
        this.f335b.mo465b(aVar2);
        this.f335b.mo479g(getMinimumHeight());
        this.f335b.mo475e(i4);
    }

    /* renamed from: e */
    private void m423e() {
        C0140a.m445a(false);
        this.f335b.mo503A();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0136a aVar = (C0136a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || aVar.f353L) {
                C0147c cVar = aVar.f361T;
                int m = cVar.mo488m();
                int n = cVar.mo489n();
                childAt.layout(m, n, cVar.mo486k() + m, cVar.mo487l() + n);
            }
        }
    }

    /* renamed from: a */
    public C0136a generateLayoutParams(AttributeSet attributeSet) {
        return new C0136a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0136a generateDefaultLayoutParams() {
        return new C0136a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0136a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0136a;
    }

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0136a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        int f342A = 1;

        /* renamed from: B */
        public float f343B = 0.0f;

        /* renamed from: C */
        public float f344C = 0.0f;

        /* renamed from: D */
        public int f345D = 0;

        /* renamed from: E */
        public int f346E = 0;

        /* renamed from: F */
        public int f347F = -1;

        /* renamed from: G */
        public int f348G = -1;

        /* renamed from: H */
        public int f349H = -1;

        /* renamed from: I */
        boolean f350I = true;

        /* renamed from: J */
        boolean f351J = true;

        /* renamed from: K */
        boolean f352K = false;

        /* renamed from: L */
        boolean f353L = false;

        /* renamed from: M */
        int f354M = -1;

        /* renamed from: N */
        int f355N = -1;

        /* renamed from: O */
        int f356O = -1;

        /* renamed from: P */
        int f357P = -1;

        /* renamed from: Q */
        int f358Q = -1;

        /* renamed from: R */
        int f359R = -1;

        /* renamed from: S */
        float f360S = 0.5f;

        /* renamed from: T */
        C0147c f361T = new C0147c();

        /* renamed from: a */
        public int f362a = -1;

        /* renamed from: b */
        public int f363b = -1;

        /* renamed from: c */
        public float f364c = -1.0f;

        /* renamed from: d */
        public int f365d = -1;

        /* renamed from: e */
        public int f366e = -1;

        /* renamed from: f */
        public int f367f = -1;

        /* renamed from: g */
        public int f368g = -1;

        /* renamed from: h */
        public int f369h = -1;

        /* renamed from: i */
        public int f370i = -1;

        /* renamed from: j */
        public int f371j = -1;

        /* renamed from: k */
        public int f372k = -1;

        /* renamed from: l */
        public int f373l = -1;

        /* renamed from: m */
        public int f374m = -1;

        /* renamed from: n */
        public int f375n = -1;

        /* renamed from: o */
        public int f376o = -1;

        /* renamed from: p */
        public int f377p = -1;

        /* renamed from: q */
        public int f378q = -1;

        /* renamed from: r */
        public int f379r = -1;

        /* renamed from: s */
        public int f380s = -1;

        /* renamed from: t */
        public int f381t = -1;

        /* renamed from: u */
        public int f382u = -1;

        /* renamed from: v */
        public int f383v = -1;

        /* renamed from: w */
        public float f384w = 0.5f;

        /* renamed from: x */
        public float f385x = 0.5f;

        /* renamed from: y */
        public String f386y = null;

        /* renamed from: z */
        float f387z = 0.0f;

        public C0136a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0137a.C0138a.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.f365d = obtainStyledAttributes.getResourceId(index, this.f365d);
                    if (this.f365d == -1) {
                        this.f365d = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.f366e = obtainStyledAttributes.getResourceId(index, this.f366e);
                    if (this.f366e == -1) {
                        this.f366e = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f367f = obtainStyledAttributes.getResourceId(index, this.f367f);
                    if (this.f367f == -1) {
                        this.f367f = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.f368g = obtainStyledAttributes.getResourceId(index, this.f368g);
                    if (this.f368g == -1) {
                        this.f368g = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.f369h = obtainStyledAttributes.getResourceId(index, this.f369h);
                    if (this.f369h == -1) {
                        this.f369h = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.f370i = obtainStyledAttributes.getResourceId(index, this.f370i);
                    if (this.f370i == -1) {
                        this.f370i = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.f371j = obtainStyledAttributes.getResourceId(index, this.f371j);
                    if (this.f371j == -1) {
                        this.f371j = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.f372k = obtainStyledAttributes.getResourceId(index, this.f372k);
                    if (this.f372k == -1) {
                        this.f372k = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.f373l = obtainStyledAttributes.getResourceId(index, this.f373l);
                    if (this.f373l == -1) {
                        this.f373l = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.f347F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f347F);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.f348G = obtainStyledAttributes.getDimensionPixelOffset(index, this.f348G);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.f362a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f362a);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.f363b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f363b);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.f364c = obtainStyledAttributes.getFloat(index, this.f364c);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_android_orientation) {
                    this.f349H = obtainStyledAttributes.getInt(index, this.f349H);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.f374m = obtainStyledAttributes.getResourceId(index, this.f374m);
                    if (this.f374m == -1) {
                        this.f374m = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.f375n = obtainStyledAttributes.getResourceId(index, this.f375n);
                    if (this.f375n == -1) {
                        this.f375n = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.f376o = obtainStyledAttributes.getResourceId(index, this.f376o);
                    if (this.f376o == -1) {
                        this.f376o = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.f377p = obtainStyledAttributes.getResourceId(index, this.f377p);
                    if (this.f377p == -1) {
                        this.f377p = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.f378q = obtainStyledAttributes.getDimensionPixelSize(index, this.f378q);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.f379r = obtainStyledAttributes.getDimensionPixelSize(index, this.f379r);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.f380s = obtainStyledAttributes.getDimensionPixelSize(index, this.f380s);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.f381t = obtainStyledAttributes.getDimensionPixelSize(index, this.f381t);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.f382u = obtainStyledAttributes.getDimensionPixelSize(index, this.f382u);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.f383v = obtainStyledAttributes.getDimensionPixelSize(index, this.f383v);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.f384w = obtainStyledAttributes.getFloat(index, this.f384w);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.f385x = obtainStyledAttributes.getFloat(index, this.f385x);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.f386y = obtainStyledAttributes.getString(index);
                    this.f387z = Float.NaN;
                    this.f342A = -1;
                    String str = this.f386y;
                    if (str != null) {
                        int length = str.length();
                        int indexOf = this.f386y.indexOf(44);
                        if (indexOf <= 0 || indexOf >= length - 1) {
                            i = 0;
                        } else {
                            String substring = this.f386y.substring(0, indexOf);
                            if (substring.equalsIgnoreCase("W")) {
                                this.f342A = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                this.f342A = 1;
                            }
                            i = indexOf + 1;
                        }
                        int indexOf2 = this.f386y.indexOf(58);
                        if (indexOf2 < 0 || indexOf2 >= length - 1) {
                            String substring2 = this.f386y.substring(i);
                            if (substring2.length() > 0) {
                                this.f387z = Float.parseFloat(substring2);
                            }
                        } else {
                            String substring3 = this.f386y.substring(i, indexOf2);
                            String substring4 = this.f386y.substring(indexOf2 + 1);
                            if (substring3.length() > 0 && substring4.length() > 0) {
                                try {
                                    float parseFloat = Float.parseFloat(substring3);
                                    float parseFloat2 = Float.parseFloat(substring4);
                                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                        if (this.f342A == 1) {
                                            this.f387z = Math.abs(parseFloat2 / parseFloat);
                                        } else {
                                            this.f387z = Math.abs(parseFloat / parseFloat2);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.f343B = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.f344C = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.f345D = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.f346E = obtainStyledAttributes.getInt(index, 0);
                } else if (!(index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintLeft_creator || index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintTop_creator || index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintRight_creator || index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintBottom_creator || index == C0137a.C0138a.ConstraintLayout_Layout_layout_constraintBaseline_creator)) {
                    Log.w("ConstraintLayout", "Unknown attribute 0x" + Integer.toHexString(index));
                }
            }
            mo401a();
        }

        /* renamed from: a */
        public void mo401a() {
            this.f353L = false;
            this.f350I = true;
            this.f351J = true;
            if (this.width == 0 || this.width == -1) {
                this.f350I = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.f351J = false;
            }
            if (this.f364c != -1.0f || this.f362a != -1 || this.f363b != -1) {
                this.f353L = true;
                this.f350I = true;
                this.f351J = true;
                if (!(this.f361T instanceof C0151e)) {
                    this.f361T = new C0151e();
                }
                ((C0151e) this.f361T).mo509k(this.f349H);
            }
        }

        public C0136a(int i, int i2) {
            super(i, i2);
        }

        public C0136a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            try {
                this.width = typedArray.getLayoutDimension(i, "layout_width");
                this.height = typedArray.getLayoutDimension(i2, "layout_height");
            } catch (RuntimeException unused) {
            }
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            super.resolveLayoutDirection(i);
            this.f356O = -1;
            this.f357P = -1;
            this.f354M = -1;
            this.f355N = -1;
            this.f358Q = -1;
            this.f359R = -1;
            this.f358Q = this.f378q;
            this.f359R = this.f380s;
            this.f360S = this.f384w;
            boolean z = true;
            if (1 != getLayoutDirection()) {
                z = false;
            }
            if (z) {
                int i2 = this.f374m;
                if (i2 != -1) {
                    this.f356O = i2;
                } else {
                    int i3 = this.f375n;
                    if (i3 != -1) {
                        this.f357P = i3;
                    }
                }
                int i4 = this.f376o;
                if (i4 != -1) {
                    this.f355N = i4;
                }
                int i5 = this.f377p;
                if (i5 != -1) {
                    this.f354M = i5;
                }
                int i6 = this.f382u;
                if (i6 != -1) {
                    this.f359R = i6;
                }
                int i7 = this.f383v;
                if (i7 != -1) {
                    this.f358Q = i7;
                }
                this.f360S = 1.0f - this.f384w;
            } else {
                int i8 = this.f374m;
                if (i8 != -1) {
                    this.f355N = i8;
                }
                int i9 = this.f375n;
                if (i9 != -1) {
                    this.f354M = i9;
                }
                int i10 = this.f376o;
                if (i10 != -1) {
                    this.f356O = i10;
                }
                int i11 = this.f377p;
                if (i11 != -1) {
                    this.f357P = i11;
                }
                int i12 = this.f382u;
                if (i12 != -1) {
                    this.f358Q = i12;
                }
                int i13 = this.f383v;
                if (i13 != -1) {
                    this.f359R = i13;
                }
            }
            if (this.f376o == -1 && this.f377p == -1) {
                int i14 = this.f367f;
                if (i14 != -1) {
                    this.f356O = i14;
                } else {
                    int i15 = this.f368g;
                    if (i15 != -1) {
                        this.f357P = i15;
                    }
                }
            }
            if (this.f375n == -1 && this.f374m == -1) {
                int i16 = this.f365d;
                if (i16 != -1) {
                    this.f354M = i16;
                    return;
                }
                int i17 = this.f366e;
                if (i17 != -1) {
                    this.f355N = i17;
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f341h = true;
    }
}
