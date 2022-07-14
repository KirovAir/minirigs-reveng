package android.support.p026v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p026v4.p027a.p028a.C0394c;
import android.support.p026v4.p033e.C0494b;
import android.support.p026v4.p035g.C0532l;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.graphics.e */
class C0548e extends C0551h {

    /* renamed from: a */
    private static final Class f1785a;

    /* renamed from: b */
    private static final Constructor f1786b;

    /* renamed from: c */
    private static final Method f1787c;

    /* renamed from: d */
    private static final Method f1788d;

    C0548e() {
    }

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f1786b = constructor;
        f1785a = cls;
        f1787c = method;
        f1788d = method2;
    }

    /* renamed from: a */
    public static boolean m2405a() {
        if (f1787c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1787c != null;
    }

    /* renamed from: b */
    private static Object m2407b() {
        try {
            return f1786b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m2406a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1787c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static Typeface m2404a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1785a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1788d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo2123a(Context context, CancellationSignal cancellationSignal, C0494b.C0500b[] bVarArr, int i) {
        Object b = m2407b();
        C0532l lVar = new C0532l();
        for (C0494b.C0500b bVar : bVarArr) {
            Uri a = bVar.mo1929a();
            ByteBuffer byteBuffer = (ByteBuffer) lVar.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0555i.m2448a(context, cancellationSignal, a);
                lVar.put(a, byteBuffer);
            }
            if (!m2406a(b, byteBuffer, bVar.mo1930b(), bVar.mo1931c(), bVar.mo1932d())) {
                return null;
            }
        }
        return Typeface.create(m2404a(b), i);
    }

    /* renamed from: a */
    public Typeface mo2170a(Context context, C0394c.C0396b bVar, Resources resources, int i) {
        Object b = m2407b();
        for (C0394c.C0397c cVar : bVar.mo1452a()) {
            ByteBuffer a = C0555i.m2447a(context, resources, cVar.mo1458f());
            if (a == null || !m2406a(b, a, cVar.mo1457e(), cVar.mo1454b(), cVar.mo1455c())) {
                return null;
            }
        }
        return m2404a(b);
    }
}
