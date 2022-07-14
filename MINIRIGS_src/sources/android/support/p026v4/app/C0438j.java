package android.support.p026v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p026v4.p035g.C0531k;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.j */
public abstract class C0438j<E> extends C0436h {

    /* renamed from: a */
    private final Activity f1468a;

    /* renamed from: b */
    final C0442l f1469b;

    /* renamed from: c */
    private final Context f1470c;

    /* renamed from: d */
    private final Handler f1471d;

    /* renamed from: e */
    private final int f1472e;

    /* renamed from: a */
    public View mo1640a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo1680a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo1641a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo1681a(C0425f fVar) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1683b(C0425f fVar) {
    }

    /* renamed from: c */
    public void mo1684c() {
    }

    /* renamed from: d */
    public boolean mo1685d() {
        return true;
    }

    C0438j(C0432g gVar) {
        this(gVar, gVar, gVar.f1451a, 0);
    }

    C0438j(Activity activity, Context context, Handler handler, int i) {
        this.f1469b = new C0442l();
        this.f1468a = activity;
        this.f1470c = (Context) C0531k.m2316a(context, "context == null");
        this.f1471d = (Handler) C0531k.m2316a(handler, "handler == null");
        this.f1472e = i;
    }

    /* renamed from: b */
    public LayoutInflater mo1682b() {
        return LayoutInflater.from(this.f1470c);
    }

    /* renamed from: e */
    public int mo1686e() {
        return this.f1472e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo1712f() {
        return this.f1468a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Context mo1713g() {
        return this.f1470c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler mo1714h() {
        return this.f1471d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0442l mo1715i() {
        return this.f1469b;
    }
}
