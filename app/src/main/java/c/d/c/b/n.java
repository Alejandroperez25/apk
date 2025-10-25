package c.d.c.b;

import java.util.ArrayDeque;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class n<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f4225a;

    n(q qVar) {
        this.f4225a = qVar;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) new ArrayDeque();
    }
}
