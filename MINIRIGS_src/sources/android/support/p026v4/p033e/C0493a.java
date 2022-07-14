package android.support.p026v4.p033e;

import android.support.p026v4.p035g.C0531k;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.e.a */
public final class C0493a {

    /* renamed from: a */
    private final String f1629a;

    /* renamed from: b */
    private final String f1630b;

    /* renamed from: c */
    private final String f1631c;

    /* renamed from: d */
    private final List<List<byte[]>> f1632d;

    /* renamed from: e */
    private final int f1633e = 0;

    /* renamed from: f */
    private final String f1634f = (this.f1629a + "-" + this.f1630b + "-" + this.f1631c);

    public C0493a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1629a = (String) C0531k.m2315a(str);
        this.f1630b = (String) C0531k.m2315a(str2);
        this.f1631c = (String) C0531k.m2315a(str3);
        this.f1632d = (List) C0531k.m2315a(list);
    }

    /* renamed from: a */
    public String mo1913a() {
        return this.f1629a;
    }

    /* renamed from: b */
    public String mo1914b() {
        return this.f1630b;
    }

    /* renamed from: c */
    public String mo1915c() {
        return this.f1631c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo1916d() {
        return this.f1632d;
    }

    /* renamed from: e */
    public int mo1917e() {
        return this.f1633e;
    }

    /* renamed from: f */
    public String mo1918f() {
        return this.f1634f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1629a + ", mProviderPackage: " + this.f1630b + ", mQuery: " + this.f1631c + ", mCertificates:");
        for (int i = 0; i < this.f1632d.size(); i++) {
            sb.append(" [");
            List list = this.f1632d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1633e);
        return sb.toString();
    }
}
