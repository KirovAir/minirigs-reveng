package android.support.p015d;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.d.ab */
class C0171ab implements C0172ac {

    /* renamed from: a */
    private final ViewOverlay f584a;

    C0171ab(View view) {
        this.f584a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo570a(Drawable drawable) {
        this.f584a.add(drawable);
    }

    /* renamed from: b */
    public void mo571b(Drawable drawable) {
        this.f584a.remove(drawable);
    }
}
