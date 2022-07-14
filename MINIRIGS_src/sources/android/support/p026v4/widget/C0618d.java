package android.support.p026v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p026v4.widget.C0621e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.d */
public abstract class C0618d extends BaseAdapter implements C0621e.C0622a, Filterable {

    /* renamed from: a */
    protected boolean f1923a;

    /* renamed from: b */
    protected boolean f1924b;

    /* renamed from: c */
    protected Cursor f1925c;

    /* renamed from: d */
    protected Context f1926d;

    /* renamed from: e */
    protected int f1927e;

    /* renamed from: f */
    protected C0619a f1928f;

    /* renamed from: g */
    protected DataSetObserver f1929g;

    /* renamed from: h */
    protected C0621e f1930h;

    /* renamed from: i */
    protected FilterQueryProvider f1931i;

    /* renamed from: a */
    public abstract View mo2419a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo2422a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public C0618d(Context context, Cursor cursor, boolean z) {
        mo2420a(context, cursor, z ? 1 : 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2420a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1924b = true;
        } else {
            this.f1924b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1925c = cursor;
        this.f1923a = z;
        this.f1926d = context;
        this.f1927e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1928f = new C0619a();
            this.f1929g = new C0620b();
        } else {
            this.f1928f = null;
            this.f1929g = null;
        }
        if (z) {
            C0619a aVar = this.f1928f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1929g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public Cursor mo2417a() {
        return this.f1925c;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f1923a || (cursor = this.f1925c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1923a || (cursor = this.f1925c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1925c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f1923a || (cursor = this.f1925c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f1925c.getLong(this.f1927e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1923a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1925c.moveToPosition(i)) {
            if (view == null) {
                view = mo2419a(this.f1926d, this.f1925c, viewGroup);
            }
            mo2422a(view, this.f1926d, this.f1925c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1923a) {
            return null;
        }
        this.f1925c.moveToPosition(i);
        if (view == null) {
            view = mo2424b(this.f1926d, this.f1925c, viewGroup);
        }
        mo2422a(view, this.f1926d, this.f1925c);
        return view;
    }

    /* renamed from: b */
    public View mo2424b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2419a(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public void mo2421a(Cursor cursor) {
        Cursor b = mo2423b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    public Cursor mo2423b(Cursor cursor) {
        Cursor cursor2 = this.f1925c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0619a aVar = this.f1928f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1929g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1925c = cursor;
        if (cursor != null) {
            C0619a aVar2 = this.f1928f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1929g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1927e = cursor.getColumnIndexOrThrow("_id");
            this.f1923a = true;
            notifyDataSetChanged();
        } else {
            this.f1927e = -1;
            this.f1923a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: c */
    public CharSequence mo2426c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo2418a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f1931i;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f1925c;
    }

    public Filter getFilter() {
        if (this.f1930h == null) {
            this.f1930h = new C0621e(this);
        }
        return this.f1930h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2425b() {
        Cursor cursor;
        if (this.f1924b && (cursor = this.f1925c) != null && !cursor.isClosed()) {
            this.f1923a = this.f1925c.requery();
        }
    }

    /* renamed from: android.support.v4.widget.d$a */
    private class C0619a extends ContentObserver {
        public boolean deliverSelfNotifications() {
            return true;
        }

        C0619a() {
            super(new Handler());
        }

        public void onChange(boolean z) {
            C0618d.this.mo2425b();
        }
    }

    /* renamed from: android.support.v4.widget.d$b */
    private class C0620b extends DataSetObserver {
        C0620b() {
        }

        public void onChanged() {
            C0618d dVar = C0618d.this;
            dVar.f1923a = true;
            dVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0618d dVar = C0618d.this;
            dVar.f1923a = false;
            dVar.notifyDataSetInvalidated();
        }
    }
}
