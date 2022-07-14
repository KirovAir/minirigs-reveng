package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0241a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.p031c.C0491a;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0634p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0346b<V> {

    /* renamed from: a */
    int f1044a;

    /* renamed from: b */
    int f1045b;

    /* renamed from: c */
    int f1046c;

    /* renamed from: d */
    boolean f1047d;

    /* renamed from: e */
    int f1048e = 4;

    /* renamed from: f */
    C0634p f1049f;

    /* renamed from: g */
    int f1050g;

    /* renamed from: h */
    WeakReference<V> f1051h;

    /* renamed from: i */
    WeakReference<View> f1052i;

    /* renamed from: j */
    int f1053j;

    /* renamed from: k */
    boolean f1054k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f1055l = true;

    /* renamed from: m */
    private float f1056m;

    /* renamed from: n */
    private int f1057n;

    /* renamed from: o */
    private boolean f1058o;

    /* renamed from: p */
    private int f1059p;

    /* renamed from: q */
    private int f1060q;

    /* renamed from: r */
    private boolean f1061r;

    /* renamed from: s */
    private boolean f1062s;

    /* renamed from: t */
    private int f1063t;

    /* renamed from: u */
    private boolean f1064u;

    /* renamed from: v */
    private C0339a f1065v;

    /* renamed from: w */
    private VelocityTracker f1066w;

    /* renamed from: x */
    private int f1067x;

    /* renamed from: y */
    private Map<View, Integer> f1068y;

    /* renamed from: z */
    private final C0634p.C0637a f1069z = new C0634p.C0637a() {
        /* renamed from: a */
        public boolean mo1146a(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.f1048e == 1 || BottomSheetBehavior.this.f1054k) {
                return false;
            }
            if ((BottomSheetBehavior.this.f1048e != 3 || BottomSheetBehavior.this.f1053j != i || (view2 = (View) BottomSheetBehavior.this.f1052i.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f1051h != null && BottomSheetBehavior.this.f1051h.get() == view) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo1145a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo1139c(i2);
        }

        /* renamed from: a */
        public void mo1143a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo1137b(1);
            }
        }

        /* renamed from: a */
        public void mo1144a(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                if (BottomSheetBehavior.this.f1055l) {
                    i = BottomSheetBehavior.this.f1044a;
                    i2 = 3;
                } else if (view.getTop() > BottomSheetBehavior.this.f1045b) {
                    i = BottomSheetBehavior.this.f1045b;
                    i2 = 6;
                } else {
                    i = 0;
                    i2 = 3;
                }
            } else if (BottomSheetBehavior.this.f1047d && BottomSheetBehavior.this.mo1136a(view, f2) && (view.getTop() > BottomSheetBehavior.this.f1046c || Math.abs(f) < Math.abs(f2))) {
                i = BottomSheetBehavior.this.f1050g;
                i2 = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top = view.getTop();
                if (BottomSheetBehavior.this.f1055l) {
                    if (Math.abs(top - BottomSheetBehavior.this.f1044a) < Math.abs(top - BottomSheetBehavior.this.f1046c)) {
                        i = BottomSheetBehavior.this.f1044a;
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.f1046c;
                    }
                } else if (top < BottomSheetBehavior.this.f1045b) {
                    if (top < Math.abs(top - BottomSheetBehavior.this.f1046c)) {
                        i = 0;
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.f1045b;
                        i2 = 6;
                    }
                } else if (Math.abs(top - BottomSheetBehavior.this.f1045b) < Math.abs(top - BottomSheetBehavior.this.f1046c)) {
                    i = BottomSheetBehavior.this.f1045b;
                    i2 = 6;
                } else {
                    i = BottomSheetBehavior.this.f1046c;
                }
            } else {
                i = BottomSheetBehavior.this.f1046c;
            }
            if (BottomSheetBehavior.this.f1049f.mo2458a(view.getLeft(), i)) {
                BottomSheetBehavior.this.mo1137b(2);
                C0594r.m2587a(view, (Runnable) new C0342c(view, i2));
                return;
            }
            BottomSheetBehavior.this.mo1137b(i2);
        }

        /* renamed from: a */
        public int mo1142a(View view, int i, int i2) {
            return C0491a.m2181a(i, BottomSheetBehavior.this.m1268e(), BottomSheetBehavior.this.f1047d ? BottomSheetBehavior.this.f1050g : BottomSheetBehavior.this.f1046c);
        }

        /* renamed from: b */
        public int mo1147b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public int mo1141a(View view) {
            if (BottomSheetBehavior.this.f1047d) {
                return BottomSheetBehavior.this.f1050g;
            }
            return BottomSheetBehavior.this.f1046c;
        }
    };

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0339a {
        /* renamed from: a */
        public abstract void mo1148a(View view, float f);

        /* renamed from: a */
        public abstract void mo1149a(View view, int i);
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0241a.C0250i.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            mo1133a(obtainStyledAttributes.getDimensionPixelSize(C0241a.C0250i.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            mo1133a(peekValue.data);
        }
        mo1138b(obtainStyledAttributes.getBoolean(C0241a.C0250i.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo1134a(obtainStyledAttributes.getBoolean(C0241a.C0250i.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo1140c(obtainStyledAttributes.getBoolean(C0241a.C0250i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f1056m = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    public Parcelable mo1065b(CoordinatorLayout coordinatorLayout, V v) {
        return new C0340b(super.mo1065b(coordinatorLayout, v), this.f1048e);
    }

    /* renamed from: a */
    public void mo1053a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0340b bVar = (C0340b) parcelable;
        super.mo1053a(coordinatorLayout, v, bVar.mo2188a());
        if (bVar.f1071a == 1 || bVar.f1071a == 2) {
            this.f1048e = 4;
        } else {
            this.f1048e = bVar.f1071a;
        }
    }

    /* renamed from: a */
    public boolean mo836a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0594r.m2615p(coordinatorLayout) && !C0594r.m2615p(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1168a((View) v, i);
        this.f1050g = coordinatorLayout.getHeight();
        if (this.f1058o) {
            if (this.f1059p == 0) {
                this.f1059p = coordinatorLayout.getResources().getDimensionPixelSize(C0241a.C0244c.design_bottom_sheet_peek_height_min);
            }
            this.f1060q = Math.max(this.f1059p, this.f1050g - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f1060q = this.f1057n;
        }
        this.f1044a = Math.max(0, this.f1050g - v.getHeight());
        this.f1045b = this.f1050g / 2;
        m1262a();
        int i2 = this.f1048e;
        if (i2 == 3) {
            C0594r.m2601e(v, m1268e());
        } else if (i2 == 6) {
            C0594r.m2601e(v, this.f1045b);
        } else if (!this.f1047d || i2 != 5) {
            int i3 = this.f1048e;
            if (i3 == 4) {
                C0594r.m2601e(v, this.f1046c);
            } else if (i3 == 1 || i3 == 2) {
                C0594r.m2601e(v, top - v.getTop());
            }
        } else {
            C0594r.m2601e(v, this.f1050g);
        }
        if (this.f1049f == null) {
            this.f1049f = C0634p.m2821a((ViewGroup) coordinatorLayout, this.f1069z);
        }
        this.f1051h = new WeakReference<>(v);
        this.f1052i = new WeakReference<>(mo1132a((View) v));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1120b(android.support.design.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r8.f1062s = r2
            return r1
        L_0x000b:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r8.m1265b()
        L_0x0014:
            android.view.VelocityTracker r3 = r8.f1066w
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r8.f1066w = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r8.f1066w
            r3.addMovement(r11)
            r3 = 3
            r4 = 0
            r5 = -1
            if (r0 == r3) goto L_0x006c
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x006c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0077
        L_0x002c:
            float r3 = r11.getX()
            int r3 = (int) r3
            float r6 = r11.getY()
            int r6 = (int) r6
            r8.f1067x = r6
            java.lang.ref.WeakReference<android.view.View> r6 = r8.f1052i
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0044
        L_0x0043:
            r6 = r4
        L_0x0044:
            if (r6 == 0) goto L_0x005a
            int r7 = r8.f1067x
            boolean r6 = r9.mo1175a((android.view.View) r6, (int) r3, (int) r7)
            if (r6 == 0) goto L_0x005a
            int r6 = r11.getActionIndex()
            int r6 = r11.getPointerId(r6)
            r8.f1053j = r6
            r8.f1054k = r2
        L_0x005a:
            int r6 = r8.f1053j
            if (r6 != r5) goto L_0x0068
            int r5 = r8.f1067x
            boolean r10 = r9.mo1175a((android.view.View) r10, (int) r3, (int) r5)
            if (r10 != 0) goto L_0x0068
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = 0
        L_0x0069:
            r8.f1062s = r10
            goto L_0x0077
        L_0x006c:
            r8.f1054k = r1
            r8.f1053j = r5
            boolean r10 = r8.f1062s
            if (r10 == 0) goto L_0x0077
            r8.f1062s = r1
            return r1
        L_0x0077:
            boolean r10 = r8.f1062s
            if (r10 != 0) goto L_0x0086
            android.support.v4.widget.p r10 = r8.f1049f
            if (r10 == 0) goto L_0x0086
            boolean r10 = r10.mo2459a((android.view.MotionEvent) r11)
            if (r10 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.f1052i
            if (r10 == 0) goto L_0x0091
            java.lang.Object r10 = r10.get()
            r4 = r10
            android.view.View r4 = (android.view.View) r4
        L_0x0091:
            r10 = 2
            if (r0 != r10) goto L_0x00ca
            if (r4 == 0) goto L_0x00ca
            boolean r10 = r8.f1062s
            if (r10 != 0) goto L_0x00ca
            int r10 = r8.f1048e
            if (r10 == r2) goto L_0x00ca
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r9 = r9.mo1175a((android.view.View) r4, (int) r10, (int) r0)
            if (r9 != 0) goto L_0x00ca
            android.support.v4.widget.p r9 = r8.f1049f
            if (r9 == 0) goto L_0x00ca
            int r9 = r8.f1067x
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            android.support.v4.widget.p r10 = r8.f1049f
            int r10 = r10.mo2455a()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo1120b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo1011a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1048e == 1 && actionMasked == 0) {
            return true;
        }
        C0634p pVar = this.f1049f;
        if (pVar != null) {
            pVar.mo2464b(motionEvent);
        }
        if (actionMasked == 0) {
            m1265b();
        }
        if (this.f1066w == null) {
            this.f1066w = VelocityTracker.obtain();
        }
        this.f1066w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f1062s && Math.abs(((float) this.f1067x) - motionEvent.getY()) > ((float) this.f1049f.mo2455a())) {
            this.f1049f.mo2456a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f1062s;
    }

    /* renamed from: a */
    public boolean mo867a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1063t = 0;
        this.f1064u = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo1056a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f1052i.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m1268e()) {
                    iArr[1] = top - m1268e();
                    C0594r.m2601e(v, -iArr[1]);
                    mo1137b(3);
                } else {
                    iArr[1] = i2;
                    C0594r.m2601e(v, -i2);
                    mo1137b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f1046c;
                if (i4 <= i5 || this.f1047d) {
                    iArr[1] = i2;
                    C0594r.m2601e(v, -i2);
                    mo1137b(1);
                } else {
                    iArr[1] = top - i5;
                    C0594r.m2601e(v, -iArr[1]);
                    mo1137b(4);
                }
            }
            mo1139c(v.getTop());
            this.f1063t = i2;
            this.f1064u = true;
        }
    }

    /* renamed from: a */
    public void mo1054a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == m1268e()) {
            mo1137b(3);
        } else if (view == this.f1052i.get() && this.f1064u) {
            if (this.f1063t > 0) {
                i2 = m1268e();
            } else if (this.f1047d && mo1136a(v, m1266d())) {
                i2 = this.f1050g;
                i3 = 5;
            } else if (this.f1063t == 0) {
                int top = v.getTop();
                if (!this.f1055l) {
                    int i4 = this.f1045b;
                    if (top < i4) {
                        if (top < Math.abs(top - this.f1046c)) {
                            i2 = 0;
                        } else {
                            i2 = this.f1045b;
                            i3 = 6;
                        }
                    } else if (Math.abs(top - i4) < Math.abs(top - this.f1046c)) {
                        i2 = this.f1045b;
                        i3 = 6;
                    } else {
                        i2 = this.f1046c;
                        i3 = 4;
                    }
                } else if (Math.abs(top - this.f1044a) < Math.abs(top - this.f1046c)) {
                    i2 = this.f1044a;
                } else {
                    i2 = this.f1046c;
                    i3 = 4;
                }
            } else {
                i2 = this.f1046c;
                i3 = 4;
            }
            if (this.f1049f.mo2460a((View) v, v.getLeft(), i2)) {
                mo1137b(2);
                C0594r.m2587a((View) v, (Runnable) new C0342c(v, i3));
            } else {
                mo1137b(i3);
            }
            this.f1064u = false;
        }
    }

    /* renamed from: a */
    public boolean mo1135a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f1052i.get() && (this.f1048e != 3 || super.mo1135a(coordinatorLayout, v, view, f, f2));
    }

    /* renamed from: a */
    public void mo1134a(boolean z) {
        if (this.f1055l != z) {
            this.f1055l = z;
            if (this.f1051h != null) {
                m1262a();
            }
            mo1137b((!this.f1055l || this.f1048e != 6) ? this.f1048e : 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1133a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f1058o
            if (r4 != 0) goto L_0x0015
            r3.f1058o = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f1058o
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f1057n
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f1058o = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f1057n = r1
            int r1 = r3.f1050g
            int r1 = r1 - r4
            r3.f1046c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f1048e
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f1051h
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo1133a(int):void");
    }

    /* renamed from: b */
    public void mo1138b(boolean z) {
        this.f1047d = z;
    }

    /* renamed from: c */
    public void mo1140c(boolean z) {
        this.f1061r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1137b(int i) {
        C0339a aVar;
        if (this.f1048e != i) {
            this.f1048e = i;
            if (i == 6 || i == 3) {
                m1267d(true);
            } else if (i == 5 || i == 4) {
                m1267d(false);
            }
            View view = (View) this.f1051h.get();
            if (view != null && (aVar = this.f1065v) != null) {
                aVar.mo1149a(view, i);
            }
        }
    }

    /* renamed from: a */
    private void m1262a() {
        if (this.f1055l) {
            this.f1046c = Math.max(this.f1050g - this.f1060q, this.f1044a);
        } else {
            this.f1046c = this.f1050g - this.f1060q;
        }
    }

    /* renamed from: b */
    private void m1265b() {
        this.f1053j = -1;
        VelocityTracker velocityTracker = this.f1066w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1066w = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1136a(View view, float f) {
        if (this.f1061r) {
            return true;
        }
        if (view.getTop() >= this.f1046c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f1046c)) / ((float) this.f1057n) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo1132a(View view) {
        if (C0594r.m2620u(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo1132a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: d */
    private float m1266d() {
        VelocityTracker velocityTracker = this.f1066w;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f1056m);
        return this.f1066w.getYVelocity(this.f1053j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m1268e() {
        if (this.f1055l) {
            return this.f1044a;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1139c(int i) {
        C0339a aVar;
        View view = (View) this.f1051h.get();
        if (view != null && (aVar = this.f1065v) != null) {
            int i2 = this.f1046c;
            if (i > i2) {
                aVar.mo1148a(view, ((float) (i2 - i)) / ((float) (this.f1050g - i2)));
            } else {
                aVar.mo1148a(view, ((float) (i2 - i)) / ((float) (i2 - m1268e())));
            }
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$c */
    private class C0342c implements Runnable {

        /* renamed from: b */
        private final View f1073b;

        /* renamed from: c */
        private final int f1074c;

        C0342c(View view, int i) {
            this.f1073b = view;
            this.f1074c = i;
        }

        public void run() {
            if (BottomSheetBehavior.this.f1049f == null || !BottomSheetBehavior.this.f1049f.mo2461a(true)) {
                BottomSheetBehavior.this.mo1137b(this.f1074c);
            } else {
                C0594r.m2587a(this.f1073b, (Runnable) this);
            }
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    protected static class C0340b extends C0556a {
        public static final Parcelable.Creator<C0340b> CREATOR = new Parcelable.ClassLoaderCreator<C0340b>() {
            /* renamed from: a */
            public C0340b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0340b(parcel, classLoader);
            }

            /* renamed from: a */
            public C0340b createFromParcel(Parcel parcel) {
                return new C0340b(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0340b[] newArray(int i) {
                return new C0340b[i];
            }
        };

        /* renamed from: a */
        final int f1071a;

        public C0340b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1071a = parcel.readInt();
        }

        public C0340b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1071a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1071a);
        }
    }

    /* renamed from: d */
    private void m1267d(boolean z) {
        WeakReference<V> weakReference = this.f1051h;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f1068y == null) {
                        this.f1068y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f1051h.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f1068y;
                            if (map != null && map.containsKey(childAt)) {
                                C0594r.m2592b(childAt, this.f1068y.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f1068y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C0594r.m2592b(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f1068y = null;
                }
            }
        }
    }
}
