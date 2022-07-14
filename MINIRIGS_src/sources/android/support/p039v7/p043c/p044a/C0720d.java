package android.support.p039v7.p043c.p044a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p027a.p028a.C0406g;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.p043c.p044a.C0715b;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.d */
class C0720d extends C0715b {

    /* renamed from: a */
    private C0721a f2340a;

    /* renamed from: b */
    private boolean f2341b;

    public boolean isStateful() {
        return true;
    }

    C0720d() {
        this((C0721a) null, (Resources) null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f2340a.mo2833b(iArr);
        if (b < 0) {
            b = this.f2340a.mo2833b(StateSet.WILD_CARD);
        }
        return mo2766a(b) || onStateChange;
    }

    /* renamed from: b */
    public void mo2714b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0639a.C0649j.StateListDrawable);
        setVisible(a.getBoolean(C0639a.C0649j.StateListDrawable_android_visible, true), true);
        m3247a(a);
        mo2764a(resources);
        a.recycle();
        m3246a(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m3247a(TypedArray typedArray) {
        C0721a aVar = this.f2340a;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.f2318f |= typedArray.getChangingConfigurations();
        }
        aVar.f2323k = typedArray.getBoolean(C0639a.C0649j.StateListDrawable_android_variablePadding, aVar.f2323k);
        aVar.f2326n = typedArray.getBoolean(C0639a.C0649j.StateListDrawable_android_constantSize, aVar.f2326n);
        aVar.f2306C = typedArray.getInt(C0639a.C0649j.StateListDrawable_android_enterFadeDuration, aVar.f2306C);
        aVar.f2307D = typedArray.getInt(C0639a.C0649j.StateListDrawable_android_exitFadeDuration, aVar.f2307D);
        aVar.f2338z = typedArray.getBoolean(C0639a.C0649j.StateListDrawable_android_dither, aVar.f2338z);
    }

    /* renamed from: a */
    private void m3246a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        C0721a aVar = this.f2340a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0639a.C0649j.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(C0639a.C0649j.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = C0705a.m3168b(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = mo2831a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or " + "child tag defining a drawable");
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    aVar.mo2832a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo2831a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f2341b && super.mutate() == this) {
            this.f2340a.mo2754a();
            this.f2341b = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0721a mo2715c() {
        return new C0721a(this.f2340a, this, (Resources) null);
    }

    /* renamed from: android.support.v7.c.a.d$a */
    static class C0721a extends C0715b.C0718b {

        /* renamed from: L */
        int[][] f2342L;

        C0721a(C0721a aVar, C0720d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f2342L = aVar.f2342L;
            } else {
                this.f2342L = new int[mo2784c()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2754a() {
            int[][] iArr = this.f2342L;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f2342L;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f2342L = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2832a(int[] iArr, Drawable drawable) {
            int a = mo2777a(drawable);
            this.f2342L[a] = iArr;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo2833b(int[] iArr) {
            int[][] iArr2 = this.f2342L;
            int d = mo2787d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0720d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0720d(this, resources);
        }

        /* renamed from: e */
        public void mo2791e(int i, int i2) {
            super.mo2791e(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f2342L, 0, iArr, 0, i);
            this.f2342L = iArr;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2711a(C0715b.C0718b bVar) {
        super.mo2711a(bVar);
        if (bVar instanceof C0721a) {
            this.f2340a = (C0721a) bVar;
        }
    }

    C0720d(C0721a aVar, Resources resources) {
        mo2711a((C0715b.C0718b) new C0721a(aVar, this, resources));
        onStateChange(getState());
    }

    C0720d(C0721a aVar) {
        if (aVar != null) {
            mo2711a((C0715b.C0718b) aVar);
        }
    }
}
