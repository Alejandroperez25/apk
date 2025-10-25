package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    c<K, V> f965a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f966b;

    /* renamed from: c, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f967c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f968d = 0;

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.f965a;
        while (cVar != null && !cVar.f969a.equals(k)) {
            cVar = cVar.f971c;
        }
        return cVar;
    }

    protected c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f968d++;
        if (this.f966b == null) {
            this.f965a = cVar;
            this.f966b = this.f965a;
            return cVar;
        }
        this.f966b.f971c = cVar;
        cVar.f972d = this.f966b;
        this.f966b = cVar;
        return cVar;
    }

    public V remove(K k) {
        c<K, V> cVarA = a(k);
        if (cVarA == null) {
            return null;
        }
        this.f968d--;
        if (!this.f967c.isEmpty()) {
            Iterator<f<K, V>> it = this.f967c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        if (cVarA.f972d != null) {
            cVarA.f972d.f971c = cVarA.f971c;
        } else {
            this.f965a = cVarA.f971c;
        }
        if (cVarA.f971c != null) {
            cVarA.f971c.f972d = cVarA.f972d;
        } else {
            this.f966b = cVarA.f972d;
        }
        cVarA.f971c = null;
        cVarA.f972d = null;
        return cVarA.f970b;
    }

    public int size() {
        return this.f968d;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f965a, this.f966b);
        this.f967c.put(aVar, false);
        return aVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0013b c0013b = new C0013b(this.f966b, this.f965a);
        this.f967c.put(c0013b, false);
        return c0013b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f967c.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f965a;
    }

    public Map.Entry<K, V> e() {
        return this.f966b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f976a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f977b;

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f976a = cVar2;
            this.f977b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f977b != null;
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f976a == cVar && cVar == this.f977b) {
                this.f977b = null;
                this.f976a = null;
            }
            if (this.f976a == cVar) {
                this.f976a = c(this.f976a);
            }
            if (this.f977b == cVar) {
                this.f977b = a();
            }
        }

        private c<K, V> a() {
            if (this.f977b == this.f976a || this.f976a == null) {
                return null;
            }
            return b(this.f977b);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f977b;
            this.f977b = a();
            return cVar;
        }
    }

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f971c;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f972d;
        }
    }

    /* renamed from: b.b.a.b.b$b, reason: collision with other inner class name */
    private static class C0013b<K, V> extends e<K, V> {
        C0013b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f972d;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f971c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private c<K, V> f973a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f974b = true;

        d() {
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (cVar == this.f973a) {
                this.f973a = this.f973a.f972d;
                this.f974b = this.f973a == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f974b ? b.this.f965a != null : (this.f973a == null || this.f973a.f971c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f974b) {
                this.f974b = false;
                this.f973a = b.this.f965a;
            } else {
                this.f973a = this.f973a != null ? this.f973a.f971c : null;
            }
            return this.f973a;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f969a;

        /* renamed from: b, reason: collision with root package name */
        final V f970b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f971c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f972d;

        c(K k, V v) {
            this.f969a = k;
            this.f970b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f969a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f970b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f969a + "=" + this.f970b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f969a.equals(cVar.f969a) && this.f970b.equals(cVar.f970b);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f969a.hashCode() ^ this.f970b.hashCode();
        }
    }
}
