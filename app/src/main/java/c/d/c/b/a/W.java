package c.d.c.b.a;

/* loaded from: classes.dex */
class W implements c.d.c.I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f4122a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f4123b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4124c;

    W(Class cls, Class cls2, c.d.c.H h2) {
        this.f4122a = cls;
        this.f4123b = cls2;
        this.f4124c = h2;
    }

    @Override // c.d.c.I
    public <T> c.d.c.H<T> a(c.d.c.p pVar, c.d.c.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (clsA == this.f4122a || clsA == this.f4123b) {
            return this.f4124c;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f4123b.getName() + "+" + this.f4122a.getName() + ",adapter=" + this.f4124c + "]";
    }
}
