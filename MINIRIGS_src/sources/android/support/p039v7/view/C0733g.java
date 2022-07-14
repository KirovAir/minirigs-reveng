package android.support.p039v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p026v4.p029b.p030a.C0488a;
import android.support.p026v4.p036h.C0576c;
import android.support.p026v4.p036h.C0584h;
import android.support.p039v7.p040a.C0639a;
import android.support.p039v7.view.menu.C0758j;
import android.support.p039v7.view.menu.C0760k;
import android.support.p039v7.widget.C0867al;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public class C0733g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f2364a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f2365b = f2364a;

    /* renamed from: c */
    final Object[] f2366c;

    /* renamed from: d */
    final Object[] f2367d = this.f2366c;

    /* renamed from: e */
    Context f2368e;

    /* renamed from: f */
    private Object f2369f;

    public C0733g(Context context) {
        super(context);
        this.f2368e = context;
        this.f2366c = new Object[]{context};
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0488a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2368e.getResources().getLayout(i);
            m3315a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m3315a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0735b bVar = new C0735b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m3315a(xmlPullParser, attributeSet, bVar.mo2879c());
                                    break;
                                }
                            } else {
                                bVar.mo2878b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo2876a(attributeSet);
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.mo2880d()) {
                                if (bVar.f2379a != null && bVar.f2379a.mo2266e()) {
                                    bVar.mo2879c();
                                    break;
                                } else {
                                    bVar.mo2877b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo2875a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo2872a() {
        if (this.f2369f == null) {
            this.f2369f = m3314a(this.f2368e);
        }
        return this.f2369f;
    }

    /* renamed from: a */
    private Object m3314a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3314a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: android.support.v7.view.g$a */
    private static class C0734a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f2370a = {MenuItem.class};

        /* renamed from: b */
        private Object f2371b;

        /* renamed from: c */
        private Method f2372c;

        public C0734a(Object obj, String str) {
            this.f2371b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2372c = cls.getMethod(str, f2370a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2372c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2372c.invoke(this.f2371b, new Object[]{menuItem})).booleanValue();
                }
                this.f2372c.invoke(this.f2371b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0735b {

        /* renamed from: A */
        private String f2373A;

        /* renamed from: B */
        private String f2374B;

        /* renamed from: C */
        private CharSequence f2375C;

        /* renamed from: D */
        private CharSequence f2376D;

        /* renamed from: E */
        private ColorStateList f2377E = null;

        /* renamed from: F */
        private PorterDuff.Mode f2378F = null;

        /* renamed from: a */
        C0576c f2379a;

        /* renamed from: c */
        private Menu f2381c;

        /* renamed from: d */
        private int f2382d;

        /* renamed from: e */
        private int f2383e;

        /* renamed from: f */
        private int f2384f;

        /* renamed from: g */
        private int f2385g;

        /* renamed from: h */
        private boolean f2386h;

        /* renamed from: i */
        private boolean f2387i;

        /* renamed from: j */
        private boolean f2388j;

        /* renamed from: k */
        private int f2389k;

        /* renamed from: l */
        private int f2390l;

        /* renamed from: m */
        private CharSequence f2391m;

        /* renamed from: n */
        private CharSequence f2392n;

        /* renamed from: o */
        private int f2393o;

        /* renamed from: p */
        private char f2394p;

        /* renamed from: q */
        private int f2395q;

        /* renamed from: r */
        private char f2396r;

        /* renamed from: s */
        private int f2397s;

        /* renamed from: t */
        private int f2398t;

        /* renamed from: u */
        private boolean f2399u;

        /* renamed from: v */
        private boolean f2400v;

        /* renamed from: w */
        private boolean f2401w;

        /* renamed from: x */
        private int f2402x;

        /* renamed from: y */
        private int f2403y;

        /* renamed from: z */
        private String f2404z;

        public C0735b(Menu menu) {
            this.f2381c = menu;
            mo2875a();
        }

        /* renamed from: a */
        public void mo2875a() {
            this.f2382d = 0;
            this.f2383e = 0;
            this.f2384f = 0;
            this.f2385g = 0;
            this.f2386h = true;
            this.f2387i = true;
        }

        /* renamed from: a */
        public void mo2876a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0733g.this.f2368e.obtainStyledAttributes(attributeSet, C0639a.C0649j.MenuGroup);
            this.f2382d = obtainStyledAttributes.getResourceId(C0639a.C0649j.MenuGroup_android_id, 0);
            this.f2383e = obtainStyledAttributes.getInt(C0639a.C0649j.MenuGroup_android_menuCategory, 0);
            this.f2384f = obtainStyledAttributes.getInt(C0639a.C0649j.MenuGroup_android_orderInCategory, 0);
            this.f2385g = obtainStyledAttributes.getInt(C0639a.C0649j.MenuGroup_android_checkableBehavior, 0);
            this.f2386h = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuGroup_android_visible, true);
            this.f2387i = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo2878b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0733g.this.f2368e.obtainStyledAttributes(attributeSet, C0639a.C0649j.MenuItem);
            this.f2389k = obtainStyledAttributes.getResourceId(C0639a.C0649j.MenuItem_android_id, 0);
            this.f2390l = (obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_android_menuCategory, this.f2383e) & -65536) | (obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_android_orderInCategory, this.f2384f) & 65535);
            this.f2391m = obtainStyledAttributes.getText(C0639a.C0649j.MenuItem_android_title);
            this.f2392n = obtainStyledAttributes.getText(C0639a.C0649j.MenuItem_android_titleCondensed);
            this.f2393o = obtainStyledAttributes.getResourceId(C0639a.C0649j.MenuItem_android_icon, 0);
            this.f2394p = m3317a(obtainStyledAttributes.getString(C0639a.C0649j.MenuItem_android_alphabeticShortcut));
            this.f2395q = obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_alphabeticModifiers, 4096);
            this.f2396r = m3317a(obtainStyledAttributes.getString(C0639a.C0649j.MenuItem_android_numericShortcut));
            this.f2397s = obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.MenuItem_android_checkable)) {
                this.f2398t = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f2398t = this.f2385g;
            }
            this.f2399u = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuItem_android_checked, false);
            this.f2400v = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuItem_android_visible, this.f2386h);
            this.f2401w = obtainStyledAttributes.getBoolean(C0639a.C0649j.MenuItem_android_enabled, this.f2387i);
            this.f2402x = obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_showAsAction, -1);
            this.f2374B = obtainStyledAttributes.getString(C0639a.C0649j.MenuItem_android_onClick);
            this.f2403y = obtainStyledAttributes.getResourceId(C0639a.C0649j.MenuItem_actionLayout, 0);
            this.f2404z = obtainStyledAttributes.getString(C0639a.C0649j.MenuItem_actionViewClass);
            this.f2373A = obtainStyledAttributes.getString(C0639a.C0649j.MenuItem_actionProviderClass);
            boolean z = this.f2373A != null;
            if (z && this.f2403y == 0 && this.f2404z == null) {
                this.f2379a = (C0576c) m3318a(this.f2373A, C0733g.f2365b, C0733g.this.f2367d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2379a = null;
            }
            this.f2375C = obtainStyledAttributes.getText(C0639a.C0649j.MenuItem_contentDescription);
            this.f2376D = obtainStyledAttributes.getText(C0639a.C0649j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.MenuItem_iconTintMode)) {
                this.f2378F = C0867al.m4294a(obtainStyledAttributes.getInt(C0639a.C0649j.MenuItem_iconTintMode, -1), this.f2378F);
            } else {
                this.f2378F = null;
            }
            if (obtainStyledAttributes.hasValue(C0639a.C0649j.MenuItem_iconTint)) {
                this.f2377E = obtainStyledAttributes.getColorStateList(C0639a.C0649j.MenuItem_iconTint);
            } else {
                this.f2377E = null;
            }
            obtainStyledAttributes.recycle();
            this.f2388j = false;
        }

        /* renamed from: a */
        private char m3317a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m3319a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2399u).setVisible(this.f2400v).setEnabled(this.f2401w).setCheckable(this.f2398t >= 1).setTitleCondensed(this.f2392n).setIcon(this.f2393o);
            int i = this.f2402x;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f2374B != null) {
                if (!C0733g.this.f2368e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0734a(C0733g.this.mo2872a(), this.f2374B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0758j;
            if (z2) {
                C0758j jVar = (C0758j) menuItem;
            }
            if (this.f2398t >= 2) {
                if (z2) {
                    ((C0758j) menuItem).mo3123a(true);
                } else if (menuItem instanceof C0760k) {
                    ((C0760k) menuItem).mo3179a(true);
                }
            }
            String str = this.f2404z;
            if (str != null) {
                menuItem.setActionView((View) m3318a(str, C0733g.f2364a, C0733g.this.f2366c));
                z = true;
            }
            int i2 = this.f2403y;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0576c cVar = this.f2379a;
            if (cVar != null) {
                C0584h.m2536a(menuItem, cVar);
            }
            C0584h.m2540a(menuItem, this.f2375C);
            C0584h.m2542b(menuItem, this.f2376D);
            C0584h.m2541b(menuItem, this.f2394p, this.f2395q);
            C0584h.m2537a(menuItem, this.f2396r, this.f2397s);
            PorterDuff.Mode mode = this.f2378F;
            if (mode != null) {
                C0584h.m2539a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2377E;
            if (colorStateList != null) {
                C0584h.m2538a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public void mo2877b() {
            this.f2388j = true;
            m3319a(this.f2381c.add(this.f2382d, this.f2389k, this.f2390l, this.f2391m));
        }

        /* renamed from: c */
        public SubMenu mo2879c() {
            this.f2388j = true;
            SubMenu addSubMenu = this.f2381c.addSubMenu(this.f2382d, this.f2389k, this.f2390l, this.f2391m);
            m3319a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo2880d() {
            return this.f2388j;
        }

        /* renamed from: a */
        private <T> T m3318a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0733g.this.f2368e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }
}
