package com.minirig.android.p049b;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.p046a.C1093o;
import com.android.p046a.C1095p;
import com.android.p046a.C1102u;
import com.android.p046a.C1103v;
import com.android.p046a.p047a.C1042b;
import com.android.p046a.p047a.C1043c;
import com.android.p046a.p047a.C1046e;
import com.android.p046a.p047a.C1054j;
import com.android.p046a.p047a.C1056k;
import com.android.p046a.p047a.C1070o;
import com.minirig.android.GlobalApplication;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.minirig.android.b.e */
public class C1250e {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f4579h = "e";

    /* renamed from: a */
    GlobalApplication f4580a;

    /* renamed from: b */
    public String f4581b = "Unknown";

    /* renamed from: c */
    public String f4582c = "0";

    /* renamed from: d */
    public String f4583d = "";

    /* renamed from: e */
    public Map<String, Integer> f4584e = new HashMap();

    /* renamed from: f */
    public String f4585f = "0";

    /* renamed from: g */
    public String f4586g = "Unknown";

    /* renamed from: i */
    private String f4587i = "0";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4588j = false;

    /* renamed from: k */
    private C1093o f4589k;

    /* renamed from: l */
    private C1056k f4590l;

    /* renamed from: com.minirig.android.b.e$a */
    public enum C1256a {
        NONE,
        UPDATE_FILE_INFO,
        UPDATE_FILE_DOWNLOAD,
        GET_LATEST_VERSIONS,
        SYNC_USER,
        SYNC_DEVICE,
        GET_BROADCASTS,
        SAVE_BROADCAST_CLICK
    }

    public C1250e(GlobalApplication globalApplication) {
        this.f4580a = globalApplication;
        this.f4589k = mo5551a();
        this.f4590l = new C1056k(this.f4589k, new C1056k.C1062b() {

            /* renamed from: b */
            private final LruCache<String, Bitmap> f4592b = new LruCache<>(20);

            /* renamed from: a */
            public Bitmap mo5134a(String str) {
                return this.f4592b.get(str);
            }

            /* renamed from: a */
            public void mo5135a(String str, Bitmap bitmap) {
                this.f4592b.put(str, bitmap);
            }
        });
    }

    /* renamed from: a */
    public C1093o mo5551a() {
        if (this.f4589k == null) {
            this.f4589k = new C1093o(new C1046e(this.f4580a.getApplicationContext().getCacheDir(), 10485760), new C1043c((C1042b) new C1054j()));
            this.f4589k.mo5218a();
        }
        return this.f4589k;
    }

    /* renamed from: b */
    public C1056k mo5555b() {
        return this.f4590l;
    }

    public C1250e() {
        this.f4584e.put("MRM", -1);
        this.f4584e.put("MRBT2", -1);
        this.f4584e.put("MRBT3", -1);
    }

