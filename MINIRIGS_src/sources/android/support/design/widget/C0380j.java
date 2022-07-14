package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.j */
class C0380j {

    /* renamed from: a */
    private static C0380j f1266a;

    /* renamed from: b */
    private final Object f1267b = new Object();

    /* renamed from: c */
    private final Handler f1268c = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0380j.this.mo1427a((C0383b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C0383b f1269d;

    /* renamed from: e */
    private C0383b f1270e;

    /* renamed from: android.support.design.widget.j$a */
    interface C0382a {
        /* renamed from: a */
        void mo1111a();

        /* renamed from: a */
        void mo1112a(int i);
    }

    /* renamed from: a */
    static C0380j m1586a() {
        if (f1266a == null) {
            f1266a = new C0380j();
        }
        return f1266a;
    }

    private C0380j() {
    }

    /* renamed from: a */
    public void mo1424a(int i, C0382a aVar) {
        synchronized (this.f1267b) {
            if (m1590f(aVar)) {
                this.f1269d.f1273b = i;
                this.f1268c.removeCallbacksAndMessages(this.f1269d);
                m1589b(this.f1269d);
                return;
            }
            if (m1591g(aVar)) {
                this.f1270e.f1273b = i;
            } else {
                this.f1270e = new C0383b(i, aVar);
            }
            if (this.f1269d == null || !m1587a(this.f1269d, 4)) {
                this.f1269d = null;
                m1588b();
            }
        }
    }

    /* renamed from: a */
    public void mo1426a(C0382a aVar, int i) {
        synchronized (this.f1267b) {
            if (m1590f(aVar)) {
                m1587a(this.f1269d, i);
            } else if (m1591g(aVar)) {
                m1587a(this.f1270e, i);
            }
        }
    }

    /* renamed from: a */
    public void mo1425a(C0382a aVar) {
        synchronized (this.f1267b) {
            if (m1590f(aVar)) {
                this.f1269d = null;
                if (this.f1270e != null) {
                    m1588b();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1428b(C0382a aVar) {
        synchronized (this.f1267b) {
            if (m1590f(aVar)) {
                m1589b(this.f1269d);
            }
        }
    }

    /* renamed from: c */
    public void mo1429c(C0382a aVar) {
        synchronized (this.f1267b) {
            if (m1590f(aVar) && !this.f1269d.f1274c) {
                this.f1269d.f1274c = true;
                this.f1268c.removeCallbacksAndMessages(this.f1269d);
            }
        }
    }

    /* renamed from: d */
    public void mo1430d(C0382a aVar) {
        synchronized (this.f1267b) {
            if (m1590f(aVar) && this.f1269d.f1274c) {
                this.f1269d.f1274c = false;
                m1589b(this.f1269d);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1431e(C0382a aVar) {
        boolean z;
        synchronized (this.f1267b) {
            if (!m1590f(aVar)) {
                if (!m1591g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: android.support.design.widget.j$b */
    private static class C0383b {

        /* renamed from: a */
        final WeakReference<C0382a> f1272a;

        /* renamed from: b */
        int f1273b;

        /* renamed from: c */
        boolean f1274c;

        C0383b(int i, C0382a aVar) {
            this.f1272a = new WeakReference<>(aVar);
            this.f1273b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1433a(C0382a aVar) {
            return aVar != null && this.f1272a.get() == aVar;
        }
    }

    /* renamed from: b */
    private void m1588b() {
        C0383b bVar = this.f1270e;
        if (bVar != null) {
            this.f1269d = bVar;
            this.f1270e = null;
            C0382a aVar = (C0382a) this.f1269d.f1272a.get();
            if (aVar != null) {
                aVar.mo1111a();
            } else {
                this.f1269d = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m1587a(C0383b bVar, int i) {
        C0382a aVar = (C0382a) bVar.f1272a.get();
        if (aVar == null) {
            return false;
        }
        this.f1268c.removeCallbacksAndMessages(bVar);
        aVar.mo1112a(i);
        return true;
    }

    /* renamed from: f */
    private boolean m1590f(C0382a aVar) {
        C0383b bVar = this.f1269d;
        return bVar != null && bVar.mo1433a(aVar);
    }

    /* renamed from: g */
    private boolean m1591g(C0382a aVar) {
        C0383b bVar = this.f1270e;
        return bVar != null && bVar.mo1433a(aVar);
    }

    /* renamed from: b */
    private void m1589b(C0383b bVar) {
        if (bVar.f1273b != -2) {
            int i = 2750;
            if (bVar.f1273b > 0) {
                i = bVar.f1273b;
            } else if (bVar.f1273b == -1) {
                i = 1500;
            }
            this.f1268c.removeCallbacksAndMessages(bVar);
            Handler handler = this.f1268c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1427a(C0383b bVar) {
        synchronized (this.f1267b) {
            if (this.f1269d == bVar || this.f1270e == bVar) {
                m1587a(bVar, 2);
            }
        }
    }
}
