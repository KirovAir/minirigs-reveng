package com.minirig.android.p049b;

import com.android.p046a.C1086k;
import com.android.p046a.C1088m;
import com.android.p046a.C1089n;
import com.android.p046a.C1095p;
import com.android.p046a.p047a.C1051g;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.minirig.android.b.c */
public class C1245c extends C1089n<JSONObject> {

    /* renamed from: a */
    private C1095p.C1097b<JSONObject> f4567a;

    /* renamed from: b */
    private Map<String, String> f4568b;

    public C1245c(int i, String str, Map<String, String> map, C1095p.C1097b<JSONObject> bVar, C1095p.C1096a aVar) {
        super(i, str, aVar);
        this.f4567a = bVar;
        this.f4568b = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, String> mo5204m() {
        return this.f4568b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1095p<JSONObject> mo5139a(C1086k kVar) {
        try {
            return C1095p.m5665a(new JSONObject(new String(kVar.f3900b, C1051g.m5510a(kVar.f3901c))), C1051g.m5508a(kVar));
        } catch (UnsupportedEncodingException e) {
            return C1095p.m5664a(new C1088m((Throwable) e));
        } catch (JSONException e2) {
            return C1095p.m5664a(new C1088m((Throwable) e2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5141b(JSONObject jSONObject) {
        this.f4567a.mo5128a(jSONObject);
    }
}
