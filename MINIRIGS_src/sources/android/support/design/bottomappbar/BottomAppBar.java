package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.p016a.C0251a;
import android.support.design.p023g.C0291c;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0556a;
import android.support.p026v4.p036h.C0594r;
import android.support.p039v7.widget.ActionMenuView;
import android.support.p039v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0345a {

    /* renamed from: a */
    AnimatorListenerAdapter f820a;

    /* renamed from: f */
    private final int f821f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0291c f822g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0271a f823h;

    /* renamed from: i */
    private Animator f824i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Animator f825j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Animator f826k;

    /* renamed from: l */
    private int f827l;

    /* renamed from: m */
    private boolean f828m;

    /* renamed from: n */
    private boolean f829n;

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public int getFabAlignmentMode() {
        return this.f827l;
    }

    public void setFabAlignmentMode(int i) {
        m944a(i);
        m946a(i, this.f829n);
        this.f827l = i;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0540a.m2379a((Drawable) this.f822g, colorStateList);
    }

    public ColorStateList getBackgroundTint() {
        return this.f822g.mo934a();
    }

    public float getFabCradleMargin() {
        return this.f823h.mo883d();
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f823h.mo884d(f);
            this.f822g.invalidateSelf();
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.f823h.mo885e();
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f823h.mo886e(f);
            this.f822g.invalidateSelf();
        }
    }

    public float getCradleVerticalOffset() {
        return this.f823h.mo879b();
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f823h.mo880b(f);
            this.f822g.invalidateSelf();
        }
    }

    public boolean getHideOnScroll() {
        return this.f828m;
    }

    public void setHideOnScroll(boolean z) {
        this.f828m = z;
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(int i) {
        float f = (float) i;
        if (f != this.f823h.mo881c()) {
            this.f823h.mo882c(f);
            this.f822g.invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m944a(int i) {
        if (this.f827l != i && C0594r.m2622w(this)) {
            Animator animator = this.f825j;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m945a(i, (List<Animator>) arrayList);
            m955b(i, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f825j = animatorSet;
            this.f825j.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    Animator unused = BottomAppBar.this.f825j = null;
                }
            });
            this.f825j.start();
        }
    }

    /* renamed from: a */
    private void m945a(int i, List<Animator> list) {
        if (this.f829n) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f823h.mo876a(), (float) m952b(i)});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomAppBar.this.f823h.mo877a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    BottomAppBar.this.f822g.invalidateSelf();
                }
            });
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public FloatingActionButton m961m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View next : ((CoordinatorLayout) getParent()).mo1188d((View) this)) {
            if (next instanceof FloatingActionButton) {
                return (FloatingActionButton) next;
            }
        }
        return null;
    }

    /* renamed from: n */
    private boolean m962n() {
        FloatingActionButton m = m961m();
        return m != null && m.mo1272b();
    }

    /* renamed from: b */
    private void m955b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m961m(), "translationX", new float[]{(float) m952b(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: a */
    private void m946a(int i, boolean z) {
        if (C0594r.m2622w(this)) {
            Animator animator = this.f826k;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m962n()) {
                i = 0;
                z = false;
            }
            m947a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f826k = animatorSet;
            this.f826k.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    Animator unused = BottomAppBar.this.f826k = null;
                }
            });
            this.f826k.start();
        }
    }

    /* renamed from: a */
    private void m947a(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if ((this.f829n || (z && m962n())) && (this.f827l == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a */
                    public boolean f833a;

                    public void onAnimationCancel(Animator animator) {
                        this.f833a = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        if (!this.f833a) {
                            BottomAppBar.this.m951a(actionMenuView, i, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: a */
    private float m941a(boolean z) {
        FloatingActionButton m = m961m();
        if (m == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m.mo1268a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) m.getMeasuredHeight();
        }
        float height2 = (float) (m.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (m.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) m.getPaddingBottom());
        float f = (float) (-getMeasuredHeight());
        if (z) {
            paddingBottom = height3;
        }
        return f + paddingBottom;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return m941a(this.f829n);
    }

    /* renamed from: b */
    private int m952b(int i) {
        int i2 = 1;
        boolean z = C0594r.m2602f(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f821f;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    private float getFabTranslationX() {
        return (float) m952b(this.f827l);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m951a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0594r.m2602f(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0835b) && (((Toolbar.C0835b) childAt.getLayoutParams()).f2099a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* renamed from: o */
    private void m963o() {
        Animator animator = this.f824i;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f826k;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f825j;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f826k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.f825j;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m964p() {
        /*
            r1 = this;
            android.animation.Animator r0 = r1.f824i
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x000a:
            android.animation.Animator r0 = r1.f826k
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x0014:
            android.animation.Animator r0 = r1.f825j
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.bottomappbar.BottomAppBar.m964p():boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m963o();
        m965q();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m965q() {
        this.f823h.mo877a(getFabTranslationX());
        FloatingActionButton m = m961m();
        this.f822g.mo935a((!this.f829n || !m962n()) ? 0.0f : 1.0f);
        if (m != null) {
            m.setTranslationY(getFabTranslationY());
            m.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m962n()) {
                m951a(actionMenuView, 0, false);
            } else {
                m951a(actionMenuView, this.f827l, this.f829n);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m950a(FloatingActionButton floatingActionButton) {
        m956b(floatingActionButton);
        floatingActionButton.mo1273c((Animator.AnimatorListener) this.f820a);
        floatingActionButton.mo1266a((Animator.AnimatorListener) this.f820a);
    }

    /* renamed from: b */
    private void m956b(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo1274d(this.f820a);
        floatingActionButton.mo1269b((Animator.AnimatorListener) this.f820a);
    }

    public CoordinatorLayout.C0346b<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: a */
        private final Rect f838a = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private boolean m966a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.C0349e) floatingActionButton.getLayoutParams()).f1107d = 17;
            bottomAppBar.m950a(floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo836a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton c = bottomAppBar.m961m();
            if (c != null) {
                m966a(c, bottomAppBar);
                c.mo1270b(this.f838a);
                bottomAppBar.setFabDiameter(this.f838a.height());
            }
            if (!bottomAppBar.m964p()) {
                bottomAppBar.m965q();
            }
            coordinatorLayout.mo1168a((View) bottomAppBar, i);
            return super.mo836a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean mo867a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo867a(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo835a(BottomAppBar bottomAppBar) {
            super.mo835a(bottomAppBar);
            FloatingActionButton c = bottomAppBar.m961m();
            if (c != null) {
                c.clearAnimation();
                c.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C0251a.f766d).setDuration(225);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo838b(BottomAppBar bottomAppBar) {
            super.mo838b(bottomAppBar);
            FloatingActionButton c = bottomAppBar.m961m();
            if (c != null) {
                c.mo1268a(this.f838a);
                c.clearAnimation();
                c.animate().translationY(((float) (-c.getPaddingBottom())) + ((float) (c.getMeasuredHeight() - this.f838a.height()))).setInterpolator(C0251a.f765c).setDuration(175);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0269a aVar = new C0269a(super.onSaveInstanceState());
        aVar.f839a = this.f827l;
        aVar.f840b = this.f829n;
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0269a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0269a aVar = (C0269a) parcelable;
        super.onRestoreInstanceState(aVar.mo2188a());
        this.f827l = aVar.f839a;
        this.f829n = aVar.f840b;
    }

    /* renamed from: android.support.design.bottomappbar.BottomAppBar$a */
    static class C0269a extends C0556a {
        public static final Parcelable.Creator<C0269a> CREATOR = new Parcelable.ClassLoaderCreator<C0269a>() {
            /* renamed from: a */
            public C0269a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0269a(parcel, classLoader);
            }

            /* renamed from: a */
            public C0269a createFromParcel(Parcel parcel) {
                return new C0269a(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0269a[] newArray(int i) {
                return new C0269a[i];
            }
        };

        /* renamed from: a */
        int f839a;

        /* renamed from: b */
        boolean f840b;

        public C0269a(Parcelable parcelable) {
            super(parcelable);
        }

        public C0269a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f839a = parcel.readInt();
            this.f840b = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f839a);
            parcel.writeInt(this.f840b ? 1 : 0);
        }
    }
}
