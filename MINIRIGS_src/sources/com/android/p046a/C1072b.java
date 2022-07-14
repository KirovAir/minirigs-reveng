package com.android.p046a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.a.b */
public interface C1072b {
    /* renamed from: a */
    C1073a mo5099a(String str);

    /* renamed from: a */
    void mo5101a();

    /* renamed from: a */
    void mo5102a(String str, C1073a aVar);

    /* renamed from: com.android.a.b$a */
    public static class C1073a {

        /* renamed from: a */
        public byte[] f3862a;

        /* renamed from: b */
        public String f3863b;

        /* renamed from: c */
        public long f3864c;

        /* renamed from: d */
        public long f3865d;

        /* renamed from: e */
        public long f3866e;

        /* renamed from: f */
        public long f3867f;

        /* renamed from: g */
        public Map<String, String> f3868g = Collections.emptyMap();

        /* renamed from: h */
        public List<C1082g> f3869h;

        /* renamed from: a */
        public boolean mo5157a() {
            return this.f3866e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo5158b() {
            return this.f3867f < System.currentTimeMillis();
        }
    }
}
