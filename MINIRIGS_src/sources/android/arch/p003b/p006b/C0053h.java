package android.arch.p003b.p006b;

import android.arch.p003b.p004a.C0014a;
import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0024c;
import android.arch.p003b.p004a.C0030e;
import android.arch.p003b.p006b.p007a.C0033a;
import android.database.Cursor;
import java.util.List;

/* renamed from: android.arch.b.b.h */
public class C0053h extends C0024c.C0025a {

    /* renamed from: b */
    private C0032a f121b;

    /* renamed from: c */
    private final C0054a f122c;

    /* renamed from: d */
    private final String f123d;

    /* renamed from: e */
    private final String f124e;

    public C0053h(C0032a aVar, C0054a aVar2, String str, String str2) {
        super(aVar2.f125a);
        this.f121b = aVar;
        this.f122c = aVar2;
        this.f123d = str;
        this.f124e = str2;
    }

    /* renamed from: a */
    public void mo69a(C0023b bVar) {
        super.mo69a(bVar);
    }

    /* renamed from: b */
    public void mo71b(C0023b bVar) {
        m160f(bVar);
        this.f122c.mo131b(bVar);
        this.f122c.mo133d(bVar);
    }

    /* renamed from: a */
    public void mo70a(C0023b bVar, int i, int i2) {
        boolean z;
        List<C0033a> a;
        C0032a aVar = this.f121b;
        if (aVar == null || (a = aVar.f47d.mo129a(i, i2)) == null) {
            z = false;
        } else {
            for (C0033a a2 : a) {
                a2.mo79a(bVar);
            }
            this.f122c.mo134e(bVar);
            m160f(bVar);
            z = true;
        }
        if (!z) {
            C0032a aVar2 = this.f121b;
            if (aVar2 == null || aVar2.mo78a(i)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the " + "necessary Migration path via " + "RoomDatabase.Builder.addMigration(Migration ...) or allow for " + "destructive migrations via one of the " + "RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f122c.mo130a(bVar);
            this.f122c.mo131b(bVar);
        }
    }

    /* renamed from: b */
    public void mo72b(C0023b bVar, int i, int i2) {
        mo70a(bVar, i, i2);
    }

    /* renamed from: c */
    public void mo73c(C0023b bVar) {
        super.mo73c(bVar);
        m159e(bVar);
        this.f122c.mo132c(bVar);
        this.f121b = null;
    }

    /* renamed from: e */
    private void m159e(C0023b bVar) {
        String str = null;
        if (m162h(bVar)) {
            Cursor a = bVar.mo37a((C0030e) new C0014a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    str = a.getString(0);
                }
            } finally {
                a.close();
            }
        }
        if (!this.f123d.equals(str) && !this.f124e.equals(str)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    /* renamed from: f */
    private void m160f(C0023b bVar) {
        m161g(bVar);
        bVar.mo42c(C0052g.m158a(this.f123d));
    }

    /* renamed from: g */
    private void m161g(C0023b bVar) {
        bVar.mo42c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: h */
    private static boolean m162h(C0023b bVar) {
        Cursor b = bVar.mo39b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    /* renamed from: android.arch.b.b.h$a */
    public static abstract class C0054a {

        /* renamed from: a */
        public final int f125a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo130a(C0023b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo131b(C0023b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo132c(C0023b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo133d(C0023b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo134e(C0023b bVar);

        public C0054a(int i) {
            this.f125a = i;
        }
    }
}
