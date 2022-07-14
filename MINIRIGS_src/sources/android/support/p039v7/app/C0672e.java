package android.support.p039v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.e */
public abstract class C0672e {

    /* renamed from: a */
    private static int f2106a = -1;

    /* renamed from: a */
    public abstract C0664a mo2581a();

    /* renamed from: a */
    public abstract <T extends View> T mo2582a(int i);

    /* renamed from: a */
    public abstract void mo2583a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo2584a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo2585a(View view);

    /* renamed from: a */
    public abstract void mo2586a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo2587a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo2588b();

    /* renamed from: b */
    public abstract void mo2589b(int i);

    /* renamed from: b */
    public abstract void mo2590b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo2591b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo2592c();

    /* renamed from: c */
    public abstract void mo2593c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo2594c(int i);

    /* renamed from: d */
    public abstract void mo2595d();

    /* renamed from: e */
    public abstract void mo2596e();

    /* renamed from: f */
    public abstract void mo2597f();

    /* renamed from: g */
    public abstract void mo2598g();

    /* renamed from: h */
    public abstract void mo2599h();

    /* renamed from: i */
    public abstract boolean mo2600i();

    /* renamed from: a */
    public static C0672e m2947a(Activity activity, C0671d dVar) {
        return new C0673f(activity, activity.getWindow(), dVar);
    }

    /* renamed from: a */
    public static C0672e m2948a(Dialog dialog, C0671d dVar) {
        return new C0673f(dialog.getContext(), dialog.getWindow(), dVar);
    }

    C0672e() {
    }

    /* renamed from: j */
    public static int m2949j() {
        return f2106a;
    }
}
