package android.support.p026v4.p027a.p028a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: android.support.v4.a.a.f */
public final class C0402f {
    /* renamed from: a */
    public static Drawable m1669a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: android.support.v4.a.a.f$a */
    public static abstract class C0403a {
        /* renamed from: a */
        public abstract void mo1462a(int i);

        /* renamed from: a */
        public abstract void mo1464a(Typeface typeface);

        /* renamed from: a */
        public final void mo1465a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0403a.this.mo1464a(typeface);
                }
            });
        }

        /* renamed from: a */
        public final void mo1463a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0403a.this.mo1462a(i);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m1666a(Context context, int i, TypedValue typedValue, int i2, C0403a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m1667a(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    /* renamed from: a */
    private static Typeface m1667a(Context context, int i, TypedValue typedValue, int i2, C0403a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m1668a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m1668a(android.content.Context r14, android.content.res.Resources r15, android.util.TypedValue r16, int r17, int r18, android.support.p026v4.p027a.p028a.C0402f.C0403a r19, android.os.Handler r20, boolean r21) {
        /*
            r0 = r15
            r1 = r16
            r4 = r17
            r5 = r18
            r9 = r19
            r10 = r20
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00ab
            java.lang.CharSequence r1 = r1.string
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r11.startsWith(r1)
            r12 = 0
            r13 = -3
            if (r1 != 0) goto L_0x0025
            if (r9 == 0) goto L_0x0024
            r9.mo1463a((int) r13, (android.os.Handler) r10)
        L_0x0024:
            return r12
        L_0x0025:
            android.graphics.Typeface r1 = android.support.p026v4.graphics.C0538c.m2364a(r15, r4, r5)
            if (r1 == 0) goto L_0x0031
            if (r9 == 0) goto L_0x0030
            r9.mo1465a((android.graphics.Typeface) r1, (android.os.Handler) r10)
        L_0x0030:
            return r1
        L_0x0031:
            java.lang.String r1 = r11.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r15.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            android.support.v4.a.a.c$a r2 = android.support.p026v4.p027a.p028a.C0394c.m1642a((org.xmlpull.v1.XmlPullParser) r1, (android.content.res.Resources) r15)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0054
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to find font-family tag"
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0053
            r9.mo1463a((int) r13, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
        L_0x0053:
            return r12
        L_0x0054:
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            android.graphics.Typeface r0 = android.support.p026v4.graphics.C0538c.m2363a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r14
            android.graphics.Typeface r0 = android.support.p026v4.graphics.C0538c.m2361a(r14, r15, r4, r11, r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo1465a((android.graphics.Typeface) r0, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo1463a((int) r13, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read xml resource "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
            goto L_0x00a5
        L_0x008e:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse xml resource "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
        L_0x00a5:
            if (r9 == 0) goto L_0x00aa
            r9.mo1463a((int) r13, (android.os.Handler) r10)
        L_0x00aa:
            return r12
        L_0x00ab:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r15.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r17)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p027a.p028a.C0402f.m1668a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.a.a.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
