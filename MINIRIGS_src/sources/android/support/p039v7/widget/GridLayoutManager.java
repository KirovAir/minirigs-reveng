package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p026v4.p036h.p037a.C0563c;
import android.support.p039v7.widget.C0904ay;
import android.support.p039v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f2761a = false;

    /* renamed from: b */
    int f2762b = -1;

    /* renamed from: c */
    int[] f2763c;

    /* renamed from: d */
    View[] f2764d;

    /* renamed from: e */
    final SparseIntArray f2765e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f2766f = new SparseIntArray();

    /* renamed from: g */
    C0798c f2767g = new C0796a();

    /* renamed from: h */
    final Rect f2768h = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3519a(m4688a(context, attributeSet, i, i2).f3371b);
    }

    /* renamed from: a */
    public void mo3530a(boolean z) {
        if (!z) {
            super.mo3530a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: a */
    public int mo3513a(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2781i == 0) {
            return this.f2762b;
        }
        if (uVar.mo4581e() < 1) {
            return 0;
        }
        return m3712a(pVar, uVar, uVar.mo4581e() - 1) + 1;
    }

    /* renamed from: b */
    public int mo3533b(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (this.f2781i == 1) {
            return this.f2762b;
        }
        if (uVar.mo4581e() < 1) {
            return 0;
        }
        return m3712a(pVar, uVar, uVar.mo4581e() - 1) + 1;
    }

    /* renamed from: a */
    public void mo3523a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, View view, C0563c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0797b)) {
            super.mo4429a(view, cVar);
            return;
        }
        C0797b bVar = (C0797b) layoutParams;
        int a = m3712a(pVar, uVar, bVar.mo4501f());
        if (this.f2781i == 0) {
            cVar.mo2207b((Object) C0563c.C0565b.m2492a(bVar.mo3539a(), bVar.mo3540b(), a, 1, this.f2762b > 1 && bVar.mo3540b() == this.f2762b, false));
        } else {
            cVar.mo2207b((Object) C0563c.C0565b.m2492a(a, 1, bVar.mo3539a(), bVar.mo3540b(), this.f2762b > 1 && bVar.mo3540b() == this.f2762b, false));
        }
    }

    /* renamed from: c */
    public void mo3536c(C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        if (uVar.mo4577a()) {
            m3709L();
        }
        super.mo3536c(pVar, uVar);
        m3708K();
    }

    /* renamed from: a */
    public void mo3524a(C0904ay.C0942u uVar) {
        super.mo3524a(uVar);
        this.f2761a = false;
    }

    /* renamed from: K */
    private void m3708K() {
        this.f2765e.clear();
        this.f2766f.clear();
    }

    /* renamed from: L */
    private void m3709L() {
        int v = mo4488v();
        for (int i = 0; i < v; i++) {
            C0797b bVar = (C0797b) mo4474i(i).getLayoutParams();
            int f = bVar.mo4501f();
            this.f2765e.put(f, bVar.mo3540b());
            this.f2766f.put(f, bVar.mo3539a());
        }
    }

    /* renamed from: a */
    public void mo3527a(C0904ay ayVar, int i, int i2) {
        this.f2767g.mo3541a();
    }

    /* renamed from: a */
    public void mo3526a(C0904ay ayVar) {
        this.f2767g.mo3541a();
    }

    /* renamed from: b */
    public void mo3534b(C0904ay ayVar, int i, int i2) {
        this.f2767g.mo3541a();
    }

    /* renamed from: a */
    public void mo3529a(C0904ay ayVar, int i, int i2, Object obj) {
        this.f2767g.mo3541a();
    }

    /* renamed from: a */
    public void mo3528a(C0904ay ayVar, int i, int i2, int i3) {
        this.f2767g.mo3541a();
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3514a() {
        if (this.f2781i == 0) {
            return new C0797b(-2, -1);
        }
        return new C0797b(-1, -2);
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3515a(Context context, AttributeSet attributeSet) {
        return new C0797b(context, attributeSet);
    }

    /* renamed from: a */
    public C0904ay.C0927j mo3516a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0797b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0797b(layoutParams);
    }

    /* renamed from: a */
    public boolean mo3531a(C0904ay.C0927j jVar) {
        return jVar instanceof C0797b;
    }

    /* renamed from: M */
    private void m3710M() {
        int i;
        if (mo3570g() == 1) {
            i = (mo4491y() - mo4407C()) - mo4405A();
        } else {
            i = (mo4492z() - mo4408D()) - mo4406B();
        }
        m3721m(i);
    }

    /* renamed from: a */
    public void mo3520a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2763c == null) {
            super.mo3520a(rect, i, i2);
        }
        int A = mo4405A() + mo4407C();
        int B = mo4406B() + mo4408D();
        if (this.f2781i == 1) {
            i4 = m4686a(i2, rect.height() + B, mo4411G());
            int[] iArr = this.f2763c;
            i3 = m4686a(i, iArr[iArr.length - 1] + A, mo4410F());
        } else {
            i3 = m4686a(i, rect.width() + A, mo4410F());
            int[] iArr2 = this.f2763c;
            i4 = m4686a(i2, iArr2[iArr2.length - 1] + B, mo4411G());
        }
        mo4467f(i3, i4);
    }

    /* renamed from: m */
    private void m3721m(int i) {
        this.f2763c = m3717a(this.f2763c, this.f2762b, i);
    }

    /* renamed from: a */
    static int[] m3717a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3511a(int i, int i2) {
        if (this.f2781i != 1 || !mo3573h()) {
            int[] iArr = this.f2763c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2763c;
        int i3 = this.f2762b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3521a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, LinearLayoutManager.C0799a aVar, int i) {
        super.mo3521a(pVar, uVar, aVar, i);
        m3710M();
        if (uVar.mo4581e() > 0 && !uVar.mo4577a()) {
            m3719b(pVar, uVar, aVar, i);
        }
        m3711N();
    }

    /* renamed from: N */
    private void m3711N() {
        View[] viewArr = this.f2764d;
        if (viewArr == null || viewArr.length != this.f2762b) {
            this.f2764d = new View[this.f2762b];
        }
    }

    /* renamed from: a */
    public int mo3512a(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        m3710M();
        m3711N();
        return super.mo3512a(i, pVar, uVar);
    }

    /* renamed from: b */
    public int mo3532b(int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        m3710M();
        m3711N();
        return super.mo3532b(i, pVar, uVar);
    }

    /* renamed from: b */
    private void m3719b(C0904ay.C0934p pVar, C0904ay.C0942u uVar, LinearLayoutManager.C0799a aVar, int i) {
        boolean z = i == 1;
        int b = m3718b(pVar, uVar, aVar.f2789b);
        if (z) {
            while (b > 0 && aVar.f2789b > 0) {
                aVar.f2789b--;
                b = m3718b(pVar, uVar, aVar.f2789b);
            }
            return;
        }
        int e = uVar.mo4581e() - 1;
        int i2 = aVar.f2789b;
        while (i2 < e) {
            int i3 = i2 + 1;
            int b2 = m3718b(pVar, uVar, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        aVar.f2789b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo3517a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i, int i2, int i3) {
        mo3574i();
        int c = this.f2782j.mo4175c();
        int d = this.f2782j.mo4177d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = mo4474i(i);
            int d2 = mo4458d(i5);
            if (d2 >= 0 && d2 < i3 && m3718b(pVar, uVar, d2) == 0) {
                if (((C0904ay.C0927j) i5.getLayoutParams()).mo4499d()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.f2782j.mo4170a(i5) < d && this.f2782j.mo4174b(i5) >= c) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    private int m3712a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i) {
        if (!uVar.mo4577a()) {
            return this.f2767g.mo3544c(i, this.f2762b);
        }
        int b = pVar.mo4530b(i);
        if (b != -1) {
            return this.f2767g.mo3544c(b, this.f2762b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: b */
    private int m3718b(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i) {
        if (!uVar.mo4577a()) {
            return this.f2767g.mo3543b(i, this.f2762b);
        }
        int i2 = this.f2766f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = pVar.mo4530b(i);
        if (b != -1) {
            return this.f2767g.mo3543b(b, this.f2762b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: c */
    private int m3720c(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i) {
        if (!uVar.mo4577a()) {
            return this.f2767g.mo3537a(i);
        }
        int i2 = this.f2765e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = pVar.mo4530b(i);
        if (b != -1) {
            return this.f2767g.mo3537a(b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3525a(C0904ay.C0942u uVar, LinearLayoutManager.C0801c cVar, C0904ay.C0922i.C0925a aVar) {
        int i = this.f2762b;
        for (int i2 = 0; i2 < this.f2762b && cVar.mo3590a(uVar) && i > 0; i2++) {
            int i3 = cVar.f2800d;
            aVar.mo4078b(i3, Math.max(0, cVar.f2803g));
            i -= this.f2767g.mo3537a(i3);
            cVar.f2800d += cVar.f2801e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3522a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, LinearLayoutManager.C0801c cVar, LinearLayoutManager.C0800b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        View a;
        C0904ay.C0934p pVar2 = pVar;
        C0904ay.C0942u uVar2 = uVar;
        LinearLayoutManager.C0801c cVar2 = cVar;
        LinearLayoutManager.C0800b bVar2 = bVar;
        int i13 = this.f2782j.mo4185i();
        boolean z2 = i13 != 1073741824;
        int i14 = mo4488v() > 0 ? this.f2763c[this.f2762b] : 0;
        if (z2) {
            m3710M();
        }
        boolean z3 = cVar2.f2801e == 1;
        int i15 = this.f2762b;
        if (!z3) {
            i15 = m3718b(pVar2, uVar2, cVar2.f2800d) + m3720c(pVar2, uVar2, cVar2.f2800d);
            i2 = 0;
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        while (i < this.f2762b && cVar2.mo3590a(uVar2) && i15 > 0) {
            int i16 = cVar2.f2800d;
            int c = m3720c(pVar2, uVar2, i16);
            if (c <= this.f2762b) {
                i15 -= c;
                if (i15 < 0 || (a = cVar2.mo3587a(pVar2)) == null) {
                    break;
                }
                i2 += c;
                this.f2764d[i] = a;
                i++;
            } else {
                throw new IllegalArgumentException("Item at position " + i16 + " requires " + c + " spans but GridLayoutManager has only " + this.f2762b + " spans.");
            }
        }
        if (i == 0) {
            bVar2.f2794b = true;
            return;
        }
        float f = 0.0f;
        int i17 = i;
        m3714a(pVar, uVar, i, i2, z3);
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            View view = this.f2764d[i19];
            if (cVar2.f2807k != null) {
                z = false;
                if (z3) {
                    mo4423a(view);
                } else {
                    mo4424a(view, 0);
                }
            } else if (z3) {
                mo4447b(view);
                z = false;
            } else {
                z = false;
                mo4448b(view, 0);
            }
            mo4449b(view, this.f2768h);
            m3716a(view, i13, z);
            int e = this.f2782j.mo4180e(view);
            if (e > i18) {
                i18 = e;
            }
            float f2 = (((float) this.f2782j.mo4182f(view)) * 1.0f) / ((float) ((C0797b) view.getLayoutParams()).f2770b);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            m3713a(f, i14);
            i18 = 0;
            for (int i20 = 0; i20 < i17; i20++) {
                View view2 = this.f2764d[i20];
                m3716a(view2, 1073741824, true);
                int e2 = this.f2782j.mo4180e(view2);
                if (e2 > i18) {
                    i18 = e2;
                }
            }
        }
        for (int i21 = 0; i21 < i17; i21++) {
            View view3 = this.f2764d[i21];
            if (this.f2782j.mo4180e(view3) != i18) {
                C0797b bVar3 = (C0797b) view3.getLayoutParams();
                Rect rect = bVar3.f3375d;
                int i22 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i23 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int a2 = mo3511a(bVar3.f2769a, bVar3.f2770b);
                if (this.f2781i == 1) {
                    i12 = m4687a(a2, 1073741824, i23, bVar3.width, false);
                    i11 = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    i11 = m4687a(a2, 1073741824, i22, bVar3.height, false);
                    i12 = makeMeasureSpec;
                }
                m3715a(view3, i12, i11, true);
            }
        }
        int i24 = 0;
        bVar2.f2793a = i18;
        if (this.f2781i == 1) {
            if (cVar2.f2802f == -1) {
                int i25 = cVar2.f2798b;
                i3 = i25;
                i4 = i25 - i18;
                i6 = 0;
                i5 = 0;
            } else {
                int i26 = cVar2.f2798b;
                i4 = i26;
                i3 = i18 + i26;
                i6 = 0;
                i5 = 0;
            }
        } else if (cVar2.f2802f == -1) {
            int i27 = cVar2.f2798b;
            i4 = 0;
            i3 = 0;
            int i28 = i27 - i18;
            i5 = i27;
            i6 = i28;
        } else {
            i6 = cVar2.f2798b;
            i5 = i18 + i6;
            i4 = 0;
            i3 = 0;
        }
        while (i24 < i17) {
            View view4 = this.f2764d[i24];
            C0797b bVar4 = (C0797b) view4.getLayoutParams();
            if (this.f2781i != 1) {
                int B = mo4406B() + this.f2763c[bVar4.f2769a];
                i10 = i6;
                i8 = i5;
                i9 = B;
                i7 = this.f2782j.mo4182f(view4) + B;
            } else if (mo3573h()) {
                int A = mo4405A() + this.f2763c[this.f2762b - bVar4.f2769a];
                i8 = A;
                i10 = A - this.f2782j.mo4182f(view4);
                i9 = i4;
                i7 = i3;
            } else {
                int A2 = mo4405A() + this.f2763c[bVar4.f2769a];
                i10 = A2;
                i8 = this.f2782j.mo4182f(view4) + A2;
                i9 = i4;
                i7 = i3;
            }
            mo4426a(view4, i10, i9, i8, i7);
            if (bVar4.mo4499d() || bVar4.mo4500e()) {
                bVar2.f2795c = true;
            }
            bVar2.f2796d |= view4.hasFocusable();
            i24++;
            i6 = i10;
            i4 = i9;
            i5 = i8;
            i3 = i7;
        }
        Arrays.fill(this.f2764d, (Object) null);
    }

    /* renamed from: a */
    private void m3716a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0797b bVar = (C0797b) view.getLayoutParams();
        Rect rect = bVar.f3375d;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int a = mo3511a(bVar.f2769a, bVar.f2770b);
        if (this.f2781i == 1) {
            i2 = m4687a(a, i, i5, bVar.width, false);
            i3 = m4687a(this.f2782j.mo4181f(), mo4490x(), i4, bVar.height, true);
        } else {
            int a2 = m4687a(a, i, i4, bVar.height, false);
            int a3 = m4687a(this.f2782j.mo4181f(), mo4489w(), i5, bVar.width, true);
            i3 = a2;
            i2 = a3;
        }
        m3715a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m3713a(float f, int i) {
        m3721m(Math.max(Math.round(f * ((float) this.f2762b)), i));
    }

    /* renamed from: a */
    private void m3715a(View view, int i, int i2, boolean z) {
        boolean z2;
        C0904ay.C0927j jVar = (C0904ay.C0927j) view.getLayoutParams();
        if (z) {
            z2 = mo4440a(view, i, i2, jVar);
        } else {
            z2 = mo4450b(view, i, i2, jVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m3714a(C0904ay.C0934p pVar, C0904ay.C0942u uVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f2764d[i4];
            C0797b bVar = (C0797b) view.getLayoutParams();
            bVar.f2770b = m3720c(pVar, uVar, mo4458d(view));
            bVar.f2769a = i5;
            i5 += bVar.f2770b;
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo3519a(int i) {
        if (i != this.f2762b) {
            this.f2761a = true;
            if (i >= 1) {
                this.f2762b = i;
                this.f2767g.mo3541a();
                mo4481o();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class C0798c {

        /* renamed from: a */
        final SparseIntArray f2771a = new SparseIntArray();

        /* renamed from: b */
        private boolean f2772b = false;

        /* renamed from: a */
        public abstract int mo3537a(int i);

        /* renamed from: a */
        public void mo3541a() {
            this.f2771a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3543b(int i, int i2) {
            if (!this.f2772b) {
                return mo3538a(i, i2);
            }
            int i3 = this.f2771a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo3538a(i, i2);
            this.f2771a.put(i, a);
            return a;
        }

        /* renamed from: a */
        public int mo3538a(int i, int i2) {
            int i3;
            int i4;
            int b;
            int a = mo3537a(i);
            if (a == i2) {
                return 0;
            }
            if (!this.f2772b || this.f2771a.size() <= 0 || (b = mo3542b(i)) < 0) {
                i4 = 0;
                i3 = 0;
            } else {
                i3 = this.f2771a.get(b) + mo3537a(b);
                i4 = b + 1;
            }
            while (i4 < i) {
                int a2 = mo3537a(i4);
                int i5 = i3 + a2;
                if (i5 == i2) {
                    i5 = 0;
                } else if (i5 > i2) {
                    i5 = a2;
                }
                i4++;
            }
            if (a + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3542b(int i) {
            int size = this.f2771a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f2771a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f2771a.size()) {
                return -1;
            }
            return this.f2771a.keyAt(i4);
        }

        /* renamed from: c */
        public int mo3544c(int i, int i2) {
            int a = mo3537a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = mo3537a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    /* renamed from: a */
    public View mo3518a(View view, int i, C0904ay.C0934p pVar, C0904ay.C0942u uVar) {
        int i2;
        int i3;
        int i4;
        View view2;
        int i5;
        int i6;
        View view3;
        int i7;
        View view4;
        int i8;
        boolean z;
        C0904ay.C0934p pVar2 = pVar;
        C0904ay.C0942u uVar2 = uVar;
        View e = mo4462e(view);
        View view5 = null;
        if (e == null) {
            return null;
        }
        C0797b bVar = (C0797b) e.getLayoutParams();
        int i9 = bVar.f2769a;
        int i10 = bVar.f2769a + bVar.f2770b;
        if (super.mo3518a(view, i, pVar, uVar) == null) {
            return null;
        }
        if ((mo3567f(i) == 1) != this.f2783k) {
            i4 = mo4488v() - 1;
            i3 = -1;
            i2 = -1;
        } else {
            i3 = mo4488v();
            i4 = 0;
            i2 = 1;
        }
        boolean z2 = this.f2781i == 1 && mo3573h();
        int a = m3712a(pVar2, uVar2, i4);
        View view6 = null;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            if (i4 == i3) {
                view2 = view6;
                break;
            }
            int a2 = m3712a(pVar2, uVar2, i4);
            View i15 = mo4474i(i4);
            if (i15 == e) {
                view2 = view6;
                break;
            }
            if (!i15.hasFocusable() || a2 == a) {
                C0797b bVar2 = (C0797b) i15.getLayoutParams();
                int i16 = bVar2.f2769a;
                view3 = e;
                i6 = i3;
                int i17 = bVar2.f2769a + bVar2.f2770b;
                if (i15.hasFocusable() && i16 == i9 && i17 == i10) {
                    return i15;
                }
                if ((!i15.hasFocusable() || view5 != null) && (i15.hasFocusable() || view6 != null)) {
                    int min = Math.min(i17, i10) - Math.max(i16, i9);
                    if (i15.hasFocusable()) {
                        if (min > i12) {
                            i5 = i11;
                            view4 = view6;
                            i7 = i13;
                            i8 = i14;
                            z = true;
                        } else {
                            if (min == i12) {
                                if (z2 == (i16 > i11)) {
                                    i5 = i11;
                                    view4 = view6;
                                    i7 = i13;
                                    i8 = i14;
                                    z = true;
                                }
                            }
                            i5 = i11;
                            view4 = view6;
                            i7 = i13;
                            i8 = i14;
                        }
                    } else if (view5 == null) {
                        i5 = i11;
                        view4 = view6;
                        boolean z3 = false;
                        if (mo4442a(i15, false, true)) {
                            i7 = i13;
                            if (min > i7) {
                                i8 = i14;
                                z = true;
                            } else if (min == i7) {
                                i8 = i14;
                                if (i16 > i8) {
                                    z3 = true;
                                }
                                if (z2 == z3) {
                                    z = true;
                                }
                            } else {
                                i8 = i14;
                            }
                        } else {
                            i7 = i13;
                            i8 = i14;
                        }
                    } else {
                        i5 = i11;
                        view4 = view6;
                        i7 = i13;
                        i8 = i14;
                    }
                    z = false;
                } else {
                    i5 = i11;
                    view4 = view6;
                    i7 = i13;
                    i8 = i14;
                    z = true;
                }
                if (z) {
                    if (i15.hasFocusable()) {
                        int i18 = bVar2.f2769a;
                        view6 = view4;
                        i12 = Math.min(i17, i10) - Math.max(i16, i9);
                        i5 = i18;
                        i14 = i8;
                        view5 = i15;
                    } else {
                        view6 = i15;
                        i14 = bVar2.f2769a;
                        i7 = Math.min(i17, i10) - Math.max(i16, i9);
                    }
                    i4 += i2;
                    i13 = i7;
                    e = view3;
                    i3 = i6;
                    i11 = i5;
                    pVar2 = pVar;
                    uVar2 = uVar;
                }
            } else if (view5 != null) {
                view2 = view6;
                break;
            } else {
                view3 = e;
                i5 = i11;
                view4 = view6;
                i6 = i3;
                i7 = i13;
                i8 = i14;
            }
            view6 = view4;
            i14 = i8;
            i4 += i2;
            i13 = i7;
            e = view3;
            i3 = i6;
            i11 = i5;
            pVar2 = pVar;
            uVar2 = uVar;
        }
        return view5 != null ? view5 : view2;
    }

    /* renamed from: b */
    public boolean mo3535b() {
        return this.f2786n == null && !this.f2761a;
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C0796a extends C0798c {
        /* renamed from: a */
        public int mo3537a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo3538a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C0797b extends C0904ay.C0927j {

        /* renamed from: a */
        int f2769a = -1;

        /* renamed from: b */
        int f2770b = 0;

        public C0797b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0797b(int i, int i2) {
            super(i, i2);
        }

        public C0797b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0797b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo3539a() {
            return this.f2769a;
        }

        /* renamed from: b */
        public int mo3540b() {
            return this.f2770b;
        }
    }
}
