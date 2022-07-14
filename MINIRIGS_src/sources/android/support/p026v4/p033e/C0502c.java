package android.support.p026v4.p033e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.e.c */
public class C0502c {

    /* renamed from: a */
    private final Object f1656a = new Object();

    /* renamed from: b */
    private HandlerThread f1657b;

    /* renamed from: c */
    private Handler f1658c;

    /* renamed from: d */
    private int f1659d;

    /* renamed from: e */
    private Handler.Callback f1660e = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0502c.this.mo1935a();
                    return true;
                case 1:
                    C0502c.this.mo1936a((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: f */
    private final int f1661f;

    /* renamed from: g */
    private final int f1662g;

    /* renamed from: h */
    private final String f1663h;

    /* renamed from: android.support.v4.e.c$a */
    public interface C0507a<T> {
        /* renamed from: a */
        void mo1923a(T t);
    }

    public C0502c(String str, int i, int i2) {
        this.f1663h = str;
        this.f1662g = i;
        this.f1661f = i2;
        this.f1659d = 0;
    }

    /* renamed from: b */
    private void m2212b(Runnable runnable) {
        synchronized (this.f1656a) {
            if (this.f1657b == null) {
                this.f1657b = new HandlerThread(this.f1663h, this.f1662g);
                this.f1657b.start();
                this.f1658c = new Handler(this.f1657b.getLooper(), this.f1660e);
                this.f1659d++;
            }
            this.f1658c.removeMessages(0);
            this.f1658c.sendMessage(this.f1658c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo1937a(final Callable<T> callable, final C0507a<T> aVar) {
        final Handler handler = new Handler();
        m2212b(new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        aVar.mo1923a(obj);
                    }
                });
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo1934a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.e.c$3 r11 = new android.support.v4.e.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m2212b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.p033e.C0502c.mo1934a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1936a(Runnable runnable) {
        runnable.run();
        synchronized (this.f1656a) {
            this.f1658c.removeMessages(0);
            this.f1658c.sendMessageDelayed(this.f1658c.obtainMessage(0), (long) this.f1661f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1935a() {
        synchronized (this.f1656a) {
            if (!this.f1658c.hasMessages(1)) {
                this.f1657b.quit();
                this.f1657b = null;
                this.f1658c = null;
            }
        }
    }
}
