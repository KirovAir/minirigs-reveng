package android.support.p015d;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.d.v */
class C0235v implements C0236w {

    /* renamed from: a */
    private final ViewGroupOverlay f752a;

    C0235v(ViewGroup viewGroup) {
        this.f752a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo570a(Drawable drawable) {
        this.f752a.add(drawable);
    }

    /* renamed from: b */
    public void mo571b(Drawable drawable) {
        this.f752a.remove(drawable);
    }

    /* renamed from: a */
    public void mo738a(View view) {
        this.f752a.add(view);
    }

    /* renamed from: b */
    public void mo739b(View view) {
        this.f752a.remove(view);
    }
}
