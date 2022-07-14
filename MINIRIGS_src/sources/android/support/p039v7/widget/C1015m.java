package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p040a.C0639a;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.m */
public class C1015m extends EditText implements C0593q {

    /* renamed from: a */
    private final C1004g f3715a;

    /* renamed from: b */
    private final C1034z f3716b;

    public C1015m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.editTextStyle);
    }

    public C1015m(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f3715a = new C1004g(this);
        this.f3715a.mo4901a(attributeSet, i);
        this.f3716b = new C1034z(this);
        this.f3716b.mo5049a(attributeSet, i);
        this.f3716b.mo5044a();
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f3715a;
        if (gVar != null) {
            gVar.mo4904c();
        }
        C1034z zVar = this.f3716b;
        if (zVar != null) {
            zVar.mo5044a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1034z zVar = this.f3716b;
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
