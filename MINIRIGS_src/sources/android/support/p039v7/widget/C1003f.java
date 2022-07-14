package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.f */
public class C1003f extends AutoCompleteTextView implements C0593q {

    /* renamed from: a */
    private static final int[] f3680a = {16843126};

    /* renamed from: b */
    private final C1004g f3681b;

    /* renamed from: c */
    private final C1034z f3682c;

    public C1003f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.autoCompleteTextViewStyle);
    }

    public C1003f(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        C0968bn a = C0968bn.m5093a(getContext(), attributeSet, f3680a, i, 0);
        if (a.mo4794g(0)) {
            setDropDownBackgroundDrawable(a.mo4780a(0));
        }
        a.mo4781a();
        this.f3681b = new C1004g(this);
        this.f3681b.mo4901a(attributeSet, i);
        this.f3682c = new C1034z(this);
        this.f3682c.mo5049a(attributeSet, i);
        this.f3682c.mo5044a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0705a.m3168b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f3681b;
        if (gVar != null) {
            gVar.mo4904c();
        }
        C1034z zVar = this.f3682c;
        if (zVar != null) {
            zVar.mo5044a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1034z zVar = this.f3682c;
        if (zVar != null) {
            zVar.mo5048a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1016n.m5360a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0630m.m2799a((TextView) this, callback));
    }
}
