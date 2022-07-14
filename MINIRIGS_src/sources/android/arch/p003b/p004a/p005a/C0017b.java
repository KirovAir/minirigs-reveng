package android.arch.p003b.p004a.p005a;

import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0024c;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: android.arch.b.a.a.b */
class C0017b implements C0024c {

    /* renamed from: a */
    private final C0018a f29a;

    C0017b(Context context, String str, C0024c.C0025a aVar) {
        this.f29a = m52a(context, str, aVar);
    }

    /* renamed from: a */
    private C0018a m52a(Context context, String str, C0024c.C0025a aVar) {
        return new C0018a(context, str, new C0015a[1], aVar);
    }

    /* renamed from: a */
    public void mo50a(boolean z) {
        this.f29a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    public C0023b mo49a() {
        return this.f29a.mo52a();
    }

    /* renamed from: android.arch.b.a.a.b$a */
    static class C0018a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C0015a[] f30a;

        /* renamed from: b */
        final C0024c.C0025a f31b;

        /* renamed from: c */
        private boolean f32c;

        C0018a(Context context, String str, final C0015a[] aVarArr, final C0024c.C0025a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f37a, new DatabaseErrorHandler() {
                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C0015a aVar = aVarArr[0];
                    if (aVar != null) {
                        aVar.mo74d(aVar);
                    }
                }
            });
            this.f31b = aVar;
            this.f30a = aVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C0023b mo52a() {
            this.f32c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f32c) {
                close();
                return mo52a();
            }
            return mo51a(writableDatabase);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0015a mo51a(SQLiteDatabase sQLiteDatabase) {
            if (this.f30a[0] == null) {
                this.f30a[0] = new C0015a(sQLiteDatabase);
            }
            return this.f30a[0];
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f31b.mo71b(mo51a(sQLiteDatabase));
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f32c = true;
            this.f31b.mo70a(mo51a(sQLiteDatabase), i, i2);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f31b.mo69a((C0023b) mo51a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f32c = true;
            this.f31b.mo72b(mo51a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f32c) {
                this.f31b.mo73c(mo51a(sQLiteDatabase));
            }
        }

        public synchronized void close() {
            super.close();
            this.f30a[0] = null;
        }
    }
}
