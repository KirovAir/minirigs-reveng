package android.support.constraint.p013a;

import android.support.constraint.p013a.C0164g;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
public class C0139a {

    /* renamed from: a */
    int f388a = 0;

    /* renamed from: b */
    private final C0157b f389b;

    /* renamed from: c */
    private final C0158c f390c;

    /* renamed from: d */
    private int f391d = 8;

    /* renamed from: e */
    private C0164g f392e = null;

    /* renamed from: f */
    private float f393f = 0.001f;

    /* renamed from: g */
    private int[] f394g;

    /* renamed from: h */
    private int[] f395h;

    /* renamed from: i */
    private float[] f396i;

    /* renamed from: j */
    private int f397j;

    /* renamed from: k */
    private int f398k;

    /* renamed from: l */
    private boolean f399l;

    public C0139a(C0157b bVar, C0158c cVar) {
        int i = this.f391d;
        this.f394g = new int[i];
        this.f395h = new int[i];
        this.f396i = new float[i];
        this.f397j = -1;
        this.f398k = -1;
        this.f399l = false;
        this.f389b = bVar;
        this.f390c = cVar;
    }

    /* renamed from: a */
    public final void mo414a(C0164g gVar, float f) {
        if (f == 0.0f) {
            mo407a(gVar);
            return;
        }
        int i = this.f397j;
        if (i == -1) {
            this.f397j = 0;
            float[] fArr = this.f396i;
            int i2 = this.f397j;
            fArr[i2] = f;
            this.f394g[i2] = gVar.f558b;
            this.f395h[this.f397j] = -1;
            this.f388a++;
            if (!this.f399l) {
                this.f398k++;
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f388a) {
            if (this.f394g[i] == gVar.f558b) {
                this.f396i[i] = f;
                return;
            }
            if (this.f394g[i] < gVar.f558b) {
                i4 = i;
            }
            i = this.f395h[i];
            i3++;
        }
        int i5 = this.f398k;
        int i6 = i5 + 1;
        if (this.f399l) {
            int[] iArr = this.f394g;
            if (iArr[i5] != -1) {
                i5 = iArr.length;
            }
        } else {
            i5 = i6;
        }
        int[] iArr2 = this.f394g;
        if (i5 >= iArr2.length && this.f388a < iArr2.length) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.f394g;
                if (i7 >= iArr3.length) {
                    break;
                } else if (iArr3[i7] == -1) {
                    i5 = i7;
                    break;
                } else {
                    i7++;
                }
            }
        }
        int[] iArr4 = this.f394g;
        if (i5 >= iArr4.length) {
            i5 = iArr4.length;
            this.f391d *= 2;
            this.f399l = false;
            this.f398k = i5 - 1;
            this.f396i = Arrays.copyOf(this.f396i, this.f391d);
            this.f394g = Arrays.copyOf(this.f394g, this.f391d);
            this.f395h = Arrays.copyOf(this.f395h, this.f391d);
        }
        this.f394g[i5] = gVar.f558b;
        this.f396i[i5] = f;
        if (i4 != -1) {
            int[] iArr5 = this.f395h;
            iArr5[i5] = iArr5[i4];
            iArr5[i4] = i5;
        } else {
            this.f395h[i5] = this.f397j;
            this.f397j = i5;
        }
        this.f388a++;
        if (!this.f399l) {
            this.f398k++;
        }
        if (this.f388a >= this.f394g.length) {
            this.f399l = true;
        }
    }

    /* renamed from: b */
    public final void mo416b(C0164g gVar, float f) {
        if (f != 0.0f) {
            int i = this.f397j;
            if (i == -1) {
                this.f397j = 0;
                float[] fArr = this.f396i;
                int i2 = this.f397j;
                fArr[i2] = f;
                this.f394g[i2] = gVar.f558b;
                this.f395h[this.f397j] = -1;
                this.f388a++;
                if (!this.f399l) {
                    this.f398k++;
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f388a) {
                int i5 = this.f394g[i];
                if (i5 == gVar.f558b) {
                    float[] fArr2 = this.f396i;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f397j) {
                            this.f397j = this.f395h[i];
                        } else {
                            int[] iArr = this.f395h;
                            iArr[i4] = iArr[i];
                        }
                        this.f390c.f539e[i5].mo566b(this.f389b);
                        if (this.f399l) {
                            this.f398k = i;
                        }
                        this.f388a--;
                        return;
                    }
                    return;
                }
                if (this.f394g[i] < gVar.f558b) {
                    i4 = i;
                }
                i = this.f395h[i];
                i3++;
            }
            int i6 = this.f398k;
            int i7 = i6 + 1;
            if (this.f399l) {
                int[] iArr2 = this.f394g;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i7;
            }
            int[] iArr3 = this.f394g;
            if (i6 >= iArr3.length && this.f388a < iArr3.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr4 = this.f394g;
                    if (i8 >= iArr4.length) {
                        break;
                    } else if (iArr4[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr5 = this.f394g;
            if (i6 >= iArr5.length) {
                i6 = iArr5.length;
                this.f391d *= 2;
                this.f399l = false;
                this.f398k = i6 - 1;
                this.f396i = Arrays.copyOf(this.f396i, this.f391d);
                this.f394g = Arrays.copyOf(this.f394g, this.f391d);
                this.f395h = Arrays.copyOf(this.f395h, this.f391d);
            }
            this.f394g[i6] = gVar.f558b;
            this.f396i[i6] = f;
            if (i4 != -1) {
                int[] iArr6 = this.f395h;
                iArr6[i6] = iArr6[i4];
                iArr6[i4] = i6;
            } else {
                this.f395h[i6] = this.f397j;
                this.f397j = i6;
            }
            this.f388a++;
            if (!this.f399l) {
                this.f398k++;
            }
            int i9 = this.f398k;
            int[] iArr7 = this.f394g;
            if (i9 >= iArr7.length) {
                this.f399l = true;
                this.f398k = iArr7.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float mo407a(C0164g gVar) {
        if (this.f392e == gVar) {
            this.f392e = null;
        }
        int i = this.f397j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f388a) {
            int i4 = this.f394g[i];
            if (i4 == gVar.f558b) {
                if (i == this.f397j) {
                    this.f397j = this.f395h[i];
                } else {
                    int[] iArr = this.f395h;
                    iArr[i3] = iArr[i];
                }
                this.f390c.f539e[i4].mo566b(this.f389b);
                this.f388a--;
                this.f394g[i] = -1;
                if (this.f399l) {
                    this.f398k = i;
                }
                return this.f396i[i];
            }
            i2++;
            i3 = i;
            i = this.f395h[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo409a() {
        this.f397j = -1;
        this.f398k = -1;
        this.f399l = false;
        this.f388a = 0;
    }

    /* renamed from: b */
    public final boolean mo418b(C0164g gVar) {
        int i = this.f397j;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            if (this.f394g[i] == gVar.f558b) {
                return true;
            }
            i = this.f395h[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo417b() {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            if (this.f396i[i] > 0.0f) {
                return true;
            }
            i = this.f395h[i];
            i2++;
        }
        return false;
    }

    /* renamed from: c */
    public void mo420c() {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            float[] fArr = this.f396i;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f395h[i];
            i2++;
        }
    }

    /* renamed from: a */
    public void mo410a(float f) {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            float[] fArr = this.f396i;
            fArr[i] = fArr[i] / f;
            i = this.f395h[i];
            i2++;
        }
    }

    /* renamed from: a */
    public void mo411a(C0157b bVar) {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            this.f390c.f539e[this.f394g[i]].mo564a(bVar);
            i = this.f395h[i];
            i2++;
        }
    }

    /* renamed from: d */
    public C0164g mo421d() {
        int i = this.f397j;
        C0164g gVar = null;
        int i2 = 0;
        C0164g gVar2 = null;
        while (i != -1 && i2 < this.f388a) {
            float[] fArr = this.f396i;
            float f = fArr[i];
            if (f < 0.0f) {
                if (f > (-this.f393f)) {
                    fArr[i] = 0.0f;
                    f = 0.0f;
                }
            } else if (f < this.f393f) {
                fArr[i] = 0.0f;
                f = 0.0f;
            }
            if (f != 0.0f) {
                C0164g gVar3 = this.f390c.f539e[this.f394g[i]];
                if (gVar3.f562f == C0164g.C0166b.UNRESTRICTED) {
                    if (f < 0.0f) {
                        return gVar3;
                    }
                    if (gVar2 == null) {
                        gVar2 = gVar3;
                    }
                } else if (f < 0.0f && (gVar == null || gVar3.f560d < gVar.f560d)) {
                    gVar = gVar3;
                }
            }
            i = this.f395h[i];
            i2++;
        }
        return gVar2 != null ? gVar2 : gVar;
    }

    /* renamed from: a */
    public void mo412a(C0157b bVar, C0157b bVar2) {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            if (this.f394g[i] == bVar2.f528a.f558b) {
                float f = this.f396i[i];
                mo407a(bVar2.f528a);
                C0139a aVar = bVar2.f533f;
                int i3 = aVar.f397j;
                int i4 = 0;
                while (i3 != -1 && i4 < aVar.f388a) {
                    mo416b(this.f390c.f539e[aVar.f394g[i3]], aVar.f396i[i3] * f);
                    i3 = aVar.f395h[i3];
                    i4++;
                }
                bVar.f530c += bVar2.f530c * f;
                bVar2.f528a.mo566b(bVar);
                i = this.f397j;
                i2 = 0;
            } else {
                i = this.f395h[i];
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void mo413a(C0157b bVar, C0157b[] bVarArr) {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            C0164g gVar = this.f390c.f539e[this.f394g[i]];
            if (gVar.f559c != -1) {
                float f = this.f396i[i];
                mo407a(gVar);
                C0157b bVar2 = bVarArr[gVar.f559c];
                C0139a aVar = bVar2.f533f;
                int i3 = aVar.f397j;
                int i4 = 0;
                while (i3 != -1 && i4 < aVar.f388a) {
                    mo416b(this.f390c.f539e[aVar.f394g[i3]], aVar.f396i[i3] * f);
                    i3 = aVar.f395h[i3];
                    i4++;
                }
                bVar.f530c += bVar2.f530c * f;
                bVar2.f528a.mo566b(bVar);
                i = this.f397j;
                i2 = 0;
            } else {
                i = this.f395h[i];
                i2++;
            }
        }
    }

    /* renamed from: e */
    public C0164g mo422e() {
        C0164g gVar = this.f392e;
        if (gVar != null) {
            return gVar;
        }
        int i = this.f397j;
        int i2 = 0;
        C0164g gVar2 = null;
        while (i != -1 && i2 < this.f388a) {
            if (this.f396i[i] < 0.0f) {
                C0164g gVar3 = this.f390c.f539e[this.f394g[i]];
                if (gVar2 == null || gVar2.f560d > gVar3.f560d) {
                    gVar2 = gVar3;
                }
            }
            i = this.f395h[i];
            i2++;
        }
        return gVar2;
    }

    /* renamed from: a */
    public final C0164g mo408a(int i) {
        int i2 = this.f397j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f388a) {
            if (i3 == i) {
                return this.f390c.f539e[this.f394g[i2]];
            }
            i2 = this.f395h[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: b */
    public final float mo415b(int i) {
        int i2 = this.f397j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f388a) {
            if (i3 == i) {
                return this.f396i[i2];
            }
            i2 = this.f395h[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo419c(C0164g gVar) {
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            if (this.f394g[i] == gVar.f558b) {
                return this.f396i[i];
            }
            i = this.f395h[i];
            i2++;
        }
        return 0.0f;
    }

    public String toString() {
        String str = "";
        int i = this.f397j;
        int i2 = 0;
        while (i != -1 && i2 < this.f388a) {
            str = ((str + " -> ") + this.f396i[i] + " : ") + this.f390c.f539e[this.f394g[i]];
            i = this.f395h[i];
            i2++;
        }
        return str;
    }
}
