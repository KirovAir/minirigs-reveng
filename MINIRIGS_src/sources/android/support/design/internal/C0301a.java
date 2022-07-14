package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0241a;
import android.support.p039v7.widget.C0886as;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: android.support.design.internal.a */
public class C0301a extends C0886as {

    /* renamed from: a */
    protected boolean f944a;

    /* renamed from: b */
    boolean f945b;

    /* renamed from: c */
    private Drawable f946c;

    /* renamed from: d */
    private final Rect f947d;

    /* renamed from: e */
    private final Rect f948e;

    /* renamed from: f */
    private int f949f;

    public C0301a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0301a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f947d = new Rect();
        this.f948e = new Rect();
        this.f949f = 119;
        this.f944a = true;
        this.f945b = false;
        TypedArray a = C0302b.m1085a(context, attributeSet, C0241a.C0250i.ForegroundLinearLayout, i, 0, new int[0]);
        this.f949f = a.getInt(C0241a.C0250i.ForegroundLinearLayout_android_foregroundGravity, this.f949f);
        Drawable drawable = a.getDrawable(C0241a.C0250i.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f944a = a.getBoolean(C0241a.C0250i.ForegroundLinearLayout_foregroundInsidePadding, true);
        a.recycle();
    }

    public int getForegroundGravity() {
        return this.f949f;
    }

    public void setForegroundGravity(int i) {
        if (this.f949f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f949f = i;
            if (this.f949f == 119 && this.f946c != null) {
                this.f946c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f946c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f946c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f946c;
        if (drawable != null && drawable.isStateful()) {
            this.f946c.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f946c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f946c);
            }
            this.f946c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f949f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f946c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f945b = z | this.f945b;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f945b = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f946c;
        if (drawable != null) {
            if (this.f945b) {
                this.f945b = false;
                Rect rect = this.f947d;
                Rect rect2 = this.f948e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f944a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f949f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f946c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
