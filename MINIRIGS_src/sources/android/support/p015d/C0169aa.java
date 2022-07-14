package android.support.p015d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p036h.C0594r;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.d.aa */
class C0169aa implements C0172ac {

    /* renamed from: a */
    protected C0170a f578a;

    C0169aa(Context context, ViewGroup viewGroup, View view) {
        this.f578a = new C0170a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static ViewGroup m626c(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: d */
    static C0169aa m627d(View view) {
        ViewGroup c = m626c(view);
        if (c == null) {
            return null;
        }
        int childCount = c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c.getChildAt(i);
            if (childAt instanceof C0170a) {
                return ((C0170a) childAt).f583e;
            }
        }
        return new C0234u(c.getContext(), c, view);
    }

    /* renamed from: a */
    public void mo570a(Drawable drawable) {
        this.f578a.mo572a(drawable);
    }

    /* renamed from: b */
    public void mo571b(Drawable drawable) {
        this.f578a.mo575b(drawable);
    }

    /* renamed from: android.support.d.aa$a */
    static class C0170a extends ViewGroup {

        /* renamed from: a */
        static Method f579a;

        /* renamed from: b */
        ViewGroup f580b;

        /* renamed from: c */
        View f581c;

        /* renamed from: d */
        ArrayList<Drawable> f582d = null;

        /* renamed from: e */
        C0169aa f583e;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f579a = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C0170a(Context context, ViewGroup viewGroup, View view, C0169aa aaVar) {
            super(context);
            this.f580b = viewGroup;
            this.f581c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f583e = aaVar;
        }

        /* renamed from: a */
        public void mo572a(Drawable drawable) {
            if (this.f582d == null) {
                this.f582d = new ArrayList<>();
            }
            if (!this.f582d.contains(drawable)) {
                this.f582d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo575b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f582d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f582d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f582d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p015d.C0169aa.C0170a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: a */
        public void mo573a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f580b || viewGroup.getParent() == null || !C0594r.m2625z(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f580b.getLocationOnScreen(iArr2);
                    C0594r.m2603f(view, iArr[0] - iArr2[0]);
                    C0594r.m2601e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* renamed from: b */
        public void mo576b(View view) {
            super.removeView(view);
            if (mo574a()) {
                this.f580b.removeView(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f582d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo574a() {
            /*
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f582d
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p015d.C0169aa.C0170a.mo574a():boolean");
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f580b.getLocationOnScreen(iArr);
            this.f581c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f581c.getWidth(), this.f581c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f582d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f582d.get(i).draw(canvas);
            }
        }

        /* renamed from: a */
        private void m630a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f580b.getLocationOnScreen(iArr2);
            this.f581c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f580b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f580b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m630a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}
