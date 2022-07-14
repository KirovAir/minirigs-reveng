package android.support.p026v4.app;

import android.support.p026v4.app.C0425f;
import android.support.p026v4.app.C0442l;
import android.support.p026v4.p035g.C0517e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
final class C0421d extends C0463p implements C0442l.C0456h {

    /* renamed from: a */
    final C0442l f1340a;

    /* renamed from: b */
    ArrayList<C0422a> f1341b = new ArrayList<>();

    /* renamed from: c */
    int f1342c;

    /* renamed from: d */
    int f1343d;

    /* renamed from: e */
    int f1344e;

    /* renamed from: f */
    int f1345f;

    /* renamed from: g */
    int f1346g;

    /* renamed from: h */
    int f1347h;

    /* renamed from: i */
    boolean f1348i;

    /* renamed from: j */
    boolean f1349j = true;

    /* renamed from: k */
    String f1350k;

    /* renamed from: l */
    boolean f1351l;

    /* renamed from: m */
    int f1352m = -1;

    /* renamed from: n */
    int f1353n;

    /* renamed from: o */
    CharSequence f1354o;

    /* renamed from: p */
    int f1355p;

    /* renamed from: q */
    CharSequence f1356q;

    /* renamed from: r */
    ArrayList<String> f1357r;

    /* renamed from: s */
    ArrayList<String> f1358s;

    /* renamed from: t */
    boolean f1359t = false;

    /* renamed from: u */
    ArrayList<Runnable> f1360u;

    /* renamed from: android.support.v4.app.d$a */
    static final class C0422a {

        /* renamed from: a */
        int f1361a;

        /* renamed from: b */
        C0425f f1362b;

        /* renamed from: c */
        int f1363c;

        /* renamed from: d */
        int f1364d;

        /* renamed from: e */
        int f1365e;

        /* renamed from: f */
        int f1366f;

        C0422a() {
        }

