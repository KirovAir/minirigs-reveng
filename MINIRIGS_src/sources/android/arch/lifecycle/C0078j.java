package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.j */
public class C0078j {

    /* renamed from: a */
    private static Map<Class, Integer> f187a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0064c>>> f188b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m273a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class<?> cls = obj.getClass();
        if (m277b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f188b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m274a((Constructor) list.get(0), obj));
        }
        C0064c[] cVarArr = new C0064c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m274a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: a */
    private static C0064c m274a(Constructor<? extends C0064c> constructor, Object obj) {
        try {
            return (C0064c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0064c> m276a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m275a(canonicalName);
            if (!name.isEmpty()) {
                a = name + "." + a;
            }
            Constructor<?> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m277b(Class<?> cls) {
        if (f187a.containsKey(cls)) {
            return f187a.get(cls).intValue();
        }
        int c = m278c(cls);
        f187a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m278c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0064c> a = m276a(cls);
        if (a != null) {
            f188b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0060a.f161a.mo166a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m279d(superclass)) {
                if (m277b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f188b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m279d(cls2)) {
                    if (m277b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f188b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f188b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m279d(Class<?> cls) {
        return cls != null && C0072f.class.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static String m275a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}
