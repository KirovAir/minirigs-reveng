package android.support.p026v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p026v4.p027a.p028a.C0394c;
import android.support.p026v4.p033e.C0494b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.h */
class C0551h {

    /* renamed from: android.support.v4.graphics.h$a */
    private interface C0554a<T> {
        /* renamed from: a */
        boolean mo2183a(T t);

        /* renamed from: b */
        int mo2184b(T t);
    }

    C0551h() {
    }

    /* renamed from: a */
    private static <T> T m2430a(T[] tArr, int i, C0554a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo2184b(t2) - i2) * 2) + (aVar.mo2183a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0494b.C0500b mo2181a(C0494b.C0500b[] bVarArr, int i) {
        return (C0494b.C0500b) m2430a(bVarArr, i, new C0554a<C0494b.C0500b>() {
            /* renamed from: a */
            public int mo2184b(C0494b.C0500b bVar) {
                return bVar.mo1931c();
            }

            /* renamed from: b */
            public boolean mo2183a(C0494b.C0500b bVar) {
                return bVar.mo1932d();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2180a(Context context, InputStream inputStream) {
        File a = C0555i.m2446a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0555i.m2452a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo2123a(Context context, CancellationSignal cancellationSignal, C0494b.C0500b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2181a(bVarArr, i).mo1929a());
            try {
                Typeface a = mo2180a(context, inputStream);
                C0555i.m2450a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0555i.m2450a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0555i.m2450a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0555i.m2450a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0555i.m2450a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C0394c.C0397c m2429a(C0394c.C0396b bVar, int i) {
        return (C0394c.C0397c) m2430a(bVar.mo1452a(), i, new C0554a<C0394c.C0397c>() {
            /* renamed from: a */
            public int mo2184b(C0394c.C0397c cVar) {
                return cVar.mo1454b();
            }

            /* renamed from: b */
            public boolean mo2183a(C0394c.C0397c cVar) {
                return cVar.mo1455c();
            }
        });
    }

    /* renamed from: a */
    public Typeface mo2170a(Context context, C0394c.C0396b bVar, Resources resources, int i) {
        C0394c.C0397c a = m2429a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0538c.m2361a(context, resources, a.mo1458f(), a.mo1453a(), i);
    }

    /* renamed from: a */
    public Typeface mo2171a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0555i.m2446a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0555i.m2451a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
