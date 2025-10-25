package c.d.d;

import c.d.d.C0287m;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class F<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f4328a;

    /* renamed from: b, reason: collision with root package name */
    private List<F<K, V>.b> f4329b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f4330c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4331d;

    /* renamed from: e, reason: collision with root package name */
    private volatile F<K, V>.d f4332e;

    /* synthetic */ F(int i2, C c2) {
        this(i2);
    }

    static <FieldDescriptorType extends C0287m.a<FieldDescriptorType>> F<FieldDescriptorType, Object> a(int i2) {
        return new C(i2);
    }

    private F(int i2) {
        this.f4328a = i2;
        this.f4329b = Collections.emptyList();
        this.f4330c = Collections.emptyMap();
    }

    public void a() {
        Map<K, V> mapUnmodifiableMap;
        if (this.f4331d) {
            return;
        }
        if (this.f4330c.isEmpty()) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.f4330c);
        }
        this.f4330c = mapUnmodifiableMap;
        this.f4331d = true;
    }

    public boolean b() {
        return this.f4331d;
    }

    public int c() {
        return this.f4329b.size();
    }

    public Map.Entry<K, V> b(int i2) {
        return this.f4329b.get(i2);
    }

    public int d() {
        return this.f4330c.size();
    }

    public Iterable<Map.Entry<K, V>> e() {
        if (this.f4330c.isEmpty()) {
            return a.a();
        }
        return this.f4330c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4329b.size() + this.f4330c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((F<K, V>) comparable) >= 0 || this.f4330c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a((F<K, V>) comparable);
        if (iA >= 0) {
            return this.f4329b.get(iA).getValue();
        }
        return this.f4330c.get(comparable);
    }

    public V a(K k, V v) {
        f();
        int iA = a((F<K, V>) k);
        if (iA >= 0) {
            return this.f4329b.get(iA).setValue(v);
        }
        h();
        int i2 = -(iA + 1);
        if (i2 >= this.f4328a) {
            return g().put(k, v);
        }
        if (this.f4329b.size() == this.f4328a) {
            F<K, V>.b bVarRemove = this.f4329b.remove(this.f4328a - 1);
            g().put(bVarRemove.getKey(), bVarRemove.getValue());
        }
        this.f4329b.add(i2, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f4329b.isEmpty()) {
            this.f4329b.clear();
        }
        if (this.f4330c.isEmpty()) {
            return;
        }
        this.f4330c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iA = a((F<K, V>) comparable);
        if (iA >= 0) {
            return c(iA);
        }
        if (this.f4330c.isEmpty()) {
            return null;
        }
        return this.f4330c.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V c(int i2) {
        f();
        V value = this.f4329b.remove(i2).getValue();
        if (!this.f4330c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f4329b.add(new b(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int size = this.f4329b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f4329b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k.compareTo(this.f4329b.get(i3).getKey());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4332e == null) {
            this.f4332e = new d(this, null);
        }
        return this.f4332e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f4331d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> g() {
        f();
        if (this.f4330c.isEmpty() && !(this.f4330c instanceof TreeMap)) {
            this.f4330c = new TreeMap();
        }
        return (SortedMap) this.f4330c;
    }

    private void h() {
        f();
        if (!this.f4329b.isEmpty() || (this.f4329b instanceof ArrayList)) {
            return;
        }
        this.f4329b = new ArrayList(this.f4328a);
    }

    private class b implements Map.Entry<K, V>, Comparable<F<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        private final K f4335a;

        /* renamed from: b, reason: collision with root package name */
        private V f4336b;

        b(F f2, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        b(K k, V v) {
            this.f4335a = k;
            this.f4336b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4335a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4336b;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(F<K, V>.b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            F.this.f();
            V v2 = this.f4336b;
            this.f4336b = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a(this.f4335a, entry.getKey()) && a(this.f4336b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (this.f4335a == null ? 0 : this.f4335a.hashCode()) ^ (this.f4336b != null ? this.f4336b.hashCode() : 0);
        }

        public String toString() {
            return this.f4335a + "=" + this.f4336b;
        }

        private boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    private class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        /* synthetic */ d(F f2, C c2) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(F.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return F.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = F.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            F.this.a((F) entry.getKey(), (K) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            F.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            F.this.clear();
        }
    }

    private class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f4338a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4339b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4340c;

        private c() {
            this.f4338a = -1;
        }

        /* synthetic */ c(F f2, C c2) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4338a + 1 < F.this.f4329b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.f4339b = true;
            int i2 = this.f4338a + 1;
            this.f4338a = i2;
            if (i2 < F.this.f4329b.size()) {
                return (Map.Entry) F.this.f4329b.get(this.f4338a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4339b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4339b = false;
            F.this.f();
            if (this.f4338a < F.this.f4329b.size()) {
                F f2 = F.this;
                int i2 = this.f4338a;
                this.f4338a = i2 - 1;
                f2.c(i2);
                return;
            }
            a().remove();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f4340c == null) {
                this.f4340c = F.this.f4330c.entrySet().iterator();
            }
            return this.f4340c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f4333a = new D();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f4334b = new E();

        static <T> Iterable<T> a() {
            return (Iterable<T>) f4334b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return super.equals(obj);
        }
        F f2 = (F) obj;
        int size = size();
        if (size != f2.size()) {
            return false;
        }
        int iC = c();
        if (iC != f2.c()) {
            return entrySet().equals(f2.entrySet());
        }
        for (int i2 = 0; i2 < iC; i2++) {
            if (!b(i2).equals(f2.b(i2))) {
                return false;
            }
        }
        if (iC != size) {
            return this.f4330c.equals(f2.f4330c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iC = c();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            iHashCode += this.f4329b.get(i2).hashCode();
        }
        return d() > 0 ? iHashCode + this.f4330c.hashCode() : iHashCode;
    }
}
