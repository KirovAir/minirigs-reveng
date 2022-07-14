package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p039v7.app.C0664a;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0725a;
import android.support.p039v7.widget.C0886as;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bf */
public class C0955bf extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f3494j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f3495a;

    /* renamed from: b */
    C0886as f3496b;

    /* renamed from: c */
    int f3497c;

    /* renamed from: d */
    int f3498d;

    /* renamed from: e */
    private C0958b f3499e;

    /* renamed from: f */
    private Spinner f3500f;

    /* renamed from: g */
    private boolean f3501g;

    /* renamed from: h */
    private int f3502h;

    /* renamed from: i */
    private int f3503i;

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f3496b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f3497c = -1;
        } else {
            if (childCount > 2) {
                this.f3497c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f3497c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f3497c = Math.min(this.f3497c, this.f3498d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3502h, 1073741824);
        if (z2 || !this.f3501g) {
            z = false;
        }
        if (z) {
            this.f3496b.measure(0, makeMeasureSpec);
            if (this.f3496b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m5025b();
            } else {
                m5026c();
            }
        } else {
            m5026c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f3503i);
        }
    }

    /* renamed from: a */
    private boolean m5024a() {
        Spinner spinner = this.f3500f;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.f3501g = z;
    }

    /* renamed from: b */
    private void m5025b() {
        if (!m5024a()) {
            if (this.f3500f == null) {
                this.f3500f = m5027d();
            }
            removeView(this.f3496b);
            addView(this.f3500f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f3500f.getAdapter() == null) {
                this.f3500f.setAdapter(new C0957a());
            }
            Runnable runnable = this.f3495a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f3495a = null;
            }
            this.f3500f.setSelection(this.f3503i);
        }
    }

    /* renamed from: c */
    private boolean m5026c() {
        if (!m5024a()) {
            return false;
        }
        removeView(this.f3500f);
        addView(this.f3496b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f3500f.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.f3503i = i;
        int childCount = this.f3496b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3496b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo4725a(i);
            }
            i2++;
        }
        Spinner spinner = this.f3500f;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.f3502h = i;
        requestLayout();
    }

    /* renamed from: d */
    private Spinner m5027d() {
        C1027y yVar = new C1027y(getContext(), (AttributeSet) null, C0639a.C0640a.actionDropDownStyle);
        yVar.setLayoutParams(new C0886as.C0887a(-2, -1));
        yVar.setOnItemSelectedListener(this);
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0725a a = C0725a.m3257a(getContext());
        setContentHeight(a.mo2838e());
        this.f3498d = a.mo2840g();
    }

    /* renamed from: a */
    public void mo4725a(int i) {
        final View childAt = this.f3496b.getChildAt(i);
        Runnable runnable = this.f3495a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f3495a = new Runnable() {
            public void run() {
                C0955bf.this.smoothScrollTo(childAt.getLeft() - ((C0955bf.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0955bf.this.f3495a = null;
            }
        };
        post(this.f3495a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f3495a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f3495a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0959c mo4724a(C0664a.C0667c cVar, boolean z) {
        C0959c cVar2 = new C0959c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable((Drawable) null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f3502h));
        } else {
            cVar2.setFocusable(true);
            if (this.f3499e == null) {
                this.f3499e = new C0958b();
            }
            cVar2.setOnClickListener(this.f3499e);
        }
        return cVar2;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0959c) view).mo4743b().mo2541d();
    }

    /* renamed from: android.support.v7.widget.bf$c */
    private class C0959c extends LinearLayout {

        /* renamed from: b */
        private final int[] f3509b = {16842964};

        /* renamed from: c */
        private C0664a.C0667c f3510c;

        /* renamed from: d */
        private TextView f3511d;

        /* renamed from: e */
        private ImageView f3512e;

        /* renamed from: f */
        private View f3513f;

        public C0959c(Context context, C0664a.C0667c cVar, boolean z) {
            super(context, (AttributeSet) null, C0639a.C0640a.actionBarTabStyle);
            this.f3510c = cVar;
            C0968bn a = C0968bn.m5093a(context, (AttributeSet) null, this.f3509b, C0639a.C0640a.actionBarTabStyle, 0);
            if (a.mo4794g(0)) {
                setBackgroundDrawable(a.mo4780a(0));
            }
            a.mo4781a();
            if (z) {
                setGravity(8388627);
            }
            mo4741a();
        }

        /* renamed from: a */
        public void mo4742a(C0664a.C0667c cVar) {
            this.f3510c = cVar;
            mo4741a();
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0664a.C0667c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0664a.C0667c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0955bf.this.f3497c > 0 && getMeasuredWidth() > C0955bf.this.f3497c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0955bf.this.f3497c, 1073741824), i2);
            }
        }

        /* renamed from: a */
        public void mo4741a() {
            C0664a.C0667c cVar = this.f3510c;
            View c = cVar.mo2540c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f3513f = c;
                TextView textView = this.f3511d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f3512e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f3512e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f3513f;
            if (view != null) {
                removeView(view);
                this.f3513f = null;
            }
            Drawable a = cVar.mo2538a();
            CharSequence b = cVar.mo2539b();
            if (a != null) {
                if (this.f3512e == null) {
                    C1019q qVar = new C1019q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    qVar.setLayoutParams(layoutParams);
                    addView(qVar, 0);
                    this.f3512e = qVar;
                }
                this.f3512e.setImageDrawable(a);
                this.f3512e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f3512e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f3512e.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f3511d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C0639a.C0640a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f3511d = appCompatTextView;
                }
                this.f3511d.setText(b);
                this.f3511d.setVisibility(0);
            } else {
                TextView textView2 = this.f3511d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f3511d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f3512e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo2542e());
            }
            if (!z) {
                charSequence = cVar.mo2542e();
            }
            C0972bp.m5158a(this, charSequence);
        }

        /* renamed from: b */
        public C0664a.C0667c mo4743b() {
            return this.f3510c;
        }
    }

    /* renamed from: android.support.v7.widget.bf$a */
    private class C0957a extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        C0957a() {
        }

        public int getCount() {
            return C0955bf.this.f3496b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0959c) C0955bf.this.f3496b.getChildAt(i)).mo4743b();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0955bf.this.mo4724a((C0664a.C0667c) getItem(i), true);
            }
            ((C0959c) view).mo4742a((C0664a.C0667c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.bf$b */
    private class C0958b implements View.OnClickListener {
        C0958b() {
        }

        public void onClick(View view) {
            ((C0959c) view).mo4743b().mo2541d();
            int childCount = C0955bf.this.f3496b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0955bf.this.f3496b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }
}
