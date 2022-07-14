package android.support.p026v4.app;

import android.arch.lifecycle.C0092s;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.o */
final class C0461o implements Parcelable {
    public static final Parcelable.Creator<C0461o> CREATOR = new Parcelable.Creator<C0461o>() {
        /* renamed from: a */
        public C0461o createFromParcel(Parcel parcel) {
            return new C0461o(parcel);
        }

        /* renamed from: a */
        public C0461o[] newArray(int i) {
            return new C0461o[i];
        }
    };

    /* renamed from: a */
    final String f1547a;

    /* renamed from: b */
    final int f1548b;

    /* renamed from: c */
    final boolean f1549c;

    /* renamed from: d */
    final int f1550d;

    /* renamed from: e */
    final int f1551e;

    /* renamed from: f */
    final String f1552f;

    /* renamed from: g */
    final boolean f1553g;

    /* renamed from: h */
    final boolean f1554h;

    /* renamed from: i */
    final Bundle f1555i;

    /* renamed from: j */
    final boolean f1556j;

    /* renamed from: k */
    Bundle f1557k;

    /* renamed from: l */
    C0425f f1558l;

    public int describeContents() {
        return 0;
    }

    C0461o(C0425f fVar) {
        this.f1547a = fVar.getClass().getName();
        this.f1548b = fVar.f1408f;
        this.f1549c = fVar.f1416n;
        this.f1550d = fVar.f1427y;
        this.f1551e = fVar.f1428z;
        this.f1552f = fVar.f1381A;
        this.f1553g = fVar.f1384D;
        this.f1554h = fVar.f1383C;
        this.f1555i = fVar.f1410h;
        this.f1556j = fVar.f1382B;
    }

    C0461o(Parcel parcel) {
        this.f1547a = parcel.readString();
        this.f1548b = parcel.readInt();
        boolean z = true;
        this.f1549c = parcel.readInt() != 0;
        this.f1550d = parcel.readInt();
        this.f1551e = parcel.readInt();
        this.f1552f = parcel.readString();
        this.f1553g = parcel.readInt() != 0;
        this.f1554h = parcel.readInt() != 0;
        this.f1555i = parcel.readBundle();
        this.f1556j = parcel.readInt() == 0 ? false : z;
        this.f1557k = parcel.readBundle();
    }

    /* renamed from: a */
    public C0425f mo1838a(C0438j jVar, C0436h hVar, C0425f fVar, C0458m mVar, C0092s sVar) {
        if (this.f1558l == null) {
            Context g = jVar.mo1713g();
            Bundle bundle = this.f1555i;
            if (bundle != null) {
                bundle.setClassLoader(g.getClassLoader());
            }
            if (hVar != null) {
                this.f1558l = hVar.mo1639a(g, this.f1547a, this.f1555i);
            } else {
                this.f1558l = C0425f.m1753a(g, this.f1547a, this.f1555i);
            }
            Bundle bundle2 = this.f1557k;
            if (bundle2 != null) {
                bundle2.setClassLoader(g.getClassLoader());
                this.f1558l.f1405c = this.f1557k;
            }
            this.f1558l.mo1565a(this.f1548b, fVar);
            C0425f fVar2 = this.f1558l;
            fVar2.f1416n = this.f1549c;
            fVar2.f1418p = true;
            fVar2.f1427y = this.f1550d;
            fVar2.f1428z = this.f1551e;
            fVar2.f1381A = this.f1552f;
            fVar2.f1384D = this.f1553g;
            fVar2.f1383C = this.f1554h;
            fVar2.f1382B = this.f1556j;
            fVar2.f1421s = jVar.f1469b;
            if (C0442l.f1477a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1558l);
            }
        }
        C0425f fVar3 = this.f1558l;
        fVar3.f1424v = mVar;
        fVar3.f1425w = sVar;
        return fVar3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1547a);
        parcel.writeInt(this.f1548b);
        parcel.writeInt(this.f1549c ? 1 : 0);
        parcel.writeInt(this.f1550d);
        parcel.writeInt(this.f1551e);
        parcel.writeString(this.f1552f);
        parcel.writeInt(this.f1553g ? 1 : 0);
        parcel.writeInt(this.f1554h ? 1 : 0);
        parcel.writeBundle(this.f1555i);
        parcel.writeInt(this.f1556j ? 1 : 0);
        parcel.writeBundle(this.f1557k);
    }
}
