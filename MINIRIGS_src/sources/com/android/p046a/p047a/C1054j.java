package com.android.p046a.p047a;

import com.android.p046a.C1082g;
import com.android.p046a.C1089n;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.android.a.a.j */
public class C1054j extends C1042b {

    /* renamed from: a */
    private final C1055a f3816a;

    /* renamed from: b */
    private final SSLSocketFactory f3817b;

    /* renamed from: com.android.a.a.j$a */
    public interface C1055a {
        /* renamed from: a */
        String mo5118a(String str);
    }

    /* renamed from: a */
    private static boolean m5525a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    public C1054j() {
        this((C1055a) null);
    }

    public C1054j(C1055a aVar) {
        this(aVar, (SSLSocketFactory) null);
    }

    public C1054j(C1055a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f3816a = aVar;
        this.f3817b = sSLSocketFactory;
    }

    /* renamed from: a */
    public C1052h mo5092a(C1089n<?> nVar, Map<String, String> map) {
        String str;
        String c = nVar.mo5194c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(nVar.mo5199h());
        hashMap.putAll(map);
        C1055a aVar = this.f3816a;
        if (aVar != null) {
            str = aVar.mo5118a(c);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + c);
            }
        } else {
            str = c;
        }
        HttpURLConnection a = m5521a(new URL(str), nVar);
        for (String str2 : hashMap.keySet()) {
            a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m5523a(a, nVar);
        int responseCode = a.getResponseCode();
        if (responseCode == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } else if (!m5525a(nVar.mo5180a(), responseCode)) {
            return new C1052h(responseCode, m5522a((Map<String, List<String>>) a.getHeaderFields()));
        } else {
            return new C1052h(responseCode, m5522a((Map<String, List<String>>) a.getHeaderFields()), a.getContentLength(), m5520a(a));
        }
    }

    /* renamed from: a */
    static List<C1082g> m5522a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String gVar : (List) next.getValue()) {
                    arrayList.add(new C1082g((String) next.getKey(), gVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static InputStream m5520a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo5117a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: a */
    private HttpURLConnection m5521a(URL url, C1089n<?> nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection a = mo5117a(url);
        int t = nVar.mo5210t();
        a.setConnectTimeout(t);
        a.setReadTimeout(t);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f3817b) != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(sSLSocketFactory);
        }
        return a;
    }

    /* renamed from: a */
    static void m5523a(HttpURLConnection httpURLConnection, C1089n<?> nVar) {
        switch (nVar.mo5180a()) {
            case -1:
                byte[] l = nVar.mo5203l();
                if (l != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m5524a(httpURLConnection, nVar, l);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m5526b(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m5526b(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m5526b(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: b */
    private static void m5526b(HttpURLConnection httpURLConnection, C1089n<?> nVar) {
        byte[] p = nVar.mo5207p();
        if (p != null) {
            m5524a(httpURLConnection, nVar, p);
        }
    }

    /* renamed from: a */
    private static void m5524a(HttpURLConnection httpURLConnection, C1089n<?> nVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", nVar.mo5206o());
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
