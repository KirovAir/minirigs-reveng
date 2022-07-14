package com.android.p046a.p047a;

import com.android.p046a.C1072b;
import com.android.p046a.C1082g;
import com.android.p046a.C1083h;
import com.android.p046a.C1089n;
import com.android.p046a.C1099r;
import com.android.p046a.C1100s;
import com.android.p046a.C1102u;
import com.android.p046a.C1103v;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.android.a.a.c */
public class C1043c implements C1083h {

    /* renamed from: a */
    protected static final boolean f3788a = C1103v.f3946b;
    @Deprecated

    /* renamed from: b */
    protected final C1053i f3789b;

    /* renamed from: c */
    protected final C1044d f3790c;

    /* renamed from: d */
    private final C1042b f3791d;

    @Deprecated
    public C1043c(C1053i iVar) {
        this(iVar, new C1044d(4096));
    }

    @Deprecated
    public C1043c(C1053i iVar, C1044d dVar) {
        this.f3789b = iVar;
        this.f3791d = new C1041a(iVar);
        this.f3790c = dVar;
    }

    public C1043c(C1042b bVar) {
        this(bVar, new C1044d(4096));
    }

    public C1043c(C1042b bVar, C1044d dVar) {
        this.f3791d = bVar;
        this.f3789b = bVar;
        this.f3790c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r15 = null;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00af, code lost:
        r19 = r1;
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r19 = r1;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        r0 = r12.mo5113a();
        com.android.p046a.C1103v.m5679c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r29.mo5194c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        if (r15 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r13 = new com.android.p046a.C1086k(r0, r15, false, android.os.SystemClock.elapsedRealtime() - r9, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        if (r0 == 401) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f8, code lost:
        if (r0 < 400) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        throw new com.android.p046a.C1077d(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0107, code lost:
        if (r0 < 500) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        if (r29.mo5209r() != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        m5469a("server", r8, new com.android.p046a.C1100s(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        throw new com.android.p046a.C1100s(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012a, code lost:
        throw new com.android.p046a.C1100s(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012b, code lost:
        m5469a("auth", r8, new com.android.p046a.C1040a(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0137, code lost:
        m5469a("network", r8, new com.android.p046a.C1085j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0148, code lost:
        throw new com.android.p046a.C1087l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0164, code lost:
        throw new java.lang.RuntimeException("Bad URL " + r29.mo5194c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0165, code lost:
        m5469a("socket", r8, new com.android.p046a.C1101t());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0149 A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0143 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.p046a.C1086k mo5094a(com.android.p046a.C1089n<?> r29) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            long r9 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r1 = java.util.Collections.emptyList()
            r11 = 0
            r2 = 0
            com.android.a.b$a r0 = r29.mo5197e()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00bc }
            java.util.Map r0 = r7.m5467a((com.android.p046a.C1072b.C1073a) r0)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00bc }
            com.android.a.a.b r3 = r7.f3791d     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00bc }
            com.android.a.a.h r12 = r3.mo5092a(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00bc }
            int r14 = r12.mo5113a()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00b7 }
            java.util.List r13 = r12.mo5114b()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00b7 }
            r0 = 304(0x130, float:4.26E-43)
            if (r14 != r0) goto L_0x0063
            com.android.a.b$a r0 = r29.mo5197e()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            if (r0 != 0) goto L_0x0043
            com.android.a.k r0 = new com.android.a.k     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            r16 = 304(0x130, float:4.26E-43)
            r17 = 0
            r18 = 1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            long r19 = r3 - r9
            r15 = r0
            r21 = r13
            r15.<init>((int) r16, (byte[]) r17, (boolean) r18, (long) r19, (java.util.List<com.android.p046a.C1082g>) r21)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            return r0
        L_0x0043:
            java.util.List r27 = m5466a((java.util.List<com.android.p046a.C1082g>) r13, (com.android.p046a.C1072b.C1073a) r0)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            com.android.a.k r1 = new com.android.a.k     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            r22 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f3862a     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            r24 = 1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            long r25 = r3 - r9
            r21 = r1
            r23 = r0
            r21.<init>((int) r22, (byte[]) r23, (boolean) r24, (long) r25, (java.util.List<com.android.p046a.C1082g>) r27)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            return r1
        L_0x005d:
            r0 = move-exception
            r15 = r2
            r19 = r13
            goto L_0x00c1
        L_0x0063:
            java.io.InputStream r0 = r12.mo5116d()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00b4 }
            if (r0 == 0) goto L_0x0074
            int r1 = r12.mo5115c()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            byte[] r0 = r7.m5470a((java.io.InputStream) r0, (int) r1)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x005d }
            r20 = r0
            goto L_0x0078
        L_0x0074:
            byte[] r0 = new byte[r11]     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00b4 }
            r20 = r0
        L_0x0078:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ad }
            long r2 = r0 - r9
            r1 = r28
            r4 = r29
            r5 = r20
            r6 = r14
            r1.m5468a(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ad }
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 < r0) goto L_0x00a4
            r0 = 299(0x12b, float:4.19E-43)
            if (r14 > r0) goto L_0x00a4
            com.android.a.k r0 = new com.android.a.k     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ad }
            r16 = 0
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ad }
            long r17 = r1 - r9
            r1 = r13
            r13 = r0
            r15 = r20
            r19 = r1
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List<com.android.p046a.C1082g>) r19)     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ab }
            return r0
        L_0x00a4:
            r1 = r13
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ab }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ab }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0165, MalformedURLException -> 0x0149, IOException -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            goto L_0x00af
        L_0x00ad:
            r0 = move-exception
            r1 = r13
        L_0x00af:
            r19 = r1
            r15 = r20
            goto L_0x00c1
        L_0x00b4:
            r0 = move-exception
            r1 = r13
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            r19 = r1
            r15 = r2
            goto L_0x00c1
        L_0x00bc:
            r0 = move-exception
            r19 = r1
            r12 = r2
            r15 = r12
        L_0x00c1:
            if (r12 == 0) goto L_0x0143
            int r0 = r12.mo5113a()
            java.lang.String r1 = "Unexpected response code %d for %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r11] = r3
            r3 = 1
            java.lang.String r4 = r29.mo5194c()
            r2[r3] = r4
            com.android.p046a.C1103v.m5679c(r1, r2)
            if (r15 == 0) goto L_0x0137
            com.android.a.k r1 = new com.android.a.k
            r16 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r17 = r2 - r9
            r13 = r1
            r14 = r0
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List<com.android.p046a.C1082g>) r19)
            r2 = 401(0x191, float:5.62E-43)
            if (r0 == r2) goto L_0x012b
            r2 = 403(0x193, float:5.65E-43)
            if (r0 != r2) goto L_0x00f6
            goto L_0x012b
        L_0x00f6:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0105
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x00ff
            goto L_0x0105
        L_0x00ff:
            com.android.a.d r0 = new com.android.a.d
            r0.<init>(r1)
            throw r0
        L_0x0105:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x0125
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x0125
            boolean r0 = r29.mo5209r()
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "server"
            com.android.a.s r2 = new com.android.a.s
            r2.<init>(r1)
            m5469a(r0, r8, r2)
            goto L_0x0008
        L_0x011f:
            com.android.a.s r0 = new com.android.a.s
            r0.<init>(r1)
            throw r0
        L_0x0125:
            com.android.a.s r0 = new com.android.a.s
            r0.<init>(r1)
            throw r0
        L_0x012b:
            java.lang.String r0 = "auth"
            com.android.a.a r2 = new com.android.a.a
            r2.<init>(r1)
            m5469a(r0, r8, r2)
            goto L_0x0008
        L_0x0137:
            java.lang.String r0 = "network"
            com.android.a.j r1 = new com.android.a.j
            r1.<init>()
            m5469a(r0, r8, r1)
            goto L_0x0008
        L_0x0143:
            com.android.a.l r1 = new com.android.a.l
            r1.<init>(r0)
            throw r1
        L_0x0149:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad URL "
            r2.append(r3)
            java.lang.String r3 = r29.mo5194c()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0165:
            java.lang.String r0 = "socket"
            com.android.a.t r1 = new com.android.a.t
            r1.<init>()
            m5469a(r0, r8, r1)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p046a.p047a.C1043c.mo5094a(com.android.a.n):com.android.a.k");
    }

    /* renamed from: a */
    private void m5468a(long j, C1089n<?> nVar, byte[] bArr, int i) {
        if (f3788a || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = nVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(nVar.mo5212u().mo5166b());
            C1103v.m5678b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m5469a(String str, C1089n<?> nVar, C1102u uVar) {
        C1099r u = nVar.mo5212u();
        int t = nVar.mo5210t();
        try {
            u.mo5165a(uVar);
            nVar.mo5190a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(t)}));
        } catch (C1102u e) {
            nVar.mo5190a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(t)}));
            throw e;
        }
    }

    /* renamed from: a */
    private Map<String, String> m5467a(C1072b.C1073a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        if (aVar.f3863b != null) {
            hashMap.put("If-None-Match", aVar.f3863b);
        }
        if (aVar.f3865d > 0) {
            hashMap.put("If-Modified-Since", C1051g.m5509a(aVar.f3865d));
        }
        return hashMap;
    }

    /* renamed from: a */
    private byte[] m5470a(InputStream inputStream, int i) {
        C1069n nVar = new C1069n(this.f3790c, i);
        if (inputStream != null) {
            try {
                byte[] a = this.f3790c.mo5096a(1024);
                while (true) {
                    int read = inputStream.read(a);
                    if (read == -1) {
                        break;
                    }
                    nVar.write(a, 0, read);
                }
                byte[] byteArray = nVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        C1103v.m5676a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f3790c.mo5095a(a);
                nVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        C1103v.m5676a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f3790c.mo5095a((byte[]) null);
                nVar.close();
                throw th;
            }
        } else {
            throw new C1100s();
        }
    }

    /* renamed from: a */
    private static List<C1082g> m5466a(List<C1082g> list, C1072b.C1073a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C1082g a : list) {
                treeSet.add(a.mo5173a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (aVar.f3869h != null) {
            if (!aVar.f3869h.isEmpty()) {
                for (C1082g next : aVar.f3869h) {
                    if (!treeSet.contains(next.mo5173a())) {
                        arrayList.add(next);
                    }
                }
            }
        } else if (!aVar.f3868g.isEmpty()) {
            for (Map.Entry next2 : aVar.f3868g.entrySet()) {
                if (!treeSet.contains(next2.getKey())) {
                    arrayList.add(new C1082g((String) next2.getKey(), (String) next2.getValue()));
                }
            }
        }
        return arrayList;
    }
}
