package c.d.c.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, c.d.c.q<?>> f4228a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.c.b.b.b f4229b = c.d.c.b.b.b.a();

    public q(Map<Type, c.d.c.q<?>> map) {
        this.f4228a = map;
    }

    public <T> A<T> a(c.d.c.c.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeB = aVar.b();
        Class<? super T> clsA = aVar.a();
        c.d.c.q<?> qVar = this.f4228a.get(typeB);
        if (qVar != null) {
            return new C0266h(this, qVar, typeB);
        }
        c.d.c.q<?> qVar2 = this.f4228a.get(clsA);
        if (qVar2 != null) {
            return new C0267i(this, qVar2, typeB);
        }
        A<T> a2 = a(clsA);
        if (a2 != null) {
            return a2;
        }
        A<T> a3 = a(typeB, clsA);
        return a3 != null ? a3 : b(typeB, clsA);
    }

    private <T> A<T> a(Class<? super T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f4229b.a(declaredConstructor);
            }
            return new j(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> A<T> a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new k(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new l(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new m(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new n(this);
            }
            return new o(this);
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new p(this);
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new C0261c(this);
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new C0262d(this);
        }
        if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(c.d.c.c.a.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) {
            return new C0263e(this);
        }
        return new C0264f(this);
    }

    private <T> A<T> b(Type type, Class<? super T> cls) {
        return new C0265g(this, cls, type);
    }

    public String toString() {
        return this.f4228a.toString();
    }
}
