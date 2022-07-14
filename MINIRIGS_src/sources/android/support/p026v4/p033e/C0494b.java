package android.support.p026v4.p033e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.support.p026v4.graphics.C0538c;
import android.support.p026v4.graphics.C0555i;
import android.support.p026v4.p027a.p028a.C0394c;
import android.support.p026v4.p033e.C0502c;
import android.support.p026v4.p035g.C0519g;
import android.support.p026v4.p035g.C0531k;
import android.support.p026v4.p035g.C0532l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.e.b */
public class C0494b {

    /* renamed from: a */
    static final C0519g<String, Typeface> f1635a = new C0519g<>(16);

    /* renamed from: b */
    static final Object f1636b = new Object();

    /* renamed from: c */
    static final C0532l<String, ArrayList<C0502c.C0507a<C0501c>>> f1637c = new C0532l<>();

    /* renamed from: d */
    private static final C0502c f1638d = new C0502c("fonts", 10, 10000);

    /* renamed from: e */
    private static final Comparator<byte[]> f1639e = new Comparator<byte[]>() {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* renamed from: a */
    static C0501c m2193a(Context context, C0493a aVar, int i) {
        try {
            C0499a a = m2192a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo1927a() == 0) {
                Typeface a2 = C0538c.m2362a(context, (CancellationSignal) null, a.mo1928b(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0501c(a2, i2);
            }
            if (a.mo1927a() == 1) {
                i2 = -2;
            }
            return new C0501c((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0501c((Typeface) null, -1);
        }
    }

    /* renamed from: android.support.v4.e.b$c */
    private static final class C0501c {

        /* renamed from: a */
        final Typeface f1654a;

        /* renamed from: b */
        final int f1655b;

        C0501c(Typeface typeface, int i) {
            this.f1654a = typeface;
            this.f1655b = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        f1638d.mo1937a(r1, new android.support.p026v4.p033e.C0494b.C04973());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2191a(final android.content.Context r2, final android.support.p026v4.p033e.C0493a r3, final android.support.p026v4.p027a.p028a.C0402f.C0403a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo1918f()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.g.g<java.lang.String, android.graphics.Typeface> r1 = f1635a
            java.lang.Object r1 = r1.mo2017a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1464a((android.graphics.Typeface) r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0045
            r1 = -1
            if (r7 != r1) goto L_0x0045
            android.support.v4.e.b$c r2 = m2193a((android.content.Context) r2, (android.support.p026v4.p033e.C0493a) r3, (int) r8)
            if (r4 == 0) goto L_0x0042
            int r3 = r2.f1655b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f1654a
            r4.mo1465a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x0042
        L_0x003d:
            int r3 = r2.f1655b
            r4.mo1463a((int) r3, (android.os.Handler) r5)
        L_0x0042:
            android.graphics.Typeface r2 = r2.f1654a
            return r2
        L_0x0045:
            android.support.v4.e.b$1 r1 = new android.support.v4.e.b$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0059
            android.support.v4.e.c r3 = f1638d     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Object r3 = r3.mo1934a(r1, (int) r7)     // Catch:{ InterruptedException -> 0x0058 }
            android.support.v4.e.b$c r3 = (android.support.p026v4.p033e.C0494b.C0501c) r3     // Catch:{ InterruptedException -> 0x0058 }
            android.graphics.Typeface r2 = r3.f1654a     // Catch:{ InterruptedException -> 0x0058 }
            return r2
        L_0x0058:
            return r2
        L_0x0059:
            if (r4 != 0) goto L_0x005d
            r3 = r2
            goto L_0x0062
        L_0x005d:
            android.support.v4.e.b$2 r3 = new android.support.v4.e.b$2
            r3.<init>(r4, r5)
        L_0x0062:
            java.lang.Object r4 = f1636b
            monitor-enter(r4)
            android.support.v4.g.l<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r5 = f1637c     // Catch:{ all -> 0x0097 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007a
            android.support.v4.g.l<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r5 = f1637c     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            return r2
        L_0x007c:
            if (r3 == 0) goto L_0x008b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
            android.support.v4.g.l<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r3 = f1637c     // Catch:{ all -> 0x0097 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0097 }
        L_0x008b:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            android.support.v4.e.c r3 = f1638d
            android.support.v4.e.b$3 r4 = new android.support.v4.e.b$3
            r4.<init>(r0)
            r3.mo1937a(r1, r4)
            return r2
        L_0x0097:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p033e.C0494b.m2191a(android.content.Context, android.support.v4.e.a, android.support.v4.a.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: android.support.v4.e.b$b */
    public static class C0500b {

        /* renamed from: a */
        private final Uri f1649a;

        /* renamed from: b */
        private final int f1650b;

        /* renamed from: c */
        private final int f1651c;

        /* renamed from: d */
        private final boolean f1652d;

        /* renamed from: e */
        private final int f1653e;

        public C0500b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1649a = (Uri) C0531k.m2315a(uri);
            this.f1650b = i;
            this.f1651c = i2;
            this.f1652d = z;
            this.f1653e = i3;
        }

        /* renamed from: a */
        public Uri mo1929a() {
            return this.f1649a;
        }

        /* renamed from: b */
        public int mo1930b() {
            return this.f1650b;
        }

        /* renamed from: c */
        public int mo1931c() {
            return this.f1651c;
        }

        /* renamed from: d */
        public boolean mo1932d() {
            return this.f1652d;
        }

        /* renamed from: e */
        public int mo1933e() {
            return this.f1653e;
        }
    }

    /* renamed from: android.support.v4.e.b$a */
    public static class C0499a {

        /* renamed from: a */
        private final int f1647a;

        /* renamed from: b */
        private final C0500b[] f1648b;

        public C0499a(int i, C0500b[] bVarArr) {
            this.f1647a = i;
            this.f1648b = bVarArr;
        }

        /* renamed from: a */
        public int mo1927a() {
            return this.f1647a;
        }

        /* renamed from: b */
        public C0500b[] mo1928b() {
            return this.f1648b;
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2196a(Context context, C0500b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0500b bVar : bVarArr) {
            if (bVar.mo1933e() == 0) {
                Uri a = bVar.mo1929a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0555i.m2448a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C0499a m2192a(Context context, CancellationSignal cancellationSignal, C0493a aVar) {
        ProviderInfo a = m2190a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0499a(1, (C0500b[]) null);
        }
        return new C0499a(0, m2198a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m2190a(PackageManager packageManager, C0493a aVar, Resources resources) {
        String a = aVar.mo1913a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + a);
        } else if (resolveContentProvider.packageName.equals(aVar.mo1914b())) {
            List<byte[]> a2 = m2195a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f1639e);
            List<List<byte[]>> a3 = m2194a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, f1639e);
                if (m2197a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + a + ", but package was not " + aVar.mo1914b());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m2194a(C0493a aVar, Resources resources) {
        if (aVar.mo1916d() != null) {
            return aVar.mo1916d();
        }
        return C0394c.m1643a(resources, aVar.mo1917e());
    }

    /* renamed from: a */
    private static boolean m2197a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m2195a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    static C0500b[] m2198a(Context context, C0493a aVar, String str, CancellationSignal cancellationSignal) {
        Uri uri;
        Cursor query;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1915c()}, (String) null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1915c()}, (String) null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new C0500b(uri, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0500b[]) arrayList.toArray(new C0500b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
