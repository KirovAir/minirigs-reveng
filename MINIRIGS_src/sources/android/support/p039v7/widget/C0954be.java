package android.support.p039v7.widget;

import android.support.p039v7.widget.C0904ay;
import android.view.View;

/* renamed from: android.support.v7.widget.be */
class C0954be {
    /* renamed from: a */
    static int m5022a(C0904ay.C0942u uVar, C0901ax axVar, View view, View view2, C0904ay.C0922i iVar, boolean z, boolean z2) {
        int i;
        if (iVar.mo4488v() == 0 || uVar.mo4581e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(iVar.mo4458d(view), iVar.mo4458d(view2));
        int max = Math.max(iVar.mo4458d(view), iVar.mo4458d(view2));
        if (z2) {
            i = Math.max(0, (uVar.mo4581e() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(axVar.mo4174b(view2) - axVar.mo4170a(view))) / ((float) (Math.abs(iVar.mo4458d(view) - iVar.mo4458d(view2)) + 1)))) + ((float) (axVar.mo4175c() - axVar.mo4170a(view))));
    }

    /* renamed from: a */
    static int m5021a(C0904ay.C0942u uVar, C0901ax axVar, View view, View view2, C0904ay.C0922i iVar, boolean z) {
        if (iVar.mo4488v() == 0 || uVar.mo4581e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(iVar.mo4458d(view) - iVar.mo4458d(view2)) + 1;
        }
        return Math.min(axVar.mo4181f(), axVar.mo4174b(view2) - axVar.mo4170a(view));
    }

    /* renamed from: b */
    static int m5023b(C0904ay.C0942u uVar, C0901ax axVar, View view, View view2, C0904ay.C0922i iVar, boolean z) {
        if (iVar.mo4488v() == 0 || uVar.mo4581e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return uVar.mo4581e();
        }
        return (int) ((((float) (axVar.mo4174b(view2) - axVar.mo4170a(view))) / ((float) (Math.abs(iVar.mo4458d(view) - iVar.mo4458d(view2)) + 1))) * ((float) uVar.mo4581e()));
    }
}
