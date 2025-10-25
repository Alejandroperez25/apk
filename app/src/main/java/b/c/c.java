package b.c;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
class c<E> extends h<E, E> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f980d;

    c(d dVar) {
        this.f980d = dVar;
    }

    @Override // b.c.h
    protected int d() {
        return this.f980d.f989i;
    }

    @Override // b.c.h
    protected Object a(int i2, int i3) {
        return this.f980d.f988h[i2];
    }

    @Override // b.c.h
    protected int a(Object obj) {
        return this.f980d.indexOf(obj);
    }

    @Override // b.c.h
    protected int b(Object obj) {
        return this.f980d.indexOf(obj);
    }

    @Override // b.c.h
    protected Map<E, E> e() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // b.c.h
    protected void a(E e2, E e3) {
        this.f980d.add(e2);
    }

    @Override // b.c.h
    protected E a(int i2, E e2) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // b.c.h
    protected void b(int i2) {
        this.f980d.d(i2);
    }

    @Override // b.c.h
    protected void f() {
        this.f980d.clear();
    }
}
