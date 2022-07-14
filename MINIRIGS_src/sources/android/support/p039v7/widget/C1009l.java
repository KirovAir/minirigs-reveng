package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p011c.p012a.C0116c;
import android.support.p011c.p012a.C0126i;
import android.support.p026v4.graphics.C0534a;
import android.support.p026v4.graphics.drawable.C0540a;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.p035g.C0511a;
import android.support.p026v4.p035g.C0518f;
import android.support.p026v4.p035g.C0519g;
import android.support.p026v4.p035g.C0533m;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.p041b.p042a.C0705a;
import android.support.p039v7.p043c.p044a.C0707a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.l */
public final class C1009l {

    /* renamed from: a */
    private static final PorterDuff.Mode f3700a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C1009l f3701b;

    /* renamed from: c */
    private static final C1012c f3702c = new C1012c(6);

    /* renamed from: d */
    private static final int[] f3703d = {C0639a.C0644e.abc_textfield_search_default_mtrl_alpha, C0639a.C0644e.abc_textfield_default_mtrl_alpha, C0639a.C0644e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f3704e = {C0639a.C0644e.abc_ic_commit_search_api_mtrl_alpha, C0639a.C0644e.abc_seekbar_tick_mark_material, C0639a.C0644e.abc_ic_menu_share_mtrl_alpha, C0639a.C0644e.abc_ic_menu_copy_mtrl_am_alpha, C0639a.C0644e.abc_ic_menu_cut_mtrl_alpha, C0639a.C0644e.abc_ic_menu_selectall_mtrl_alpha, C0639a.C0644e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f3705f = {C0639a.C0644e.abc_textfield_activated_mtrl_alpha, C0639a.C0644e.abc_textfield_search_activated_mtrl_alpha, C0639a.C0644e.abc_cab_background_top_mtrl_alpha, C0639a.C0644e.abc_text_cursor_material, C0639a.C0644e.abc_text_select_handle_left_mtrl_dark, C0639a.C0644e.abc_text_select_handle_middle_mtrl_dark, C0639a.C0644e.abc_text_select_handle_right_mtrl_dark, C0639a.C0644e.abc_text_select_handle_left_mtrl_light, C0639a.C0644e.abc_text_select_handle_middle_mtrl_light, C0639a.C0644e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f3706g = {C0639a.C0644e.abc_popup_background_mtrl_mult, C0639a.C0644e.abc_cab_background_internal_bg, C0639a.C0644e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f3707h = {C0639a.C0644e.abc_tab_indicator_material, C0639a.C0644e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f3708i = {C0639a.C0644e.abc_btn_check_material, C0639a.C0644e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0533m<ColorStateList>> f3709j;

    /* renamed from: k */
    private C0511a<String, C1013d> f3710k;

    /* renamed from: l */
    private C0533m<String> f3711l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0518f<WeakReference<Drawable.ConstantState>>> f3712m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f3713n;

    /* renamed from: o */
    private boolean f3714o;

    /* renamed from: android.support.v7.widget.l$d */
    private interface C1013d {
        /* renamed from: a */
        Drawable mo4944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a */
    public static synchronized C1009l m5329a() {
        C1009l lVar;
        synchronized (C1009l.class) {
            if (f3701b == null) {
                f3701b = new C1009l();
                m5333a(f3701b);
            }
            lVar = f3701b;
        }
        return lVar;
    }

    /* renamed from: a */
    private static void m5333a(C1009l lVar) {
        if (Build.VERSION.SDK_INT < 24) {
            lVar.m5334a("vector", (C1013d) new C1014e());
            lVar.m5334a("animated-vector", (C1013d) new C1011b());
            lVar.m5334a("animated-selector", (C1013d) new C1010a());
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo4939a(Context context, int i) {
        return mo4940a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo4940a(Context context, int i, boolean z) {
        Drawable d;
        m5347f(context);
        d = m5343d(context, i);
        if (d == null) {
            d = m5341c(context, i);
        }
        if (d == null) {
            d = C0391a.m1620a(context, i);
        }
        if (d != null) {
            d = m5327a(context, i, z, d);
        }
        if (d != null) {
            C0867al.m4295a(d);
        }
        return d;
    }

    /* renamed from: a */
    public synchronized void mo4942a(Context context) {
        C0518f fVar = this.f3712m.get(context);
        if (fVar != null) {
            fVar.mo2013c();
        }
    }

    /* renamed from: a */
    private static long m5323a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: c */
    private Drawable m5341c(Context context, int i) {
        if (this.f3713n == null) {
            this.f3713n = new TypedValue();
        }
        TypedValue typedValue = this.f3713n;
        context.getResources().getValue(i, typedValue, true);
        long a = m5323a(typedValue);
        Drawable a2 = m5328a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0639a.C0644e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo4939a(context, C0639a.C0644e.abc_cab_background_internal_bg), mo4939a(context, C0639a.C0644e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m5336a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: a */
    private Drawable m5327a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo4943b(context, i);
        if (b != null) {
            if (C0867al.m4296b(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g = C0540a.m2390g(drawable);
            C0540a.m2379a(g, b);
            PorterDuff.Mode a = m5324a(i);
            if (a == null) {
                return g;
            }
            C0540a.m2382a(g, a);
            return g;
        } else if (i == C0639a.C0644e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m5331a(layerDrawable.findDrawableByLayerId(16908288), C0963bi.m5081a(context, C0639a.C0640a.colorControlNormal), f3700a);
            m5331a(layerDrawable.findDrawableByLayerId(16908303), C0963bi.m5081a(context, C0639a.C0640a.colorControlNormal), f3700a);
            m5331a(layerDrawable.findDrawableByLayerId(16908301), C0963bi.m5081a(context, C0639a.C0640a.colorControlActivated), f3700a);
            return drawable;
        } else if (i == C0639a.C0644e.abc_ratingbar_material || i == C0639a.C0644e.abc_ratingbar_indicator_material || i == C0639a.C0644e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m5331a(layerDrawable2.findDrawableByLayerId(16908288), C0963bi.m5085c(context, C0639a.C0640a.colorControlNormal), f3700a);
            m5331a(layerDrawable2.findDrawableByLayerId(16908303), C0963bi.m5081a(context, C0639a.C0640a.colorControlActivated), f3700a);
            m5331a(layerDrawable2.findDrawableByLayerId(16908301), C0963bi.m5081a(context, C0639a.C0640a.colorControlActivated), f3700a);
            return drawable;
        } else if (m5335a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[Catch:{ Exception -> 0x00a4 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5343d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.l$d> r0 = r9.f3710k
            r1 = 0
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b6
            android.support.v4.g.m<java.lang.String> r0 = r9.f3711l
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo2110a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.l$d> r2 = r9.f3710k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            android.support.v4.g.m r0 = new android.support.v4.g.m
            r0.<init>()
            r9.f3711l = r0
        L_0x002f:
            android.util.TypedValue r0 = r9.f3713n
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f3713n = r0
        L_0x003a:
            android.util.TypedValue r0 = r9.f3713n
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            long r3 = m5323a((android.util.TypedValue) r0)
            android.graphics.drawable.Drawable r5 = r9.m5328a((android.content.Context) r10, (long) r3)
            if (r5 == 0) goto L_0x004f
            return r5
        L_0x004f:
            java.lang.CharSequence r6 = r0.string
            if (r6 == 0) goto L_0x00ac
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ".xml"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x00ac
            android.content.res.XmlResourceParser r1 = r1.getXml(r11)     // Catch:{ Exception -> 0x00a4 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x0069:
            int r7 = r1.next()     // Catch:{ Exception -> 0x00a4 }
            r8 = 2
            if (r7 == r8) goto L_0x0073
            if (r7 == r2) goto L_0x0073
            goto L_0x0069
        L_0x0073:
            if (r7 != r8) goto L_0x009c
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x00a4 }
            android.support.v4.g.m<java.lang.String> r7 = r9.f3711l     // Catch:{ Exception -> 0x00a4 }
            r7.mo2117c(r11, r2)     // Catch:{ Exception -> 0x00a4 }
            android.support.v4.g.a<java.lang.String, android.support.v7.widget.l$d> r7 = r9.f3710k     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x00a4 }
            android.support.v7.widget.l$d r2 = (android.support.p039v7.widget.C1009l.C1013d) r2     // Catch:{ Exception -> 0x00a4 }
            if (r2 == 0) goto L_0x0091
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x00a4 }
            android.graphics.drawable.Drawable r1 = r2.mo4944a(r10, r1, r6, r7)     // Catch:{ Exception -> 0x00a4 }
            r5 = r1
        L_0x0091:
            if (r5 == 0) goto L_0x00ac
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a4 }
            r5.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a4 }
            r9.m5336a((android.content.Context) r10, (long) r3, (android.graphics.drawable.Drawable) r5)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ac
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = "No start tag found"
            r10.<init>(r0)     // Catch:{ Exception -> 0x00a4 }
            throw r10     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            r10 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r10)
        L_0x00ac:
            if (r5 != 0) goto L_0x00b5
            android.support.v4.g.m<java.lang.String> r10 = r9.f3711l
            java.lang.String r0 = "appcompat_skip_skip"
            r10.mo2117c(r11, r0)
        L_0x00b5:
            return r5
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C1009l.m5343d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m5328a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.g.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f3712m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.g.f r0 = (android.support.p026v4.p035g.C0518f) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo2004a((long) r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo2009b((long) r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p039v7.widget.C1009l.m5328a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private synchronized boolean m5336a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0518f fVar = this.f3712m.get(context);
        if (fVar == null) {
            fVar = new C0518f();
            this.f3712m.put(context, fVar);
        }
        fVar.mo2010b(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo4941a(Context context, C0977bs bsVar, int i) {
        Drawable d = m5343d(context, i);
        if (d == null) {
            d = bsVar.mo4815a(i);
        }
        if (d == null) {
            return null;
        }
        return m5327a(context, i, false, d);
    }

    /* renamed from: a */
    static boolean m5335a(Context context, int i, Drawable drawable) {
        boolean z;
        int i2;
        PorterDuff.Mode mode = f3700a;
        int i3 = 16842801;
        if (m5338a(f3703d, i)) {
            i3 = C0639a.C0640a.colorControlNormal;
            z = true;
            i2 = -1;
        } else if (m5338a(f3705f, i)) {
            i3 = C0639a.C0640a.colorControlActivated;
            z = true;
            i2 = -1;
        } else if (m5338a(f3706g, i)) {
            mode = PorterDuff.Mode.MULTIPLY;
            z = true;
            i2 = -1;
        } else if (i == C0639a.C0644e.abc_list_divider_mtrl_alpha) {
            i3 = 16842800;
            i2 = Math.round(40.8f);
            z = true;
        } else if (i == C0639a.C0644e.abc_dialog_material_background) {
            z = true;
            i2 = -1;
        } else {
            z = false;
            i2 = -1;
            i3 = 0;
        }
        if (!z) {
            return false;
        }
        if (C0867al.m4296b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m5325a(C0963bi.m5081a(context, i3), mode));
        if (i2 != -1) {
            drawable.setAlpha(i2);
        }
        return true;
    }

    /* renamed from: a */
    private void m5334a(String str, C1013d dVar) {
        if (this.f3710k == null) {
            this.f3710k = new C0511a<>();
        }
        this.f3710k.put(str, dVar);
    }

    /* renamed from: a */
    private static boolean m5338a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static PorterDuff.Mode m5324a(int i) {
        if (i == C0639a.C0644e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo4943b(Context context, int i) {
        ColorStateList e;
        e = m5345e(context, i);
        if (e == null) {
            if (i == C0639a.C0644e.abc_edit_text_material) {
                e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_edittext);
            } else if (i == C0639a.C0644e.abc_switch_track_mtrl_alpha) {
                e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_switch_track);
            } else if (i == C0639a.C0644e.abc_switch_thumb_material) {
                e = m5344e(context);
            } else if (i == C0639a.C0644e.abc_btn_default_mtrl_shape) {
                e = m5339b(context);
            } else if (i == C0639a.C0644e.abc_btn_borderless_material) {
                e = m5340c(context);
            } else if (i == C0639a.C0644e.abc_btn_colored_material) {
                e = m5342d(context);
            } else {
                if (i != C0639a.C0644e.abc_spinner_mtrl_am_alpha) {
                    if (i != C0639a.C0644e.abc_spinner_textfield_background_material) {
                        if (m5338a(f3704e, i)) {
                            e = C0963bi.m5084b(context, C0639a.C0640a.colorControlNormal);
                        } else if (m5338a(f3707h, i)) {
                            e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_default);
                        } else if (m5338a(f3708i, i)) {
                            e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_btn_checkable);
                        } else if (i == C0639a.C0644e.abc_seekbar_thumb_material) {
                            e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_seek_thumb);
                        }
                    }
                }
                e = C0705a.m3165a(context, C0639a.C0642c.abc_tint_spinner);
            }
            if (e != null) {
                m5330a(context, i, e);
            }
        }
        return e;
    }

    /* renamed from: e */
    private ColorStateList m5345e(Context context, int i) {
        C0533m mVar;
        WeakHashMap<Context, C0533m<ColorStateList>> weakHashMap = this.f3709j;
        if (weakHashMap == null || (mVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) mVar.mo2110a(i);
    }

    /* renamed from: a */
    private void m5330a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3709j == null) {
            this.f3709j = new WeakHashMap<>();
        }
        C0533m mVar = this.f3709j.get(context);
        if (mVar == null) {
            mVar = new C0533m();
            this.f3709j.put(context, mVar);
        }
        mVar.mo2117c(i, colorStateList);
    }

    /* renamed from: b */
    private ColorStateList m5339b(Context context) {
        return m5346f(context, C0963bi.m5081a(context, C0639a.C0640a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m5340c(Context context) {
        return m5346f(context, 0);
    }

    /* renamed from: d */
    private ColorStateList m5342d(Context context) {
        return m5346f(context, C0963bi.m5081a(context, C0639a.C0640a.colorAccent));
    }

    /* renamed from: f */
    private ColorStateList m5346f(Context context, int i) {
        int a = C0963bi.m5081a(context, C0639a.C0640a.colorControlHighlight);
        int c = C0963bi.m5085c(context, C0639a.C0640a.colorButtonNormal);
        return new ColorStateList(new int[][]{C0963bi.f3535a, C0963bi.f3538d, C0963bi.f3536b, C0963bi.f3542h}, new int[]{c, C0534a.m2342a(a, i), C0534a.m2342a(a, i), i});
    }

    /* renamed from: e */
    private ColorStateList m5344e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C0963bi.m5084b(context, C0639a.C0640a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C0963bi.f3535a;
            iArr2[0] = C0963bi.m5085c(context, C0639a.C0640a.colorSwitchThumbNormal);
            iArr[1] = C0963bi.f3539e;
            iArr2[1] = C0963bi.m5081a(context, C0639a.C0640a.colorControlActivated);
            iArr[2] = C0963bi.f3542h;
            iArr2[2] = C0963bi.m5081a(context, C0639a.C0640a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0963bi.f3535a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C0963bi.f3539e;
            iArr2[1] = C0963bi.m5081a(context, C0639a.C0640a.colorControlActivated);
            iArr[2] = C0963bi.f3542h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: android.support.v7.widget.l$c */
    private static class C1012c extends C0519g<Integer, PorterDuffColorFilter> {
        public C1012c(int i) {
            super(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4945a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo2017a(Integer.valueOf(m5355b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4946a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo2018a(Integer.valueOf(m5355b(i, mode)), porterDuffColorFilter);
        }

        /* renamed from: b */
        private static int m5355b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: a */
    static void m5332a(Drawable drawable, C0966bl blVar, int[] iArr) {
        if (!C0867al.m4296b(drawable) || drawable.mutate() == drawable) {
            if (blVar.f3552d || blVar.f3551c) {
                drawable.setColorFilter(m5326a(blVar.f3552d ? blVar.f3549a : null, blVar.f3551c ? blVar.f3550b : f3700a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m5326a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m5325a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m5325a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C1009l.class) {
            a = f3702c.mo4945a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f3702c.mo4946a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m5331a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0867al.m4296b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3700a;
        }
        drawable.setColorFilter(m5325a(i, mode));
    }

    /* renamed from: f */
    private void m5347f(Context context) {
        if (!this.f3714o) {
            this.f3714o = true;
            Drawable a = mo4939a(context, C0639a.C0644e.abc_vector_test);
            if (a == null || !m5337a(a)) {
                this.f3714o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    private static boolean m5337a(Drawable drawable) {
        return (drawable instanceof C0126i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: android.support.v7.widget.l$e */
    private static class C1014e implements C1013d {
        C1014e() {
        }

        /* renamed from: a */
        public Drawable mo4944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0126i.m374a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.l$b */
    private static class C1011b implements C1013d {
        C1011b() {
        }

        /* renamed from: a */
        public Drawable mo4944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0116c.m340a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.l$a */
    static class C1010a implements C1013d {
        C1010a() {
        }

        /* renamed from: a */
        public Drawable mo4944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0707a.m3172a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }
}
