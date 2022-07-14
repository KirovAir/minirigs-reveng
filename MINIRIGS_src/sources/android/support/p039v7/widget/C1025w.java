package android.support.p039v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p039v7.p040a.C0639a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
public class C1025w extends SeekBar {

    /* renamed from: a */
    private final C1026x f3736a;

    public C1025w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0639a.C0640a.seekBarStyle);
    }

    public C1025w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3736a = new C1026x(this);
        this.f3736a.mo4988a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3736a.mo4998a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3736a.mo5001c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3736a.mo5000b();
    }
}
