package android.support.p039v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0576c;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0793a f2721a;

    /* renamed from: b */
    final FrameLayout f2722b;

    /* renamed from: c */
    final FrameLayout f2723c;

    /* renamed from: d */
    C0576c f2724d;

    /* renamed from: e */
    final DataSetObserver f2725e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f2726f;

    /* renamed from: g */
    boolean f2727g;

    /* renamed from: h */
    int f2728h;

    /* renamed from: i */
    private final C0794b f2729i;

    /* renamed from: j */
    private final View f2730j;

    /* renamed from: k */
    private final ImageView f2731k;

    /* renamed from: l */
    private final int f2732l;

    /* renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f2733m;

    /* renamed from: n */
    private C0888at f2734n;

    /* renamed from: o */
    private boolean f2735o;

    /* renamed from: p */
    private int f2736p;

    public void setActivityChooserModel(C0994d dVar) {
        this.f2721a.mo3447a(dVar);
        if (mo3431c()) {
            mo3430b();
            mo3429a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2731k.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2731k.setContentDescription(getContext().getString(i));
    }

    public void setProvider(C0576c cVar) {
        this.f2724d = cVar;
    }

    /* renamed from: a */
    public boolean mo3429a() {
        if (mo3431c() || !this.f2735o) {
            return false;
        }
        this.f2727g = false;
        mo3428a(this.f2728h);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3428a(int i) {
        if (this.f2721a.mo3452d() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f2733m);
            boolean z = this.f2723c.getVisibility() == 0;
            int c = this.f2721a.mo3451c();
            if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
                this.f2721a.mo3448a(false);
                this.f2721a.mo3446a(i);
            } else {
                this.f2721a.mo3448a(true);
                this.f2721a.mo3446a(i - 1);
            }
            C0888at listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo3008d()) {
                if (this.f2727g || !z) {
                    this.f2721a.mo3449a(true, z);
                } else {
                    this.f2721a.mo3449a(false, false);
                }
                listPopupWindow.mo4138g(Math.min(this.f2721a.mo3445a(), this.f2732l));
                listPopupWindow.mo2998a();
                C0576c cVar = this.f2724d;
                if (cVar != null) {
                    cVar.mo2262a(true);
                }
                listPopupWindow.mo3009e().setContentDescription(getContext().getString(C0639a.C0647h.abc_activitychooserview_choose_application));
                listPopupWindow.mo3009e().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: b */
    public boolean mo3430b() {
        if (!mo3431c()) {
            return true;
        }
        getListPopupWindow().mo3005c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f2733m);
        return true;
    }

    /* renamed from: c */
    public boolean mo3431c() {
        return getListPopupWindow().mo3008d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0994d d = this.f2721a.mo3452d();
        if (d != null) {
            d.registerObserver(this.f2725e);
        }
        this.f2735o = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0994d d = this.f2721a.mo3452d();
        if (d != null) {
            d.unregisterObserver(this.f2725e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2733m);
        }
        if (mo3431c()) {
            mo3430b();
        }
        this.f2735o = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f2730j;
        if (this.f2723c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2730j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo3431c()) {
            mo3430b();
        }
    }

    public C0994d getDataModel() {
        return this.f2721a.mo3452d();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2726f = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.f2728h = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2736p = i;
    }

    /* access modifiers changed from: package-private */
    public C0888at getListPopupWindow() {
        if (this.f2734n == null) {
            this.f2734n = new C0888at(getContext());
            this.f2734n.mo4128a((ListAdapter) this.f2721a);
            this.f2734n.mo4132b((View) this);
            this.f2734n.mo4130a(true);
            this.f2734n.mo4127a((AdapterView.OnItemClickListener) this.f2729i);
            this.f2734n.mo4129a((PopupWindow.OnDismissListener) this.f2729i);
        }
        return this.f2734n;
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0794b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2744a;

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0793a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f2744a.mo3430b();
                    if (!this.f2744a.f2727g) {
                        if (!this.f2744a.f2721a.mo3453e()) {
                            i++;
                        }
                        Intent b = this.f2744a.f2721a.mo3452d().mo4859b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f2744a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f2744a.f2721a.mo3452d().mo4861c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f2744a.mo3428a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void onClick(View view) {
            if (view == this.f2744a.f2723c) {
                this.f2744a.mo3430b();
                Intent b = this.f2744a.f2721a.mo3452d().mo4859b(this.f2744a.f2721a.mo3452d().mo4857a(this.f2744a.f2721a.mo3450b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f2744a.getContext().startActivity(b);
                }
            } else if (view == this.f2744a.f2722b) {
                ActivityChooserView activityChooserView = this.f2744a;
                activityChooserView.f2727g = false;
                activityChooserView.mo3428a(activityChooserView.f2728h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f2744a.f2723c) {
                if (this.f2744a.f2721a.getCount() > 0) {
                    ActivityChooserView activityChooserView = this.f2744a;
                    activityChooserView.f2727g = true;
                    activityChooserView.mo3428a(activityChooserView.f2728h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public void onDismiss() {
            m3696a();
            if (this.f2744a.f2724d != null) {
                this.f2744a.f2724d.mo2262a(false);
            }
        }

        /* renamed from: a */
        private void m3696a() {
            if (this.f2744a.f2726f != null) {
                this.f2744a.f2726f.onDismiss();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0793a extends BaseAdapter {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2738a;

        /* renamed from: b */
        private C0994d f2739b;

        /* renamed from: c */
        private int f2740c;

        /* renamed from: d */
        private boolean f2741d;

        /* renamed from: e */
        private boolean f2742e;

        /* renamed from: f */
        private boolean f2743f;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: a */
        public void mo3447a(C0994d dVar) {
            C0994d d = this.f2738a.f2721a.mo3452d();
            if (d != null && this.f2738a.isShown()) {
                d.unregisterObserver(this.f2738a.f2725e);
            }
            this.f2739b = dVar;
            if (dVar != null && this.f2738a.isShown()) {
                dVar.registerObserver(this.f2738a.f2725e);
            }
            notifyDataSetChanged();
        }

        public int getItemViewType(int i) {
            return (!this.f2743f || i != getCount() - 1) ? 0 : 1;
        }

        public int getCount() {
            int a = this.f2739b.mo4856a();
            if (!this.f2741d && this.f2739b.mo4860b() != null) {
                a--;
            }
            int min = Math.min(a, this.f2740c);
            return this.f2743f ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f2741d && this.f2739b.mo4860b() != null) {
                        i++;
                    }
                    return this.f2739b.mo4858a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0639a.C0645f.list_item) {
                        view = LayoutInflater.from(this.f2738a.getContext()).inflate(C0639a.C0646g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f2738a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0639a.C0645f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0639a.C0645f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f2741d || i != 0 || !this.f2742e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(this.f2738a.getContext()).inflate(C0639a.C0646g.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(C0639a.C0645f.title)).setText(this.f2738a.getContext().getString(C0639a.C0647h.abc_activity_chooser_view_see_all));
                    return inflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public int mo3445a() {
            int i = this.f2740c;
            this.f2740c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f2740c = i;
            return i2;
        }

        /* renamed from: a */
        public void mo3446a(int i) {
            if (this.f2740c != i) {
                this.f2740c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo3450b() {
            return this.f2739b.mo4860b();
        }

        /* renamed from: a */
        public void mo3448a(boolean z) {
            if (this.f2743f != z) {
                this.f2743f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: c */
        public int mo3451c() {
            return this.f2739b.mo4856a();
        }

        /* renamed from: d */
        public C0994d mo3452d() {
            return this.f2739b;
        }

        /* renamed from: a */
        public void mo3449a(boolean z, boolean z2) {
            if (this.f2741d != z || this.f2742e != z2) {
                this.f2741d = z;
                this.f2742e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: e */
        public boolean mo3453e() {
            return this.f2741d;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f2737a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0968bn a = C0968bn.m5092a(context, attributeSet, f2737a);
            setBackgroundDrawable(a.mo4780a(0));
            a.mo4781a();
        }
    }
}
