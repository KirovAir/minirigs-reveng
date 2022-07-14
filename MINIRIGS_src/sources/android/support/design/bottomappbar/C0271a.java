package android.support.design.bottomappbar;

import android.support.design.p023g.C0290b;
import android.support.design.p023g.C0292d;

/* renamed from: android.support.design.bottomappbar.a */
public class C0271a extends C0290b {

    /* renamed from: a */
    private float f841a;

    /* renamed from: b */
    private float f842b;

    /* renamed from: c */
    private float f843c;

    /* renamed from: d */
    private float f844d;

    /* renamed from: e */
    private float f845e;

    /* renamed from: a */
    public void mo878a(float f, float f2, C0292d dVar) {
        float f3 = f;
        C0292d dVar2 = dVar;
        float f4 = this.f843c;
        if (f4 == 0.0f) {
            dVar2.mo945b(f3, 0.0f);
            return;
        }
        float f5 = ((this.f842b * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.f841a;
        float f7 = (f3 / 2.0f) + this.f845e;
        float f8 = (this.f844d * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            dVar2.mo945b(f3, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        dVar2.mo945b(f14, 0.0f);
        float f15 = f6 * 2.0f;
        float f16 = degrees;
        dVar.mo943a(f14, 0.0f, f11 + f6, f15, 270.0f, degrees);
        dVar.mo943a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        dVar.mo943a(f12 - f6, 0.0f, f12 + f6, f15, 270.0f - f16, f16);
        dVar2.mo945b(f3, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo877a(float f) {
        this.f845e = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo876a() {
        return this.f845e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo879b() {
        return this.f844d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo880b(float f) {
        this.f844d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo881c() {
        return this.f843c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo882c(float f) {
        this.f843c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo883d() {
        return this.f842b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo884d(float f) {
        this.f842b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo885e() {
        return this.f841a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo886e(float f) {
        this.f841a = f;
    }
}
