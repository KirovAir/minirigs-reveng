package android.support.p039v7.widget;

import android.support.p039v7.widget.C1000e;
import java.util.List;

/* renamed from: android.support.v7.widget.aw */
class C0899aw {

    /* renamed from: a */
    final C0900a f3244a;

    /* renamed from: android.support.v7.widget.aw$a */
    interface C0900a {
        /* renamed from: a */
        C1000e.C1002b mo4168a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo4169a(C1000e.C1002b bVar);
    }

    C0899aw(C0900a aVar) {
        this.f3244a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4165a(List<C1000e.C1002b> list) {
        while (true) {
            int b = m4434b(list);
            if (b != -1) {
                m4433a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m4433a(List<C1000e.C1002b> list, int i, int i2) {
        C1000e.C1002b bVar = list.get(i);
        C1000e.C1002b bVar2 = list.get(i2);
        int i3 = bVar2.f3676a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m4435c(list, i, bVar, i2, bVar2);
                    return;
                case 2:
                    mo4166a(list, i, bVar, i2, bVar2);
                    return;
                default:
                    return;
            }
        } else {
            mo4167b(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4166a(List<C1000e.C1002b> list, int i, C1000e.C1002b bVar, int i2, C1000e.C1002b bVar2) {
        boolean z;
        boolean z2 = false;
        if (bVar.f3677b < bVar.f3679d) {
            if (bVar2.f3677b == bVar.f3677b && bVar2.f3679d == bVar.f3679d - bVar.f3677b) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f3677b == bVar.f3679d + 1 && bVar2.f3679d == bVar.f3677b - bVar.f3679d) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        if (bVar.f3679d < bVar2.f3677b) {
            bVar2.f3677b--;
        } else if (bVar.f3679d < bVar2.f3677b + bVar2.f3679d) {
            bVar2.f3679d--;
            bVar.f3676a = 2;
            bVar.f3679d = 1;
            if (bVar2.f3679d == 0) {
                list.remove(i2);
                this.f3244a.mo4169a(bVar2);
                return;
            }
            return;
        }
        C1000e.C1002b bVar3 = null;
        if (bVar.f3677b <= bVar2.f3677b) {
            bVar2.f3677b++;
        } else if (bVar.f3677b < bVar2.f3677b + bVar2.f3679d) {
            bVar3 = this.f3244a.mo4168a(2, bVar.f3677b + 1, (bVar2.f3677b + bVar2.f3679d) - bVar.f3677b, (Object) null);
            bVar2.f3679d = bVar.f3677b - bVar2.f3677b;
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f3244a.mo4169a(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                if (bVar.f3677b > bVar3.f3677b) {
                    bVar.f3677b -= bVar3.f3679d;
                }
                if (bVar.f3679d > bVar3.f3677b) {
                    bVar.f3679d -= bVar3.f3679d;
                }
            }
            if (bVar.f3677b > bVar2.f3677b) {
                bVar.f3677b -= bVar2.f3679d;
            }
            if (bVar.f3679d > bVar2.f3677b) {
                bVar.f3679d -= bVar2.f3679d;
            }
        } else {
            if (bVar3 != null) {
                if (bVar.f3677b >= bVar3.f3677b) {
                    bVar.f3677b -= bVar3.f3679d;
                }
                if (bVar.f3679d >= bVar3.f3677b) {
                    bVar.f3679d -= bVar3.f3679d;
                }
            }
            if (bVar.f3677b >= bVar2.f3677b) {
                bVar.f3677b -= bVar2.f3679d;
            }
            if (bVar.f3679d >= bVar2.f3677b) {
                bVar.f3679d -= bVar2.f3679d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f3677b != bVar.f3679d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* renamed from: c */
    private void m4435c(List<C1000e.C1002b> list, int i, C1000e.C1002b bVar, int i2, C1000e.C1002b bVar2) {
        int i3 = bVar.f3679d < bVar2.f3677b ? -1 : 0;
        if (bVar.f3677b < bVar2.f3677b) {
            i3++;
        }
        if (bVar2.f3677b <= bVar.f3677b) {
            bVar.f3677b += bVar2.f3679d;
        }
        if (bVar2.f3677b <= bVar.f3679d) {
            bVar.f3679d += bVar2.f3679d;
        }
        bVar2.f3677b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4167b(java.util.List<android.support.p039v7.widget.C1000e.C1002b> r8, int r9, android.support.p039v7.widget.C1000e.C1002b r10, int r11, android.support.p039v7.widget.C1000e.C1002b r12) {
        /*
            r7 = this;
            int r0 = r10.f3679d
            int r1 = r12.f3677b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000f
            int r0 = r12.f3677b
            int r0 = r0 - r4
            r12.f3677b = r0
            goto L_0x0028
        L_0x000f:
            int r0 = r10.f3679d
            int r1 = r12.f3677b
            int r5 = r12.f3679d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0028
            int r0 = r12.f3679d
            int r0 = r0 - r4
            r12.f3679d = r0
            android.support.v7.widget.aw$a r0 = r7.f3244a
            int r1 = r10.f3677b
            java.lang.Object r5 = r12.f3678c
            android.support.v7.widget.e$b r0 = r0.mo4168a(r2, r1, r4, r5)
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            int r1 = r10.f3677b
            int r5 = r12.f3677b
            if (r1 > r5) goto L_0x0035
            int r1 = r12.f3677b
            int r1 = r1 + r4
            r12.f3677b = r1
            goto L_0x0056
        L_0x0035:
            int r1 = r10.f3677b
            int r5 = r12.f3677b
            int r6 = r12.f3679d
            int r5 = r5 + r6
            if (r1 >= r5) goto L_0x0056
            int r1 = r12.f3677b
            int r3 = r12.f3679d
            int r1 = r1 + r3
            int r3 = r10.f3677b
            int r1 = r1 - r3
            android.support.v7.widget.aw$a r3 = r7.f3244a
            int r5 = r10.f3677b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.f3678c
            android.support.v7.widget.e$b r3 = r3.mo4168a(r2, r5, r1, r4)
            int r2 = r12.f3679d
            int r2 = r2 - r1
            r12.f3679d = r2
        L_0x0056:
            r8.set(r11, r10)
            int r10 = r12.f3679d
            if (r10 <= 0) goto L_0x0061
            r8.set(r9, r12)
            goto L_0x0069
        L_0x0061:
            r8.remove(r9)
            android.support.v7.widget.aw$a r10 = r7.f3244a
            r10.mo4169a(r12)
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r8.add(r9, r0)
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r8.add(r9, r3)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C0899aw.mo4167b(java.util.List, int, android.support.v7.widget.e$b, int, android.support.v7.widget.e$b):void");
    }

    /* renamed from: b */
    private int m4434b(List<C1000e.C1002b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3676a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
