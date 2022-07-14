package com.android.p046a.p047a;

import com.android.p046a.C1086k;
import com.android.p046a.C1089n;
import com.android.p046a.C1095p;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.a.a.o */
public class C1070o extends C1089n<String> {

    /* renamed from: a */
    private final Object f3860a;

    /* renamed from: b */
    private C1095p.C1097b<String> f3861b;

    public C1070o(int i, String str, C1095p.C1097b<String> bVar, C1095p.C1096a aVar) {
        super(i, str, aVar);
        this.f3860a = new Object();
        this.f3861b = bVar;
    }

    public C1070o(String str, C1095p.C1097b<String> bVar, C1095p.C1096a aVar) {
        this(0, str, bVar, aVar);
    }

    /* renamed from: f */
    public void mo5142f() {
        super.mo5142f();
        synchronized (this.f3860a) {
            this.f3861b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo5141b(String str) {
        C1095p.C1097b<String> bVar;
        synchronized (this.f3860a) {
            bVar = this.f3861b;
        }
        if (bVar != null) {
            bVar.mo5128a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1095p<String> mo5139a(C1086k kVar) {
        String str;
        try {
            str = new String(kVar.f3900b, C1051g.m5510a(kVar.f3901c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(kVar.f3900b);
        }
        return C1095p.m5665a(str, C1051g.m5508a(kVar));
    }
}
