package android.support.p026v4.p036h.p037a;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.h.a.c */
public class C0563c {

    /* renamed from: a */
    public int f1801a = -1;

    /* renamed from: b */
    private final AccessibilityNodeInfo f1802b;

    /* renamed from: b */
    private static String m2463b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: android.support.v4.h.a.c$a */
    public static class C0564a {

        /* renamed from: a */
        final Object f1803a;

        /* renamed from: a */
        public static C0564a m2491a(int i, int i2, boolean z, int i3) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0564a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0564a(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0564a((Object) null);
        }

        C0564a(Object obj) {
            this.f1803a = obj;
        }
    }

    /* renamed from: android.support.v4.h.a.c$b */
    public static class C0565b {

        /* renamed from: a */
        final Object f1804a;

        /* renamed from: a */
        public static C0565b m2492a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0565b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0565b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0565b((Object) null);
        }

        C0565b(Object obj) {
            this.f1804a = obj;
        }
    }

    private C0563c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1802b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0563c m2462a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0563c(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo2199a() {
        return this.f1802b;
    }

    /* renamed from: b */
    public int mo2205b() {
        return this.f1802b.getActions();
    }

    /* renamed from: a */
    public void mo2200a(int i) {
        this.f1802b.addAction(i);
    }

    /* renamed from: a */
    public void mo2201a(Rect rect) {
        this.f1802b.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public void mo2206b(Rect rect) {
        this.f1802b.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public boolean mo2210c() {
        return this.f1802b.isCheckable();
    }

    /* renamed from: a */
    public void mo2204a(boolean z) {
        this.f1802b.setCheckable(z);
    }

    /* renamed from: d */
    public boolean mo2212d() {
        return this.f1802b.isChecked();
    }

    /* renamed from: b */
    public void mo2208b(boolean z) {
        this.f1802b.setChecked(z);
    }

    /* renamed from: e */
    public boolean mo2213e() {
        return this.f1802b.isFocusable();
    }

    /* renamed from: f */
    public boolean mo2215f() {
        return this.f1802b.isFocused();
    }

    /* renamed from: g */
    public boolean mo2216g() {
        return this.f1802b.isSelected();
    }

    /* renamed from: h */
    public boolean mo2217h() {
        return this.f1802b.isClickable();
    }

    /* renamed from: i */
    public boolean mo2219i() {
        return this.f1802b.isLongClickable();
    }

    /* renamed from: j */
    public boolean mo2220j() {
        return this.f1802b.isEnabled();
    }

    /* renamed from: k */
    public boolean mo2221k() {
        return this.f1802b.isPassword();
    }

    /* renamed from: l */
    public boolean mo2222l() {
        return this.f1802b.isScrollable();
    }

    /* renamed from: c */
    public void mo2209c(boolean z) {
        this.f1802b.setScrollable(z);
    }

    /* renamed from: m */
    public CharSequence mo2223m() {
        return this.f1802b.getPackageName();
    }

    /* renamed from: n */
    public CharSequence mo2224n() {
        return this.f1802b.getClassName();
    }

    /* renamed from: a */
    public void mo2202a(CharSequence charSequence) {
        this.f1802b.setClassName(charSequence);
    }

    /* renamed from: o */
    public CharSequence mo2225o() {
        return this.f1802b.getText();
    }

    /* renamed from: p */
    public CharSequence mo2226p() {
        return this.f1802b.getContentDescription();
    }

    /* renamed from: q */
    public String mo2227q() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1802b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: a */
    public void mo2203a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1802b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0564a) obj).f1803a);
        }
    }

    /* renamed from: b */
    public void mo2207b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1802b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0565b) obj).f1804a);
        }
    }

    /* renamed from: d */
    public void mo2211d(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1802b.setDismissable(z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1802b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0563c cVar = (C0563c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1802b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f1802b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f1802b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo2201a(rect);
        sb.append("; boundsInParent: " + rect);
        mo2206b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo2223m());
        sb.append("; className: ");
        sb.append(mo2224n());
        sb.append("; text: ");
        sb.append(mo2225o());
        sb.append("; contentDescription: ");
        sb.append(mo2226p());
        sb.append("; viewId: ");
        sb.append(mo2227q());
        sb.append("; checkable: ");
        sb.append(mo2210c());
        sb.append("; checked: ");
        sb.append(mo2212d());
        sb.append("; focusable: ");
        sb.append(mo2213e());
        sb.append("; focused: ");
        sb.append(mo2215f());
        sb.append("; selected: ");
        sb.append(mo2216g());
        sb.append("; clickable: ");
        sb.append(mo2217h());
        sb.append("; longClickable: ");
        sb.append(mo2219i());
        sb.append("; enabled: ");
        sb.append(mo2220j());
        sb.append("; password: ");
        sb.append(mo2221k());
        sb.append("; scrollable: " + mo2222l());
        sb.append("; [");
        int b = mo2205b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= ~numberOfTrailingZeros;
            sb.append(m2463b(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
