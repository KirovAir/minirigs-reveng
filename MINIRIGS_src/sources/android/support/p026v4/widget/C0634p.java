package android.support.p026v4.widget;

import android.content.Context;
import android.support.p026v4.p036h.C0594r;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.p */
public class C0634p {

    /* renamed from: v */
    private static final Interpolator f1953v = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f1954a;

    /* renamed from: b */
    private int f1955b;

    /* renamed from: c */
    private int f1956c = -1;

    /* renamed from: d */
    private float[] f1957d;

    /* renamed from: e */
    private float[] f1958e;

    /* renamed from: f */
    private float[] f1959f;

    /* renamed from: g */
    private float[] f1960g;

    /* renamed from: h */
    private int[] f1961h;

    /* renamed from: i */
    private int[] f1962i;

    /* renamed from: j */
    private int[] f1963j;

    /* renamed from: k */
    private int f1964k;

    /* renamed from: l */
    private VelocityTracker f1965l;

    /* renamed from: m */
    private float f1966m;

    /* renamed from: n */
    private float f1967n;

    /* renamed from: o */
    private int f1968o;

    /* renamed from: p */
    private int f1969p;

    /* renamed from: q */
    private OverScroller f1970q;

    /* renamed from: r */
    private final C0637a f1971r;

    /* renamed from: s */
    private View f1972s;

    /* renamed from: t */
    private boolean f1973t;

    /* renamed from: u */
    private final ViewGroup f1974u;

    /* renamed from: w */
    private final Runnable f1975w = new Runnable() {
        public void run() {
            C0634p.this.mo2463b(0);
        }
    };

    /* renamed from: android.support.v4.widget.p$a */
    public static abstract class C0637a {
        /* renamed from: a */
        public int mo1141a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo1142a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo1143a(int i) {
        }

        /* renamed from: a */
        public void mo2471a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo1144a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1145a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo1146a(View view, int i);

