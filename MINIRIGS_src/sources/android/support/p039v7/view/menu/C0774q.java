package android.support.p039v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.p026v4.p029b.p030a.C0488a;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p029b.p030a.C0490c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0774q {
    /* renamed from: a */
    public static Menu m3583a(Context context, C0488a aVar) {
        return new C0775r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m3584a(Context context, C0489b bVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0765l(context, bVar);
        }
        return new C0760k(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m3585a(Context context, C0490c cVar) {
        return new C0781v(context, cVar);
    }
}
