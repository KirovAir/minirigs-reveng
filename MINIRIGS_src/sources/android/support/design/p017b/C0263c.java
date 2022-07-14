package android.support.design.p017b;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.design.C0241a;
import android.support.design.internal.C0303c;
import android.support.design.p021e.C0287a;
import android.support.design.p022f.C0288a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0594r;

/* renamed from: android.support.design.b.c */
class C0263c {

    /* renamed from: a */
    private static final boolean f793a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private final C0261a f794b;

    /* renamed from: c */
    private int f795c;

    /* renamed from: d */
    private int f796d;

    /* renamed from: e */
    private int f797e;

    /* renamed from: f */
    private int f798f;

    /* renamed from: g */
    private int f799g;

    /* renamed from: h */
    private int f800h;

    /* renamed from: i */
    private PorterDuff.Mode f801i;

    /* renamed from: j */
    private ColorStateList f802j;

    /* renamed from: k */
    private ColorStateList f803k;

    /* renamed from: l */
    private ColorStateList f804l;

    /* renamed from: m */
    private final Paint f805m = new Paint(1);

    /* renamed from: n */
    private final Rect f806n = new Rect();

    /* renamed from: o */
    private final RectF f807o = new RectF();

    /* renamed from: p */
    private GradientDrawable f808p;

    /* renamed from: q */
    private Drawable f809q;

    /* renamed from: r */
    private GradientDrawable f810r;

    /* renamed from: s */
    private Drawable f811s;

    /* renamed from: t */
    private GradientDrawable f812t;

    /* renamed from: u */
    private GradientDrawable f813u;

    /* renamed from: v */
    private GradientDrawable f814v;

    /* renamed from: w */
    private boolean f815w = false;

    public C0263c(C0261a aVar) {
        this.f794b = aVar;
    }

