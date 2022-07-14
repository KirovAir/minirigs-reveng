package android.support.p026v4.p036h.p037a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.h.a.d */
public class C0566d {

    /* renamed from: a */
    private final Object f1805a;

    /* renamed from: a */
    public C0563c mo2229a(int i) {
        return null;
    }

    /* renamed from: a */
    public List<C0563c> mo2231a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo2232a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0563c mo2233b(int i) {
        return null;
    }

    /* renamed from: android.support.v4.h.a.d$a */
    static class C0567a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0566d f1806a;

        C0567a(C0566d dVar) {
            this.f1806a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0563c a = this.f1806a.mo2229a(i);
            if (a == null) {
                return null;
            }
            return a.mo2199a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0563c> a = this.f1806a.mo2231a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).mo2199a());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1806a.mo2232a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.h.a.d$b */
    static class C0568b extends C0567a {
        C0568b(C0566d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0563c b = this.f1806a.mo2233b(i);
            if (b == null) {
                return null;
            }
            return b.mo2199a();
        }
    }

    public C0566d() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1805a = new C0568b(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f1805a = new C0567a(this);
        } else {
            this.f1805a = null;
        }
    }

    public C0566d(Object obj) {
        this.f1805a = obj;
    }

    /* renamed from: a */
    public Object mo2230a() {
        return this.f1805a;
    }
}
