package android.support.p026v4.p034f;

import android.os.Build;
import android.support.p026v4.p035g.C0526i;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.f.a */
public class C0508a implements Spannable {

    /* renamed from: a */
    private static final Object f1677a = new Object();

    /* renamed from: b */
    private static Executor f1678b = null;

    /* renamed from: c */
    private final Spannable f1679c;

    /* renamed from: d */
    private final C0509a f1680d;

    /* renamed from: e */
    private final PrecomputedText f1681e;

    /* renamed from: android.support.v4.f.a$a */
    public static final class C0509a {

        /* renamed from: a */
        final PrecomputedText.Params f1682a;

        /* renamed from: b */
        private final TextPaint f1683b;

        /* renamed from: c */
        private final TextDirectionHeuristic f1684c;

        /* renamed from: d */
        private final int f1685d;

        /* renamed from: e */
        private final int f1686e;

        /* renamed from: android.support.v4.f.a$a$a */
        public static class C0510a {

            /* renamed from: a */
            private final TextPaint f1687a;

            /* renamed from: b */
            private TextDirectionHeuristic f1688b;

            /* renamed from: c */
            private int f1689c;

            /* renamed from: d */
            private int f1690d;

            public C0510a(TextPaint textPaint) {
                this.f1687a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1689c = 1;
                    this.f1690d = 1;
                } else {
                    this.f1690d = 0;
                    this.f1689c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f1688b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f1688b = null;
                }
            }

            /* renamed from: a */
            public C0510a mo1962a(int i) {
                this.f1689c = i;
                return this;
            }

            /* renamed from: b */
            public C0510a mo1965b(int i) {
                this.f1690d = i;
                return this;
            }

            /* renamed from: a */
            public C0510a mo1963a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1688b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0509a mo1964a() {
                return new C0509a(this.f1687a, this.f1688b, this.f1689c, this.f1690d);
            }
        }

