package android.support.p039v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.widget.C0904ay;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.an */
class C0871an extends C0904ay.C0921h implements C0904ay.C0930m {

    /* renamed from: k */
    private static final int[] f3107k = {16842919};

    /* renamed from: l */
    private static final int[] f3108l = new int[0];

    /* renamed from: A */
    private int f3109A = 0;

    /* renamed from: B */
    private final int[] f3110B = new int[2];

    /* renamed from: C */
    private final int[] f3111C = new int[2];

    /* renamed from: D */
    private final Runnable f3112D = new Runnable() {
        public void run() {
            C0871an.this.mo4052b(500);
        }
    };

    /* renamed from: E */
    private final C0904ay.C0931n f3113E = new C0904ay.C0931n() {
        /* renamed from: a */
        public void mo4056a(C0904ay ayVar, int i, int i2) {
            C0871an.this.mo4045a(ayVar.computeHorizontalScrollOffset(), ayVar.computeVerticalScrollOffset());
        }
    };

    /* renamed from: a */
    final StateListDrawable f3114a;

    /* renamed from: b */
    final Drawable f3115b;

    /* renamed from: c */
    int f3116c;

    /* renamed from: d */
    int f3117d;

    /* renamed from: e */
    float f3118e;

    /* renamed from: f */
    int f3119f;

    /* renamed from: g */
    int f3120g;

    /* renamed from: h */
    float f3121h;

    /* renamed from: i */
    final ValueAnimator f3122i = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: j */
    int f3123j = 0;

    /* renamed from: m */
    private final int f3124m;

    /* renamed from: n */
    private final int f3125n;

    /* renamed from: o */
    private final int f3126o;

    /* renamed from: p */
    private final int f3127p;

    /* renamed from: q */
    private final StateListDrawable f3128q;

    /* renamed from: r */
    private final Drawable f3129r;

    /* renamed from: s */
    private final int f3130s;

    /* renamed from: t */
    private final int f3131t;

    /* renamed from: u */
    private int f3132u = 0;

    /* renamed from: v */
    private int f3133v = 0;

    /* renamed from: w */
    private C0904ay f3134w;

    /* renamed from: x */
    private boolean f3135x = false;

    /* renamed from: y */
    private boolean f3136y = false;

    /* renamed from: z */
    private int f3137z = 0;

    /* renamed from: a */
    public void mo4048a(boolean z) {
    }

    C0871an(C0904ay ayVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3114a = stateListDrawable;
        this.f3115b = drawable;
        this.f3128q = stateListDrawable2;
        this.f3129r = drawable2;
        this.f3126o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3127p = Math.max(i, drawable.getIntrinsicWidth());
        this.f3130s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3131t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3124m = i2;
        this.f3125n = i3;
        this.f3114a.setAlpha(255);
        this.f3115b.setAlpha(255);
        this.f3122i.addListener(new C0874a());
        this.f3122i.addUpdateListener(new C0875b());
        mo4047a(ayVar);
    }

    /* renamed from: a */
    public void mo4047a(C0904ay ayVar) {
        C0904ay ayVar2 = this.f3134w;
        if (ayVar2 != ayVar) {
            if (ayVar2 != null) {
                m4319d();
            }
            this.f3134w = ayVar;
            if (this.f3134w != null) {
                m4317c();
            }
        }
    }

    /* renamed from: c */
    private void m4317c() {
        this.f3134w.mo4196a((C0904ay.C0921h) this);
        this.f3134w.mo4198a((C0904ay.C0930m) this);
        this.f3134w.mo4199a(this.f3113E);
    }

