package android.support.constraint.p013a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.g */
public class C0164g {

    /* renamed from: a */
    static int f557a = 1;

    /* renamed from: b */
    public int f558b = -1;

    /* renamed from: c */
    public int f559c = -1;

    /* renamed from: d */
    public int f560d = 0;

    /* renamed from: e */
    public float f561e;

    /* renamed from: f */
    C0166b f562f;

    /* renamed from: g */
    C0165a f563g = C0165a.WEAK;

    /* renamed from: h */
    C0157b[] f564h = new C0157b[8];

    /* renamed from: i */
    int f565i = 0;

    /* renamed from: j */
    private String f566j;

    /* renamed from: k */
    private final C0158c f567k;

    /* renamed from: android.support.constraint.a.g$a */
    public enum C0165a {
        STRONG,
        WEAK,
        UNKNOWN
    }

    /* renamed from: android.support.constraint.a.g$b */
    public enum C0166b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0164g(C0158c cVar, C0166b bVar) {
        this.f567k = cVar;
        this.f562f = bVar;
    }

    /* renamed from: a */
    public void mo564a(C0157b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f565i;
            if (i >= i2) {
                C0157b[] bVarArr = this.f564h;
                if (i2 >= bVarArr.length) {
                    this.f564h = (C0157b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0157b[] bVarArr2 = this.f564h;
                int i3 = this.f565i;
                bVarArr2[i3] = bVar;
                this.f565i = i3 + 1;
                return;
            } else if (this.f564h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo566b(C0157b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f565i;
            if (i < i2) {
                C0157b[] bVarArr = this.f564h;
                if (bVarArr[i] == bVar) {
                    System.arraycopy(bVarArr, i + 1, bVarArr, i, (i2 - i) - 1);
                    this.f565i--;
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo563a() {
        this.f566j = null;
        this.f562f = C0166b.UNKNOWN;
        this.f563g = C0165a.STRONG;
        this.f560d = 0;
        this.f558b = -1;
        this.f559c = -1;
        this.f561e = 0.0f;
        this.f565i = 0;
    }

    /* renamed from: a */
    public void mo565a(C0166b bVar) {
        this.f562f = bVar;
    }

    public String toString() {
        return "" + this.f566j;
    }
}
