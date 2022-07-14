package android.support.p026v4.p036h;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p009a.C0106a;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.h.r */
public class C0594r {

    /* renamed from: a */
    private static final AtomicInteger f1832a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f1833b;

    /* renamed from: c */
    private static boolean f1834c;

    /* renamed from: d */
    private static Field f1835d;

    /* renamed from: e */
    private static boolean f1836e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f1837f;

    /* renamed from: g */
    private static WeakHashMap<View, C0601v> f1838g = null;

    /* renamed from: h */
    private static Field f1839h;

    /* renamed from: i */
    private static boolean f1840i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f1841j;

    /* renamed from: android.support.v4.h.r$a */
    public interface C0596a {
        /* renamed from: a */
        boolean mo2292a(View view, KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static Rect m2575a() {
        if (f1841j == null) {
            f1841j = new ThreadLocal<>();
        }
        Rect rect = f1841j.get();
        if (rect == null) {
            rect = new Rect();
            f1841j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m2585a(View view, C0570b bVar) {
        view.setAccessibilityDelegate(bVar == null ? null : bVar.mo2241a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m2574a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2578a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: b */
    public static boolean m2594b(View view) {
        if (f1840i) {
            return false;
        }
        if (f1839h == null) {
            try {
                f1839h = View.class.getDeclaredField("mAccessibilityDelegate");
                f1839h.setAccessible(true);
            } catch (Throwable unused) {
                f1840i = true;
                return false;
            }
        }
        try {
            if (f1839h.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            f1840i = true;
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m2597c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2590a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: d */
    public static void m2598d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    public static void m2587a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m2588a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: e */
    public static int m2600e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m2592b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: f */
    public static int m2602f(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: c */
    public static void m2596c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: g */
    public static int m2604g(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: h */
    public static int m2606h(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: a */
    public static void m2580a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: i */
    public static int m2608i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f1834c) {
            try {
                f1833b = View.class.getDeclaredField("mMinWidth");
                f1833b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1834c = true;
        }
        Field field = f1833b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: j */
    public static int m2609j(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1836e) {
            try {
                f1835d = View.class.getDeclaredField("mMinHeight");
                f1835d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1836e = true;
        }
        Field field = f1835d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: k */
    public static C0601v m2610k(View view) {
        if (f1838g == null) {
            f1838g = new WeakHashMap<>();
        }
        C0601v vVar = f1838g.get(view);
        if (vVar != null) {
            return vVar;
        }
        C0601v vVar2 = new C0601v(view);
        f1838g.put(view, vVar2);
        return vVar2;
    }

    /* renamed from: a */
    public static void m2577a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: l */
    public static float m2611l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m2589a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1837f == null) {
            f1837f = new WeakHashMap<>();
        }
        f1837f.put(view, str);
    }

    /* renamed from: m */
    public static String m2612m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f1837f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: n */
    public static int m2613n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: o */
    public static void m2614o(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: p */
    public static boolean m2615p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static void m2593b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m2586a(View view, final C0592p pVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (pVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C0608z.m2669a(pVar.mo1109a(view, C0608z.m2668a((Object) windowInsets)));
                }
            });
        }
    }

    /* renamed from: a */
    public static C0608z m2576a(View view, C0608z zVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return zVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0608z.m2669a(zVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0608z.m2668a((Object) windowInsets);
    }

    /* renamed from: q */
    public static boolean m2616q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m2617r(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2584a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static ColorStateList m2618s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0593q) {
            return ((C0593q) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2581a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0593q) {
            ((C0593q) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static PorterDuff.Mode m2619t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0593q) {
            return ((C0593q) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2582a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0593q) {
            ((C0593q) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static boolean m2620u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0586j) {
            return ((C0586j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: v */
    public static void m2621v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C0586j) {
            ((C0586j) view).stopNestedScroll();
        }
    }

    /* renamed from: d */
    public static void m2599d(View view, int i) {
        if (view instanceof C0587k) {
            ((C0587k) view).mo2272a(i);
        } else if (i == 0) {
            m2621v(view);
        }
    }

    /* renamed from: w */
    public static boolean m2622w(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: x */
    public static float m2623x(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public static void m2601e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect a = m2575a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2605g(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m2605g(view, i);
        }
    }

    /* renamed from: g */
    private static void m2605g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m2573C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2573C((View) parent);
            }
        }
    }

    /* renamed from: f */
    public static void m2603f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect a = m2575a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2607h(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m2607h(view, i);
        }
    }

    /* renamed from: h */
    private static void m2607h(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m2573C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2573C((View) parent);
            }
        }
    }

    /* renamed from: C */
    private static void m2573C(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m2583a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: y */
    public static Rect m2624y(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: z */
    public static boolean m2625z(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: A */
    public static boolean m2571A(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2579a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: B */
    public static Display m2572B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m2625z(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    static boolean m2591a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0597b.m2627a(view).mo2293a(keyEvent);
    }

    /* renamed from: b */
    static boolean m2595b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0597b.m2627a(view).mo2294a(view, keyEvent);
    }

    /* renamed from: android.support.v4.h.r$b */
    static class C0597b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f1843a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f1844b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f1845c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f1846d = null;

        C0597b() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m2628a() {
            if (this.f1845c == null) {
                this.f1845c = new SparseArray<>();
            }
            return this.f1845c;
        }

        /* renamed from: a */
        static C0597b m2627a(View view) {
            C0597b bVar = (C0597b) view.getTag(C0106a.C0108b.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            C0597b bVar2 = new C0597b();
            view.setTag(C0106a.C0108b.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2294a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2630b();
            }
            View b = m2629b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2628a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* renamed from: b */
        private View m2629b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1844b;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View b = m2629b(viewGroup.getChildAt(childCount), keyEvent);
                    if (b != null) {
                        return b;
                    }
                }
            }
            if (m2631c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2293a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1846d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1846d = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> a = m2628a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a.valueAt(indexOfKey);
                a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0594r.m2625z(view)) {
                m2631c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: c */
        private boolean m2631c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0106a.C0108b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0596a) arrayList.get(size)).mo2292a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m2630b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1844b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f1843a.isEmpty()) {
                synchronized (f1843a) {
                    if (this.f1844b == null) {
                        this.f1844b = new WeakHashMap<>();
                    }
                    for (int size = f1843a.size() - 1; size >= 0; size--) {
                        View view = (View) f1843a.get(size).get();
                        if (view == null) {
                            f1843a.remove(size);
                        } else {
                            this.f1844b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1844b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }
}
