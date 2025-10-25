package c.d.c.b.a;

import c.d.c.b.a.C0249p;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: c.d.c.b.a.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0256w<T> extends c.d.c.H<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.p f4191a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.c.H<T> f4192b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f4193c;

    C0256w(c.d.c.p pVar, c.d.c.H<T> h2, Type type) {
        this.f4191a = pVar;
        this.f4192b = h2;
        this.f4193c = type;
    }

    @Override // c.d.c.H
    public T a(c.d.c.d.b bVar) {
        return this.f4192b.a(bVar);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, T t) {
        c.d.c.H<T> hA = this.f4192b;
        Type typeA = a(this.f4193c, t);
        if (typeA != this.f4193c) {
            hA = this.f4191a.a((c.d.c.c.a) c.d.c.c.a.a(typeA));
            if ((hA instanceof C0249p.a) && !(this.f4192b instanceof C0249p.a)) {
                hA = this.f4192b;
            }
        }
        hA.a(dVar, t);
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
