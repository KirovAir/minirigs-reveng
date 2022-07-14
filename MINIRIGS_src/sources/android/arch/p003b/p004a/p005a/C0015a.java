package android.arch.p003b.p004a.p005a;

import android.arch.p003b.p004a.C0014a;
import android.arch.p003b.p004a.C0023b;
import android.arch.p003b.p004a.C0030e;
import android.arch.p003b.p004a.C0031f;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* renamed from: android.arch.b.a.a.a */
class C0015a implements C0023b {

    /* renamed from: a */
    private static final String[] f24a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f25b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f26c;

    C0015a(SQLiteDatabase sQLiteDatabase) {
        this.f26c = sQLiteDatabase;
    }

    /* renamed from: a */
    public C0031f mo36a(String str) {
        return new C0022e(this.f26c.compileStatement(str));
    }

    /* renamed from: a */
    public void mo38a() {
        this.f26c.beginTransaction();
    }

    /* renamed from: b */
    public void mo40b() {
        this.f26c.endTransaction();
    }

    /* renamed from: c */
    public void mo41c() {
        this.f26c.setTransactionSuccessful();
    }

    /* renamed from: d */
    public boolean mo44d() {
        return this.f26c.inTransaction();
    }

    /* renamed from: b */
    public Cursor mo39b(String str) {
        return mo37a((C0030e) new C0014a(str));
    }

    /* renamed from: a */
    public Cursor mo37a(final C0030e eVar) {
        return this.f26c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo35a(new C0021d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo34a(), f25b, (String) null);
    }

    /* renamed from: c */
    public void mo42c(String str) {
        this.f26c.execSQL(str);
    }

    /* renamed from: e */
    public boolean mo45e() {
        return this.f26c.isOpen();
    }

    /* renamed from: f */
    public String mo46f() {
        return this.f26c.getPath();
    }

    /* renamed from: g */
    public List<Pair<String, String>> mo47g() {
        return this.f26c.getAttachedDbs();
    }

    public void close() {
        this.f26c.close();
    }
}
