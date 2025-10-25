package c.d.c.b;

import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: c.d.c.b.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0266h<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.d.c.q f4213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Type f4214b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f4215c;

    C0266h(q qVar, c.d.c.q qVar2, Type type) {
        this.f4215c = qVar;
        this.f4213a = qVar2;
        this.f4214b = type;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) this.f4213a.a(this.f4214b);
    }
}
