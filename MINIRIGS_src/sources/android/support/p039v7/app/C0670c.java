package android.support.p039v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p026v4.app.C0414a;
import android.support.p026v4.app.C0432g;
import android.support.p026v4.app.C0481u;
import android.support.p026v4.app.C0486z;
import android.support.p039v7.view.C0726b;
import android.support.p039v7.widget.C0977bs;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.c */
public class C0670c extends C0432g implements C0486z.C0487a, C0671d {

    /* renamed from: k */
    private C0672e f2103k;

    /* renamed from: l */
    private int f2104l = 0;

    /* renamed from: m */
    private Resources f2105m;

    /* renamed from: a */
    public C0726b mo2554a(C0726b.C0727a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2556a(C0726b bVar) {
    }

    /* renamed from: b */
    public void mo2560b(C0486z zVar) {
    }

    /* renamed from: b */
    public void mo2561b(C0726b bVar) {
    }

    @Deprecated
    /* renamed from: i */
    public void mo2568i() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0672e j = mo2570j();
        j.mo2599h();
        j.mo2584a(bundle);
        if (j.mo2600i() && this.f2104l != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2104l, false);
            } else {
                setTheme(this.f2104l);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2104l = i;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo2570j().mo2590b(bundle);
    }

    /* renamed from: g */
    public C0664a mo2564g() {
        return mo2570j().mo2581a();
    }

    public MenuInflater getMenuInflater() {
        return mo2570j().mo2588b();
    }

    public void setContentView(int i) {
        mo2570j().mo2589b(i);
    }

    public void setContentView(View view) {
        mo2570j().mo2585a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2570j().mo2586a(view, layoutParams);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2570j().mo2591b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo2570j().mo2583a(configuration);
        if (this.f2105m != null) {
            this.f2105m.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2570j().mo2596e();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo2570j().mo2592c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2570j().mo2595d();
    }

    public <T extends View> T findViewById(int i) {
        return mo2570j().mo2582a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0664a g = mo2564g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.mo2519a() & 4) == 0) {
            return false;
        }
        return mo2567h();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo2570j().mo2598g();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo2570j().mo2587a(charSequence);
    }

    /* renamed from: c */
    public void mo1649c() {
        mo2570j().mo2597f();
    }

    public void invalidateOptionsMenu() {
        mo2570j().mo2597f();
    }

    /* renamed from: a */
    public void mo2555a(C0486z zVar) {
        zVar.mo1883a((Activity) this);
    }

    /* renamed from: h */
    public boolean mo2567h() {
        Intent a = mo1889a();
        if (a == null) {
            return false;
        }
        if (mo2557a(a)) {
            C0486z a2 = C0486z.m2170a((Context) this);
            mo2555a(a2);
            mo2560b(a2);
            a2.mo1886a();
            try {
                C0414a.m1721a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo2559b(a);
            return true;
        }
    }

    /* renamed from: a */
    public Intent mo1889a() {
        return C0481u.m2157a(this);
    }

    /* renamed from: a */
    public boolean mo2557a(Intent intent) {
        return C0481u.m2159a((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo2559b(Intent intent) {
        C0481u.m2162b((Activity) this, intent);
    }

    public void onContentChanged() {
        mo2568i();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2570j().mo2593c(bundle);
    }

    /* renamed from: j */
    public C0672e mo2570j() {
        if (this.f2103k == null) {
            this.f2103k = C0672e.m2947a((Activity) this, (C0671d) this);
        }
        return this.f2103k;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0664a g = mo2564g();
        if (keyCode != 82 || g == null || !g.mo2526a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Resources getResources() {
        if (this.f2105m == null && C0977bs.m5172a()) {
            this.f2105m = new C0977bs(this, super.getResources());
        }
        Resources resources = this.f2105m;
        return resources == null ? super.getResources() : resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2930a(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.app.C0670c.m2930a(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m2930a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        C0664a g = mo2564g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo2530c()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        C0664a g = mo2564g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo2532d()) {
            super.closeOptionsMenu();
        }
    }
}
