package android.support.p039v7.p041b.p042a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.p027a.p028a.C0392a;
import android.support.p039v7.widget.C1009l;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.a */
public final class C0705a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2269a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0706a>> f2270b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2271c = new Object();

    /* renamed from: a */
    public static ColorStateList m3165a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m3170d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m3169c(context, i);
        if (c == null) {
            return C0391a.m1622b(context, i);
        }
        m3167a(context, i, c);
        return c;
    }

    /* renamed from: b */
    public static Drawable m3168b(Context context, int i) {
        return C1009l.m5329a().mo4939a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m3169c(Context context, int i) {
        if (m3171e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0392a.m1625a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3170d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f2271c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.b.a.a$a>> r1 = f2270b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.b.a.a$a r2 = (android.support.p039v7.p041b.p042a.C0705a.C0706a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f2273b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f2272a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.p041b.p042a.C0705a.m3170d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m3167a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2271c) {
            SparseArray sparseArray = f2270b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2270b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0706a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e */
    private static boolean m3171e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m3166a();
        resources.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static TypedValue m3166a() {
        TypedValue typedValue = f2269a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2269a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: android.support.v7.b.a.a$a */
    private static class C0706a {

        /* renamed from: a */
        final ColorStateList f2272a;

        /* renamed from: b */
        final Configuration f2273b;

        C0706a(ColorStateList colorStateList, Configuration configuration) {
            this.f2272a = colorStateList;
            this.f2273b = configuration;
        }
    }
}
