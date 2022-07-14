package android.arch.lifecycle;

import android.arch.lifecycle.C0065d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.a */
class C0060a {

    /* renamed from: a */
    static C0060a f161a = new C0060a();

    /* renamed from: b */
    private final Map<Class, C0061a> f162b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f163c = new HashMap();

    C0060a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo166a(Class cls) {
        if (this.f163c.containsKey(cls)) {
            return this.f163c.get(cls).booleanValue();
        }
        Method[] c = m228c(cls);
        for (Method annotation : c) {
            if (((C0082n) annotation.getAnnotation(C0082n.class)) != null) {
                m226a(cls, c);
                return true;
            }
        }
        this.f163c.put(cls, false);
        return false;
    }

    /* renamed from: c */
    private Method[] m228c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0061a mo167b(Class cls) {
        C0061a aVar = this.f162b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m226a(cls, (Method[]) null);
    }

    /* renamed from: a */
    private void m227a(Map<C0062b, C0065d.C0066a> map, C0062b bVar, C0065d.C0066a aVar, Class cls) {
        C0065d.C0066a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f167b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0061a m226a(Class cls, Method[] methodArr) {
        int i;
        C0061a b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo167b(superclass)) == null)) {
            hashMap.putAll(b.f165b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo167b(b2).f165b.entrySet()) {
                m227a(hashMap, (C0062b) next.getKey(), (C0065d.C0066a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m228c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0082n nVar = (C0082n) method.getAnnotation(C0082n.class);
            if (nVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0073g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0065d.C0066a a = nVar.mo197a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0065d.C0066a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0065d.C0066a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m227a(hashMap, new C0062b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0061a aVar = new C0061a(hashMap);
        this.f162b.put(cls, aVar);
        this.f163c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0061a {

        /* renamed from: a */
        final Map<C0065d.C0066a, List<C0062b>> f164a = new HashMap();

        /* renamed from: b */
        final Map<C0062b, C0065d.C0066a> f165b;

        C0061a(Map<C0062b, C0065d.C0066a> map) {
            this.f165b = map;
            for (Map.Entry next : map.entrySet()) {
                C0065d.C0066a aVar = (C0065d.C0066a) next.getValue();
                List list = this.f164a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f164a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo168a(C0073g gVar, C0065d.C0066a aVar, Object obj) {
            m231a(this.f164a.get(aVar), gVar, aVar, obj);
            m231a(this.f164a.get(C0065d.C0066a.ON_ANY), gVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m231a(List<C0062b> list, C0073g gVar, C0065d.C0066a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo169a(gVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0062b {

        /* renamed from: a */
        final int f166a;

        /* renamed from: b */
        final Method f167b;

        C0062b(int i, Method method) {
            this.f166a = i;
            this.f167b = method;
            this.f167b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo169a(C0073g gVar, C0065d.C0066a aVar, Object obj) {
            try {
                switch (this.f166a) {
                    case 0:
                        this.f167b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f167b.invoke(obj, new Object[]{gVar});
                        return;
                    case 2:
                        this.f167b.invoke(obj, new Object[]{gVar, aVar});
                        return;
                    default:
                        return;
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0062b bVar = (C0062b) obj;
            if (this.f166a != bVar.f166a || !this.f167b.getName().equals(bVar.f167b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f166a * 31) + this.f167b.getName().hashCode();
        }
    }
}
