package com.android.p046a.p047a;

import com.android.p046a.C1082g;
import com.android.p046a.C1089n;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.android.a.a.a */
class C1041a extends C1042b {

    /* renamed from: a */
    private final C1053i f3787a;

    C1041a(C1053i iVar) {
        this.f3787a = iVar;
    }

    /* renamed from: a */
    public C1052h mo5092a(C1089n<?> nVar, Map<String, String> map) {
        try {
            HttpResponse b = this.f3787a.mo5093b(nVar, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new C1082g(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C1052h(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C1052h(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
