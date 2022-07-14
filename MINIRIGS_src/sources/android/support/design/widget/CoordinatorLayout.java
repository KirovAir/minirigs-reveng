package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p010b.C0110a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.p035g.C0526i;
import android.support.p026v4.p035g.C0527j;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0590n;
import android.support.p026v4.p036h.C0591o;
import android.support.p026v4.p036h.C0592p;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0608z;
import android.support.p026v4.widget.C0623f;
import android.support.p026v4.widget.C0638q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0590n {

    /* renamed from: a */
    static final String f1078a;

    /* renamed from: b */
    static final Class<?>[] f1079b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<C0346b>>> f1080c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f1081d;

    /* renamed from: f */
    private static final C0527j.C0528a<Rect> f1082f = new C0527j.C0530c(12);

    /* renamed from: e */
    ViewGroup.OnHierarchyChangeListener f1083e;

    /* renamed from: g */
    private final List<View> f1084g;

    /* renamed from: h */
    private final C0623f<View> f1085h;

    /* renamed from: i */
    private final List<View> f1086i;

    /* renamed from: j */
    private final List<View> f1087j;

    /* renamed from: k */
    private final int[] f1088k;

    /* renamed from: l */
    private Paint f1089l;

    /* renamed from: m */
    private boolean f1090m;

    /* renamed from: n */
    private boolean f1091n;

    /* renamed from: o */
    private int[] f1092o;

    /* renamed from: p */
    private View f1093p;

    /* renamed from: q */
    private View f1094q;

    /* renamed from: r */
    private C0350f f1095r;

    /* renamed from: s */
    private boolean f1096s;

    /* renamed from: t */
    private C0608z f1097t;

    /* renamed from: u */
    private boolean f1098u;

    /* renamed from: v */
    private Drawable f1099v;

    /* renamed from: w */
    private C0592p f1100w;

    /* renamed from: x */
    private final C0591o f1101x;

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0345a {
        C0346b getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    public @interface C0347c {
        /* renamed from: a */
        Class<? extends C0346b> mo1237a();
    }

    /* renamed from: a */
    private static int m1300a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: c */
    private static int m1313c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m1314d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m1316e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r0 = android.support.design.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f1078a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            android.support.design.widget.CoordinatorLayout$h r0 = new android.support.design.widget.CoordinatorLayout$h
            r0.<init>()
            f1081d = r0
            goto L_0x0021
        L_0x001f:
            f1081d = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1079b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1080c = r0
            android.support.v4.g.j$c r0 = new android.support.v4.g.j$c
            r1 = 12
            r0.<init>(r1)
            f1082f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.<clinit>():void");
    }

    /* renamed from: e */
    private static Rect m1317e() {
        Rect a = f1082f.mo2086a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: a */
    private static void m1302a(Rect rect) {
        rect.setEmpty();
        f1082f.mo2087a(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0110a.C0111a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f1084g = new ArrayList();
        this.f1085h = new C0623f<>();
        this.f1086i = new ArrayList();
        this.f1087j = new ArrayList();
        this.f1088k = new int[2];
        this.f1101x = new C0591o(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0110a.C0113c.CoordinatorLayout, 0, C0110a.C0112b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0110a.C0113c.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(C0110a.C0113c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1092o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1092o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1092o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1099v = typedArray.getDrawable(C0110a.C0113c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m1322g();
        super.setOnHierarchyChangeListener(new C0348d());
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1083e = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1308a(false);
        if (this.f1096s) {
            if (this.f1095r == null) {
                this.f1095r = new C0350f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1095r);
        }
        if (this.f1097t == null && C0594r.m2615p(this)) {
            C0594r.m2614o(this);
        }
        this.f1091n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1308a(false);
        if (this.f1096s && this.f1095r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1095r);
        }
        View view = this.f1094q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1091n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1099v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1099v = drawable3;
            Drawable drawable4 = this.f1099v;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f1099v.setState(getDrawableState());
                }
                C0540a.m2385b(this.f1099v, C0594r.m2602f(this));
                this.f1099v.setVisible(getVisibility() == 0, false);
                this.f1099v.setCallback(this);
            }
            C0594r.m2598d(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f1099v;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1099v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1099v;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1099v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1099v.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0391a.m1620a(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0608z mo1165a(C0608z zVar) {
        if (C0526i.m2306a(this.f1097t, zVar)) {
            return zVar;
        }
        this.f1097t = zVar;
        boolean z = true;
        this.f1098u = zVar != null && zVar.mo2315b() > 0;
        if (this.f1098u || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0608z b = m1311b(zVar);
        requestLayout();
        return b;
    }

    public final C0608z getLastWindowInsets() {
        return this.f1097t;
    }

    /* renamed from: a */
    private void m1308a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0346b b = ((C0349e) childAt.getLayoutParams()).mo1248b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    b.mo1120b(this, childAt, obtain);
                } else {
                    b.mo1011a(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0349e) getChildAt(i2).getLayoutParams()).mo1254f();
        }
        this.f1093p = null;
        this.f1090m = false;
    }

    /* renamed from: a */
    private void m1307a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1081d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private boolean m1309a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1086i;
        m1307a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0349e eVar = (C0349e) view.getLayoutParams();
            C0346b b = eVar.mo1248b();
            if ((z || z2) && actionMasked != 0) {
                if (b != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            b.mo1120b(this, view, motionEvent3);
                            break;
                        case 1:
                            b.mo1011a(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && b != null) {
                    switch (i) {
                        case 0:
                            z = b.mo1120b(this, view, motionEvent2);
                            break;
                        case 1:
                            z = b.mo1011a(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f1093p = view;
                    }
                }
                boolean e = eVar.mo1253e();
                boolean a = eVar.mo1246a(this, view);
                z2 = a && !e;
                if (a && !z2) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1308a(true);
        }
        boolean a = m1309a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1308a(true);
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1093p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m1309a((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002e
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f1093p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$e r6 = (android.support.design.widget.CoordinatorLayout.C0349e) r6
            android.support.design.widget.CoordinatorLayout$b r6 = r6.mo1248b()
            if (r6 == 0) goto L_0x002d
            android.view.View r7 = r0.f1093p
            boolean r6 = r6.mo1011a((android.support.design.widget.CoordinatorLayout) r0, r7, (android.view.MotionEvent) r1)
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            android.view.View r7 = r0.f1093p
            r8 = 0
            if (r7 != 0) goto L_0x0039
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004c
        L_0x0039:
            if (r3 == 0) goto L_0x004c
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004c:
            if (r8 == 0) goto L_0x0051
            r8.recycle()
        L_0x0051:
            if (r2 == r4) goto L_0x0056
            r1 = 3
            if (r2 != r1) goto L_0x0059
        L_0x0056:
            r0.m1308a((boolean) r5)
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1090m) {
            m1308a(false);
            this.f1090m = true;
        }
    }

    /* renamed from: b */
    private int m1310b(int i) {
        int[] iArr = this.f1092o;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: a */
    static C0346b m1301a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1078a)) {
            str = f1078a + '.' + str;
        }
        try {
            Map map = f1080c.get();
            if (map == null) {
                map = new HashMap();
                f1080c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f1079b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0346b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0349e mo1163a(View view) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (!eVar.f1105b) {
            if (view instanceof C0345a) {
                C0346b behavior = ((C0345a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo1244a(behavior);
                eVar.f1105b = true;
            } else {
                C0347c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0347c) cls.getAnnotation(C0347c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo1244a((C0346b) cVar.mo1237a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.mo1237a().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e);
                    }
                }
                eVar.f1105b = true;
            }
        }
        return eVar;
    }

    /* renamed from: f */
    private void m1320f() {
        this.f1084g.clear();
        this.f1085h.mo2441a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0349e a = mo1163a(childAt);
            a.mo1249b(this, childAt);
            this.f1085h.mo2442a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a.mo1247a(this, childAt, childAt2)) {
                        if (!this.f1085h.mo2445b(childAt2)) {
                            this.f1085h.mo2442a(childAt2);
                        }
                        this.f1085h.mo2443a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1084g.addAll(this.f1085h.mo2444b());
        Collections.reverse(this.f1084g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1173a(View view, Rect rect) {
        C0638q.m2866b(this, view, rect);
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a */
    public void mo1169a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        if (r0.mo1061a(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1320f()
            r30.mo1166a()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = android.support.p026v4.p036h.C0594r.m2602f(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.h.z r3 = r7.f1097t
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p026v4.p036h.C0594r.m2615p(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1084g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x0170
            java.util.List<android.view.View> r0 = r7.f1084g
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x016a
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$e r1 = (android.support.design.widget.CoordinatorLayout.C0349e) r1
            int r0 = r1.f1108e
            if (r0 < 0) goto L_0x00bc
            if (r13 == 0) goto L_0x00bc
            int r0 = r1.f1108e
            int r0 = r7.m1310b((int) r0)
            int r11 = r1.f1106c
            int r11 = m1314d((int) r11)
            int r11 = android.support.p026v4.p036h.C0579d.m2523a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00c1
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00c1
        L_0x00ba:
            r11 = 0
            goto L_0x00bf
        L_0x00bc:
            r22 = r2
            r11 = 0
        L_0x00bf:
            r21 = 0
        L_0x00c1:
            if (r19 == 0) goto L_0x00f3
            boolean r0 = android.support.p026v4.p036h.C0594r.m2615p(r20)
            if (r0 != 0) goto L_0x00f3
            android.support.v4.h.z r0 = r7.f1097t
            int r0 = r0.mo2313a()
            android.support.v4.h.z r2 = r7.f1097t
            int r2 = r2.mo2316c()
            int r0 = r0 + r2
            android.support.v4.h.z r2 = r7.f1097t
            int r2 = r2.mo2315b()
            android.support.v4.h.z r11 = r7.f1097t
            int r11 = r11.mo2317d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f7
        L_0x00f3:
            r11 = r31
            r23 = r32
        L_0x00f7:
            android.support.design.widget.CoordinatorLayout$b r0 = r1.mo1248b()
            if (r0 == 0) goto L_0x011e
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo1061a((android.support.design.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011e:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo1169a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x016a:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x0170:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private C0608z m1311b(C0608z zVar) {
        C0346b b;
        if (zVar.mo2318e()) {
            return zVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0594r.m2615p(childAt) && (b = ((C0349e) childAt.getLayoutParams()).mo1248b()) != null) {
                zVar = b.mo1225a(this, childAt, zVar);
                if (zVar.mo2318e()) {
                    break;
                }
            }
        }
        return zVar;
    }

    /* renamed from: a */
    public void mo1168a(View view, int i) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (eVar.mo1252d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.f1114k != null) {
            m1306a(view, eVar.f1114k, i);
        } else if (eVar.f1108e >= 0) {
            m1312b(view, eVar.f1108e, i);
        } else {
            m1315d(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0346b b;
        int f = C0594r.m2602f(this);
        int size = this.f1084g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1084g.get(i5);
            if (view.getVisibility() != 8 && ((b = ((C0349e) view.getLayoutParams()).mo1248b()) == null || !b.mo836a(this, view, f))) {
                mo1168a(view, f);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1098u && this.f1099v != null) {
            C0608z zVar = this.f1097t;
            int b = zVar != null ? zVar.mo2315b() : 0;
            if (b > 0) {
                this.f1099v.setBounds(0, 0, getWidth(), b);
                this.f1099v.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1322g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1180b(View view, Rect rect) {
        ((C0349e) view.getLayoutParams()).mo1243a(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1185c(View view, Rect rect) {
        rect.set(((C0349e) view.getLayoutParams()).mo1251c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1174a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo1173a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m1304a(View view, int i, Rect rect, Rect rect2, C0349e eVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0579d.m2523a(m1316e(eVar.f1106c), i);
        int a2 = C0579d.m2523a(m1313c(eVar.f1107d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m1303a(C0349e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1172a(View view, int i, Rect rect, Rect rect2) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1304a(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        m1303a(eVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m1306a(View view, View view2, int i) {
        Rect e = m1317e();
        Rect e2 = m1317e();
        try {
            mo1173a(view2, e);
            mo1172a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m1302a(e);
            m1302a(e2);
        }
    }

    /* renamed from: b */
    private void m1312b(View view, int i, int i2) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        int a = C0579d.m2523a(m1314d(eVar.f1106c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1310b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: d */
    private void m1315d(View view, int i) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        Rect e = m1317e();
        e.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f1097t != null && C0594r.m2615p(this) && !C0594r.m2615p(view)) {
            e.left += this.f1097t.mo2313a();
            e.top += this.f1097t.mo2315b();
            e.right -= this.f1097t.mo2316c();
            e.bottom -= this.f1097t.mo2317d();
        }
        Rect e2 = m1317e();
        C0579d.m2524a(m1313c(eVar.f1106c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m1302a(e);
        m1302a(e2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (eVar.f1104a != null) {
            float d = eVar.f1104a.mo1234d(this, view);
            if (d > 0.0f) {
                if (this.f1089l == null) {
                    this.f1089l = new Paint();
                }
                this.f1089l.setColor(eVar.f1104a.mo1231c(this, view));
                this.f1089l.setAlpha(m1300a(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1089l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1167a(int i) {
        boolean z;
        int i2 = i;
        int f = C0594r.m2602f(this);
        int size = this.f1084g.size();
        Rect e = m1317e();
        Rect e2 = m1317e();
        Rect e3 = m1317e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1084g.get(i3);
            C0349e eVar = (C0349e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.f1115l == this.f1084g.get(i4)) {
                        mo1179b(view, f);
                    }
                }
                mo1174a(view, true, e2);
                if (eVar.f1110g != 0 && !e2.isEmpty()) {
                    int a = C0579d.m2523a(eVar.f1110g, f);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i6 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (eVar.f1111h != 0 && view.getVisibility() == 0) {
                    m1305a(view, e, f);
                }
                if (i2 != 2) {
                    mo1185c(view, e3);
                    if (!e3.equals(e2)) {
                        mo1180b(view, e2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f1084g.get(i7);
                    C0349e eVar2 = (C0349e) view2.getLayoutParams();
                    C0346b b = eVar2.mo1248b();
                    if (b != null && b.mo997a(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo1255g()) {
                            if (i2 != 2) {
                                z = b.mo999b(this, view2, view);
                            } else {
                                b.mo1233c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo1245a(z);
                            }
                        } else {
                            eVar2.mo1256h();
                        }
                    }
                }
            }
        }
        m1302a(e);
        m1302a(e2);
        m1302a(e3);
    }

    /* renamed from: a */
    private void m1305a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (C0594r.m2622w(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0349e eVar = (C0349e) view.getLayoutParams();
            C0346b b = eVar.mo1248b();
            Rect e = m1317e();
            Rect e2 = m1317e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (b == null || !b.mo1227a(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m1302a(e2);
            if (e.isEmpty()) {
                m1302a(e);
                return;
            }
            int a = C0579d.m2523a(eVar.f1111h, i);
            if ((a & 48) != 48 || (i3 = (e.top - eVar.topMargin) - eVar.f1113j) >= rect.top) {
                z = false;
            } else {
                m1321f(view, rect.top - i3);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - e.bottom) - eVar.bottomMargin) + eVar.f1113j) < rect.bottom) {
                m1321f(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                m1321f(view, 0);
            }
            if ((a & 3) != 3 || (i2 = (e.left - eVar.leftMargin) - eVar.f1112i) >= rect.left) {
                z2 = false;
            } else {
                m1318e(view, rect.left - i2);
                z2 = true;
            }
            if ((a & 5) == 5 && (width = ((getWidth() - e.right) - eVar.rightMargin) + eVar.f1112i) < rect.right) {
                m1318e(view, width - rect.right);
                z2 = true;
            }
            if (!z2) {
                m1318e(view, 0);
            }
            m1302a(e);
        }
    }

    /* renamed from: e */
    private void m1318e(View view, int i) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (eVar.f1112i != i) {
            C0594r.m2603f(view, i - eVar.f1112i);
            eVar.f1112i = i;
        }
    }

    /* renamed from: f */
    private void m1321f(View view, int i) {
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (eVar.f1113j != i) {
            C0594r.m2601e(view, i - eVar.f1113j);
            eVar.f1113j = i;
        }
    }

    /* renamed from: b */
    public void mo1178b(View view) {
        List c = this.f1085h.mo2446c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0346b b = ((C0349e) view2.getLayoutParams()).mo1248b();
                if (b != null) {
                    b.mo999b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: c */
    public List<View> mo1182c(View view) {
        List<View> d = this.f1085h.mo2447d(view);
        this.f1087j.clear();
        if (d != null) {
            this.f1087j.addAll(d);
        }
        return this.f1087j;
    }

    /* renamed from: d */
    public List<View> mo1188d(View view) {
        List c = this.f1085h.mo2446c(view);
        this.f1087j.clear();
        if (c != null) {
            this.f1087j.addAll(c);
        }
        return this.f1087j;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m1320f();
        return Collections.unmodifiableList(this.f1084g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1166a() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1319e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1096s) {
            return;
        }
        if (z) {
            mo1177b();
        } else {
            mo1183c();
        }
    }

    /* renamed from: e */
    private boolean m1319e(View view) {
        return this.f1085h.mo2448e(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1177b() {
        if (this.f1091n) {
            if (this.f1095r == null) {
                this.f1095r = new C0350f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1095r);
        }
        this.f1096s = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1183c() {
        if (this.f1091n && this.f1095r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1095r);
        }
        this.f1096s = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1179b(View view, int i) {
        C0346b b;
        View view2 = view;
        C0349e eVar = (C0349e) view.getLayoutParams();
        if (eVar.f1114k != null) {
            Rect e = m1317e();
            Rect e2 = m1317e();
            Rect e3 = m1317e();
            mo1173a(eVar.f1114k, e);
            boolean z = false;
            mo1174a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m1304a(view, i, e, e3, eVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m1303a(eVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C0594r.m2603f(view2, i3);
            }
            if (i4 != 0) {
                C0594r.m2601e(view2, i4);
            }
            if (z && (b = eVar.mo1248b()) != null) {
                b.mo999b(this, view2, eVar.f1114k);
            }
            m1302a(e);
            m1302a(e2);
            m1302a(e3);
        }
    }

    /* renamed from: a */
    public boolean mo1175a(View view, int i, int i2) {
        Rect e = m1317e();
        mo1173a(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m1302a(e);
        }
    }

    /* renamed from: a */
    public C0349e generateLayoutParams(AttributeSet attributeSet) {
        return new C0349e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0349e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0349e) {
            return new C0349e((C0349e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0349e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0349e(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0349e generateDefaultLayoutParams() {
        return new C0349e(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0349e) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1176a(view, view2, i, 0);
    }

    /* renamed from: a */
    public boolean mo1176a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0349e eVar = (C0349e) childAt.getLayoutParams();
                C0346b b = eVar.mo1248b();
                if (b != null) {
                    boolean a = b.mo867a(this, childAt, view, view2, i, i2);
                    eVar.mo1242a(i3, a);
                    z |= a;
                } else {
                    eVar.mo1242a(i3, false);
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1181b(view, view2, i, 0);
    }

    /* renamed from: b */
    public void mo1181b(View view, View view2, int i, int i2) {
        C0346b b;
        this.f1101x.mo2290a(view, view2, i, i2);
        this.f1094q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0349e eVar = (C0349e) childAt.getLayoutParams();
            if (eVar.mo1250b(i2) && (b = eVar.mo1248b()) != null) {
                b.mo1230b(this, childAt, view, view2, i, i2);
            }
        }
    }

    public void onStopNestedScroll(View view) {
        mo1184c(view, 0);
    }

    /* renamed from: c */
    public void mo1184c(View view, int i) {
        this.f1101x.mo2288a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0349e eVar = (C0349e) childAt.getLayoutParams();
            if (eVar.mo1250b(i)) {
                C0346b b = eVar.mo1248b();
                if (b != null) {
                    b.mo1054a(this, childAt, view, i);
                }
                eVar.mo1241a(i);
                eVar.mo1256h();
            }
        }
        this.f1094q = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1170a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public void mo1170a(View view, int i, int i2, int i3, int i4, int i5) {
        C0346b b;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0349e eVar = (C0349e) childAt.getLayoutParams();
                if (eVar.mo1250b(i5) && (b = eVar.mo1248b()) != null) {
                    b.mo1055a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo1167a(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1171a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public void mo1171a(View view, int i, int i2, int[] iArr, int i3) {
        C0346b b;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0349e eVar = (C0349e) childAt.getLayoutParams();
                if (eVar.mo1250b(i3) && (b = eVar.mo1248b()) != null) {
                    int[] iArr2 = this.f1088k;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    b.mo1056a(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        i4 = Math.max(i6, this.f1088k[0]);
                    } else {
                        i4 = Math.min(i6, this.f1088k[0]);
                    }
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.f1088k[1]);
                    } else {
                        i5 = Math.min(i7, this.f1088k[1]);
                    }
                    i6 = i4;
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo1167a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0346b b;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0349e eVar = (C0349e) childAt.getLayoutParams();
                if (eVar.mo1250b(0) && (b = eVar.mo1248b()) != null) {
                    z2 |= b.mo1228a(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo1167a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0346b b;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0349e eVar = (C0349e) childAt.getLayoutParams();
                if (eVar.mo1250b(0) && (b = eVar.mo1248b()) != null) {
                    z |= b.mo1135a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.f1101x.mo2287a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    class C0350f implements ViewTreeObserver.OnPreDrawListener {
        C0350f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo1167a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$h */
    static class C0353h implements Comparator<View> {
        C0353h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C0594r.m2623x(view);
            float x2 = C0594r.m2623x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public static abstract class C0346b<V extends View> {
        /* renamed from: a */
        public C0608z mo1225a(CoordinatorLayout coordinatorLayout, V v, C0608z zVar) {
            return zVar;
        }

        /* renamed from: a */
        public void mo1004a(C0349e eVar) {
        }

        /* renamed from: a */
        public void mo1053a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo834a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo1226a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo836a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1061a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1227a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1080a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1011a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo997a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1135a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1228a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo837a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public void mo1229b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: b */
        public boolean mo1120b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo999b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public int mo1231c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: c */
        public void mo1232c() {
        }

        /* renamed from: c */
        public void mo1233c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public float mo1234d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        @Deprecated
        /* renamed from: d */
        public void mo1235d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public C0346b() {
        }

        public C0346b(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: e */
        public boolean mo1236e(CoordinatorLayout coordinatorLayout, V v) {
            return mo1234d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo867a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo837a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1230b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo1229b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo1054a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo1235d(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo1055a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo834a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo1056a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo1226a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: b */
        public Parcelable mo1065b(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    public static class C0349e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0346b f1104a;

        /* renamed from: b */
        boolean f1105b = false;

        /* renamed from: c */
        public int f1106c = 0;

        /* renamed from: d */
        public int f1107d = 0;

        /* renamed from: e */
        public int f1108e = -1;

        /* renamed from: f */
        int f1109f = -1;

        /* renamed from: g */
        public int f1110g = 0;

        /* renamed from: h */
        public int f1111h = 0;

        /* renamed from: i */
        int f1112i;

        /* renamed from: j */
        int f1113j;

        /* renamed from: k */
        View f1114k;

        /* renamed from: l */
        View f1115l;

        /* renamed from: m */
        final Rect f1116m = new Rect();

        /* renamed from: n */
        Object f1117n;

        /* renamed from: o */
        private boolean f1118o;

        /* renamed from: p */
        private boolean f1119p;

        /* renamed from: q */
        private boolean f1120q;

        /* renamed from: r */
        private boolean f1121r;

        public C0349e(int i, int i2) {
            super(i, i2);
        }

        C0349e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0110a.C0113c.CoordinatorLayout_Layout);
            this.f1106c = obtainStyledAttributes.getInteger(C0110a.C0113c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1109f = obtainStyledAttributes.getResourceId(C0110a.C0113c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1107d = obtainStyledAttributes.getInteger(C0110a.C0113c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1108e = obtainStyledAttributes.getInteger(C0110a.C0113c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1110g = obtainStyledAttributes.getInt(C0110a.C0113c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1111h = obtainStyledAttributes.getInt(C0110a.C0113c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f1105b = obtainStyledAttributes.hasValue(C0110a.C0113c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f1105b) {
                this.f1104a = CoordinatorLayout.m1301a(context, attributeSet, obtainStyledAttributes.getString(C0110a.C0113c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0346b bVar = this.f1104a;
            if (bVar != null) {
                bVar.mo1004a(this);
            }
        }

        public C0349e(C0349e eVar) {
            super(eVar);
        }

        public C0349e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0349e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo1240a() {
            return this.f1109f;
        }

        /* renamed from: b */
        public C0346b mo1248b() {
            return this.f1104a;
        }

        /* renamed from: a */
        public void mo1244a(C0346b bVar) {
            C0346b bVar2 = this.f1104a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.mo1232c();
                }
                this.f1104a = bVar;
                this.f1117n = null;
                this.f1105b = true;
                if (bVar != null) {
                    bVar.mo1004a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1243a(Rect rect) {
            this.f1116m.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Rect mo1251c() {
            return this.f1116m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo1252d() {
            return this.f1114k == null && this.f1109f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo1253e() {
            if (this.f1104a == null) {
                this.f1118o = false;
            }
            return this.f1118o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1246a(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1118o;
            if (z) {
                return true;
            }
            C0346b bVar = this.f1104a;
            boolean e = (bVar != null ? bVar.mo1236e(coordinatorLayout, view) : false) | z;
            this.f1118o = e;
            return e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo1254f() {
            this.f1118o = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1241a(int i) {
            mo1242a(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1242a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f1119p = z;
                    return;
                case 1:
                    this.f1120q = z;
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1250b(int i) {
            switch (i) {
                case 0:
                    return this.f1119p;
                case 1:
                    return this.f1120q;
                default:
                    return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo1255g() {
            return this.f1121r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1245a(boolean z) {
            this.f1121r = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo1256h() {
            this.f1121r = false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1104a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1247a(android.support.design.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f1115l
                if (r4 == r0) goto L_0x001b
                int r0 = android.support.p026v4.p036h.C0594r.m2602f(r2)
                boolean r0 = r1.m1381a((android.view.View) r4, (int) r0)
                if (r0 != 0) goto L_0x001b
                android.support.design.widget.CoordinatorLayout$b r0 = r1.f1104a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo997a((android.support.design.widget.CoordinatorLayout) r2, r3, (android.view.View) r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.C0349e.mo1247a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public View mo1249b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1109f == -1) {
                this.f1115l = null;
                this.f1114k = null;
                return null;
            }
            if (this.f1114k == null || !m1382b(view, coordinatorLayout)) {
                m1380a(view, coordinatorLayout);
            }
            return this.f1114k;
        }

        /* renamed from: a */
        private void m1380a(View view, CoordinatorLayout coordinatorLayout) {
            this.f1114k = coordinatorLayout.findViewById(this.f1109f);
            View view2 = this.f1114k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f1115l = null;
                            this.f1114k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1115l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f1115l = null;
                    this.f1114k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f1115l = null;
                this.f1114k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1109f) + " to anchor view " + view);
            }
        }

        /* renamed from: b */
        private boolean m1382b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1114k.getId() != this.f1109f) {
                return false;
            }
            View view2 = this.f1114k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1115l = null;
                    this.f1114k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1115l = view2;
            return true;
        }

        /* renamed from: a */
        private boolean m1381a(View view, int i) {
            int a = C0579d.m2523a(((C0349e) view.getLayoutParams()).f1110g, i);
            return a != 0 && (C0579d.m2523a(this.f1111h, i) & a) == a;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    private class C0348d implements ViewGroup.OnHierarchyChangeListener {
        C0348d() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f1083e != null) {
                CoordinatorLayout.this.f1083e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo1167a(2);
            if (CoordinatorLayout.this.f1083e != null) {
                CoordinatorLayout.this.f1083e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0351g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0351g gVar = (C0351g) parcelable;
        super.onRestoreInstanceState(gVar.mo2188a());
        SparseArray<Parcelable> sparseArray = gVar.f1123a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0346b b = mo1163a(childAt).mo1248b();
            if (!(id == -1 || b == null || (parcelable2 = sparseArray.get(id)) == null)) {
                b.mo1053a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable b;
        C0351g gVar = new C0351g(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0346b b2 = ((C0349e) childAt.getLayoutParams()).mo1248b();
            if (!(id == -1 || b2 == null || (b = b2.mo1065b(this, childAt)) == null)) {
                sparseArray.append(id, b);
            }
        }
        gVar.f1123a = sparseArray;
        return gVar;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0346b b = ((C0349e) view.getLayoutParams()).mo1248b();
        if (b == null || !b.mo1080a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: g */
    private void m1322g() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0594r.m2615p(this)) {
                if (this.f1100w == null) {
                    this.f1100w = new C0592p() {
                        /* renamed from: a */
                        public C0608z mo1109a(View view, C0608z zVar) {
                            return CoordinatorLayout.this.mo1165a(zVar);
                        }
                    };
                }
                C0594r.m2586a((View) this, this.f1100w);
                setSystemUiVisibility(1280);
                return;
            }
            C0594r.m2586a((View) this, (C0592p) null);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$g */
    protected static class C0351g extends C0556a {
        public static final Parcelable.Creator<C0351g> CREATOR = new Parcelable.ClassLoaderCreator<C0351g>() {
            /* renamed from: a */
            public C0351g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0351g(parcel, classLoader);
            }

            /* renamed from: a */
            public C0351g createFromParcel(Parcel parcel) {
                return new C0351g(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0351g[] newArray(int i) {
                return new C0351g[i];
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f1123a;

        public C0351g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1123a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1123a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0351g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1123a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1123a.keyAt(i2);
                parcelableArr[i2] = this.f1123a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
