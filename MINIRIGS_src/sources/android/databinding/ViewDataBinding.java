package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.C0065d;
import android.arch.lifecycle.C0072f;
import android.arch.lifecycle.C0073g;
import android.arch.lifecycle.C0082n;
import android.databinding.C0102b;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import com.android.databinding.library.C1106a;
import java.lang.ref.ReferenceQueue;

public abstract class ViewDataBinding extends C0101a {

    /* renamed from: a */
    static int f209a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    private static final int f210b = 8;

    /* renamed from: c */
    private static final boolean f211c = (f209a >= 16);

    /* renamed from: d */
    private static final C0100a f212d = new C0100a() {
    };

    /* renamed from: e */
    private static final C0100a f213e = new C0100a() {
    };

    /* renamed from: f */
    private static final C0100a f214f = new C0100a() {
    };

    /* renamed from: g */
    private static final C0100a f215g = new C0100a() {
    };

    /* renamed from: h */
    private static final C0102b.C0103a<C0105d, ViewDataBinding, Void> f216h = new C0102b.C0103a<C0105d, ViewDataBinding, Void>() {
        /* renamed from: a */
        public void mo228a(C0105d dVar, ViewDataBinding viewDataBinding, int i, Void voidR) {
            switch (i) {
                case 1:
                    if (!dVar.mo236a(viewDataBinding)) {
                        boolean unused = viewDataBinding.f221m = true;
                        return;
                    }
                    return;
                case 2:
                    dVar.mo237b(viewDataBinding);
                    return;
                case 3:
                    dVar.mo238c(viewDataBinding);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: i */
    private static final ReferenceQueue<ViewDataBinding> f217i = new ReferenceQueue<>();

    /* renamed from: j */
    private static final View.OnAttachStateChangeListener f218j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f219k;

    /* renamed from: l */
    private boolean f220l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f221m;

    /* renamed from: n */
    private C0102b<C0105d, ViewDataBinding, Void> f222n;

    /* renamed from: o */
    private boolean f223o;

    /* renamed from: p */
    private Choreographer f224p;

    /* renamed from: q */
    private final Choreographer.FrameCallback f225q;

    /* renamed from: r */
    private Handler f226r;

    /* renamed from: s */
    private ViewDataBinding f227s;

    /* renamed from: t */
    private C0073g f228t;

    /* renamed from: android.databinding.ViewDataBinding$a */
    private interface C0100a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo224b();

    /* renamed from: c */
    public abstract boolean mo225c();

    static {
        if (Build.VERSION.SDK_INT < 19) {
            f218j = null;
        } else {
            f218j = new View.OnAttachStateChangeListener() {
                public void onViewDetachedFromWindow(View view) {
                }

                @TargetApi(19)
                public void onViewAttachedToWindow(View view) {
                    ViewDataBinding.m317a(view).f219k.run();
                    view.removeOnAttachStateChangeListener(this);
                }
            };
        }
    }

    /* renamed from: a */
    public void mo223a() {
        ViewDataBinding viewDataBinding = this.f227s;
        if (viewDataBinding == null) {
            m320e();
        } else {
            viewDataBinding.mo223a();
        }
    }

    /* renamed from: e */
    private void m320e() {
        if (this.f223o) {
            mo226d();
        } else if (mo225c()) {
            this.f223o = true;
            this.f221m = false;
            C0102b<C0105d, ViewDataBinding, Void> bVar = this.f222n;
            if (bVar != null) {
                bVar.mo233a(this, 1, null);
                if (this.f221m) {
                    this.f222n.mo233a(this, 2, null);
                }
            }
            if (!this.f221m) {
                mo224b();
                C0102b<C0105d, ViewDataBinding, Void> bVar2 = this.f222n;
                if (bVar2 != null) {
                    bVar2.mo233a(this, 3, null);
                }
            }
            this.f223o = false;
        }
    }

    /* renamed from: a */
    static ViewDataBinding m317a(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C1106a.C1107a.dataBinding);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f211c == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f224p.postFrameCallback(r2.f225q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f226r.post(r2.f219k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo226d() {
        /*
            r2 = this;
            android.databinding.ViewDataBinding r0 = r2.f227s
            if (r0 == 0) goto L_0x0008
            r0.mo226d()
            goto L_0x003b
        L_0x0008:
            android.arch.lifecycle.g r0 = r2.f228t
            if (r0 == 0) goto L_0x001d
            android.arch.lifecycle.d r0 = r0.mo191d()
            android.arch.lifecycle.d$b r0 = r0.mo180a()
            android.arch.lifecycle.d$b r1 = android.arch.lifecycle.C0065d.C0067b.STARTED
            boolean r0 = r0.mo183a(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f220l     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f220l = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f211c
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f224p
            android.view.Choreographer$FrameCallback r1 = r2.f225q
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f226r
            java.lang.Runnable r1 = r2.f219k
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.mo226d():void");
    }

    public class OnStartListener implements C0072f {

        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f229a;

        @C0082n(mo197a = C0065d.C0066a.ON_START)
        public void onStart() {
            this.f229a.mo223a();
        }
    }
}
