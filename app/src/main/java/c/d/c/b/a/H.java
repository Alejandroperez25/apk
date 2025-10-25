package c.d.c.b.a;

/* loaded from: classes.dex */
class H extends c.d.c.H<Class> {
    H() {
    }

    @Override // c.d.c.H
    public /* bridge */ /* synthetic */ Class a(c.d.c.d.b bVar) {
        b(bVar);
        throw null;
    }

    @Override // c.d.c.H
    public /* bridge */ /* synthetic */ void a(c.d.c.d.d dVar, Class cls) {
        a2(dVar, cls);
        throw null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(c.d.c.d.d dVar, Class cls) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
    }

    public Class b(c.d.c.d.b bVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }
}
