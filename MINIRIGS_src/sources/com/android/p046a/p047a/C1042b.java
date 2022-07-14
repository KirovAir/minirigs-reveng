package com.android.p046a.p047a;

import com.android.p046a.C1082g;
import com.android.p046a.C1089n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.a.a.b */
public abstract class C1042b implements C1053i {
    /* renamed from: a */
    public abstract C1052h mo5092a(C1089n<?> nVar, Map<String, String> map);

    @Deprecated
    /* renamed from: b */
    public final HttpResponse mo5093b(C1089n<?> nVar, Map<String, String> map) {
        C1052h a = mo5092a(nVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.mo5113a(), ""));
        ArrayList arrayList = new ArrayList();
        for (C1082g next : a.mo5114b()) {
            arrayList.add(new BasicHeader(next.mo5173a(), next.mo5174b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = a.mo5116d();
        if (d != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) a.mo5115c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
