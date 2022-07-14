package android.support.p039v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p026v4.p036h.C0593q;
import android.support.p026v4.widget.C0633o;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.q */
public class C1019q extends ImageView implements C0593q, C0633o {

    /* renamed from: a */
    private final C1004g f3723a;

    /* renamed from: b */
    private final C1018p f3724b;

    public C1019q(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1019q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1019q(Context context, AttributeSet attributeSet, int i) {
        super(C0965bk.m5088a(context), attributeSet, i);
        this.f3723a = new C1004g(this);
        this.f3723a.mo4901a(attributeSet, i);
        this.f3724b = new C1018p(this);
        this.f3724b.mo4965a(attributeSet, i);
    }

    public void setImageResource(int i) {
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4962a(i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4969d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4969d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4969d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            gVar.mo4897a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            gVar.mo4900a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            gVar.mo4898a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            return gVar.mo4896a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            gVar.mo4899a(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            return gVar.mo4902b();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4963a(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            return pVar.mo4967b();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4964a(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            return pVar.mo4968c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1004g gVar = this.f3723a;
        if (gVar != null) {
            gVar.mo4904c();
        }
        C1018p pVar = this.f3724b;
        if (pVar != null) {
            pVar.mo4969d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f3724b.mo4966a() && super.hasOverlappingRendering();
    }
}
