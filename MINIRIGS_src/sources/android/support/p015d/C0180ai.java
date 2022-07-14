package android.support.p015d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p015d.C0167a;
import android.support.p015d.C0216m;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.d.ai */
public abstract class C0180ai extends C0216m {

    /* renamed from: h */
    private static final String[] f600h = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: i */
    private int f601i = 3;

    /* renamed from: a */
    public Animator mo600a(ViewGroup viewGroup, View view, C0232s sVar, C0232s sVar2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo606b(ViewGroup viewGroup, View view, C0232s sVar, C0232s sVar2) {
        return null;
    }

    /* renamed from: android.support.d.ai$b */
    private static class C0183b {

        /* renamed from: a */
        boolean f611a;

        /* renamed from: b */
        boolean f612b;

        /* renamed from: c */
        int f613c;

        /* renamed from: d */
        int f614d;

        /* renamed from: e */
        ViewGroup f615e;

        /* renamed from: f */
        ViewGroup f616f;

        C0183b() {
        }
    }

    /* renamed from: a */
    public void mo601a(int i) {
        if ((i & -4) == 0) {
            this.f601i = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public String[] mo604a() {
        return f600h;
    }

    /* renamed from: d */
    private void m675d(C0232s sVar) {
        sVar.f745a.put("android:visibility:visibility", Integer.valueOf(sVar.f746b.getVisibility()));
        sVar.f745a.put("android:visibility:parent", sVar.f746b.getParent());
        int[] iArr = new int[2];
        sVar.f746b.getLocationOnScreen(iArr);
        sVar.f745a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public void mo602a(C0232s sVar) {
        m675d(sVar);
    }

    /* renamed from: b */
    public void mo607b(C0232s sVar) {
        m675d(sVar);
    }

    /* renamed from: b */
    private C0183b m674b(C0232s sVar, C0232s sVar2) {
        C0183b bVar = new C0183b();
        bVar.f611a = false;
        bVar.f612b = false;
        if (sVar == null || !sVar.f745a.containsKey("android:visibility:visibility")) {
            bVar.f613c = -1;
            bVar.f615e = null;
        } else {
            bVar.f613c = ((Integer) sVar.f745a.get("android:visibility:visibility")).intValue();
            bVar.f615e = (ViewGroup) sVar.f745a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f745a.containsKey("android:visibility:visibility")) {
            bVar.f614d = -1;
            bVar.f616f = null;
        } else {
            bVar.f614d = ((Integer) sVar2.f745a.get("android:visibility:visibility")).intValue();
            bVar.f616f = (ViewGroup) sVar2.f745a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && bVar.f614d == 0) {
                bVar.f612b = true;
                bVar.f611a = true;
            } else if (sVar2 == null && bVar.f613c == 0) {
                bVar.f612b = false;
                bVar.f611a = true;
            }
        } else if (bVar.f613c == bVar.f614d && bVar.f615e == bVar.f616f) {
            return bVar;
        } else {
            if (bVar.f613c != bVar.f614d) {
                if (bVar.f613c == 0) {
                    bVar.f612b = false;
                    bVar.f611a = true;
                } else if (bVar.f614d == 0) {
                    bVar.f612b = true;
                    bVar.f611a = true;
                }
            } else if (bVar.f616f == null) {
                bVar.f612b = false;
                bVar.f611a = true;
            } else if (bVar.f615e == null) {
                bVar.f612b = true;
                bVar.f611a = true;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public Animator mo599a(ViewGroup viewGroup, C0232s sVar, C0232s sVar2) {
        C0183b b = m674b(sVar, sVar2);
        if (!b.f611a) {
            return null;
        }
        if (b.f615e == null && b.f616f == null) {
            return null;
        }
        if (b.f612b) {
            return mo598a(viewGroup, sVar, b.f613c, sVar2, b.f614d);
        }
        return mo605b(viewGroup, sVar, b.f613c, sVar2, b.f614d);
    }

    /* renamed from: a */
    public Animator mo598a(ViewGroup viewGroup, C0232s sVar, int i, C0232s sVar2, int i2) {
        if ((this.f601i & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f746b.getParent();
            if (m674b(mo694b(view, false), mo679a(view, false)).f611a) {
                return null;
            }
        }
        return mo600a(viewGroup, sVar2.f746b, sVar, sVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo605b(android.view.ViewGroup r7, android.support.p015d.C0232s r8, int r9, android.support.p015d.C0232s r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f601i
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f746b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f746b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0038
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0038
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0027
        L_0x0024:
            r9 = r1
            goto L_0x0087
        L_0x0027:
            boolean r2 = r6.f699e
            if (r2 == 0) goto L_0x002c
            goto L_0x0045
        L_0x002c:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r9 = android.support.p015d.C0231r.m864a(r7, r9, r2)
            r2 = r1
            goto L_0x0087
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r9 = r2
            r2 = r1
            goto L_0x0087
        L_0x003d:
            if (r9 == 0) goto L_0x0085
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0047
        L_0x0045:
            r2 = r1
            goto L_0x0087
        L_0x0047:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0085
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.support.d.s r4 = r6.mo679a((android.view.View) r2, (boolean) r3)
            android.support.d.s r5 = r6.mo694b((android.view.View) r2, (boolean) r3)
            android.support.d.ai$b r4 = r6.m674b(r4, r5)
            boolean r4 = r4.f611a
            if (r4 != 0) goto L_0x006a
            android.view.View r9 = android.support.p015d.C0231r.m864a(r7, r9, r2)
            goto L_0x0083
        L_0x006a:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0082
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x0082
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0082
            boolean r2 = r6.f699e
            if (r2 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r9 = r1
        L_0x0083:
            r2 = r1
            goto L_0x0087
        L_0x0085:
            r9 = r1
            r2 = r9
        L_0x0087:
            r4 = 0
            if (r9 == 0) goto L_0x00cf
            if (r8 == 0) goto L_0x00cf
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f745a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            android.support.d.w r11 = android.support.p015d.C0237x.m874a(r7)
            r11.mo738a(r9)
            android.animation.Animator r7 = r6.mo606b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00c6
            r11.mo739b(r9)
            goto L_0x00ce
        L_0x00c6:
            android.support.d.ai$1 r8 = new android.support.d.ai$1
            r8.<init>(r11, r9)
            r7.addListener(r8)
        L_0x00ce:
            return r7
        L_0x00cf:
            if (r2 == 0) goto L_0x00f1
            int r9 = r2.getVisibility()
            android.support.p015d.C0173ad.m643a((android.view.View) r2, (int) r4)
            android.animation.Animator r7 = r6.mo606b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00ed
            android.support.d.ai$a r8 = new android.support.d.ai$a
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            android.support.p015d.C0167a.m624a(r7, r8)
            r6.mo678a((android.support.p015d.C0216m.C0222c) r8)
            goto L_0x00f0
        L_0x00ed:
            android.support.p015d.C0173ad.m643a((android.view.View) r2, (int) r9)
        L_0x00f0:
            return r7
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p015d.C0180ai.mo605b(android.view.ViewGroup, android.support.d.s, int, android.support.d.s, int):android.animation.Animator");
    }

    /* renamed from: a */
    public boolean mo603a(C0232s sVar, C0232s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f745a.containsKey("android:visibility:visibility") != sVar.f745a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0183b b = m674b(sVar, sVar2);
        if (!b.f611a) {
            return false;
        }
        if (b.f613c == 0 || b.f614d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: android.support.d.ai$a */
    private static class C0182a extends AnimatorListenerAdapter implements C0167a.C0168a, C0216m.C0222c {

        /* renamed from: a */
        boolean f605a = false;

        /* renamed from: b */
        private final View f606b;

        /* renamed from: c */
        private final int f607c;

        /* renamed from: d */
        private final ViewGroup f608d;

        /* renamed from: e */
        private final boolean f609e;

        /* renamed from: f */
        private boolean f610f;

        /* renamed from: d */
        public void mo612d(C0216m mVar) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C0182a(View view, int i, boolean z) {
            this.f606b = view;
            this.f607c = i;
            this.f608d = (ViewGroup) view.getParent();
            this.f609e = z;
            m687a(true);
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f605a) {
                C0173ad.m643a(this.f606b, this.f607c);
            }
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f605a) {
                C0173ad.m643a(this.f606b, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f605a = true;
        }

        public void onAnimationEnd(Animator animator) {
            m686a();
        }

        /* renamed from: a */
        public void mo609a(C0216m mVar) {
            m686a();
            mVar.mo692b((C0216m.C0222c) this);
        }

        /* renamed from: b */
        public void mo610b(C0216m mVar) {
            m687a(false);
        }

        /* renamed from: c */
        public void mo611c(C0216m mVar) {
            m687a(true);
        }

        /* renamed from: a */
        private void m686a() {
            if (!this.f605a) {
                C0173ad.m643a(this.f606b, this.f607c);
                ViewGroup viewGroup = this.f608d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m687a(false);
        }

        /* renamed from: a */
        private void m687a(boolean z) {
            ViewGroup viewGroup;
            if (this.f609e && this.f610f != z && (viewGroup = this.f608d) != null) {
                this.f610f = z;
                C0237x.m875a(viewGroup, z);
            }
        }
    }
}
