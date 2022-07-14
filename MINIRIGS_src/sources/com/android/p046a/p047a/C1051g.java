package com.android.p046a.p047a;

import com.android.p046a.C1072b;
import com.android.p046a.C1082g;
import com.android.p046a.C1086k;
import com.android.p046a.C1103v;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: com.android.a.a.g */
public class C1051g {
    /* renamed from: a */
    public static C1072b.C1073a m5508a(C1086k kVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        C1086k kVar2 = kVar;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar2.f3901c;
        String str = map.get("Date");
        long a = str != null ? m5507a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? m5507a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m5507a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j3 = j4;
            } else {
                Long.signum(j);
                j3 = (j * 1000) + j4;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
            j3 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
        }
        C1072b.C1073a aVar = new C1072b.C1073a();
        aVar.f3862a = kVar2.f3900b;
        aVar.f3863b = str5;
        aVar.f3867f = j4;
        aVar.f3866e = j3;
        aVar.f3864c = a;
        aVar.f3865d = a3;
        aVar.f3868g = map;
        aVar.f3869h = kVar2.f3902d;
        return aVar;
    }

    /* renamed from: a */
    public static long m5507a(String str) {
        try {
            return m5512a().parse(str).getTime();
        } catch (ParseException e) {
            C1103v.m5677a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    static String m5509a(long j) {
        return m5512a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m5512a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    public static String m5511a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m5510a(Map<String, String> map) {
        return m5511a(map, "ISO-8859-1");
    }

    /* renamed from: a */
    static Map<String, String> m5513a(List<C1082g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1082g next : list) {
            treeMap.put(next.mo5173a(), next.mo5174b());
        }
        return treeMap;
    }

    /* renamed from: b */
    static List<C1082g> m5514b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C1082g((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }
}
