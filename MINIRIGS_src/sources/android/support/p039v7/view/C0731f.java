package android.support.p039v7.view;

import android.content.Context;
import android.support.p026v4.p029b.p030a.C0488a;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p035g.C0532l;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.view.menu.C0774q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0731f extends ActionMode {

    /* renamed from: a */
    final Context f2358a;

    /* renamed from: b */
    final C0726b f2359b;

    public C0731f(Context context, C0726b bVar) {
        this.f2358a = context;
        this.f2359b = bVar;
    }

    public Object getTag() {
        return this.f2359b.mo2842j();
    }

    public void setTag(Object obj) {
        this.f2359b.mo2841a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2359b.mo2702b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2359b.mo2698a(charSequence);
    }

    public void invalidate() {
        this.f2359b.mo2704d();
    }

    public void finish() {
        this.f2359b.mo2703c();
    }

    public Menu getMenu() {
        return C0774q.m3583a(this.f2358a, (C0488a) this.f2359b.mo2700b());
    }

    public CharSequence getTitle() {
        return this.f2359b.mo2706f();
    }

    public void setTitle(int i) {
        this.f2359b.mo2696a(i);
    }

    public CharSequence getSubtitle() {
        return this.f2359b.mo2707g();
    }

    public void setSubtitle(int i) {
        this.f2359b.mo2701b(i);
    }

    public View getCustomView() {
        return this.f2359b.mo2709i();
    }

    public void setCustomView(View view) {
        this.f2359b.mo2697a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f2359b.mo2695a();
    }

    public boolean getTitleOptionalHint() {
        return this.f2359b.mo2843k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2359b.mo2699a(z);
    }

    public boolean isTitleOptional() {
        return this.f2359b.mo2708h();
    }

    /* renamed from: android.support.v7.view.f$a */
    public static class C0732a implements C0726b.C0727a {

        /* renamed from: a */
        final ActionMode.Callback f2360a;

        /* renamed from: b */
        final Context f2361b;

        /* renamed from: c */
        final ArrayList<C0731f> f2362c = new ArrayList<>();

        /* renamed from: d */
        final C0532l<Menu, Menu> f2363d = new C0532l<>();

        public C0732a(Context context, ActionMode.Callback callback) {
            this.f2361b = context;
            this.f2360a = callback;
        }

        /* renamed from: a */
        public boolean mo2642a(C0726b bVar, Menu menu) {
            return this.f2360a.onCreateActionMode(mo2871b(bVar), m3308a(menu));
        }

        /* renamed from: b */
        public boolean mo2644b(C0726b bVar, Menu menu) {
            return this.f2360a.onPrepareActionMode(mo2871b(bVar), m3308a(menu));
        }

        /* renamed from: a */
        public boolean mo2643a(C0726b bVar, MenuItem menuItem) {
            return this.f2360a.onActionItemClicked(mo2871b(bVar), C0774q.m3584a(this.f2361b, (C0489b) menuItem));
        }

        /* renamed from: a */
        public void mo2641a(C0726b bVar) {
            this.f2360a.onDestroyActionMode(mo2871b(bVar));
        }

        /* renamed from: a */
        private Menu m3308a(Menu menu) {
            Menu menu2 = this.f2363d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0774q.m3583a(this.f2361b, (C0488a) menu);
            this.f2363d.put(menu, a);
            return a;
        }

        /* renamed from: b */
        public ActionMode mo2871b(C0726b bVar) {
            int size = this.f2362c.size();
            for (int i = 0; i < size; i++) {
                C0731f fVar = this.f2362c.get(i);
                if (fVar != null && fVar.f2359b == bVar) {
                    return fVar;
                }
            }
            C0731f fVar2 = new C0731f(this.f2361b, bVar);
            this.f2362c.add(fVar2);
            return fVar2;
        }
    }
}
