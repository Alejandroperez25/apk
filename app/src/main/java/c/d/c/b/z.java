package c.d.c.b;

import c.d.c.b.y;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
class z<K> extends y<K, V>.c<K> {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ y.b f4269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(y.b bVar) {
        super();
        this.f4269e = bVar;
    }

    @Override // java.util.Iterator
    public K next() {
        return a().f4266f;
    }
}
