package c.d.a.b.e.c;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
final class A<E> extends AbstractC0221x<E> {

    /* renamed from: c, reason: collision with root package name */
    private final transient int f3784c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f3785d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AbstractC0221x f3786e;

    A(AbstractC0221x abstractC0221x, int i2, int i3) {
        this.f3786e = abstractC0221x;
        this.f3784c = i2;
        this.f3785d = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3785d;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final Object[] d() {
        return this.f3786e.d();
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int e() {
        return this.f3786e.e() + this.f3784c;
    }

    @Override // c.d.a.b.e.c.AbstractC0215u
    final int f() {
        return this.f3786e.e() + this.f3784c + this.f3785d;
    }

    @Override // java.util.List
    public final E get(int i2) {
        AbstractC0195k.a(i2, this.f3785d);
        return this.f3786e.get(i2 + this.f3784c);
    }

    @Override // c.d.a.b.e.c.AbstractC0221x
    /* renamed from: a */
    public final AbstractC0221x<E> subList(int i2, int i3) {
        AbstractC0195k.a(i2, i3, this.f3785d);
        return (AbstractC0221x) this.f3786e.subList(i2 + this.f3784c, i3 + this.f3784c);
    }

    @Override // c.d.a.b.e.c.AbstractC0221x, java.util.List
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
