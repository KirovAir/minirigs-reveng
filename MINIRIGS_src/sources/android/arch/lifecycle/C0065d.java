package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.d */
public abstract class C0065d {

    /* renamed from: android.arch.lifecycle.d$a */
    public enum C0066a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: a */
    public abstract C0067b mo180a();

    /* renamed from: a */
    public abstract void mo181a(C0072f fVar);

    /* renamed from: b */
    public abstract void mo182b(C0072f fVar);

    /* renamed from: android.arch.lifecycle.d$b */
    public enum C0067b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo183a(C0067b bVar) {
            return compareTo(bVar) >= 0;
        }
    }
}
