package android.support.p039v7.widget;

import android.support.p039v7.widget.C0904ay;
import android.view.View;

/* renamed from: android.support.v7.widget.ar */
class C0885ar {

    /* renamed from: a */
    boolean f3169a = true;

    /* renamed from: b */
    int f3170b;

    /* renamed from: c */
    int f3171c;

    /* renamed from: d */
    int f3172d;

    /* renamed from: e */
    int f3173e;

    /* renamed from: f */
    int f3174f = 0;

    /* renamed from: g */
    int f3175g = 0;

    /* renamed from: h */
    boolean f3176h;

    /* renamed from: i */
    boolean f3177i;

    C0885ar() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4081a(C0904ay.C0942u uVar) {
        int i = this.f3171c;
        return i >= 0 && i < uVar.mo4581e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4080a(C0904ay.C0934p pVar) {
        View c = pVar.mo4536c(this.f3171c);
        this.f3171c += this.f3172d;
        return c;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3170b + ", mCurrentPosition=" + this.f3171c + ", mItemDirection=" + this.f3172d + ", mLayoutDirection=" + this.f3173e + ", mStartLine=" + this.f3174f + ", mEndLine=" + this.f3175g + '}';
    }
}
