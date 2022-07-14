package android.arch.p003b.p006b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.arch.p000a.p001a.C0000a;
import android.arch.p003b.p004a.C0014a;
import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0024c;
import android.arch.p003b.p004a.C0030e;
import android.arch.p003b.p004a.C0031f;
import android.arch.p003b.p004a.p005a.C0020c;
import android.arch.p003b.p006b.p007a.C0033a;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.support.p026v4.app.C0419b;
import android.support.p026v4.p035g.C0533m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.arch.b.b.f */
public abstract class C0047f {

    /* renamed from: a */
    protected volatile C0023b f98a;

    /* renamed from: b */
    boolean f99b;

    /* renamed from: c */
    protected List<C0049b> f100c;

    /* renamed from: d */
    private C0024c f101d;

    /* renamed from: e */
    private final C0041d f102e = mo116c();

    /* renamed from: f */
    private boolean f103f;

    /* renamed from: g */
    private final ReentrantLock f104g = new ReentrantLock();

    /* renamed from: android.arch.b.b.f$b */
    public static abstract class C0049b {
        /* renamed from: a */
        public void mo126a(C0023b bVar) {
        }

        /* renamed from: b */
        public void mo127b(C0023b bVar) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0024c mo115b(C0032a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C0041d mo116c();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Lock mo111a() {
        return this.f104g;
    }

    /* renamed from: a */
    public void mo113a(C0032a aVar) {
        this.f101d = mo115b(aVar);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f50g == C0050c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f101d.mo50a(z);
        }
        this.f100c = aVar.f48e;
        this.f103f = aVar.f49f;
        this.f99b = z;
    }

    /* renamed from: b */
    public C0024c mo114b() {
        return this.f101d;
    }

    /* renamed from: d */
    public boolean mo117d() {
        C0023b bVar = this.f98a;
        return bVar != null && bVar.mo45e();
    }

    /* renamed from: e */
    public void mo118e() {
        if (!this.f103f && C0000a.m0a().mo3b()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: a */
    public Cursor mo110a(String str, Object[] objArr) {
        return this.f101d.mo49a().mo37a((C0030e) new C0014a(str, objArr));
    }

    /* renamed from: a */
    public Cursor mo109a(C0030e eVar) {
        mo118e();
        return this.f101d.mo49a().mo37a(eVar);
    }

    /* renamed from: a */
    public C0031f mo108a(String str) {
        mo118e();
        return this.f101d.mo49a().mo36a(str);
    }

    /* renamed from: f */
    public void mo119f() {
        mo118e();
        C0023b a = this.f101d.mo49a();
        this.f102e.mo102b(a);
        a.mo38a();
    }

    /* renamed from: g */
    public void mo120g() {
        this.f101d.mo49a().mo40b();
        if (!mo122i()) {
            this.f102e.mo100a();
        }
    }

    /* renamed from: h */
    public void mo121h() {
        this.f101d.mo49a().mo41c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112a(C0023b bVar) {
        this.f102e.mo101a(bVar);
    }

    /* renamed from: i */
    public boolean mo122i() {
        return this.f101d.mo49a().mo44d();
    }

    /* renamed from: android.arch.b.b.f$c */
    public enum C0050c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C0050c mo128a(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || C0419b.m1727a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: android.arch.b.b.f$a */
    public static class C0048a<T extends C0047f> {

        /* renamed from: a */
        private final Class<T> f105a;

        /* renamed from: b */
        private final String f106b;

        /* renamed from: c */
        private final Context f107c;

        /* renamed from: d */
        private ArrayList<C0049b> f108d;

        /* renamed from: e */
        private C0024c.C0028c f109e;

        /* renamed from: f */
        private boolean f110f;

        /* renamed from: g */
        private C0050c f111g = C0050c.AUTOMATIC;

        /* renamed from: h */
        private boolean f112h = true;

        /* renamed from: i */
        private final C0051d f113i = new C0051d();

        /* renamed from: j */
        private Set<Integer> f114j;

        /* renamed from: k */
        private Set<Integer> f115k;

        C0048a(Context context, Class<T> cls, String str) {
            this.f107c = context;
            this.f105a = cls;
            this.f106b = str;
        }

        /* renamed from: a */
        public C0048a<T> mo123a() {
            this.f110f = true;
            return this;
        }

        /* renamed from: b */
        public C0048a<T> mo124b() {
            this.f112h = false;
            return this;
        }

        /* renamed from: c */
        public T mo125c() {
            if (this.f107c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f105a != null) {
                Set<Integer> set = this.f115k;
                if (!(set == null || this.f114j == null)) {
                    for (Integer next : set) {
                        if (this.f114j.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f109e == null) {
                    this.f109e = new C0020c();
                }
                Context context = this.f107c;
                C0032a aVar = new C0032a(context, this.f106b, this.f109e, this.f113i, this.f108d, this.f110f, this.f111g.mo128a(context), this.f112h, this.f114j);
                T t = (C0047f) C0046e.m134a(this.f105a, "_Impl");
                t.mo113a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    /* renamed from: android.arch.b.b.f$d */
    public static class C0051d {

        /* renamed from: a */
        private C0533m<C0533m<C0033a>> f120a = new C0533m<>();

        /* renamed from: a */
        public List<C0033a> mo129a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m156a(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: a */
        private List<C0033a> m156a(List<C0033a> list, boolean z, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5 = z ? -1 : 1;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0533m a = this.f120a.mo2110a(i);
                if (a != null) {
                    int b = a.mo2112b();
                    z2 = false;
                    if (z) {
                        i4 = b - 1;
                        i3 = -1;
                    } else {
                        i3 = b;
                        i4 = 0;
                    }
                    while (true) {
                        if (i4 == i3) {
                            break;
                        }
                        int d = a.mo2119d(i4);
                        if (z ? d <= i2 && d > i : d >= i2 && d < i) {
                            list.add(a.mo2120e(i4));
                            i = d;
                            z2 = true;
                            continue;
                            break;
                        }
                        i4 += i5;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }
}
