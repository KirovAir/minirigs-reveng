package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p039v7.view.menu.C0753g;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.av */
public class C0897av extends C0888at implements C0896au {

    /* renamed from: a */
    private static Method f3238a;

    /* renamed from: b */
    private C0896au f3239b;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f3238a = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0897av(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0868am mo4123a(Context context, boolean z) {
        C0898a aVar = new C0898a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo4160a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3212g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo4161b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3212g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: a */
    public void mo4159a(C0896au auVar) {
        this.f3239b = auVar;
    }

    /* renamed from: c */
    public void mo4162c(boolean z) {
        Method method = f3238a;
        if (method != null) {
            try {
                method.invoke(this.f3212g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: b */
    public void mo3017b(C0754h hVar, MenuItem menuItem) {
        C0896au auVar = this.f3239b;
        if (auVar != null) {
            auVar.mo3017b(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo3016a(C0754h hVar, MenuItem menuItem) {
        C0896au auVar = this.f3239b;
        if (auVar != null) {
            auVar.mo3016a(hVar, menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.av$a */
    public static class C0898a extends C0868am {

        /* renamed from: b */
        final int f3240b;

        /* renamed from: c */
        final int f3241c;

        /* renamed from: d */
        private C0896au f3242d;

        /* renamed from: e */
        private MenuItem f3243e;

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo4026a(int i, int i2, int i3, int i4, int i5) {
            return super.mo4026a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo4027a(MotionEvent motionEvent, int i) {
            return super.mo4027a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public C0898a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f3240b = 22;
                this.f3241c = 21;
                return;
            }
            this.f3240b = 21;
            this.f3241c = 22;
        }

        public void setHoverListener(C0896au auVar) {
            this.f3242d = auVar;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3240b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f3241c) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0753g) getAdapter()).mo3030a().mo3054a(false);
                return true;
            }
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0753g gVar;
            int pointToPosition;
            int i2;
            if (this.f3242d != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gVar = (C0753g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    gVar = (C0753g) adapter;
                }
                C0758j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    jVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.f3243e;
                if (menuItem != jVar) {
                    C0754h a = gVar.mo3030a();
                    if (menuItem != null) {
                        this.f3242d.mo3016a(a, menuItem);
                    }
                    this.f3243e = jVar;
                    if (jVar != null) {
                        this.f3242d.mo3017b(a, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
