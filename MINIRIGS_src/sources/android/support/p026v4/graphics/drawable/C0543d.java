package android.support.p026v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.d */
class C0543d extends Drawable implements Drawable.Callback, C0541b, C0542c {

    /* renamed from: a */
    static final PorterDuff.Mode f1773a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0544a f1774b;

    /* renamed from: c */
    Drawable f1775c;

    /* renamed from: d */
    private int f1776d;

    /* renamed from: e */
    private PorterDuff.Mode f1777e;

    /* renamed from: f */
    private boolean f1778f;

    /* renamed from: g */
    private boolean f1779g;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2132c() {
        return true;
    }

    C0543d(C0544a aVar, Resources resources) {
        this.f1774b = aVar;
        m2394a(resources);
    }

    C0543d(Drawable drawable) {
        this.f1774b = mo2131b();
        mo2130a(drawable);
    }

    /* renamed from: a */
    private void m2394a(Resources resources) {
        C0544a aVar = this.f1774b;
        if (aVar != null && aVar.f1781b != null) {
            mo2130a(this.f1774b.f1781b.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.f1775c.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f1775c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1775c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f1775c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0544a aVar = this.f1774b;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f1775c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f1775c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1775c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f1775c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1775c.setColorFilter(colorFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1774b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo2132c()
            if (r0 == 0) goto L_0x000d
            android.support.v4.graphics.drawable.d$a r0 = r1.f1774b
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1782c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1775c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.graphics.drawable.C0543d.isStateful():boolean");
    }

    public boolean setState(int[] iArr) {
        return m2395a(iArr) || this.f1775c.setState(iArr);
    }

    public int[] getState() {
        return this.f1775c.getState();
    }

    public Drawable getCurrent() {
        return this.f1775c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1775c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f1775c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f1775c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f1775c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1775c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f1775c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f1775c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f1775c.getPadding(rect);
    }

    public void setAutoMirrored(boolean z) {
        this.f1775c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.f1775c.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        C0544a aVar = this.f1774b;
        if (aVar == null || !aVar.mo2162a()) {
            return null;
        }
        this.f1774b.f1780a = getChangingConfigurations();
        return this.f1774b;
    }

    public Drawable mutate() {
        if (!this.f1779g && super.mutate() == this) {
            this.f1774b = mo2131b();
            Drawable drawable = this.f1775c;
            if (drawable != null) {
                drawable.mutate();
            }
            C0544a aVar = this.f1774b;
            if (aVar != null) {
                Drawable drawable2 = this.f1775c;
                aVar.f1781b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1779g = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0544a mo2131b() {
        return new C0545b(this.f1774b, (Resources) null);
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
        return this.f1775c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1774b.f1782c = colorStateList;
        m2395a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1774b.f1783d = mode;
        m2395a(getState());
    }

    /* renamed from: a */
    private boolean m2395a(int[] iArr) {
        if (!mo2132c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1774b.f1782c;
        PorterDuff.Mode mode = this.f1774b.f1783d;
        if (colorStateList == null || mode == null) {
            this.f1778f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1778f && colorForState == this.f1776d && mode == this.f1777e)) {
                setColorFilter(colorForState, mode);
                this.f1776d = colorForState;
                this.f1777e = mode;
                this.f1778f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo2129a() {
        return this.f1775c;
    }

    /* renamed from: a */
    public final void mo2130a(Drawable drawable) {
        Drawable drawable2 = this.f1775c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1775c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0544a aVar = this.f1774b;
            if (aVar != null) {
                aVar.f1781b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    protected static abstract class C0544a extends Drawable.ConstantState {

        /* renamed from: a */
        int f1780a;

        /* renamed from: b */
        Drawable.ConstantState f1781b;

        /* renamed from: c */
        ColorStateList f1782c = null;

        /* renamed from: d */
        PorterDuff.Mode f1783d = C0543d.f1773a;

        public abstract Drawable newDrawable(Resources resources);

        C0544a(C0544a aVar, Resources resources) {
            if (aVar != null) {
                this.f1780a = aVar.f1780a;
                this.f1781b = aVar.f1781b;
                this.f1782c = aVar.f1782c;
                this.f1783d = aVar.f1783d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public int getChangingConfigurations() {
            int i = this.f1780a;
            Drawable.ConstantState constantState = this.f1781b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2162a() {
            return this.f1781b != null;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.d$b */
    private static class C0545b extends C0544a {
        C0545b(C0544a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0543d(this, resources);
        }
    }
}
