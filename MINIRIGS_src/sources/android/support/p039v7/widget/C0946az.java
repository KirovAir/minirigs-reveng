package android.support.p039v7.widget;

import android.os.Bundle;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.p037a.C0563c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.az */
public class C0946az extends C0570b {

    /* renamed from: a */
    final C0904ay f3452a;

    /* renamed from: b */
    final C0570b f3453b = new C0947a(this);

    public C0946az(C0904ay ayVar) {
        this.f3452a = ayVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4630b() {
        return this.f3452a.mo4342v();
    }

    /* renamed from: a */
    public boolean mo1110a(View view, int i, Bundle bundle) {
        if (super.mo1110a(view, i, bundle)) {
            return true;
        }
        if (mo4630b() || this.f3452a.getLayoutManager() == null) {
            return false;
        }
        return this.f3452a.getLayoutManager().mo4432a(i, bundle);
    }

    /* renamed from: a */
    public void mo981a(View view, C0563c cVar) {
        super.mo981a(view, cVar);
        cVar.mo2202a((CharSequence) C0904ay.class.getName());
        if (!mo4630b() && this.f3452a.getLayoutManager() != null) {
            this.f3452a.getLayoutManager().mo4416a(cVar);
        }
    }

    /* renamed from: a */
    public void mo1161a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1161a(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0904ay.class.getName());
        if ((view instanceof C0904ay) && !mo4630b()) {
            C0904ay ayVar = (C0904ay) view;
            if (ayVar.getLayoutManager() != null) {
                ayVar.getLayoutManager().mo3551a(accessibilityEvent);
            }
        }
    }

    /* renamed from: c */
    public C0570b mo4631c() {
        return this.f3453b;
    }

    /* renamed from: android.support.v7.widget.az$a */
    public static class C0947a extends C0570b {

        /* renamed from: a */
        final C0946az f3454a;

        public C0947a(C0946az azVar) {
            this.f3454a = azVar;
        }

        /* renamed from: a */
        public void mo981a(View view, C0563c cVar) {
            super.mo981a(view, cVar);
            if (!this.f3454a.mo4630b() && this.f3454a.f3452a.getLayoutManager() != null) {
                this.f3454a.f3452a.getLayoutManager().mo4429a(view, cVar);
            }
        }

        /* renamed from: a */
        public boolean mo1110a(View view, int i, Bundle bundle) {
            if (super.mo1110a(view, i, bundle)) {
                return true;
            }
            if (this.f3454a.mo4630b() || this.f3454a.f3452a.getLayoutManager() == null) {
                return false;
            }
            return this.f3454a.f3452a.getLayoutManager().mo4441a(view, i, bundle);
        }
    }
}
