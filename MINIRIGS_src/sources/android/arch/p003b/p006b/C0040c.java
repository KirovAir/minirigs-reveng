package android.arch.p003b.p006b;

import android.arch.p003b.p004a.C0031f;

/* renamed from: android.arch.b.b.c */
public abstract class C0040c<T> extends C0056j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo98a(C0031f fVar, T t);

    public C0040c(C0047f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo99a(T t) {
        C0031f c = mo140c();
        try {
            mo98a(c, t);
            c.mo68b();
        } finally {
            mo138a(c);
        }
    }
}
