package com.minirig.android.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class CustomListView extends ListView {

    /* renamed from: a */
    private C1262a f4624a;

    /* renamed from: com.minirig.android.custom.CustomListView$a */
    public interface C1262a {
        /* renamed from: a */
        void mo5437a();
    }

    public CustomListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1262a aVar;
        if (pointToPosition((int) (motionEvent.getX() * motionEvent.getXPrecision()), (int) (motionEvent.getY() * motionEvent.getYPrecision())) == -1 && motionEvent.getAction() == 0 && (aVar = this.f4624a) != null) {
            aVar.mo5437a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnNoItemClickListener(C1262a aVar) {
        this.f4624a = aVar;
    }
}
