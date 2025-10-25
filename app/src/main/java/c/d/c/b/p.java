package c.d.c.b;

import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class p<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f4227a;

    p(q qVar) {
        this.f4227a = qVar;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) new ConcurrentSkipListMap();
    }
}
