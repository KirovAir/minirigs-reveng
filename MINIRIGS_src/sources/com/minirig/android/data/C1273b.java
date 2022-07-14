package com.minirig.android.data;

import android.os.Build;
import com.minirig.android.GlobalApplication;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: com.minirig.android.data.b */
public class C1273b {

    /* renamed from: a */
    protected static final String f4680a = "b";

    /* renamed from: d */
    public static String f4681d = "userdatabase";

    /* renamed from: b */
    GlobalApplication f4682b;

    /* renamed from: c */
    public C1272a f4683c;

    /* renamed from: e */
    public AppDatabase f4684e;

    /* renamed from: f */
    public C1274c f4685f;

    /* renamed from: g */
    DateFormat f4686g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public C1273b(GlobalApplication globalApplication) {
        this.f4682b = globalApplication;
        this.f4683c = new C1272a(globalApplication, this);
        this.f4684e = AppDatabase.m6130a(globalApplication.getApplicationContext());
        if (this.f4684e.mo5588j().mo5593a().size() > 0) {
            this.f4685f = this.f4684e.mo5588j().mo5593a().get(0);
        } else {
            this.f4683c.mo5589a();
        }
        String str = f4680a;
        globalApplication.mo5229a(str, "Build.MODEL: " + Build.MODEL);
    }

    /* renamed from: a */
    public C1274c mo5591a(String str) {
        if (this.f4684e.mo5588j().mo5593a().size() == 0) {
            this.f4682b.mo5229a(f4680a, "There were no users, create one... ");
            String str2 = Build.MODEL;
            this.f4684e.mo5588j().mo5594a(new C1274c(str, Build.MANUFACTURER, str2));
        } else {
            this.f4682b.mo5229a(f4680a, "Persistent user was found ");
        }
        return this.f4684e.mo5588j().mo5593a().get(0);
    }

    /* renamed from: a */
    public void mo5592a() {
        this.f4685f.f4727b = 1;
        this.f4684e.mo5588j().mo5595b(this.f4685f);
    }
}
