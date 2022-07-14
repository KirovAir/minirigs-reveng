package com.android.p046a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.p046a.C1072b;
import com.android.p046a.C1095p;
import com.android.p046a.C1103v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.a.n */
public abstract class C1089n<T> implements Comparable<C1089n<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1103v.C1104a f3905a;

    /* renamed from: b */
    private final int f3906b;

    /* renamed from: c */
    private final String f3907c;

    /* renamed from: d */
    private final int f3908d;

    /* renamed from: e */
    private final Object f3909e;

    /* renamed from: f */
    private C1095p.C1096a f3910f;

    /* renamed from: g */
    private Integer f3911g;

    /* renamed from: h */
    private C1093o f3912h;

    /* renamed from: i */
    private boolean f3913i;

    /* renamed from: j */
    private boolean f3914j;

    /* renamed from: k */
    private boolean f3915k;

    /* renamed from: l */
    private boolean f3916l;

    /* renamed from: m */
    private C1099r f3917m;

    /* renamed from: n */
    private C1072b.C1073a f3918n;

    /* renamed from: o */
    private Object f3919o;

    /* renamed from: p */
    private C1091a f3920p;

    /* renamed from: com.android.a.n$a */
    interface C1091a {
        /* renamed from: a */
        void mo5162a(C1089n<?> nVar);

        /* renamed from: a */
        void mo5163a(C1089n<?> nVar, C1095p<?> pVar);
    }

    /* renamed from: com.android.a.n$b */
    public enum C1092b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1095p<T> mo5139a(C1086k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1102u mo5187a(C1102u uVar) {
        return uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo5141b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, String> mo5204m() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo5205n() {
        return "UTF-8";
    }

    public C1089n(int i, String str, C1095p.C1096a aVar) {
        this.f3905a = C1103v.C1104a.f3947a ? new C1103v.C1104a() : null;
        this.f3909e = new Object();
        this.f3913i = true;
        this.f3914j = false;
        this.f3915k = false;
        this.f3916l = false;
        this.f3918n = null;
        this.f3906b = i;
        this.f3907c = str;
        this.f3910f = aVar;
        mo5185a((C1099r) new C1078e());
        this.f3908d = mo5156c(str);
    }

    /* renamed from: a */
    public int mo5180a() {
        return this.f3906b;
    }

    /* renamed from: a */
    public C1089n<?> mo5186a(Object obj) {
        this.f3919o = obj;
        return this;
    }

    /* renamed from: b */
    public int mo5191b() {
        return this.f3908d;
    }

    /* renamed from: c */
    private static int mo5156c(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    public C1089n<?> mo5185a(C1099r rVar) {
        this.f3917m = rVar;
        return this;
    }

    /* renamed from: a */
    public void mo5190a(String str) {
        if (C1103v.C1104a.f3947a) {
            this.f3905a.mo5226a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5193b(final String str) {
        C1093o oVar = this.f3912h;
        if (oVar != null) {
            oVar.mo5220b(this);
        }
        if (C1103v.C1104a.f3947a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C1089n.this.f3905a.mo5226a(str, id);
                        C1089n.this.f3905a.mo5225a(toString());
                    }
                });
                return;
            }
            this.f3905a.mo5226a(str, id);
            this.f3905a.mo5225a(toString());
        }
    }

    /* renamed from: a */
    public C1089n<?> mo5184a(C1093o oVar) {
        this.f3912h = oVar;
        return this;
    }

    /* renamed from: a */
    public final C1089n<?> mo5182a(int i) {
        this.f3911g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public String mo5194c() {
        return this.f3907c;
    }

    /* renamed from: d */
    public String mo5196d() {
        return mo5194c();
    }

    /* renamed from: a */
    public C1089n<?> mo5183a(C1072b.C1073a aVar) {
        this.f3918n = aVar;
        return this;
    }

    /* renamed from: e */
    public C1072b.C1073a mo5197e() {
        return this.f3918n;
    }

    /* renamed from: f */
    public void mo5142f() {
        synchronized (this.f3909e) {
            this.f3914j = true;
            this.f3910f = null;
        }
    }

    /* renamed from: g */
    public boolean mo5198g() {
        boolean z;
        synchronized (this.f3909e) {
            z = this.f3914j;
        }
        return z;
    }

    /* renamed from: h */
    public Map<String, String> mo5199h() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: i */
    public Map<String, String> mo5200i() {
        return mo5204m();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: j */
    public String mo5201j() {
        return mo5205n();
    }

    @Deprecated
    /* renamed from: k */
    public String mo5202k() {
        return mo5206o();
    }

    @Deprecated
    /* renamed from: l */
    public byte[] mo5203l() {
        Map<String, String> i = mo5200i();
        if (i == null || i.size() <= 0) {
            return null;
        }
        return m5615a(i, mo5201j());
    }

    /* renamed from: o */
    public String mo5206o() {
        return "application/x-www-form-urlencoded; charset=" + mo5205n();
    }

    /* renamed from: p */
    public byte[] mo5207p() {
        Map<String, String> m = mo5204m();
        if (m == null || m.size() <= 0) {
            return null;
        }
        return m5615a(m, mo5205n());
    }

    /* renamed from: a */
    private byte[] m5615a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                sb.append(URLEncoder.encode((String) next.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: q */
    public final boolean mo5208q() {
        return this.f3913i;
    }

    /* renamed from: r */
    public final boolean mo5209r() {
        return this.f3916l;
    }

    /* renamed from: s */
    public C1092b mo5143s() {
        return C1092b.NORMAL;
    }

    /* renamed from: t */
    public final int mo5210t() {
        return this.f3917m.mo5164a();
    }

    /* renamed from: u */
    public C1099r mo5212u() {
        return this.f3917m;
    }

    /* renamed from: v */
    public void mo5213v() {
        synchronized (this.f3909e) {
            this.f3915k = true;
        }
    }

    /* renamed from: w */
    public boolean mo5214w() {
        boolean z;
        synchronized (this.f3909e) {
            z = this.f3915k;
        }
        return z;
    }

    /* renamed from: b */
    public void mo5192b(C1102u uVar) {
        C1095p.C1096a aVar;
        synchronized (this.f3909e) {
            aVar = this.f3910f;
        }
        if (aVar != null) {
            aVar.mo5126a(uVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5188a(C1091a aVar) {
        synchronized (this.f3909e) {
            this.f3920p = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5189a(C1095p<?> pVar) {
        C1091a aVar;
        synchronized (this.f3909e) {
            aVar = this.f3920p;
        }
        if (aVar != null) {
            aVar.mo5163a(this, pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5215x() {
        C1091a aVar;
        synchronized (this.f3909e) {
            aVar = this.f3920p;
        }
        if (aVar != null) {
            aVar.mo5162a(this);
        }
    }

    /* renamed from: a */
    public int compareTo(C1089n<T> nVar) {
        C1092b s = mo5143s();
        C1092b s2 = nVar.mo5143s();
        if (s == s2) {
            return this.f3911g.intValue() - nVar.f3911g.intValue();
        }
        return s2.ordinal() - s.ordinal();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(mo5191b());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3914j ? "[X] " : "[ ] ");
        sb.append(mo5194c());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo5143s());
        sb.append(" ");
        sb.append(this.f3911g);
        return sb.toString();
    }
}
