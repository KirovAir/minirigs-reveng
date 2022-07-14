package android.support.p026v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.e */
class C0621e extends Filter {

    /* renamed from: a */
    C0622a f1934a;

    /* renamed from: android.support.v4.widget.e$a */
    interface C0622a {
        /* renamed from: a */
        Cursor mo2417a();

        /* renamed from: a */
        Cursor mo2418a(CharSequence charSequence);

        /* renamed from: a */
        void mo2421a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo2426c(Cursor cursor);
    }

    C0621e(C0622a aVar) {
        this.f1934a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1934a.mo2426c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1934a.mo2418a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f1934a.mo2417a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1934a.mo2421a((Cursor) filterResults.values);
        }
    }
}
