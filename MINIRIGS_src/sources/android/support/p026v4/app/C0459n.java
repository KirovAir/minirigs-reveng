package android.support.p026v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.n */
final class C0459n implements Parcelable {
    public static final Parcelable.Creator<C0459n> CREATOR = new Parcelable.Creator<C0459n>() {
        /* renamed from: a */
        public C0459n createFromParcel(Parcel parcel) {
            return new C0459n(parcel);
        }

        /* renamed from: a */
        public C0459n[] newArray(int i) {
            return new C0459n[i];
        }
    };

    /* renamed from: a */
    C0461o[] f1542a;

    /* renamed from: b */
    int[] f1543b;

    /* renamed from: c */
    C0423e[] f1544c;

    /* renamed from: d */
    int f1545d = -1;

    /* renamed from: e */
    int f1546e;

    public int describeContents() {
        return 0;
    }

    public C0459n() {
    }

    public C0459n(Parcel parcel) {
        this.f1542a = (C0461o[]) parcel.createTypedArray(C0461o.CREATOR);
        this.f1543b = parcel.createIntArray();
        this.f1544c = (C0423e[]) parcel.createTypedArray(C0423e.CREATOR);
        this.f1545d = parcel.readInt();
        this.f1546e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1542a, i);
        parcel.writeIntArray(this.f1543b);
        parcel.writeTypedArray(this.f1544c, i);
        parcel.writeInt(this.f1545d);
        parcel.writeInt(this.f1546e);
    }
}
