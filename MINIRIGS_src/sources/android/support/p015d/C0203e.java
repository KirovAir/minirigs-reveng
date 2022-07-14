package android.support.p015d;

import android.graphics.Rect;
import android.support.p015d.C0216m;
import android.support.p026v4.app.C0475s;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.d.e */
public class C0203e extends C0475s {
    /* renamed from: a */
    public boolean mo660a(Object obj) {
        return obj instanceof C0216m;
    }

    /* renamed from: b */
    public Object mo661b(Object obj) {
        if (obj != null) {
            return ((C0216m) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo666c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0228q qVar = new C0228q();
        qVar.mo725a((C0216m) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo656a(Object obj, View view, ArrayList<View> arrayList) {
        C0228q qVar = (C0228q) obj;
        List<View> g = qVar.mo704g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m2126a(g, arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        mo658a((Object) qVar, arrayList);
    }

    /* renamed from: a */
    public void mo655a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            mo1862a(view, rect);
            ((C0216m) obj).mo683a((C0216m.C0221b) new C0216m.C0221b() {
            });
        }
    }

    /* renamed from: a */
    public void mo658a(Object obj, ArrayList<View> arrayList) {
        C0216m mVar = (C0216m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C0228q) {
                C0228q qVar = (C0228q) mVar;
                int q = qVar.mo734q();
                while (i < q) {
                    mo658a((Object) qVar.mo726b(i), arrayList);
                    i++;
                }
            } else if (!m723a(mVar) && m2127a((List) mVar.mo704g())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo693b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m723a(C0216m mVar) {
        return !m2127a((List) mVar.mo703f()) || !m2127a((List) mVar.mo705h()) || !m2127a((List) mVar.mo706i());
    }

    /* renamed from: a */
    public Object mo652a(Object obj, Object obj2, Object obj3) {
        C0228q qVar = new C0228q();
        if (obj != null) {
            qVar.mo725a((C0216m) obj);
        }
        if (obj2 != null) {
            qVar.mo725a((C0216m) obj2);
        }
        if (obj3 != null) {
            qVar.mo725a((C0216m) obj3);
        }
        return qVar;
    }

    /* renamed from: b */
    public void mo664b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((C0216m) obj).mo678a((C0216m.C0222c) new C0216m.C0222c() {
            /* renamed from: b */
            public void mo610b(C0216m mVar) {
            }

            /* renamed from: c */
            public void mo611c(C0216m mVar) {
            }

            /* renamed from: d */
            public void mo612d(C0216m mVar) {
            }

            /* renamed from: a */
            public void mo609a(C0216m mVar) {
                mVar.mo692b((C0216m.C0222c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: b */
    public Object mo662b(Object obj, Object obj2, Object obj3) {
        C0216m mVar = (C0216m) obj;
        C0216m mVar2 = (C0216m) obj2;
        C0216m mVar3 = (C0216m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C0228q().mo725a(mVar).mo725a(mVar2).mo724a(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C0228q qVar = new C0228q();
        if (mVar != null) {
            qVar.mo725a(mVar);
        }
        qVar.mo725a(mVar3);
        return qVar;
    }

    /* renamed from: a */
    public void mo653a(ViewGroup viewGroup, Object obj) {
        C0224o.m820a(viewGroup, (C0216m) obj);
    }

    /* renamed from: a */
    public void mo657a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((C0216m) obj).mo678a((C0216m.C0222c) new C0216m.C0222c() {
            /* renamed from: a */
            public void mo609a(C0216m mVar) {
            }

            /* renamed from: b */
            public void mo610b(C0216m mVar) {
            }

            /* renamed from: c */
            public void mo611c(C0216m mVar) {
            }

            /* renamed from: d */
            public void mo612d(C0216m mVar) {
                Object obj = obj5;
                if (obj != null) {
                    C0203e.this.mo665b(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    C0203e.this.mo665b(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    C0203e.this.mo665b(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo659a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0228q qVar = (C0228q) obj;
        if (qVar != null) {
            qVar.mo704g().clear();
            qVar.mo704g().addAll(arrayList2);
            mo665b((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: b */
    public void mo665b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C0216m mVar = (C0216m) obj;
        int i2 = 0;
        if (mVar instanceof C0228q) {
            C0228q qVar = (C0228q) mVar;
            int q = qVar.mo734q();
            while (i2 < q) {
                mo665b((Object) qVar.mo726b(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m723a(mVar)) {
            List<View> g = mVar.mo704g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo693b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo696c(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo663b(Object obj, View view) {
        if (obj != null) {
            ((C0216m) obj).mo693b(view);
        }
    }

    /* renamed from: c */
    public void mo667c(Object obj, View view) {
        if (obj != null) {
            ((C0216m) obj).mo696c(view);
        }
    }

    /* renamed from: a */
    public void mo654a(Object obj, final Rect rect) {
        if (obj != null) {
            ((C0216m) obj).mo683a((C0216m.C0221b) new C0216m.C0221b() {
            });
        }
    }
}
