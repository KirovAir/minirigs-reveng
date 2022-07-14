package android.arch.p003b.p006b;

import android.arch.p003b.p004a.C0031f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.b.b.j */
public abstract class C0056j {

    /* renamed from: a */
    private final AtomicBoolean f135a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C0047f f136b;

    /* renamed from: c */
    private volatile C0031f f137c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo81a();

    public C0056j(C0047f fVar) {
        this.f136b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo139b() {
        this.f136b.mo118e();
    }

    /* renamed from: d */
    private C0031f m185d() {
        return this.f136b.mo108a(mo81a());
    }

    /* renamed from: a */
    private C0031f m184a(boolean z) {
        if (!z) {
            return m185d();
        }
        if (this.f137c == null) {
            this.f137c = m185d();
        }
        return this.f137c;
    }

    /* renamed from: c */
    public C0031f mo140c() {
        mo139b();
        return m184a(this.f135a.compareAndSet(false, true));
    }

    /* renamed from: a */
    public void mo138a(C0031f fVar) {
        if (fVar == this.f137c) {
            this.f135a.set(false);
        }
    }
}
