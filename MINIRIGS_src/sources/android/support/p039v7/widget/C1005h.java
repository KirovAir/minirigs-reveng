package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.widget.C0616b;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.h */
public class C1005h extends Button implements C0593q, C0616b {

    /* renamed from: b */
    private final C1004g f3689b;

    /* renamed from: c */
    private final C1034z f3690c;

    public C1005h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.buttonStyle);
    }

    public C1005h(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f3689b = new C1004g(this);
        this.f3689b.mo4901a(attributeSet, i);
        this.f3690c = new C1034z(this);
        this.f3690c.mo5049a(attributeSet, i);
        this.f3690c.mo5044a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f3689b;
        if (gVar != null) {
            gVar.mo4904c();
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5044a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5048a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5052a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f1920a) {
            super.setTextSize(i, f);
            return;
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5046a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f3690c != null && !f1920a && this.f3690c.mo5055c()) {
            this.f3690c.mo5054b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1920a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5045a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1920a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5047a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1920a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5053a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!f1920a) {
            C1034z zVar = this.f3690c;
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
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            return zVar.mo5057e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1920a) {
            return super.getAutoSizeMinTextSize();
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            return zVar.mo5058f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f1920a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            return zVar.mo5059g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f1920a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            return zVar.mo5060h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        C1034z zVar = this.f3690c;
        if (zVar != null) {
            zVar.mo5051a(z);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0630m.m2799a((TextView) this, callback));
    }
}
