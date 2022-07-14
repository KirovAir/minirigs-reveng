package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0241a;
import android.support.design.p016a.C0251a;
import android.support.design.p016a.C0252b;
import android.support.design.p016a.C0253c;
import android.support.design.p016a.C0254d;
import android.support.design.p016a.C0255e;
import android.support.design.p016a.C0258h;
import android.support.design.p016a.C0259i;
import android.support.design.p016a.C0260j;
import android.support.design.p018c.C0272a;
import android.support.design.p018c.C0276c;
import android.support.design.p018c.C0278d;
import android.support.design.widget.C0377g;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.p026v4.p036h.C0594r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a */
    private final Rect f959a = new Rect();

    /* renamed from: b */
    private final RectF f960b = new RectF();

    /* renamed from: c */
    private final RectF f961c = new RectF();

    /* renamed from: d */
    private final int[] f962d = new int[2];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0310a mo1003a(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo997a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo1004a(CoordinatorLayout.C0349e eVar) {
        if (eVar.f1111h == 0) {
            eVar.f1111h = 80;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo1001b(View view, View view2, boolean z, boolean z2) {
        final boolean z3 = z;
        C0310a a = mo1003a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m1112a(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f960b;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        C0310a aVar = a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m1113a(view3, view4, z4, z5, aVar, (List<Animator>) arrayList3, (List<Animator.AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m1116b(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        m1111a(view3, view4, z4, z5, aVar, width, height, (List<Animator>) arrayList, (List<Animator.AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m1119c(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        m1121d(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C0252b.m881a(animatorSet, arrayList);
        final View view5 = view;
        final View view6 = view2;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                if (z3) {
                    view6.setVisibility(0);
                    view5.setAlpha(0.0f);
                    view5.setVisibility(4);
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (!z3) {
                    view6.setVisibility(4);
                    view5.setAlpha(1.0f);
                    view5.setVisibility(0);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m1112a(View view, View view2, boolean z, boolean z2, C0310a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float l = C0594r.m2611l(view2) - C0594r.m2611l(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-l);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-l});
        }
        aVar.f974a.mo760b("elevation").mo765a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    private void m1113a(View view, View view2, boolean z, boolean z2, C0310a aVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        C0259i iVar;
        C0259i iVar2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int i;
        View view3 = view;
        View view4 = view2;
        C0310a aVar2 = aVar;
        List<Animator> list3 = list;
        float a = m1105a(view3, view4, aVar2.f975b);
        float b = m1114b(view3, view4, aVar2.f975b);
        if (a == 0.0f || b == 0.0f) {
            iVar2 = aVar2.f974a.mo760b("translationXLinear");
            iVar = aVar2.f974a.mo760b("translationYLinear");
        } else if ((!z || b >= 0.0f) && (z || i <= 0)) {
            iVar2 = aVar2.f974a.mo760b("translationXCurveDownwards");
            iVar = aVar2.f974a.mo760b("translationYCurveDownwards");
        } else {
            iVar2 = aVar2.f974a.mo760b("translationXCurveUpwards");
            iVar = aVar2.f974a.mo760b("translationYCurveUpwards");
        }
        if (z) {
            if (!z2) {
                view4.setTranslationX(-a);
                view4.setTranslationY(-b);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m1110a(view2, aVar, iVar2, iVar, -a, -b, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-a});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-b});
        }
        iVar2.mo765a((Animator) objectAnimator2);
        iVar.mo765a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: b */
    private void m1116b(View view, final View view2, boolean z, boolean z2, C0310a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C0278d) && (view instanceof ImageView)) {
            final C0278d dVar = (C0278d) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0255e.f770a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C0255e.f770a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                aVar.f974a.mo760b("iconFade").mo765a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable(drawable);
                    }

                    public void onAnimationEnd(Animator animator) {
                        dVar.setCircularRevealOverlayDrawable((Drawable) null);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m1111a(View view, View view2, boolean z, boolean z2, C0310a aVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C0310a aVar2 = aVar;
        if (view4 instanceof C0278d) {
            final C0278d dVar = (C0278d) view4;
            float c = m1117c(view3, view4, aVar2.f975b);
            float d = m1120d(view3, view4, aVar2.f975b);
            ((FloatingActionButton) view3).mo1268a(this.f959a);
            float width = ((float) this.f959a.width()) / 2.0f;
            C0259i b = aVar2.f974a.mo760b("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C0278d.C0283d(c, d, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f865c;
                }
                animator = C0272a.m990a(dVar, c, d, C0377g.m1569a(c, d, 0.0f, 0.0f, f, f2));
                animator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        C0278d.C0283d revealInfo = dVar.getRevealInfo();
                        revealInfo.f865c = Float.MAX_VALUE;
                        dVar.setRevealInfo(revealInfo);
                    }
                });
                m1107a(view2, b.mo764a(), (int) c, (int) d, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f865c;
                Animator a = C0272a.m990a(dVar, c, d, width);
                int i = (int) c;
                int i2 = (int) d;
                View view5 = view2;
                m1107a(view5, b.mo764a(), i, i2, f3, list);
                long a2 = b.mo764a();
                long b2 = b.mo766b();
                long a3 = aVar2.f974a.mo757a();
                m1108a(view5, a2, b2, a3, i, i2, width, list);
                animator = a;
            }
            b.mo765a(animator);
            list.add(animator);
            list2.add(C0272a.m989a(dVar));
        }
    }

    /* renamed from: c */
    private void m1119c(View view, View view2, boolean z, boolean z2, C0310a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C0278d) {
            C0278d dVar = (C0278d) view2;
            int c = m1118c(view);
            int i = 16777215 & c;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(c);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C0278d.C0282c.f862a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C0278d.C0282c.f862a, new int[]{c});
            }
            objectAnimator.setEvaluator(C0253c.m882a());
            aVar.f974a.mo760b("color").mo765a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: d */
    private void m1121d(View view, View view2, boolean z, boolean z2, C0310a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C0278d) || C0276c.f849a != 0) && (a = m1106a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C0254d.f769a.set(a, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a, C0254d.f769a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a, C0254d.f769a, new float[]{0.0f});
                }
                aVar.f974a.mo760b("contentFade").mo765a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: a */
    private float m1105a(View view, View view2, C0260j jVar) {
        float f;
        RectF rectF = this.f960b;
        RectF rectF2 = this.f961c;
        m1109a(view, rectF);
        m1109a(view2, rectF2);
        int i = jVar.f782a & 7;
        if (i == 1) {
            f = rectF2.centerX() - rectF.centerX();
        } else if (i != 3) {
            f = i != 5 ? 0.0f : rectF2.right - rectF.right;
        } else {
            f = rectF2.left - rectF.left;
        }
        return f + jVar.f783b;
    }

    /* renamed from: b */
    private float m1114b(View view, View view2, C0260j jVar) {
        float f;
        RectF rectF = this.f960b;
        RectF rectF2 = this.f961c;
        m1109a(view, rectF);
        m1109a(view2, rectF2);
        int i = jVar.f782a & 112;
        if (i == 16) {
            f = rectF2.centerY() - rectF.centerY();
        } else if (i != 48) {
            f = i != 80 ? 0.0f : rectF2.bottom - rectF.bottom;
        } else {
            f = rectF2.top - rectF.top;
        }
        return f + jVar.f784c;
    }

    /* renamed from: a */
    private void m1109a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f962d;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: c */
    private float m1117c(View view, View view2, C0260j jVar) {
        RectF rectF = this.f960b;
        RectF rectF2 = this.f961c;
        m1109a(view, rectF);
        m1109a(view2, rectF2);
        rectF2.offset(-m1105a(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: d */
    private float m1120d(View view, View view2, C0260j jVar) {
        RectF rectF = this.f960b;
        RectF rectF2 = this.f961c;
        m1109a(view, rectF);
        m1109a(view2, rectF2);
        rectF2.offset(0.0f, -m1114b(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: a */
    private void m1110a(View view, C0310a aVar, C0259i iVar, C0259i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m1104a(aVar, iVar, f, f3);
        float a2 = m1104a(aVar, iVar2, f2, f4);
        Rect rect = this.f959a;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f960b;
        rectF2.set(rect);
        RectF rectF3 = this.f961c;
        m1109a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m1104a(C0310a aVar, C0259i iVar, float f, float f2) {
        long a = iVar.mo764a();
        long b = iVar.mo766b();
        C0259i b2 = aVar.f974a.mo760b("expansion");
        return C0251a.m880a(f, f2, iVar.mo767c().getInterpolation(((float) (((b2.mo764a() + b2.mo766b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private ViewGroup m1106a(View view) {
        View findViewById = view.findViewById(C0241a.C0246e.mtrl_child_content_container);
        if (findViewById != null) {
            return m1115b(findViewById);
        }
        if ((view instanceof C0313b) || (view instanceof C0312a)) {
            return m1115b(((ViewGroup) view).getChildAt(0));
        }
        return m1115b(view);
    }

    /* renamed from: b */
    private ViewGroup m1115b(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: c */
    private int m1118c(View view) {
        ColorStateList s = C0594r.m2618s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m1107a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m1108a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: android.support.design.transformation.FabTransformationBehavior$a */
    protected static class C0310a {

        /* renamed from: a */
        public C0258h f974a;

        /* renamed from: b */
        public C0260j f975b;

        protected C0310a() {
        }
    }
}
