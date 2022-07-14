package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0628k;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0776s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.at */
public class C0888at implements C0776s {

    /* renamed from: a */
    private static Method f3195a;

    /* renamed from: b */
    private static Method f3196b;

    /* renamed from: h */
    private static Method f3197h;

    /* renamed from: A */
    private Drawable f3198A;

    /* renamed from: B */
    private AdapterView.OnItemClickListener f3199B;

    /* renamed from: C */
    private AdapterView.OnItemSelectedListener f3200C;

    /* renamed from: D */
    private final C0894d f3201D;

    /* renamed from: E */
    private final C0893c f3202E;

    /* renamed from: F */
    private final C0891a f3203F;

    /* renamed from: G */
    private Runnable f3204G;

    /* renamed from: H */
    private final Rect f3205H;

    /* renamed from: I */
    private Rect f3206I;

    /* renamed from: J */
    private boolean f3207J;

    /* renamed from: c */
    C0868am f3208c;

    /* renamed from: d */
    int f3209d;

    /* renamed from: e */
    final C0895e f3210e;

    /* renamed from: f */
    final Handler f3211f;

    /* renamed from: g */
    PopupWindow f3212g;

    /* renamed from: i */
    private Context f3213i;

    /* renamed from: j */
    private ListAdapter f3214j;

    /* renamed from: k */
    private int f3215k;

    /* renamed from: l */
    private int f3216l;

    /* renamed from: m */
    private int f3217m;

    /* renamed from: n */
    private int f3218n;

    /* renamed from: o */
    private int f3219o;

    /* renamed from: p */
    private boolean f3220p;

    /* renamed from: q */
    private boolean f3221q;

    /* renamed from: r */
    private boolean f3222r;

    /* renamed from: s */
    private boolean f3223s;

    /* renamed from: t */
    private int f3224t;

    /* renamed from: u */
    private boolean f3225u;

    /* renamed from: v */
    private boolean f3226v;

    /* renamed from: w */
    private View f3227w;

    /* renamed from: x */
    private int f3228x;

    /* renamed from: y */
    private DataSetObserver f3229y;

    /* renamed from: z */
    private View f3230z;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f3195a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f3196b = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f3197h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0888at(Context context) {
        this(context, (AttributeSet) null, C0639a.C0640a.listPopupWindowStyle);
    }

