package com.android.p046a.p047a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.p046a.C1072b;
import com.android.p046a.C1082g;
import com.android.p046a.C1103v;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.a.a.e */
public class C1046e implements C1072b {

    /* renamed from: a */
    private final Map<String, C1047a> f3797a;

    /* renamed from: b */
    private long f3798b;

    /* renamed from: c */
    private final File f3799c;

    /* renamed from: d */
    private final int f3800d;

    public C1046e(File file, int i) {
        this.f3797a = new LinkedHashMap(16, 0.75f, true);
        this.f3798b = 0;
        this.f3799c = file;
        this.f3800d = i;
    }

    public C1046e(File file) {
        this(file, 5242880);
    }

    /* renamed from: a */
    public synchronized C1072b.C1073a mo5099a(String str) {
        C1048b bVar;
        C1047a aVar = this.f3797a.get(str);
        if (aVar == null) {
            return null;
        }
        File c = mo5105c(str);
        try {
            bVar = new C1048b(new BufferedInputStream(mo5100a(c)), c.length());
            C1047a a = C1047a.m5497a(bVar);
            if (!TextUtils.equals(str, a.f3802b)) {
                C1103v.m5678b("%s: key=%s, found=%s", c.getAbsolutePath(), str, a.f3802b);
                m5489e(str);
                bVar.close();
                return null;
            }
            C1072b.C1073a a2 = aVar.mo5106a(m5484a(bVar, bVar.mo5108a()));
            bVar.close();
            return a2;
        } catch (IOException e) {
            C1103v.m5678b("%s: %s", c.getAbsolutePath(), e.toString());
            mo5104b(str);
            return null;
        } catch (Throwable th) {
            bVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5101a() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f3799c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f3799c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f3799c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.android.p046a.C1103v.m5679c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f3799c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.android.a.a.e$b r6 = new com.android.a.a.e$b     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = r9.mo5100a((java.io.File) r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.android.a.a.e$a r7 = com.android.p046a.p047a.C1046e.C1047a.m5497a((com.android.p046a.p047a.C1046e.C1048b) r6)     // Catch:{ all -> 0x0054 }
            r7.f3801a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f3802b     // Catch:{ all -> 0x0054 }
            r9.m5482a((java.lang.String) r4, (com.android.p046a.p047a.C1046e.C1047a) r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p046a.p047a.C1046e.mo5101a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(1:16)|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r0.delete() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        com.android.p046a.C1103v.m5678b("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5102a(java.lang.String r7, com.android.p046a.C1072b.C1073a r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r8.f3862a     // Catch:{ all -> 0x0059 }
            int r0 = r0.length     // Catch:{ all -> 0x0059 }
            r6.m5478a((int) r0)     // Catch:{ all -> 0x0059 }
            java.io.File r0 = r6.mo5105c((java.lang.String) r7)     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0044 }
            java.io.OutputStream r4 = r6.mo5103b((java.io.File) r0)     // Catch:{ IOException -> 0x0044 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0044 }
            com.android.a.a.e$a r4 = new com.android.a.a.e$a     // Catch:{ IOException -> 0x0044 }
            r4.<init>(r7, r8)     // Catch:{ IOException -> 0x0044 }
            boolean r5 = r4.mo5107a((java.io.OutputStream) r3)     // Catch:{ IOException -> 0x0044 }
            if (r5 == 0) goto L_0x002e
            byte[] r8 = r8.f3862a     // Catch:{ IOException -> 0x0044 }
            r3.write(r8)     // Catch:{ IOException -> 0x0044 }
            r3.close()     // Catch:{ IOException -> 0x0044 }
            r6.m5482a((java.lang.String) r7, (com.android.p046a.p047a.C1046e.C1047a) r4)     // Catch:{ IOException -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x002e:
            r3.close()     // Catch:{ IOException -> 0x0044 }
            java.lang.String r7 = "Failed to write header for %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0044 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0044 }
            r8[r1] = r3     // Catch:{ IOException -> 0x0044 }
            com.android.p046a.C1103v.m5678b(r7, r8)     // Catch:{ IOException -> 0x0044 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0044 }
            r7.<init>()     // Catch:{ IOException -> 0x0044 }
            throw r7     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            boolean r7 = r0.delete()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x0057
            java.lang.String r7 = "Could not clean up file %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0059 }
            r8[r1] = r0     // Catch:{ all -> 0x0059 }
            com.android.p046a.C1103v.m5678b(r7, r8)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r6)
            return
        L_0x0059:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p046a.p047a.C1046e.mo5102a(java.lang.String, com.android.a.b$a):void");
    }

    /* renamed from: b */
    public synchronized void mo5104b(String str) {
        boolean delete = mo5105c(str).delete();
        m5489e(str);
        if (!delete) {
            C1103v.m5678b("Could not delete cache entry for key=%s, filename=%s", str, m5488d(str));
        }
    }

    /* renamed from: d */
    private String m5488d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: c */
    public File mo5105c(String str) {
        return new File(this.f3799c, m5488d(str));
    }

    /* renamed from: a */
    private void m5478a(int i) {
        long j;
        long j2 = (long) i;
        if (this.f3798b + j2 >= ((long) this.f3800d)) {
            if (C1103v.f3946b) {
                C1103v.m5676a("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f3798b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C1047a>> it = this.f3797a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C1047a aVar = (C1047a) it.next().getValue();
                if (mo5105c(aVar.f3802b).delete()) {
                    j = j2;
                    this.f3798b -= aVar.f3801a;
                } else {
                    j = j2;
                    C1103v.m5678b("Could not delete cache entry for key=%s, filename=%s", aVar.f3802b, m5488d(aVar.f3802b));
                }
                it.remove();
                i2++;
                if (((float) (this.f3798b + j)) < ((float) this.f3800d) * 0.9f) {
                    break;
                }
                j2 = j;
            }
            if (C1103v.f3946b) {
                C1103v.m5676a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f3798b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    private void m5482a(String str, C1047a aVar) {
        if (!this.f3797a.containsKey(str)) {
            this.f3798b += aVar.f3801a;
        } else {
            this.f3798b += aVar.f3801a - this.f3797a.get(str).f3801a;
        }
        this.f3797a.put(str, aVar);
    }

    /* renamed from: e */
    private void m5489e(String str) {
        C1047a remove = this.f3797a.remove(str);
        if (remove != null) {
            this.f3798b -= remove.f3801a;
        }
    }

    /* renamed from: a */
    static byte[] m5484a(C1048b bVar, long j) {
        long a = bVar.mo5108a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputStream mo5100a(File file) {
        return new FileInputStream(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public OutputStream mo5103b(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: com.android.a.a.e$a */
    static class C1047a {

        /* renamed from: a */
        long f3801a;

        /* renamed from: b */
        final String f3802b;

        /* renamed from: c */
        final String f3803c;

        /* renamed from: d */
        final long f3804d;

        /* renamed from: e */
        final long f3805e;

        /* renamed from: f */
        final long f3806f;

        /* renamed from: g */
        final long f3807g;

        /* renamed from: h */
        final List<C1082g> f3808h;

        private C1047a(String str, String str2, long j, long j2, long j3, long j4, List<C1082g> list) {
            this.f3802b = str;
            this.f3803c = "".equals(str2) ? null : str2;
            this.f3804d = j;
            this.f3805e = j2;
            this.f3806f = j3;
            this.f3807g = j4;
            this.f3808h = list;
        }

        C1047a(String str, C1072b.C1073a aVar) {
            this(str, aVar.f3863b, aVar.f3864c, aVar.f3865d, aVar.f3866e, aVar.f3867f, m5498a(aVar));
            this.f3801a = (long) aVar.f3862a.length;
        }

        /* renamed from: a */
        private static List<C1082g> m5498a(C1072b.C1073a aVar) {
            if (aVar.f3869h != null) {
                return aVar.f3869h;
            }
            return C1051g.m5514b(aVar.f3868g);
        }

        /* renamed from: a */
        static C1047a m5497a(C1048b bVar) {
            if (C1046e.m5476a((InputStream) bVar) == 538247942) {
                return new C1047a(C1046e.m5477a(bVar), C1046e.m5477a(bVar), C1046e.m5485b((InputStream) bVar), C1046e.m5485b((InputStream) bVar), C1046e.m5485b((InputStream) bVar), C1046e.m5485b((InputStream) bVar), C1046e.m5486b(bVar));
            }
            throw new IOException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1072b.C1073a mo5106a(byte[] bArr) {
            C1072b.C1073a aVar = new C1072b.C1073a();
            aVar.f3862a = bArr;
            aVar.f3863b = this.f3803c;
            aVar.f3864c = this.f3804d;
            aVar.f3865d = this.f3805e;
            aVar.f3866e = this.f3806f;
            aVar.f3867f = this.f3807g;
            aVar.f3868g = C1051g.m5513a(this.f3808h);
            aVar.f3869h = Collections.unmodifiableList(this.f3808h);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5107a(OutputStream outputStream) {
            try {
                C1046e.m5479a(outputStream, 538247942);
                C1046e.m5481a(outputStream, this.f3802b);
                C1046e.m5481a(outputStream, this.f3803c == null ? "" : this.f3803c);
                C1046e.m5480a(outputStream, this.f3804d);
                C1046e.m5480a(outputStream, this.f3805e);
                C1046e.m5480a(outputStream, this.f3806f);
                C1046e.m5480a(outputStream, this.f3807g);
                C1046e.m5483a(this.f3808h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1103v.m5678b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.android.a.a.e$b */
    static class C1048b extends FilterInputStream {

        /* renamed from: a */
        private final long f3809a;

        /* renamed from: b */
        private long f3810b;

        C1048b(InputStream inputStream, long j) {
            super(inputStream);
            this.f3809a = j;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f3810b++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f3810b += (long) read;
            }
            return read;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo5108a() {
            return this.f3809a - this.f3810b;
        }
    }

    /* renamed from: c */
    private static int m5487c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m5479a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static int m5476a(InputStream inputStream) {
        return (m5487c(inputStream) << 24) | (m5487c(inputStream) << 0) | 0 | (m5487c(inputStream) << 8) | (m5487c(inputStream) << 16);
    }

    /* renamed from: a */
    static void m5480a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m5485b(InputStream inputStream) {
        return ((((long) m5487c(inputStream)) & 255) << 0) | 0 | ((((long) m5487c(inputStream)) & 255) << 8) | ((((long) m5487c(inputStream)) & 255) << 16) | ((((long) m5487c(inputStream)) & 255) << 24) | ((((long) m5487c(inputStream)) & 255) << 32) | ((((long) m5487c(inputStream)) & 255) << 40) | ((((long) m5487c(inputStream)) & 255) << 48) | ((255 & ((long) m5487c(inputStream))) << 56);
    }

    /* renamed from: a */
    static void m5481a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m5480a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    static String m5477a(C1048b bVar) {
        return new String(m5484a(bVar, m5485b((InputStream) bVar)), "UTF-8");
    }

    /* renamed from: a */
    static void m5483a(List<C1082g> list, OutputStream outputStream) {
        if (list != null) {
            m5479a(outputStream, list.size());
            for (C1082g next : list) {
                m5481a(outputStream, next.mo5173a());
                m5481a(outputStream, next.mo5174b());
            }
            return;
        }
        m5479a(outputStream, 0);
    }

    /* renamed from: b */
    static List<C1082g> m5486b(C1048b bVar) {
        int a = m5476a((InputStream) bVar);
        List<C1082g> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            emptyList.add(new C1082g(m5477a(bVar).intern(), m5477a(bVar).intern()));
        }
        return emptyList;
    }
}
