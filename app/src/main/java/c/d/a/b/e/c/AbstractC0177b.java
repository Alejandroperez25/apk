package c.d.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c.d.a.b.e.c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0177b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f3879a = AbstractC0179c.f3893b;

    /* renamed from: b, reason: collision with root package name */
    private T f3880b;

    protected AbstractC0177b() {
    }

    protected abstract T a();

    protected final T b() {
        this.f3879a = AbstractC0179c.f3894c;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!(this.f3879a != AbstractC0179c.f3895d)) {
            throw new IllegalStateException();
        }
        switch (AbstractC0181d.f3897a[this.f3879a - 1]) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                this.f3879a = AbstractC0179c.f3895d;
                this.f3880b = a();
                if (this.f3879a == AbstractC0179c.f3894c) {
                    return false;
                }
                this.f3879a = AbstractC0179c.f3892a;
                return true;
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3879a = AbstractC0179c.f3893b;
        T t = this.f3880b;
        this.f3880b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
