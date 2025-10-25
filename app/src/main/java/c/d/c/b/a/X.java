package c.d.c.b.a;

/* loaded from: classes.dex */
class X implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f4125a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f4126b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4127c;

    X(Class cls, Class cls2, c.d.c.H h2) {
        this.f4125a = cls;
        this.f4126b = cls2;
        this.f4127c = h2;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (clsA == this.f4125a || clsA == this.f4126b) {
            return this.f4127c;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f4125a.getName() + "+" + this.f4126b.getName() + ",adapter=" + this.f4127c + "]";
    }
}
