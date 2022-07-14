package android.support.p026v4.p036h;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.h.u */
public final class C0600u {
    /* renamed from: a */
    public static boolean m2645a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0590n) {
            return ((C0590n) viewParent).mo1176a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", e);
                return false;
            }
        } else if (viewParent instanceof C0589m) {
            return ((C0589m) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static void m2646b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0590n) {
            ((C0590n) viewParent).mo1181b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", e);
                }
            } else if (viewParent instanceof C0589m) {
                ((C0589m) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static void m2640a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0590n) {
            ((C0590n) viewParent).mo1184c(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", e);
                }
            } else if (viewParent instanceof C0589m) {
                ((C0589m) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static void m2641a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0590n) {
            ((C0590n) viewParent).mo1170a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", e);
                }
            } else if (viewParent instanceof C0589m) {
                ((C0589m) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m2642a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0590n) {
            ((C0590n) viewParent).mo1171a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", e);
                }
            } else if (viewParent instanceof C0589m) {
                ((C0589m) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2644a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", e);
                return false;
            }
        } else if (viewParent instanceof C0589m) {
            return ((C0589m) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2643a(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", e);
                return false;
            }
        } else if (viewParent instanceof C0589m) {
            return ((C0589m) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }
}
