package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.v */
public class C1024v extends RatingBar {

    /* renamed from: a */
    private final C1022t f3735a;

    public C1024v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.ratingBarStyle);
    }

    public C1024v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3735a = new C1022t(this);
        this.f3735a.mo4988a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f3735a.mo4987a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
