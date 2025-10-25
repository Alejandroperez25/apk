package c.d.a.b.e.c;

/* loaded from: classes.dex */
final class I extends AbstractC0221x<Object> {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f3815c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f3816d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3817e;

    I(Object[] objArr, int i2, int i3) {
        this.f3815c = objArr;
        this.f3816d = i2;
        this.f3817e = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0195k.a(i2, this.f3817e);
        return this.f3815c[(i2 * 2) + this.f3816d];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3817e;
    }
}
