package android.support.p039v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p026v4.p029b.p030a.C0489b;
import android.support.p026v4.p036h.C0576c;
import android.support.p039v7.view.C0728c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C0760k extends C0743c<C0489b> implements MenuItem {

    /* renamed from: c */
    private Method f2601c;

    C0760k(Context context, C0489b bVar) {
        super(context, bVar);
    }

    public int getItemId() {
        return ((C0489b) this.f2483b).getItemId();
    }

    public int getGroupId() {
        return ((C0489b) this.f2483b).getGroupId();
    }

    public int getOrder() {
        return ((C0489b) this.f2483b).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0489b) this.f2483b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0489b) this.f2483b).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((C0489b) this.f2483b).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0489b) this.f2483b).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((C0489b) this.f2483b).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0489b) this.f2483b).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0489b) this.f2483b).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((C0489b) this.f2483b).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((C0489b) this.f2483b).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((C0489b) this.f2483b).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0489b) this.f2483b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0489b) this.f2483b).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0489b) this.f2483b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0489b) this.f2483b).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((C0489b) this.f2483b).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((C0489b) this.f2483b).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0489b) this.f2483b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0489b) this.f2483b).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((C0489b) this.f2483b).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((C0489b) this.f2483b).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((C0489b) this.f2483b).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((C0489b) this.f2483b).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((C0489b) this.f2483b).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((C0489b) this.f2483b).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((C0489b) this.f2483b).setVisible(z);
    }

    public boolean isVisible() {
        return ((C0489b) this.f2483b).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((C0489b) this.f2483b).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((C0489b) this.f2483b).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((C0489b) this.f2483b).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return mo2994a(((C0489b) this.f2483b).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C0489b) this.f2483b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0764d(onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C0489b) this.f2483b).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((C0489b) this.f2483b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0489b) this.f2483b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0762b(view);
        }
        ((C0489b) this.f2483b).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0489b) this.f2483b).setActionView(i);
        View actionView = ((C0489b) this.f2483b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0489b) this.f2483b).setActionView((View) new C0762b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((C0489b) this.f2483b).getActionView();
        return actionView instanceof C0762b ? ((C0762b) actionView).mo3234c() : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0489b) this.f2483b).mo1890a((C0576c) actionProvider != null ? mo3178a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        C0576c a = ((C0489b) this.f2483b).mo1892a();
        if (a instanceof C0761a) {
            return ((C0761a) a).f2602a;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((C0489b) this.f2483b).expandActionView();
    }

    public boolean collapseActionView() {
        return ((C0489b) this.f2483b).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((C0489b) this.f2483b).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C0489b) this.f2483b).setOnActionExpandListener(onActionExpandListener != null ? new C0763c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0489b) this.f2483b).mo1891a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((C0489b) this.f2483b).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0489b) this.f2483b).mo1893b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((C0489b) this.f2483b).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0489b) this.f2483b).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((C0489b) this.f2483b).getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C0489b) this.f2483b).setIconTintMode(mode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C0489b) this.f2483b).getIconTintMode();
    }

    /* renamed from: a */
    public void mo3179a(boolean z) {
        try {
            if (this.f2601c == null) {
                this.f2601c = ((C0489b) this.f2483b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2601c.invoke(this.f2483b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0761a mo3178a(ActionProvider actionProvider) {
        return new C0761a(this.f2480a, actionProvider);
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C0764d extends C0744d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        C0764d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f2483b).onMenuItemClick(C0760k.this.mo2993a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C0763c extends C0744d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        C0763c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2483b).onMenuItemActionExpand(C0760k.this.mo2993a(menuItem));
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2483b).onMenuItemActionCollapse(C0760k.this.mo2993a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$a */
    class C0761a extends C0576c {

        /* renamed from: a */
        final ActionProvider f2602a;

        public C0761a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2602a = actionProvider;
        }

        /* renamed from: a */
        public View mo2257a() {
            return this.f2602a.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo2265d() {
            return this.f2602a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo2266e() {
            return this.f2602a.hasSubMenu();
        }

        /* renamed from: a */
        public void mo2261a(SubMenu subMenu) {
            this.f2602a.onPrepareSubMenu(C0760k.this.mo2994a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C0762b extends FrameLayout implements C0728c {

        /* renamed from: a */
        final CollapsibleActionView f2604a;

        C0762b(View view) {
            super(view.getContext());
            this.f2604a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo2844a() {
            this.f2604a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo2845b() {
            this.f2604a.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo3234c() {
            return (View) this.f2604a;
        }
    }
}
