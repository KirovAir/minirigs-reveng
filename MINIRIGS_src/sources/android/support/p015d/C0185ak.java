package android.support.p015d;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.d.ak */
class C0185ak implements C0186al {

    /* renamed from: a */
    private final WindowId f618a;

    C0185ak(View view) {
        this.f618a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0185ak) && ((C0185ak) obj).f618a.equals(this.f618a);
    }

    public int hashCode() {
        return this.f618a.hashCode();
    }
}
