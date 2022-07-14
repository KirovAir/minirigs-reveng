package android.support.p015d;

import android.os.IBinder;

/* renamed from: android.support.d.aj */
class C0184aj implements C0186al {

    /* renamed from: a */
    private final IBinder f617a;

    C0184aj(IBinder iBinder) {
        this.f617a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0184aj) && ((C0184aj) obj).f617a.equals(this.f617a);
    }

    public int hashCode() {
        return this.f617a.hashCode();
    }
}