    public C0888at(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0888at(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3215k = -2;
        this.f3216l = -2;
        this.f3219o = 1002;
        this.f3221q = true;
        this.f3224t = 0;
        this.f3225u = false;
        this.f3226v = false;
        this.f3209d = Integer.MAX_VALUE;
        this.f3228x = 0;
        this.f3210e = new C0895e();
        this.f3201D = new C0894d();
        this.f3202E = new C0893c();
        this.f3203F = new C0891a();
        this.f3205H = new Rect();
        this.f3213i = context;
        this.f3211f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ListPopupWindow, i, i2);
        this.f3217m = obtainStyledAttributes.getDimensionPixelOffset(C0639a.C0649j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f3218n = obtainStyledAttributes.getDimensionPixelOffset(C0639a.C0649j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f3218n != 0) {
            this.f3220p = true;
        }
        obtainStyledAttributes.recycle();
        this.f3212g = new C1021s(context, attributeSet, i, i2);
        this.f3212g.setInputMethodMode(1);
    }

    /* renamed from: a */
    public void mo4128a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3229y;
        if (dataSetObserver == null) {
            this.f3229y = new C0892b();
        } else {
            ListAdapter listAdapter2 = this.f3214j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3214j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3229y);
        }
        C0868am amVar = this.f3208c;
        if (amVar != null) {
            amVar.setAdapter(this.f3214j);
        }
    }

    /* renamed from: a */
    public void mo4124a(int i) {
        this.f3228x = i;
    }

    /* renamed from: a */
    public void mo4130a(boolean z) {
        this.f3207J = z;
        this.f3212g.setFocusable(z);
    }

    /* renamed from: g */
    public boolean mo4139g() {
        return this.f3207J;
    }

    /* renamed from: h */
    public Drawable mo4140h() {
        return this.f3212g.getBackground();
    }

    /* renamed from: a */
    public void mo4126a(Drawable drawable) {
        this.f3212g.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public void mo4131b(int i) {
        this.f3212g.setAnimationStyle(i);
    }

    /* renamed from: i */
    public View mo4142i() {
        return this.f3230z;
    }

    /* renamed from: b */
    public void mo4132b(View view) {
        this.f3230z = view;
    }

    /* renamed from: j */
    public int mo4144j() {
        return this.f3217m;
    }

    /* renamed from: c */
    public void mo4134c(int i) {
        this.f3217m = i;
    }

    /* renamed from: k */
    public int mo4145k() {
        if (!this.f3220p) {
            return 0;
        }
        return this.f3218n;
    }

    /* renamed from: d */
    public void mo4135d(int i) {
        this.f3218n = i;
        this.f3220p = true;
    }

    /* renamed from: a */
    public void mo4125a(Rect rect) {
        this.f3206I = rect;
    }

    /* renamed from: e */
    public void mo4136e(int i) {
        this.f3224t = i;
    }

    /* renamed from: l */
    public int mo4146l() {
        return this.f3216l;
    }

    /* renamed from: f */
    public void mo4137f(int i) {
        this.f3216l = i;
    }

    /* renamed from: g */
    public void mo4138g(int i) {
        Drawable background = this.f3212g.getBackground();
        if (background != null) {
            background.getPadding(this.f3205H);
            this.f3216l = this.f3205H.left + this.f3205H.right + i;
            return;
        }
        mo4137f(i);
    }

    /* renamed from: a */
    public void mo4127a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3199B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo2998a() {
        int f = mo5040f();
        boolean n = mo4148n();
        C0628k.m2792a(this.f3212g, this.f3219o);
        boolean z = true;
        if (!this.f3212g.isShowing()) {
            int i = this.f3216l;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo4142i().getWidth();
            }
            int i2 = this.f3215k;
            if (i2 == -1) {
                f = -1;
            } else if (i2 != -2) {
                f = i2;
            }
            this.f3212g.setWidth(i);
            this.f3212g.setHeight(f);
            mo4162c(true);
            this.f3212g.setOutsideTouchable(!this.f3226v && !this.f3225u);
            this.f3212g.setTouchInterceptor(this.f3201D);
            if (this.f3223s) {
                C0628k.m2794a(this.f3212g, this.f3222r);
            }
            Method method = f3197h;
            if (method != null) {
                try {
                    method.invoke(this.f3212g, new Object[]{this.f3206I});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0628k.m2793a(this.f3212g, mo4142i(), this.f3217m, this.f3218n, this.f3224t);
            this.f3208c.setSelection(-1);
            if (!this.f3207J || this.f3208c.isInTouchMode()) {
                mo4147m();
            }
            if (!this.f3207J) {
                this.f3211f.post(this.f3203F);
            }
        } else if (C0594r.m2625z(mo4142i())) {
            int i3 = this.f3216l;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo4142i().getWidth();
            }
            int i4 = this.f3215k;
            if (i4 == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.f3212g.setWidth(this.f3216l == -1 ? -1 : 0);
                    this.f3212g.setHeight(0);
                } else {
                    this.f3212g.setWidth(this.f3216l == -1 ? -1 : 0);
                    this.f3212g.setHeight(-1);
                }
            } else if (i4 != -2) {
                f = i4;
            }
            PopupWindow popupWindow = this.f3212g;
            if (this.f3226v || this.f3225u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f3212g.update(mo4142i(), this.f3217m, this.f3218n, i3 < 0 ? -1 : i3, f < 0 ? -1 : f);
        }
    }

    /* renamed from: c */
    public void mo3005c() {
        this.f3212g.dismiss();
        mo5039b();
        this.f3212g.setContentView((View) null);
        this.f3208c = null;
        this.f3211f.removeCallbacks(this.f3210e);
    }

    /* renamed from: a */
    public void mo4129a(PopupWindow.OnDismissListener onDismissListener) {
        this.f3212g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    private void mo5039b() {
        View view = this.f3227w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3227w);
            }
        }
    }

    /* renamed from: h */
    public void mo4141h(int i) {
        this.f3212g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public void mo4143i(int i) {
        C0868am amVar = this.f3208c;
        if (mo3008d() && amVar != null) {
            amVar.setListSelectionHidden(false);
            amVar.setSelection(i);
            if (amVar.getChoiceMode() != 0) {
                amVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public void mo4147m() {
        C0868am amVar = this.f3208c;
        if (amVar != null) {
            amVar.setListSelectionHidden(true);
            amVar.requestLayout();
        }
    }

    /* renamed from: d */
    public boolean mo3008d() {
        return this.f3212g.isShowing();
    }

    /* renamed from: n */
    public boolean mo4148n() {
        return this.f3212g.getInputMethodMode() == 2;
    }

    /* renamed from: e */
    public ListView mo3009e() {
        return this.f3208c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0868am mo4123a(Context context, boolean z) {
        return new C0868am(context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.support.v7.widget.am} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.support.v7.widget.am} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: android.support.v7.widget.am} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo5040f() {
        /*
            r12 = this;
            android.support.v7.widget.am r0 = r12.f3208c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00c0
            android.content.Context r0 = r12.f3213i
            android.support.v7.widget.at$1 r5 = new android.support.v7.widget.at$1
            r5.<init>()
            r12.f3204G = r5
            boolean r5 = r12.f3207J
            r5 = r5 ^ r3
            android.support.v7.widget.am r5 = r12.mo4123a(r0, r5)
            r12.f3208c = r5
            android.graphics.drawable.Drawable r5 = r12.f3198A
            if (r5 == 0) goto L_0x0024
            android.support.v7.widget.am r6 = r12.f3208c
            r6.setSelector(r5)
        L_0x0024:
            android.support.v7.widget.am r5 = r12.f3208c
            android.widget.ListAdapter r6 = r12.f3214j
            r5.setAdapter(r6)
            android.support.v7.widget.am r5 = r12.f3208c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f3199B
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.am r5 = r12.f3208c
            r5.setFocusable(r3)
            android.support.v7.widget.am r5 = r12.f3208c
            r5.setFocusableInTouchMode(r3)
            android.support.v7.widget.am r5 = r12.f3208c
            android.support.v7.widget.at$2 r6 = new android.support.v7.widget.at$2
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.am r5 = r12.f3208c
            android.support.v7.widget.at$c r6 = r12.f3202E
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f3200C
            if (r5 == 0) goto L_0x0056
            android.support.v7.widget.am r6 = r12.f3208c
            r6.setOnItemSelectedListener(r5)
        L_0x0056:
            android.support.v7.widget.am r5 = r12.f3208c
            android.view.View r6 = r12.f3227w
            if (r6 == 0) goto L_0x00b9
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f3228x
            switch(r8) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0089;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Invalid hint position "
            r5.append(r8)
            int r8 = r12.f3228x
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            goto L_0x0096
        L_0x0089:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0096
        L_0x0090:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0096:
            int r0 = r12.f3216l
            if (r0 < 0) goto L_0x009d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009f
        L_0x009d:
            r0 = 0
            r5 = 0
        L_0x009f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            android.widget.PopupWindow r6 = r12.f3212g
            r6.setContentView(r5)
            goto L_0x00de
        L_0x00c0:
            android.widget.PopupWindow r0 = r12.f3212g
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f3227w
            if (r0 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            android.widget.PopupWindow r5 = r12.f3212g
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x0100
            android.graphics.Rect r6 = r12.f3205H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f3205H
            int r5 = r5.top
            android.graphics.Rect r6 = r12.f3205H
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.f3220p
            if (r6 != 0) goto L_0x0106
            android.graphics.Rect r6 = r12.f3205H
            int r6 = r6.top
            int r6 = -r6
            r12.f3218n = r6
            goto L_0x0106
        L_0x0100:
            android.graphics.Rect r5 = r12.f3205H
            r5.setEmpty()
            r5 = 0
        L_0x0106:
            android.widget.PopupWindow r6 = r12.f3212g
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r3 = 0
        L_0x0111:
            android.view.View r4 = r12.mo4142i()
            int r6 = r12.f3218n
            int r3 = r12.m4388a(r4, r6, r3)
            boolean r4 = r12.f3225u
            if (r4 != 0) goto L_0x0186
            int r4 = r12.f3215k
            if (r4 != r2) goto L_0x0124
            goto L_0x0186
        L_0x0124:
            int r2 = r12.f3216l
            r4 = 1073741824(0x40000000, float:2.0)
            switch(r2) {
                case -2: goto L_0x014d;
                case -1: goto L_0x0131;
                default: goto L_0x012b;
            }
        L_0x012b:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            r7 = r1
            goto L_0x0168
        L_0x0131:
            android.content.Context r1 = r12.f3213i
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.graphics.Rect r2 = r12.f3205H
            int r2 = r2.left
            android.graphics.Rect r6 = r12.f3205H
            int r6 = r6.right
            int r2 = r2 + r6
            int r1 = r1 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4)
            r7 = r1
            goto L_0x0168
        L_0x014d:
            android.content.Context r2 = r12.f3213i
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f3205H
            int r4 = r4.left
            android.graphics.Rect r6 = r12.f3205H
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r7 = r1
        L_0x0168:
            android.support.v7.widget.am r6 = r12.f3208c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo4026a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0184
            android.support.v7.widget.am r2 = r12.f3208c
            int r2 = r2.getPaddingTop()
            android.support.v7.widget.am r3 = r12.f3208c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0184:
            int r1 = r1 + r0
            return r1
        L_0x0186:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0888at.mo5040f():int");
    }

    /* renamed from: b */
    public void mo4133b(boolean z) {
        this.f3223s = true;
        this.f3222r = z;
    }

    /* renamed from: android.support.v7.widget.at$b */
    private class C0892b extends DataSetObserver {
        C0892b() {
        }

        public void onChanged() {
            if (C0888at.this.mo3008d()) {
                C0888at.this.mo2998a();
            }
        }

        public void onInvalidated() {
            C0888at.this.mo3005c();
        }
    }

    /* renamed from: android.support.v7.widget.at$a */
    private class C0891a implements Runnable {
        C0891a() {
        }

        public void run() {
            C0888at.this.mo4147m();
        }
    }

    /* renamed from: android.support.v7.widget.at$e */
    private class C0895e implements Runnable {
        C0895e() {
        }

        public void run() {
            if (C0888at.this.f3208c != null && C0594r.m2625z(C0888at.this.f3208c) && C0888at.this.f3208c.getCount() > C0888at.this.f3208c.getChildCount() && C0888at.this.f3208c.getChildCount() <= C0888at.this.f3209d) {
                C0888at.this.f3212g.setInputMethodMode(2);
                C0888at.this.mo2998a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.at$d */
    private class C0894d implements View.OnTouchListener {
        C0894d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C0888at.this.f3212g != null && C0888at.this.f3212g.isShowing() && x >= 0 && x < C0888at.this.f3212g.getWidth() && y >= 0 && y < C0888at.this.f3212g.getHeight()) {
                C0888at.this.f3211f.postDelayed(C0888at.this.f3210e, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0888at.this.f3211f.removeCallbacks(C0888at.this.f3210e);
                return false;
            }
        }
    }

    /* renamed from: android.support.v7.widget.at$c */
    private class C0893c implements AbsListView.OnScrollListener {
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C0893c() {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0888at.this.mo4148n() && C0888at.this.f3212g.getContentView() != null) {
                C0888at.this.f3211f.removeCallbacks(C0888at.this.f3210e);
                C0888at.this.f3210e.run();
            }
        }
    }

    /* renamed from: c */
    private void mo4162c(boolean z) {
        Method method = f3195a;
        if (method != null) {
            try {
                method.invoke(this.f3212g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: a */
    private int m4388a(View view, int i, boolean z) {
        Method method = f3196b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f3212g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3212g.getMaxAvailableHeight(view, i);
    }
}