        C0509a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f1682a = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f1682a = null;
            }
            this.f1683b = textPaint;
            this.f1684c = textDirectionHeuristic;
            this.f1685d = i;
            this.f1686e = i2;
        }

        public C0509a(PrecomputedText.Params params) {
            this.f1683b = params.getTextPaint();
            this.f1684c = params.getTextDirection();
            this.f1685d = params.getBreakStrategy();
            this.f1686e = params.getHyphenationFrequency();
            this.f1682a = params;
        }

        /* renamed from: a */
        public TextPaint mo1955a() {
            return this.f1683b;
        }

        /* renamed from: b */
        public TextDirectionHeuristic mo1956b() {
            return this.f1684c;
        }

        /* renamed from: c */
        public int mo1957c() {
            return this.f1685d;
        }

        /* renamed from: d */
        public int mo1958d() {
            return this.f1686e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0509a)) {
                return false;
            }
            C0509a aVar = (C0509a) obj;
            PrecomputedText.Params params = this.f1682a;
            if (params != null) {
                return params.equals(aVar.f1682a);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f1685d != aVar.mo1957c() || this.f1686e != aVar.mo1958d())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f1684c != aVar.mo1956b()) || this.f1683b.getTextSize() != aVar.mo1955a().getTextSize() || this.f1683b.getTextScaleX() != aVar.mo1955a().getTextScaleX() || this.f1683b.getTextSkewX() != aVar.mo1955a().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f1683b.getLetterSpacing() != aVar.mo1955a().getLetterSpacing() || !TextUtils.equals(this.f1683b.getFontFeatureSettings(), aVar.mo1955a().getFontFeatureSettings()))) || this.f1683b.getFlags() != aVar.mo1955a().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f1683b.getTextLocales().equals(aVar.mo1955a().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.f1683b.getTextLocale().equals(aVar.mo1955a().getTextLocale())) {
                return false;
            }
            if (this.f1683b.getTypeface() == null) {
                if (aVar.mo1955a().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f1683b.getTypeface().equals(aVar.mo1955a().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0526i.m2305a(Float.valueOf(this.f1683b.getTextSize()), Float.valueOf(this.f1683b.getTextScaleX()), Float.valueOf(this.f1683b.getTextSkewX()), Float.valueOf(this.f1683b.getLetterSpacing()), Integer.valueOf(this.f1683b.getFlags()), this.f1683b.getTextLocales(), this.f1683b.getTypeface(), Boolean.valueOf(this.f1683b.isElegantTextHeight()), this.f1684c, Integer.valueOf(this.f1685d), Integer.valueOf(this.f1686e));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return C0526i.m2305a(Float.valueOf(this.f1683b.getTextSize()), Float.valueOf(this.f1683b.getTextScaleX()), Float.valueOf(this.f1683b.getTextSkewX()), Float.valueOf(this.f1683b.getLetterSpacing()), Integer.valueOf(this.f1683b.getFlags()), this.f1683b.getTextLocale(), this.f1683b.getTypeface(), Boolean.valueOf(this.f1683b.isElegantTextHeight()), this.f1684c, Integer.valueOf(this.f1685d), Integer.valueOf(this.f1686e));
            } else if (Build.VERSION.SDK_INT >= 18) {
                return C0526i.m2305a(Float.valueOf(this.f1683b.getTextSize()), Float.valueOf(this.f1683b.getTextScaleX()), Float.valueOf(this.f1683b.getTextSkewX()), Integer.valueOf(this.f1683b.getFlags()), this.f1683b.getTextLocale(), this.f1683b.getTypeface(), this.f1684c, Integer.valueOf(this.f1685d), Integer.valueOf(this.f1686e));
            } else if (Build.VERSION.SDK_INT >= 17) {
                return C0526i.m2305a(Float.valueOf(this.f1683b.getTextSize()), Float.valueOf(this.f1683b.getTextScaleX()), Float.valueOf(this.f1683b.getTextSkewX()), Integer.valueOf(this.f1683b.getFlags()), this.f1683b.getTextLocale(), this.f1683b.getTypeface(), this.f1684c, Integer.valueOf(this.f1685d), Integer.valueOf(this.f1686e));
            } else {
                return C0526i.m2305a(Float.valueOf(this.f1683b.getTextSize()), Float.valueOf(this.f1683b.getTextScaleX()), Float.valueOf(this.f1683b.getTextSkewX()), Integer.valueOf(this.f1683b.getFlags()), this.f1683b.getTypeface(), this.f1684c, Integer.valueOf(this.f1685d), Integer.valueOf(this.f1686e));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f1683b.getTextSize());
            sb.append(", textScaleX=" + this.f1683b.getTextScaleX());
            sb.append(", textSkewX=" + this.f1683b.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f1683b.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f1683b.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f1683b.getTextLocales());
            } else if (Build.VERSION.SDK_INT >= 17) {
                sb.append(", textLocale=" + this.f1683b.getTextLocale());
            }
            sb.append(", typeface=" + this.f1683b.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f1683b.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f1684c);
            sb.append(", breakStrategy=" + this.f1685d);
            sb.append(", hyphenationFrequency=" + this.f1686e);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public PrecomputedText mo1942a() {
        Spannable spannable = this.f1679c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    /* renamed from: b */
    public C0509a mo1943b() {
        return this.f1680d;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f1681e.setSpan(obj, i, i2, i3);
        } else {
            this.f1679c.setSpan(obj, i, i2, i3);
        }
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f1681e.removeSpan(obj);
        } else {
            this.f1679c.removeSpan(obj);
        }
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f1681e.getSpans(i, i2, cls);
        }
        return this.f1679c.getSpans(i, i2, cls);
    }

    public int getSpanStart(Object obj) {
        return this.f1679c.getSpanStart(obj);
    }

    public int getSpanEnd(Object obj) {
        return this.f1679c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f1679c.getSpanFlags(obj);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1679c.nextSpanTransition(i, i2, cls);
    }

    public int length() {
        return this.f1679c.length();
    }

    public char charAt(int i) {
        return this.f1679c.charAt(i);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f1679c.subSequence(i, i2);
    }

    public String toString() {
        return this.f1679c.toString();
    }
}