    /* renamed from: a */
    public void mo820a(TypedArray typedArray) {
        int i = 0;
        this.f795c = typedArray.getDimensionPixelOffset(C0241a.C0250i.MaterialButton_android_insetLeft, 0);
        this.f796d = typedArray.getDimensionPixelOffset(C0241a.C0250i.MaterialButton_android_insetRight, 0);
        this.f797e = typedArray.getDimensionPixelOffset(C0241a.C0250i.MaterialButton_android_insetTop, 0);
        this.f798f = typedArray.getDimensionPixelOffset(C0241a.C0250i.MaterialButton_android_insetBottom, 0);
        this.f799g = typedArray.getDimensionPixelSize(C0241a.C0250i.MaterialButton_cornerRadius, 0);
        this.f800h = typedArray.getDimensionPixelSize(C0241a.C0250i.MaterialButton_strokeWidth, 0);
        this.f801i = C0303c.m1093a(typedArray.getInt(C0241a.C0250i.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f802j = C0287a.m1034a(this.f794b.getContext(), typedArray, C0241a.C0250i.MaterialButton_backgroundTint);
        this.f803k = C0287a.m1034a(this.f794b.getContext(), typedArray, C0241a.C0250i.MaterialButton_strokeColor);
        this.f804l = C0287a.m1034a(this.f794b.getContext(), typedArray, C0241a.C0250i.MaterialButton_rippleColor);
        this.f805m.setStyle(Paint.Style.STROKE);
        this.f805m.setStrokeWidth((float) this.f800h);
        Paint paint = this.f805m;
        ColorStateList colorStateList = this.f803k;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.f794b.getDrawableState(), 0);
        }
        paint.setColor(i);
        int g = C0594r.m2604g(this.f794b);
        int paddingTop = this.f794b.getPaddingTop();
        int h = C0594r.m2606h(this.f794b);
        int paddingBottom = this.f794b.getPaddingBottom();
        this.f794b.setInternalBackground(f793a ? m912k() : m910i());
        C0594r.m2580a(this.f794b, g + this.f795c, paddingTop + this.f797e, h + this.f796d, paddingBottom + this.f798f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo816a() {
        this.f815w = true;
        this.f794b.setSupportBackgroundTintList(this.f802j);
        this.f794b.setSupportBackgroundTintMode(this.f801i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo825b() {
        return this.f815w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo821a(Canvas canvas) {
        if (canvas != null && this.f803k != null && this.f800h > 0) {
            this.f806n.set(this.f794b.getBackground().getBounds());
            this.f807o.set(((float) this.f806n.left) + (((float) this.f800h) / 2.0f) + ((float) this.f795c), ((float) this.f806n.top) + (((float) this.f800h) / 2.0f) + ((float) this.f797e), (((float) this.f806n.right) - (((float) this.f800h) / 2.0f)) - ((float) this.f796d), (((float) this.f806n.bottom) - (((float) this.f800h) / 2.0f)) - ((float) this.f798f));
            float f = ((float) this.f799g) - (((float) this.f800h) / 2.0f);
            canvas.drawRoundRect(this.f807o, f, f, this.f805m);
        }
    }

    /* renamed from: i */
    private Drawable m910i() {
        this.f808p = new GradientDrawable();
        this.f808p.setCornerRadius(((float) this.f799g) + 1.0E-5f);
        this.f808p.setColor(-1);
        this.f809q = C0540a.m2390g(this.f808p);
        C0540a.m2379a(this.f809q, this.f802j);
        PorterDuff.Mode mode = this.f801i;
        if (mode != null) {
            C0540a.m2382a(this.f809q, mode);
        }
        this.f810r = new GradientDrawable();
        this.f810r.setCornerRadius(((float) this.f799g) + 1.0E-5f);
        this.f810r.setColor(-1);
        this.f811s = C0540a.m2390g(this.f810r);
        C0540a.m2379a(this.f811s, this.f804l);
        return m909a((Drawable) new LayerDrawable(new Drawable[]{this.f809q, this.f811s}));
    }

    /* renamed from: a */
    private InsetDrawable m909a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f795c, this.f797e, this.f796d, this.f798f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo819a(ColorStateList colorStateList) {
        if (this.f802j != colorStateList) {
            this.f802j = colorStateList;
            if (f793a) {
                m911j();
                return;
            }
            Drawable drawable = this.f809q;
            if (drawable != null) {
                C0540a.m2379a(drawable, this.f802j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo826c() {
        return this.f802j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo822a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f801i != mode) {
            this.f801i = mode;
            if (f793a) {
                m911j();
                return;
            }
            Drawable drawable = this.f809q;
            if (drawable != null && (mode2 = this.f801i) != null) {
                C0540a.m2382a(drawable, mode2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo829d() {
        return this.f801i;
    }

    /* renamed from: j */
    private void m911j() {
        GradientDrawable gradientDrawable = this.f812t;
        if (gradientDrawable != null) {
            C0540a.m2379a((Drawable) gradientDrawable, this.f802j);
            PorterDuff.Mode mode = this.f801i;
            if (mode != null) {
                C0540a.m2382a((Drawable) this.f812t, mode);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: k */
    private Drawable m912k() {
        this.f812t = new GradientDrawable();
        this.f812t.setCornerRadius(((float) this.f799g) + 1.0E-5f);
        this.f812t.setColor(-1);
        m911j();
        this.f813u = new GradientDrawable();
        this.f813u.setCornerRadius(((float) this.f799g) + 1.0E-5f);
        this.f813u.setColor(0);
        this.f813u.setStroke(this.f800h, this.f803k);
        InsetDrawable a = m909a((Drawable) new LayerDrawable(new Drawable[]{this.f812t, this.f813u}));
        this.f814v = new GradientDrawable();
        this.f814v.setCornerRadius(((float) this.f799g) + 1.0E-5f);
        this.f814v.setColor(-1);
        return new C0262b(C0288a.m1038a(this.f804l), a, this.f814v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo818a(int i, int i2) {
        GradientDrawable gradientDrawable = this.f814v;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f795c, this.f797e, i2 - this.f796d, i - this.f798f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo817a(int i) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (f793a && (gradientDrawable2 = this.f812t) != null) {
            gradientDrawable2.setColor(i);
        } else if (!f793a && (gradientDrawable = this.f808p) != null) {
            gradientDrawable.setColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo824b(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f804l != colorStateList) {
            this.f804l = colorStateList;
            if (f793a && (this.f794b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f794b.getBackground()).setColor(colorStateList);
            } else if (!f793a && (drawable = this.f811s) != null) {
                C0540a.m2379a(drawable, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ColorStateList mo830e() {
        return this.f804l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo828c(ColorStateList colorStateList) {
        if (this.f803k != colorStateList) {
            this.f803k = colorStateList;
            Paint paint = this.f805m;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.f794b.getDrawableState(), 0);
            }
            paint.setColor(i);
            m913l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo831f() {
        return this.f803k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo823b(int i) {
        if (this.f800h != i) {
            this.f800h = i;
            this.f805m.setStrokeWidth((float) i);
            m913l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo832g() {
        return this.f800h;
    }

    /* renamed from: l */
    private void m913l() {
        if (f793a && this.f813u != null) {
            this.f794b.setInternalBackground(m912k());
        } else if (!f793a) {
            this.f794b.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo827c(int i) {
        GradientDrawable gradientDrawable;
        if (this.f799g != i) {
            this.f799g = i;
            if (f793a && this.f812t != null && this.f813u != null && this.f814v != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f = ((float) i) + 1.0E-5f;
                    m915n().setCornerRadius(f);
                    m914m().setCornerRadius(f);
                }
                float f2 = ((float) i) + 1.0E-5f;
                this.f812t.setCornerRadius(f2);
                this.f813u.setCornerRadius(f2);
                this.f814v.setCornerRadius(f2);
            } else if (!f793a && (gradientDrawable = this.f808p) != null && this.f810r != null) {
                float f3 = ((float) i) + 1.0E-5f;
                gradientDrawable.setCornerRadius(f3);
                this.f810r.setCornerRadius(f3);
                this.f794b.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo833h() {
        return this.f799g;
    }

    /* renamed from: m */
    private GradientDrawable m914m() {
        if (!f793a || this.f794b.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f794b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: n */
    private GradientDrawable m915n() {
        if (!f793a || this.f794b.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f794b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }
}
