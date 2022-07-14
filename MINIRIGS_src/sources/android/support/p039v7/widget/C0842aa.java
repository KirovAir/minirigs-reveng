package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.p039v7.p040a.C0639a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.aa */
class C0842aa {

    /* renamed from: a */
    private static final RectF f3010a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f3011b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f3012c = 0;

    /* renamed from: d */
    private boolean f3013d = false;

    /* renamed from: e */
    private float f3014e = -1.0f;

    /* renamed from: f */
    private float f3015f = -1.0f;

    /* renamed from: g */
    private float f3016g = -1.0f;

    /* renamed from: h */
    private int[] f3017h = new int[0];

    /* renamed from: i */
    private boolean f3018i = false;

    /* renamed from: j */
    private TextPaint f3019j;

    /* renamed from: k */
    private final TextView f3020k;

    /* renamed from: l */
    private final Context f3021l;

    C0842aa(TextView textView) {
        this.f3020k = textView;
        this.f3021l = this.f3020k.getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3877a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f3021l.obtainStyledAttributes(attributeSet, C0639a.C0649j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTextView_autoSizeTextType)) {
            this.f3012c = obtainStyledAttributes.getInt(C0639a.C0649j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0639a.C0649j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0639a.C0649j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0639a.C0649j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0639a.C0649j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0639a.C0649j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m4126a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m4132k()) {
            this.f3012c = 0;
        } else if (this.f3012c == 1) {
            if (!this.f3018i) {
                DisplayMetrics displayMetrics = this.f3021l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m4125a(dimension2, dimension3, dimension);
            }
            m4130i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3874a(int i) {
        if (m4132k()) {
            switch (i) {
                case 0:
                    m4131j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f3021l.getResources().getDisplayMetrics();
                    m4125a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m4130i()) {
                        mo3883f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3876a(int i, int i2, int i3, int i4) {
        if (m4132k()) {
            DisplayMetrics displayMetrics = this.f3021l.getResources().getDisplayMetrics();
            m4125a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m4130i()) {
                mo3883f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3878a(int[] iArr, int i) {
        if (m4132k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3021l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f3017h = m4128a(iArr2);
                if (!m4129h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f3018i = false;
            }
            if (m4130i()) {
                mo3883f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3873a() {
        return this.f3012c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3879b() {
        return Math.round(this.f3014e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3880c() {
        return Math.round(this.f3015f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3881d() {
        return Math.round(this.f3016g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo3882e() {
        return this.f3017h;
    }

    /* renamed from: a */
    private void m4126a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f3017h = m4128a(iArr);
            m4129h();
        }
    }

    /* renamed from: h */
    private boolean m4129h() {
        int length = this.f3017h.length;
        this.f3018i = length > 0;
        if (this.f3018i) {
            this.f3012c = 1;
            int[] iArr = this.f3017h;
            this.f3015f = (float) iArr[0];
            this.f3016g = (float) iArr[length - 1];
            this.f3014e = -1.0f;
        }
        return this.f3018i;
    }

    /* renamed from: a */
    private int[] m4128a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m4125a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f3012c = 1;
            this.f3015f = f;
            this.f3016g = f2;
            this.f3014e = f3;
            this.f3018i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: i */
    private boolean m4130i() {
        if (!m4132k() || this.f3012c != 1) {
            this.f3013d = false;
        } else {
            if (!this.f3018i || this.f3017h.length == 0) {
                float round = (float) Math.round(this.f3015f);
                int i = 1;
                while (Math.round(this.f3014e + round) <= Math.round(this.f3016g)) {
                    i++;
                    round += this.f3014e;
                }
                int[] iArr = new int[i];
                float f = this.f3015f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f3014e;
                }
                this.f3017h = m4128a(iArr);
            }
            this.f3013d = true;
        }
        return this.f3013d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3883f() {
        int i;
        if (mo3884g()) {
            if (this.f3013d) {
                if (this.f3020k.getMeasuredHeight() > 0 && this.f3020k.getMeasuredWidth() > 0) {
                    if (((Boolean) m4122a((Object) this.f3020k, "getHorizontallyScrolling", false)).booleanValue()) {
                        i = 1048576;
                    } else {
                        i = (this.f3020k.getMeasuredWidth() - this.f3020k.getTotalPaddingLeft()) - this.f3020k.getTotalPaddingRight();
                    }
                    int height = (this.f3020k.getHeight() - this.f3020k.getCompoundPaddingBottom()) - this.f3020k.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f3010a) {
                            f3010a.setEmpty();
                            f3010a.right = (float) i;
                            f3010a.bottom = (float) height;
                            float a = (float) m4119a(f3010a);
                            if (a != this.f3020k.getTextSize()) {
                                mo3875a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f3013d = true;
        }
    }

    /* renamed from: j */
    private void m4131j() {
        this.f3012c = 0;
        this.f3015f = -1.0f;
        this.f3016g = -1.0f;
        this.f3014e = -1.0f;
        this.f3017h = new int[0];
        this.f3013d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3875a(int i, float f) {
        Resources resources;
        Context context = this.f3021l;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m4124a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m4124a(float f) {
        if (f != this.f3020k.getPaint().getTextSize()) {
            this.f3020k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f3020k.isInLayout() : false;
            if (this.f3020k.getLayout() != null) {
                this.f3013d = false;
                try {
                    Method a = m4123a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f3020k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f3020k.requestLayout();
                } else {
                    this.f3020k.forceLayout();
                }
                this.f3020k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m4119a(RectF rectF) {
        int length = this.f3017h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m4127a(this.f3017h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f3017h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private boolean m4127a(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        CharSequence text = this.f3020k.getText();
        TransformationMethod transformationMethod = this.f3020k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f3020k)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f3020k.getMaxLines() : -1;
        TextPaint textPaint = this.f3019j;
        if (textPaint == null) {
            this.f3019j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f3019j.set(this.f3020k.getPaint());
        this.f3019j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m4122a((Object) this.f3020k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayout = m4121a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = m4120a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m4121a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m4122a((Object) this.f3020k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f3019j, i).setAlignment(alignment).setLineSpacing(this.f3020k.getLineSpacingExtra(), this.f3020k.getLineSpacingMultiplier()).setIncludePad(this.f3020k.getIncludeFontPadding()).setBreakStrategy(this.f3020k.getBreakStrategy()).setHyphenationFrequency(this.f3020k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private StaticLayout m4120a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            float lineSpacingMultiplier = this.f3020k.getLineSpacingMultiplier();
            f2 = lineSpacingMultiplier;
            f = this.f3020k.getLineSpacingExtra();
            z = this.f3020k.getIncludeFontPadding();
        } else {
            float floatValue = ((Float) m4122a((Object) this.f3020k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f2 = floatValue;
            f = ((Float) m4122a((Object) this.f3020k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m4122a((Object) this.f3020k, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f3019j, i, alignment, f2, f, z);
    }

    /* renamed from: a */
    private <T> T m4122a(Object obj, String str, T t) {
        try {
            return m4123a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m4123a(String str) {
        try {
            Method method = f3011b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f3011b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo3884g() {
        return m4132k() && this.f3012c != 0;
    }

    /* renamed from: k */
    private boolean m4132k() {
        return !(this.f3020k instanceof C1015m);
    }
}
