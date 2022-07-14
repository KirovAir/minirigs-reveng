package android.support.p026v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p026v4.p027a.C0391a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.z */
public final class C0486z implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f1627a = new ArrayList<>();

    /* renamed from: b */
    private final Context f1628b;

    /* renamed from: android.support.v4.app.z$a */
    public interface C0487a {
        /* renamed from: a */
        Intent mo1889a();
    }

    private C0486z(Context context) {
        this.f1628b = context;
    }

    /* renamed from: a */
    public static C0486z m2170a(Context context) {
        return new C0486z(context);
    }

    /* renamed from: a */
    public C0486z mo1885a(Intent intent) {
        this.f1627a.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0486z mo1883a(Activity activity) {
        Intent a = activity instanceof C0487a ? ((C0487a) activity).mo1889a() : null;
        if (a == null) {
            a = C0481u.m2157a(activity);
        }
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.f1628b.getPackageManager());
            }
            mo1884a(component);
            mo1885a(a);
        }
        return this;
    }

    /* renamed from: a */
    public C0486z mo1884a(ComponentName componentName) {
        int size = this.f1627a.size();
        try {
            Intent a = C0481u.m2158a(this.f1628b, componentName);
            while (a != null) {
                this.f1627a.add(size, a);
                a = C0481u.m2158a(this.f1628b, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1627a.iterator();
    }

    /* renamed from: a */
    public void mo1886a() {
        mo1887a((Bundle) null);
    }

    /* renamed from: a */
    public void mo1887a(Bundle bundle) {
        if (!this.f1627a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1627a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0391a.m1621a(this.f1628b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1628b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
