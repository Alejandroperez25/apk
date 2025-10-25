package b.b.a.b;

import b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f964e = new HashMap<>();

    @Override // b.b.a.b.b
    protected b.c<K, V> a(K k) {
        return this.f964e.get(k);
    }

    public V b(K k, V v) {
        b.c<K, V> cVarA = a(k);
        if (cVarA != null) {
            return cVarA.f970b;
        }
        this.f964e.put(k, a(k, v));
        return null;
    }

    @Override // b.b.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f964e.remove(k);
        return v;
    }

    public boolean contains(K k) {
        return this.f964e.containsKey(k);
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f964e.get(k).f972d;
        }
        return null;
    }
}
