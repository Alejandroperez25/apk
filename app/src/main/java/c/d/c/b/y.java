package c.d.c.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class y<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<Comparable> f4247a = new w();

    /* renamed from: b, reason: collision with root package name */
    Comparator<? super K> f4248b;

    /* renamed from: c, reason: collision with root package name */
    d<K, V> f4249c;

    /* renamed from: d, reason: collision with root package name */
    int f4250d;

    /* renamed from: e, reason: collision with root package name */
    int f4251e;

    /* renamed from: f, reason: collision with root package name */
    final d<K, V> f4252f;

    /* renamed from: g, reason: collision with root package name */
    private y<K, V>.a f4253g;

    /* renamed from: h, reason: collision with root package name */
    private y<K, V>.b f4254h;

    public y() {
        this(f4247a);
    }

    public y(Comparator<? super K> comparator) {
        this.f4250d = 0;
        this.f4251e = 0;
        this.f4252f = new d<>();
        this.f4248b = comparator == null ? f4247a : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4250d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        d<K, V> dVarA = a(obj);
        if (dVarA != null) {
            return dVarA.f4267g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> dVarA = a((y<K, V>) k, true);
        V v2 = dVarA.f4267g;
        dVarA.f4267g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f4249c = null;
        this.f4250d = 0;
        this.f4251e++;
        d<K, V> dVar = this.f4252f;
        dVar.f4265e = dVar;
        dVar.f4264d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            return dVarB.f4267g;
        }
        return null;
    }

    d<K, V> a(K k, boolean z) {
        int iCompare;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f4248b;
        d<K, V> dVar2 = this.f4249c;
        if (dVar2 != null) {
            Comparable comparable = comparator == f4247a ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    iCompare = comparable.compareTo(dVar2.f4266f);
                } else {
                    iCompare = comparator.compare(k, dVar2.f4266f);
                }
                if (iCompare == 0) {
                    return dVar2;
                }
                d<K, V> dVar3 = iCompare < 0 ? dVar2.f4262b : dVar2.f4263c;
                if (dVar3 == null) {
                    break;
                }
                dVar2 = dVar3;
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar4 = this.f4252f;
        if (dVar2 == null) {
            if (comparator == f4247a && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            dVar = new d<>(dVar2, k, dVar4, dVar4.f4265e);
            this.f4249c = dVar;
        } else {
            dVar = new d<>(dVar2, k, dVar4, dVar4.f4265e);
            if (iCompare < 0) {
                dVar2.f4262b = dVar;
            } else {
                dVar2.f4263c = dVar;
            }
            b(dVar2, true);
        }
        this.f4250d++;
        this.f4251e++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    d<K, V> a(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a((y<K, V>) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> dVarA = a(entry.getKey());
        if (dVarA != null && a(dVarA.f4267g, entry.getValue())) {
            return dVarA;
        }
        return null;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    void a(d<K, V> dVar, boolean z) {
        int i2;
        if (z) {
            dVar.f4265e.f4264d = dVar.f4264d;
            dVar.f4264d.f4265e = dVar.f4265e;
        }
        d<K, V> dVar2 = dVar.f4262b;
        d<K, V> dVar3 = dVar.f4263c;
        d<K, V> dVar4 = dVar.f4261a;
        int i3 = 0;
        if (dVar2 != null && dVar3 != null) {
            d<K, V> dVarB = dVar2.f4268h > dVar3.f4268h ? dVar2.b() : dVar3.a();
            a((d) dVarB, false);
            d<K, V> dVar5 = dVar.f4262b;
            if (dVar5 != null) {
                i2 = dVar5.f4268h;
                dVarB.f4262b = dVar5;
                dVar5.f4261a = dVarB;
                dVar.f4262b = null;
            } else {
                i2 = 0;
            }
            d<K, V> dVar6 = dVar.f4263c;
            if (dVar6 != null) {
                i3 = dVar6.f4268h;
                dVarB.f4263c = dVar6;
                dVar6.f4261a = dVarB;
                dVar.f4263c = null;
            }
            dVarB.f4268h = Math.max(i2, i3) + 1;
            a((d) dVar, (d) dVarB);
            return;
        }
        if (dVar2 != null) {
            a((d) dVar, (d) dVar2);
            dVar.f4262b = null;
        } else if (dVar3 != null) {
            a((d) dVar, (d) dVar3);
            dVar.f4263c = null;
        } else {
            a((d) dVar, (d) null);
        }
        b(dVar4, false);
        this.f4250d--;
        this.f4251e++;
    }

    d<K, V> b(Object obj) {
        d<K, V> dVarA = a(obj);
        if (dVarA != null) {
            a((d) dVarA, true);
        }
        return dVarA;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f4261a;
        dVar.f4261a = null;
        if (dVar2 != null) {
            dVar2.f4261a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f4262b == dVar) {
                dVar3.f4262b = dVar2;
                return;
            } else {
                dVar3.f4263c = dVar2;
                return;
            }
        }
        this.f4249c = dVar2;
    }

    private void b(d<K, V> dVar, boolean z) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f4262b;
            d<K, V> dVar3 = dVar.f4263c;
            int i2 = dVar2 != null ? dVar2.f4268h : 0;
            int i3 = dVar3 != null ? dVar3.f4268h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                d<K, V> dVar4 = dVar3.f4262b;
                d<K, V> dVar5 = dVar3.f4263c;
                int i5 = (dVar4 != null ? dVar4.f4268h : 0) - (dVar5 != null ? dVar5.f4268h : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    a((d) dVar);
                } else {
                    b((d) dVar3);
                    a((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                d<K, V> dVar6 = dVar2.f4262b;
                d<K, V> dVar7 = dVar2.f4263c;
                int i6 = (dVar6 != null ? dVar6.f4268h : 0) - (dVar7 != null ? dVar7.f4268h : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    b((d) dVar);
                } else {
                    a((d) dVar2);
                    b((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                dVar.f4268h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                dVar.f4268h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.f4261a;
        }
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f4262b;
        d<K, V> dVar3 = dVar.f4263c;
        d<K, V> dVar4 = dVar3.f4262b;
        d<K, V> dVar5 = dVar3.f4263c;
        dVar.f4263c = dVar4;
        if (dVar4 != null) {
            dVar4.f4261a = dVar;
        }
        a((d) dVar, (d) dVar3);
        dVar3.f4262b = dVar;
        dVar.f4261a = dVar3;
        dVar.f4268h = Math.max(dVar2 != null ? dVar2.f4268h : 0, dVar4 != null ? dVar4.f4268h : 0) + 1;
        dVar3.f4268h = Math.max(dVar.f4268h, dVar5 != null ? dVar5.f4268h : 0) + 1;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f4262b;
        d<K, V> dVar3 = dVar.f4263c;
        d<K, V> dVar4 = dVar2.f4262b;
        d<K, V> dVar5 = dVar2.f4263c;
        dVar.f4262b = dVar5;
        if (dVar5 != null) {
            dVar5.f4261a = dVar;
        }
        a((d) dVar, (d) dVar2);
        dVar2.f4263c = dVar;
        dVar.f4261a = dVar2;
        dVar.f4268h = Math.max(dVar3 != null ? dVar3.f4268h : 0, dVar5 != null ? dVar5.f4268h : 0) + 1;
        dVar2.f4268h = Math.max(dVar.f4268h, dVar4 != null ? dVar4.f4268h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        y<K, V>.a aVar = this.f4253g;
        if (aVar != null) {
            return aVar;
        }
        y<K, V>.a aVar2 = new a();
        this.f4253g = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        y<K, V>.b bVar = this.f4254h;
        if (bVar != null) {
            return bVar;
        }
        y<K, V>.b bVar2 = new b();
        this.f4254h = bVar2;
        return bVar2;
    }

    static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        d<K, V> f4261a;

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f4262b;

        /* renamed from: c, reason: collision with root package name */
        d<K, V> f4263c;

        /* renamed from: d, reason: collision with root package name */
        d<K, V> f4264d;

        /* renamed from: e, reason: collision with root package name */
        d<K, V> f4265e;

        /* renamed from: f, reason: collision with root package name */
        final K f4266f;

        /* renamed from: g, reason: collision with root package name */
        V f4267g;

        /* renamed from: h, reason: collision with root package name */
        int f4268h;

        d() {
            this.f4266f = null;
            this.f4265e = this;
            this.f4264d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.f4261a = dVar;
            this.f4266f = k;
            this.f4268h = 1;
            this.f4264d = dVar2;
            this.f4265e = dVar3;
            dVar3.f4264d = this;
            dVar2.f4265e = this;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4266f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4267g;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f4267g;
            this.f4267g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.f4266f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f4266f.equals(entry.getKey())) {
                return false;
            }
            if (this.f4267g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.f4267g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (this.f4266f == null ? 0 : this.f4266f.hashCode()) ^ (this.f4267g != null ? this.f4267g.hashCode() : 0);
        }

        public String toString() {
            return this.f4266f + "=" + this.f4267g;
        }

        public d<K, V> a() {
            d<K, V> dVar = this;
            for (d<K, V> dVar2 = this.f4262b; dVar2 != null; dVar2 = dVar2.f4262b) {
                dVar = dVar2;
            }
            return dVar;
        }

        public d<K, V> b() {
            d<K, V> dVar = this;
            for (d<K, V> dVar2 = this.f4263c; dVar2 != null; dVar2 = dVar2.f4263c) {
                dVar = dVar2;
            }
            return dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        d<K, V> f4257a;

        /* renamed from: b, reason: collision with root package name */
        d<K, V> f4258b = null;

        /* renamed from: c, reason: collision with root package name */
        int f4259c;

        c() {
            this.f4257a = y.this.f4252f.f4264d;
            this.f4259c = y.this.f4251e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4257a != y.this.f4252f;
        }

        final d<K, V> a() {
            d<K, V> dVar = this.f4257a;
            if (dVar == y.this.f4252f) {
                throw new NoSuchElementException();
            }
            if (y.this.f4251e != this.f4259c) {
                throw new ConcurrentModificationException();
            }
            this.f4257a = dVar.f4264d;
            this.f4258b = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f4258b == null) {
                throw new IllegalStateException();
            }
            y.this.a((d) this.f4258b, true);
            this.f4258b = null;
            this.f4259c = y.this.f4251e;
        }
    }

    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return y.this.f4250d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new x(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && y.this.a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            d<K, V> dVarA;
            if (!(obj instanceof Map.Entry) || (dVarA = y.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            y.this.a((d) dVarA, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y.this.clear();
        }
    }

    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return y.this.f4250d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new z(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return y.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return y.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y.this.clear();
        }
    }
}
