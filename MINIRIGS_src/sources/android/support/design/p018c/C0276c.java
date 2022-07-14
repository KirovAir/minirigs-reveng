package android.support.design.p018c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.p018c.C0278d;
import android.support.design.widget.C0377g;
import android.view.View;

/* renamed from: android.support.design.c.c */
public class C0276c {

    /* renamed from: a */
    public static final int f849a;

    /* renamed from: b */
    private final C0277a f850b;

    /* renamed from: c */
    private final View f851c;

    /* renamed from: d */
    private final Path f852d;

    /* renamed from: e */
    private final Paint f853e;

    /* renamed from: f */
    private final Paint f854f;

    /* renamed from: g */
    private C0278d.C0283d f855g;

    /* renamed from: h */
    private Drawable f856h;

    /* renamed from: i */
    private boolean f857i;

    /* renamed from: j */
    private boolean f858j;

    /* renamed from: android.support.design.c.c$a */
    interface C0277a {
        /* renamed from: a */
        void mo890a(Canvas canvas);

        /* renamed from: c */
        boolean mo892c();
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f849a = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            f849a = 1;
        } else {
            f849a = 0;
        }
    }

    /* renamed from: a */
    public void mo904a() {
        if (f849a == 0) {
            this.f857i = true;
            this.f858j = false;
            this.f851c.buildDrawingCache();
            Bitmap drawingCache = this.f851c.getDrawingCache();
            if (!(drawingCache != null || this.f851c.getWidth() == 0 || this.f851c.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f851c.getWidth(), this.f851c.getHeight(), Bitmap.Config.ARGB_8888);
                this.f851c.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                this.f853e.setShader(new BitmapShader(drawingCache, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            }
            this.f857i = false;
            this.f858j = true;
        }
    }

    /* renamed from: b */
    public void mo909b() {
        if (f849a == 0) {
            this.f858j = false;
            this.f851c.destroyDrawingCache();
            this.f853e.setShader((Shader) null);
            this.f851c.invalidate();
        }
    }

    /* renamed from: a */
    public void mo908a(C0278d.C0283d dVar) {
        if (dVar == null) {
            this.f855g = null;
        } else {
            C0278d.C0283d dVar2 = this.f855g;
            if (dVar2 == null) {
                this.f855g = new C0278d.C0283d(dVar);
            } else {
                dVar2.mo925a(dVar);
            }
            if (C0377g.m1571b(dVar.f865c, m999b(dVar), 1.0E-4f)) {
                this.f855g.f865c = Float.MAX_VALUE;
            }
        }
        m1001g();
    }

    /* renamed from: c */
    public C0278d.C0283d mo910c() {
        C0278d.C0283d dVar = this.f855g;
        if (dVar == null) {
            return null;
        }
        C0278d.C0283d dVar2 = new C0278d.C0283d(dVar);
        if (dVar2.mo926a()) {
            dVar2.f865c = m999b(dVar2);
        }
        return dVar2;
    }

    /* renamed from: a */
    public void mo905a(int i) {
        this.f854f.setColor(i);
        this.f851c.invalidate();
    }

    /* renamed from: d */
    public int mo911d() {
        return this.f854f.getColor();
    }

    /* renamed from: e */
    public Drawable mo912e() {
        return this.f856h;
    }

    /* renamed from: a */
    public void mo907a(Drawable drawable) {
        this.f856h = drawable;
        this.f851c.invalidate();
    }

    /* renamed from: g */
    private void m1001g() {
        if (f849a == 1) {
            this.f852d.rewind();
            C0278d.C0283d dVar = this.f855g;
            if (dVar != null) {
                this.f852d.addCircle(dVar.f863a, this.f855g.f864b, this.f855g.f865c, Path.Direction.CW);
            }
        }
        this.f851c.invalidate();
    }

    /* renamed from: b */
    private float m999b(C0278d.C0283d dVar) {
        return C0377g.m1569a(dVar.f863a, dVar.f864b, 0.0f, 0.0f, (float) this.f851c.getWidth(), (float) this.f851c.getHeight());
    }

    /* renamed from: a */
    public void mo906a(Canvas canvas) {
        if (m1002h()) {
            switch (f849a) {
                case 0:
                    canvas.drawCircle(this.f855g.f863a, this.f855g.f864b, this.f855g.f865c, this.f853e);
                    if (m1003i()) {
                        canvas.drawCircle(this.f855g.f863a, this.f855g.f864b, this.f855g.f865c, this.f854f);
                        break;
                    }
                    break;
                case 1:
                    int save = canvas.save();
                    canvas.clipPath(this.f852d);
                    this.f850b.mo890a(canvas);
                    if (m1003i()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f851c.getWidth(), (float) this.f851c.getHeight(), this.f854f);
                    }
                    canvas.restoreToCount(save);
                    break;
                case 2:
                    this.f850b.mo890a(canvas);
                    if (m1003i()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f851c.getWidth(), (float) this.f851c.getHeight(), this.f854f);
                        break;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unsupported strategy " + f849a);
            }
        } else {
            this.f850b.mo890a(canvas);
            if (m1003i()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f851c.getWidth(), (float) this.f851c.getHeight(), this.f854f);
            }
        }
        m1000b(canvas);
    }

    /* renamed from: b */
    private void m1000b(Canvas canvas) {
        if (m1004j()) {
            Rect bounds = this.f856h.getBounds();
            float width = this.f855g.f863a - (((float) bounds.width()) / 2.0f);
            float height = this.f855g.f864b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f856h.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: f */
    public boolean mo913f() {
        return this.f850b.mo892c() && !m1002h();
    }

    /* renamed from: h */
    private boolean m1002h() {
        C0278d.C0283d dVar = this.f855g;
        boolean z = dVar == null || dVar.mo926a();
        if (f849a != 0) {
            return !z;
        }
        if (z || !this.f858j) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m1003i() {
        return !this.f857i && Color.alpha(this.f854f.getColor()) != 0;
    }

    /* renamed from: j */
    private boolean m1004j() {
        return (this.f857i || this.f856h == null || this.f855g == null) ? false : true;
    }
}
