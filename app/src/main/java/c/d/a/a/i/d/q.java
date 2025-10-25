package c.d.a.a.i.d;

import android.util.SparseArray;
import c.d.a.a.m.E;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<E> f2866a = new SparseArray<>();

    public E a(int i2) {
        E e2 = this.f2866a.get(i2);
        if (e2 != null) {
            return e2;
        }
        E e3 = new E(Long.MAX_VALUE);
        this.f2866a.put(i2, e3);
        return e3;
    }

    public void a() {
        this.f2866a.clear();
    }
}