        /* renamed from: b */
        public int mo1346b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo1147b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo2472b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo1347b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo2473b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo2474c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public static C0634p m2821a(ViewGroup viewGroup, C0637a aVar) {
        return new C0634p(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    public static C0634p m2820a(ViewGroup viewGroup, float f, C0637a aVar) {
        C0634p a = m2821a(viewGroup, aVar);
        a.f1955b = (int) (((float) a.f1955b) * (1.0f / f));
        return a;
    }

    private C0634p(Context context, ViewGroup viewGroup, C0637a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f1974u = viewGroup;
            this.f1971r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1968o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1955b = viewConfiguration.getScaledTouchSlop();
            this.f1966m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1967n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1970q = new OverScroller(context, f1953v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public void mo2456a(View view, int i) {
        if (view.getParent() == this.f1974u) {
            this.f1972s = view;
            this.f1956c = i;
            this.f1971r.mo1347b(view, i);
            mo2463b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1974u + ")");
    }

    /* renamed from: a */
    public int mo2455a() {
        return this.f1955b;
    }

    /* renamed from: b */
    public void mo2462b() {
        this.f1956c = -1;
        m2830c();
        VelocityTracker velocityTracker = this.f1965l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1965l = null;
        }
    }

    /* renamed from: a */
    public boolean mo2460a(View view, int i, int i2) {
        this.f1972s = view;
        this.f1956c = -1;
        boolean a = m2825a(i, i2, 0, 0);
        if (!a && this.f1954a == 0 && this.f1972s != null) {
            this.f1972s = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2458a(int i, int i2) {
        if (this.f1973t) {
            return m2825a(i, i2, (int) this.f1965l.getXVelocity(this.f1956c), (int) this.f1965l.getYVelocity(this.f1956c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m2825a(int i, int i2, int i3, int i4) {
        int left = this.f1972s.getLeft();
        int top = this.f1972s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1970q.abortAnimation();
            mo2463b(0);
            return false;
        }
        this.f1970q.startScroll(left, top, i5, i6, m2819a(this.f1972s, i5, i6, i3, i4));
        mo2463b(2);
        return true;
    }

    /* renamed from: a */
    private int m2819a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m2827b(i3, (int) this.f1967n, (int) this.f1966m);
        int b2 = m2827b(i4, (int) this.f1967n, (int) this.f1966m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (b2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m2818a(i, b, this.f1971r.mo1346b(view))) * f5) + (((float) m2818a(i2, b2, this.f1971r.mo1141a(view))) * f6));
    }

    /* renamed from: a */
    private int m2818a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f1974u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m2816a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    private int m2827b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: a */
    private float m2817a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: a */
    private float m2816a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    public boolean mo2461a(boolean z) {
        if (this.f1954a == 2) {
            boolean computeScrollOffset = this.f1970q.computeScrollOffset();
            int currX = this.f1970q.getCurrX();
            int currY = this.f1970q.getCurrY();
            int left = currX - this.f1972s.getLeft();
            int top = currY - this.f1972s.getTop();
            if (left != 0) {
                C0594r.m2603f(this.f1972s, left);
            }
            if (top != 0) {
                C0594r.m2601e(this.f1972s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1971r.mo1145a(this.f1972s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1970q.getFinalX() && currY == this.f1970q.getFinalY()) {
                this.f1970q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1974u.post(this.f1975w);
                } else {
                    mo2463b(0);
                }
            }
        }
        if (this.f1954a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m2822a(float f, float f2) {
        this.f1973t = true;
        this.f1971r.mo1144a(this.f1972s, f, f2);
        this.f1973t = false;
        if (this.f1954a == 1) {
            mo2463b(0);
        }
    }

    /* renamed from: c */
    private void m2830c() {
        float[] fArr = this.f1957d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1958e, 0.0f);
            Arrays.fill(this.f1959f, 0.0f);
            Arrays.fill(this.f1960g, 0.0f);
            Arrays.fill(this.f1961h, 0);
            Arrays.fill(this.f1962i, 0);
            Arrays.fill(this.f1963j, 0);
            this.f1964k = 0;
        }
    }

    /* renamed from: c */
    private void m2831c(int i) {
        if (this.f1957d != null && mo2457a(i)) {
            this.f1957d[i] = 0.0f;
            this.f1958e[i] = 0.0f;
            this.f1959f[i] = 0.0f;
            this.f1960g[i] = 0.0f;
            this.f1961h[i] = 0;
            this.f1962i[i] = 0;
            this.f1963j[i] = 0;
            this.f1964k = (~(1 << i)) & this.f1964k;
        }
    }

    /* renamed from: d */
    private void m2835d(int i) {
        float[] fArr = this.f1957d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f1957d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f1958e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1959f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1960g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1961h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1962i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1963j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1957d = fArr2;
            this.f1958e = fArr3;
            this.f1959f = fArr4;
            this.f1960g = fArr5;
            this.f1961h = iArr;
            this.f1962i = iArr2;
            this.f1963j = iArr3;
        }
    }

    /* renamed from: a */
    private void m2823a(float f, float f2, int i) {
        m2835d(i);
        float[] fArr = this.f1957d;
        this.f1959f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1958e;
        this.f1960g[i] = f2;
        fArr2[i] = f2;
        this.f1961h[i] = m2833d((int) f, (int) f2);
        this.f1964k |= 1 << i;
    }

    /* renamed from: c */
    private void m2832c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2836e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1959f[pointerId] = x;
                this.f1960g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public boolean mo2457a(int i) {
        return ((1 << i) & this.f1964k) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2463b(int i) {
        this.f1974u.removeCallbacks(this.f1975w);
        if (this.f1954a != i) {
            this.f1954a = i;
            this.f1971r.mo1143a(i);
            if (this.f1954a == 0) {
                this.f1972s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2466b(View view, int i) {
        if (view == this.f1972s && this.f1956c == i) {
            return true;
        }
        if (view == null || !this.f1971r.mo1146a(view, i)) {
            return false;
        }
        this.f1956c = i;
        mo2456a(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r12 != r11) goto L_0x00e2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2459a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo2462b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1965l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1965l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1965l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00fd;
                case 2: goto L_0x006b;
                case 3: goto L_0x00fd;
                case 4: goto L_0x0025;
                case 5: goto L_0x0032;
                case 6: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            r5 = 0
            goto L_0x0133
        L_0x0028:
            int r1 = r1.getPointerId(r3)
            r0.m2831c((int) r1)
            r5 = 0
            goto L_0x0133
        L_0x0032:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m2823a((float) r7, (float) r1, (int) r2)
            int r3 = r0.f1954a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.f1961h
            r1 = r1[r2]
            int r3 = r0.f1969p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0068
            android.support.v4.widget.p$a r4 = r0.f1971r
            r1 = r1 & r3
            r4.mo2471a((int) r1, (int) r2)
            goto L_0x0068
        L_0x0056:
            if (r3 != r4) goto L_0x0068
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo2468c(r3, r1)
            android.view.View r3 = r0.f1972s
            if (r1 != r3) goto L_0x0065
            r0.mo2466b((android.view.View) r1, (int) r2)
        L_0x0065:
            r5 = 0
            goto L_0x0133
        L_0x0068:
            r5 = 0
            goto L_0x0133
        L_0x006b:
            float[] r2 = r0.f1957d
            if (r2 == 0) goto L_0x00fb
            float[] r2 = r0.f1958e
            if (r2 != 0) goto L_0x0075
            goto L_0x00fb
        L_0x0075:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007a:
            if (r3 >= r2) goto L_0x00f6
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m2836e(r4)
            if (r7 != 0) goto L_0x0088
            goto L_0x00f3
        L_0x0088:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1957d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1958e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo2468c(r7, r8)
            if (r7 == 0) goto L_0x00ac
            boolean r8 = r0.m2826a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00ac
            r8 = 1
            goto L_0x00ad
        L_0x00ac:
            r8 = 0
        L_0x00ad:
            if (r8 == 0) goto L_0x00e2
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.p$a r14 = r0.f1971r
            int r12 = r14.mo1147b(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.p$a r5 = r0.f1971r
            int r5 = r5.mo1142a((android.view.View) r7, (int) r15, (int) r14)
            android.support.v4.widget.p$a r14 = r0.f1971r
            int r14 = r14.mo1346b((android.view.View) r7)
            android.support.v4.widget.p$a r15 = r0.f1971r
            int r15 = r15.mo1141a((android.view.View) r7)
            if (r14 == 0) goto L_0x00db
            if (r14 <= 0) goto L_0x00e2
            if (r12 != r11) goto L_0x00e2
        L_0x00db:
            if (r15 == 0) goto L_0x00f6
            if (r15 <= 0) goto L_0x00e2
            if (r5 != r13) goto L_0x00e2
            goto L_0x00f6
        L_0x00e2:
            r0.m2828b((float) r9, (float) r10, (int) r4)
            int r5 = r0.f1954a
            if (r5 != r6) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            if (r8 == 0) goto L_0x00f3
            boolean r4 = r0.mo2466b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            int r3 = r3 + 1
            goto L_0x007a
        L_0x00f6:
            r16.m2832c((android.view.MotionEvent) r17)
            r5 = 0
            goto L_0x0133
        L_0x00fb:
            r5 = 0
            goto L_0x0133
        L_0x00fd:
            r16.mo2462b()
            r5 = 0
            goto L_0x0133
        L_0x0102:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m2823a((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo2468c(r2, r3)
            android.view.View r3 = r0.f1972s
            if (r2 != r3) goto L_0x0123
            int r3 = r0.f1954a
            if (r3 != r4) goto L_0x0123
            r0.mo2466b((android.view.View) r2, (int) r1)
        L_0x0123:
            int[] r2 = r0.f1961h
            r2 = r2[r1]
            int r3 = r0.f1969p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0133
            android.support.v4.widget.p$a r4 = r0.f1971r
            r2 = r2 & r3
            r4.mo2471a((int) r2, (int) r1)
        L_0x0133:
            int r1 = r0.f1954a
            if (r1 != r6) goto L_0x0138
            r5 = 1
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.widget.C0634p.mo2459a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public void mo2464b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo2462b();
        }
        if (this.f1965l == null) {
            this.f1965l = VelocityTracker.obtain();
        }
        this.f1965l.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View c = mo2468c((int) x, (int) y);
                m2823a(x, y, pointerId);
                mo2466b(c, pointerId);
                int i3 = this.f1961h[pointerId];
                int i4 = this.f1969p;
                if ((i3 & i4) != 0) {
                    this.f1971r.mo2471a(i3 & i4, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f1954a == 1) {
                    m2834d();
                }
                mo2462b();
                return;
            case 2:
                if (this.f1954a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m2836e(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1957d[pointerId2];
                            float f2 = y2 - this.f1958e[pointerId2];
                            m2828b(f, f2, pointerId2);
                            if (this.f1954a != 1) {
                                View c2 = mo2468c((int) x2, (int) y2);
                                if (m2826a(c2, f, f2) && mo2466b(c2, pointerId2)) {
                                }
                            }
                            m2832c(motionEvent);
                            return;
                        }
                        i2++;
                    }
                    m2832c(motionEvent);
                    return;
                } else if (m2836e(this.f1956c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1956c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f1959f;
                    int i5 = this.f1956c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f1960g[i5]);
                    m2829b(this.f1972s.getLeft() + i6, this.f1972s.getTop() + i7, i6, i7);
                    m2832c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f1954a == 1) {
                    m2822a(0.0f, 0.0f);
                }
                mo2462b();
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m2823a(x4, y4, pointerId3);
                if (this.f1954a == 0) {
                    mo2466b(mo2468c((int) x4, (int) y4), pointerId3);
                    int i8 = this.f1961h[pointerId3];
                    int i9 = this.f1969p;
                    if ((i8 & i9) != 0) {
                        this.f1971r.mo2471a(i8 & i9, pointerId3);
                        return;
                    }
                    return;
                } else if (mo2465b((int) x4, (int) y4)) {
                    mo2466b(this.f1972s, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1954a == 1 && pointerId4 == this.f1956c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f1956c) {
                                View c3 = mo2468c((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f1972s;
                                if (c3 == view && mo2466b(view, pointerId5)) {
                                    i = this.f1956c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m2834d();
                    }
                }
                m2831c(pointerId4);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m2828b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2824a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2824a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2824a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2824a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1962i;
            iArr[i] = iArr[i] | i2;
            this.f1971r.mo2472b(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m2824a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f1961h[i] & i2) != i2 || (this.f1969p & i2) == 0 || (this.f1963j[i] & i2) == i2 || (this.f1962i[i] & i2) == i2)) {
            int i3 = this.f1955b;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f1971r.mo2473b(i2)) {
                    int[] iArr = this.f1963j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f1962i[i] & i2) != 0 || abs <= ((float) this.f1955b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2826a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1971r.mo1346b(view) > 0;
        boolean z2 = this.f1971r.mo1141a(view) > 0;
        if (z && z2) {
            int i = this.f1955b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f1955b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f1955b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private void m2834d() {
        this.f1965l.computeCurrentVelocity(1000, this.f1966m);
        m2822a(m2817a(this.f1965l.getXVelocity(this.f1956c), this.f1967n, this.f1966m), m2817a(this.f1965l.getYVelocity(this.f1956c), this.f1967n, this.f1966m));
    }

    /* renamed from: b */
    private void m2829b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int left = this.f1972s.getLeft();
        int top = this.f1972s.getTop();
        if (i3 != 0) {
            int b = this.f1971r.mo1147b(this.f1972s, i, i3);
            C0594r.m2603f(this.f1972s, b - left);
            i5 = b;
        } else {
            i5 = i;
        }
        if (i4 != 0) {
            int a = this.f1971r.mo1142a(this.f1972s, i2, i4);
            C0594r.m2601e(this.f1972s, a - top);
            i6 = a;
        } else {
            i6 = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f1971r.mo1145a(this.f1972s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: b */
    public boolean mo2465b(int i, int i2) {
        return mo2467b(this.f1972s, i, i2);
    }

    /* renamed from: b */
    public boolean mo2467b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public View mo2468c(int i, int i2) {
        for (int childCount = this.f1974u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1974u.getChildAt(this.f1971r.mo2474c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m2833d(int i, int i2) {
        int i3 = i < this.f1974u.getLeft() + this.f1968o ? 1 : 0;
        if (i2 < this.f1974u.getTop() + this.f1968o) {
            i3 |= 4;
        }
        if (i > this.f1974u.getRight() - this.f1968o) {
            i3 |= 2;
        }
        return i2 > this.f1974u.getBottom() - this.f1968o ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private boolean m2836e(int i) {
        if (mo2457a(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
