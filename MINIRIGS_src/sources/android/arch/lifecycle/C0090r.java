package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
public class C0090r {

    /* renamed from: a */
    private final C0091a f203a;

    /* renamed from: b */
    private final C0092s f204b;

    /* renamed from: android.arch.lifecycle.r$a */
    public interface C0091a {
        /* renamed from: a */
        <T extends C0089q> T mo217a(Class<T> cls);
    }

    public C0090r(C0092s sVar, C0091a aVar) {
        this.f203a = aVar;
        this.f204b = sVar;
    }

    /* renamed from: a */
    public <T extends C0089q> T mo215a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo216a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0089q> T mo216a(String str, Class<T> cls) {
        T a = this.f204b.mo218a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f203a.mo217a(cls);
        this.f204b.mo220a(str, a2);
        return a2;
    }
}
