package android.support.p039v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0767m implements C0770o, C0776s, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f2609a;

    /* renamed from: a */
    public abstract void mo2999a(int i);

    /* renamed from: a */
    public void mo2980a(Context context, C0754h hVar) {
    }

    /* renamed from: a */
    public abstract void mo3000a(C0754h hVar);

    /* renamed from: a */
    public abstract void mo3001a(View view);

    /* renamed from: a */
    public abstract void mo3002a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo3003a(boolean z);

    /* renamed from: a */
    public boolean mo2986a(C0754h hVar, C0758j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo3004b(int i);

    /* renamed from: b */
    public boolean mo2992b(C0754h hVar, C0758j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo3006c(int i);

    /* renamed from: c */
    public abstract void mo3007c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo3010f() {
        return true;
    }

    C0767m() {
    }

    /* renamed from: a */
    public void mo3239a(Rect rect) {
        this.f2609a = rect;
    }

    /* renamed from: g */
    public Rect mo3240g() {
        return this.f2609a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3540a(listAdapter).f2532a.mo3057a((MenuItem) listAdapter.getItem(i), (C0770o) this, mo3010f() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m3539a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0753g m3540a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0753g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0753g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m3541b(C0754h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
