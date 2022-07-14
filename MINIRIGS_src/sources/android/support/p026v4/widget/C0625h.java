package android.support.p026v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.h */
public class C0625h {
    /* renamed from: a */
    public static ColorStateList m2784a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C0633o) {
            return ((C0633o) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2785a(ImageView imageView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0633o) {
            ((C0633o) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2787b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C0633o) {
            return ((C0633o) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2786a(ImageView imageView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0633o) {
            ((C0633o) imageView).setSupportImageTintMode(mode);
        }
    }
}
