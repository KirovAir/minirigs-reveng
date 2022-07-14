package com.android.p046a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.a.v */
public class C1103v {

    /* renamed from: a */
    public static String f3945a = "Volley";

    /* renamed from: b */
    public static boolean f3946b = Log.isLoggable(f3945a, 2);

    /* renamed from: a */
    public static void m5676a(String str, Object... objArr) {
        if (f3946b) {
            Log.v(f3945a, m5680d(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m5678b(String str, Object... objArr) {
        Log.d(f3945a, m5680d(str, objArr));
    }

    /* renamed from: c */
    public static void m5679c(String str, Object... objArr) {
        Log.e(f3945a, m5680d(str, objArr));
    }

    /* renamed from: a */
    public static void m5677a(Throwable th, String str, Object... objArr) {
        Log.e(f3945a, m5680d(str, objArr), th);
    }

    /* renamed from: d */
    private static String m5680d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (!stackTrace[i].getClass().equals(C1103v.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* renamed from: com.android.a.v$a */
    static class C1104a {

        /* renamed from: a */
        public static final boolean f3947a = C1103v.f3946b;

        /* renamed from: b */
        private final List<C1105a> f3948b = new ArrayList();

        /* renamed from: c */
        private boolean f3949c = false;

        C1104a() {
        }

        /* renamed from: com.android.a.v$a$a */
        private static class C1105a {

            /* renamed from: a */
            public final String f3950a;

            /* renamed from: b */
            public final long f3951b;

            /* renamed from: c */
            public final long f3952c;

            public C1105a(String str, long j, long j2) {
                this.f3950a = str;
                this.f3951b = j;
                this.f3952c = j2;
            }
        }

        /* renamed from: a */
        public synchronized void mo5226a(String str, long j) {
            if (!this.f3949c) {
                this.f3948b.add(new C1105a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: a */
        public synchronized void mo5225a(String str) {
            this.f3949c = true;
            long a = m5681a();
            if (a > 0) {
                long j = this.f3948b.get(0).f3952c;
                C1103v.m5678b("(%-4d ms) %s", Long.valueOf(a), str);
                for (C1105a next : this.f3948b) {
                    long j2 = next.f3952c;
                    C1103v.m5678b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(next.f3951b), next.f3950a);
                    j = j2;
                }
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            if (!this.f3949c) {
                mo5225a("Request on the loose");
                C1103v.m5679c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        private long m5681a() {
            if (this.f3948b.size() == 0) {
                return 0;
            }
            long j = this.f3948b.get(0).f3952c;
            List<C1105a> list = this.f3948b;
            return list.get(list.size() - 1).f3952c - j;
        }
    }
}
