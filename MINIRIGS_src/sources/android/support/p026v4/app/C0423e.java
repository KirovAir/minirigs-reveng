package android.support.p026v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p026v4.app.C0421d;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.e */
final class C0423e implements Parcelable {
    public static final Parcelable.Creator<C0423e> CREATOR = new Parcelable.Creator<C0423e>() {
        /* renamed from: a */
        public C0423e createFromParcel(Parcel parcel) {
            return new C0423e(parcel);
        }

        /* renamed from: a */
        public C0423e[] newArray(int i) {
            return new C0423e[i];
        }
    };

    /* renamed from: a */
    final int[] f1367a;

    /* renamed from: b */
    final int f1368b;

    /* renamed from: c */
    final int f1369c;

    /* renamed from: d */
    final String f1370d;

    /* renamed from: e */
    final int f1371e;

    /* renamed from: f */
    final int f1372f;

    /* renamed from: g */
    final CharSequence f1373g;

    /* renamed from: h */
    final int f1374h;

    /* renamed from: i */
    final CharSequence f1375i;

    /* renamed from: j */
    final ArrayList<String> f1376j;

    /* renamed from: k */
    final ArrayList<String> f1377k;

    /* renamed from: l */
    final boolean f1378l;

    public int describeContents() {
        return 0;
    }

    public C0423e(C0421d dVar) {
        int size = dVar.f1341b.size();
        this.f1367a = new int[(size * 6)];
        if (dVar.f1348i) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0421d.C0422a aVar = dVar.f1341b.get(i);
                int i3 = i2 + 1;
                this.f1367a[i2] = aVar.f1361a;
                int i4 = i3 + 1;
                this.f1367a[i3] = aVar.f1362b != null ? aVar.f1362b.f1408f : -1;
                int i5 = i4 + 1;
                this.f1367a[i4] = aVar.f1363c;
                int i6 = i5 + 1;
                this.f1367a[i5] = aVar.f1364d;
                int i7 = i6 + 1;
                this.f1367a[i6] = aVar.f1365e;
                this.f1367a[i7] = aVar.f1366f;
                i++;
                i2 = i7 + 1;
            }
            this.f1368b = dVar.f1346g;
            this.f1369c = dVar.f1347h;
            this.f1370d = dVar.f1350k;
            this.f1371e = dVar.f1352m;
            this.f1372f = dVar.f1353n;
            this.f1373g = dVar.f1354o;
            this.f1374h = dVar.f1355p;
            this.f1375i = dVar.f1356q;
            this.f1376j = dVar.f1357r;
            this.f1377k = dVar.f1358s;
            this.f1378l = dVar.f1359t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0423e(Parcel parcel) {
        this.f1367a = parcel.createIntArray();
        this.f1368b = parcel.readInt();
        this.f1369c = parcel.readInt();
        this.f1370d = parcel.readString();
        this.f1371e = parcel.readInt();
        this.f1372f = parcel.readInt();
        this.f1373g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1374h = parcel.readInt();
        this.f1375i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1376j = parcel.createStringArrayList();
        this.f1377k = parcel.createStringArrayList();
        this.f1378l = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public C0421d mo1526a(C0442l lVar) {
        C0421d dVar = new C0421d(lVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1367a.length) {
            C0421d.C0422a aVar = new C0421d.C0422a();
            int i3 = i + 1;
            aVar.f1361a = this.f1367a[i];
            if (C0442l.f1477a) {
                Log.v("FragmentManager", "Instantiate " + dVar + " op #" + i2 + " base fragment #" + this.f1367a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f1367a[i3];
            if (i5 >= 0) {
                aVar.f1362b = lVar.f1489f.get(i5);
            } else {
                aVar.f1362b = null;
            }
            int[] iArr = this.f1367a;
            int i6 = i4 + 1;
            aVar.f1363c = iArr[i4];
            int i7 = i6 + 1;
            aVar.f1364d = iArr[i6];
            int i8 = i7 + 1;
            aVar.f1365e = iArr[i7];
            aVar.f1366f = iArr[i8];
            dVar.f1342c = aVar.f1363c;
            dVar.f1343d = aVar.f1364d;
            dVar.f1344e = aVar.f1365e;
            dVar.f1345f = aVar.f1366f;
            dVar.mo1512a(aVar);
            i2++;
            i = i8 + 1;
        }
        dVar.f1346g = this.f1368b;
        dVar.f1347h = this.f1369c;
        dVar.f1350k = this.f1370d;
        dVar.f1352m = this.f1371e;
        dVar.f1348i = true;
        dVar.f1353n = this.f1372f;
        dVar.f1354o = this.f1373g;
        dVar.f1355p = this.f1374h;
        dVar.f1356q = this.f1375i;
        dVar.f1357r = this.f1376j;
        dVar.f1358s = this.f1377k;
        dVar.f1359t = this.f1378l;
        dVar.mo1511a(1);
        return dVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1367a);
        parcel.writeInt(this.f1368b);
        parcel.writeInt(this.f1369c);
        parcel.writeString(this.f1370d);
        parcel.writeInt(this.f1371e);
        parcel.writeInt(this.f1372f);
        TextUtils.writeToParcel(this.f1373g, parcel, 0);
        parcel.writeInt(this.f1374h);
        TextUtils.writeToParcel(this.f1375i, parcel, 0);
        parcel.writeStringList(this.f1376j);
        parcel.writeStringList(this.f1377k);
        parcel.writeInt(this.f1378l ? 1 : 0);
    }
}
