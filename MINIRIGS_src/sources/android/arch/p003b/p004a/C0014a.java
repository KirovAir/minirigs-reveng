package android.arch.p003b.p004a;

/* renamed from: android.arch.b.a.a */
public final class C0014a implements C0030e {

    /* renamed from: a */
    private final String f22a;

    /* renamed from: b */
    private final Object[] f23b;

    public C0014a(String str, Object[] objArr) {
        this.f22a = str;
        this.f23b = objArr;
    }

    public C0014a(String str) {
        this(str, (Object[]) null);
    }

    /* renamed from: a */
    public String mo34a() {
        return this.f22a;
    }

    /* renamed from: a */
    public void mo35a(C0029d dVar) {
        m38a(dVar, this.f23b);
    }

    /* renamed from: a */
    public static void m38a(C0029d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m37a(dVar, i, obj);
            }
        }
    }

    /* renamed from: a */
    private static void m37a(C0029d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.mo61a(i);
        } else if (obj instanceof byte[]) {
            dVar.mo65a(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo62a(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo62a(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo63a(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo63a(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo63a(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo63a(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo64a(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.mo63a(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
        }
    }
}
