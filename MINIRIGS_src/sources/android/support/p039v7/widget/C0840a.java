package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.p036h.C0605w;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0840a extends ViewGroup {

    /* renamed from: a */
    protected final C0841a f2999a;

    /* renamed from: b */
    protected final Context f3000b;

    /* renamed from: c */
    protected ActionMenuView f3001c;

    /* renamed from: d */
    protected C0986c f3002d;

    /* renamed from: e */
    protected int f3003e;

    /* renamed from: f */
    protected C0601v f3004f;

    /* renamed from: g */
    private boolean f3005g;

    /* renamed from: h */
    private boolean f3006h;

    /* renamed from: a */
    protected static int m4108a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    C0840a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0840a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2999a = new C0841a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0639a.C0640a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3000b = context;
        } else {
            this.f3000b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0639a.C0649j.ActionBar, C0639a.C0640a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0639a.C0649j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0986c cVar = this.f3002d;
        if (cVar != null) {
            cVar.mo4841a(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3005g = false;
        }
        if (!this.f3005g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3005g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3005g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3006h = false;
        }
        if (!this.f3006h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3006h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3006h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f3003e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f3003e;
    }

    public int getAnimatedVisibility() {
        if (this.f3004f != null) {
            return this.f2999a.f3007a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public C0601v mo3321a(int i, long j) {
        C0601v vVar = this.f3004f;
        if (vVar != null) {
            vVar.mo2303b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0601v a = C0594r.m2610k(this).mo2296a(1.0f);
            a.mo2297a(j);
            a.mo2298a((C0605w) this.f2999a.mo3872a(a, i));
            return a;
        }
        C0601v a2 = C0594r.m2610k(this).mo2296a(0.0f);
        a2.mo2297a(j);
        a2.mo2298a((C0605w) this.f2999a.mo3872a(a2, i));
        return a2;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0601v vVar = this.f3004f;
            if (vVar != null) {
                vVar.mo2303b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo3323a() {
        C0986c cVar = this.f3002d;
        if (cVar != null) {
            return cVar.mo4847d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3869a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3870a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0841a implements C0605w {

        /* renamed from: a */
        int f3007a;

        /* renamed from: c */
        private boolean f3009c = false;

        protected C0841a() {
        }

        /* renamed from: a */
        public C0841a mo3872a(C0601v vVar, int i) {
            C0840a.this.f3004f = vVar;
            this.f3007a = i;
            return this;
        }

        /* renamed from: a */
        public void mo2309a(View view) {
            C0840a.super.setVisibility(0);
            this.f3009c = false;
        }

        /* renamed from: b */
        public void mo2310b(View view) {
            if (!this.f3009c) {
                C0840a aVar = C0840a.this;
                aVar.f3004f = null;
                C0840a.super.setVisibility(this.f3007a);
            }
        }

        /* renamed from: c */
        public void mo2311c(View view) {
            this.f3009c = true;
        }
    }
}
