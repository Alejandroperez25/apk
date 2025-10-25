package c.d.c.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class j<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Constructor f4219a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f4220b;

    j(q qVar, Constructor constructor) {
        this.f4220b = qVar;
        this.f4219a = constructor;
    }

    @Override // c.d.c.b.A
    public T a() {
        try {
            return (T) this.f4219a.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to invoke " + this.f4219a + " with no args", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke " + this.f4219a + " with no args", e4.getTargetException());
        }
    }
}
