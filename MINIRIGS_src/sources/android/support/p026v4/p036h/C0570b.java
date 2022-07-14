package android.support.p026v4.p036h;

import android.os.Build;
import android.os.Bundle;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p026v4.p036h.p037a.C0566d;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.h.b */
public class C0570b {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f1808a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f1809b = new C0571a(this);

    /* renamed from: android.support.v4.h.b$a */
    private static final class C0571a extends View.AccessibilityDelegate {

        /* renamed from: a */
        private final C0570b f1810a;

        C0571a(C0570b bVar) {
            this.f1810a = bVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1810a.mo2245c(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1810a.mo1161a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f1810a.mo981a(view, C0563c.m2462a(accessibilityNodeInfo));
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1810a.mo2246d(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1810a.mo2243a(viewGroup, view, accessibilityEvent);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f1810a.mo2242a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1810a.mo2244b(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0566d a = this.f1810a.mo2240a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo2230a();
            }
            return null;
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1810a.mo1110a(view, i, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo2241a() {
        return this.f1809b;
    }

    /* renamed from: a */
    public void mo2242a(View view, int i) {
        f1808a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: b */
    public void mo2244b(View view, AccessibilityEvent accessibilityEvent) {
        f1808a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: c */
    public boolean mo2245c(View view, AccessibilityEvent accessibilityEvent) {
        return f1808a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo2246d(View view, AccessibilityEvent accessibilityEvent) {
        f1808a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1161a(View view, AccessibilityEvent accessibilityEvent) {
        f1808a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo981a(View view, C0563c cVar) {
        f1808a.onInitializeAccessibilityNodeInfo(view, cVar.mo2199a());
    }

    /* renamed from: a */
    public boolean mo2243a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1808a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0566d mo2240a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f1808a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0566d(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public boolean mo1110a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f1808a.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }
}
