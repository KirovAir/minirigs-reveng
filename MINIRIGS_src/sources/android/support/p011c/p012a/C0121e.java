package android.support.p011c.p012a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.p026v4.graphics.C0535b;
import android.support.p026v4.p027a.p028a.C0406g;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.c.a.e */
public class C0121e {
    /* renamed from: a */
    private static boolean m363a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    public static Animator m348a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m349a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m349a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m350a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m350a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator a = m351a(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: android.support.c.a.e$a */
    private static class C0122a implements TypeEvaluator<C0535b.C0537b[]> {

        /* renamed from: a */
        private C0535b.C0537b[] f260a;

        C0122a() {
        }

        /* renamed from: a */
        public C0535b.C0537b[] evaluate(float f, C0535b.C0537b[] bVarArr, C0535b.C0537b[] bVarArr2) {
            if (C0535b.m2350a(bVarArr, bVarArr2)) {
                C0535b.C0537b[] bVarArr3 = this.f260a;
                if (bVarArr3 == null || !C0535b.m2350a(bVarArr3, bVarArr)) {
                    this.f260a = C0535b.m2352a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f260a[i].mo2122a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f260a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m357a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m363a(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m363a(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00ab
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            android.support.v4.graphics.b$b[] r13 = android.support.p026v4.graphics.C0535b.m2354b(r12)
            android.support.v4.graphics.b$b[] r14 = android.support.p026v4.graphics.C0535b.m2354b(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x016d
        L_0x0054:
            if (r13 == 0) goto L_0x009a
            android.support.c.a.e$a r0 = new android.support.c.a.e$a
            r0.<init>()
            if (r14 == 0) goto L_0x008f
            boolean r3 = android.support.p026v4.graphics.C0535b.m2350a((android.support.p026v4.graphics.C0535b.C0537b[]) r13, (android.support.p026v4.graphics.C0535b.C0537b[]) r14)
            if (r3 == 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            r8 = r11
            goto L_0x016d
        L_0x0070:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008f:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            r8 = r11
            goto L_0x016d
        L_0x009a:
            if (r14 == 0) goto L_0x016d
            android.support.c.a.e$a r11 = new android.support.c.a.e$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x016d
        L_0x00ab:
            if (r12 != r7) goto L_0x00b2
            android.support.c.a.f r12 = android.support.p011c.p012a.C0123f.m366a()
            goto L_0x00b3
        L_0x00b2:
            r12 = r8
        L_0x00b3:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00e9
            if (r0 != r7) goto L_0x00c0
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c4
        L_0x00c0:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c4:
            if (r5 == 0) goto L_0x00de
            if (r4 != r7) goto L_0x00cd
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00d1
        L_0x00cd:
            float r11 = r11.getFloat(r14, r10)
        L_0x00d1:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            r8 = r11
            goto L_0x0166
        L_0x00de:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            r8 = r11
            goto L_0x0166
        L_0x00e9:
            if (r4 != r7) goto L_0x00f0
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00f4
        L_0x00f0:
            float r11 = r11.getFloat(r14, r10)
        L_0x00f4:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            r8 = r11
            goto L_0x0166
        L_0x00ff:
            if (r3 == 0) goto L_0x0145
            if (r0 != r7) goto L_0x0109
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0118
        L_0x0109:
            boolean r0 = m363a(r0)
            if (r0 == 0) goto L_0x0114
            int r13 = r11.getColor(r13, r2)
            goto L_0x0118
        L_0x0114:
            int r13 = r11.getInt(r13, r2)
        L_0x0118:
            if (r5 == 0) goto L_0x013c
            if (r4 != r7) goto L_0x0122
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0131
        L_0x0122:
            boolean r0 = m363a(r4)
            if (r0 == 0) goto L_0x012d
            int r11 = r11.getColor(r14, r2)
            goto L_0x0131
        L_0x012d:
            int r11 = r11.getInt(r14, r2)
        L_0x0131:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x0166
        L_0x013c:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0166
        L_0x0145:
            if (r5 == 0) goto L_0x0166
            if (r4 != r7) goto L_0x014f
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x015e
        L_0x014f:
            boolean r13 = m363a(r4)
            if (r13 == 0) goto L_0x015a
            int r11 = r11.getColor(r14, r2)
            goto L_0x015e
        L_0x015a:
            int r11 = r11.getInt(r14, r2)
        L_0x015e:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x0166:
            if (r8 == 0) goto L_0x016d
            if (r12 == 0) goto L_0x016d
            r8.setEvaluator(r12)
        L_0x016d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011c.p012a.C0121e.m357a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static void m360a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0406g.m1675a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0406g.m1675a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0406g.m1675a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0406g.m1680a(xmlPullParser, "valueFrom") && C0406g.m1680a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m347a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m357a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0406g.m1675a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0406g.m1675a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m359a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m359a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0406g.m1678a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0406g.m1678a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0406g.m1678a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m361a(C0535b.m2347a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0406g.m1678a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m361a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static Animator m351a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m352a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* renamed from: a */
    private static Animator m352a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        int i2;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = m355a(context, resources, theme, attributeSet, f, xmlPullParser);
                        Context context2 = context;
                    } else if (name.equals("animator")) {
                        valueAnimator = m358a(context, resources, theme, attributeSet, (ValueAnimator) null, f, xmlPullParser);
                        Context context3 = context;
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        TypedArray a = C0406g.m1676a(resources2, theme2, attributeSet, C0114a.f242h);
                        m352a(context, resources, theme, xmlPullParser, attributeSet, animatorSet3, C0406g.m1675a(a, xmlPullParser2, "ordering", 0, 0), f);
                        a.recycle();
                        Context context4 = context;
                        valueAnimator = animatorSet3;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = m364a(context, resources2, theme2, xmlPullParser2, Xml.asAttributeSet(xmlPullParser));
                        if (!(a2 == null || valueAnimator == null || !(valueAnimator instanceof ValueAnimator))) {
                            valueAnimator.setValues(a2);
                        }
                        i2 = 1;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet2 != null && i2 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m364a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006d
            r10 = 1
            if (r0 == r10) goto L_0x006d
            r2 = 2
            if (r0 == r2) goto L_0x0016
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r0 = android.support.p011c.p012a.C0114a.f243i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = android.support.p026v4.p027a.p028a.C0406g.m1676a((android.content.res.Resources) r11, (android.content.res.Resources.Theme) r12, (android.util.AttributeSet) r13, (int[]) r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = android.support.p026v4.p027a.p028a.C0406g.m1678a((android.content.res.TypedArray) r14, (org.xmlpull.v1.XmlPullParser) r6, (java.lang.String) r0, (int) r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = android.support.p026v4.p027a.p028a.C0406g.m1675a((android.content.res.TypedArray) r14, (org.xmlpull.v1.XmlPullParser) r6, (java.lang.String) r0, (int) r2, (int) r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m356a((android.content.Context) r0, (android.content.res.Resources) r1, (android.content.res.Resources.Theme) r2, (org.xmlpull.v1.XmlPullParser) r3, (java.lang.String) r4, (int) r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m357a((android.content.res.TypedArray) r14, (int) r1, (int) r9, (int) r10, (java.lang.String) r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005f
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L_0x005c:
            r8.add(r0)
        L_0x005f:
            r14.recycle()
            goto L_0x0069
        L_0x0063:
            r11 = r18
            r12 = r19
            r13 = r21
        L_0x0069:
            r20.next()
            goto L_0x0004
        L_0x006d:
            if (r8 == 0) goto L_0x0082
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0075:
            if (r9 >= r0) goto L_0x0082
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0075
        L_0x0082:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011c.p012a.C0121e.m364a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: a */
    private static int m346a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f244j);
        int i = 0;
        TypedValue b = C0406g.m1682b(a, xmlPullParser, "value", 0);
        if ((b != null) && m363a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m347a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !m363a(i3)) && (!z || !m363a(i4))) {
            return 0;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m356a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m346a((android.content.res.Resources) r10, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r1, (org.xmlpull.v1.XmlPullParser) r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m354a((android.content.Context) r2, (android.content.res.Resources) r3, (android.content.res.Resources.Theme) r4, (android.util.AttributeSet) r5, (int) r6, (org.xmlpull.v1.XmlPullParser) r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00ea
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00ea
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m353a((android.animation.Keyframe) r12, (float) r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m353a((android.animation.Keyframe) r11, (float) r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dd
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00da
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00da
        L_0x00a8:
            int r14 = r9 + -1
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00da
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c6
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c6:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + -1
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m362a((android.animation.Keyframe[]) r11, (float) r12, (int) r10, (int) r0)
        L_0x00da:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dd:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00ea
            android.support.c.a.f r9 = android.support.p011c.p012a.C0123f.m366a()
            r0.setEvaluator(r9)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011c.p012a.C0121e.m356a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static Keyframe m353a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static void m362a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static Keyframe m354a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe keyframe;
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f244j);
        float a2 = C0406g.m1674a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0406g.m1682b(a, xmlPullParser, "value", 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m363a(b.type)) ? 0 : 3;
        }
        if (z) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        keyframe = Keyframe.ofFloat(a2, C0406g.m1674a(a, xmlPullParser, "value", 0, 0.0f));
                        break;
                    case 1:
                        break;
                    default:
                        keyframe = null;
                        break;
                }
            }
            keyframe = Keyframe.ofInt(a2, C0406g.m1675a(a, xmlPullParser, "value", 0, 0));
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(a2);
        } else {
            keyframe = Keyframe.ofInt(a2);
        }
        int c = C0406g.m1683c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C0120d.m344a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* renamed from: a */
    private static ObjectAnimator m355a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m358a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m358a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0406g.m1676a(resources, theme, attributeSet, C0114a.f241g);
        TypedArray a2 = C0406g.m1676a(resources, theme, attributeSet, C0114a.f245k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m360a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0406g.m1683c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0120d.m344a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }
}
