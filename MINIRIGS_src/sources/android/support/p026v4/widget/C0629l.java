package android.support.p026v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.l */
public abstract class C0629l extends C0618d {

    /* renamed from: j */
    private int f1944j;

    /* renamed from: k */
    private int f1945k;

    /* renamed from: l */
    private LayoutInflater f1946l;

    @Deprecated
    public C0629l(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1945k = i;
        this.f1944j = i;
        this.f1946l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo2419a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1946l.inflate(this.f1944j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2424b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1946l.inflate(this.f1945k, viewGroup, false);
    }
}
