package c.d.c.b;

import c.d.c.b.y;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
class x<K, V> extends y<K, V>.c<Map.Entry<K, V>> {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ y.a f4246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y.a aVar) {
        super();
        this.f4246e = aVar;
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return a();
    }
}
