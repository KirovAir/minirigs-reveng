package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p039v7.widget.C0904ay;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C0904ay.C0922i implements C0904ay.C0939t.C0941b {

    /* renamed from: A */
    private C0828d f2888A;

    /* renamed from: B */
    private int f2889B;

    /* renamed from: C */
    private final Rect f2890C = new Rect();

    /* renamed from: D */
    private final C0823a f2891D = new C0823a();

    /* renamed from: E */
    private boolean f2892E = false;

    /* renamed from: F */
    private boolean f2893F = true;

    /* renamed from: G */
    private int[] f2894G;

    /* renamed from: H */
    private final Runnable f2895H = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.mo3702g();
        }
    };

    /* renamed from: a */
    C0830e[] f2896a;

    /* renamed from: b */
    C0901ax f2897b;

    /* renamed from: c */
    C0901ax f2898c;

    /* renamed from: d */
    boolean f2899d = false;

    /* renamed from: e */
    boolean f2900e = false;

    /* renamed from: f */
    int f2901f = -1;

    /* renamed from: g */
    int f2902g = Integer.MIN_VALUE;

    /* renamed from: h */
    C0825c f2903h = new C0825c();

    /* renamed from: i */
    private int f2904i = -1;

    /* renamed from: j */
    private int f2905j;

    /* renamed from: k */
    private int f2906k;

    /* renamed from: l */
    private final C0885ar f2907l;

    /* renamed from: m */
    private BitSet f2908m;

    /* renamed from: n */
    private int f2909n = 2;

    /* renamed from: o */
    private boolean f2910o;

    /* renamed from: z */
    private boolean f2911z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0904ay.C0922i.C0926b a = m4688a(context, attributeSet, i, i2);
        mo3697b(a.f3370a);
        mo3692a(a.f3371b);
        mo3695a(a.f3372c);
        this.f2907l = new C0885ar();
        m3905M();
    }

    /* renamed from: c */
    public boolean mo3560c() {
        return this.f2909n != 0;
    }

    /* renamed from: M */
    private void m3905M() {
        this.f2897b = C0901ax.m4442a(this, this.f2905j);
        this.f2898c = C0901ax.m4442a(this, 1 - this.f2905j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo3702g() {
        int i;
        int i2;
        if (mo4488v() == 0 || this.f2909n == 0 || !mo4483q()) {
            return false;
        }
        if (this.f2900e) {
            i2 = mo3690K();
            i = mo3691L();
        } else {
            i2 = mo3691L();
            i = mo3690K();
        }
        if (i2 == 0 && mo3703h() != null) {
            this.f2903h.mo3721a();
            mo4413I();
            mo4481o();
            return true;
        } else if (!this.f2892E) {
            return false;
        } else {
            int i3 = this.f2900e ? -1 : 1;
            int i4 = i + 1;
            C0825c.C0826a a = this.f2903h.mo3720a(i2, i4, i3, true);
            if (a == null) {
                this.f2892E = false;
                this.f2903h.mo3719a(i4);
                return false;
            }
            C0825c.C0826a a2 = this.f2903h.mo3720a(i2, a.f2924a, i3 * -1, true);
            if (a2 == null) {
                this.f2903h.mo3719a(a.f2924a);
            } else {
                this.f2903h.mo3719a(a2.f2924a + 1);
            }
            mo4413I();
            mo4481o();
            return true;
        }
    }

    /* renamed from: l */
    public void mo3709l(int i) {
        if (i == 0) {
            mo3702g();
        }
    }

    /* renamed from: a */
    public void mo3550a(C0904ay ayVar, C0904ay.C0934p pVar) {
        super.mo3550a(ayVar, pVar);
        mo4443a(this.f2895H);
        for (int i = 0; i < this.f2904i; i++) {
            this.f2896a[i].mo3762e();
        }
        ayVar.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public View mo3703h() {
        int i;
        int i2;
        boolean z;
        int v = mo4488v() - 1;
        BitSet bitSet = new BitSet(this.f2904i);
        bitSet.set(0, this.f2904i, true);
        int i3 = -1;
        char c = (this.f2905j != 1 || !mo3706j()) ? (char) 65535 : 1;
        if (this.f2900e) {
            i = -1;
        } else {
            i = v + 1;
            v = 0;
        }
        if (v < i) {
            i3 = 1;
        }
        while (v != i) {
            View i4 = mo4474i(v);
            C0824b bVar = (C0824b) i4.getLayoutParams();
            if (bitSet.get(bVar.f2920a.f2942e)) {
                if (m3919a(bVar.f2920a)) {
                    return i4;
                }
                bitSet.clear(bVar.f2920a.f2942e);
            }
            if (!bVar.f2921b && (i2 = v + i3) != i) {
                View i5 = mo4474i(i2);
                if (this.f2900e) {
                    int b = this.f2897b.mo4174b(i4);
                    int b2 = this.f2897b.mo4174b(i5);
                    if (b < b2) {
                        return i4;
                    }
                    z = b == b2;
                } else {
                    int a = this.f2897b.mo4170a(i4);
                    int a2 = this.f2897b.mo4170a(i5);
                    if (a > a2) {
                        return i4;
                    }
                    z = a == a2;
                }
                if (!z) {
                    continue;
                } else {
                    if ((bVar.f2920a.f2942e - ((C0824b) i5.getLayoutParams()).f2920a.f2942e < 0) != (c < 0)) {
                        return i4;
                    }
                }
            }
            v += i3;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3919a(C0830e eVar) {
        if (this.f2900e) {
            if (eVar.mo3760d() < this.f2897b.mo4177d()) {
                return !eVar.mo3757c(eVar.f2938a.get(eVar.f2938a.size() - 1)).f2921b;
            }
        } else if (eVar.mo3754b() > this.f2897b.mo4175c()) {
            return !eVar.mo3757c(eVar.f2938a.get(0)).f2921b;
        }
        return false;
    }

    /* renamed from: a */
    public void mo3692a(int i) {
        mo3552a((String) null);
        if (i != this.f2904i) {
            mo3704i();
            this.f2904i = i;
            this.f2908m = new BitSet(this.f2904i);
            this.f2896a = new C0830e[this.f2904i];
            for (int i2 = 0; i2 < this.f2904i; i2++) {
                this.f2896a[i2] = new C0830e(i2);
            }
            mo4481o();
        }
    }

    /* renamed from: b */
    public void mo3697b(int i) {
        if (i == 0 || i == 1) {
            mo3552a((String) null);
            if (i != this.f2905j) {
                this.f2905j = i;
                C0901ax axVar = this.f2897b;
                this.f2897b = this.f2898c;
                this.f2898c = axVar;
                mo4481o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: a */
    public void mo3695a(boolean z) {
        mo3552a((String) null);
        C0828d dVar = this.f2888A;
        if (!(dVar == null || dVar.f2935h == z)) {
            this.f2888A.f2935h = z;
        }
        this.f2899d = z;
        mo4481o();
    }

    /* renamed from: a */
    public void mo3552a(String str) {
        if (this.f2888A == null) {
            super.mo3552a(str);
        }
    }

    /* renamed from: i */
    public void mo3704i() {
        this.f2903h.mo3721a();
        mo4481o();
    }

    /* renamed from: N */
    private void m3906N() {
        if (this.f2905j == 1 || !mo3706j()) {
            this.f2900e = this.f2899d;
        } else {
            this.f2900e = !this.f2899d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo3706j() {
        return mo4486t() == 1;
    }

    /* renamed from: a */
    public void mo3520a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int A = mo4405A() + mo4407C();
        int B = mo4406B() + mo4408D();
        if (this.f2905j == 1) {
            i4 = m4686a(i2, rect.height() + B, mo4411G());
            i3 = m4686a(i, (this.f2906k * this.f2904i) + A, mo4410F());
        } else {
            i3 = m4686a(i, rect.width() + A, mo4410F());
            i4 = m4686a(i2, (this.f2906k * this.f2904i) + B, mo4411G());
        }
        mo4467f(i3, i4);
    }

    /* renamed from: c */
    public void mo3536c(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        m3915a(pVar, uVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        if (mo3702g() != false) goto L_0x0165;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3915a(android.support.p039v7.widget.C0904ay.C0934p r9, android.support.p039v7.widget.C0904ay.C0942u r10, boolean r11) {
        /*
            r8 = this;
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f2891D
            android.support.v7.widget.StaggeredGridLayoutManager$d r1 = r8.f2888A
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2901f
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4581e()
            if (r1 != 0) goto L_0x0018
            r8.mo4452c((android.support.p039v7.widget.C0904ay.C0934p) r9)
            r0.mo3713a()
            return
        L_0x0018:
            boolean r1 = r0.f2917e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2901f
            if (r1 != r2) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$d r1 = r8.f2888A
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo3713a()
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2888A
            if (r5 == 0) goto L_0x0037
            r8.m3911a((android.support.p039v7.widget.StaggeredGridLayoutManager.C0823a) r0)
            goto L_0x003e
        L_0x0037:
            r8.m3906N()
            boolean r5 = r8.f2900e
            r0.f2915c = r5
        L_0x003e:
            r8.mo3694a((android.support.p039v7.widget.C0904ay.C0942u) r10, (android.support.p039v7.widget.StaggeredGridLayoutManager.C0823a) r0)
            r0.f2917e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2888A
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2901f
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2915c
            boolean r6 = r8.f2910o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo3706j()
            boolean r6 = r8.f2911z
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$c r5 = r8.f2903h
            r5.mo3721a()
            r0.f2916d = r4
        L_0x0060:
            int r5 = r8.mo4488v()
            if (r5 <= 0) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$d r5 = r8.f2888A
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2930c
            if (r5 >= r4) goto L_0x00cb
        L_0x006e:
            boolean r5 = r0.f2916d
            if (r5 == 0) goto L_0x0090
            r1 = 0
        L_0x0073:
            int r5 = r8.f2904i
            if (r1 >= r5) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2896a
            r5 = r5[r1]
            r5.mo3762e()
            int r5 = r0.f2914b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008d
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2896a
            r5 = r5[r1]
            int r6 = r0.f2914b
            r5.mo3759c((int) r6)
        L_0x008d:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0090:
            if (r1 != 0) goto L_0x00b1
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2891D
            int[] r1 = r1.f2918f
            if (r1 != 0) goto L_0x0099
            goto L_0x00b1
        L_0x0099:
            r1 = 0
        L_0x009a:
            int r5 = r8.f2904i
            if (r1 >= r5) goto L_0x00cb
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2896a
            r5 = r5[r1]
            r5.mo3762e()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f2891D
            int[] r6 = r6.f2918f
            r6 = r6[r1]
            r5.mo3759c((int) r6)
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            int r5 = r8.f2904i
            if (r1 >= r5) goto L_0x00c4
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2896a
            r5 = r5[r1]
            boolean r6 = r8.f2900e
            int r7 = r0.f2914b
            r5.mo3753a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c4:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f2891D
            android.support.v7.widget.StaggeredGridLayoutManager$e[] r5 = r8.f2896a
            r1.mo3715a((android.support.p039v7.widget.StaggeredGridLayoutManager.C0830e[]) r5)
        L_0x00cb:
            r8.mo4418a((android.support.p039v7.widget.C0904ay.C0934p) r9)
            android.support.v7.widget.ar r1 = r8.f2907l
            r1.f3169a = r3
            r8.f2892E = r3
            android.support.v7.widget.ax r1 = r8.f2898c
            int r1 = r1.mo4181f()
            r8.mo3701f((int) r1)
            int r1 = r0.f2913a
            r8.m3922b((int) r1, (android.support.p039v7.widget.C0904ay.C0942u) r10)
            boolean r1 = r0.f2915c
            if (r1 == 0) goto L_0x0102
            r8.m3930m(r2)
            android.support.v7.widget.ar r1 = r8.f2907l
            r8.m3908a((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0885ar) r1, (android.support.p039v7.widget.C0904ay.C0942u) r10)
            r8.m3930m(r4)
            android.support.v7.widget.ar r1 = r8.f2907l
            int r2 = r0.f2913a
            android.support.v7.widget.ar r5 = r8.f2907l
            int r5 = r5.f3172d
            int r2 = r2 + r5
            r1.f3171c = r2
            android.support.v7.widget.ar r1 = r8.f2907l
            r8.m3908a((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0885ar) r1, (android.support.p039v7.widget.C0904ay.C0942u) r10)
            goto L_0x011d
        L_0x0102:
            r8.m3930m(r4)
            android.support.v7.widget.ar r1 = r8.f2907l
            r8.m3908a((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0885ar) r1, (android.support.p039v7.widget.C0904ay.C0942u) r10)
            r8.m3930m(r2)
            android.support.v7.widget.ar r1 = r8.f2907l
            int r2 = r0.f2913a
            android.support.v7.widget.ar r5 = r8.f2907l
            int r5 = r5.f3172d
            int r2 = r2 + r5
            r1.f3171c = r2
            android.support.v7.widget.ar r1 = r8.f2907l
            r8.m3908a((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0885ar) r1, (android.support.p039v7.widget.C0904ay.C0942u) r10)
        L_0x011d:
            r8.m3907O()
            int r1 = r8.mo4488v()
            if (r1 <= 0) goto L_0x0137
            boolean r1 = r8.f2900e
            if (r1 == 0) goto L_0x0131
            r8.m3924b((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0904ay.C0942u) r10, (boolean) r4)
            r8.m3926c((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0904ay.C0942u) r10, (boolean) r3)
            goto L_0x0137
        L_0x0131:
            r8.m3926c((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0904ay.C0942u) r10, (boolean) r4)
            r8.m3924b((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0904ay.C0942u) r10, (boolean) r3)
        L_0x0137:
            if (r11 == 0) goto L_0x0164
            boolean r11 = r10.mo4577a()
            if (r11 != 0) goto L_0x0164
            int r11 = r8.f2909n
            if (r11 == 0) goto L_0x0155
            int r11 = r8.mo4488v()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f2892E
            if (r11 != 0) goto L_0x0153
            android.view.View r11 = r8.mo3703h()
            if (r11 == 0) goto L_0x0155
        L_0x0153:
            r11 = 1
            goto L_0x0156
        L_0x0155:
            r11 = 0
        L_0x0156:
            if (r11 == 0) goto L_0x0164
            java.lang.Runnable r11 = r8.f2895H
            r8.mo4443a((java.lang.Runnable) r11)
            boolean r11 = r8.mo3702g()
            if (r11 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r4 = 0
        L_0x0165:
            boolean r11 = r10.mo4577a()
            if (r11 == 0) goto L_0x0170
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2891D
            r11.mo3713a()
        L_0x0170:
            boolean r11 = r0.f2915c
            r8.f2910o = r11
            boolean r11 = r8.mo3706j()
            r8.f2911z = r11
            if (r4 == 0) goto L_0x0184
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f2891D
            r11.mo3713a()
            r8.m3915a((android.support.p039v7.widget.C0904ay.C0934p) r9, (android.support.p039v7.widget.C0904ay.C0942u) r10, (boolean) r3)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.StaggeredGridLayoutManager.m3915a(android.support.v7.widget.ay$p, android.support.v7.widget.ay$u, boolean):void");
    }

    /* renamed from: a */
    public void mo3524a(C0904ay.C0942u uVar) {
        super.mo3524a(uVar);
        this.f2901f = -1;
        this.f2902g = Integer.MIN_VALUE;
        this.f2888A = null;
        this.f2891D.mo3713a();
    }

    /* renamed from: O */
    private void m3907O() {
        if (this.f2898c.mo4184h() != 1073741824) {
            int v = mo4488v();
            float f = 0.0f;
            for (int i = 0; i < v; i++) {
                View i2 = mo4474i(i);
                float e = (float) this.f2898c.mo4180e(i2);
                if (e >= f) {
                    if (((C0824b) i2.getLayoutParams()).mo3717a()) {
                        e = (e * 1.0f) / ((float) this.f2904i);
                    }
                    f = Math.max(f, e);
                }
            }
            int i3 = this.f2906k;
            int round = Math.round(f * ((float) this.f2904i));
            if (this.f2898c.mo4184h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2898c.mo4181f());
            }
            mo3701f(round);
            if (this.f2906k != i3) {
                for (int i4 = 0; i4 < v; i4++) {
                    View i5 = mo4474i(i4);
                    C0824b bVar = (C0824b) i5.getLayoutParams();
                    if (!bVar.f2921b) {
                        if (!mo3706j() || this.f2905j != 1) {
                            int i6 = bVar.f2920a.f2942e * this.f2906k;
                            int i7 = bVar.f2920a.f2942e * i3;
                            if (this.f2905j == 1) {
                                i5.offsetLeftAndRight(i6 - i7);
                            } else {
                                i5.offsetTopAndBottom(i6 - i7);
                            }
                        } else {
                            i5.offsetLeftAndRight(((-((this.f2904i - 1) - bVar.f2920a.f2942e)) * this.f2906k) - ((-((this.f2904i - 1) - bVar.f2920a.f2942e)) * i3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m3911a(C0823a aVar) {
        if (this.f2888A.f2930c > 0) {
            if (this.f2888A.f2930c == this.f2904i) {
                for (int i = 0; i < this.f2904i; i++) {
                    this.f2896a[i].mo3762e();
                    int i2 = this.f2888A.f2931d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.f2888A.f2936i) {
                            i2 += this.f2897b.mo4177d();
                        } else {
                            i2 += this.f2897b.mo4175c();
                        }
                    }
                    this.f2896a[i].mo3759c(i2);
                }
            } else {
                this.f2888A.mo3739a();
                C0828d dVar = this.f2888A;
                dVar.f2928a = dVar.f2929b;
            }
        }
        this.f2911z = this.f2888A.f2937j;
        mo3695a(this.f2888A.f2935h);
        m3906N();
        if (this.f2888A.f2928a != -1) {
            this.f2901f = this.f2888A.f2928a;
            aVar.f2915c = this.f2888A.f2936i;
        } else {
            aVar.f2915c = this.f2900e;
        }
        if (this.f2888A.f2932e > 1) {
            this.f2903h.f2922a = this.f2888A.f2933f;
            this.f2903h.f2923b = this.f2888A.f2934g;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3694a(C0904ay.C0942u uVar, C0823a aVar) {
        if (!mo3698b(uVar, aVar) && !m3927c(uVar, aVar)) {
            aVar.mo3716b();
            aVar.f2913a = 0;
        }
    }

    /* renamed from: c */
    private boolean m3927c(C0904ay.C0942u uVar, C0823a aVar) {
        int i;
        if (this.f2910o) {
            i = m3942w(uVar.mo4581e());
        } else {
            i = m3941v(uVar.mo4581e());
        }
        aVar.f2913a = i;
        aVar.f2914b = Integer.MIN_VALUE;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3698b(C0904ay.C0942u uVar, C0823a aVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (uVar.mo4577a() || (i = this.f2901f) == -1) {
            return false;
        }
        if (i < 0 || i >= uVar.mo4581e()) {
            this.f2901f = -1;
            this.f2902g = Integer.MIN_VALUE;
            return false;
        }
        C0828d dVar = this.f2888A;
        if (dVar == null || dVar.f2928a == -1 || this.f2888A.f2930c < 1) {
            View c = mo3559c(this.f2901f);
            if (c != null) {
                if (this.f2900e) {
                    i2 = mo3690K();
                } else {
                    i2 = mo3691L();
                }
                aVar.f2913a = i2;
                if (this.f2902g != Integer.MIN_VALUE) {
                    if (aVar.f2915c) {
                        aVar.f2914b = (this.f2897b.mo4177d() - this.f2902g) - this.f2897b.mo4174b(c);
                    } else {
                        aVar.f2914b = (this.f2897b.mo4175c() + this.f2902g) - this.f2897b.mo4170a(c);
                    }
                    return true;
                } else if (this.f2897b.mo4180e(c) > this.f2897b.mo4181f()) {
                    if (aVar.f2915c) {
                        i3 = this.f2897b.mo4177d();
                    } else {
                        i3 = this.f2897b.mo4175c();
                    }
                    aVar.f2914b = i3;
                    return true;
                } else {
                    int a = this.f2897b.mo4170a(c) - this.f2897b.mo4175c();
                    if (a < 0) {
                        aVar.f2914b = -a;
                        return true;
                    }
                    int d = this.f2897b.mo4177d() - this.f2897b.mo4174b(c);
                    if (d < 0) {
                        aVar.f2914b = d;
                        return true;
                    }
                    aVar.f2914b = Integer.MIN_VALUE;
                }
            } else {
                aVar.f2913a = this.f2901f;
                int i4 = this.f2902g;
                if (i4 == Integer.MIN_VALUE) {
                    if (m3940u(aVar.f2913a) == 1) {
                        z = true;
                    }
                    aVar.f2915c = z;
                    aVar.mo3716b();
                } else {
                    aVar.mo3714a(i4);
                }
                aVar.f2916d = true;
            }
        } else {
            aVar.f2914b = Integer.MIN_VALUE;
            aVar.f2913a = this.f2901f;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3701f(int i) {
        this.f2906k = i / this.f2904i;
        this.f2889B = View.MeasureSpec.makeMeasureSpec(i, this.f2898c.mo4184h());
    }

    /* renamed from: b */
    public boolean mo3535b() {
        return this.f2888A == null;
    }

    /* renamed from: c */
    public int mo3558c(C0904ay.C0942u uVar) {
        return m3921b(uVar);
    }

    /* renamed from: b */
    private int m3921b(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        return C0954be.m5022a(uVar, this.f2897b, mo3696b(!this.f2893F), mo3700c(!this.f2893F), this, this.f2893F, this.f2900e);
    }

    /* renamed from: d */
    public int mo3561d(C0904ay.C0942u uVar) {
        return m3921b(uVar);
    }

    /* renamed from: e */
    public int mo3564e(C0904ay.C0942u uVar) {
        return m3928i(uVar);
    }

    /* renamed from: i */
    private int m3928i(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        return C0954be.m5021a(uVar, this.f2897b, mo3696b(!this.f2893F), mo3700c(!this.f2893F), this, this.f2893F);
    }

    /* renamed from: f */
    public int mo3568f(C0904ay.C0942u uVar) {
        return m3928i(uVar);
    }

    /* renamed from: g */
    public int mo3571g(C0904ay.C0942u uVar) {
        return m3929j(uVar);
    }

    /* renamed from: j */
    private int m3929j(C0904ay.C0942u uVar) {
        if (mo4488v() == 0) {
            return 0;
        }
        return C0954be.m5023b(uVar, this.f2897b, mo3696b(!this.f2893F), mo3700c(!this.f2893F), this, this.f2893F);
    }

    /* renamed from: h */
    public int mo3572h(C0904ay.C0942u uVar) {
        return m3929j(uVar);
    }

    /* renamed from: a */
    private void m3918a(View view, C0824b bVar, boolean z) {
        if (bVar.f2921b) {
            if (this.f2905j == 1) {
                m3916a(view, this.f2889B, m4687a(mo4492z(), mo4490x(), mo4406B() + mo4408D(), bVar.height, true), z);
            } else {
                m3916a(view, m4687a(mo4491y(), mo4489w(), mo4405A() + mo4407C(), bVar.width, true), this.f2889B, z);
            }
        } else if (this.f2905j == 1) {
            m3916a(view, m4687a(this.f2906k, mo4489w(), 0, bVar.width, false), m4687a(mo4492z(), mo4490x(), mo4406B() + mo4408D(), bVar.height, true), z);
        } else {
            m3916a(view, m4687a(mo4491y(), mo4489w(), mo4405A() + mo4407C(), bVar.width, true), m4687a(this.f2906k, mo4490x(), 0, bVar.height, false), z);
        }
    }

    /* renamed from: a */
    private void m3916a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo4449b(view, this.f2890C);
        C0824b bVar = (C0824b) view.getLayoutParams();
        int b = m3920b(i, bVar.leftMargin + this.f2890C.left, bVar.rightMargin + this.f2890C.right);
        int b2 = m3920b(i2, bVar.topMargin + this.f2890C.top, bVar.bottomMargin + this.f2890C.bottom);
        if (z) {
            z2 = mo4440a(view, b, b2, (C0904ay.C0927j) bVar);
        } else {
            z2 = mo4450b(view, b, b2, (C0904ay.C0927j) bVar);
        }
        if (z2) {
            view.measure(b, b2);
        }
    }

    /* renamed from: b */
    private int m3920b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: a */
    public void mo3549a(Parcelable parcelable) {
        if (parcelable instanceof C0828d) {
            this.f2888A = (C0828d) parcelable;
            mo4481o();
        }
    }

    /* renamed from: d */
    public Parcelable mo3563d() {
        int i;
        int i2;
        C0828d dVar = this.f2888A;
        if (dVar != null) {
            return new C0828d(dVar);
        }
        C0828d dVar2 = new C0828d();
        dVar2.f2935h = this.f2899d;
        dVar2.f2936i = this.f2910o;
        dVar2.f2937j = this.f2911z;
        C0825c cVar = this.f2903h;
        if (cVar == null || cVar.f2922a == null) {
            dVar2.f2932e = 0;
        } else {
            dVar2.f2933f = this.f2903h.f2922a;
            dVar2.f2932e = dVar2.f2933f.length;
            dVar2.f2934g = this.f2903h.f2923b;
        }
        if (mo4488v() > 0) {
            if (this.f2910o) {
                i = mo3690K();
            } else {
                i = mo3691L();
            }
            dVar2.f2928a = i;
            dVar2.f2929b = mo3707k();
            int i3 = this.f2904i;
            dVar2.f2930c = i3;
            dVar2.f2931d = new int[i3];
            for (int i4 = 0; i4 < this.f2904i; i4++) {
                if (this.f2910o) {
                    i2 = this.f2896a[i4].mo3755b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f2897b.mo4177d();
                    }
                } else {
                    i2 = this.f2896a[i4].mo3747a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f2897b.mo4175c();
                    }
                }
                dVar2.f2931d[i4] = i2;
            }
        } else {
            dVar2.f2928a = -1;
            dVar2.f2929b = -1;
            dVar2.f2930c = 0;
        }
        return dVar2;
    }

    /* renamed from: a */
    public void mo3523a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, View view, C0563c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0824b)) {
            super.mo4429a(view, cVar);
            return;
        }
        C0824b bVar = (C0824b) layoutParams;
        if (this.f2905j == 0) {
            cVar.mo2207b((Object) C0563c.C0565b.m2492a(bVar.mo3718b(), bVar.f2921b ? this.f2904i : 1, -1, -1, bVar.f2921b, false));
        } else {
            cVar.mo2207b((Object) C0563c.C0565b.m2492a(-1, -1, bVar.mo3718b(), bVar.f2921b ? this.f2904i : 1, bVar.f2921b, false));
        }
    }

    /* renamed from: a */
    public void mo3551a(AccessibilityEvent accessibilityEvent) {
        super.mo3551a(accessibilityEvent);
        if (mo4488v() > 0) {
            View b = mo3696b(false);
            View c = mo3700c(false);
            if (b != null && c != null) {
                int d = mo4458d(b);
                int d2 = mo4458d(c);
                if (d < d2) {
                    accessibilityEvent.setFromIndex(d);
                    accessibilityEvent.setToIndex(d2);
                    return;
                }
                accessibilityEvent.setFromIndex(d2);
                accessibilityEvent.setToIndex(d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo3707k() {
        View view;
        if (this.f2900e) {
            view = mo3700c(true);
        } else {
            view = mo3696b(true);
        }
        if (view == null) {
            return -1;
        }
        return mo4458d(view);
    }

    /* renamed from: a */
    public int mo3513a(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2905j == 0) {
            return this.f2904i;
        }
        return super.mo3513a(pVar, uVar);
    }

    /* renamed from: b */
    public int mo3533b(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2905j == 1) {
            return this.f2904i;
        }
        return super.mo3533b(pVar, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3696b(boolean z) {
        int c = this.f2897b.mo4175c();
        int d = this.f2897b.mo4177d();
        int v = mo4488v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View i2 = mo4474i(i);
            int a = this.f2897b.mo4170a(i2);
            if (this.f2897b.mo4174b(i2) > c && a < d) {
                if (a >= c || !z) {
                    return i2;
                }
                if (view == null) {
                    view = i2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3700c(boolean z) {
        int c = this.f2897b.mo4175c();
        int d = this.f2897b.mo4177d();
        View view = null;
        for (int v = mo4488v() - 1; v >= 0; v--) {
            View i = mo4474i(v);
            int a = this.f2897b.mo4170a(i);
            int b = this.f2897b.mo4174b(i);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return i;
                }
                if (view == null) {
                    view = i;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m3924b(C0904ay.C0934p pVar, C0904ay.C0942u uVar, boolean z) {
        int d;
        int r = m3937r(Integer.MIN_VALUE);
        if (r != Integer.MIN_VALUE && (d = this.f2897b.mo4177d() - r) > 0) {
            int i = d - (-mo3699c(-d, pVar, uVar));
            if (z && i > 0) {
                this.f2897b.mo4172a(i);
            }
        }
    }

    /* renamed from: c */
    private void m3926c(C0904ay.C0934p pVar, C0904ay.C0942u uVar, boolean z) {
        int c;
        int q = m3935q(Integer.MAX_VALUE);
        if (q != Integer.MAX_VALUE && (c = q - this.f2897b.mo4175c()) > 0) {
            int c2 = c - mo3699c(c, pVar, uVar);
            if (z && c2 > 0) {
                this.f2897b.mo4172a(-c2);
            }
        }
    }

    /* renamed from: b */
    private void m3922b(int i, C0904ay.C0942u uVar) {
        int i2;
        int i3;
        int c;
        C0885ar arVar = this.f2907l;
        boolean z = false;
        arVar.f3170b = 0;
        arVar.f3171c = i;
        if (!mo4485s() || (c = uVar.mo4579c()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f2900e == (c < i)) {
                i3 = this.f2897b.mo4181f();
                i2 = 0;
            } else {
                i2 = this.f2897b.mo4181f();
                i3 = 0;
            }
        }
        if (mo4484r()) {
            this.f2907l.f3174f = this.f2897b.mo4175c() - i2;
            this.f2907l.f3175g = this.f2897b.mo4177d() + i3;
        } else {
            this.f2907l.f3175g = this.f2897b.mo4179e() + i3;
            this.f2907l.f3174f = -i2;
        }
        C0885ar arVar2 = this.f2907l;
        arVar2.f3176h = false;
        arVar2.f3169a = true;
        if (this.f2897b.mo4184h() == 0 && this.f2897b.mo4179e() == 0) {
            z = true;
        }
        arVar2.f3177i = z;
    }

    /* renamed from: m */
    private void m3930m(int i) {
        C0885ar arVar = this.f2907l;
        arVar.f3173e = i;
        int i2 = 1;
        if (this.f2900e != (i == -1)) {
            i2 = -1;
        }
        arVar.f3172d = i2;
    }

    /* renamed from: j */
    public void mo3705j(int i) {
        super.mo3705j(i);
        for (int i2 = 0; i2 < this.f2904i; i2++) {
            this.f2896a[i2].mo3761d(i);
        }
    }

    /* renamed from: k */
    public void mo3708k(int i) {
        super.mo3708k(i);
        for (int i2 = 0; i2 < this.f2904i; i2++) {
            this.f2896a[i2].mo3761d(i);
        }
    }

    /* renamed from: b */
    public void mo3534b(C0904ay ayVar, int i, int i2) {
        m3925c(i, i2, 2);
    }

    /* renamed from: a */
    public void mo3527a(C0904ay ayVar, int i, int i2) {
        m3925c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo3526a(C0904ay ayVar) {
        this.f2903h.mo3721a();
        mo4481o();
    }

    /* renamed from: a */
    public void mo3528a(C0904ay ayVar, int i, int i2, int i3) {
        m3925c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo3529a(C0904ay ayVar, int i, int i2, Object obj) {
        m3925c(i, i2, 4);
    }

    /* renamed from: c */
    private void m3925c(int i, int i2, int i3) {
        int i4;
        int i5;
        int K = this.f2900e ? mo3690K() : mo3691L();
        if (i3 != 8) {
            i4 = i + i2;
            i5 = i;
        } else if (i < i2) {
            i4 = i2 + 1;
            i5 = i;
        } else {
            i4 = i + 1;
            i5 = i2;
        }
        this.f2903h.mo3725b(i5);
        if (i3 != 8) {
            switch (i3) {
                case 1:
                    this.f2903h.mo3726b(i, i2);
                    break;
                case 2:
                    this.f2903h.mo3722a(i, i2);
                    break;
            }
        } else {
            this.f2903h.mo3722a(i, 1);
            this.f2903h.mo3726b(i2, 1);
        }
        if (i4 > K) {
            if (i5 <= (this.f2900e ? mo3691L() : mo3690K())) {
                mo4481o();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* renamed from: a */
    private int m3908a(C0904ay.C0934p pVar, C0885ar arVar, C0904ay.C0942u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C0830e eVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        C0904ay.C0934p pVar2 = pVar;
        C0885ar arVar2 = arVar;
        ? r9 = 0;
        this.f2908m.set(0, this.f2904i, true);
        if (this.f2907l.f3177i) {
            i = arVar2.f3173e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (arVar2.f3173e == 1) {
            i = arVar2.f3175g + arVar2.f3170b;
        } else {
            i = arVar2.f3174f - arVar2.f3170b;
        }
        m3910a(arVar2.f3173e, i);
        if (this.f2900e) {
            i2 = this.f2897b.mo4177d();
        } else {
            i2 = this.f2897b.mo4175c();
        }
        boolean z2 = false;
        while (true) {
            if (arVar.mo4081a(uVar)) {
                if (!this.f2907l.f3177i && this.f2908m.isEmpty()) {
                    i3 = 0;
                    break;
                }
                View a = arVar2.mo4080a(pVar2);
                C0824b bVar = (C0824b) a.getLayoutParams();
                int f = bVar.mo4501f();
                int c = this.f2903h.mo3727c(f);
                boolean z3 = c == -1;
                if (z3) {
                    C0830e a2 = bVar.f2921b ? this.f2896a[r9] : m3909a(arVar2);
                    this.f2903h.mo3723a(f, a2);
                    eVar = a2;
                } else {
                    eVar = this.f2896a[c];
                }
                bVar.f2920a = eVar;
                if (arVar2.f3173e == 1) {
                    mo4447b(a);
                } else {
                    mo4448b(a, (int) r9);
                }
                m3918a(a, bVar, (boolean) r9);
                if (arVar2.f3173e == 1) {
                    if (bVar.f2921b) {
                        i12 = m3937r(i2);
                    } else {
                        i12 = eVar.mo3755b(i2);
                    }
                    int e = this.f2897b.mo4180e(a) + i12;
                    if (z3 && bVar.f2921b) {
                        C0825c.C0826a n = m3931n(i12);
                        n.f2925b = -1;
                        n.f2924a = f;
                        this.f2903h.mo3724a(n);
                    }
                    i5 = e;
                    i6 = i12;
                } else {
                    if (bVar.f2921b) {
                        i11 = m3935q(i2);
                    } else {
                        i11 = eVar.mo3747a(i2);
                    }
                    i6 = i11 - this.f2897b.mo4180e(a);
                    if (z3 && bVar.f2921b) {
                        C0825c.C0826a o = m3932o(i11);
                        o.f2925b = 1;
                        o.f2924a = f;
                        this.f2903h.mo3724a(o);
                    }
                    i5 = i11;
                }
                if (bVar.f2921b && arVar2.f3172d == -1) {
                    if (z3) {
                        this.f2892E = true;
                    } else {
                        if (arVar2.f3173e == 1) {
                            z = !mo3710m();
                        } else {
                            z = !mo3711n();
                        }
                        if (z) {
                            C0825c.C0826a f2 = this.f2903h.mo3730f(f);
                            if (f2 != null) {
                                f2.f2927d = true;
                            }
                            this.f2892E = true;
                        }
                    }
                }
                m3917a(a, bVar, arVar2);
                if (!mo3706j() || this.f2905j != 1) {
                    if (bVar.f2921b) {
                        i9 = this.f2898c.mo4175c();
                    } else {
                        i9 = (eVar.f2942e * this.f2906k) + this.f2898c.mo4175c();
                    }
                    i8 = i9;
                    i7 = this.f2898c.mo4180e(a) + i9;
                } else {
                    if (bVar.f2921b) {
                        i10 = this.f2898c.mo4177d();
                    } else {
                        i10 = this.f2898c.mo4177d() - (((this.f2904i - 1) - eVar.f2942e) * this.f2906k);
                    }
                    i7 = i10;
                    i8 = i10 - this.f2898c.mo4180e(a);
                }
                if (this.f2905j == 1) {
                    mo4426a(a, i8, i6, i7, i5);
                } else {
                    mo4426a(a, i6, i8, i5, i7);
                }
                if (bVar.f2921b) {
                    m3910a(this.f2907l.f3173e, i);
                } else {
                    m3912a(eVar, this.f2907l.f3173e, i);
                }
                m3914a(pVar2, this.f2907l);
                if (this.f2907l.f3176h && a.hasFocusable()) {
                    if (bVar.f2921b) {
                        this.f2908m.clear();
                    } else {
                        this.f2908m.set(eVar.f2942e, false);
                    }
                }
                z2 = true;
                r9 = 0;
            } else {
                i3 = 0;
                break;
            }
        }
        if (!z2) {
            m3914a(pVar2, this.f2907l);
        }
        if (this.f2907l.f3173e == -1) {
            i4 = this.f2897b.mo4175c() - m3935q(this.f2897b.mo4175c());
        } else {
            i4 = m3937r(this.f2897b.mo4177d()) - this.f2897b.mo4177d();
        }
        return i4 > 0 ? Math.min(arVar2.f3170b, i4) : i3;
    }

    /* renamed from: n */
    private C0825c.C0826a m3931n(int i) {
        C0825c.C0826a aVar = new C0825c.C0826a();
        aVar.f2926c = new int[this.f2904i];
        for (int i2 = 0; i2 < this.f2904i; i2++) {
            aVar.f2926c[i2] = i - this.f2896a[i2].mo3755b(i);
        }
        return aVar;
    }

    /* renamed from: o */
    private C0825c.C0826a m3932o(int i) {
        C0825c.C0826a aVar = new C0825c.C0826a();
        aVar.f2926c = new int[this.f2904i];
        for (int i2 = 0; i2 < this.f2904i; i2++) {
            aVar.f2926c[i2] = this.f2896a[i2].mo3747a(i) - i;
        }
        return aVar;
    }

    /* renamed from: a */
    private void m3917a(View view, C0824b bVar, C0885ar arVar) {
        if (arVar.f3173e == 1) {
            if (bVar.f2921b) {
                m3934p(view);
            } else {
                bVar.f2920a.mo3756b(view);
            }
        } else if (bVar.f2921b) {
            m3936q(view);
        } else {
            bVar.f2920a.mo3752a(view);
        }
    }

    /* renamed from: a */
    private void m3914a(C0904ay.C0934p pVar, C0885ar arVar) {
        int i;
        int i2;
        if (arVar.f3169a && !arVar.f3177i) {
            if (arVar.f3170b == 0) {
                if (arVar.f3173e == -1) {
                    m3923b(pVar, arVar.f3175g);
                } else {
                    m3913a(pVar, arVar.f3174f);
                }
            } else if (arVar.f3173e == -1) {
                int p = arVar.f3174f - m3933p(arVar.f3174f);
                if (p < 0) {
                    i2 = arVar.f3175g;
                } else {
                    i2 = arVar.f3175g - Math.min(p, arVar.f3170b);
                }
                m3923b(pVar, i2);
            } else {
                int s = m3938s(arVar.f3175g) - arVar.f3175g;
                if (s < 0) {
                    i = arVar.f3174f;
                } else {
                    i = Math.min(s, arVar.f3170b) + arVar.f3174f;
                }
                m3913a(pVar, i);
            }
        }
    }

    /* renamed from: p */
    private void m3934p(View view) {
        for (int i = this.f2904i - 1; i >= 0; i--) {
            this.f2896a[i].mo3756b(view);
        }
    }

    /* renamed from: q */
    private void m3936q(View view) {
        for (int i = this.f2904i - 1; i >= 0; i--) {
            this.f2896a[i].mo3752a(view);
        }
    }

    /* renamed from: a */
    private void m3910a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2904i; i3++) {
            if (!this.f2896a[i3].f2938a.isEmpty()) {
                m3912a(this.f2896a[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m3912a(C0830e eVar, int i, int i2) {
        int i3 = eVar.mo3766i();
        if (i == -1) {
            if (eVar.mo3754b() + i3 <= i2) {
                this.f2908m.set(eVar.f2942e, false);
            }
        } else if (eVar.mo3760d() - i3 >= i2) {
            this.f2908m.set(eVar.f2942e, false);
        }
    }

    /* renamed from: p */
    private int m3933p(int i) {
        int a = this.f2896a[0].mo3747a(i);
        for (int i2 = 1; i2 < this.f2904i; i2++) {
            int a2 = this.f2896a[i2].mo3747a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: q */
    private int m3935q(int i) {
        int a = this.f2896a[0].mo3747a(i);
        for (int i2 = 1; i2 < this.f2904i; i2++) {
            int a2 = this.f2896a[i2].mo3747a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo3710m() {
        int b = this.f2896a[0].mo3755b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2904i; i++) {
            if (this.f2896a[i].mo3755b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3711n() {
        int a = this.f2896a[0].mo3747a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2904i; i++) {
            if (this.f2896a[i].mo3747a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private int m3937r(int i) {
        int b = this.f2896a[0].mo3755b(i);
        for (int i2 = 1; i2 < this.f2904i; i2++) {
            int b2 = this.f2896a[i2].mo3755b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private int m3938s(int i) {
        int b = this.f2896a[0].mo3755b(i);
        for (int i2 = 1; i2 < this.f2904i; i2++) {
            int b2 = this.f2896a[i2].mo3755b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: a */
    private void m3913a(C0904ay.C0934p pVar, int i) {
        while (mo4488v() > 0) {
            View i2 = mo4474i(0);
            if (this.f2897b.mo4174b(i2) <= i && this.f2897b.mo4176c(i2) <= i) {
                C0824b bVar = (C0824b) i2.getLayoutParams();
                if (bVar.f2921b) {
                    int i3 = 0;
                    while (i3 < this.f2904i) {
                        if (this.f2896a[i3].f2938a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.f2904i; i4++) {
                        this.f2896a[i4].mo3765h();
                    }
                } else if (bVar.f2920a.f2938a.size() != 1) {
                    bVar.f2920a.mo3765h();
                } else {
                    return;
                }
                mo4430a(i2, pVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3923b(C0904ay.C0934p pVar, int i) {
        int v = mo4488v() - 1;
        while (v >= 0) {
            View i2 = mo4474i(v);
            if (this.f2897b.mo4170a(i2) >= i && this.f2897b.mo4178d(i2) >= i) {
                C0824b bVar = (C0824b) i2.getLayoutParams();
                if (bVar.f2921b) {
                    int i3 = 0;
                    while (i3 < this.f2904i) {
                        if (this.f2896a[i3].f2938a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.f2904i; i4++) {
                        this.f2896a[i4].mo3764g();
                    }
                } else if (bVar.f2920a.f2938a.size() != 1) {
                    bVar.f2920a.mo3764g();
                } else {
                    return;
                }
                mo4430a(i2, pVar);
                v--;
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    private boolean m3939t(int i) {
        if (this.f2905j == 0) {
            if ((i == -1) != this.f2900e) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f2900e) == mo3706j()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C0830e m3909a(C0885ar arVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3939t(arVar.f3173e)) {
            i2 = this.f2904i - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2904i;
            i = 1;
        }
        C0830e eVar = null;
        if (arVar.f3173e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f2897b.mo4175c();
            while (i2 != i3) {
                C0830e eVar2 = this.f2896a[i2];
                int b = eVar2.mo3755b(c);
                if (b < i4) {
                    eVar = eVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return eVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f2897b.mo4177d();
        while (i2 != i3) {
            C0830e eVar3 = this.f2896a[i2];
            int a = eVar3.mo3747a(d);
            if (a > i5) {
                eVar = eVar3;
                i5 = a;
            }
            i2 += i;
        }
        return eVar;
    }

    /* renamed from: f */
    public boolean mo3569f() {
        return this.f2905j == 1;
    }

    /* renamed from: e */
    public boolean mo3566e() {
        return this.f2905j == 0;
    }

    /* renamed from: a */
    public int mo3512a(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3699c(i, pVar, uVar);
    }

    /* renamed from: b */
    public int mo3532b(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        return mo3699c(i, pVar, uVar);
    }

    /* renamed from: u */
    private int m3940u(int i) {
        if (mo4488v() != 0) {
            if ((i < mo3691L()) != this.f2900e) {
                return -1;
            }
            return 1;
        } else if (this.f2900e) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: d */
    public PointF mo3562d(int i) {
        int u = m3940u(i);
        PointF pointF = new PointF();
        if (u == 0) {
            return null;
        }
        if (this.f2905j == 0) {
            pointF.x = (float) u;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) u;
        }
        return pointF;
    }

    /* renamed from: e */
    public void mo3565e(int i) {
        C0828d dVar = this.f2888A;
        if (!(dVar == null || dVar.f2928a == i)) {
            this.f2888A.mo3740b();
        }
        this.f2901f = i;
        this.f2902g = Integer.MIN_VALUE;
        mo4481o();
    }

    /* renamed from: a */
    public void mo3547a(int i, int i2, C0904ay.C0942u uVar, C0904ay.C0922i.C0925a aVar) {
        int i3;
        if (this.f2905j != 0) {
            i = i2;
        }
        if (mo4488v() != 0 && i != 0) {
            mo3693a(i, uVar);
            int[] iArr = this.f2894G;
            if (iArr == null || iArr.length < this.f2904i) {
                this.f2894G = new int[this.f2904i];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f2904i; i5++) {
                if (this.f2907l.f3172d == -1) {
                    i3 = this.f2907l.f3174f - this.f2896a[i5].mo3747a(this.f2907l.f3174f);
                } else {
                    i3 = this.f2896a[i5].mo3755b(this.f2907l.f3175g) - this.f2907l.f3175g;
                }
                if (i3 >= 0) {
                    this.f2894G[i4] = i3;
                    i4++;
                }
            }
            Arrays.sort(this.f2894G, 0, i4);
            for (int i6 = 0; i6 < i4 && this.f2907l.mo4081a(uVar); i6++) {
                aVar.mo4078b(this.f2907l.f3171c, this.f2894G[i6]);
                this.f2907l.f3171c += this.f2907l.f3172d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3693a(int i, C0904ay.C0942u uVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo3690K();
            i2 = 1;
        } else {
            i3 = mo3691L();
            i2 = -1;
        }
        this.f2907l.f3169a = true;
        m3922b(i3, uVar);
        m3930m(i2);
        C0885ar arVar = this.f2907l;
        arVar.f3171c = i3 + arVar.f3172d;
        this.f2907l.f3170b = Math.abs(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3699c(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (mo4488v() == 0 || i == 0) {
            return 0;
        }
        mo3693a(i, uVar);
        int a = m3908a(pVar, this.f2907l, uVar);
        if (this.f2907l.f3170b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2897b.mo4172a(-i);
        this.f2910o = this.f2900e;
        C0885ar arVar = this.f2907l;
        arVar.f3170b = 0;
        m3914a(pVar, arVar);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo3690K() {
        int v = mo4488v();
        if (v == 0) {
            return 0;
        }
        return mo4458d(mo4474i(v - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo3691L() {
        if (mo4488v() == 0) {
            return 0;
        }
        return mo4458d(mo4474i(0));
    }

    /* renamed from: v */
    private int m3941v(int i) {
        int v = mo4488v();
        for (int i2 = 0; i2 < v; i2++) {
            int d = mo4458d(mo4474i(i2));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private int m3942w(int i) {
        for (int v = mo4488v() - 1; v >= 0; v--) {
            int d = mo4458d(mo4474i(v));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3514a() {
        if (this.f2905j == 0) {
            return new C0824b(-2, -1);
        }
        return new C0824b(-1, -2);
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3515a(Context context, AttributeSet attributeSet) {
        return new C0824b(context, attributeSet);
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3516a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0824b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0824b(layoutParams);
    }

    /* renamed from: a */
    public boolean mo3531a(C0904ay.C0927j jVar) {
        return jVar instanceof C0824b;
    }

    /* renamed from: a */
    public View mo3518a(View view, int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        View e;
        int i2;
        int i3;
        int i4;
        int i5;
        View a;
        if (mo4488v() == 0 || (e = mo4462e(view)) == null) {
            return null;
        }
        m3906N();
        int x = m3943x(i);
        if (x == Integer.MIN_VALUE) {
            return null;
        }
        C0824b bVar = (C0824b) e.getLayoutParams();
        boolean z = bVar.f2921b;
        C0830e eVar = bVar.f2920a;
        if (x == 1) {
            i2 = mo3690K();
        } else {
            i2 = mo3691L();
        }
        m3922b(i2, uVar);
        m3930m(x);
        C0885ar arVar = this.f2907l;
        arVar.f3171c = arVar.f3172d + i2;
        this.f2907l.f3170b = (int) (((float) this.f2897b.mo4181f()) * 0.33333334f);
        C0885ar arVar2 = this.f2907l;
        arVar2.f3176h = true;
        arVar2.f3169a = false;
        m3908a(pVar, arVar2, uVar);
        this.f2910o = this.f2900e;
        if (!z && (a = eVar.mo3750a(i2, x)) != null && a != e) {
            return a;
        }
        if (m3939t(x)) {
            for (int i6 = this.f2904i - 1; i6 >= 0; i6--) {
                View a2 = this.f2896a[i6].mo3750a(i2, x);
                if (a2 != null && a2 != e) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f2904i; i7++) {
                View a3 = this.f2896a[i7].mo3750a(i2, x);
                if (a3 != null && a3 != e) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2899d ^ true) == (x == -1);
        if (!z) {
            if (z2) {
                i5 = eVar.mo3767j();
            } else {
                i5 = eVar.mo3768k();
            }
            View c = mo3559c(i5);
            if (!(c == null || c == e)) {
                return c;
            }
        }
        if (m3939t(x)) {
            for (int i8 = this.f2904i - 1; i8 >= 0; i8--) {
                if (i8 != eVar.f2942e) {
                    if (z2) {
                        i4 = this.f2896a[i8].mo3767j();
                    } else {
                        i4 = this.f2896a[i8].mo3768k();
                    }
                    View c2 = mo3559c(i4);
                    if (!(c2 == null || c2 == e)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f2904i; i9++) {
                if (z2) {
                    i3 = this.f2896a[i9].mo3767j();
                } else {
                    i3 = this.f2896a[i9].mo3768k();
                }
                View c3 = mo3559c(i3);
                if (c3 != null && c3 != e) {
                    return c3;
                }
            }
        }
        return null;
    }

    /* renamed from: x */
    private int m3943x(int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                return (this.f2905j != 1 && mo3706j()) ? 1 : -1;
                            case 2:
                                return (this.f2905j != 1 && mo3706j()) ? -1 : 1;
                            default:
                                return Integer.MIN_VALUE;
                        }
                    } else if (this.f2905j == 1) {
                        return 1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f2905j == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f2905j == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f2905j == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C0824b extends C0904ay.C0927j {

        /* renamed from: a */
        C0830e f2920a;

        /* renamed from: b */
        boolean f2921b;

        public C0824b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0824b(int i, int i2) {
            super(i, i2);
        }

        public C0824b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0824b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public boolean mo3717a() {
            return this.f2921b;
        }

        /* renamed from: b */
        public final int mo3718b() {
            C0830e eVar = this.f2920a;
            if (eVar == null) {
                return -1;
            }
            return eVar.f2942e;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e */
    class C0830e {

        /* renamed from: a */
        ArrayList<View> f2938a = new ArrayList<>();

        /* renamed from: b */
        int f2939b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f2940c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f2941d = 0;

        /* renamed from: e */
        final int f2942e;

        C0830e(int i) {
            this.f2942e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3747a(int i) {
            int i2 = this.f2939b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2938a.size() == 0) {
                return i;
            }
            mo3751a();
            return this.f2939b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3751a() {
            C0825c.C0826a f;
            View view = this.f2938a.get(0);
            C0824b c = mo3757c(view);
            this.f2939b = StaggeredGridLayoutManager.this.f2897b.mo4170a(view);
            if (c.f2921b && (f = StaggeredGridLayoutManager.this.f2903h.mo3730f(c.mo4501f())) != null && f.f2925b == -1) {
                this.f2939b -= f.mo3731a(this.f2942e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3754b() {
            int i = this.f2939b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3751a();
            return this.f2939b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3755b(int i) {
            int i2 = this.f2940c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2938a.size() == 0) {
                return i;
            }
            mo3758c();
            return this.f2940c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3758c() {
            C0825c.C0826a f;
            ArrayList<View> arrayList = this.f2938a;
            View view = arrayList.get(arrayList.size() - 1);
            C0824b c = mo3757c(view);
            this.f2940c = StaggeredGridLayoutManager.this.f2897b.mo4174b(view);
            if (c.f2921b && (f = StaggeredGridLayoutManager.this.f2903h.mo3730f(c.mo4501f())) != null && f.f2925b == 1) {
                this.f2940c += f.mo3731a(this.f2942e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3760d() {
            int i = this.f2940c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3758c();
            return this.f2940c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3752a(View view) {
            C0824b c = mo3757c(view);
            c.f2920a = this;
            this.f2938a.add(0, view);
            this.f2939b = Integer.MIN_VALUE;
            if (this.f2938a.size() == 1) {
                this.f2940c = Integer.MIN_VALUE;
            }
            if (c.mo4499d() || c.mo4500e()) {
                this.f2941d += StaggeredGridLayoutManager.this.f2897b.mo4180e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3756b(View view) {
            C0824b c = mo3757c(view);
            c.f2920a = this;
            this.f2938a.add(view);
            this.f2940c = Integer.MIN_VALUE;
            if (this.f2938a.size() == 1) {
                this.f2939b = Integer.MIN_VALUE;
            }
            if (c.mo4499d() || c.mo4500e()) {
                this.f2941d += StaggeredGridLayoutManager.this.f2897b.mo4180e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3753a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo3755b(Integer.MIN_VALUE);
            } else {
                i2 = mo3747a(Integer.MIN_VALUE);
            }
            mo3762e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f2897b.mo4177d()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f2897b.mo4175c()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f2940c = i2;
                    this.f2939b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3762e() {
            this.f2938a.clear();
            mo3763f();
            this.f2941d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3763f() {
            this.f2939b = Integer.MIN_VALUE;
            this.f2940c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3759c(int i) {
            this.f2939b = i;
            this.f2940c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3764g() {
            int size = this.f2938a.size();
            View remove = this.f2938a.remove(size - 1);
            C0824b c = mo3757c(remove);
            c.f2920a = null;
            if (c.mo4499d() || c.mo4500e()) {
                this.f2941d -= StaggeredGridLayoutManager.this.f2897b.mo4180e(remove);
            }
            if (size == 1) {
                this.f2939b = Integer.MIN_VALUE;
            }
            this.f2940c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3765h() {
            View remove = this.f2938a.remove(0);
            C0824b c = mo3757c(remove);
            c.f2920a = null;
            if (this.f2938a.size() == 0) {
                this.f2940c = Integer.MIN_VALUE;
            }
            if (c.mo4499d() || c.mo4500e()) {
                this.f2941d -= StaggeredGridLayoutManager.this.f2897b.mo4180e(remove);
            }
            this.f2939b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int mo3766i() {
            return this.f2941d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0824b mo3757c(View view) {
            return (C0824b) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3761d(int i) {
            int i2 = this.f2939b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2939b = i2 + i;
            }
            int i3 = this.f2940c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2940c = i3 + i;
            }
        }

        /* renamed from: j */
        public int mo3767j() {
            if (StaggeredGridLayoutManager.this.f2899d) {
                return mo3748a(this.f2938a.size() - 1, -1, true);
            }
            return mo3748a(0, this.f2938a.size(), true);
        }

        /* renamed from: k */
        public int mo3768k() {
            if (StaggeredGridLayoutManager.this.f2899d) {
                return mo3748a(0, this.f2938a.size(), true);
            }
            return mo3748a(this.f2938a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3749a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int c = StaggeredGridLayoutManager.this.f2897b.mo4175c();
            int d = StaggeredGridLayoutManager.this.f2897b.mo4177d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2938a.get(i);
                int a = StaggeredGridLayoutManager.this.f2897b.mo4170a(view);
                int b = StaggeredGridLayoutManager.this.f2897b.mo4174b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a < d : a <= d;
                if (!z3 ? b > c : b >= c) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo4458d(view);
                        }
                        if (a < c || b > d) {
                            return StaggeredGridLayoutManager.this.mo4458d(view);
                        }
                    } else if (a >= c && b <= d) {
                        return StaggeredGridLayoutManager.this.mo4458d(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3748a(int i, int i2, boolean z) {
            return mo3749a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo3750a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2938a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2938a.get(size);
                    if ((StaggeredGridLayoutManager.this.f2899d && StaggeredGridLayoutManager.this.mo4458d(view2) >= i) || ((!StaggeredGridLayoutManager.this.f2899d && StaggeredGridLayoutManager.this.mo4458d(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2938a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2938a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f2899d && StaggeredGridLayoutManager.this.mo4458d(view3) <= i) || ((!StaggeredGridLayoutManager.this.f2899d && StaggeredGridLayoutManager.this.mo4458d(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    static class C0825c {

        /* renamed from: a */
        int[] f2922a;

        /* renamed from: b */
        List<C0826a> f2923b;

        C0825c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3719a(int i) {
            List<C0826a> list = this.f2923b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2923b.get(size).f2924a >= i) {
                        this.f2923b.remove(size);
                    }
                }
            }
            return mo3725b(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3725b(int i) {
            int[] iArr = this.f2922a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m4010g(i);
            if (g == -1) {
                int[] iArr2 = this.f2922a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2922a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2922a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo3727c(int i) {
            int[] iArr = this.f2922a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3723a(int i, C0830e eVar) {
            mo3729e(i);
            this.f2922a[i] = eVar.f2942e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3728d(int i) {
            int length = this.f2922a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3729e(int i) {
            int[] iArr = this.f2922a;
            if (iArr == null) {
                this.f2922a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f2922a, -1);
            } else if (i >= iArr.length) {
                this.f2922a = new int[mo3728d(i)];
                System.arraycopy(iArr, 0, this.f2922a, 0, iArr.length);
                int[] iArr2 = this.f2922a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3721a() {
            int[] iArr = this.f2922a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2923b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3722a(int i, int i2) {
            int[] iArr = this.f2922a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3729e(i3);
                int[] iArr2 = this.f2922a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2922a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4008c(i, i2);
            }
        }

        /* renamed from: c */
        private void m4008c(int i, int i2) {
            List<C0826a> list = this.f2923b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0826a aVar = this.f2923b.get(size);
                    if (aVar.f2924a >= i) {
                        if (aVar.f2924a < i3) {
                            this.f2923b.remove(size);
                        } else {
                            aVar.f2924a -= i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3726b(int i, int i2) {
            int[] iArr = this.f2922a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3729e(i3);
                int[] iArr2 = this.f2922a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2922a, i, i3, -1);
                m4009d(i, i2);
            }
        }

        /* renamed from: d */
        private void m4009d(int i, int i2) {
            List<C0826a> list = this.f2923b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0826a aVar = this.f2923b.get(size);
                    if (aVar.f2924a >= i) {
                        aVar.f2924a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m4010g(int i) {
            if (this.f2923b == null) {
                return -1;
            }
            C0826a f = mo3730f(i);
            if (f != null) {
                this.f2923b.remove(f);
            }
            int size = this.f2923b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2923b.get(i2).f2924a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2923b.remove(i2);
            return this.f2923b.get(i2).f2924a;
        }

        /* renamed from: a */
        public void mo3724a(C0826a aVar) {
            if (this.f2923b == null) {
                this.f2923b = new ArrayList();
            }
            int size = this.f2923b.size();
            for (int i = 0; i < size; i++) {
                C0826a aVar2 = this.f2923b.get(i);
                if (aVar2.f2924a == aVar.f2924a) {
                    this.f2923b.remove(i);
                }
                if (aVar2.f2924a >= aVar.f2924a) {
                    this.f2923b.add(i, aVar);
                    return;
                }
            }
            this.f2923b.add(aVar);
        }

        /* renamed from: f */
        public C0826a mo3730f(int i) {
            List<C0826a> list = this.f2923b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0826a aVar = this.f2923b.get(size);
                if (aVar.f2924a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public C0826a mo3720a(int i, int i2, int i3, boolean z) {
            List<C0826a> list = this.f2923b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0826a aVar = this.f2923b.get(i4);
                if (aVar.f2924a >= i2) {
                    return null;
                }
                if (aVar.f2924a >= i && (i3 == 0 || aVar.f2925b == i3 || (z && aVar.f2927d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c$a */
        static class C0826a implements Parcelable {
            public static final Parcelable.Creator<C0826a> CREATOR = new Parcelable.Creator<C0826a>() {
                /* renamed from: a */
                public C0826a createFromParcel(Parcel parcel) {
                    return new C0826a(parcel);
                }

                /* renamed from: a */
                public C0826a[] newArray(int i) {
                    return new C0826a[i];
                }
            };

            /* renamed from: a */
            int f2924a;

            /* renamed from: b */
            int f2925b;

            /* renamed from: c */
            int[] f2926c;

            /* renamed from: d */
            boolean f2927d;

            public int describeContents() {
                return 0;
            }

            C0826a(Parcel parcel) {
                this.f2924a = parcel.readInt();
                this.f2925b = parcel.readInt();
                this.f2927d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2926c = new int[readInt];
                    parcel.readIntArray(this.f2926c);
                }
            }

            C0826a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo3731a(int i) {
                int[] iArr = this.f2926c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2924a);
                parcel.writeInt(this.f2925b);
                parcel.writeInt(this.f2927d ? 1 : 0);
                int[] iArr = this.f2926c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2926c);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2924a + ", mGapDir=" + this.f2925b + ", mHasUnwantedGapAfter=" + this.f2927d + ", mGapPerSpan=" + Arrays.toString(this.f2926c) + '}';
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d */
    public static class C0828d implements Parcelable {
        public static final Parcelable.Creator<C0828d> CREATOR = new Parcelable.Creator<C0828d>() {
            /* renamed from: a */
            public C0828d createFromParcel(Parcel parcel) {
                return new C0828d(parcel);
            }

            /* renamed from: a */
            public C0828d[] newArray(int i) {
                return new C0828d[i];
            }
        };

        /* renamed from: a */
        int f2928a;

        /* renamed from: b */
        int f2929b;

        /* renamed from: c */
        int f2930c;

        /* renamed from: d */
        int[] f2931d;

        /* renamed from: e */
        int f2932e;

        /* renamed from: f */
        int[] f2933f;

        /* renamed from: g */
        List<C0825c.C0826a> f2934g;

        /* renamed from: h */
        boolean f2935h;

        /* renamed from: i */
        boolean f2936i;

        /* renamed from: j */
        boolean f2937j;

        public int describeContents() {
            return 0;
        }

        public C0828d() {
        }

        C0828d(Parcel parcel) {
            this.f2928a = parcel.readInt();
            this.f2929b = parcel.readInt();
            this.f2930c = parcel.readInt();
            int i = this.f2930c;
            if (i > 0) {
                this.f2931d = new int[i];
                parcel.readIntArray(this.f2931d);
            }
            this.f2932e = parcel.readInt();
            int i2 = this.f2932e;
            if (i2 > 0) {
                this.f2933f = new int[i2];
                parcel.readIntArray(this.f2933f);
            }
            boolean z = false;
            this.f2935h = parcel.readInt() == 1;
            this.f2936i = parcel.readInt() == 1;
            this.f2937j = parcel.readInt() == 1 ? true : z;
            this.f2934g = parcel.readArrayList(C0825c.C0826a.class.getClassLoader());
        }

        public C0828d(C0828d dVar) {
            this.f2930c = dVar.f2930c;
            this.f2928a = dVar.f2928a;
            this.f2929b = dVar.f2929b;
            this.f2931d = dVar.f2931d;
            this.f2932e = dVar.f2932e;
            this.f2933f = dVar.f2933f;
            this.f2935h = dVar.f2935h;
            this.f2936i = dVar.f2936i;
            this.f2937j = dVar.f2937j;
            this.f2934g = dVar.f2934g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3739a() {
            this.f2931d = null;
            this.f2930c = 0;
            this.f2932e = 0;
            this.f2933f = null;
            this.f2934g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3740b() {
            this.f2931d = null;
            this.f2930c = 0;
            this.f2928a = -1;
            this.f2929b = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2928a);
            parcel.writeInt(this.f2929b);
            parcel.writeInt(this.f2930c);
            if (this.f2930c > 0) {
                parcel.writeIntArray(this.f2931d);
            }
            parcel.writeInt(this.f2932e);
            if (this.f2932e > 0) {
                parcel.writeIntArray(this.f2933f);
            }
            parcel.writeInt(this.f2935h ? 1 : 0);
            parcel.writeInt(this.f2936i ? 1 : 0);
            parcel.writeInt(this.f2937j ? 1 : 0);
            parcel.writeList(this.f2934g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0823a {

        /* renamed from: a */
        int f2913a;

        /* renamed from: b */
        int f2914b;

        /* renamed from: c */
        boolean f2915c;

        /* renamed from: d */
        boolean f2916d;

        /* renamed from: e */
        boolean f2917e;

        /* renamed from: f */
        int[] f2918f;

        C0823a() {
            mo3713a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3713a() {
            this.f2913a = -1;
            this.f2914b = Integer.MIN_VALUE;
            this.f2915c = false;
            this.f2916d = false;
            this.f2917e = false;
            int[] iArr = this.f2918f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3715a(C0830e[] eVarArr) {
            int length = eVarArr.length;
            int[] iArr = this.f2918f;
            if (iArr == null || iArr.length < length) {
                this.f2918f = new int[StaggeredGridLayoutManager.this.f2896a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2918f[i] = eVarArr[i].mo3747a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3716b() {
            int i;
            if (this.f2915c) {
                i = StaggeredGridLayoutManager.this.f2897b.mo4177d();
            } else {
                i = StaggeredGridLayoutManager.this.f2897b.mo4175c();
            }
            this.f2914b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3714a(int i) {
            if (this.f2915c) {
                this.f2914b = StaggeredGridLayoutManager.this.f2897b.mo4177d() - i;
            } else {
                this.f2914b = StaggeredGridLayoutManager.this.f2897b.mo4175c() + i;
            }
        }
    }
}
