package android.support.p039v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.h */
class C0693h {

    /* renamed from: a */
    private static Field f2196a;

    /* renamed from: b */
    private static boolean f2197b;

    /* renamed from: c */
    private static Class f2198c;

    /* renamed from: d */
    private static boolean f2199d;

    /* renamed from: e */
    private static Field f2200e;

    /* renamed from: f */
    private static boolean f2201f;

    /* renamed from: g */
    private static Field f2202g;

    /* renamed from: h */
    private static boolean f2203h;

    /* renamed from: a */
    static void m3077a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT >= 24) {
                m3081d(resources);
            } else if (Build.VERSION.SDK_INT >= 23) {
                m3080c(resources);
            } else if (Build.VERSION.SDK_INT >= 21) {
                m3079b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m3079b(Resources resources) {
        Map map;
        if (!f2197b) {
            try {
                f2196a = Resources.class.getDeclaredField("mDrawableCache");
                f2196a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2197b = true;
        }
        Field field = f2196a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m3080c(Resources resources) {
        if (!f2197b) {
            try {
                f2196a = Resources.class.getDeclaredField("mDrawableCache");
                f2196a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2197b = true;
        }
        Object obj = null;
        Field field = f2196a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m3078a(obj);
        }
    }

    /* renamed from: d */
    private static void m3081d(Resources resources) {
        Object obj;
        if (!f2203h) {
            try {
                f2202g = Resources.class.getDeclaredField("mResourcesImpl");
                f2202g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2203h = true;
        }
        Field field = f2202g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f2197b) {
                    try {
                        f2196a = obj.getClass().getDeclaredField("mDrawableCache");
                        f2196a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f2197b = true;
                }
                Field field2 = f2196a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m3078a(obj2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3078a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2199d) {
            try {
                f2198c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2199d = true;
        }
        Class cls = f2198c;
        if (cls != null) {
            if (!f2201f) {
                try {
                    f2200e = cls.getDeclaredField("mUnthemedEntries");
                    f2200e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f2201f = true;
            }
            Field field = f2200e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
