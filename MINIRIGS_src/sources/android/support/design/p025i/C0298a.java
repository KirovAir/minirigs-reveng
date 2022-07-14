package android.support.design.p025i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.p035g.C0532l;
import android.support.p026v4.p036h.C0556a;

/* renamed from: android.support.design.i.a */
public class C0298a extends C0556a {
    public static final Parcelable.Creator<C0298a> CREATOR = new Parcelable.ClassLoaderCreator<C0298a>() {
        /* renamed from: a */
        public C0298a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0298a(parcel, classLoader);
        }

        /* renamed from: a */
        public C0298a createFromParcel(Parcel parcel) {
            return new C0298a(parcel, (ClassLoader) null);
        }

        /* renamed from: a */
        public C0298a[] newArray(int i) {
            return new C0298a[i];
        }
    };

    /* renamed from: a */
    public final C0532l<String, Bundle> f930a;

    public C0298a(Parcelable parcelable) {
        super(parcelable);
        this.f930a = new C0532l<>();
    }

    private C0298a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f930a = new C0532l<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f930a.put(strArr[i], bundleArr[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f930a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f930a.mo2095b(i2);
            bundleArr[i2] = this.f930a.mo2096c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f930a + "}";
    }
}
