package android.support.p026v4.p027a.p028a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.g */
public class C0406g {
    /* renamed from: a */
    public static boolean m1680a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static float m1674a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m1680a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static boolean m1679a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m1680a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m1675a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1680a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static int m1681b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1680a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0393b m1677a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m1680a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0393b.m1629a(typedValue.data);
            }
            C0393b a = C0393b.m1631a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0393b.m1629a(i2);
    }

    /* renamed from: c */
    public static int m1683c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1680a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static String m1678a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1680a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: b */
    public static TypedValue m1682b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1680a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: a */
    public static TypedArray m1676a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
