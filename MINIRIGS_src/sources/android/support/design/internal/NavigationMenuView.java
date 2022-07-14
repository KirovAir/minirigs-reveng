package android.support.design.internal;

import android.content.Context;
import android.support.p039v7.view.menu.C0754h;
import android.support.p039v7.view.menu.C0772p;
import android.support.p039v7.widget.C0904ay;
import android.support.p039v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

public class NavigationMenuView extends C0904ay implements C0772p {
    /* renamed from: a */
    public void mo982a(C0754h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
