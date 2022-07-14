package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.C0968bn;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0772p.C0773a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0758j f2430a;

    /* renamed from: b */
    private ImageView f2431b;

    /* renamed from: c */
    private RadioButton f2432c;

    /* renamed from: d */
    private TextView f2433d;

    /* renamed from: e */
    private CheckBox f2434e;

    /* renamed from: f */
    private TextView f2435f;

    /* renamed from: g */
    private ImageView f2436g;

    /* renamed from: h */
    private ImageView f2437h;

    /* renamed from: i */
    private LinearLayout f2438i;

    /* renamed from: j */
    private Drawable f2439j;

    /* renamed from: k */
    private int f2440k;

    /* renamed from: l */
    private Context f2441l;

    /* renamed from: m */
    private boolean f2442m;

    /* renamed from: n */
    private Drawable f2443n;

    /* renamed from: o */
    private boolean f2444o;

    /* renamed from: p */
    private int f2445p;

    /* renamed from: q */
    private LayoutInflater f2446q;

    /* renamed from: r */
    private boolean f2447r;

    /* renamed from: a */
    public boolean mo968a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0968bn a = C0968bn.m5093a(getContext(), attributeSet, C0639a.C0649j.MenuView, i, 0);
        this.f2439j = a.mo4780a(C0639a.C0649j.MenuView_android_itemBackground);
        this.f2440k = a.mo4793g(C0639a.C0649j.MenuView_android_itemTextAppearance, -1);
        this.f2442m = a.mo4782a(C0639a.C0649j.MenuView_preserveIconSpacing, false);
        this.f2441l = context;
        this.f2443n = a.mo4780a(C0639a.C0649j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0639a.C0640a.dropDownListViewStyle, 0);
        this.f2444o = obtainStyledAttributes.hasValue(0);
        a.mo4781a();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0594r.m2584a((View) this, this.f2439j);
        this.f2433d = (TextView) findViewById(C0639a.C0645f.title);
        int i = this.f2440k;
        if (i != -1) {
            this.f2433d.setTextAppearance(this.f2441l, i);
        }
        this.f2435f = (TextView) findViewById(C0639a.C0645f.shortcut);
        this.f2436g = (ImageView) findViewById(C0639a.C0645f.submenuarrow);
        ImageView imageView = this.f2436g;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2443n);
        }
        this.f2437h = (ImageView) findViewById(C0639a.C0645f.group_divider);
        this.f2438i = (LinearLayout) findViewById(C0639a.C0645f.content);
    }

    /* renamed from: a */
    public void mo967a(C0758j jVar, int i) {
        this.f2430a = jVar;
        this.f2445p = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo3120a((C0772p.C0773a) this));
        setCheckable(jVar.isCheckable());
        mo2928a(jVar.mo3133f(), jVar.mo3129d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    private void m3349a(View view) {
        m3350a(view, -1);
    }

    /* renamed from: a */
    private void m3350a(View view, int i) {
        LinearLayout linearLayout = this.f2438i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.f2447r = z;
        this.f2442m = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2433d.setText(charSequence);
            if (this.f2433d.getVisibility() != 0) {
                this.f2433d.setVisibility(0);
            }
        } else if (this.f2433d.getVisibility() != 8) {
            this.f2433d.setVisibility(8);
        }
    }

    public C0758j getItemData() {
        return this.f2430a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f2432c != null || this.f2434e != null) {
            if (this.f2430a.mo3134g()) {
                if (this.f2432c == null) {
                    m3352c();
                }
                compoundButton2 = this.f2432c;
                compoundButton = this.f2434e;
            } else {
                if (this.f2434e == null) {
                    m3353d();
                }
                compoundButton2 = this.f2434e;
                compoundButton = this.f2432c;
            }
            if (z) {
                compoundButton2.setChecked(this.f2430a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f2434e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f2432c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2430a.mo3134g()) {
            if (this.f2432c == null) {
                m3352c();
            }
            compoundButton = this.f2432c;
        } else {
            if (this.f2434e == null) {
                m3353d();
            }
            compoundButton = this.f2434e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2436g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo2928a(boolean z, char c) {
        int i = (!z || !this.f2430a.mo3133f()) ? 8 : 0;
        if (i == 0) {
            this.f2435f.setText(this.f2430a.mo3131e());
        }
        if (this.f2435f.getVisibility() != i) {
            this.f2435f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2430a.mo3149i() || this.f2447r;
        if (!z && !this.f2442m) {
            return;
        }
        if (this.f2431b != null || drawable != null || this.f2442m) {
            if (this.f2431b == null) {
                m3351b();
            }
            if (drawable != null || this.f2442m) {
                ImageView imageView = this.f2431b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2431b.getVisibility() != 0) {
                    this.f2431b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f2431b.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2431b != null && this.f2442m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2431b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m3351b() {
        this.f2431b = (ImageView) getInflater().inflate(C0639a.C0646g.abc_list_menu_item_icon, this, false);
        m3350a((View) this.f2431b, 0);
    }

    /* renamed from: c */
    private void m3352c() {
        this.f2432c = (RadioButton) getInflater().inflate(C0639a.C0646g.abc_list_menu_item_radio, this, false);
        m3349a(this.f2432c);
    }

    /* renamed from: d */
    private void m3353d() {
        this.f2434e = (CheckBox) getInflater().inflate(C0639a.C0646g.abc_list_menu_item_checkbox, this, false);
        m3349a(this.f2434e);
    }

    private LayoutInflater getInflater() {
        if (this.f2446q == null) {
            this.f2446q = LayoutInflater.from(getContext());
        }
        return this.f2446q;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2437h;
        if (imageView != null) {
            imageView.setVisibility((this.f2444o || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2437h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2437h.getLayoutParams();
            rect.top += this.f2437h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }
}
