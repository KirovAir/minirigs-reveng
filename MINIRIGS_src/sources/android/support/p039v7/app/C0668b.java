package android.support.p039v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p039v7.app.AlertController;
import android.support.p039v7.p040a.C0639a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.b */
public class C0668b extends C0691g implements DialogInterface {

    /* renamed from: a */
    final AlertController f2100a = new AlertController(getContext(), this, getWindow());

    protected C0668b(Context context, int i) {
        super(context, m2922a(context, i));
    }

    /* renamed from: a */
    static int m2922a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0639a.C0640a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2100a.mo2480a(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2100a.mo2475a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2100a.mo2481a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2100a.mo2485b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: android.support.v7.app.b$a */
    public static class C0669a {

        /* renamed from: a */
        private final AlertController.C0655a f2101a;

        /* renamed from: b */
        private final int f2102b;

        public C0669a(Context context) {
            this(context, C0668b.m2922a(context, 0));
        }

        public C0669a(Context context, int i) {
            this.f2101a = new AlertController.C0655a(new ContextThemeWrapper(context, C0668b.m2922a(context, i)));
            this.f2102b = i;
        }

        /* renamed from: a */
        public Context mo2547a() {
            return this.f2101a.f2056a;
        }

        /* renamed from: a */
        public C0669a mo2552a(CharSequence charSequence) {
            this.f2101a.f2061f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0669a mo2550a(View view) {
            this.f2101a.f2062g = view;
            return this;
        }

        /* renamed from: a */
        public C0669a mo2549a(Drawable drawable) {
            this.f2101a.f2059d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0669a mo2548a(DialogInterface.OnKeyListener onKeyListener) {
            this.f2101a.f2076u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0669a mo2551a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0655a aVar = this.f2101a;
            aVar.f2078w = listAdapter;
            aVar.f2079x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0668b mo2553b() {
            C0668b bVar = new C0668b(this.f2101a.f2056a, this.f2102b);
            this.f2101a.mo2494a(bVar.f2100a);
            bVar.setCancelable(this.f2101a.f2073r);
            if (this.f2101a.f2073r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f2101a.f2074s);
            bVar.setOnDismissListener(this.f2101a.f2075t);
            if (this.f2101a.f2076u != null) {
                bVar.setOnKeyListener(this.f2101a.f2076u);
            }
            return bVar;
        }
    }
}
