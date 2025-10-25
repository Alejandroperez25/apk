package c.d.a.b.e.c;

import java.util.NoSuchElementException;

/* renamed from: c.d.a.b.e.c.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0213t<E> extends J<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f3937a;

    /* renamed from: b, reason: collision with root package name */
    private int f3938b;

    protected AbstractC0213t(int i2, int i3) {
        AbstractC0195k.b(i3, i2);
        this.f3937a = i2;
        this.f3938b = i3;
    }

    protected abstract E a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3938b < this.f3937a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3938b;
        this.f3938b = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3938b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3938b > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3938b - 1;
        this.f3938b = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3938b - 1;
    }
}
