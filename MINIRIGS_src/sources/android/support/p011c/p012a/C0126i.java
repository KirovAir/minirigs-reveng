package android.support.p011c.p012a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.p026v4.graphics.C0535b;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.p028a.C0393b;
import android.support.p026v4.p027a.p028a.C0406g;
import android.support.p026v4.p035g.C0511a;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.c.a.i */
public class C0126i extends C0125h {

    /* renamed from: a */
    static final PorterDuff.Mode f265a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C0134g f266b;

    /* renamed from: d */
    private PorterDuffColorFilter f267d;

    /* renamed from: e */
    private ColorFilter f268e;

    /* renamed from: f */
    private boolean f269f;

    /* renamed from: g */
    private boolean f270g;

    /* renamed from: h */
    private Drawable.ConstantState f271h;

    /* renamed from: i */
    private final float[] f272i;

    /* renamed from: j */
    private final Matrix f273j;

    /* renamed from: k */
    private final Rect f274k;

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

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

    C0126i() {
        this.f270g = true;
        this.f272i = new float[9];
        this.f273j = new Matrix();
        this.f274k = new Rect();
        this.f266b = new C0134g();
    }

    C0126i(C0134g gVar) {
        this.f270g = true;
        this.f272i = new float[9];
        this.f273j = new Matrix();
        this.f274k = new Rect();
        this.f266b = gVar;
        this.f267d = mo297a(this.f267d, gVar.f323c, gVar.f324d);
    }

