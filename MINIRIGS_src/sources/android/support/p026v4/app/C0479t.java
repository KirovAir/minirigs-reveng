package android.support.p026v4.app;

import android.arch.lifecycle.C0073g;
import android.arch.lifecycle.C0093t;
import android.support.p026v4.p027a.C0407b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.t */
public abstract class C0479t {

    /* renamed from: android.support.v4.app.t$a */
    public interface C0480a<D> {
        /* renamed from: a */
        void mo1871a(C0407b<D> bVar);

        /* renamed from: a */
        void mo1872a(C0407b<D> bVar, D d);
    }

    /* renamed from: a */
    public abstract void mo1488a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo1489a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public static <T extends C0073g & C0093t> C0479t m2152a(T t) {
        return new LoaderManagerImpl(t, ((C0093t) t).mo221e());
    }
}
