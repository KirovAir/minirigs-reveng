package android.support.p026v4.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.graphics.b */
public class C0535b {
    /* renamed from: a */
    static float[] m2351a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static Path m2347a(String str) {
        Path path = new Path();
        C0537b[] b = m2354b(str);
        if (b == null) {
            return null;
        }
        try {
            C0537b.m2359a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: b */
    public static C0537b[] m2354b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m2346a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m2349a((ArrayList<C0537b>) arrayList, trim.charAt(0), m2355c(trim));
            }
            i2 = a;
            i = a + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m2349a((ArrayList<C0537b>) arrayList, str.charAt(i2), new float[0]);
        }
        return (C0537b[]) arrayList.toArray(new C0537b[arrayList.size()]);
    }

    /* renamed from: a */
    public static C0537b[] m2352a(C0537b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0537b[] bVarArr2 = new C0537b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0537b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: a */
    public static boolean m2350a(C0537b[] bVarArr, C0537b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f1755a != bVarArr2[i].f1755a || bVarArr[i].f1756b.length != bVarArr2[i].f1756b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m2353b(C0537b[] bVarArr, C0537b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f1755a = bVarArr2[i].f1755a;
            for (int i2 = 0; i2 < bVarArr2[i].f1756b.length; i2++) {
                bVarArr[i].f1756b[i2] = bVarArr2[i].f1756b[i2];
            }
        }
    }

    /* renamed from: a */
    private static int m2346a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m2349a(ArrayList<C0537b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0537b(c, fArr));
    }

    /* renamed from: android.support.v4.graphics.b$a */
    private static class C0536a {

        /* renamed from: a */
        int f1753a;

        /* renamed from: b */
        boolean f1754b;

        C0536a() {
        }
    }

    /* renamed from: c */
    private static float[] m2355c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0536a aVar = new C0536a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m2348a(str, i, aVar);
                int i3 = aVar.f1753a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f1754b ? i3 : i3 + 1;
            }
            return m2351a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[LOOP:0: B:1:0x0007->B:20:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2348a(java.lang.String r8, int r9, android.support.p026v4.graphics.C0535b.C0536a r10) {
        /*
            r0 = 0
            r10.f1754b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x0041
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0039
            r6 = 69
            if (r5 == r6) goto L_0x0037
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0037
            switch(r5) {
                case 44: goto L_0x0039;
                case 45: goto L_0x002c;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0035
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x003b
        L_0x0027:
            r10.f1754b = r7
            r2 = 0
            r4 = 1
            goto L_0x003b
        L_0x002c:
            if (r1 == r9) goto L_0x0035
            if (r2 != 0) goto L_0x0035
            r10.f1754b = r7
            r2 = 0
            r4 = 1
            goto L_0x003b
        L_0x0035:
            r2 = 0
            goto L_0x003b
        L_0x0037:
            r2 = 1
            goto L_0x003b
        L_0x0039:
            r2 = 0
            r4 = 1
        L_0x003b:
            if (r4 == 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0041:
            r10.f1753a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.graphics.C0535b.m2348a(java.lang.String, int, android.support.v4.graphics.b$a):void");
    }

    /* renamed from: android.support.v4.graphics.b$b */
    public static class C0537b {

        /* renamed from: a */
        public char f1755a;

        /* renamed from: b */
        public float[] f1756b;

        C0537b(char c, float[] fArr) {
            this.f1755a = c;
            this.f1756b = fArr;
        }

        C0537b(C0537b bVar) {
            this.f1755a = bVar.f1755a;
            float[] fArr = bVar.f1756b;
            this.f1756b = C0535b.m2351a(fArr, 0, fArr.length);
        }

        /* renamed from: a */
        public static void m2359a(C0537b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m2358a(path, fArr, c, bVarArr[i].f1755a, bVarArr[i].f1756b);
                c = bVarArr[i].f1755a;
            }
        }

        /* renamed from: a */
        public void mo2122a(C0537b bVar, C0537b bVar2, float f) {
            int i = 0;
            while (true) {
                float[] fArr = bVar.f1756b;
                if (i < fArr.length) {
                    this.f1756b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f1756b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private static void m2358a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            Path path2 = path;
            float[] fArr3 = fArr2;
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            float f10 = fArr[4];
            float f11 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f10, f11);
                    f6 = f10;
                    f8 = f6;
                    f7 = f11;
                    f9 = f7;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            float f12 = f6;
            float f13 = f7;
            float f14 = f10;
            float f15 = f11;
            int i3 = 0;
            char c3 = c;
            while (i3 < fArr3.length) {
                float f16 = 0.0f;
                switch (c2) {
                    case 'A':
                        i2 = i3;
                        int i4 = i2 + 5;
                        int i5 = i2 + 6;
                        m2357a(path, f12, f13, fArr3[i4], fArr3[i5], fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f12 = fArr3[i4];
                        f13 = fArr3[i5];
                        f9 = f13;
                        f8 = f12;
                        break;
                    case 'C':
                        i2 = i3;
                        int i6 = i2 + 2;
                        int i7 = i2 + 3;
                        int i8 = i2 + 4;
                        int i9 = i2 + 5;
                        path.cubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i6], fArr3[i7], fArr3[i8], fArr3[i9]);
                        f12 = fArr3[i8];
                        float f17 = fArr3[i9];
                        float f18 = fArr3[i6];
                        float f19 = fArr3[i7];
                        f13 = f17;
                        f9 = f19;
                        f8 = f18;
                        break;
                    case 'H':
                        i2 = i3;
                        int i10 = i2 + 0;
                        path2.lineTo(fArr3[i10], f13);
                        f12 = fArr3[i10];
                        break;
                    case 'L':
                        i2 = i3;
                        int i11 = i2 + 0;
                        int i12 = i2 + 1;
                        path2.lineTo(fArr3[i11], fArr3[i12]);
                        f12 = fArr3[i11];
                        f13 = fArr3[i12];
                        break;
                    case 'M':
                        i2 = i3;
                        int i13 = i2 + 0;
                        f12 = fArr3[i13];
                        int i14 = i2 + 1;
                        f13 = fArr3[i14];
                        if (i2 <= 0) {
                            path2.moveTo(fArr3[i13], fArr3[i14]);
                            f15 = f13;
                            f14 = f12;
                            break;
                        } else {
                            path2.lineTo(fArr3[i13], fArr3[i14]);
                            break;
                        }
                    case 'Q':
                        i2 = i3;
                        int i15 = i2 + 0;
                        int i16 = i2 + 1;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        path2.quadTo(fArr3[i15], fArr3[i16], fArr3[i17], fArr3[i18]);
                        float f20 = fArr3[i15];
                        float f21 = fArr3[i16];
                        f12 = fArr3[i17];
                        f13 = fArr3[i18];
                        f8 = f20;
                        f9 = f21;
                        break;
                    case 'S':
                        float f22 = f13;
                        float f23 = f12;
                        i2 = i3;
                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                            float f24 = (f23 * 2.0f) - f8;
                            f = (f22 * 2.0f) - f9;
                            f2 = f24;
                        } else {
                            f2 = f23;
                            f = f22;
                        }
                        int i19 = i2 + 0;
                        int i20 = i2 + 1;
                        int i21 = i2 + 2;
                        int i22 = i2 + 3;
                        path.cubicTo(f2, f, fArr3[i19], fArr3[i20], fArr3[i21], fArr3[i22]);
                        float f25 = fArr3[i19];
                        float f26 = fArr3[i20];
                        f12 = fArr3[i21];
                        f13 = fArr3[i22];
                        f8 = f25;
                        f9 = f26;
                        break;
                    case 'T':
                        float f27 = f13;
                        float f28 = f12;
                        i2 = i3;
                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                            f27 = (f27 * 2.0f) - f9;
                            f28 = (f28 * 2.0f) - f8;
                        }
                        int i23 = i2 + 0;
                        int i24 = i2 + 1;
                        path2.quadTo(f28, f27, fArr3[i23], fArr3[i24]);
                        f12 = fArr3[i23];
                        f8 = f28;
                        f9 = f27;
                        f13 = fArr3[i24];
                        break;
                    case 'V':
                        i2 = i3;
                        int i25 = i2 + 0;
                        float f29 = f12;
                        path2 = path;
                        path2.lineTo(f29, fArr3[i25]);
                        f12 = f29;
                        f13 = fArr3[i25];
                        break;
                    case 'a':
                        int i26 = i3 + 5;
                        float f30 = fArr3[i26] + f12;
                        int i27 = i3 + 6;
                        float f31 = fArr3[i27] + f13;
                        float f32 = fArr3[i3 + 0];
                        float f33 = fArr3[i3 + 1];
                        float f34 = fArr3[i3 + 2];
                        float f35 = f12;
                        boolean z = fArr3[i3 + 3] != 0.0f;
                        i2 = i3;
                        m2357a(path, f12, f13, f30, f31, f32, f33, f34, z, fArr3[i3 + 4] != 0.0f);
                        f12 = f35 + fArr3[i26];
                        f13 += fArr3[i27];
                        f9 = f13;
                        f8 = f12;
                        path2 = path;
                        break;
                    case 'c':
                        int i28 = i3 + 2;
                        int i29 = i3 + 3;
                        int i30 = i3 + 4;
                        int i31 = i3 + 5;
                        path.rCubicTo(fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                        float f36 = fArr3[i28] + f12;
                        float f37 = fArr3[i29] + f13;
                        f12 += fArr3[i30];
                        f13 += fArr3[i31];
                        f8 = f36;
                        f9 = f37;
                        i2 = i3;
                        break;
                    case 'h':
                        int i32 = i3 + 0;
                        path2.rLineTo(fArr3[i32], 0.0f);
                        f12 += fArr3[i32];
                        i2 = i3;
                        break;
                    case 'l':
                        int i33 = i3 + 0;
                        int i34 = i3 + 1;
                        path2.rLineTo(fArr3[i33], fArr3[i34]);
                        f12 += fArr3[i33];
                        f13 += fArr3[i34];
                        i2 = i3;
                        break;
                    case 'm':
                        int i35 = i3 + 0;
                        f12 += fArr3[i35];
                        int i36 = i3 + 1;
                        f13 += fArr3[i36];
                        if (i3 <= 0) {
                            path2.rMoveTo(fArr3[i35], fArr3[i36]);
                            f15 = f13;
                            f14 = f12;
                            i2 = i3;
                            break;
                        } else {
                            path2.rLineTo(fArr3[i35], fArr3[i36]);
                            i2 = i3;
                            break;
                        }
                    case 'q':
                        int i37 = i3 + 0;
                        int i38 = i3 + 1;
                        int i39 = i3 + 2;
                        int i40 = i3 + 3;
                        path2.rQuadTo(fArr3[i37], fArr3[i38], fArr3[i39], fArr3[i40]);
                        float f38 = fArr3[i37] + f12;
                        float f39 = fArr3[i38] + f13;
                        f12 += fArr3[i39];
                        f13 += fArr3[i40];
                        f8 = f38;
                        f9 = f39;
                        i2 = i3;
                        break;
                    case 's':
                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                            float f40 = f12 - f8;
                            f3 = f13 - f9;
                            f4 = f40;
                        } else {
                            f4 = 0.0f;
                            f3 = 0.0f;
                        }
                        int i41 = i3 + 0;
                        int i42 = i3 + 1;
                        int i43 = i3 + 2;
                        int i44 = i3 + 3;
                        path.rCubicTo(f4, f3, fArr3[i41], fArr3[i42], fArr3[i43], fArr3[i44]);
                        float f41 = fArr3[i41] + f12;
                        float f42 = fArr3[i42] + f13;
                        f12 += fArr3[i43];
                        f13 += fArr3[i44];
                        f8 = f41;
                        f9 = f42;
                        i2 = i3;
                        break;
                    case 't':
                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                            f16 = f12 - f8;
                            f5 = f13 - f9;
                        } else {
                            f5 = 0.0f;
                        }
                        int i45 = i3 + 0;
                        int i46 = i3 + 1;
                        path2.rQuadTo(f16, f5, fArr3[i45], fArr3[i46]);
                        float f43 = f16 + f12;
                        float f44 = f5 + f13;
                        f12 += fArr3[i45];
                        f13 += fArr3[i46];
                        f9 = f44;
                        i2 = i3;
                        f8 = f43;
                        break;
                    case 'v':
                        int i47 = i3 + 0;
                        path2.rLineTo(0.0f, fArr3[i47]);
                        f13 += fArr3[i47];
                        i2 = i3;
                        break;
                    default:
                        float f45 = f13;
                        float f46 = f12;
                        i2 = i3;
                        f13 = f45;
                        break;
                }
                i3 = i2 + i;
                c3 = c2;
            }
            fArr[0] = f12;
            fArr[1] = f13;
            fArr[2] = f8;
            fArr[3] = f9;
            fArr[4] = f14;
            fArr[5] = f15;
        }

        /* renamed from: a */
        private static void m2357a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            boolean z3 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            double d4 = d3 * cos;
            double d5 = d3;
            double d6 = (double) f2;
            double d7 = (double) f10;
            double d8 = (d4 + (d6 * sin)) / d7;
            double d9 = (((double) (-f8)) * sin) + (d6 * cos);
            double d10 = d6;
            double d11 = (double) f6;
            double d12 = d9 / d11;
            double d13 = (double) f4;
            double d14 = ((((double) f9) * cos) + (d13 * sin)) / d7;
            double d15 = d7;
            double d16 = ((((double) (-f9)) * sin) + (d13 * cos)) / d11;
            double d17 = d8 - d14;
            double d18 = d12 - d16;
            double d19 = (d8 + d14) / 2.0d;
            double d20 = (d12 + d16) / 2.0d;
            double d21 = sin;
            double d22 = (d17 * d17) + (d18 * d18);
            if (d22 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d22);
                float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
                m2357a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d23);
            double d24 = d17 * sqrt2;
            double d25 = sqrt2 * d18;
            boolean z4 = z2;
            if (z == z4) {
                d2 = d19 - d25;
                d = d20 + d24;
            } else {
                d2 = d19 + d25;
                d = d20 - d24;
            }
            double atan2 = Math.atan2(d12 - d, d8 - d2);
            double atan22 = Math.atan2(d16 - d, d14 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z4 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d26 = d2 * d15;
            double d27 = d * d11;
            m2356a(path, (d26 * cos) - (d27 * d21), (d26 * d21) + (d27 * cos), d15, d11, d5, d10, radians, atan2, atan22);
        }

        /* renamed from: a */
        private static void m2356a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ((double) ceil);
            double d19 = d5;
            double d20 = d6;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                double d30 = cos;
                path.rLineTo(0.0f, 0.0f);
                float f = (float) (d20 + (d21 * sin4));
                float f2 = (float) (d25 - (sin4 * d27));
                path.cubicTo((float) (d19 + (d22 * sin4)), f, f2, (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                ceil = i2;
                sin = sin;
                d20 = d26;
                d15 = d15;
                d23 = d24;
                d21 = d28;
                d22 = d27;
                cos = d30;
                d10 = d3;
                d19 = d25;
            }
        }
    }
}
