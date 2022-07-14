package android.support.p026v4.p036h;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.h.e */
public class C0580e {

    /* renamed from: a */
    private static boolean f1819a = false;

    /* renamed from: b */
    private static Method f1820b = null;

    /* renamed from: c */
    private static boolean f1821c = false;

    /* renamed from: d */
    private static Field f1822d;

    /* renamed from: android.support.v4.h.e$a */
    public interface C0581a {
        /* renamed from: a */
        boolean mo1880a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m2530a(View view, KeyEvent keyEvent) {
        return C0594r.m2591a(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m2529a(C0581a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo1880a(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2527a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2528a((Dialog) callback, keyEvent);
        }
        if ((view == null || !C0594r.m2595b(view, keyEvent)) && !aVar.mo1880a(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m2526a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1819a) {
            try {
                f1820b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f1819a = true;
        }
        Method method = f1820b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2527a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2526a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0594r.m2595b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static DialogInterface.OnKeyListener m2525a(Dialog dialog) {
        if (!f1821c) {
            try {
                f1822d = Dialog.class.getDeclaredField("mOnKeyListener");
                f1822d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1821c = true;
        }
        Field field = f1822d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m2528a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener a = m2525a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0594r.m2595b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
