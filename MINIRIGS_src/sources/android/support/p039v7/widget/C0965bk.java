package android.support.p039v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.bk */
public class C0965bk extends ContextWrapper {

    /* renamed from: a */
    private static final Object f3545a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0965bk>> f3546b;

    /* renamed from: c */
    private final Resources f3547c;

    /* renamed from: d */
    private final Resources.Theme f3548d;

    /* renamed from: a */
    public static Context m5088a(Context context) {
        if (!m5089b(context)) {
            return context;
        }
        synchronized (f3545a) {
            if (f3546b == null) {
                f3546b = new ArrayList<>();
            } else {
                for (int size = f3546b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f3546b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3546b.remove(size);
                    }
                }
                for (int size2 = f3546b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f3546b.get(size2);
                    C0965bk bkVar = weakReference2 != null ? (C0965bk) weakReference2.get() : null;
                    if (bkVar != null && bkVar.getBaseContext() == context) {
                        return bkVar;
                    }
                }
            }
            C0965bk bkVar2 = new C0965bk(context);
            f3546b.add(new WeakReference(bkVar2));
            return bkVar2;
        }
    }

    /* renamed from: b */
    private static boolean m5089b(Context context) {
        if ((context instanceof C0965bk) || (context.getResources() instanceof C0967bm) || (context.getResources() instanceof C0977bs)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0977bs.m5172a()) {
            return true;
        }
        return false;
    }

    private C0965bk(Context context) {
        super(context);
        if (C0977bs.m5172a()) {
            this.f3547c = new C0977bs(this, context.getResources());
            this.f3548d = this.f3547c.newTheme();
            this.f3548d.setTo(context.getTheme());
            return;
        }
        this.f3547c = new C0967bm(this, context.getResources());
        this.f3548d = null;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3548d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f3548d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.f3547c;
    }

    public AssetManager getAssets() {
        return this.f3547c.getAssets();
    }
}
