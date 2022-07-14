package android.support.p026v4.app;

import android.arch.lifecycle.C0065d;
import android.arch.lifecycle.C0092s;
import android.arch.lifecycle.C0093t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p026v4.app.C0414a;
import android.support.p026v4.p035g.C0533m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.g */
public class C0432g extends C0485y implements C0093t, C0414a.C0416a, C0414a.C0418c {

    /* renamed from: a */
    final Handler f1451a = new Handler() {
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            C0432g.this.mo1647a_();
            C0432g.this.f1452b.mo1711m();
        }
    };

    /* renamed from: b */
    final C0437i f1452b = C0437i.m1891a((C0438j<?>) new C0434a());

    /* renamed from: c */
    boolean f1453c;

    /* renamed from: d */
    boolean f1454d;

    /* renamed from: e */
    boolean f1455e = true;

    /* renamed from: f */
    boolean f1456f;

    /* renamed from: g */
    boolean f1457g;

    /* renamed from: h */
    boolean f1458h;

    /* renamed from: i */
    int f1459i;

    /* renamed from: j */
    C0533m<String> f1460j;

    /* renamed from: k */
    private C0092s f1461k;

    /* renamed from: a */
    public void mo1645a(C0425f fVar) {
    }

    /* renamed from: b */
    public Object mo1648b() {
        return null;
    }

    /* renamed from: android.support.v4.app.g$b */
    static final class C0435b {

        /* renamed from: a */
        Object f1464a;

        /* renamed from: b */
        C0092s f1465b;

        /* renamed from: c */
        C0458m f1466c;

        C0435b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1452b.mo1697b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.f1460j.mo2110a(i4);
            this.f1460j.mo2116c(i4);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0425f a2 = this.f1452b.mo1687a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo1564a(i & 65535, i2, intent);
            return;
        }
        C0414a.C0417b a3 = C0414a.m1720a();
        if (a3 == null || !a3.mo1504a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0439k a = this.f1452b.mo1688a();
        boolean d = a.mo1722d();
        if (d && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (d || !a.mo1720b()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1452b.mo1693a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1452b.mo1699b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1452b.mo1697b();
        this.f1452b.mo1690a(configuration);
    }

    /* renamed from: e */
    public C0092s mo221e() {
        if (getApplication() != null) {
            if (this.f1461k == null) {
                C0435b bVar = (C0435b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f1461k = bVar.f1465b;
                }
                if (this.f1461k == null) {
                    this.f1461k = new C0092s();
                }
            }
            return this.f1461k;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: d */
    public C0065d mo191d() {
        return super.mo191d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0458m mVar = null;
        this.f1452b.mo1692a((C0425f) null);
        super.onCreate(bundle);
        C0435b bVar = (C0435b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f1465b == null || this.f1461k != null)) {
            this.f1461k = bVar.f1465b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0437i iVar = this.f1452b;
            if (bVar != null) {
                mVar = bVar.f1466c;
            }
            iVar.mo1691a(parcelable, mVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1459i = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1460j = new C0533m<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1460j.mo2114b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1460j == null) {
            this.f1460j = new C0533m<>();
            this.f1459i = 0;
        }
        this.f1452b.mo1703e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f1452b.mo1695a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo1644a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo1644a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo1644a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1452b.mo1689a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f1461k != null && !isChangingConfigurations()) {
            this.f1461k.mo219a();
        }
        this.f1452b.mo1709k();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1452b.mo1710l();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1452b.mo1696a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1452b.mo1700b(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1452b.mo1698b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1454d = false;
        if (this.f1451a.hasMessages(2)) {
            this.f1451a.removeMessages(2);
            mo1647a_();
        }
        this.f1452b.mo1707i();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1452b.mo1697b();
    }

    public void onStateNotSaved() {
        this.f1452b.mo1697b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1451a.sendEmptyMessage(2);
        this.f1454d = true;
        this.f1452b.mo1711m();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f1451a.removeMessages(2);
        mo1647a_();
        this.f1452b.mo1711m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo1647a_() {
        this.f1452b.mo1706h();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return mo1646a(view, menu) | this.f1452b.mo1694a(menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1646a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object b = mo1648b();
        C0458m d = this.f1452b.mo1702d();
        if (d == null && this.f1461k == null && b == null) {
            return null;
        }
        C0435b bVar = new C0435b();
        bVar.f1464a = b;
        bVar.f1465b = this.f1461k;
        bVar.f1466c = d;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2564g();
        Parcelable c = this.f1452b.mo1701c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f1460j.mo2112b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1459i);
            int[] iArr = new int[this.f1460j.mo2112b()];
            String[] strArr = new String[this.f1460j.mo2112b()];
            for (int i = 0; i < this.f1460j.mo2112b(); i++) {
                iArr[i] = this.f1460j.mo2119d(i);
                strArr[i] = this.f1460j.mo2120e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1455e = false;
        if (!this.f1453c) {
            this.f1453c = true;
            this.f1452b.mo1704f();
        }
        this.f1452b.mo1697b();
        this.f1452b.mo1711m();
        this.f1452b.mo1705g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1455e = true;
        mo2564g();
        this.f1452b.mo1708j();
    }

    @Deprecated
    /* renamed from: c */
    public void mo1649c() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1453c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1454d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1455e);
        if (getApplication() != null) {
            C0479t.m2152a(this).mo1489a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1452b.mo1688a().mo1719a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f */
    public C0439k mo1651f() {
        return this.f1452b.mo1688a();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f1458h && i != -1) {
            m1867b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f1458h && i != -1) {
            m1867b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1457g && i != -1) {
            m1867b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1457g && i != -1) {
            m1867b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: b */
    static void m1867b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    public final void mo1506a(int i) {
        if (!this.f1456f && i != -1) {
            m1867b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1452b.mo1697b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f1460j.mo2110a(i3);
            this.f1460j.mo2116c(i3);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0425f a2 = this.f1452b.mo1687a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo1566a(i & 65535, strArr, iArr);
        }
    }

    /* renamed from: android.support.v4.app.g$a */
    class C0434a extends C0438j<C0432g> {
        public C0434a() {
            super(C0432g.this);
        }

        /* renamed from: a */
        public void mo1680a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0432g.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo1681a(C0425f fVar) {
            return !C0432g.this.isFinishing();
        }

        /* renamed from: b */
        public LayoutInflater mo1682b() {
            return C0432g.this.getLayoutInflater().cloneInContext(C0432g.this);
        }

        /* renamed from: c */
        public void mo1684c() {
            C0432g.this.mo1649c();
        }

        /* renamed from: d */
        public boolean mo1685d() {
            return C0432g.this.getWindow() != null;
        }

        /* renamed from: e */
        public int mo1686e() {
            Window window = C0432g.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: b */
        public void mo1683b(C0425f fVar) {
            C0432g.this.mo1645a(fVar);
        }

        /* renamed from: a */
        public View mo1640a(int i) {
            return C0432g.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo1641a() {
            Window window = C0432g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: g */
    private void mo2564g() {
        do {
        } while (m1866a(mo1651f(), C0065d.C0067b.CREATED));
    }

    /* renamed from: a */
    private static boolean m1866a(C0439k kVar, C0065d.C0067b bVar) {
        boolean z = false;
        for (C0425f next : kVar.mo1721c()) {
            if (next != null) {
                if (next.mo191d().mo180a().mo183a(C0065d.C0067b.STARTED)) {
                    next.f1400T.mo193a(bVar);
                    z = true;
                }
                C0439k n = next.mo1621n();
                if (n != null) {
                    z |= m1866a(n, bVar);
                }
            }
        }
        return z;
    }
}
