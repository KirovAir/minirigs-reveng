package android.support.p039v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0948b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f3455a;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C0948b(ActionBarContainer actionBarContainer) {
        this.f3455a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f3455a.f2651d) {
            if (this.f3455a.f2648a != null) {
                this.f3455a.f2648a.draw(canvas);
            }
            if (this.f3455a.f2649b != null && this.f3455a.f2652e) {
                this.f3455a.f2649b.draw(canvas);
            }
        } else if (this.f3455a.f2650c != null) {
            this.f3455a.f2650c.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f3455a.f2651d) {
            if (this.f3455a.f2650c != null) {
                this.f3455a.f2650c.getOutline(outline);
            }
        } else if (this.f3455a.f2648a != null) {
            this.f3455a.f2648a.getOutline(outline);
        }
    }
}
