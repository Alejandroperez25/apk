package c.d.c.b.a;

/* JADX INFO: Add missing generic type declarations: [T1] */
/* loaded from: classes.dex */
class Y<T1> extends c.d.c.H<T1> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f4128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z f4129b;

    Y(Z z, Class cls) {
        this.f4129b = z;
        this.f4128a = cls;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, T1 t1) {
        this.f4129b.f4131b.a(dVar, t1);
    }

    @Override // c.d.c.H
    public T1 a(c.d.c.d.b bVar) {
        T1 t1 = (T1) this.f4129b.f4131b.a(bVar);
        if (t1 == null || this.f4128a.isInstance(t1)) {
            return t1;
        }
        throw new c.d.c.C("Expected a " + this.f4128a.getName() + " but was " + t1.getClass().getName());
    }
}