        C0422a(int i, C0425f fVar) {
            this.f1361a = i;
            this.f1362b = fVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1352m >= 0) {
            sb.append(" #");
            sb.append(this.f1352m);
        }
        if (this.f1350k != null) {
            sb.append(" ");
            sb.append(this.f1350k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo1514a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo1515a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo1515a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1350k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1352m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1351l);
            if (this.f1346g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1346g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1347h));
            }
            if (!(this.f1342c == 0 && this.f1343d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1342c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1343d));
            }
            if (!(this.f1344e == 0 && this.f1345f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1344e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1345f));
            }
            if (!(this.f1353n == 0 && this.f1354o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1353n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1354o);
            }
            if (!(this.f1355p == 0 && this.f1356q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1355p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1356q);
            }
        }
        if (!this.f1341b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f1341b.size();
            for (int i = 0; i < size; i++) {
                C0422a aVar = this.f1341b.get(i);
                switch (aVar.f1361a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1361a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1362b);
                if (z) {
                    if (!(aVar.f1363c == 0 && aVar.f1364d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1363c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1364d));
                    }
                    if (aVar.f1365e != 0 || aVar.f1366f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1365e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1366f));
                    }
                }
            }
        }
    }

    public C0421d(C0442l lVar) {
        this.f1340a = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1512a(C0422a aVar) {
        this.f1341b.add(aVar);
        aVar.f1363c = this.f1342c;
        aVar.f1364d = this.f1343d;
        aVar.f1365e = this.f1344e;
        aVar.f1366f = this.f1345f;
    }

    /* renamed from: a */
    public C0463p mo1509a(C0425f fVar, String str) {
        m1730a(0, fVar, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m1730a(int i, C0425f fVar, String str, int i2) {
        Class<?> cls = fVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fVar.f1421s = this.f1340a;
        if (str != null) {
            if (fVar.f1381A == null || str.equals(fVar.f1381A)) {
                fVar.f1381A = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fVar + ": was " + fVar.f1381A + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fVar + " with tag " + str + " to container view with no id");
            } else if (fVar.f1427y == 0 || fVar.f1427y == i) {
                fVar.f1427y = i;
                fVar.f1428z = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fVar + ": was " + fVar.f1427y + " now " + i);
            }
        }
        mo1512a(new C0422a(i2, fVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1511a(int i) {
        if (this.f1348i) {
            if (C0442l.f1477a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1341b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0422a aVar = this.f1341b.get(i2);
                if (aVar.f1362b != null) {
                    aVar.f1362b.f1420r += i;
                    if (C0442l.f1477a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1362b + " to " + aVar.f1362b.f1420r);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1510a() {
        ArrayList<Runnable> arrayList = this.f1360u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1360u.get(i).run();
            }
            this.f1360u = null;
        }
    }

    /* renamed from: b */
    public int mo1518b() {
        return mo1507a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1507a(boolean z) {
        if (!this.f1351l) {
            if (C0442l.f1477a) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0517e("FragmentManager"));
                mo1514a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f1351l = true;
            if (this.f1348i) {
                this.f1352m = this.f1340a.mo1735a(this);
            } else {
                this.f1352m = -1;
            }
            this.f1340a.mo1751a((C0442l.C0456h) this, z);
            return this.f1352m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public boolean mo1517a(ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0442l.f1477a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1348i) {
            return true;
        }
        this.f1340a.mo1760b(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1521b(int i) {
        int size = this.f1341b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0422a aVar = this.f1341b.get(i2);
            int i3 = aVar.f1362b != null ? aVar.f1362b.f1428z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1516a(ArrayList<C0421d> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1341b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0422a aVar = this.f1341b.get(i4);
            int i5 = aVar.f1362b != null ? aVar.f1362b.f1428z : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0421d dVar = arrayList.get(i6);
                    int size2 = dVar.f1341b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0422a aVar2 = dVar.f1341b.get(i7);
                        if ((aVar2.f1362b != null ? aVar2.f1362b.f1428z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1522c() {
        int size = this.f1341b.size();
        for (int i = 0; i < size; i++) {
            C0422a aVar = this.f1341b.get(i);
            C0425f fVar = aVar.f1362b;
            if (fVar != null) {
                fVar.mo1563a(this.f1346g, this.f1347h);
            }
            int i2 = aVar.f1361a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fVar.mo1562a(aVar.f1364d);
                        this.f1340a.mo1785h(fVar);
                        break;
                    case 4:
                        fVar.mo1562a(aVar.f1364d);
                        this.f1340a.mo1788i(fVar);
                        break;
                    case 5:
                        fVar.mo1562a(aVar.f1363c);
                        this.f1340a.mo1790j(fVar);
                        break;
                    case 6:
                        fVar.mo1562a(aVar.f1364d);
                        this.f1340a.mo1792k(fVar);
                        break;
                    case 7:
                        fVar.mo1562a(aVar.f1363c);
                        this.f1340a.mo1794l(fVar);
                        break;
                    case 8:
                        this.f1340a.mo1800o(fVar);
                        break;
                    case 9:
                        this.f1340a.mo1800o((C0425f) null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f1361a);
                }
            } else {
                fVar.mo1562a(aVar.f1363c);
                this.f1340a.mo1749a(fVar, false);
            }
            if (!(this.f1359t || aVar.f1361a == 1 || fVar == null)) {
                this.f1340a.mo1776e(fVar);
            }
        }
        if (!this.f1359t) {
            C0442l lVar = this.f1340a;
            lVar.mo1739a(lVar.f1495l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1520b(boolean z) {
        for (int size = this.f1341b.size() - 1; size >= 0; size--) {
            C0422a aVar = this.f1341b.get(size);
            C0425f fVar = aVar.f1362b;
            if (fVar != null) {
                fVar.mo1563a(C0442l.m1976d(this.f1346g), this.f1347h);
            }
            int i = aVar.f1361a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fVar.mo1562a(aVar.f1365e);
                        this.f1340a.mo1749a(fVar, false);
                        break;
                    case 4:
                        fVar.mo1562a(aVar.f1365e);
                        this.f1340a.mo1790j(fVar);
                        break;
                    case 5:
                        fVar.mo1562a(aVar.f1366f);
                        this.f1340a.mo1788i(fVar);
                        break;
                    case 6:
                        fVar.mo1562a(aVar.f1365e);
                        this.f1340a.mo1794l(fVar);
                        break;
                    case 7:
                        fVar.mo1562a(aVar.f1366f);
                        this.f1340a.mo1792k(fVar);
                        break;
                    case 8:
                        this.f1340a.mo1800o((C0425f) null);
                        break;
                    case 9:
                        this.f1340a.mo1800o(fVar);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f1361a);
                }
            } else {
                fVar.mo1562a(aVar.f1366f);
                this.f1340a.mo1785h(fVar);
            }
            if (!(this.f1359t || aVar.f1361a == 3 || fVar == null)) {
                this.f1340a.mo1776e(fVar);
            }
        }
        if (!this.f1359t && z) {
            C0442l lVar = this.f1340a;
            lVar.mo1739a(lVar.f1495l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0425f mo1508a(ArrayList<C0425f> arrayList, C0425f fVar) {
        int i;
        C0425f fVar2 = fVar;
        int i2 = 0;
        while (i < this.f1341b.size()) {
            C0422a aVar = this.f1341b.get(i);
            switch (aVar.f1361a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f1362b);
                    break;
                case 2:
                    C0425f fVar3 = aVar.f1362b;
                    int i3 = fVar3.f1428z;
                    C0425f fVar4 = fVar2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0425f fVar5 = arrayList.get(size);
                        if (fVar5.f1428z == i3) {
                            if (fVar5 == fVar3) {
                                z = true;
                            } else {
                                if (fVar5 == fVar4) {
                                    this.f1341b.add(i4, new C0422a(9, fVar5));
                                    i4++;
                                    fVar4 = null;
                                }
                                C0422a aVar2 = new C0422a(3, fVar5);
                                aVar2.f1363c = aVar.f1363c;
                                aVar2.f1365e = aVar.f1365e;
                                aVar2.f1364d = aVar.f1364d;
                                aVar2.f1366f = aVar.f1366f;
                                this.f1341b.add(i4, aVar2);
                                arrayList.remove(fVar5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1341b.remove(i4);
                        i = i4 - 1;
                    } else {
                        aVar.f1361a = 1;
                        arrayList.add(fVar3);
                        i = i4;
                    }
                    fVar2 = fVar4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f1362b);
                    if (aVar.f1362b != fVar2) {
                        break;
                    } else {
                        this.f1341b.add(i, new C0422a(9, aVar.f1362b));
                        i++;
                        fVar2 = null;
                        break;
                    }
                case 8:
                    this.f1341b.add(i, new C0422a(9, fVar2));
                    i++;
                    fVar2 = aVar.f1362b;
                    break;
            }
            i2 = i + 1;
        }
        return fVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0425f mo1519b(ArrayList<C0425f> arrayList, C0425f fVar) {
        for (int i = 0; i < this.f1341b.size(); i++) {
            C0422a aVar = this.f1341b.get(i);
            int i2 = aVar.f1361a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fVar = null;
                            break;
                        case 9:
                            fVar = aVar.f1362b;
                            break;
                    }
                }
                arrayList.add(aVar.f1362b);
            }
            arrayList.remove(aVar.f1362b);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1523d() {
        for (int i = 0; i < this.f1341b.size(); i++) {
            if (m1731b(this.f1341b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1513a(C0425f.C0431c cVar) {
        for (int i = 0; i < this.f1341b.size(); i++) {
            C0422a aVar = this.f1341b.get(i);
            if (m1731b(aVar)) {
                aVar.f1362b.mo1574a(cVar);
            }
        }
    }

    /* renamed from: b */
    private static boolean m1731b(C0422a aVar) {
        C0425f fVar = aVar.f1362b;
        return fVar != null && fVar.f1414l && fVar.f1390J != null && !fVar.f1383C && !fVar.f1382B && fVar.mo1558Z();
    }

    /* renamed from: e */
    public String mo1524e() {
        return this.f1350k;
    }
}