    /* renamed from: d */
    private void m4319d() {
        this.f3134w.mo4215b((C0904ay.C0921h) this);
        this.f3134w.mo4216b((C0904ay.C0930m) this);
        this.f3134w.mo4217b(this.f3113E);
        m4321f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4043a() {
        this.f3134w.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4044a(int i) {
        if (i == 2 && this.f3137z != 2) {
            this.f3114a.setState(f3107k);
            m4321f();
        }
        if (i == 0) {
            mo4043a();
        } else {
            mo4051b();
        }
        if (this.f3137z == 2 && i != 2) {
            this.f3114a.setState(f3108l);
            m4318c(1200);
        } else if (i == 1) {
            m4318c(1500);
        }
        this.f3137z = i;
    }

    /* renamed from: e */
    private boolean m4320e() {
        return C0594r.m2602f(this.f3134w) == 1;
    }

    /* renamed from: b */
    public void mo4051b() {
        int i = this.f3123j;
        if (i != 0) {
            if (i == 3) {
                this.f3122i.cancel();
            } else {
                return;
            }
        }
        this.f3123j = 1;
        ValueAnimator valueAnimator = this.f3122i;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3122i.setDuration(500);
        this.f3122i.setStartDelay(0);
        this.f3122i.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4052b(int i) {
        switch (this.f3123j) {
            case 1:
                this.f3122i.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f3123j = 3;
        ValueAnimator valueAnimator = this.f3122i;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3122i.setDuration((long) i);
        this.f3122i.start();
    }

    /* renamed from: f */
    private void m4321f() {
        this.f3134w.removeCallbacks(this.f3112D);
    }

    /* renamed from: c */
    private void m4318c(int i) {
        m4321f();
        this.f3134w.postDelayed(this.f3112D, (long) i);
    }

    /* renamed from: a */
    public void mo4046a(Canvas canvas, C0904ay ayVar, C0904ay.C0942u uVar) {
        if (this.f3132u != this.f3134w.getWidth() || this.f3133v != this.f3134w.getHeight()) {
            this.f3132u = this.f3134w.getWidth();
            this.f3133v = this.f3134w.getHeight();
            mo4044a(0);
        } else if (this.f3123j != 0) {
            if (this.f3135x) {
                m4314a(canvas);
            }
            if (this.f3136y) {
                m4316b(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m4314a(Canvas canvas) {
        int i = this.f3132u;
        int i2 = this.f3126o;
        int i3 = i - i2;
        int i4 = this.f3117d;
        int i5 = this.f3116c;
        int i6 = i4 - (i5 / 2);
        this.f3114a.setBounds(0, 0, i2, i5);
        this.f3115b.setBounds(0, 0, this.f3127p, this.f3133v);
        if (m4320e()) {
            this.f3115b.draw(canvas);
            canvas.translate((float) this.f3126o, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3114a.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f3126o), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f3115b.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f3114a.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: b */
    private void m4316b(Canvas canvas) {
        int i = this.f3133v;
        int i2 = this.f3130s;
        int i3 = i - i2;
        int i4 = this.f3120g;
        int i5 = this.f3119f;
        int i6 = i4 - (i5 / 2);
        this.f3128q.setBounds(0, 0, i5, i2);
        this.f3129r.setBounds(0, 0, this.f3132u, this.f3131t);
        canvas.translate(0.0f, (float) i3);
        this.f3129r.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3128q.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4045a(int i, int i2) {
        int computeVerticalScrollRange = this.f3134w.computeVerticalScrollRange();
        int i3 = this.f3133v;
        this.f3135x = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3124m;
        int computeHorizontalScrollRange = this.f3134w.computeHorizontalScrollRange();
        int i4 = this.f3132u;
        this.f3136y = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3124m;
        if (this.f3135x || this.f3136y) {
            if (this.f3135x) {
                float f = (float) i3;
                this.f3117d = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3116c = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3136y) {
                float f2 = (float) i4;
                this.f3120g = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3119f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3137z;
            if (i5 == 0 || i5 == 1) {
                mo4044a(1);
            }
        } else if (this.f3137z != 0) {
            mo4044a(0);
        }
    }

    /* renamed from: a */
    public boolean mo4050a(C0904ay ayVar, MotionEvent motionEvent) {
        int i = this.f3137z;
        if (i == 1) {
            boolean a = mo4049a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo4054b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f3109A = 1;
                this.f3121h = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f3109A = 2;
                this.f3118e = (float) ((int) motionEvent.getY());
            }
            mo4044a(2);
            return true;
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public void mo4053b(C0904ay ayVar, MotionEvent motionEvent) {
        if (this.f3137z != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo4049a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo4054b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f3109A = 1;
                        this.f3121h = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f3109A = 2;
                        this.f3118e = (float) ((int) motionEvent.getY());
                    }
                    mo4044a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3137z == 2) {
                this.f3118e = 0.0f;
                this.f3121h = 0.0f;
                mo4044a(1);
                this.f3109A = 0;
            } else if (motionEvent.getAction() == 2 && this.f3137z == 2) {
                mo4051b();
                if (this.f3109A == 1) {
                    m4315b(motionEvent.getX());
                }
                if (this.f3109A == 2) {
                    m4313a(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: a */
    private void m4313a(float f) {
        int[] g = m4322g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f3117d) - max) >= 2.0f) {
            int a = m4312a(this.f3118e, max, g, this.f3134w.computeVerticalScrollRange(), this.f3134w.computeVerticalScrollOffset(), this.f3133v);
            if (a != 0) {
                this.f3134w.scrollBy(0, a);
            }
            this.f3118e = max;
        }
    }

    /* renamed from: b */
    private void m4315b(float f) {
        int[] h = m4323h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f3120g) - max) >= 2.0f) {
            int a = m4312a(this.f3121h, max, h, this.f3134w.computeHorizontalScrollRange(), this.f3134w.computeHorizontalScrollOffset(), this.f3132u);
            if (a != 0) {
                this.f3134w.scrollBy(a, 0);
            }
            this.f3121h = max;
        }
    }

    /* renamed from: a */
    private int m4312a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4049a(float f, float f2) {
        if (!m4320e() ? f >= ((float) (this.f3132u - this.f3126o)) : f <= ((float) (this.f3126o / 2))) {
            int i = this.f3117d;
            int i2 = this.f3116c;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4054b(float f, float f2) {
        if (f2 >= ((float) (this.f3133v - this.f3130s))) {
            int i = this.f3120g;
            int i2 = this.f3119f;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: g */
    private int[] m4322g() {
        int[] iArr = this.f3110B;
        int i = this.f3125n;
        iArr[0] = i;
        iArr[1] = this.f3133v - i;
        return iArr;
    }

    /* renamed from: h */
    private int[] m4323h() {
        int[] iArr = this.f3111C;
        int i = this.f3125n;
        iArr[0] = i;
        iArr[1] = this.f3132u - i;
        return iArr;
    }

    /* renamed from: android.support.v7.widget.an$a */
    private class C0874a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f3141b = false;

        C0874a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3141b) {
                this.f3141b = false;
            } else if (((Float) C0871an.this.f3122i.getAnimatedValue()).floatValue() == 0.0f) {
                C0871an anVar = C0871an.this;
                anVar.f3123j = 0;
                anVar.mo4044a(0);
            } else {
                C0871an anVar2 = C0871an.this;
                anVar2.f3123j = 2;
                anVar2.mo4043a();
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f3141b = true;
        }
    }

    /* renamed from: android.support.v7.widget.an$b */
    private class C0875b implements ValueAnimator.AnimatorUpdateListener {
        C0875b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0871an.this.f3114a.setAlpha(floatValue);
            C0871an.this.f3115b.setAlpha(floatValue);
            C0871an.this.mo4043a();
        }
    }
}
