package android.support.p026v4.p027a.p028a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p009a.C0106a;
import android.support.p026v4.p033e.C0493a;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.c */
public class C0394c {

    /* renamed from: android.support.v4.a.a.c$a */
    public interface C0395a {
    }

    /* renamed from: android.support.v4.a.a.c$d */
    public static final class C0398d implements C0395a {

        /* renamed from: a */
        private final C0493a f1304a;

        /* renamed from: b */
        private final int f1305b;

        /* renamed from: c */
        private final int f1306c;

        public C0398d(C0493a aVar, int i, int i2) {
            this.f1304a = aVar;
            this.f1306c = i;
            this.f1305b = i2;
        }

        /* renamed from: a */
        public C0493a mo1459a() {
            return this.f1304a;
        }

        /* renamed from: b */
        public int mo1460b() {
            return this.f1306c;
        }

        /* renamed from: c */
        public int mo1461c() {
            return this.f1305b;
        }
    }

    /* renamed from: android.support.v4.a.a.c$c */
    public static final class C0397c {

        /* renamed from: a */
        private final String f1298a;

        /* renamed from: b */
        private int f1299b;

        /* renamed from: c */
        private boolean f1300c;

        /* renamed from: d */
        private String f1301d;

        /* renamed from: e */
        private int f1302e;

        /* renamed from: f */
        private int f1303f;

        public C0397c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1298a = str;
            this.f1299b = i;
            this.f1300c = z;
            this.f1301d = str2;
            this.f1302e = i2;
            this.f1303f = i3;
        }

        /* renamed from: a */
        public String mo1453a() {
            return this.f1298a;
        }

        /* renamed from: b */
        public int mo1454b() {
            return this.f1299b;
        }

        /* renamed from: c */
        public boolean mo1455c() {
            return this.f1300c;
        }

        /* renamed from: d */
        public String mo1456d() {
            return this.f1301d;
        }

        /* renamed from: e */
        public int mo1457e() {
            return this.f1302e;
        }

        /* renamed from: f */
        public int mo1458f() {
            return this.f1303f;
        }
    }

    /* renamed from: android.support.v4.a.a.c$b */
    public static final class C0396b implements C0395a {

        /* renamed from: a */
        private final C0397c[] f1297a;

        public C0396b(C0397c[] cVarArr) {
            this.f1297a = cVarArr;
        }

        /* renamed from: a */
        public C0397c[] mo1452a() {
            return this.f1297a;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static android.support.p026v4.p027a.p028a.C0394c.C0395a m1642a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            android.support.v4.a.a.c$a r3 = m1646b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p027a.p028a.C0394c.m1642a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):android.support.v4.a.a.c$a");
    }

    /* renamed from: b */
    private static C0395a m1646b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1647c(xmlPullParser, resources);
        }
        m1645a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0395a m1647c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0106a.C0109c.FontFamily);
        String string = obtainAttributes.getString(C0106a.C0109c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0106a.C0109c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0106a.C0109c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0106a.C0109c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0106a.C0109c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0106a.C0109c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1648d(xmlPullParser, resources));
                    } else {
                        m1645a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0396b((C0397c[]) arrayList.toArray(new C0397c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1645a(xmlPullParser);
        }
        return new C0398d(new C0493a(string, string2, string3, m1643a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: a */
    private static int m1641a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1643a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1641a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1644a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1644a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1644a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static C0397c m1648d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0106a.C0109c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0106a.C0109c.FontFamilyFont_fontWeight) ? C0106a.C0109c.FontFamilyFont_fontWeight : C0106a.C0109c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0106a.C0109c.FontFamilyFont_fontStyle) ? C0106a.C0109c.FontFamilyFont_fontStyle : C0106a.C0109c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0106a.C0109c.FontFamilyFont_ttcIndex) ? C0106a.C0109c.FontFamilyFont_ttcIndex : C0106a.C0109c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0106a.C0109c.FontFamilyFont_fontVariationSettings) ? C0106a.C0109c.FontFamilyFont_fontVariationSettings : C0106a.C0109c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0106a.C0109c.FontFamilyFont_font) ? C0106a.C0109c.FontFamilyFont_font : C0106a.C0109c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1645a(xmlPullParser);
        }
        return new C0397c(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: a */
    private static void m1645a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }
}
