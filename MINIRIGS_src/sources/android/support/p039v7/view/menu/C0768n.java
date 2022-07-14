package android.support.p039v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.view.menu.C0770o;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.n */
public class C0768n {

    /* renamed from: a */
    private final Context f2610a;

    /* renamed from: b */
    private final C0754h f2611b;

    /* renamed from: c */
    private final boolean f2612c;

    /* renamed from: d */
    private final int f2613d;

    /* renamed from: e */
    private final int f2614e;

    /* renamed from: f */
    private View f2615f;

    /* renamed from: g */
    private int f2616g;

    /* renamed from: h */
    private boolean f2617h;

    /* renamed from: i */
    private C0770o.C0771a f2618i;

    /* renamed from: j */
    private C0767m f2619j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f2620k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f2621l;

    public C0768n(Context context, C0754h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0768n(Context context, C0754h hVar, View view, boolean z, int i, int i2) {
        this.f2616g = 8388611;
        this.f2621l = new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                C0768n.this.mo3252e();
            }
        };
        this.f2610a = context;
        this.f2611b = hVar;
        this.f2615f = view;
        this.f2612c = z;
        this.f2613d = i;
        this.f2614e = i2;
    }

    /* renamed from: a */
    public void mo3246a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2620k = onDismissListener;
    }

    /* renamed from: a */
    public void mo3245a(View view) {
        this.f2615f = view;
    }

    /* renamed from: a */
    public void mo3247a(boolean z) {
        this.f2617h = z;
        C0767m mVar = this.f2619j;
        if (mVar != null) {
            mVar.mo3003a(z);
        }
    }

    /* renamed from: a */
    public void mo3243a(int i) {
        this.f2616g = i;
    }

    /* renamed from: a */
    public void mo3242a() {
        if (!mo3250c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public C0767m mo3249b() {
        if (this.f2619j == null) {
            this.f2619j = m3557g();
        }
        return this.f2619j;
    }

    /* renamed from: c */
    public boolean mo3250c() {
        if (mo3253f()) {
            return true;
        }
        if (this.f2615f == null) {
            return false;
        }
        m3556a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public boolean mo3248a(int i, int i2) {
        if (mo3253f()) {
            return true;
        }
        if (this.f2615f == null) {
            return false;
        }
        m3556a(i, i2, true, true);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.m] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p039v7.view.menu.C0767m m3557g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f2610a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f2610a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = android.support.p039v7.p040a.C0639a.C0643d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f2610a
            android.view.View r3 = r14.f2615f
            int r4 = r14.f2613d
            int r5 = r14.f2614e
            boolean r6 = r14.f2612c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f2610a
            android.support.v7.view.menu.h r9 = r14.f2611b
            android.view.View r10 = r14.f2615f
            int r11 = r14.f2613d
            int r12 = r14.f2614e
            boolean r13 = r14.f2612c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.h r1 = r14.f2611b
            r0.mo3000a((android.support.p039v7.view.menu.C0754h) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f2621l
            r0.mo3002a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f2615f
            r0.mo3001a((android.view.View) r1)
            android.support.v7.view.menu.o$a r1 = r14.f2618i
            r0.mo2983a((android.support.p039v7.view.menu.C0770o.C0771a) r1)
            boolean r1 = r14.f2617h
            r0.mo3003a((boolean) r1)
            int r1 = r14.f2616g
            r0.mo2999a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.view.menu.C0768n.m3557g():android.support.v7.view.menu.m");
    }

    /* renamed from: a */
    private void m3556a(int i, int i2, boolean z, boolean z2) {
        C0767m b = mo3249b();
        b.mo3007c(z2);
        if (z) {
            if ((C0579d.m2523a(this.f2616g, C0594r.m2602f(this.f2615f)) & 7) == 5) {
                i -= this.f2615f.getWidth();
            }
            b.mo3004b(i);
            b.mo3006c(i2);
            int i3 = (int) ((this.f2610a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo3239a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo2998a();
    }

    /* renamed from: d */
    public void mo3251d() {
        if (mo3253f()) {
            this.f2619j.mo3005c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3252e() {
        this.f2619j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2620k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo3253f() {
        C0767m mVar = this.f2619j;
        return mVar != null && mVar.mo3008d();
    }

    /* renamed from: a */
    public void mo3244a(C0770o.C0771a aVar) {
        this.f2618i = aVar;
        C0767m mVar = this.f2619j;
        if (mVar != null) {
            mVar.mo2983a(aVar);
        }
    }
}
