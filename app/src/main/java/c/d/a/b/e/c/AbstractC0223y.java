package c.d.a.b.e.c;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: c.d.a.b.e.c.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0223y<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f3946a = new Map.Entry[0];

    /* renamed from: b, reason: collision with root package name */
    private transient C<Map.Entry<K, V>> f3947b;

    /* renamed from: c, reason: collision with root package name */
    private transient C<K> f3948c;

    /* renamed from: d, reason: collision with root package name */
    private transient AbstractC0215u<V> f3949d;

    public static <K, V> AbstractC0223y<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        AbstractC0211s.a(k, v);
        AbstractC0211s.a(k2, v2);
        AbstractC0211s.a(k3, v3);
        AbstractC0211s.a(k4, v4);
        return E.a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    abstract C<Map.Entry<K, V>> a();

    abstract C<K> b();

    abstract AbstractC0215u<V> c();

    public abstract V get(Object obj);

    AbstractC0223y() {
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((AbstractC0215u) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return H.a((C) entrySet());
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf("size").length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        C<Map.Entry<K, V>> c2 = this.f3947b;
        if (c2 != null) {
            return c2;
        }
        C<Map.Entry<K, V>> cA = a();
        this.f3947b = cA;
        return cA;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        AbstractC0215u<V> abstractC0215u = this.f3949d;
        if (abstractC0215u != null) {
            return abstractC0215u;
        }
        AbstractC0215u<V> abstractC0215uC = c();
        this.f3949d = abstractC0215uC;
        return abstractC0215uC;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        C<K> c2 = this.f3948c;
        if (c2 != null) {
            return c2;
        }
        C<K> cB = b();
        this.f3948c = cB;
        return cB;
    }
}
