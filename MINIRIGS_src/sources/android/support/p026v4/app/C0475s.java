package android.support.p026v4.app;

import android.graphics.Rect;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.p036h.C0599t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.s */
public abstract class C0475s {
    /* renamed from: a */
    public abstract Object mo652a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo653a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo654a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo655a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo656a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo657a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo658a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo659a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo660a(Object obj);

    /* renamed from: b */
    public abstract Object mo661b(Object obj);

    /* renamed from: b */
    public abstract Object mo662b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo663b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo664b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo665b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo666c(Object obj);

    /* renamed from: c */
    public abstract void mo667c(Object obj, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1862a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo1861a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0594r.m2612m(view));
            C0594r.m2589a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1863a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m = C0594r.m2612m(view2);
            arrayList4.add(m);
            if (m != null) {
                C0594r.m2589a(view2, (String) null);
                String str = map.get(m);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0594r.m2589a(arrayList2.get(i2), m);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0482v.m2163a(view, new Runnable() {
            public void run() {
                for (int i = 0; i < size; i++) {
                    C0594r.m2589a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0594r.m2589a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1866a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0599t.m2639a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo1866a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1867a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m = C0594r.m2612m(view);
            if (m != null) {
                map.put(m, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo1867a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1864a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0482v.m2163a(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String m = C0594r.m2612m(view);
                    if (m != null) {
                        C0594r.m2589a(view, C0475s.m2125a((Map<String, String>) map, m));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1865a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0482v.m2163a(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0594r.m2589a(view, (String) map.get(C0594r.m2612m(view)));
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m2126a(List<View> list, View view) {
        int size = list.size();
        if (!m2128a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2128a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2128a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m2127a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m2125a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }
}
