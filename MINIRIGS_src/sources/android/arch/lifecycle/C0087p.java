package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0065d;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.p */
public class C0087p extends Fragment {

    /* renamed from: a */
    private C0088a f202a;

    /* renamed from: android.arch.lifecycle.p$a */
    interface C0088a {
        /* renamed from: a */
        void mo204a();

        /* renamed from: b */
        void mo205b();

        /* renamed from: c */
        void mo206c();
    }

    /* renamed from: a */
    public static void m298a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0087p(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    static C0087p m300b(Activity activity) {
        return (C0087p) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    private void m301b(C0088a aVar) {
        if (aVar != null) {
            aVar.mo204a();
        }
    }

    /* renamed from: c */
    private void m302c(C0088a aVar) {
        if (aVar != null) {
            aVar.mo205b();
        }
    }

    /* renamed from: d */
    private void m303d(C0088a aVar) {
        if (aVar != null) {
            aVar.mo206c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m301b(this.f202a);
        m299a(C0065d.C0066a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m302c(this.f202a);
        m299a(C0065d.C0066a.ON_START);
    }

    public void onResume() {
        super.onResume();
        m303d(this.f202a);
        m299a(C0065d.C0066a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m299a(C0065d.C0066a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m299a(C0065d.C0066a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m299a(C0065d.C0066a.ON_DESTROY);
        this.f202a = null;
    }

    /* renamed from: a */
    private void m299a(C0065d.C0066a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0077i) {
            ((C0077i) activity).mo195a().mo192a(aVar);
        } else if (activity instanceof C0073g) {
            C0065d d = ((C0073g) activity).mo191d();
            if (d instanceof C0074h) {
                ((C0074h) d).mo192a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo207a(C0088a aVar) {
        this.f202a = aVar;
    }
}
