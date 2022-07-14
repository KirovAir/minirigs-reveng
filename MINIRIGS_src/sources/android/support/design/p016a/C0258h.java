package android.support.design.p016a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p026v4.p035g.C0532l;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.a.h */
public class C0258h {

    /* renamed from: a */
    private final C0532l<String, C0259i> f776a = new C0532l<>();

    /* renamed from: a */
    public boolean mo759a(String str) {
        return this.f776a.get(str) != null;
    }

    /* renamed from: b */
    public C0259i mo760b(String str) {
        if (mo759a(str)) {
            return this.f776a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo758a(String str, C0259i iVar) {
        this.f776a.put(str, iVar);
    }

    /* renamed from: a */
    public long mo757a() {
        int size = this.f776a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0259i c = this.f776a.mo2096c(i);
            j = Math.max(j, c.mo764a() + c.mo766b());
        }
        return j;
    }

    /* renamed from: a */
    public static C0258h m891a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m892a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m892a((List<Animator>) arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C0258h m892a(List<Animator> list) {
        C0258h hVar = new C0258h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m893a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m893a(C0258h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo758a(objectAnimator.getPropertyName(), C0259i.m898a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f776a.equals(((C0258h) obj).f776a);
    }

    public int hashCode() {
        return this.f776a.hashCode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f776a + "}\n";
    }
}
