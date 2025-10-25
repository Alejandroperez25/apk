package c.d.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class D implements Iterator<Object> {
    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    D() {
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
