package com.android.p046a;

/* renamed from: com.android.a.e */
public class C1078e implements C1099r {

    /* renamed from: a */
    private int f3881a;

    /* renamed from: b */
    private int f3882b;

    /* renamed from: c */
    private final int f3883c;

    /* renamed from: d */
    private final float f3884d;

    public C1078e() {
        this(2500, 1, 1.0f);
    }

    public C1078e(int i, int i2, float f) {
        this.f3881a = i;
        this.f3883c = i2;
        this.f3884d = f;
    }

    /* renamed from: a */
    public int mo5164a() {
        return this.f3881a;
    }

    /* renamed from: b */
    public int mo5166b() {
        return this.f3882b;
    }

    /* renamed from: a */
    public void mo5165a(C1102u uVar) {
        this.f3882b++;
        int i = this.f3881a;
        this.f3881a = (int) (((float) i) + (((float) i) * this.f3884d));
        if (!mo5167c()) {
            throw uVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5167c() {
        return this.f3882b <= this.f3883c;
    }
}
