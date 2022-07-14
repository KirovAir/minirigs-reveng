package android.support.p015d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p035g.C0518f;
import android.support.p026v4.p035g.C0532l;
import android.support.p026v4.p036h.C0594r;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.d.m */
public abstract class C0216m implements Cloneable {

    /* renamed from: A */
    private static ThreadLocal<C0511a<Animator, C0220a>> f683A = new ThreadLocal<>();

    /* renamed from: h */
    private static final int[] f684h = {2, 1, 3, 4};

    /* renamed from: i */
    private static final C0209g f685i = new C0209g() {
        /* renamed from: a */
        public Path mo668a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: B */
    private ViewGroup f686B = null;

    /* renamed from: C */
    private int f687C = 0;

    /* renamed from: D */
    private boolean f688D = false;

    /* renamed from: E */
    private boolean f689E = false;

    /* renamed from: F */
    private ArrayList<C0222c> f690F = null;

    /* renamed from: G */
    private ArrayList<Animator> f691G = new ArrayList<>();

    /* renamed from: H */
    private C0221b f692H;

    /* renamed from: I */
    private C0511a<String, String> f693I;

    /* renamed from: J */
    private C0209g f694J = f685i;

    /* renamed from: a */
    long f695a = -1;

    /* renamed from: b */
    ArrayList<Integer> f696b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<View> f697c = new ArrayList<>();

    /* renamed from: d */
    C0228q f698d = null;

    /* renamed from: e */
    boolean f699e = false;

    /* renamed from: f */
    ArrayList<Animator> f700f = new ArrayList<>();

    /* renamed from: g */
    C0227p f701g;

    /* renamed from: j */
    private String f702j = getClass().getName();

    /* renamed from: k */
    private long f703k = -1;

    /* renamed from: l */
    private TimeInterpolator f704l = null;

    /* renamed from: m */
    private ArrayList<String> f705m = null;

    /* renamed from: n */
    private ArrayList<Class> f706n = null;

    /* renamed from: o */
    private ArrayList<Integer> f707o = null;

    /* renamed from: p */
    private ArrayList<View> f708p = null;

    /* renamed from: q */
    private ArrayList<Class> f709q = null;

    /* renamed from: r */
    private ArrayList<String> f710r = null;

    /* renamed from: s */
    private ArrayList<Integer> f711s = null;

    /* renamed from: t */
    private ArrayList<View> f712t = null;

    /* renamed from: u */
    private ArrayList<Class> f713u = null;

    /* renamed from: v */
    private C0233t f714v = new C0233t();

    /* renamed from: w */
    private C0233t f715w = new C0233t();

    /* renamed from: x */
    private int[] f716x = f684h;

    /* renamed from: y */
    private ArrayList<C0232s> f717y;

    /* renamed from: z */
    private ArrayList<C0232s> f718z;

    /* renamed from: android.support.d.m$b */
    public static abstract class C0221b {
    }

    /* renamed from: android.support.d.m$c */
    public interface C0222c {
        /* renamed from: a */
        void mo609a(C0216m mVar);

        /* renamed from: b */
        void mo610b(C0216m mVar);

        /* renamed from: c */
        void mo611c(C0216m mVar);

        /* renamed from: d */
        void mo612d(C0216m mVar);
    }

    /* renamed from: a */
    public Animator mo599a(ViewGroup viewGroup, C0232s sVar, C0232s sVar2) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo602a(C0232s sVar);

    /* renamed from: a */
    public String[] mo604a() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo607b(C0232s sVar);

    /* renamed from: a */
    public C0216m mo676a(long j) {
        this.f695a = j;
        return this;
    }

    /* renamed from: b */
    public long mo690b() {
        return this.f695a;
    }

    /* renamed from: b */
    public C0216m mo691b(long j) {
        this.f703k = j;
        return this;
    }

    /* renamed from: c */
    public long mo695c() {
        return this.f703k;
    }

    /* renamed from: a */
    public C0216m mo677a(TimeInterpolator timeInterpolator) {
        this.f704l = timeInterpolator;
        return this;
    }

    /* renamed from: d */
    public TimeInterpolator mo699d() {
        return this.f704l;
    }

    /* renamed from: a */
    private void m760a(C0511a<View, C0232s> aVar, C0511a<View, C0232s> aVar2) {
        C0232s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b = aVar.mo2095b(size);
            if (!(b == null || !mo689a(b) || (remove = aVar2.remove(b)) == null || remove.f746b == null || !mo689a(remove.f746b))) {
                this.f717y.add(aVar.mo2100d(size));
                this.f718z.add(remove);
            }
        }
    }

