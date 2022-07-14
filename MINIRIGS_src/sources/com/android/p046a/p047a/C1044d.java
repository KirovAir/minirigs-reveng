package com.android.p046a.p047a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.android.a.a.d */
public class C1044d {

    /* renamed from: a */
    protected static final Comparator<byte[]> f3792a = new Comparator<byte[]>() {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private final List<byte[]> f3793b = new LinkedList();

    /* renamed from: c */
    private final List<byte[]> f3794c = new ArrayList(64);

    /* renamed from: d */
    private int f3795d = 0;

    /* renamed from: e */
    private final int f3796e;

    public C1044d(int i) {
        this.f3796e = i;
    }

    /* renamed from: a */
    public synchronized byte[] mo5096a(int i) {
        for (int i2 = 0; i2 < this.f3794c.size(); i2++) {
            byte[] bArr = this.f3794c.get(i2);
            if (bArr.length >= i) {
                this.f3795d -= bArr.length;
                this.f3794c.remove(i2);
                this.f3793b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5095a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f3796e     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f3793b     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f3794c     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f3792a     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f3794c     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f3795d     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f3795d = r0     // Catch:{ all -> 0x002b }
            r2.m5472a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p046a.p047a.C1044d.mo5095a(byte[]):void");
    }

    /* renamed from: a */
    private synchronized void m5472a() {
        while (this.f3795d > this.f3796e) {
            byte[] remove = this.f3793b.remove(0);
            this.f3794c.remove(remove);
            this.f3795d -= remove.length;
        }
    }
}
