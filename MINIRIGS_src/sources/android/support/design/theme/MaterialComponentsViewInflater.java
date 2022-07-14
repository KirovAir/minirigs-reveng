package android.support.design.theme;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.design.p017b.C0261a;
import android.support.p039v7.app.AppCompatViewInflater;
import android.support.p039v7.widget.C1005h;
import android.util.AttributeSet;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    public C1005h createButton(Context context, AttributeSet attributeSet) {
        return new C0261a(context, attributeSet);
    }
}
