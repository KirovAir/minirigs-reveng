package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
class C1038b extends C1037a {

    /* renamed from: a */
    private final SparseIntArray f3779a;

    /* renamed from: b */
    private final Parcel f3780b;

    /* renamed from: c */
    private final int f3781c;

    /* renamed from: d */
    private final int f3782d;

    /* renamed from: e */
    private final String f3783e;

    /* renamed from: f */
    private int f3784f;

    /* renamed from: g */
    private int f3785g;

    C1038b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C1038b(Parcel parcel, int i, int i2, String str) {
        this.f3779a = new SparseIntArray();
        this.f3784f = -1;
        this.f3785g = 0;
        this.f3780b = parcel;
        this.f3781c = i;
        this.f3782d = i2;
        this.f3785g = this.f3781c;
        this.f3783e = str;
    }

    /* renamed from: d */
    private int m5450d(int i) {
        int readInt;
        do {
            int i2 = this.f3785g;
            if (i2 >= this.f3782d) {
                return -1;
            }
            this.f3780b.setDataPosition(i2);
            int readInt2 = this.f3780b.readInt();
            readInt = this.f3780b.readInt();
            this.f3785g += readInt2;
        } while (readInt != i);
        return this.f3780b.dataPosition();
    }

    /* renamed from: b */
    public boolean mo5082b(int i) {
        int d = m5450d(i);
        if (d == -1) {
            return false;
        }
        this.f3780b.setDataPosition(d);
        return true;
    }

    /* renamed from: c */
    public void mo5085c(int i) {
        mo5081b();
        this.f3784f = i;
        this.f3779a.put(i, this.f3780b.dataPosition());
        mo5067a(0);
        mo5067a(i);
    }

    /* renamed from: b */
    public void mo5081b() {
        int i = this.f3784f;
        if (i >= 0) {
            int i2 = this.f3779a.get(i);
            int dataPosition = this.f3780b.dataPosition();
            this.f3780b.setDataPosition(i2);
            this.f3780b.writeInt(dataPosition - i2);
            this.f3780b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1037a mo5084c() {
        Parcel parcel = this.f3780b;
        int dataPosition = parcel.dataPosition();
        int i = this.f3785g;
        if (i == this.f3781c) {
            i = this.f3782d;
        }
        return new C1038b(parcel, dataPosition, i, this.f3783e + "  ");
    }

    /* renamed from: a */
    public void mo5075a(byte[] bArr) {
        if (bArr != null) {
            this.f3780b.writeInt(bArr.length);
            this.f3780b.writeByteArray(bArr);
            return;
        }
        this.f3780b.writeInt(-1);
    }

    /* renamed from: a */
    public void mo5067a(int i) {
        this.f3780b.writeInt(i);
    }

    /* renamed from: a */
    public void mo5072a(String str) {
        this.f3780b.writeString(str);
    }

    /* renamed from: a */
    public void mo5069a(Parcelable parcelable) {
        this.f3780b.writeParcelable(parcelable, 0);
    }

    /* renamed from: d */
    public int mo5086d() {
        return this.f3780b.readInt();
    }

    /* renamed from: e */
    public String mo5087e() {
        return this.f3780b.readString();
    }

    /* renamed from: f */
    public byte[] mo5088f() {
        int readInt = this.f3780b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3780b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: g */
    public <T extends Parcelable> T mo5089g() {
        return this.f3780b.readParcelable(getClass().getClassLoader());
    }
}
