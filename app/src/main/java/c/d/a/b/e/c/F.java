package c.d.a.b.e.c;

import java.util.Iterator;

/* loaded from: classes.dex */
final class F<K> extends C<K> {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC0223y<K, ?> f3804c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC0221x<K> f3805d;

    F(AbstractC0223y<K, ?> abstractC0223y, AbstractC0221x<K> abstractC0221x) {
        this.f3804c = abstractC0223y;
        this.f3805d = abstractC0221x;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    /* renamed from: c */
    public final K<K> iterator() {
        return (K) g().iterator();
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int a(Object[] objArr, int i2) {
        return g().a(objArr, i2);
    }

    @Override // c.d.a.b.e.c.C, c.d.a.b.e.c.AbstractC0215u
    public final AbstractC0221x<K> g() {
        return this.f3805d;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3804c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3804c.size();
    }

    @Override // c.d.a.b.e.c.C, c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
