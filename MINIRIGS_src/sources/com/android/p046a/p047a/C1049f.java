package com.android.p046a.p047a;

import com.android.p046a.C1089n;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: com.android.a.a.f */
public class C1049f implements C1053i {

    /* renamed from: a */
    protected final HttpClient f3811a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5111a(HttpUriRequest httpUriRequest) {
    }

    public C1049f(HttpClient httpClient) {
        this.f3811a = httpClient;
    }

    /* renamed from: a */
    private static void m5504a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String next : map.keySet()) {
            httpUriRequest.setHeader(next, map.get(next));
        }
    }

    /* renamed from: b */
    public HttpResponse mo5093b(C1089n<?> nVar, Map<String, String> map) {
        HttpUriRequest a = m5502a(nVar, map);
        m5504a(a, map);
        m5504a(a, nVar.mo5199h());
        mo5111a(a);
        HttpParams params = a.getParams();
        int t = nVar.mo5210t();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, t);
        return this.f3811a.execute(a);
    }

    /* renamed from: a */
    static HttpUriRequest m5502a(C1089n<?> nVar, Map<String, String> map) {
        switch (nVar.mo5180a()) {
            case -1:
                byte[] l = nVar.mo5203l();
                if (l == null) {
                    return new HttpGet(nVar.mo5194c());
                }
                HttpPost httpPost = new HttpPost(nVar.mo5194c());
                httpPost.addHeader("Content-Type", nVar.mo5202k());
                httpPost.setEntity(new ByteArrayEntity(l));
                return httpPost;
            case 0:
                return new HttpGet(nVar.mo5194c());
            case 1:
                HttpPost httpPost2 = new HttpPost(nVar.mo5194c());
                httpPost2.addHeader("Content-Type", nVar.mo5206o());
                m5503a((HttpEntityEnclosingRequestBase) httpPost2, nVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(nVar.mo5194c());
                httpPut.addHeader("Content-Type", nVar.mo5206o());
                m5503a((HttpEntityEnclosingRequestBase) httpPut, nVar);
                return httpPut;
            case 3:
                return new HttpDelete(nVar.mo5194c());
            case 4:
                return new HttpHead(nVar.mo5194c());
            case 5:
                return new HttpOptions(nVar.mo5194c());
            case 6:
                return new HttpTrace(nVar.mo5194c());
            case 7:
                C1050a aVar = new C1050a(nVar.mo5194c());
                aVar.addHeader("Content-Type", nVar.mo5206o());
                m5503a((HttpEntityEnclosingRequestBase) aVar, nVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    private static void m5503a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, C1089n<?> nVar) {
        byte[] p = nVar.mo5207p();
        if (p != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(p));
        }
    }

    /* renamed from: com.android.a.a.f$a */
    public static final class C1050a extends HttpEntityEnclosingRequestBase {
        public String getMethod() {
            return "PATCH";
        }

        public C1050a() {
        }

        public C1050a(String str) {
            setURI(URI.create(str));
        }
    }
}
