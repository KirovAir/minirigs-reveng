package com.android.p046a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.a.k */
public class C1086k {

    /* renamed from: a */
    public final int f3899a;

    /* renamed from: b */
    public final byte[] f3900b;

    /* renamed from: c */
    public final Map<String, String> f3901c;

    /* renamed from: d */
    public final List<C1082g> f3902d;

    /* renamed from: e */
    public final boolean f3903e;

    /* renamed from: f */
    public final long f3904f;

    @Deprecated
    public C1086k(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m5613a(map), z, j);
    }

    public C1086k(int i, byte[] bArr, boolean z, long j, List<C1082g> list) {
        this(i, bArr, m5614a(list), list, z, j);
    }

    @Deprecated
    public C1086k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    private C1086k(int i, byte[] bArr, Map<String, String> map, List<C1082g> list, boolean z, long j) {
        this.f3899a = i;
        this.f3900b = bArr;
        this.f3901c = map;
        if (list == null) {
            this.f3902d = null;
        } else {
            this.f3902d = Collections.unmodifiableList(list);
        }
        this.f3903e = z;
        this.f3904f = j;
    }

    /* renamed from: a */
    private static Map<String, String> m5614a(List<C1082g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1082g next : list) {
            treeMap.put(next.mo5173a(), next.mo5174b());
        }
        return treeMap;
    }

    /* renamed from: a */
    private static List<C1082g> m5613a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C1082g((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }
}
