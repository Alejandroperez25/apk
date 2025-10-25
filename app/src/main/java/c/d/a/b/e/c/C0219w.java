package c.d.a.b.e.c;

/* renamed from: c.d.a.b.e.c.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0219w<E> extends AbstractC0213t<E> {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0221x<E> f3943c;

    C0219w(AbstractC0221x<E> abstractC0221x, int i2) {
        super(abstractC0221x.size(), i2);
        this.f3943c = abstractC0221x;
    }

    @Override // c.d.a.b.e.c.AbstractC0213t
    protected final E a(int i2) {
        return this.f3943c.get(i2);
    }
}
