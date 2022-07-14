package android.support.p039v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.NestedScrollView;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.widget.C0886as;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private int f1980A;

    /* renamed from: B */
    private boolean f1981B = false;

    /* renamed from: C */
    private CharSequence f1982C;

    /* renamed from: D */
    private Drawable f1983D;

    /* renamed from: E */
    private CharSequence f1984E;

    /* renamed from: F */
    private Drawable f1985F;

    /* renamed from: G */
    private CharSequence f1986G;

    /* renamed from: H */
    private Drawable f1987H;

    /* renamed from: I */
    private int f1988I = 0;

    /* renamed from: J */
    private Drawable f1989J;

    /* renamed from: K */
    private ImageView f1990K;

    /* renamed from: L */
    private TextView f1991L;

    /* renamed from: M */
    private TextView f1992M;

    /* renamed from: N */
    private View f1993N;

    /* renamed from: O */
    private int f1994O;

    /* renamed from: P */
    private int f1995P;

    /* renamed from: Q */
    private boolean f1996Q;

    /* renamed from: R */
    private int f1997R = 0;

    /* renamed from: S */
    private final View.OnClickListener f1998S = new View.OnClickListener() {
        public void onClick(View view) {
            Message message;
            if (view == AlertController.this.f2001c && AlertController.this.f2002d != null) {
                message = Message.obtain(AlertController.this.f2002d);
            } else if (view != AlertController.this.f2003e || AlertController.this.f2004f == null) {
                message = (view != AlertController.this.f2005g || AlertController.this.f2006h == null) ? null : Message.obtain(AlertController.this.f2006h);
            } else {
                message = Message.obtain(AlertController.this.f2004f);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.f2014p.obtainMessage(1, AlertController.this.f1999a).sendToTarget();
        }
    };

    /* renamed from: a */
    final C0691g f1999a;

    /* renamed from: b */
    ListView f2000b;

    /* renamed from: c */
    Button f2001c;

    /* renamed from: d */
    Message f2002d;

    /* renamed from: e */
    Button f2003e;

    /* renamed from: f */
    Message f2004f;

    /* renamed from: g */
    Button f2005g;

    /* renamed from: h */
    Message f2006h;

    /* renamed from: i */
    NestedScrollView f2007i;

    /* renamed from: j */
    ListAdapter f2008j;

    /* renamed from: k */
    int f2009k = -1;

    /* renamed from: l */
    int f2010l;

    /* renamed from: m */
    int f2011m;

    /* renamed from: n */
    int f2012n;

    /* renamed from: o */
    int f2013o;

    /* renamed from: p */
    Handler f2014p;

    /* renamed from: q */
    private final Context f2015q;

    /* renamed from: r */
    private final Window f2016r;

    /* renamed from: s */
    private final int f2017s;

    /* renamed from: t */
    private CharSequence f2018t;

    /* renamed from: u */
    private CharSequence f2019u;

    /* renamed from: v */
    private View f2020v;

    /* renamed from: w */
    private int f2021w;

    /* renamed from: x */
    private int f2022x;

    /* renamed from: y */
    private int f2023y;

    /* renamed from: z */
    private int f2024z;

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0661b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f2094a;

        public C0661b(DialogInterface dialogInterface) {
            this.f2094a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2094a.get(), message.what);
                        return;
                    default:
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: a */
    private static boolean m2872a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0639a.C0640a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, C0691g gVar, Window window) {
        this.f2015q = context;
        this.f1999a = gVar;
        this.f2016r = window;
        this.f2014p = new C0661b(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0639a.C0649j.AlertDialog, C0639a.C0640a.alertDialogStyle, 0);
        this.f1994O = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_android_layout, 0);
        this.f1995P = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2010l = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_listLayout, 0);
        this.f2011m = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2012n = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2013o = obtainStyledAttributes.getResourceId(C0639a.C0649j.AlertDialog_listItemLayout, 0);
        this.f1996Q = obtainStyledAttributes.getBoolean(C0639a.C0649j.AlertDialog_showTitle, true);
        this.f2017s = obtainStyledAttributes.getDimensionPixelSize(C0639a.C0649j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.mo2669a(1);
    }

    /* renamed from: a */
    static boolean m2873a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2873a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2475a() {
        this.f1999a.setContentView(m2874b());
        m2876c();
    }

    /* renamed from: b */
    private int m2874b() {
        int i = this.f1995P;
        if (i == 0) {
            return this.f1994O;
        }
        if (this.f1997R == 1) {
            return i;
        }
        return this.f1994O;
    }

    /* renamed from: a */
    public void mo2480a(CharSequence charSequence) {
        this.f2018t = charSequence;
        TextView textView = this.f1991L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public void mo2483b(View view) {
        this.f1993N = view;
    }

    /* renamed from: b */
    public void mo2484b(CharSequence charSequence) {
        this.f2019u = charSequence;
        TextView textView = this.f1992M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo2476a(int i) {
        this.f2020v = null;
        this.f2021w = i;
        this.f1981B = false;
    }

    /* renamed from: c */
    public void mo2487c(View view) {
        this.f2020v = view;
        this.f2021w = 0;
        this.f1981B = false;
    }

    /* renamed from: a */
    public void mo2479a(View view, int i, int i2, int i3, int i4) {
        this.f2020v = view;
        this.f2021w = 0;
        this.f1981B = true;
        this.f2022x = i;
        this.f2023y = i2;
        this.f2024z = i3;
        this.f1980A = i4;
    }

    /* renamed from: a */
    public void mo2477a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2014p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f1986G = charSequence;
                this.f2006h = message;
                this.f1987H = drawable;
                return;
            case -2:
                this.f1984E = charSequence;
                this.f2004f = message;
                this.f1985F = drawable;
                return;
            case -1:
                this.f1982C = charSequence;
                this.f2002d = message;
                this.f1983D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public void mo2482b(int i) {
        this.f1989J = null;
        this.f1988I = i;
        ImageView imageView = this.f1990K;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f1990K.setImageResource(this.f1988I);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2478a(Drawable drawable) {
        this.f1989J = drawable;
        this.f1988I = 0;
        ImageView imageView = this.f1990K;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f1990K.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public int mo2486c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2015q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public boolean mo2481a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2007i;
        return nestedScrollView != null && nestedScrollView.mo2326a(keyEvent);
    }

    /* renamed from: b */
    public boolean mo2485b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2007i;
        return nestedScrollView != null && nestedScrollView.mo2326a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m2867a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    private void m2876c() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f2016r.findViewById(C0639a.C0645f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0639a.C0645f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0639a.C0645f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0639a.C0645f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0639a.C0645f.customPanel);
        m2869a(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0639a.C0645f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0639a.C0645f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0639a.C0645f.buttonPanel);
        ViewGroup a = m2867a(findViewById7, findViewById4);
        ViewGroup a2 = m2867a(findViewById8, findViewById5);
        ViewGroup a3 = m2867a(findViewById9, findViewById6);
        m2877c(a2);
        m2878d(a3);
        m2875b(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0639a.C0645f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f2007i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f2019u == null && this.f2000b == null)) {
                view = a.findViewById(C0639a.C0645f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0639a.C0645f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f2000b;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo2493a(z2, z3);
        }
        if (!z) {
            View view2 = this.f2000b;
            if (view2 == null) {
                view2 = this.f2007i;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m2870a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f2000b;
        if (listView2 != null && (listAdapter = this.f2008j) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f2009k;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: a */
    private void m2870a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f2016r.findViewById(C0639a.C0645f.scrollIndicatorUp);
        View findViewById2 = this.f2016r.findViewById(C0639a.C0645f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0594r.m2579a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        final View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f2019u != null) {
                this.f2007i.setOnScrollChangeListener(new NestedScrollView.C0610b() {
                    /* renamed from: a */
                    public void mo2382a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m2868a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f2007i.post(new Runnable() {
                    public void run() {
                        AlertController.m2868a(AlertController.this.f2007i, findViewById, view2);
                    }
                });
                return;
            }
            ListView listView = this.f2000b;
            if (listView != null) {
                listView.setOnScrollListener(new AbsListView.OnScrollListener() {
                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m2868a(absListView, findViewById, view2);
                    }
                });
                this.f2000b.post(new Runnable() {
                    public void run() {
                        AlertController.m2868a(AlertController.this.f2000b, findViewById, view2);
                    }
                });
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m2869a(ViewGroup viewGroup) {
        View view = this.f2020v;
        boolean z = false;
        if (view == null) {
            view = this.f2021w != 0 ? LayoutInflater.from(this.f2015q).inflate(this.f2021w, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m2873a(view)) {
            this.f2016r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f2016r.findViewById(C0639a.C0645f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1981B) {
                frameLayout.setPadding(this.f2022x, this.f2023y, this.f2024z, this.f1980A);
            }
            if (this.f2000b != null) {
                ((C0886as.C0887a) viewGroup.getLayoutParams()).f3193g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: b */
    private void m2875b(ViewGroup viewGroup) {
        if (this.f1993N != null) {
            viewGroup.addView(this.f1993N, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2016r.findViewById(C0639a.C0645f.title_template).setVisibility(8);
            return;
        }
        this.f1990K = (ImageView) this.f2016r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f2018t)) || !this.f1996Q) {
            this.f2016r.findViewById(C0639a.C0645f.title_template).setVisibility(8);
            this.f1990K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1991L = (TextView) this.f2016r.findViewById(C0639a.C0645f.alertTitle);
        this.f1991L.setText(this.f2018t);
        int i = this.f1988I;
        if (i != 0) {
            this.f1990K.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1989J;
        if (drawable != null) {
            this.f1990K.setImageDrawable(drawable);
            return;
        }
        this.f1991L.setPadding(this.f1990K.getPaddingLeft(), this.f1990K.getPaddingTop(), this.f1990K.getPaddingRight(), this.f1990K.getPaddingBottom());
        this.f1990K.setVisibility(8);
    }

    /* renamed from: c */
    private void m2877c(ViewGroup viewGroup) {
        this.f2007i = (NestedScrollView) this.f2016r.findViewById(C0639a.C0645f.scrollView);
        this.f2007i.setFocusable(false);
        this.f2007i.setNestedScrollingEnabled(false);
        this.f1992M = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f1992M;
        if (textView != null) {
            CharSequence charSequence = this.f2019u;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f2007i.removeView(this.f1992M);
            if (this.f2000b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f2007i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f2007i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f2000b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    static void m2868a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m2878d(ViewGroup viewGroup) {
        boolean z;
        this.f2001c = (Button) viewGroup.findViewById(16908313);
        this.f2001c.setOnClickListener(this.f1998S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f1982C) || this.f1983D != null) {
            this.f2001c.setText(this.f1982C);
            Drawable drawable = this.f1983D;
            if (drawable != null) {
                int i = this.f2017s;
                drawable.setBounds(0, 0, i, i);
                this.f2001c.setCompoundDrawables(this.f1983D, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2001c.setVisibility(0);
            z = true;
        } else {
            this.f2001c.setVisibility(8);
            z = false;
        }
        this.f2003e = (Button) viewGroup.findViewById(16908314);
        this.f2003e.setOnClickListener(this.f1998S);
        if (!TextUtils.isEmpty(this.f1984E) || this.f1985F != null) {
            this.f2003e.setText(this.f1984E);
            Drawable drawable2 = this.f1985F;
            if (drawable2 != null) {
                int i2 = this.f2017s;
                drawable2.setBounds(0, 0, i2, i2);
                this.f2003e.setCompoundDrawables(this.f1985F, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2003e.setVisibility(0);
            z |= true;
        } else {
            this.f2003e.setVisibility(8);
        }
        this.f2005g = (Button) viewGroup.findViewById(16908315);
        this.f2005g.setOnClickListener(this.f1998S);
        if (!TextUtils.isEmpty(this.f1986G) || this.f1987H != null) {
            this.f2005g.setText(this.f1986G);
            Drawable drawable3 = this.f1983D;
            if (drawable3 != null) {
                int i3 = this.f2017s;
                drawable3.setBounds(0, 0, i3, i3);
                this.f2001c.setCompoundDrawables(this.f1983D, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2005g.setVisibility(0);
            z |= true;
        } else {
            this.f2005g.setVisibility(8);
        }
        if (m2872a(this.f2015q)) {
            if (z) {
                m2871a(this.f2001c);
            } else if (z) {
                m2871a(this.f2003e);
            } else if (z) {
                m2871a(this.f2005g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m2871a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f2038a;

        /* renamed from: b */
        private final int f2039b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.RecycleListView);
            this.f2039b = obtainStyledAttributes.getDimensionPixelOffset(C0639a.C0649j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2038a = obtainStyledAttributes.getDimensionPixelOffset(C0639a.C0649j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo2493a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f2038a, getPaddingRight(), z2 ? getPaddingBottom() : this.f2039b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0655a {

        /* renamed from: A */
        public int f2040A;

        /* renamed from: B */
        public int f2041B;

        /* renamed from: C */
        public int f2042C;

        /* renamed from: D */
        public int f2043D;

        /* renamed from: E */
        public boolean f2044E = false;

        /* renamed from: F */
        public boolean[] f2045F;

        /* renamed from: G */
        public boolean f2046G;

        /* renamed from: H */
        public boolean f2047H;

        /* renamed from: I */
        public int f2048I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f2049J;

        /* renamed from: K */
        public Cursor f2050K;

        /* renamed from: L */
        public String f2051L;

        /* renamed from: M */
        public String f2052M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f2053N;

        /* renamed from: O */
        public C0660a f2054O;

        /* renamed from: P */
        public boolean f2055P = true;

        /* renamed from: a */
        public final Context f2056a;

        /* renamed from: b */
        public final LayoutInflater f2057b;

        /* renamed from: c */
        public int f2058c = 0;

        /* renamed from: d */
        public Drawable f2059d;

        /* renamed from: e */
        public int f2060e = 0;

        /* renamed from: f */
        public CharSequence f2061f;

        /* renamed from: g */
        public View f2062g;

        /* renamed from: h */
        public CharSequence f2063h;

        /* renamed from: i */
        public CharSequence f2064i;

        /* renamed from: j */
        public Drawable f2065j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f2066k;

        /* renamed from: l */
        public CharSequence f2067l;

        /* renamed from: m */
        public Drawable f2068m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f2069n;

        /* renamed from: o */
        public CharSequence f2070o;

        /* renamed from: p */
        public Drawable f2071p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f2072q;

        /* renamed from: r */
        public boolean f2073r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f2074s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f2075t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f2076u;

        /* renamed from: v */
        public CharSequence[] f2077v;

        /* renamed from: w */
        public ListAdapter f2078w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f2079x;

        /* renamed from: y */
        public int f2080y;

        /* renamed from: z */
        public View f2081z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0660a {
            /* renamed from: a */
            void mo2500a(ListView listView);
        }

        public C0655a(Context context) {
            this.f2056a = context;
            this.f2073r = true;
            this.f2057b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo2494a(AlertController alertController) {
            View view = this.f2062g;
            if (view != null) {
                alertController.mo2483b(view);
            } else {
                CharSequence charSequence = this.f2061f;
                if (charSequence != null) {
                    alertController.mo2480a(charSequence);
                }
                Drawable drawable = this.f2059d;
                if (drawable != null) {
                    alertController.mo2478a(drawable);
                }
                int i = this.f2058c;
                if (i != 0) {
                    alertController.mo2482b(i);
                }
                int i2 = this.f2060e;
                if (i2 != 0) {
                    alertController.mo2482b(alertController.mo2486c(i2));
                }
            }
            CharSequence charSequence2 = this.f2063h;
            if (charSequence2 != null) {
                alertController.mo2484b(charSequence2);
            }
            if (!(this.f2064i == null && this.f2065j == null)) {
                alertController.mo2477a(-1, this.f2064i, this.f2066k, (Message) null, this.f2065j);
            }
            if (!(this.f2067l == null && this.f2068m == null)) {
                alertController.mo2477a(-2, this.f2067l, this.f2069n, (Message) null, this.f2068m);
            }
            if (!(this.f2070o == null && this.f2071p == null)) {
                alertController.mo2477a(-3, this.f2070o, this.f2072q, (Message) null, this.f2071p);
            }
            if (!(this.f2077v == null && this.f2050K == null && this.f2078w == null)) {
                m2894b(alertController);
            }
            View view2 = this.f2081z;
            if (view2 == null) {
                int i3 = this.f2080y;
                if (i3 != 0) {
                    alertController.mo2476a(i3);
                }
            } else if (this.f2044E) {
                alertController.mo2479a(view2, this.f2040A, this.f2041B, this.f2042C, this.f2043D);
            } else {
                alertController.mo2487c(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v18, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v19, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2894b(final android.support.p039v7.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f2057b
                int r1 = r12.f2010l
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p039v7.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f2046G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f2050K
                if (r4 != 0) goto L_0x0026
                android.support.v7.app.AlertController$a$1 r9 = new android.support.v7.app.AlertController$a$1
                android.content.Context r3 = r11.f2056a
                int r4 = r12.f2011m
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f2077v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0068
            L_0x0026:
                android.support.v7.app.AlertController$a$2 r9 = new android.support.v7.app.AlertController$a$2
                android.content.Context r3 = r11.f2056a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0068
            L_0x0033:
                boolean r1 = r11.f2047H
                if (r1 == 0) goto L_0x003b
                int r1 = r12.f2012n
                r4 = r1
                goto L_0x003e
            L_0x003b:
                int r1 = r12.f2013o
                r4 = r1
            L_0x003e:
                android.database.Cursor r5 = r11.f2050K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x005a
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f2056a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f2051L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0068
            L_0x005a:
                android.widget.ListAdapter r9 = r11.f2078w
                if (r9 == 0) goto L_0x005f
                goto L_0x0068
            L_0x005f:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r2 = r11.f2056a
                java.lang.CharSequence[] r3 = r11.f2077v
                r9.<init>(r2, r4, r1, r3)
            L_0x0068:
                android.support.v7.app.AlertController$a$a r1 = r11.f2054O
                if (r1 == 0) goto L_0x006f
                r1.mo2500a(r0)
            L_0x006f:
                r12.f2008j = r9
                int r1 = r11.f2048I
                r12.f2009k = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f2079x
                if (r1 == 0) goto L_0x0082
                android.support.v7.app.AlertController$a$3 r1 = new android.support.v7.app.AlertController$a$3
                r1.<init>(r12)
                r0.setOnItemClickListener(r1)
                goto L_0x008e
            L_0x0082:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f2049J
                if (r1 == 0) goto L_0x008e
                android.support.v7.app.AlertController$a$4 r1 = new android.support.v7.app.AlertController$a$4
                r1.<init>(r0, r12)
                r0.setOnItemClickListener(r1)
            L_0x008e:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f2053N
                if (r1 == 0) goto L_0x0095
                r0.setOnItemSelectedListener(r1)
            L_0x0095:
                boolean r1 = r11.f2047H
                if (r1 == 0) goto L_0x009d
                r0.setChoiceMode(r8)
                goto L_0x00a5
            L_0x009d:
                boolean r1 = r11.f2046G
                if (r1 == 0) goto L_0x00a5
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a5:
                r12.f2000b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.app.AlertController.C0655a.m2894b(android.support.v7.app.AlertController):void");
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0662c extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public C0662c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }
}
