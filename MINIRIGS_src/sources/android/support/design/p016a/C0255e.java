package android.support.design.p016a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: android.support.design.a.e */
public class C0255e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f770a = new C0255e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f771b = new WeakHashMap<>();

    private C0255e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f771b.containsKey(drawable)) {
            return this.f771b.get(drawable);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f771b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
