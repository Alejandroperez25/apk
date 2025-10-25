package c.d.a.b.e.c;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class G<K, V> extends AbstractC0221x<Map.Entry<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ D f3806c;

    G(D d2) {
        this.f3806c = d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3806c.f3797f;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        AbstractC0195k.a(i2, this.f3806c.f3797f);
        Object[] objArr = this.f3806c.f3795d;
        int i3 = i2 * 2;
        D d2 = this.f3806c;
        Object obj = objArr[i3];
        Object[] objArr2 = this.f3806c.f3795d;
        D d3 = this.f3806c;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
