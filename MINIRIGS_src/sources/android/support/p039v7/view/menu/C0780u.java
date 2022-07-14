package android.support.p039v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p039v7.view.menu.C0754h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0780u extends C0754h implements SubMenu {

    /* renamed from: d */
    private C0754h f2646d;

    /* renamed from: e */
    private C0758j f2647e;

    public C0780u(Context context, C0754h hVar, C0758j jVar) {
        super(context);
        this.f2646d = hVar;
        this.f2647e = jVar;
    }

    public void setQwertyMode(boolean z) {
        this.f2646d.setQwertyMode(z);
    }

    /* renamed from: c */
    public boolean mo3075c() {
        return this.f2646d.mo3075c();
    }

    /* renamed from: d */
    public boolean mo3081d() {
        return this.f2646d.mo3081d();
    }

    /* renamed from: t */
    public Menu mo3292t() {
        return this.f2646d;
    }

    public MenuItem getItem() {
        return this.f2647e;
    }

    /* renamed from: a */
    public void mo3048a(C0754h.C0755a aVar) {
        this.f2646d.mo3048a(aVar);
    }

    /* renamed from: q */
    public C0754h mo3102q() {
        return this.f2646d.mo3102q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3055a(C0754h hVar, MenuItem menuItem) {
        return super.mo3055a(hVar, menuItem) || this.f2646d.mo3055a(hVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2647e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f2647e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo3041a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo3084e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo3043a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo3080d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo3042a(view);
    }

    /* renamed from: c */
    public boolean mo3076c(C0758j jVar) {
        return this.f2646d.mo3076c(jVar);
    }

    /* renamed from: d */
    public boolean mo3082d(C0758j jVar) {
        return this.f2646d.mo3082d(jVar);
    }

    /* renamed from: a */
    public String mo3046a() {
        C0758j jVar = this.f2647e;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo3046a() + ":" + itemId;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f2646d.setGroupDividerEnabled(z);
    }

    /* renamed from: b */
    public boolean mo3072b() {
        return this.f2646d.mo3072b();
    }
}
