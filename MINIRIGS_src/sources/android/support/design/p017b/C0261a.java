package android.support.design.p017b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0241a;
import android.support.design.internal.C0302b;
import android.support.design.internal.C0303c;
import android.support.design.p021e.C0287a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.widget.C1005h;
import android.util.AttributeSet;
import android.util.Log;

/* renamed from: android.support.design.b.a */
public class C0261a extends C1005h {

    /* renamed from: b */
    private final C0263c f785b;

    /* renamed from: c */
    private int f786c;

    /* renamed from: d */
    private PorterDuff.Mode f787d;

    /* renamed from: e */
    private ColorStateList f788e;

    /* renamed from: f */
    private Drawable f789f;

    /* renamed from: g */
    private int f790g;

    /* renamed from: h */
    private int f791h;

    /* renamed from: i */
    private int f792i;

    public C0261a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0241a.C0243b.materialButtonStyle);
    }

    public C0261a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray a = C0302b.m1085a(context, attributeSet, C0241a.C0250i.MaterialButton, i, C0241a.C0249h.Widget_MaterialComponents_Button, new int[0]);
        this.f786c = a.getDimensionPixelSize(C0241a.C0250i.MaterialButton_iconPadding, 0);
        this.f787d = C0303c.m1093a(a.getInt(C0241a.C0250i.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f788e = C0287a.m1034a(getContext(), a, C0241a.C0250i.MaterialButton_iconTint);
        this.f789f = C0287a.m1035b(getContext(), a, C0241a.C0250i.MaterialButton_icon);
        this.f792i = a.getInteger(C0241a.C0250i.MaterialButton_iconGravity, 1);
        this.f790g = a.getDimensionPixelSize(C0241a.C0250i.MaterialButton_iconSize, 0);
        this.f785b = new C0263c(this);
        this.f785b.mo820a(a);
        a.recycle();
        setCompoundDrawablePadding(this.f786c);
        m907b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && m908c()) {
            this.f785b.mo821a(canvas);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m908c()) {
            this.f785b.mo819a(colorStateList);
        } else if (this.f785b != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m908c()) {
            return this.f785b.mo826c();
        }
        return super.getSupportBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m908c()) {
            this.f785b.mo822a(mode);
        } else if (this.f785b != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m908c()) {
            return this.f785b.mo829d();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(int i) {
        if (m908c()) {
            this.f785b.mo817a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0705a.m3168b(getContext(), i) : null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m908c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f785b.mo816a();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0263c cVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f785b) != null) {
            cVar.mo818a(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f789f != null && this.f792i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f790g;
            if (i3 == 0) {
                i3 = this.f789f.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C0594r.m2606h(this)) - i3) - this.f786c) - C0594r.m2604g(this)) / 2;
            if (m906a()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f791h != measuredWidth) {
                this.f791h = measuredWidth;
                m907b();
            }
        }
    }

    /* renamed from: a */
    private boolean m906a() {
        return C0594r.m2602f(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(int i) {
        if (this.f786c != i) {
            this.f786c = i;
            setCompoundDrawablePadding(i);
        }
    }

    public int getIconPadding() {
        return this.f786c;
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f790g != i) {
            this.f790g = i;
            m907b();
        }
    }

    public int getIconSize() {
        return this.f790g;
    }

    public void setIcon(Drawable drawable) {
        if (this.f789f != drawable) {
            this.f789f = drawable;
            m907b();
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0705a.m3168b(getContext(), i) : null);
    }

    public Drawable getIcon() {
        return this.f789f;
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f788e != colorStateList) {
            this.f788e = colorStateList;
            m907b();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0705a.m3165a(getContext(), i));
    }

    public ColorStateList getIconTint() {
        return this.f788e;
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f787d != mode) {
            this.f787d = mode;
            m907b();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f787d;
    }

    /* renamed from: b */
    private void m907b() {
        Drawable drawable = this.f789f;
        if (drawable != null) {
            this.f789f = drawable.mutate();
            C0540a.m2379a(this.f789f, this.f788e);
            PorterDuff.Mode mode = this.f787d;
            if (mode != null) {
                C0540a.m2382a(this.f789f, mode);
            }
            int i = this.f790g;
            if (i == 0) {
                i = this.f789f.getIntrinsicWidth();
            }
            int i2 = this.f790g;
            if (i2 == 0) {
                i2 = this.f789f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f789f;
            int i3 = this.f791h;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0630m.m2801a(this, this.f789f, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m908c()) {
            this.f785b.mo824b(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m908c()) {
            setRippleColor(C0705a.m3165a(getContext(), i));
        }
    }

    public ColorStateList getRippleColor() {
        if (m908c()) {
            return this.f785b.mo830e();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m908c()) {
            this.f785b.mo828c(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m908c()) {
            setStrokeColor(C0705a.m3165a(getContext(), i));
        }
    }

    public ColorStateList getStrokeColor() {
        if (m908c()) {
            return this.f785b.mo831f();
        }
        return null;
    }

    public void setStrokeWidth(int i) {
        if (m908c()) {
            this.f785b.mo823b(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m908c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public int getStrokeWidth() {
        if (m908c()) {
            return this.f785b.mo832g();
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        if (m908c()) {
            this.f785b.mo827c(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m908c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public int getCornerRadius() {
        if (m908c()) {
            return this.f785b.mo833h();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f792i;
    }

    public void setIconGravity(int i) {
        this.f792i = i;
    }

    /* renamed from: c */
    private boolean m908c() {
        C0263c cVar = this.f785b;
        return cVar != null && !cVar.mo825b();
    }
}
