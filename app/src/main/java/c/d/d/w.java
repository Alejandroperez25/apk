package c.d.d;

import c.d.d.AbstractC0290p;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private static final w f4460a = new w(Collections.emptyMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f4461b;

    private w() {
        this.f4461b = true;
    }

    private w(Map<K, V> map) {
        super(map);
        this.f4461b = true;
    }

    static {
        f4460a.c();
    }

    public static <K, V> w<K, V> a() {
        return f4460a;
    }

    public void a(w<K, V> wVar) {
        e();
        if (wVar.isEmpty()) {
            return;
        }
        putAll(wVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        e();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        e();
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }

    private static boolean a(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    static <K, V> boolean a(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !a(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && a((Map) this, (Map) obj);
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC0290p.a((byte[]) obj);
        }
        if (obj instanceof AbstractC0290p.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    static <K, V> int a(Map<K, V> map) {
        int iA = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a((Map) this);
    }

    public w<K, V> b() {
        return isEmpty() ? new w<>() : new w<>(this);
    }

    public void c() {
        this.f4461b = false;
    }

    public boolean d() {
        return this.f4461b;
    }

    private void e() {
        if (!d()) {
            throw new UnsupportedOperationException();
        }
    }
}
