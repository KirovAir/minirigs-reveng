package android.support.p011c.p012a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.p028a.C0406g;
import android.support.p026v4.p035g.C0511a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.c.a.c */
public class C0116c extends C0125h implements C0115b {

    /* renamed from: a */
    ArrayList<Object> f247a;

    /* renamed from: b */
    final Drawable.Callback f248b;

    /* renamed from: d */
    private C0118a f249d;

    /* renamed from: e */
    private Context f250e;

    /* renamed from: f */
    private ArgbEvaluator f251f;

    /* renamed from: g */
    private Animator.AnimatorListener f252g;

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C0116c() {
        this((Context) null, (C0118a) null, (Resources) null);
    }

    private C0116c(Context context) {
        this(context, (C0118a) null, (Resources) null);
    }

    private C0116c(Context context, C0118a aVar, Resources resources) {
        this.f251f = null;
        this.f252g = null;
        this.f247a = null;
        this.f248b = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0116c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0116c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0116c.this.unscheduleSelf(runnable);
            }
        };
        this.f250e = context;
        if (aVar != null) {
            this.f249d = aVar;
        } else {
            this.f249d = new C0118a(context, aVar, this.f248b, resources);
        }
    }

    public Drawable mutate() {
        if (this.f264c != null) {
            this.f264c.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C0116c m340a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0116c cVar = new C0116c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f264c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0119b(this.f264c.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.f264c != null) {
            return this.f264c.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f249d.f254a;
    }

    public void draw(Canvas canvas) {
        if (this.f264c != null) {
            this.f264c.draw(canvas);
            return;
        }
        this.f249d.f255b.draw(canvas);
        if (this.f249d.f256c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f264c != null) {
            this.f264c.setBounds(rect);
        } else {
            this.f249d.f255b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f264c != null) {
            return this.f264c.setState(iArr);
        }
        return this.f249d.f255b.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f264c != null) {
            return this.f264c.setLevel(i);
        }
        return this.f249d.f255b.setLevel(i);
    }

    public int getAlpha() {
        if (this.f264c != null) {
            return C0540a.m2386c(this.f264c);
        }
        return this.f249d.f255b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.f264c != null) {
            this.f264c.setAlpha(i);
        } else {
            this.f249d.f255b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f264c != null) {
            this.f264c.setColorFilter(colorFilter);
        } else {
            this.f249d.f255b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.f264c != null) {
            C0540a.m2377a(this.f264c, i);
        } else {
            this.f249d.f255b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f264c != null) {
            C0540a.m2379a(this.f264c, colorStateList);
        } else {
            this.f249d.f255b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f264c != null) {
            C0540a.m2382a(this.f264c, mode);
        } else {
            this.f249d.f255b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f264c != null) {
            return this.f264c.setVisible(z, z2);
        }
        this.f249d.f255b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.f264c != null) {
            return this.f264c.isStateful();
        }
        return this.f249d.f255b.isStateful();
    }

    public int getOpacity() {
        if (this.f264c != null) {
            return this.f264c.getOpacity();
        }
        return this.f249d.f255b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.f264c != null) {
            return this.f264c.getIntrinsicWidth();
        }
        return this.f249d.f255b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.f264c != null) {
            return this.f264c.getIntrinsicHeight();
        }
        return this.f249d.f255b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.f264c != null) {
            return C0540a.m2384b(this.f264c);
        }
        return this.f249d.f255b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f264c != null) {
            C0540a.m2383a(this.f264c, z);
        } else {
            this.f249d.f255b.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f264c != null) {
            C0540a.m2381a(this.f264c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f239e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0126i a2 = C0126i.m373a(resources, resourceId, theme);
                        a2.mo299a(false);
                        a2.setCallback(this.f248b);
                        if (this.f249d.f255b != null) {
                            this.f249d.f255b.setCallback((Drawable.Callback) null);
                        }
                        this.f249d.f255b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0114a.f240f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f250e;
                        if (context != null) {
                            m342a(string, C0121e.m348a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f249d.mo284a();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f264c != null) {
            C0540a.m2380a(this.f264c, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f264c != null) {
            return C0540a.m2387d(this.f264c);
        }
        return false;
    }

    /* renamed from: android.support.c.a.c$b */
    private static class C0119b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f259a;

        public C0119b(Drawable.ConstantState constantState) {
            this.f259a = constantState;
        }

        public Drawable newDrawable() {
            C0116c cVar = new C0116c();
            cVar.f264c = this.f259a.newDrawable();
            cVar.f264c.setCallback(cVar.f248b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0116c cVar = new C0116c();
            cVar.f264c = this.f259a.newDrawable(resources);
            cVar.f264c.setCallback(cVar.f248b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0116c cVar = new C0116c();
            cVar.f264c = this.f259a.newDrawable(resources, theme);
            cVar.f264c.setCallback(cVar.f248b);
            return cVar;
        }

        public boolean canApplyTheme() {
            return this.f259a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f259a.getChangingConfigurations();
        }
    }

    /* renamed from: android.support.c.a.c$a */
    private static class C0118a extends Drawable.ConstantState {

        /* renamed from: a */
        int f254a;

        /* renamed from: b */
        C0126i f255b;

        /* renamed from: c */
        AnimatorSet f256c;

        /* renamed from: d */
        ArrayList<Animator> f257d;

        /* renamed from: e */
        C0511a<Animator, String> f258e;

        public C0118a(Context context, C0118a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f254a = aVar.f254a;
                C0126i iVar = aVar.f255b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f255b = (C0126i) constantState.newDrawable(resources);
                    } else {
                        this.f255b = (C0126i) constantState.newDrawable();
                    }
                    this.f255b = (C0126i) this.f255b.mutate();
                    this.f255b.setCallback(callback);
                    this.f255b.setBounds(aVar.f255b.getBounds());
                    this.f255b.mo299a(false);
                }
                ArrayList<Animator> arrayList = aVar.f257d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f257d = new ArrayList<>(size);
                    this.f258e = new C0511a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f257d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f258e.get(animator);
                        clone.setTarget(this.f255b.mo298a(str));
                        this.f257d.add(clone);
                        this.f258e.put(clone, str);
                    }
                    mo284a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f254a;
        }

        /* renamed from: a */
        public void mo284a() {
            if (this.f256c == null) {
                this.f256c = new AnimatorSet();
            }
            this.f256c.playTogether(this.f257d);
        }
    }

    /* renamed from: a */
    private void m341a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m341a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f251f == null) {
                    this.f251f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f251f);
            }
        }
    }

    /* renamed from: a */
    private void m342a(String str, Animator animator) {
        animator.setTarget(this.f249d.f255b.mo298a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m341a(animator);
        }
        if (this.f249d.f257d == null) {
            this.f249d.f257d = new ArrayList<>();
            this.f249d.f258e = new C0511a<>();
        }
        this.f249d.f257d.add(animator);
        this.f249d.f258e.put(animator, str);
    }

    public boolean isRunning() {
        if (this.f264c != null) {
            return ((AnimatedVectorDrawable) this.f264c).isRunning();
        }
        return this.f249d.f256c.isRunning();
    }

    public void start() {
        if (this.f264c != null) {
            ((AnimatedVectorDrawable) this.f264c).start();
        } else if (!this.f249d.f256c.isStarted()) {
            this.f249d.f256c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f264c != null) {
            ((AnimatedVectorDrawable) this.f264c).stop();
        } else {
            this.f249d.f256c.end();
        }
    }
}
