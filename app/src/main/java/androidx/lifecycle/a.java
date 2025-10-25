package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    static a f819a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, C0009a> f820b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f821c = new HashMap();

    a() {
    }

    boolean a(Class<?> cls) {
        Boolean bool = this.f821c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrC = c(cls);
        for (Method method : methodArrC) {
            if (((r) method.getAnnotation(r.class)) != null) {
                a(cls, methodArrC);
                return true;
            }
        }
        this.f821c.put(cls, false);
        return false;
    }

    private Method[] c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    C0009a b(Class<?> cls) {
        C0009a c0009a = this.f820b.get(cls);
        return c0009a != null ? c0009a : a(cls, null);
    }

    private void a(Map<b, f.a> map, b bVar, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f825b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private C0009a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0009a c0009aB;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0009aB = b(superclass)) != null) {
            map.putAll(c0009aB.f823b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.a> entry : b(cls2).f823b.entrySet()) {
                a(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(i.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                f.a aVarValue = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(map, new b(i2, method), aVarValue, cls);
                z = true;
            }
        }
        C0009a c0009a = new C0009a(map);
        this.f820b.put(cls, c0009a);
        this.f821c.put(cls, Boolean.valueOf(z));
        return c0009a;
    }

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0009a {

        /* renamed from: a, reason: collision with root package name */
        final Map<f.a, List<b>> f822a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, f.a> f823b;

        C0009a(Map<b, f.a> map) {
            this.f823b = map;
            for (Map.Entry<b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<b> arrayList = this.f822a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f822a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        void a(i iVar, f.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            a(this.f822a.get(aVar), iVar, aVar, obj);
            a(this.f822a.get(f.a.ON_ANY), iVar, aVar, obj);
        }

        private static void a(List<b> list, i iVar, f.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, aVar, obj);
                }
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f824a;

        /* renamed from: b, reason: collision with root package name */
        final Method f825b;

        b(int i2, Method method) {
            this.f824a = i2;
            this.f825b = method;
            this.f825b.setAccessible(true);
        }

        void a(i iVar, f.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                switch (this.f824a) {
                    case 0:
                        this.f825b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f825b.invoke(obj, iVar);
                        return;
                    case 2:
                        this.f825b.invoke(obj, iVar, aVar);
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f824a == bVar.f824a && this.f825b.getName().equals(bVar.f825b.getName());
        }

        public int hashCode() {
            return (this.f824a * 31) + this.f825b.getName().hashCode();
        }
    }
}
