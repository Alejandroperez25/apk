package b.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    h<K, V>.b f1006a;

    /* renamed from: b, reason: collision with root package name */
    h<K, V>.c f1007b;

    /* renamed from: c, reason: collision with root package name */
    h<K, V>.e f1008c;

    protected abstract int a(Object obj);

    protected abstract Object a(int i2, int i3);

    protected abstract V a(int i2, V v);

    protected abstract void a(K k, V v);

    protected abstract int b(Object obj);

    protected abstract void b(int i2);

    protected abstract int d();

    protected abstract Map<K, V> e();

    protected abstract void f();

    h() {
    }

    final class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f1009a;

        /* renamed from: b, reason: collision with root package name */
        int f1010b;

        /* renamed from: c, reason: collision with root package name */
        int f1011c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1012d = false;

        a(int i2) {
            this.f1009a = i2;
            this.f1010b = h.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1011c < this.f1010b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) h.this.a(this.f1011c, this.f1009a);
            this.f1011c++;
            this.f1012d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1012d) {
                throw new IllegalStateException();
            }
            this.f1011c--;
            this.f1010b--;
            this.f1012d = false;
            h.this.b(this.f1011c);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        int f1016a;

        /* renamed from: c, reason: collision with root package name */
        boolean f1018c = false;

        /* renamed from: b, reason: collision with root package name */
        int f1017b = -1;

        d() {
            this.f1016a = h.this.d() - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1017b < this.f1016a;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1017b++;
            this.f1018c = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1018c) {
                throw new IllegalStateException();
            }
            h.this.b(this.f1017b);
            this.f1017b--;
            this.f1016a--;
            this.f1018c = false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.f1018c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) h.this.a(this.f1017b, 0);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.f1018c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) h.this.a(this.f1017b, 1);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.f1018c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) h.this.a(this.f1017b, (int) v);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1018c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b.c.e.a(entry.getKey(), h.this.a(this.f1017b, 0)) && b.c.e.a(entry.getValue(), h.this.a(this.f1017b, 1));
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1018c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objA = h.this.a(this.f1017b, 0);
            Object objA2 = h.this.a(this.f1017b, 1);
            return (objA == null ? 0 : objA.hashCode()) ^ (objA2 != null ? objA2.hashCode() : 0);
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = h.this.d();
            for (Map.Entry<K, V> entry : collection) {
                h.this.a((h) entry.getKey(), (K) entry.getValue());
            }
            return iD != h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.f();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = h.this.a(entry.getKey());
            if (iA < 0) {
                return false;
            }
            return b.c.e.a(h.this.a(iA, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objA = h.this.a(iD, 0);
                Object objA2 = h.this.a(iD, 1);
                iHashCode += (objA == null ? 0 : objA.hashCode()) ^ (objA2 == null ? 0 : objA2.hashCode());
            }
            return iHashCode;
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.f();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h.a((Map) h.this.e(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iA = h.this.a(obj);
            if (iA < 0) {
                return false;
            }
            h.this.b(iA);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return h.b(h.this.e(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return h.c(h.this.e(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return h.this.a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = h.this.d() - 1; iD >= 0; iD--) {
                Object objA = h.this.a(iD, 0);
                iHashCode += objA == null ? 0 : objA.hashCode();
            }
            return iHashCode;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            h.this.f();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return h.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iB = h.this.b(obj);
            if (iB < 0) {
                return false;
            }
            h.this.b(iB);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = h.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iD) {
                if (collection.contains(h.this.a(i2, 1))) {
                    h.this.b(i2);
                    i2--;
                    iD--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = h.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iD) {
                if (!collection.contains(h.this.a(i2, 1))) {
                    h.this.b(i2);
                    i2--;
                    iD--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return h.this.a(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] a(int i2) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i3 = 0; i3 < iD; i3++) {
            objArr[i3] = a(i3, i2);
        }
        return objArr;
    }

    public <T> T[] a(T[] tArr, int i2) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i3 = 0; i3 < iD; i3++) {
            tArr[i3] = a(i3, i2);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        if (this.f1006a == null) {
            this.f1006a = new b();
        }
        return this.f1006a;
    }

    public Set<K> b() {
        if (this.f1007b == null) {
            this.f1007b = new c();
        }
        return this.f1007b;
    }

    public Collection<V> c() {
        if (this.f1008c == null) {
            this.f1008c = new e();
        }
        return this.f1008c;
    }
}
