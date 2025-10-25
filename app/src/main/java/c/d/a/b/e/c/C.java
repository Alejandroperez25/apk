package c.d.a.b.e.c;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class C<E> extends AbstractC0215u<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC0221x<E> f3791b;

    C() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return H.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return H.a(this);
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    public AbstractC0221x<E> g() {
        AbstractC0221x<E> abstractC0221x = this.f3791b;
        if (abstractC0221x != null) {
            return abstractC0221x;
        }
        AbstractC0221x<E> abstractC0221xH = h();
        this.f3791b = abstractC0221xH;
        return abstractC0221xH;
    }

    AbstractC0221x<E> h() {
        return AbstractC0221x.a(toArray());
    }

    @Override // c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
