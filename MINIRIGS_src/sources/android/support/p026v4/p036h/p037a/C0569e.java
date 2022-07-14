package android.support.p026v4.p036h.p037a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.h.a.e */
public class C0569e {

    /* renamed from: a */
    private final AccessibilityRecord f1807a;

    /* renamed from: a */
    public static void m2498a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2499b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f1807a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0569e eVar = (C0569e) obj;
        AccessibilityRecord accessibilityRecord = this.f1807a;
        if (accessibilityRecord == null) {
            if (eVar.f1807a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(eVar.f1807a)) {
            return false;
        }
        return true;
    }
}
