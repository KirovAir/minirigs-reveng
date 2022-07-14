package android.support.p039v7.p043c.p044a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0540a;

/* renamed from: android.support.v7.c.a.c */
public class C0719c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f2339a;

    public C0719c(Drawable drawable) {
        mo2802a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f2339a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2339a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f2339a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f2339a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f2339a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2339a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f2339a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2339a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f2339a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f2339a.setState(iArr);
    }

    public int[] getState() {
        return this.f2339a.getState();
    }

    public void jumpToCurrentState() {
        C0540a.m2375a(this.f2339a);
    }

    public Drawable getCurrent() {
        return this.f2339a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2339a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f2339a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f2339a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f2339a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f2339a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f2339a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f2339a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f2339a.getPadding(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2339a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        C0540a.m2383a(this.f2339a, z);
    }

    public boolean isAutoMirrored() {
        return C0540a.m2384b(this.f2339a);
    }

    public void setTint(int i) {
        C0540a.m2377a(this.f2339a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0540a.m2379a(this.f2339a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0540a.m2382a(this.f2339a, mode);
    }

    public void setHotspot(float f, float f2) {
        C0540a.m2376a(this.f2339a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0540a.m2378a(this.f2339a, i, i2, i3, i4);
    }

    /* renamed from: b */
    public Drawable mo2803b() {
        return this.f2339a;
    }

    /* renamed from: a */
    public void mo2802a(Drawable drawable) {
        Drawable drawable2 = this.f2339a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2339a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
