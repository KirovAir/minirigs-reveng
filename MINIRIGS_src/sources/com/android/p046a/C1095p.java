package com.android.p046a;

import com.android.p046a.C1072b;

/* renamed from: com.android.a.p */
public class C1095p<T> {

    /* renamed from: a */
    public final T f3939a;

    /* renamed from: b */
    public final C1072b.C1073a f3940b;

    /* renamed from: c */
    public final C1102u f3941c;

    /* renamed from: d */
    public boolean f3942d;

    /* renamed from: com.android.a.p$a */
    public interface C1096a {
        /* renamed from: a */
        void mo5126a(C1102u uVar);
    }

    /* renamed from: com.android.a.p$b */
    public interface C1097b<T> {
        /* renamed from: a */
        void mo5128a(T t);
    }

    /* renamed from: a */
    public static <T> C1095p<T> m5665a(T t, C1072b.C1073a aVar) {
        return new C1095p<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> C1095p<T> m5664a(C1102u uVar) {
        return new C1095p<>(uVar);
    }

    /* renamed from: a */
    public boolean mo5223a() {
        return this.f3941c == null;
    }

    private C1095p(T t, C1072b.C1073a aVar) {
        this.f3942d = false;
        this.f3939a = t;
        this.f3940b = aVar;
        this.f3941c = null;
    }

    private C1095p(C1102u uVar) {
        this.f3942d = false;
        this.f3939a = null;
        this.f3940b = null;
        this.f3941c = uVar;
    }
}
