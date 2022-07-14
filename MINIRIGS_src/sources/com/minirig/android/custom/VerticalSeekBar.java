package com.minirig.android.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p039v7.widget.C1025w;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class VerticalSeekBar extends C1025w {

    /* renamed from: a */
    private SeekBar.OnSeekBarChangeListener f4625a;

    /* renamed from: b */
    private int f4626b = 0;

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate((float) (-getHeight()), 0.0f);
        super.onDraw(canvas);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f4625a = onSeekBarChangeListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f4625a.onStartTrackingTouch(this);
                setPressed(true);
                setSelected(true);
                break;
            case 1:
                this.f4625a.onStopTrackingTouch(this);
                setPressed(false);
                setSelected(false);
                break;
            case 2:
                super.onTouchEvent(motionEvent);
                int max = getMax() - ((int) ((((float) getMax()) * motionEvent.getY()) / ((float) getHeight())));
                if (max < 0) {
                    max = 0;
                }
                if (max > getMax()) {
                    max = getMax();
                }
                setProgress(max);
                if (max != this.f4626b) {
                    this.f4626b = max;
                    this.f4625a.onProgressChanged(this, max, true);
                }
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                setPressed(true);
                setSelected(true);
                break;
            case 3:
                super.onTouchEvent(motionEvent);
                setPressed(false);
                setSelected(false);
                break;
        }
        return true;
    }

    public synchronized void setProgressAndThumb(int i) {
        setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        if (i != this.f4626b) {
            this.f4626b = i;
            this.f4625a.onProgressChanged(this, i, true);
        }
    }

    public synchronized void setMaximum(int i) {
        setMax(i);
    }

    public synchronized int getMaximum() {
        return getMax();
    }
}
