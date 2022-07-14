package android.support.p039v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.app.C0664a;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.widget.C0855aj;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.i */
class C0694i extends C0664a {

    /* renamed from: a */
    C0855aj f2204a;

    /* renamed from: b */
    Window.Callback f2205b;

    /* renamed from: c */
    private boolean f2206c;

    /* renamed from: d */
    private boolean f2207d;

    /* renamed from: e */
    private ArrayList<C0664a.C0666b> f2208e;

    /* renamed from: f */
    private final Runnable f2209f;

    /* renamed from: a */
    public void mo2524a(boolean z) {
    }

    /* renamed from: c */
    public void mo2529c(boolean z) {
    }

    /* renamed from: d */
    public void mo2531d(boolean z) {
    }

    /* renamed from: a */
    public void mo2521a(float f) {
        C0594r.m2577a((View) this.f2204a.mo3967a(), f);
    }

    /* renamed from: b */
    public Context mo2527b() {
        return this.f2204a.mo3976b();
    }

    /* renamed from: a */
    public void mo2522a(Configuration configuration) {
        super.mo2522a(configuration);
    }

    /* renamed from: a */
    public void mo2523a(CharSequence charSequence) {
        this.f2204a.mo3974a(charSequence);
    }

    /* renamed from: a */
    public int mo2519a() {
        return this.f2204a.mo3993o();
    }

    /* renamed from: c */
    public boolean mo2530c() {
        return this.f2204a.mo3989k();
    }

    /* renamed from: d */
    public boolean mo2532d() {
        return this.f2204a.mo3990l();
    }

    /* renamed from: e */
    public boolean mo2534e() {
        this.f2204a.mo3967a().removeCallbacks(this.f2209f);
        C0594r.m2587a((View) this.f2204a.mo3967a(), this.f2209f);
        return true;
    }

    /* renamed from: f */
    public boolean mo2535f() {
        if (!this.f2204a.mo3980c()) {
            return false;
        }
        this.f2204a.mo3981d();
        return true;
    }

    /* renamed from: a */
    public boolean mo2526a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2530c();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2525a(int i, KeyEvent keyEvent) {
        Menu h = m3082h();
        if (h == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        h.setQwertyMode(z);
        return h.performShortcut(i, keyEvent, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2536g() {
        this.f2204a.mo3967a().removeCallbacks(this.f2209f);
    }

    /* renamed from: e */
    public void mo2533e(boolean z) {
        if (z != this.f2207d) {
            this.f2207d = z;
            int size = this.f2208e.size();
            for (int i = 0; i < size; i++) {
                this.f2208e.get(i).mo2537a(z);
            }
        }
    }

    /* renamed from: h */
    private Menu m3082h() {
        if (!this.f2206c) {
            this.f2204a.mo3970a((C0770o.C0771a) new C0695a(), (C0754h.C0755a) new C0696b());
            this.f2206c = true;
        }
        return this.f2204a.mo3995q();
    }

    /* renamed from: android.support.v7.app.i$a */
    private final class C0695a implements C0770o.C0771a {

        /* renamed from: b */
        private boolean f2211b;

        C0695a() {
        }

        /* renamed from: a */
        public boolean mo2640a(C0754h hVar) {
            if (C0694i.this.f2205b == null) {
                return false;
            }
            C0694i.this.f2205b.onMenuOpened(108, hVar);
            return true;
        }

        /* renamed from: a */
        public void mo2639a(C0754h hVar, boolean z) {
            if (!this.f2211b) {
                this.f2211b = true;
                C0694i.this.f2204a.mo3992n();
                if (C0694i.this.f2205b != null) {
                    C0694i.this.f2205b.onPanelClosed(108, hVar);
                }
                this.f2211b = false;
            }
        }
    }

    /* renamed from: android.support.v7.app.i$b */
    private final class C0696b implements C0754h.C0755a {
        /* renamed from: a */
        public boolean mo2610a(C0754h hVar, MenuItem menuItem) {
            return false;
        }

        C0696b() {
        }

        /* renamed from: a */
        public void mo2607a(C0754h hVar) {
            if (C0694i.this.f2205b == null) {
                return;
            }
            if (C0694i.this.f2204a.mo3987i()) {
                C0694i.this.f2205b.onPanelClosed(108, hVar);
            } else if (C0694i.this.f2205b.onPreparePanel(0, (View) null, hVar)) {
                C0694i.this.f2205b.onMenuOpened(108, hVar);
            }
        }
    }
}
