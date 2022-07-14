package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p026v4.p036h.C0579d;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.widget.C0896au;
import android.support.p039v7.widget.C0897av;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0745e extends C0767m implements C0770o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: g */
    private static final int f2484g = C0639a.C0646g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f2485A;

    /* renamed from: a */
    final Handler f2486a;

    /* renamed from: b */
    final List<C0750a> f2487b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f2488c = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0745e.this.mo3008d() && C0745e.this.f2487b.size() > 0 && !C0745e.this.f2487b.get(0).f2518a.mo4139g()) {
                View view = C0745e.this.f2489d;
                if (view == null || !view.isShown()) {
                    C0745e.this.mo3005c();
                    return;
                }
                for (C0750a aVar : C0745e.this.f2487b) {
                    aVar.f2518a.mo2998a();
                }
            }
        }
    };

    /* renamed from: d */
    View f2489d;

    /* renamed from: e */
    ViewTreeObserver f2490e;

    /* renamed from: f */
    boolean f2491f;

    /* renamed from: h */
    private final Context f2492h;

    /* renamed from: i */
    private final int f2493i;

    /* renamed from: j */
    private final int f2494j;

    /* renamed from: k */
    private final int f2495k;

    /* renamed from: l */
    private final boolean f2496l;

    /* renamed from: m */
    private final List<C0754h> f2497m = new ArrayList();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f2498n = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0745e.this.f2490e != null) {
                if (!C0745e.this.f2490e.isAlive()) {
                    C0745e.this.f2490e = view.getViewTreeObserver();
                }
                C0745e.this.f2490e.removeGlobalOnLayoutListener(C0745e.this.f2488c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private final C0896au f2499o = new C0896au() {
        /* renamed from: a */
        public void mo3016a(C0754h hVar, MenuItem menuItem) {
            C0745e.this.f2486a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo3017b(final C0754h hVar, final MenuItem menuItem) {
            final C0750a aVar = null;
            C0745e.this.f2486a.removeCallbacksAndMessages((Object) null);
            int size = C0745e.this.f2487b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == C0745e.this.f2487b.get(i).f2519b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0745e.this.f2487b.size()) {
                    aVar = C0745e.this.f2487b.get(i2);
                }
                C0745e.this.f2486a.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C0745e.this.f2491f = true;
                            aVar.f2519b.mo3054a(false);
                            C0745e.this.f2491f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo3056a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: p */
    private int f2500p = 0;

    /* renamed from: q */
    private int f2501q = 0;

    /* renamed from: r */
    private View f2502r;

    /* renamed from: s */
    private int f2503s;

    /* renamed from: t */
    private boolean f2504t;

    /* renamed from: u */
    private boolean f2505u;

    /* renamed from: v */
    private int f2506v;

    /* renamed from: w */
    private int f2507w;

    /* renamed from: x */
    private boolean f2508x;

    /* renamed from: y */
    private boolean f2509y;

    /* renamed from: z */
    private C0770o.C0771a f2510z;

    /* renamed from: b */
    public boolean mo2991b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo3010f() {
        return false;
    }

    public C0745e(Context context, View view, int i, int i2, boolean z) {
        this.f2492h = context;
        this.f2502r = view;
        this.f2494j = i;
        this.f2495k = i2;
        this.f2496l = z;
        this.f2508x = false;
        this.f2503s = m3393i();
        Resources resources = context.getResources();
        this.f2493i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0639a.C0643d.abc_config_prefDialogWidth));
        this.f2486a = new Handler();
    }

    /* renamed from: a */
    public void mo3003a(boolean z) {
        this.f2508x = z;
    }

    /* renamed from: h */
    private C0897av m3392h() {
        C0897av avVar = new C0897av(this.f2492h, (AttributeSet) null, this.f2494j, this.f2495k);
        avVar.mo4159a(this.f2499o);
        avVar.mo4127a((AdapterView.OnItemClickListener) this);
        avVar.mo4129a((PopupWindow.OnDismissListener) this);
        avVar.mo4132b(this.f2502r);
        avVar.mo4136e(this.f2501q);
        avVar.mo4130a(true);
        avVar.mo4141h(2);
        return avVar;
    }

    /* renamed from: a */
    public void mo2998a() {
        if (!mo3008d()) {
            for (C0754h c : this.f2497m) {
                m3389c(c);
            }
            this.f2497m.clear();
            this.f2489d = this.f2502r;
            if (this.f2489d != null) {
                boolean z = this.f2490e == null;
                this.f2490e = this.f2489d.getViewTreeObserver();
                if (z) {
                    this.f2490e.addOnGlobalLayoutListener(this.f2488c);
                }
                this.f2489d.addOnAttachStateChangeListener(this.f2498n);
            }
        }
    }

    /* renamed from: c */
    public void mo3005c() {
        int size = this.f2487b.size();
        if (size > 0) {
            C0750a[] aVarArr = (C0750a[]) this.f2487b.toArray(new C0750a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0750a aVar = aVarArr[i];
                if (aVar.f2518a.mo3008d()) {
                    aVar.f2518a.mo3005c();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3005c();
        return true;
    }

    /* renamed from: i */
    private int m3393i() {
        return C0594r.m2602f(this.f2502r) == 1 ? 0 : 1;
    }

    /* renamed from: d */
    private int m3390d(int i) {
        List<C0750a> list = this.f2487b;
        ListView a = list.get(list.size() - 1).mo3019a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2489d.getWindowVisibleDisplayFrame(rect);
        if (this.f2503s == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo3000a(C0754h hVar) {
        hVar.mo3051a((C0770o) this, this.f2492h);
        if (mo3008d()) {
            m3389c(hVar);
        } else {
            this.f2497m.add(hVar);
        }
    }

    /* renamed from: c */
    private void m3389c(C0754h hVar) {
        View view;
        C0750a aVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f2492h);
        C0753g gVar = new C0753g(hVar, from, this.f2496l, f2484g);
        if (!mo3008d() && this.f2508x) {
            gVar.mo3032a(true);
        } else if (mo3008d()) {
            gVar.mo3032a(C0767m.m3541b(hVar));
        }
        int a = m3539a(gVar, (ViewGroup) null, this.f2492h, this.f2493i);
        C0897av h = m3392h();
        h.mo4128a((ListAdapter) gVar);
        h.mo4138g(a);
        h.mo4136e(this.f2501q);
        if (this.f2487b.size() > 0) {
            List<C0750a> list = this.f2487b;
            aVar = list.get(list.size() - 1);
            view = m3388a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h.mo4162c(false);
            h.mo4160a((Object) null);
            int d = m3390d(a);
            boolean z = d == 1;
            this.f2503s = d;
            if (Build.VERSION.SDK_INT >= 26) {
                h.mo4132b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2502r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2501q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2502r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2501q & 5) == 5) {
                i3 = z ? i + a : i - view.getWidth();
            } else {
                i3 = z ? i + view.getWidth() : i - a;
            }
            h.mo4134c(i3);
            h.mo4133b(true);
            h.mo4135d(i2);
        } else {
            if (this.f2504t) {
                h.mo4134c(this.f2506v);
            }
            if (this.f2505u) {
                h.mo4135d(this.f2507w);
            }
            h.mo4125a(mo3240g());
        }
        this.f2487b.add(new C0750a(h, hVar, this.f2503s));
        h.mo2998a();
        ListView e = h.mo3009e();
        e.setOnKeyListener(this);
        if (aVar == null && this.f2509y && hVar.mo3097n() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0639a.C0646g.abc_popup_menu_header_item_layout, e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.mo3097n());
            e.addHeaderView(frameLayout, (Object) null, false);
            h.mo2998a();
        }
    }

    /* renamed from: a */
    private MenuItem m3387a(C0754h hVar, C0754h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m3388a(C0750a aVar, C0754h hVar) {
        int i;
        C0753g gVar;
        int firstVisiblePosition;
        MenuItem a = m3387a(aVar.f2519b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo3019a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0753g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0753g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo3008d() {
        return this.f2487b.size() > 0 && this.f2487b.get(0).f2518a.mo3008d();
    }

    public void onDismiss() {
        C0750a aVar;
        int size = this.f2487b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f2487b.get(i);
            if (!aVar.f2518a.mo3008d()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f2519b.mo3054a(false);
        }
    }

    /* renamed from: b */
    public void mo2990b(boolean z) {
        for (C0750a a : this.f2487b) {
            m3540a(a.mo3019a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo2983a(C0770o.C0771a aVar) {
        this.f2510z = aVar;
    }

    /* renamed from: a */
    public boolean mo2987a(C0780u uVar) {
        for (C0750a next : this.f2487b) {
            if (uVar == next.f2519b) {
                next.mo3019a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo3000a((C0754h) uVar);
        C0770o.C0771a aVar = this.f2510z;
        if (aVar != null) {
            aVar.mo2640a(uVar);
        }
        return true;
    }

    /* renamed from: d */
    private int m3391d(C0754h hVar) {
        int size = this.f2487b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f2487b.get(i).f2519b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo2981a(C0754h hVar, boolean z) {
        int d = m3391d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f2487b.size()) {
                this.f2487b.get(i).f2519b.mo3054a(false);
            }
            C0750a remove = this.f2487b.remove(d);
            remove.f2519b.mo3070b((C0770o) this);
            if (this.f2491f) {
                remove.f2518a.mo4161b((Object) null);
                remove.f2518a.mo4131b(0);
            }
            remove.f2518a.mo3005c();
            int size = this.f2487b.size();
            if (size > 0) {
                this.f2503s = this.f2487b.get(size - 1).f2520c;
            } else {
                this.f2503s = m3393i();
            }
            if (size == 0) {
                mo3005c();
                C0770o.C0771a aVar = this.f2510z;
                if (aVar != null) {
                    aVar.mo2639a(hVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f2490e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f2490e.removeGlobalOnLayoutListener(this.f2488c);
                    }
                    this.f2490e = null;
                }
                this.f2489d.removeOnAttachStateChangeListener(this.f2498n);
                this.f2485A.onDismiss();
            } else if (z) {
                this.f2487b.get(0).f2519b.mo3054a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo2999a(int i) {
        if (this.f2500p != i) {
            this.f2500p = i;
            this.f2501q = C0579d.m2523a(i, C0594r.m2602f(this.f2502r));
        }
    }

    /* renamed from: a */
    public void mo3001a(View view) {
        if (this.f2502r != view) {
            this.f2502r = view;
            this.f2501q = C0579d.m2523a(this.f2500p, C0594r.m2602f(this.f2502r));
        }
    }

    /* renamed from: a */
    public void mo3002a(PopupWindow.OnDismissListener onDismissListener) {
        this.f2485A = onDismissListener;
    }

    /* renamed from: e */
    public ListView mo3009e() {
        if (this.f2487b.isEmpty()) {
            return null;
        }
        List<C0750a> list = this.f2487b;
        return list.get(list.size() - 1).mo3019a();
    }

    /* renamed from: b */
    public void mo3004b(int i) {
        this.f2504t = true;
        this.f2506v = i;
    }

    /* renamed from: c */
    public void mo3006c(int i) {
        this.f2505u = true;
        this.f2507w = i;
    }

    /* renamed from: c */
    public void mo3007c(boolean z) {
        this.f2509y = z;
    }

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0750a {

        /* renamed from: a */
        public final C0897av f2518a;

        /* renamed from: b */
        public final C0754h f2519b;

        /* renamed from: c */
        public final int f2520c;

        public C0750a(C0897av avVar, C0754h hVar, int i) {
            this.f2518a = avVar;
            this.f2519b = hVar;
            this.f2520c = i;
        }

        /* renamed from: a */
        public ListView mo3019a() {
            return this.f2518a.mo3009e();
        }
    }
}