    /* renamed from: a */
    private void m762a(C0511a<View, C0232s> aVar, C0511a<View, C0232s> aVar2, C0518f<View> fVar, C0518f<View> fVar2) {
        View a;
        int b = fVar.mo2007b();
        for (int i = 0; i < b; i++) {
            View c = fVar.mo2012c(i);
            if (c != null && mo689a(c) && (a = fVar2.mo2004a(fVar.mo2008b(i))) != null && mo689a(a)) {
                C0232s sVar = aVar.get(c);
                C0232s sVar2 = aVar2.get(a);
                if (!(sVar == null || sVar2 == null)) {
                    this.f717y.add(sVar);
                    this.f718z.add(sVar2);
                    aVar.remove(c);
                    aVar2.remove(a);
                }
            }
        }
    }

    /* renamed from: a */
    private void m763a(C0511a<View, C0232s> aVar, C0511a<View, C0232s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo689a(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo689a(view)) {
                C0232s sVar = aVar.get(valueAt);
                C0232s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f717y.add(sVar);
                    this.f718z.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m761a(C0511a<View, C0232s> aVar, C0511a<View, C0232s> aVar2, C0511a<String, View> aVar3, C0511a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View c = aVar3.mo2096c(i);
            if (c != null && mo689a(c) && (view = aVar4.get(aVar3.mo2095b(i))) != null && mo689a(view)) {
                C0232s sVar = aVar.get(c);
                C0232s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f717y.add(sVar);
                    this.f718z.add(sVar2);
                    aVar.remove(c);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: b */
    private void m765b(C0511a<View, C0232s> aVar, C0511a<View, C0232s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C0232s c = aVar.mo2096c(i);
            if (mo689a(c.f746b)) {
                this.f717y.add(c);
                this.f718z.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C0232s c2 = aVar2.mo2096c(i2);
            if (mo689a(c2.f746b)) {
                this.f718z.add(c2);
                this.f717y.add((Object) null);
            }
        }
    }

    /* renamed from: a */
    private void m758a(C0233t tVar, C0233t tVar2) {
        C0511a aVar = new C0511a((C0532l) tVar.f748a);
        C0511a aVar2 = new C0511a((C0532l) tVar2.f748a);
        int i = 0;
        while (true) {
            int[] iArr = this.f716x;
            if (i < iArr.length) {
                switch (iArr[i]) {
                    case 1:
                        m760a((C0511a<View, C0232s>) aVar, (C0511a<View, C0232s>) aVar2);
                        break;
                    case 2:
                        m761a((C0511a<View, C0232s>) aVar, (C0511a<View, C0232s>) aVar2, tVar.f751d, tVar2.f751d);
                        break;
                    case 3:
                        m763a((C0511a<View, C0232s>) aVar, (C0511a<View, C0232s>) aVar2, tVar.f749b, tVar2.f749b);
                        break;
                    case 4:
                        m762a((C0511a<View, C0232s>) aVar, (C0511a<View, C0232s>) aVar2, tVar.f750c, tVar2.f750c);
                        break;
                }
                i++;
            } else {
                m765b((C0511a<View, C0232s>) aVar, (C0511a<View, C0232s>) aVar2);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo686a(ViewGroup viewGroup, C0233t tVar, C0233t tVar2, ArrayList<C0232s> arrayList, ArrayList<C0232s> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C0232s sVar;
        long j;
        C0232s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C0511a<Animator, C0220a> q = mo734q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0232s sVar3 = arrayList.get(i3);
            C0232s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f747c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f747c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 == null && sVar4 == null) {
                i2 = size;
                i = i3;
            } else {
                if (sVar3 == null || sVar4 == null || mo603a(sVar3, sVar4)) {
                    Animator a = mo599a(viewGroup2, sVar3, sVar4);
                    if (a != null) {
                        if (sVar4 != null) {
                            view = sVar4.f746b;
                            String[] a2 = mo604a();
                            if (view != null && a2 != null && a2.length > 0) {
                                sVar2 = new C0232s();
                                sVar2.f746b = view;
                                Animator animator3 = a;
                                i2 = size;
                                C0232s sVar5 = tVar2.f748a.get(view);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < a2.length) {
                                        sVar2.f745a.put(a2[i4], sVar5.f745a.get(a2[i4]));
                                        i4++;
                                        i3 = i3;
                                        sVar5 = sVar5;
                                        ArrayList<C0232s> arrayList3 = arrayList2;
                                    }
                                    i = i3;
                                } else {
                                    i = i3;
                                }
                                int size2 = q.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C0220a aVar = q.get(q.mo2095b(i5));
                                    if (aVar.f724c != null && aVar.f722a == view && aVar.f723b.equals(mo713p()) && aVar.f724c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                sVar2 = null;
                            }
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i2 = size;
                            i = i3;
                            view = sVar3.f746b;
                            animator = a;
                            sVar = null;
                        }
                        if (animator != null) {
                            C0227p pVar = this.f701g;
                            if (pVar != null) {
                                long a3 = pVar.mo721a(viewGroup2, this, sVar3, sVar4);
                                sparseIntArray.put(this.f691G.size(), (int) a3);
                                j = Math.min(a3, j2);
                            } else {
                                j = j2;
                            }
                            q.put(animator, new C0220a(view, mo713p(), this, C0173ad.m646b(viewGroup), sVar));
                            this.f691G.add(animator);
                            j2 = j;
                        }
                    } else {
                        i2 = size;
                        i = i3;
                    }
                } else {
                    i2 = size;
                    i = i3;
                }
            }
            i3 = i + 1;
            size = i2;
        }
        if (j2 != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f691G.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j2) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo689a(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f707o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f708p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f709q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f709q.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f710r != null && C0594r.m2612m(view) != null && this.f710r.contains(C0594r.m2612m(view))) {
            return false;
        }
        if ((this.f696b.size() == 0 && this.f697c.size() == 0 && (((arrayList = this.f706n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f705m) == null || arrayList2.isEmpty()))) || this.f696b.contains(Integer.valueOf(id)) || this.f697c.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f705m;
        if (arrayList6 != null && arrayList6.contains(C0594r.m2612m(view))) {
            return true;
        }
        if (this.f706n != null) {
            for (int i2 = 0; i2 < this.f706n.size(); i2++) {
                if (this.f706n.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    private static C0511a<Animator, C0220a> mo734q() {
        C0511a<Animator, C0220a> aVar = f683A.get();
        if (aVar != null) {
            return aVar;
        }
        C0511a<Animator, C0220a> aVar2 = new C0511a<>();
        f683A.set(aVar2);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo701e() {
        mo707j();
        C0511a<Animator, C0220a> q = mo734q();
        Iterator<Animator> it = this.f691G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q.containsKey(next)) {
                mo707j();
                m757a(next, q);
            }
        }
        this.f691G.clear();
        mo708k();
    }

    /* renamed from: a */
    private void m757a(Animator animator, final C0511a<Animator, C0220a> aVar) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    C0216m.this.f700f.add(animator);
                }

                public void onAnimationEnd(Animator animator) {
                    aVar.remove(animator);
                    C0216m.this.f700f.remove(animator);
                }
            });
            mo681a(animator);
        }
    }

    /* renamed from: b */
    public C0216m mo693b(View view) {
        this.f697c.add(view);
        return this;
    }

    /* renamed from: c */
    public C0216m mo696c(View view) {
        this.f697c.remove(view);
        return this;
    }

    /* renamed from: f */
    public List<Integer> mo703f() {
        return this.f696b;
    }

    /* renamed from: g */
    public List<View> mo704g() {
        return this.f697c;
    }

    /* renamed from: h */
    public List<String> mo705h() {
        return this.f705m;
    }

    /* renamed from: i */
    public List<Class> mo706i() {
        return this.f706n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo687a(ViewGroup viewGroup, boolean z) {
        C0511a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        mo688a(z);
        if ((this.f696b.size() > 0 || this.f697c.size() > 0) && (((arrayList = this.f705m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f706n) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f696b.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f696b.get(i).intValue());
                if (findViewById != null) {
                    C0232s sVar = new C0232s();
                    sVar.f746b = findViewById;
                    if (z) {
                        mo602a(sVar);
                    } else {
                        mo607b(sVar);
                    }
                    sVar.f747c.add(this);
                    mo697c(sVar);
                    if (z) {
                        m759a(this.f714v, findViewById, sVar);
                    } else {
                        m759a(this.f715w, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f697c.size(); i2++) {
                View view = this.f697c.get(i2);
                C0232s sVar2 = new C0232s();
                sVar2.f746b = view;
                if (z) {
                    mo602a(sVar2);
                } else {
                    mo607b(sVar2);
                }
                sVar2.f747c.add(this);
                mo697c(sVar2);
                if (z) {
                    m759a(this.f714v, view, sVar2);
                } else {
                    m759a(this.f715w, view, sVar2);
                }
            }
        } else {
            m766c(viewGroup, z);
        }
        if (!z && (aVar = this.f693I) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f714v.f751d.remove(this.f693I.mo2095b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f714v.f751d.put(this.f693I.mo2096c(i4), view2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m759a(C0233t tVar, View view, C0232s sVar) {
        tVar.f748a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f749b.indexOfKey(id) >= 0) {
                tVar.f749b.put(id, (Object) null);
            } else {
                tVar.f749b.put(id, view);
            }
        }
        String m = C0594r.m2612m(view);
        if (m != null) {
            if (tVar.f751d.containsKey(m)) {
                tVar.f751d.put(m, null);
            } else {
                tVar.f751d.put(m, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f750c.mo2011c(itemIdAtPosition) >= 0) {
                    View a = tVar.f750c.mo2004a(itemIdAtPosition);
                    if (a != null) {
                        C0594r.m2590a(a, false);
                        tVar.f750c.mo2010b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0594r.m2590a(view, true);
                tVar.f750c.mo2010b(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo688a(boolean z) {
        if (z) {
            this.f714v.f748a.clear();
            this.f714v.f749b.clear();
            this.f714v.f750c.mo2013c();
            return;
        }
        this.f715w.f748a.clear();
        this.f715w.f749b.clear();
        this.f715w.f750c.mo2013c();
    }

    /* renamed from: c */
    private void m766c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f707o;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f708p;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f709q;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f709q.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0232s sVar = new C0232s();
                        sVar.f746b = view;
                        if (z) {
                            mo602a(sVar);
                        } else {
                            mo607b(sVar);
                        }
                        sVar.f747c.add(this);
                        mo697c(sVar);
                        if (z) {
                            m759a(this.f714v, view, sVar);
                        } else {
                            m759a(this.f715w, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f711s;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f712t;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f713u;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f713u.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m766c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C0232s mo679a(View view, boolean z) {
        C0228q qVar = this.f698d;
        if (qVar != null) {
            return qVar.mo679a(view, z);
        }
        return (z ? this.f714v : this.f715w).f748a.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0232s mo694b(View view, boolean z) {
        C0228q qVar = this.f698d;
        if (qVar != null) {
            return qVar.mo694b(view, z);
        }
        ArrayList<C0232s> arrayList = z ? this.f717y : this.f718z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0232s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f746b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f718z : this.f717y).get(i);
    }

    /* renamed from: d */
    public void mo700d(View view) {
        if (!this.f689E) {
            C0511a<Animator, C0220a> q = mo734q();
            int size = q.size();
            C0186al b = C0173ad.m646b(view);
            for (int i = size - 1; i >= 0; i--) {
                C0220a c = q.mo2096c(i);
                if (c.f722a != null && b.equals(c.f725d)) {
                    C0167a.m623a(q.mo2095b(i));
                }
            }
            ArrayList<C0222c> arrayList = this.f690F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f690F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0222c) arrayList2.get(i2)).mo610b(this);
                }
            }
            this.f688D = true;
        }
    }

    /* renamed from: e */
    public void mo702e(View view) {
        if (this.f688D) {
            if (!this.f689E) {
                C0511a<Animator, C0220a> q = mo734q();
                int size = q.size();
                C0186al b = C0173ad.m646b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0220a c = q.mo2096c(i);
                    if (c.f722a != null && b.equals(c.f725d)) {
                        C0167a.m625b(q.mo2095b(i));
                    }
                }
                ArrayList<C0222c> arrayList = this.f690F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f690F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0222c) arrayList2.get(i2)).mo611c(this);
                    }
                }
            }
            this.f688D = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo685a(ViewGroup viewGroup) {
        C0220a aVar;
        this.f717y = new ArrayList<>();
        this.f718z = new ArrayList<>();
        m758a(this.f714v, this.f715w);
        C0511a<Animator, C0220a> q = mo734q();
        int size = q.size();
        C0186al b = C0173ad.m646b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b2 = q.mo2095b(i);
            if (!(b2 == null || (aVar = q.get(b2)) == null || aVar.f722a == null || !b.equals(aVar.f725d))) {
                C0232s sVar = aVar.f724c;
                View view = aVar.f722a;
                C0232s a = mo679a(view, true);
                C0232s b3 = mo694b(view, true);
                if (!(a == null && b3 == null) && aVar.f726e.mo603a(sVar, b3)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        q.remove(b2);
                    }
                }
            }
        }
        mo686a(viewGroup, this.f714v, this.f715w, this.f717y, this.f718z);
        mo701e();
    }

    /* renamed from: a */
    public boolean mo603a(C0232s sVar, C0232s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] a = mo604a();
        if (a != null) {
            for (String a2 : a) {
                if (m764a(sVar, sVar2, a2)) {
                    return true;
                }
            }
            return false;
        }
        for (String a3 : sVar.f745a.keySet()) {
            if (m764a(sVar, sVar2, a3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m764a(C0232s sVar, C0232s sVar2, String str) {
        Object obj = sVar.f745a.get(str);
        Object obj2 = sVar2.f745a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo681a(Animator animator) {
        if (animator == null) {
            mo708k();
            return;
        }
        if (mo690b() >= 0) {
            animator.setDuration(mo690b());
        }
        if (mo695c() >= 0) {
            animator.setStartDelay(mo695c());
        }
        if (mo699d() != null) {
            animator.setInterpolator(mo699d());
        }
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C0216m.this.mo708k();
                animator.removeListener(this);
            }
        });
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo707j() {
        if (this.f687C == 0) {
            ArrayList<C0222c> arrayList = this.f690F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f690F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0222c) arrayList2.get(i)).mo612d(this);
                }
            }
            this.f689E = false;
        }
        this.f687C++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo708k() {
        this.f687C--;
        if (this.f687C == 0) {
            ArrayList<C0222c> arrayList = this.f690F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f690F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0222c) arrayList2.get(i)).mo609a(this);
                }
            }
            for (int i2 = 0; i2 < this.f714v.f750c.mo2007b(); i2++) {
                View c = this.f714v.f750c.mo2012c(i2);
                if (c != null) {
                    C0594r.m2590a(c, false);
                }
            }
            for (int i3 = 0; i3 < this.f715w.f750c.mo2007b(); i3++) {
                View c2 = this.f715w.f750c.mo2012c(i3);
                if (c2 != null) {
                    C0594r.m2590a(c2, false);
                }
            }
            this.f689E = true;
        }
    }

    /* renamed from: a */
    public C0216m mo678a(C0222c cVar) {
        if (this.f690F == null) {
            this.f690F = new ArrayList<>();
        }
        this.f690F.add(cVar);
        return this;
    }

    /* renamed from: b */
    public C0216m mo692b(C0222c cVar) {
        ArrayList<C0222c> arrayList = this.f690F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.f690F.size() == 0) {
            this.f690F = null;
        }
        return this;
    }

    /* renamed from: a */
    public void mo682a(C0209g gVar) {
        if (gVar == null) {
            this.f694J = f685i;
        } else {
            this.f694J = gVar;
        }
    }

    /* renamed from: l */
    public C0209g mo709l() {
        return this.f694J;
    }

    /* renamed from: a */
    public void mo683a(C0221b bVar) {
        this.f692H = bVar;
    }

    /* renamed from: m */
    public C0221b mo710m() {
        return this.f692H;
    }

    /* renamed from: a */
    public void mo684a(C0227p pVar) {
        this.f701g = pVar;
    }

    /* renamed from: n */
    public C0227p mo711n() {
        return this.f701g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo697c(C0232s sVar) {
        String[] a;
        if (this.f701g != null && !sVar.f745a.isEmpty() && (a = this.f701g.mo723a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!sVar.f745a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f701g.mo722a(sVar);
            }
        }
    }

    public String toString() {
        return mo680a("");
    }

    /* renamed from: o */
    public C0216m clone() {
        try {
            C0216m mVar = (C0216m) super.clone();
            mVar.f691G = new ArrayList<>();
            mVar.f714v = new C0233t();
            mVar.f715w = new C0233t();
            mVar.f717y = null;
            mVar.f718z = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public String mo713p() {
        return this.f702j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo680a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f695a != -1) {
            str2 = str2 + "dur(" + this.f695a + ") ";
        }
        if (this.f703k != -1) {
            str2 = str2 + "dly(" + this.f703k + ") ";
        }
        if (this.f704l != null) {
            str2 = str2 + "interp(" + this.f704l + ") ";
        }
        if (this.f696b.size() <= 0 && this.f697c.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f696b.size() > 0) {
            String str4 = str3;
            for (int i = 0; i < this.f696b.size(); i++) {
                if (i > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f696b.get(i);
            }
            str3 = str4;
        }
        if (this.f697c.size() > 0) {
            for (int i2 = 0; i2 < this.f697c.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f697c.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: android.support.d.m$a */
    private static class C0220a {

        /* renamed from: a */
        View f722a;

        /* renamed from: b */
        String f723b;

        /* renamed from: c */
        C0232s f724c;

        /* renamed from: d */
        C0186al f725d;

        /* renamed from: e */
        C0216m f726e;

        C0220a(View view, String str, C0216m mVar, C0186al alVar, C0232s sVar) {
            this.f722a = view;
            this.f723b = str;
            this.f724c = sVar;
            this.f725d = alVar;
            this.f726e = mVar;
        }
    }
}
