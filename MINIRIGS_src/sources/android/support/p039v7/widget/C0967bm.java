package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bm */
class C0967bm extends C0949ba {

    /* renamed from: a */
    private final WeakReference<Context> f3553a;

    public C0967bm(Context context, Resources resources) {
        super(resources);
        this.f3553a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f3553a.get();
        if (!(drawable == null || context == null)) {
            C1009l.m5329a();
            C1009l.m5335a(context, i, drawable);
        }
        return drawable;
    }
}
