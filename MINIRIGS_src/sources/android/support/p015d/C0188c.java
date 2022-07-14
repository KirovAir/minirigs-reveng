package android.support.p015d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p015d.C0216m;
import android.support.p026v4.p036h.C0594r;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: android.support.d.c */
public class C0188c extends C0216m {

    /* renamed from: h */
    private static final String[] f619h = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: i */
    private static final Property<Drawable, PointF> f620i = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {

        /* renamed from: a */
        private Rect f630a = new Rect();

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f630a);
            this.f630a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f630a);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f630a);
            return new PointF((float) this.f630a.left, (float) this.f630a.top);
        }
    };

    /* renamed from: j */
    private static final Property<C0199a, PointF> f621j = new Property<C0199a, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF get(C0199a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0199a aVar, PointF pointF) {
            aVar.mo648a(pointF);
        }
    };

    /* renamed from: k */
    private static final Property<C0199a, PointF> f622k = new Property<C0199a, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF get(C0199a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0199a aVar, PointF pointF) {
            aVar.mo649b(pointF);
        }
    };

    /* renamed from: l */
    private static final Property<View, PointF> f623l = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0173ad.m644a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: m */
    private static final Property<View, PointF> f624m = new Property<View, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0173ad.m644a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: n */
    private static final Property<View, PointF> f625n = new Property<View, PointF>(PointF.class, "position") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0173ad.m644a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: r */
    private static C0214k f626r = new C0214k();

    /* renamed from: o */
    private int[] f627o = new int[2];

    /* renamed from: p */
    private boolean f628p = false;

    /* renamed from: q */
    private boolean f629q = false;

    /* renamed from: a */
    public String[] mo604a() {
        return f619h;
    }

    /* renamed from: d */
    private void m694d(C0232s sVar) {
        View view = sVar.f746b;
        if (C0594r.m2622w(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f745a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f745a.put("android:changeBounds:parent", sVar.f746b.getParent());
            if (this.f629q) {
                sVar.f746b.getLocationInWindow(this.f627o);
                sVar.f745a.put("android:changeBounds:windowX", Integer.valueOf(this.f627o[0]));
                sVar.f745a.put("android:changeBounds:windowY", Integer.valueOf(this.f627o[1]));
            }
            if (this.f628p) {
                sVar.f745a.put("android:changeBounds:clip", C0594r.m2624y(view));
            }
        }
    }

    /* renamed from: a */
    public void mo602a(C0232s sVar) {
        m694d(sVar);
    }

    /* renamed from: b */
    public void mo607b(C0232s sVar) {
        m694d(sVar);
    }

    /* renamed from: a */
    private boolean m693a(View view, View view2) {
        if (!this.f629q) {
            return true;
        }
        C0232s b = mo694b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
            return false;
        } else if (view2 == b.f746b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public Animator mo599a(ViewGroup viewGroup, C0232s sVar, C0232s sVar2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C0232s sVar3 = sVar;
        C0232s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f745a;
        Map<String, Object> map2 = sVar4.f745a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f746b;
        if (m693a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f745a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f745a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f745a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f745a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f628p) {
                view = view3;
                C0173ad.m644a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C0208f.m748a(view, f625n, mo709l().mo668a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        final C0199a aVar = new C0199a(view);
                        ObjectAnimator a = C0208f.m748a(aVar, f621j, mo709l().mo668a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C0208f.m748a(aVar, f622k, mo709l().mo668a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            private C0199a mViewBounds = aVar;
                        });
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C0208f.m748a(view, f623l, mo709l().mo668a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C0208f.m748a(view, f624m, mo709l().mo668a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C0173ad.m644a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C0208f.m748a(view, f625n, mo709l().mo668a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0594r.m2583a(view, rect);
                    C0214k kVar = f626r;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    objectAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", kVar, objArr);
                    final View view4 = view;
                    final Rect rect9 = rect6;
                    final int i15 = i4;
                    final int i16 = i6;
                    final int i17 = i8;
                    final int i18 = i10;
                    objectAnimator2.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: h */
                        private boolean f648h;

                        public void onAnimationCancel(Animator animator) {
                            this.f648h = true;
                        }

                        public void onAnimationEnd(Animator animator) {
                            if (!this.f648h) {
                                C0594r.m2583a(view4, rect9);
                                C0173ad.m644a(view4, i15, i16, i17, i18);
                            }
                        }
                    });
                } else {
                    objectAnimator2 = null;
                }
                animator = C0231r.m862a(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0237x.m875a(viewGroup4, true);
                mo678a((C0216m.C0222c) new C0223n() {

                    /* renamed from: a */
                    boolean f631a = false;

                    /* renamed from: a */
                    public void mo609a(C0216m mVar) {
                        if (!this.f631a) {
                            C0237x.m875a(viewGroup4, false);
                        }
                        mVar.mo692b((C0216m.C0222c) this);
                    }

                    /* renamed from: b */
                    public void mo610b(C0216m mVar) {
                        C0237x.m875a(viewGroup4, false);
                    }

                    /* renamed from: c */
                    public void mo611c(C0216m mVar) {
                        C0237x.m875a(viewGroup4, true);
                    }
                });
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f745a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f745a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f745a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f745a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f627o);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C0173ad.m648c(view2);
        C0173ad.m642a(view2, 0.0f);
        C0173ad.m640a(viewGroup).mo570a(bitmapDrawable);
        C0209g l = mo709l();
        int[] iArr = this.f627o;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0211i.m752a(f620i, l.mo668a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        final ViewGroup viewGroup5 = viewGroup;
        final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        final View view5 = view2;
        final float f = c;
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C0173ad.m640a(viewGroup5).mo571b(bitmapDrawable2);
                C0173ad.m642a(view5, f);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* renamed from: android.support.d.c$a */
    private static class C0199a {

        /* renamed from: a */
        private int f649a;

        /* renamed from: b */
        private int f650b;

        /* renamed from: c */
        private int f651c;

        /* renamed from: d */
        private int f652d;

        /* renamed from: e */
        private View f653e;

        /* renamed from: f */
        private int f654f;

        /* renamed from: g */
        private int f655g;

        C0199a(View view) {
            this.f653e = view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo648a(PointF pointF) {
            this.f649a = Math.round(pointF.x);
            this.f650b = Math.round(pointF.y);
            this.f654f++;
            if (this.f654f == this.f655g) {
                m714a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo649b(PointF pointF) {
            this.f651c = Math.round(pointF.x);
            this.f652d = Math.round(pointF.y);
            this.f655g++;
            if (this.f654f == this.f655g) {
                m714a();
            }
        }

        /* renamed from: a */
        private void m714a() {
            C0173ad.m644a(this.f653e, this.f649a, this.f650b, this.f651c, this.f652d);
            this.f654f = 0;
            this.f655g = 0;
        }
    }
}
