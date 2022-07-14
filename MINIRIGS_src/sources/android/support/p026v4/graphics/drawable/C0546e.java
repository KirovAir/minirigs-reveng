package android.support.p026v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p026v4.graphics.drawable.C0543d;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.e */
class C0546e extends C0543d {

    /* renamed from: d */
    private static Method f1784d;

    C0546e(Drawable drawable) {
        super(drawable);
        m2401d();
    }

    C0546e(C0543d.C0544a aVar, Resources resources) {
        super(aVar, resources);
        m2401d();
    }

    public void setHotspot(float f, float f2) {
        this.f1775c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1775c.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.f1775c.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f1775c.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2132c()) {
            super.setTintList(colorStateList);
        } else {
            this.f1775c.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (mo2132c()) {
            super.setTint(i);
        } else {
            this.f1775c.setTint(i);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2132c()) {
            super.setTintMode(mode);
        } else {
            this.f1775c.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2132c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1775c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0543d.C0544a mo2131b() {
        return new C0547a(this.f1774b, (Resources) null);
    }

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    private static class C0547a extends C0543d.C0544a {
        C0547a(C0543d.C0544a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0546e(this, resources);
        }
    }

    /* renamed from: d */
    private void m2401d() {
        if (f1784d == null) {
            try {
                f1784d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
