package android.support.p026v4.p036h;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.h.a */
public abstract class C0556a implements Parcelable {
    public static final Parcelable.Creator<C0556a> CREATOR = new Parcelable.ClassLoaderCreator<C0556a>() {
        /* renamed from: a */
        public C0556a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0556a.f1798d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public C0556a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: a */
        public C0556a[] newArray(int i) {
            return new C0556a[i];
        }
    };

    /* renamed from: d */
    public static final C0556a f1798d = new C0556a() {
    };

    /* renamed from: a */
    private final Parcelable f1799a;

    public int describeContents() {
        return 0;
    }

    private C0556a() {
        this.f1799a = null;
    }

    protected C0556a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1799a = parcelable == f1798d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected C0556a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1799a = readParcelable == null ? f1798d : readParcelable;
    }

    /* renamed from: a */
    public final Parcelable mo2188a() {
        return this.f1799a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1799a, i);
    }
}
