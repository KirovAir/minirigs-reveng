package android.support.p039v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p026v4.p032d.C0492a;
import android.support.p026v4.p035g.C0531k;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.C0587k;
import android.support.p026v4.p036h.C0588l;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0598s;
import android.support.p026v4.p036h.p037a.C0559a;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p026v4.widget.C0624g;
import android.support.p039v7.p045d.C0722a;
import android.support.p039v7.widget.C0851ah;
import android.support.p039v7.widget.C0881aq;
import android.support.p039v7.widget.C0978bt;
import android.support.p039v7.widget.C0981bu;
import android.support.p039v7.widget.C1000e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.ay */
public class C0904ay extends ViewGroup implements C0587k {

    /* renamed from: L */
    static final Interpolator f3248L = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: M */
    private static final int[] f3249M = {16843830};

    /* renamed from: N */
    private static final int[] f3250N = {16842987};

    /* renamed from: O */
    private static final boolean f3251O = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: P */
    private static final boolean f3252P = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: Q */
    private static final Class<?>[] f3253Q = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f3254a = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);

    /* renamed from: b */
    static final boolean f3255b = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: c */
    static final boolean f3256c = (Build.VERSION.SDK_INT >= 16);

    /* renamed from: d */
    static final boolean f3257d = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: A */
    final C0944w f3258A;

    /* renamed from: B */
    C0881aq f3259B;

    /* renamed from: C */
    C0881aq.C0883a f3260C;

    /* renamed from: D */
    final C0942u f3261D;

    /* renamed from: E */
    boolean f3262E;

    /* renamed from: F */
    boolean f3263F;

    /* renamed from: G */
    boolean f3264G;

    /* renamed from: H */
    C0946az f3265H;

    /* renamed from: I */
    final int[] f3266I;

    /* renamed from: J */
    final int[] f3267J;

    /* renamed from: K */
    final List<C0945x> f3268K;

    /* renamed from: R */
    private final C0936r f3269R;

    /* renamed from: S */
    private C0937s f3270S;

    /* renamed from: T */
    private final Rect f3271T;

    /* renamed from: U */
    private final ArrayList<C0930m> f3272U;

    /* renamed from: V */
    private C0930m f3273V;

    /* renamed from: W */
    private int f3274W;

    /* renamed from: aA */
    private List<C0931n> f3275aA;

    /* renamed from: aB */
    private C0916f.C0918b f3276aB;

    /* renamed from: aC */
    private C0914d f3277aC;

    /* renamed from: aD */
    private final int[] f3278aD;

    /* renamed from: aE */
    private C0588l f3279aE;

    /* renamed from: aF */
    private final int[] f3280aF;

    /* renamed from: aG */
    private final int[] f3281aG;

    /* renamed from: aH */
    private Runnable f3282aH;

    /* renamed from: aI */
    private final C0981bu.C0983b f3283aI;

    /* renamed from: aa */
    private boolean f3284aa;

    /* renamed from: ab */
    private int f3285ab;

    /* renamed from: ac */
    private final AccessibilityManager f3286ac;

    /* renamed from: ad */
    private List<C0928k> f3287ad;

    /* renamed from: ae */
    private int f3288ae;

    /* renamed from: af */
    private int f3289af;

    /* renamed from: ag */
    private C0915e f3290ag;

    /* renamed from: ah */
    private EdgeEffect f3291ah;

    /* renamed from: ai */
    private EdgeEffect f3292ai;

    /* renamed from: aj */
    private EdgeEffect f3293aj;

    /* renamed from: ak */
    private EdgeEffect f3294ak;

    /* renamed from: al */
    private int f3295al;

    /* renamed from: am */
    private int f3296am;

    /* renamed from: an */
    private VelocityTracker f3297an;

    /* renamed from: ao */
    private int f3298ao;

    /* renamed from: ap */
    private int f3299ap;

    /* renamed from: aq */
    private int f3300aq;

    /* renamed from: ar */
    private int f3301ar;

    /* renamed from: as */
    private int f3302as;

    /* renamed from: at */
    private C0929l f3303at;

    /* renamed from: au */
    private final int f3304au;

    /* renamed from: av */
    private final int f3305av;

    /* renamed from: aw */
    private float f3306aw;

    /* renamed from: ax */
    private float f3307ax;

    /* renamed from: ay */
    private boolean f3308ay;

    /* renamed from: az */
    private C0931n f3309az;

    /* renamed from: e */
    final C0934p f3310e;

    /* renamed from: f */
    C1000e f3311f;

    /* renamed from: g */
    C0851ah f3312g;

    /* renamed from: h */
    final C0981bu f3313h;

    /* renamed from: i */
    boolean f3314i;

    /* renamed from: j */
    final Runnable f3315j;

    /* renamed from: k */
    final Rect f3316k;

    /* renamed from: l */
    final RectF f3317l;

    /* renamed from: m */
    C0911a f3318m;

    /* renamed from: n */
    C0922i f3319n;

    /* renamed from: o */
    C0935q f3320o;

    /* renamed from: p */
    final ArrayList<C0921h> f3321p;

    /* renamed from: q */
    boolean f3322q;

    /* renamed from: r */
    boolean f3323r;

    /* renamed from: s */
    boolean f3324s;

    /* renamed from: t */
    boolean f3325t;

    /* renamed from: u */
    boolean f3326u;

    /* renamed from: v */
    boolean f3327v;

    /* renamed from: w */
    boolean f3328w;

    /* renamed from: x */
    boolean f3329x;

    /* renamed from: y */
    boolean f3330y;

    /* renamed from: z */
    C0916f f3331z;

    /* renamed from: android.support.v7.widget.ay$b */
    static class C0912b extends Observable<C0913c> {
    }

    /* renamed from: android.support.v7.widget.ay$c */
    public static abstract class C0913c {
    }

    /* renamed from: android.support.v7.widget.ay$d */
    public interface C0914d {
        /* renamed from: a */
        int mo4378a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.ay$k */
    public interface C0928k {
        /* renamed from: a */
        void mo4502a(View view);

        /* renamed from: b */
        void mo4503b(View view);
    }

    /* renamed from: android.support.v7.widget.ay$l */
    public static abstract class C0929l {
        /* renamed from: a */
        public abstract boolean mo4504a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.ay$m */
    public interface C0930m {
        /* renamed from: a */
        void mo4048a(boolean z);

        /* renamed from: a */
        boolean mo4050a(C0904ay ayVar, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4053b(C0904ay ayVar, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.ay$n */
    public static abstract class C0931n {
        /* renamed from: a */
        public void mo4505a(C0904ay ayVar, int i) {
        }

        /* renamed from: a */
        public void mo4056a(C0904ay ayVar, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.ay$q */
    public interface C0935q {
        /* renamed from: a */
        void mo4552a(C0945x xVar);
    }

    /* renamed from: android.support.v7.widget.ay$v */
    public static abstract class C0943v {
        /* renamed from: a */
        public abstract View mo4583a(C0934p pVar, int i, int i2);
    }

    /* renamed from: f */
    public void mo4252f(int i) {
    }

    /* renamed from: g */
    public void mo4258g(View view) {
    }

    /* renamed from: h */
    public void mo4279h(int i, int i2) {
    }

    /* renamed from: h */
    public void mo4280h(View view) {
    }

    public C0904ay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0904ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3269R = new C0936r();
        this.f3310e = new C0934p();
        this.f3313h = new C0981bu();
        this.f3315j = new Runnable() {
            public void run() {
                if (C0904ay.this.f3325t && !C0904ay.this.isLayoutRequested()) {
                    if (!C0904ay.this.f3322q) {
                        C0904ay.this.requestLayout();
                    } else if (C0904ay.this.f3327v) {
                        C0904ay.this.f3326u = true;
                    } else {
                        C0904ay.this.mo4236d();
                    }
                }
            }
        };
        this.f3316k = new Rect();
        this.f3271T = new Rect();
        this.f3317l = new RectF();
        this.f3321p = new ArrayList<>();
        this.f3272U = new ArrayList<>();
        this.f3274W = 0;
        this.f3329x = false;
        this.f3330y = false;
        this.f3288ae = 0;
        this.f3289af = 0;
        this.f3290ag = new C0915e();
        this.f3331z = new C0856ak();
        this.f3295al = 0;
        this.f3296am = -1;
        this.f3306aw = Float.MIN_VALUE;
        this.f3307ax = Float.MIN_VALUE;
        boolean z = true;
        this.f3308ay = true;
        this.f3258A = new C0944w();
        this.f3260C = f3257d ? new C0881aq.C0883a() : null;
        this.f3261D = new C0942u();
        this.f3262E = false;
        this.f3263F = false;
        this.f3276aB = new C0920g();
        this.f3264G = false;
        this.f3278aD = new int[2];
        this.f3280aF = new int[2];
        this.f3266I = new int[2];
        this.f3281aG = new int[2];
        this.f3267J = new int[2];
        this.f3268K = new ArrayList();
        this.f3282aH = new Runnable() {
            public void run() {
                if (C0904ay.this.f3331z != null) {
                    C0904ay.this.f3331z.mo3996a();
                }
                C0904ay.this.f3264G = false;
            }
        };
        this.f3283aI = new C0981bu.C0983b() {
            /* renamed from: a */
            public void mo4349a(C0945x xVar, C0916f.C0919c cVar, C0916f.C0919c cVar2) {
                C0904ay.this.f3310e.mo4539c(xVar);
                C0904ay.this.mo4218b(xVar, cVar, cVar2);
            }

            /* renamed from: b */
            public void mo4350b(C0945x xVar, C0916f.C0919c cVar, C0916f.C0919c cVar2) {
                C0904ay.this.mo4202a(xVar, cVar, cVar2);
            }

            /* renamed from: c */
            public void mo4351c(C0945x xVar, C0916f.C0919c cVar, C0916f.C0919c cVar2) {
                xVar.mo4600a(false);
                if (C0904ay.this.f3329x) {
                    if (C0904ay.this.f3331z.mo4384a(xVar, xVar, cVar, cVar2)) {
                        C0904ay.this.mo4308p();
                    }
                } else if (C0904ay.this.f3331z.mo4386c(xVar, cVar, cVar2)) {
                    C0904ay.this.mo4308p();
                }
            }

            /* renamed from: a */
            public void mo4348a(C0945x xVar) {
                C0904ay.this.f3319n.mo4430a(xVar.f3434a, C0904ay.this.f3310e);
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3250N, i, 0);
            this.f3314i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3314i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3302as = viewConfiguration.getScaledTouchSlop();
        this.f3306aw = C0598s.m2634a(viewConfiguration, context);
        this.f3307ax = C0598s.m2636b(viewConfiguration, context);
        this.f3304au = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3305av = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3331z.mo4382a(this.f3276aB);
        mo4213b();
        m4527z();
        m4526y();
        if (C0594r.m2600e(this) == 0) {
            C0594r.m2592b((View) this, 1);
        }
        this.f3286ac = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0946az(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0722a.C0724b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C0722a.C0724b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C0722a.C0724b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f3324s = obtainStyledAttributes2.getBoolean(C0722a.C0724b.RecyclerView_fastScrollEnabled, false);
            if (this.f3324s) {
                mo4195a((StateListDrawable) obtainStyledAttributes2.getDrawable(C0722a.C0724b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C0722a.C0724b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C0722a.C0724b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C0722a.C0724b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m4506a(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3249M, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo4189a() {
        return " " + super.toString() + ", adapter:" + this.f3318m + ", layout:" + this.f3319n + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: y */
    private void m4526y() {
        if (C0594r.m2574a(this) == 0) {
            C0594r.m2578a((View) this, 8);
        }
    }

    public C0946az getCompatAccessibilityDelegate() {
        return this.f3265H;
    }

    public void setAccessibilityDelegateCompat(C0946az azVar) {
        this.f3265H = azVar;
        C0594r.m2585a((View) this, (C0570b) this.f3265H);
    }

    /* renamed from: a */
    private void m4506a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m4503a(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = classLoader.loadClass(a).asSubclass(C0922i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3253Q);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0922i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a, e7);
                }
            }
        }
    }

    /* renamed from: a */
    private String m4503a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return C0904ay.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: z */
    private void m4527z() {
        this.f3312g = new C0851ah(new C0851ah.C0853b() {
            /* renamed from: a */
            public int mo3955a() {
                return C0904ay.this.getChildCount();
            }

            /* renamed from: a */
            public void mo3958a(View view, int i) {
                C0904ay.this.addView(view, i);
                C0904ay.this.mo4292l(view);
            }

            /* renamed from: a */
            public int mo3956a(View view) {
                return C0904ay.this.indexOfChild(view);
            }

            /* renamed from: a */
            public void mo3957a(int i) {
                View childAt = C0904ay.this.getChildAt(i);
                if (childAt != null) {
                    C0904ay.this.mo4290k(childAt);
                    childAt.clearAnimation();
                }
                C0904ay.this.removeViewAt(i);
            }

            /* renamed from: b */
            public View mo3961b(int i) {
                return C0904ay.this.getChildAt(i);
            }

            /* renamed from: b */
            public void mo3962b() {
                int a = mo3955a();
                for (int i = 0; i < a; i++) {
                    View b = mo3961b(i);
                    C0904ay.this.mo4290k(b);
                    b.clearAnimation();
                }
                C0904ay.this.removeAllViews();
            }

            /* renamed from: b */
            public C0945x mo3960b(View view) {
                return C0904ay.m4521e(view);
            }

            /* renamed from: a */
            public void mo3959a(View view, int i, ViewGroup.LayoutParams layoutParams) {
                C0945x e = C0904ay.m4521e(view);
                if (e != null) {
                    if (e.mo4620r() || e.mo4605c()) {
                        e.mo4615m();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + e + C0904ay.this.mo4189a());
                    }
                }
                C0904ay.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: c */
            public void mo3963c(int i) {
                C0945x e;
                View b = mo3961b(i);
                if (!(b == null || (e = C0904ay.m4521e(b)) == null)) {
                    if (!e.mo4620r() || e.mo4605c()) {
                        e.mo4603b(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + e + C0904ay.this.mo4189a());
                    }
                }
                C0904ay.this.detachViewFromParent(i);
            }

            /* renamed from: c */
            public void mo3964c(View view) {
                C0945x e = C0904ay.m4521e(view);
                if (e != null) {
                    e.mo4598a(C0904ay.this);
                }
            }

            /* renamed from: d */
            public void mo3965d(View view) {
                C0945x e = C0904ay.m4521e(view);
                if (e != null) {
                    e.mo4604b(C0904ay.this);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4213b() {
        this.f3311f = new C1000e(new C1000e.C1001a() {
            /* renamed from: a */
            public C0945x mo4352a(int i) {
                C0945x a = C0904ay.this.mo4187a(i, true);
                if (a != null && !C0904ay.this.f3312g.mo3940c(a.f3434a)) {
                    return a;
                }
                return null;
            }

            /* renamed from: a */
            public void mo4353a(int i, int i2) {
                C0904ay.this.mo4193a(i, i2, true);
                C0904ay ayVar = C0904ay.this;
                ayVar.f3262E = true;
                ayVar.f3261D.f3411c += i2;
            }

            /* renamed from: b */
            public void mo4356b(int i, int i2) {
                C0904ay.this.mo4193a(i, i2, false);
                C0904ay.this.f3262E = true;
            }

            /* renamed from: a */
            public void mo4354a(int i, int i2, Object obj) {
                C0904ay.this.mo4192a(i, i2, obj);
                C0904ay.this.f3263F = true;
            }

            /* renamed from: a */
            public void mo4355a(C1000e.C1002b bVar) {
                mo4359c(bVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo4359c(C1000e.C1002b bVar) {
                int i = bVar.f3676a;
                if (i == 4) {
                    C0904ay.this.f3319n.mo3529a(C0904ay.this, bVar.f3677b, bVar.f3679d, bVar.f3678c);
                } else if (i != 8) {
                    switch (i) {
                        case 1:
                            C0904ay.this.f3319n.mo3527a(C0904ay.this, bVar.f3677b, bVar.f3679d);
                            return;
                        case 2:
                            C0904ay.this.f3319n.mo3534b(C0904ay.this, bVar.f3677b, bVar.f3679d);
                            return;
                        default:
                            return;
                    }
                } else {
                    C0904ay.this.f3319n.mo3528a(C0904ay.this, bVar.f3677b, bVar.f3679d, 1);
                }
            }

            /* renamed from: b */
            public void mo4357b(C1000e.C1002b bVar) {
                mo4359c(bVar);
            }

            /* renamed from: c */
            public void mo4358c(int i, int i2) {
                C0904ay.this.mo4257g(i, i2);
                C0904ay.this.f3262E = true;
            }

            /* renamed from: d */
            public void mo4360d(int i, int i2) {
                C0904ay.this.mo4253f(i, i2);
                C0904ay.this.f3262E = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.f3323r = z;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3314i) {
            mo4289k();
        }
        this.f3314i = z;
        super.setClipToPadding(z);
        if (this.f3325t) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.f3314i;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.f3302as = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.f3302as = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(C0911a aVar) {
        setLayoutFrozen(false);
        m4507a(aVar, false, true);
        mo4226c(false);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4224c() {
        C0916f fVar = this.f3331z;
        if (fVar != null) {
            fVar.mo4008d();
        }
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo4452c(this.f3310e);
            this.f3319n.mo4444b(this.f3310e);
        }
        this.f3310e.mo4520a();
    }

    /* renamed from: a */
    private void m4507a(C0911a aVar, boolean z, boolean z2) {
        C0911a aVar2 = this.f3318m;
        if (aVar2 != null) {
            aVar2.mo4371b((C0913c) this.f3269R);
            this.f3318m.mo4373b(this);
        }
        if (!z || z2) {
            mo4224c();
        }
        this.f3311f.mo4875a();
        C0911a aVar3 = this.f3318m;
        this.f3318m = aVar;
        if (aVar != null) {
            aVar.mo4364a((C0913c) this.f3269R);
            aVar.mo4368a(this);
        }
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo4417a(aVar3, this.f3318m);
        }
        this.f3310e.mo4524a(aVar3, this.f3318m, z);
        this.f3261D.f3414f = true;
    }

    public C0911a getAdapter() {
        return this.f3318m;
    }

    public void setRecyclerListener(C0935q qVar) {
        this.f3320o = qVar;
    }

    public int getBaseline() {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            return iVar.mo4487u();
        }
        return super.getBaseline();
    }

    public void setLayoutManager(C0922i iVar) {
        if (iVar != this.f3319n) {
            mo4251f();
            if (this.f3319n != null) {
                C0916f fVar = this.f3331z;
                if (fVar != null) {
                    fVar.mo4008d();
                }
                this.f3319n.mo4452c(this.f3310e);
                this.f3319n.mo4444b(this.f3310e);
                this.f3310e.mo4520a();
                if (this.f3322q) {
                    this.f3319n.mo4446b(this, this.f3310e);
                }
                this.f3319n.mo4445b((C0904ay) null);
                this.f3319n = null;
            } else {
                this.f3310e.mo4520a();
            }
            this.f3312g.mo3929a();
            this.f3319n = iVar;
            if (iVar != null) {
                if (iVar.f3359q == null) {
                    this.f3319n.mo4445b(this);
                    if (this.f3322q) {
                        this.f3319n.mo4453c(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + iVar + " is already attached to a RecyclerView:" + iVar.f3359q.mo4189a());
                }
            }
            this.f3310e.mo4532b();
            requestLayout();
        }
    }

    public void setOnFlingListener(C0929l lVar) {
        this.f3303at = lVar;
    }

    public C0929l getOnFlingListener() {
        return this.f3303at;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0937s sVar = new C0937s(super.onSaveInstanceState());
        C0937s sVar2 = this.f3270S;
        if (sVar2 != null) {
            sVar.mo4553a(sVar2);
        } else {
            C0922i iVar = this.f3319n;
            if (iVar != null) {
                sVar.f3394a = iVar.mo3563d();
            } else {
                sVar.f3394a = null;
            }
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0937s)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f3270S = (C0937s) parcelable;
        super.onRestoreInstanceState(this.f3270S.mo2188a());
        if (this.f3319n != null && this.f3270S.f3394a != null) {
            this.f3319n.mo3549a(this.f3270S.f3394a);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* renamed from: e */
    private void m4522e(C0945x xVar) {
        View view = xVar.f3434a;
        boolean z = view.getParent() == this;
        this.f3310e.mo4539c(mo4212b(view));
        if (xVar.mo4620r()) {
            this.f3312g.mo3932a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f3312g.mo3934a(view, true);
        } else {
            this.f3312g.mo3942d(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4209a(View view) {
        mo4247e();
        boolean f = this.f3312g.mo3945f(view);
        if (f) {
            C0945x e = m4521e(view);
            this.f3310e.mo4539c(e);
            this.f3310e.mo4534b(e);
        }
        mo4204a(!f);
        return f;
    }

    public C0922i getLayoutManager() {
        return this.f3319n;
    }

    public C0932o getRecycledViewPool() {
        return this.f3310e.mo4548g();
    }

    public void setRecycledViewPool(C0932o oVar) {
        this.f3310e.mo4525a(oVar);
    }

    public void setViewCacheExtension(C0943v vVar) {
        this.f3310e.mo4526a(vVar);
    }

    public void setItemViewCacheSize(int i) {
        this.f3310e.mo4521a(i);
    }

    public int getScrollState() {
        return this.f3295al;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3295al) {
            this.f3295al = i;
            if (i != 2) {
                m4489B();
            }
            mo4256g(i);
        }
    }

    /* renamed from: a */
    public void mo4197a(C0921h hVar, int i) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo3552a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3321p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3321p.add(hVar);
        } else {
            this.f3321p.add(i, hVar);
        }
        mo4310r();
        requestLayout();
    }

    /* renamed from: a */
    public void mo4196a(C0921h hVar) {
        mo4197a(hVar, -1);
    }

    public int getItemDecorationCount() {
        return this.f3321p.size();
    }

    /* renamed from: b */
    public void mo4215b(C0921h hVar) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo3552a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3321p.remove(hVar);
        if (this.f3321p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4310r();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0914d dVar) {
        if (dVar != this.f3277aC) {
            this.f3277aC = dVar;
            setChildrenDrawingOrderEnabled(this.f3277aC != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(C0931n nVar) {
        this.f3309az = nVar;
    }

    /* renamed from: a */
    public void mo4199a(C0931n nVar) {
        if (this.f3275aA == null) {
            this.f3275aA = new ArrayList();
        }
        this.f3275aA.add(nVar);
    }

    /* renamed from: b */
    public void mo4217b(C0931n nVar) {
        List<C0931n> list = this.f3275aA;
        if (list != null) {
            list.remove(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4214b(int i) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo3565e(i);
            awakenScrollBars();
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i, int i2) {
        C0922i iVar = this.f3319n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3327v) {
            boolean e = iVar.mo3566e();
            boolean f = this.f3319n.mo3569f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                mo4206a(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4194a(int i, int i2, int[] iArr) {
        mo4247e();
        mo4291l();
        C0492a.m2183a("RV Scroll");
        mo4200a(this.f3261D);
        int a = i != 0 ? this.f3319n.mo3512a(i, this.f3310e, this.f3261D) : 0;
        int b = i2 != 0 ? this.f3319n.mo3532b(i2, this.f3310e, this.f3261D) : 0;
        C0492a.m2182a();
        mo4343w();
        mo4293m();
        mo4204a(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4236d() {
        if (!this.f3325t || this.f3329x) {
            C0492a.m2183a("RV FullInvalidate");
            mo4309q();
            C0492a.m2182a();
        } else if (this.f3311f.mo4883d()) {
            if (this.f3311f.mo4878a(4) && !this.f3311f.mo4878a(11)) {
                C0492a.m2183a("RV PartialInvalidate");
                mo4247e();
                mo4291l();
                this.f3311f.mo4880b();
                if (!this.f3326u) {
                    if (m4488A()) {
                        mo4309q();
                    } else {
                        this.f3311f.mo4882c();
                    }
                }
                mo4204a(true);
                mo4293m();
                C0492a.m2182a();
            } else if (this.f3311f.mo4883d()) {
                C0492a.m2183a("RV FullInvalidate");
                mo4309q();
                C0492a.m2182a();
            }
        }
    }

    /* renamed from: A */
    private boolean m4488A() {
        int b = this.f3312g.mo3935b();
        for (int i = 0; i < b; i++) {
            C0945x e = m4521e(this.f3312g.mo3937b(i));
            if (e != null && !e.mo4605c() && e.mo4629z()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r0 != 0) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4206a(int r19, int r20, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r18.mo4236d()
            android.support.v7.widget.ay$a r0 = r7.f3318m
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0025
            int[] r0 = r7.f3267J
            r7.mo4194a((int) r8, (int) r9, (int[]) r0)
            int[] r0 = r7.f3267J
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r8 - r1
            int r3 = r9 - r0
            r6 = r0
            r15 = r1
            r13 = r2
            r14 = r3
            goto L_0x0029
        L_0x0025:
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0029:
            java.util.ArrayList<android.support.v7.widget.ay$h> r0 = r7.f3321p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            r18.invalidate()
        L_0x0034:
            int[] r5 = r7.f3280aF
            r16 = 0
            r0 = r18
            r1 = r15
            r2 = r6
            r3 = r13
            r4 = r14
            r17 = r6
            r6 = r16
            boolean r0 = r0.mo4205a((int) r1, (int) r2, (int) r3, (int) r4, (int[]) r5, (int) r6)
            if (r0 == 0) goto L_0x0076
            int r0 = r7.f3300aq
            int[] r1 = r7.f3280aF
            r2 = r1[r12]
            int r0 = r0 - r2
            r7.f3300aq = r0
            int r0 = r7.f3301ar
            r2 = r1[r11]
            int r0 = r0 - r2
            r7.f3301ar = r0
            if (r10 == 0) goto L_0x0063
            r0 = r1[r12]
            float r0 = (float) r0
            r1 = r1[r11]
            float r1 = (float) r1
            r10.offsetLocation(r0, r1)
        L_0x0063:
            int[] r0 = r7.f3281aG
            r1 = r0[r12]
            int[] r2 = r7.f3280aF
            r3 = r2[r12]
            int r1 = r1 + r3
            r0[r12] = r1
            r1 = r0[r11]
            r2 = r2[r11]
            int r1 = r1 + r2
            r0[r11] = r1
            goto L_0x0097
        L_0x0076:
            int r0 = r18.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L_0x0097
            if (r10 == 0) goto L_0x0094
            r0 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = android.support.p026v4.p036h.C0585i.m2543a(r10, r0)
            if (r0 != 0) goto L_0x0094
            float r0 = r21.getX()
            float r1 = (float) r13
            float r2 = r21.getY()
            float r3 = (float) r14
            r7.m4504a((float) r0, (float) r1, (float) r2, (float) r3)
        L_0x0094:
            r18.mo4225c(r19, r20)
        L_0x0097:
            if (r15 != 0) goto L_0x009e
            r0 = r17
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a0
        L_0x009e:
            r0 = r17
        L_0x00a0:
            r7.mo4285i(r15, r0)
        L_0x00a3:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x00ac
            r18.invalidate()
        L_0x00ac:
            if (r15 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b1
        L_0x00b0:
            r12 = 1
        L_0x00b1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0904ay.mo4206a(int, int, android.view.MotionEvent):boolean");
    }

    public int computeHorizontalScrollOffset() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3566e()) {
            return this.f3319n.mo3558c(this.f3261D);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3566e()) {
            return this.f3319n.mo3564e(this.f3261D);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3566e()) {
            return this.f3319n.mo3571g(this.f3261D);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3569f()) {
            return this.f3319n.mo3561d(this.f3261D);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3569f()) {
            return this.f3319n.mo3568f(this.f3261D);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0922i iVar = this.f3319n;
        if (iVar != null && iVar.mo3569f()) {
            return this.f3319n.mo3572h(this.f3261D);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4247e() {
        this.f3274W++;
        if (this.f3274W == 1 && !this.f3327v) {
            this.f3326u = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4204a(boolean z) {
        if (this.f3274W < 1) {
            this.f3274W = 1;
        }
        if (!z && !this.f3327v) {
            this.f3326u = false;
        }
        if (this.f3274W == 1) {
            if (z && this.f3326u && !this.f3327v && this.f3319n != null && this.f3318m != null) {
                mo4309q();
            }
            if (!this.f3327v) {
                this.f3326u = false;
            }
        }
        this.f3274W--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f3327v) {
            mo4203a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f3327v = false;
                if (!(!this.f3326u || this.f3319n == null || this.f3318m == null)) {
                    requestLayout();
                }
                this.f3326u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3327v = true;
            this.f3284aa = true;
            mo4251f();
        }
    }

    /* renamed from: a */
    public void mo4190a(int i, int i2) {
        mo4191a(i, i2, (Interpolator) null);
    }

    /* renamed from: a */
    public void mo4191a(int i, int i2, Interpolator interpolator) {
        C0922i iVar = this.f3319n;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3327v) {
            if (!iVar.mo3566e()) {
                i = 0;
            }
            if (!this.f3319n.mo3569f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f3258A.mo4589a(i, i2, interpolator);
            }
        }
    }

    /* renamed from: b */
    public boolean mo4220b(int i, int i2) {
        C0922i iVar = this.f3319n;
        int i3 = 0;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3327v) {
            return false;
        } else {
            boolean e = iVar.mo3566e();
            boolean f = this.f3319n.mo3569f();
            if (!e || Math.abs(i) < this.f3304au) {
                i = 0;
            }
            if (!f || Math.abs(i2) < this.f3304au) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f2 = (float) i;
            float f3 = (float) i2;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z = e || f;
                dispatchNestedFling(f2, f3, z);
                C0929l lVar = this.f3303at;
                if (lVar != null && lVar.mo4504a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (e) {
                        i3 = 1;
                    }
                    if (f) {
                        i3 |= 2;
                    }
                    mo4288j(i3, 1);
                    int i4 = this.f3305av;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3305av;
                    this.f3258A.mo4585a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public void mo4251f() {
        setScrollState(0);
        m4489B();
    }

    /* renamed from: B */
    private void m4489B() {
        this.f3258A.mo4590b();
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo4412H();
        }
    }

    public int getMinFlingVelocity() {
        return this.f3304au;
    }

    public int getMaxFlingVelocity() {
        return this.f3305av;
    }

    /* renamed from: a */
    private void m4504a(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            mo4255g();
            C0624g.m2783a(this.f3291ah, (-f2) / ((float) getWidth()), 1.0f - (f3 / ((float) getHeight())));
            z = true;
        } else if (f2 > 0.0f) {
            mo4278h();
            C0624g.m2783a(this.f3293aj, f2 / ((float) getWidth()), f3 / ((float) getHeight()));
            z = true;
        } else {
            z = false;
        }
        if (f4 < 0.0f) {
            mo4284i();
            C0624g.m2783a(this.f3292ai, (-f4) / ((float) getHeight()), f / ((float) getWidth()));
        } else if (f4 > 0.0f) {
            mo4287j();
            C0624g.m2783a(this.f3294ak, f4 / ((float) getHeight()), 1.0f - (f / ((float) getWidth())));
        } else {
            z2 = z;
        }
        if (z2 || f2 != 0.0f || f4 != 0.0f) {
            C0594r.m2598d(this);
        }
    }

    /* renamed from: C */
    private void m4490C() {
        boolean z;
        EdgeEffect edgeEffect = this.f3291ah;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3291ah.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3292ai;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3292ai.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3293aj;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3293aj.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3294ak;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3294ak.isFinished();
        }
        if (z) {
            C0594r.m2598d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4225c(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3291ah;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3291ah.onRelease();
            z = this.f3291ah.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3293aj;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3293aj.onRelease();
            z |= this.f3293aj.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3292ai;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3292ai.onRelease();
            z |= this.f3292ai.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3294ak;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3294ak.onRelease();
            z |= this.f3294ak.isFinished();
        }
        if (z) {
            C0594r.m2598d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4238d(int i, int i2) {
        if (i < 0) {
            mo4255g();
            this.f3291ah.onAbsorb(-i);
        } else if (i > 0) {
            mo4278h();
            this.f3293aj.onAbsorb(i);
        }
        if (i2 < 0) {
            mo4284i();
            this.f3292ai.onAbsorb(-i2);
        } else if (i2 > 0) {
            mo4287j();
            this.f3294ak.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0594r.m2598d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4255g() {
        if (this.f3291ah == null) {
            this.f3291ah = this.f3290ag.mo4379a(this, 0);
            if (this.f3314i) {
                this.f3291ah.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3291ah.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4278h() {
        if (this.f3293aj == null) {
            this.f3293aj = this.f3290ag.mo4379a(this, 2);
            if (this.f3314i) {
                this.f3293aj.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3293aj.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4284i() {
        if (this.f3292ai == null) {
            this.f3292ai = this.f3290ag.mo4379a(this, 1);
            if (this.f3314i) {
                this.f3292ai.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3292ai.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4287j() {
        if (this.f3294ak == null) {
            this.f3294ak = this.f3290ag.mo4379a(this, 3);
            if (this.f3314i) {
                this.f3294ak.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3294ak.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4289k() {
        this.f3294ak = null;
        this.f3292ai = null;
        this.f3293aj = null;
        this.f3291ah = null;
    }

    public void setEdgeEffectFactory(C0915e eVar) {
        C0531k.m2315a(eVar);
        this.f3290ag = eVar;
        mo4289k();
    }

    public C0915e getEdgeEffectFactory() {
        return this.f3290ag;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f3319n.mo4459d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f3318m != null && this.f3319n != null && !mo4295o() && !this.f3327v;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo4236d();
                if (mo4223c(view) == null) {
                    return null;
                }
                mo4247e();
                view2 = this.f3319n.mo3518a(view, i, this.f3310e, this.f3261D);
                mo4204a(false);
            }
        } else {
            if (this.f3319n.mo3569f()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3251O) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3319n.mo3566e()) {
                int i3 = (this.f3319n.mo4486t() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f3251O) {
                    i = i3;
                }
            }
            if (z) {
                mo4236d();
                if (mo4223c(view) == null) {
                    return null;
                }
                mo4247e();
                this.f3319n.mo3518a(view, i, this.f3310e, this.f3261D);
                mo4204a(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4517a(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4513a(view2, (View) null);
        return view;
    }

    /* renamed from: a */
    private boolean m4517a(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || mo4223c(view2) == null) {
            return false;
        }
        if (view == null || mo4223c(view) == null) {
            return true;
        }
        this.f3316k.set(0, 0, view.getWidth(), view.getHeight());
        this.f3271T.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3316k);
        offsetDescendantRectToMyCoords(view2, this.f3271T);
        char c = 65535;
        int i3 = this.f3319n.mo4486t() == 1 ? -1 : 1;
        if ((this.f3316k.left < this.f3271T.left || this.f3316k.right <= this.f3271T.left) && this.f3316k.right < this.f3271T.right) {
            i2 = 1;
        } else {
            i2 = ((this.f3316k.right > this.f3271T.right || this.f3316k.left >= this.f3271T.right) && this.f3316k.left > this.f3271T.left) ? -1 : 0;
        }
        if ((this.f3316k.top < this.f3271T.top || this.f3316k.bottom <= this.f3271T.top) && this.f3316k.bottom < this.f3271T.bottom) {
            c = 1;
        } else if ((this.f3316k.bottom <= this.f3271T.bottom && this.f3316k.top < this.f3271T.bottom) || this.f3316k.top <= this.f3271T.top) {
            c = 0;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                                    return true;
                                }
                                return false;
                            case 2:
                                if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                                    return true;
                                }
                                return false;
                            default:
                                throw new IllegalArgumentException("Invalid direction: " + i + mo4189a());
                        }
                    } else if (c > 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i2 > 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c < 0) {
                return true;
            } else {
                return false;
            }
        } else if (i2 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3319n.mo4435a(this, this.f3261D, view, view2) && view2 != null) {
            m4513a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    private void m4513a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3316k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0927j) {
            C0927j jVar = (C0927j) layoutParams;
            if (!jVar.f3376e) {
                Rect rect = jVar.f3375d;
                this.f3316k.left -= rect.left;
                this.f3316k.right += rect.right;
                this.f3316k.top -= rect.top;
                this.f3316k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3316k);
            offsetRectIntoDescendantCoords(view, this.f3316k);
        }
        this.f3319n.mo4437a(this, view, this.f3316k, !this.f3325t, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3319n.mo4436a(this, view, rect, z);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0922i iVar = this.f3319n;
        if (iVar == null || !iVar.mo4439a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4295o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3288ae = r0
            r1 = 1
            r4.f3322q = r1
            boolean r2 = r4.f3325t
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f3325t = r1
            android.support.v7.widget.ay$i r1 = r4.f3319n
            if (r1 == 0) goto L_0x001e
            r1.mo4453c((android.support.p039v7.widget.C0904ay) r4)
        L_0x001e:
            r4.f3264G = r0
            boolean r0 = f3257d
            if (r0 == 0) goto L_0x0069
            java.lang.ThreadLocal<android.support.v7.widget.aq> r0 = android.support.p039v7.widget.C0881aq.f3154a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.aq r0 = (android.support.p039v7.widget.C0881aq) r0
            r4.f3259B = r0
            android.support.v7.widget.aq r0 = r4.f3259B
            if (r0 != 0) goto L_0x0064
            android.support.v7.widget.aq r0 = new android.support.v7.widget.aq
            r0.<init>()
            r4.f3259B = r0
            android.view.Display r0 = android.support.p026v4.p036h.C0594r.m2572B(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            android.support.v7.widget.aq r1 = r4.f3259B
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3158d = r2
            java.lang.ThreadLocal<android.support.v7.widget.aq> r0 = android.support.p039v7.widget.C0881aq.f3154a
            android.support.v7.widget.aq r1 = r4.f3259B
            r0.set(r1)
        L_0x0064:
            android.support.v7.widget.aq r0 = r4.f3259B
            r0.mo4068a((android.support.p039v7.widget.C0904ay) r4)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0904ay.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0881aq aqVar;
        super.onDetachedFromWindow();
        C0916f fVar = this.f3331z;
        if (fVar != null) {
            fVar.mo4008d();
        }
        mo4251f();
        this.f3322q = false;
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo4446b(this, this.f3310e);
        }
        this.f3268K.clear();
        removeCallbacks(this.f3282aH);
        this.f3313h.mo4831b();
        if (f3257d && (aqVar = this.f3259B) != null) {
            aqVar.mo4070b(this);
            this.f3259B = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.f3322q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4203a(String str) {
        if (mo4295o()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4189a());
            }
            throw new IllegalStateException(str);
        } else if (this.f3289af > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo4189a()));
        }
    }

    /* renamed from: a */
    public void mo4198a(C0930m mVar) {
        this.f3272U.add(mVar);
    }

    /* renamed from: b */
    public void mo4216b(C0930m mVar) {
        this.f3272U.remove(mVar);
        if (this.f3273V == mVar) {
            this.f3273V = null;
        }
    }

    /* renamed from: a */
    private boolean m4516a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f3273V = null;
        }
        int size = this.f3272U.size();
        int i = 0;
        while (i < size) {
            C0930m mVar = this.f3272U.get(i);
            if (!mVar.mo4050a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f3273V = mVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4518b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C0930m mVar = this.f3273V;
        if (mVar != null) {
            if (action == 0) {
                this.f3273V = null;
            } else {
                mVar.mo4053b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f3273V = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f3272U.size();
            for (int i = 0; i < size; i++) {
                C0930m mVar2 = this.f3272U.get(i);
                if (mVar2.mo4050a(this, motionEvent)) {
                    this.f3273V = mVar2;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3327v) {
            return false;
        }
        if (m4516a(motionEvent)) {
            m4492E();
            return true;
        }
        C0922i iVar = this.f3319n;
        if (iVar == null) {
            return false;
        }
        boolean e = iVar.mo3566e();
        boolean f = this.f3319n.mo3569f();
        if (this.f3297an == null) {
            this.f3297an = VelocityTracker.obtain();
        }
        this.f3297an.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                if (this.f3284aa) {
                    this.f3284aa = false;
                }
                this.f3296am = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f3300aq = x;
                this.f3298ao = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f3301ar = y;
                this.f3299ap = y;
                if (this.f3295al == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.f3281aG;
                iArr[1] = 0;
                iArr[0] = 0;
                int i = e ? 1 : 0;
                if (f) {
                    i |= 2;
                }
                mo4288j(i, 0);
                break;
            case 1:
                this.f3297an.clear();
                mo2272a(0);
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3296am);
                if (findPointerIndex >= 0) {
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3295al != 1) {
                        int i2 = x2 - this.f3298ao;
                        int i3 = y2 - this.f3299ap;
                        if (!e || Math.abs(i2) <= this.f3302as) {
                            z = false;
                        } else {
                            this.f3300aq = x2;
                            z = true;
                        }
                        if (f && Math.abs(i3) > this.f3302as) {
                            this.f3301ar = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3296am + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                m4492E();
                break;
            case 5:
                this.f3296am = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3300aq = x3;
                this.f3298ao = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3301ar = y3;
                this.f3299ap = y3;
                break;
            case 6:
                m4520c(motionEvent);
                break;
        }
        if (this.f3295al == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3272U.size();
        for (int i = 0; i < size; i++) {
            this.f3272U.get(i).mo4048a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2 = false;
        if (this.f3327v || this.f3284aa) {
            return false;
        }
        if (m4518b(motionEvent)) {
            m4492E();
            return true;
        }
        C0922i iVar = this.f3319n;
        if (iVar == null) {
            return false;
        }
        boolean e = iVar.mo3566e();
        boolean f = this.f3319n.mo3569f();
        if (this.f3297an == null) {
            this.f3297an = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f3281aG;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f3281aG;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        switch (actionMasked) {
            case 0:
                this.f3296am = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.f3300aq = x;
                this.f3298ao = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.f3301ar = y;
                this.f3299ap = y;
                int i5 = e ? 1 : 0;
                if (f) {
                    i5 |= 2;
                }
                mo4288j(i5, 0);
                break;
            case 1:
                this.f3297an.addMovement(obtain);
                this.f3297an.computeCurrentVelocity(1000, (float) this.f3305av);
                float f2 = e ? -this.f3297an.getXVelocity(this.f3296am) : 0.0f;
                float f3 = f ? -this.f3297an.getYVelocity(this.f3296am) : 0.0f;
                if ((f2 == 0.0f && f3 == 0.0f) || !mo4220b((int) f2, (int) f3)) {
                    setScrollState(0);
                }
                m4491D();
                z2 = true;
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3296am);
                if (findPointerIndex >= 0) {
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i6 = this.f3300aq - x2;
                    int i7 = this.f3301ar - y2;
                    if (mo4207a(i6, i7, this.f3266I, this.f3280aF, 0)) {
                        int[] iArr3 = this.f3266I;
                        i6 -= iArr3[0];
                        i7 -= iArr3[1];
                        int[] iArr4 = this.f3280aF;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.f3281aG;
                        int i8 = iArr5[0];
                        int[] iArr6 = this.f3280aF;
                        iArr5[0] = i8 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (this.f3295al != 1) {
                        if (!e || Math.abs(i2) <= (i4 = this.f3302as)) {
                            z = false;
                        } else {
                            i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                            z = true;
                        }
                        if (f && Math.abs(i) > (i3 = this.f3302as)) {
                            i = i > 0 ? i - i3 : i + i3;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    if (this.f3295al == 1) {
                        int[] iArr7 = this.f3280aF;
                        this.f3300aq = x2 - iArr7[0];
                        this.f3301ar = y2 - iArr7[1];
                        if (mo4206a(e ? i2 : 0, f ? i : 0, obtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (!(this.f3259B == null || (i2 == 0 && i == 0))) {
                            this.f3259B.mo4069a(this, i2, i);
                            break;
                        }
                    }
                } else {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3296am + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                break;
            case 3:
                m4492E();
                break;
            case 5:
                this.f3296am = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f3300aq = x3;
                this.f3298ao = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f3301ar = y3;
                this.f3299ap = y3;
                break;
            case 6:
                m4520c(motionEvent);
                break;
        }
        if (!z2) {
            this.f3297an.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: D */
    private void m4491D() {
        VelocityTracker velocityTracker = this.f3297an;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo2272a(0);
        m4490C();
    }

    /* renamed from: E */
    private void m4492E() {
        m4491D();
        setScrollState(0);
    }

    /* renamed from: c */
    private void m4520c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3296am) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3296am = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3300aq = x;
            this.f3298ao = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3301ar = y;
            this.f3299ap = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3319n != null && !this.f3327v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3319n.mo3569f() ? -motionEvent.getAxisValue(9) : 0.0f;
                f = this.f3319n.mo3566e() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue = motionEvent.getAxisValue(26);
                if (this.f3319n.mo3569f()) {
                    f2 = -axisValue;
                    f = 0.0f;
                } else if (this.f3319n.mo3566e()) {
                    f = axisValue;
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    f = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f = 0.0f;
            }
            if (!(f2 == 0.0f && f == 0.0f)) {
                mo4206a((int) (f * this.f3306aw), (int) (f2 * this.f3307ax), motionEvent);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0922i iVar = this.f3319n;
        if (iVar == null) {
            mo4249e(i, i2);
            return;
        }
        boolean z = false;
        if (iVar.mo3560c()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3319n.mo4419a(this.f3310e, this.f3261D, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3318m != null) {
                if (this.f3261D.f3412d == 1) {
                    m4500M();
                }
                this.f3319n.mo4451c(i, i2);
                this.f3261D.f3417i = true;
                m4501N();
                this.f3319n.mo4460d(i, i2);
                if (this.f3319n.mo3577l()) {
                    this.f3319n.mo4451c(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3261D.f3417i = true;
                    m4501N();
                    this.f3319n.mo4460d(i, i2);
                }
            }
        } else if (this.f3323r) {
            this.f3319n.mo4419a(this.f3310e, this.f3261D, i, i2);
        } else {
            if (this.f3328w) {
                mo4247e();
                mo4291l();
                m4495H();
                mo4293m();
                if (this.f3261D.f3419k) {
                    this.f3261D.f3415g = true;
                } else {
                    this.f3311f.mo4884e();
                    this.f3261D.f3415g = false;
                }
                this.f3328w = false;
                mo4204a(false);
            } else if (this.f3261D.f3419k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0911a aVar = this.f3318m;
            if (aVar != null) {
                this.f3261D.f3413e = aVar.mo4361a();
            } else {
                this.f3261D.f3413e = 0;
            }
            mo4247e();
            this.f3319n.mo4419a(this.f3310e, this.f3261D, i, i2);
            mo4204a(false);
            this.f3261D.f3415g = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4249e(int i, int i2) {
        setMeasuredDimension(C0922i.m4686a(i, getPaddingLeft() + getPaddingRight(), C0594r.m2608i(this)), C0922i.m4686a(i2, getPaddingTop() + getPaddingBottom(), C0594r.m2609j(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4289k();
        }
    }

    public void setItemAnimator(C0916f fVar) {
        C0916f fVar2 = this.f3331z;
        if (fVar2 != null) {
            fVar2.mo4008d();
            this.f3331z.mo4382a((C0916f.C0918b) null);
        }
        this.f3331z = fVar;
        C0916f fVar3 = this.f3331z;
        if (fVar3 != null) {
            fVar3.mo4382a(this.f3276aB);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4291l() {
        this.f3288ae++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4293m() {
        mo4219b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4219b(boolean z) {
        this.f3288ae--;
        if (this.f3288ae < 1) {
            this.f3288ae = 0;
            if (z) {
                m4493F();
                mo4344x();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4294n() {
        AccessibilityManager accessibilityManager = this.f3286ac;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: F */
    private void m4493F() {
        int i = this.f3285ab;
        this.f3285ab = 0;
        if (i != 0 && mo4294n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0559a.m2458a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: o */
    public boolean mo4295o() {
        return this.f3288ae > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4210a(AccessibilityEvent accessibilityEvent) {
        if (!mo4295o()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0559a.m2457a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f3285ab = a | this.f3285ab;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4210a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public C0916f getItemAnimator() {
        return this.f3331z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4308p() {
        if (!this.f3264G && this.f3322q) {
            C0594r.m2587a((View) this, this.f3282aH);
            this.f3264G = true;
        }
    }

    /* renamed from: G */
    private boolean m4494G() {
        return this.f3331z != null && this.f3319n.mo3535b();
    }

    /* renamed from: H */
    private void m4495H() {
        if (this.f3329x) {
            this.f3311f.mo4875a();
            if (this.f3330y) {
                this.f3319n.mo3526a(this);
            }
        }
        if (m4494G()) {
            this.f3311f.mo4880b();
        } else {
            this.f3311f.mo4884e();
        }
        boolean z = false;
        boolean z2 = this.f3262E || this.f3263F;
        this.f3261D.f3418j = this.f3325t && this.f3331z != null && (this.f3329x || z2 || this.f3319n.f3363u) && (!this.f3329x || this.f3318m.mo4374b());
        C0942u uVar = this.f3261D;
        if (uVar.f3418j && z2 && !this.f3329x && m4494G()) {
            z = true;
        }
        uVar.f3419k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4309q() {
        if (this.f3318m == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f3319n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            C0942u uVar = this.f3261D;
            uVar.f3417i = false;
            if (uVar.f3412d == 1) {
                m4500M();
                this.f3319n.mo4468f(this);
                m4501N();
            } else if (!this.f3311f.mo4885f() && this.f3319n.mo4491y() == getWidth() && this.f3319n.mo4492z() == getHeight()) {
                this.f3319n.mo4468f(this);
            } else {
                this.f3319n.mo4468f(this);
                m4501N();
            }
            m4502O();
        }
    }

    /* renamed from: I */
    private void m4496I() {
        int i;
        C0945x xVar = null;
        View focusedChild = (!this.f3308ay || !hasFocus() || this.f3318m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            xVar = mo4235d(focusedChild);
        }
        if (xVar == null) {
            m4497J();
            return;
        }
        this.f3261D.f3421m = this.f3318m.mo4374b() ? xVar.mo4609g() : -1;
        C0942u uVar = this.f3261D;
        if (this.f3329x) {
            i = -1;
        } else if (xVar.mo4619q()) {
            i = xVar.f3437d;
        } else {
            i = xVar.mo4607e();
        }
        uVar.f3420l = i;
        this.f3261D.f3422n = m4525m(xVar.f3434a);
    }

    /* renamed from: J */
    private void m4497J() {
        C0942u uVar = this.f3261D;
        uVar.f3421m = -1;
        uVar.f3420l = -1;
        uVar.f3422n = -1;
    }

    /* renamed from: K */
    private View m4498K() {
        C0945x c;
        int i = this.f3261D.f3420l != -1 ? this.f3261D.f3420l : 0;
        int e = this.f3261D.mo4581e();
        int i2 = i;
        while (i2 < e) {
            C0945x c2 = mo4222c(i2);
            if (c2 == null) {
                break;
            } else if (c2.f3434a.hasFocusable()) {
                return c2.f3434a;
            } else {
                i2++;
            }
        }
        int min = Math.min(e, i);
        while (true) {
            min--;
            if (min < 0 || (c = mo4222c(min)) == null) {
                return null;
            }
            if (c.f3434a.hasFocusable()) {
                return c.f3434a;
            }
        }
    }

    /* renamed from: L */
    private void m4499L() {
        View view;
        if (this.f3308ay && this.f3318m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3252P || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3312g.mo3940c(focusedChild)) {
                            return;
                        }
                    } else if (this.f3312g.mo3935b() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                C0945x a = (this.f3261D.f3421m == -1 || !this.f3318m.mo4374b()) ? null : mo4188a(this.f3261D.f3421m);
                if (a != null && !this.f3312g.mo3940c(a.f3434a) && a.f3434a.hasFocusable()) {
                    view2 = a.f3434a;
                } else if (this.f3312g.mo3935b() > 0) {
                    view2 = m4498K();
                }
                if (view2 != null) {
                    if (((long) this.f3261D.f3422n) == -1 || (view = view2.findViewById(this.f3261D.f3422n)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: m */
    private int m4525m(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4200a(C0942u uVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3258A.f3426a;
            uVar.f3423o = overScroller.getFinalX() - overScroller.getCurrX();
            uVar.f3424p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        uVar.f3423o = 0;
        uVar.f3424p = 0;
    }

    /* renamed from: M */
    private void m4500M() {
        boolean z = true;
        this.f3261D.mo4575a(1);
        mo4200a(this.f3261D);
        this.f3261D.f3417i = false;
        mo4247e();
        this.f3313h.mo4825a();
        mo4291l();
        m4495H();
        m4496I();
        C0942u uVar = this.f3261D;
        if (!uVar.f3418j || !this.f3263F) {
            z = false;
        }
        uVar.f3416h = z;
        this.f3263F = false;
        this.f3262E = false;
        C0942u uVar2 = this.f3261D;
        uVar2.f3415g = uVar2.f3419k;
        this.f3261D.f3413e = this.f3318m.mo4361a();
        m4514a(this.f3278aD);
        if (this.f3261D.f3418j) {
            int b = this.f3312g.mo3935b();
            for (int i = 0; i < b; i++) {
                C0945x e = m4521e(this.f3312g.mo3937b(i));
                if (!e.mo4605c() && (!e.mo4616n() || this.f3318m.mo4374b())) {
                    this.f3313h.mo4827a(e, this.f3331z.mo4381a(this.f3261D, e, C0916f.m4653e(e), e.mo4624u()));
                    if (this.f3261D.f3416h && e.mo4629z() && !e.mo4619q() && !e.mo4605c() && !e.mo4616n()) {
                        this.f3313h.mo4826a(mo4186a(e), e);
                    }
                }
            }
        }
        if (this.f3261D.f3419k) {
            mo4316s();
            boolean z2 = this.f3261D.f3414f;
            C0942u uVar3 = this.f3261D;
            uVar3.f3414f = false;
            this.f3319n.mo3536c(this.f3310e, uVar3);
            this.f3261D.f3414f = z2;
            for (int i2 = 0; i2 < this.f3312g.mo3935b(); i2++) {
                C0945x e2 = m4521e(this.f3312g.mo3937b(i2));
                if (!e2.mo4605c() && !this.f3313h.mo4835d(e2)) {
                    int e3 = C0916f.m4653e(e2);
                    boolean a = e2.mo4601a(8192);
                    if (!a) {
                        e3 |= 4096;
                    }
                    C0916f.C0919c a2 = this.f3331z.mo4381a(this.f3261D, e2, e3, e2.mo4624u());
                    if (a) {
                        mo4201a(e2, a2);
                    } else {
                        this.f3313h.mo4832b(e2, a2);
                    }
                }
            }
            mo4340t();
        } else {
            mo4340t();
        }
        mo4293m();
        mo4204a(false);
        this.f3261D.f3412d = 2;
    }

    /* renamed from: N */
    private void m4501N() {
        mo4247e();
        mo4291l();
        this.f3261D.mo4575a(6);
        this.f3311f.mo4884e();
        this.f3261D.f3413e = this.f3318m.mo4361a();
        C0942u uVar = this.f3261D;
        uVar.f3411c = 0;
        uVar.f3415g = false;
        this.f3319n.mo3536c(this.f3310e, uVar);
        C0942u uVar2 = this.f3261D;
        uVar2.f3414f = false;
        this.f3270S = null;
        uVar2.f3418j = uVar2.f3418j && this.f3331z != null;
        this.f3261D.f3412d = 4;
        mo4293m();
        mo4204a(false);
    }

    /* renamed from: O */
    private void m4502O() {
        this.f3261D.mo4575a(4);
        mo4247e();
        mo4291l();
        C0942u uVar = this.f3261D;
        uVar.f3412d = 1;
        if (uVar.f3418j) {
            for (int b = this.f3312g.mo3935b() - 1; b >= 0; b--) {
                C0945x e = m4521e(this.f3312g.mo3937b(b));
                if (!e.mo4605c()) {
                    long a = mo4186a(e);
                    C0916f.C0919c a2 = this.f3331z.mo4380a(this.f3261D, e);
                    C0945x a3 = this.f3313h.mo4824a(a);
                    if (a3 == null || a3.mo4605c()) {
                        this.f3313h.mo4834c(e, a2);
                    } else {
                        boolean a4 = this.f3313h.mo4829a(a3);
                        boolean a5 = this.f3313h.mo4829a(e);
                        if (!a4 || a3 != e) {
                            C0916f.C0919c b2 = this.f3313h.mo4830b(a3);
                            this.f3313h.mo4834c(e, a2);
                            C0916f.C0919c c = this.f3313h.mo4833c(e);
                            if (b2 == null) {
                                m4505a(a, e, a3);
                            } else {
                                m4508a(a3, e, b2, c, a4, a5);
                            }
                        } else {
                            this.f3313h.mo4834c(e, a2);
                        }
                    }
                }
            }
            this.f3313h.mo4828a(this.f3283aI);
        }
        this.f3319n.mo4444b(this.f3310e);
        C0942u uVar2 = this.f3261D;
        uVar2.f3410b = uVar2.f3413e;
        this.f3329x = false;
        this.f3330y = false;
        C0942u uVar3 = this.f3261D;
        uVar3.f3418j = false;
        uVar3.f3419k = false;
        this.f3319n.f3363u = false;
        if (this.f3310e.f3385b != null) {
            this.f3310e.f3385b.clear();
        }
        if (this.f3319n.f3367y) {
            C0922i iVar = this.f3319n;
            iVar.f3366x = 0;
            iVar.f3367y = false;
            this.f3310e.mo4532b();
        }
        this.f3319n.mo3524a(this.f3261D);
        mo4293m();
        mo4204a(false);
        this.f3313h.mo4825a();
        int[] iArr = this.f3278aD;
        if (m4524k(iArr[0], iArr[1])) {
            mo4285i(0, 0);
        }
        m4499L();
        m4497J();
    }

    /* renamed from: a */
    private void m4505a(long j, C0945x xVar, C0945x xVar2) {
        int b = this.f3312g.mo3935b();
        for (int i = 0; i < b; i++) {
            C0945x e = m4521e(this.f3312g.mo3937b(i));
            if (e != xVar && mo4186a(e) == j) {
                C0911a aVar = this.f3318m;
                if (aVar == null || !aVar.mo4374b()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e + " \n View Holder 2:" + xVar + mo4189a());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e + " \n View Holder 2:" + xVar + mo4189a());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + xVar2 + " cannot be found but it is necessary for " + xVar + mo4189a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4201a(C0945x xVar, C0916f.C0919c cVar) {
        xVar.mo4594a(0, 8192);
        if (this.f3261D.f3416h && xVar.mo4629z() && !xVar.mo4619q() && !xVar.mo4605c()) {
            this.f3313h.mo4826a(mo4186a(xVar), xVar);
        }
        this.f3313h.mo4827a(xVar, cVar);
    }

    /* renamed from: a */
    private void m4514a(int[] iArr) {
        int b = this.f3312g.mo3935b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C0945x e = m4521e(this.f3312g.mo3937b(i3));
            if (!e.mo4605c()) {
                int d = e.mo4606d();
                if (d < i) {
                    i = d;
                }
                if (d > i2) {
                    i2 = d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: k */
    private boolean m4524k(int i, int i2) {
        m4514a(this.f3278aD);
        int[] iArr = this.f3278aD;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0945x e = m4521e(view);
        if (e != null) {
            if (e.mo4620r()) {
                e.mo4615m();
            } else if (!e.mo4605c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e + mo4189a());
            }
        }
        view.clearAnimation();
        mo4290k(view);
        super.removeDetachedView(view, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo4186a(C0945x xVar) {
        return this.f3318m.mo4374b() ? xVar.mo4609g() : (long) xVar.f3436c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4202a(C0945x xVar, C0916f.C0919c cVar, C0916f.C0919c cVar2) {
        xVar.mo4600a(false);
        if (this.f3331z.mo4385b(xVar, cVar, cVar2)) {
            mo4308p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4218b(C0945x xVar, C0916f.C0919c cVar, C0916f.C0919c cVar2) {
        m4522e(xVar);
        xVar.mo4600a(false);
        if (this.f3331z.mo4383a(xVar, cVar, cVar2)) {
            mo4308p();
        }
    }

    /* renamed from: a */
    private void m4508a(C0945x xVar, C0945x xVar2, C0916f.C0919c cVar, C0916f.C0919c cVar2, boolean z, boolean z2) {
        xVar.mo4600a(false);
        if (z) {
            m4522e(xVar);
        }
        if (xVar != xVar2) {
            if (z2) {
                m4522e(xVar2);
            }
            xVar.f3441h = xVar2;
            m4522e(xVar);
            this.f3310e.mo4539c(xVar);
            xVar2.mo4600a(false);
            xVar2.f3442i = xVar;
        }
        if (this.f3331z.mo4384a(xVar, xVar2, cVar, cVar2)) {
            mo4308p();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0492a.m2183a("RV OnLayout");
        mo4309q();
        C0492a.m2182a();
        this.f3325t = true;
    }

    public void requestLayout() {
        if (this.f3274W != 0 || this.f3327v) {
            this.f3326u = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4310r() {
        int c = this.f3312g.mo3938c();
        for (int i = 0; i < c; i++) {
            ((C0927j) this.f3312g.mo3941d(i).getLayoutParams()).f3376e = true;
        }
        this.f3310e.mo4551j();
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.f3321p.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            this.f3321p.get(i).mo4046a(canvas, this, this.f3261D);
        }
        EdgeEffect edgeEffect = this.f3291ah;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3314i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3291ah;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3292ai;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3314i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3292ai;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3293aj;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3314i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3293aj;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3294ak;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3314i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f3294ak;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f3331z != null && this.f3321p.size() > 0 && this.f3331z.mo4004b()) {
            z2 = true;
        }
        if (z2) {
            C0594r.m2598d(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3321p.size();
        for (int i = 0; i < size; i++) {
            this.f3321p.get(i).mo4404b(canvas, this, this.f3261D);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0927j) && this.f3319n.mo3531a((C0927j) layoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            return iVar.mo3514a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4189a());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            return iVar.mo3515a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4189a());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            return iVar.mo3516a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4189a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4316s() {
        int c = this.f3312g.mo3938c();
        for (int i = 0; i < c; i++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i));
            if (!e.mo4605c()) {
                e.mo4602b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4340t() {
        int c = this.f3312g.mo3938c();
        for (int i = 0; i < c; i++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i));
            if (!e.mo4605c()) {
                e.mo4593a();
            }
        }
        this.f3310e.mo4550i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4253f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.f3312g.mo3938c();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i6));
            if (e != null && e.f3436c >= i5 && e.f3436c <= i4) {
                if (e.f3436c == i) {
                    e.mo4596a(i2 - i, false);
                } else {
                    e.mo4596a(i3, false);
                }
                this.f3261D.f3414f = true;
            }
        }
        this.f3310e.mo4522a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4257g(int i, int i2) {
        int c = this.f3312g.mo3938c();
        for (int i3 = 0; i3 < c; i3++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i3));
            if (e != null && !e.mo4605c() && e.f3436c >= i) {
                e.mo4596a(i2, false);
                this.f3261D.f3414f = true;
            }
        }
        this.f3310e.mo4533b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4193a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f3312g.mo3938c();
        for (int i4 = 0; i4 < c; i4++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i4));
            if (e != null && !e.mo4605c()) {
                if (e.f3436c >= i3) {
                    e.mo4596a(-i2, z);
                    this.f3261D.f3414f = true;
                } else if (e.f3436c >= i) {
                    e.mo4595a(i - 1, -i2, z);
                    this.f3261D.f3414f = true;
                }
            }
        }
        this.f3310e.mo4523a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4192a(int i, int i2, Object obj) {
        int c = this.f3312g.mo3938c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f3312g.mo3941d(i4);
            C0945x e = m4521e(d);
            if (e != null && !e.mo4605c() && e.f3436c >= i && e.f3436c < i3) {
                e.mo4603b(2);
                e.mo4599a(obj);
                ((C0927j) d.getLayoutParams()).f3376e = true;
            }
        }
        this.f3310e.mo4538c(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4221b(C0945x xVar) {
        C0916f fVar = this.f3331z;
        return fVar == null || fVar.mo4002a(xVar, xVar.mo4624u());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4226c(boolean z) {
        this.f3330y = z | this.f3330y;
        this.f3329x = true;
        mo4341u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4341u() {
        int c = this.f3312g.mo3938c();
        for (int i = 0; i < c; i++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i));
            if (e != null && !e.mo4605c()) {
                e.mo4603b(6);
            }
        }
        mo4310r();
        this.f3310e.mo4549h();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3308ay;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3308ay = z;
    }

    /* renamed from: b */
    public C0945x mo4212b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4521e(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: c */
    public View mo4223c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: d */
    public C0945x mo4235d(View view) {
        View c = mo4223c(view);
        if (c == null) {
            return null;
        }
        return mo4212b(c);
    }

    /* renamed from: e */
    static C0945x m4521e(View view) {
        if (view == null) {
            return null;
        }
        return ((C0927j) view.getLayoutParams()).f3374c;
    }

    /* renamed from: f */
    public int mo4250f(View view) {
        C0945x e = m4521e(view);
        if (e != null) {
            return e.mo4606d();
        }
        return -1;
    }

    /* renamed from: c */
    public C0945x mo4222c(int i) {
        C0945x xVar = null;
        if (this.f3329x) {
            return null;
        }
        int c = this.f3312g.mo3938c();
        for (int i2 = 0; i2 < c; i2++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i2));
            if (e != null && !e.mo4619q() && mo4234d(e) == i) {
                if (!this.f3312g.mo3940c(e.f3434a)) {
                    return e;
                }
                xVar = e;
            }
        }
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0945x mo4187a(int i, boolean z) {
        int c = this.f3312g.mo3938c();
        C0945x xVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i2));
            if (e != null && !e.mo4619q()) {
                if (z) {
                    if (e.f3436c != i) {
                        continue;
                    }
                } else if (e.mo4606d() != i) {
                    continue;
                }
                if (!this.f3312g.mo3940c(e.f3434a)) {
                    return e;
                }
                xVar = e;
            }
        }
        return xVar;
    }

    /* renamed from: a */
    public C0945x mo4188a(long j) {
        C0911a aVar = this.f3318m;
        C0945x xVar = null;
        if (aVar == null || !aVar.mo4374b()) {
            return null;
        }
        int c = this.f3312g.mo3938c();
        for (int i = 0; i < c; i++) {
            C0945x e = m4521e(this.f3312g.mo3941d(i));
            if (e != null && !e.mo4619q() && e.mo4609g() == j) {
                if (!this.f3312g.mo3940c(e.f3434a)) {
                    return e;
                }
                xVar = e;
            }
        }
        return xVar;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: d */
    public void mo4237d(int i) {
        int b = this.f3312g.mo3935b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f3312g.mo3937b(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: e */
    public void mo4248e(int i) {
        int b = this.f3312g.mo3935b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f3312g.mo3937b(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: a */
    static void m4512a(View view, Rect rect) {
        C0927j jVar = (C0927j) view.getLayoutParams();
        Rect rect2 = jVar.f3375d;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Rect mo4283i(View view) {
        C0927j jVar = (C0927j) view.getLayoutParams();
        if (!jVar.f3376e) {
            return jVar.f3375d;
        }
        if (this.f3261D.mo4577a() && (jVar.mo4500e() || jVar.mo4498c())) {
            return jVar.f3375d;
        }
        Rect rect = jVar.f3375d;
        rect.set(0, 0, 0, 0);
        int size = this.f3321p.size();
        for (int i = 0; i < size; i++) {
            this.f3316k.set(0, 0, 0, 0);
            this.f3321p.get(i).mo4402a(this.f3316k, view, this, this.f3261D);
            rect.left += this.f3316k.left;
            rect.top += this.f3316k.top;
            rect.right += this.f3316k.right;
            rect.bottom += this.f3316k.bottom;
        }
        jVar.f3376e = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4285i(int i, int i2) {
        this.f3289af++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo4279h(i, i2);
        C0931n nVar = this.f3309az;
        if (nVar != null) {
            nVar.mo4056a(this, i, i2);
        }
        List<C0931n> list = this.f3275aA;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3275aA.get(size).mo4056a(this, i, i2);
            }
        }
        this.f3289af--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4256g(int i) {
        C0922i iVar = this.f3319n;
        if (iVar != null) {
            iVar.mo3709l(i);
        }
        mo4252f(i);
        C0931n nVar = this.f3309az;
        if (nVar != null) {
            nVar.mo4505a(this, i);
        }
        List<C0931n> list = this.f3275aA;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3275aA.get(size).mo4505a(this, i);
            }
        }
    }

    /* renamed from: v */
    public boolean mo4342v() {
        return !this.f3325t || this.f3329x || this.f3311f.mo4883d();
    }

    /* renamed from: android.support.v7.widget.ay$w */
    class C0944w implements Runnable {

        /* renamed from: a */
        OverScroller f3426a;

        /* renamed from: b */
        Interpolator f3427b = C0904ay.f3248L;

        /* renamed from: d */
        private int f3429d;

        /* renamed from: e */
        private int f3430e;

        /* renamed from: f */
        private boolean f3431f = false;

        /* renamed from: g */
        private boolean f3432g = false;

        C0944w() {
            this.f3426a = new OverScroller(C0904ay.this.getContext(), C0904ay.f3248L);
        }

        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            if (C0904ay.this.f3319n == null) {
                mo4590b();
                return;
            }
            m4930c();
            C0904ay.this.mo4236d();
            OverScroller overScroller = this.f3426a;
            C0939t tVar = C0904ay.this.f3319n.f3362t;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = C0904ay.this.f3266I;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f3429d;
                int i6 = currY - this.f3430e;
                this.f3429d = currX;
                this.f3430e = currY;
                if (C0904ay.this.mo4207a(i5, i6, iArr, (int[]) null, 1)) {
                    i5 -= iArr[0];
                    i6 -= iArr[1];
                }
                if (C0904ay.this.f3318m != null) {
                    C0904ay ayVar = C0904ay.this;
                    ayVar.mo4194a(i5, i6, ayVar.f3267J);
                    i4 = C0904ay.this.f3267J[0];
                    i3 = C0904ay.this.f3267J[1];
                    i2 = i5 - i4;
                    i = i6 - i3;
                    if (tVar != null && !tVar.mo4569c() && tVar.mo4570d()) {
                        int e = C0904ay.this.f3261D.mo4581e();
                        if (e == 0) {
                            tVar.mo4567b();
                        } else if (tVar.mo4571e() >= e) {
                            tVar.mo4562a(e - 1);
                            tVar.mo4563a(i5 - i2, i6 - i);
                        } else {
                            tVar.mo4563a(i5 - i2, i6 - i);
                        }
                    }
                } else {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                if (!C0904ay.this.f3321p.isEmpty()) {
                    C0904ay.this.invalidate();
                }
                if (C0904ay.this.getOverScrollMode() != 2) {
                    C0904ay.this.mo4225c(i5, i6);
                }
                if (!C0904ay.this.mo4205a(i4, i3, i2, i, (int[]) null, 1) && !(i2 == 0 && i == 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i7 = i2 != currX ? i2 < 0 ? -currVelocity : i2 > 0 ? currVelocity : 0 : 0;
                    if (i == currY) {
                        currVelocity = 0;
                    } else if (i < 0) {
                        currVelocity = -currVelocity;
                    } else if (i <= 0) {
                        currVelocity = 0;
                    }
                    if (C0904ay.this.getOverScrollMode() != 2) {
                        C0904ay.this.mo4238d(i7, currVelocity);
                    }
                    if ((i7 != 0 || i2 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i == currY || overScroller.getFinalY() == 0)) {
                        overScroller.abortAnimation();
                    }
                }
                if (!(i4 == 0 && i3 == 0)) {
                    C0904ay.this.mo4285i(i4, i3);
                }
                if (!C0904ay.this.awakenScrollBars()) {
                    C0904ay.this.invalidate();
                }
                boolean z = (i5 == 0 && i6 == 0) || (i5 != 0 && C0904ay.this.f3319n.mo3566e() && i4 == i5) || (i6 != 0 && C0904ay.this.f3319n.mo3569f() && i3 == i6);
                if (overScroller.isFinished() || (!z && !C0904ay.this.mo4281h(1))) {
                    C0904ay.this.setScrollState(0);
                    if (C0904ay.f3257d) {
                        C0904ay.this.f3260C.mo4074a();
                    }
                    C0904ay.this.mo2272a(1);
                } else {
                    mo4584a();
                    if (C0904ay.this.f3259B != null) {
                        C0904ay.this.f3259B.mo4069a(C0904ay.this, i5, i6);
                    }
                }
            }
            if (tVar != null) {
                if (tVar.mo4569c()) {
                    tVar.mo4563a(0, 0);
                }
                if (!this.f3432g) {
                    tVar.mo4567b();
                }
            }
            m4931d();
        }

        /* renamed from: c */
        private void m4930c() {
            this.f3432g = false;
            this.f3431f = true;
        }

        /* renamed from: d */
        private void m4931d() {
            this.f3431f = false;
            if (this.f3432g) {
                mo4584a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4584a() {
            if (this.f3431f) {
                this.f3432g = true;
                return;
            }
            C0904ay.this.removeCallbacks(this);
            C0594r.m2587a((View) C0904ay.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo4585a(int i, int i2) {
            C0904ay.this.setScrollState(2);
            this.f3430e = 0;
            this.f3429d = 0;
            this.f3426a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4584a();
        }

        /* renamed from: b */
        public void mo4591b(int i, int i2) {
            mo4587a(i, i2, 0, 0);
        }

        /* renamed from: a */
        public void mo4587a(int i, int i2, int i3, int i4) {
            mo4586a(i, i2, m4929b(i, i2, i3, i4));
        }

        /* renamed from: a */
        private float m4928a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: b */
        private int m4929b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? C0904ay.this.getWidth() : C0904ay.this.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m4928a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: a */
        public void mo4586a(int i, int i2, int i3) {
            mo4588a(i, i2, i3, C0904ay.f3248L);
        }

        /* renamed from: a */
        public void mo4589a(int i, int i2, Interpolator interpolator) {
            int b = m4929b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = C0904ay.f3248L;
            }
            mo4588a(i, i2, b, interpolator);
        }

        /* renamed from: a */
        public void mo4588a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3427b != interpolator) {
                this.f3427b = interpolator;
                this.f3426a = new OverScroller(C0904ay.this.getContext(), interpolator);
            }
            C0904ay.this.setScrollState(2);
            this.f3430e = 0;
            this.f3429d = 0;
            this.f3426a.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3426a.computeScrollOffset();
            }
            mo4584a();
        }

        /* renamed from: b */
        public void mo4590b() {
            C0904ay.this.removeCallbacks(this);
            this.f3426a.abortAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4343w() {
        int b = this.f3312g.mo3935b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f3312g.mo3937b(i);
            C0945x b3 = mo4212b(b2);
            if (!(b3 == null || b3.f3442i == null)) {
                View view = b3.f3442i.f3434a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.ay$r */
    private class C0936r extends C0913c {
        C0936r() {
        }
    }

    /* renamed from: android.support.v7.widget.ay$e */
    public static class C0915e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4379a(C0904ay ayVar, int i) {
            return new EdgeEffect(ayVar.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.ay$o */
    public static class C0932o {

        /* renamed from: a */
        SparseArray<C0933a> f3378a = new SparseArray<>();

        /* renamed from: b */
        private int f3379b = 0;

        /* renamed from: android.support.v7.widget.ay$o$a */
        static class C0933a {

            /* renamed from: a */
            final ArrayList<C0945x> f3380a = new ArrayList<>();

            /* renamed from: b */
            int f3381b = 5;

            /* renamed from: c */
            long f3382c = 0;

            /* renamed from: d */
            long f3383d = 0;

            C0933a() {
            }
        }

        /* renamed from: a */
        public void mo4508a() {
            for (int i = 0; i < this.f3378a.size(); i++) {
                this.f3378a.valueAt(i).f3380a.clear();
            }
        }

        /* renamed from: a */
        public C0945x mo4507a(int i) {
            C0933a aVar = this.f3378a.get(i);
            if (aVar == null || aVar.f3380a.isEmpty()) {
                return null;
            }
            ArrayList<C0945x> arrayList = aVar.f3380a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo4511a(C0945x xVar) {
            int h = xVar.mo4610h();
            ArrayList<C0945x> arrayList = m4847b(h).f3380a;
            if (this.f3378a.get(h).f3381b > arrayList.size()) {
                xVar.mo4625v();
                arrayList.add(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo4506a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4509a(int i, long j) {
            C0933a b = m4847b(i);
            b.f3382c = mo4506a(b.f3382c, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4514b(int i, long j) {
            C0933a b = m4847b(i);
            b.f3383d = mo4506a(b.f3383d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4512a(int i, long j, long j2) {
            long j3 = m4847b(i).f3382c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4515b(int i, long j, long j2) {
            long j3 = m4847b(i).f3383d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4513b() {
            this.f3379b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4516c() {
            this.f3379b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4510a(C0911a aVar, C0911a aVar2, boolean z) {
            if (aVar != null) {
                mo4516c();
            }
            if (!z && this.f3379b == 0) {
                mo4508a();
            }
            if (aVar2 != null) {
                mo4513b();
            }
        }

        /* renamed from: b */
        private C0933a m4847b(int i) {
            C0933a aVar = this.f3378a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0933a aVar2 = new C0933a();
            this.f3378a.put(i, aVar2);
            return aVar2;
        }
    }

    /* renamed from: j */
    static C0904ay m4523j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C0904ay) {
            return (C0904ay) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0904ay j = m4523j(viewGroup.getChildAt(i));
            if (j != null) {
                return j;
            }
        }
        return null;
    }

    /* renamed from: c */
    static void m4519c(C0945x xVar) {
        if (xVar.f3435b != null) {
            View view = (View) xVar.f3435b.get();
            while (view != null) {
                if (view != xVar.f3434a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            xVar.f3435b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3257d) {
            return System.nanoTime();
        }
        return 0;
    }

    /* renamed from: android.support.v7.widget.ay$p */
    public final class C0934p {

        /* renamed from: a */
        final ArrayList<C0945x> f3384a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0945x> f3385b = null;

        /* renamed from: c */
        final ArrayList<C0945x> f3386c = new ArrayList<>();

        /* renamed from: d */
        int f3387d = 2;

        /* renamed from: e */
        C0932o f3388e;

        /* renamed from: g */
        private final List<C0945x> f3390g = Collections.unmodifiableList(this.f3384a);

        /* renamed from: h */
        private int f3391h = 2;

        /* renamed from: i */
        private C0943v f3392i;

        public C0934p() {
        }

        /* renamed from: a */
        public void mo4520a() {
            this.f3384a.clear();
            mo4541d();
        }

        /* renamed from: a */
        public void mo4521a(int i) {
            this.f3391h = i;
            mo4532b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4532b() {
            this.f3387d = this.f3391h + (C0904ay.this.f3319n != null ? C0904ay.this.f3319n.f3366x : 0);
            for (int size = this.f3386c.size() - 1; size >= 0 && this.f3386c.size() > this.f3387d; size--) {
                mo4542d(size);
            }
        }

        /* renamed from: c */
        public List<C0945x> mo4537c() {
            return this.f3390g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4529a(C0945x xVar) {
            if (xVar.mo4619q()) {
                return C0904ay.this.f3261D.mo4577a();
            }
            if (xVar.f3436c < 0 || xVar.f3436c >= C0904ay.this.f3318m.mo4361a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + xVar + C0904ay.this.mo4189a());
            } else if (!C0904ay.this.f3261D.mo4577a() && C0904ay.this.f3318m.mo4362a(xVar.f3436c) != xVar.mo4610h()) {
                return false;
            } else {
                if (!C0904ay.this.f3318m.mo4374b() || xVar.mo4609g() == C0904ay.this.f3318m.mo4369b(xVar.f3436c)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        private boolean m4860a(C0945x xVar, int i, int i2, long j) {
            xVar.f3449p = C0904ay.this;
            int h = xVar.mo4610h();
            long nanoTime = C0904ay.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3388e.mo4515b(h, nanoTime, j)) {
                return false;
            }
            C0904ay.this.f3318m.mo4372b(xVar, i);
            this.f3388e.mo4514b(xVar.mo4610h(), C0904ay.this.getNanoTime() - nanoTime);
            m4861e(xVar);
            if (!C0904ay.this.f3261D.mo4577a()) {
                return true;
            }
            xVar.f3440g = i2;
            return true;
        }

        /* renamed from: b */
        public int mo4530b(int i) {
            if (i < 0 || i >= C0904ay.this.f3261D.mo4581e()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + C0904ay.this.f3261D.mo4581e() + C0904ay.this.mo4189a());
            } else if (!C0904ay.this.f3261D.mo4577a()) {
                return i;
            } else {
                return C0904ay.this.f3311f.mo4879b(i);
            }
        }

        /* renamed from: c */
        public View mo4536c(int i) {
            return mo4519a(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo4519a(int i, boolean z) {
            return mo4517a(i, z, Long.MAX_VALUE).f3434a;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x020c  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x021a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p039v7.widget.C0904ay.C0945x mo4517a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x023d
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r1 = r1.f3261D
                int r1 = r1.mo4581e()
                if (r3 >= r1) goto L_0x023d
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r1 = r1.f3261D
                boolean r1 = r1.mo4577a()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0029
                android.support.v7.widget.ay$x r1 = r16.mo4546f((int) r17)
                if (r1 == 0) goto L_0x0027
                r4 = 1
                goto L_0x002b
            L_0x0027:
                r4 = 0
                goto L_0x002b
            L_0x0029:
                r1 = r2
                r4 = 0
            L_0x002b:
                if (r1 != 0) goto L_0x005f
                android.support.v7.widget.ay$x r1 = r16.mo4531b((int) r17, (boolean) r18)
                if (r1 == 0) goto L_0x005f
                boolean r5 = r6.mo4529a((android.support.p039v7.widget.C0904ay.C0945x) r1)
                if (r5 != 0) goto L_0x005e
                if (r0 != 0) goto L_0x005c
                r5 = 4
                r1.mo4603b((int) r5)
                boolean r5 = r1.mo4611i()
                if (r5 == 0) goto L_0x0050
                android.support.v7.widget.ay r5 = android.support.p039v7.widget.C0904ay.this
                android.view.View r9 = r1.f3434a
                r5.removeDetachedView(r9, r8)
                r1.mo4612j()
                goto L_0x0059
            L_0x0050:
                boolean r5 = r1.mo4613k()
                if (r5 == 0) goto L_0x0059
                r1.mo4614l()
            L_0x0059:
                r6.mo4534b((android.support.p039v7.widget.C0904ay.C0945x) r1)
            L_0x005c:
                r1 = r2
                goto L_0x005f
            L_0x005e:
                r4 = 1
            L_0x005f:
                if (r1 != 0) goto L_0x018d
                android.support.v7.widget.ay r5 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.e r5 = r5.f3311f
                int r5 = r5.mo4879b((int) r3)
                if (r5 < 0) goto L_0x0150
                android.support.v7.widget.ay r9 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$a r9 = r9.f3318m
                int r9 = r9.mo4361a()
                if (r5 >= r9) goto L_0x0150
                android.support.v7.widget.ay r9 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$a r9 = r9.f3318m
                int r9 = r9.mo4362a((int) r5)
                android.support.v7.widget.ay r10 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$a r10 = r10.f3318m
                boolean r10 = r10.mo4374b()
                if (r10 == 0) goto L_0x0098
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$a r1 = r1.f3318m
                long r10 = r1.mo4369b((int) r5)
                android.support.v7.widget.ay$x r1 = r6.mo4518a((long) r10, (int) r9, (boolean) r0)
                if (r1 == 0) goto L_0x0098
                r1.f3436c = r5
                r4 = 1
            L_0x0098:
                if (r1 != 0) goto L_0x00ed
                android.support.v7.widget.ay$v r0 = r6.f3392i
                if (r0 == 0) goto L_0x00ed
                android.view.View r0 = r0.mo4583a(r6, r3, r9)
                if (r0 == 0) goto L_0x00ed
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$x r1 = r1.mo4212b((android.view.View) r0)
                if (r1 == 0) goto L_0x00d0
                boolean r0 = r1.mo4605c()
                if (r0 != 0) goto L_0x00b3
                goto L_0x00ed
            L_0x00b3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                java.lang.String r2 = r2.mo4189a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00d0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                java.lang.String r2 = r2.mo4189a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ed:
                if (r1 != 0) goto L_0x0103
                android.support.v7.widget.ay$o r0 = r16.mo4548g()
                android.support.v7.widget.ay$x r1 = r0.mo4507a((int) r9)
                if (r1 == 0) goto L_0x0103
                r1.mo4625v()
                boolean r0 = android.support.p039v7.widget.C0904ay.f3254a
                if (r0 == 0) goto L_0x0103
                r6.m4862f((android.support.p039v7.widget.C0904ay.C0945x) r1)
            L_0x0103:
                if (r1 != 0) goto L_0x014d
                android.support.v7.widget.ay r0 = android.support.p039v7.widget.C0904ay.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                android.support.v7.widget.ay$o r10 = r6.f3388e
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4512a((int) r11, (long) r12, (long) r14)
                if (r5 != 0) goto L_0x0121
                return r2
            L_0x0121:
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$a r2 = r2.f3318m
                android.support.v7.widget.ay r5 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$x r2 = r2.mo4370b((android.view.ViewGroup) r5, (int) r9)
                boolean r5 = android.support.p039v7.widget.C0904ay.f3257d
                if (r5 == 0) goto L_0x013e
                android.view.View r5 = r2.f3434a
                android.support.v7.widget.ay r5 = android.support.p039v7.widget.C0904ay.m4523j(r5)
                if (r5 == 0) goto L_0x013e
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3435b = r10
            L_0x013e:
                android.support.v7.widget.ay r5 = android.support.p039v7.widget.C0904ay.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.ay$o r5 = r6.f3388e
                long r10 = r10 - r0
                r5.mo4509a((int) r9, (long) r10)
                r10 = r2
                r9 = r4
                goto L_0x018f
            L_0x014d:
                r10 = r1
                r9 = r4
                goto L_0x018f
            L_0x0150:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r2 = r2.f3261D
                int r2 = r2.mo4581e()
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                java.lang.String r2 = r2.mo4189a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x018d:
                r10 = r1
                r9 = r4
            L_0x018f:
                if (r9 == 0) goto L_0x01c9
                android.support.v7.widget.ay r0 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r0 = r0.f3261D
                boolean r0 = r0.mo4577a()
                if (r0 != 0) goto L_0x01c9
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo4601a((int) r0)
                if (r1 == 0) goto L_0x01c9
                r10.mo4594a((int) r8, (int) r0)
                android.support.v7.widget.ay r0 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r0 = r0.f3261D
                boolean r0 = r0.f3418j
                if (r0 == 0) goto L_0x01c9
                int r0 = android.support.p039v7.widget.C0904ay.C0916f.m4653e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$f r1 = r1.f3331z
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r2 = r2.f3261D
                java.util.List r4 = r10.mo4624u()
                android.support.v7.widget.ay$f$c r0 = r1.mo4381a((android.support.p039v7.widget.C0904ay.C0942u) r2, (android.support.p039v7.widget.C0904ay.C0945x) r10, (int) r0, (java.util.List<java.lang.Object>) r4)
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                r1.mo4201a((android.support.p039v7.widget.C0904ay.C0945x) r10, (android.support.p039v7.widget.C0904ay.C0916f.C0919c) r0)
            L_0x01c9:
                android.support.v7.widget.ay r0 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r0 = r0.f3261D
                boolean r0 = r0.mo4577a()
                if (r0 == 0) goto L_0x01dc
                boolean r0 = r10.mo4618p()
                if (r0 == 0) goto L_0x01dc
                r10.f3440g = r3
                goto L_0x01ef
            L_0x01dc:
                boolean r0 = r10.mo4618p()
                if (r0 == 0) goto L_0x01f1
                boolean r0 = r10.mo4617o()
                if (r0 != 0) goto L_0x01f1
                boolean r0 = r10.mo4616n()
                if (r0 == 0) goto L_0x01ef
                goto L_0x01f1
            L_0x01ef:
                r0 = 0
                goto L_0x0204
            L_0x01f1:
                android.support.v7.widget.ay r0 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.e r0 = r0.f3311f
                int r2 = r0.mo4879b((int) r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4860a(r1, r2, r3, r4)
            L_0x0204:
                android.view.View r1 = r10.f3434a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x021a
                android.support.v7.widget.ay r1 = android.support.p039v7.widget.C0904ay.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                android.support.v7.widget.ay$j r1 = (android.support.p039v7.widget.C0904ay.C0927j) r1
                android.view.View r2 = r10.f3434a
                r2.setLayoutParams(r1)
                goto L_0x0232
            L_0x021a:
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0230
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                android.support.v7.widget.ay$j r1 = (android.support.p039v7.widget.C0904ay.C0927j) r1
                android.view.View r2 = r10.f3434a
                r2.setLayoutParams(r1)
                goto L_0x0232
            L_0x0230:
                android.support.v7.widget.ay$j r1 = (android.support.p039v7.widget.C0904ay.C0927j) r1
            L_0x0232:
                r1.f3374c = r10
                if (r9 == 0) goto L_0x0239
                if (r0 == 0) goto L_0x0239
                goto L_0x023a
            L_0x0239:
                r7 = 0
            L_0x023a:
                r1.f3377f = r7
                return r10
            L_0x023d:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                android.support.v7.widget.ay$u r2 = r2.f3261D
                int r2 = r2.mo4581e()
                r1.append(r2)
                android.support.v7.widget.ay r2 = android.support.p039v7.widget.C0904ay.this
                java.lang.String r2 = r2.mo4189a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0904ay.C0934p.mo4517a(int, boolean, long):android.support.v7.widget.ay$x");
        }

        /* renamed from: e */
        private void m4861e(C0945x xVar) {
            if (C0904ay.this.mo4294n()) {
                View view = xVar.f3434a;
                if (C0594r.m2600e(view) == 0) {
                    C0594r.m2592b(view, 1);
                }
                if (!C0594r.m2594b(view)) {
                    xVar.mo4603b(16384);
                    C0594r.m2585a(view, C0904ay.this.f3265H.mo4631c());
                }
            }
        }

        /* renamed from: f */
        private void m4862f(C0945x xVar) {
            if (xVar.f3434a instanceof ViewGroup) {
                m4859a((ViewGroup) xVar.f3434a, false);
            }
        }

        /* renamed from: a */
        private void m4859a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4859a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        public void mo4528a(View view) {
            C0945x e = C0904ay.m4521e(view);
            if (e.mo4620r()) {
                C0904ay.this.removeDetachedView(view, false);
            }
            if (e.mo4611i()) {
                e.mo4612j();
            } else if (e.mo4613k()) {
                e.mo4614l();
            }
            mo4534b(e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4541d() {
            for (int size = this.f3386c.size() - 1; size >= 0; size--) {
                mo4542d(size);
            }
            this.f3386c.clear();
            if (C0904ay.f3257d) {
                C0904ay.this.f3260C.mo4074a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4542d(int i) {
            mo4527a(this.f3386c.get(i), true);
            this.f3386c.remove(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4534b(C0945x xVar) {
            boolean z;
            boolean z2 = false;
            if (xVar.mo4611i() || xVar.f3434a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(xVar.mo4611i());
                sb.append(" isAttached:");
                if (xVar.f3434a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(C0904ay.this.mo4189a());
                throw new IllegalArgumentException(sb.toString());
            } else if (xVar.mo4620r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + xVar + C0904ay.this.mo4189a());
            } else if (!xVar.mo4605c()) {
                boolean y = xVar.mo4628y();
                if ((C0904ay.this.f3318m != null && y && C0904ay.this.f3318m.mo4375b(xVar)) || xVar.mo4626w()) {
                    if (this.f3387d <= 0 || xVar.mo4601a(526)) {
                        z = false;
                    } else {
                        int size = this.f3386c.size();
                        if (size >= this.f3387d && size > 0) {
                            mo4542d(0);
                            size--;
                        }
                        if (C0904ay.f3257d && size > 0 && !C0904ay.this.f3260C.mo4077a(xVar.f3436c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!C0904ay.this.f3260C.mo4077a(this.f3386c.get(i).f3436c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3386c.add(size, xVar);
                        z = true;
                    }
                    if (!z) {
                        mo4527a(xVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                C0904ay.this.f3313h.mo4838g(xVar);
                if (!z && !z2 && y) {
                    xVar.f3449p = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + C0904ay.this.mo4189a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4527a(C0945x xVar, boolean z) {
            C0904ay.m4519c(xVar);
            if (xVar.mo4601a(16384)) {
                xVar.mo4594a(0, 16384);
                C0594r.m2585a(xVar.f3434a, (C0570b) null);
            }
            if (z) {
                mo4543d(xVar);
            }
            xVar.f3449p = null;
            mo4548g().mo4511a(xVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4535b(View view) {
            C0945x e = C0904ay.m4521e(view);
            e.f3446m = null;
            e.f3447n = false;
            e.mo4614l();
            mo4534b(e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4540c(View view) {
            C0945x e = C0904ay.m4521e(view);
            if (!e.mo4601a(12) && e.mo4629z() && !C0904ay.this.mo4221b(e)) {
                if (this.f3385b == null) {
                    this.f3385b = new ArrayList<>();
                }
                e.mo4597a(this, true);
                this.f3385b.add(e);
            } else if (!e.mo4616n() || e.mo4619q() || C0904ay.this.f3318m.mo4374b()) {
                e.mo4597a(this, false);
                this.f3384a.add(e);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + C0904ay.this.mo4189a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4539c(C0945x xVar) {
            if (xVar.f3447n) {
                this.f3385b.remove(xVar);
            } else {
                this.f3384a.remove(xVar);
            }
            xVar.f3446m = null;
            xVar.f3447n = false;
            xVar.mo4614l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo4544e() {
            return this.f3384a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public View mo4545e(int i) {
            return this.f3384a.get(i).f3434a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4547f() {
            this.f3384a.clear();
            ArrayList<C0945x> arrayList = this.f3385b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0945x mo4546f(int i) {
            int size;
            int b;
            ArrayList<C0945x> arrayList = this.f3385b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0945x xVar = this.f3385b.get(i3);
                if (xVar.mo4613k() || xVar.mo4606d() != i) {
                    i3++;
                } else {
                    xVar.mo4603b(32);
                    return xVar;
                }
            }
            if (C0904ay.this.f3318m.mo4374b() && (b = C0904ay.this.f3311f.mo4879b(i)) > 0 && b < C0904ay.this.f3318m.mo4361a()) {
                long b2 = C0904ay.this.f3318m.mo4369b(b);
                while (i2 < size) {
                    C0945x xVar2 = this.f3385b.get(i2);
                    if (xVar2.mo4613k() || xVar2.mo4609g() != b2) {
                        i2++;
                    } else {
                        xVar2.mo4603b(32);
                        return xVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0945x mo4531b(int i, boolean z) {
            View c;
            int size = this.f3384a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0945x xVar = this.f3384a.get(i3);
                if (xVar.mo4613k() || xVar.mo4606d() != i || xVar.mo4616n() || (!C0904ay.this.f3261D.f3415g && xVar.mo4619q())) {
                    i3++;
                } else {
                    xVar.mo4603b(32);
                    return xVar;
                }
            }
            if (z || (c = C0904ay.this.f3312g.mo3939c(i)) == null) {
                int size2 = this.f3386c.size();
                while (i2 < size2) {
                    C0945x xVar2 = this.f3386c.get(i2);
                    if (xVar2.mo4616n() || xVar2.mo4606d() != i) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3386c.remove(i2);
                        }
                        return xVar2;
                    }
                }
                return null;
            }
            C0945x e = C0904ay.m4521e(c);
            C0904ay.this.f3312g.mo3944e(c);
            int b = C0904ay.this.f3312g.mo3936b(c);
            if (b != -1) {
                C0904ay.this.f3312g.mo3943e(b);
                mo4540c(c);
                e.mo4603b(8224);
                return e;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e + C0904ay.this.mo4189a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0945x mo4518a(long j, int i, boolean z) {
            for (int size = this.f3384a.size() - 1; size >= 0; size--) {
                C0945x xVar = this.f3384a.get(size);
                if (xVar.mo4609g() == j && !xVar.mo4613k()) {
                    if (i == xVar.mo4610h()) {
                        xVar.mo4603b(32);
                        if (xVar.mo4619q() && !C0904ay.this.f3261D.mo4577a()) {
                            xVar.mo4594a(2, 14);
                        }
                        return xVar;
                    } else if (!z) {
                        this.f3384a.remove(size);
                        C0904ay.this.removeDetachedView(xVar.f3434a, false);
                        mo4535b(xVar.f3434a);
                    }
                }
            }
            int size2 = this.f3386c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0945x xVar2 = this.f3386c.get(size2);
                if (xVar2.mo4609g() == j) {
                    if (i == xVar2.mo4610h()) {
                        if (!z) {
                            this.f3386c.remove(size2);
                        }
                        return xVar2;
                    } else if (!z) {
                        mo4542d(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4543d(C0945x xVar) {
            if (C0904ay.this.f3320o != null) {
                C0904ay.this.f3320o.mo4552a(xVar);
            }
            if (C0904ay.this.f3318m != null) {
                C0904ay.this.f3318m.mo4365a(xVar);
            }
            if (C0904ay.this.f3261D != null) {
                C0904ay.this.f3313h.mo4838g(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4524a(C0911a aVar, C0911a aVar2, boolean z) {
            mo4520a();
            mo4548g().mo4510a(aVar, aVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4522a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f3386c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0945x xVar = this.f3386c.get(i6);
                if (xVar != null && xVar.f3436c >= i5 && xVar.f3436c <= i4) {
                    if (xVar.f3436c == i) {
                        xVar.mo4596a(i2 - i, false);
                    } else {
                        xVar.mo4596a(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4533b(int i, int i2) {
            int size = this.f3386c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0945x xVar = this.f3386c.get(i3);
                if (xVar != null && xVar.f3436c >= i) {
                    xVar.mo4596a(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4523a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3386c.size() - 1; size >= 0; size--) {
                C0945x xVar = this.f3386c.get(size);
                if (xVar != null) {
                    if (xVar.f3436c >= i3) {
                        xVar.mo4596a(-i2, z);
                    } else if (xVar.f3436c >= i) {
                        xVar.mo4603b(8);
                        mo4542d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4526a(C0943v vVar) {
            this.f3392i = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4525a(C0932o oVar) {
            C0932o oVar2 = this.f3388e;
            if (oVar2 != null) {
                oVar2.mo4516c();
            }
            this.f3388e = oVar;
            if (this.f3388e != null && C0904ay.this.getAdapter() != null) {
                this.f3388e.mo4513b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0932o mo4548g() {
            if (this.f3388e == null) {
                this.f3388e = new C0932o();
            }
            return this.f3388e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4538c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3386c.size() - 1; size >= 0; size--) {
                C0945x xVar = this.f3386c.get(size);
                if (xVar != null && (i3 = xVar.f3436c) >= i && i3 < i4) {
                    xVar.mo4603b(2);
                    mo4542d(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4549h() {
            int size = this.f3386c.size();
            for (int i = 0; i < size; i++) {
                C0945x xVar = this.f3386c.get(i);
                if (xVar != null) {
                    xVar.mo4603b(6);
                    xVar.mo4599a((Object) null);
                }
            }
            if (C0904ay.this.f3318m == null || !C0904ay.this.f3318m.mo4374b()) {
                mo4541d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4550i() {
            int size = this.f3386c.size();
            for (int i = 0; i < size; i++) {
                this.f3386c.get(i).mo4593a();
            }
            int size2 = this.f3384a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3384a.get(i2).mo4593a();
            }
            ArrayList<C0945x> arrayList = this.f3385b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3385b.get(i3).mo4593a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4551j() {
            int size = this.f3386c.size();
            for (int i = 0; i < size; i++) {
                C0927j jVar = (C0927j) this.f3386c.get(i).f3434a.getLayoutParams();
                if (jVar != null) {
                    jVar.f3376e = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.ay$a */
    public static abstract class C0911a<VH extends C0945x> {

        /* renamed from: a */
        private final C0912b f3337a;

        /* renamed from: b */
        private boolean f3338b;

        /* renamed from: a */
        public abstract int mo4361a();

        /* renamed from: a */
        public int mo4362a(int i) {
            return 0;
        }

        /* renamed from: a */
        public abstract VH mo4363a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        public void mo4365a(VH vh) {
        }

        /* renamed from: a */
        public abstract void mo4366a(VH vh, int i);

        /* renamed from: a */
        public void mo4368a(C0904ay ayVar) {
        }

        /* renamed from: b */
        public long mo4369b(int i) {
            return -1;
        }

        /* renamed from: b */
        public void mo4373b(C0904ay ayVar) {
        }

        /* renamed from: b */
        public boolean mo4375b(VH vh) {
            return false;
        }

        /* renamed from: c */
        public void mo4376c(VH vh) {
        }

        /* renamed from: d */
        public void mo4377d(VH vh) {
        }

        /* renamed from: a */
        public void mo4367a(VH vh, int i, List<Object> list) {
            mo4366a(vh, i);
        }

        /* renamed from: b */
        public final VH mo4370b(ViewGroup viewGroup, int i) {
            try {
                C0492a.m2183a("RV CreateView");
                VH a = mo4363a(viewGroup, i);
                if (a.f3434a.getParent() == null) {
                    a.f3439f = i;
                    return a;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0492a.m2182a();
            }
        }

        /* renamed from: b */
        public final void mo4372b(VH vh, int i) {
            vh.f3436c = i;
            if (mo4374b()) {
                vh.f3438e = mo4369b(i);
            }
            vh.mo4594a(1, 519);
            C0492a.m2183a("RV OnBindView");
            mo4367a(vh, i, vh.mo4624u());
            vh.mo4622t();
            ViewGroup.LayoutParams layoutParams = vh.f3434a.getLayoutParams();
            if (layoutParams instanceof C0927j) {
                ((C0927j) layoutParams).f3376e = true;
            }
            C0492a.m2182a();
        }

        /* renamed from: b */
        public final boolean mo4374b() {
            return this.f3338b;
        }

        /* renamed from: a */
        public void mo4364a(C0913c cVar) {
            this.f3337a.registerObserver(cVar);
        }

        /* renamed from: b */
        public void mo4371b(C0913c cVar) {
            this.f3337a.unregisterObserver(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4290k(View view) {
        C0945x e = m4521e(view);
        mo4280h(view);
        C0911a aVar = this.f3318m;
        if (!(aVar == null || e == null)) {
            aVar.mo4377d(e);
        }
        List<C0928k> list = this.f3287ad;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3287ad.get(size).mo4503b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4292l(View view) {
        C0945x e = m4521e(view);
        mo4258g(view);
        C0911a aVar = this.f3318m;
        if (!(aVar == null || e == null)) {
            aVar.mo4376c(e);
        }
        List<C0928k> list = this.f3287ad;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3287ad.get(size).mo4502a(view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ay$i */
    public static abstract class C0922i {

        /* renamed from: a */
        private final C0978bt.C0980b f3350a = new C0978bt.C0980b() {
            /* renamed from: a */
            public View mo4495a(int i) {
                return C0922i.this.mo4474i(i);
            }

            /* renamed from: a */
            public int mo4493a() {
                return C0922i.this.mo4405A();
            }

            /* renamed from: b */
            public int mo4496b() {
                return C0922i.this.mo4491y() - C0922i.this.mo4407C();
            }

            /* renamed from: a */
            public int mo4494a(View view) {
                return C0922i.this.mo4471h(view) - ((C0927j) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public int mo4497b(View view) {
                return C0922i.this.mo4475j(view) + ((C0927j) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: b */
        private final C0978bt.C0980b f3351b = new C0978bt.C0980b() {
            /* renamed from: a */
            public View mo4495a(int i) {
                return C0922i.this.mo4474i(i);
            }

            /* renamed from: a */
            public int mo4493a() {
                return C0922i.this.mo4406B();
            }

            /* renamed from: b */
            public int mo4496b() {
                return C0922i.this.mo4492z() - C0922i.this.mo4408D();
            }

            /* renamed from: a */
            public int mo4494a(View view) {
                return C0922i.this.mo4473i(view) - ((C0927j) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo4497b(View view) {
                return C0922i.this.mo4476k(view) + ((C0927j) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: c */
        private boolean f3352c = true;

        /* renamed from: d */
        private boolean f3353d = true;

        /* renamed from: e */
        private int f3354e;

        /* renamed from: f */
        private int f3355f;

        /* renamed from: g */
        private int f3356g;

        /* renamed from: h */
        private int f3357h;

        /* renamed from: p */
        C0851ah f3358p;

        /* renamed from: q */
        C0904ay f3359q;

        /* renamed from: r */
        C0978bt f3360r = new C0978bt(this.f3350a);

        /* renamed from: s */
        C0978bt f3361s = new C0978bt(this.f3351b);

        /* renamed from: t */
        C0939t f3362t;

        /* renamed from: u */
        boolean f3363u = false;

        /* renamed from: v */
        boolean f3364v = false;

        /* renamed from: w */
        boolean f3365w = false;

        /* renamed from: x */
        int f3366x;

        /* renamed from: y */
        boolean f3367y;

        /* renamed from: android.support.v7.widget.ay$i$a */
        public interface C0925a {
            /* renamed from: b */
            void mo4078b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.ay$i$b */
        public static class C0926b {

            /* renamed from: a */
            public int f3370a;

            /* renamed from: b */
            public int f3371b;

            /* renamed from: c */
            public boolean f3372c;

            /* renamed from: d */
            public boolean f3373d;
        }

        /* renamed from: a */
        public int mo3512a(int i, C0934p pVar, C0942u uVar) {
            return 0;
        }

        /* renamed from: a */
        public abstract C0927j mo3514a();

        /* renamed from: a */
        public View mo3518a(View view, int i, C0934p pVar, C0942u uVar) {
            return null;
        }

        /* renamed from: a */
        public void mo3547a(int i, int i2, C0942u uVar, C0925a aVar) {
        }

        /* renamed from: a */
        public void mo3548a(int i, C0925a aVar) {
        }

        /* renamed from: a */
        public void mo3549a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo4417a(C0911a aVar, C0911a aVar2) {
        }

        /* renamed from: a */
        public void mo3524a(C0942u uVar) {
        }

        /* renamed from: a */
        public void mo3526a(C0904ay ayVar) {
        }

        /* renamed from: a */
        public void mo3527a(C0904ay ayVar, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3528a(C0904ay ayVar, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public boolean mo3531a(C0927j jVar) {
            return jVar != null;
        }

        /* renamed from: a */
        public boolean mo4434a(C0934p pVar, C0942u uVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4439a(C0904ay ayVar, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public int mo3532b(int i, C0934p pVar, C0942u uVar) {
            return 0;
        }

        /* renamed from: b */
        public void mo3534b(C0904ay ayVar, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo3535b() {
            return false;
        }

        /* renamed from: c */
        public int mo3558c(C0942u uVar) {
            return 0;
        }

        /* renamed from: c */
        public void mo4454c(C0904ay ayVar, int i, int i2) {
        }

        /* renamed from: d */
        public int mo4457d(C0934p pVar, C0942u uVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo3561d(C0942u uVar) {
            return 0;
        }

        /* renamed from: d */
        public Parcelable mo3563d() {
            return null;
        }

        /* renamed from: d */
        public View mo4459d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo4461d(C0904ay ayVar) {
        }

        /* renamed from: e */
        public int mo3564e(C0942u uVar) {
            return 0;
        }

        /* renamed from: e */
        public void mo3565e(int i) {
        }

        @Deprecated
        /* renamed from: e */
        public void mo4464e(C0904ay ayVar) {
        }

        /* renamed from: e */
        public boolean mo3566e() {
            return false;
        }

        /* renamed from: e */
        public boolean mo4465e(C0934p pVar, C0942u uVar) {
            return false;
        }

        /* renamed from: f */
        public int mo3568f(C0942u uVar) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo3569f() {
            return false;
        }

        /* renamed from: g */
        public int mo3571g(C0942u uVar) {
            return 0;
        }

        /* renamed from: h */
        public int mo3572h(C0942u uVar) {
            return 0;
        }

        /* renamed from: l */
        public void mo3709l(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo3577l() {
            return false;
        }

        /* renamed from: u */
        public int mo4487u() {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4445b(C0904ay ayVar) {
            if (ayVar == null) {
                this.f3359q = null;
                this.f3358p = null;
                this.f3356g = 0;
                this.f3357h = 0;
            } else {
                this.f3359q = ayVar;
                this.f3358p = ayVar.f3312g;
                this.f3356g = ayVar.getWidth();
                this.f3357h = ayVar.getHeight();
            }
            this.f3354e = 1073741824;
            this.f3355f = 1073741824;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4451c(int i, int i2) {
            this.f3356g = View.MeasureSpec.getSize(i);
            this.f3354e = View.MeasureSpec.getMode(i);
            if (this.f3354e == 0 && !C0904ay.f3255b) {
                this.f3356g = 0;
            }
            this.f3357h = View.MeasureSpec.getSize(i2);
            this.f3355f = View.MeasureSpec.getMode(i2);
            if (this.f3355f == 0 && !C0904ay.f3255b) {
                this.f3357h = 0;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4460d(int i, int i2) {
            int v = mo4488v();
            if (v == 0) {
                this.f3359q.mo4249e(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < v; i7++) {
                View i8 = mo4474i(i7);
                Rect rect = this.f3359q.f3316k;
                mo4428a(i8, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f3359q.f3316k.set(i3, i4, i5, i6);
            mo3520a(this.f3359q.f3316k, i, i2);
        }

        /* renamed from: a */
        public void mo3520a(Rect rect, int i, int i2) {
            mo4467f(m4686a(i, rect.width() + mo4405A() + mo4407C(), mo4410F()), m4686a(i2, rect.height() + mo4406B() + mo4408D(), mo4411G()));
        }

        /* renamed from: o */
        public void mo4481o() {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                ayVar.requestLayout();
            }
        }

        /* renamed from: a */
        public static int m4686a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: a */
        public void mo3552a(String str) {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                ayVar.mo4203a(str);
            }
        }

        /* renamed from: c */
        public boolean mo3560c() {
            return this.f3365w;
        }

        /* renamed from: p */
        public final boolean mo4482p() {
            return this.f3353d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4453c(C0904ay ayVar) {
            this.f3364v = true;
            mo4461d(ayVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4446b(C0904ay ayVar, C0934p pVar) {
            this.f3364v = false;
            mo3550a(ayVar, pVar);
        }

        /* renamed from: q */
        public boolean mo4483q() {
            return this.f3364v;
        }

        /* renamed from: a */
        public boolean mo4443a(Runnable runnable) {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                return ayVar.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: a */
        public void mo3550a(C0904ay ayVar, C0934p pVar) {
            mo4464e(ayVar);
        }

        /* renamed from: r */
        public boolean mo4484r() {
            C0904ay ayVar = this.f3359q;
            return ayVar != null && ayVar.f3314i;
        }

        /* renamed from: c */
        public void mo3536c(C0934p pVar, C0942u uVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: a */
        public C0927j mo3516a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0927j) {
                return new C0927j((C0927j) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C0927j((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C0927j(layoutParams);
        }

        /* renamed from: a */
        public C0927j mo3515a(Context context, AttributeSet attributeSet) {
            return new C0927j(context, attributeSet);
        }

        /* renamed from: s */
        public boolean mo4485s() {
            C0939t tVar = this.f3362t;
            return tVar != null && tVar.mo4570d();
        }

        /* renamed from: t */
        public int mo4486t() {
            return C0594r.m2602f(this.f3359q);
        }

        /* renamed from: a */
        public void mo4423a(View view) {
            mo4424a(view, -1);
        }

        /* renamed from: a */
        public void mo4424a(View view, int i) {
            m4691a(view, i, true);
        }

        /* renamed from: b */
        public void mo4447b(View view) {
            mo4448b(view, -1);
        }

        /* renamed from: b */
        public void mo4448b(View view, int i) {
            m4691a(view, i, false);
        }

        /* renamed from: a */
        private void m4691a(View view, int i, boolean z) {
            C0945x e = C0904ay.m4521e(view);
            if (z || e.mo4619q()) {
                this.f3359q.f3313h.mo4836e(e);
            } else {
                this.f3359q.f3313h.mo4837f(e);
            }
            C0927j jVar = (C0927j) view.getLayoutParams();
            if (e.mo4613k() || e.mo4611i()) {
                if (e.mo4611i()) {
                    e.mo4612j();
                } else {
                    e.mo4614l();
                }
                this.f3358p.mo3932a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3359q) {
                int b = this.f3358p.mo3936b(view);
                if (i == -1) {
                    i = this.f3358p.mo3935b();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3359q.indexOfChild(view) + this.f3359q.mo4189a());
                } else if (b != i) {
                    this.f3359q.f3319n.mo4463e(b, i);
                }
            } else {
                this.f3358p.mo3933a(view, i, false);
                jVar.f3376e = true;
                C0939t tVar = this.f3362t;
                if (tVar != null && tVar.mo4570d()) {
                    this.f3362t.mo4568b(view);
                }
            }
            if (jVar.f3377f) {
                e.f3434a.invalidate();
                jVar.f3377f = false;
            }
        }

        /* renamed from: c */
        public void mo4455c(View view) {
            this.f3358p.mo3931a(view);
        }

        /* renamed from: g */
        public void mo4470g(int i) {
            if (mo4474i(i) != null) {
                this.f3358p.mo3930a(i);
            }
        }

        /* renamed from: d */
        public int mo4458d(View view) {
            return ((C0927j) view.getLayoutParams()).mo4501f();
        }

        /* renamed from: e */
        public View mo4462e(View view) {
            View c;
            C0904ay ayVar = this.f3359q;
            if (ayVar == null || (c = ayVar.mo4223c(view)) == null || this.f3358p.mo3940c(c)) {
                return null;
            }
            return c;
        }

        /* renamed from: c */
        public View mo3559c(int i) {
            int v = mo4488v();
            for (int i2 = 0; i2 < v; i2++) {
                View i3 = mo4474i(i2);
                C0945x e = C0904ay.m4521e(i3);
                if (e != null && e.mo4606d() == i && !e.mo4605c() && (this.f3359q.f3261D.mo4577a() || !e.mo4619q())) {
                    return i3;
                }
            }
            return null;
        }

        /* renamed from: h */
        public void mo4472h(int i) {
            m4689a(i, mo4474i(i));
        }

        /* renamed from: a */
        private void m4689a(int i, View view) {
            this.f3358p.mo3943e(i);
        }

        /* renamed from: a */
        public void mo4427a(View view, int i, C0927j jVar) {
            C0945x e = C0904ay.m4521e(view);
            if (e.mo4619q()) {
                this.f3359q.f3313h.mo4836e(e);
            } else {
                this.f3359q.f3313h.mo4837f(e);
            }
            this.f3358p.mo3932a(view, i, jVar, e.mo4619q());
        }

        /* renamed from: c */
        public void mo4456c(View view, int i) {
            mo4427a(view, i, (C0927j) view.getLayoutParams());
        }

        /* renamed from: e */
        public void mo4463e(int i, int i2) {
            View i3 = mo4474i(i);
            if (i3 != null) {
                mo4472h(i);
                mo4456c(i3, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3359q.toString());
        }

        /* renamed from: a */
        public void mo4430a(View view, C0934p pVar) {
            mo4455c(view);
            pVar.mo4528a(view);
        }

        /* renamed from: a */
        public void mo4415a(int i, C0934p pVar) {
            View i2 = mo4474i(i);
            mo4470g(i);
            pVar.mo4528a(i2);
        }

        /* renamed from: v */
        public int mo4488v() {
            C0851ah ahVar = this.f3358p;
            if (ahVar != null) {
                return ahVar.mo3935b();
            }
            return 0;
        }

        /* renamed from: i */
        public View mo4474i(int i) {
            C0851ah ahVar = this.f3358p;
            if (ahVar != null) {
                return ahVar.mo3937b(i);
            }
            return null;
        }

        /* renamed from: w */
        public int mo4489w() {
            return this.f3354e;
        }

        /* renamed from: x */
        public int mo4490x() {
            return this.f3355f;
        }

        /* renamed from: y */
        public int mo4491y() {
            return this.f3356g;
        }

        /* renamed from: z */
        public int mo4492z() {
            return this.f3357h;
        }

        /* renamed from: A */
        public int mo4405A() {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                return ayVar.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: B */
        public int mo4406B() {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                return ayVar.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: C */
        public int mo4407C() {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                return ayVar.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: D */
        public int mo4408D() {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                return ayVar.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: E */
        public View mo4409E() {
            View focusedChild;
            C0904ay ayVar = this.f3359q;
            if (ayVar == null || (focusedChild = ayVar.getFocusedChild()) == null || this.f3358p.mo3940c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: j */
        public void mo3705j(int i) {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                ayVar.mo4248e(i);
            }
        }

        /* renamed from: k */
        public void mo3708k(int i) {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null) {
                ayVar.mo4237d(i);
            }
        }

        /* renamed from: a */
        public void mo4418a(C0934p pVar) {
            for (int v = mo4488v() - 1; v >= 0; v--) {
                m4690a(pVar, v, mo4474i(v));
            }
        }

        /* renamed from: a */
        private void m4690a(C0934p pVar, int i, View view) {
            C0945x e = C0904ay.m4521e(view);
            if (!e.mo4605c()) {
                if (!e.mo4616n() || e.mo4619q() || this.f3359q.f3318m.mo4374b()) {
                    mo4472h(i);
                    pVar.mo4540c(view);
                    this.f3359q.f3313h.mo4839h(e);
                    return;
                }
                mo4470g(i);
                pVar.mo4534b(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4444b(C0934p pVar) {
            int e = pVar.mo4544e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = pVar.mo4545e(i);
                C0945x e3 = C0904ay.m4521e(e2);
                if (!e3.mo4605c()) {
                    e3.mo4600a(false);
                    if (e3.mo4620r()) {
                        this.f3359q.removeDetachedView(e2, false);
                    }
                    if (this.f3359q.f3331z != null) {
                        this.f3359q.f3331z.mo4009d(e3);
                    }
                    e3.mo4600a(true);
                    pVar.mo4535b(e2);
                }
            }
            pVar.mo4547f();
            if (e > 0) {
                this.f3359q.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4440a(View view, int i, int i2, C0927j jVar) {
            return !this.f3352c || !m4692b(view.getMeasuredWidth(), i, jVar.width) || !m4692b(view.getMeasuredHeight(), i2, jVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4450b(View view, int i, int i2, C0927j jVar) {
            return view.isLayoutRequested() || !this.f3352c || !m4692b(view.getWidth(), i, jVar.width) || !m4692b(view.getHeight(), i2, jVar.height);
        }

        /* renamed from: b */
        private static boolean m4692b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: a */
        public void mo4425a(View view, int i, int i2) {
            C0927j jVar = (C0927j) view.getLayoutParams();
            Rect i3 = this.f3359q.mo4283i(view);
            int i4 = i + i3.left + i3.right;
            int i5 = i2 + i3.top + i3.bottom;
            int a = m4687a(mo4491y(), mo4489w(), mo4405A() + mo4407C() + jVar.leftMargin + jVar.rightMargin + i4, jVar.width, mo3566e());
            int a2 = m4687a(mo4492z(), mo4490x(), mo4406B() + mo4408D() + jVar.topMargin + jVar.bottomMargin + i5, jVar.height, mo3569f());
            if (mo4450b(view, a, a2, jVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public static int m4687a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 >= 0) {
                    max = i4;
                    i7 = 1073741824;
                } else if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 == 0) {
                            i2 = 0;
                            i5 = 0;
                        } else if (i2 != 1073741824) {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                    }
                    i5 = max;
                    i7 = i2;
                    max = i5;
                } else if (i4 == -2) {
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i7);
            }
            if (i4 >= 0) {
                max = i4;
                i7 = 1073741824;
            } else if (i4 == -1) {
                i7 = i2;
            } else if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i7 = Integer.MIN_VALUE;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(max, i7);
            max = 0;
            return View.MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: f */
        public int mo4466f(View view) {
            Rect rect = ((C0927j) view.getLayoutParams()).f3375d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: g */
        public int mo4469g(View view) {
            Rect rect = ((C0927j) view.getLayoutParams()).f3375d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: a */
        public void mo4426a(View view, int i, int i2, int i3, int i4) {
            C0927j jVar = (C0927j) view.getLayoutParams();
            Rect rect = jVar.f3375d;
            view.layout(i + rect.left + jVar.leftMargin, i2 + rect.top + jVar.topMargin, (i3 - rect.right) - jVar.rightMargin, (i4 - rect.bottom) - jVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo4431a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0927j) view.getLayoutParams()).f3375d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3359q == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3359q.f3317l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo4428a(View view, Rect rect) {
            C0904ay.m4512a(view, rect);
        }

        /* renamed from: h */
        public int mo4471h(View view) {
            return view.getLeft() - mo4479n(view);
        }

        /* renamed from: i */
        public int mo4473i(View view) {
            return view.getTop() - mo4477l(view);
        }

        /* renamed from: j */
        public int mo4475j(View view) {
            return view.getRight() + mo4480o(view);
        }

        /* renamed from: k */
        public int mo4476k(View view) {
            return view.getBottom() + mo4478m(view);
        }

        /* renamed from: b */
        public void mo4449b(View view, Rect rect) {
            C0904ay ayVar = this.f3359q;
            if (ayVar == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(ayVar.mo4283i(view));
            }
        }

        /* renamed from: l */
        public int mo4477l(View view) {
            return ((C0927j) view.getLayoutParams()).f3375d.top;
        }

        /* renamed from: m */
        public int mo4478m(View view) {
            return ((C0927j) view.getLayoutParams()).f3375d.bottom;
        }

        /* renamed from: n */
        public int mo4479n(View view) {
            return ((C0927j) view.getLayoutParams()).f3375d.left;
        }

        /* renamed from: o */
        public int mo4480o(View view) {
            return ((C0927j) view.getLayoutParams()).f3375d.right;
        }

        /* renamed from: b */
        private int[] m4693b(C0904ay ayVar, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int A = mo4405A();
            int B = mo4406B();
            int y = mo4491y() - mo4407C();
            int z2 = mo4492z() - mo4408D();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - A;
            int min = Math.min(0, i);
            int i2 = top - B;
            int min2 = Math.min(0, i2);
            int i3 = width - y;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - z2);
            if (mo4486t() != 1) {
                max = min != 0 ? min : Math.min(i, max);
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: a */
        public boolean mo4436a(C0904ay ayVar, View view, Rect rect, boolean z) {
            return mo4437a(ayVar, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo4437a(C0904ay ayVar, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m4693b(ayVar, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m4694d(ayVar, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                ayVar.scrollBy(i, i2);
            } else {
                ayVar.mo4190a(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo4442a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3360r.mo4818a(view, 24579) && this.f3361s.mo4818a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: d */
        private boolean m4694d(C0904ay ayVar, int i, int i2) {
            View focusedChild = ayVar.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int A = mo4405A();
            int B = mo4406B();
            int y = mo4491y() - mo4407C();
            int z = mo4492z() - mo4408D();
            Rect rect = this.f3359q.f3316k;
            mo4428a(focusedChild, rect);
            if (rect.left - i >= y || rect.right - i <= A || rect.top - i2 >= z || rect.bottom - i2 <= B) {
                return false;
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo4438a(C0904ay ayVar, View view, View view2) {
            return mo4485s() || ayVar.mo4295o();
        }

        /* renamed from: a */
        public boolean mo4435a(C0904ay ayVar, C0942u uVar, View view, View view2) {
            return mo4438a(ayVar, view, view2);
        }

        /* renamed from: a */
        public void mo3529a(C0904ay ayVar, int i, int i2, Object obj) {
            mo4454c(ayVar, i, i2);
        }

        /* renamed from: a */
        public void mo4419a(C0934p pVar, C0942u uVar, int i, int i2) {
            this.f3359q.mo4249e(i, i2);
        }

        /* renamed from: f */
        public void mo4467f(int i, int i2) {
            this.f3359q.setMeasuredDimension(i, i2);
        }

        /* renamed from: F */
        public int mo4410F() {
            return C0594r.m2608i(this.f3359q);
        }

        /* renamed from: G */
        public int mo4411G() {
            return C0594r.m2609j(this.f3359q);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo4412H() {
            C0939t tVar = this.f3362t;
            if (tVar != null) {
                tVar.mo4567b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4422a(C0939t tVar) {
            if (this.f3362t == tVar) {
                this.f3362t = null;
            }
        }

        /* renamed from: c */
        public void mo4452c(C0934p pVar) {
            for (int v = mo4488v() - 1; v >= 0; v--) {
                if (!C0904ay.m4521e(mo4474i(v)).mo4605c()) {
                    mo4415a(v, pVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4416a(C0563c cVar) {
            mo4420a(this.f3359q.f3310e, this.f3359q.f3261D, cVar);
        }

        /* renamed from: a */
        public void mo4420a(C0934p pVar, C0942u uVar, C0563c cVar) {
            if (this.f3359q.canScrollVertically(-1) || this.f3359q.canScrollHorizontally(-1)) {
                cVar.mo2200a(8192);
                cVar.mo2209c(true);
            }
            if (this.f3359q.canScrollVertically(1) || this.f3359q.canScrollHorizontally(1)) {
                cVar.mo2200a(4096);
                cVar.mo2209c(true);
            }
            cVar.mo2203a((Object) C0563c.C0564a.m2491a(mo3513a(pVar, uVar), mo3533b(pVar, uVar), mo4465e(pVar, uVar), mo4457d(pVar, uVar)));
        }

        /* renamed from: a */
        public void mo3551a(AccessibilityEvent accessibilityEvent) {
            mo4421a(this.f3359q.f3310e, this.f3359q.f3261D, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo4421a(C0934p pVar, C0942u uVar, AccessibilityEvent accessibilityEvent) {
            C0904ay ayVar = this.f3359q;
            if (ayVar != null && accessibilityEvent != null) {
                boolean z = true;
                if (!ayVar.canScrollVertically(1) && !this.f3359q.canScrollVertically(-1) && !this.f3359q.canScrollHorizontally(-1) && !this.f3359q.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f3359q.f3318m != null) {
                    accessibilityEvent.setItemCount(this.f3359q.f3318m.mo4361a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4429a(View view, C0563c cVar) {
            C0945x e = C0904ay.m4521e(view);
            if (e != null && !e.mo4619q() && !this.f3358p.mo3940c(e.f3434a)) {
                mo3523a(this.f3359q.f3310e, this.f3359q.f3261D, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo3523a(C0934p pVar, C0942u uVar, View view, C0563c cVar) {
            cVar.mo2207b((Object) C0563c.C0565b.m2492a(mo3569f() ? mo4458d(view) : 0, 1, mo3566e() ? mo4458d(view) : 0, 1, false, false));
        }

        /* renamed from: I */
        public void mo4413I() {
            this.f3363u = true;
        }

        /* renamed from: a */
        public int mo3513a(C0934p pVar, C0942u uVar) {
            C0904ay ayVar = this.f3359q;
            if (ayVar == null || ayVar.f3318m == null || !mo3569f()) {
                return 1;
            }
            return this.f3359q.f3318m.mo4361a();
        }

        /* renamed from: b */
        public int mo3533b(C0934p pVar, C0942u uVar) {
            C0904ay ayVar = this.f3359q;
            if (ayVar == null || ayVar.f3318m == null || !mo3566e()) {
                return 1;
            }
            return this.f3359q.f3318m.mo4361a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4432a(int i, Bundle bundle) {
            return mo4433a(this.f3359q.f3310e, this.f3359q.f3261D, i, bundle);
        }

        /* renamed from: a */
        public boolean mo4433a(C0934p pVar, C0942u uVar, int i, Bundle bundle) {
            int i2;
            int i3;
            C0904ay ayVar = this.f3359q;
            if (ayVar == null) {
                return false;
            }
            if (i == 4096) {
                i3 = ayVar.canScrollVertically(1) ? (mo4492z() - mo4406B()) - mo4408D() : 0;
                i2 = this.f3359q.canScrollHorizontally(1) ? (mo4491y() - mo4405A()) - mo4407C() : 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                i3 = ayVar.canScrollVertically(-1) ? -((mo4492z() - mo4406B()) - mo4408D()) : 0;
                i2 = this.f3359q.canScrollHorizontally(-1) ? -((mo4491y() - mo4405A()) - mo4407C()) : 0;
            }
            if (i3 == 0 && i2 == 0) {
                return false;
            }
            this.f3359q.mo4190a(i2, i3);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4441a(View view, int i, Bundle bundle) {
            return mo4434a(this.f3359q.f3310e, this.f3359q.f3261D, view, i, bundle);
        }

        /* renamed from: a */
        public static C0926b m4688a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0926b bVar = new C0926b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0722a.C0724b.RecyclerView, i, i2);
            bVar.f3370a = obtainStyledAttributes.getInt(C0722a.C0724b.RecyclerView_android_orientation, 1);
            bVar.f3371b = obtainStyledAttributes.getInt(C0722a.C0724b.RecyclerView_spanCount, 1);
            bVar.f3372c = obtainStyledAttributes.getBoolean(C0722a.C0724b.RecyclerView_reverseLayout, false);
            bVar.f3373d = obtainStyledAttributes.getBoolean(C0722a.C0724b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4468f(C0904ay ayVar) {
            mo4451c(View.MeasureSpec.makeMeasureSpec(ayVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ayVar.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo4414J() {
            int v = mo4488v();
            for (int i = 0; i < v; i++) {
                ViewGroup.LayoutParams layoutParams = mo4474i(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ay$h */
    public static abstract class C0921h {
        @Deprecated
        /* renamed from: a */
        public void mo4400a(Canvas canvas, C0904ay ayVar) {
        }

        @Deprecated
        /* renamed from: b */
        public void mo4403b(Canvas canvas, C0904ay ayVar) {
        }

        /* renamed from: b */
        public void mo4404b(Canvas canvas, C0904ay ayVar, C0942u uVar) {
            mo4400a(canvas, ayVar);
        }

        /* renamed from: a */
        public void mo4046a(Canvas canvas, C0904ay ayVar, C0942u uVar) {
            mo4403b(canvas, ayVar);
        }

        @Deprecated
        /* renamed from: a */
        public void mo4401a(Rect rect, int i, C0904ay ayVar) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo4402a(Rect rect, View view, C0904ay ayVar, C0942u uVar) {
            mo4401a(rect, ((C0927j) view.getLayoutParams()).mo4501f(), ayVar);
        }
    }

    /* renamed from: android.support.v7.widget.ay$x */
    public static abstract class C0945x {

        /* renamed from: q */
        private static final List<Object> f3433q = Collections.emptyList();

        /* renamed from: a */
        public final View f3434a;

        /* renamed from: b */
        WeakReference<C0904ay> f3435b;

        /* renamed from: c */
        int f3436c;

        /* renamed from: d */
        int f3437d;

        /* renamed from: e */
        long f3438e;

        /* renamed from: f */
        int f3439f;

        /* renamed from: g */
        int f3440g;

        /* renamed from: h */
        C0945x f3441h;

        /* renamed from: i */
        C0945x f3442i;

        /* renamed from: j */
        int f3443j;

        /* renamed from: k */
        List<Object> f3444k;

        /* renamed from: l */
        List<Object> f3445l;

        /* renamed from: m */
        C0934p f3446m;

        /* renamed from: n */
        boolean f3447n;

        /* renamed from: o */
        int f3448o;

        /* renamed from: p */
        C0904ay f3449p;

        /* renamed from: r */
        private int f3450r;

        /* renamed from: s */
        private int f3451s;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4595a(int i, int i2, boolean z) {
            mo4603b(8);
            mo4596a(i2, z);
            this.f3436c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4596a(int i, boolean z) {
            if (this.f3437d == -1) {
                this.f3437d = this.f3436c;
            }
            if (this.f3440g == -1) {
                this.f3440g = this.f3436c;
            }
            if (z) {
                this.f3440g += i;
            }
            this.f3436c += i;
            if (this.f3434a.getLayoutParams() != null) {
                ((C0927j) this.f3434a.getLayoutParams()).f3376e = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4593a() {
            this.f3437d = -1;
            this.f3440g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4602b() {
            if (this.f3437d == -1) {
                this.f3437d = this.f3436c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4605c() {
            return (this.f3443j & 128) != 0;
        }

        /* renamed from: d */
        public final int mo4606d() {
            int i = this.f3440g;
            return i == -1 ? this.f3436c : i;
        }

        /* renamed from: e */
        public final int mo4607e() {
            C0904ay ayVar = this.f3449p;
            if (ayVar == null) {
                return -1;
            }
            return ayVar.mo4234d(this);
        }

        /* renamed from: f */
        public final int mo4608f() {
            return this.f3437d;
        }

        /* renamed from: g */
        public final long mo4609g() {
            return this.f3438e;
        }

        /* renamed from: h */
        public final int mo4610h() {
            return this.f3439f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo4611i() {
            return this.f3446m != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4612j() {
            this.f3446m.mo4539c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4613k() {
            return (this.f3443j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4614l() {
            this.f3443j &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo4615m() {
            this.f3443j &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4597a(C0934p pVar, boolean z) {
            this.f3446m = pVar;
            this.f3447n = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo4616n() {
            return (this.f3443j & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo4617o() {
            return (this.f3443j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4618p() {
            return (this.f3443j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4619q() {
            return (this.f3443j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4601a(int i) {
            return (i & this.f3443j) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4620r() {
            return (this.f3443j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4621s() {
            return (this.f3443j & 512) != 0 || mo4616n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4594a(int i, int i2) {
            this.f3443j = (i & i2) | (this.f3443j & (~i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4603b(int i) {
            this.f3443j = i | this.f3443j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4599a(Object obj) {
            if (obj == null) {
                mo4603b(1024);
            } else if ((1024 & this.f3443j) == 0) {
                m4940A();
                this.f3444k.add(obj);
            }
        }

        /* renamed from: A */
        private void m4940A() {
            if (this.f3444k == null) {
                this.f3444k = new ArrayList();
                this.f3445l = Collections.unmodifiableList(this.f3444k);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4622t() {
            List<Object> list = this.f3444k;
            if (list != null) {
                list.clear();
            }
            this.f3443j &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public List<Object> mo4624u() {
            if ((this.f3443j & 1024) != 0) {
                return f3433q;
            }
            List<Object> list = this.f3444k;
            if (list == null || list.size() == 0) {
                return f3433q;
            }
            return this.f3445l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4625v() {
            this.f3443j = 0;
            this.f3436c = -1;
            this.f3437d = -1;
            this.f3438e = -1;
            this.f3440g = -1;
            this.f3450r = 0;
            this.f3441h = null;
            this.f3442i = null;
            mo4622t();
            this.f3451s = 0;
            this.f3448o = -1;
            C0904ay.m4519c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4598a(C0904ay ayVar) {
            int i = this.f3448o;
            if (i != -1) {
                this.f3451s = i;
            } else {
                this.f3451s = C0594r.m2600e(this.f3434a);
            }
            ayVar.mo4208a(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4604b(C0904ay ayVar) {
            ayVar.mo4208a(this, this.f3451s);
            this.f3451s = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3436c + " id=" + this.f3438e + ", oldPos=" + this.f3437d + ", pLpos:" + this.f3440g);
            if (mo4611i()) {
                sb.append(" scrap ");
                sb.append(this.f3447n ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4616n()) {
                sb.append(" invalid");
            }
            if (!mo4618p()) {
                sb.append(" unbound");
            }
            if (mo4617o()) {
                sb.append(" update");
            }
            if (mo4619q()) {
                sb.append(" removed");
            }
            if (mo4605c()) {
                sb.append(" ignored");
            }
            if (mo4620r()) {
                sb.append(" tmpDetached");
            }
            if (!mo4626w()) {
                sb.append(" not recyclable(" + this.f3450r + ")");
            }
            if (mo4621s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3434a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo4600a(boolean z) {
            this.f3450r = z ? this.f3450r - 1 : this.f3450r + 1;
            int i = this.f3450r;
            if (i < 0) {
                this.f3450r = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i == 1) {
                this.f3443j |= 16;
            } else if (z && this.f3450r == 0) {
                this.f3443j &= -17;
            }
        }

        /* renamed from: w */
        public final boolean mo4626w() {
            return (this.f3443j & 16) == 0 && !C0594r.m2597c(this.f3434a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4627x() {
            return (this.f3443j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4628y() {
            return (this.f3443j & 16) == 0 && C0594r.m2597c(this.f3434a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4629z() {
            return (this.f3443j & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4208a(C0945x xVar, int i) {
        if (mo4295o()) {
            xVar.f3448o = i;
            this.f3268K.add(xVar);
            return false;
        }
        C0594r.m2592b(xVar.f3434a, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4344x() {
        int i;
        for (int size = this.f3268K.size() - 1; size >= 0; size--) {
            C0945x xVar = this.f3268K.get(size);
            if (xVar.f3434a.getParent() == this && !xVar.mo4605c() && (i = xVar.f3448o) != -1) {
                C0594r.m2592b(xVar.f3434a, i);
                xVar.f3448o = -1;
            }
        }
        this.f3268K.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4234d(C0945x xVar) {
        if (xVar.mo4601a(524) || !xVar.mo4618p()) {
            return -1;
        }
        return this.f3311f.mo4881c(xVar.f3436c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4195a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4189a());
        }
        Resources resources = getContext().getResources();
        new C0871an(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0722a.C0723a.fastscroll_default_thickness), resources.getDimensionPixelSize(C0722a.C0723a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0722a.C0723a.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2273a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo2274a();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2284b(i);
    }

    /* renamed from: j */
    public boolean mo4288j(int i, int i2) {
        return getScrollingChildHelper().mo2278a(i, i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo2285c();
    }

    /* renamed from: a */
    public void mo2272a(int i) {
        getScrollingChildHelper().mo2286c(i);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2283b();
    }

    /* renamed from: h */
    public boolean mo4281h(int i) {
        return getScrollingChildHelper().mo2277a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2279a(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public boolean mo4205a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo2280a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2281a(i, i2, iArr, iArr2);
    }

    /* renamed from: a */
    public boolean mo4207a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2282a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2276a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2275a(f, f2);
    }

    /* renamed from: android.support.v7.widget.ay$j */
    public static class C0927j extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        C0945x f3374c;

        /* renamed from: d */
        final Rect f3375d = new Rect();

        /* renamed from: e */
        boolean f3376e = true;

        /* renamed from: f */
        boolean f3377f = false;

        public C0927j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0927j(int i, int i2) {
            super(i, i2);
        }

        public C0927j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0927j(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0927j(C0927j jVar) {
            super(jVar);
        }

        /* renamed from: c */
        public boolean mo4498c() {
            return this.f3374c.mo4616n();
        }

        /* renamed from: d */
        public boolean mo4499d() {
            return this.f3374c.mo4619q();
        }

        /* renamed from: e */
        public boolean mo4500e() {
            return this.f3374c.mo4629z();
        }

        /* renamed from: f */
        public int mo4501f() {
            return this.f3374c.mo4606d();
        }
    }

    /* renamed from: android.support.v7.widget.ay$t */
    public static abstract class C0939t {

        /* renamed from: a */
        private int f3395a;

        /* renamed from: b */
        private C0904ay f3396b;

        /* renamed from: c */
        private C0922i f3397c;

        /* renamed from: d */
        private boolean f3398d;

        /* renamed from: e */
        private boolean f3399e;

        /* renamed from: f */
        private View f3400f;

        /* renamed from: g */
        private final C0940a f3401g;

        /* renamed from: android.support.v7.widget.ay$t$b */
        public interface C0941b {
            /* renamed from: d */
            PointF mo3562d(int i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4564a(int i, int i2, C0942u uVar, C0940a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4565a(View view, C0942u uVar, C0940a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo4572f();

        /* renamed from: a */
        public void mo4562a(int i) {
            this.f3395a = i;
        }

        /* renamed from: b */
        public PointF mo4566b(int i) {
            C0922i a = mo4561a();
            if (a instanceof C0941b) {
                return ((C0941b) a).mo3562d(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0941b.class.getCanonicalName());
            return null;
        }

        /* renamed from: a */
        public C0922i mo4561a() {
            return this.f3397c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo4567b() {
            if (this.f3399e) {
                this.f3399e = false;
                mo4572f();
                this.f3396b.f3261D.f3409a = -1;
                this.f3400f = null;
                this.f3395a = -1;
                this.f3398d = false;
                this.f3397c.mo4422a(this);
                this.f3397c = null;
                this.f3396b = null;
            }
        }

        /* renamed from: c */
        public boolean mo4569c() {
            return this.f3398d;
        }

        /* renamed from: d */
        public boolean mo4570d() {
            return this.f3399e;
        }

        /* renamed from: e */
        public int mo4571e() {
            return this.f3395a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4563a(int i, int i2) {
            PointF b;
            C0904ay ayVar = this.f3396b;
            if (!this.f3399e || this.f3395a == -1 || ayVar == null) {
                mo4567b();
            }
            if (!(!this.f3398d || this.f3400f != null || this.f3397c == null || (b = mo4566b(this.f3395a)) == null || (b.x == 0.0f && b.y == 0.0f))) {
                ayVar.mo4194a((int) Math.signum(b.x), (int) Math.signum(b.y), (int[]) null);
            }
            this.f3398d = false;
            View view = this.f3400f;
            if (view != null) {
                if (mo4560a(view) == this.f3395a) {
                    mo4565a(this.f3400f, ayVar.f3261D, this.f3401g);
                    this.f3401g.mo4573a(ayVar);
                    mo4567b();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3400f = null;
                }
            }
            if (this.f3399e) {
                mo4564a(i, i2, ayVar.f3261D, this.f3401g);
                boolean a = this.f3401g.mo4574a();
                this.f3401g.mo4573a(ayVar);
                if (!a) {
                    return;
                }
                if (this.f3399e) {
                    this.f3398d = true;
                    ayVar.f3258A.mo4584a();
                    return;
                }
                mo4567b();
            }
        }

        /* renamed from: a */
        public int mo4560a(View view) {
            return this.f3396b.mo4250f(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4568b(View view) {
            if (mo4560a(view) == mo4571e()) {
                this.f3400f = view;
            }
        }

        /* renamed from: android.support.v7.widget.ay$t$a */
        public static class C0940a {

            /* renamed from: a */
            private int f3402a;

            /* renamed from: b */
            private int f3403b;

            /* renamed from: c */
            private int f3404c;

            /* renamed from: d */
            private int f3405d;

            /* renamed from: e */
            private Interpolator f3406e;

            /* renamed from: f */
            private boolean f3407f;

            /* renamed from: g */
            private int f3408g;

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4574a() {
                return this.f3405d >= 0;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4573a(C0904ay ayVar) {
                int i = this.f3405d;
                if (i >= 0) {
                    this.f3405d = -1;
                    ayVar.mo4214b(i);
                    this.f3407f = false;
                } else if (this.f3407f) {
                    m4916b();
                    if (this.f3406e != null) {
                        ayVar.f3258A.mo4588a(this.f3402a, this.f3403b, this.f3404c, this.f3406e);
                    } else if (this.f3404c == Integer.MIN_VALUE) {
                        ayVar.f3258A.mo4591b(this.f3402a, this.f3403b);
                    } else {
                        ayVar.f3258A.mo4586a(this.f3402a, this.f3403b, this.f3404c);
                    }
                    this.f3408g++;
                    if (this.f3408g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3407f = false;
                } else {
                    this.f3408g = 0;
                }
            }

            /* renamed from: b */
            private void m4916b() {
                if (this.f3406e != null && this.f3404c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3404c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.ay$s */
    public static class C0937s extends C0556a {
        public static final Parcelable.Creator<C0937s> CREATOR = new Parcelable.ClassLoaderCreator<C0937s>() {
            /* renamed from: a */
            public C0937s createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0937s(parcel, classLoader);
            }

            /* renamed from: a */
            public C0937s createFromParcel(Parcel parcel) {
                return new C0937s(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0937s[] newArray(int i) {
                return new C0937s[i];
            }
        };

        /* renamed from: a */
        Parcelable f3394a;

        C0937s(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3394a = parcel.readParcelable(classLoader == null ? C0922i.class.getClassLoader() : classLoader);
        }

        C0937s(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3394a, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4553a(C0937s sVar) {
            this.f3394a = sVar.f3394a;
        }
    }

    /* renamed from: android.support.v7.widget.ay$u */
    public static class C0942u {

        /* renamed from: a */
        int f3409a = -1;

        /* renamed from: b */
        int f3410b = 0;

        /* renamed from: c */
        int f3411c = 0;

        /* renamed from: d */
        int f3412d = 1;

        /* renamed from: e */
        int f3413e = 0;

        /* renamed from: f */
        boolean f3414f = false;

        /* renamed from: g */
        boolean f3415g = false;

        /* renamed from: h */
        boolean f3416h = false;

        /* renamed from: i */
        boolean f3417i = false;

        /* renamed from: j */
        boolean f3418j = false;

        /* renamed from: k */
        boolean f3419k = false;

        /* renamed from: l */
        int f3420l;

        /* renamed from: m */
        long f3421m;

        /* renamed from: n */
        int f3422n;

        /* renamed from: o */
        int f3423o;

        /* renamed from: p */
        int f3424p;

        /* renamed from: q */
        private SparseArray<Object> f3425q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4575a(int i) {
            if ((this.f3412d & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3412d));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4576a(C0911a aVar) {
            this.f3412d = 1;
            this.f3413e = aVar.mo4361a();
            this.f3415g = false;
            this.f3416h = false;
            this.f3417i = false;
        }

        /* renamed from: a */
        public boolean mo4577a() {
            return this.f3415g;
        }

        /* renamed from: b */
        public boolean mo4578b() {
            return this.f3419k;
        }

        /* renamed from: c */
        public int mo4579c() {
            return this.f3409a;
        }

        /* renamed from: d */
        public boolean mo4580d() {
            return this.f3409a != -1;
        }

        /* renamed from: e */
        public int mo4581e() {
            return this.f3415g ? this.f3410b - this.f3411c : this.f3413e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3409a + ", mData=" + this.f3425q + ", mItemCount=" + this.f3413e + ", mIsMeasuring=" + this.f3417i + ", mPreviousLayoutItemCount=" + this.f3410b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3411c + ", mStructureChanged=" + this.f3414f + ", mInPreLayout=" + this.f3415g + ", mRunSimpleAnimations=" + this.f3418j + ", mRunPredictiveAnimations=" + this.f3419k + '}';
        }
    }

    /* renamed from: android.support.v7.widget.ay$g */
    private class C0920g implements C0916f.C0918b {
        C0920g() {
        }

        /* renamed from: a */
        public void mo4397a(C0945x xVar) {
            xVar.mo4600a(true);
            if (xVar.f3441h != null && xVar.f3442i == null) {
                xVar.f3441h = null;
            }
            xVar.f3442i = null;
            if (!xVar.mo4627x() && !C0904ay.this.mo4209a(xVar.f3434a) && xVar.mo4620r()) {
                C0904ay.this.removeDetachedView(xVar.f3434a, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ay$f */
    public static abstract class C0916f {

        /* renamed from: a */
        private C0918b f3339a = null;

        /* renamed from: b */
        private ArrayList<C0917a> f3340b = new ArrayList<>();

        /* renamed from: c */
        private long f3341c = 120;

        /* renamed from: d */
        private long f3342d = 120;

        /* renamed from: e */
        private long f3343e = 250;

        /* renamed from: f */
        private long f3344f = 250;

        /* renamed from: android.support.v7.widget.ay$f$a */
        public interface C0917a {
            /* renamed from: a */
            void mo4396a();
        }

        /* renamed from: android.support.v7.widget.ay$f$b */
        interface C0918b {
            /* renamed from: a */
            void mo4397a(C0945x xVar);
        }

        /* renamed from: a */
        public abstract void mo3996a();

        /* renamed from: a */
        public abstract boolean mo4383a(C0945x xVar, C0919c cVar, C0919c cVar2);

        /* renamed from: a */
        public abstract boolean mo4384a(C0945x xVar, C0945x xVar2, C0919c cVar, C0919c cVar2);

        /* renamed from: b */
        public abstract boolean mo4004b();

        /* renamed from: b */
        public abstract boolean mo4385b(C0945x xVar, C0919c cVar, C0919c cVar2);

        /* renamed from: c */
        public abstract boolean mo4386c(C0945x xVar, C0919c cVar, C0919c cVar2);

        /* renamed from: d */
        public abstract void mo4008d();

        /* renamed from: d */
        public abstract void mo4009d(C0945x xVar);

        /* renamed from: g */
        public void mo4391g(C0945x xVar) {
        }

        /* renamed from: h */
        public boolean mo4393h(C0945x xVar) {
            return true;
        }

        /* renamed from: e */
        public long mo4387e() {
            return this.f3343e;
        }

        /* renamed from: f */
        public long mo4388f() {
            return this.f3341c;
        }

        /* renamed from: g */
        public long mo4390g() {
            return this.f3342d;
        }

        /* renamed from: h */
        public long mo4392h() {
            return this.f3344f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4382a(C0918b bVar) {
            this.f3339a = bVar;
        }

        /* renamed from: a */
        public C0919c mo4381a(C0942u uVar, C0945x xVar, int i, List<Object> list) {
            return mo4395j().mo4398a(xVar);
        }

        /* renamed from: a */
        public C0919c mo4380a(C0942u uVar, C0945x xVar) {
            return mo4395j().mo4398a(xVar);
        }

        /* renamed from: e */
        static int m4653e(C0945x xVar) {
            int i = xVar.f3443j & 14;
            if (xVar.mo4616n()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int f = xVar.mo4608f();
            int e = xVar.mo4607e();
            return (f == -1 || e == -1 || f == e) ? i : i | 2048;
        }

        /* renamed from: f */
        public final void mo4389f(C0945x xVar) {
            mo4391g(xVar);
            C0918b bVar = this.f3339a;
            if (bVar != null) {
                bVar.mo4397a(xVar);
            }
        }

        /* renamed from: a */
        public boolean mo4002a(C0945x xVar, List<Object> list) {
            return mo4393h(xVar);
        }

        /* renamed from: i */
        public final void mo4394i() {
            int size = this.f3340b.size();
            for (int i = 0; i < size; i++) {
                this.f3340b.get(i).mo4396a();
            }
            this.f3340b.clear();
        }

        /* renamed from: j */
        public C0919c mo4395j() {
            return new C0919c();
        }

        /* renamed from: android.support.v7.widget.ay$f$c */
        public static class C0919c {

            /* renamed from: a */
            public int f3345a;

            /* renamed from: b */
            public int f3346b;

            /* renamed from: c */
            public int f3347c;

            /* renamed from: d */
            public int f3348d;

            /* renamed from: a */
            public C0919c mo4398a(C0945x xVar) {
                return mo4399a(xVar, 0);
            }

            /* renamed from: a */
            public C0919c mo4399a(C0945x xVar, int i) {
                View view = xVar.f3434a;
                this.f3345a = view.getLeft();
                this.f3346b = view.getTop();
                this.f3347c = view.getRight();
                this.f3348d = view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0914d dVar = this.f3277aC;
        if (dVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return dVar.mo4378a(i, i2);
    }

    private C0588l getScrollingChildHelper() {
        if (this.f3279aE == null) {
            this.f3279aE = new C0588l(this);
        }
        return this.f3279aE;
    }
}
