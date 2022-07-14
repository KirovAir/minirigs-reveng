package android.support.p026v4.p036h.p037a;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v4.h.a.b */
public final class C0560b {

    /* renamed from: android.support.v4.h.a.b$a */
    public interface C0561a {
        /* renamed from: a */
        void mo1131a(boolean z);
    }

    /* renamed from: a */
    public static boolean m2459a(AccessibilityManager accessibilityManager, C0561a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new C0562b(aVar));
    }

    /* renamed from: b */
    public static boolean m2460b(AccessibilityManager accessibilityManager, C0561a aVar) {
        if (Build.VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C0562b(aVar));
    }

    /* renamed from: android.support.v4.h.a.b$b */
    private static class C0562b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C0561a f1800a;

        C0562b(C0561a aVar) {
            this.f1800a = aVar;
        }

        public int hashCode() {
            return this.f1800a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f1800a.equals(((C0562b) obj).f1800a);
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f1800a.mo1131a(z);
        }
    }
}
