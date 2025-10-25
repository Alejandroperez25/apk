package c.d.a.b.e.c;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class D<K, V> extends C<Map.Entry<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC0223y<K, V> f3794c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f3795d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3796e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f3797f;

    D(AbstractC0223y<K, V> abstractC0223y, Object[] objArr, int i2, int i3) {
        this.f3794c = abstractC0223y;
        this.f3795d = objArr;
        this.f3797f = i3;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    /* renamed from: c */
    public final K<Map.Entry<K, V>> iterator() {
        return (K) g().iterator();
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int a(Object[] objArr, int i2) {
        return g().a(objArr, i2);
    }

    @Override // c.d.a.b.e.c.C
    final AbstractC0221x<Map.Entry<K, V>> h() {
        return new G(this);
    }

    @Override // c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f3794c.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3797f;
    }

    @Override // c.d.a.b.e.c.C, c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
