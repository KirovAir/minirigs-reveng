package com.android.p046a.p047a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.p046a.C1089n;
import com.android.p046a.C1093o;
import com.android.p046a.C1095p;
import com.android.p046a.C1102u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.android.a.a.k */
public class C1056k {

    /* renamed from: a */
    private final C1093o f3818a;

    /* renamed from: b */
    private int f3819b = 100;

    /* renamed from: c */
    private final C1062b f3820c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<String, C1061a> f3821d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final HashMap<String, C1061a> f3822e = new HashMap<>();

    /* renamed from: f */
    private final Handler f3823f = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f3824g;

    /* renamed from: com.android.a.a.k$b */
    public interface C1062b {
        /* renamed from: a */
        Bitmap mo5134a(String str);

        /* renamed from: a */
        void mo5135a(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.a.a.k$d */
    public interface C1064d extends C1095p.C1096a {
        /* renamed from: a */
        void mo5125a(C1063c cVar, boolean z);
    }

    public C1056k(C1093o oVar, C1062b bVar) {
        this.f3818a = oVar;
        this.f3820c = bVar;
    }

    /* renamed from: a */
    public static C1064d m5530a(final ImageView imageView, final int i, final int i2) {
        return new C1064d() {
            /* renamed from: a */
            public void mo5126a(C1102u uVar) {
                int i = i2;
                if (i != 0) {
                    imageView.setImageResource(i);
                }
            }

            /* renamed from: a */
            public void mo5125a(C1063c cVar, boolean z) {
                if (cVar.mo5137b() != null) {
                    imageView.setImageBitmap(cVar.mo5137b());
                    return;
                }
                int i = i;
                if (i != 0) {
                    imageView.setImageResource(i);
                }
            }
        };
    }

    /* renamed from: a */
    public C1063c mo5119a(String str, C1064d dVar) {
        return mo5120a(str, dVar, 0, 0);
    }

    /* renamed from: a */
    public C1063c mo5120a(String str, C1064d dVar, int i, int i2) {
        return mo5121a(str, dVar, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* renamed from: a */
    public C1063c mo5121a(String str, C1064d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        C1064d dVar2 = dVar;
        m5534a();
        String a = m5532a(str, i, i2, scaleType);
        Bitmap a2 = this.f3820c.mo5134a(a);
        if (a2 != null) {
            C1063c cVar = new C1063c(a2, str, (String) null, (C1064d) null);
            dVar2.mo5125a(cVar, true);
            return cVar;
        }
        C1063c cVar2 = new C1063c((Bitmap) null, str, a, dVar);
        dVar2.mo5125a(cVar2, true);
        C1061a aVar = this.f3821d.get(a);
        if (aVar != null) {
            aVar.mo5131a(cVar2);
            return cVar2;
        }
        C1089n<Bitmap> a3 = mo5122a(str, i, i2, scaleType, a);
        this.f3818a.mo5217a(a3);
        this.f3821d.put(a, new C1061a(a3, cVar2));
        return cVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1089n<Bitmap> mo5122a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new C1065l(str, new C1095p.C1097b<Bitmap>() {
            /* renamed from: a */
            public void mo5128a(Bitmap bitmap) {
                C1056k.this.mo5123a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new C1095p.C1096a() {
            /* renamed from: a */
            public void mo5126a(C1102u uVar) {
                C1056k.this.mo5124a(str2, uVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5123a(String str, Bitmap bitmap) {
        this.f3820c.mo5135a(str, bitmap);
        C1061a remove = this.f3821d.remove(str);
        if (remove != null) {
            Bitmap unused = remove.f3835c = bitmap;
            m5535a(str, remove);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5124a(String str, C1102u uVar) {
        C1061a remove = this.f3821d.remove(str);
        if (remove != null) {
            remove.mo5132a(uVar);
            m5535a(str, remove);
        }
    }

    /* renamed from: com.android.a.a.k$c */
    public class C1063c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f3839b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1064d f3840c;

        /* renamed from: d */
        private final String f3841d;

        /* renamed from: e */
        private final String f3842e;

        public C1063c(Bitmap bitmap, String str, String str2, C1064d dVar) {
            this.f3839b = bitmap;
            this.f3842e = str;
            this.f3841d = str2;
            this.f3840c = dVar;
        }

        /* renamed from: a */
        public void mo5136a() {
            if (this.f3840c != null) {
                C1061a aVar = (C1061a) C1056k.this.f3821d.get(this.f3841d);
                if (aVar == null) {
                    C1061a aVar2 = (C1061a) C1056k.this.f3822e.get(this.f3841d);
                    if (aVar2 != null) {
                        aVar2.mo5133b(this);
                        if (aVar2.f3837e.size() == 0) {
                            C1056k.this.f3822e.remove(this.f3841d);
                        }
                    }
                } else if (aVar.mo5133b(this)) {
                    C1056k.this.f3821d.remove(this.f3841d);
                }
            }
        }

        /* renamed from: b */
        public Bitmap mo5137b() {
            return this.f3839b;
        }

        /* renamed from: c */
        public String mo5138c() {
            return this.f3842e;
        }
    }

    /* renamed from: com.android.a.a.k$a */
    private class C1061a {

        /* renamed from: b */
        private final C1089n<?> f3834b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f3835c;

        /* renamed from: d */
        private C1102u f3836d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final LinkedList<C1063c> f3837e = new LinkedList<>();

        public C1061a(C1089n<?> nVar, C1063c cVar) {
            this.f3834b = nVar;
            this.f3837e.add(cVar);
        }

        /* renamed from: a */
        public void mo5132a(C1102u uVar) {
            this.f3836d = uVar;
        }

        /* renamed from: a */
        public C1102u mo5130a() {
            return this.f3836d;
        }

        /* renamed from: a */
        public void mo5131a(C1063c cVar) {
            this.f3837e.add(cVar);
        }

        /* renamed from: b */
        public boolean mo5133b(C1063c cVar) {
            this.f3837e.remove(cVar);
            if (this.f3837e.size() != 0) {
                return false;
            }
            this.f3834b.mo5142f();
            return true;
        }
    }

    /* renamed from: a */
    private void m5535a(String str, C1061a aVar) {
        this.f3822e.put(str, aVar);
        if (this.f3824g == null) {
            this.f3824g = new Runnable() {
                public void run() {
                    for (C1061a aVar : C1056k.this.f3822e.values()) {
                        Iterator it = aVar.f3837e.iterator();
                        while (it.hasNext()) {
                            C1063c cVar = (C1063c) it.next();
                            if (cVar.f3840c != null) {
                                if (aVar.mo5130a() == null) {
                                    Bitmap unused = cVar.f3839b = aVar.f3835c;
                                    cVar.f3840c.mo5125a(cVar, false);
                                } else {
                                    cVar.f3840c.mo5126a(aVar.mo5130a());
                                }
                            }
                        }
                    }
                    C1056k.this.f3822e.clear();
                    Runnable unused2 = C1056k.this.f3824g = null;
                }
            };
            this.f3823f.postDelayed(this.f3824g, (long) this.f3819b);
        }
    }

    /* renamed from: a */
    private void m5534a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    /* renamed from: a */
    private static String m5532a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }
}
