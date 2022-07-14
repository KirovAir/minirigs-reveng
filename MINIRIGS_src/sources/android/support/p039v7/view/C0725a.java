package android.support.p039v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0725a {

    /* renamed from: a */
    private Context f2343a;

    /* renamed from: a */
    public static C0725a m3257a(Context context) {
        return new C0725a(context);
    }

    private C0725a(Context context) {
        this.f2343a = context;
    }

    /* renamed from: a */
    public int mo2834a() {
        Configuration configuration = this.f2343a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public boolean mo2835b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2343a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo2836c() {
        return this.f2343a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo2837d() {
        return this.f2343a.getResources().getBoolean(C0639a.C0641b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo2838e() {
        TypedArray obtainStyledAttributes = this.f2343a.obtainStyledAttributes((AttributeSet) null, C0639a.C0649j.ActionBar, C0639a.C0640a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0639a.C0649j.ActionBar_height, 0);
        Resources resources = this.f2343a.getResources();
        if (!mo2837d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0639a.C0643d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo2839f() {
        return this.f2343a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo2840g() {
        return this.f2343a.getResources().getDimensionPixelSize(C0639a.C0643d.abc_action_bar_stacked_tab_max_width);
    }
}
