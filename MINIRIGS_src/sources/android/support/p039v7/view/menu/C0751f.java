package android.support.p039v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0770o;
import android.support.p039v7.view.menu.C0772p;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0751f implements C0770o, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f2521a;

    /* renamed from: b */
    LayoutInflater f2522b;

    /* renamed from: c */
    C0754h f2523c;

    /* renamed from: d */
    ExpandedMenuView f2524d;

    /* renamed from: e */
    int f2525e;

    /* renamed from: f */
    int f2526f;

    /* renamed from: g */
    int f2527g;

    /* renamed from: h */
    C0752a f2528h;

    /* renamed from: i */
    private C0770o.C0771a f2529i;

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

    public C0751f(Context context, int i) {
        this(i, 0);
        this.f2521a = context;
        this.f2522b = LayoutInflater.from(this.f2521a);
    }

    public C0751f(int i, int i2) {
        this.f2527g = i;
        this.f2526f = i2;
    }

    /* renamed from: a */
    public void mo2980a(Context context, C0754h hVar) {
        int i = this.f2526f;
        if (i != 0) {
            this.f2521a = new ContextThemeWrapper(context, i);
            this.f2522b = LayoutInflater.from(this.f2521a);
        } else if (this.f2521a != null) {
            this.f2521a = context;
            if (this.f2522b == null) {
                this.f2522b = LayoutInflater.from(this.f2521a);
            }
        }
        this.f2523c = hVar;
        C0752a aVar = this.f2528h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public C0772p mo3020a(ViewGroup viewGroup) {
        if (this.f2524d == null) {
            this.f2524d = (ExpandedMenuView) this.f2522b.inflate(C0639a.C0646g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2528h == null) {
                this.f2528h = new C0752a();
            }
            this.f2524d.setAdapter(this.f2528h);
            this.f2524d.setOnItemClickListener(this);
        }
        return this.f2524d;
    }

    /* renamed from: a */
    public ListAdapter mo3021a() {
        if (this.f2528h == null) {
            this.f2528h = new C0752a();
        }
        return this.f2528h;
    }

    /* renamed from: b */
    public void mo2990b(boolean z) {
        C0752a aVar = this.f2528h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo2983a(C0770o.C0771a aVar) {
        this.f2529i = aVar;
    }

    /* renamed from: a */
    public boolean mo2987a(C0780u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new C0757i(uVar).mo3114a((IBinder) null);
        C0770o.C0771a aVar = this.f2529i;
        if (aVar == null) {
            return true;
        }
        aVar.mo2640a(uVar);
        return true;
    }

    /* renamed from: a */
    public void mo2981a(C0754h hVar, boolean z) {
        C0770o.C0771a aVar = this.f2529i;
        if (aVar != null) {
            aVar.mo2639a(hVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2523c.mo3057a((MenuItem) this.f2528h.getItem(i), (C0770o) this, 0);
    }

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0752a extends BaseAdapter {

        /* renamed from: b */
        private int f2531b = -1;

        public long getItemId(int i) {
            return (long) i;
        }

        public C0752a() {
            mo3024a();
        }

        public int getCount() {
            int size = C0751f.this.f2523c.mo3096m().size() - C0751f.this.f2525e;
            return this.f2531b < 0 ? size : size - 1;
        }

        /* renamed from: a */
        public C0758j getItem(int i) {
            ArrayList<C0758j> m = C0751f.this.f2523c.mo3096m();
            int i2 = i + C0751f.this.f2525e;
            int i3 = this.f2531b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m.get(i2);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0751f.this.f2522b.inflate(C0751f.this.f2527g, viewGroup, false);
            }
            ((C0772p.C0773a) view).mo967a(getItem(i), 0);
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3024a() {
            C0758j s = C0751f.this.f2523c.mo3106s();
            if (s != null) {
                ArrayList<C0758j> m = C0751f.this.f2523c.mo3096m();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    if (m.get(i) == s) {
                        this.f2531b = i;
                        return;
                    }
                }
            }
            this.f2531b = -1;
        }

        public void notifyDataSetChanged() {
            mo3024a();
            super.notifyDataSetChanged();
        }
    }
}
