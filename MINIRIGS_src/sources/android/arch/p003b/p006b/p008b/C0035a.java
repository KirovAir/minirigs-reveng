package android.arch.p003b.p006b.p008b;

import android.arch.p003b.p004a.C0023b;
import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: android.arch.b.b.b.a */
public class C0035a {

    /* renamed from: a */
    public final String f53a;

    /* renamed from: b */
    public final Map<String, C0036a> f54b;

    /* renamed from: c */
    public final Set<C0037b> f55c;

    /* renamed from: d */
    public final Set<C0039d> f56d;

    public C0035a(String str, Map<String, C0036a> map, Set<C0037b> set, Set<C0039d> set2) {
        Set<C0039d> set3;
        this.f53a = str;
        this.f54b = Collections.unmodifiableMap(map);
        this.f55c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f56d = set3;
    }

    public boolean equals(Object obj) {
        Set<C0039d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0035a aVar = (C0035a) obj;
        String str = this.f53a;
        if (str == null ? aVar.f53a != null : !str.equals(aVar.f53a)) {
            return false;
        }
        Map<String, C0036a> map = this.f54b;
        if (map == null ? aVar.f54b != null : !map.equals(aVar.f54b)) {
            return false;
        }
        Set<C0037b> set2 = this.f55c;
        if (set2 == null ? aVar.f55c != null : !set2.equals(aVar.f55c)) {
            return false;
        }
        Set<C0039d> set3 = this.f56d;
        if (set3 == null || (set = aVar.f56d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f53a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0036a> map = this.f54b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0037b> set = this.f55c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f53a + '\'' + ", columns=" + this.f54b + ", foreignKeys=" + this.f55c + ", indices=" + this.f56d + '}';
    }

    /* renamed from: a */
    public static C0035a m105a(C0023b bVar, String str) {
        return new C0035a(str, m108c(bVar, str), m107b(bVar, str), m109d(bVar, str));
    }

    /* renamed from: b */
    private static Set<C0037b> m107b(C0023b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor b = bVar.mo39b("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<C0038c> a = m106a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0038c next : a) {
                        if (next.f67a == i2) {
                            arrayList.add(next.f69c);
                            arrayList2.add(next.f70d);
                        }
                    }
                    hashSet.add(new C0037b(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* renamed from: a */
    private static List<C0038c> m106a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0038c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static Map<String, C0036a> m108c(C0023b bVar, String str) {
        Cursor b = bVar.mo39b("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex("name");
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    hashMap.put(string, new C0036a(string, b.getString(columnIndex2), b.getInt(columnIndex3) != 0, b.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private static Set<C0039d> m109d(C0023b bVar, String str) {
        Cursor b = bVar.mo39b("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex("name");
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b.moveToNext()) {
                        if ("c".equals(b.getString(columnIndex2))) {
                            String string = b.getString(columnIndex);
                            boolean z = true;
                            if (b.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0039d a = m104a(bVar, string, z);
                            if (a == null) {
                                b.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    b.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* renamed from: a */
    private static C0039d m104a(C0023b bVar, String str, boolean z) {
        Cursor b = bVar.mo39b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0039d dVar = new C0039d(str, z, arrayList);
                    b.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* renamed from: android.arch.b.b.b.a$a */
    public static class C0036a {

        /* renamed from: a */
        public final String f57a;

        /* renamed from: b */
        public final String f58b;

        /* renamed from: c */
        public final int f59c;

        /* renamed from: d */
        public final boolean f60d;

        /* renamed from: e */
        public final int f61e;

        public C0036a(String str, String str2, boolean z, int i) {
            this.f57a = str;
            this.f58b = str2;
            this.f60d = z;
            this.f61e = i;
            this.f59c = m110a(str2);
        }

        /* renamed from: a */
        private static int m110a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0036a aVar = (C0036a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f61e != aVar.f61e) {
                    return false;
                }
            } else if (mo86a() != aVar.mo86a()) {
                return false;
            }
            if (this.f57a.equals(aVar.f57a) && this.f60d == aVar.f60d && this.f59c == aVar.f59c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo86a() {
            return this.f61e > 0;
        }

        public int hashCode() {
            return (((((this.f57a.hashCode() * 31) + this.f59c) * 31) + (this.f60d ? 1231 : 1237)) * 31) + this.f61e;
        }

        public String toString() {
            return "Column{name='" + this.f57a + '\'' + ", type='" + this.f58b + '\'' + ", affinity='" + this.f59c + '\'' + ", notNull=" + this.f60d + ", primaryKeyPosition=" + this.f61e + '}';
        }
    }

    /* renamed from: android.arch.b.b.b.a$b */
    public static class C0037b {

        /* renamed from: a */
        public final String f62a;

        /* renamed from: b */
        public final String f63b;

        /* renamed from: c */
        public final String f64c;

        /* renamed from: d */
        public final List<String> f65d;

        /* renamed from: e */
        public final List<String> f66e;

        public C0037b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f62a = str;
            this.f63b = str2;
            this.f64c = str3;
            this.f65d = Collections.unmodifiableList(list);
            this.f66e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0037b bVar = (C0037b) obj;
            if (this.f62a.equals(bVar.f62a) && this.f63b.equals(bVar.f63b) && this.f64c.equals(bVar.f64c) && this.f65d.equals(bVar.f65d)) {
                return this.f66e.equals(bVar.f66e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f62a.hashCode() * 31) + this.f63b.hashCode()) * 31) + this.f64c.hashCode()) * 31) + this.f65d.hashCode()) * 31) + this.f66e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f62a + '\'' + ", onDelete='" + this.f63b + '\'' + ", onUpdate='" + this.f64c + '\'' + ", columnNames=" + this.f65d + ", referenceColumnNames=" + this.f66e + '}';
        }
    }

    /* renamed from: android.arch.b.b.b.a$c */
    static class C0038c implements Comparable<C0038c> {

        /* renamed from: a */
        final int f67a;

        /* renamed from: b */
        final int f68b;

        /* renamed from: c */
        final String f69c;

        /* renamed from: d */
        final String f70d;

        C0038c(int i, int i2, String str, String str2) {
            this.f67a = i;
            this.f68b = i2;
            this.f69c = str;
            this.f70d = str2;
        }

        /* renamed from: a */
        public int compareTo(C0038c cVar) {
            int i = this.f67a - cVar.f67a;
            return i == 0 ? this.f68b - cVar.f68b : i;
        }
    }

    /* renamed from: android.arch.b.b.b.a$d */
    public static class C0039d {

        /* renamed from: a */
        public final String f71a;

        /* renamed from: b */
        public final boolean f72b;

        /* renamed from: c */
        public final List<String> f73c;

        public C0039d(String str, boolean z, List<String> list) {
            this.f71a = str;
            this.f72b = z;
            this.f73c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0039d dVar = (C0039d) obj;
            if (this.f72b != dVar.f72b || !this.f73c.equals(dVar.f73c)) {
                return false;
            }
            if (this.f71a.startsWith("index_")) {
                return dVar.f71a.startsWith("index_");
            }
            return this.f71a.equals(dVar.f71a);
        }

        public int hashCode() {
            int i;
            if (this.f71a.startsWith("index_")) {
                i = "index_".hashCode();
            } else {
                i = this.f71a.hashCode();
            }
            return (((i * 31) + (this.f72b ? 1 : 0)) * 31) + this.f73c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f71a + '\'' + ", unique=" + this.f72b + ", columns=" + this.f73c + '}';
        }
    }
}
