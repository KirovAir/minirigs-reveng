package android.arch.p003b.p004a.p005a;

import android.arch.p003b.p004a.C0031f;
import android.database.sqlite.SQLiteStatement;

/* renamed from: android.arch.b.a.a.e */
class C0022e extends C0021d implements C0031f {

    /* renamed from: a */
    private final SQLiteStatement f36a;

    C0022e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f36a = sQLiteStatement;
    }

    /* renamed from: a */
    public int mo67a() {
        return this.f36a.executeUpdateDelete();
    }

    /* renamed from: b */
    public long mo68b() {
        return this.f36a.executeInsert();
    }
}
