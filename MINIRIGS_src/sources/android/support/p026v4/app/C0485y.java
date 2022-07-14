package android.support.p026v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0065d;
import android.arch.lifecycle.C0073g;
import android.arch.lifecycle.C0074h;
import android.arch.lifecycle.C0087p;
import android.os.Bundle;
import android.support.p026v4.p035g.C0532l;
import android.support.p026v4.p036h.C0580e;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.app.y */
public class C0485y extends Activity implements C0073g, C0580e.C0581a {

    /* renamed from: a */
    private C0532l<Class<? extends Object>, Object> f1625a = new C0532l<>();

    /* renamed from: b */
    private C0074h f1626b = new C0074h(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0087p.m298a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1626b.mo193a(C0065d.C0067b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: d */
    public C0065d mo191d() {
        return this.f1626b;
    }

    /* renamed from: a */
    public boolean mo1880a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0580e.m2530a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0580e.m2530a(decorView, keyEvent)) {
            return C0580e.m2529a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
