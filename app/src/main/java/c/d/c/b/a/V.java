package c.d.c.b.a;

/* loaded from: classes.dex */
class V implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f4120a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4121b;

    V(Class cls, c.d.c.H h2) {
        this.f4120a = cls;
        this.f4121b = h2;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        if (aVar.a() == this.f4120a) {
            return this.f4121b;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f4120a.getName() + ",adapter=" + this.f4121b + "]";
    }
}
