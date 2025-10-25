package c.d.c.b;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
class E extends I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f4113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f4114b;

    E(Method method, Object obj) {
        this.f4113a = method;
        this.f4114b = obj;
    }

    @Override // c.d.c.b.I
    public <T> T b(Class<T> cls) {
        I.a(cls);
        return (T) this.f4113a.invoke(this.f4114b, cls);
    }
}
