package c.d.a.b.e.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.d.a.b.e.c.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0221x<E> extends AbstractC0215u<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final J<Object> f3945b = new C0219w(B.f3788c, 0);

    public static <E> AbstractC0221x<E> h() {
        return (AbstractC0221x<E>) B.f3788c;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    public final AbstractC0221x<E> g() {
        return this;
    }

    public static <E> AbstractC0221x<E> a(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        Object[] objArr = {e2, e3, e4, e5, e6, e7, e8, e9};
        for (int i2 = 0; i2 < 8; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return new B(objArr, 8);
    }

    static <E> AbstractC0221x<E> a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return (AbstractC0221x<E>) B.f3788c;
        }
        return new B(objArr, length);
    }

    AbstractC0221x() {
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    /* renamed from: c */
    public final K<E> iterator() {
        return (J) listIterator();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            int i2 = 0;
            if (obj == null) {
                while (i2 < size) {
                    if (get(i2) == null) {
                        return i2;
                    }
                    i2++;
                }
            } else {
                while (i2 < size) {
                    if (obj.equals(get(i2))) {
                        return i2;
                    }
                    i2++;
                }
            }
            return -1;
        }
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC0197l.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator<E> listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (AbstractC0197l.a(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0221x<E> subList(int i2, int i3) {
        AbstractC0195k.a(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return (AbstractC0221x<E>) B.f3788c;
        }
        return new A(this, i2, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        AbstractC0195k.a(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (AbstractC0197l.a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                AbstractC0221x<E> abstractC0221x = this;
                int size2 = abstractC0221x.size();
                Iterator<E> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e2 = abstractC0221x.get(i3);
                        i3++;
                        if (!AbstractC0197l.a(e2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i2) {
        AbstractC0195k.b(i2, size());
        if (isEmpty()) {
            return f3945b;
        }
        return new C0219w(this, i2);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (J) listIterator(0);
    }
}
