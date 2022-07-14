package android.support.p026v4.p036h;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.h.l */
public class C0588l {

    /* renamed from: a */
    private ViewParent f1825a;

    /* renamed from: b */
    private ViewParent f1826b;

    /* renamed from: c */
    private final View f1827c;

    /* renamed from: d */
    private boolean f1828d;

    /* renamed from: e */
    private int[] f1829e;

    public C0588l(View view) {
        this.f1827c = view;
    }

    /* renamed from: a */
    public void mo2273a(boolean z) {
        if (this.f1828d) {
            C0594r.m2621v(this.f1827c);
        }
        this.f1828d = z;
    }

    /* renamed from: a */
    public boolean mo2274a() {
        return this.f1828d;
    }

    /* renamed from: b */
    public boolean mo2283b() {
        return mo2277a(0);
    }

    /* renamed from: a */
    public boolean mo2277a(int i) {
        return m2546d(i) != null;
    }

    /* renamed from: b */
    public boolean mo2284b(int i) {
        return mo2278a(i, 0);
    }

    /* renamed from: a */
    public boolean mo2278a(int i, int i2) {
        if (mo2277a(i2)) {
            return true;
        }
        if (!mo2274a()) {
            return false;
        }
        View view = this.f1827c;
        for (ViewParent parent = this.f1827c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0600u.m2645a(parent, view, this.f1827c, i, i2)) {
                m2545a(i2, parent);
                C0600u.m2646b(parent, view, this.f1827c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo2285c() {
        mo2286c(0);
    }

    /* renamed from: c */
    public void mo2286c(int i) {
        ViewParent d = m2546d(i);
        if (d != null) {
            C0600u.m2640a(d, this.f1827c, i);
            m2545a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public boolean mo2279a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2280a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo2280a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (!mo2274a() || (d = m2546d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1827c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        C0600u.m2641a(d, this.f1827c, i, i2, i3, i4, i5);
        if (iArr2 != null) {
            this.f1827c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2281a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2282a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo2282a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo2274a() || (d = m2546d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1827c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f1829e == null) {
                this.f1829e = new int[2];
            }
            iArr = this.f1829e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0600u.m2642a(d, this.f1827c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f1827c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2276a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo2274a() || (d = m2546d(0)) == null) {
            return false;
        }
        return C0600u.m2644a(d, this.f1827c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo2275a(float f, float f2) {
        ViewParent d;
        if (!mo2274a() || (d = m2546d(0)) == null) {
            return false;
        }
        return C0600u.m2643a(d, this.f1827c, f, f2);
    }

    /* renamed from: d */
    private ViewParent m2546d(int i) {
        switch (i) {
            case 0:
                return this.f1825a;
            case 1:
                return this.f1826b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m2545a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1825a = viewParent;
                return;
            case 1:
                this.f1826b = viewParent;
                return;
            default:
                return;
        }
    }
}
