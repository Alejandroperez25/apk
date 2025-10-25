package c.d.c.c;

import c.d.c.b.AbstractC0233a;
import c.d.c.b.AbstractC0260b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final Class<? super T> f4270a;

    /* renamed from: b, reason: collision with root package name */
    final Type f4271b;

    /* renamed from: c, reason: collision with root package name */
    final int f4272c;

    protected a() {
        this.f4271b = a(getClass());
        this.f4270a = (Class<? super T>) AbstractC0260b.e(this.f4271b);
        this.f4272c = this.f4271b.hashCode();
    }

    a(Type type) {
        AbstractC0233a.a(type);
        this.f4271b = AbstractC0260b.d(type);
        this.f4270a = (Class<? super T>) AbstractC0260b.e(this.f4271b);
        this.f4272c = this.f4271b.hashCode();
    }

    static Type a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return AbstractC0260b.d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> a() {
        return this.f4270a;
    }

    public final Type b() {
        return this.f4271b;
    }

    public final int hashCode() {
        return this.f4272c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && AbstractC0260b.a(this.f4271b, ((a) obj).f4271b);
    }

    public final String toString() {
        return AbstractC0260b.f(this.f4271b);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls);
    }
}