    public Drawable mutate() {
        if (this.f264c != null) {
            this.f264c.mutate();
            return this;
        }
        if (!this.f269f && super.mutate() == this) {
            this.f266b = new C0134g(this.f266b);
            this.f269f = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo298a(String str) {
        return this.f266b.f322b.f315k.get(str);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f264c != null && Build.VERSION.SDK_INT >= 24) {
            return new C0135h(this.f264c.getConstantState());
        }
        this.f266b.f321a = getChangingConfigurations();
        return this.f266b;
    }

    public void draw(Canvas canvas) {
        if (this.f264c != null) {
            this.f264c.draw(canvas);
            return;
        }
        copyBounds(this.f274k);
        if (this.f274k.width() > 0 && this.f274k.height() > 0) {
            ColorFilter colorFilter = this.f268e;
            if (colorFilter == null) {
                colorFilter = this.f267d;
            }
            canvas.getMatrix(this.f273j);
            this.f273j.getValues(this.f272i);
            float abs = Math.abs(this.f272i[0]);
            float abs2 = Math.abs(this.f272i[4]);
            float abs3 = Math.abs(this.f272i[1]);
            float abs4 = Math.abs(this.f272i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f274k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f274k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f274k.left, (float) this.f274k.top);
                if (m376a()) {
                    canvas.translate((float) this.f274k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f274k.offsetTo(0, 0);
                this.f266b.mo375b(min, min2);
                if (!this.f270g) {
                    this.f266b.mo371a(min, min2);
                } else if (!this.f266b.mo376b()) {
                    this.f266b.mo371a(min, min2);
                    this.f266b.mo377c();
                }
                this.f266b.mo372a(canvas, colorFilter, this.f274k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.f264c != null) {
            return C0540a.m2386c(this.f264c);
        }
        return this.f266b.f322b.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.f264c != null) {
            this.f264c.setAlpha(i);
        } else if (this.f266b.f322b.getRootAlpha() != i) {
            this.f266b.f322b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f264c != null) {
            this.f264c.setColorFilter(colorFilter);
            return;
        }
        this.f268e = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo297a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.f264c != null) {
            C0540a.m2377a(this.f264c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f264c != null) {
            C0540a.m2379a(this.f264c, colorStateList);
            return;
        }
        C0134g gVar = this.f266b;
        if (gVar.f323c != colorStateList) {
            gVar.f323c = colorStateList;
            this.f267d = mo297a(this.f267d, colorStateList, gVar.f324d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f264c != null) {
            C0540a.m2382a(this.f264c, mode);
            return;
        }
        C0134g gVar = this.f266b;
        if (gVar.f324d != mode) {
            gVar.f324d = mode;
            this.f267d = mo297a(this.f267d, gVar.f323c, mode);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r1.f266b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f264c
            if (r0 == 0) goto L_0x000b
            android.graphics.drawable.Drawable r0 = r1.f264c
            boolean r0 = r0.isStateful()
            return r0
        L_0x000b:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x002e
            android.support.c.a.i$g r0 = r1.f266b
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.mo379d()
            if (r0 != 0) goto L_0x002e
            android.support.c.a.i$g r0 = r1.f266b
            android.content.res.ColorStateList r0 = r0.f323c
            if (r0 == 0) goto L_0x002c
            android.support.c.a.i$g r0 = r1.f266b
            android.content.res.ColorStateList r0 = r0.f323c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011c.p012a.C0126i.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f264c != null) {
            return this.f264c.setState(iArr);
        }
        boolean z = false;
        C0134g gVar = this.f266b;
        if (!(gVar.f323c == null || gVar.f324d == null)) {
            this.f267d = mo297a(this.f267d, gVar.f323c, gVar.f324d);
            invalidateSelf();
            z = true;
        }
        if (!gVar.mo379d() || !gVar.mo374a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.f264c != null) {
            return this.f264c.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.f264c != null) {
            return this.f264c.getIntrinsicWidth();
        }
        return (int) this.f266b.f322b.f308d;
    }

    public int getIntrinsicHeight() {
        if (this.f264c != null) {
            return this.f264c.getIntrinsicHeight();
        }
        return (int) this.f266b.f322b.f309e;
    }

    public boolean canApplyTheme() {
        if (this.f264c == null) {
            return false;
        }
        C0540a.m2387d(this.f264c);
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.f264c != null) {
            return C0540a.m2384b(this.f264c);
        }
        return this.f266b.f325e;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f264c != null) {
            C0540a.m2383a(this.f264c, z);
        } else {
            this.f266b.f325e = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p011c.p012a.C0126i m373a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            android.support.c.a.i r0 = new android.support.c.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = android.support.p026v4.p027a.p028a.C0402f.m1669a(r4, r5, r6)
            r0.f264c = r4
            android.support.c.a.i$h r4 = new android.support.c.a.i$h
            android.graphics.drawable.Drawable r5 = r0.f264c
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f271h = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            android.support.c.a.i r4 = m374a(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
            throw r4     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0041 }
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
            goto L_0x0052
        L_0x004a:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
        L_0x0052:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011c.p012a.C0126i.m373a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.c.a.i");
    }

    /* renamed from: a */
    public static C0126i m374a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0126i iVar = new C0126i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    static int m371a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f264c != null) {
            this.f264c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f264c != null) {
            C0540a.m2381a(this.f264c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0134g gVar = this.f266b;
        gVar.f322b = new C0133f();
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f235a);
        m375a(a, xmlPullParser);
        a.recycle();
        gVar.f321a = getChangingConfigurations();
        gVar.f331k = true;
        m377b(resources, xmlPullParser, attributeSet, theme);
        this.f267d = mo297a(this.f267d, gVar.f323c, gVar.f324d);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m372a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m375a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0134g gVar = this.f266b;
        C0133f fVar = gVar.f322b;
        gVar.f324d = m372a(C0406g.m1675a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f323c = colorStateList;
        }
        gVar.f325e = C0406g.m1679a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f325e);
        fVar.f310f = C0406g.m1674a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f310f);
        fVar.f311g = C0406g.m1674a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f311g);
        if (fVar.f310f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.f311g > 0.0f) {
            fVar.f308d = typedArray.getDimension(3, fVar.f308d);
            fVar.f309e = typedArray.getDimension(2, fVar.f309e);
            if (fVar.f308d <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.f309e > 0.0f) {
                fVar.setAlpha(C0406g.m1674a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f313i = string;
                    fVar.f315k.put(string, fVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: b */
    private void m377b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0134g gVar = this.f266b;
        C0133f fVar = gVar.f322b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f307c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0130c cVar = (C0130c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0129b bVar = new C0129b();
                    bVar.mo323a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f289b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f315k.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f321a = bVar.f303o | gVar.f321a;
                } else if ("clip-path".equals(name)) {
                    C0128a aVar = new C0128a();
                    aVar.mo321a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f289b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f315k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f321a = aVar.f303o | gVar.f321a;
                } else if ("group".equals(name)) {
                    C0130c cVar2 = new C0130c();
                    cVar2.mo342a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f289b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f315k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f321a = cVar2.f292e | gVar.f321a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo299a(boolean z) {
        this.f270g = z;
    }

    /* renamed from: a */
    private boolean m376a() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0540a.m2391h(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f264c != null) {
            this.f264c.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.f264c != null) {
            return this.f264c.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f266b.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.f264c != null) {
            this.f264c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f264c != null) {
            this.f264c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f264c != null) {
            return this.f264c.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f264c != null) {
            this.f264c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: android.support.c.a.i$h */
    private static class C0135h extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f333a;

        public C0135h(Drawable.ConstantState constantState) {
            this.f333a = constantState;
        }

        public Drawable newDrawable() {
            C0126i iVar = new C0126i();
            iVar.f264c = (VectorDrawable) this.f333a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0126i iVar = new C0126i();
            iVar.f264c = (VectorDrawable) this.f333a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0126i iVar = new C0126i();
            iVar.f264c = (VectorDrawable) this.f333a.newDrawable(resources, theme);
            return iVar;
        }

        public boolean canApplyTheme() {
            return this.f333a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f333a.getChangingConfigurations();
        }
    }

    /* renamed from: android.support.c.a.i$g */
    private static class C0134g extends Drawable.ConstantState {

        /* renamed from: a */
        int f321a;

        /* renamed from: b */
        C0133f f322b;

        /* renamed from: c */
        ColorStateList f323c;

        /* renamed from: d */
        PorterDuff.Mode f324d;

        /* renamed from: e */
        boolean f325e;

        /* renamed from: f */
        Bitmap f326f;

        /* renamed from: g */
        ColorStateList f327g;

        /* renamed from: h */
        PorterDuff.Mode f328h;

        /* renamed from: i */
        int f329i;

        /* renamed from: j */
        boolean f330j;

        /* renamed from: k */
        boolean f331k;

        /* renamed from: l */
        Paint f332l;

        public C0134g(C0134g gVar) {
            this.f323c = null;
            this.f324d = C0126i.f265a;
            if (gVar != null) {
                this.f321a = gVar.f321a;
                this.f322b = new C0133f(gVar.f322b);
                if (gVar.f322b.f306b != null) {
                    this.f322b.f306b = new Paint(gVar.f322b.f306b);
                }
                if (gVar.f322b.f305a != null) {
                    this.f322b.f305a = new Paint(gVar.f322b.f305a);
                }
                this.f323c = gVar.f323c;
                this.f324d = gVar.f324d;
                this.f325e = gVar.f325e;
            }
        }

        /* renamed from: a */
        public void mo372a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f326f, (Rect) null, rect, mo370a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo373a() {
            return this.f322b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public Paint mo370a(ColorFilter colorFilter) {
            if (!mo373a() && colorFilter == null) {
                return null;
            }
            if (this.f332l == null) {
                this.f332l = new Paint();
                this.f332l.setFilterBitmap(true);
            }
            this.f332l.setAlpha(this.f322b.getRootAlpha());
            this.f332l.setColorFilter(colorFilter);
            return this.f332l;
        }

        /* renamed from: a */
        public void mo371a(int i, int i2) {
            this.f326f.eraseColor(0);
            this.f322b.mo363a(new Canvas(this.f326f), i, i2, (ColorFilter) null);
        }

        /* renamed from: b */
        public void mo375b(int i, int i2) {
            if (this.f326f == null || !mo378c(i, i2)) {
                this.f326f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f331k = true;
            }
        }

        /* renamed from: c */
        public boolean mo378c(int i, int i2) {
            return i == this.f326f.getWidth() && i2 == this.f326f.getHeight();
        }

        /* renamed from: b */
        public boolean mo376b() {
            return !this.f331k && this.f327g == this.f323c && this.f328h == this.f324d && this.f330j == this.f325e && this.f329i == this.f322b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo377c() {
            this.f327g = this.f323c;
            this.f328h = this.f324d;
            this.f329i = this.f322b.getRootAlpha();
            this.f330j = this.f325e;
            this.f331k = false;
        }

        public C0134g() {
            this.f323c = null;
            this.f324d = C0126i.f265a;
            this.f322b = new C0133f();
        }

        public Drawable newDrawable() {
            return new C0126i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0126i(this);
        }

        public int getChangingConfigurations() {
            return this.f321a;
        }

        /* renamed from: d */
        public boolean mo379d() {
            return this.f322b.mo364a();
        }

        /* renamed from: a */
        public boolean mo374a(int[] iArr) {
            boolean a = this.f322b.mo365a(iArr);
            this.f331k |= a;
            return a;
        }
    }

    /* renamed from: android.support.c.a.i$f */
    private static class C0133f {

        /* renamed from: n */
        private static final Matrix f304n = new Matrix();

        /* renamed from: a */
        Paint f305a;

        /* renamed from: b */
        Paint f306b;

        /* renamed from: c */
        final C0130c f307c;

        /* renamed from: d */
        float f308d;

        /* renamed from: e */
        float f309e;

        /* renamed from: f */
        float f310f;

        /* renamed from: g */
        float f311g;

        /* renamed from: h */
        int f312h;

        /* renamed from: i */
        String f313i;

        /* renamed from: j */
        Boolean f314j;

        /* renamed from: k */
        final C0511a<String, Object> f315k;

        /* renamed from: l */
        private final Path f316l;

        /* renamed from: m */
        private final Path f317m;

        /* renamed from: o */
        private final Matrix f318o;

        /* renamed from: p */
        private PathMeasure f319p;

        /* renamed from: q */
        private int f320q;

        /* renamed from: a */
        private static float m399a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public C0133f() {
            this.f318o = new Matrix();
            this.f308d = 0.0f;
            this.f309e = 0.0f;
            this.f310f = 0.0f;
            this.f311g = 0.0f;
            this.f312h = 255;
            this.f313i = null;
            this.f314j = null;
            this.f315k = new C0511a<>();
            this.f307c = new C0130c();
            this.f316l = new Path();
            this.f317m = new Path();
        }

        public void setRootAlpha(int i) {
            this.f312h = i;
        }

        public int getRootAlpha() {
            return this.f312h;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0133f(C0133f fVar) {
            this.f318o = new Matrix();
            this.f308d = 0.0f;
            this.f309e = 0.0f;
            this.f310f = 0.0f;
            this.f311g = 0.0f;
            this.f312h = 255;
            this.f313i = null;
            this.f314j = null;
            this.f315k = new C0511a<>();
            this.f307c = new C0130c(fVar.f307c, this.f315k);
            this.f316l = new Path(fVar.f316l);
            this.f317m = new Path(fVar.f317m);
            this.f308d = fVar.f308d;
            this.f309e = fVar.f309e;
            this.f310f = fVar.f310f;
            this.f311g = fVar.f311g;
            this.f320q = fVar.f320q;
            this.f312h = fVar.f312h;
            this.f313i = fVar.f313i;
            String str = fVar.f313i;
            if (str != null) {
                this.f315k.put(str, this);
            }
            this.f314j = fVar.f314j;
        }

        /* renamed from: a */
        private void m401a(C0130c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f288a.set(matrix);
            cVar.f288a.preConcat(cVar.f291d);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f289b.size(); i3++) {
                C0131d dVar = cVar.f289b.get(i3);
                if (dVar instanceof C0130c) {
                    m401a((C0130c) dVar, cVar.f288a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof C0132e) {
                    m402a(cVar, (C0132e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void mo363a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m401a(this.f307c, f304n, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m402a(C0130c cVar, C0132e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f310f;
            float f2 = ((float) i2) / this.f311g;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f288a;
            this.f318o.set(matrix);
            this.f318o.postScale(f, f2);
            float a = m400a(matrix);
            if (a != 0.0f) {
                eVar.mo359a(this.f316l);
                Path path = this.f316l;
                this.f317m.reset();
                if (eVar.mo322a()) {
                    this.f317m.addPath(path, this.f318o);
                    canvas.clipPath(this.f317m);
                    return;
                }
                C0129b bVar = (C0129b) eVar;
                if (!(bVar.f281g == 0.0f && bVar.f282h == 1.0f)) {
                    float f3 = (bVar.f281g + bVar.f283i) % 1.0f;
                    float f4 = (bVar.f282h + bVar.f283i) % 1.0f;
                    if (this.f319p == null) {
                        this.f319p = new PathMeasure();
                    }
                    this.f319p.setPath(this.f316l, false);
                    float length = this.f319p.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f319p.getSegment(f5, length, path, true);
                        this.f319p.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f319p.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f317m.addPath(path, this.f318o);
                if (bVar.f277c.mo1451e()) {
                    C0393b bVar2 = bVar.f277c;
                    if (this.f306b == null) {
                        this.f306b = new Paint(1);
                        this.f306b.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f306b;
                    if (bVar2.mo1449c()) {
                        Shader a2 = bVar2.mo1445a();
                        a2.setLocalMatrix(this.f318o);
                        paint.setShader(a2);
                        paint.setAlpha(Math.round(bVar.f280f * 255.0f));
                    } else {
                        paint.setColor(C0126i.m371a(bVar2.mo1447b(), bVar.f280f));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f317m.setFillType(bVar.f279e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f317m, paint);
                }
                if (bVar.f275a.mo1451e()) {
                    C0393b bVar3 = bVar.f275a;
                    if (this.f305a == null) {
                        this.f305a = new Paint(1);
                        this.f305a.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f305a;
                    if (bVar.f285k != null) {
                        paint2.setStrokeJoin(bVar.f285k);
                    }
                    if (bVar.f284j != null) {
                        paint2.setStrokeCap(bVar.f284j);
                    }
                    paint2.setStrokeMiter(bVar.f286l);
                    if (bVar3.mo1449c()) {
                        Shader a3 = bVar3.mo1445a();
                        a3.setLocalMatrix(this.f318o);
                        paint2.setShader(a3);
                        paint2.setAlpha(Math.round(bVar.f278d * 255.0f));
                    } else {
                        paint2.setColor(C0126i.m371a(bVar3.mo1447b(), bVar.f278d));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(bVar.f276b * min * a);
                    canvas.drawPath(this.f317m, paint2);
                }
            }
        }

        /* renamed from: a */
        private float m400a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m399a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo364a() {
            if (this.f314j == null) {
                this.f314j = Boolean.valueOf(this.f307c.mo325b());
            }
            return this.f314j.booleanValue();
        }

        /* renamed from: a */
        public boolean mo365a(int[] iArr) {
            return this.f307c.mo324a(iArr);
        }
    }

    /* renamed from: android.support.c.a.i$d */
    private static abstract class C0131d {
        /* renamed from: a */
        public boolean mo324a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo325b() {
            return false;
        }

        private C0131d() {
        }
    }

    /* renamed from: android.support.c.a.i$c */
    private static class C0130c extends C0131d {

        /* renamed from: a */
        final Matrix f288a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0131d> f289b = new ArrayList<>();

        /* renamed from: c */
        float f290c = 0.0f;

        /* renamed from: d */
        final Matrix f291d = new Matrix();

        /* renamed from: e */
        int f292e;

        /* renamed from: f */
        private float f293f = 0.0f;

        /* renamed from: g */
        private float f294g = 0.0f;

        /* renamed from: h */
        private float f295h = 1.0f;

        /* renamed from: i */
        private float f296i = 1.0f;

        /* renamed from: j */
        private float f297j = 0.0f;

        /* renamed from: k */
        private float f298k = 0.0f;

        /* renamed from: l */
        private int[] f299l;

        /* renamed from: m */
        private String f300m = null;

        public C0130c(C0130c cVar, C0511a<String, Object> aVar) {
            super();
            C0132e eVar;
            this.f290c = cVar.f290c;
            this.f293f = cVar.f293f;
            this.f294g = cVar.f294g;
            this.f295h = cVar.f295h;
            this.f296i = cVar.f296i;
            this.f297j = cVar.f297j;
            this.f298k = cVar.f298k;
            this.f299l = cVar.f299l;
            this.f300m = cVar.f300m;
            this.f292e = cVar.f292e;
            String str = this.f300m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f291d.set(cVar.f291d);
            ArrayList<C0131d> arrayList = cVar.f289b;
            for (int i = 0; i < arrayList.size(); i++) {
                C0131d dVar = arrayList.get(i);
                if (dVar instanceof C0130c) {
                    this.f289b.add(new C0130c((C0130c) dVar, aVar));
                } else {
                    if (dVar instanceof C0129b) {
                        eVar = new C0129b((C0129b) dVar);
                    } else if (dVar instanceof C0128a) {
                        eVar = new C0128a((C0128a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f289b.add(eVar);
                    if (eVar.f302n != null) {
                        aVar.put(eVar.f302n, eVar);
                    }
                }
            }
        }

        public C0130c() {
            super();
        }

        public String getGroupName() {
            return this.f300m;
        }

        public Matrix getLocalMatrix() {
            return this.f291d;
        }

        /* renamed from: a */
        public void mo342a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f236b);
            m391a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m391a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f299l = null;
            this.f290c = C0406g.m1674a(typedArray, xmlPullParser, "rotation", 5, this.f290c);
            this.f293f = typedArray.getFloat(1, this.f293f);
            this.f294g = typedArray.getFloat(2, this.f294g);
            this.f295h = C0406g.m1674a(typedArray, xmlPullParser, "scaleX", 3, this.f295h);
            this.f296i = C0406g.m1674a(typedArray, xmlPullParser, "scaleY", 4, this.f296i);
            this.f297j = C0406g.m1674a(typedArray, xmlPullParser, "translateX", 6, this.f297j);
            this.f298k = C0406g.m1674a(typedArray, xmlPullParser, "translateY", 7, this.f298k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f300m = string;
            }
            m390a();
        }

        /* renamed from: a */
        private void m390a() {
            this.f291d.reset();
            this.f291d.postTranslate(-this.f293f, -this.f294g);
            this.f291d.postScale(this.f295h, this.f296i);
            this.f291d.postRotate(this.f290c, 0.0f, 0.0f);
            this.f291d.postTranslate(this.f297j + this.f293f, this.f298k + this.f294g);
        }

        public float getRotation() {
            return this.f290c;
        }

        public void setRotation(float f) {
            if (f != this.f290c) {
                this.f290c = f;
                m390a();
            }
        }

        public float getPivotX() {
            return this.f293f;
        }

        public void setPivotX(float f) {
            if (f != this.f293f) {
                this.f293f = f;
                m390a();
            }
        }

        public float getPivotY() {
            return this.f294g;
        }

        public void setPivotY(float f) {
            if (f != this.f294g) {
                this.f294g = f;
                m390a();
            }
        }

        public float getScaleX() {
            return this.f295h;
        }

        public void setScaleX(float f) {
            if (f != this.f295h) {
                this.f295h = f;
                m390a();
            }
        }

        public float getScaleY() {
            return this.f296i;
        }

        public void setScaleY(float f) {
            if (f != this.f296i) {
                this.f296i = f;
                m390a();
            }
        }

        public float getTranslateX() {
            return this.f297j;
        }

        public void setTranslateX(float f) {
            if (f != this.f297j) {
                this.f297j = f;
                m390a();
            }
        }

        public float getTranslateY() {
            return this.f298k;
        }

        public void setTranslateY(float f) {
            if (f != this.f298k) {
                this.f298k = f;
                m390a();
            }
        }

        /* renamed from: b */
        public boolean mo325b() {
            for (int i = 0; i < this.f289b.size(); i++) {
                if (this.f289b.get(i).mo325b()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo324a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f289b.size(); i++) {
                z |= this.f289b.get(i).mo324a(iArr);
            }
            return z;
        }
    }

    /* renamed from: android.support.c.a.i$e */
    private static abstract class C0132e extends C0131d {

        /* renamed from: m */
        protected C0535b.C0537b[] f301m = null;

        /* renamed from: n */
        String f302n;

        /* renamed from: o */
        int f303o;

        /* renamed from: a */
        public boolean mo322a() {
            return false;
        }

        public C0132e() {
            super();
        }

        public C0132e(C0132e eVar) {
            super();
            this.f302n = eVar.f302n;
            this.f303o = eVar.f303o;
            this.f301m = C0535b.m2352a(eVar.f301m);
        }

        /* renamed from: a */
        public void mo359a(Path path) {
            path.reset();
            C0535b.C0537b[] bVarArr = this.f301m;
            if (bVarArr != null) {
                C0535b.C0537b.m2359a(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f302n;
        }

        public C0535b.C0537b[] getPathData() {
            return this.f301m;
        }

        public void setPathData(C0535b.C0537b[] bVarArr) {
            if (!C0535b.m2350a(this.f301m, bVarArr)) {
                this.f301m = C0535b.m2352a(bVarArr);
            } else {
                C0535b.m2353b(this.f301m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.c.a.i$a */
    private static class C0128a extends C0132e {
        /* renamed from: a */
        public boolean mo322a() {
            return true;
        }

        public C0128a() {
        }

        public C0128a(C0128a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo321a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0406g.m1680a(xmlPullParser, "pathData")) {
                TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f238d);
                m381a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        private void m381a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f302n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f301m = C0535b.m2354b(string2);
            }
        }
    }

    /* renamed from: android.support.c.a.i$b */
    private static class C0129b extends C0132e {

        /* renamed from: a */
        C0393b f275a;

        /* renamed from: b */
        float f276b = 0.0f;

        /* renamed from: c */
        C0393b f277c;

        /* renamed from: d */
        float f278d = 1.0f;

        /* renamed from: e */
        int f279e = 0;

        /* renamed from: f */
        float f280f = 1.0f;

        /* renamed from: g */
        float f281g = 0.0f;

        /* renamed from: h */
        float f282h = 1.0f;

        /* renamed from: i */
        float f283i = 0.0f;

        /* renamed from: j */
        Paint.Cap f284j = Paint.Cap.BUTT;

        /* renamed from: k */
        Paint.Join f285k = Paint.Join.MITER;

        /* renamed from: l */
        float f286l = 4.0f;

        /* renamed from: p */
        private int[] f287p;

        public C0129b() {
        }

        public C0129b(C0129b bVar) {
            super(bVar);
            this.f287p = bVar.f287p;
            this.f275a = bVar.f275a;
            this.f276b = bVar.f276b;
            this.f278d = bVar.f278d;
            this.f277c = bVar.f277c;
            this.f279e = bVar.f279e;
            this.f280f = bVar.f280f;
            this.f281g = bVar.f281g;
            this.f282h = bVar.f282h;
            this.f283i = bVar.f283i;
            this.f284j = bVar.f284j;
            this.f285k = bVar.f285k;
            this.f286l = bVar.f286l;
        }

        /* renamed from: a */
        private Paint.Cap m384a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Paint.Join m385a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void mo323a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f237c);
            m386a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m386a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f287p = null;
            if (C0406g.m1680a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f302n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f301m = C0535b.m2354b(string2);
                }
                Resources.Theme theme2 = theme;
                this.f277c = C0406g.m1677a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f280f = C0406g.m1674a(typedArray, xmlPullParser, "fillAlpha", 12, this.f280f);
                this.f284j = m384a(C0406g.m1675a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f284j);
                this.f285k = m385a(C0406g.m1675a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f285k);
                this.f286l = C0406g.m1674a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f286l);
                this.f275a = C0406g.m1677a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f278d = C0406g.m1674a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f278d);
                this.f276b = C0406g.m1674a(typedArray, xmlPullParser, "strokeWidth", 4, this.f276b);
                this.f282h = C0406g.m1674a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f282h);
                this.f283i = C0406g.m1674a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f283i);
                this.f281g = C0406g.m1674a(typedArray, xmlPullParser, "trimPathStart", 5, this.f281g);
                this.f279e = C0406g.m1675a(typedArray, xmlPullParser, "fillType", 13, this.f279e);
            }
        }

        /* renamed from: b */
        public boolean mo325b() {
            return this.f277c.mo1450d() || this.f275a.mo1450d();
        }

        /* renamed from: a */
        public boolean mo324a(int[] iArr) {
            return this.f275a.mo1446a(iArr) | this.f277c.mo1446a(iArr);
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f275a.mo1447b();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f275a.mo1448b(i);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f276b;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f276b = f;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f278d;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f278d = f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f277c.mo1447b();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f277c.mo1448b(i);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f280f;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f280f = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f281g;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f281g = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f282h;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f282h = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f283i;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f283i = f;
        }
    }
}
