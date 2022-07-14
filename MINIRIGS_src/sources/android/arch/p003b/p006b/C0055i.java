package android.arch.p003b.p006b;

import android.arch.p003b.p004a.C0029d;
import android.arch.p003b.p004a.C0030e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: android.arch.b.b.i */
public class C0055i implements C0029d, C0030e {

    /* renamed from: g */
    static final TreeMap<Integer, C0055i> f126g = new TreeMap<>();

    /* renamed from: a */
    final long[] f127a;

    /* renamed from: b */
    final double[] f128b;

    /* renamed from: c */
    final String[] f129c;

    /* renamed from: d */
    final byte[][] f130d;

    /* renamed from: e */
    final int f131e;

    /* renamed from: f */
    int f132f;

    /* renamed from: h */
    private volatile String f133h;

    /* renamed from: i */
    private final int[] f134i;

    public void close() {
    }

    /* renamed from: a */
    public static C0055i m173a(String str, int i) {
        synchronized (f126g) {
            Map.Entry<Integer, C0055i> ceilingEntry = f126g.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f126g.remove(ceilingEntry.getKey());
                C0055i value = ceilingEntry.getValue();
                value.mo136b(str, i);
                return value;
            }
            C0055i iVar = new C0055i(i);
            iVar.mo136b(str, i);
            return iVar;
        }
    }

    private C0055i(int i) {
        this.f131e = i;
        int i2 = i + 1;
        this.f134i = new int[i2];
        this.f127a = new long[i2];
        this.f128b = new double[i2];
        this.f129c = new String[i2];
        this.f130d = new byte[i2][];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo136b(String str, int i) {
        this.f133h = str;
        this.f132f = i;
    }

    /* renamed from: b */
    public void mo135b() {
        synchronized (f126g) {
            f126g.put(Integer.valueOf(this.f131e), this);
            m174c();
        }
    }

    /* renamed from: c */
    private static void m174c() {
        if (f126g.size() > 15) {
            int size = f126g.size() - 10;
            Iterator<Integer> it = f126g.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public String mo34a() {
        return this.f133h;
    }

    /* renamed from: a */
    public void mo35a(C0029d dVar) {
        for (int i = 1; i <= this.f132f; i++) {
            switch (this.f134i[i]) {
                case 1:
                    dVar.mo61a(i);
                    break;
                case 2:
                    dVar.mo63a(i, this.f127a[i]);
                    break;
                case 3:
                    dVar.mo62a(i, this.f128b[i]);
                    break;
                case 4:
                    dVar.mo64a(i, this.f129c[i]);
                    break;
                case 5:
                    dVar.mo65a(i, this.f130d[i]);
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo61a(int i) {
        this.f134i[i] = 1;
    }

    /* renamed from: a */
    public void mo63a(int i, long j) {
        this.f134i[i] = 2;
        this.f127a[i] = j;
    }

    /* renamed from: a */
    public void mo62a(int i, double d) {
        this.f134i[i] = 3;
        this.f128b[i] = d;
    }

    /* renamed from: a */
    public void mo64a(int i, String str) {
        this.f134i[i] = 4;
        this.f129c[i] = str;
    }

    /* renamed from: a */
    public void mo65a(int i, byte[] bArr) {
        this.f134i[i] = 5;
        this.f130d[i] = bArr;
    }
}
