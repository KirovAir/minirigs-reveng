package android.support.p039v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p026v4.p027a.C0391a;
import android.support.p026v4.p029b.p030a.C0488a;
import android.support.p026v4.p036h.C0576c;
import android.support.p026v4.p036h.C0598s;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0754h implements C0488a {

    /* renamed from: d */
    private static final int[] f2538d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f2539A;

    /* renamed from: a */
    CharSequence f2540a;

    /* renamed from: b */
    Drawable f2541b;

    /* renamed from: c */
    View f2542c;

    /* renamed from: e */
    private final Context f2543e;

    /* renamed from: f */
    private final Resources f2544f;

    /* renamed from: g */
    private boolean f2545g;

    /* renamed from: h */
    private boolean f2546h;

    /* renamed from: i */
    private C0755a f2547i;

    /* renamed from: j */
    private ArrayList<C0758j> f2548j;

    /* renamed from: k */
    private ArrayList<C0758j> f2549k;

    /* renamed from: l */
    private boolean f2550l;

    /* renamed from: m */
    private ArrayList<C0758j> f2551m;

    /* renamed from: n */
    private ArrayList<C0758j> f2552n;

    /* renamed from: o */
    private boolean f2553o;

    /* renamed from: p */
    private int f2554p = 0;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f2555q;

    /* renamed from: r */
    private boolean f2556r = false;

    /* renamed from: s */
    private boolean f2557s = false;

    /* renamed from: t */
    private boolean f2558t = false;

    /* renamed from: u */
    private boolean f2559u = false;

    /* renamed from: v */
    private boolean f2560v = false;

    /* renamed from: w */
    private ArrayList<C0758j> f2561w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0770o>> f2562x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0758j f2563y;

    /* renamed from: z */
    private boolean f2564z = false;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0755a {
        /* renamed from: a */
        void mo2607a(C0754h hVar);

        /* renamed from: a */
        boolean mo2610a(C0754h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0756b {
        /* renamed from: a */
        boolean mo2924a(C0758j jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo3046a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: q */
    public C0754h mo3102q() {
        return this;
    }

    public C0754h(Context context) {
        this.f2543e = context;
        this.f2544f = context.getResources();
        this.f2548j = new ArrayList<>();
        this.f2549k = new ArrayList<>();
        this.f2550l = true;
        this.f2551m = new ArrayList<>();
        this.f2552n = new ArrayList<>();
        this.f2553o = true;
        m3437e(true);
    }

    /* renamed from: a */
    public C0754h mo3040a(int i) {
        this.f2554p = i;
        return this;
    }

    /* renamed from: a */
    public void mo3050a(C0770o oVar) {
        mo3051a(oVar, this.f2543e);
    }

    /* renamed from: a */
    public void mo3051a(C0770o oVar, Context context) {
        this.f2562x.add(new WeakReference(oVar));
        oVar.mo2980a(context, this);
        this.f2553o = true;
    }

    /* renamed from: b */
    public void mo3070b(C0770o oVar) {
        Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0770o oVar2 = (C0770o) next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f2562x.remove(next);
            }
        }
    }

    /* renamed from: d */
    private void m3436d(boolean z) {
        if (!this.f2562x.isEmpty()) {
            mo3089h();
            Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0770o oVar = (C0770o) next.get();
                if (oVar == null) {
                    this.f2562x.remove(next);
                } else {
                    oVar.mo2990b(z);
                }
            }
            mo3091i();
        }
    }

    /* renamed from: a */
    private boolean m3435a(C0780u uVar, C0770o oVar) {
        boolean z = false;
        if (this.f2562x.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo2987a(uVar);
        }
        Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0770o oVar2 = (C0770o) next.get();
            if (oVar2 == null) {
                this.f2562x.remove(next);
            } else if (!z) {
                z = oVar2.mo2987a(uVar);
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo3047a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0780u) item.getSubMenu()).mo3047a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3046a(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo3068b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3046a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0780u) item.getSubMenu()).mo3068b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: a */
    public void mo3048a(C0755a aVar) {
        this.f2547i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo3045a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m3438f(i3);
        C0758j a = m3432a(i, i2, i3, f, charSequence, this.f2554p);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2555q;
        if (contextMenuInfo != null) {
            a.mo3122a(contextMenuInfo);
        }
        ArrayList<C0758j> arrayList = this.f2548j;
        arrayList.add(m3431a(arrayList, f), a);
        mo3071b(true);
        return a;
    }

    /* renamed from: a */
    private C0758j m3432a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0758j(this, i, i2, i3, i4, charSequence, i5);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3045a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return mo3045a(0, 0, 0, this.f2544f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3045a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3045a(i, i2, i3, this.f2544f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f2544f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0758j jVar = (C0758j) mo3045a(i, i2, i3, charSequence);
        C0780u uVar = new C0780u(this.f2543e, this, jVar);
        jVar.mo3121a(uVar);
        return uVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f2544f.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f2564z = z;
    }

    /* renamed from: b */
    public boolean mo3072b() {
        return this.f2564z;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2543e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        m3434a(mo3067b(i), true);
    }

    public void removeGroup(int i) {
        int c = mo3073c(i);
        if (c >= 0) {
            int size = this.f2548j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f2548j.get(c).getGroupId() != i) {
                    mo3071b(true);
                } else {
                    m3434a(c, false);
                    i2 = i3;
                }
            }
            mo3071b(true);
        }
    }

    /* renamed from: a */
    private void m3434a(int i, boolean z) {
        if (i >= 0 && i < this.f2548j.size()) {
            this.f2548j.remove(i);
            if (z) {
                mo3071b(true);
            }
        }
    }

    public void clear() {
        C0758j jVar = this.f2563y;
        if (jVar != null) {
            mo3082d(jVar);
        }
        this.f2548j.clear();
        mo3071b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3052a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2548j.size();
        mo3089h();
        for (int i = 0; i < size; i++) {
            C0758j jVar = this.f2548j.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo3134g() && jVar.isCheckable()) {
                jVar.mo3125b(jVar == menuItem);
            }
        }
        mo3091i();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2548j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0758j jVar = this.f2548j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo3123a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2548j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0758j jVar = this.f2548j.get(i2);
            if (jVar.getGroupId() == i && jVar.mo3128c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo3071b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2548j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0758j jVar = this.f2548j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f2539A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2548j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0758j jVar = this.f2548j.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo3067b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2548j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int mo3073c(int i) {
        return mo3039a(i, 0);
    }

    /* renamed from: a */
    public int mo3039a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f2548j.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int size() {
        return this.f2548j.size();
    }

    public MenuItem getItem(int i) {
        return this.f2548j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo3044a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f2545g = z;
        mo3071b(false);
    }

    /* renamed from: f */
    private static int m3438f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f2538d;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3075c() {
        return this.f2545g;
    }

    /* renamed from: e */
    private void m3437e(boolean z) {
        boolean z2 = true;
        if (!z || this.f2544f.getConfiguration().keyboard == 1 || !C0598s.m2637c(ViewConfiguration.get(this.f2543e), this.f2543e)) {
            z2 = false;
        }
        this.f2546h = z2;
    }

    /* renamed from: d */
    public boolean mo3081d() {
        return this.f2546h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Resources mo3083e() {
        return this.f2544f;
    }

    /* renamed from: f */
    public Context mo3085f() {
        return this.f2543e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3055a(C0754h hVar, MenuItem menuItem) {
        C0755a aVar = this.f2547i;
        return aVar != null && aVar.mo2610a(hVar, menuItem);
    }

    /* renamed from: g */
    public void mo3087g() {
        C0755a aVar = this.f2547i;
        if (aVar != null) {
            aVar.mo2607a(this);
        }
    }

    /* renamed from: a */
    private static int m3431a(ArrayList<C0758j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo3127c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0758j a = mo3044a(i, keyEvent);
        boolean a2 = a != null ? mo3056a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo3054a(true);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3053a(List<C0758j> list, int i, KeyEvent keyEvent) {
        boolean c = mo3075c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2548j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0758j jVar = this.f2548j.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0754h) jVar.getSubMenu()).mo3053a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0758j mo3044a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0758j> arrayList = this.f2561w;
        arrayList.clear();
        mo3053a((List<C0758j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c2 = mo3075c();
        for (int i2 = 0; i2 < size; i2++) {
            C0758j jVar = arrayList.get(i2);
            if (c2) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo3056a(findItem(i), i2);
    }

    /* renamed from: a */
    public boolean mo3056a(MenuItem menuItem, int i) {
        return mo3057a(menuItem, (C0770o) null, i);
    }

    /* renamed from: a */
    public boolean mo3057a(MenuItem menuItem, C0770o oVar, int i) {
        C0758j jVar = (C0758j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b = jVar.mo3126b();
        C0576c a = jVar.mo1892a();
        boolean z = a != null && a.mo2266e();
        if (jVar.mo3158n()) {
            b |= jVar.expandActionView();
            if (b) {
                mo3054a(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo3054a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo3121a(new C0780u(mo3085f(), this, jVar));
            }
            C0780u uVar = (C0780u) jVar.getSubMenu();
            if (z) {
                a.mo2261a((SubMenu) uVar);
            }
            b |= m3435a(uVar, oVar);
            if (!b) {
                mo3054a(true);
            }
        } else if ((i & 1) == 0) {
            mo3054a(true);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo3054a(boolean z) {
        if (!this.f2560v) {
            this.f2560v = true;
            Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0770o oVar = (C0770o) next.get();
                if (oVar == null) {
                    this.f2562x.remove(next);
                } else {
                    oVar.mo2981a(this, z);
                }
            }
            this.f2560v = false;
        }
    }

    public void close() {
        mo3054a(true);
    }

    /* renamed from: b */
    public void mo3071b(boolean z) {
        if (!this.f2556r) {
            if (z) {
                this.f2550l = true;
                this.f2553o = true;
            }
            m3436d(z);
            return;
        }
        this.f2557s = true;
        if (z) {
            this.f2558t = true;
        }
    }

    /* renamed from: h */
    public void mo3089h() {
        if (!this.f2556r) {
            this.f2556r = true;
            this.f2557s = false;
            this.f2558t = false;
        }
    }

    /* renamed from: i */
    public void mo3091i() {
        this.f2556r = false;
        if (this.f2557s) {
            this.f2557s = false;
            mo3071b(this.f2558t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3049a(C0758j jVar) {
        this.f2550l = true;
        mo3071b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3069b(C0758j jVar) {
        this.f2553o = true;
        mo3071b(true);
    }

    /* renamed from: j */
    public ArrayList<C0758j> mo3093j() {
        if (!this.f2550l) {
            return this.f2549k;
        }
        this.f2549k.clear();
        int size = this.f2548j.size();
        for (int i = 0; i < size; i++) {
            C0758j jVar = this.f2548j.get(i);
            if (jVar.isVisible()) {
                this.f2549k.add(jVar);
            }
        }
        this.f2550l = false;
        this.f2553o = true;
        return this.f2549k;
    }

    /* renamed from: k */
    public void mo3094k() {
        ArrayList<C0758j> j = mo3093j();
        if (this.f2553o) {
            Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0770o oVar = (C0770o) next.get();
                if (oVar == null) {
                    this.f2562x.remove(next);
                } else {
                    z |= oVar.mo2991b();
                }
            }
            if (z) {
                this.f2551m.clear();
                this.f2552n.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C0758j jVar = j.get(i);
                    if (jVar.mo3154j()) {
                        this.f2551m.add(jVar);
                    } else {
                        this.f2552n.add(jVar);
                    }
                }
            } else {
                this.f2551m.clear();
                this.f2552n.clear();
                this.f2552n.addAll(mo3093j());
            }
            this.f2553o = false;
        }
    }

    /* renamed from: l */
    public ArrayList<C0758j> mo3095l() {
        mo3094k();
        return this.f2551m;
    }

    /* renamed from: m */
    public ArrayList<C0758j> mo3096m() {
        mo3094k();
        return this.f2552n;
    }

    public void clearHeader() {
        this.f2541b = null;
        this.f2540a = null;
        this.f2542c = null;
        mo3071b(false);
    }

    /* renamed from: a */
    private void m3433a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources e = mo3083e();
        if (view != null) {
            this.f2542c = view;
            this.f2540a = null;
            this.f2541b = null;
        } else {
            if (i > 0) {
                this.f2540a = e.getText(i);
            } else if (charSequence != null) {
                this.f2540a = charSequence;
            }
            if (i2 > 0) {
                this.f2541b = C0391a.m1620a(mo3085f(), i2);
            } else if (drawable != null) {
                this.f2541b = drawable;
            }
            this.f2542c = null;
        }
        mo3071b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0754h mo3043a(CharSequence charSequence) {
        m3433a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0754h mo3080d(int i) {
        m3433a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0754h mo3041a(Drawable drawable) {
        m3433a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0754h mo3084e(int i) {
        m3433a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0754h mo3042a(View view) {
        m3433a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: n */
    public CharSequence mo3097n() {
        return this.f2540a;
    }

    /* renamed from: o */
    public Drawable mo3098o() {
        return this.f2541b;
    }

    /* renamed from: p */
    public View mo3099p() {
        return this.f2542c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo3103r() {
        return this.f2559u;
    }

    /* renamed from: c */
    public boolean mo3076c(C0758j jVar) {
        boolean z = false;
        if (this.f2562x.isEmpty()) {
            return false;
        }
        mo3089h();
        Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0770o oVar = (C0770o) next.get();
            if (oVar == null) {
                this.f2562x.remove(next);
            } else {
                z = oVar.mo2986a(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo3091i();
        if (z) {
            this.f2563y = jVar;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo3082d(C0758j jVar) {
        boolean z = false;
        if (this.f2562x.isEmpty() || this.f2563y != jVar) {
            return false;
        }
        mo3089h();
        Iterator<WeakReference<C0770o>> it = this.f2562x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0770o oVar = (C0770o) next.get();
            if (oVar == null) {
                this.f2562x.remove(next);
            } else {
                z = oVar.mo2992b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo3091i();
        if (z) {
            this.f2563y = null;
        }
        return z;
    }

    /* renamed from: s */
    public C0758j mo3106s() {
        return this.f2563y;
    }

    /* renamed from: c */
    public void mo3074c(boolean z) {
        this.f2539A = z;
    }
}
