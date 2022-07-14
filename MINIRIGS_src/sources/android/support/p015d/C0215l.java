package android.support.p015d;

import android.support.p015d.C0212j;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.d.l */
public class C0215l {

    /* renamed from: a */
    private ViewGroup f681a;

    /* renamed from: b */
    private Runnable f682b;

    /* renamed from: a */
    public void mo675a() {
        Runnable runnable;
        if (m754a(this.f681a) == this && (runnable = this.f682b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    static void m755a(View view, C0215l lVar) {
        view.setTag(C0212j.C0213a.transition_current_scene, lVar);
    }

    /* renamed from: a */
    static C0215l m754a(View view) {
        return (C0215l) view.getTag(C0212j.C0213a.transition_current_scene);
    }
}
