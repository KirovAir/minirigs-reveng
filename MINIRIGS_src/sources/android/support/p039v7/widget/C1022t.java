package android.support.p039v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p026v4.graphics.drawable.C0542c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.t */
class C1022t {

    /* renamed from: a */
    private static final int[] f3730a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f3731b;

    /* renamed from: c */
    private Bitmap f3732c;

    C1022t(ProgressBar progressBar) {
        this.f3731b = progressBar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4988a(AttributeSet attributeSet, int i) {
        C0968bn a = C0968bn.m5093a(this.f3731b.getContext(), attributeSet, f3730a, i, 0);
        Drawable b = a.mo4784b(0);
        if (b != null) {
            this.f3731b.setIndeterminateDrawable(mo4999a(b));
        }
        Drawable b2 = a.mo4784b(1);
        if (b2 != null) {
            this.f3731b.setProgressDrawable(m5374a(b2, false));
        }
        a.mo4781a();
    }

    /* renamed from: a */
    private Drawable m5374a(Drawable drawable, boolean z) {
        if (drawable instanceof C0542c) {
            C0542c cVar = (C0542c) drawable;
            Drawable a = cVar.mo2129a();
            if (a != null) {
                cVar.mo2130a(m5374a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m5374a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3732c == null) {
                this.f3732c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo5000b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo4999a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m5374a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    private Shape mo5000b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo4987a() {
        return this.f3732c;
    }
}
