package android.support.p039v7.view.menu;

import android.support.p039v7.view.menu.C0772p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0753g extends BaseAdapter {

    /* renamed from: a */
    C0754h f2532a;

    /* renamed from: b */
    private int f2533b = -1;

    /* renamed from: c */
    private boolean f2534c;

    /* renamed from: d */
    private final boolean f2535d;

    /* renamed from: e */
    private final LayoutInflater f2536e;

    /* renamed from: f */
    private final int f2537f;

    public long getItemId(int i) {
        return (long) i;
    }

    public C0753g(C0754h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2535d = z;
        this.f2536e = layoutInflater;
        this.f2532a = hVar;
        this.f2537f = i;
        mo3033b();
    }

    /* renamed from: a */
    public void mo3032a(boolean z) {
        this.f2534c = z;
    }

    public int getCount() {
        ArrayList<C0758j> m = this.f2535d ? this.f2532a.mo3096m() : this.f2532a.mo3093j();
        if (this.f2533b < 0) {
            return m.size();
        }
        return m.size() - 1;
    }

    /* renamed from: a */
    public C0754h mo3030a() {
        return this.f2532a;
    }

    /* renamed from: a */
    public C0758j getItem(int i) {
        ArrayList<C0758j> m = this.f2535d ? this.f2532a.mo3096m() : this.f2532a.mo3093j();
        int i2 = this.f2533b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2536e.inflate(this.f2537f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2532a.mo3072b() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0772p.C0773a aVar = (C0772p.C0773a) view;
        if (this.f2534c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo967a(getItem(i), 0);
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3033b() {
        C0758j s = this.f2532a.mo3106s();
        if (s != null) {
            ArrayList<C0758j> m = this.f2532a.mo3096m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                if (m.get(i) == s) {
                    this.f2533b = i;
                    return;
                }
            }
        }
        this.f2533b = -1;
    }

    public void notifyDataSetChanged() {
        mo3033b();
        super.notifyDataSetChanged();
    }
}
