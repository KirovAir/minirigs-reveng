package android.support.p039v7.view;

import android.content.Context;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0730e extends C0726b implements C0754h.C0755a {

    /* renamed from: a */
    private Context f2351a;

    /* renamed from: b */
    private ActionBarContextView f2352b;

    /* renamed from: c */
    private C0726b.C0727a f2353c;

    /* renamed from: d */
    private WeakReference<View> f2354d;

    /* renamed from: e */
    private boolean f2355e;

    /* renamed from: f */
    private boolean f2356f;

    /* renamed from: g */
    private C0754h f2357g;

    public C0730e(Context context, ActionBarContextView actionBarContextView, C0726b.C0727a aVar, boolean z) {
        this.f2351a = context;
        this.f2352b = actionBarContextView;
        this.f2353c = aVar;
        this.f2357g = new C0754h(actionBarContextView.getContext()).mo3040a(1);
        this.f2357g.mo3048a((C0754h.C0755a) this);
        this.f2356f = z;
    }

    /* renamed from: b */
    public void mo2702b(CharSequence charSequence) {
        this.f2352b.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo2698a(CharSequence charSequence) {
        this.f2352b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo2696a(int i) {
        mo2702b((CharSequence) this.f2351a.getString(i));
    }

    /* renamed from: b */
    public void mo2701b(int i) {
        mo2698a((CharSequence) this.f2351a.getString(i));
    }

    /* renamed from: a */
    public void mo2699a(boolean z) {
        super.mo2699a(z);
        this.f2352b.setTitleOptional(z);
    }

    /* renamed from: h */
    public boolean mo2708h() {
        return this.f2352b.mo3326d();
    }

    /* renamed from: a */
    public void mo2697a(View view) {
        this.f2352b.setCustomView(view);
        this.f2354d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: d */
    public void mo2704d() {
        this.f2353c.mo2644b(this, this.f2357g);
    }

    /* renamed from: c */
    public void mo2703c() {
        if (!this.f2355e) {
            this.f2355e = true;
            this.f2352b.sendAccessibilityEvent(32);
            this.f2353c.mo2641a(this);
        }
    }

    /* renamed from: b */
    public Menu mo2700b() {
        return this.f2357g;
    }

    /* renamed from: f */
    public CharSequence mo2706f() {
        return this.f2352b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo2707g() {
        return this.f2352b.getSubtitle();
    }

    /* renamed from: i */
    public View mo2709i() {
        WeakReference<View> weakReference = this.f2354d;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public MenuInflater mo2695a() {
        return new C0733g(this.f2352b.getContext());
    }

    /* renamed from: a */
    public boolean mo2610a(C0754h hVar, MenuItem menuItem) {
        return this.f2353c.mo2643a((C0726b) this, menuItem);
    }

    /* renamed from: a */
    public void mo2607a(C0754h hVar) {
        mo2704d();
        this.f2352b.mo3323a();
    }
}
