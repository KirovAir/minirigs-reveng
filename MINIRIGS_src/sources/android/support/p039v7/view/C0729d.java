package android.support.p039v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.p039v7.p040a.C0639a;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0729d extends ContextWrapper {

    /* renamed from: a */
    private int f2346a;

    /* renamed from: b */
    private Resources.Theme f2347b;

    /* renamed from: c */
    private LayoutInflater f2348c;

    /* renamed from: d */
    private Configuration f2349d;

    /* renamed from: e */
    private Resources f2350e;

    public C0729d() {
        super((Context) null);
    }

    public C0729d(Context context, int i) {
        super(context);
        this.f2346a = i;
    }

    public C0729d(Context context, Resources.Theme theme) {
        super(context);
        this.f2347b = theme;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public Resources getResources() {
        return m3288b();
    }

    /* renamed from: b */
    private Resources m3288b() {
        if (this.f2350e == null) {
            if (this.f2349d == null) {
                this.f2350e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f2350e = createConfigurationContext(this.f2349d).getResources();
            }
        }
        return this.f2350e;
    }

    public void setTheme(int i) {
        if (this.f2346a != i) {
            this.f2346a = i;
            m3289c();
        }
    }

    /* renamed from: a */
    public int mo2846a() {
        return this.f2346a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2347b;
        if (theme != null) {
            return theme;
        }
        if (this.f2346a == 0) {
            this.f2346a = C0639a.C0648i.Theme_AppCompat_Light;
        }
        m3289c();
        return this.f2347b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2348c == null) {
            this.f2348c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2348c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2847a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: c */
    private void m3289c() {
        boolean z = this.f2347b == null;
        if (z) {
            this.f2347b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2347b.setTo(theme);
            }
        }
        mo2847a(this.f2347b, this.f2346a, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
