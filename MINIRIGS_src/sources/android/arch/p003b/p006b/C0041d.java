package android.arch.p003b.p006b;

import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p002b.C0006b;
import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0031f;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p035g.C0513b;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: android.arch.b.b.d */
public class C0041d {

    /* renamed from: f */
    private static final String[] f74f = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    C0511a<String, Integer> f75a;

    /* renamed from: b */
    long[] f76b;

    /* renamed from: c */
    AtomicBoolean f77c;

    /* renamed from: d */
    final C0006b<C0044b, C0045c> f78d;

    /* renamed from: e */
    Runnable f79e;

    /* renamed from: g */
    private String[] f80g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Object[] f81h = new Object[1];
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f82i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0047f f83j;

    /* renamed from: k */
    private volatile boolean f84k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile C0031f f85l;

    /* renamed from: m */
    private C0043a f86m;

    /* renamed from: android.arch.b.b.d$b */
    public static abstract class C0044b {
        /* renamed from: a */
        public abstract void mo106a(Set<String> set);
    }

    public C0041d(C0047f fVar, String... strArr) {
        this.f77c = new AtomicBoolean(false);
        this.f84k = false;
        this.f78d = new C0006b<>();
        this.f79e = new Runnable() {
            public void run() {
                C0023b a;
                Lock a2 = C0041d.this.f83j.mo111a();
                boolean z = false;
                try {
                    a2.lock();
                    if (!C0041d.this.m120b()) {
                        a2.unlock();
                    } else if (!C0041d.this.f77c.compareAndSet(true, false)) {
                        a2.unlock();
                    } else if (C0041d.this.f83j.mo122i()) {
                        a2.unlock();
                    } else {
                        C0041d.this.f85l.mo67a();
                        C0041d.this.f81h[0] = Long.valueOf(C0041d.this.f82i);
                        if (C0041d.this.f83j.f99b) {
                            a = C0041d.this.f83j.mo114b().mo49a();
                            a.mo38a();
                            z = m128a();
                            a.mo41c();
                            a.mo40b();
                        } else {
                            z = m128a();
                        }
                        a2.unlock();
                        if (z) {
                            synchronized (C0041d.this.f78d) {
                                Iterator<Map.Entry<C0044b, C0045c>> it = C0041d.this.f78d.iterator();
                                while (it.hasNext()) {
                                    ((C0045c) it.next().getValue()).mo107a(C0041d.this.f76b);
                                }
                            }
                        }
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    try {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    } catch (Throwable th) {
                        a2.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    a.mo40b();
                    throw th2;
                }
            }

            /* renamed from: a */
            private boolean m128a() {
                Cursor a = C0041d.this.f83j.mo110a("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", C0041d.this.f81h);
                boolean z = false;
                while (a.moveToNext()) {
                    try {
                        long j = a.getLong(0);
                        C0041d.this.f76b[a.getInt(1)] = j;
                        long unused = C0041d.this.f82i = j;
                        z = true;
                    } finally {
                        a.close();
                    }
                }
                return z;
            }
        };
        this.f83j = fVar;
        this.f86m = new C0043a(strArr.length);
        this.f75a = new C0511a<>();
        int length = strArr.length;
        this.f80g = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f75a.put(lowerCase, Integer.valueOf(i));
            this.f80g[i] = lowerCase;
        }
        this.f76b = new long[strArr.length];
        Arrays.fill(this.f76b, 0);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo101a(C0023b bVar) {
        synchronized (this) {
            if (this.f84k) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.mo38a();
            try {
                bVar.mo42c("PRAGMA temp_store = MEMORY;");
                bVar.mo42c("PRAGMA recursive_triggers='ON';");
                bVar.mo42c("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                bVar.mo41c();
                bVar.mo40b();
                mo102b(bVar);
                this.f85l = bVar.mo36a("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                this.f84k = true;
            } catch (Throwable th) {
                bVar.mo40b();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m118a(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: a */
    private void m117a(C0023b bVar, int i) {
        String str = this.f80g[i];
        StringBuilder sb = new StringBuilder();
        for (String a : f74f) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m118a(sb, str, a);
            bVar.mo42c(sb.toString());
        }
    }

    /* renamed from: b */
    private void m119b(C0023b bVar, int i) {
        String str = this.f80g[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f74f) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m118a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO ");
            sb.append("room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i);
            sb.append("); END");
            bVar.mo42c(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m120b() {
        if (!this.f83j.mo117d()) {
            return false;
        }
        if (!this.f84k) {
            this.f83j.mo114b().mo49a();
        }
        if (this.f84k) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: a */
    public void mo100a() {
        if (this.f77c.compareAndSet(false, true)) {
            C0000a.m0a().mo1a(this.f79e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo102b(C0023b bVar) {
        if (!bVar.mo44d()) {
            while (true) {
                try {
                    Lock a = this.f83j.mo111a();
                    a.lock();
                    try {
                        int[] a2 = this.f86m.mo104a();
                        if (a2 == null) {
                            a.unlock();
                            return;
                        }
                        int length = a2.length;
                        bVar.mo38a();
                        for (int i = 0; i < length; i++) {
                            switch (a2[i]) {
                                case 1:
                                    m119b(bVar, i);
                                    break;
                                case 2:
                                    m117a(bVar, i);
                                    break;
                            }
                        }
                        bVar.mo41c();
                        bVar.mo40b();
                        this.f86m.mo105b();
                        a.unlock();
                    } catch (Throwable th) {
                        a.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    /* renamed from: android.arch.b.b.d$c */
    static class C0045c {

        /* renamed from: a */
        final int[] f93a;

        /* renamed from: b */
        final C0044b f94b;

        /* renamed from: c */
        private final String[] f95c;

        /* renamed from: d */
        private final long[] f96d;

        /* renamed from: e */
        private final Set<String> f97e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo107a(long[] jArr) {
            int length = this.f93a.length;
            Set set = null;
            for (int i = 0; i < length; i++) {
                long j = jArr[this.f93a[i]];
                long[] jArr2 = this.f96d;
                if (jArr2[i] < j) {
                    jArr2[i] = j;
                    if (length == 1) {
                        set = this.f97e;
                    } else {
                        if (set == null) {
                            set = new C0513b(length);
                        }
                        set.add(this.f95c[i]);
                    }
                }
            }
            if (set != null) {
                this.f94b.mo106a(set);
            }
        }
    }

    /* renamed from: android.arch.b.b.d$a */
    static class C0043a {

        /* renamed from: a */
        final long[] f88a;

        /* renamed from: b */
        final boolean[] f89b;

        /* renamed from: c */
        final int[] f90c;

        /* renamed from: d */
        boolean f91d;

        /* renamed from: e */
        boolean f92e;

        C0043a(int i) {
            this.f88a = new long[i];
            this.f89b = new boolean[i];
            this.f90c = new int[i];
            Arrays.fill(this.f88a, 0);
            Arrays.fill(this.f89b, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo104a() {
            synchronized (this) {
                if (this.f91d) {
                    if (!this.f92e) {
                        int length = this.f88a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f88a[i] > 0;
                                if (z != this.f89b[i]) {
                                    int[] iArr = this.f90c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f90c[i] = 0;
                                }
                                this.f89b[i] = z;
                                i++;
                            } else {
                                this.f92e = true;
                                this.f91d = false;
                                int[] iArr2 = this.f90c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo105b() {
            synchronized (this) {
                this.f92e = false;
            }
        }
    }
}
