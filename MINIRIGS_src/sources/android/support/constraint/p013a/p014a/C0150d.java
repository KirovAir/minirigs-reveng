package android.support.constraint.p013a.p014a;

import android.support.constraint.p013a.C0160e;
import android.support.constraint.p013a.p014a.C0147c;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.d */
public class C0150d extends C0156h {

    /* renamed from: C */
    static boolean f494C = true;

    /* renamed from: A */
    protected C0160e f495A = new C0160e();

    /* renamed from: B */
    protected C0160e f496B = null;

    /* renamed from: D */
    int f497D;

    /* renamed from: E */
    int f498E;

    /* renamed from: F */
    int f499F;

    /* renamed from: G */
    int f500G;

    /* renamed from: I */
    private C0154g f501I;

    /* renamed from: J */
    private int f502J = 0;

    /* renamed from: K */
    private int f503K = 0;

    /* renamed from: L */
    private C0147c[] f504L = new C0147c[4];

    /* renamed from: M */
    private C0147c[] f505M = new C0147c[4];

    /* renamed from: N */
    private C0147c[] f506N = new C0147c[4];

    /* renamed from: B */
    public boolean mo504B() {
        return false;
    }

    /* renamed from: a */
    public void mo449a() {
        this.f495A.mo549b();
        this.f497D = 0;
        this.f499F = 0;
        this.f498E = 0;
        this.f500G = 0;
        super.mo449a();
    }

