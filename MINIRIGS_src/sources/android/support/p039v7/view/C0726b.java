package android.support.p039v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0726b {

    /* renamed from: a */
    private Object f2344a;

    /* renamed from: b */
    private boolean f2345b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0727a {
        /* renamed from: a */
        void mo2641a(C0726b bVar);

        /* renamed from: a */
        boolean mo2642a(C0726b bVar, Menu menu);

        /* renamed from: a */
        boolean mo2643a(C0726b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo2644b(C0726b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo2695a();

    /* renamed from: a */
    public abstract void mo2696a(int i);

    /* renamed from: a */
    public abstract void mo2697a(View view);

    /* renamed from: a */
    public abstract void mo2698a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo2700b();

    /* renamed from: b */
    public abstract void mo2701b(int i);

    /* renamed from: b */
    public abstract void mo2702b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo2703c();

    /* renamed from: d */
    public abstract void mo2704d();

    /* renamed from: f */
    public abstract CharSequence mo2706f();

    /* renamed from: g */
    public abstract CharSequence mo2707g();

    /* renamed from: h */
    public boolean mo2708h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo2709i();

    /* renamed from: a */
    public void mo2841a(Object obj) {
        this.f2344a = obj;
    }

    /* renamed from: j */
    public Object mo2842j() {
        return this.f2344a;
    }

    /* renamed from: a */
    public void mo2699a(boolean z) {
        this.f2345b = z;
    }

    /* renamed from: k */
    public boolean mo2843k() {
        return this.f2345b;
    }
}
