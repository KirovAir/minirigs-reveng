package android.support.p026v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.p026v4.p027a.p028a.C0394c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.graphics.f */
public class C0549f extends C0539d {

    /* renamed from: a */
    protected final Class f1789a;

    /* renamed from: b */
    protected final Constructor f1790b;

    /* renamed from: c */
    protected final Method f1791c;

    /* renamed from: d */
    protected final Method f1792d;

    /* renamed from: e */
    protected final Method f1793e;

    /* renamed from: f */
    protected final Method f1794f;

    /* renamed from: g */
    protected final Method f1795g;

    public C0549f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = mo2173a();
            constructor = mo2174a(a);
            method4 = mo2175b(a);
            method3 = mo2176c(a);
            method2 = mo2177d(a);
            method = mo2178e(a);
            Class cls2 = a;
            method5 = mo2179f(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1789a = cls;
        this.f1790b = constructor;
        this.f1791c = method4;
        this.f1792d = method3;
        this.f1793e = method2;
        this.f1794f = method;
        this.f1795g = method5;
    }

    /* renamed from: b */
    private boolean m2412b() {
        if (this.f1791c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1791c != null;
    }

    /* renamed from: c */
    private Object m2414c() {
        try {
            return this.f1790b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m2410a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1791c.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m2411a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f1792d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2172a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1789a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1795g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m2413b(Object obj) {
        try {
            return ((Boolean) this.f1793e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private void m2415c(Object obj) {
        try {
            this.f1794f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo2170a(Context context, C0394c.C0396b bVar, Resources resources, int i) {
        if (!m2412b()) {
            return super.mo2170a(context, bVar, resources, i);
        }
        Object c = m2414c();
        for (C0394c.C0397c cVar : bVar.mo1452a()) {
            if (!m2410a(context, c, cVar.mo1453a(), cVar.mo1457e(), cVar.mo1454b(), cVar.mo1455c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo1456d()))) {
                m2415c(c);
                return null;
            }
        }
        if (!m2413b(c)) {
            return null;
        }
        return mo2172a(c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r10 = r14;
        r14 = r13;
        r13 = r10;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo2123a(android.content.Context r12, android.os.CancellationSignal r13, android.support.p026v4.p033e.C0494b.C0500b[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r11.m2412b()
            if (r0 != 0) goto L_0x0064
            android.support.v4.e.b$b r14 = r11.mo2181a((android.support.p026v4.p033e.C0494b.C0500b[]) r14, (int) r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.mo1929a()     // Catch:{ IOException -> 0x0063 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch:{ IOException -> 0x0063 }
            if (r12 != 0) goto L_0x0026
            if (r12 == 0) goto L_0x0025
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            r13.<init>(r15)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            int r15 = r14.mo1931c()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            boolean r14 = r14.mo1932d()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface r13 = r13.build()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            if (r12 == 0) goto L_0x0048
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0048:
            return r13
        L_0x0049:
            r13 = move-exception
            r14 = r2
            goto L_0x0052
        L_0x004c:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x004e }
        L_0x004e:
            r14 = move-exception
            r10 = r14
            r14 = r13
            r13 = r10
        L_0x0052:
            if (r12 == 0) goto L_0x0062
            if (r14 == 0) goto L_0x005f
            r12.close()     // Catch:{ Throwable -> 0x005a }
            goto L_0x0062
        L_0x005a:
            r12 = move-exception
            r14.addSuppressed(r12)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            r12.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0062:
            throw r13     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return r2
        L_0x0064:
            java.util.Map r12 = android.support.p026v4.p033e.C0494b.m2196a((android.content.Context) r12, (android.support.p026v4.p033e.C0494b.C0500b[]) r14, (android.os.CancellationSignal) r13)
            java.lang.Object r13 = r11.m2414c()
            int r0 = r14.length
            r3 = 0
            r9 = 0
        L_0x006f:
            if (r9 >= r0) goto L_0x009c
            r4 = r14[r9]
            android.net.Uri r5 = r4.mo1929a()
            java.lang.Object r5 = r12.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0080
            goto L_0x0099
        L_0x0080:
            int r6 = r4.mo1930b()
            int r7 = r4.mo1931c()
            boolean r8 = r4.mo1932d()
            r3 = r11
            r4 = r13
            boolean r3 = r3.m2411a((java.lang.Object) r4, (java.nio.ByteBuffer) r5, (int) r6, (int) r7, (int) r8)
            if (r3 != 0) goto L_0x0098
            r11.m2415c((java.lang.Object) r13)
            return r2
        L_0x0098:
            r3 = 1
        L_0x0099:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x009c:
            if (r3 != 0) goto L_0x00a2
            r11.m2415c((java.lang.Object) r13)
            return r2
        L_0x00a2:
            boolean r12 = r11.m2413b((java.lang.Object) r13)
            if (r12 != 0) goto L_0x00a9
            return r2
        L_0x00a9:
            android.graphics.Typeface r12 = r11.mo2172a((java.lang.Object) r13)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.graphics.C0549f.mo2123a(android.content.Context, android.os.CancellationSignal, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo2171a(Context context, Resources resources, int i, String str, int i2) {
        if (!m2412b()) {
            return super.mo2171a(context, resources, i, str, i2);
        }
        Object c = m2414c();
        if (!m2410a(context, c, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m2415c(c);
            return null;
        } else if (!m2413b(c)) {
            return null;
        } else {
            return mo2172a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo2173a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Constructor mo2174a(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo2175b(Class cls) {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo2176c(Class cls) {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo2177d(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Method mo2178e(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo2179f(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
