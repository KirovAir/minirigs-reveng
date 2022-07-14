package android.support.constraint.p013a.p014a;

import android.support.constraint.p013a.C0158c;
import android.support.constraint.p013a.C0164g;
import java.util.HashSet;

/* renamed from: android.support.constraint.a.a.b */
public class C0142b {

    /* renamed from: a */
    final C0147c f412a;

    /* renamed from: b */
    final C0146c f413b;

    /* renamed from: c */
    C0142b f414c;

    /* renamed from: d */
    int f415d = 0;

    /* renamed from: e */
    int f416e = -1;

    /* renamed from: f */
    C0164g f417f;

    /* renamed from: g */
    int f418g = Integer.MAX_VALUE;

    /* renamed from: h */
    private C0145b f419h = C0145b.NONE;

    /* renamed from: i */
    private C0144a f420i = C0144a.RELAXED;

    /* renamed from: j */
    private int f421j = 0;

    /* renamed from: android.support.constraint.a.a.b$a */
    public enum C0144a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.b$b */
    public enum C0145b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.b$c */
    public enum C0146c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0142b(C0147c cVar, C0146c cVar2) {
        this.f412a = cVar;
        this.f413b = cVar2;
    }

    /* renamed from: a */
    public C0164g mo433a() {
        return this.f417f;
    }

    /* renamed from: a */
    public void mo435a(C0158c cVar) {
        C0164g gVar = this.f417f;
        if (gVar == null) {
            this.f417f = new C0164g(cVar, C0164g.C0166b.UNRESTRICTED);
        } else {
            gVar.mo563a();
        }
    }

    /* renamed from: b */
    public C0147c mo439b() {
        return this.f412a;
    }

    /* renamed from: c */
    public C0146c mo440c() {
        return this.f413b;
    }

    /* renamed from: d */
    public int mo441d() {
        C0142b bVar;
        if (this.f412a.mo467c() == 8) {
            return 0;
        }
        if (this.f416e <= -1 || (bVar = this.f414c) == null || bVar.f412a.mo467c() != 8) {
            return this.f415d;
        }
        return this.f416e;
    }

    /* renamed from: e */
    public C0145b mo442e() {
        return this.f419h;
    }

    /* renamed from: f */
    public C0142b mo443f() {
        return this.f414c;
    }

    /* renamed from: g */
    public C0144a mo444g() {
        return this.f420i;
    }

    /* renamed from: a */
    public void mo434a(C0144a aVar) {
        this.f420i = aVar;
    }

    /* renamed from: h */
    public int mo445h() {
        return this.f421j;
    }

    /* renamed from: i */
    public void mo446i() {
        this.f414c = null;
        this.f415d = 0;
        this.f416e = -1;
        this.f419h = C0145b.STRONG;
        this.f421j = 0;
        this.f420i = C0144a.RELAXED;
    }

    /* renamed from: a */
    public boolean mo438a(C0142b bVar, int i, C0145b bVar2, int i2) {
        return mo437a(bVar, i, -1, bVar2, i2, false);
    }

    /* renamed from: a */
    public boolean mo437a(C0142b bVar, int i, int i2, C0145b bVar2, int i3, boolean z) {
        if (bVar == null) {
            this.f414c = null;
            this.f415d = 0;
            this.f416e = -1;
            this.f419h = C0145b.NONE;
            this.f421j = 2;
            return true;
        } else if (!z && !mo436a(bVar)) {
            return false;
        } else {
            this.f414c = bVar;
            if (i > 0) {
                this.f415d = i;
            } else {
                this.f415d = 0;
            }
            this.f416e = i2;
            this.f419h = bVar2;
            this.f421j = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo436a(C0142b bVar) {
        if (bVar == null) {
            return false;
        }
        C0146c c = bVar.mo440c();
        C0146c cVar = this.f413b;
        if (c != cVar) {
            switch (this.f413b) {
                case CENTER:
                    if (c == C0146c.BASELINE || c == C0146c.CENTER_X || c == C0146c.CENTER_Y) {
                        return false;
                    }
                    return true;
                case LEFT:
                case RIGHT:
                    boolean z = c == C0146c.LEFT || c == C0146c.RIGHT;
                    if (bVar.mo439b() instanceof C0151e) {
                        return z || c == C0146c.CENTER_X;
                    }
                    return z;
                case TOP:
                case BOTTOM:
                    boolean z2 = c == C0146c.TOP || c == C0146c.BOTTOM;
                    if (bVar.mo439b() instanceof C0151e) {
                        return z2 || c == C0146c.CENTER_Y;
                    }
                    return z2;
                default:
                    return false;
            }
        } else if (cVar == C0146c.CENTER) {
            return false;
        } else {
            if (this.f413b != C0146c.BASELINE || (bVar.mo439b().mo494s() && mo439b().mo494s())) {
                return true;
            }
            return false;
        }
    }

    public String toString() {
        String str;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f412a.mo471d());
        sb.append(":");
        sb.append(this.f413b.toString());
        if (this.f414c != null) {
            str = " connected to " + this.f414c.m456a((HashSet<C0142b>) hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private String m456a(HashSet<C0142b> hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f412a.mo471d());
        sb.append(":");
        sb.append(this.f413b.toString());
        if (this.f414c != null) {
            str = " connected to " + this.f414c.m456a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
