package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0576c;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0725a;
import android.support.p039v7.view.menu.ActionMenuItemView;
import android.support.p039v7.view.menu.C0742b;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.C0768n;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.view.menu.C0776s;
import android.support.p039v7.view.menu.C0780u;
import android.support.p039v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.c */
class C0986c extends C0742b implements C0576c.C0577a {

    /* renamed from: A */
    private C0988b f3615A;

    /* renamed from: g */
    C0990d f3616g;

    /* renamed from: h */
    C0992e f3617h;

    /* renamed from: i */
    C0987a f3618i;

    /* renamed from: j */
    C0989c f3619j;

    /* renamed from: k */
    final C0993f f3620k = new C0993f();

    /* renamed from: l */
    int f3621l;

    /* renamed from: m */
    private Drawable f3622m;

    /* renamed from: n */
    private boolean f3623n;

    /* renamed from: o */
    private boolean f3624o;

    /* renamed from: p */
    private boolean f3625p;

    /* renamed from: q */
    private int f3626q;

    /* renamed from: r */
    private int f3627r;

    /* renamed from: s */
    private int f3628s;

    /* renamed from: t */
    private boolean f3629t;

    /* renamed from: u */
    private boolean f3630u;

    /* renamed from: v */
    private boolean f3631v;

    /* renamed from: w */
    private boolean f3632w;

    /* renamed from: x */
    private int f3633x;

    /* renamed from: y */
    private final SparseBooleanArray f3634y = new SparseBooleanArray();

    /* renamed from: z */
    private View f3635z;

