package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0601v;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0770o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0840a {

    /* renamed from: g */
    private CharSequence f2658g;

    /* renamed from: h */
    private CharSequence f2659h;

    /* renamed from: i */
    private View f2660i;

    /* renamed from: j */
    private View f2661j;

    /* renamed from: k */
    private LinearLayout f2662k;

    /* renamed from: l */
    private TextView f2663l;

    /* renamed from: m */
    private TextView f2664m;

    /* renamed from: n */
    private int f2665n;

    /* renamed from: o */
    private int f2666o;

    /* renamed from: p */
    private boolean f2667p;

    /* renamed from: q */
    private int f2668q;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0601v mo3321a(int i, long j) {
        return super.mo3321a(i, j);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0968bn a = C0968bn.m5093a(context, attributeSet, C0639a.C0649j.ActionMode, i, 0);
        C0594r.m2584a((View) this, a.mo4780a(C0639a.C0649j.ActionMode_background));
        this.f2665n = a.mo4793g(C0639a.C0649j.ActionMode_titleTextStyle, 0);
        this.f2666o = a.mo4793g(C0639a.C0649j.ActionMode_subtitleTextStyle, 0);
        this.f3003e = a.mo4791f(C0639a.C0649j.ActionMode_height, 0);
        this.f2668q = a.mo4793g(C0639a.C0649j.ActionMode_closeItemLayout, C0639a.C0646g.abc_action_mode_close_item_material);
        a.mo4781a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3002d != null) {
            this.f3002d.mo4848e();
            this.f3002d.mo4850g();
        }
    }

    public void setContentHeight(int i) {
        this.f3003e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2661j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2661j = view;
        if (!(view == null || (linearLayout = this.f2662k) == null)) {
            removeView(linearLayout);
            this.f2662k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2658g = charSequence;
        m3621e();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2659h = charSequence;
        m3621e();
    }

    public CharSequence getTitle() {
        return this.f2658g;
    }

    public CharSequence getSubtitle() {
        return this.f2659h;
    }

    /* renamed from: e */
    private void m3621e() {
        if (this.f2662k == null) {
            LayoutInflater.from(getContext()).inflate(C0639a.C0646g.abc_action_bar_title_item, this);
            this.f2662k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2663l = (TextView) this.f2662k.findViewById(C0639a.C0645f.action_bar_title);
            this.f2664m = (TextView) this.f2662k.findViewById(C0639a.C0645f.action_bar_subtitle);
            if (this.f2665n != 0) {
                this.f2663l.setTextAppearance(getContext(), this.f2665n);
            }
            if (this.f2666o != 0) {
                this.f2664m.setTextAppearance(getContext(), this.f2666o);
            }
        }
        this.f2663l.setText(this.f2658g);
        this.f2664m.setText(this.f2659h);
        boolean z = !TextUtils.isEmpty(this.f2658g);
        boolean z2 = !TextUtils.isEmpty(this.f2659h);
        int i = 0;
        this.f2664m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f2662k;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f2662k.getParent() == null) {
            addView(this.f2662k);
        }
    }

    /* renamed from: a */
    public void mo3322a(final C0726b bVar) {
        View view = this.f2660i;
        if (view == null) {
            this.f2660i = LayoutInflater.from(getContext()).inflate(this.f2668q, this, false);
            addView(this.f2660i);
        } else if (view.getParent() == null) {
            addView(this.f2660i);
        }
        this.f2660i.findViewById(C0639a.C0645f.action_mode_close_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bVar.mo2703c();
            }
        });
        C0754h hVar = (C0754h) bVar.mo2700b();
        if (this.f3002d != null) {
            this.f3002d.mo4849f();
        }
        this.f3002d = new C0986c(getContext());
        this.f3002d.mo4845c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.mo3051a((C0770o) this.f3002d, this.f3000b);
        this.f3001c = (ActionMenuView) this.f3002d.mo2977a((ViewGroup) this);
        C0594r.m2584a((View) this.f3001c, (Drawable) null);
        addView(this.f3001c, layoutParams);
    }

    /* renamed from: b */
    public void mo3324b() {
        if (this.f2660i == null) {
            mo3325c();
        }
    }

    /* renamed from: c */
    public void mo3325c() {
        removeAllViews();
        this.f2661j = null;
        this.f3001c = null;
    }

    /* renamed from: a */
    public boolean mo3323a() {
        if (this.f3002d != null) {
            return this.f3002d.mo4847d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            if (this.f3003e > 0) {
                i3 = this.f3003e;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f2660i;
            if (view != null) {
                int a = mo3869a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2660i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f3001c != null && this.f3001c.getParent() == this) {
                paddingLeft = mo3869a(this.f3001c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f2662k;
            if (linearLayout != null && this.f2661j == null) {
                if (this.f2667p) {
                    this.f2662k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f2662k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f2662k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo3869a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f2661j;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.f2661j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i4));
            }
            if (this.f3003e <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0984bv.m5212a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2660i;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2660i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m4108a(paddingRight, i6, a);
            i5 = m4108a(a2 + mo3870a(this.f2660i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f2662k;
        int a3 = (linearLayout == null || this.f2661j != null || linearLayout.getVisibility() == 8) ? i5 : i5 + mo3870a(this.f2662k, i5, paddingTop, paddingTop2, a);
        View view2 = this.f2661j;
        if (view2 != null) {
            mo3870a(view2, a3, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f3001c != null) {
            mo3870a(this.f3001c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2658g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2667p) {
            requestLayout();
        }
        this.f2667p = z;
    }

    /* renamed from: d */
    public boolean mo3326d() {
        return this.f2667p;
    }
}
