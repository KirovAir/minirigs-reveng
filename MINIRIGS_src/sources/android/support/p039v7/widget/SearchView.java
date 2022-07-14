package android.support.p039v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0618d;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0728c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C0886as implements C0728c {

    /* renamed from: i */
    static final C0815a f2812i = new C0815a();

    /* renamed from: A */
    private C0817c f2813A;

    /* renamed from: B */
    private C0816b f2814B;

    /* renamed from: C */
    private C0818d f2815C;

    /* renamed from: D */
    private View.OnClickListener f2816D;

    /* renamed from: E */
    private boolean f2817E;

    /* renamed from: F */
    private boolean f2818F;

    /* renamed from: G */
    private boolean f2819G;

    /* renamed from: H */
    private CharSequence f2820H;

    /* renamed from: I */
    private boolean f2821I;

    /* renamed from: J */
    private boolean f2822J;

    /* renamed from: K */
    private int f2823K;

    /* renamed from: L */
    private boolean f2824L;

    /* renamed from: M */
    private CharSequence f2825M;

    /* renamed from: N */
    private CharSequence f2826N;

    /* renamed from: O */
    private boolean f2827O;

    /* renamed from: P */
    private int f2828P;

    /* renamed from: Q */
    private Bundle f2829Q;

    /* renamed from: R */
    private final Runnable f2830R;

    /* renamed from: S */
    private Runnable f2831S;

    /* renamed from: T */
    private final WeakHashMap<String, Drawable.ConstantState> f2832T;

    /* renamed from: U */
    private final View.OnClickListener f2833U;

    /* renamed from: V */
    private final TextView.OnEditorActionListener f2834V;

    /* renamed from: W */
    private final AdapterView.OnItemClickListener f2835W;

    /* renamed from: a */
    final SearchAutoComplete f2836a;

    /* renamed from: aa */
    private final AdapterView.OnItemSelectedListener f2837aa;

    /* renamed from: ab */
    private TextWatcher f2838ab;

    /* renamed from: b */
    final ImageView f2839b;

    /* renamed from: c */
    final ImageView f2840c;

    /* renamed from: d */
    final ImageView f2841d;

    /* renamed from: e */
    final ImageView f2842e;

    /* renamed from: f */
    View.OnFocusChangeListener f2843f;

    /* renamed from: g */
    C0618d f2844g;

    /* renamed from: h */
    SearchableInfo f2845h;

    /* renamed from: j */
    View.OnKeyListener f2846j;

    /* renamed from: k */
    private final View f2847k;

    /* renamed from: l */
    private final View f2848l;

    /* renamed from: m */
    private final View f2849m;

    /* renamed from: n */
    private final View f2850n;

    /* renamed from: o */
    private C0821f f2851o;

    /* renamed from: p */
    private Rect f2852p;

    /* renamed from: q */
    private Rect f2853q;

    /* renamed from: r */
    private int[] f2854r;

    /* renamed from: s */
    private int[] f2855s;

    /* renamed from: t */
    private final ImageView f2856t;

    /* renamed from: u */
    private final Drawable f2857u;

    /* renamed from: v */
    private final int f2858v;

    /* renamed from: w */
    private final int f2859w;

    /* renamed from: x */
    private final Intent f2860x;

    /* renamed from: y */
    private final Intent f2861y;

    /* renamed from: z */
    private final CharSequence f2862z;

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0816b {
        /* renamed from: a */
        boolean mo3676a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0817c {
        /* renamed from: a */
        boolean mo3677a(String str);

        /* renamed from: b */
        boolean mo3678b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0818d {
        /* renamed from: a */
        boolean mo3679a(int i);

        /* renamed from: b */
        boolean mo3680b(int i);
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2852p = new Rect();
        this.f2853q = new Rect();
        this.f2854r = new int[2];
        this.f2855s = new int[2];
        this.f2830R = new Runnable() {
            public void run() {
                SearchView.this.mo3609d();
            }
        };
        this.f2831S = new Runnable() {
            public void run() {
                if (SearchView.this.f2844g != null && (SearchView.this.f2844g instanceof C0961bh)) {
                    SearchView.this.f2844g.mo2421a((Cursor) null);
                }
            }
        };
        this.f2832T = new WeakHashMap<>();
        this.f2833U = new View.OnClickListener() {
            public void onClick(View view) {
                if (view == SearchView.this.f2839b) {
                    SearchView.this.mo3612g();
                } else if (view == SearchView.this.f2841d) {
                    SearchView.this.mo3611f();
                } else if (view == SearchView.this.f2840c) {
                    SearchView.this.mo3610e();
                } else if (view == SearchView.this.f2842e) {
                    SearchView.this.mo3621h();
                } else if (view == SearchView.this.f2836a) {
                    SearchView.this.mo3624l();
                }
            }
        };
        this.f2846j = new View.OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f2845h == null) {
                    return false;
                }
                if (SearchView.this.f2836a.isPopupShowing() && SearchView.this.f2836a.getListSelection() != -1) {
                    return SearchView.this.mo3605a(view, i, keyEvent);
                }
                if (SearchView.this.f2836a.mo3659a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.mo3600a(0, (String) null, searchView.f2836a.getText().toString());
                return true;
            }
        };
        this.f2834V = new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo3610e();
                return true;
            }
        };
        this.f2835W = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo3604a(i, 0, (String) null);
            }
        };
        this.f2837aa = new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo3603a(i);
            }
        };
        this.f2838ab = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo3606b(charSequence);
            }
        };
        C0968bn a = C0968bn.m5093a(context, attributeSet, C0639a.C0649j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo4793g(C0639a.C0649j.SearchView_layout, C0639a.C0646g.abc_search_view), this, true);
        this.f2836a = (SearchAutoComplete) findViewById(C0639a.C0645f.search_src_text);
        this.f2836a.setSearchView(this);
        this.f2847k = findViewById(C0639a.C0645f.search_edit_frame);
        this.f2848l = findViewById(C0639a.C0645f.search_plate);
        this.f2849m = findViewById(C0639a.C0645f.submit_area);
        this.f2839b = (ImageView) findViewById(C0639a.C0645f.search_button);
        this.f2840c = (ImageView) findViewById(C0639a.C0645f.search_go_btn);
        this.f2841d = (ImageView) findViewById(C0639a.C0645f.search_close_btn);
        this.f2842e = (ImageView) findViewById(C0639a.C0645f.search_voice_btn);
        this.f2856t = (ImageView) findViewById(C0639a.C0645f.search_mag_icon);
        C0594r.m2584a(this.f2848l, a.mo4780a(C0639a.C0649j.SearchView_queryBackground));
        C0594r.m2584a(this.f2849m, a.mo4780a(C0639a.C0649j.SearchView_submitBackground));
        this.f2839b.setImageDrawable(a.mo4780a(C0639a.C0649j.SearchView_searchIcon));
        this.f2840c.setImageDrawable(a.mo4780a(C0639a.C0649j.SearchView_goIcon));
        this.f2841d.setImageDrawable(a.mo4780a(C0639a.C0649j.SearchView_closeIcon));
        this.f2842e.setImageDrawable(a.mo4780a(C0639a.C0649j.SearchView_voiceIcon));
        this.f2856t.setImageDrawable(a.mo4780a(C0639a.C0649j.SearchView_searchIcon));
        this.f2857u = a.mo4780a(C0639a.C0649j.SearchView_searchHintIcon);
        C0972bp.m5158a(this.f2839b, getResources().getString(C0639a.C0647h.abc_searchview_description_search));
        this.f2858v = a.mo4793g(C0639a.C0649j.SearchView_suggestionRowLayout, C0639a.C0646g.abc_search_dropdown_item_icons_2line);
        this.f2859w = a.mo4793g(C0639a.C0649j.SearchView_commitIcon, 0);
        this.f2839b.setOnClickListener(this.f2833U);
        this.f2841d.setOnClickListener(this.f2833U);
        this.f2840c.setOnClickListener(this.f2833U);
        this.f2842e.setOnClickListener(this.f2833U);
        this.f2836a.setOnClickListener(this.f2833U);
        this.f2836a.addTextChangedListener(this.f2838ab);
        this.f2836a.setOnEditorActionListener(this.f2834V);
        this.f2836a.setOnItemClickListener(this.f2835W);
        this.f2836a.setOnItemSelectedListener(this.f2837aa);
        this.f2836a.setOnKeyListener(this.f2846j);
        this.f2836a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f2843f != null) {
                    SearchView.this.f2843f.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo4782a(C0639a.C0649j.SearchView_iconifiedByDefault, true));
        int e = a.mo4789e(C0639a.C0649j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f2862z = a.mo4786c(C0639a.C0649j.SearchView_defaultQueryHint);
        this.f2820H = a.mo4786c(C0639a.C0649j.SearchView_queryHint);
        int a2 = a.mo4778a(C0639a.C0649j.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo4778a(C0639a.C0649j.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo4782a(C0639a.C0649j.SearchView_android_focusable, true));
        a.mo4781a();
        this.f2860x = new Intent("android.speech.action.WEB_SEARCH");
        this.f2860x.addFlags(268435456);
        this.f2860x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f2861y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2861y.addFlags(268435456);
        this.f2850n = findViewById(this.f2836a.getDropDownAnchor());
        View view = this.f2850n;
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.mo3623k();
                }
            });
        }
        m3857a(this.f2817E);
        m3870r();
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f2858v;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f2859w;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2845h = searchableInfo;
        if (this.f2845h != null) {
            m3871s();
            m3870r();
        }
        this.f2824L = m3865m();
        if (this.f2824L) {
            this.f2836a.setPrivateImeOptions("nm");
        }
        m3857a(mo3607c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2829Q = bundle;
    }

    public void setImeOptions(int i) {
        this.f2836a.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.f2836a.getImeOptions();
    }

    public void setInputType(int i) {
        this.f2836a.setInputType(i);
    }

    public int getInputType() {
        return this.f2836a.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2822J || !isFocusable()) {
            return false;
        }
        if (mo3607c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2836a.requestFocus(i, rect);
        if (requestFocus) {
            m3857a(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.f2822J = true;
        super.clearFocus();
        this.f2836a.clearFocus();
        this.f2836a.setImeVisibility(false);
        this.f2822J = false;
    }

    public void setOnQueryTextListener(C0817c cVar) {
        this.f2813A = cVar;
    }

    public void setOnCloseListener(C0816b bVar) {
        this.f2814B = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2843f = onFocusChangeListener;
    }

    public void setOnSuggestionListener(C0818d dVar) {
        this.f2815C = dVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2816D = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f2836a.getText();
    }

    /* renamed from: a */
    public void mo3602a(CharSequence charSequence, boolean z) {
        this.f2836a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f2836a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f2826N = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo3610e();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2820H = charSequence;
        m3870r();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2820H;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2845h;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f2862z;
        }
        return getContext().getText(this.f2845h.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2817E != z) {
            this.f2817E = z;
            m3857a(z);
            m3870r();
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            mo3611f();
        } else {
            mo3612g();
        }
    }

    /* renamed from: c */
    public boolean mo3607c() {
        return this.f2818F;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2819G = z;
        m3857a(mo3607c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2821I = z;
        C0618d dVar = this.f2844g;
        if (dVar instanceof C0961bh) {
            ((C0961bh) dVar).mo4766a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(C0618d dVar) {
        this.f2844g = dVar;
        this.f2836a.setAdapter(this.f2844g);
    }

    public C0618d getSuggestionsAdapter() {
        return this.f2844g;
    }

    public void setMaxWidth(int i) {
        this.f2823K = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f2823K;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo3607c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f2823K;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2823K;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f2823K) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m3856a((View) this.f2836a, this.f2852p);
            this.f2853q.set(this.f2852p.left, 0, this.f2852p.right, i4 - i2);
            C0821f fVar = this.f2851o;
            if (fVar == null) {
                this.f2851o = new C0821f(this.f2853q, this.f2852p, this.f2836a);
                setTouchDelegate(this.f2851o);
                return;
            }
            fVar.mo3688a(this.f2853q, this.f2852p);
        }
    }

    /* renamed from: a */
    private void m3856a(View view, Rect rect) {
        view.getLocationInWindow(this.f2854r);
        getLocationInWindow(this.f2855s);
        int[] iArr = this.f2854r;
        int i = iArr[1];
        int[] iArr2 = this.f2855s;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0639a.C0643d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0639a.C0643d.abc_search_view_preferred_height);
    }

    /* renamed from: a */
    private void m3857a(boolean z) {
        this.f2818F = z;
        int i = 8;
        boolean z2 = false;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f2836a.getText());
        this.f2839b.setVisibility(i2);
        m3860b(z3);
        this.f2847k.setVisibility(z ? 8 : 0);
        if (this.f2856t.getDrawable() != null && !this.f2817E) {
            i = 0;
        }
        this.f2856t.setVisibility(i);
        m3868p();
        if (!z3) {
            z2 = true;
        }
        m3863c(z2);
        m3867o();
    }

    /* renamed from: m */
    private boolean m3865m() {
        SearchableInfo searchableInfo = this.f2845h;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.f2845h.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2860x;
            } else if (this.f2845h.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2861y;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m3866n() {
        return (this.f2819G || this.f2824L) && !mo3607c();
    }

    /* renamed from: b */
    private void m3860b(boolean z) {
        this.f2840c.setVisibility((!this.f2819G || !m3866n() || !hasFocus() || (!z && this.f2824L)) ? 8 : 0);
    }

    /* renamed from: o */
    private void m3867o() {
        this.f2849m.setVisibility((!m3866n() || !(this.f2840c.getVisibility() == 0 || this.f2842e.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: p */
    private void m3868p() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2836a.getText());
        int i = 0;
        if (!z2 && (!this.f2817E || this.f2827O)) {
            z = false;
        }
        ImageView imageView = this.f2841d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f2841d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    private void m3869q() {
        post(this.f2830R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3609d() {
        int[] iArr = this.f2836a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f2848l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2849m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2830R);
        post(this.f2831S);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3601a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3605a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f2845h != null && this.f2844g != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo3604a(this.f2836a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f2836a.length();
                }
                this.f2836a.setSelection(i2);
                this.f2836a.setListSelection(0);
                this.f2836a.clearListSelection();
                f2812i.mo3674a(this.f2836a, true);
                return true;
            } else if (i != 19 || this.f2836a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private CharSequence m3862c(CharSequence charSequence) {
        if (!this.f2817E || this.f2857u == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f2836a.getTextSize()) * 1.25d);
        this.f2857u.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2857u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: r */
    private void m3870r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2836a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m3862c(queryHint));
    }

    /* renamed from: s */
    private void m3871s() {
        this.f2836a.setThreshold(this.f2845h.getSuggestThreshold());
        this.f2836a.setImeOptions(this.f2845h.getImeOptions());
        int inputType = this.f2845h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2845h.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2836a.setInputType(inputType);
        C0618d dVar = this.f2844g;
        if (dVar != null) {
            dVar.mo2421a((Cursor) null);
        }
        if (this.f2845h.getSuggestAuthority() != null) {
            this.f2844g = new C0961bh(getContext(), this, this.f2845h, this.f2832T);
            this.f2836a.setAdapter(this.f2844g);
            C0961bh bhVar = (C0961bh) this.f2844g;
            if (this.f2821I) {
                i = 2;
            }
            bhVar.mo4766a(i);
        }
    }

    /* renamed from: c */
    private void m3863c(boolean z) {
        int i;
        if (!this.f2824L || mo3607c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f2840c.setVisibility(8);
        }
        this.f2842e.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3606b(CharSequence charSequence) {
        Editable text = this.f2836a.getText();
        this.f2826N = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m3860b(z2);
        if (z2) {
            z = false;
        }
        m3863c(z);
        m3868p();
        m3867o();
        if (this.f2813A != null && !TextUtils.equals(charSequence, this.f2825M)) {
            this.f2813A.mo3678b(charSequence.toString());
        }
        this.f2825M = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3610e() {
        Editable text = this.f2836a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0817c cVar = this.f2813A;
            if (cVar == null || !cVar.mo3677a(text.toString())) {
                if (this.f2845h != null) {
                    mo3600a(0, (String) null, text.toString());
                }
                this.f2836a.setImeVisibility(false);
                m3872t();
            }
        }
    }

    /* renamed from: t */
    private void m3872t() {
        this.f2836a.dismissDropDown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3611f() {
        if (!TextUtils.isEmpty(this.f2836a.getText())) {
            this.f2836a.setText("");
            this.f2836a.requestFocus();
            this.f2836a.setImeVisibility(true);
        } else if (this.f2817E) {
            C0816b bVar = this.f2814B;
            if (bVar == null || !bVar.mo3676a()) {
                clearFocus();
                m3857a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3612g() {
        m3857a(false);
        this.f2836a.requestFocus();
        this.f2836a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2816D;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3621h() {
        SearchableInfo searchableInfo = this.f2845h;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m3852a(this.f2860x, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m3859b(this.f2861y, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3622i() {
        m3857a(mo3607c());
        m3869q();
        if (this.f2836a.hasFocus()) {
            mo3624l();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3869q();
    }

    /* renamed from: b */
    public void mo2845b() {
        mo3602a((CharSequence) "", false);
        clearFocus();
        m3857a(true);
        this.f2836a.setImeOptions(this.f2828P);
        this.f2827O = false;
    }

    /* renamed from: a */
    public void mo2844a() {
        if (!this.f2827O) {
            this.f2827O = true;
            this.f2828P = this.f2836a.getImeOptions();
            this.f2836a.setImeOptions(this.f2828P | 33554432);
            this.f2836a.setText("");
            setIconified(false);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C0819e extends C0556a {
        public static final Parcelable.Creator<C0819e> CREATOR = new Parcelable.ClassLoaderCreator<C0819e>() {
            /* renamed from: a */
            public C0819e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0819e(parcel, classLoader);
            }

            /* renamed from: a */
            public C0819e createFromParcel(Parcel parcel) {
                return new C0819e(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0819e[] newArray(int i) {
                return new C0819e[i];
            }
        };

        /* renamed from: a */
        boolean f2881a;

        C0819e(Parcelable parcelable) {
            super(parcelable);
        }

        public C0819e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2881a = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2881a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2881a + "}";
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0819e eVar = new C0819e(super.onSaveInstanceState());
        eVar.f2881a = mo3607c();
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0819e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0819e eVar = (C0819e) parcelable;
        super.onRestoreInstanceState(eVar.mo2188a());
        m3857a(eVar.f2881a);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3623k() {
        int i;
        if (this.f2850n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f2848l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0984bv.m5212a(this);
            int dimensionPixelSize = this.f2817E ? resources.getDimensionPixelSize(C0639a.C0643d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0639a.C0643d.abc_dropdownitem_text_padding_left) : 0;
            this.f2836a.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f2836a.setDropDownHorizontalOffset(i);
            this.f2836a.setDropDownWidth((((this.f2850n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3604a(int i, int i2, String str) {
        C0818d dVar = this.f2815C;
        if (dVar != null && dVar.mo3680b(i)) {
            return false;
        }
        m3861b(i, 0, (String) null);
        this.f2836a.setImeVisibility(false);
        m3872t();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3603a(int i) {
        C0818d dVar = this.f2815C;
        if (dVar != null && dVar.mo3679a(i)) {
            return false;
        }
        m3864e(i);
        return true;
    }

    /* renamed from: e */
    private void m3864e(int i) {
        Editable text = this.f2836a.getText();
        Cursor a = this.f2844g.mo2417a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f2844g.mo2426c(a);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: b */
    private boolean m3861b(int i, int i2, String str) {
        Cursor a = this.f2844g.mo2417a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m3855a(m3853a(a, i2, str));
        return true;
    }

    /* renamed from: a */
    private void m3855a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f2836a.setText(charSequence);
        this.f2836a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3600a(int i, String str, String str2) {
        getContext().startActivity(m3854a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m3854a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2826N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2829Q;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2845h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m3852a(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: b */
    private Intent m3859b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2829Q;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        String str = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str2 = null;
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str2 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str2);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m3853a(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String a;
        try {
            String a2 = C0961bh.m5061a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f2845h.getSuggestIntentAction();
            }
            String str2 = a2 == null ? "android.intent.action.SEARCH" : a2;
            String a3 = C0961bh.m5061a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f2845h.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C0961bh.m5061a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            if (a3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(a3);
            }
            return m3854a(str2, uri, C0961bh.m5061a(cursor, "suggest_intent_extra_data"), C0961bh.m5061a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3624l() {
        f2812i.mo3673a(this.f2836a);
        f2812i.mo3675b(this.f2836a);
    }

    /* renamed from: a */
    static boolean m3858a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C0821f extends TouchDelegate {

        /* renamed from: a */
        private final View f2882a;

        /* renamed from: b */
        private final Rect f2883b = new Rect();

        /* renamed from: c */
        private final Rect f2884c = new Rect();

        /* renamed from: d */
        private final Rect f2885d = new Rect();

        /* renamed from: e */
        private final int f2886e;

        /* renamed from: f */
        private boolean f2887f;

        public C0821f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2886e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo3688a(rect, rect2);
            this.f2882a = view;
        }

        /* renamed from: a */
        public void mo3688a(Rect rect, Rect rect2) {
            this.f2883b.set(rect);
            this.f2885d.set(rect);
            Rect rect3 = this.f2885d;
            int i = this.f2886e;
            rect3.inset(-i, -i);
            this.f2884c.set(rect2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f2887f
                r6.f2887f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f2887f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f2885d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f2883b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f2887f = r3
                r2 = 1
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                if (r2 == 0) goto L_0x006b
                if (r3 == 0) goto L_0x0056
                android.graphics.Rect r2 = r6.f2884c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0056
                android.view.View r0 = r6.f2882a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f2882a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0065
            L_0x0056:
                android.graphics.Rect r2 = r6.f2884c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f2884c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0065:
                android.view.View r0 = r6.f2882a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x006b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.SearchView.C0821f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C1003f {

        /* renamed from: a */
        final Runnable f2873a;

        /* renamed from: b */
        private int f2874b;

        /* renamed from: c */
        private SearchView f2875c;

        /* renamed from: d */
        private boolean f2876d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0639a.C0640a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2873a = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.mo3660b();
                }
            };
            this.f2874b = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f2875c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2874b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3659a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2875c.hasFocus() && getVisibility() == 0) {
                this.f2876d = true;
                if (SearchView.m3858a(getContext())) {
                    SearchView.f2812i.mo3674a(this, true);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2875c.mo3622i();
        }

        public boolean enoughToFilter() {
            return this.f2874b <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2875c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2876d) {
                removeCallbacks(this.f2873a);
                post(this.f2873a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3660b() {
            if (this.f2876d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2876d = false;
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2876d = false;
                removeCallbacks(this.f2873a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2876d = false;
                removeCallbacks(this.f2873a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2876d = true;
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0815a {

        /* renamed from: a */
        private Method f2878a;

        /* renamed from: b */
        private Method f2879b;

        /* renamed from: c */
        private Method f2880c;

        C0815a() {
            try {
                this.f2878a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2878a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f2879b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2879b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f2880c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f2880c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3673a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2878a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3675b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2879b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3674a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f2880c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }
}
