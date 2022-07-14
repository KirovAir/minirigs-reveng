package android.support.p039v7.view.menu;

import android.content.Context;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.widget.C0968bn;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0754h.C0756b, C0772p, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f2427a = {16842964, 16843049};

    /* renamed from: b */
    private C0754h f2428b;

    /* renamed from: c */
    private int f2429c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0968bn a = C0968bn.m5093a(context, attributeSet, f2427a, i, 0);
        if (a.mo4794g(0)) {
            setBackgroundDrawable(a.mo4780a(0));
        }
        if (a.mo4794g(1)) {
            setDivider(a.mo4780a(1));
        }
        a.mo4781a();
    }

    /* renamed from: a */
    public void mo982a(C0754h hVar) {
        this.f2428b = hVar;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: a */
    public boolean mo2924a(C0758j jVar) {
        return this.f2428b.mo3056a((MenuItem) jVar, 0);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2924a((C0758j) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.f2429c;
    }
}
