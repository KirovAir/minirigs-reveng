package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p034f.C0508a;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.widget.C0616b;
import android.support.p026v4.widget.C0630m;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements C0593q, C0616b {

    /* renamed from: b */
    private final C1004g f2745b;

    /* renamed from: c */
    private final C1034z f2746c;

    /* renamed from: d */
    private Future<C0508a> f2747d;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f2745b = new C1004g(this);
        this.f2745b.mo4901a(attributeSet, i);
        this.f2746c = new C1034z(this);
        this.f2746c.mo5049a(attributeSet, i);
        this.f2746c.mo5044a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5048a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f2745b;
        if (gVar != null) {
            gVar.mo4904c();
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5044a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5052a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f1920a) {
            super.setTextSize(i, f);
            return;
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5046a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2746c != null && !f1920a && this.f2746c.mo5055c()) {
            this.f2746c.mo5054b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1920a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5045a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1920a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5047a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1920a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            zVar.mo5053a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!f1920a) {
            C1034z zVar = this.f2746c;
            if (zVar != null) {
                return zVar.mo5056d();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (f1920a) {
            return super.getAutoSizeStepGranularity();
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            return zVar.mo5057e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1920a) {
            return super.getAutoSizeMinTextSize();
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            return zVar.mo5058f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f1920a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            return zVar.mo5059g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f1920a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1034z zVar = this.f2746c;
        if (zVar != null) {
            return zVar.mo5060h();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1016n.m5360a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0630m.m2805b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0630m.m2807c(this, i);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return C0630m.m2798a((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0630m.m2804b(this);
    }

    public void setLineHeight(int i) {
        C0630m.m2809d(this, i);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0630m.m2799a((TextView) this, callback));
    }

    public C0508a.C0509a getTextMetricsParamsCompat() {
        return C0630m.m2806c(this);
    }

    public void setTextMetricsParamsCompat(C0508a.C0509a aVar) {
        C0630m.m2802a((TextView) this, aVar);
    }

    public void setPrecomputedText(C0508a aVar) {
        C0630m.m2803a((TextView) this, aVar);
    }

    /* renamed from: a */
    private void mo968a() {
        Future<C0508a> future = this.f2747d;
        if (future != null) {
            try {
                this.f2747d = null;
                C0630m.m2803a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public CharSequence getText() {
        mo968a();
        return super.getText();
    }

    public void setTextFuture(Future<C0508a> future) {
        this.f2747d = future;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo968a();
        super.onMeasure(i, i2);
    }
}
