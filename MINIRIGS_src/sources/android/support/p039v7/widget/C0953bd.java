package android.support.p039v7.widget;

/* renamed from: android.support.v7.widget.bd */
class C0953bd {

    /* renamed from: a */
    private int f3486a = 0;

    /* renamed from: b */
    private int f3487b = 0;

    /* renamed from: c */
    private int f3488c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f3489d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f3490e = 0;

    /* renamed from: f */
    private int f3491f = 0;

    /* renamed from: g */
    private boolean f3492g = false;

    /* renamed from: h */
    private boolean f3493h = false;

    C0953bd() {
    }

    /* renamed from: a */
    public int mo4717a() {
        return this.f3486a;
    }

    /* renamed from: b */
    public int mo4720b() {
        return this.f3487b;
    }

    /* renamed from: c */
    public int mo4722c() {
        return this.f3492g ? this.f3487b : this.f3486a;
    }

    /* renamed from: d */
    public int mo4723d() {
        return this.f3492g ? this.f3486a : this.f3487b;
    }

    /* renamed from: a */
    public void mo4718a(int i, int i2) {
        this.f3488c = i;
        this.f3489d = i2;
        this.f3493h = true;
        if (this.f3492g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3486a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3487b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3486a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3487b = i2;
        }
    }

    /* renamed from: b */
    public void mo4721b(int i, int i2) {
        this.f3493h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3490e = i;
            this.f3486a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3491f = i2;
            this.f3487b = i2;
        }
    }

    /* renamed from: a */
    public void mo4719a(boolean z) {
        if (z != this.f3492g) {
            this.f3492g = z;
            if (!this.f3493h) {
                this.f3486a = this.f3490e;
                this.f3487b = this.f3491f;
            } else if (z) {
                int i = this.f3489d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f3490e;
                }
                this.f3486a = i;
                int i2 = this.f3488c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f3491f;
                }
                this.f3487b = i2;
            } else {
                int i3 = this.f3488c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f3490e;
                }
                this.f3486a = i3;
                int i4 = this.f3489d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f3491f;
                }
                this.f3487b = i4;
            }
        }
    }
}
