package android.support.p026v4.app;

import android.arch.lifecycle.C0073g;
import android.arch.lifecycle.C0080l;
import android.arch.lifecycle.C0081m;
import android.arch.lifecycle.C0089q;
import android.arch.lifecycle.C0090r;
import android.arch.lifecycle.C0092s;
import android.os.Bundle;
import android.support.p026v4.app.C0479t;
import android.support.p026v4.p027a.C0407b;
import android.support.p026v4.p035g.C0516d;
import android.support.p026v4.p035g.C0533m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0479t {

    /* renamed from: a */
    static boolean f1321a = false;

    /* renamed from: b */
    private final C0073g f1322b;

    /* renamed from: c */
    private final LoaderViewModel f1323c;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0412a<D> extends C0080l<D> implements C0407b.C0408a<D> {

        /* renamed from: a */
        private final int f1327a;

        /* renamed from: b */
        private final Bundle f1328b;

        /* renamed from: c */
        private final C0407b<D> f1329c;

        /* renamed from: d */
        private C0073g f1330d;

        /* renamed from: e */
        private C0413b<D> f1331e;

        /* renamed from: f */
        private C0407b<D> f1332f;

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0407b<D> mo1495f() {
            return this.f1329c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo152b() {
            if (LoaderManagerImpl.f1321a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f1329c.mo1469a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo153c() {
            if (LoaderManagerImpl.f1321a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f1329c.mo1475e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo1496g() {
            C0073g gVar = this.f1330d;
            C0413b<D> bVar = this.f1331e;
            if (gVar != null && bVar != null) {
                super.mo150a(bVar);
                mo149a(gVar, bVar);
            }
        }

        /* renamed from: a */
        public void mo150a(C0081m<? super D> mVar) {
            super.mo150a(mVar);
            this.f1330d = null;
            this.f1331e = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0407b<D> mo1493a(boolean z) {
            if (LoaderManagerImpl.f1321a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f1329c.mo1473c();
            this.f1329c.mo1477g();
            C0413b<D> bVar = this.f1331e;
            if (bVar != null) {
                mo150a(bVar);
                if (z) {
                    bVar.mo1500b();
                }
            }
            this.f1329c.mo1470a(this);
            if ((bVar == null || bVar.mo1499a()) && !z) {
                return this.f1329c;
            }
            this.f1329c.mo1479i();
            return this.f1332f;
        }

        /* renamed from: a */
        public void mo151a(D d) {
            super.mo151a(d);
            C0407b<D> bVar = this.f1332f;
            if (bVar != null) {
                bVar.mo1479i();
                this.f1332f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1327a);
            sb.append(" : ");
            C0516d.m2263a(this.f1329c, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo1494a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1327a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1328b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1329c);
            C0407b<D> bVar = this.f1329c;
            bVar.mo1471a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f1331e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f1331e);
                C0413b<D> bVar2 = this.f1331e;
                bVar2.mo1498a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo1495f().mo1468a(mo148a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo154d());
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0413b<D> implements C0081m<D> {

        /* renamed from: a */
        private final C0407b<D> f1333a;

        /* renamed from: b */
        private final C0479t.C0480a<D> f1334b;

        /* renamed from: c */
        private boolean f1335c;

        /* renamed from: a */
        public void mo196a(D d) {
            if (LoaderManagerImpl.f1321a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f1333a + ": " + this.f1333a.mo1468a(d));
            }
            this.f1334b.mo1872a(this.f1333a, d);
            this.f1335c = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1499a() {
            return this.f1335c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1500b() {
            if (this.f1335c) {
                if (LoaderManagerImpl.f1321a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f1333a);
                }
                this.f1334b.mo1871a(this.f1333a);
            }
        }

        public String toString() {
            return this.f1334b.toString();
        }

        /* renamed from: a */
        public void mo1498a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f1335c);
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0089q {

        /* renamed from: a */
        private static final C0090r.C0091a f1324a = new C0090r.C0091a() {
            /* renamed from: a */
            public <T extends C0089q> T mo217a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        private C0533m<C0412a> f1325b = new C0533m<>();

        /* renamed from: c */
        private boolean f1326c = false;

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m1703a(C0092s sVar) {
            return (LoaderViewModel) new C0090r(sVar, f1324a).mo215a(LoaderViewModel.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1492b() {
            int b = this.f1325b.mo2112b();
            for (int i = 0; i < b; i++) {
                this.f1325b.mo2120e(i).mo1496g();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo214a() {
            super.mo214a();
            int b = this.f1325b.mo2112b();
            for (int i = 0; i < b; i++) {
                this.f1325b.mo2120e(i).mo1493a(true);
            }
            this.f1325b.mo2115c();
        }

        /* renamed from: a */
        public void mo1491a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1325b.mo2112b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f1325b.mo2112b(); i++) {
                    C0412a e = this.f1325b.mo2120e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1325b.mo2119d(i));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.mo1494a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    LoaderManagerImpl(C0073g gVar, C0092s sVar) {
        this.f1322b = gVar;
        this.f1323c = LoaderViewModel.m1703a(sVar);
    }

    /* renamed from: a */
    public void mo1488a() {
        this.f1323c.mo1492b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0516d.m2263a(this.f1322b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo1489a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1323c.mo1491a(str, fileDescriptor, printWriter, strArr);
    }
}
