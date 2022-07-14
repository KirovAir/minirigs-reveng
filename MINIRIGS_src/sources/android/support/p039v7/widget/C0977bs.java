package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bs */
public class C0977bs extends Resources {

    /* renamed from: a */
    private static boolean f3599a = false;

    /* renamed from: b */
    private final WeakReference<Context> f3600b;

    /* renamed from: a */
    public static boolean m5172a() {
        return m5173b() && Build.VERSION.SDK_INT <= 20;
    }

    public C0977bs(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3600b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f3600b.get();
        if (context != null) {
            return C1009l.m5329a().mo4941a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo4815a(int i) {
        return super.getDrawable(i);
    }

    /* renamed from: b */
    public static boolean m5173b() {
        return f3599a;
    }
}
