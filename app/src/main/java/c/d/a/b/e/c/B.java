package c.d.a.b.e.c;

/* loaded from: classes.dex */
final class B<E> extends AbstractC0221x<E> {

    /* renamed from: c, reason: collision with root package name */
    static final AbstractC0221x<Object> f3788c = new B(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f3789d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3790e;

    B(Object[] objArr, int i2) {
        this.f3789d = objArr;
        this.f3790e = i2;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int e() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3790e;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final Object[] d() {
        return this.f3789d;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int f() {
        return this.f3790e;
    }

    @Override // c.d.a.b.e.c.AbstractC0221x, c.d.a.b.e.c.AbstractC0215u
    final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f3789d, 0, objArr, i2, this.f3790e);
        return i2 + this.f3790e;
    }

    @Override // java.util.List
    public final E get(int i2) {
        AbstractC0195k.a(i2, this.f3790e);
        return (E) this.f3789d[i2];
    }
}
