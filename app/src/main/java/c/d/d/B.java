package c.d.d;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class B<E> extends AbstractC0277c<E> {

    /* renamed from: b, reason: collision with root package name */
    private static final B<Object> f4326b = new B<>();

    /* renamed from: c, reason: collision with root package name */
    private final List<E> f4327c;

    static {
        f4326b.a();
    }

    public static <E> B<E> d() {
        return (B<E>) f4326b;
    }

    B() {
        this(new ArrayList(10));
    }

    private B(List<E> list) {
        this.f4327c = list;
    }

    @Override // c.d.d.AbstractC0290p.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public B<E> a(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f4327c);
        return new B<>(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        c();
        this.f4327c.add(i2, e2);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        return this.f4327c.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        c();
        E eRemove = this.f4327c.remove(i2);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        c();
        E e3 = this.f4327c.set(i2, e2);
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4327c.size();
    }
}
