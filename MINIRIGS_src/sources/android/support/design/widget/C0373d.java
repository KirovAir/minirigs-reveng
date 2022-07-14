package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.design.p022f.C0288a;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.d */
class C0373d extends C0363c {

    /* renamed from: x */
    private InsetDrawable f1234x;

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1387g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo1393m() {
        return false;
    }

    C0373d(C0390o oVar, C0379i iVar) {
        super(oVar, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1375b(ColorStateList colorStateList) {
        if (this.f1205h instanceof RippleDrawable) {
            ((RippleDrawable) this.f1205h).setColor(C0288a.m1038a(colorStateList));
        } else {
            super.mo1375b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1364a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f1213v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f1185p, m1535a(f, f3));
            stateListAnimator.addState(f1186q, m1535a(f, f2));
            stateListAnimator.addState(f1187r, m1535a(f, f2));
            stateListAnimator.addState(f1188s, m1535a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f1213v, "elevation", new float[]{f}).setDuration(0));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f1213v, View.TRANSLATION_Z, new float[]{this.f1213v.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f1213v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f1184a);
            stateListAnimator.addState(f1189t, animatorSet);
            stateListAnimator.addState(f1190u, m1535a(0.0f, 0.0f));
            this.f1213v.setStateListAnimator(stateListAnimator);
        }
        if (this.f1214w.mo1335b()) {
            mo1390j();
        }
    }

    /* renamed from: a */
    private Animator m1535a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1213v, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f1213v, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f1184a);
        return animatorSet;
    }

    /* renamed from: a */
    public float mo1362a() {
        return this.f1213v.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1389i() {
        mo1390j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1376b(Rect rect) {
        if (this.f1214w.mo1335b()) {
            this.f1234x = new InsetDrawable(this.f1205h, rect.left, rect.top, rect.right, rect.bottom);
            this.f1214w.mo1334a(this.f1234x);
            return;
        }
        this.f1214w.mo1334a(this.f1205h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1371a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f1213v.isEnabled()) {
            this.f1213v.setElevation(this.f1208k);
            if (this.f1213v.isPressed()) {
                this.f1213v.setTranslationZ(this.f1210m);
            } else if (this.f1213v.isFocused() || this.f1213v.isHovered()) {
                this.f1213v.setTranslationZ(this.f1209l);
            } else {
                this.f1213v.setTranslationZ(0.0f);
            }
        } else {
            this.f1213v.setElevation(0.0f);
            this.f1213v.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1368a(Rect rect) {
        if (this.f1214w.mo1335b()) {
            float a = this.f1214w.mo1332a();
            float a2 = mo1362a() + this.f1210m;
            int ceil = (int) Math.ceil((double) C0378h.m1575b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C0378h.m1572a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