    /* renamed from: a */
    public void mo5553a(String str, HashMap<String, String> hashMap, final C1256a aVar) {
        GlobalApplication globalApplication = this.f4580a;
        String str2 = f4579h;
        globalApplication.mo5229a(str2, "Post Request: " + str);
        GlobalApplication globalApplication2 = this.f4580a;
        String str3 = f4579h;
        globalApplication2.mo5229a(str3, " Post Params: " + hashMap.toString());
        C1242a.m6085a(this.f4580a.getApplicationContext()).mo5541a(new C1245c(1, str, hashMap, new C1095p.C1097b<JSONObject>() {
            /* renamed from: a */
            public void mo5128a(JSONObject jSONObject) {
                try {
                    GlobalApplication globalApplication = C1250e.this.f4580a;
                    String c = C1250e.f4579h;
                    globalApplication.mo5229a(c, "Post Response: " + jSONObject);
                    if (jSONObject.isNull("success") || !jSONObject.getBoolean("success")) {
                        GlobalApplication globalApplication2 = C1250e.this.f4580a;
                        String c2 = C1250e.f4579h;
                        globalApplication2.mo5229a(c2, "The request failed: " + jSONObject.getString("message"));
                    } else if (aVar == C1256a.SYNC_USER) {
                        if (!jSONObject.isNull("user_id")) {
                            C1250e.this.f4580a.f3964j.f4685f = C1250e.this.f4580a.f3964j.mo5591a(jSONObject.getString("user_id"));
                            C1250e.this.f4580a.f3964j.mo5592a();
                            return;
                        }
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "Data collection user could not be set up because no user_id was returned");
                    } else if (aVar == C1256a.SYNC_DEVICE) {
                        if (!jSONObject.isNull("user_id")) {
                            C1250e.this.f4580a.f3964j.f4685f = C1250e.this.f4580a.f3964j.mo5591a(jSONObject.getString("user_id"));
                            C1250e.this.f4580a.f3964j.mo5592a();
                        } else {
                            C1250e.this.f4580a.mo5229a(C1250e.f4579h, "Data collection user could not be set up because no user_id was returned");
                        }
                        C1250e.this.f4580a.f3964j.f4683c.f4678d = true;
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "sync device successfull");
                    } else {
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "No function setup to handle response");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new C1095p.C1096a() {
            /* renamed from: a */
            public void mo5126a(C1102u uVar) {
                C1103v.m5679c(aVar.name() + " Error: ", uVar);
                GlobalApplication globalApplication = C1250e.this.f4580a;
                String c = C1250e.f4579h;
                globalApplication.mo5229a(c, "     Post Error: " + uVar.getMessage());
            }
        }), f4579h);
    }

    /* renamed from: a */
    public void mo5552a(final String str, final C1256a aVar) {
        GlobalApplication globalApplication = this.f4580a;
        String str2 = f4579h;
        globalApplication.mo5229a(str2, "simpleRequest URL: " + str);
        C1242a.m6085a(this.f4580a.getApplicationContext()).mo5541a(new C1070o(str, new C1095p.C1097b<String>() {
            /* renamed from: a */
            public void mo5128a(String str) {
                try {
                    if (aVar == C1256a.UPDATE_FILE_INFO) {
                        String[] split = str.split("/");
                        String str2 = split[split.length - 1];
                        JSONObject jSONObject = new JSONObject(str);
                        if (!jSONObject.isNull("success")) {
                            C1250e.this.f4581b = jSONObject.getString("full_name");
                            C1250e.this.f4582c = jSONObject.getString("version");
                            C1250e.this.f4583d = jSONObject.getString("updates");
                            C1250e.this.mo5554a(jSONObject.getString("full_name"), false);
                            if (C1250e.this.f4588j) {
                                str2 = "override";
                            }
                            C1250e eVar = C1250e.this;
                            eVar.mo5552a("https://settings.minirigs.co.uk/" + str2 + "/files/" + C1250e.this.f4581b, C1256a.UPDATE_FILE_DOWNLOAD);
                        }
                    } else if (aVar == C1256a.UPDATE_FILE_DOWNLOAD) {
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "        UPDATE_FILE_DOWNLOAD");
                    } else if (aVar == C1256a.GET_LATEST_VERSIONS) {
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "        GET_LATEST_VERSIONS");
                        JSONObject jSONObject2 = new JSONObject(str);
                        if (!jSONObject2.isNull("success")) {
                            GlobalApplication globalApplication = C1250e.this.f4580a;
                            String c = C1250e.f4579h;
                            globalApplication.mo5229a(c, "MRM " + jSONObject2.getJSONObject("latestUpdates").getString("MRM"));
                            GlobalApplication globalApplication2 = C1250e.this.f4580a;
                            String c2 = C1250e.f4579h;
                            globalApplication2.mo5229a(c2, "MRBT2 " + jSONObject2.getJSONObject("latestUpdates").getString("MRBT2"));
                            GlobalApplication globalApplication3 = C1250e.this.f4580a;
                            String c3 = C1250e.f4579h;
                            globalApplication3.mo5229a(c3, "MRBT3 " + jSONObject2.getJSONObject("latestUpdates").getString("MRBT3"));
                            C1250e.this.f4584e.put("MRM", Integer.valueOf(jSONObject2.getJSONObject("latestUpdates").getInt("MRM")));
                            C1250e.this.f4584e.put("MRBT2", Integer.valueOf(jSONObject2.getJSONObject("latestUpdates").getInt("MRBT2")));
                            C1250e.this.f4584e.put("MRBT3", Integer.valueOf(jSONObject2.getJSONObject("latestUpdates").getInt("MRBT3")));
                        }
                    } else if (aVar == C1256a.GET_BROADCASTS) {
                        C1250e.this.f4580a.mo5229a(C1250e.f4579h, "        GET_BROADCASTS");
                        JSONObject jSONObject3 = new JSONObject(str);
                        if (!jSONObject3.isNull("success")) {
                            C1250e.this.f4580a.mo5230a(jSONObject3.getJSONArray("results"));
                            GlobalApplication globalApplication4 = C1250e.this.f4580a;
                            String c4 = C1250e.f4579h;
                            globalApplication4.mo5229a(c4, "broadcasts: " + C1250e.this.f4580a.f3968n);
                            GlobalApplication globalApplication5 = C1250e.this.f4580a;
                            String c5 = C1250e.f4579h;
                            globalApplication5.mo5229a(c5, "broadcastID: " + C1250e.this.f4580a.f3968n.getJSONObject(0).getInt("broadcastID"));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new C1095p.C1096a() {
            /* renamed from: a */
            public void mo5126a(C1102u uVar) {
            }
        }), f4579h);
    }

    /* renamed from: a */
    public boolean mo5554a(String str, boolean z) {
        for (String str2 : str.split(" ")) {
            if (str2.contains("MR")) {
                String[] split = str2.split("_");
                if (z) {
                    this.f4585f = split[0];
                    this.f4586g = split[1];
                } else {
                    this.f4587i = split[0];
                }
            }
        }
        if (z) {
            String str3 = this.f4586g;
            if (str3 == null || this.f4585f == null) {
                return false;
            }
            if (str3.equals("MRBT")) {
                this.f4586g = "MRBT2";
            }
        } else if (this.f4587i == null) {
            return false;
        }
        return true;
    }
}
