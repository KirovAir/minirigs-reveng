package android.support.p039v7.view.menu;

import android.content.Context;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0772p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0742b implements C0770o {

    /* renamed from: a */
    protected Context f2470a;

    /* renamed from: b */
    protected Context f2471b;

    /* renamed from: c */
    protected C0754h f2472c;

    /* renamed from: d */
    protected LayoutInflater f2473d;

    /* renamed from: e */
    protected LayoutInflater f2474e;

    /* renamed from: f */
    protected C0772p f2475f;

    /* renamed from: g */
    private C0770o.C0771a f2476g;

    /* renamed from: h */
    private int f2477h;

    /* renamed from: i */
    private int f2478i;

    /* renamed from: j */
    private int f2479j;

    /* renamed from: a */
    public abstract void mo2982a(C0758j jVar, C0772p.C0773a aVar);

    /* renamed from: a */
    public boolean mo2985a(int i, C0758j jVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2986a(C0754h hVar, C0758j jVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo2991b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2992b(C0754h hVar, C0758j jVar) {
        return false;
    }

    public C0742b(Context context, int i, int i2) {
        this.f2470a = context;
        this.f2473d = LayoutInflater.from(context);
        this.f2477h = i;
        this.f2478i = i2;
    }

    /* renamed from: a */
    public void mo2980a(Context context, C0754h hVar) {
        this.f2471b = context;
        this.f2474e = LayoutInflater.from(this.f2471b);
        this.f2472c = hVar;
    }

    /* renamed from: a */
    public C0772p mo2977a(ViewGroup viewGroup) {
        if (this.f2475f == null) {
            this.f2475f = (C0772p) this.f2473d.inflate(this.f2477h, viewGroup, false);
            this.f2475f.mo982a(this.f2472c);
            mo2990b(true);
        }
        return this.f2475f;
    }

    /* renamed from: b */
    public void mo2990b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2475f;
        if (viewGroup != null) {
            C0754h hVar = this.f2472c;
            int i = 0;
            if (hVar != null) {
                hVar.mo3094k();
                ArrayList<C0758j> j = this.f2472c.mo3093j();
                int size = j.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0758j jVar = j.get(i3);
                    if (mo2985a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0758j itemData = childAt instanceof C0772p.C0773a ? ((C0772p.C0773a) childAt).getItemData() : null;
                        View a = mo2978a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo2984a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2988a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2984a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2475f).addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2988a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo2983a(C0770o.C0771a aVar) {
        this.f2476g = aVar;
    }

    /* renamed from: a */
    public C0770o.C0771a mo2976a() {
        return this.f2476g;
    }

    /* renamed from: b */
    public C0772p.C0773a mo2989b(ViewGroup viewGroup) {
        return (C0772p.C0773a) this.f2473d.inflate(this.f2478i, viewGroup, false);
    }

    /* renamed from: a */
    public View mo2978a(C0758j jVar, View view, ViewGroup viewGroup) {
        C0772p.C0773a aVar;
        if (view instanceof C0772p.C0773a) {
            aVar = (C0772p.C0773a) view;
        } else {
            aVar = mo2989b(viewGroup);
        }
        mo2982a(jVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo2981a(C0754h hVar, boolean z) {
        C0770o.C0771a aVar = this.f2476g;
        if (aVar != null) {
            aVar.mo2639a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2987a(C0780u uVar) {
        C0770o.C0771a aVar = this.f2476g;
        if (aVar != null) {
            return aVar.mo2640a(uVar);
        }
        return false;
    }

    /* renamed from: a */
    public void mo2979a(int i) {
        this.f2479j = i;
    }
}
