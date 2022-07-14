package android.support.p026v4.p036h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.h.c */
public abstract class C0576c {

    /* renamed from: a */
    private final Context f1816a;

    /* renamed from: b */
    private C0577a f1817b;

    /* renamed from: c */
    private C0578b f1818c;

    /* renamed from: android.support.v4.h.c$a */
    public interface C0577a {
        /* renamed from: a */
        void mo2268a(boolean z);
    }

    /* renamed from: android.support.v4.h.c$b */
    public interface C0578b {
        /* renamed from: a */
        void mo2269a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo2257a();

    /* renamed from: a */
    public void mo2261a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo2263b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo2264c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2265d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo2266e() {
        return false;
    }

    public C0576c(Context context) {
        this.f1816a = context;
    }

    /* renamed from: a */
    public View mo2258a(MenuItem menuItem) {
        return mo2257a();
    }

    /* renamed from: a */
    public void mo2262a(boolean z) {
        C0577a aVar = this.f1817b;
        if (aVar != null) {
            aVar.mo2268a(z);
        }
    }

    /* renamed from: a */
    public void mo2259a(C0577a aVar) {
        this.f1817b = aVar;
    }

    /* renamed from: a */
    public void mo2260a(C0578b bVar) {
        if (!(this.f1818c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1818c = bVar;
    }

    /* renamed from: f */
    public void mo2267f() {
        this.f1818c = null;
        this.f1817b = null;
    }
}
