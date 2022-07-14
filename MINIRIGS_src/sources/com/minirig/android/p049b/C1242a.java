package com.minirig.android.p049b;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.p046a.C1089n;
import com.android.p046a.C1093o;
import com.android.p046a.p047a.C1056k;
import com.android.p046a.p047a.C1071p;

/* renamed from: com.minirig.android.b.a */
public class C1242a {

    /* renamed from: a */
    private static C1242a f4561a;

    /* renamed from: d */
    private static Context f4562d;

    /* renamed from: b */
    private C1093o f4563b = mo5540a();

    /* renamed from: c */
    private C1056k f4564c = new C1056k(this.f4563b, new C1056k.C1062b() {

        /* renamed from: b */
        private final LruCache<String, Bitmap> f4566b = new LruCache<>(20);

        /* renamed from: a */
        public Bitmap mo5134a(String str) {
            return this.f4566b.get(str);
        }

        /* renamed from: a */
        public void mo5135a(String str, Bitmap bitmap) {
            this.f4566b.put(str, bitmap);
        }
    });

    private C1242a(Context context) {
        f4562d = context;
    }

    /* renamed from: a */
    public static synchronized C1242a m6085a(Context context) {
        C1242a aVar;
        synchronized (C1242a.class) {
            if (f4561a == null) {
                f4561a = new C1242a(context);
            }
            aVar = f4561a;
        }
        return aVar;
    }

    /* renamed from: a */
    public C1093o mo5540a() {
        if (this.f4563b == null) {
            this.f4563b = C1071p.m5583a(f4562d.getApplicationContext());
        }
        return this.f4563b;
    }

    /* renamed from: a */
    public <T> void mo5541a(C1089n<T> nVar, String str) {
        nVar.mo5186a((Object) str);
        mo5540a().mo5217a(nVar);
    }
}
