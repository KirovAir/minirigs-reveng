package android.arch.p003b.p006b;

import android.arch.p003b.p004a.C0031f;

/* renamed from: android.arch.b.b.b */
public abstract class C0034b<T> extends C0056j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo81a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo82a(C0031f fVar, T t);

    public C0034b(C0047f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final int mo80a(T t) {
        C0031f c = mo140c();
        try {
            mo82a(c, t);
            return c.mo67a();
        } finally {
            mo138a(c);
        }
    }
}
