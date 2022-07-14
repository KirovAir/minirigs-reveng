package android.support.p026v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p026v4.p036h.C0594r;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0613a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f1890r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0614a f1891a = new C0614a();

    /* renamed from: b */
    final View f1892b;

    /* renamed from: c */
    boolean f1893c;

    /* renamed from: d */
    boolean f1894d;

    /* renamed from: e */
    boolean f1895e;

    /* renamed from: f */
    private final Interpolator f1896f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f1897g;

    /* renamed from: h */
    private float[] f1898h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f1899i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f1900j;

    /* renamed from: k */
    private int f1901k;

    /* renamed from: l */
    private float[] f1902l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f1903m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1904n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f1905o;

    /* renamed from: p */
    private boolean f1906p;

    /* renamed from: q */
    private boolean f1907q;

    /* renamed from: a */
    static float m2720a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2723a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract void mo2392a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo2402e(int i);

    /* renamed from: f */
    public abstract boolean mo2403f(int i);

    public C0613a(View view) {
        this.f1892b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = (float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f));
        mo2389a(f, f);
        float f2 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        mo2394b(f2, f2);
        mo2390a(1);
        mo2401e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2399d(0.2f, 0.2f);
        mo2397c(1.0f, 1.0f);
        mo2395b(f1890r);
        mo2398c(500);
        mo2400d(500);
    }

    /* renamed from: a */
    public C0613a mo2391a(boolean z) {
        if (this.f1906p && !z) {
            m2725d();
        }
        this.f1906p = z;
        return this;
    }

    /* renamed from: a */
    public C0613a mo2389a(float f, float f2) {
        float[] fArr = this.f1904n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0613a mo2394b(float f, float f2) {
        float[] fArr = this.f1903m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0613a mo2397c(float f, float f2) {
        float[] fArr = this.f1902l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0613a mo2390a(int i) {
        this.f1900j = i;
        return this;
    }

    /* renamed from: d */
    public C0613a mo2399d(float f, float f2) {
        float[] fArr = this.f1898h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: e */
    public C0613a mo2401e(float f, float f2) {
        float[] fArr = this.f1899i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: b */
    public C0613a mo2395b(int i) {
        this.f1901k = i;
        return this;
    }

    /* renamed from: c */
    public C0613a mo2398c(int i) {
        this.f1891a.mo2407a(i);
        return this;
    }

    /* renamed from: d */
    public C0613a mo2400d(int i) {
        this.f1891a.mo2409b(i);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1906p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1894d = true;
                this.f1905o = false;
                break;
            case 1:
            case 3:
                m2725d();
                break;
            case 2:
                break;
        }
        this.f1891a.mo2406a(m2722a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1892b.getWidth()), m2722a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1892b.getHeight()));
        if (!this.f1895e && mo2393a()) {
            m2724c();
        }
        if (!this.f1907q || !this.f1895e) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2393a() {
        C0614a aVar = this.f1891a;
        int f = aVar.mo2413f();
        int e = aVar.mo2412e();
        return (f != 0 && mo2403f(f)) || (e != 0 && mo2402e(e));
    }

    /* renamed from: c */
    private void m2724c() {
        int i;
        if (this.f1897g == null) {
            this.f1897g = new C0615b();
        }
        this.f1895e = true;
        this.f1893c = true;
        if (this.f1905o || (i = this.f1901k) <= 0) {
            this.f1897g.run();
        } else {
            C0594r.m2588a(this.f1892b, this.f1897g, (long) i);
        }
        this.f1905o = true;
    }

    /* renamed from: d */
    private void m2725d() {
        if (this.f1893c) {
            this.f1895e = false;
        } else {
            this.f1891a.mo2408b();
        }
    }

    /* renamed from: a */
    private float m2722a(int i, float f, float f2, float f3) {
        float a = m2721a(this.f1898h[i], f2, this.f1899i[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f1902l[i];
        float f5 = this.f1903m[i];
        float f6 = this.f1904n[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m2720a(a * f7, f5, f6);
        }
        return -m2720a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m2721a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2720a(f * f2, 0.0f, f3);
        float f6 = m2726f(f2 - f4, a) - m2726f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1896f.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1896f.getInterpolation(f6);
        }
        return m2720a(f5, -1.0f, 1.0f);
    }

    /* renamed from: f */
    private float m2726f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1900j;
        switch (i) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    return (!this.f1895e || i != 1) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2396b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1892b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0615b implements Runnable {
        C0615b() {
        }

        public void run() {
            if (C0613a.this.f1895e) {
                if (C0613a.this.f1893c) {
                    C0613a aVar = C0613a.this;
                    aVar.f1893c = false;
                    aVar.f1891a.mo2405a();
                }
                C0614a aVar2 = C0613a.this.f1891a;
                if (aVar2.mo2410c() || !C0613a.this.mo2393a()) {
                    C0613a.this.f1895e = false;
                    return;
                }
                if (C0613a.this.f1894d) {
                    C0613a aVar3 = C0613a.this;
                    aVar3.f1894d = false;
                    aVar3.mo2396b();
                }
                aVar2.mo2411d();
                C0613a.this.mo2392a(aVar2.mo2414g(), aVar2.mo2415h());
                C0594r.m2587a(C0613a.this.f1892b, (Runnable) this);
            }
        }
    }

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0614a {

        /* renamed from: a */
        private int f1908a;

        /* renamed from: b */
        private int f1909b;

        /* renamed from: c */
        private float f1910c;

        /* renamed from: d */
        private float f1911d;

        /* renamed from: e */
        private long f1912e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1913f = 0;

        /* renamed from: g */
        private int f1914g = 0;

        /* renamed from: h */
        private int f1915h = 0;

        /* renamed from: i */
        private long f1916i = -1;

        /* renamed from: j */
        private float f1917j;

        /* renamed from: k */
        private int f1918k;

        /* renamed from: a */
        private float m2742a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        C0614a() {
        }

        /* renamed from: a */
        public void mo2407a(int i) {
            this.f1908a = i;
        }

        /* renamed from: b */
        public void mo2409b(int i) {
            this.f1909b = i;
        }

        /* renamed from: a */
        public void mo2405a() {
            this.f1912e = AnimationUtils.currentAnimationTimeMillis();
            this.f1916i = -1;
            this.f1913f = this.f1912e;
            this.f1917j = 0.5f;
            this.f1914g = 0;
            this.f1915h = 0;
        }

        /* renamed from: b */
        public void mo2408b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1918k = C0613a.m2723a((int) (currentAnimationTimeMillis - this.f1912e), 0, this.f1909b);
            this.f1917j = m2743a(currentAnimationTimeMillis);
            this.f1916i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean mo2410c() {
            return this.f1916i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1916i + ((long) this.f1918k);
        }

        /* renamed from: a */
        private float m2743a(long j) {
            if (j < this.f1912e) {
                return 0.0f;
            }
            long j2 = this.f1916i;
            if (j2 < 0 || j < j2) {
                return C0613a.m2720a(((float) (j - this.f1912e)) / ((float) this.f1908a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1917j;
            return (1.0f - f) + (f * C0613a.m2720a(((float) j3) / ((float) this.f1918k), 0.0f, 1.0f));
        }

        /* renamed from: d */
        public void mo2411d() {
            if (this.f1913f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2742a(m2743a(currentAnimationTimeMillis));
                this.f1913f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f1913f)) * a;
                this.f1914g = (int) (this.f1910c * f);
                this.f1915h = (int) (f * this.f1911d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2406a(float f, float f2) {
            this.f1910c = f;
            this.f1911d = f2;
        }

        /* renamed from: e */
        public int mo2412e() {
            float f = this.f1910c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo2413f() {
            float f = this.f1911d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public int mo2414g() {
            return this.f1914g;
        }

        /* renamed from: h */
        public int mo2415h() {
            return this.f1915h;
        }
    }
}
