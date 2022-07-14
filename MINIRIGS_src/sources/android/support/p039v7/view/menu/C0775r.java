package android.support.p039v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p026v4.p029b.p030a.C0488a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
class C0775r extends C0743c<C0488a> implements Menu {
    C0775r(Context context, C0488a aVar) {
        super(context, aVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2993a(((C0488a) this.f2483b).add(charSequence));
    }

    public MenuItem add(int i) {
        return mo2993a(((C0488a) this.f2483b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2993a(((C0488a) this.f2483b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2993a(((C0488a) this.f2483b).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo2994a(((C0488a) this.f2483b).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return mo2994a(((C0488a) this.f2483b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo2994a(((C0488a) this.f2483b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo2994a(((C0488a) this.f2483b).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0488a) this.f2483b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo2993a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        mo2997b(i);
        ((C0488a) this.f2483b).removeItem(i);
    }

    public void removeGroup(int i) {
        mo2996a(i);
        ((C0488a) this.f2483b).removeGroup(i);
    }

    public void clear() {
        mo2995a();
        ((C0488a) this.f2483b).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0488a) this.f2483b).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0488a) this.f2483b).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0488a) this.f2483b).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((C0488a) this.f2483b).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return mo2993a(((C0488a) this.f2483b).findItem(i));
    }

    public int size() {
        return ((C0488a) this.f2483b).size();
    }

    public MenuItem getItem(int i) {
        return mo2993a(((C0488a) this.f2483b).getItem(i));
    }

    public void close() {
        ((C0488a) this.f2483b).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0488a) this.f2483b).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0488a) this.f2483b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0488a) this.f2483b).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((C0488a) this.f2483b).setQwertyMode(z);
    }
}
