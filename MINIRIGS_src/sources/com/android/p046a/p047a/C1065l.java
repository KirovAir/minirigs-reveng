package com.android.p046a.p047a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.p046a.C1078e;
import com.android.p046a.C1086k;
import com.android.p046a.C1088m;
import com.android.p046a.C1089n;
import com.android.p046a.C1095p;
import com.android.p046a.C1099r;
import com.android.p046a.C1103v;

/* renamed from: com.android.a.a.l */
public class C1065l extends C1089n<Bitmap> {

    /* renamed from: g */
    private static final Object f3843g = new Object();

    /* renamed from: a */
    private final Object f3844a = new Object();

    /* renamed from: b */
    private C1095p.C1097b<Bitmap> f3845b;

    /* renamed from: c */
    private final Bitmap.Config f3846c;

    /* renamed from: d */
    private final int f3847d;

    /* renamed from: e */
    private final int f3848e;

    /* renamed from: f */
    private final ImageView.ScaleType f3849f;

    public C1065l(String str, C1095p.C1097b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C1095p.C1096a aVar) {
        super(0, str, aVar);
        mo5185a((C1099r) new C1078e(1000, 2, 2.0f));
        this.f3845b = bVar;
        this.f3846c = config;
        this.f3847d = i;
        this.f3848e = i2;
        this.f3849f = scaleType;
    }

    /* renamed from: s */
    public C1089n.C1092b mo5143s() {
        return C1089n.C1092b.LOW;
    }

    /* renamed from: a */
    private static int m5564a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = (double) i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1095p<Bitmap> mo5139a(C1086k kVar) {
        C1095p<Bitmap> b;
        synchronized (f3843g) {
            try {
                b = m5565b(kVar);
            } catch (OutOfMemoryError e) {
                C1103v.m5679c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f3900b.length), mo5194c());
                return C1095p.m5664a(new C1088m((Throwable) e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    /* renamed from: b */
    private C1095p<Bitmap> m5565b(C1086k kVar) {
        Bitmap bitmap;
        byte[] bArr = kVar.f3900b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f3847d == 0 && this.f3848e == 0) {
            options.inPreferredConfig = this.f3846c;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = m5564a(this.f3847d, this.f3848e, i, i2, this.f3849f);
            int a2 = m5564a(this.f3848e, this.f3847d, i2, i, this.f3849f);
            options.inJustDecodeBounds = false;
            options.inSampleSize = m5563a(i, i2, a, a2);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > a || bitmap.getHeight() > a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a, a2, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        if (bitmap == null) {
            return C1095p.m5664a(new C1088m(kVar));
        }
        return C1095p.m5665a(bitmap, C1051g.m5508a(kVar));
    }

    /* renamed from: f */
    public void mo5142f() {
        super.mo5142f();
        synchronized (this.f3844a) {
            this.f3845b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5141b(Bitmap bitmap) {
        C1095p.C1097b<Bitmap> bVar;
        synchronized (this.f3844a) {
            bVar = this.f3845b;
        }
        if (bVar != null) {
            bVar.mo5128a(bitmap);
        }
    }

    /* renamed from: a */
    static int m5563a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }
}
