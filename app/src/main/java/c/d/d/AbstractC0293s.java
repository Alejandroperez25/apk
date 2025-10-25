package c.d.d;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.d.d.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293s extends AbstractC0294t {
    public abstract x b();

    /* renamed from: c.d.d.s$a */
    static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, AbstractC0293s> f4449a;

        private a(Map.Entry<K, AbstractC0293s> entry) {
            this.f4449a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4449a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            AbstractC0293s value = this.f4449a.getValue();
            if (value == null) {
                return null;
            }
            return value.b();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof x)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.f4449a.getValue().a((x) obj);
        }
    }

    /* renamed from: c.d.d.s$b */
    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f4450a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f4450a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4450a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f4450a.next();
            return next.getValue() instanceof AbstractC0293s ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4450a.remove();
        }
    }
}
