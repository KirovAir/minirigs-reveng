package android.support.design.widget;

import android.content.Context;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.widget.C1017o;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends C1017o implements Checkable {

    /* renamed from: a */
    private static final int[] f1075a = {16842912};

    /* renamed from: b */
    private boolean f1076b;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0594r.m2585a((View) this, (C0570b) new C0570b() {
            /* renamed from: a */
            public void mo1161a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo1161a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            /* renamed from: a */
            public void mo981a(View view, C0563c cVar) {
                super.mo981a(view, cVar);
                cVar.mo2204a(true);
                cVar.mo2208b(CheckableImageButton.this.isChecked());
            }
        });
    }

    public void setChecked(boolean z) {
        if (this.f1076b != z) {
            this.f1076b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.f1076b;
    }

    public void toggle() {
        setChecked(!this.f1076b);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f1076b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f1075a.length), f1075a);
        }
        return super.onCreateDrawableState(i);
    }
}
