package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0241a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.p028a.C0402f;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p026v4.widget.C0630m;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.C0886as;
import android.support.p039v7.widget.C0972bp;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NavigationMenuItemView extends C0301a implements C0772p.C0773a {

    /* renamed from: d */
    private static final int[] f932d = {16842912};

    /* renamed from: c */
    boolean f933c;

    /* renamed from: e */
    private final int f934e;

    /* renamed from: f */
    private boolean f935f;

    /* renamed from: g */
    private final CheckedTextView f936g;

    /* renamed from: h */
    private FrameLayout f937h;

    /* renamed from: i */
    private C0758j f938i;

    /* renamed from: j */
    private ColorStateList f939j;

    /* renamed from: k */
    private boolean f940k;

    /* renamed from: l */
    private Drawable f941l;

    /* renamed from: m */
    private final C0570b f942m;

    /* renamed from: a */
    public boolean mo968a() {
        return false;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f942m = new C0570b() {
            /* renamed from: a */
            public void mo981a(View view, C0563c cVar) {
                super.mo981a(view, cVar);
                cVar.mo2204a(NavigationMenuItemView.this.f933c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0241a.C0248g.design_navigation_menu_item, this, true);
        this.f934e = context.getResources().getDimensionPixelSize(C0241a.C0244c.design_navigation_icon_size);
        this.f936g = (CheckedTextView) findViewById(C0241a.C0246e.design_menu_item_text);
        this.f936g.setDuplicateParentStateEnabled(true);
        C0594r.m2585a((View) this.f936g, this.f942m);
    }

    /* renamed from: a */
    public void mo967a(C0758j jVar, int i) {
        this.f938i = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0594r.m2584a((View) this, (Drawable) m1080d());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0972bp.m5158a(this, jVar.getTooltipText());
        m1079c();
    }

    /* renamed from: b */
    private boolean m1078b() {
        return this.f938i.getTitle() == null && this.f938i.getIcon() == null && this.f938i.getActionView() != null;
    }

    /* renamed from: c */
    private void m1079c() {
        if (m1078b()) {
            this.f936g.setVisibility(8);
            FrameLayout frameLayout = this.f937h;
            if (frameLayout != null) {
                C0886as.C0887a aVar = (C0886as.C0887a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f937h.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f936g.setVisibility(0);
        FrameLayout frameLayout2 = this.f937h;
        if (frameLayout2 != null) {
            C0886as.C0887a aVar2 = (C0886as.C0887a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f937h.setLayoutParams(aVar2);
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f937h == null) {
                this.f937h = (FrameLayout) ((ViewStub) findViewById(C0241a.C0246e.design_menu_item_action_area_stub)).inflate();
            }
            this.f937h.removeAllViews();
            this.f937h.addView(view);
        }
    }

    /* renamed from: d */
    private StateListDrawable m1080d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0639a.C0640a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f932d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public C0758j getItemData() {
        return this.f938i;
    }

    public void setTitle(CharSequence charSequence) {
        this.f936g.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f933c != z) {
            this.f933c = z;
            this.f942m.mo2242a((View) this.f936g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f936g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f940k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0540a.m2390g(drawable).mutate();
                C0540a.m2379a(drawable, this.f939j);
            }
            int i = this.f934e;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f935f) {
            if (this.f941l == null) {
                this.f941l = C0402f.m1669a(getResources(), C0241a.C0245d.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f941l;
                if (drawable2 != null) {
                    int i2 = this.f934e;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f941l;
        }
        C0630m.m2801a(this.f936g, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0758j jVar = this.f938i;
        if (jVar != null && jVar.isCheckable() && this.f938i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f932d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f939j = colorStateList;
        this.f940k = this.f939j != null;
        C0758j jVar = this.f938i;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C0630m.m2800a((TextView) this.f936g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f936g.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f935f = z;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f936g.setCompoundDrawablePadding(i);
    }
}
