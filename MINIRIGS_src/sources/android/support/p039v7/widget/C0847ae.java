package android.support.p039v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p039v7.widget.C0951bc;

/* renamed from: android.support.v7.widget.ae */
class C0847ae implements C0850ag {

    /* renamed from: a */
    final RectF f3031a = new RectF();

    /* renamed from: g */
    public void mo3919g(C0849af afVar) {
    }

    C0847ae() {
    }

    /* renamed from: a */
    public void mo3907a() {
        C0951bc.f3468a = new C0951bc.C0952a() {
            /* renamed from: a */
            public void mo3908a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C0847ae.this.f3031a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    Paint paint2 = paint;
                    canvas.drawArc(C0847ae.this.f3031a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C0847ae.this.f3031a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C0847ae.this.f3031a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C0847ae.this.f3031a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint2);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint2);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    /* renamed from: f */
    public void mo3922f(C0849af afVar) {
        Rect rect = new Rect();
        m4162j(afVar).mo4700a(rect);
        afVar.mo3924a((int) Math.ceil((double) mo3912b(afVar)), (int) Math.ceil((double) mo3914c(afVar)));
        afVar.mo3925a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public void mo3920h(C0849af afVar) {
        m4162j(afVar).mo4701a(afVar.mo3927c());
        mo3922f(afVar);
    }

    /* renamed from: a */
    public void mo3911a(C0849af afVar, ColorStateList colorStateList) {
        m4162j(afVar).mo4699a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo3921i(C0849af afVar) {
        return m4162j(afVar).mo4709f();
    }

    /* renamed from: a */
    public void mo3910a(C0849af afVar, float f) {
        m4162j(afVar).mo4698a(f);
        mo3922f(afVar);
    }

    /* renamed from: d */
    public float mo3916d(C0849af afVar) {
        return m4162j(afVar).mo4697a();
    }

    /* renamed from: c */
    public void mo3915c(C0849af afVar, float f) {
        m4162j(afVar).mo4703b(f);
    }

    /* renamed from: e */
    public float mo3917e(C0849af afVar) {
        return m4162j(afVar).mo4702b();
    }

    /* renamed from: b */
    public void mo3913b(C0849af afVar, float f) {
        m4162j(afVar).mo4705c(f);
        mo3922f(afVar);
    }

    /* renamed from: a */
    public float mo3909a(C0849af afVar) {
        return m4162j(afVar).mo4704c();
    }

    /* renamed from: b */
    public float mo3912b(C0849af afVar) {
        return m4162j(afVar).mo4706d();
    }

    /* renamed from: c */
    public float mo3914c(C0849af afVar) {
        return m4162j(afVar).mo4708e();
    }

    /* renamed from: j */
    private C0951bc m4162j(C0849af afVar) {
        return (C0951bc) afVar.mo3923a();
    }
}
