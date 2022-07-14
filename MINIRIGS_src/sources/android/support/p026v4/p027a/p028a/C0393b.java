package android.support.p026v4.p027a.p028a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: android.support.v4.a.a.b */
public final class C0393b {

    /* renamed from: a */
    private final Shader f1294a;

    /* renamed from: b */
    private final ColorStateList f1295b;

    /* renamed from: c */
    private int f1296c;

    private C0393b(Shader shader, ColorStateList colorStateList, int i) {
        this.f1294a = shader;
        this.f1295b = colorStateList;
        this.f1296c = i;
    }

    /* renamed from: a */
    static C0393b m1632a(Shader shader) {
        return new C0393b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: a */
    static C0393b m1630a(ColorStateList colorStateList) {
        return new C0393b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    static C0393b m1629a(int i) {
        return new C0393b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: a */
    public Shader mo1445a() {
        return this.f1294a;
    }

    /* renamed from: b */
    public int mo1447b() {
        return this.f1296c;
    }

    /* renamed from: b */
    public void mo1448b(int i) {
        this.f1296c = i;
    }

    /* renamed from: c */
    public boolean mo1449c() {
        return this.f1294a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1295b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1450d() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1294a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1295b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p027a.p028a.C0393b.mo1450d():boolean");
    }

    /* renamed from: a */
    public boolean mo1446a(int[] iArr) {
        if (mo1450d()) {
            ColorStateList colorStateList = this.f1295b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1296c) {
                this.f1296c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo1451e() {
        return mo1449c() || this.f1296c != 0;
    }

    /* renamed from: a */
    public static C0393b m1631a(Resources resources, int i, Resources.Theme theme) {
        try {
            return m1633b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1.equals("gradient") != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p026v4.p027a.p028a.C0393b m1633b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L_0x0008:
            int r1 = r7.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L_0x0013
            if (r1 == r2) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r3) goto L_0x0070
            java.lang.String r1 = r7.getName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L_0x0033
            r2 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r2) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003c
            r2 = 0
            goto L_0x003d
        L_0x0033:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = -1
        L_0x003d:
            switch(r2) {
                case 0: goto L_0x0067;
                case 1: goto L_0x005e;
                default: goto L_0x0040;
            }
        L_0x0040:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x005e:
            android.graphics.Shader r6 = android.support.p026v4.p027a.p028a.C0399d.m1660a(r6, r7, r0, r8)
            android.support.v4.a.a.b r6 = m1632a((android.graphics.Shader) r6)
            return r6
        L_0x0067:
            android.content.res.ColorStateList r6 = android.support.p026v4.p027a.p028a.C0392a.m1626a((android.content.res.Resources) r6, (org.xmlpull.v1.XmlPullParser) r7, (android.util.AttributeSet) r0, (android.content.res.Resources.Theme) r8)
            android.support.v4.a.a.b r6 = m1630a((android.content.res.ColorStateList) r6)
            return r6
        L_0x0070:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p027a.p028a.C0393b.m1633b(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.v4.a.a.b");
    }
}
