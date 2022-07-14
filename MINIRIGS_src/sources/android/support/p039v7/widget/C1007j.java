package android.support.p039v7.widget;

import android.content.Context;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.j */
public class C1007j extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f3692a = {16843016};

    /* renamed from: b */
    private final C1034z f3693b;

    public C1007j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C1007j(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f3693b = new C1034z(this);
        this.f3693b.mo5049a(attributeSet, i);
        this.f3693b.mo5044a();
        C0968bn a = C0968bn.m5093a(getContext(), attributeSet, f3692a, i, 0);
        setCheckMarkDrawable(a.mo4780a(0));
        a.mo4781a();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0705a.m3168b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1034z zVar = this.f3693b;
        if (zVar != null) {
            zVar.mo5048a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1034z zVar = this.f3693b;
        if (zVar != null) {
            zVar.mo5044a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1016n.m5360a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0630m.m2799a((TextView) this, callback));
    }
}
