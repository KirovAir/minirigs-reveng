package android.support.p039v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.d */
class C0994d extends DataSetObservable {

    /* renamed from: a */
    static final String f3646a = "d";

    /* renamed from: e */
    private static final Object f3647e = new Object();

    /* renamed from: f */
    private static final Map<String, C0994d> f3648f = new HashMap();

    /* renamed from: b */
    final Context f3649b;

    /* renamed from: c */
    final String f3650c;

    /* renamed from: d */
    boolean f3651d;

    /* renamed from: g */
    private final Object f3652g;

    /* renamed from: h */
    private final List<C0995a> f3653h;

    /* renamed from: i */
    private final List<C0997c> f3654i;

    /* renamed from: j */
    private Intent f3655j;

    /* renamed from: k */
    private C0996b f3656k;

    /* renamed from: l */
    private int f3657l;

    /* renamed from: m */
    private boolean f3658m;

    /* renamed from: n */
    private boolean f3659n;

    /* renamed from: o */
    private boolean f3660o;

    /* renamed from: p */
    private C0998d f3661p;

    /* renamed from: android.support.v7.widget.d$b */
    public interface C0996b {
        /* renamed from: a */
        void mo4867a(Intent intent, List<C0995a> list, List<C0997c> list2);
    }

    /* renamed from: android.support.v7.widget.d$d */
    public interface C0998d {
        /* renamed from: a */
        boolean mo4871a(C0994d dVar, Intent intent);
    }

    /* renamed from: a */
    public int mo4856a() {
        int size;
        synchronized (this.f3652g) {
            m5257d();
            size = this.f3653h.size();
        }
        return size;
    }

