package android.support.design.widget;

import android.widget.ImageButton;

/* renamed from: android.support.design.widget.o */
public class C0390o extends ImageButton {

    /* renamed from: a */
    private int f1291a;

    public void setVisibility(int i) {
        mo1442a(i, true);
    }

    /* renamed from: a */
    public final void mo1442a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1291a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1291a;
    }
}
