package com.android.p046a.p047a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.p046a.C1102u;
import com.android.p046a.p047a.C1056k;

/* renamed from: com.android.a.a.m */
public class C1066m extends ImageView {

    /* renamed from: a */
    private String f3850a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f3851b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f3852c;

    /* renamed from: d */
    private C1056k f3853d;

    /* renamed from: e */
    private C1056k.C1063c f3854e;

    public C1066m(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1066m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1066m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo5144a(String str, C1056k kVar) {
        this.f3850a = str;
        this.f3853d = kVar;
        mo5145a(false);
    }

    public void setDefaultImageResId(int i) {
        this.f3851b = i;
    }

    public void setErrorImageResId(int i) {
        this.f3852c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5145a(final boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            z2 = getLayoutParams().height == -2;
        } else {
            z3 = false;
            z2 = false;
        }
        if (!z3 || !z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.f3850a)) {
                C1056k.C1063c cVar = this.f3854e;
                if (cVar != null) {
                    cVar.mo5136a();
                    this.f3854e = null;
                }
                m5572a();
                return;
            }
            C1056k.C1063c cVar2 = this.f3854e;
            if (!(cVar2 == null || cVar2.mo5138c() == null)) {
                if (!this.f3854e.mo5138c().equals(this.f3850a)) {
                    this.f3854e.mo5136a();
                    m5572a();
                } else {
                    return;
                }
            }
            if (z3) {
                width = 0;
            }
            this.f3854e = this.f3853d.mo5121a(this.f3850a, (C1056k.C1064d) new C1056k.C1064d() {
                /* renamed from: a */
                public void mo5126a(C1102u uVar) {
                    if (C1066m.this.f3852c != 0) {
                        C1066m mVar = C1066m.this;
                        mVar.setImageResource(mVar.f3852c);
                    }
                }

                /* renamed from: a */
                public void mo5125a(final C1056k.C1063c cVar, boolean z) {
                    if (z && z) {
                        C1066m.this.post(new Runnable() {
                            public void run() {
                                C10671.this.mo5125a(cVar, false);
                            }
                        });
                    } else if (cVar.mo5137b() != null) {
                        C1066m.this.setImageBitmap(cVar.mo5137b());
                    } else if (C1066m.this.f3851b != 0) {
                        C1066m mVar = C1066m.this;
                        mVar.setImageResource(mVar.f3851b);
                    }
                }
            }, width, z2 ? 0 : height, scaleType);
        }
    }

    /* renamed from: a */
    private void m5572a() {
        int i = this.f3851b;
        if (i != 0) {
            setImageResource(i);
        } else {
            setImageBitmap((Bitmap) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo5145a(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1056k.C1063c cVar = this.f3854e;
        if (cVar != null) {
            cVar.mo5136a();
            setImageBitmap((Bitmap) null);
            this.f3854e = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
