package android.support.p039v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p026v4.p027a.C0409c;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.k */
class C0698k {

    /* renamed from: a */
    private static C0698k f2217a;

    /* renamed from: b */
    private final Context f2218b;

    /* renamed from: c */
    private final LocationManager f2219c;

    /* renamed from: d */
    private final C0699a f2220d = new C0699a();

    /* renamed from: a */
    static C0698k m3106a(Context context) {
        if (f2217a == null) {
            Context applicationContext = context.getApplicationContext();
            f2217a = new C0698k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2217a;
    }

    C0698k(Context context, LocationManager locationManager) {
        this.f2218b = context;
        this.f2219c = locationManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2681a() {
        C0699a aVar = this.f2220d;
        if (m3109c()) {
            return aVar.f2221a;
        }
        Location b = m3108b();
        if (b != null) {
            m3107a(b);
            return aVar.f2221a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m3108b() {
        Location location = null;
        Location a = C0409c.m1697a(this.f2218b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m3105a("network") : null;
        if (C0409c.m1697a(this.f2218b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m3105a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: a */
    private Location m3105a(String str) {
        try {
            if (this.f2219c.isProviderEnabled(str)) {
                return this.f2219c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: c */
    private boolean m3109c() {
        return this.f2220d.f2226f > System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m3107a(Location location) {
        long j;
        C0699a aVar = this.f2220d;
        long currentTimeMillis = System.currentTimeMillis();
        C0697j a = C0697j.m3103a();
        C0697j jVar = a;
        jVar.mo2680a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f2214a;
        jVar.mo2680a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f2216c == 1;
        long j3 = a.f2215b;
        long j4 = j2;
        long j5 = a.f2214a;
        long j6 = j3;
        boolean z2 = z;
        a.mo2680a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f2215b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f2221a = z2;
        aVar.f2222b = j4;
        aVar.f2223c = j6;
        aVar.f2224d = j5;
        aVar.f2225e = j7;
        aVar.f2226f = j;
    }

    /* renamed from: android.support.v7.app.k$a */
    private static class C0699a {

        /* renamed from: a */
        boolean f2221a;

        /* renamed from: b */
        long f2222b;

        /* renamed from: c */
        long f2223c;

        /* renamed from: d */
        long f2224d;

        /* renamed from: e */
        long f2225e;

        /* renamed from: f */
        long f2226f;

        C0699a() {
        }
    }
}
