package android.support.p026v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.j */
public final class C0627j {
    /* renamed from: a */
    public static void m2791a(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
