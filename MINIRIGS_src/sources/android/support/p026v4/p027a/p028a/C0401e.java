package android.support.p026v4.p027a.p028a;

import java.lang.reflect.Array;

/* renamed from: android.support.v4.a.a.e */
final class C0401e {

    /* renamed from: a */
    static final /* synthetic */ boolean f1309a = (!C0401e.class.desiredAssertionStatus());

    /* renamed from: a */
    public static int m1663a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static <T> T[] m1665a(T[] tArr, int i, T t) {
        if (f1309a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1663a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int[] m1664a(int[] iArr, int i, int i2) {
        if (f1309a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m1663a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    private C0401e() {
    }
}
