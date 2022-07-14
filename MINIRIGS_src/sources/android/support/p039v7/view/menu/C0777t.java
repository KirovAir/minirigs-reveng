package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.widget.C0897av;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0777t extends C0767m implements C0770o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: e */
    private static final int f2623e = C0639a.C0646g.abc_popup_menu_item_layout;

    /* renamed from: a */
    final C0897av f2624a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f2625b = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0777t.this.mo3008d() && !C0777t.this.f2624a.mo4139g()) {
                View view = C0777t.this.f2626c;
                if (view == null || !view.isShown()) {
                    C0777t.this.mo3005c();
                } else {
                    C0777t.this.f2624a.mo2998a();
                }
            }
        }
    };

    /* renamed from: c */
    View f2626c;

    /* renamed from: d */
    ViewTreeObserver f2627d;

    /* renamed from: f */
    private final Context f2628f;

    /* renamed from: g */
    private final C0754h f2629g;

    /* renamed from: h */
    private final C0753g f2630h;

    /* renamed from: i */
    private final boolean f2631i;

    /* renamed from: j */
    private final int f2632j;

    /* renamed from: k */
    private final int f2633k;

    /* renamed from: l */
    private final int f2634l;

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f2635m = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0777t.this.f2627d != null) {
                if (!C0777t.this.f2627d.isAlive()) {
                    C0777t.this.f2627d = view.getViewTreeObserver();
                }
                C0777t.this.f2627d.removeGlobalOnLayoutListener(C0777t.this.f2625b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: n */
    private PopupWindow.OnDismissListener f2636n;

    /* renamed from: o */
    private View f2637o;

    /* renamed from: p */
    private C0770o.C0771a f2638p;

    /* renamed from: q */
    private boolean f2639q;

    /* renamed from: r */
    private boolean f2640r;

    /* renamed from: s */
    private int f2641s;

    /* renamed from: t */
    private int f2642t = 0;

    /* renamed from: u */
    private boolean f2643u;

    /* renamed from: a */
    public void mo3000a(C0754h hVar) {
    }

    /* renamed from: b */
    public boolean mo2991b() {
        return false;
    }

    public C0777t(Context context, C0754h hVar, View view, int i, int i2, boolean z) {
        this.f2628f = context;
        this.f2629g = hVar;
        this.f2631i = z;
        this.f2630h = new C0753g(hVar, LayoutInflater.from(context), this.f2631i, f2623e);
        this.f2633k = i;
        this.f2634l = i2;
        Resources resources = context.getResources();
        this.f2632j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0639a.C0643d.abc_config_prefDialogWidth));
        this.f2637o = view;
        this.f2624a = new C0897av(this.f2628f, (AttributeSet) null, this.f2633k, this.f2634l);
        hVar.mo3051a((C0770o) this, context);
    }

    /* renamed from: a */
    public void mo3003a(boolean z) {
        this.f2630h.mo3032a(z);
    }

    /* renamed from: a */
    public void mo2999a(int i) {
        this.f2642t = i;
    }

    /* renamed from: h */
    private boolean m3590h() {
        View view;
        if (mo3008d()) {
            return true;
        }
        if (this.f2639q || (view = this.f2637o) == null) {
            return false;
        }
        this.f2626c = view;
        this.f2624a.mo4129a((PopupWindow.OnDismissListener) this);
        this.f2624a.mo4127a((AdapterView.OnItemClickListener) this);
        this.f2624a.mo4130a(true);
        View view2 = this.f2626c;
        boolean z = this.f2627d == null;
        this.f2627d = view2.getViewTreeObserver();
        if (z) {
            this.f2627d.addOnGlobalLayoutListener(this.f2625b);
        }
        view2.addOnAttachStateChangeListener(this.f2635m);
        this.f2624a.mo4132b(view2);
        this.f2624a.mo4136e(this.f2642t);
        if (!this.f2640r) {
            this.f2641s = m3539a(this.f2630h, (ViewGroup) null, this.f2628f, this.f2632j);
            this.f2640r = true;
        }
        this.f2624a.mo4138g(this.f2641s);
        this.f2624a.mo4141h(2);
        this.f2624a.mo4125a(mo3240g());
        this.f2624a.mo2998a();
        ListView e = this.f2624a.mo3009e();
        e.setOnKeyListener(this);
        if (this.f2643u && this.f2629g.mo3097n() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2628f).inflate(C0639a.C0646g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f2629g.mo3097n());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f2624a.mo4128a((ListAdapter) this.f2630h);
        this.f2624a.mo2998a();
        return true;
    }

    /* renamed from: a */
    public void mo2998a() {
        if (!m3590h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo3005c() {
        if (mo3008d()) {
            this.f2624a.mo3005c();
        }
    }

    /* renamed from: d */
    public boolean mo3008d() {
        return !this.f2639q && this.f2624a.mo3008d();
    }

    public void onDismiss() {
        this.f2639q = true;
        this.f2629g.close();
        ViewTreeObserver viewTreeObserver = this.f2627d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2627d = this.f2626c.getViewTreeObserver();
            }
            this.f2627d.removeGlobalOnLayoutListener(this.f2625b);
            this.f2627d = null;
        }
        this.f2626c.removeOnAttachStateChangeListener(this.f2635m);
        PopupWindow.OnDismissListener onDismissListener = this.f2636n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: b */
    public void mo2990b(boolean z) {
        this.f2640r = false;
        C0753g gVar = this.f2630h;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo2983a(C0770o.C0771a aVar) {
        this.f2638p = aVar;
    }

    /* renamed from: a */
    public boolean mo2987a(C0780u uVar) {
        if (uVar.hasVisibleItems()) {
            C0768n nVar = new C0768n(this.f2628f, uVar, this.f2626c, this.f2631i, this.f2633k, this.f2634l);
            nVar.mo3244a(this.f2638p);
            nVar.mo3247a(C0767m.m3541b((C0754h) uVar));
            nVar.mo3246a(this.f2636n);
            this.f2636n = null;
            this.f2629g.mo3054a(false);
            int j = this.f2624a.mo4144j();
            int k = this.f2624a.mo4145k();
            if ((Gravity.getAbsoluteGravity(this.f2642t, C0594r.m2602f(this.f2637o)) & 7) == 5) {
                j += this.f2637o.getWidth();
            }
            if (nVar.mo3248a(j, k)) {
                C0770o.C0771a aVar = this.f2638p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo2640a(uVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2981a(C0754h hVar, boolean z) {
        if (hVar == this.f2629g) {
            mo3005c();
            C0770o.C0771a aVar = this.f2638p;
            if (aVar != null) {
                aVar.mo2639a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo3001a(View view) {
        this.f2637o = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3005c();
        return true;
    }

    /* renamed from: a */
    public void mo3002a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2636n = onDismissListener;
    }

    /* renamed from: e */
    public ListView mo3009e() {
        return this.f2624a.mo3009e();
    }

    /* renamed from: b */
    public void mo3004b(int i) {
        this.f2624a.mo4134c(i);
    }

    /* renamed from: c */
    public void mo3006c(int i) {
        this.f2624a.mo4135d(i);
    }

    /* renamed from: c */
    public void mo3007c(boolean z) {
        this.f2643u = z;
    }
}
