package android.support.design.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.design.C0241a;
import android.support.design.p016a.C0258h;
import android.support.design.p020d.C0284a;
import android.support.design.p020d.C0286c;
import android.support.design.p025i.C0298a;
import android.support.design.widget.C0363c;
import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0633o;
import android.support.p039v7.widget.C1009l;
import android.support.p039v7.widget.C1018p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

@CoordinatorLayout.C0347c(mo1237a = Behavior.class)
public class FloatingActionButton extends C0390o implements C0284a, C0593q, C0633o {

    /* renamed from: a */
    boolean f1124a;

    /* renamed from: b */
    final Rect f1125b;

    /* renamed from: c */
    private ColorStateList f1126c;

    /* renamed from: d */
    private PorterDuff.Mode f1127d;

    /* renamed from: e */
    private ColorStateList f1128e;

    /* renamed from: f */
    private PorterDuff.Mode f1129f;

    /* renamed from: g */
    private ColorStateList f1130g;

    /* renamed from: h */
    private int f1131h;

    /* renamed from: i */
    private int f1132i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f1133j;

    /* renamed from: k */
    private int f1134k;

    /* renamed from: l */
    private final Rect f1135l;

    /* renamed from: m */
    private final C1018p f1136m;

    /* renamed from: n */
    private final C0286c f1137n;

