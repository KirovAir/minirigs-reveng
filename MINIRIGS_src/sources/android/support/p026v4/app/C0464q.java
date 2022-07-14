package android.support.p026v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.p026v4.app.C0421d;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p036h.C0594r;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.q */
class C0464q {

    /* renamed from: a */
    private static final int[] f1559a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0475s f1560b = (Build.VERSION.SDK_INT >= 21 ? new C0470r() : null);

    /* renamed from: c */
    private static final C0475s f1561c = m2080a();

    /* renamed from: a */
    private static C0475s m2080a() {
        try {
            return (C0475s) Class.forName("android.support.d.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m2095a(C0442l lVar, ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (lVar.f1495l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0421d dVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m2106b(dVar, (SparseArray<C0469a>) sparseArray, z);
                } else {
                    m2092a(dVar, (SparseArray<C0469a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar.f1496m.mo1713g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0511a<String, String> a = m2082a(keyAt, arrayList, arrayList2, i, i2);
                    C0469a aVar = (C0469a) sparseArray.valueAt(i4);
                    if (z) {
                        m2094a(lVar, keyAt, aVar, view, a);
                    } else {
                        m2107b(lVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C0511a<String, String> m2082a(int i, ArrayList<C0421d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0511a<String, String> aVar = new C0511a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0421d dVar = arrayList.get(i4);
            if (dVar.mo1521b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (dVar.f1357r != null) {
                    int size = dVar.f1357r.size();
                    if (booleanValue) {
                        arrayList3 = dVar.f1357r;
                        arrayList4 = dVar.f1358s;
                    } else {
                        ArrayList<String> arrayList5 = dVar.f1357r;
                        arrayList3 = dVar.f1358s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r11 = r4.f1590a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2094a(android.support.p026v4.app.C0442l r17, int r18, android.support.p026v4.app.C0464q.C0469a r19, android.view.View r20, android.support.p026v4.p035g.C0511a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            android.support.v4.app.h r1 = r0.f1497n
            boolean r1 = r1.mo1641a()
            if (r1 == 0) goto L_0x001a
            android.support.v4.app.h r0 = r0.f1497n
            r1 = r18
            android.view.View r0 = r0.mo1640a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r10 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r10 = r0
        L_0x001c:
            if (r10 != 0) goto L_0x001f
            return
        L_0x001f:
            android.support.v4.app.f r11 = r4.f1590a
            android.support.v4.app.f r12 = r4.f1593d
            android.support.v4.app.s r13 = m2081a((android.support.p026v4.app.C0425f) r12, (android.support.p026v4.app.C0425f) r11)
            if (r13 != 0) goto L_0x002a
            return
        L_0x002a:
            boolean r14 = r4.f1591b
            boolean r0 = r4.f1594e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = m2086a((android.support.p026v4.app.C0475s) r13, (android.support.p026v4.app.C0425f) r11, (boolean) r14)
            java.lang.Object r6 = m2104b((android.support.p026v4.app.C0475s) r13, (android.support.p026v4.app.C0425f) r12, (boolean) r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m2087a((android.support.p026v4.app.C0475s) r0, (android.view.ViewGroup) r1, (android.view.View) r2, (android.support.p026v4.p035g.C0511a<java.lang.String, java.lang.String>) r3, (android.support.p026v4.app.C0464q.C0469a) r4, (java.util.ArrayList<android.view.View>) r5, (java.util.ArrayList<android.view.View>) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            r6 = r18
            if (r6 != 0) goto L_0x0062
            if (r8 != 0) goto L_0x0062
            r7 = r17
            if (r7 != 0) goto L_0x0064
            return
        L_0x0062:
            r7 = r17
        L_0x0064:
            java.util.ArrayList r5 = m2090a((android.support.p026v4.app.C0475s) r13, (java.lang.Object) r7, (android.support.p026v4.app.C0425f) r12, (java.util.ArrayList<android.view.View>) r10, (android.view.View) r9)
            java.util.ArrayList r9 = m2090a((android.support.p026v4.app.C0475s) r13, (java.lang.Object) r6, (android.support.p026v4.app.C0425f) r11, (java.util.ArrayList<android.view.View>) r15, (android.view.View) r9)
            r0 = 4
            m2100a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = m2088a((android.support.p026v4.app.C0475s) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (android.support.p026v4.app.C0425f) r4, (boolean) r5)
            if (r14 == 0) goto L_0x00a5
            m2097a((android.support.p026v4.app.C0475s) r13, (java.lang.Object) r7, (android.support.p026v4.app.C0425f) r12, (java.util.ArrayList<android.view.View>) r11)
            java.util.ArrayList r12 = r13.mo1861a((java.util.ArrayList<android.view.View>) r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.mo657a(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.mo653a((android.view.ViewGroup) r0, (java.lang.Object) r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.mo1863a(r2, r3, r4, r5, r6)
            r0 = 0
            m2100a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r13.mo659a((java.lang.Object) r8, (java.util.ArrayList<android.view.View>) r10, (java.util.ArrayList<android.view.View>) r15)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.app.C0464q.m2094a(android.support.v4.app.l, int, android.support.v4.app.q$a, android.view.View, android.support.v4.g.a):void");
    }

    /* renamed from: a */
    private static void m2097a(C0475s sVar, Object obj, C0425f fVar, final ArrayList<View> arrayList) {
        if (fVar != null && obj != null && fVar.f1414l && fVar.f1382B && fVar.f1396P) {
            fVar.mo1604f(true);
            sVar.mo664b(obj, fVar.mo1627q(), arrayList);
            C0482v.m2163a(fVar.f1389I, new Runnable() {
                public void run() {
                    C0464q.m2100a((ArrayList<View>) arrayList, 4);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m2107b(C0442l lVar, int i, C0469a aVar, View view, C0511a<String, String> aVar2) {
        C0425f fVar;
        C0425f fVar2;
        C0475s a;
        Object obj;
        C0442l lVar2 = lVar;
        C0469a aVar3 = aVar;
        View view2 = view;
        C0511a<String, String> aVar4 = aVar2;
        ViewGroup viewGroup = lVar2.f1497n.mo1641a() ? (ViewGroup) lVar2.f1497n.mo1640a(i) : null;
        if (viewGroup != null && (a = m2081a(fVar2, fVar)) != null) {
            boolean z = aVar3.f1591b;
            boolean z2 = aVar3.f1594e;
            Object a2 = m2086a(a, (fVar = aVar3.f1590a), z);
            Object b = m2104b(a, (fVar2 = aVar3.f1593d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = b;
            C0475s sVar = a;
            Object b2 = m2105b(a, viewGroup, view, aVar2, aVar, arrayList, arrayList2, a2, obj2);
            Object obj3 = a2;
            if (obj3 == null && b2 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> a3 = m2090a(sVar, obj, fVar2, (ArrayList<View>) arrayList3, view2);
            Object obj4 = (a3 == null || a3.isEmpty()) ? null : obj;
            sVar.mo663b(obj3, view2);
            Object a4 = m2088a(sVar, obj3, obj4, b2, fVar, aVar3.f1591b);
            if (a4 != null) {
                ArrayList arrayList4 = new ArrayList();
                C0475s sVar2 = sVar;
                sVar2.mo657a(a4, obj3, arrayList4, obj4, a3, b2, arrayList2);
                m2096a(sVar2, viewGroup, fVar, view, (ArrayList<View>) arrayList2, obj3, (ArrayList<View>) arrayList4, obj4, a3);
                ArrayList arrayList5 = arrayList2;
                sVar.mo1864a((View) viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) aVar4);
                sVar.mo653a(viewGroup, a4);
                sVar.mo1865a(viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) aVar4);
            }
        }
    }

    /* renamed from: a */
    private static void m2096a(C0475s sVar, ViewGroup viewGroup, C0425f fVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0475s sVar2 = sVar;
        final View view2 = view;
        final C0425f fVar2 = fVar;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        ViewGroup viewGroup2 = viewGroup;
        C0482v.m2163a(viewGroup, new Runnable() {
            public void run() {
                Object obj = obj3;
                if (obj != null) {
                    sVar2.mo667c(obj, view2);
                    arrayList5.addAll(C0464q.m2090a(sVar2, obj3, fVar2, (ArrayList<View>) arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        sVar2.mo665b(obj4, (ArrayList<View>) arrayList6, (ArrayList<View>) arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static C0475s m2081a(C0425f fVar, C0425f fVar2) {
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            Object z = fVar.mo1637z();
            if (z != null) {
                arrayList.add(z);
            }
            Object y = fVar.mo1636y();
            if (y != null) {
                arrayList.add(y);
            }
            Object C = fVar.mo1535C();
            if (C != null) {
                arrayList.add(C);
            }
        }
        if (fVar2 != null) {
            Object x = fVar2.mo1635x();
            if (x != null) {
                arrayList.add(x);
            }
            Object A = fVar2.mo1533A();
            if (A != null) {
                arrayList.add(A);
            }
            Object B = fVar2.mo1534B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0475s sVar = f1560b;
        if (sVar != null && m2102a(sVar, (List<Object>) arrayList)) {
            return f1560b;
        }
        C0475s sVar2 = f1561c;
        if (sVar2 != null && m2102a(sVar2, (List<Object>) arrayList)) {
            return f1561c;
        }
        if (f1560b == null && f1561c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static boolean m2102a(C0475s sVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sVar.mo660a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m2085a(C0475s sVar, C0425f fVar, C0425f fVar2, boolean z) {
        Object obj;
        if (fVar == null || fVar2 == null) {
            return null;
        }
        if (z) {
            obj = fVar2.mo1535C();
        } else {
            obj = fVar.mo1534B();
        }
        return sVar.mo666c(sVar.mo661b(obj));
    }

    /* renamed from: a */
    private static Object m2086a(C0475s sVar, C0425f fVar, boolean z) {
        Object obj;
        if (fVar == null) {
            return null;
        }
        if (z) {
            obj = fVar.mo1533A();
        } else {
            obj = fVar.mo1635x();
        }
        return sVar.mo661b(obj);
    }

    /* renamed from: b */
    private static Object m2104b(C0475s sVar, C0425f fVar, boolean z) {
        Object obj;
        if (fVar == null) {
            return null;
        }
        if (z) {
            obj = fVar.mo1636y();
        } else {
            obj = fVar.mo1637z();
        }
        return sVar.mo661b(obj);
    }

    /* renamed from: a */
    private static Object m2087a(C0475s sVar, ViewGroup viewGroup, View view, C0511a<String, String> aVar, C0469a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final Rect rect;
        final View view2;
        C0475s sVar2 = sVar;
        View view3 = view;
        C0511a<String, String> aVar3 = aVar;
        C0469a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        C0425f fVar = aVar4.f1590a;
        C0425f fVar2 = aVar4.f1593d;
        if (fVar != null) {
            fVar.mo1627q().setVisibility(0);
        }
        if (fVar == null || fVar2 == null) {
            return null;
        }
        boolean z = aVar4.f1591b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m2085a(sVar, fVar, fVar2, z);
        }
        C0511a<String, View> b = m2103b(sVar, aVar3, obj3, aVar4);
        C0511a<String, View> a = m2083a(sVar, aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m2101a(arrayList3, b, (Collection<String>) aVar.keySet());
            m2101a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2093a(fVar, fVar2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            sVar.mo656a(obj4, view3, arrayList3);
            m2098a(sVar, obj4, obj2, b, aVar4.f1594e, aVar4.f1595f);
            Rect rect2 = new Rect();
            View a2 = m2084a(a, aVar4, obj5, z);
            if (a2 != null) {
                sVar.mo654a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        final C0425f fVar3 = fVar;
        final C0425f fVar4 = fVar2;
        final boolean z2 = z;
        final C0511a<String, View> aVar5 = a;
        final C0475s sVar3 = sVar;
        C0482v.m2163a(viewGroup, new Runnable() {
            public void run() {
                C0464q.m2093a(fVar3, fVar4, z2, (C0511a<String, View>) aVar5, false);
                View view = view2;
                if (view != null) {
                    sVar3.mo1862a(view, rect);
                }
            }
        });
        return obj4;
    }

    /* renamed from: a */
    private static void m2101a(ArrayList<View> arrayList, C0511a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c = aVar.mo2096c(size);
            if (collection.contains(C0594r.m2612m(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: b */
    private static Object m2105b(C0475s sVar, ViewGroup viewGroup, View view, C0511a<String, String> aVar, C0469a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0511a<String, String> aVar3;
        Object obj3;
        Object obj4;
        Rect rect;
        C0475s sVar2 = sVar;
        C0469a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        C0425f fVar = aVar4.f1590a;
        C0425f fVar2 = aVar4.f1593d;
        if (fVar == null || fVar2 == null) {
            return null;
        }
        boolean z = aVar4.f1591b;
        if (aVar.isEmpty()) {
            aVar3 = aVar;
            obj3 = null;
        } else {
            obj3 = m2085a(sVar2, fVar, fVar2, z);
            aVar3 = aVar;
        }
        C0511a<String, View> b = m2103b(sVar2, aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2093a(fVar, fVar2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            sVar2.mo656a(obj4, view, arrayList3);
            m2098a(sVar, obj4, obj2, b, aVar4.f1594e, aVar4.f1595f);
            if (obj5 != null) {
                sVar2.mo654a(obj5, rect);
            }
        } else {
            rect = null;
        }
        final C0475s sVar3 = sVar;
        final C0511a<String, String> aVar5 = aVar;
        final Object obj6 = obj4;
        final C0469a aVar6 = aVar2;
        C04684 r13 = r0;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view2 = view;
        final C0425f fVar3 = fVar;
        final C0425f fVar4 = fVar2;
        final boolean z2 = z;
        final ArrayList<View> arrayList5 = arrayList;
        final Object obj7 = obj;
        final Rect rect2 = rect;
        C04684 r0 = new Runnable() {
            public void run() {
                C0511a<String, View> a = C0464q.m2083a(sVar3, (C0511a<String, String>) aVar5, obj6, aVar6);
                if (a != null) {
                    arrayList4.addAll(a.values());
                    arrayList4.add(view2);
                }
                C0464q.m2093a(fVar3, fVar4, z2, a, false);
                Object obj = obj6;
                if (obj != null) {
                    sVar3.mo659a(obj, (ArrayList<View>) arrayList5, (ArrayList<View>) arrayList4);
                    View a2 = C0464q.m2084a(a, aVar6, obj7, z2);
                    if (a2 != null) {
                        sVar3.mo1862a(a2, rect2);
                    }
                }
            }
        };
        C0482v.m2163a(viewGroup, r13);
        return obj4;
    }

    /* renamed from: b */
    private static C0511a<String, View> m2103b(C0475s sVar, C0511a<String, String> aVar, Object obj, C0469a aVar2) {
        C0483w wVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        C0425f fVar = aVar2.f1593d;
        C0511a<String, View> aVar3 = new C0511a<>();
        sVar.mo1867a((Map<String, View>) aVar3, fVar.mo1627q());
        C0421d dVar = aVar2.f1595f;
        if (aVar2.f1594e) {
            wVar = fVar.mo1553U();
            arrayList = dVar.f1358s;
        } else {
            wVar = fVar.mo1554V();
            arrayList = dVar.f1357r;
        }
        aVar3.mo1966a(arrayList);
        if (wVar != null) {
            wVar.mo1878a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0594r.m2612m(view))) {
                    aVar.put(C0594r.m2612m(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo1966a(aVar3.keySet());
        }
        return aVar3;
    }

    /* renamed from: a */
    static C0511a<String, View> m2083a(C0475s sVar, C0511a<String, String> aVar, Object obj, C0469a aVar2) {
        C0483w wVar;
        ArrayList<String> arrayList;
        String a;
        C0425f fVar = aVar2.f1590a;
        View q = fVar.mo1627q();
        if (aVar.isEmpty() || obj == null || q == null) {
            aVar.clear();
            return null;
        }
        C0511a<String, View> aVar3 = new C0511a<>();
        sVar.mo1867a((Map<String, View>) aVar3, q);
        C0421d dVar = aVar2.f1592c;
        if (aVar2.f1591b) {
            wVar = fVar.mo1554V();
            arrayList = dVar.f1357r;
        } else {
            wVar = fVar.mo1553U();
            arrayList = dVar.f1358s;
        }
        if (arrayList != null) {
            aVar3.mo1966a(arrayList);
            aVar3.mo1966a(aVar.values());
        }
        if (wVar != null) {
            wVar.mo1878a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    String a2 = m2089a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0594r.m2612m(view)) && (a = m2089a(aVar, str)) != null) {
                    aVar.put(a, C0594r.m2612m(view));
                }
            }
        } else {
            m2099a(aVar, aVar3);
        }
        return aVar3;
    }

    /* renamed from: a */
    private static String m2089a(C0511a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo2096c(i))) {
                return aVar.mo2095b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m2084a(C0511a<String, View> aVar, C0469a aVar2, Object obj, boolean z) {
        String str;
        C0421d dVar = aVar2.f1592c;
        if (obj == null || aVar == null || dVar.f1357r == null || dVar.f1357r.isEmpty()) {
            return null;
        }
        if (z) {
            str = dVar.f1357r.get(0);
        } else {
            str = dVar.f1358s.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: a */
    private static void m2098a(C0475s sVar, Object obj, Object obj2, C0511a<String, View> aVar, boolean z, C0421d dVar) {
        String str;
        if (dVar.f1357r != null && !dVar.f1357r.isEmpty()) {
            if (z) {
                str = dVar.f1358s.get(0);
            } else {
                str = dVar.f1357r.get(0);
            }
            View view = aVar.get(str);
            sVar.mo655a(obj, view);
            if (obj2 != null) {
                sVar.mo655a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m2099a(C0511a<String, String> aVar, C0511a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo2096c(size))) {
                aVar.mo2100d(size);
            }
        }
    }

    /* renamed from: a */
    static void m2093a(C0425f fVar, C0425f fVar2, boolean z, C0511a<String, View> aVar, boolean z2) {
        C0483w wVar;
        int i;
        if (z) {
            wVar = fVar2.mo1553U();
        } else {
            wVar = fVar.mo1553U();
        }
        if (wVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo2095b(i2));
                arrayList.add(aVar.mo2096c(i2));
            }
            if (z2) {
                wVar.mo1877a(arrayList2, arrayList, (List<View>) null);
            } else {
                wVar.mo1879b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m2090a(C0475s sVar, Object obj, C0425f fVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View q = fVar.mo1627q();
        if (q != null) {
            sVar.mo1866a(arrayList2, q);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        sVar.mo658a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m2100a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m2088a(C0475s sVar, Object obj, Object obj2, Object obj3, C0425f fVar, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fVar == null) {
            z2 = true;
        } else {
            z2 = z ? fVar.mo1537E() : fVar.mo1536D();
        }
        if (z2) {
            return sVar.mo652a(obj2, obj, obj3);
        }
        return sVar.mo662b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m2092a(C0421d dVar, SparseArray<C0469a> sparseArray, boolean z) {
        int size = dVar.f1341b.size();
        for (int i = 0; i < size; i++) {
            m2091a(dVar, dVar.f1341b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: b */
    public static void m2106b(C0421d dVar, SparseArray<C0469a> sparseArray, boolean z) {
        if (dVar.f1340a.f1497n.mo1641a()) {
            for (int size = dVar.f1341b.size() - 1; size >= 0; size--) {
                m2091a(dVar, dVar.f1341b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static void m2091a(C0421d dVar, C0421d.C0422a aVar, SparseArray<C0469a> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        C0469a aVar2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C0421d dVar2 = dVar;
        C0421d.C0422a aVar3 = aVar;
        SparseArray<C0469a> sparseArray2 = sparseArray;
        boolean z10 = z;
        C0425f fVar = aVar3.f1362b;
        if (fVar != null && (i = fVar.f1428z) != 0) {
            int i2 = z10 ? f1559a[aVar3.f1361a] : aVar3.f1361a;
            boolean z11 = false;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                    case 6:
                        if (z2) {
                            z7 = !fVar.f1414l && fVar.f1390J != null && fVar.f1390J.getVisibility() == 0 && fVar.f1397Q >= 0.0f;
                        } else {
                            z7 = fVar.f1414l && !fVar.f1382B;
                        }
                        z3 = z7;
                        z5 = false;
                        z4 = true;
                        break;
                    case 4:
                        if (z2) {
                            z8 = fVar.f1396P && fVar.f1414l && fVar.f1382B;
                        } else {
                            z8 = fVar.f1414l && !fVar.f1382B;
                        }
                        z3 = z8;
                        z5 = false;
                        z4 = true;
                        break;
                    case 5:
                        if (z2) {
                            z9 = fVar.f1396P && !fVar.f1382B && fVar.f1414l;
                        } else {
                            z9 = fVar.f1382B;
                        }
                        z11 = z9;
                        z5 = true;
                        z4 = false;
                        z3 = false;
                        break;
                    case 7:
                        break;
                    default:
                        z5 = false;
                        z4 = false;
                        z3 = false;
                        break;
                }
            }
            if (z2) {
                z6 = fVar.f1395O;
            } else {
                z6 = !fVar.f1414l && !fVar.f1382B;
            }
            z11 = z6;
            z5 = true;
            z4 = false;
            z3 = false;
            C0469a aVar4 = sparseArray2.get(i);
            if (z11) {
                C0469a a = m2079a(aVar4, sparseArray2, i);
                a.f1590a = fVar;
                a.f1591b = z10;
                a.f1592c = dVar2;
                aVar2 = a;
            } else {
                aVar2 = aVar4;
            }
            if (!z2 && z5) {
                if (aVar2 != null && aVar2.f1593d == fVar) {
                    aVar2.f1593d = null;
                }
                C0442l lVar = dVar2.f1340a;
                if (fVar.f1404b < 1 && lVar.f1495l >= 1 && !dVar2.f1359t) {
                    lVar.mo1779f(fVar);
                    lVar.mo1745a(fVar, 1, 0, 0, false);
                }
            }
            if (z3 && (aVar2 == null || aVar2.f1593d == null)) {
                aVar2 = m2079a(aVar2, sparseArray2, i);
                aVar2.f1593d = fVar;
                aVar2.f1594e = z10;
                aVar2.f1595f = dVar2;
            }
            if (!z2 && z4 && aVar2 != null && aVar2.f1590a == fVar) {
                aVar2.f1590a = null;
            }
        }
    }

    /* renamed from: a */
    private static C0469a m2079a(C0469a aVar, SparseArray<C0469a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0469a aVar2 = new C0469a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: android.support.v4.app.q$a */
    static class C0469a {

        /* renamed from: a */
        public C0425f f1590a;

        /* renamed from: b */
        public boolean f1591b;

        /* renamed from: c */
        public C0421d f1592c;

        /* renamed from: d */
        public C0425f f1593d;

        /* renamed from: e */
        public boolean f1594e;

        /* renamed from: f */
        public C0421d f1595f;

        C0469a() {
        }
    }
}
