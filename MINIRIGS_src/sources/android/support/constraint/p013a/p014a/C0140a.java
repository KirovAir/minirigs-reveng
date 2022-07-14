package android.support.constraint.p013a.p014a;

/* renamed from: android.support.constraint.a.a.a */
public class C0140a {

    /* renamed from: h */
    private static boolean f400h = false;

    /* renamed from: a */
    private final C0147c f401a;

    /* renamed from: b */
    private C0141a f402b = new C0141a();

    /* renamed from: c */
    private C0141a f403c = new C0141a();

    /* renamed from: d */
    private C0141a f404d = new C0141a();

    /* renamed from: e */
    private long f405e = 0;

    /* renamed from: f */
    private long f406f = 350;

    /* renamed from: g */
    private boolean f407g = false;

    /* renamed from: a */
    public static double m443a(double d, double d2, double d3) {
        double d4 = (d3 - d2) / 2.0d;
        double d5 = d * 2.0d;
        if (d5 < 1.0d) {
            return (d4 * d5 * d5) + d2;
        }
        double d6 = d5 - 1.0d;
        return ((-d4) * ((d6 * (d6 - 2.0d)) - 1.0d)) + d2;
    }

    /* renamed from: a */
    public static void m445a(boolean z) {
        f400h = z;
    }

    /* renamed from: a */
    public static boolean m446a() {
        return f400h;
    }

    public C0140a(C0147c cVar) {
        this.f401a = cVar;
    }

    /* renamed from: b */
    public boolean mo425b() {
        return this.f407g;
    }

    /* renamed from: c */
    public void mo426c() {
        this.f405e = System.currentTimeMillis();
        this.f407g = true;
    }

    /* renamed from: a */
    private static int m444a(float f, float f2, float f3) {
        return (int) m443a((double) f, (double) f2, (double) f3);
    }

    /* renamed from: d */
    public void mo427d() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f405e;
        long j2 = this.f406f;
        if (currentTimeMillis > j + j2 || currentTimeMillis < j) {
            this.f404d.f408a = this.f402b.f408a;
            this.f404d.f410c = this.f402b.f410c;
            this.f404d.f409b = this.f402b.f409b;
            this.f404d.f411d = this.f402b.f411d;
            this.f407g = false;
            return;
        }
        float f = ((float) (currentTimeMillis - j)) / ((float) j2);
        this.f404d.f408a = m444a(f, (float) this.f403c.f408a, (float) this.f402b.f408a);
        this.f404d.f409b = m444a(f, (float) this.f403c.f409b, (float) this.f402b.f409b);
        this.f404d.f410c = m444a(f, (float) this.f403c.f410c, (float) this.f402b.f410c);
        this.f404d.f411d = m444a(f, (float) this.f403c.f411d, (float) this.f402b.f411d);
    }

    /* renamed from: a */
    public void mo424a(int i, int i2, int i3, int i4) {
        this.f404d.mo432a(i, i2, i3, i4);
        if (!mo425b() && !(i == this.f401a.mo474e() && i2 == this.f401a.mo476f() && i3 == this.f401a.mo478g() && i4 == this.f401a.mo480h())) {
            this.f403c.mo432a(this.f401a.mo474e(), this.f401a.mo476f(), this.f401a.mo478g(), this.f401a.mo480h());
            mo426c();
        }
        if (mo425b()) {
            this.f402b.mo432a(i, i2, i3, i4);
            mo427d();
        }
    }

    /* renamed from: e */
    public int mo428e() {
        return this.f404d.f408a;
    }

    /* renamed from: f */
    public int mo429f() {
        return this.f404d.f410c;
    }

    /* renamed from: g */
    public int mo430g() {
        return this.f404d.f409b;
    }

    /* renamed from: h */
    public int mo431h() {
        return this.f404d.f411d;
    }

    /* renamed from: android.support.constraint.a.a.a$a */
    static class C0141a {

        /* renamed from: a */
        int f408a;

        /* renamed from: b */
        int f409b;

        /* renamed from: c */
        int f410c;

        /* renamed from: d */
        int f411d;

        C0141a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo432a(int i, int i2, int i3, int i4) {
            this.f408a = i;
            this.f410c = i2;
            this.f409b = i3;
            this.f411d = i4;
        }
    }
}
