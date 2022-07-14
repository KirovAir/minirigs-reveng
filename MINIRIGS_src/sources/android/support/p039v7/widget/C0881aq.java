package android.support.p039v7.widget;

import android.support.p026v4.p032d.C0492a;
import android.support.p039v7.widget.C0904ay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.aq */
final class C0881aq implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C0881aq> f3154a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C0884b> f3155e = new Comparator<C0884b>() {
        /* renamed from: a */
        public int compare(C0884b bVar, C0884b bVar2) {
            if ((bVar.f3167d == null) != (bVar2.f3167d == null)) {
                if (bVar.f3167d == null) {
                    return 1;
                }
                return -1;
            } else if (bVar.f3164a == bVar2.f3164a) {
                int i = bVar2.f3165b - bVar.f3165b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar.f3166c - bVar2.f3166c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (bVar.f3164a) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    /* renamed from: b */
    ArrayList<C0904ay> f3156b = new ArrayList<>();

    /* renamed from: c */
    long f3157c;

    /* renamed from: d */
    long f3158d;

    /* renamed from: f */
    private ArrayList<C0884b> f3159f = new ArrayList<>();

    C0881aq() {
    }

    /* renamed from: android.support.v7.widget.aq$b */
    static class C0884b {

        /* renamed from: a */
        public boolean f3164a;

        /* renamed from: b */
        public int f3165b;

        /* renamed from: c */
        public int f3166c;

        /* renamed from: d */
        public C0904ay f3167d;

        /* renamed from: e */
        public int f3168e;

        C0884b() {
        }

        /* renamed from: a */
        public void mo4079a() {
            this.f3164a = false;
            this.f3165b = 0;
            this.f3166c = 0;
            this.f3167d = null;
            this.f3168e = 0;
        }
    }

    /* renamed from: android.support.v7.widget.aq$a */
    static class C0883a implements C0904ay.C0922i.C0925a {

        /* renamed from: a */
        int f3160a;

        /* renamed from: b */
        int f3161b;

        /* renamed from: c */
        int[] f3162c;

        /* renamed from: d */
        int f3163d;

        C0883a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4075a(int i, int i2) {
            this.f3160a = i;
            this.f3161b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4076a(C0904ay ayVar, boolean z) {
            this.f3163d = 0;
            int[] iArr = this.f3162c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0904ay.C0922i iVar = ayVar.f3319n;
            if (ayVar.f3318m != null && iVar != null && iVar.mo4482p()) {
                if (z) {
                    if (!ayVar.f3311f.mo4883d()) {
                        iVar.mo3548a(ayVar.f3318m.mo4361a(), (C0904ay.C0922i.C0925a) this);
                    }
                } else if (!ayVar.mo4342v()) {
                    iVar.mo3547a(this.f3160a, this.f3161b, ayVar.f3261D, (C0904ay.C0922i.C0925a) this);
                }
                if (this.f3163d > iVar.f3366x) {
                    iVar.f3366x = this.f3163d;
                    iVar.f3367y = z;
                    ayVar.f3310e.mo4532b();
                }
            }
        }

        /* renamed from: b */
        public void mo4078b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3163d * 2;
                int[] iArr = this.f3162c;
                if (iArr == null) {
                    this.f3162c = new int[4];
                    Arrays.fill(this.f3162c, -1);
                } else if (i3 >= iArr.length) {
                    this.f3162c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f3162c, 0, iArr.length);
                }
                int[] iArr2 = this.f3162c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f3163d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4077a(int i) {
            if (this.f3162c != null) {
                int i2 = this.f3163d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3162c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4074a() {
            int[] iArr = this.f3162c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3163d = 0;
        }
    }

    /* renamed from: a */
    public void mo4068a(C0904ay ayVar) {
        this.f3156b.add(ayVar);
    }

    /* renamed from: b */
    public void mo4070b(C0904ay ayVar) {
        this.f3156b.remove(ayVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4069a(C0904ay ayVar, int i, int i2) {
        if (ayVar.isAttachedToWindow() && this.f3157c == 0) {
            this.f3157c = ayVar.getNanoTime();
            ayVar.post(this);
        }
        ayVar.f3260C.mo4075a(i, i2);
    }

    /* renamed from: a */
    private void m4349a() {
        C0884b bVar;
        int size = this.f3156b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0904ay ayVar = this.f3156b.get(i2);
            if (ayVar.getWindowVisibility() == 0) {
                ayVar.f3260C.mo4076a(ayVar, false);
                i += ayVar.f3260C.f3163d;
            }
        }
        this.f3159f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0904ay ayVar2 = this.f3156b.get(i4);
            if (ayVar2.getWindowVisibility() == 0) {
                C0883a aVar = ayVar2.f3260C;
                int abs = Math.abs(aVar.f3160a) + Math.abs(aVar.f3161b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f3163d * 2; i6 += 2) {
                    if (i5 >= this.f3159f.size()) {
                        bVar = new C0884b();
                        this.f3159f.add(bVar);
                    } else {
                        bVar = this.f3159f.get(i5);
                    }
                    int i7 = aVar.f3162c[i6 + 1];
                    bVar.f3164a = i7 <= abs;
                    bVar.f3165b = abs;
                    bVar.f3166c = i7;
                    bVar.f3167d = ayVar2;
                    bVar.f3168e = aVar.f3162c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3159f, f3155e);
    }

    /* renamed from: a */
    static boolean m4352a(C0904ay ayVar, int i) {
        int c = ayVar.f3312g.mo3938c();
        for (int i2 = 0; i2 < c; i2++) {
            C0904ay.C0945x e = C0904ay.m4521e(ayVar.f3312g.mo3941d(i2));
            if (e.f3436c == i && !e.mo4616n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C0904ay.C0945x m4348a(C0904ay ayVar, int i, long j) {
        if (m4352a(ayVar, i)) {
            return null;
        }
        C0904ay.C0934p pVar = ayVar.f3310e;
        try {
            ayVar.mo4291l();
            C0904ay.C0945x a = pVar.mo4517a(i, false, j);
            if (a != null) {
                if (!a.mo4618p() || a.mo4616n()) {
                    pVar.mo4527a(a, false);
                } else {
                    pVar.mo4528a(a.f3434a);
                }
            }
            return a;
        } finally {
            ayVar.mo4219b(false);
        }
    }

    /* renamed from: a */
    private void m4351a(C0904ay ayVar, long j) {
        if (ayVar != null) {
            if (ayVar.f3329x && ayVar.f3312g.mo3938c() != 0) {
                ayVar.mo4224c();
            }
            C0883a aVar = ayVar.f3260C;
            aVar.mo4076a(ayVar, true);
            if (aVar.f3163d != 0) {
                try {
                    C0492a.m2183a("RV Nested Prefetch");
                    ayVar.f3261D.mo4576a(ayVar.f3318m);
                    for (int i = 0; i < aVar.f3163d * 2; i += 2) {
                        m4348a(ayVar, aVar.f3162c[i], j);
                    }
                } finally {
                    C0492a.m2182a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m4350a(C0884b bVar, long j) {
        C0904ay.C0945x a = m4348a(bVar.f3167d, bVar.f3168e, bVar.f3164a ? Long.MAX_VALUE : j);
        if (a != null && a.f3435b != null && a.mo4618p() && !a.mo4616n()) {
            m4351a((C0904ay) a.f3435b.get(), j);
        }
    }

    /* renamed from: b */
    private void m4353b(long j) {
        int i = 0;
        while (i < this.f3159f.size()) {
            C0884b bVar = this.f3159f.get(i);
            if (bVar.f3167d != null) {
                m4350a(bVar, j);
                bVar.mo4079a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4067a(long j) {
        m4349a();
        m4353b(j);
    }

    public void run() {
        try {
            C0492a.m2183a("RV Prefetch");
            if (!this.f3156b.isEmpty()) {
                int size = this.f3156b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    C0904ay ayVar = this.f3156b.get(i);
                    if (ayVar.getWindowVisibility() == 0) {
                        j = Math.max(ayVar.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.f3157c = 0;
                    C0492a.m2182a();
                    return;
                }
                mo4067a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3158d);
                this.f3157c = 0;
                C0492a.m2182a();
            }
        } finally {
            this.f3157c = 0;
            C0492a.m2182a();
        }
    }
}
