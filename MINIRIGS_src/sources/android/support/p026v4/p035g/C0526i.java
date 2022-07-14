package android.support.p026v4.p035g;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: android.support.v4.g.i */
public class C0526i {
    /* renamed from: a */
    public static boolean m2306a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m2305a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
