package android.support.p026v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p026v4.p027a.p028a.C0394c;
import android.support.p026v4.p027a.p028a.C0402f;
import android.support.p026v4.p033e.C0494b;
import android.support.p026v4.p035g.C0519g;

/* renamed from: android.support.v4.graphics.c */
public class C0538c {

    /* renamed from: a */
    private static final C0551h f1757a;

    /* renamed from: b */
    private static final C0519g<String, Typeface> f1758b = new C0519g<>(16);

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            f1757a = new C0550g();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f1757a = new C0549f();
        } else if (Build.VERSION.SDK_INT >= 24 && C0548e.m2405a()) {
            f1757a = new C0548e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f1757a = new C0539d();
        } else {
            f1757a = new C0551h();
        }
    }

    /* renamed from: a */
    public static Typeface m2364a(Resources resources, int i, int i2) {
        return f1758b.mo2017a(m2365b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m2365b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: a */
    public static Typeface m2363a(Context context, C0394c.C0395a aVar, Resources resources, int i, int i2, C0402f.C0403a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0394c.C0398d) {
            C0394c.C0398d dVar = (C0394c.C0398d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo1460b() == 0) {
                z2 = true;
            }
            typeface = C0494b.m2191a(context, dVar.mo1459a(), aVar2, handler, z2, z ? dVar.mo1461c() : -1, i2);
        } else {
            typeface = f1757a.mo2170a(context, (C0394c.C0396b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo1465a(typeface, handler);
                } else {
                    aVar2.mo1463a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f1758b.mo2018a(m2365b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m2361a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1757a.mo2171a(context, resources, i, str, i2);
        if (a != null) {
            f1758b.mo2018a(m2365b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m2362a(Context context, CancellationSignal cancellationSignal, C0494b.C0500b[] bVarArr, int i) {
        return f1757a.mo2123a(context, cancellationSignal, bVarArr, i);
    }
}
