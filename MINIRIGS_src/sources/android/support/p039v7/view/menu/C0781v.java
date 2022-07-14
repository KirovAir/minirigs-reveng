package android.support.p039v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p029b.p030a.C0490c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0781v extends C0775r implements SubMenu {
    C0781v(Context context, C0490c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public C0490c mo3293b() {
        return (C0490c) this.f2483b;
    }

    public SubMenu setHeaderTitle(int i) {
        mo3293b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo3293b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        mo3293b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo3293b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo3293b().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        mo3293b().clearHeader();
    }

    public SubMenu setIcon(int i) {
        mo3293b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo3293b().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return mo2993a(mo3293b().getItem());
    }
}
