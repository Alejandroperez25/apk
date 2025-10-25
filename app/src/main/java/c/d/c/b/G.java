package c.d.c.b;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
class G extends I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f4117a;

    G(Method method) {
        this.f4117a = method;
    }

    @Override // c.d.c.b.I
    public <T> T b(Class<T> cls) {
        I.a(cls);
        return (T) this.f4117a.invoke(null, cls, Object.class);
    }
}
