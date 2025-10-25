package b.c;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
class a<K, V> extends h<K, V> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f978d;

    a(b bVar) {
        this.f978d = bVar;
    }

    @Override // b.c.h
    protected int d() {
        return this.f978d.f1027g;
    }

    @Override // b.c.h
    protected Object a(int i2, int i3) {
        return this.f978d.f1026f[(i2 << 1) + i3];
    }

    @Override // b.c.h
    protected int a(Object obj) {
        return this.f978d.a(obj);
    }

    @Override // b.c.h
    protected int b(Object obj) {
        return this.f978d.b(obj);
    }

    @Override // b.c.h
    protected Map<K, V> e() {
        return this.f978d;
    }

    @Override // b.c.h
    protected void a(K k, V v) {
        this.f978d.put(k, v);
    }

    @Override // b.c.h
    protected V a(int i2, V v) {
        return this.f978d.a(i2, (int) v);
    }

    @Override // b.c.h
    protected void b(int i2) {
        this.f978d.d(i2);
    }

    @Override // b.c.h
    protected void f() {
        this.f978d.clear();
    }
}
