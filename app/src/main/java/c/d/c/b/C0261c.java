package c.d.c.b;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: c.d.c.b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0261c<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f4205a;

    C0261c(q qVar) {
        this.f4205a = qVar;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) new ConcurrentHashMap();
    }
}
