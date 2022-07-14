package android.support.design.widget;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0241a;
import android.support.design.internal.C0302b;
import android.support.design.p016a.C0251a;
import android.support.design.p024h.C0297a;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.C0380j;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.p026v4.p036h.C0570b;
import android.support.p026v4.p036h.C0592p;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0608z;
import android.support.p026v4.p036h.p037a.C0560b;
import android.support.p026v4.p036h.p037a.C0563c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f1010a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((BaseTransientBottomBar) message.obj).mo1098h();
                    return true;
                case 1:
                    ((BaseTransientBottomBar) message.obj).mo1092c(message.arg1);
                    return true;
                default:
                    return false;
            }
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f1011d = (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19);

    /* renamed from: e */
    private static final int[] f1012e = {C0241a.C0243b.snackbarStyle};

    /* renamed from: b */
    protected final C0336e f1013b;

    /* renamed from: c */
    final C0380j.C0382a f1014c = new C0380j.C0382a() {
        /* renamed from: a */
        public void mo1111a() {
            BaseTransientBottomBar.f1010a.sendMessage(BaseTransientBottomBar.f1010a.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: a */
        public void mo1112a(int i) {
            BaseTransientBottomBar.f1010a.sendMessage(BaseTransientBottomBar.f1010a.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: f */
    private final ViewGroup f1015f;

    /* renamed from: g */
    private final Context f1016g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0297a f1017h;

    /* renamed from: i */
    private int f1018i;

    /* renamed from: j */
    private List<C0332a<B>> f1019j;

    /* renamed from: k */
    private Behavior f1020k;

    /* renamed from: l */
    private final AccessibilityManager f1021l;

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$a */
    public static abstract class C0332a<B> {
        /* renamed from: a */
        public void mo1121a(B b) {
        }

        /* renamed from: a */
        public void mo1122a(B b, int i) {
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$c */
    protected interface C0334c {
        /* renamed from: a */
        void mo1115a(View view);

        /* renamed from: b */
        void mo1116b(View view);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$d */
    protected interface C0335d {
        /* renamed from: a */
        void mo1118a(View view, int i, int i2, int i3, int i4);
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C0297a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f1015f = viewGroup;
            this.f1017h = aVar;
            this.f1016g = viewGroup.getContext();
            C0302b.m1086a(this.f1016g);
            this.f1013b = (C0336e) LayoutInflater.from(this.f1016g).inflate(mo1087a(), this.f1015f, false);
            this.f1013b.addView(view);
            C0594r.m2596c(this.f1013b, 1);
            C0594r.m2592b((View) this.f1013b, 1);
            C0594r.m2593b((View) this.f1013b, true);
            C0594r.m2586a((View) this.f1013b, (C0592p) new C0592p() {
                /* renamed from: a */
                public C0608z mo1109a(View view, C0608z zVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), zVar.mo2317d());
                    return zVar;
                }
            });
            C0594r.m2585a((View) this.f1013b, (C0570b) new C0570b() {
                /* renamed from: a */
                public void mo981a(View view, C0563c cVar) {
                    super.mo981a(view, cVar);
                    cVar.mo2200a(1048576);
                    cVar.mo2211d(true);
                }

                /* renamed from: a */
                public boolean mo1110a(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.mo1110a(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.mo1095e();
                    return true;
                }
            });
            this.f1021l = (AccessibilityManager) this.f1016g.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1087a() {
        return mo1090b() ? C0241a.C0248g.mtrl_layout_snackbar : C0241a.C0248g.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1090b() {
        TypedArray obtainStyledAttributes = this.f1016g.obtainStyledAttributes(f1012e);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public B mo1088a(int i) {
        this.f1018i = i;
        return this;
    }

    /* renamed from: c */
    public int mo1091c() {
        return this.f1018i;
    }

    /* renamed from: d */
    public void mo1093d() {
        C0380j.m1586a().mo1424a(mo1091c(), this.f1014c);
    }

    /* renamed from: e */
    public void mo1095e() {
        mo1089b(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1089b(int i) {
        C0380j.m1586a().mo1426a(this.f1014c, i);
    }

    /* renamed from: f */
    public boolean mo1096f() {
        return C0380j.m1586a().mo1431e(this.f1014c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public SwipeDismissBehavior<? extends View> mo1097g() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo1098h() {
        if (this.f1013b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f1013b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0349e) {
                CoordinatorLayout.C0349e eVar = (CoordinatorLayout.C0349e) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.f1020k;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = mo1097g();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).m1249a((BaseTransientBottomBar<?>) this);
                }
                swipeDismissBehavior.mo1344a((SwipeDismissBehavior.C0358a) new SwipeDismissBehavior.C0358a() {
                    /* renamed from: a */
                    public void mo1114a(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.mo1089b(0);
                    }

                    /* renamed from: a */
                    public void mo1113a(int i) {
                        switch (i) {
                            case 0:
                                C0380j.m1586a().mo1430d(BaseTransientBottomBar.this.f1014c);
                                return;
                            case 1:
                            case 2:
                                C0380j.m1586a().mo1429c(BaseTransientBottomBar.this.f1014c);
                                return;
                            default:
                                return;
                        }
                    }
                });
                eVar.mo1244a((CoordinatorLayout.C0346b) swipeDismissBehavior);
                eVar.f1110g = 80;
            }
            this.f1015f.addView(this.f1013b);
        }
        this.f1013b.setOnAttachStateChangeListener(new C0334c() {
            /* renamed from: a */
            public void mo1115a(View view) {
            }

            /* renamed from: b */
            public void mo1116b(View view) {
                if (BaseTransientBottomBar.this.mo1096f()) {
                    BaseTransientBottomBar.f1010a.post(new Runnable() {
                        public void run() {
                            BaseTransientBottomBar.this.mo1094d(3);
                        }
                    });
                }
            }
        });
        if (!C0594r.m2622w(this.f1013b)) {
            this.f1013b.setOnLayoutChangeListener(new C0335d() {
                /* renamed from: a */
                public void mo1118a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.f1013b.setOnLayoutChangeListener((C0335d) null);
                    if (BaseTransientBottomBar.this.mo1101k()) {
                        BaseTransientBottomBar.this.mo1099i();
                    } else {
                        BaseTransientBottomBar.this.mo1100j();
                    }
                }
            });
        } else if (mo1101k()) {
            mo1099i();
        } else {
            mo1100j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1099i() {
        final int m = m1222m();
        if (f1011d) {
            C0594r.m2601e(this.f1013b, m);
        } else {
            this.f1013b.setTranslationY((float) m);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{m, 0});
        valueAnimator.setInterpolator(C0251a.f764b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f1017h.mo955a(70, 180);
            }

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo1100j();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: c */
            private int f1025c = m;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f1011d) {
                    C0594r.m2601e(BaseTransientBottomBar.this.f1013b, intValue - this.f1025c);
                } else {
                    BaseTransientBottomBar.this.f1013b.setTranslationY((float) intValue);
                }
                this.f1025c = intValue;
            }
        });
        valueAnimator.start();
    }

    /* renamed from: e */
    private void m1220e(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m1222m()});
        valueAnimator.setInterpolator(C0251a.f764b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f1017h.mo956b(0, 180);
            }

            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo1094d(i);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: b */
            private int f1029b = 0;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f1011d) {
                    C0594r.m2601e(BaseTransientBottomBar.this.f1013b, intValue - this.f1029b);
                } else {
                    BaseTransientBottomBar.this.f1013b.setTranslationY((float) intValue);
                }
                this.f1029b = intValue;
            }
        });
        valueAnimator.start();
    }

    /* renamed from: m */
    private int m1222m() {
        int height = this.f1013b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f1013b.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo1092c(int i) {
        if (!mo1101k() || this.f1013b.getVisibility() != 0) {
            mo1094d(i);
        } else {
            m1220e(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1100j() {
        C0380j.m1586a().mo1428b(this.f1014c);
        List<C0332a<B>> list = this.f1019j;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1019j.get(size).mo1121a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1094d(int i) {
        C0380j.m1586a().mo1425a(this.f1014c);
        List<C0332a<B>> list = this.f1019j;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1019j.get(size).mo1122a(this, i);
            }
        }
        ViewParent parent = this.f1013b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1013b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo1101k() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f1021l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$e */
    protected static class C0336e extends FrameLayout {

        /* renamed from: a */
        private final AccessibilityManager f1039a;

        /* renamed from: b */
        private final C0560b.C0561a f1040b;

        /* renamed from: c */
        private C0335d f1041c;

        /* renamed from: d */
        private C0334c f1042d;

        protected C0336e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0241a.C0250i.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0241a.C0250i.SnackbarLayout_elevation)) {
                C0594r.m2577a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0241a.C0250i.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.f1039a = (AccessibilityManager) context.getSystemService("accessibility");
            this.f1040b = new C0560b.C0561a() {
                /* renamed from: a */
                public void mo1131a(boolean z) {
                    C0336e.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            C0560b.m2459a(this.f1039a, this.f1040b);
            setClickableOrFocusableBasedOnAccessibility(this.f1039a.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C0335d dVar = this.f1041c;
            if (dVar != null) {
                dVar.mo1118a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0334c cVar = this.f1042d;
            if (cVar != null) {
                cVar.mo1115a(this);
            }
            C0594r.m2614o(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0334c cVar = this.f1042d;
            if (cVar != null) {
                cVar.mo1116b(this);
            }
            C0560b.m2460b(this.f1039a, this.f1040b);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C0335d dVar) {
            this.f1041c = dVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C0334c cVar) {
            this.f1042d = cVar;
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g */
        private final C0333b f1037g = new C0333b(this);

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1249a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1037g.mo1123a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo1119a(View view) {
            return this.f1037g.mo1125a(view);
        }

        /* renamed from: b */
        public boolean mo1120b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f1037g.mo1124a(coordinatorLayout, view, motionEvent);
            return super.mo1120b(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$b */
    public static class C0333b {

        /* renamed from: a */
        private C0380j.C0382a f1038a;

        public C0333b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo1342a(0.1f);
            swipeDismissBehavior.mo1345b(0.6f);
            swipeDismissBehavior.mo1343a(0);
        }

        /* renamed from: a */
        public void mo1123a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1038a = baseTransientBottomBar.f1014c;
        }

        /* renamed from: a */
        public boolean mo1125a(View view) {
            return view instanceof C0336e;
        }

        /* renamed from: a */
        public void mo1124a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.mo1175a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0380j.m1586a().mo1429c(this.f1038a);
                            return;
                        }
                        return;
                    case 1:
                        break;
                    default:
                        return;
                }
            }
            C0380j.m1586a().mo1430d(this.f1038a);
        }
    }
}
