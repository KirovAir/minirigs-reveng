package android.support.p039v7.view.menu;

import android.content.Context;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p036h.C0576c;
import android.support.p039v7.view.menu.C0760k;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C0765l extends C0760k {
    C0765l(Context context, C0489b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0760k.C0761a mo3178a(ActionProvider actionProvider) {
        return new C0766a(this.f2480a, actionProvider);
    }

    /* renamed from: android.support.v7.view.menu.l$a */
    class C0766a extends C0760k.C0761a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        C0576c.C0578b f2607c;

        public C0766a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo2258a(MenuItem menuItem) {
            return this.f2602a.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo2263b() {
            return this.f2602a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo2264c() {
            return this.f2602a.isVisible();
        }

        /* renamed from: a */
        public void mo2260a(C0576c.C0578b bVar) {
            this.f2607c = bVar;
            this.f2602a.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0576c.C0578b bVar = this.f2607c;
            if (bVar != null) {
                bVar.mo2269a(z);
            }
        }
    }
}
