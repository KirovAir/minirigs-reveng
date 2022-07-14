package android.support.p026v4.p027a;

import android.support.p026v4.p035g.C0516d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.b */
public class C0407b<D> {

    /* renamed from: a */
    int f1314a;

    /* renamed from: b */
    C0408a<D> f1315b;

    /* renamed from: c */
    boolean f1316c;

    /* renamed from: d */
    boolean f1317d;

    /* renamed from: e */
    boolean f1318e;

    /* renamed from: f */
    boolean f1319f;

    /* renamed from: g */
    boolean f1320g;

    /* renamed from: android.support.v4.a.b$a */
    public interface C0408a<D> {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1472b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1474d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1476f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1478h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1480j() {
    }

    /* renamed from: a */
    public void mo1470a(C0408a<D> aVar) {
        C0408a<D> aVar2 = this.f1315b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.f1315b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public final void mo1469a() {
        this.f1316c = true;
        this.f1318e = false;
        this.f1317d = false;
        mo1472b();
    }

    /* renamed from: c */
    public boolean mo1473c() {
        return mo1474d();
    }

    /* renamed from: e */
    public void mo1475e() {
        this.f1316c = false;
        mo1476f();
    }

    /* renamed from: g */
    public void mo1477g() {
        this.f1317d = true;
        mo1478h();
    }

    /* renamed from: i */
    public void mo1479i() {
        mo1480j();
        this.f1318e = true;
        this.f1316c = false;
        this.f1317d = false;
        this.f1319f = false;
        this.f1320g = false;
    }

    /* renamed from: a */
    public String mo1468a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0516d.m2263a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0516d.m2263a(this, sb);
        sb.append(" id=");
        sb.append(this.f1314a);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo1471a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1314a);
        printWriter.print(" mListener=");
        printWriter.println(this.f1315b);
        if (this.f1316c || this.f1319f || this.f1320g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1316c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1319f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1320g);
        }
        if (this.f1317d || this.f1318e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1317d);
            printWriter.print(" mReset=");
            printWriter.println(this.f1318e);
        }
    }
}