    /* renamed from: c */
    public void mo506c(C0160e eVar, int i) {
        mo458a(eVar, i);
        int size = this.f527H.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0147c cVar = (C0147c) this.f527H.get(i2);
            if (cVar instanceof C0150d) {
                C0147c.C0149a aVar = cVar.f480r;
                C0147c.C0149a aVar2 = cVar.f481s;
                if (aVar == C0147c.C0149a.WRAP_CONTENT) {
                    cVar.mo455a(C0147c.C0149a.FIXED);
                }
                if (aVar2 == C0147c.C0149a.WRAP_CONTENT) {
                    cVar.mo465b(C0147c.C0149a.FIXED);
                }
                cVar.mo458a(eVar, i);
                if (aVar == C0147c.C0149a.WRAP_CONTENT) {
                    cVar.mo455a(aVar);
                }
                if (aVar2 == C0147c.C0149a.WRAP_CONTENT) {
                    cVar.mo465b(aVar2);
                }
            } else {
                cVar.mo458a(eVar, i);
            }
        }
        if (this.f502J > 0) {
            m528a(eVar);
        }
        if (this.f503K > 0) {
            m531b(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r14 = r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m528a(android.support.constraint.p013a.C0160e r32) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = 0
            r12 = 0
        L_0x0006:
            int r1 = r0.f502J
            if (r12 >= r1) goto L_0x0370
            android.support.constraint.a.a.c[] r1 = r0.f506N
            r13 = r1[r12]
            r1 = r1[r12]
            int r1 = r0.m530b(r1, r11)
            int r2 = r13.f483u
            r3 = 2
            r14 = 1
            if (r2 != r3) goto L_0x001e
            if (r1 != 0) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            android.support.constraint.a.a.c$a r3 = r0.f480r
            android.support.constraint.a.a.c$a r4 = android.support.constraint.p013a.p014a.C0147c.C0149a.WRAP_CONTENT
            if (r3 != r4) goto L_0x0027
            r15 = 1
            goto L_0x0028
        L_0x0027:
            r15 = r2
        L_0x0028:
            boolean r2 = r13.f485w
            if (r2 == 0) goto L_0x0037
            if (r15 != 0) goto L_0x0037
            int r2 = r13.f483u
            if (r2 != 0) goto L_0x0037
            r0.m529a(r10, r1, r13)
            goto L_0x02fa
        L_0x0037:
            r16 = 0
            if (r1 != 0) goto L_0x0144
            r9 = r13
            r1 = r16
        L_0x003e:
            if (r1 == 0) goto L_0x0052
            android.support.constraint.a.a.b r2 = r9.f464a
            android.support.constraint.a.a.b r2 = r2.f414c
            if (r2 == 0) goto L_0x004f
            android.support.constraint.a.a.b r2 = r9.f464a
            android.support.constraint.a.a.b r2 = r2.f414c
            android.support.constraint.a.a.c r2 = r2.f412a
            if (r2 != r1) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r14 = r1
            goto L_0x0100
        L_0x0052:
            android.support.constraint.a.a.b r2 = r9.f464a
            int r4 = r2.mo441d()
            android.support.constraint.a.a.b r2 = r9.f466c
            int r8 = r2.mo441d()
            android.support.constraint.a.a.b r2 = r9.f464a
            android.support.constraint.a.g r2 = r2.f417f
            android.support.constraint.a.a.b r3 = r9.f464a
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x006f
            android.support.constraint.a.a.b r3 = r9.f464a
            android.support.constraint.a.a.b r3 = r3.f414c
            android.support.constraint.a.g r3 = r3.f417f
            goto L_0x0071
        L_0x006f:
            r3 = r16
        L_0x0071:
            android.support.constraint.a.a.b r5 = r9.f466c
            android.support.constraint.a.g r7 = r5.f417f
            android.support.constraint.a.a.b r5 = r9.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0083
            android.support.constraint.a.a.b r5 = r9.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = r5
            goto L_0x0085
        L_0x0083:
            r6 = r16
        L_0x0085:
            if (r1 == 0) goto L_0x008f
            android.support.constraint.a.a.b r1 = r1.f466c
            int r1 = r1.mo441d()
            int r1 = r1 + r4
            goto L_0x0090
        L_0x008f:
            r1 = r4
        L_0x0090:
            r5 = 3
            if (r3 == 0) goto L_0x00a4
            if (r9 != r13) goto L_0x0099
            int r11 = r9.f483u
            if (r11 == r14) goto L_0x009d
        L_0x0099:
            if (r15 == 0) goto L_0x00a1
            if (r9 == r13) goto L_0x00a1
        L_0x009d:
            r10.mo554c(r2, r3, r1, r5)
            goto L_0x00a4
        L_0x00a1:
            r10.mo547a(r2, r3, r1, r14)
        L_0x00a4:
            if (r6 == 0) goto L_0x00f0
            android.support.constraint.a.a.b r1 = r9.f466c
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.a.c r1 = r1.f412a
            android.support.constraint.a.a.b r1 = r1.f464a
            android.support.constraint.a.a.b r11 = r1.f414c
            if (r11 == 0) goto L_0x00b7
            android.support.constraint.a.a.b r11 = r1.f414c
            android.support.constraint.a.a.c r11 = r11.f412a
            goto L_0x00b9
        L_0x00b7:
            r11 = r16
        L_0x00b9:
            if (r11 != r9) goto L_0x00c3
            int r1 = r1.mo441d()
            int r1 = r1 + r8
            r11 = r1
            r1 = 0
            goto L_0x00c5
        L_0x00c3:
            r11 = r8
            r1 = 1
        L_0x00c5:
            if (r15 != 0) goto L_0x00ec
            if (r1 == 0) goto L_0x00d5
            int r1 = r13.f483u
            if (r1 != r14) goto L_0x00d5
            int r1 = -r11
            r10.mo554c(r7, r6, r1, r5)
            r17 = r6
            r14 = r9
            goto L_0x00f3
        L_0x00d5:
            int r1 = -r11
            r10.mo551b(r7, r6, r1, r14)
            if (r3 == 0) goto L_0x00e8
            r5 = 1056964608(0x3f000000, float:0.5)
            r11 = 2
            r1 = r32
            r17 = r6
            r14 = r9
            r9 = r11
            r1.mo546a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00f3
        L_0x00e8:
            r17 = r6
            r14 = r9
            goto L_0x00f3
        L_0x00ec:
            r17 = r6
            r14 = r9
            goto L_0x00f3
        L_0x00f0:
            r17 = r6
            r14 = r9
        L_0x00f3:
            if (r17 == 0) goto L_0x0100
            android.support.constraint.a.a.b r1 = r14.f466c
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.a.c r9 = r1.f412a
            r1 = r14
            r11 = 0
            r14 = 1
            goto L_0x003e
        L_0x0100:
            if (r15 == 0) goto L_0x02fa
            android.support.constraint.a.a.b r1 = r13.f464a
            int r4 = r1.mo441d()
            android.support.constraint.a.a.b r1 = r14.f466c
            int r8 = r1.mo441d()
            android.support.constraint.a.a.b r1 = r13.f464a
            android.support.constraint.a.g r2 = r1.f417f
            android.support.constraint.a.a.b r1 = r13.f464a
            android.support.constraint.a.a.b r1 = r1.f414c
            if (r1 == 0) goto L_0x0120
            android.support.constraint.a.a.b r1 = r13.f464a
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            r3 = r1
            goto L_0x0122
        L_0x0120:
            r3 = r16
        L_0x0122:
            android.support.constraint.a.a.b r1 = r14.f466c
            android.support.constraint.a.g r7 = r1.f417f
            android.support.constraint.a.a.b r1 = r14.f466c
            android.support.constraint.a.a.b r1 = r1.f414c
            if (r1 == 0) goto L_0x0134
            android.support.constraint.a.a.b r1 = r14.f466c
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            r6 = r1
            goto L_0x0136
        L_0x0134:
            r6 = r16
        L_0x0136:
            if (r3 == 0) goto L_0x02fa
            if (r6 == 0) goto L_0x02fa
            float r5 = r13.f478p
            r9 = 2
            r1 = r32
            r1.mo546a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02fa
        L_0x0144:
            r2 = 0
            r2 = r16
            r3 = 0
        L_0x0148:
            if (r2 == 0) goto L_0x02ff
            android.support.constraint.a.a.b r4 = r13.f464a
            android.support.constraint.a.a.b r4 = r4.f414c
            if (r4 == 0) goto L_0x015a
            android.support.constraint.a.a.b r4 = r13.f464a
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            if (r4 != r2) goto L_0x015a
            goto L_0x02ff
        L_0x015a:
            r2 = 1
            if (r1 != r2) goto L_0x01ab
            android.support.constraint.a.a.c[] r1 = r0.f504L
            r4 = 0
            r1 = r1[r4]
            android.support.constraint.a.a.b r2 = r1.f464a
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r3 = r1.f464a
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x0177
            android.support.constraint.a.a.b r3 = r1.f464a
            android.support.constraint.a.a.b r3 = r3.f414c
            int r3 = r3.mo441d()
            int r2 = r2 + r3
        L_0x0177:
            android.support.constraint.a.a.b r3 = r1.f464a
            android.support.constraint.a.g r3 = r3.f417f
            android.support.constraint.a.a.b r5 = r1.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = 1
            r10.mo554c(r3, r5, r2, r6)
            android.support.constraint.a.a.b r2 = r1.f466c
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r3 = r1.f466c
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x019a
            android.support.constraint.a.a.b r3 = r1.f466c
            android.support.constraint.a.a.b r3 = r3.f414c
            int r3 = r3.mo441d()
            int r2 = r2 + r3
        L_0x019a:
            android.support.constraint.a.a.b r3 = r1.f466c
            android.support.constraint.a.g r3 = r3.f417f
            android.support.constraint.a.a.b r1 = r1.f466c
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            int r2 = -r2
            r5 = 1
            r10.mo554c(r3, r1, r2, r5)
            goto L_0x02fa
        L_0x01ab:
            r4 = 0
            r2 = 0
        L_0x01ad:
            int r5 = r1 + -1
            if (r2 >= r5) goto L_0x02fa
            android.support.constraint.a.a.c[] r6 = r0.f504L
            r7 = r6[r2]
            int r2 = r2 + 1
            r6 = r6[r2]
            android.support.constraint.a.a.b r8 = r7.f464a
            android.support.constraint.a.g r8 = r8.f417f
            android.support.constraint.a.a.b r9 = r7.f466c
            android.support.constraint.a.g r9 = r9.f417f
            android.support.constraint.a.a.b r11 = r6.f464a
            android.support.constraint.a.g r11 = r11.f417f
            android.support.constraint.a.a.b r13 = r6.f466c
            android.support.constraint.a.g r13 = r13.f417f
            android.support.constraint.a.a.b r14 = r7.f464a
            int r14 = r14.mo441d()
            android.support.constraint.a.a.b r15 = r7.f464a
            android.support.constraint.a.a.b r15 = r15.f414c
            if (r15 == 0) goto L_0x01fc
            android.support.constraint.a.a.b r15 = r7.f464a
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f466c
            android.support.constraint.a.a.b r15 = r15.f414c
            if (r15 == 0) goto L_0x01fc
            android.support.constraint.a.a.b r15 = r7.f464a
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f466c
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            if (r15 != r7) goto L_0x01fc
            android.support.constraint.a.a.b r15 = r7.f464a
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f466c
            int r15 = r15.mo441d()
            int r14 = r14 + r15
        L_0x01fc:
            android.support.constraint.a.a.b r15 = r7.f464a
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.g r15 = r15.f417f
            r4 = 1
            r10.mo547a(r8, r15, r14, r4)
            android.support.constraint.a.a.b r4 = r7.f466c
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r14 = r7.f466c
            android.support.constraint.a.a.b r14 = r14.f414c
            if (r14 == 0) goto L_0x0239
            android.support.constraint.a.a.b r14 = r7.f466c
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f464a
            android.support.constraint.a.a.b r14 = r14.f414c
            if (r14 == 0) goto L_0x0239
            android.support.constraint.a.a.b r14 = r7.f466c
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f464a
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            if (r14 != r7) goto L_0x0239
            android.support.constraint.a.a.b r14 = r7.f466c
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f464a
            int r14 = r14.mo441d()
            int r4 = r4 + r14
        L_0x0239:
            android.support.constraint.a.a.b r14 = r7.f466c
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.g r14 = r14.f417f
            int r4 = -r4
            r15 = 1
            r10.mo551b(r9, r14, r4, r15)
            if (r2 != r5) goto L_0x02c1
            android.support.constraint.a.a.b r4 = r6.f464a
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r5 = r6.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0279
            android.support.constraint.a.a.b r5 = r6.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0279
            android.support.constraint.a.a.b r5 = r6.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            if (r5 != r6) goto L_0x0279
            android.support.constraint.a.a.b r5 = r6.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f466c
            int r5 = r5.mo441d()
            int r4 = r4 + r5
        L_0x0279:
            android.support.constraint.a.a.b r5 = r6.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r14 = 1
            r10.mo547a(r11, r5, r4, r14)
            android.support.constraint.a.a.b r4 = r6.f466c
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r5 = r6.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x02b6
            android.support.constraint.a.a.b r5 = r6.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x02b6
            android.support.constraint.a.a.b r5 = r6.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            if (r5 != r6) goto L_0x02b6
            android.support.constraint.a.a.b r5 = r6.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f464a
            int r5 = r5.mo441d()
            int r4 = r4 + r5
        L_0x02b6:
            android.support.constraint.a.a.b r5 = r6.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            int r4 = -r4
            r14 = 1
            r10.mo551b(r13, r5, r4, r14)
        L_0x02c1:
            android.support.constraint.a.b r4 = r32.mo552c()
            float r5 = r7.f487y
            float r14 = r6.f487y
            android.support.constraint.a.a.b r15 = r7.f464a
            int r23 = r15.mo441d()
            android.support.constraint.a.a.b r7 = r7.f466c
            int r25 = r7.mo441d()
            android.support.constraint.a.a.b r7 = r6.f464a
            int r27 = r7.mo441d()
            android.support.constraint.a.a.b r6 = r6.f466c
            int r29 = r6.mo441d()
            r18 = r4
            r19 = r5
            r20 = r3
            r21 = r14
            r22 = r8
            r24 = r9
            r26 = r11
            r28 = r13
            r18.mo519a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.mo553c(r4)
            r4 = 0
            goto L_0x01ad
        L_0x02fa:
            int r12 = r12 + 1
            r11 = 0
            goto L_0x0006
        L_0x02ff:
            android.support.constraint.a.a.c$a r4 = r13.f480r
            android.support.constraint.a.a.c$a r5 = android.support.constraint.p013a.p014a.C0147c.C0149a.MATCH_CONSTRAINT
            if (r4 == r5) goto L_0x035f
            android.support.constraint.a.a.b r4 = r13.f464a
            int r4 = r4.mo441d()
            if (r2 == 0) goto L_0x0314
            android.support.constraint.a.a.b r2 = r2.f466c
            int r2 = r2.mo441d()
            int r4 = r4 + r2
        L_0x0314:
            android.support.constraint.a.a.b r2 = r13.f464a
            android.support.constraint.a.g r2 = r2.f417f
            android.support.constraint.a.a.b r5 = r13.f464a
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = 1
            r10.mo547a(r2, r5, r4, r6)
            android.support.constraint.a.a.b r2 = r13.f466c
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r4 = r13.f466c
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f464a
            android.support.constraint.a.a.b r4 = r4.f414c
            if (r4 == 0) goto L_0x034f
            android.support.constraint.a.a.b r4 = r13.f466c
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f464a
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            if (r4 != r13) goto L_0x034f
            android.support.constraint.a.a.b r4 = r13.f466c
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f464a
            int r4 = r4.mo441d()
            int r2 = r2 + r4
        L_0x034f:
            android.support.constraint.a.a.b r4 = r13.f466c
            android.support.constraint.a.g r4 = r4.f417f
            android.support.constraint.a.a.b r5 = r13.f466c
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            int r2 = -r2
            r6 = 1
            r10.mo551b(r4, r5, r2, r6)
            goto L_0x0363
        L_0x035f:
            r6 = 1
            float r2 = r13.f487y
            float r3 = r3 + r2
        L_0x0363:
            android.support.constraint.a.a.b r2 = r13.f466c
            android.support.constraint.a.a.b r2 = r2.f414c
            android.support.constraint.a.a.c r2 = r2.f412a
            r30 = r13
            r13 = r2
            r2 = r30
            goto L_0x0148
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p013a.p014a.C0150d.m528a(android.support.constraint.a.e):void");
    }

    /* renamed from: a */
    private void m529a(C0160e eVar, int i, C0147c cVar) {
        int i2;
        float f;
        float f2;
        C0147c cVar2 = cVar;
        C0147c cVar3 = null;
        int i3 = 0;
        float f3 = 0.0f;
        int i4 = 0;
        while (cVar2 != null) {
            i3++;
            if (cVar2.f480r != C0147c.C0149a.MATCH_CONSTRAINT) {
                i4 = i4 + cVar2.mo486k() + (cVar2.f464a.f414c != null ? cVar2.f464a.mo441d() : 0) + (cVar2.f466c.f414c != null ? cVar2.f466c.mo441d() : 0);
            } else {
                f3 += cVar2.f487y;
            }
            C0147c cVar4 = cVar2.f466c.f414c != null ? cVar2.f466c.f414c.f412a : null;
            if (cVar4 == null || (cVar4.f464a.f414c != null && (cVar4.f464a.f414c == null || cVar4.f464a.f414c.f412a == cVar2))) {
                C0147c cVar5 = cVar4;
                cVar3 = cVar2;
                cVar2 = cVar5;
            } else {
                cVar3 = cVar2;
                cVar2 = null;
            }
        }
        if (cVar3 != null) {
            i2 = cVar3.f466c.f414c != null ? cVar3.f466c.f414c.f412a.mo482i() : 0;
            if (cVar3.f466c.f414c != null && cVar3.f466c.f414c.f412a == this) {
                i2 = mo492q();
            }
        } else {
            i2 = 0;
        }
        float f4 = ((float) (i2 - 0)) - ((float) i4);
        float f5 = f4 / ((float) (i3 + 1));
        if (i == 0) {
            f = f5;
        } else {
            f = f4 / ((float) i);
            f5 = 0.0f;
        }
        while (cVar != null) {
            int d = cVar.f464a.f414c != null ? cVar.f464a.mo441d() : 0;
            int d2 = cVar.f466c.f414c != null ? cVar.f466c.mo441d() : 0;
            float f6 = (float) d;
            float f7 = f5 + f6;
            eVar.mo545a(cVar.f464a.f417f, (int) f7);
            if (cVar.f480r != C0147c.C0149a.MATCH_CONSTRAINT) {
                f2 = f7 + ((float) cVar.mo486k());
            } else if (f3 == 0.0f) {
                f2 = f7 + ((f - f6) - ((float) d2));
            } else {
                f2 = f7 + ((((cVar.f487y * f4) / f3) - f6) - ((float) d2));
            }
            eVar.mo545a(cVar.f466c.f417f, (int) f2);
            if (i == 0) {
                f2 += f;
            }
            f5 = f2 + ((float) d2);
            C0147c cVar6 = cVar.f466c.f414c != null ? cVar.f466c.f414c.f412a : null;
            if (!(cVar6 == null || cVar6.f464a.f414c == null || cVar6.f464a.f414c.f412a == cVar)) {
                cVar6 = null;
            }
            cVar = cVar6 == this ? null : cVar6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r14 = r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m531b(android.support.constraint.p013a.C0160e r32) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r12 = 0
        L_0x0005:
            int r1 = r0.f503K
            if (r12 >= r1) goto L_0x036d
            android.support.constraint.a.a.c[] r1 = r0.f505M
            r13 = r1[r12]
            r1 = r1[r12]
            r14 = 1
            int r1 = r0.m530b(r1, r14)
            int r2 = r13.f484v
            r3 = 2
            if (r2 != r3) goto L_0x001d
            if (r1 != 0) goto L_0x001d
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            android.support.constraint.a.a.c$a r3 = r0.f481s
            android.support.constraint.a.a.c$a r4 = android.support.constraint.p013a.p014a.C0147c.C0149a.WRAP_CONTENT
            if (r3 != r4) goto L_0x0026
            r15 = 1
            goto L_0x0027
        L_0x0026:
            r15 = r2
        L_0x0027:
            boolean r2 = r13.f486x
            if (r2 == 0) goto L_0x0036
            if (r15 != 0) goto L_0x0036
            int r2 = r13.f484v
            if (r2 != 0) goto L_0x0036
            r0.m532b(r10, r1, r13)
            goto L_0x02f8
        L_0x0036:
            r16 = 0
            if (r1 != 0) goto L_0x0142
            r9 = r13
            r1 = r16
        L_0x003d:
            if (r1 == 0) goto L_0x0051
            android.support.constraint.a.a.b r2 = r9.f465b
            android.support.constraint.a.a.b r2 = r2.f414c
            if (r2 == 0) goto L_0x004e
            android.support.constraint.a.a.b r2 = r9.f465b
            android.support.constraint.a.a.b r2 = r2.f414c
            android.support.constraint.a.a.c r2 = r2.f412a
            if (r2 != r1) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            r14 = r1
            goto L_0x00fe
        L_0x0051:
            android.support.constraint.a.a.b r2 = r9.f465b
            int r4 = r2.mo441d()
            android.support.constraint.a.a.b r2 = r9.f467d
            int r8 = r2.mo441d()
            android.support.constraint.a.a.b r2 = r9.f465b
            android.support.constraint.a.g r2 = r2.f417f
            android.support.constraint.a.a.b r3 = r9.f465b
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x006e
            android.support.constraint.a.a.b r3 = r9.f465b
            android.support.constraint.a.a.b r3 = r3.f414c
            android.support.constraint.a.g r3 = r3.f417f
            goto L_0x0070
        L_0x006e:
            r3 = r16
        L_0x0070:
            android.support.constraint.a.a.b r5 = r9.f467d
            android.support.constraint.a.g r7 = r5.f417f
            android.support.constraint.a.a.b r5 = r9.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0082
            android.support.constraint.a.a.b r5 = r9.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = r5
            goto L_0x0084
        L_0x0082:
            r6 = r16
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            android.support.constraint.a.a.b r1 = r1.f467d
            int r1 = r1.mo441d()
            int r1 = r1 + r4
            goto L_0x008f
        L_0x008e:
            r1 = r4
        L_0x008f:
            r5 = 3
            if (r3 == 0) goto L_0x00a3
            if (r9 != r13) goto L_0x0098
            int r11 = r9.f484v
            if (r11 == r14) goto L_0x009c
        L_0x0098:
            if (r15 == 0) goto L_0x00a0
            if (r9 == r13) goto L_0x00a0
        L_0x009c:
            r10.mo554c(r2, r3, r1, r5)
            goto L_0x00a3
        L_0x00a0:
            r10.mo547a(r2, r3, r1, r14)
        L_0x00a3:
            if (r6 == 0) goto L_0x00ef
            android.support.constraint.a.a.b r1 = r9.f467d
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.a.c r1 = r1.f412a
            android.support.constraint.a.a.b r1 = r1.f465b
            android.support.constraint.a.a.b r11 = r1.f414c
            if (r11 == 0) goto L_0x00b6
            android.support.constraint.a.a.b r11 = r1.f414c
            android.support.constraint.a.a.c r11 = r11.f412a
            goto L_0x00b8
        L_0x00b6:
            r11 = r16
        L_0x00b8:
            if (r11 != r9) goto L_0x00c2
            int r1 = r1.mo441d()
            int r1 = r1 + r8
            r11 = r1
            r1 = 0
            goto L_0x00c4
        L_0x00c2:
            r11 = r8
            r1 = 1
        L_0x00c4:
            if (r15 != 0) goto L_0x00eb
            if (r1 == 0) goto L_0x00d4
            int r1 = r13.f484v
            if (r1 != r14) goto L_0x00d4
            int r1 = -r11
            r10.mo554c(r7, r6, r1, r5)
            r17 = r6
            r14 = r9
            goto L_0x00f2
        L_0x00d4:
            int r1 = -r11
            r10.mo551b(r7, r6, r1, r14)
            if (r3 == 0) goto L_0x00e7
            r5 = 1056964608(0x3f000000, float:0.5)
            r11 = 2
            r1 = r32
            r17 = r6
            r14 = r9
            r9 = r11
            r1.mo546a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00f2
        L_0x00e7:
            r17 = r6
            r14 = r9
            goto L_0x00f2
        L_0x00eb:
            r17 = r6
            r14 = r9
            goto L_0x00f2
        L_0x00ef:
            r17 = r6
            r14 = r9
        L_0x00f2:
            if (r17 == 0) goto L_0x00fe
            android.support.constraint.a.a.b r1 = r14.f467d
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.a.c r9 = r1.f412a
            r1 = r14
            r14 = 1
            goto L_0x003d
        L_0x00fe:
            if (r15 == 0) goto L_0x02f8
            android.support.constraint.a.a.b r1 = r13.f465b
            int r4 = r1.mo441d()
            android.support.constraint.a.a.b r1 = r14.f467d
            int r8 = r1.mo441d()
            android.support.constraint.a.a.b r1 = r13.f465b
            android.support.constraint.a.g r2 = r1.f417f
            android.support.constraint.a.a.b r1 = r13.f465b
            android.support.constraint.a.a.b r1 = r1.f414c
            if (r1 == 0) goto L_0x011e
            android.support.constraint.a.a.b r1 = r13.f465b
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            r3 = r1
            goto L_0x0120
        L_0x011e:
            r3 = r16
        L_0x0120:
            android.support.constraint.a.a.b r1 = r14.f467d
            android.support.constraint.a.g r7 = r1.f417f
            android.support.constraint.a.a.b r1 = r14.f467d
            android.support.constraint.a.a.b r1 = r1.f414c
            if (r1 == 0) goto L_0x0132
            android.support.constraint.a.a.b r1 = r14.f467d
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            r6 = r1
            goto L_0x0134
        L_0x0132:
            r6 = r16
        L_0x0134:
            if (r3 == 0) goto L_0x02f8
            if (r6 == 0) goto L_0x02f8
            float r5 = r13.f479q
            r9 = 2
            r1 = r32
            r1.mo546a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02f8
        L_0x0142:
            r2 = 0
            r2 = r16
            r3 = 0
        L_0x0146:
            if (r2 == 0) goto L_0x02fc
            android.support.constraint.a.a.b r4 = r13.f465b
            android.support.constraint.a.a.b r4 = r4.f414c
            if (r4 == 0) goto L_0x0158
            android.support.constraint.a.a.b r4 = r13.f465b
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            if (r4 != r2) goto L_0x0158
            goto L_0x02fc
        L_0x0158:
            r2 = 1
            if (r1 != r2) goto L_0x01a9
            android.support.constraint.a.a.c[] r1 = r0.f504L
            r4 = 0
            r1 = r1[r4]
            android.support.constraint.a.a.b r2 = r1.f465b
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r3 = r1.f465b
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x0175
            android.support.constraint.a.a.b r3 = r1.f465b
            android.support.constraint.a.a.b r3 = r3.f414c
            int r3 = r3.mo441d()
            int r2 = r2 + r3
        L_0x0175:
            android.support.constraint.a.a.b r3 = r1.f465b
            android.support.constraint.a.g r3 = r3.f417f
            android.support.constraint.a.a.b r5 = r1.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = 1
            r10.mo554c(r3, r5, r2, r6)
            android.support.constraint.a.a.b r2 = r1.f467d
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r3 = r1.f467d
            android.support.constraint.a.a.b r3 = r3.f414c
            if (r3 == 0) goto L_0x0198
            android.support.constraint.a.a.b r3 = r1.f467d
            android.support.constraint.a.a.b r3 = r3.f414c
            int r3 = r3.mo441d()
            int r2 = r2 + r3
        L_0x0198:
            android.support.constraint.a.a.b r3 = r1.f467d
            android.support.constraint.a.g r3 = r3.f417f
            android.support.constraint.a.a.b r1 = r1.f467d
            android.support.constraint.a.a.b r1 = r1.f414c
            android.support.constraint.a.g r1 = r1.f417f
            int r2 = -r2
            r5 = 1
            r10.mo554c(r3, r1, r2, r5)
            goto L_0x02f8
        L_0x01a9:
            r4 = 0
            r2 = 0
        L_0x01ab:
            int r5 = r1 + -1
            if (r2 >= r5) goto L_0x02f8
            android.support.constraint.a.a.c[] r6 = r0.f504L
            r7 = r6[r2]
            int r2 = r2 + 1
            r6 = r6[r2]
            android.support.constraint.a.a.b r8 = r7.f465b
            android.support.constraint.a.g r8 = r8.f417f
            android.support.constraint.a.a.b r9 = r7.f467d
            android.support.constraint.a.g r9 = r9.f417f
            android.support.constraint.a.a.b r11 = r6.f465b
            android.support.constraint.a.g r11 = r11.f417f
            android.support.constraint.a.a.b r13 = r6.f467d
            android.support.constraint.a.g r13 = r13.f417f
            android.support.constraint.a.a.b r14 = r7.f465b
            int r14 = r14.mo441d()
            android.support.constraint.a.a.b r15 = r7.f465b
            android.support.constraint.a.a.b r15 = r15.f414c
            if (r15 == 0) goto L_0x01fa
            android.support.constraint.a.a.b r15 = r7.f465b
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f467d
            android.support.constraint.a.a.b r15 = r15.f414c
            if (r15 == 0) goto L_0x01fa
            android.support.constraint.a.a.b r15 = r7.f465b
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f467d
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            if (r15 != r7) goto L_0x01fa
            android.support.constraint.a.a.b r15 = r7.f465b
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.a.c r15 = r15.f412a
            android.support.constraint.a.a.b r15 = r15.f467d
            int r15 = r15.mo441d()
            int r14 = r14 + r15
        L_0x01fa:
            android.support.constraint.a.a.b r15 = r7.f465b
            android.support.constraint.a.a.b r15 = r15.f414c
            android.support.constraint.a.g r15 = r15.f417f
            r4 = 1
            r10.mo547a(r8, r15, r14, r4)
            android.support.constraint.a.a.b r4 = r7.f467d
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r14 = r7.f467d
            android.support.constraint.a.a.b r14 = r14.f414c
            if (r14 == 0) goto L_0x0237
            android.support.constraint.a.a.b r14 = r7.f467d
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f465b
            android.support.constraint.a.a.b r14 = r14.f414c
            if (r14 == 0) goto L_0x0237
            android.support.constraint.a.a.b r14 = r7.f467d
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f465b
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            if (r14 != r7) goto L_0x0237
            android.support.constraint.a.a.b r14 = r7.f467d
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.a.c r14 = r14.f412a
            android.support.constraint.a.a.b r14 = r14.f465b
            int r14 = r14.mo441d()
            int r4 = r4 + r14
        L_0x0237:
            android.support.constraint.a.a.b r14 = r7.f467d
            android.support.constraint.a.a.b r14 = r14.f414c
            android.support.constraint.a.g r14 = r14.f417f
            int r4 = -r4
            r15 = 1
            r10.mo551b(r9, r14, r4, r15)
            if (r2 != r5) goto L_0x02bf
            android.support.constraint.a.a.b r4 = r6.f465b
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r5 = r6.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0277
            android.support.constraint.a.a.b r5 = r6.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x0277
            android.support.constraint.a.a.b r5 = r6.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            if (r5 != r6) goto L_0x0277
            android.support.constraint.a.a.b r5 = r6.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f467d
            int r5 = r5.mo441d()
            int r4 = r4 + r5
        L_0x0277:
            android.support.constraint.a.a.b r5 = r6.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r14 = 1
            r10.mo547a(r11, r5, r4, r14)
            android.support.constraint.a.a.b r4 = r6.f467d
            int r4 = r4.mo441d()
            android.support.constraint.a.a.b r5 = r6.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x02b4
            android.support.constraint.a.a.b r5 = r6.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            if (r5 == 0) goto L_0x02b4
            android.support.constraint.a.a.b r5 = r6.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            if (r5 != r6) goto L_0x02b4
            android.support.constraint.a.a.b r5 = r6.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.a.c r5 = r5.f412a
            android.support.constraint.a.a.b r5 = r5.f465b
            int r5 = r5.mo441d()
            int r4 = r4 + r5
        L_0x02b4:
            android.support.constraint.a.a.b r5 = r6.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            int r4 = -r4
            r14 = 1
            r10.mo551b(r13, r5, r4, r14)
        L_0x02bf:
            android.support.constraint.a.b r4 = r32.mo552c()
            float r5 = r7.f488z
            float r14 = r6.f488z
            android.support.constraint.a.a.b r15 = r7.f465b
            int r23 = r15.mo441d()
            android.support.constraint.a.a.b r7 = r7.f467d
            int r25 = r7.mo441d()
            android.support.constraint.a.a.b r7 = r6.f465b
            int r27 = r7.mo441d()
            android.support.constraint.a.a.b r6 = r6.f467d
            int r29 = r6.mo441d()
            r18 = r4
            r19 = r5
            r20 = r3
            r21 = r14
            r22 = r8
            r24 = r9
            r26 = r11
            r28 = r13
            r18.mo519a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.mo553c(r4)
            r4 = 0
            goto L_0x01ab
        L_0x02f8:
            int r12 = r12 + 1
            goto L_0x0005
        L_0x02fc:
            android.support.constraint.a.a.c$a r4 = r13.f481s
            android.support.constraint.a.a.c$a r5 = android.support.constraint.p013a.p014a.C0147c.C0149a.MATCH_CONSTRAINT
            if (r4 == r5) goto L_0x035c
            android.support.constraint.a.a.b r4 = r13.f465b
            int r4 = r4.mo441d()
            if (r2 == 0) goto L_0x0311
            android.support.constraint.a.a.b r2 = r2.f467d
            int r2 = r2.mo441d()
            int r4 = r4 + r2
        L_0x0311:
            android.support.constraint.a.a.b r2 = r13.f465b
            android.support.constraint.a.g r2 = r2.f417f
            android.support.constraint.a.a.b r5 = r13.f465b
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            r6 = 1
            r10.mo547a(r2, r5, r4, r6)
            android.support.constraint.a.a.b r2 = r13.f467d
            int r2 = r2.mo441d()
            android.support.constraint.a.a.b r4 = r13.f467d
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f465b
            android.support.constraint.a.a.b r4 = r4.f414c
            if (r4 == 0) goto L_0x034c
            android.support.constraint.a.a.b r4 = r13.f467d
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f465b
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            if (r4 != r13) goto L_0x034c
            android.support.constraint.a.a.b r4 = r13.f467d
            android.support.constraint.a.a.b r4 = r4.f414c
            android.support.constraint.a.a.c r4 = r4.f412a
            android.support.constraint.a.a.b r4 = r4.f465b
            int r4 = r4.mo441d()
            int r2 = r2 + r4
        L_0x034c:
            android.support.constraint.a.a.b r4 = r13.f467d
            android.support.constraint.a.g r4 = r4.f417f
            android.support.constraint.a.a.b r5 = r13.f467d
            android.support.constraint.a.a.b r5 = r5.f414c
            android.support.constraint.a.g r5 = r5.f417f
            int r2 = -r2
            r6 = 1
            r10.mo551b(r4, r5, r2, r6)
            goto L_0x0360
        L_0x035c:
            r6 = 1
            float r2 = r13.f488z
            float r3 = r3 + r2
        L_0x0360:
            android.support.constraint.a.a.b r2 = r13.f467d
            android.support.constraint.a.a.b r2 = r2.f414c
            android.support.constraint.a.a.c r2 = r2.f412a
            r30 = r13
            r13 = r2
            r2 = r30
            goto L_0x0146
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p013a.p014a.C0150d.m531b(android.support.constraint.a.e):void");
    }

    /* renamed from: b */
    private void m532b(C0160e eVar, int i, C0147c cVar) {
        int i2;
        float f;
        float f2;
        C0147c cVar2 = cVar;
        C0147c cVar3 = null;
        int i3 = 0;
        float f3 = 0.0f;
        int i4 = 0;
        while (cVar2 != null) {
            i3++;
            if (cVar2.f481s != C0147c.C0149a.MATCH_CONSTRAINT) {
                i4 = i4 + cVar2.mo487l() + (cVar2.f465b.f414c != null ? cVar2.f465b.mo441d() : 0) + (cVar2.f467d.f414c != null ? cVar2.f467d.mo441d() : 0);
            } else {
                f3 += cVar2.f488z;
            }
            C0147c cVar4 = cVar2.f467d.f414c != null ? cVar2.f467d.f414c.f412a : null;
            if (cVar4 == null || (cVar4.f465b.f414c != null && (cVar4.f465b.f414c == null || cVar4.f465b.f414c.f412a == cVar2))) {
                C0147c cVar5 = cVar4;
                cVar3 = cVar2;
                cVar2 = cVar5;
            } else {
                cVar3 = cVar2;
                cVar2 = null;
            }
        }
        if (cVar3 != null) {
            i2 = cVar3.f467d.f414c != null ? cVar3.f467d.f414c.f412a.mo482i() : 0;
            if (cVar3.f467d.f414c != null && cVar3.f467d.f414c.f412a == this) {
                i2 = mo493r();
            }
        } else {
            i2 = 0;
        }
        float f4 = ((float) (i2 - 0)) - ((float) i4);
        float f5 = f4 / ((float) (i3 + 1));
        if (i == 0) {
            f = f5;
        } else {
            f = f4 / ((float) i);
            f5 = 0.0f;
        }
        while (cVar != null) {
            int d = cVar.f465b.f414c != null ? cVar.f465b.mo441d() : 0;
            int d2 = cVar.f467d.f414c != null ? cVar.f467d.mo441d() : 0;
            float f6 = (float) d;
            float f7 = f5 + f6;
            eVar.mo545a(cVar.f465b.f417f, (int) f7);
            if (cVar.f481s != C0147c.C0149a.MATCH_CONSTRAINT) {
                f2 = f7 + ((float) cVar.mo487l());
            } else if (f3 == 0.0f) {
                f2 = f7 + ((f - f6) - ((float) d2));
            } else {
                f2 = f7 + ((((cVar.f488z * f4) / f3) - f6) - ((float) d2));
            }
            eVar.mo545a(cVar.f467d.f417f, (int) f2);
            if (i == 0) {
                f2 += f;
            }
            f5 = f2 + ((float) d2);
            C0147c cVar6 = cVar.f467d.f414c != null ? cVar.f467d.f414c.f412a : null;
            if (!(cVar6 == null || cVar6.f465b.f414c == null || cVar6.f465b.f414c.f412a == cVar)) {
                cVar6 = null;
            }
            cVar = cVar6 == this ? null : cVar6;
        }
    }

    /* renamed from: d */
    public void mo507d(C0160e eVar, int i) {
        mo466b(eVar, i);
        int size = this.f527H.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0147c) this.f527H.get(i2)).mo466b(eVar, i);
        }
    }

    /* renamed from: A */
    public void mo503A() {
        int i = this.f474k;
        int i2 = this.f475l;
        mo486k();
        mo487l();
        if (this.f473j != null) {
            if (this.f501I == null) {
                this.f501I = new C0154g(this);
            }
            this.f501I.mo512a(this);
            mo463b(this.f497D);
            mo469c(this.f498E);
            mo500x();
            mo457a(this.f495A.mo559h());
        } else {
            this.f474k = 0;
            this.f475l = 0;
        }
        m527D();
        int size = this.f527H.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0147c cVar = (C0147c) this.f527H.get(i3);
            if (cVar instanceof C0156h) {
                ((C0156h) cVar).mo503A();
            }
        }
        try {
            this.f495A.mo549b();
            mo506c(this.f495A, Integer.MAX_VALUE);
            this.f495A.mo558g();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo507d(this.f495A, Integer.MAX_VALUE);
        if (this.f473j != null) {
            int k = mo486k();
            int l = mo487l();
            this.f501I.mo513b(this);
            mo473d(k + this.f497D + this.f499F);
            mo475e(l + this.f498E + this.f500G);
        } else {
            this.f474k = i;
            this.f475l = i2;
        }
        mo457a(this.f495A.mo559h());
        if (this == mo516C()) {
            mo499w();
        }
    }

    /* renamed from: D */
    private void m527D() {
        this.f502J = 0;
        this.f503K = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo505a(C0147c cVar, int i) {
        if (i == 0) {
            while (cVar.f464a.f414c != null && cVar.f464a.f414c.f412a.f466c.f414c != null && cVar.f464a.f414c.f412a.f466c.f414c == cVar.f464a && cVar.f464a.f414c.f412a != cVar) {
                cVar = cVar.f464a.f414c.f412a;
            }
            m533d(cVar);
        } else if (i == 1) {
            while (cVar.f465b.f414c != null && cVar.f465b.f414c.f412a.f467d.f414c != null && cVar.f465b.f414c.f412a.f467d.f414c == cVar.f465b && cVar.f465b.f414c.f412a != cVar) {
                cVar = cVar.f465b.f414c.f412a;
            }
            m534e(cVar);
        }
    }

    /* renamed from: d */
    private void m533d(C0147c cVar) {
        int i = 0;
        while (true) {
            int i2 = this.f502J;
            if (i >= i2) {
                int i3 = i2 + 1;
                C0147c[] cVarArr = this.f506N;
                if (i3 >= cVarArr.length) {
                    this.f506N = (C0147c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                C0147c[] cVarArr2 = this.f506N;
                int i4 = this.f502J;
                cVarArr2[i4] = cVar;
                this.f502J = i4 + 1;
                return;
            } else if (this.f506N[i] != cVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m534e(C0147c cVar) {
        int i = 0;
        while (true) {
            int i2 = this.f503K;
            if (i >= i2) {
                int i3 = i2 + 1;
                C0147c[] cVarArr = this.f505M;
                if (i3 >= cVarArr.length) {
                    this.f505M = (C0147c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                C0147c[] cVarArr2 = this.f505M;
                int i4 = this.f503K;
                cVarArr2[i4] = cVar;
                this.f503K = i4 + 1;
                return;
            } else if (this.f505M[i] != cVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private int m530b(C0147c cVar, int i) {
        int i2;
        C0147c cVar2;
        boolean z;
        int i3;
        C0147c cVar3;
        boolean z2;
        boolean z3 = false;
        if (i == 0) {
            if (cVar.f464a.f414c == null || cVar.f464a.f414c.f412a == this) {
                cVar3 = cVar;
                i2 = 0;
                z2 = true;
            } else {
                cVar3 = cVar;
                i2 = 0;
                z2 = false;
            }
            while (cVar3.f466c.f414c != null) {
                if (cVar3.f480r == C0147c.C0149a.MATCH_CONSTRAINT) {
                    int i4 = i2 + 1;
                    C0147c[] cVarArr = this.f504L;
                    if (i4 >= cVarArr.length) {
                        this.f504L = (C0147c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    }
                    this.f504L[i2] = cVar3;
                    i2 = i4;
                }
                if (cVar3.f466c.f414c.f412a.f464a.f414c == null || cVar3.f466c.f414c.f412a.f464a.f414c.f412a != cVar3 || cVar3.f466c.f414c.f412a == cVar3) {
                    break;
                }
                cVar3 = cVar3.f466c.f414c.f412a;
            }
            if (cVar3.f466c.f414c == null || cVar3.f466c.f414c.f412a == this) {
                z3 = z2;
            }
            cVar.f485w = z3;
        } else {
            if (cVar.f465b.f414c == null || cVar.f465b.f414c.f412a == this) {
                cVar2 = cVar;
                i3 = 0;
                z = true;
            } else {
                cVar2 = cVar;
                i3 = 0;
                z = false;
            }
            while (cVar2.f467d.f414c != null) {
                if (cVar2.f481s == C0147c.C0149a.MATCH_CONSTRAINT) {
                    int i5 = i3 + 1;
                    C0147c[] cVarArr2 = this.f504L;
                    if (i5 >= cVarArr2.length) {
                        this.f504L = (C0147c[]) Arrays.copyOf(cVarArr2, cVarArr2.length * 2);
                    }
                    this.f504L[i3] = cVar2;
                    i3 = i5;
                }
                if (cVar2.f467d.f414c.f412a.f465b.f414c == null || cVar2.f467d.f414c.f412a.f465b.f414c.f412a != cVar2 || cVar2.f467d.f414c.f412a == cVar2) {
                    break;
                }
                cVar2 = cVar2.f467d.f414c.f412a;
            }
            if (cVar2.f467d.f414c == null || cVar2.f467d.f414c.f412a == this) {
                z3 = z;
            }
            cVar.f486x = z3;
        }
        return i2;
    }
}
