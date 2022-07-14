package android.arch.p003b.p004a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: android.arch.b.a.c */
public interface C0024c {

    /* renamed from: android.arch.b.a.c$c */
    public interface C0028c {
        /* renamed from: a */
        C0024c mo60a(C0026b bVar);
    }

    /* renamed from: a */
    C0023b mo49a();

    /* renamed from: a */
    void mo50a(boolean z);

    /* renamed from: android.arch.b.a.c$a */
    public static abstract class C0025a {

        /* renamed from: a */
        public final int f37a;

        /* renamed from: a */
        public void mo69a(C0023b bVar) {
        }

        /* renamed from: a */
        public abstract void mo70a(C0023b bVar, int i, int i2);

        /* renamed from: b */
        public abstract void mo71b(C0023b bVar);

        /* renamed from: c */
        public void mo73c(C0023b bVar) {
        }

        public C0025a(int i) {
            this.f37a = i;
        }

        /* renamed from: b */
        public void mo72b(C0023b bVar, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r4 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r4.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m78a((java.lang.String) r4.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m78a(r4.mo46f());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo74d(android.arch.p003b.p004a.C0023b r4) {
            /*
                r3 = this;
                java.lang.String r0 = "SupportSQLite"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                java.lang.String r2 = r4.mo46f()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1)
                boolean r0 = r4.mo45e()
                if (r0 != 0) goto L_0x0028
                java.lang.String r4 = r4.mo46f()
                r3.m78a((java.lang.String) r4)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r4.mo47g()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r4.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0056
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r4 = r0.iterator()
            L_0x003a:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r4.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r3.m78a((java.lang.String) r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r4 = r4.mo46f()
                r3.m78a((java.lang.String) r4)
            L_0x0055:
                throw r1
            L_0x0056:
                if (r0 == 0) goto L_0x0070
                java.util.Iterator r4 = r0.iterator()
            L_0x005c:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0077
                java.lang.Object r0 = r4.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r3.m78a((java.lang.String) r0)
                goto L_0x005c
            L_0x0070:
                java.lang.String r4 = r4.mo46f()
                r3.m78a((java.lang.String) r4)
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.p003b.p004a.C0024c.C0025a.mo74d(android.arch.b.a.b):void");
        }

        /* renamed from: a */
        private void m78a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }
    }

    /* renamed from: android.arch.b.a.c$b */
    public static class C0026b {

        /* renamed from: a */
        public final Context f38a;

        /* renamed from: b */
        public final String f39b;

        /* renamed from: c */
        public final C0025a f40c;

        C0026b(Context context, String str, C0025a aVar) {
            this.f38a = context;
            this.f39b = str;
            this.f40c = aVar;
        }

        /* renamed from: a */
        public static C0027a m85a(Context context) {
            return new C0027a(context);
        }

        /* renamed from: android.arch.b.a.c$b$a */
        public static class C0027a {

            /* renamed from: a */
            Context f41a;

            /* renamed from: b */
            String f42b;

            /* renamed from: c */
            C0025a f43c;

            /* renamed from: a */
            public C0026b mo77a() {
                C0025a aVar = this.f43c;
                if (aVar != null) {
                    Context context = this.f41a;
                    if (context != null) {
                        return new C0026b(context, this.f42b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            C0027a(Context context) {
                this.f41a = context;
            }

            /* renamed from: a */
            public C0027a mo76a(String str) {
                this.f42b = str;
                return this;
            }

            /* renamed from: a */
            public C0027a mo75a(C0025a aVar) {
                this.f43c = aVar;
                return this;
            }
        }
    }
}
