package android.support.p026v4.p036h;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: android.support.v4.h.z */
public class C0608z {

    /* renamed from: a */
    private final Object f1860a;

    private C0608z(Object obj) {
        this.f1860a = obj;
    }

    /* renamed from: a */
    public int mo2313a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1860a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2315b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1860a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2316c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1860a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2317d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1860a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo2318e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1860a).isConsumed();
        }
        return false;
    }

    /* renamed from: a */
    public C0608z mo2314a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0608z(((WindowInsets) this.f1860a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0608z zVar = (C0608z) obj;
        Object obj2 = this.f1860a;
        if (obj2 != null) {
            return obj2.equals(zVar.f1860a);
        }
        if (zVar.f1860a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f1860a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    static C0608z m2668a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0608z(obj);
    }

    /* renamed from: a */
    static Object m2669a(C0608z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar.f1860a;
    }
}
