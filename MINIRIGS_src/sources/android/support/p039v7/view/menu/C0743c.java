package android.support.p039v7.view.menu;

import android.content.Context;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p029b.p030a.C0490c;
import android.support.p026v4.p035g.C0511a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0743c<T> extends C0744d<T> {

    /* renamed from: a */
    final Context f2480a;

    /* renamed from: c */
    private Map<C0489b, MenuItem> f2481c;

    /* renamed from: d */
    private Map<C0490c, SubMenu> f2482d;

    C0743c(Context context, T t) {
        super(t);
        this.f2480a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo2993a(MenuItem menuItem) {
        if (!(menuItem instanceof C0489b)) {
            return menuItem;
        }
        C0489b bVar = (C0489b) menuItem;
        if (this.f2481c == null) {
            this.f2481c = new C0511a();
        }
        MenuItem menuItem2 = this.f2481c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0774q.m3584a(this.f2480a, bVar);
        this.f2481c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo2994a(SubMenu subMenu) {
        if (!(subMenu instanceof C0490c)) {
            return subMenu;
        }
        C0490c cVar = (C0490c) subMenu;
        if (this.f2482d == null) {
            this.f2482d = new C0511a();
        }
        SubMenu subMenu2 = this.f2482d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C0774q.m3585a(this.f2480a, cVar);
        this.f2482d.put(cVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2995a() {
        Map<C0489b, MenuItem> map = this.f2481c;
        if (map != null) {
            map.clear();
        }
        Map<C0490c, SubMenu> map2 = this.f2482d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2996a(int i) {
        Map<C0489b, MenuItem> map = this.f2481c;
        if (map != null) {
            Iterator<C0489b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2997b(int i) {
        Map<C0489b, MenuItem> map = this.f2481c;
        if (map != null) {
            Iterator<C0489b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
