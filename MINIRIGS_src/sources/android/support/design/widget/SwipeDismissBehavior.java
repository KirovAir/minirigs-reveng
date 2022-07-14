package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.p026v4.p036h.C0594r;
import android.support.p026v4.widget.C0634p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0346b<V> {

    /* renamed from: a */
    C0634p f1152a;

    /* renamed from: b */
    C0358a f1153b;

    /* renamed from: c */
    int f1154c = 2;

    /* renamed from: d */
    float f1155d = 0.5f;

    /* renamed from: e */
    float f1156e = 0.0f;

    /* renamed from: f */
    float f1157f = 0.5f;

    /* renamed from: g */
    private boolean f1158g;

    /* renamed from: h */
    private float f1159h = 0.0f;

    /* renamed from: i */
    private boolean f1160i;

    /* renamed from: j */
    private final C0634p.C0637a f1161j = new C0634p.C0637a() {

        /* renamed from: b */
        private int f1163b;

        /* renamed from: c */
        private int f1164c = -1;

        /* renamed from: a */
        public boolean mo1146a(View view, int i) {
            return this.f1164c == -1 && SwipeDismissBehavior.this.mo1119a(view);
        }

        /* renamed from: b */
        public void mo1347b(View view, int i) {
            this.f1164c = i;
            this.f1163b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        public void mo1143a(int i) {
            if (SwipeDismissBehavior.this.f1153b != null) {
                SwipeDismissBehavior.this.f1153b.mo1113a(i);
            }
        }

        /* renamed from: a */
        public void mo1144a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f1164c = -1;
            int width = view.getWidth();
            if (m1468a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f1163b;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f1163b;
                z = false;
            }
            if (SwipeDismissBehavior.this.f1152a.mo2458a(i, view.getTop())) {
                C0594r.m2587a(view, (Runnable) new C0359b(view, z));
            } else if (z && SwipeDismissBehavior.this.f1153b != null) {
                SwipeDismissBehavior.this.f1153b.mo1114a(view);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m1468a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003b
                int r7 = android.support.p026v4.p036h.C0594r.m2602f(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1154c
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1154c
                if (r4 != 0) goto L_0x0029
                if (r7 == 0) goto L_0x0025
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0028
                goto L_0x0027
            L_0x0025:
                if (r3 <= 0) goto L_0x0028
            L_0x0027:
                r1 = 1
            L_0x0028:
                return r1
            L_0x0029:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1154c
                if (r4 != r2) goto L_0x003a
                if (r7 == 0) goto L_0x0034
                if (r3 <= 0) goto L_0x0039
                goto L_0x0038
            L_0x0034:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0039
            L_0x0038:
                r1 = 1
            L_0x0039:
                return r1
            L_0x003a:
                return r1
            L_0x003b:
                int r8 = r7.getLeft()
                int r0 = r6.f1163b
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                android.support.design.widget.SwipeDismissBehavior r0 = android.support.design.widget.SwipeDismissBehavior.this
                float r0 = r0.f1155d
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x0058
                r1 = 1
            L_0x0058:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.C03571.m1468a(android.view.View, float):boolean");
        }

        /* renamed from: b */
        public int mo1346b(View view) {
            return view.getWidth();
        }

        /* renamed from: b */
        public int mo1147b(View view, int i, int i2) {
            int i3;
            int i4;
            boolean z = C0594r.m2602f(view) == 1;
            if (SwipeDismissBehavior.this.f1154c == 0) {
                if (z) {
                    i3 = this.f1163b - view.getWidth();
                    i4 = this.f1163b;
                } else {
                    i3 = this.f1163b;
                    i4 = view.getWidth() + i3;
                }
            } else if (SwipeDismissBehavior.this.f1154c != 1) {
                i3 = this.f1163b - view.getWidth();
                i4 = view.getWidth() + this.f1163b;
            } else if (z) {
                i3 = this.f1163b;
                i4 = view.getWidth() + i3;
            } else {
                i3 = this.f1163b - view.getWidth();
                i4 = this.f1163b;
            }
            return SwipeDismissBehavior.m1458a(i3, i, i4);
        }

        /* renamed from: a */
        public int mo1142a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo1145a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f1163b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1156e);
            float width2 = ((float) this.f1163b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1157f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m1457a(0.0f, 1.0f - SwipeDismissBehavior.m1460b(width, width2, f), 1.0f));
            }
        }
    };

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0358a {
        /* renamed from: a */
        void mo1113a(int i);

        /* renamed from: a */
        void mo1114a(View view);
    }

    /* renamed from: b */
    static float m1460b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo1119a(View view) {
        return true;
    }

    /* renamed from: a */
    public void mo1344a(C0358a aVar) {
        this.f1153b = aVar;
    }

    /* renamed from: a */
    public void mo1343a(int i) {
        this.f1154c = i;
    }

    /* renamed from: a */
    public void mo1342a(float f) {
        this.f1156e = m1457a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public void mo1345b(float f) {
        this.f1157f = m1457a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo1120b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1158g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f1158g = coordinatorLayout.mo1175a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f1158g;
                    break;
                case 1:
                    break;
            }
        }
        this.f1158g = false;
        if (!z) {
            return false;
        }
        m1459a((ViewGroup) coordinatorLayout);
        return this.f1152a.mo2459a(motionEvent);
    }

    /* renamed from: a */
    public boolean mo1011a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0634p pVar = this.f1152a;
        if (pVar == null) {
            return false;
        }
        pVar.mo2464b(motionEvent);
        return true;
    }

    /* renamed from: a */
    private void m1459a(ViewGroup viewGroup) {
        C0634p pVar;
        if (this.f1152a == null) {
            if (this.f1160i) {
                pVar = C0634p.m2820a(viewGroup, this.f1159h, this.f1161j);
            } else {
                pVar = C0634p.m2821a(viewGroup, this.f1161j);
            }
            this.f1152a = pVar;
        }
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class C0359b implements Runnable {

        /* renamed from: b */
        private final View f1166b;

        /* renamed from: c */
        private final boolean f1167c;

        C0359b(View view, boolean z) {
            this.f1166b = view;
            this.f1167c = z;
        }

        public void run() {
            if (SwipeDismissBehavior.this.f1152a != null && SwipeDismissBehavior.this.f1152a.mo2461a(true)) {
                C0594r.m2587a(this.f1166b, (Runnable) this);
            } else if (this.f1167c && SwipeDismissBehavior.this.f1153b != null) {
                SwipeDismissBehavior.this.f1153b.mo1114a(this.f1166b);
            }
        }
    }

    /* renamed from: a */
    static float m1457a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m1458a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
