package android.support.p026v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0065d;
import android.arch.lifecycle.C0073g;
import android.arch.lifecycle.C0074h;
import android.arch.lifecycle.C0080l;
import android.arch.lifecycle.C0092s;
import android.arch.lifecycle.C0093t;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p026v4.p035g.C0516d;
import android.support.p026v4.p035g.C0532l;
import android.support.p026v4.p036h.C0582f;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.f */
public class C0425f implements C0073g, C0093t, ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: X */
    private static final C0532l<String, Class<?>> f1379X = new C0532l<>();

    /* renamed from: a */
    static final Object f1380a = new Object();

    /* renamed from: A */
    String f1381A;

    /* renamed from: B */
    boolean f1382B;

    /* renamed from: C */
    boolean f1383C;

    /* renamed from: D */
    boolean f1384D;

    /* renamed from: E */
    boolean f1385E;

    /* renamed from: F */
    boolean f1386F;

    /* renamed from: G */
    boolean f1387G = true;

    /* renamed from: H */
    boolean f1388H;

    /* renamed from: I */
    ViewGroup f1389I;

    /* renamed from: J */
    View f1390J;

    /* renamed from: K */
    View f1391K;

    /* renamed from: L */
    boolean f1392L;

    /* renamed from: M */
    boolean f1393M = true;

    /* renamed from: N */
    C0429a f1394N;

    /* renamed from: O */
    boolean f1395O;

    /* renamed from: P */
    boolean f1396P;

    /* renamed from: Q */
    float f1397Q;

    /* renamed from: R */
    LayoutInflater f1398R;

    /* renamed from: S */
    boolean f1399S;

    /* renamed from: T */
    C0074h f1400T = new C0074h(this);

    /* renamed from: U */
    C0074h f1401U;

    /* renamed from: V */
    C0073g f1402V;

    /* renamed from: W */
    C0080l<C0073g> f1403W = new C0080l<>();

    /* renamed from: b */
    int f1404b = 0;

    /* renamed from: c */
    Bundle f1405c;

    /* renamed from: d */
    SparseArray<Parcelable> f1406d;

    /* renamed from: e */
    Boolean f1407e;

    /* renamed from: f */
    int f1408f = -1;

    /* renamed from: g */
    String f1409g;

    /* renamed from: h */
    Bundle f1410h;

    /* renamed from: i */
    C0425f f1411i;

    /* renamed from: j */
    int f1412j = -1;

    /* renamed from: k */
    int f1413k;

    /* renamed from: l */
    boolean f1414l;

    /* renamed from: m */
    boolean f1415m;

    /* renamed from: n */
    boolean f1416n;

    /* renamed from: o */
    boolean f1417o;

    /* renamed from: p */
    boolean f1418p;

    /* renamed from: q */
    boolean f1419q;

    /* renamed from: r */
    int f1420r;

    /* renamed from: s */
    C0442l f1421s;

    /* renamed from: t */
    C0438j f1422t;

    /* renamed from: u */
    C0442l f1423u;

    /* renamed from: v */
    C0458m f1424v;

    /* renamed from: w */
    C0092s f1425w;

    /* renamed from: x */
    C0425f f1426x;

    /* renamed from: y */
    int f1427y;

    /* renamed from: z */
    int f1428z;

    /* renamed from: android.support.v4.app.f$c */
    interface C0431c {
        /* renamed from: a */
        void mo1642a();

        /* renamed from: b */
        void mo1643b();
    }

    /* renamed from: a */
    public View mo1560a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo1561a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public void mo1564a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo1566a(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: a */
    public void mo1575a(C0425f fVar) {
    }

    /* renamed from: a */
    public void mo1576a(Menu menu) {
    }

    /* renamed from: a */
    public void mo1577a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void mo1579a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1581a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1582a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator mo1584b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public void mo1588b(Menu menu) {
    }

    /* renamed from: b */
    public void mo1589b(boolean z) {
    }

    /* renamed from: b */
    public boolean mo1591b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    public void mo1593c(boolean z) {
    }

    /* renamed from: j */
    public void mo1614j(Bundle bundle) {
    }

    /* renamed from: w */
    public void mo1634w() {
    }

    /* renamed from: d */
    public C0065d mo191d() {
        return this.f1400T;
    }

    /* renamed from: e */
    public C0092s mo221e() {
        if (mo1608h() != null) {
            if (this.f1425w == null) {
                this.f1425w = new C0092s();
            }
            return this.f1425w;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: android.support.v4.app.f$b */
    public static class C0430b extends RuntimeException {
        public C0430b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a */
    public static C0425f m1753a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f1379X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1379X.put(str, cls);
            }
            C0425f fVar = (C0425f) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fVar.getClass().getClassLoader());
                fVar.mo1586b(bundle);
            }
            return fVar;
        } catch (ClassNotFoundException e) {
            throw new C0430b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0430b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0430b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0430b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0430b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: a */
    static boolean m1754a(Context context, String str) {
        try {
            Class<?> cls = f1379X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1379X.put(str, cls);
            }
            return C0425f.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1573a(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1406d;
        if (sparseArray != null) {
            this.f1391K.restoreHierarchyState(sparseArray);
            this.f1406d = null;
        }
        this.f1388H = false;
        mo1612i(bundle);
        if (!this.f1388H) {
            throw new C0484x("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f1390J != null) {
            this.f1401U.mo192a(C0065d.C0066a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1565a(int i, C0425f fVar) {
        this.f1408f = i;
        if (fVar != null) {
            this.f1409g = fVar.f1409g + ":" + this.f1408f;
            return;
        }
        this.f1409g = "android:fragment:" + this.f1408f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo1605f() {
        return this.f1420r > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0516d.m2263a(this, sb);
        if (this.f1408f >= 0) {
            sb.append(" #");
            sb.append(this.f1408f);
        }
        if (this.f1427y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1427y));
        }
        if (this.f1381A != null) {
            sb.append(" ");
            sb.append(this.f1381A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public void mo1586b(Bundle bundle) {
        if (this.f1408f < 0 || !mo1607g()) {
            this.f1410h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: g */
    public final boolean mo1607g() {
        C0442l lVar = this.f1421s;
        if (lVar == null) {
            return false;
        }
        return lVar.mo1722d();
    }

    /* renamed from: h */
    public Context mo1608h() {
        C0438j jVar = this.f1422t;
        if (jVar == null) {
            return null;
        }
        return jVar.mo1713g();
    }

    /* renamed from: i */
    public final Context mo1611i() {
        Context h = mo1608h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: j */
    public final C0432g mo1613j() {
        C0438j jVar = this.f1422t;
        if (jVar == null) {
            return null;
        }
        return (C0432g) jVar.mo1712f();
    }

    /* renamed from: k */
    public final Resources mo1615k() {
        return mo1611i().getResources();
    }

    /* renamed from: l */
    public final C0439k mo1617l() {
        return this.f1421s;
    }

    /* renamed from: m */
    public final C0439k mo1619m() {
        if (this.f1423u == null) {
            mo1540H();
            int i = this.f1404b;
            if (i >= 4) {
                this.f1423u.mo1804q();
            } else if (i >= 3) {
                this.f1423u.mo1803p();
            } else if (i >= 2) {
                this.f1423u.mo1799o();
            } else if (i >= 1) {
                this.f1423u.mo1798n();
            }
        }
        return this.f1423u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0439k mo1621n() {
        return this.f1423u;
    }

    /* renamed from: o */
    public final C0425f mo1622o() {
        return this.f1426x;
    }

    /* renamed from: p */
    public final boolean mo1626p() {
        return this.f1422t != null && this.f1414l;
    }

    /* renamed from: c */
    public LayoutInflater mo1592c(Bundle bundle) {
        return mo1600e(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LayoutInflater mo1596d(Bundle bundle) {
        this.f1398R = mo1592c(bundle);
        return this.f1398R;
    }

    @Deprecated
    /* renamed from: e */
    public LayoutInflater mo1600e(Bundle bundle) {
        C0438j jVar = this.f1422t;
        if (jVar != null) {
            LayoutInflater b = jVar.mo1682b();
            mo1619m();
            C0582f.m2532a(b, this.f1423u.mo1812x());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public void mo1571a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1388H = true;
        C0438j jVar = this.f1422t;
        Activity f = jVar == null ? null : jVar.mo1712f();
        if (f != null) {
            this.f1388H = false;
            mo1569a(f, attributeSet, bundle);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1569a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1388H = true;
    }

    /* renamed from: a */
    public void mo1570a(Context context) {
        this.f1388H = true;
        C0438j jVar = this.f1422t;
        Activity f = jVar == null ? null : jVar.mo1712f();
        if (f != null) {
            this.f1388H = false;
            mo1568a(f);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1568a(Activity activity) {
        this.f1388H = true;
    }

    /* renamed from: f */
    public void mo1603f(Bundle bundle) {
        this.f1388H = true;
        mo1606g(bundle);
        C0442l lVar = this.f1423u;
        if (lVar != null && !lVar.mo1753a(1)) {
            this.f1423u.mo1798n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1606g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f1423u == null) {
                mo1540H();
            }
            this.f1423u.mo1742a(parcelable, this.f1424v);
            this.f1424v = null;
            this.f1423u.mo1798n();
        }
    }

    /* renamed from: q */
    public View mo1627q() {
        return this.f1390J;
    }

    /* renamed from: h */
    public void mo1609h(Bundle bundle) {
        this.f1388H = true;
    }

    /* renamed from: i */
    public void mo1612i(Bundle bundle) {
        this.f1388H = true;
    }

    /* renamed from: r */
    public void mo1628r() {
        this.f1388H = true;
    }

    /* renamed from: s */
    public void mo1629s() {
        this.f1388H = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1388H = true;
    }

    /* renamed from: a */
    public void mo184a() {
        this.f1388H = true;
    }

    /* renamed from: b */
    public void mo186b() {
        this.f1388H = true;
    }

    public void onLowMemory() {
        this.f1388H = true;
    }

    /* renamed from: t */
    public void mo1630t() {
        this.f1388H = true;
    }

    /* renamed from: c */
    public void mo187c() {
        boolean z = true;
        this.f1388H = true;
        C0432g j = mo1613j();
        if (j == null || !j.isChangingConfigurations()) {
            z = false;
        }
        C0092s sVar = this.f1425w;
        if (sVar != null && !z) {
            sVar.mo219a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1632u() {
        this.f1408f = -1;
        this.f1409g = null;
        this.f1414l = false;
        this.f1415m = false;
        this.f1416n = false;
        this.f1417o = false;
        this.f1418p = false;
        this.f1420r = 0;
        this.f1421s = null;
        this.f1423u = null;
        this.f1422t = null;
        this.f1427y = 0;
        this.f1428z = 0;
        this.f1381A = null;
        this.f1382B = false;
        this.f1383C = false;
        this.f1385E = false;
    }

    /* renamed from: v */
    public void mo1633v() {
        this.f1388H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo1613j().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* renamed from: x */
    public Object mo1635x() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1438g;
    }

    /* renamed from: y */
    public Object mo1636y() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1439h == f1380a ? mo1635x() : this.f1394N.f1439h;
    }

    /* renamed from: z */
    public Object mo1637z() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1440i;
    }

    /* renamed from: A */
    public Object mo1533A() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1441j == f1380a ? mo1637z() : this.f1394N.f1441j;
    }

    /* renamed from: B */
    public Object mo1534B() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1442k;
    }

    /* renamed from: C */
    public Object mo1535C() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1443l == f1380a ? mo1534B() : this.f1394N.f1443l;
    }

    /* renamed from: D */
    public boolean mo1536D() {
        C0429a aVar = this.f1394N;
        if (aVar == null || aVar.f1445n == null) {
            return true;
        }
        return this.f1394N.f1445n.booleanValue();
    }

    /* renamed from: E */
    public boolean mo1537E() {
        C0429a aVar = this.f1394N;
        if (aVar == null || aVar.f1444m == null) {
            return true;
        }
        return this.f1394N.f1444m.booleanValue();
    }

    /* renamed from: F */
    public void mo1538F() {
        C0442l lVar = this.f1421s;
        if (lVar == null || lVar.f1496m == null) {
            m1755ab().f1448q = false;
        } else if (Looper.myLooper() != this.f1421s.f1496m.mo1714h().getLooper()) {
            this.f1421s.f1496m.mo1714h().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    C0425f.this.mo1539G();
                }
            });
        } else {
            mo1539G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo1539G() {
        C0431c cVar;
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            cVar = null;
        } else {
            aVar.f1448q = false;
            cVar = aVar.f1449r;
            this.f1394N.f1449r = null;
        }
        if (cVar != null) {
            cVar.mo1642a();
        }
    }

    /* renamed from: a */
    public void mo1580a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1427y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1428z));
        printWriter.print(" mTag=");
        printWriter.println(this.f1381A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1404b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1408f);
        printWriter.print(" mWho=");
        printWriter.print(this.f1409g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1420r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1414l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1415m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1416n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1417o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1382B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1383C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1387G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1386F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1384D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f1385E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1393M);
        if (this.f1421s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1421s);
        }
        if (this.f1422t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1422t);
        }
        if (this.f1426x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1426x);
        }
        if (this.f1410h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1410h);
        }
        if (this.f1405c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1405c);
        }
        if (this.f1406d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1406d);
        }
        if (this.f1411i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f1411i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1413k);
        }
        if (mo1550R() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo1550R());
        }
        if (this.f1389I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1389I);
        }
        if (this.f1390J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1390J);
        }
        if (this.f1391K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f1390J);
        }
        if (mo1555W() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo1555W());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo1557Y());
        }
        if (mo1608h() != null) {
            C0479t.m2152a(this).mo1489a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f1423u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f1423u + ":");
            C0442l lVar = this.f1423u;
            lVar.mo1719a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0425f mo1559a(String str) {
        if (str.equals(this.f1409g)) {
            return this;
        }
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            return lVar.mo1759b(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1540H() {
        if (this.f1422t != null) {
            this.f1423u = new C0442l();
            this.f1423u.mo1750a(this.f1422t, (C0436h) new C0436h() {
                /* renamed from: a */
                public View mo1640a(int i) {
                    if (C0425f.this.f1390J != null) {
                        return C0425f.this.f1390J.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                /* renamed from: a */
                public boolean mo1641a() {
                    return C0425f.this.f1390J != null;
                }

                /* renamed from: a */
                public C0425f mo1639a(Context context, String str, Bundle bundle) {
                    return C0425f.this.f1422t.mo1639a(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1616k(Bundle bundle) {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
        }
        this.f1404b = 1;
        this.f1388H = false;
        mo1603f(bundle);
        this.f1399S = true;
        if (this.f1388H) {
            this.f1400T.mo192a(C0065d.C0066a.ON_CREATE);
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1587b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
        }
        this.f1419q = true;
        this.f1402V = new C0073g() {
            /* renamed from: d */
            public C0065d mo191d() {
                if (C0425f.this.f1401U == null) {
                    C0425f fVar = C0425f.this;
                    fVar.f1401U = new C0074h(fVar.f1402V);
                }
                return C0425f.this.f1401U;
            }
        };
        this.f1401U = null;
        this.f1390J = mo1560a(layoutInflater, viewGroup, bundle);
        if (this.f1390J != null) {
            this.f1402V.mo191d();
            this.f1403W.mo151a(this.f1402V);
        } else if (this.f1401U == null) {
            this.f1402V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1618l(Bundle bundle) {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
        }
        this.f1404b = 2;
        this.f1388H = false;
        mo1609h(bundle);
        if (this.f1388H) {
            C0442l lVar2 = this.f1423u;
            if (lVar2 != null) {
                lVar2.mo1799o();
                return;
            }
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1541I() {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
            this.f1423u.mo1783g();
        }
        this.f1404b = 3;
        this.f1388H = false;
        mo1628r();
        if (this.f1388H) {
            C0442l lVar2 = this.f1423u;
            if (lVar2 != null) {
                lVar2.mo1803p();
            }
            this.f1400T.mo192a(C0065d.C0066a.ON_START);
            if (this.f1390J != null) {
                this.f1401U.mo192a(C0065d.C0066a.ON_START);
                return;
            }
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo1542J() {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
            this.f1423u.mo1783g();
        }
        this.f1404b = 4;
        this.f1388H = false;
        mo1629s();
        if (this.f1388H) {
            C0442l lVar2 = this.f1423u;
            if (lVar2 != null) {
                lVar2.mo1804q();
                this.f1423u.mo1783g();
            }
            this.f1400T.mo192a(C0065d.C0066a.ON_RESUME);
            if (this.f1390J != null) {
                this.f1401U.mo192a(C0065d.C0066a.ON_RESUME);
                return;
            }
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo1543K() {
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1795m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1598d(boolean z) {
        mo1589b(z);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1752a(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1601e(boolean z) {
        mo1593c(z);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1766b(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1572a(Configuration configuration) {
        onConfigurationChanged(configuration);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1740a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo1544L() {
        onLowMemory();
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1810v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1590b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1382B) {
            return false;
        }
        if (this.f1386F && this.f1387G) {
            mo1577a(menu, menuInflater);
            z = true;
        }
        C0442l lVar = this.f1423u;
        return lVar != null ? z | lVar.mo1755a(menu, menuInflater) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1594c(Menu menu) {
        boolean z = false;
        if (this.f1382B) {
            return false;
        }
        if (this.f1386F && this.f1387G) {
            mo1576a(menu);
            z = true;
        }
        C0442l lVar = this.f1423u;
        return lVar != null ? z | lVar.mo1754a(menu) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1595c(MenuItem menuItem) {
        if (this.f1382B) {
            return false;
        }
        if (this.f1386F && this.f1387G && mo1582a(menuItem)) {
            return true;
        }
        C0442l lVar = this.f1423u;
        if (lVar == null || !lVar.mo1756a(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1599d(MenuItem menuItem) {
        if (this.f1382B) {
            return false;
        }
        if (mo1591b(menuItem)) {
            return true;
        }
        C0442l lVar = this.f1423u;
        if (lVar == null || !lVar.mo1767b(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1597d(Menu menu) {
        if (!this.f1382B) {
            if (this.f1386F && this.f1387G) {
                mo1588b(menu);
            }
            C0442l lVar = this.f1423u;
            if (lVar != null) {
                lVar.mo1765b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1620m(Bundle bundle) {
        Parcelable l;
        mo1614j(bundle);
        C0442l lVar = this.f1423u;
        if (lVar != null && (l = lVar.mo1793l()) != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo1545M() {
        if (this.f1390J != null) {
            this.f1401U.mo192a(C0065d.C0066a.ON_PAUSE);
        }
        this.f1400T.mo192a(C0065d.C0066a.ON_PAUSE);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1805r();
        }
        this.f1404b = 3;
        this.f1388H = false;
        mo184a();
        if (!this.f1388H) {
            throw new C0484x("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo1546N() {
        if (this.f1390J != null) {
            this.f1401U.mo192a(C0065d.C0066a.ON_STOP);
        }
        this.f1400T.mo192a(C0065d.C0066a.ON_STOP);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1806s();
        }
        this.f1404b = 2;
        this.f1388H = false;
        mo186b();
        if (!this.f1388H) {
            throw new C0484x("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo1547O() {
        if (this.f1390J != null) {
            this.f1401U.mo192a(C0065d.C0066a.ON_DESTROY);
        }
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1807t();
        }
        this.f1404b = 1;
        this.f1388H = false;
        mo1630t();
        if (this.f1388H) {
            C0479t.m2152a(this).mo1488a();
            this.f1419q = false;
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1548P() {
        this.f1400T.mo192a(C0065d.C0066a.ON_DESTROY);
        C0442l lVar = this.f1423u;
        if (lVar != null) {
            lVar.mo1809u();
        }
        this.f1404b = 0;
        this.f1388H = false;
        this.f1399S = false;
        mo187c();
        if (this.f1388H) {
            this.f1423u = null;
            return;
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo1549Q() {
        this.f1388H = false;
        mo1633v();
        this.f1398R = null;
        if (this.f1388H) {
            C0442l lVar = this.f1423u;
            if (lVar == null) {
                return;
            }
            if (this.f1385E) {
                lVar.mo1809u();
                this.f1423u = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new C0484x("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1574a(C0431c cVar) {
        m1755ab();
        if (cVar != this.f1394N.f1449r) {
            if (cVar == null || this.f1394N.f1449r == null) {
                if (this.f1394N.f1448q) {
                    this.f1394N.f1449r = cVar;
                }
                if (cVar != null) {
                    cVar.mo1643b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: ab */
    private C0429a m1755ab() {
        if (this.f1394N == null) {
            this.f1394N = new C0429a();
        }
        return this.f1394N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public int mo1550R() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1435d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1562a(int i) {
        if (this.f1394N != null || i != 0) {
            m1755ab().f1435d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo1551S() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1436e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1563a(int i, int i2) {
        if (this.f1394N != null || i != 0 || i2 != 0) {
            m1755ab();
            C0429a aVar = this.f1394N;
            aVar.f1436e = i;
            aVar.f1437f = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public int mo1552T() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1437f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public C0483w mo1553U() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1446o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C0483w mo1554V() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1447p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public View mo1555W() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1432a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1578a(View view) {
        m1755ab().f1432a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1567a(Animator animator) {
        m1755ab().f1433b = animator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public Animator mo1556X() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return null;
        }
        return aVar.f1433b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public int mo1557Y() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1434c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1585b(int i) {
        m1755ab().f1434c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo1558Z() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return false;
        }
        return aVar.f1448q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public boolean mo1583aa() {
        C0429a aVar = this.f1394N;
        if (aVar == null) {
            return false;
        }
        return aVar.f1450s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1604f(boolean z) {
        m1755ab().f1450s = z;
    }

    /* renamed from: android.support.v4.app.f$a */
    static class C0429a {

        /* renamed from: a */
        View f1432a;

        /* renamed from: b */
        Animator f1433b;

        /* renamed from: c */
        int f1434c;

        /* renamed from: d */
        int f1435d;

        /* renamed from: e */
        int f1436e;

        /* renamed from: f */
        int f1437f;

        /* renamed from: g */
        Object f1438g = null;

        /* renamed from: h */
        Object f1439h = C0425f.f1380a;

        /* renamed from: i */
        Object f1440i = null;

        /* renamed from: j */
        Object f1441j = C0425f.f1380a;

        /* renamed from: k */
        Object f1442k = null;

        /* renamed from: l */
        Object f1443l = C0425f.f1380a;

        /* renamed from: m */
        Boolean f1444m;

        /* renamed from: n */
        Boolean f1445n;

        /* renamed from: o */
        C0483w f1446o = null;

        /* renamed from: p */
        C0483w f1447p = null;

        /* renamed from: q */
        boolean f1448q;

        /* renamed from: r */
        C0431c f1449r;

        /* renamed from: s */
        boolean f1450s;

        C0429a() {
        }
    }
}
