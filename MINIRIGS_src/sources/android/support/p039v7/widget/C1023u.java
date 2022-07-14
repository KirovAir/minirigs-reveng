package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.widget.C0632n;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: android.support.v7.widget.u */
public class C1023u extends RadioButton implements C0632n {

    /* renamed from: a */
    private final C1008k f3733a;

    /* renamed from: b */
    private final C1034z f3734b;

    public C1023u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.radioButtonStyle);
    }

    public C1023u(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f3733a = new C1008k(this);
        this.f3733a.mo4935a(attributeSet, i);
        this.f3734b = new C1034z(this);
        this.f3734b.mo5049a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1008k kVar = this.f3733a;
        if (kVar != null) {
            kVar.mo4937c();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0705a.m3168b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1008k kVar = this.f3733a;
        return kVar != null ? kVar.mo4931a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1008k kVar = this.f3733a;
        if (kVar != null) {
            kVar.mo4933a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        C1008k kVar = this.f3733a;
        if (kVar != null) {
            return kVar.mo4932a();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1008k kVar = this.f3733a;
        if (kVar != null) {
            kVar.mo4934a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1008k kVar = this.f3733a;
        if (kVar != null) {
            return kVar.mo4936b();
        }
        return null;
    }
}