    /* renamed from: a */
    public ResolveInfo mo4858a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3652g) {
            m5257d();
            resolveInfo = this.f3653h.get(i).f3662a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public int mo4857a(ResolveInfo resolveInfo) {
        synchronized (this.f3652g) {
            m5257d();
            List<C0995a> list = this.f3653h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f3662a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public Intent mo4859b(int i) {
        synchronized (this.f3652g) {
            if (this.f3655j == null) {
                return null;
            }
            m5257d();
            C0995a aVar = this.f3653h.get(i);
            ComponentName componentName = new ComponentName(aVar.f3662a.activityInfo.packageName, aVar.f3662a.activityInfo.name);
            Intent intent = new Intent(this.f3655j);
            intent.setComponent(componentName);
            if (this.f3661p != null) {
                if (this.f3661p.mo4871a(this, new Intent(intent))) {
                    return null;
                }
            }
            m5255a(new C0997c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo mo4860b() {
        synchronized (this.f3652g) {
            m5257d();
            if (this.f3653h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f3653h.get(0).f3662a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo4861c(int i) {
        synchronized (this.f3652g) {
            m5257d();
            C0995a aVar = this.f3653h.get(i);
            C0995a aVar2 = this.f3653h.get(0);
            m5255a(new C0997c(new ComponentName(aVar.f3662a.activityInfo.packageName, aVar.f3662a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f3663b - aVar.f3663b) + 5.0f : 1.0f));
        }
    }

    /* renamed from: c */
    private void m5256c() {
        if (!this.f3658m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f3659n) {
            this.f3659n = false;
            if (!TextUtils.isEmpty(this.f3650c)) {
                new C0999e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f3654i), this.f3650c});
            }
        }
    }

    /* renamed from: d */
    private void m5257d() {
        boolean f = m5259f() | m5260g();
        m5261h();
        if (f) {
            m5258e();
            notifyChanged();
        }
    }

    /* renamed from: e */
    private boolean m5258e() {
        if (this.f3656k == null || this.f3655j == null || this.f3653h.isEmpty() || this.f3654i.isEmpty()) {
            return false;
        }
        this.f3656k.mo4867a(this.f3655j, this.f3653h, Collections.unmodifiableList(this.f3654i));
        return true;
    }

    /* renamed from: f */
    private boolean m5259f() {
        if (!this.f3660o || this.f3655j == null) {
            return false;
        }
        this.f3660o = false;
        this.f3653h.clear();
        List<ResolveInfo> queryIntentActivities = this.f3649b.getPackageManager().queryIntentActivities(this.f3655j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f3653h.add(new C0995a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: g */
    private boolean m5260g() {
        if (!this.f3651d || !this.f3659n || TextUtils.isEmpty(this.f3650c)) {
            return false;
        }
        this.f3651d = false;
        this.f3658m = true;
        m5262i();
        return true;
    }

    /* renamed from: a */
    private boolean m5255a(C0997c cVar) {
        boolean add = this.f3654i.add(cVar);
        if (add) {
            this.f3659n = true;
            m5261h();
            m5256c();
            m5258e();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: h */
    private void m5261h() {
        int size = this.f3654i.size() - this.f3657l;
        if (size > 0) {
            this.f3659n = true;
            for (int i = 0; i < size; i++) {
                C0997c remove = this.f3654i.remove(0);
            }
        }
    }

    /* renamed from: android.support.v7.widget.d$c */
    public static final class C0997c {

        /* renamed from: a */
        public final ComponentName f3664a;

        /* renamed from: b */
        public final long f3665b;

        /* renamed from: c */
        public final float f3666c;

        public C0997c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0997c(ComponentName componentName, long j, float f) {
            this.f3664a = componentName;
            this.f3665b = j;
            this.f3666c = f;
        }

        public int hashCode() {
            ComponentName componentName = this.f3664a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f3665b;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f3666c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0997c cVar = (C0997c) obj;
            ComponentName componentName = this.f3664a;
            if (componentName == null) {
                if (cVar.f3664a != null) {
                    return false;
                }
            } else if (!componentName.equals(cVar.f3664a)) {
                return false;
            }
            return this.f3665b == cVar.f3665b && Float.floatToIntBits(this.f3666c) == Float.floatToIntBits(cVar.f3666c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f3664a + "; time:" + this.f3665b + "; weight:" + new BigDecimal((double) this.f3666c) + "]";
        }
    }

    /* renamed from: android.support.v7.widget.d$a */
    public static final class C0995a implements Comparable<C0995a> {

        /* renamed from: a */
        public final ResolveInfo f3662a;

        /* renamed from: b */
        public float f3663b;

        public C0995a(ResolveInfo resolveInfo) {
            this.f3662a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f3663b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f3663b) == Float.floatToIntBits(((C0995a) obj).f3663b);
        }

        /* renamed from: a */
        public int compareTo(C0995a aVar) {
            return Float.floatToIntBits(aVar.f3663b) - Float.floatToIntBits(this.f3663b);
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f3662a.toString() + "; weight:" + new BigDecimal((double) this.f3663b) + "]";
        }
    }

    /* renamed from: i */
    private void m5262i() {
        try {
            FileInputStream openFileInput = this.f3649b.openFileInput(this.f3650c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0997c> list = this.f3654i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new C0997c(newPullParser.getAttributeValue((String) null, "activity"), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e) {
                String str = f3646a;
                Log.e(str, "Error reading historical recrod file: " + this.f3650c, e);
                if (openFileInput == null) {
                }
            } catch (IOException e2) {
                String str2 = f3646a;
                Log.e(str2, "Error reading historical recrod file: " + this.f3650c, e2);
                if (openFileInput == null) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* renamed from: android.support.v7.widget.d$e */
    private final class C0999e extends AsyncTask<Object, Void, Void> {
        C0999e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r12 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
            if (r12 == null) goto L_0x00dd;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.d r4 = android.support.p039v7.widget.C0994d.this     // Catch:{ FileNotFoundException -> 0x00e8 }
                android.content.Context r4 = r4.f3649b     // Catch:{ FileNotFoundException -> 0x00e8 }
                java.io.FileOutputStream r12 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00e8 }
                org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
                r4.setOutput(r12, r3)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "historical-records"
                r4.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r6 = 0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.d$c r7 = (android.support.p039v7.widget.C0994d.C0997c) r7     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "historical-record"
                r4.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f3664a     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "time"
                long r9 = r7.f3665b     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "weight"
                float r7 = r7.f3666c     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = "historical-record"
                r4.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r4.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r4.endDocument()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.d r0 = android.support.p039v7.widget.C0994d.this
                r0.f3651d = r2
                if (r12 == 0) goto L_0x00dd
            L_0x0071:
                r12.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00dd
            L_0x0075:
                r0 = move-exception
                goto L_0x00de
            L_0x0077:
                r0 = move-exception
                java.lang.String r1 = android.support.p039v7.widget.C0994d.f3646a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p039v7.widget.C0994d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3650c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r0 = android.support.p039v7.widget.C0994d.this
                r0.f3651d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x0099:
                r0 = move-exception
                java.lang.String r1 = android.support.p039v7.widget.C0994d.f3646a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p039v7.widget.C0994d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3650c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r0 = android.support.p039v7.widget.C0994d.this
                r0.f3651d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00bb:
                r0 = move-exception
                java.lang.String r1 = android.support.p039v7.widget.C0994d.f3646a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p039v7.widget.C0994d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3650c     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r1, r4, r0)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r0 = android.support.p039v7.widget.C0994d.this
                r0.f3651d = r2
                if (r12 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00dd:
                return r3
            L_0x00de:
                android.support.v7.widget.d r1 = android.support.p039v7.widget.C0994d.this
                r1.f3651d = r2
                if (r12 == 0) goto L_0x00e7
                r12.close()     // Catch:{ IOException -> 0x00e7 }
            L_0x00e7:
                throw r0
            L_0x00e8:
                r0 = move-exception
                java.lang.String r1 = android.support.p039v7.widget.C0994d.f3646a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Error writing historical record file: "
                r2.append(r4)
                r2.append(r12)
                java.lang.String r12 = r2.toString()
                android.util.Log.e(r1, r12, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0994d.C0999e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }
}
