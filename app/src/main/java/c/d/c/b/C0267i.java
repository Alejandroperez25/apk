package c.d.c.b;

import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: c.d.c.b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0267i<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.d.c.q f4216a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Type f4217b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f4218c;

    C0267i(q qVar, c.d.c.q qVar2, Type type) {
        this.f4218c = qVar;
        this.f4216a = qVar2;
        this.f4217b = type;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) this.f4216a.a(this.f4217b);
    }
}
