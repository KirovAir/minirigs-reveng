package android.support.p026v4.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* renamed from: android.support.v4.app.CoreComponentFactory */
public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: android.support.v4.app.CoreComponentFactory$a */
    public interface C0410a {
        /* renamed from: a */
        Object mo1487a();
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m1699a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m1699a(super.instantiateApplication(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m1699a(super.instantiateReceiver(classLoader, str, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m1699a(super.instantiateProvider(classLoader, str));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m1699a(super.instantiateService(classLoader, str, intent));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((android.support.p026v4.app.CoreComponentFactory.C0410a) r1).mo1487a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T m1699a(T r1) {
        /*
            boolean r0 = r1 instanceof android.support.p026v4.app.CoreComponentFactory.C0410a
            if (r0 == 0) goto L_0x000e
            r0 = r1
            android.support.v4.app.CoreComponentFactory$a r0 = (android.support.p026v4.app.CoreComponentFactory.C0410a) r0
            java.lang.Object r0 = r0.mo1487a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p026v4.app.CoreComponentFactory.m1699a(java.lang.Object):java.lang.Object");
    }
}
