package android.support.design.p018c;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.p018c.C0278d;
import android.widget.FrameLayout;

/* renamed from: android.support.design.c.b */
public class C0275b extends FrameLayout implements C0278d {

    /* renamed from: a */
    private final C0276c f848a;

    /* renamed from: a */
    public void mo889a() {
        this.f848a.mo904a();
    }

    /* renamed from: b */
    public void mo891b() {
        this.f848a.mo909b();
    }

    public C0278d.C0283d getRevealInfo() {
        return this.f848a.mo910c();
    }

    public void setRevealInfo(C0278d.C0283d dVar) {
        this.f848a.mo908a(dVar);
    }

    public int getCircularRevealScrimColor() {
        return this.f848a.mo911d();
    }

    public void setCircularRevealScrimColor(int i) {
        this.f848a.mo905a(i);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f848a.mo912e();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f848a.mo907a(drawable);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C0276c cVar = this.f848a;
        if (cVar != null) {
            cVar.mo906a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: a */
    public void mo890a(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        C0276c cVar = this.f848a;
        if (cVar != null) {
            return cVar.mo913f();
        }
        return super.isOpaque();
    }

    /* renamed from: c */
    public boolean mo892c() {
        return super.isOpaque();
    }
}
