package android.support.p039v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f2994a;

    /* renamed from: b */
    private int f2995b;

    /* renamed from: c */
    private WeakReference<View> f2996c;

    /* renamed from: d */
    private LayoutInflater f2997d;

    /* renamed from: e */
    private C0839a f2998e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0839a {
        /* renamed from: a */
        void mo3868a(ViewStubCompat viewStubCompat, View view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2994a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ViewStubCompat, i, 0);
        this.f2995b = obtainStyledAttributes.getResourceId(C0639a.C0649j.ViewStubCompat_android_inflatedId, -1);
        this.f2994a = obtainStyledAttributes.getResourceId(C0639a.C0649j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0639a.C0649j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f2995b;
    }

    public void setInflatedId(int i) {
        this.f2995b = i;
    }

    public int getLayoutResource() {
        return this.f2994a;
    }

    public void setLayoutResource(int i) {
        this.f2994a = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2997d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2997d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2996c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo3856a();
        }
    }

    /* renamed from: a */
    public View mo3856a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2994a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2997d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2994a, viewGroup, false);
            int i = this.f2995b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2996c = new WeakReference<>(inflate);
            C0839a aVar = this.f2998e;
            if (aVar != null) {
                aVar.mo3868a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(C0839a aVar) {
        this.f2998e = aVar;
    }
}
