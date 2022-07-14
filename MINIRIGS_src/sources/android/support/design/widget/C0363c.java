package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0241a;
import android.support.design.p016a.C0251a;
import android.support.design.p016a.C0252b;
import android.support.design.p016a.C0256f;
import android.support.design.p016a.C0257g;
import android.support.design.p016a.C0258h;
import android.support.design.p022f.C0288a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p036h.C0594r;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.design.widget.c */
class C0363c {

    /* renamed from: a */
    static final TimeInterpolator f1184a = C0251a.f765c;

    /* renamed from: p */
    static final int[] f1185p = {16842919, 16842910};

    /* renamed from: q */
    static final int[] f1186q = {16843623, 16842908, 16842910};

    /* renamed from: r */
    static final int[] f1187r = {16842908, 16842910};

    /* renamed from: s */
    static final int[] f1188s = {16843623, 16842910};

    /* renamed from: t */
    static final int[] f1189t = {16842910};

    /* renamed from: u */
    static final int[] f1190u = new int[0];

    /* renamed from: A */
    private float f1191A;

    /* renamed from: B */
    private ArrayList<Animator.AnimatorListener> f1192B;

    /* renamed from: C */
    private ArrayList<Animator.AnimatorListener> f1193C;

    /* renamed from: D */
    private final Rect f1194D = new Rect();

    /* renamed from: E */
    private final RectF f1195E = new RectF();

    /* renamed from: F */
    private final RectF f1196F = new RectF();

    /* renamed from: G */
    private final Matrix f1197G = new Matrix();

    /* renamed from: H */
    private ViewTreeObserver.OnPreDrawListener f1198H;

    /* renamed from: b */
    int f1199b = 0;

    /* renamed from: c */
    Animator f1200c;

    /* renamed from: d */
    C0258h f1201d;

    /* renamed from: e */
    C0258h f1202e;

    /* renamed from: f */
    C0378h f1203f;

    /* renamed from: g */
    Drawable f1204g;

    /* renamed from: h */
    Drawable f1205h;

    /* renamed from: i */
    C0360a f1206i;

    /* renamed from: j */
    Drawable f1207j;

    /* renamed from: k */
    float f1208k;

    /* renamed from: l */
    float f1209l;

    /* renamed from: m */
    float f1210m;

    /* renamed from: n */
    int f1211n;

    /* renamed from: o */
    float f1212o = 1.0f;

    /* renamed from: v */
    final C0390o f1213v;

    /* renamed from: w */
    final C0379i f1214w;

    /* renamed from: x */
    private C0258h f1215x;

    /* renamed from: y */
    private C0258h f1216y;

    /* renamed from: z */
    private final C0384k f1217z;

    /* renamed from: android.support.design.widget.c$d */
    interface C0370d {
        /* renamed from: a */
        void mo1325a();