    public C0986c(Context context) {
        super(context, C0639a.C0646g.abc_action_menu_layout, C0639a.C0646g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public void mo2980a(Context context, C0754h hVar) {
        super.mo2980a(context, hVar);
        Resources resources = context.getResources();
        C0725a a = C0725a.m3257a(context);
        if (!this.f3625p) {
            this.f3624o = a.mo2835b();
        }
        if (!this.f3631v) {
            this.f3626q = a.mo2836c();
        }
        if (!this.f3629t) {
            this.f3628s = a.mo2834a();
        }
        int i = this.f3626q;
        if (this.f3624o) {
            if (this.f3616g == null) {
                this.f3616g = new C0990d(this.f2470a);
                if (this.f3623n) {
                    this.f3616g.setImageDrawable(this.f3622m);
                    this.f3622m = null;
                    this.f3623n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3616g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f3616g.getMeasuredWidth();
        } else {
            this.f3616g = null;
        }
        this.f3627r = i;
        this.f3633x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f3635z = null;
    }

    /* renamed from: a */
    public void mo4841a(Configuration configuration) {
        if (!this.f3629t) {
            this.f3628s = C0725a.m3257a(this.f2471b).mo2834a();
        }
        if (this.f2472c != null) {
            this.f2472c.mo3071b(true);
        }
    }

    /* renamed from: c */
    public void mo4845c(boolean z) {
        this.f3624o = z;
        this.f3625p = true;
    }

    /* renamed from: d */
    public void mo4846d(boolean z) {
        this.f3632w = z;
    }

    /* renamed from: a */
    public void mo4842a(Drawable drawable) {
        C0990d dVar = this.f3616g;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f3623n = true;
        this.f3622m = drawable;
    }

    /* renamed from: c */
    public Drawable mo4844c() {
        C0990d dVar = this.f3616g;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f3623n) {
            return this.f3622m;
        }
        return null;
    }

    /* renamed from: a */
    public C0772p mo2977a(ViewGroup viewGroup) {
        C0772p pVar = this.f2475f;
        C0772p a = super.mo2977a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo2978a(C0758j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo3158n()) {
            actionView = super.mo2978a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo2982a(C0758j jVar, C0772p.C0773a aVar) {
        aVar.mo967a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2475f);
        if (this.f3615A == null) {
            this.f3615A = new C0988b();
        }
        actionMenuItemView.setPopupCallback(this.f3615A);
    }

    /* renamed from: a */
    public boolean mo2985a(int i, C0758j jVar) {
        return jVar.mo3154j();
    }

    /* renamed from: b */
    public void mo2990b(boolean z) {
        super.mo2990b(z);
        ((View) this.f2475f).requestLayout();
        boolean z2 = false;
        if (this.f2472c != null) {
            ArrayList<C0758j> l = this.f2472c.mo3095l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                C0576c a = l.get(i).mo1892a();
                if (a != null) {
                    a.mo2259a((C0576c.C0577a) this);
                }
            }
        }
        ArrayList<C0758j> m = this.f2472c != null ? this.f2472c.mo3096m() : null;
        if (this.f3624o && m != null) {
            int size2 = m.size();
            if (size2 == 1) {
                z2 = !m.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3616g == null) {
                this.f3616g = new C0990d(this.f2470a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3616g.getParent();
            if (viewGroup != this.f2475f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3616g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2475f;
                actionMenuView.addView(this.f3616g, actionMenuView.mo3401c());
            }
        } else {
            C0990d dVar = this.f3616g;
            if (dVar != null && dVar.getParent() == this.f2475f) {
                ((ViewGroup) this.f2475f).removeView(this.f3616g);
            }
        }
        ((ActionMenuView) this.f2475f).setOverflowReserved(this.f3624o);
    }

    /* renamed from: a */
    public boolean mo2988a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f3616g) {
            return false;
        }
        return super.mo2988a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo2987a(C0780u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C0780u uVar2 = uVar;
        while (uVar2.mo3292t() != this.f2472c) {
            uVar2 = (C0780u) uVar2.mo3292t();
        }
        View a = m5216a(uVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f3621l = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f3618i = new C0987a(this.f2471b, uVar, a);
        this.f3618i.mo3247a(z);
        this.f3618i.mo3242a();
        super.mo2987a(uVar);
        return true;
    }

    /* renamed from: a */
    private View m5216a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2475f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0772p.C0773a) && ((C0772p.C0773a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo4847d() {
        if (!this.f3624o || mo4851h() || this.f2472c == null || this.f2475f == null || this.f3619j != null || this.f2472c.mo3096m().isEmpty()) {
            return false;
        }
        this.f3619j = new C0989c(new C0992e(this.f2471b, this.f2472c, this.f3616g, true));
        ((View) this.f2475f).post(this.f3619j);
        super.mo2987a((C0780u) null);
        return true;
    }

    /* renamed from: e */
    public boolean mo4848e() {
        if (this.f3619j == null || this.f2475f == null) {
            C0992e eVar = this.f3617h;
            if (eVar == null) {
                return false;
            }
            eVar.mo3251d();
            return true;
        }
        ((View) this.f2475f).removeCallbacks(this.f3619j);
        this.f3619j = null;
        return true;
    }

    /* renamed from: f */
    public boolean mo4849f() {
        return mo4848e() | mo4850g();
    }

    /* renamed from: g */
    public boolean mo4850g() {
        C0987a aVar = this.f3618i;
        if (aVar == null) {
            return false;
        }
        aVar.mo3251d();
        return true;
    }

    /* renamed from: h */
    public boolean mo4851h() {
        C0992e eVar = this.f3617h;
        return eVar != null && eVar.mo3253f();
    }

    /* renamed from: i */
    public boolean mo4852i() {
        return this.f3619j != null || mo4851h();
    }

    /* renamed from: b */
    public boolean mo2991b() {
        int i;
        ArrayList<C0758j> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0986c cVar = this;
        int i5 = 0;
        if (cVar.f2472c != null) {
            arrayList = cVar.f2472c.mo3093j();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f3628s;
        int i7 = cVar.f3627r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f2475f;
        int i8 = i6;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0758j jVar = arrayList.get(i11);
            if (jVar.mo3156l()) {
                i9++;
            } else if (jVar.mo3155k()) {
                i10++;
            } else {
                z2 = true;
            }
            if (cVar.f3632w && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (cVar.f3624o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.f3634y;
        sparseBooleanArray.clear();
        if (cVar.f3630u) {
            int i13 = cVar.f3633x;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0758j jVar2 = arrayList.get(i15);
            if (jVar2.mo3156l()) {
                View a = cVar.mo2978a(jVar2, cVar.f3635z, viewGroup);
                if (cVar.f3635z == null) {
                    cVar.f3635z = a;
                }
                if (cVar.f3630u) {
                    i2 -= ActionMenuView.m3656a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                jVar2.mo3130d(z);
                i4 = i;
                i16 = measuredWidth;
            } else if (jVar2.mo3155k()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i14 > 0 && (!cVar.f3630u || i2 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = cVar.mo2978a(jVar2, cVar.f3635z, viewGroup);
                    i4 = i;
                    if (cVar.f3635z == null) {
                        cVar.f3635z = a2;
                    }
                    if (cVar.f3630u) {
                        int a3 = ActionMenuView.m3656a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    if (cVar.f3630u) {
                        z4 = z5 & (i14 >= 0);
                    } else {
                        z4 = z5 & (i14 + i16 > 0);
                    }
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0758j jVar3 = arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo3154j()) {
                                i12++;
                            }
                            jVar3.mo3130d(false);
                        }
                        i17++;
                    }
                }
                if (z4) {
                    i12--;
                }
                jVar2.mo3130d(z4);
            } else {
                i4 = i;
                jVar2.mo3130d(false);
            }
            i15++;
            i = i4;
            cVar = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: a */
    public void mo2981a(C0754h hVar, boolean z) {
        mo4849f();
        super.mo2981a(hVar, z);
    }

    /* renamed from: a */
    public void mo2268a(boolean z) {
        if (z) {
            super.mo2987a((C0780u) null);
        } else if (this.f2472c != null) {
            this.f2472c.mo3054a(false);
        }
    }

    /* renamed from: a */
    public void mo4843a(ActionMenuView actionMenuView) {
        this.f2475f = actionMenuView;
        actionMenuView.mo982a(this.f2472c);
    }

    /* renamed from: android.support.v7.widget.c$d */
    private class C0990d extends C1019q implements ActionMenuView.C0788a {

        /* renamed from: b */
        private final float[] f3641b = new float[2];

        /* renamed from: c */
        public boolean mo2906c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo2907d() {
            return false;
        }

        public C0990d(Context context) {
            super(context, (AttributeSet) null, C0639a.C0640a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0972bp.m5158a(this, getContentDescription());
            setOnTouchListener(new C0878ap(this, C0986c.this) {
                /* renamed from: a */
                public C0776s mo2921a() {
                    if (C0986c.this.f3617h == null) {
                        return null;
                    }
                    return C0986c.this.f3617h.mo3249b();
                }

                /* renamed from: b */
                public boolean mo2922b() {
                    C0986c.this.mo4847d();
                    return true;
                }

                /* renamed from: c */
                public boolean mo4060c() {
                    if (C0986c.this.f3619j != null) {
                        return false;
                    }
                    C0986c.this.mo4848e();
                    return true;
                }
            });
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0986c.this.mo4847d();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0540a.m2378a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.c$e */
    private class C0992e extends C0768n {
        public C0992e(Context context, C0754h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0639a.C0640a.actionOverflowMenuStyle);
            mo3243a(8388613);
            mo3244a((C0770o.C0771a) C0986c.this.f3620k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3252e() {
            if (C0986c.this.f2472c != null) {
                C0986c.this.f2472c.close();
            }
            C0986c.this.f3617h = null;
            super.mo3252e();
        }
    }

    /* renamed from: android.support.v7.widget.c$a */
    private class C0987a extends C0768n {
        public C0987a(Context context, C0780u uVar, View view) {
            super(context, uVar, view, false, C0639a.C0640a.actionOverflowMenuStyle);
            if (!((C0758j) uVar.getItem()).mo3154j()) {
                mo3245a(C0986c.this.f3616g == null ? (View) C0986c.this.f2475f : C0986c.this.f3616g);
            }
            mo3244a((C0770o.C0771a) C0986c.this.f3620k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3252e() {
            C0986c cVar = C0986c.this;
            cVar.f3618i = null;
            cVar.f3621l = 0;
            super.mo3252e();
        }
    }

    /* renamed from: android.support.v7.widget.c$f */
    private class C0993f implements C0770o.C0771a {
        C0993f() {
        }

        /* renamed from: a */
        public boolean mo2640a(C0754h hVar) {
            if (hVar == null) {
                return false;
            }
            C0986c.this.f3621l = ((C0780u) hVar).getItem().getItemId();
            C0770o.C0771a a = C0986c.this.mo2976a();
            if (a != null) {
                return a.mo2640a(hVar);
            }
            return false;
        }

        /* renamed from: a */
        public void mo2639a(C0754h hVar, boolean z) {
            if (hVar instanceof C0780u) {
                hVar.mo3102q().mo3054a(false);
            }
            C0770o.C0771a a = C0986c.this.mo2976a();
            if (a != null) {
                a.mo2639a(hVar, z);
            }
        }
    }

    /* renamed from: android.support.v7.widget.c$c */
    private class C0989c implements Runnable {

        /* renamed from: b */
        private C0992e f3639b;

        public C0989c(C0992e eVar) {
            this.f3639b = eVar;
        }

        public void run() {
            if (C0986c.this.f2472c != null) {
                C0986c.this.f2472c.mo3087g();
            }
            View view = (View) C0986c.this.f2475f;
            if (!(view == null || view.getWindowToken() == null || !this.f3639b.mo3250c())) {
                C0986c.this.f3617h = this.f3639b;
            }
            C0986c.this.f3619j = null;
        }
    }

    /* renamed from: android.support.v7.widget.c$b */
    private class C0988b extends ActionMenuItemView.C0740b {
        C0988b() {
        }

        /* renamed from: a */
        public C0776s mo2923a() {
            if (C0986c.this.f3618i != null) {
                return C0986c.this.f3618i.mo3249b();
            }
            return null;
        }
    }
}
