package android.support.p039v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p039v7.app.C0668b;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0770o;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: android.support.v7.view.menu.i */
class C0757i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, C0770o.C0771a {

    /* renamed from: a */
    C0751f f2565a;

    /* renamed from: b */
    private C0754h f2566b;

    /* renamed from: c */
    private C0668b f2567c;

    /* renamed from: d */
    private C0770o.C0771a f2568d;

    public C0757i(C0754h hVar) {
        this.f2566b = hVar;
    }

    /* renamed from: a */
    public void mo3114a(IBinder iBinder) {
        C0754h hVar = this.f2566b;
        C0668b.C0669a aVar = new C0668b.C0669a(hVar.mo3085f());
        this.f2565a = new C0751f(aVar.mo2547a(), C0639a.C0646g.abc_list_menu_item_layout);
        this.f2565a.mo2983a((C0770o.C0771a) this);
        this.f2566b.mo3050a((C0770o) this.f2565a);
        aVar.mo2551a(this.f2565a.mo3021a(), this);
        View p = hVar.mo3099p();
        if (p != null) {
            aVar.mo2550a(p);
        } else {
            aVar.mo2549a(hVar.mo3098o()).mo2552a(hVar.mo3097n());
        }
        aVar.mo2548a((DialogInterface.OnKeyListener) this);
        this.f2567c = aVar.mo2553b();
        this.f2567c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2567c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2567c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2567c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2567c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2566b.mo3054a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2566b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo3113a() {
        C0668b bVar = this.f2567c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2565a.mo2981a(this.f2566b, true);
    }

    /* renamed from: a */
    public void mo2639a(C0754h hVar, boolean z) {
        if (z || hVar == this.f2566b) {
            mo3113a();
        }
        C0770o.C0771a aVar = this.f2568d;
        if (aVar != null) {
            aVar.mo2639a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2640a(C0754h hVar) {
        C0770o.C0771a aVar = this.f2568d;
        if (aVar != null) {
            return aVar.mo2640a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2566b.mo3056a((MenuItem) (C0758j) this.f2565a.mo3021a().getItem(i), 0);
    }
}
