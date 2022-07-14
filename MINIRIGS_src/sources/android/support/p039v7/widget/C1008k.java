package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.widget.C0617c;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.k */
class C1008k {

    /* renamed from: a */
    private final CompoundButton f3694a;

    /* renamed from: b */
    private ColorStateList f3695b = null;

    /* renamed from: c */
    private PorterDuff.Mode f3696c = null;

    /* renamed from: d */
    private boolean f3697d = false;

    /* renamed from: e */
    private boolean f3698e = false;

    /* renamed from: f */
    private boolean f3699f;

    C1008k(CompoundButton compoundButton) {
        this.f3694a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4935a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f3694a.getContext().obtainStyledAttributes(attributeSet, C0639a.C0649j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0639a.C0649j.CompoundButton_android_button, 0)) != 0) {
                this.f3694a.setButtonDrawable(C0705a.m3168b(this.f3694a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.CompoundButton_buttonTint)) {
                C0617c.m2756a(this.f3694a, obtainStyledAttributes.getColorStateList(C0639a.C0649j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.CompoundButton_buttonTintMode)) {
                C0617c.m2757a(this.f3694a, C0867al.m4294a(obtainStyledAttributes.getInt(C0639a.C0649j.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4933a(ColorStateList colorStateList) {
        this.f3695b = colorStateList;
        this.f3697d = true;
        mo4938d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo4932a() {
        return this.f3695b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4934a(PorterDuff.Mode mode) {
        this.f3696c = mode;
        this.f3698e = true;
        mo4938d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo4936b() {
        return this.f3696c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4937c() {
        if (this.f3699f) {
            this.f3699f = false;
            return;
        }
        this.f3699f = true;
        mo4938d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4938d() {
        Drawable a = C0617c.m2755a(this.f3694a);
        if (a == null) {
            return;
        }
        if (this.f3697d || this.f3698e) {
            Drawable mutate = C0540a.m2390g(a).mutate();
            if (this.f3697d) {
                C0540a.m2379a(mutate, this.f3695b);
            }
            if (this.f3698e) {
                C0540a.m2382a(mutate, this.f3696c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3694a.getDrawableState());
            }
            this.f3694a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p026v4.widget.C0617c.m2755a(r2.f3694a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4931a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f3694a
            android.graphics.drawable.Drawable r0 = android.support.p026v4.widget.C0617c.m2755a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C1008k.mo4931a(int):int");
    }
}
