package android.support.p015d;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.d.x */
class C0237x {
    /* renamed from: a */
    static C0236w m874a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0235v(viewGroup);
        }
        return C0234u.m865a(viewGroup);
    }

    /* renamed from: a */
    static void m875a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0240z.m879a(viewGroup, z);
        } else {
            C0238y.m877a(viewGroup, z);
        }
    }
}
