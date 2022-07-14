package com.android.p046a.p047a;

import com.android.p046a.C1082g;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.a.a.h */
public final class C1052h {

    /* renamed from: a */
    private final int f3812a;

    /* renamed from: b */
    private final List<C1082g> f3813b;

    /* renamed from: c */
    private final int f3814c;

    /* renamed from: d */
    private final InputStream f3815d;

    public C1052h(int i, List<C1082g> list) {
        this(i, list, -1, (InputStream) null);
    }

    public C1052h(int i, List<C1082g> list, int i2, InputStream inputStream) {
        this.f3812a = i;
        this.f3813b = list;
        this.f3814c = i2;
        this.f3815d = inputStream;
    }

    /* renamed from: a */
    public final int mo5113a() {
        return this.f3812a;
    }

    /* renamed from: b */
    public final List<C1082g> mo5114b() {
        return Collections.unmodifiableList(this.f3813b);
    }

    /* renamed from: c */
    public final int mo5115c() {
        return this.f3814c;
    }

    /* renamed from: d */
    public final InputStream mo5116d() {
        return this.f3815d;
    }
}
