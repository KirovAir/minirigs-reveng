package android.support.p039v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p026v4.p036h.C0580e;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0726b;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.g */
public class C0691g extends Dialog implements C0671d {

    /* renamed from: a */
    private C0672e f2193a;

    /* renamed from: b */
    private final C0580e.C0581a f2194b = new C0580e.C0581a() {
        /* renamed from: a */
        public boolean mo1880a(KeyEvent keyEvent) {
            return C0691g.this.mo2670a(keyEvent);
        }
    };

    /* renamed from: a */
    public C0726b mo2554a(C0726b.C0727a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2556a(C0726b bVar) {
    }

    /* renamed from: b */
    public void mo2561b(C0726b bVar) {
    }

    public C0691g(Context context, int i) {
        super(context, m3069a(context, i));
        mo2668a().mo2584a((Bundle) null);
        mo2668a().mo2600i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo2668a().mo2599h();
        super.onCreate(bundle);
        mo2668a().mo2584a(bundle);
    }

    public void setContentView(int i) {
        mo2668a().mo2589b(i);
    }

    public void setContentView(View view) {
        mo2668a().mo2585a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2668a().mo2586a(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return mo2668a().mo2582a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo2668a().mo2587a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo2668a().mo2587a((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo2668a().mo2591b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2668a().mo2595d();
    }

    /* renamed from: a */
    public boolean mo2669a(int i) {
        return mo2668a().mo2594c(i);
    }

    public void invalidateOptionsMenu() {
        mo2668a().mo2597f();
    }

    /* renamed from: a */
    public C0672e mo2668a() {
        if (this.f2193a == null) {
            this.f2193a = C0672e.m2948a((Dialog) this, (C0671d) this);
        }
        return this.f2193a;
    }

    /* renamed from: a */
    private static int m3069a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0639a.C0640a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2670a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0580e.m2529a(this.f2194b, getWindow().getDecorView(), this, keyEvent);
    }
}