        /* renamed from: b */
        void mo1326b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1376b(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1389i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo1393m() {
        return true;
    }

    C0363c(C0390o oVar, C0379i iVar) {
        this.f1213v = oVar;
        this.f1214w = iVar;
        this.f1217z = new C0384k();
        this.f1217z.mo1436a(f1185p, m1486a((C0372f) new C0369c()));
        this.f1217z.mo1436a(f1186q, m1486a((C0372f) new C0368b()));
        this.f1217z.mo1436a(f1187r, m1486a((C0372f) new C0368b()));
        this.f1217z.mo1436a(f1188s, m1486a((C0372f) new C0368b()));
        this.f1217z.mo1436a(f1189t, m1486a((C0372f) new C0371e()));
        this.f1217z.mo1436a(f1190u, m1486a((C0372f) new C0367a()));
        this.f1191A = this.f1213v.getRotation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1366a(ColorStateList colorStateList) {
        Drawable drawable = this.f1204g;
        if (drawable != null) {
            C0540a.m2379a(drawable, colorStateList);
        }
        C0360a aVar = this.f1206i;
        if (aVar != null) {
            aVar.mo1350a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1367a(PorterDuff.Mode mode) {
        Drawable drawable = this.f1204g;
        if (drawable != null) {
            C0540a.m2382a(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1375b(ColorStateList colorStateList) {
        Drawable drawable = this.f1205h;
        if (drawable != null) {
            C0540a.m2379a(drawable, C0288a.m1038a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1363a(float f) {
        if (this.f1208k != f) {
            this.f1208k = f;
            mo1364a(this.f1208k, this.f1209l, this.f1210m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo1362a() {
        return this.f1208k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo1372b() {
        return this.f1209l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo1379c() {
        return this.f1210m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1373b(float f) {
        if (this.f1209l != f) {
            this.f1209l = f;
            mo1364a(this.f1208k, this.f1209l, this.f1210m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo1380c(float f) {
        if (this.f1210m != f) {
            this.f1210m = f;
            mo1364a(this.f1208k, this.f1209l, this.f1210m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo1382d() {
        mo1383d(this.f1212o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo1383d(float f) {
        this.f1212o = f;
        Matrix matrix = this.f1197G;
        m1487a(f, matrix);
        this.f1213v.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private void m1487a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1213v.getDrawable();
        if (drawable != null && this.f1211n != 0) {
            RectF rectF = this.f1195E;
            RectF rectF2 = this.f1196F;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f1211n;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f1211n;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0258h mo1385e() {
        return this.f1201d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1369a(C0258h hVar) {
        this.f1201d = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C0258h mo1386f() {
        return this.f1202e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1377b(C0258h hVar) {
        this.f1202e = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1364a(float f, float f2, float f3) {
        C0378h hVar = this.f1203f;
        if (hVar != null) {
            hVar.mo1417a(f, this.f1210m + f);
            mo1390j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1371a(int[] iArr) {
        this.f1217z.mo1435a(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1387g() {
        this.f1217z.mo1434a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1365a(Animator.AnimatorListener animatorListener) {
        if (this.f1192B == null) {
            this.f1192B = new ArrayList<>();
        }
        this.f1192B.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1374b(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f1192B;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: c */
    public void mo1381c(Animator.AnimatorListener animatorListener) {
        if (this.f1193C == null) {
            this.f1193C = new ArrayList<>();
        }
        this.f1193C.add(animatorListener);
    }

    /* renamed from: d */
    public void mo1384d(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f1193C;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1370a(final C0370d dVar, final boolean z) {
        if (!mo1396p()) {
            Animator animator = this.f1200c;
            if (animator != null) {
                animator.cancel();
            }
            if (m1491t()) {
                C0258h hVar = this.f1202e;
                if (hVar == null) {
                    hVar = m1489r();
                }
                AnimatorSet a = m1485a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: d */
                    private boolean f1221d;

                    public void onAnimationStart(Animator animator) {
                        C0363c.this.f1213v.mo1442a(0, z);
                        C0363c cVar = C0363c.this;
                        cVar.f1199b = 1;
                        cVar.f1200c = animator;
                        this.f1221d = false;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.f1221d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C0363c cVar = C0363c.this;
                        cVar.f1199b = 0;
                        cVar.f1200c = null;
                        if (!this.f1221d) {
                            cVar.f1213v.mo1442a(z ? 8 : 4, z);
                            C0370d dVar = dVar;
                            if (dVar != null) {
                                dVar.mo1326b();
                            }
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f1193C;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f1213v.mo1442a(z ? 8 : 4, z);
            if (dVar != null) {
                dVar.mo1326b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1378b(final C0370d dVar, final boolean z) {
        if (!mo1395o()) {
            Animator animator = this.f1200c;
            if (animator != null) {
                animator.cancel();
            }
            if (m1491t()) {
                if (this.f1213v.getVisibility() != 0) {
                    this.f1213v.setAlpha(0.0f);
                    this.f1213v.setScaleY(0.0f);
                    this.f1213v.setScaleX(0.0f);
                    mo1383d(0.0f);
                }
                C0258h hVar = this.f1201d;
                if (hVar == null) {
                    hVar = m1488q();
                }
                AnimatorSet a = m1485a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        C0363c.this.f1213v.mo1442a(0, z);
                        C0363c cVar = C0363c.this;
                        cVar.f1199b = 2;
                        cVar.f1200c = animator;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C0363c cVar = C0363c.this;
                        cVar.f1199b = 0;
                        cVar.f1200c = null;
                        C0370d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo1325a();
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f1192B;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f1213v.mo1442a(0, z);
            this.f1213v.setAlpha(1.0f);
            this.f1213v.setScaleY(1.0f);
            this.f1213v.setScaleX(1.0f);
            mo1383d(1.0f);
            if (dVar != null) {
                dVar.mo1325a();
            }
        }
    }

    /* renamed from: q */
    private C0258h m1488q() {
        if (this.f1215x == null) {
            this.f1215x = C0258h.m891a(this.f1213v.getContext(), C0241a.C0242a.design_fab_show_motion_spec);
        }
        return this.f1215x;
    }

    /* renamed from: r */
    private C0258h m1489r() {
        if (this.f1216y == null) {
            this.f1216y = C0258h.m891a(this.f1213v.getContext(), C0241a.C0242a.design_fab_hide_motion_spec);
        }
        return this.f1216y;
    }

    /* renamed from: a */
    private AnimatorSet m1485a(C0258h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1213v, View.ALPHA, new float[]{f});
        hVar.mo760b("opacity").mo765a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1213v, View.SCALE_X, new float[]{f2});
        hVar.mo760b("scale").mo765a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1213v, View.SCALE_Y, new float[]{f2});
        hVar.mo760b("scale").mo765a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m1487a(f3, this.f1197G);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f1213v, new C0256f(), new C0257g(), new Matrix[]{new Matrix(this.f1197G)});
        hVar.mo760b("iconScale").mo765a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0252b.m881a(animatorSet, arrayList);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Drawable mo1388h() {
        return this.f1207j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo1390j() {
        Rect rect = this.f1194D;
        mo1368a(rect);
        mo1376b(rect);
        this.f1214w.mo1333a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1368a(Rect rect) {
        this.f1203f.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1391k() {
        if (mo1393m()) {
            m1490s();
            this.f1213v.getViewTreeObserver().addOnPreDrawListener(this.f1198H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1392l() {
        if (this.f1198H != null) {
            this.f1213v.getViewTreeObserver().removeOnPreDrawListener(this.f1198H);
            this.f1198H = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1394n() {
        float rotation = this.f1213v.getRotation();
        if (this.f1191A != rotation) {
            this.f1191A = rotation;
            m1492u();
        }
    }

    /* renamed from: s */
    private void m1490s() {
        if (this.f1198H == null) {
            this.f1198H = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C0363c.this.mo1394n();
                    return true;
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo1395o() {
        if (this.f1213v.getVisibility() != 0) {
            if (this.f1199b == 2) {
                return true;
            }
            return false;
        } else if (this.f1199b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo1396p() {
        if (this.f1213v.getVisibility() == 0) {
            if (this.f1199b == 1) {
                return true;
            }
            return false;
        } else if (this.f1199b != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private ValueAnimator m1486a(C0372f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1184a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: android.support.design.widget.c$f */
    private abstract class C0372f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f1230a;

        /* renamed from: c */
        private float f1232c;

        /* renamed from: d */
        private float f1233d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo1403a();

        private C0372f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1230a) {
                this.f1232c = C0363c.this.f1203f.mo1415a();
                this.f1233d = mo1403a();
                this.f1230a = true;
            }
            C0378h hVar = C0363c.this.f1203f;
            float f = this.f1232c;
            hVar.mo1416a(f + ((this.f1233d - f) * valueAnimator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            C0363c.this.f1203f.mo1416a(this.f1233d);
            this.f1230a = false;
        }
    }

    /* renamed from: android.support.design.widget.c$e */
    private class C0371e extends C0372f {
        C0371e() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo1403a() {
            return C0363c.this.f1208k;
        }
    }

    /* renamed from: android.support.design.widget.c$b */
    private class C0368b extends C0372f {
        C0368b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo1403a() {
            return C0363c.this.f1208k + C0363c.this.f1209l;
        }
    }

    /* renamed from: android.support.design.widget.c$c */
    private class C0369c extends C0372f {
        C0369c() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo1403a() {
            return C0363c.this.f1208k + C0363c.this.f1210m;
        }
    }

    /* renamed from: android.support.design.widget.c$a */
    private class C0367a extends C0372f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo1403a() {
            return 0.0f;
        }

        C0367a() {
            super();
        }
    }

    /* renamed from: t */
    private boolean m1491t() {
        return C0594r.m2622w(this.f1213v) && !this.f1213v.isInEditMode();
    }

    /* renamed from: u */
    private void m1492u() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f1191A % 90.0f != 0.0f) {
                if (this.f1213v.getLayerType() != 1) {
                    this.f1213v.setLayerType(1, (Paint) null);
                }
            } else if (this.f1213v.getLayerType() != 0) {
                this.f1213v.setLayerType(0, (Paint) null);
            }
        }
        C0378h hVar = this.f1203f;
        if (hVar != null) {
            hVar.mo1418b(-this.f1191A);
        }
        C0360a aVar = this.f1206i;
        if (aVar != null) {
            aVar.mo1349a(-this.f1191A);
        }
    }
}
