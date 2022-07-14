package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.s */
public class C0092s {

    /* renamed from: a */
    private final HashMap<String, C0089q> f205a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo220a(String str, C0089q qVar) {
        C0089q put = this.f205a.put(str, qVar);
        if (put != null) {
            put.mo214a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0089q mo218a(String str) {
        return this.f205a.get(str);
    }

    /* renamed from: a */
    public final void mo219a() {
        for (C0089q a : this.f205a.values()) {
            a.mo214a();
        }
        this.f205a.clear();
    }
}
