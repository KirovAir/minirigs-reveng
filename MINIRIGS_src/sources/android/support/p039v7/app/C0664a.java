package android.support.p039v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.C0726b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.a */
public abstract class C0664a {

    /* renamed from: android.support.v7.app.a$b */
    public interface C0666b {
        /* renamed from: a */
        void mo2537a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0667c {
        /* renamed from: a */
        public abstract Drawable mo2538a();

        /* renamed from: b */
        public abstract CharSequence mo2539b();

        /* renamed from: c */
        public abstract View mo2540c();

        /* renamed from: d */
        public abstract void mo2541d();

        /* renamed from: e */
        public abstract CharSequence mo2542e();
    }

    /* renamed from: a */
    public abstract int mo2519a();

    /* renamed from: a */
    public C0726b mo2520a(C0726b.C0727a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2522a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo2523a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo2524a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo2525a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2526a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo2527b() {
        return null;
    }

    /* renamed from: c */
    public void mo2529c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo2530c() {
        return false;
    }

    /* renamed from: d */
    public void mo2531d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo2532d() {
        return false;
    }

    /* renamed from: e */
    public void mo2533e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo2534e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo2535f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2536g() {
    }

    /* renamed from: b */
    public void mo2528b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo2521a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: android.support.v7.app.a$a */
    public static class C0665a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2099a;

        public C0665a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2099a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639a.C0649j.ActionBarLayout);
            this.f2099a = obtainStyledAttributes.getInt(C0639a.C0649j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0665a(int i, int i2) {
            super(i, i2);
            this.f2099a = 0;
            this.f2099a = 8388627;
        }

        public C0665a(C0665a aVar) {
            super(aVar);
            this.f2099a = 0;
            this.f2099a = aVar.f2099a;
        }

        public C0665a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2099a = 0;
        }
    }
}
