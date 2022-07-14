package com.android.p046a.p047a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.android.a.a.n */
public class C1069n extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C1044d f3859a;

    public C1069n(C1044d dVar, int i) {
        this.f3859a = dVar;
        this.buf = this.f3859a.mo5096a(Math.max(i, 256));
    }

    public void close() {
        this.f3859a.mo5095a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f3859a.mo5095a(this.buf);
    }

    /* renamed from: a */
    private void m5578a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f3859a.mo5096a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f3859a.mo5095a(this.buf);
            this.buf = a;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m5578a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m5578a(1);
        super.write(i);
    }
}
