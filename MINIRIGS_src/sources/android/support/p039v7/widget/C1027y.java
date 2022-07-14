package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.y */
public class C1027y extends Spinner implements C0593q {

    /* renamed from: d */
    private static final int[] f3743d = {16843505};

    /* renamed from: a */
    C1030b f3744a;

    /* renamed from: b */
    int f3745b;

    /* renamed from: c */
    final Rect f3746c;

    /* renamed from: e */
    private final C1004g f3747e;

    /* renamed from: f */
    private final Context f3748f;

    /* renamed from: g */
    private C0878ap f3749g;

    /* renamed from: h */
    private SpinnerAdapter f3750h;

    /* renamed from: i */
    private final boolean f3751i;

    public C1027y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.spinnerStyle);
    }

    public C1027y(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C1027y(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (r12 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1027y(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f3746c = r0
            int[] r0 = android.support.p039v7.p040a.C0639a.C0649j.Spinner
            r1 = 0
            android.support.v7.widget.bn r0 = android.support.p039v7.widget.C0968bn.m5093a(r8, r9, r0, r10, r1)
            android.support.v7.widget.g r2 = new android.support.v7.widget.g
            r2.<init>(r7)
            r7.f3747e = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>((android.content.Context) r8, (android.content.res.Resources.Theme) r12)
            r7.f3748f = r3
            goto L_0x003e
        L_0x0023:
            int r12 = android.support.p039v7.p040a.C0639a.C0649j.Spinner_popupTheme
            int r12 = r0.mo4793g(r12, r1)
            if (r12 == 0) goto L_0x0033
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>((android.content.Context) r8, (int) r12)
            r7.f3748f = r3
            goto L_0x003e
        L_0x0033:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x003b
            r12 = r8
            goto L_0x003c
        L_0x003b:
            r12 = r2
        L_0x003c:
            r7.f3748f = r12
        L_0x003e:
            android.content.Context r12 = r7.f3748f
            r3 = 1
            if (r12 == 0) goto L_0x00ac
            r12 = -1
            if (r11 != r12) goto L_0x0074
            int[] r12 = f3743d     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005c }
            if (r4 == 0) goto L_0x0056
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005c }
        L_0x0056:
            if (r12 == 0) goto L_0x0074
        L_0x0058:
            r12.recycle()
            goto L_0x0074
        L_0x005c:
            r4 = move-exception
            goto L_0x0063
        L_0x005e:
            r8 = move-exception
            r12 = r2
            goto L_0x006e
        L_0x0061:
            r4 = move-exception
            r12 = r2
        L_0x0063:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0074
            goto L_0x0058
        L_0x006d:
            r8 = move-exception
        L_0x006e:
            if (r12 == 0) goto L_0x0073
            r12.recycle()
        L_0x0073:
            throw r8
        L_0x0074:
            if (r11 != r3) goto L_0x00ac
            android.support.v7.widget.y$b r11 = new android.support.v7.widget.y$b
            android.content.Context r12 = r7.f3748f
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f3748f
            int[] r4 = android.support.p039v7.p040a.C0639a.C0649j.Spinner
            android.support.v7.widget.bn r12 = android.support.p039v7.widget.C0968bn.m5093a(r12, r9, r4, r10, r1)
            int r1 = android.support.p039v7.p040a.C0639a.C0649j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo4791f(r1, r4)
            r7.f3745b = r1
            int r1 = android.support.p039v7.p040a.C0639a.C0649j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo4780a(r1)
            r11.mo4126a((android.graphics.drawable.Drawable) r1)
            int r1 = android.support.p039v7.p040a.C0639a.C0649j.Spinner_android_prompt
            java.lang.String r1 = r0.mo4788d(r1)
            r11.mo5037a((java.lang.CharSequence) r1)
            r12.mo4781a()
            r7.f3744a = r11
            android.support.v7.widget.y$1 r12 = new android.support.v7.widget.y$1
            r12.<init>(r7, r11)
            r7.f3749g = r12
        L_0x00ac:
            int r11 = android.support.p039v7.p040a.C0639a.C0649j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo4792f(r11)
            if (r11 == 0) goto L_0x00c4
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = android.support.p039v7.p040a.C0639a.C0646g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter((android.widget.SpinnerAdapter) r12)
        L_0x00c4:
            r0.mo4781a()
            r7.f3751i = r3
            android.widget.SpinnerAdapter r8 = r7.f3750h
            if (r8 == 0) goto L_0x00d2
            r7.setAdapter((android.widget.SpinnerAdapter) r8)
            r7.f3750h = r2
        L_0x00d2:
            android.support.v7.widget.g r8 = r7.f3747e
            r8.mo4901a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C1027y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        if (this.f3744a != null) {
            return this.f3748f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            bVar.mo4126a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0705a.m3168b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            return bVar.mo4140h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            bVar.mo4135d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            return bVar.mo4145k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            bVar.mo4134c(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            return bVar.mo4144j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f3744a != null) {
            this.f3745b = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f3744a != null) {
            return this.f3745b;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3751i) {
            this.f3750h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3744a != null) {
            Context context = this.f3748f;
            if (context == null) {
                context = getContext();
            }
            this.f3744a.mo4128a((ListAdapter) new C1029a(spinnerAdapter, context.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1030b bVar = this.f3744a;
        if (bVar != null && bVar.mo3008d()) {
            this.f3744a.mo3005c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0878ap apVar = this.f3749g;
        if (apVar == null || !apVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3744a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo5002a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        C1030b bVar = this.f3744a;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.mo3008d()) {
            return true;
        }
        this.f3744a.mo2998a();
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        C1030b bVar = this.f3744a;
        if (bVar != null) {
            bVar.mo5037a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        C1030b bVar = this.f3744a;
        return bVar != null ? bVar.mo5039b() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f3747e;
        if (gVar != null) {
            gVar.mo4904c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5002a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f3746c);
        return i2 + this.f3746c.left + this.f3746c.right;
    }

    /* renamed from: android.support.v7.widget.y$a */
    private static class C1029a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f3754a;

        /* renamed from: b */
        private ListAdapter f3755b;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public C1029a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3754a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3755b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0964bj) {
                C0964bj bjVar = (C0964bj) spinnerAdapter;
                if (bjVar.mo4770a() == null) {
                    bjVar.mo4771a(theme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3754a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3755b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f3755b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    private class C1030b extends C0888at {

        /* renamed from: a */
        ListAdapter f3756a;

        /* renamed from: h */
        private CharSequence f3758h;

        /* renamed from: i */
        private final Rect f3759i = new Rect();

        public C1030b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo4132b((View) C1027y.this);
            mo4130a(true);
            mo4124a(0);
            mo4127a((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(C1027y.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C1027y.this.setSelection(i);
                    if (C1027y.this.getOnItemClickListener() != null) {
                        C1027y.this.performItemClick(view, i, C1030b.this.f3756a.getItemId(i));
                    }
                    C1030b.this.mo3005c();
                }
            });
        }

        /* renamed from: a */
        public void mo4128a(ListAdapter listAdapter) {
            super.mo4128a(listAdapter);
            this.f3756a = listAdapter;
        }

        /* renamed from: b */
        public CharSequence mo5039b() {
            return this.f3758h;
        }

        /* renamed from: a */
        public void mo5037a(CharSequence charSequence) {
            this.f3758h = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5040f() {
            Drawable h = mo4140h();
            int i = 0;
            if (h != null) {
                h.getPadding(C1027y.this.f3746c);
                i = C0984bv.m5212a(C1027y.this) ? C1027y.this.f3746c.right : -C1027y.this.f3746c.left;
            } else {
                Rect rect = C1027y.this.f3746c;
                C1027y.this.f3746c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C1027y.this.getPaddingLeft();
            int paddingRight = C1027y.this.getPaddingRight();
            int width = C1027y.this.getWidth();
            if (C1027y.this.f3745b == -2) {
                int a = C1027y.this.mo5002a((SpinnerAdapter) this.f3756a, mo4140h());
                int i2 = (C1027y.this.getContext().getResources().getDisplayMetrics().widthPixels - C1027y.this.f3746c.left) - C1027y.this.f3746c.right;
                if (a > i2) {
                    a = i2;
                }
                mo4138g(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (C1027y.this.f3745b == -1) {
                mo4138g((width - paddingLeft) - paddingRight);
            } else {
                mo4138g(C1027y.this.f3745b);
            }
            mo4134c(C0984bv.m5212a(C1027y.this) ? i + ((width - paddingRight) - mo4146l()) : i + paddingLeft);
        }

        /* renamed from: a */
        public void mo2998a() {
            ViewTreeObserver viewTreeObserver;
            boolean d = mo3008d();
            mo5040f();
            mo4141h(2);
            super.mo2998a();
            mo3009e().setChoiceMode(1);
            mo4143i(C1027y.this.getSelectedItemPosition());
            if (!d && (viewTreeObserver = C1027y.this.getViewTreeObserver()) != null) {
                final C10322 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        C1030b bVar = C1030b.this;
                        if (!bVar.mo5038a((View) C1027y.this)) {
                            C1030b.this.mo3005c();
                            return;
                        }
                        C1030b.this.mo5040f();
                        C1030b.super.mo2998a();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                mo4129a((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C1027y.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5038a(View view) {
            return C0594r.m2625z(view) && view.getGlobalVisibleRect(this.f3759i);
        }
    }
}
