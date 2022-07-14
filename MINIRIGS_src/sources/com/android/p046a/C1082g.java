package com.android.p046a;

import android.text.TextUtils;

/* renamed from: com.android.a.g */
public final class C1082g {

    /* renamed from: a */
    private final String f3892a;

    /* renamed from: b */
    private final String f3893b;

    public C1082g(String str, String str2) {
        this.f3892a = str;
        this.f3893b = str2;
    }

    /* renamed from: a */
    public final String mo5173a() {
        return this.f3892a;
    }

    /* renamed from: b */
    public final String mo5174b() {
        return this.f3893b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1082g gVar = (C1082g) obj;
        if (!TextUtils.equals(this.f3892a, gVar.f3892a) || !TextUtils.equals(this.f3893b, gVar.f3893b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f3892a.hashCode() * 31) + this.f3893b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f3892a + ",value=" + this.f3893b + "]";
    }
}
