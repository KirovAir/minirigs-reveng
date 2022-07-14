package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.ActionMenuView;
import android.support.p039v7.widget.AppCompatTextView;
import android.support.p039v7.widget.C0878ap;
import android.support.p039v7.widget.C0972bp;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements C0772p.C0773a, ActionMenuView.C0788a, View.OnClickListener {

    /* renamed from: b */
    C0758j f2415b;

    /* renamed from: c */
    C0754h.C0756b f2416c;

    /* renamed from: d */
    C0740b f2417d;

    /* renamed from: e */
    private CharSequence f2418e;

    /* renamed from: f */
    private Drawable f2419f;

    /* renamed from: g */
    private C0878ap f2420g;

    /* renamed from: h */
    private boolean f2421h;

    /* renamed from: i */
    private boolean f2422i;

    /* renamed from: j */
    private int f2423j;

    /* renamed from: k */
    private int f2424k;

    /* renamed from: l */
    private int f2425l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0740b {
        /* renamed from: a */
        public abstract C0776s mo2923a();
    }

    /* renamed from: a */
    public boolean mo968a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2421h = m3337e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ActionMenuItemView, i, 0);
        this.f2423j = obtainStyledAttributes.getDimensionPixelSize(C0639a.C0649j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2425l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2424k = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2421h = m3337e();
        m3338f();
    }

    /* renamed from: e */
    private boolean m3337e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2424k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public C0758j getItemData() {
        return this.f2415b;
    }

    /* renamed from: a */
    public void mo967a(C0758j jVar, int i) {
        this.f2415b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo3120a((C0772p.C0773a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f2420g == null) {
            this.f2420g = new C0739a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0878ap apVar;
        if (!this.f2415b.hasSubMenu() || (apVar = this.f2420g) == null || !apVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        C0754h.C0756b bVar = this.f2416c;
        if (bVar != null) {
            bVar.mo2924a(this.f2415b);
        }
    }

    public void setItemInvoker(C0754h.C0756b bVar) {
        this.f2416c = bVar;
    }

    public void setPopupCallback(C0740b bVar) {
        this.f2417d = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2422i != z) {
            this.f2422i = z;
            C0758j jVar = this.f2415b;
            if (jVar != null) {
                jVar.mo3147h();
            }
        }
    }

    /* renamed from: f */
    private void m3338f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2418e);
        if (this.f2419f != null && (!this.f2415b.mo3157m() || (!this.f2421h && !this.f2422i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f2418e : null);
        CharSequence contentDescription = this.f2415b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f2415b.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2415b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f2415b.getTitle();
            }
            C0972bp.m5158a(this, charSequence2);
            return;
        }
        C0972bp.m5158a(this, tooltipText);
    }

    public void setIcon(Drawable drawable) {
        this.f2419f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2425l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f2425l;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m3338f();
    }

    /* renamed from: b */
    public boolean mo2905b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f2418e = charSequence;
        m3338f();
    }

    /* renamed from: c */
    public boolean mo2906c() {
        return mo2905b() && this.f2415b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo2907d() {
        return mo2905b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean b = mo2905b();
        if (b && (i3 = this.f2424k) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f2423j) : this.f2423j;
        if (mode != 1073741824 && this.f2423j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b && this.f2419f != null) {
            super.setPadding((getMeasuredWidth() - this.f2419f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0739a extends C0878ap {
        public C0739a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0776s mo2921a() {
            if (ActionMenuItemView.this.f2417d != null) {
                return ActionMenuItemView.this.f2417d.mo2923a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo2922b() {
            C0776s a;
            if (ActionMenuItemView.this.f2416c == null || !ActionMenuItemView.this.f2416c.mo2924a(ActionMenuItemView.this.f2415b) || (a = mo2921a()) == null || !a.mo3008d()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }
}
