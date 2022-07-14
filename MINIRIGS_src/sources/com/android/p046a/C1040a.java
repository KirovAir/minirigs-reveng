package com.android.p046a;

import android.content.Intent;

/* renamed from: com.android.a.a */
public class C1040a extends C1102u {

    /* renamed from: b */
    private Intent f3786b;

    public C1040a() {
    }

    public C1040a(C1086k kVar) {
        super(kVar);
    }

    public String getMessage() {
        if (this.f3786b != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
