package c.d.c.b;

import java.util.LinkedHashSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class m<T> implements A<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f4224a;

    m(q qVar) {
        this.f4224a = qVar;
    }

    @Override // c.d.c.b.A
    public T a() {
        return (T) new LinkedHashSet();
    }
}
