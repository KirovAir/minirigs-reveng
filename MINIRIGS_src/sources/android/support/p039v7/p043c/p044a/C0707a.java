package android.support.p039v7.p043c.p044a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011c.p012a.C0116c;
import android.support.p011c.p012a.C0126i;
import android.support.p026v4.p027a.p028a.C0406g;
import android.support.p026v4.p035g.C0518f;
import android.support.p026v4.p035g.C0533m;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.p043c.p044a.C0715b;
import android.support.p039v7.p043c.p044a.C0720d;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.a */
public class C0707a extends C0720d {

    /* renamed from: a */
    private static final String f2274a = "a";

    /* renamed from: b */
    private C0710b f2275b;

    /* renamed from: c */
    private C0714f f2276c;

    /* renamed from: d */
    private int f2277d;

    /* renamed from: e */
    private int f2278e;

    /* renamed from: f */
    private boolean f2279f;

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C0707a() {
        this((C0710b) null, (Resources) null);
    }

    C0707a(C0710b bVar, Resources resources) {
        super((C0720d.C0721a) null);
        this.f2277d = -1;
        this.f2278e = -1;
        mo2711a((C0715b.C0718b) new C0710b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0707a m3172a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0707a aVar = new C0707a();
            aVar.mo2714b(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: b */
    public void mo2714b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0639a.C0649j.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0639a.C0649j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m3173a(a);
        mo2764a(resources);
        a.recycle();
        m3175c(context, resources, xmlPullParser, attributeSet, theme);
        m3178e();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2276c != null && (visible || z2)) {
            if (z) {
                this.f2276c.mo2747a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0714f fVar = this.f2276c;
        if (fVar != null) {
            fVar.mo2748b();
            this.f2276c = null;
            mo2766a(this.f2277d);
            this.f2277d = -1;
            this.f2278e = -1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int a = this.f2275b.mo2752a(iArr);
        boolean z = a != mo2767d() && (m3174b(a) || mo2766a(a));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    /* renamed from: b */
    private boolean m3174b(int i) {
        int i2;
        int a;
        C0714f fVar;
        C0714f fVar2 = this.f2276c;
        if (fVar2 == null) {
            i2 = mo2767d();
        } else if (i == this.f2277d) {
            return true;
        } else {
            if (i != this.f2278e || !fVar2.mo2759c()) {
                i2 = this.f2277d;
                fVar2.mo2748b();
            } else {
                fVar2.mo2760d();
                this.f2277d = this.f2278e;
                this.f2278e = i;
                return true;
            }
        }
        this.f2276c = null;
        this.f2278e = -1;
        this.f2277d = -1;
        C0710b bVar = this.f2275b;
        int a2 = bVar.mo2749a(i2);
        int a3 = bVar.mo2749a(i);
        if (a3 == 0 || a2 == 0 || (a = bVar.mo2750a(a2, a3)) < 0) {
            return false;
        }
        boolean c = bVar.mo2756c(a2, a3);
        mo2766a(a);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            fVar = new C0712d((AnimationDrawable) current, bVar.mo2755b(a2, a3), c);
        } else if (current instanceof C0116c) {
            fVar = new C0711c((C0116c) current);
        } else if (!(current instanceof Animatable)) {
            return false;
        } else {
            fVar = new C0709a((Animatable) current);
        }
        fVar.mo2747a();
        this.f2276c = fVar;
        this.f2278e = i2;
        this.f2277d = i;
        return true;
    }

    /* renamed from: android.support.v7.c.a.a$f */
    private static abstract class C0714f {
        /* renamed from: a */
        public abstract void mo2747a();

        /* renamed from: b */
        public abstract void mo2748b();

        /* renamed from: c */
        public boolean mo2759c() {
            return false;
        }

        /* renamed from: d */
        public void mo2760d() {
        }

        private C0714f() {
        }
    }

    /* renamed from: android.support.v7.c.a.a$a */
    private static class C0709a extends C0714f {

        /* renamed from: a */
        private final Animatable f2280a;

        C0709a(Animatable animatable) {
            super();
            this.f2280a = animatable;
        }

        /* renamed from: a */
        public void mo2747a() {
            this.f2280a.start();
        }

        /* renamed from: b */
        public void mo2748b() {
            this.f2280a.stop();
        }
    }

    /* renamed from: android.support.v7.c.a.a$d */
    private static class C0712d extends C0714f {

        /* renamed from: a */
        private final ObjectAnimator f2284a;

        /* renamed from: b */
        private final boolean f2285b;

        C0712d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0713e eVar = new C0713e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.mo2761a());
            ofInt.setInterpolator(eVar);
            this.f2285b = z2;
            this.f2284a = ofInt;
        }

        /* renamed from: c */
        public boolean mo2759c() {
            return this.f2285b;
        }

        /* renamed from: a */
        public void mo2747a() {
            this.f2284a.start();
        }

        /* renamed from: d */
        public void mo2760d() {
            this.f2284a.reverse();
        }

        /* renamed from: b */
        public void mo2748b() {
            this.f2284a.cancel();
        }
    }

    /* renamed from: android.support.v7.c.a.a$c */
    private static class C0711c extends C0714f {

        /* renamed from: a */
        private final C0116c f2283a;

        C0711c(C0116c cVar) {
            super();
            this.f2283a = cVar;
        }

        /* renamed from: a */
        public void mo2747a() {
            this.f2283a.start();
        }

        /* renamed from: b */
        public void mo2748b() {
            this.f2283a.stop();
        }
    }

    /* renamed from: a */
    private void m3173a(TypedArray typedArray) {
        C0710b bVar = this.f2275b;
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.f2318f |= typedArray.getChangingConfigurations();
        }
        bVar.mo2780a(typedArray.getBoolean(C0639a.C0649j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f2323k));
        bVar.mo2783b(typedArray.getBoolean(C0639a.C0649j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f2326n));
        bVar.mo2785c(typedArray.getInt(C0639a.C0649j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f2306C));
        bVar.mo2788d(typedArray.getInt(C0639a.C0649j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f2307D));
        setDither(typedArray.getBoolean(C0639a.C0649j.AnimatedStateListDrawableCompat_android_dither, bVar.f2338z));
    }

    /* renamed from: e */
    private void m3178e() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m3175c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m3177e(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m3176d(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m3176d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0639a.C0649j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0639a.C0649j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0639a.C0649j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0639a.C0649j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable b = resourceId3 > 0 ? C0705a.m3168b(context, resourceId3) : null;
        boolean z = a.getBoolean(C0639a.C0649j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                b = C0116c.m340a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f2275b.mo2751a(resourceId, resourceId2, b, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: e */
    private int m3177e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0639a.C0649j.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0639a.C0649j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0639a.C0649j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable b = resourceId2 > 0 ? C0705a.m3168b(context, resourceId2) : null;
        a.recycle();
        int[] a2 = mo2831a(attributeSet);
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                b = C0126i.m374a(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                b = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (b != null) {
            return this.f2275b.mo2753a(a2, b, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public Drawable mutate() {
        if (!this.f2279f && super.mutate() == this) {
            this.f2275b.mo2754a();
            this.f2279f = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0710b mo2715c() {
        return new C0710b(this.f2275b, this, (Resources) null);
    }

    /* renamed from: android.support.v7.c.a.a$b */
    static class C0710b extends C0720d.C0721a {

        /* renamed from: a */
        C0518f<Long> f2281a;

        /* renamed from: b */
        C0533m<Integer> f2282b;

        /* renamed from: f */
        private static long m3186f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        C0710b(C0710b bVar, C0707a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f2281a = bVar.f2281a;
                this.f2282b = bVar.f2282b;
                return;
            }
            this.f2281a = new C0518f<>();
            this.f2282b = new C0533m<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2754a() {
            this.f2281a = this.f2281a.clone();
            this.f2282b = this.f2282b.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2751a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo2777a(drawable);
            long f = m3186f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f2281a.mo2014c(f, Long.valueOf(j2 | j));
            if (z) {
                this.f2281a.mo2014c(m3186f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2753a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo2832a(iArr, drawable);
            this.f2282b.mo2114b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2752a(int[] iArr) {
            int b = super.mo2833b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo2833b(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2749a(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f2282b.mo2111a(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2750a(int i, int i2) {
            return (int) this.f2281a.mo2005a(m3186f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2755b(int i, int i2) {
            return (this.f2281a.mo2005a(m3186f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2756c(int i, int i2) {
            return (this.f2281a.mo2005a(m3186f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C0707a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0707a(this, resources);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2711a(C0715b.C0718b bVar) {
        super.mo2711a(bVar);
        if (bVar instanceof C0710b) {
            this.f2275b = (C0710b) bVar;
        }
    }

    /* renamed from: android.support.v7.c.a.a$e */
    private static class C0713e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f2286a;

        /* renamed from: b */
        private int f2287b;

        /* renamed from: c */
        private int f2288c;

        C0713e(AnimationDrawable animationDrawable, boolean z) {
            mo2762a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2762a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2287b = numberOfFrames;
            int[] iArr = this.f2286a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2286a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2286a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2288c = i;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2761a() {
            return this.f2288c;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f2288c)) + 0.5f);
            int i2 = this.f2287b;
            int[] iArr = this.f2286a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2288c) : 0.0f);
        }
    }
}
