package android.support.p039v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.bp */
public class C0972bp {
    /* renamed from: a */
    public static void m5158a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0973bq.m5160a(view, charSequence);
        }
    }
}
