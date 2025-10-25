package c.d.c.b.a;

/* loaded from: classes.dex */
class Z implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f4130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4131b;

    Z(Class cls, c.d.c.H h2) {
        this.f4130a = cls;
        this.f4131b = h2;
    }

    @Override // c.d.c.I
    public <T2> c.d.c.H<T2> a(c.d.c.p pVar, c.d.c.c.a<T2> aVar) {
        Class<? super T2> clsA = aVar.a();
        if (this.f4130a.isAssignableFrom(clsA)) {
            return new Y(this, clsA);
        }
        return null;
    }

    public String toString() {
        return "Factory[typeHierarchy=" + this.f4130a.getName() + ",adapter=" + this.f4131b + "]";
    }
}
