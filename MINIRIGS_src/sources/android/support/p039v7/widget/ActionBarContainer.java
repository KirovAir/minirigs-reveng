package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f2648a;

    /* renamed from: b */
    Drawable f2649b;

    /* renamed from: c */
    Drawable f2650c;

    /* renamed from: d */
    boolean f2651d;

    /* renamed from: e */
    boolean f2652e;

    /* renamed from: f */
    private boolean f2653f;

    /* renamed from: g */
    private View f2654g;

    /* renamed from: h */
    private View f2655h;

    /* renamed from: i */
    private View f2656i;

    /* renamed from: j */
    private int f2657j;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0594r.m2584a((View) this, (Drawable) new C0948b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ActionBar);
        this.f2648a = obtainStyledAttributes.getDrawable(C0639a.C0649j.ActionBar_background);
        this.f2649b = obtainStyledAttributes.getDrawable(C0639a.C0649j.ActionBar_backgroundStacked);
        this.f2657j = obtainStyledAttributes.getDimensionPixelSize(C0639a.C0649j.ActionBar_height, -1);
        if (getId() == C0639a.C0645f.split_action_bar) {
            this.f2651d = true;
            this.f2650c = obtainStyledAttributes.getDrawable(C0639a.C0649j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f2651d ? this.f2648a == null && this.f2649b == null : this.f2650c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2655h = findViewById(C0639a.C0645f.action_bar);
        this.f2656i = findViewById(C0639a.C0645f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2648a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2648a);
        }
        this.f2648a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2655h;
            if (view != null) {
                this.f2648a.setBounds(view.getLeft(), this.f2655h.getTop(), this.f2655h.getRight(), this.f2655h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2651d ? !(this.f2648a == null && this.f2649b == null) : this.f2650c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2649b;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2649b);
        }
        this.f2649b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2652e && (drawable2 = this.f2649b) != null) {
                drawable2.setBounds(this.f2654g.getLeft(), this.f2654g.getTop(), this.f2654g.getRight(), this.f2654g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2651d ? !(this.f2648a == null && this.f2649b == null) : this.f2650c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2650c;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f2650c);
        }
        this.f2650c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2651d && (drawable2 = this.f2650c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2651d ? this.f2648a == null && this.f2649b == null : this.f2650c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2648a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2649b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2650c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2648a && !this.f2651d) || (drawable == this.f2649b && this.f2652e) || ((drawable == this.f2650c && this.f2651d) || super.verifyDrawable(drawable));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2648a;
        if (drawable != null && drawable.isStateful()) {
            this.f2648a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2649b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2649b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2650c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f2650c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2648a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2649b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2650c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f2653f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2653f || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(C0955bf bfVar) {
        View view = this.f2654g;
        if (view != null) {
            removeView(view);
        }
        this.f2654g = bfVar;
        if (bfVar != null) {
            addView(bfVar);
            ViewGroup.LayoutParams layoutParams = bfVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bfVar.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f2654g;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3619a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m3620b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f2655h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f2657j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2655h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f2654g;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m3619a(this.f2655h)) {
                    i3 = m3620b(this.f2655h);
                } else {
                    i3 = !m3619a(this.f2656i) ? m3620b(this.f2656i) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m3620b(this.f2654g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f2654g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f2651d) {
            Drawable drawable2 = this.f2650c;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f2648a != null) {
                if (this.f2655h.getVisibility() == 0) {
                    this.f2648a.setBounds(this.f2655h.getLeft(), this.f2655h.getTop(), this.f2655h.getRight(), this.f2655h.getBottom());
                } else {
                    View view2 = this.f2656i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2648a.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2648a.setBounds(this.f2656i.getLeft(), this.f2656i.getTop(), this.f2656i.getRight(), this.f2656i.getBottom());
                    }
                }
                z3 = true;
            }
            this.f2652e = z4;
            if (!z4 || (drawable = this.f2649b) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}
