package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0065d;
import android.arch.lifecycle.C0087p;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.o */
public class C0083o implements C0073g {

    /* renamed from: i */
    private static final C0083o f190i = new C0083o();

    /* renamed from: a */
    private int f191a = 0;

    /* renamed from: b */
    private int f192b = 0;

    /* renamed from: c */
    private boolean f193c = true;

    /* renamed from: d */
    private boolean f194d = true;

    /* renamed from: e */
    private Handler f195e;

    /* renamed from: f */
    private final C0074h f196f = new C0074h(this);

    /* renamed from: g */
    private Runnable f197g = new Runnable() {
        public void run() {
            C0083o.this.m287f();
            C0083o.this.m288g();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0087p.C0088a f198h = new C0087p.C0088a() {
        /* renamed from: a */
        public void mo204a() {
        }

        /* renamed from: b */
        public void mo205b() {
            C0083o.this.mo198a();
        }

        /* renamed from: c */
        public void mo206c() {
            C0083o.this.mo199b();
        }
    };

    /* renamed from: a */
    static void m284a(Context context) {
        f190i.mo200b(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo198a() {
        this.f191a++;
        if (this.f191a == 1 && this.f194d) {
            this.f196f.mo192a(C0065d.C0066a.ON_START);
            this.f194d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo199b() {
        this.f192b++;
        if (this.f192b != 1) {
            return;
        }
        if (this.f193c) {
            this.f196f.mo192a(C0065d.C0066a.ON_RESUME);
            this.f193c = false;
            return;
        }
        this.f195e.removeCallbacks(this.f197g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo201c() {
        this.f192b--;
        if (this.f192b == 0) {
            this.f195e.postDelayed(this.f197g, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo202e() {
        this.f191a--;
        m288g();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m287f() {
        if (this.f192b == 0) {
            this.f193c = true;
            this.f196f.mo192a(C0065d.C0066a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m288g() {
        if (this.f191a == 0 && this.f193c) {
            this.f196f.mo192a(C0065d.C0066a.ON_STOP);
            this.f194d = true;
        }
    }

    private C0083o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo200b(Context context) {
        this.f195e = new Handler();
        this.f196f.mo192a(C0065d.C0066a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0063b() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C0087p.m300b(activity).mo207a(C0083o.this.f198h);
            }

            public void onActivityPaused(Activity activity) {
                C0083o.this.mo201c();
            }

            public void onActivityStopped(Activity activity) {
                C0083o.this.mo202e();
            }
        });
    }

    /* renamed from: d */
    public C0065d mo191d() {
        return this.f196f;
    }
}
