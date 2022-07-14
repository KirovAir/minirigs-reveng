package android.support.p026v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0092s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p026v4.app.C0425f;
import android.support.p026v4.app.C0439k;
import android.support.p026v4.p035g.C0513b;
import android.support.p026v4.p035g.C0516d;
import android.support.p026v4.p035g.C0517e;
import android.support.p026v4.p036h.C0594r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.l */
final class C0442l extends C0439k implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static final Interpolator f1473F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f1474G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f1475H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f1476I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f1477a = false;

    /* renamed from: q */
    static Field f1478q;

    /* renamed from: A */
    Bundle f1479A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f1480B = null;

    /* renamed from: C */
    ArrayList<C0457i> f1481C;

    /* renamed from: D */
    C0458m f1482D;

    /* renamed from: E */
    Runnable f1483E = new Runnable() {
        public void run() {
            C0442l.this.mo1783g();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0454f> f1484J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0456h> f1485b;

    /* renamed from: c */
    boolean f1486c;

    /* renamed from: d */
    int f1487d = 0;

    /* renamed from: e */
    final ArrayList<C0425f> f1488e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<C0425f> f1489f;

    /* renamed from: g */
    ArrayList<C0421d> f1490g;

    /* renamed from: h */
    ArrayList<C0425f> f1491h;

    /* renamed from: i */
    ArrayList<C0421d> f1492i;

    /* renamed from: j */
    ArrayList<Integer> f1493j;

    /* renamed from: k */
    ArrayList<C0439k.C0441b> f1494k;

    /* renamed from: l */
    int f1495l = 0;

    /* renamed from: m */
    C0438j f1496m;

    /* renamed from: n */
    C0436h f1497n;

    /* renamed from: o */
    C0425f f1498o;

    /* renamed from: p */
    C0425f f1499p;

    /* renamed from: r */
    boolean f1500r;

    /* renamed from: s */
    boolean f1501s;

    /* renamed from: t */
    boolean f1502t;

    /* renamed from: u */
    boolean f1503u;

    /* renamed from: v */
    String f1504v;

    /* renamed from: w */
    boolean f1505w;

    /* renamed from: x */
    ArrayList<C0421d> f1506x;

    /* renamed from: y */
    ArrayList<Boolean> f1507y;

    /* renamed from: z */
    ArrayList<C0425f> f1508z;

    /* renamed from: android.support.v4.app.l$g */
    static class C0455g {

        /* renamed from: a */
        public static final int[] f1535a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.l$h */
    interface C0456h {
        /* renamed from: a */
        boolean mo1517a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: b */
    public static int m1969b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: d */
    public static int m1976d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public LayoutInflater.Factory2 mo1812x() {
        return this;
    }

    C0442l() {
    }

    /* renamed from: android.support.v4.app.l$f */
    private static final class C0454f {

        /* renamed from: a */
        final C0439k.C0440a f1533a;

        /* renamed from: b */
        final boolean f1534b;

        C0454f(C0439k.C0440a aVar, boolean z) {
            this.f1533a = aVar;
            this.f1534b = z;
        }
    }

    /* renamed from: a */
    static boolean m1966a(C0451c cVar) {
        if (cVar.f1525a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f1525a instanceof AnimationSet)) {
            return m1965a(cVar.f1526b);
        }
        List<Animation> animations = ((AnimationSet) cVar.f1525a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1965a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1965a(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1967a(View view, C0451c cVar) {
        if (view == null || cVar == null || Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !C0594r.m2616q(view) || !m1966a(cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m1962a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0517e("FragmentManager"));
        C0438j jVar = this.f1496m;
        if (jVar != null) {
            try {
                jVar.mo1680a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo1719a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public C0463p mo1717a() {
        return new C0421d(this);
    }

    /* renamed from: b */
    public boolean mo1720b() {
        m1979y();
        return m1968a((String) null, -1, 0);
    }

    /* renamed from: a */
    private boolean m1968a(String str, int i, int i2) {
        C0439k n;
        mo1783g();
        m1974c(true);
        C0425f fVar = this.f1499p;
        if (fVar != null && i < 0 && str == null && (n = fVar.mo1621n()) != null && n.mo1720b()) {
            return true;
        }
        boolean a = mo1757a(this.f1506x, this.f1507y, str, i, i2);
        if (a) {
            this.f1486c = true;
            try {
                m1972b(this.f1506x, this.f1507y);
            } finally {
                m1980z();
            }
        }
        mo1784h();
        m1954C();
        return a;
    }

    /* renamed from: a */
    public void mo1741a(Bundle bundle, String str, C0425f fVar) {
        if (fVar.f1408f < 0) {
            m1962a((RuntimeException) new IllegalStateException("Fragment " + fVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fVar.f1408f);
    }

    /* renamed from: a */
    public C0425f mo1736a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0425f fVar = this.f1489f.get(i);
        if (fVar == null) {
            m1962a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return fVar;
    }

    /* renamed from: c */
    public List<C0425f> mo1721c() {
        List<C0425f> list;
        if (this.f1488e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1488e) {
            list = (List) this.f1488e.clone();
        }
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0425f fVar = this.f1498o;
        if (fVar != null) {
            C0516d.m2263a(fVar, sb);
        } else {
            C0516d.m2263a(this.f1496m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo1719a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                C0425f valueAt = this.f1489f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.mo1580a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f1488e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1488e.get(i2).toString());
            }
        }
        ArrayList<C0425f> arrayList = this.f1491h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f1491h.get(i3).toString());
            }
        }
        ArrayList<C0421d> arrayList2 = this.f1490g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0421d dVar = this.f1490g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.mo1514a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f1492i != null && (size2 = this.f1492i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f1492i.get(i5));
                }
            }
            if (this.f1493j != null && this.f1493j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1493j.toArray()));
            }
        }
        ArrayList<C0456h> arrayList3 = this.f1485b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f1485b.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1496m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1497n);
        if (this.f1498o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1498o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1495l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1501s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1502t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1503u);
        if (this.f1500r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1500r);
        }
        if (this.f1504v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1504v);
        }
    }

    /* renamed from: a */
    static C0451c m1957a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1473F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1474G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0451c((Animation) animationSet);
    }

    /* renamed from: a */
    static C0451c m1956a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1474G);
        alphaAnimation.setDuration(220);
        return new C0451c((Animation) alphaAnimation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0451c mo1737a(C0425f fVar, int i, boolean z, int i2) {
        int b;
        int R = fVar.mo1550R();
        Animation a = fVar.mo1561a(i, z, R);
        if (a != null) {
            return new C0451c(a);
        }
        Animator b2 = fVar.mo1584b(i, z, R);
        if (b2 != null) {
            return new C0451c(b2);
        }
        if (R != 0) {
            boolean equals = "anim".equals(this.f1496m.mo1713g().getResources().getResourceTypeName(R));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1496m.mo1713g(), R);
                    if (loadAnimation != null) {
                        return new C0451c(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1496m.mo1713g(), R);
                    if (loadAnimator != null) {
                        return new C0451c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1496m.mo1713g(), R);
                        if (loadAnimation2 != null) {
                            return new C0451c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (b = m1969b(i, z)) < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m1957a(this.f1496m.mo1713g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1957a(this.f1496m.mo1713g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1957a(this.f1496m.mo1713g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1957a(this.f1496m.mo1713g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1956a(this.f1496m.mo1713g(), 0.0f, 1.0f);
            case 6:
                return m1956a(this.f1496m.mo1713g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f1496m.mo1685d()) {
                    i2 = this.f1496m.mo1686e();
                }
                return i2 == 0 ? null : null;
        }
    }

    /* renamed from: a */
    public void mo1744a(C0425f fVar) {
        if (!fVar.f1392L) {
            return;
        }
        if (this.f1486c) {
            this.f1505w = true;
            return;
        }
        fVar.f1392L = false;
        mo1745a(fVar, this.f1495l, 0, 0, false);
    }

    /* renamed from: b */
    private static void m1971b(View view, C0451c cVar) {
        if (view != null && cVar != null && m1967a(view, cVar)) {
            if (cVar.f1526b != null) {
                cVar.f1526b.addListener(new C0452d(view));
                return;
            }
            Animation.AnimationListener a = m1958a(cVar.f1525a);
            view.setLayerType(2, (Paint) null);
            cVar.f1525a.setAnimationListener(new C0448a(view, a));
        }
    }

    /* renamed from: a */
    private static Animation.AnimationListener m1958a(Animation animation) {
        try {
            if (f1478q == null) {
                f1478q = Animation.class.getDeclaredField("mListener");
                f1478q.setAccessible(true);
            }
            return (Animation.AnimationListener) f1478q.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1753a(int i) {
        return this.f1495l >= i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r1 = r15.mo1615k().getResourceName(r7.f1428z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031a, code lost:
        if (r11 >= 3) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x031e, code lost:
        if (f1477a == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0320, code lost:
        android.util.Log.v("FragmentManager", "movefrom STARTED: " + r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0336, code lost:
        r15.mo1546N();
        mo1777e(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033c, code lost:
        if (r11 >= 2) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0340, code lost:
        if (f1477a == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0342, code lost:
        android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035a, code lost:
        if (r7.f1390J == null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0362, code lost:
        if (r6.f1496m.mo1681a(r15) == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0366, code lost:
        if (r7.f1406d != null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0368, code lost:
        mo1796m(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x036b, code lost:
        r15.mo1547O();
        mo1780f(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0373, code lost:
        if (r7.f1390J == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0377, code lost:
        if (r7.f1389I == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0379, code lost:
        r7.f1389I.endViewTransition(r7.f1390J);
        r7.f1390J.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0388, code lost:
        if (r6.f1495l <= 0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x038c, code lost:
        if (r6.f1503u != false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0394, code lost:
        if (r7.f1390J.getVisibility() != 0) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x039a, code lost:
        if (r7.f1397Q < 0.0f) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x039c, code lost:
        r0 = mo1737a(r15, r17, false, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03a5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a6, code lost:
        r7.f1397Q = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a8, code lost:
        if (r0 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03aa, code lost:
        m1959a(r15, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ad, code lost:
        r7.f1389I.removeView(r7.f1390J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b4, code lost:
        r7.f1389I = null;
        r7.f1390J = null;
        r7.f1402V = null;
        r7.f1403W.mo151a(null);
        r7.f1391K = null;
        r7.f1417o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c3, code lost:
        if (r11 >= 1) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c7, code lost:
        if (r6.f1503u == false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03cd, code lost:
        if (r15.mo1555W() == null) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03cf, code lost:
        r0 = r15.mo1555W();
        r15.mo1578a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03de, code lost:
        if (r15.mo1556X() == null) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e0, code lost:
        r0 = r15.mo1556X();
        r15.mo1567a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ee, code lost:
        if (r15.mo1555W() != null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f4, code lost:
        if (r15.mo1556X() == null) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03f9, code lost:
        if (f1477a == false) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03fb, code lost:
        android.util.Log.v("FragmentManager", "movefrom CREATED: " + r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0413, code lost:
        if (r7.f1385E != false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0415, code lost:
        r15.mo1548P();
        mo1782g(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041c, code lost:
        r7.f1404b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x041e, code lost:
        r15.mo1549Q();
        mo1786h(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0424, code lost:
        if (r19 != false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0428, code lost:
        if (r7.f1385E != false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042a, code lost:
        mo1781g(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x042e, code lost:
        r7.f1422t = null;
        r7.f1426x = null;
        r7.f1421s = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0435, code lost:
        r15.mo1585b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a7, code lost:
        mo1769c(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01aa, code lost:
        if (r11 <= 1) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (f1477a == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c8, code lost:
        if (r7.f1416n != false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cc, code lost:
        if (r7.f1428z == 0) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d1, code lost:
        if (r7.f1428z != -1) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d3, code lost:
        m1962a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("Cannot create fragment " + r15 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f1, code lost:
        r0 = (android.view.ViewGroup) r6.f1497n.mo1640a(r7.f1428z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fb, code lost:
        if (r0 != null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ff, code lost:
        if (r7.f1418p != false) goto L_0x023f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1745a(android.support.p026v4.app.C0425f r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            boolean r0 = r7.f1414l
            r8 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.f1383C
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0 = r16
            goto L_0x0014
        L_0x000f:
            r0 = r16
            if (r0 <= r8) goto L_0x0014
            r0 = 1
        L_0x0014:
            boolean r1 = r7.f1415m
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f1404b
            if (r0 <= r1) goto L_0x002a
            int r0 = r7.f1404b
            if (r0 != 0) goto L_0x0028
            boolean r0 = r15.mo1605f()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f1404b
        L_0x002a:
            boolean r1 = r7.f1392L
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f1404b
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f1404b
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x02ec
            boolean r0 = r7.f1416n
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.f1417o
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            android.view.View r0 = r15.mo1555W()
            if (r0 != 0) goto L_0x0054
            android.animation.Animator r0 = r15.mo1556X()
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            r15.mo1578a((android.view.View) r12)
            r15.mo1567a((android.animation.Animator) r12)
            int r2 = r15.mo1557Y()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r1 = r15
            r0.mo1745a((android.support.p026v4.app.C0425f) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0066:
            int r0 = r7.f1404b
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x01a7;
                case 2: goto L_0x02a1;
                case 3: goto L_0x02c3;
                default: goto L_0x006b;
            }
        L_0x006b:
            r8 = r11
            goto L_0x043a
        L_0x006e:
            if (r11 <= 0) goto L_0x01a7
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x008a:
            android.os.Bundle r0 = r7.f1405c
            if (r0 == 0) goto L_0x00e1
            android.os.Bundle r0 = r7.f1405c
            android.support.v4.app.j r1 = r6.f1496m
            android.content.Context r1 = r1.mo1713g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f1405c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f1406d = r0
            android.os.Bundle r0 = r7.f1405c
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.f r0 = r14.mo1736a((android.os.Bundle) r0, (java.lang.String) r1)
            r7.f1411i = r0
            android.support.v4.app.f r0 = r7.f1411i
            if (r0 == 0) goto L_0x00bf
            android.os.Bundle r0 = r7.f1405c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f1413k = r0
        L_0x00bf:
            java.lang.Boolean r0 = r7.f1407e
            if (r0 == 0) goto L_0x00ce
            java.lang.Boolean r0 = r7.f1407e
            boolean r0 = r0.booleanValue()
            r7.f1393M = r0
            r7.f1407e = r12
            goto L_0x00d8
        L_0x00ce:
            android.os.Bundle r0 = r7.f1405c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f1393M = r0
        L_0x00d8:
            boolean r0 = r7.f1393M
            if (r0 != 0) goto L_0x00e1
            r7.f1392L = r8
            if (r11 <= r10) goto L_0x00e1
            r11 = 2
        L_0x00e1:
            android.support.v4.app.j r0 = r6.f1496m
            r7.f1422t = r0
            android.support.v4.app.f r1 = r6.f1498o
            r7.f1426x = r1
            if (r1 == 0) goto L_0x00ee
            android.support.v4.app.l r0 = r1.f1423u
            goto L_0x00f2
        L_0x00ee:
            android.support.v4.app.l r0 = r0.mo1715i()
        L_0x00f2:
            r7.f1421s = r0
            android.support.v4.app.f r0 = r7.f1411i
            if (r0 == 0) goto L_0x013d
            android.util.SparseArray<android.support.v4.app.f> r0 = r6.f1489f
            android.support.v4.app.f r1 = r7.f1411i
            int r1 = r1.f1408f
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.f r1 = r7.f1411i
            if (r0 != r1) goto L_0x0117
            android.support.v4.app.f r0 = r7.f1411i
            int r0 = r0.f1404b
            if (r0 >= r8) goto L_0x013d
            android.support.v4.app.f r1 = r7.f1411i
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r0.mo1745a((android.support.p026v4.app.C0425f) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x013d
        L_0x0117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.f r2 = r7.f1411i
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013d:
            android.support.v4.app.j r0 = r6.f1496m
            android.content.Context r0 = r0.mo1713g()
            r14.mo1746a((android.support.p026v4.app.C0425f) r15, (android.content.Context) r0, (boolean) r13)
            r7.f1388H = r13
            android.support.v4.app.j r0 = r6.f1496m
            android.content.Context r0 = r0.mo1713g()
            r15.mo1570a((android.content.Context) r0)
            boolean r0 = r7.f1388H
            if (r0 == 0) goto L_0x018b
            android.support.v4.app.f r0 = r7.f1426x
            if (r0 != 0) goto L_0x015f
            android.support.v4.app.j r0 = r6.f1496m
            r0.mo1683b(r15)
            goto L_0x0164
        L_0x015f:
            android.support.v4.app.f r0 = r7.f1426x
            r0.mo1575a((android.support.p026v4.app.C0425f) r15)
        L_0x0164:
            android.support.v4.app.j r0 = r6.f1496m
            android.content.Context r0 = r0.mo1713g()
            r14.mo1762b((android.support.p026v4.app.C0425f) r15, (android.content.Context) r0, (boolean) r13)
            boolean r0 = r7.f1399S
            if (r0 != 0) goto L_0x0181
            android.os.Bundle r0 = r7.f1405c
            r14.mo1747a((android.support.p026v4.app.C0425f) r15, (android.os.Bundle) r0, (boolean) r13)
            android.os.Bundle r0 = r7.f1405c
            r15.mo1616k(r0)
            android.os.Bundle r0 = r7.f1405c
            r14.mo1763b((android.support.p026v4.app.C0425f) r15, (android.os.Bundle) r0, (boolean) r13)
            goto L_0x0188
        L_0x0181:
            android.os.Bundle r0 = r7.f1405c
            r15.mo1606g(r0)
            r7.f1404b = r8
        L_0x0188:
            r7.f1385E = r13
            goto L_0x01a7
        L_0x018b:
            android.support.v4.app.x r0 = new android.support.v4.app.x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            r14.mo1769c((android.support.p026v4.app.C0425f) r15)
            if (r11 <= r8) goto L_0x02a1
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01c6:
            boolean r0 = r7.f1416n
            if (r0 != 0) goto L_0x028c
            int r0 = r7.f1428z
            if (r0 == 0) goto L_0x023e
            int r0 = r7.f1428z
            r1 = -1
            if (r0 != r1) goto L_0x01f1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r14.m1962a((java.lang.RuntimeException) r0)
        L_0x01f1:
            android.support.v4.app.h r0 = r6.f1497n
            int r1 = r7.f1428z
            android.view.View r0 = r0.mo1640a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x023f
            boolean r1 = r7.f1418p
            if (r1 != 0) goto L_0x023f
            android.content.res.Resources r1 = r15.mo1615k()     // Catch:{ NotFoundException -> 0x020c }
            int r2 = r7.f1428z     // Catch:{ NotFoundException -> 0x020c }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x020c }
            goto L_0x020e
        L_0x020c:
            java.lang.String r1 = "unknown"
        L_0x020e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.f1428z
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r15)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r14.m1962a((java.lang.RuntimeException) r2)
            goto L_0x023f
        L_0x023e:
            r0 = r12
        L_0x023f:
            r7.f1389I = r0
            android.os.Bundle r1 = r7.f1405c
            android.view.LayoutInflater r1 = r15.mo1596d((android.os.Bundle) r1)
            android.os.Bundle r2 = r7.f1405c
            r15.mo1587b((android.view.LayoutInflater) r1, (android.view.ViewGroup) r0, (android.os.Bundle) r2)
            android.view.View r1 = r7.f1390J
            if (r1 == 0) goto L_0x028a
            android.view.View r1 = r7.f1390J
            r7.f1391K = r1
            android.view.View r1 = r7.f1390J
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0260
            android.view.View r1 = r7.f1390J
            r0.addView(r1)
        L_0x0260:
            boolean r0 = r7.f1382B
            if (r0 == 0) goto L_0x026b
            android.view.View r0 = r7.f1390J
            r1 = 8
            r0.setVisibility(r1)
        L_0x026b:
            android.view.View r0 = r7.f1390J
            android.os.Bundle r1 = r7.f1405c
            r15.mo1579a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r7.f1390J
            android.os.Bundle r1 = r7.f1405c
            r14.mo1748a((android.support.p026v4.app.C0425f) r15, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r13)
            android.view.View r0 = r7.f1390J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0286
            android.view.ViewGroup r0 = r7.f1389I
            if (r0 == 0) goto L_0x0286
            goto L_0x0287
        L_0x0286:
            r8 = 0
        L_0x0287:
            r7.f1395O = r8
            goto L_0x028c
        L_0x028a:
            r7.f1391K = r12
        L_0x028c:
            android.os.Bundle r0 = r7.f1405c
            r15.mo1618l(r0)
            android.os.Bundle r0 = r7.f1405c
            r14.mo1770c(r15, r0, r13)
            android.view.View r0 = r7.f1390J
            if (r0 == 0) goto L_0x029f
            android.os.Bundle r0 = r7.f1405c
            r15.mo1573a((android.os.Bundle) r0)
        L_0x029f:
            r7.f1405c = r12
        L_0x02a1:
            if (r11 <= r10) goto L_0x02c3
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02bd:
            r15.mo1541I()
            r14.mo1764b((android.support.p026v4.app.C0425f) r15, (boolean) r13)
        L_0x02c3:
            if (r11 <= r9) goto L_0x02e9
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x02df
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02df:
            r15.mo1542J()
            r14.mo1771c((android.support.p026v4.app.C0425f) r15, (boolean) r13)
            r7.f1405c = r12
            r7.f1406d = r12
        L_0x02e9:
            r8 = r11
            goto L_0x043a
        L_0x02ec:
            int r0 = r7.f1404b
            if (r0 <= r11) goto L_0x0439
            int r0 = r7.f1404b
            switch(r0) {
                case 1: goto L_0x03c3;
                case 2: goto L_0x033c;
                case 3: goto L_0x031a;
                case 4: goto L_0x02f7;
                default: goto L_0x02f5;
            }
        L_0x02f5:
            goto L_0x0439
        L_0x02f7:
            r0 = 4
            if (r11 >= r0) goto L_0x031a
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0314:
            r15.mo1545M()
            r14.mo1774d(r15, r13)
        L_0x031a:
            if (r11 >= r9) goto L_0x033c
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x0336
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0336:
            r15.mo1546N()
            r14.mo1777e(r15, r13)
        L_0x033c:
            if (r11 >= r10) goto L_0x03c3
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x0358
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0358:
            android.view.View r0 = r7.f1390J
            if (r0 == 0) goto L_0x036b
            android.support.v4.app.j r0 = r6.f1496m
            boolean r0 = r0.mo1681a((android.support.p026v4.app.C0425f) r15)
            if (r0 == 0) goto L_0x036b
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1406d
            if (r0 != 0) goto L_0x036b
            r14.mo1796m(r15)
        L_0x036b:
            r15.mo1547O()
            r14.mo1780f(r15, r13)
            android.view.View r0 = r7.f1390J
            if (r0 == 0) goto L_0x03b4
            android.view.ViewGroup r0 = r7.f1389I
            if (r0 == 0) goto L_0x03b4
            android.view.ViewGroup r0 = r7.f1389I
            android.view.View r1 = r7.f1390J
            r0.endViewTransition(r1)
            android.view.View r0 = r7.f1390J
            r0.clearAnimation()
            int r0 = r6.f1495l
            r1 = 0
            if (r0 <= 0) goto L_0x03a5
            boolean r0 = r6.f1503u
            if (r0 != 0) goto L_0x03a5
            android.view.View r0 = r7.f1390J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03a5
            float r0 = r7.f1397Q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03a5
            r0 = r17
            r2 = r18
            android.support.v4.app.l$c r0 = r14.mo1737a((android.support.p026v4.app.C0425f) r15, (int) r0, (boolean) r13, (int) r2)
            goto L_0x03a6
        L_0x03a5:
            r0 = r12
        L_0x03a6:
            r7.f1397Q = r1
            if (r0 == 0) goto L_0x03ad
            r14.m1959a((android.support.p026v4.app.C0425f) r15, (android.support.p026v4.app.C0442l.C0451c) r0, (int) r11)
        L_0x03ad:
            android.view.ViewGroup r0 = r7.f1389I
            android.view.View r1 = r7.f1390J
            r0.removeView(r1)
        L_0x03b4:
            r7.f1389I = r12
            r7.f1390J = r12
            r7.f1402V = r12
            android.arch.lifecycle.l<android.arch.lifecycle.g> r0 = r7.f1403W
            r0.mo151a(r12)
            r7.f1391K = r12
            r7.f1417o = r13
        L_0x03c3:
            if (r11 >= r8) goto L_0x0439
            boolean r0 = r6.f1503u
            if (r0 == 0) goto L_0x03ea
            android.view.View r0 = r15.mo1555W()
            if (r0 == 0) goto L_0x03da
            android.view.View r0 = r15.mo1555W()
            r15.mo1578a((android.view.View) r12)
            r0.clearAnimation()
            goto L_0x03ea
        L_0x03da:
            android.animation.Animator r0 = r15.mo1556X()
            if (r0 == 0) goto L_0x03ea
            android.animation.Animator r0 = r15.mo1556X()
            r15.mo1567a((android.animation.Animator) r12)
            r0.cancel()
        L_0x03ea:
            android.view.View r0 = r15.mo1555W()
            if (r0 != 0) goto L_0x0435
            android.animation.Animator r0 = r15.mo1556X()
            if (r0 == 0) goto L_0x03f7
            goto L_0x0435
        L_0x03f7:
            boolean r0 = f1477a
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0411:
            boolean r0 = r7.f1385E
            if (r0 != 0) goto L_0x041c
            r15.mo1548P()
            r14.mo1782g(r15, r13)
            goto L_0x041e
        L_0x041c:
            r7.f1404b = r13
        L_0x041e:
            r15.mo1549Q()
            r14.mo1786h(r15, r13)
            if (r19 != 0) goto L_0x0439
            boolean r0 = r7.f1385E
            if (r0 != 0) goto L_0x042e
            r14.mo1781g(r15)
            goto L_0x0439
        L_0x042e:
            r7.f1422t = r12
            r7.f1426x = r12
            r7.f1421s = r12
            goto L_0x0439
        L_0x0435:
            r15.mo1585b((int) r11)
            goto L_0x043a
        L_0x0439:
            r8 = r11
        L_0x043a:
            int r0 = r7.f1404b
            if (r0 == r8) goto L_0x046d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " not updated inline; "
            r1.append(r2)
            java.lang.String r2 = "expected state "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f1404b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r7.f1404b = r8
        L_0x046d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.app.C0442l.mo1745a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m1959a(final C0425f fVar, C0451c cVar, int i) {
        final View view = fVar.f1390J;
        final ViewGroup viewGroup = fVar.f1389I;
        viewGroup.startViewTransition(view);
        fVar.mo1585b(i);
        if (cVar.f1525a != null) {
            C0453e eVar = new C0453e(cVar.f1525a, viewGroup, view);
            fVar.mo1578a(fVar.f1390J);
            eVar.setAnimationListener(new C0450b(m1958a((Animation) eVar)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        public void run() {
                            if (fVar.mo1555W() != null) {
                                fVar.mo1578a((View) null);
                                C0442l.this.mo1745a(fVar, fVar.mo1557Y(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m1971b(view, cVar);
            fVar.f1390J.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f1526b;
        fVar.mo1567a(cVar.f1526b);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator X = fVar.mo1556X();
                fVar.mo1567a((Animator) null);
                if (X != null && viewGroup.indexOfChild(view) < 0) {
                    C0442l lVar = C0442l.this;
                    C0425f fVar = fVar;
                    lVar.mo1745a(fVar, fVar.mo1557Y(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fVar.f1390J);
        m1971b(fVar.f1390J, cVar);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1761b(C0425f fVar) {
        mo1745a(fVar, this.f1495l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1769c(C0425f fVar) {
        if (fVar.f1416n && !fVar.f1419q) {
            fVar.mo1587b(fVar.mo1596d(fVar.f1405c), (ViewGroup) null, fVar.f1405c);
            if (fVar.f1390J != null) {
                fVar.f1391K = fVar.f1390J;
                fVar.f1390J.setSaveFromParentEnabled(false);
                if (fVar.f1382B) {
                    fVar.f1390J.setVisibility(8);
                }
                fVar.mo1579a(fVar.f1390J, fVar.f1405c);
                mo1748a(fVar, fVar.f1390J, fVar.f1405c, false);
                return;
            }
            fVar.f1391K = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1772d(final C0425f fVar) {
        if (fVar.f1390J != null) {
            C0451c a = mo1737a(fVar, fVar.mo1551S(), !fVar.f1382B, fVar.mo1552T());
            if (a == null || a.f1526b == null) {
                if (a != null) {
                    m1971b(fVar.f1390J, a);
                    fVar.f1390J.startAnimation(a.f1525a);
                    a.f1525a.start();
                }
                fVar.f1390J.setVisibility((!fVar.f1382B || fVar.mo1583aa()) ? 0 : 8);
                if (fVar.mo1583aa()) {
                    fVar.mo1604f(false);
                }
            } else {
                a.f1526b.setTarget(fVar.f1390J);
                if (!fVar.f1382B) {
                    fVar.f1390J.setVisibility(0);
                } else if (fVar.mo1583aa()) {
                    fVar.mo1604f(false);
                } else {
                    final ViewGroup viewGroup = fVar.f1389I;
                    final View view = fVar.f1390J;
                    viewGroup.startViewTransition(view);
                    a.f1526b.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fVar.f1390J != null) {
                                fVar.f1390J.setVisibility(8);
                            }
                        }
                    });
                }
                m1971b(fVar.f1390J, a);
                a.f1526b.start();
            }
        }
        if (fVar.f1414l && fVar.f1386F && fVar.f1387G) {
            this.f1500r = true;
        }
        fVar.f1396P = false;
        fVar.mo1581a(fVar.f1382B);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r0 = r0.f1390J;
        r1 = r11.f1389I;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1776e(android.support.p026v4.app.C0425f r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.f1495l
            boolean r1 = r11.f1415m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            boolean r1 = r11.mo1605f()
            if (r1 == 0) goto L_0x0017
            int r0 = java.lang.Math.min(r0, r2)
            r6 = r0
            goto L_0x001e
        L_0x0017:
            int r0 = java.lang.Math.min(r0, r3)
            r6 = r0
            goto L_0x001e
        L_0x001d:
            r6 = r0
        L_0x001e:
            int r7 = r11.mo1551S()
            int r8 = r11.mo1552T()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.mo1745a((android.support.p026v4.app.C0425f) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.f1390J
            if (r0 == 0) goto L_0x0093
            android.support.v4.app.f r0 = r10.m1978p(r11)
            if (r0 == 0) goto L_0x004e
            android.view.View r0 = r0.f1390J
            android.view.ViewGroup r1 = r11.f1389I
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.f1390J
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004e
            r1.removeViewAt(r4)
            android.view.View r4 = r11.f1390J
            r1.addView(r4, r0)
        L_0x004e:
            boolean r0 = r11.f1395O
            if (r0 == 0) goto L_0x0093
            android.view.ViewGroup r0 = r11.f1389I
            if (r0 == 0) goto L_0x0093
            float r0 = r11.f1397Q
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            android.view.View r0 = r11.f1390J
            float r4 = r11.f1397Q
            r0.setAlpha(r4)
        L_0x0064:
            r11.f1397Q = r1
            r11.f1395O = r3
            int r0 = r11.mo1551S()
            int r1 = r11.mo1552T()
            android.support.v4.app.l$c r0 = r10.mo1737a((android.support.p026v4.app.C0425f) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x0093
            android.view.View r1 = r11.f1390J
            m1971b((android.view.View) r1, (android.support.p026v4.app.C0442l.C0451c) r0)
            android.view.animation.Animation r1 = r0.f1525a
            if (r1 == 0) goto L_0x0087
            android.view.View r1 = r11.f1390J
            android.view.animation.Animation r0 = r0.f1525a
            r1.startAnimation(r0)
            goto L_0x0093
        L_0x0087:
            android.animation.Animator r1 = r0.f1526b
            android.view.View r2 = r11.f1390J
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1526b
            r0.start()
        L_0x0093:
            boolean r0 = r11.f1396P
            if (r0 == 0) goto L_0x009a
            r10.mo1772d((android.support.p026v4.app.C0425f) r11)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.app.C0442l.mo1776e(android.support.v4.app.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1739a(int i, boolean z) {
        C0438j jVar;
        if (this.f1496m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1495l) {
            this.f1495l = i;
            if (this.f1489f != null) {
                int size = this.f1488e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo1776e(this.f1488e.get(i2));
                }
                int size2 = this.f1489f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0425f valueAt = this.f1489f.valueAt(i3);
                    if (valueAt != null && ((valueAt.f1415m || valueAt.f1383C) && !valueAt.f1395O)) {
                        mo1776e(valueAt);
                    }
                }
                mo1775e();
                if (this.f1500r && (jVar = this.f1496m) != null && this.f1495l == 4) {
                    jVar.mo1684c();
                    this.f1500r = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1775e() {
        if (this.f1489f != null) {
            for (int i = 0; i < this.f1489f.size(); i++) {
                C0425f valueAt = this.f1489f.valueAt(i);
                if (valueAt != null) {
                    mo1744a(valueAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1779f(C0425f fVar) {
        if (fVar.f1408f < 0) {
            int i = this.f1487d;
            this.f1487d = i + 1;
            fVar.mo1565a(i, this.f1498o);
            if (this.f1489f == null) {
                this.f1489f = new SparseArray<>();
            }
            this.f1489f.put(fVar.f1408f, fVar);
            if (f1477a) {
                Log.v("FragmentManager", "Allocated fragment index " + fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1781g(C0425f fVar) {
        if (fVar.f1408f >= 0) {
            if (f1477a) {
                Log.v("FragmentManager", "Freeing fragment index " + fVar);
            }
            this.f1489f.put(fVar.f1408f, (Object) null);
            fVar.mo1632u();
        }
    }

    /* renamed from: a */
    public void mo1749a(C0425f fVar, boolean z) {
        if (f1477a) {
            Log.v("FragmentManager", "add: " + fVar);
        }
        mo1779f(fVar);
        if (fVar.f1383C) {
            return;
        }
        if (!this.f1488e.contains(fVar)) {
            synchronized (this.f1488e) {
                this.f1488e.add(fVar);
            }
            fVar.f1414l = true;
            fVar.f1415m = false;
            if (fVar.f1390J == null) {
                fVar.f1396P = false;
            }
            if (fVar.f1386F && fVar.f1387G) {
                this.f1500r = true;
            }
            if (z) {
                mo1761b(fVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fVar);
    }

    /* renamed from: h */
    public void mo1785h(C0425f fVar) {
        if (f1477a) {
            Log.v("FragmentManager", "remove: " + fVar + " nesting=" + fVar.f1420r);
        }
        boolean z = !fVar.mo1605f();
        if (!fVar.f1383C || z) {
            synchronized (this.f1488e) {
                this.f1488e.remove(fVar);
            }
            if (fVar.f1386F && fVar.f1387G) {
                this.f1500r = true;
            }
            fVar.f1414l = false;
            fVar.f1415m = true;
        }
    }

    /* renamed from: i */
    public void mo1788i(C0425f fVar) {
        if (f1477a) {
            Log.v("FragmentManager", "hide: " + fVar);
        }
        if (!fVar.f1382B) {
            fVar.f1382B = true;
            fVar.f1396P = true ^ fVar.f1396P;
        }
    }

    /* renamed from: j */
    public void mo1790j(C0425f fVar) {
        if (f1477a) {
            Log.v("FragmentManager", "show: " + fVar);
        }
        if (fVar.f1382B) {
            fVar.f1382B = false;
            fVar.f1396P = !fVar.f1396P;
        }
    }

    /* renamed from: k */
    public void mo1792k(C0425f fVar) {
        if (f1477a) {
            Log.v("FragmentManager", "detach: " + fVar);
        }
        if (!fVar.f1383C) {
            fVar.f1383C = true;
            if (fVar.f1414l) {
                if (f1477a) {
                    Log.v("FragmentManager", "remove from detach: " + fVar);
                }
                synchronized (this.f1488e) {
                    this.f1488e.remove(fVar);
                }
                if (fVar.f1386F && fVar.f1387G) {
                    this.f1500r = true;
                }
                fVar.f1414l = false;
            }
        }
    }

    /* renamed from: l */
    public void mo1794l(C0425f fVar) {
        if (f1477a) {
            Log.v("FragmentManager", "attach: " + fVar);
        }
        if (fVar.f1383C) {
            fVar.f1383C = false;
            if (fVar.f1414l) {
                return;
            }
            if (!this.f1488e.contains(fVar)) {
                if (f1477a) {
                    Log.v("FragmentManager", "add from attach: " + fVar);
                }
                synchronized (this.f1488e) {
                    this.f1488e.add(fVar);
                }
                fVar.f1414l = true;
                if (fVar.f1386F && fVar.f1387G) {
                    this.f1500r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fVar);
        }
    }

    /* renamed from: b */
    public C0425f mo1758b(int i) {
        for (int size = this.f1488e.size() - 1; size >= 0; size--) {
            C0425f fVar = this.f1488e.get(size);
            if (fVar != null && fVar.f1427y == i) {
                return fVar;
            }
        }
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0425f valueAt = this.f1489f.valueAt(size2);
            if (valueAt != null && valueAt.f1427y == i) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0425f mo1716a(String str) {
        if (str != null) {
            for (int size = this.f1488e.size() - 1; size >= 0; size--) {
                C0425f fVar = this.f1488e.get(size);
                if (fVar != null && str.equals(fVar.f1381A)) {
                    return fVar;
                }
            }
        }
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0425f valueAt = this.f1489f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f1381A)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0425f mo1759b(String str) {
        C0425f a;
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            C0425f valueAt = this.f1489f.valueAt(size);
            if (valueAt != null && (a = valueAt.mo1559a(str)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m1979y() {
        if (mo1722d()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1504v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f1504v);
        }
    }

    /* renamed from: d */
    public boolean mo1722d() {
        return this.f1501s || this.f1502t;
    }

    /* renamed from: a */
    public void mo1751a(C0456h hVar, boolean z) {
        if (!z) {
            m1979y();
        }
        synchronized (this) {
            if (!this.f1503u) {
                if (this.f1496m != null) {
                    if (this.f1485b == null) {
                        this.f1485b = new ArrayList<>();
                    }
                    this.f1485b.add(hVar);
                    mo1778f();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1778f() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f1481C != null && !this.f1481C.isEmpty();
            if (this.f1485b != null && this.f1485b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1496m.mo1714h().removeCallbacks(this.f1483E);
                this.f1496m.mo1714h().post(this.f1483E);
            }
        }
    }

    /* renamed from: a */
    public int mo1735a(C0421d dVar) {
        synchronized (this) {
            if (this.f1493j != null) {
                if (this.f1493j.size() > 0) {
                    int intValue = this.f1493j.remove(this.f1493j.size() - 1).intValue();
                    if (f1477a) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + dVar);
                    }
                    this.f1492i.set(intValue, dVar);
                    return intValue;
                }
            }
            if (this.f1492i == null) {
                this.f1492i = new ArrayList<>();
            }
            int size = this.f1492i.size();
            if (f1477a) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + dVar);
            }
            this.f1492i.add(dVar);
            return size;
        }
    }

    /* renamed from: a */
    public void mo1738a(int i, C0421d dVar) {
        synchronized (this) {
            if (this.f1492i == null) {
                this.f1492i = new ArrayList<>();
            }
            int size = this.f1492i.size();
            if (i < size) {
                if (f1477a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + dVar);
                }
                this.f1492i.set(i, dVar);
            } else {
                while (size < i) {
                    this.f1492i.add((Object) null);
                    if (this.f1493j == null) {
                        this.f1493j = new ArrayList<>();
                    }
                    if (f1477a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1493j.add(Integer.valueOf(size));
                    size++;
                }
                if (f1477a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + dVar);
                }
                this.f1492i.add(dVar);
            }
        }
    }

    /* renamed from: c */
    public void mo1768c(int i) {
        synchronized (this) {
            this.f1492i.set(i, (Object) null);
            if (this.f1493j == null) {
                this.f1493j = new ArrayList<>();
            }
            if (f1477a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f1493j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private void m1974c(boolean z) {
        if (this.f1486c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1496m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f1496m.mo1714h().getLooper()) {
            if (!z) {
                m1979y();
            }
            if (this.f1506x == null) {
                this.f1506x = new ArrayList<>();
                this.f1507y = new ArrayList<>();
            }
            this.f1486c = true;
            try {
                m1963a((ArrayList<C0421d>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1486c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: z */
    private void m1980z() {
        this.f1486c = false;
        this.f1507y.clear();
        this.f1506x.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public boolean mo1783g() {
        m1974c(true);
        boolean z = false;
        while (m1975c(this.f1506x, this.f1507y)) {
            this.f1486c = true;
            try {
                m1972b(this.f1506x, this.f1507y);
                m1980z();
                z = true;
            } catch (Throwable th) {
                m1980z();
                throw th;
            }
        }
        mo1784h();
        m1954C();
        return z;
    }

    /* renamed from: a */
    private void m1963a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0457i> arrayList3 = this.f1481C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0457i iVar = this.f1481C.get(i);
            if (arrayList != null && !iVar.f1536a && (indexOf2 = arrayList.indexOf(iVar.f1537b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                iVar.mo1828e();
            } else if (iVar.mo1826c() || (arrayList != null && iVar.f1537b.mo1516a(arrayList, 0, arrayList.size()))) {
                this.f1481C.remove(i);
                i--;
                size--;
                if (arrayList == null || iVar.f1536a || (indexOf = arrayList.indexOf(iVar.f1537b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    iVar.mo1827d();
                } else {
                    iVar.mo1828e();
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m1972b(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1963a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f1359t) {
                    if (i2 != i) {
                        m1964a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f1359t) {
                            i2++;
                        }
                    }
                    m1964a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1964a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: a */
    private void m1964a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0421d> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f1359t;
        ArrayList<C0425f> arrayList5 = this.f1508z;
        if (arrayList5 == null) {
            this.f1508z = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1508z.addAll(this.f1488e);
        C0425f w = mo1811w();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0421d dVar = arrayList3.get(i6);
            if (!arrayList4.get(i6).booleanValue()) {
                w = dVar.mo1508a(this.f1508z, w);
            } else {
                w = dVar.mo1519b(this.f1508z, w);
            }
            z2 = z2 || dVar.f1348i;
        }
        this.f1508z.clear();
        if (!z) {
            C0464q.m2095a(this, arrayList, arrayList2, i, i2, false);
        }
        m1973b(arrayList, arrayList2, i, i2);
        if (z) {
            C0513b bVar = new C0513b();
            m1970b((C0513b<C0425f>) bVar);
            int a = m1955a(arrayList, arrayList2, i, i2, (C0513b<C0425f>) bVar);
            m1961a((C0513b<C0425f>) bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0464q.m2095a(this, arrayList, arrayList2, i, i3, true);
            mo1739a(this.f1495l, true);
        }
        while (i4 < i5) {
            C0421d dVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && dVar2.f1352m >= 0) {
                mo1768c(dVar2.f1352m);
                dVar2.f1352m = -1;
            }
            dVar2.mo1510a();
            i4++;
        }
        if (z2) {
            mo1787i();
        }
    }

    /* renamed from: a */
    private void m1961a(C0513b<C0425f> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            C0425f b = bVar.mo1984b(i);
            if (!b.f1414l) {
                View q = b.mo1627q();
                b.f1397Q = q.getAlpha();
                q.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private int m1955a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0513b<C0425f> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0421d dVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (dVar.mo1523d() && !dVar.mo1516a(arrayList, i4 + 1, i2)) {
                if (this.f1481C == null) {
                    this.f1481C = new ArrayList<>();
                }
                C0457i iVar = new C0457i(dVar, booleanValue);
                this.f1481C.add(iVar);
                dVar.mo1513a((C0425f.C0431c) iVar);
                if (booleanValue) {
                    dVar.mo1522c();
                } else {
                    dVar.mo1520b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, dVar);
                }
                m1970b(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1743a(C0421d dVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            dVar.mo1520b(z3);
        } else {
            dVar.mo1522c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(dVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0464q.m2095a(this, (ArrayList<C0421d>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo1739a(this.f1495l, true);
        }
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                C0425f valueAt = this.f1489f.valueAt(i);
                if (valueAt != null && valueAt.f1390J != null && valueAt.f1395O && dVar.mo1521b(valueAt.f1428z)) {
                    if (valueAt.f1397Q > 0.0f) {
                        valueAt.f1390J.setAlpha(valueAt.f1397Q);
                    }
                    if (z3) {
                        valueAt.f1397Q = 0.0f;
                    } else {
                        valueAt.f1397Q = -1.0f;
                        valueAt.f1395O = false;
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private C0425f m1978p(C0425f fVar) {
        ViewGroup viewGroup = fVar.f1389I;
        View view = fVar.f1390J;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f1488e.indexOf(fVar) - 1; indexOf >= 0; indexOf--) {
            C0425f fVar2 = this.f1488e.get(indexOf);
            if (fVar2.f1389I == viewGroup && fVar2.f1390J != null) {
                return fVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m1973b(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0421d dVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                dVar.mo1511a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                dVar.mo1520b(z);
            } else {
                dVar.mo1511a(1);
                dVar.mo1522c();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m1970b(C0513b<C0425f> bVar) {
        int i = this.f1495l;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f1488e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0425f fVar = this.f1488e.get(i2);
                if (fVar.f1404b < min) {
                    mo1745a(fVar, min, fVar.mo1550R(), fVar.mo1551S(), false);
                    if (fVar.f1390J != null && !fVar.f1382B && fVar.f1395O) {
                        bVar.add(fVar);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private void m1952A() {
        if (this.f1481C != null) {
            while (!this.f1481C.isEmpty()) {
                this.f1481C.remove(0).mo1827d();
            }
        }
    }

    /* renamed from: B */
    private void m1953B() {
        SparseArray<C0425f> sparseArray = this.f1489f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            C0425f valueAt = this.f1489f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mo1555W() != null) {
                    int Y = valueAt.mo1557Y();
                    View W = valueAt.mo1555W();
                    Animation animation = W.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        W.clearAnimation();
                    }
                    valueAt.mo1578a((View) null);
                    mo1745a(valueAt, Y, 0, 0, false);
                } else if (valueAt.mo1556X() != null) {
                    valueAt.mo1556X().end();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1975c(java.util.ArrayList<android.support.p026v4.app.C0421d> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f1485b     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f1485b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f1485b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.l$h> r3 = r4.f1485b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.l$h r3 = (android.support.p026v4.app.C0442l.C0456h) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo1517a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.l$h> r5 = r4.f1485b     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.j r5 = r4.f1496m     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo1714h()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f1483E     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.app.C0442l.m1975c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1784h() {
        if (this.f1505w) {
            this.f1505w = false;
            mo1775e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1787i() {
        if (this.f1494k != null) {
            for (int i = 0; i < this.f1494k.size(); i++) {
                this.f1494k.get(i).mo1734a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1760b(C0421d dVar) {
        if (this.f1490g == null) {
            this.f1490g = new ArrayList<>();
        }
        this.f1490g.add(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1757a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0421d> arrayList3 = this.f1490g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1490g.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f1490g.size() - 1;
                while (i3 >= 0) {
                    C0421d dVar = this.f1490g.get(i3);
                    if ((str != null && str.equals(dVar.mo1524e())) || (i >= 0 && i == dVar.f1352m)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0421d dVar2 = this.f1490g.get(i3);
                        if ((str == null || !str.equals(dVar2.mo1524e())) && (i < 0 || i != dVar2.f1352m)) {
                            break;
                        }
                        i3--;
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f1490g.size() - 1) {
                return false;
            }
            for (int size3 = this.f1490g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1490g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0458m mo1789j() {
        m1960a(this.f1482D);
        return this.f1482D;
    }

    /* renamed from: a */
    private static void m1960a(C0458m mVar) {
        if (mVar != null) {
            List<C0425f> a = mVar.mo1829a();
            if (a != null) {
                for (C0425f fVar : a) {
                    fVar.f1385E = true;
                }
            }
            List<C0458m> b = mVar.mo1830b();
            if (b != null) {
                for (C0458m a2 : b) {
                    m1960a(a2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1791k() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0458m mVar;
        if (this.f1489f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f1489f.size(); i++) {
                C0425f valueAt = this.f1489f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f1384D) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        valueAt.f1412j = valueAt.f1411i != null ? valueAt.f1411i.f1408f : -1;
                        if (f1477a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    if (valueAt.f1423u != null) {
                        valueAt.f1423u.mo1791k();
                        mVar = valueAt.f1423u.f1482D;
                    } else {
                        mVar = valueAt.f1424v;
                    }
                    if (arrayList2 == null && mVar != null) {
                        arrayList2 = new ArrayList(this.f1489f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(mVar);
                    }
                    if (arrayList == null && valueAt.f1425w != null) {
                        arrayList = new ArrayList(this.f1489f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.f1425w);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f1482D = null;
        } else {
            this.f1482D = new C0458m(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1796m(C0425f fVar) {
        if (fVar.f1391K != null) {
            SparseArray<Parcelable> sparseArray = this.f1480B;
            if (sparseArray == null) {
                this.f1480B = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fVar.f1391K.saveHierarchyState(this.f1480B);
            if (this.f1480B.size() > 0) {
                fVar.f1406d = this.f1480B;
                this.f1480B = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Bundle mo1797n(C0425f fVar) {
        Bundle bundle;
        if (this.f1479A == null) {
            this.f1479A = new Bundle();
        }
        fVar.mo1620m(this.f1479A);
        mo1773d(fVar, this.f1479A, false);
        if (!this.f1479A.isEmpty()) {
            bundle = this.f1479A;
            this.f1479A = null;
        } else {
            bundle = null;
        }
        if (fVar.f1390J != null) {
            mo1796m(fVar);
        }
        if (fVar.f1406d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fVar.f1406d);
        }
        if (!fVar.f1393M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fVar.f1393M);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Parcelable mo1793l() {
        int[] iArr;
        int size;
        m1952A();
        m1953B();
        mo1783g();
        this.f1501s = true;
        C0423e[] eVarArr = null;
        this.f1482D = null;
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f1489f.size();
        C0461o[] oVarArr = new C0461o[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            C0425f valueAt = this.f1489f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f1408f < 0) {
                    m1962a((RuntimeException) new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f1408f));
                }
                C0461o oVar = new C0461o(valueAt);
                oVarArr[i] = oVar;
                if (valueAt.f1404b <= 0 || oVar.f1557k != null) {
                    oVar.f1557k = valueAt.f1405c;
                } else {
                    oVar.f1557k = mo1797n(valueAt);
                    if (valueAt.f1411i != null) {
                        if (valueAt.f1411i.f1408f < 0) {
                            m1962a((RuntimeException) new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f1411i));
                        }
                        if (oVar.f1557k == null) {
                            oVar.f1557k = new Bundle();
                        }
                        mo1741a(oVar.f1557k, "android:target_state", valueAt.f1411i);
                        if (valueAt.f1413k != 0) {
                            oVar.f1557k.putInt("android:target_req_state", valueAt.f1413k);
                        }
                    }
                }
                if (f1477a) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + oVar.f1557k);
                }
                z = true;
            }
        }
        if (!z) {
            if (f1477a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f1488e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i2 = 0; i2 < size3; i2++) {
                iArr[i2] = this.f1488e.get(i2).f1408f;
                if (iArr[i2] < 0) {
                    m1962a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f1488e.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f1477a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f1488e.get(i2));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0421d> arrayList = this.f1490g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            eVarArr = new C0423e[size];
            for (int i3 = 0; i3 < size; i3++) {
                eVarArr[i3] = new C0423e(this.f1490g.get(i3));
                if (f1477a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f1490g.get(i3));
                }
            }
        }
        C0459n nVar = new C0459n();
        nVar.f1542a = oVarArr;
        nVar.f1543b = iArr;
        nVar.f1544c = eVarArr;
        C0425f fVar = this.f1499p;
        if (fVar != null) {
            nVar.f1545d = fVar.f1408f;
        }
        nVar.f1546e = this.f1487d;
        mo1791k();
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1742a(Parcelable parcelable, C0458m mVar) {
        List<C0092s> list;
        List<C0458m> list2;
        if (parcelable != null) {
            C0459n nVar = (C0459n) parcelable;
            if (nVar.f1542a != null) {
                if (mVar != null) {
                    List<C0425f> a = mVar.mo1829a();
                    list2 = mVar.mo1830b();
                    list = mVar.mo1831c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        C0425f fVar = a.get(i);
                        if (f1477a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fVar);
                        }
                        int i2 = 0;
                        while (i2 < nVar.f1542a.length && nVar.f1542a[i2].f1548b != fVar.f1408f) {
                            i2++;
                        }
                        if (i2 == nVar.f1542a.length) {
                            m1962a((RuntimeException) new IllegalStateException("Could not find active fragment with index " + fVar.f1408f));
                        }
                        C0461o oVar = nVar.f1542a[i2];
                        oVar.f1558l = fVar;
                        fVar.f1406d = null;
                        fVar.f1420r = 0;
                        fVar.f1417o = false;
                        fVar.f1414l = false;
                        fVar.f1411i = null;
                        if (oVar.f1557k != null) {
                            oVar.f1557k.setClassLoader(this.f1496m.mo1713g().getClassLoader());
                            fVar.f1406d = oVar.f1557k.getSparseParcelableArray("android:view_state");
                            fVar.f1405c = oVar.f1557k;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f1489f = new SparseArray<>(nVar.f1542a.length);
                int i3 = 0;
                while (i3 < nVar.f1542a.length) {
                    C0461o oVar2 = nVar.f1542a[i3];
                    if (oVar2 != null) {
                        C0425f a2 = oVar2.mo1838a(this.f1496m, this.f1497n, this.f1498o, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (f1477a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a2);
                        }
                        this.f1489f.put(a2.f1408f, a2);
                        oVar2.f1558l = null;
                    }
                    i3++;
                }
                if (mVar != null) {
                    List<C0425f> a3 = mVar.mo1829a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0425f fVar2 = a3.get(i4);
                        if (fVar2.f1412j >= 0) {
                            fVar2.f1411i = this.f1489f.get(fVar2.f1412j);
                            if (fVar2.f1411i == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fVar2 + " target no longer exists: " + fVar2.f1412j);
                            }
                        }
                    }
                }
                this.f1488e.clear();
                if (nVar.f1543b != null) {
                    int i5 = 0;
                    while (i5 < nVar.f1543b.length) {
                        C0425f fVar3 = this.f1489f.get(nVar.f1543b[i5]);
                        if (fVar3 == null) {
                            m1962a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + nVar.f1543b[i5]));
                        }
                        fVar3.f1414l = true;
                        if (f1477a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + fVar3);
                        }
                        if (!this.f1488e.contains(fVar3)) {
                            synchronized (this.f1488e) {
                                this.f1488e.add(fVar3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (nVar.f1544c != null) {
                    this.f1490g = new ArrayList<>(nVar.f1544c.length);
                    for (int i6 = 0; i6 < nVar.f1544c.length; i6++) {
                        C0421d a4 = nVar.f1544c[i6].mo1526a(this);
                        if (f1477a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a4.f1352m + "): " + a4);
                            PrintWriter printWriter = new PrintWriter(new C0517e("FragmentManager"));
                            a4.mo1515a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1490g.add(a4);
                        if (a4.f1352m >= 0) {
                            mo1738a(a4.f1352m, a4);
                        }
                    }
                } else {
                    this.f1490g = null;
                }
                if (nVar.f1545d >= 0) {
                    this.f1499p = this.f1489f.get(nVar.f1545d);
                }
                this.f1487d = nVar.f1546e;
            }
        }
    }

    /* renamed from: C */
    private void m1954C() {
        SparseArray<C0425f> sparseArray = this.f1489f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f1489f.valueAt(size) == null) {
                    SparseArray<C0425f> sparseArray2 = this.f1489f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1750a(C0438j jVar, C0436h hVar, C0425f fVar) {
        if (this.f1496m == null) {
            this.f1496m = jVar;
            this.f1497n = hVar;
            this.f1498o = fVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: m */
    public void mo1795m() {
        this.f1482D = null;
        this.f1501s = false;
        this.f1502t = false;
        int size = this.f1488e.size();
        for (int i = 0; i < size; i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null) {
                fVar.mo1543K();
            }
        }
    }

    /* renamed from: n */
    public void mo1798n() {
        this.f1501s = false;
        this.f1502t = false;
        m1977e(1);
    }

    /* renamed from: o */
    public void mo1799o() {
        this.f1501s = false;
        this.f1502t = false;
        m1977e(2);
    }

    /* renamed from: p */
    public void mo1803p() {
        this.f1501s = false;
        this.f1502t = false;
        m1977e(3);
    }

    /* renamed from: q */
    public void mo1804q() {
        this.f1501s = false;
        this.f1502t = false;
        m1977e(4);
    }

    /* renamed from: r */
    public void mo1805r() {
        m1977e(3);
    }

    /* renamed from: s */
    public void mo1806s() {
        this.f1502t = true;
        m1977e(2);
    }

    /* renamed from: t */
    public void mo1807t() {
        m1977e(1);
    }

    /* renamed from: u */
    public void mo1809u() {
        this.f1503u = true;
        mo1783g();
        m1977e(0);
        this.f1496m = null;
        this.f1497n = null;
        this.f1498o = null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m1977e(int i) {
        try {
            this.f1486c = true;
            mo1739a(i, false);
            this.f1486c = false;
            mo1783g();
        } catch (Throwable th) {
            this.f1486c = false;
            throw th;
        }
    }

    /* renamed from: a */
    public void mo1752a(boolean z) {
        for (int size = this.f1488e.size() - 1; size >= 0; size--) {
            C0425f fVar = this.f1488e.get(size);
            if (fVar != null) {
                fVar.mo1598d(z);
            }
        }
    }

    /* renamed from: b */
    public void mo1766b(boolean z) {
        for (int size = this.f1488e.size() - 1; size >= 0; size--) {
            C0425f fVar = this.f1488e.get(size);
            if (fVar != null) {
                fVar.mo1601e(z);
            }
        }
    }

    /* renamed from: a */
    public void mo1740a(Configuration configuration) {
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null) {
                fVar.mo1572a(configuration);
            }
        }
    }

    /* renamed from: v */
    public void mo1810v() {
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null) {
                fVar.mo1544L();
            }
        }
    }

    /* renamed from: a */
    public boolean mo1755a(Menu menu, MenuInflater menuInflater) {
        if (this.f1495l < 1) {
            return false;
        }
        ArrayList<C0425f> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null && fVar.mo1590b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fVar);
                z = true;
            }
        }
        if (this.f1491h != null) {
            for (int i2 = 0; i2 < this.f1491h.size(); i2++) {
                C0425f fVar2 = this.f1491h.get(i2);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.mo1634w();
                }
            }
        }
        this.f1491h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo1754a(Menu menu) {
        if (this.f1495l < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null && fVar.mo1594c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo1756a(MenuItem menuItem) {
        if (this.f1495l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null && fVar.mo1595c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo1767b(MenuItem menuItem) {
        if (this.f1495l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1488e.size(); i++) {
            C0425f fVar = this.f1488e.get(i);
            if (fVar != null && fVar.mo1599d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo1765b(Menu menu) {
        if (this.f1495l >= 1) {
            for (int i = 0; i < this.f1488e.size(); i++) {
                C0425f fVar = this.f1488e.get(i);
                if (fVar != null) {
                    fVar.mo1597d(menu);
                }
            }
        }
    }

    /* renamed from: o */
    public void mo1800o(C0425f fVar) {
        if (fVar == null || (this.f1489f.get(fVar.f1408f) == fVar && (fVar.f1422t == null || fVar.mo1617l() == this))) {
            this.f1499p = fVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: w */
    public C0425f mo1811w() {
        return this.f1499p;
    }

    /* renamed from: a */
    public void mo1718a(C0439k.C0440a aVar, boolean z) {
        this.f1484J.add(new C0454f(aVar, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1746a(C0425f fVar, Context context, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1746a(fVar, context, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1723a((C0439k) this, fVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1762b(C0425f fVar, Context context, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1762b(fVar, context, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1725b((C0439k) this, fVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1747a(C0425f fVar, Bundle bundle, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1747a(fVar, bundle, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1726b((C0439k) this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1763b(C0425f fVar, Bundle bundle, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1763b(fVar, bundle, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo189a((C0439k) this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1770c(C0425f fVar, Bundle bundle, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1770c(fVar, bundle, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1728c(this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1748a(C0425f fVar, View view, Bundle bundle, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1748a(fVar, view, bundle, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1724a(this, fVar, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1764b(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1764b(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo188a(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1771c(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1771c(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo190b(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1774d(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1774d(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1727c(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1777e(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1777e(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1729d(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1773d(C0425f fVar, Bundle bundle, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1773d(fVar, bundle, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1730d(this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1780f(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1780f(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1731e(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1782g(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1782g(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1732f(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1786h(C0425f fVar, boolean z) {
        C0425f fVar2 = this.f1498o;
        if (fVar2 != null) {
            C0439k l = fVar2.mo1617l();
            if (l instanceof C0442l) {
                ((C0442l) l).mo1786h(fVar, true);
            }
        }
        Iterator<C0454f> it = this.f1484J.iterator();
        while (it.hasNext()) {
            C0454f next = it.next();
            if (!z || next.f1534b) {
                next.f1533a.mo1733g(this, fVar);
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0425f fVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0455g.f1535a);
        int i = 0;
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0425f.m1754a(this.f1496m.mo1713g(), string)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0425f b = resourceId != -1 ? mo1758b(resourceId) : null;
        if (b == null && string2 != null) {
            b = mo1716a(string2);
        }
        if (b == null && i != -1) {
            b = mo1758b(i);
        }
        if (f1477a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + b);
        }
        if (b == null) {
            C0425f a = this.f1497n.mo1639a(context2, string, (Bundle) null);
            a.f1416n = true;
            a.f1427y = resourceId != 0 ? resourceId : i;
            a.f1428z = i;
            a.f1381A = string2;
            a.f1417o = true;
            a.f1421s = this;
            C0438j jVar = this.f1496m;
            a.f1422t = jVar;
            a.mo1571a(jVar.mo1713g(), attributeSet2, a.f1405c);
            mo1749a(a, true);
            fVar = a;
        } else if (!b.f1417o) {
            b.f1417o = true;
            b.f1422t = this.f1496m;
            if (!b.f1385E) {
                b.mo1571a(this.f1496m.mo1713g(), attributeSet2, b.f1405c);
            }
            fVar = b;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + string);
        }
        if (this.f1495l >= 1 || !fVar.f1416n) {
            mo1761b(fVar);
        } else {
            mo1745a(fVar, 1, 0, 0, false);
        }
        if (fVar.f1390J != null) {
            if (resourceId != 0) {
                fVar.f1390J.setId(resourceId);
            }
            if (fVar.f1390J.getTag() == null) {
                fVar.f1390J.setTag(string2);
            }
            return fVar.f1390J;
        }
        throw new IllegalStateException("Fragment " + string + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: android.support.v4.app.l$i */
    static class C0457i implements C0425f.C0431c {

        /* renamed from: a */
        final boolean f1536a;

        /* renamed from: b */
        final C0421d f1537b;

        /* renamed from: c */
        private int f1538c;

        C0457i(C0421d dVar, boolean z) {
            this.f1536a = z;
            this.f1537b = dVar;
        }

        /* renamed from: a */
        public void mo1642a() {
            this.f1538c--;
            if (this.f1538c == 0) {
                this.f1537b.f1340a.mo1778f();
            }
        }

        /* renamed from: b */
        public void mo1643b() {
            this.f1538c++;
        }

        /* renamed from: c */
        public boolean mo1826c() {
            return this.f1538c == 0;
        }

        /* renamed from: d */
        public void mo1827d() {
            boolean z = this.f1538c > 0;
            C0442l lVar = this.f1537b.f1340a;
            int size = lVar.f1488e.size();
            for (int i = 0; i < size; i++) {
                C0425f fVar = lVar.f1488e.get(i);
                fVar.mo1574a((C0425f.C0431c) null);
                if (z && fVar.mo1558Z()) {
                    fVar.mo1538F();
                }
            }
            this.f1537b.f1340a.mo1743a(this.f1537b, this.f1536a, !z, true);
        }

        /* renamed from: e */
        public void mo1828e() {
            this.f1537b.f1340a.mo1743a(this.f1537b, this.f1536a, false, false);
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    private static class C0451c {

        /* renamed from: a */
        public final Animation f1525a;

        /* renamed from: b */
        public final Animator f1526b;

        C0451c(Animation animation) {
            this.f1525a = animation;
            this.f1526b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0451c(Animator animator) {
            this.f1525a = null;
            this.f1526b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    private static class C0450b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f1524a;

        C0450b(Animation.AnimationListener animationListener) {
            this.f1524a = animationListener;
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f1524a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f1524a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f1524a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.l$a */
    private static class C0448a extends C0450b {

        /* renamed from: a */
        View f1522a;

        C0448a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f1522a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0594r.m2625z(this.f1522a) || Build.VERSION.SDK_INT >= 24) {
                this.f1522a.post(new Runnable() {
                    public void run() {
                        C0448a.this.f1522a.setLayerType(0, (Paint) null);
                    }
                });
            } else {
                this.f1522a.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.l$d */
    private static class C0452d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f1527a;

        C0452d(View view) {
            this.f1527a = view;
        }

        public void onAnimationStart(Animator animator) {
            this.f1527a.setLayerType(2, (Paint) null);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1527a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.l$e */
    private static class C0453e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f1528a;

        /* renamed from: b */
        private final View f1529b;

        /* renamed from: c */
        private boolean f1530c;

        /* renamed from: d */
        private boolean f1531d;

        /* renamed from: e */
        private boolean f1532e = true;

        C0453e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1528a = viewGroup;
            this.f1529b = view;
            addAnimation(animation);
            this.f1528a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1532e = true;
            if (this.f1530c) {
                return !this.f1531d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1530c = true;
                C0482v.m2163a(this.f1528a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1532e = true;
            if (this.f1530c) {
                return !this.f1531d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1530c = true;
                C0482v.m2163a(this.f1528a, this);
            }
            return true;
        }

        public void run() {
            if (this.f1530c || !this.f1532e) {
                this.f1528a.endViewTransition(this.f1529b);
                this.f1531d = true;
                return;
            }
            this.f1532e = false;
            this.f1528a.post(this);
        }
    }
}