    /* renamed from: o */
    private C0363c f1138o;

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0355a {
        /* renamed from: a */
        public void mo1330a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo1331b(FloatingActionButton floatingActionButton) {
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f1133j = (sizeDimension - this.f1134k) / 2;
        getImpl().mo1390j();
        int min = Math.min(m1405a(sizeDimension, i), m1405a(sizeDimension, i2));
        setMeasuredDimension(this.f1125b.left + min + this.f1125b.right, min + this.f1125b.top + this.f1125b.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1130g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1130g;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1130g != colorStateList) {
            this.f1130g = colorStateList;
            getImpl().mo1375b(this.f1130g);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1126c;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1126c != colorStateList) {
            this.f1126c = colorStateList;
            getImpl().mo1366a(colorStateList);
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1127d;
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1127d != mode) {
            this.f1127d = mode;
            getImpl().mo1367a(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1128e != colorStateList) {
            this.f1128e = colorStateList;
            m1409c();
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1128e;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1129f != mode) {
            this.f1129f = mode;
            m1409c();
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1129f;
    }

    /* renamed from: c */
    private void m1409c() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f1128e;
            if (colorStateList == null) {
                C0540a.m2389f(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f1129f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1009l.m5325a(colorForState, mode));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int i) {
        this.f1136m.mo4962a(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().mo1382d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1267a(C0355a aVar, boolean z) {
        getImpl().mo1378b(m1407a(aVar), z);
    }

    /* renamed from: a */
    public void mo1266a(Animator.AnimatorListener animatorListener) {
        getImpl().mo1365a(animatorListener);
    }

    /* renamed from: b */
    public void mo1269b(Animator.AnimatorListener animatorListener) {
        getImpl().mo1374b(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1271b(C0355a aVar, boolean z) {
        getImpl().mo1370a(m1407a(aVar), z);
    }

    /* renamed from: c */
    public void mo1273c(Animator.AnimatorListener animatorListener) {
        getImpl().mo1381c(animatorListener);
    }

    /* renamed from: d */
    public void mo1274d(Animator.AnimatorListener animatorListener) {
        getImpl().mo1384d(animatorListener);
    }

    /* renamed from: a */
    public boolean mo927a() {
        return this.f1137n.mo930a();
    }

    public void setExpandedComponentIdHint(int i) {
        this.f1137n.mo928a(i);
    }

    public int getExpandedComponentIdHint() {
        return this.f1137n.mo932c();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1124a != z) {
            this.f1124a = z;
            getImpl().mo1389i();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f1124a;
    }

    public void setSize(int i) {
        this.f1132i = 0;
        if (i != this.f1131h) {
            this.f1131h = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f1131h;
    }

    /* renamed from: a */
    private C0363c.C0370d m1407a(final C0355a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C0363c.C0370d() {
            /* renamed from: a */
            public void mo1325a() {
                aVar.mo1330a(FloatingActionButton.this);
            }

            /* renamed from: b */
            public void mo1326b() {
                aVar.mo1331b(FloatingActionButton.this);
            }
        };
    }

    /* renamed from: b */
    public boolean mo1272b() {
        return getImpl().mo1395o();
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f1132i = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public int getCustomSize() {
        return this.f1132i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m1404a(this.f1131h);
    }

    /* renamed from: a */
    private int m1404a(int i) {
        int i2 = this.f1132i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C0241a.C0244c.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C0241a.C0244c.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m1404a(1);
        } else {
            return m1404a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo1391k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo1392l();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo1371a(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo1387g();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0298a aVar = new C0298a(super.onSaveInstanceState());
        aVar.f930a.put("expandableWidgetHelper", this.f1137n.mo931b());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0298a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0298a aVar = (C0298a) parcelable;
        super.onRestoreInstanceState(aVar.mo2188a());
        this.f1137n.mo929a(aVar.f930a.get("expandableWidgetHelper"));
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo1268a(Rect rect) {
        if (!C0594r.m2622w(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m1410c(rect);
        return true;
    }

    /* renamed from: b */
    public void mo1270b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m1410c(rect);
    }

    /* renamed from: c */
    private void m1410c(Rect rect) {
        rect.left += this.f1125b.left;
        rect.top += this.f1125b.top;
        rect.right -= this.f1125b.right;
        rect.bottom -= this.f1125b.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().mo1388h();
    }

    /* renamed from: a */
    private static int m1405a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo1268a(this.f1135l) || this.f1135l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo1004a(CoordinatorLayout.C0349e eVar) {
            super.mo1004a(eVar);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1327a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo836a(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1328a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo1227a(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1329a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo999b(coordinatorLayout, floatingActionButton, view);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0346b<T> {

        /* renamed from: a */
        private Rect f1141a;

        /* renamed from: b */
        private C0355a f1142b;

        /* renamed from: c */
        private boolean f1143c;

        public BaseBehavior() {
            this.f1143c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.FloatingActionButton_Behavior_Layout);
            this.f1143c = obtainStyledAttributes.getBoolean(C0241a.C0250i.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo1004a(CoordinatorLayout.C0349e eVar) {
            if (eVar.f1111h == 0) {
                eVar.f1111h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo999b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m1425a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m1426a(view)) {
                return false;
            } else {
                m1428b(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: a */
        private static boolean m1426a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0349e) {
                return ((CoordinatorLayout.C0349e) layoutParams).mo1248b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m1427a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0349e eVar = (CoordinatorLayout.C0349e) floatingActionButton.getLayoutParams();
            if (this.f1143c && eVar.mo1240a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m1425a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m1427a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1141a == null) {
                this.f1141a = new Rect();
            }
            Rect rect = this.f1141a;
            C0362b.m1484b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo1271b(this.f1142b, false);
                return true;
            }
            floatingActionButton.mo1267a(this.f1142b, false);
            return true;
        }

        /* renamed from: b */
        private boolean m1428b(View view, FloatingActionButton floatingActionButton) {
            if (!m1427a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0349e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo1271b(this.f1142b, false);
                return true;
            }
            floatingActionButton.mo1267a(this.f1142b, false);
            return true;
        }

        /* renamed from: a */
        public boolean mo836a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> c = coordinatorLayout.mo1182c((View) floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m1426a(view) && m1428b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m1425a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo1168a((View) floatingActionButton, i);
            m1424a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo1227a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f1125b;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private void m1424a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f1125b;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0349e eVar = (CoordinatorLayout.C0349e) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C0594r.m2601e(floatingActionButton, i2);
                }
                if (i != 0) {
                    C0594r.m2603f(floatingActionButton, i);
                }
            }
        }
    }

    public float getCompatElevation() {
        return getImpl().mo1362a();
    }

    public void setCompatElevation(float f) {
        getImpl().mo1363a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo1372b();
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo1373b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo1379c();
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo1380c(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public C0258h getShowMotionSpec() {
        return getImpl().mo1385e();
    }

    public void setShowMotionSpec(C0258h hVar) {
        getImpl().mo1369a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0258h.m891a(getContext(), i));
    }

    public C0258h getHideMotionSpec() {
        return getImpl().mo1386f();
    }

    public void setHideMotionSpec(C0258h hVar) {
        getImpl().mo1377b(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0258h.m891a(getContext(), i));
    }

    private C0363c getImpl() {
        if (this.f1138o == null) {
            this.f1138o = m1411d();
        }
        return this.f1138o;
    }

    /* renamed from: d */
    private C0363c m1411d() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0373d(this, new C0356b());
        }
        return new C0363c(this, new C0356b());
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C0356b implements C0379i {
        C0356b() {
        }

        /* renamed from: a */
        public float mo1332a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo1333a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f1125b.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f1133j, i2 + FloatingActionButton.this.f1133j, i3 + FloatingActionButton.this.f1133j, i4 + FloatingActionButton.this.f1133j);
        }

        /* renamed from: a */
        public void mo1334a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo1335b() {
            return FloatingActionButton.this.f1124a;
        }
    }
}
