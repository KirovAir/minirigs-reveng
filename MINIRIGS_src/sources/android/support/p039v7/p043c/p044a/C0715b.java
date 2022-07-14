package android.support.p039v7.p043c.p044a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.support.p026v4.graphics.drawable.C0540a;
import android.util.SparseArray;

/* renamed from: android.support.v7.c.a.b */
class C0715b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private C0718b f2289a;

    /* renamed from: b */
    private Rect f2290b;

    /* renamed from: c */
    private Drawable f2291c;

    /* renamed from: d */
    private Drawable f2292d;

    /* renamed from: e */
    private int f2293e = 255;

    /* renamed from: f */
    private boolean f2294f;

    /* renamed from: g */
    private int f2295g = -1;

    /* renamed from: h */
    private int f2296h = -1;

    /* renamed from: i */
    private boolean f2297i;

    /* renamed from: j */
    private Runnable f2298j;

    /* renamed from: k */
    private long f2299k;

    /* renamed from: l */
    private long f2300l;

    /* renamed from: m */
    private C0717a f2301m;

    C0715b() {
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2292d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2289a.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: a */
    private boolean mo2710a() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect e = this.f2289a.mo2790e();
        if (e != null) {
            rect.set(e);
            z = (e.right | ((e.left | e.top) | e.bottom)) != 0;
        } else {
            Drawable drawable = this.f2291c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (mo2710a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
        if (!this.f2294f || this.f2293e != i) {
            this.f2294f = true;
            this.f2293e = i;
            Drawable drawable = this.f2291c;
            if (drawable == null) {
                return;
            }
            if (this.f2299k == 0) {
                drawable.setAlpha(i);
            } else {
                mo2765a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f2293e;
    }

    public void setDither(boolean z) {
        if (this.f2289a.f2338z != z) {
            C0718b bVar = this.f2289a;
            bVar.f2338z = z;
            Drawable drawable = this.f2291c;
            if (drawable != null) {
                drawable.setDither(bVar.f2338z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0718b bVar = this.f2289a;
        bVar.f2310G = true;
        if (bVar.f2309F != colorFilter) {
            this.f2289a.f2309F = colorFilter;
            Drawable drawable = this.f2291c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0718b bVar = this.f2289a;
        bVar.f2313J = true;
        if (bVar.f2311H != colorStateList) {
            this.f2289a.f2311H = colorStateList;
            C0540a.m2379a(this.f2291c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0718b bVar = this.f2289a;
        bVar.f2314K = true;
        if (bVar.f2312I != mode) {
            this.f2289a.f2312I = mode;
            C0540a.m2382a(this.f2291c, mode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2292d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2291c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean isStateful() {
        return this.f2289a.mo2800m();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f2289a.f2308E != z) {
            C0718b bVar = this.f2289a;
            bVar.f2308E = z;
            Drawable drawable = this.f2291c;
            if (drawable != null) {
                C0540a.m2383a(drawable, bVar.f2308E);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f2289a.f2308E;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2292d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2292d = null;
            this.f2296h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2291c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2294f) {
                this.f2291c.setAlpha(this.f2293e);
            }
        }
        if (this.f2300l != 0) {
            this.f2300l = 0;
            z = true;
        }
        if (this.f2299k != 0) {
            this.f2299k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            C0540a.m2376a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2290b;
        if (rect == null) {
            this.f2290b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            C0540a.m2378a(drawable, i, i2, i3, i4);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2290b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2292d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2291c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2292d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f2291c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f2289a.mo2789d(i, mo2767d());
    }

    public int getIntrinsicWidth() {
        if (this.f2289a.mo2792f()) {
            return this.f2289a.mo2793g();
        }
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f2289a.mo2792f()) {
            return this.f2289a.mo2795h();
        }
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f2289a.mo2792f()) {
            return this.f2289a.mo2796i();
        }
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f2289a.mo2792f()) {
            return this.f2289a.mo2797j();
        }
        Drawable drawable = this.f2291c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0718b bVar = this.f2289a;
        if (bVar != null) {
            bVar.mo2782b();
        }
        if (drawable == this.f2291c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f2291c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2291c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2292d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2291c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public int getOpacity() {
        Drawable drawable = this.f2291c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2289a.mo2799l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2767d() {
        return this.f2295g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2766a(int i) {
        if (i == this.f2295g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f2289a.f2307D > 0) {
            Drawable drawable = this.f2292d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f2291c;
            if (drawable2 != null) {
                this.f2292d = drawable2;
                this.f2296h = this.f2295g;
                this.f2300l = ((long) this.f2289a.f2307D) + uptimeMillis;
            } else {
                this.f2292d = null;
                this.f2296h = -1;
                this.f2300l = 0;
            }
        } else {
            Drawable drawable3 = this.f2291c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.f2289a.f2322j) {
            this.f2291c = null;
            this.f2295g = -1;
        } else {
            Drawable b = this.f2289a.mo2781b(i);
            this.f2291c = b;
            this.f2295g = i;
            if (b != null) {
                if (this.f2289a.f2306C > 0) {
                    this.f2299k = uptimeMillis + ((long) this.f2289a.f2306C);
                }
                m3208a(b);
            }
        }
        if (!(this.f2299k == 0 && this.f2300l == 0)) {
            Runnable runnable = this.f2298j;
            if (runnable == null) {
                this.f2298j = new Runnable() {
                    public void run() {
                        C0715b.this.mo2765a(true);
                        C0715b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            mo2765a(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    private void m3208a(Drawable drawable) {
        if (this.f2301m == null) {
            this.f2301m = new C0717a();
        }
        drawable.setCallback(this.f2301m.mo2773a(drawable.getCallback()));
        try {
            if (this.f2289a.f2306C <= 0 && this.f2294f) {
                drawable.setAlpha(this.f2293e);
            }
            if (this.f2289a.f2310G) {
                drawable.setColorFilter(this.f2289a.f2309F);
            } else {
                if (this.f2289a.f2313J) {
                    C0540a.m2379a(drawable, this.f2289a.f2311H);
                }
                if (this.f2289a.f2314K) {
                    C0540a.m2382a(drawable, this.f2289a.f2312I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2289a.f2338z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f2289a.f2308E);
            }
            Rect rect = this.f2290b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2301m.mo2772a());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2765a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2294f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2291c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003a
            long r9 = r13.f2299k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003c
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f2293e
            r3.setAlpha(r9)
            r13.f2299k = r7
            goto L_0x003c
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            android.support.v7.c.a.b$b r9 = r13.f2289a
            int r9 = r9.f2306C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.f2291c
            int r3 = 255 - r3
            int r10 = r13.f2293e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x003d
        L_0x003a:
            r13.f2299k = r7
        L_0x003c:
            r3 = 0
        L_0x003d:
            android.graphics.drawable.Drawable r9 = r13.f2292d
            if (r9 == 0) goto L_0x006c
            long r10 = r13.f2300l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x006e
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0057
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2292d = r0
            r0 = -1
            r13.f2296h = r0
            r13.f2300l = r7
            goto L_0x006e
        L_0x0057:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            android.support.v7.c.a.b$b r4 = r13.f2289a
            int r4 = r4.f2307D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.f2292d
            int r5 = r13.f2293e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x006f
        L_0x006c:
            r13.f2300l = r7
        L_0x006e:
            r0 = r3
        L_0x006f:
            if (r14 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            java.lang.Runnable r14 = r13.f2298j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.p043c.p044a.C0715b.mo2765a(boolean):void");
    }

    public Drawable getCurrent() {
        return this.f2291c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2764a(Resources resources) {
        this.f2289a.mo2779a(resources);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f2289a.mo2778a(theme);
    }

    public boolean canApplyTheme() {
        return this.f2289a.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f2289a.mo2801n()) {
            return null;
        }
        this.f2289a.f2318f = getChangingConfigurations();
        return this.f2289a;
    }

    public Drawable mutate() {
        if (!this.f2297i && super.mutate() == this) {
            C0718b c = mo2715c();
            c.mo2754a();
            mo2711a(c);
            this.f2297i = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0718b mo2715c() {
        return this.f2289a;
    }

    /* renamed from: android.support.v7.c.a.b$b */
    static abstract class C0718b extends Drawable.ConstantState {

        /* renamed from: A */
        boolean f2304A;

        /* renamed from: B */
        int f2305B;

        /* renamed from: C */
        int f2306C;

        /* renamed from: D */
        int f2307D;

        /* renamed from: E */
        boolean f2308E;

        /* renamed from: F */
        ColorFilter f2309F;

        /* renamed from: G */
        boolean f2310G;

        /* renamed from: H */
        ColorStateList f2311H;

        /* renamed from: I */
        PorterDuff.Mode f2312I;

        /* renamed from: J */
        boolean f2313J;

        /* renamed from: K */
        boolean f2314K;

        /* renamed from: c */
        final C0715b f2315c;

        /* renamed from: d */
        Resources f2316d;

        /* renamed from: e */
        int f2317e = 160;

        /* renamed from: f */
        int f2318f;

        /* renamed from: g */
        int f2319g;

        /* renamed from: h */
        SparseArray<Drawable.ConstantState> f2320h;

        /* renamed from: i */
        Drawable[] f2321i;

        /* renamed from: j */
        int f2322j;

        /* renamed from: k */
        boolean f2323k;

        /* renamed from: l */
        boolean f2324l;

        /* renamed from: m */
        Rect f2325m;

        /* renamed from: n */
        boolean f2326n;

        /* renamed from: o */
        boolean f2327o;

        /* renamed from: p */
        int f2328p;

        /* renamed from: q */
        int f2329q;

        /* renamed from: r */
        int f2330r;

        /* renamed from: s */
        int f2331s;

        /* renamed from: t */
        boolean f2332t;

        /* renamed from: u */
        int f2333u;

        /* renamed from: v */
        boolean f2334v;

        /* renamed from: w */
        boolean f2335w;

        /* renamed from: x */
        boolean f2336x;

        /* renamed from: y */
        boolean f2337y;

        /* renamed from: z */
        boolean f2338z;

        C0718b(C0718b bVar, C0715b bVar2, Resources resources) {
            Resources resources2;
            this.f2323k = false;
            this.f2326n = false;
            this.f2338z = true;
            this.f2306C = 0;
            this.f2307D = 0;
            this.f2315c = bVar2;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = bVar != null ? bVar.f2316d : null;
            }
            this.f2316d = resources2;
            this.f2317e = C0715b.m3207a(resources, bVar != null ? bVar.f2317e : 0);
            if (bVar != null) {
                this.f2318f = bVar.f2318f;
                this.f2319g = bVar.f2319g;
                this.f2336x = true;
                this.f2337y = true;
                this.f2323k = bVar.f2323k;
                this.f2326n = bVar.f2326n;
                this.f2338z = bVar.f2338z;
                this.f2304A = bVar.f2304A;
                this.f2305B = bVar.f2305B;
                this.f2306C = bVar.f2306C;
                this.f2307D = bVar.f2307D;
                this.f2308E = bVar.f2308E;
                this.f2309F = bVar.f2309F;
                this.f2310G = bVar.f2310G;
                this.f2311H = bVar.f2311H;
                this.f2312I = bVar.f2312I;
                this.f2313J = bVar.f2313J;
                this.f2314K = bVar.f2314K;
                if (bVar.f2317e == this.f2317e) {
                    if (bVar.f2324l) {
                        this.f2325m = new Rect(bVar.f2325m);
                        this.f2324l = true;
                    }
                    if (bVar.f2327o) {
                        this.f2328p = bVar.f2328p;
                        this.f2329q = bVar.f2329q;
                        this.f2330r = bVar.f2330r;
                        this.f2331s = bVar.f2331s;
                        this.f2327o = true;
                    }
                }
                if (bVar.f2332t) {
                    this.f2333u = bVar.f2333u;
                    this.f2332t = true;
                }
                if (bVar.f2334v) {
                    this.f2335w = bVar.f2335w;
                    this.f2334v = true;
                }
                Drawable[] drawableArr = bVar.f2321i;
                this.f2321i = new Drawable[drawableArr.length];
                this.f2322j = bVar.f2322j;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f2320h;
                if (sparseArray != null) {
                    this.f2320h = sparseArray.clone();
                } else {
                    this.f2320h = new SparseArray<>(this.f2322j);
                }
                int i = this.f2322j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f2320h.put(i2, constantState);
                        } else {
                            this.f2321i[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f2321i = new Drawable[10];
            this.f2322j = 0;
        }

        public int getChangingConfigurations() {
            return this.f2318f | this.f2319g;
        }

        /* renamed from: a */
        public final int mo2777a(Drawable drawable) {
            int i = this.f2322j;
            if (i >= this.f2321i.length) {
                mo2791e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2315c);
            this.f2321i[i] = drawable;
            this.f2322j++;
            this.f2319g = drawable.getChangingConfigurations() | this.f2319g;
            mo2782b();
            this.f2325m = null;
            this.f2324l = false;
            this.f2327o = false;
            this.f2336x = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2782b() {
            this.f2332t = false;
            this.f2334v = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo2784c() {
            return this.f2321i.length;
        }

        /* renamed from: o */
        private void m3219o() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2320h;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f2321i[this.f2320h.keyAt(i)] = m3218b(this.f2320h.valueAt(i).newDrawable(this.f2316d));
                }
                this.f2320h = null;
            }
        }

        /* renamed from: b */
        private Drawable m3218b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f2305B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2315c);
            return mutate;
        }

        /* renamed from: d */
        public final int mo2787d() {
            return this.f2322j;
        }

        /* renamed from: b */
        public final Drawable mo2781b(int i) {
            int indexOfKey;
            Drawable drawable = this.f2321i[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2320h;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m3218b(this.f2320h.valueAt(indexOfKey).newDrawable(this.f2316d));
            this.f2321i[i] = b;
            this.f2320h.removeAt(indexOfKey);
            if (this.f2320h.size() == 0) {
                this.f2320h = null;
            }
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo2789d(int i, int i2) {
            int i3 = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f2305B = i;
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2779a(Resources resources) {
            if (resources != null) {
                this.f2316d = resources;
                int a = C0715b.m3207a(resources, this.f2317e);
                int i = this.f2317e;
                this.f2317e = a;
                if (i != a) {
                    this.f2327o = false;
                    this.f2324l = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2778a(Resources.Theme theme) {
            if (theme != null) {
                m3219o();
                int i = this.f2322j;
                Drawable[] drawableArr = this.f2321i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f2319g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo2779a(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2320h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2754a() {
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f2304A = true;
        }

        /* renamed from: a */
        public final void mo2780a(boolean z) {
            this.f2323k = z;
        }

        /* renamed from: e */
        public final Rect mo2790e() {
            if (this.f2323k) {
                return null;
            }
            if (this.f2325m != null || this.f2324l) {
                return this.f2325m;
            }
            m3219o();
            Rect rect = new Rect();
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.f2324l = true;
            this.f2325m = rect2;
            return rect2;
        }

        /* renamed from: b */
        public final void mo2783b(boolean z) {
            this.f2326n = z;
        }

        /* renamed from: f */
        public final boolean mo2792f() {
            return this.f2326n;
        }

        /* renamed from: g */
        public final int mo2793g() {
            if (!this.f2327o) {
                mo2798k();
            }
            return this.f2328p;
        }

        /* renamed from: h */
        public final int mo2795h() {
            if (!this.f2327o) {
                mo2798k();
            }
            return this.f2329q;
        }

        /* renamed from: i */
        public final int mo2796i() {
            if (!this.f2327o) {
                mo2798k();
            }
            return this.f2330r;
        }

        /* renamed from: j */
        public final int mo2797j() {
            if (!this.f2327o) {
                mo2798k();
            }
            return this.f2331s;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo2798k() {
            this.f2327o = true;
            m3219o();
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            this.f2329q = -1;
            this.f2328p = -1;
            this.f2331s = 0;
            this.f2330r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2328p) {
                    this.f2328p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2329q) {
                    this.f2329q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2330r) {
                    this.f2330r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2331s) {
                    this.f2331s = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo2785c(int i) {
            this.f2306C = i;
        }

        /* renamed from: d */
        public final void mo2788d(int i) {
            this.f2307D = i;
        }

        /* renamed from: l */
        public final int mo2799l() {
            if (this.f2332t) {
                return this.f2333u;
            }
            m3219o();
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f2333u = opacity;
            this.f2332t = true;
            return opacity;
        }

        /* renamed from: m */
        public final boolean mo2800m() {
            if (this.f2334v) {
                return this.f2335w;
            }
            m3219o();
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f2335w = z;
            this.f2334v = true;
            return z;
        }

        /* renamed from: e */
        public void mo2791e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f2321i, 0, drawableArr, 0, i);
            this.f2321i = drawableArr;
        }

        /* renamed from: n */
        public synchronized boolean mo2801n() {
            if (this.f2336x) {
                return this.f2337y;
            }
            m3219o();
            this.f2336x = true;
            int i = this.f2322j;
            Drawable[] drawableArr = this.f2321i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f2337y = false;
                    return false;
                }
            }
            this.f2337y = true;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2711a(C0718b bVar) {
        this.f2289a = bVar;
        int i = this.f2295g;
        if (i >= 0) {
            this.f2291c = bVar.mo2781b(i);
            Drawable drawable = this.f2291c;
            if (drawable != null) {
                m3208a(drawable);
            }
        }
        this.f2296h = -1;
        this.f2292d = null;
    }

    /* renamed from: android.support.v7.c.a.b$a */
    static class C0717a implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f2303a;

        public void invalidateDrawable(Drawable drawable) {
        }

        C0717a() {
        }

        /* renamed from: a */
        public C0717a mo2773a(Drawable.Callback callback) {
            this.f2303a = callback;
            return this;
        }

        /* renamed from: a */
        public Drawable.Callback mo2772a() {
            Drawable.Callback callback = this.f2303a;
            this.f2303a = null;
            return callback;
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2303a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2303a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: a */
    static int m3207a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
