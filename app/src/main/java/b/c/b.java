package b.c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: h, reason: collision with root package name */
    h<K, V> f979h;

    public b() {
    }

    public b(int i2) {
        super(i2);
    }

    private h<K, V> b() {
        if (this.f979h == null) {
            this.f979h = new a(this);
        }
        return this.f979h;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f1027g + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(Collection<?> collection) {
        return h.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().a();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().b();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().c();
    }
}
