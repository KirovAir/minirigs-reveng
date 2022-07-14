package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0601v;
import android.support.p026v4.widget.C0626i;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p043c.p044a.C0719c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.am */
class C0868am extends ListView {

    /* renamed from: a */
    C0870b f3091a;

    /* renamed from: b */
    private final Rect f3092b = new Rect();

    /* renamed from: c */
    private int f3093c = 0;

    /* renamed from: d */
    private int f3094d = 0;

    /* renamed from: e */
    private int f3095e = 0;

    /* renamed from: f */
    private int f3096f = 0;

    /* renamed from: g */
    private int f3097g;

    /* renamed from: h */
    private Field f3098h;

    /* renamed from: i */
    private C0869a f3099i;

    /* renamed from: j */
    private boolean f3100j;

    /* renamed from: k */
    private boolean f3101k;

    /* renamed from: l */
    private boolean f3102l;

    /* renamed from: m */
    private C0601v f3103m;

    /* renamed from: n */
    private C0626i f3104n;

    C0868am(Context context, boolean z) {
        super(context, (AttributeSet) null, C0639a.C0640a.dropDownListViewStyle);
        this.f3101k = z;
        setCacheColorHint(0);
        try {
            this.f3098h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3098h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f3101k && this.f3100j) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f3101k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3101k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f3101k || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        this.f3099i = drawable != null ? new C0869a(drawable) : null;
        super.setSelector(this.f3099i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3093c = rect.left;
        this.f3094d = rect.top;
        this.f3095e = rect.right;
        this.f3096f = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f3091a == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m4298a();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m4301a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3097g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0870b bVar = this.f3091a;
        if (bVar != null) {
            bVar.mo4040a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public int mo4026a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                return (i5 < 0 || i9 <= i5 || i11 <= 0 || i8 == i4) ? i4 : i11;
            }
            if (i5 >= 0 && i9 >= i5) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    private void setSelectorEnabled(boolean z) {
        C0869a aVar = this.f3099i;
        if (aVar != null) {
            aVar.mo4039a(z);
        }
    }

    /* renamed from: android.support.v7.widget.am$a */
    private static class C0869a extends C0719c {

        /* renamed from: a */
        private boolean f3105a = true;

        C0869a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4039a(boolean z) {
            this.f3105a = z;
        }

        public boolean setState(int[] iArr) {
            if (this.f3105a) {
                return super.setState(iArr);
            }
            return false;
        }

        public void draw(Canvas canvas) {
            if (this.f3105a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3105a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3105a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3105a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3091a == null) {
            this.f3091a = new C0870b();
            this.f3091a.mo4041b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m4298a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3091a = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public boolean mo4027a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z2 = false;
                break;
            case 2:
                z2 = true;
                break;
            case 3:
                z = false;
                z2 = false;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z = true;
            } else {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m4303a(childAt, pointToPosition, (float) x, (float) y);
                if (actionMasked == 1) {
                    m4302a(childAt, pointToPosition);
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || z) {
            m4304b();
        }
        if (z2) {
            if (this.f3104n == null) {
                this.f3104n = new C0626i(this);
            }
            this.f3104n.mo2391a(true);
            this.f3104n.onTouch(this, motionEvent);
        } else {
            C0626i iVar = this.f3104n;
            if (iVar != null) {
                iVar.mo2391a(false);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private void m4302a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f3100j = z;
    }

    /* renamed from: a */
    private void m4298a() {
        Drawable selector = getSelector();
        if (selector != null && m4306c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m4301a(Canvas canvas) {
        Drawable selector;
        if (!this.f3092b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f3092b);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m4300a(int i, View view, float f, float f2) {
        m4299a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0540a.m2376a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m4299a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m4305b(i, view);
        if (z2) {
            Rect rect = this.f3092b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0540a.m2376a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private void m4305b(int i, View view) {
        Rect rect = this.f3092b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3093c;
        rect.top -= this.f3094d;
        rect.right += this.f3095e;
        rect.bottom += this.f3096f;
        try {
            boolean z = this.f3098h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3098h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m4304b() {
        this.f3102l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3097g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0601v vVar = this.f3103m;
        if (vVar != null) {
            vVar.mo2303b();
            this.f3103m = null;
        }
    }

    /* renamed from: a */
    private void m4303a(View view, int i, float f, float f2) {
        View childAt;
        this.f3102l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f3097g;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f3097g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m4300a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: c */
    private boolean m4306c() {
        return this.f3102l;
    }

    /* renamed from: android.support.v7.widget.am$b */
    private class C0870b implements Runnable {
        C0870b() {
        }

        public void run() {
            C0868am amVar = C0868am.this;
            amVar.f3091a = null;
            amVar.drawableStateChanged();
        }

        /* renamed from: a */
        public void mo4040a() {
            C0868am amVar = C0868am.this;
            amVar.f3091a = null;
            amVar.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo4041b() {
            C0868am.this.post(this);
        }
    }
}
