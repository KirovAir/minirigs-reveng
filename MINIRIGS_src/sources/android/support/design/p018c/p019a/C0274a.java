package android.support.design.p018c.p019a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.p018c.C0276c;
import android.support.design.p018c.C0278d;
import android.support.p039v7.widget.C0843ab;

/* renamed from: android.support.design.c.a.a */
public class C0274a extends C0843ab implements C0278d {

    /* renamed from: d */
    private final C0276c f847d;

    /* renamed from: a */
    public void mo889a() {
        this.f847d.mo904a();
    }

    /* renamed from: b */
    public void mo891b() {
        this.f847d.mo909b();
    }

    public void setRevealInfo(C0278d.C0283d dVar) {
        this.f847d.mo908a(dVar);
    }

    public C0278d.C0283d getRevealInfo() {
        return this.f847d.mo910c();
    }

    public void setCircularRevealScrimColor(int i) {
        this.f847d.mo905a(i);
    }

    public int getCircularRevealScrimColor() {
        return this.f847d.mo911d();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f847d.mo912e();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f847d.mo907a(drawable);
    }

    public void draw(Canvas canvas) {
        C0276c cVar = this.f847d;
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
        C0276c cVar = this.f847d;
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
