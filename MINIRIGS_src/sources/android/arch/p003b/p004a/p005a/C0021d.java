package android.arch.p003b.p004a.p005a;

import android.arch.p003b.p004a.C0029d;
import android.database.sqlite.SQLiteProgram;

/* renamed from: android.arch.b.a.a.d */
class C0021d implements C0029d {

    /* renamed from: a */
    private final SQLiteProgram f35a;

    C0021d(SQLiteProgram sQLiteProgram) {
        this.f35a = sQLiteProgram;
    }

    /* renamed from: a */
    public void mo61a(int i) {
        this.f35a.bindNull(i);
    }

    /* renamed from: a */
    public void mo63a(int i, long j) {
        this.f35a.bindLong(i, j);
    }

    /* renamed from: a */
    public void mo62a(int i, double d) {
        this.f35a.bindDouble(i, d);
    }

    /* renamed from: a */
    public void mo64a(int i, String str) {
        this.f35a.bindString(i, str);
    }

    /* renamed from: a */
    public void mo65a(int i, byte[] bArr) {
        this.f35a.bindBlob(i, bArr);
    }

    public void close() {
        this.f35a.close();
    }
}
