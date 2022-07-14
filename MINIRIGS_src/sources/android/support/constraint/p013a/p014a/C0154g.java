package android.support.constraint.p013a.p014a;

import android.support.constraint.p013a.p014a.C0142b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.g */
public class C0154g {

    /* renamed from: a */
    private int f517a;

    /* renamed from: b */
    private int f518b;

    /* renamed from: c */
    private int f519c;

    /* renamed from: d */
    private int f520d;

    /* renamed from: e */
    private ArrayList<C0155a> f521e = new ArrayList<>();

    /* renamed from: android.support.constraint.a.a.g$a */
    static class C0155a {

        /* renamed from: a */
        private C0142b f522a;

        /* renamed from: b */
        private C0142b f523b;

        /* renamed from: c */
        private int f524c;

        /* renamed from: d */
        private C0142b.C0145b f525d;

        /* renamed from: e */
        private int f526e;

        public C0155a(C0142b bVar) {
            this.f522a = bVar;
            this.f523b = bVar.mo443f();
            this.f524c = bVar.mo441d();
            this.f525d = bVar.mo442e();
            this.f526e = bVar.mo445h();
        }

        /* renamed from: a */
        public void mo514a(C0147c cVar) {
            this.f522a = cVar.mo448a(this.f522a.mo440c());
            C0142b bVar = this.f522a;
            if (bVar != null) {
                this.f523b = bVar.mo443f();
                this.f524c = this.f522a.mo441d();
                this.f525d = this.f522a.mo442e();
                this.f526e = this.f522a.mo445h();
                return;
            }
            this.f523b = null;
            this.f524c = 0;
            this.f525d = C0142b.C0145b.STRONG;
            this.f526e = 0;
        }

        /* renamed from: b */
        public void mo515b(C0147c cVar) {
            cVar.mo448a(this.f522a.mo440c()).mo438a(this.f523b, this.f524c, this.f525d, this.f526e);
        }
    }

    public C0154g(C0147c cVar) {
        this.f517a = cVar.mo482i();
        this.f518b = cVar.mo484j();
        this.f519c = cVar.mo486k();
        this.f520d = cVar.mo487l();
        ArrayList<C0142b> v = cVar.mo498v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            this.f521e.add(new C0155a(v.get(i)));
        }
    }

    /* renamed from: a */
    public void mo512a(C0147c cVar) {
        this.f517a = cVar.mo482i();
        this.f518b = cVar.mo484j();
        this.f519c = cVar.mo486k();
        this.f520d = cVar.mo487l();
        int size = this.f521e.size();
        for (int i = 0; i < size; i++) {
            this.f521e.get(i).mo514a(cVar);
        }
    }

    /* renamed from: b */
    public void mo513b(C0147c cVar) {
        cVar.mo463b(this.f517a);
        cVar.mo469c(this.f518b);
        cVar.mo473d(this.f519c);
        cVar.mo475e(this.f520d);
        int size = this.f521e.size();
        for (int i = 0; i < size; i++) {
            this.f521e.get(i).mo515b(cVar);
        }
    }
}
