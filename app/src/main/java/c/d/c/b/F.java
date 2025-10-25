package c.d.c.b;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
class F extends I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f4115a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f4116b;

    F(Method method, int i2) {
        this.f4115a = method;
        this.f4116b = i2;
    }

    @Override // c.d.c.b.I
    public <T> T b(Class<T> cls) {
        I.a(cls);
        return (T) this.f4115a.invoke(null, cls, Integer.valueOf(this.f4116b));
    }
}
