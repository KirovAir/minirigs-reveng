package com.minirig.android;

import android.app.Application;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import com.android.p046a.p047a.C1056k;
import com.android.p046a.p047a.C1066m;
import com.minirig.android.data.C1273b;
import com.minirig.android.p048a.C1227b;
import com.minirig.android.p048a.C1228c;
import com.minirig.android.p048a.C1229d;
import com.minirig.android.p048a.C1230e;
import com.minirig.android.p048a.C1231f;
import com.minirig.android.p048a.minirigStatusClass;
import com.minirig.android.p049b.C1250e;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GlobalApplication extends Application {

    /* renamed from: a */
    protected static final String f3955a = "GlobalApplication";

    /* renamed from: b */
    public boolean f3956b = false;

    /* renamed from: c */
    public SharedPreferences f3957c;

    /* renamed from: d */
    public C1228c f3958d = new C1228c();

    /* renamed from: e */
    public minirigStatusClass minirigf3 = new minirigStatusClass();

    /* renamed from: f */
    public C1231f f3960f = new C1231f();

    /* renamed from: g */
    public C1229d f3961g = new C1229d();

    /* renamed from: h */
    public C1227b f3962h = new C1227b();

    /* renamed from: i */
    public C1250e f3963i;

    /* renamed from: j */
    public C1273b f3964j;

    /* renamed from: k */
    public HashMap<String, String> f3965k = new HashMap<>();

    /* renamed from: l */
    public C1230e f3966l;

    /* renamed from: m */
    public String f3967m = "";

    /* renamed from: n */
    public JSONArray f3968n = null;

    /* renamed from: o */
    public HashMap<String, C1066m> f3969o = new HashMap<>();

    /* renamed from: p */
    public int f3970p = -1;

    /* renamed from: q */
    public String f3971q = "";

    /* renamed from: r */
    public String f3972r = "";

    /* renamed from: s */
    private C1056k f3973s;

    /* renamed from: a */
    public void mo5229a(String str, String str2) {
    }

    public void onCreate() {
        super.onCreate();
        this.f3957c = getSharedPreferences("MinirigPrefs", 0);
        this.f3963i = new C1250e(this);
        this.f3965k.put("0", "Unknown");
        this.f3965k.put("1", "MRBT1");
        this.f3965k.put("10", "MRBT2");
        this.f3965k.put("11", "MRBT2");
        this.f3965k.put("20", "MRM");
        this.f3965k.put("21", "MRM2");
        this.f3965k.put("30", "MRBT3");
        this.f3964j = new C1273b(this);
    }

    /* renamed from: a */
    public void mo5228a(C1230e eVar) {
        this.f3966l = eVar;
        this.f3966l.setModel();
        this.minirigf3.ledColorf4464d = this.f3966l.ledColor;
        this.minirigf3.minirigType = eVar.minirigType;
    }

    /* renamed from: a */
    public void mo5230a(JSONArray jSONArray) {
        this.f3968n = jSONArray;
        try {
            this.f3969o = new HashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.getString("image").equalsIgnoreCase("") && !jSONObject.getString("image").equalsIgnoreCase("null")) {
                    C1066m mVar = new C1066m(getApplicationContext());
                    mVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    String str = "https://dreambaked.com/minirig_data_collection/uploads/broadcasts/" + jSONObject.getString("image");
                    this.f3973s = this.f3963i.mo5555b();
                    this.f3973s.mo5119a(str, C1056k.m5530a(mVar, R.drawable.booting_1, 17301543));
                    mVar.mo5144a(str, this.f3973s);
                    this.f3969o.put(Integer.toString(i), mVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
